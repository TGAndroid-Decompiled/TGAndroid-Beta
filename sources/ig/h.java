package ig;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import dg.h0;
import f2.m1;
import f2.x0;
import hg.i2;
import java.util.ArrayList;
import java.util.HashMap;
import k7.c6;
import lg.n;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.zw0;
public final class h extends cg.c {
    public final g6 d;
    public final Context f8099e;
    public sl0 f8100f;
    public ArrayList h;
    public boolean f8102r;
    public u3 f8103s;
    public final boolean v;
    public boolean f8104w;
    public final HashMap f8101n = new HashMap();
    public boolean f8105x = true;

    public h(Context context, g6 g6Var, boolean z4) {
        this.f8099e = context;
        this.v = z4;
        this.d = g6Var;
        h0 h0Var = new h0(this, 12);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new gf.c(8, messagesStorage, h0Var));
    }

    @Override
    public final boolean D(m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 3 && i10 != 6 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f20845id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f8101n;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f20845id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.h;
        if (arrayList != null && !arrayList.isEmpty()) {
            m(this.h.size() - 1);
        }
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
        if (arrayList != null && i10 >= 0) {
            return ((g) arrayList.get(i10)).f2505a;
        }
        return -1;
    }

    @Override
    public final void v(m1 m1Var, int i10) {
        int i11;
        boolean z4;
        boolean z10;
        int i12;
        int i13;
        ArrayList arrayList = this.h;
        if (arrayList != null && i10 >= 0) {
            g gVar = (g) arrayList.get(i10);
            int i14 = m1Var.f5879f;
            View view = m1Var.f5875a;
            int i15 = 8;
            boolean z11 = true;
            if (i14 == 3) {
                n nVar = (n) view;
                pq pqVar = gVar.f8098r;
                if (pqVar != null) {
                    CharSequence charSequence = gVar.f8088g;
                    String str = gVar.h;
                    nVar.v.setVisibility(8);
                    nVar.D = null;
                    nVar.E = null;
                    p9 p9Var = nVar.f10020c;
                    p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    p9Var.setImageDrawable(pqVar);
                    jg.c cVar = nVar.d;
                    cVar.k(charSequence);
                    boolean[] zArr = nVar.f12574r;
                    zArr[0] = false;
                    nVar.setSubtitle(str);
                    l5 l5Var = nVar.f10021e;
                    if (zArr[0]) {
                        i13 = k6.f21840n5;
                    } else {
                        i13 = k6.f21913r5;
                    }
                    l5Var.setTextColor(k6.v0(i13, nVar.f10018a));
                    np npVar = nVar.f12575s;
                    if (npVar != null) {
                        npVar.setAlpha(1.0f);
                    }
                    cVar.i(null);
                } else {
                    TLRPC.User user = gVar.f8085c;
                    if (user != null) {
                        nVar.setUser(user);
                        String str2 = gVar.h;
                        if (str2 != null) {
                            nVar.setSubtitle(str2);
                            nVar.f10021e.setTextColor(k6.v0(k6.f21913r5, this.d));
                        }
                    } else {
                        TLRPC.Chat chat = gVar.f8086e;
                        if (chat != null) {
                            nVar.h(F(chat), chat);
                        } else {
                            TLRPC.InputPeer inputPeer = gVar.d;
                            if (inputPeer != null) {
                                if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                                    nVar.setUser(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                                    nVar.setUser(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(inputPeer.user_id)));
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                    TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                                    nVar.h(F(chat2), chat2);
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                    TLRPC.Chat chat3 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                                    nVar.h(F(chat3), chat3);
                                }
                            }
                        }
                    }
                }
                nVar.c(gVar.f8091k, false);
                nVar.i(1.0f, false);
                int i16 = i10 + 1;
                if (i16 < this.h.size() && ((g) this.h.get(i16)).f2505a != i14) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                nVar.setDivider(z4);
                if (i16 < this.h.size() && ((g) this.h.get(i16)).f2505a == 7) {
                    nVar.setDivider(false);
                }
                nVar.setOptions(gVar.f8094n);
                i2 i2Var = gVar.f8095o;
                i2 i2Var2 = gVar.f8096p;
                ImageView imageView = nVar.B;
                ImageView imageView2 = nVar.f12577x;
                if (i2Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nVar.f12576w = z10;
                if (z10 && nVar.C) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView2.setVisibility(i12);
                imageView2.setOnClickListener(i2Var);
                if (i2Var2 == null) {
                    z11 = false;
                }
                nVar.f12578y = z11;
                if (z11 && nVar.C) {
                    i15 = 0;
                }
                imageView.setVisibility(i15);
                imageView.setOnClickListener(i2Var2);
                nVar.g(this.f8105x, false);
            } else if (i14 == 6) {
                lg.c cVar2 = (lg.c) view;
                z11 = (i10 >= this.h.size() - 1 || (i11 = i10 + 1) >= this.h.size() - 1 || ((g) this.h.get(i11)).f2505a == 7) ? false : false;
                cVar2.f12536s = gVar.f8087f;
                cVar2.f();
                cVar2.setDivider(z11);
                cVar2.c(gVar.f8091k, false);
            } else if (i14 == -1) {
                int i17 = gVar.f8092l;
                if (i17 < 0) {
                    i17 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new x0(-1, i17));
            } else if (i14 == 7) {
                ((lg.e) view).setLetter(gVar.f8088g);
            } else if (i14 == 5) {
                try {
                    ((zw0) view).f34031b.getImageReceiver().startAnimation();
                } catch (Exception unused) {
                }
            } else if (i14 == 8) {
                u3 u3Var = (u3) view;
                if (TextUtils.equals(u3Var.getText(), gVar.f8088g)) {
                    String str3 = gVar.h;
                    if (str3 == null) {
                        str3 = "";
                    }
                    u3Var.b(str3, gVar.f8093m);
                } else {
                    u3Var.setText(Emoji.replaceWithRestrictedEmoji(gVar.f8088g, u3Var.getTextView(), (Runnable) null));
                    if (!TextUtils.isEmpty(gVar.h)) {
                        String str4 = gVar.h;
                        dg.n nVar2 = gVar.f8093m;
                        t3 t3Var = u3Var.f24195b;
                        t3Var.c(str4, false, true);
                        t3Var.setOnClickListener(nVar2);
                        t3Var.setVisibility(0);
                    }
                }
                this.f8103s = u3Var;
            } else if (i14 == 9) {
                o8 o8Var = (o8) view;
                o8Var.e(k6.f21981v6, k6.f21963u6);
                o8Var.m(gVar.f8090j, gVar.f8088g, false);
            } else if (i14 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != gVar.f8097q) {
                    AndroidUtilities.removeFromParent(gVar.f8097q);
                    frameLayout.addView(gVar.f8097q, c6.c(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final m1 x(ViewGroup viewGroup, int i10) {
        n nVar;
        Context context = this.f8099e;
        if (i10 == -1) {
            nVar = new View(context);
        } else if (i10 == 3) {
            nVar = new n(this.f8099e, this.v, this.f8104w, this.d, this.f8102r);
        } else {
            g6 g6Var = this.d;
            if (i10 == 5) {
                zw0 zw0Var = new zw0(context, null, 1, g6Var);
                zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                zw0Var.f34033e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                zw0Var.f34030a.setTranslationY(AndroidUtilities.dp(24.0f));
                nVar = zw0Var;
            } else if (i10 == 7) {
                nVar = new lg.e(context, g6Var);
            } else if (i10 == 6) {
                nVar = new lg.c(context, g6Var);
            } else if (i10 == 8) {
                nVar = new u3(context, g6Var);
            } else if (i10 == 9) {
                o8 o8Var = new o8(context, g6Var);
                o8Var.f23317n = 16;
                o8Var.f23320w = 19;
                nVar = o8Var;
            } else if (i10 == 10) {
                nVar = new FrameLayout(context);
            } else {
                nVar = new View(context);
            }
        }
        return new m1(nVar);
    }

    @Override
    public final void y(m1 m1Var) {
        View view = m1Var.f5875a;
        if (view instanceof n) {
            ((n) view).g(this.f8105x, false);
        }
    }
}
