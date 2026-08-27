package dg;

import ag.n0;
import ag.q0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import cg.l2;
import f2.o1;
import f2.y0;
import gg.o;
import h7.z5;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.zk0;

public final class h extends xf.b {
    public final c6 d;

    public final Context f4962e;

    public zk0 f4963f;
    public ArrayList h;

    public boolean f4965r;

    public s3 f4966s;
    public final boolean v;

    public boolean f4967w;

    public final HashMap f4964n = new HashMap();

    public boolean f4968x = true;

    public h(Context context, c6 c6Var, boolean z10) {
        this.f4962e = context;
        this.v = z10;
        this.d = c6Var;
        n0 n0Var = new n0(this, 7);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new a1.e(23, messagesStorage, n0Var));
    }

    @Override
    public final boolean D(o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 3 || i10 == 6 || i10 == 9;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f22380id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap map = this.f4964n;
        return (map.isEmpty() || (num = (Integer) map.get(Long.valueOf(chat.f22380id))) == null) ? chat.participants_count : num.intValue();
    }

    public final void G() {
        ArrayList arrayList = this.h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        m(this.h.size() - 1);
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.h;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.h;
        if (arrayList == null || i10 < 0) {
            return -1;
        }
        return ((g) arrayList.get(i10)).f49413a;
    }

    @Override
    public final void v(o1 o1Var, int i10) {
        boolean z10;
        int i11;
        ArrayList arrayList = this.h;
        if (arrayList == null || i10 < 0) {
            return;
        }
        g gVar = (g) arrayList.get(i10);
        int i12 = o1Var.f5793f;
        View view = o1Var.f5789a;
        int i13 = 8;
        if (i12 != 3) {
            if (i12 == 6) {
                gg.c cVar = (gg.c) view;
                z10 = i10 < this.h.size() - 1 && (i11 = i10 + 1) < this.h.size() - 1 && ((g) this.h.get(i11)).f49413a != 7;
                cVar.f7079s = gVar.f4950f;
                cVar.f();
                cVar.setDivider(z10);
                cVar.c(gVar.f4954k, false);
                return;
            }
            if (i12 == -1) {
                int i14 = gVar.f4955l;
                if (i14 < 0) {
                    i14 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new y0(-1, i14));
                return;
            }
            if (i12 == 7) {
                ((gg.e) view).setLetter(gVar.f4951g);
                return;
            }
            if (i12 == 5) {
                try {
                    ((iw0) view).f29504b.getImageReceiver().startAnimation();
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (i12 != 8) {
                if (i12 == 9) {
                    l8 l8Var = (l8) view;
                    l8Var.e(g6.f23373v6, g6.f23357u6);
                    l8Var.m(gVar.f4953j, gVar.f4951g, false);
                    return;
                } else {
                    if (i12 == 10) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        if (frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == gVar.f4960q) {
                            return;
                        }
                        AndroidUtilities.removeFromParent(gVar.f4960q);
                        frameLayout.addView(gVar.f4960q, z5.c(-2.0f, -1));
                        return;
                    }
                    return;
                }
            }
            s3 s3Var = (s3) view;
            if (TextUtils.equals(s3Var.getText(), gVar.f4951g)) {
                String str = gVar.h;
                if (str == null) {
                    str = "";
                }
                s3Var.b(str, gVar.f4956m);
            } else {
                s3Var.setText(Emoji.replaceWithRestrictedEmoji(gVar.f4951g, s3Var.getTextView(), (Runnable) null));
                if (!TextUtils.isEmpty(gVar.h)) {
                    String str2 = gVar.h;
                    q0 q0Var = gVar.f4956m;
                    r3 r3Var = s3Var.f25628b;
                    r3Var.c(str2, false, true);
                    r3Var.setOnClickListener(q0Var);
                    r3Var.setVisibility(0);
                }
            }
            this.f4966s = s3Var;
            return;
        }
        o oVar = (o) view;
        dq dqVar = gVar.f4961r;
        if (dqVar != null) {
            CharSequence charSequence = gVar.f4951g;
            String str3 = gVar.h;
            oVar.v.setVisibility(8);
            oVar.C = null;
            oVar.D = null;
            n9 n9Var = oVar.f5394c;
            n9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            n9Var.setImageDrawable(dqVar);
            eg.c cVar2 = oVar.d;
            cVar2.k(charSequence);
            boolean[] zArr = oVar.f7120r;
            zArr[0] = false;
            oVar.setSubtitle(str3);
            oVar.f5395e.setTextColor(g6.v0(zArr[0] ? g6.f23233n5 : g6.f23300r5, oVar.f5392a));
            bp bpVar = oVar.f7121s;
            if (bpVar != null) {
                bpVar.setAlpha(1.0f);
            }
            cVar2.i(null);
        } else {
            TLRPC.User user = gVar.f4948c;
            if (user != null) {
                oVar.setUser(user);
                String str4 = gVar.h;
                if (str4 != null) {
                    oVar.setSubtitle(str4);
                    oVar.f5395e.setTextColor(g6.v0(g6.f23300r5, this.d));
                }
            } else {
                TLRPC.Chat chat = gVar.f4949e;
                if (chat != null) {
                    oVar.h(F(chat), chat);
                } else {
                    TLRPC.InputPeer inputPeer = gVar.d;
                    if (inputPeer != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                            oVar.setUser(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            oVar.setUser(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(inputPeer.user_id)));
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                            oVar.h(F(chat2), chat2);
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.Chat chat3 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                            oVar.h(F(chat3), chat3);
                        }
                    }
                }
            }
        }
        oVar.c(gVar.f4954k, false);
        oVar.i(1.0f, false);
        int i15 = i10 + 1;
        oVar.setDivider(i15 >= this.h.size() || ((g) this.h.get(i15)).f49413a == i12);
        if (i15 < this.h.size() && ((g) this.h.get(i15)).f49413a == 7) {
            oVar.setDivider(false);
        }
        oVar.setOptions(gVar.f4957n);
        l2 l2Var = gVar.f4958o;
        l2 l2Var2 = gVar.f4959p;
        ImageView imageView = oVar.A;
        ImageView imageView2 = oVar.f7123x;
        boolean z11 = l2Var != null;
        oVar.f7122w = z11;
        imageView2.setVisibility((z11 && oVar.B) ? 0 : 8);
        imageView2.setOnClickListener(l2Var);
        z10 = l2Var2 != null;
        oVar.f7124y = z10;
        if (z10 && oVar.B) {
            i13 = 0;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(l2Var2);
        oVar.g(this.f4968x, false);
    }

    @Override
    public final o1 x(ViewGroup viewGroup, int i10) {
        View oVar;
        Context context = this.f4962e;
        if (i10 == -1) {
            oVar = new View(context);
        } else if (i10 == 3) {
            oVar = new o(this.f4962e, this.v, this.f4967w, this.d, this.f4965r);
        } else {
            c6 c6Var = this.d;
            if (i10 == 5) {
                iw0 iw0Var = new iw0(context, null, 1, c6Var);
                iw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                iw0Var.f29506e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                iw0Var.f29503a.setTranslationY(AndroidUtilities.dp(24.0f));
                oVar = iw0Var;
            } else if (i10 == 7) {
                oVar = new gg.e(context, c6Var);
            } else if (i10 == 6) {
                oVar = new gg.c(context, c6Var);
            } else if (i10 == 8) {
                oVar = new s3(context, c6Var);
            } else if (i10 == 9) {
                l8 l8Var = new l8(context, c6Var);
                l8Var.f24633n = 16;
                l8Var.f24636w = 19;
                oVar = l8Var;
            } else {
                oVar = i10 == 10 ? new FrameLayout(context) : new View(context);
            }
        }
        return new lk0(oVar);
    }

    @Override
    public final void y(o1 o1Var) {
        View view = o1Var.f5789a;
        if (view instanceof o) {
            ((o) view).g(this.f4968x, false);
        }
    }
}
