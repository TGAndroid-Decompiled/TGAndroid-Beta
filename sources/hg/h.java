package hg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import cg.h0;
import f2.l1;
import f2.w0;
import gg.i2;
import java.util.ArrayList;
import java.util.HashMap;
import k7.b6;
import kg.n;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.zw0;
public final class h extends bg.c {
    public final f6 d;
    public final Context e;
    public sl0 f7102f;
    public ArrayList h;
    public boolean f7104r;
    public u3 f7105s;
    public final boolean v;
    public boolean f7106w;
    public final HashMap f7103n = new HashMap();
    public boolean f7107x = true;

    public h(Context context, f6 f6Var, boolean z4) {
        this.e = context;
        this.v = z4;
        this.d = f6Var;
        h0 h0Var = new h0(this, 12);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new gf.c(6, messagesStorage, h0Var));
    }

    @Override
    public final boolean D(l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 != 3 && i10 != 6 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f19184id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f7103n;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f19184id))) != null) {
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
            return ((g) arrayList.get(i10)).f1808a;
        }
        return -1;
    }

    @Override
    public final void v(l1 l1Var, int i10) {
        int i11;
        boolean z4;
        boolean z10;
        int i12;
        int i13;
        ArrayList arrayList = this.h;
        if (arrayList != null && i10 >= 0) {
            g gVar = (g) arrayList.get(i10);
            int i14 = l1Var.f5788f;
            View view = l1Var.f5785a;
            int i15 = 8;
            boolean z11 = true;
            if (i14 == 3) {
                n nVar = (n) view;
                nq nqVar = gVar.f7101r;
                if (nqVar != null) {
                    CharSequence charSequence = gVar.f7091g;
                    String str = gVar.h;
                    nVar.v.setVisibility(8);
                    nVar.D = null;
                    nVar.E = null;
                    p9 p9Var = nVar.f7501c;
                    p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    p9Var.setImageDrawable(nqVar);
                    ig.c cVar = nVar.d;
                    cVar.k(charSequence);
                    boolean[] zArr = nVar.f10448r;
                    zArr[0] = false;
                    nVar.setSubtitle(str);
                    k5 k5Var = nVar.e;
                    if (zArr[0]) {
                        i13 = j6.f20084n5;
                    } else {
                        i13 = j6.f20157r5;
                    }
                    k5Var.setTextColor(j6.v0(i13, nVar.f7499a));
                    lp lpVar = nVar.f10449s;
                    if (lpVar != null) {
                        lpVar.setAlpha(1.0f);
                    }
                    cVar.i(null);
                } else {
                    TLRPC.User user = gVar.f7089c;
                    if (user != null) {
                        nVar.setUser(user);
                        String str2 = gVar.h;
                        if (str2 != null) {
                            nVar.setSubtitle(str2);
                            nVar.e.setTextColor(j6.v0(j6.f20157r5, this.d));
                        }
                    } else {
                        TLRPC.Chat chat = gVar.e;
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
                nVar.c(gVar.f7094k, false);
                nVar.i(1.0f, false);
                int i16 = i10 + 1;
                if (i16 < this.h.size() && ((g) this.h.get(i16)).f1808a != i14) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                nVar.setDivider(z4);
                if (i16 < this.h.size() && ((g) this.h.get(i16)).f1808a == 7) {
                    nVar.setDivider(false);
                }
                nVar.setOptions(gVar.f7097n);
                i2 i2Var = gVar.f7098o;
                i2 i2Var2 = gVar.f7099p;
                ImageView imageView = nVar.B;
                ImageView imageView2 = nVar.f10451x;
                if (i2Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                nVar.f10450w = z10;
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
                nVar.f10452y = z11;
                if (z11 && nVar.C) {
                    i15 = 0;
                }
                imageView.setVisibility(i15);
                imageView.setOnClickListener(i2Var2);
                nVar.g(this.f7107x, false);
            } else if (i14 == 6) {
                kg.c cVar2 = (kg.c) view;
                z11 = (i10 >= this.h.size() - 1 || (i11 = i10 + 1) >= this.h.size() - 1 || ((g) this.h.get(i11)).f1808a == 7) ? false : false;
                cVar2.f10413s = gVar.f7090f;
                cVar2.f();
                cVar2.setDivider(z11);
                cVar2.c(gVar.f7094k, false);
            } else if (i14 == -1) {
                int i17 = gVar.f7095l;
                if (i17 < 0) {
                    i17 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new w0(-1, i17));
            } else if (i14 == 7) {
                ((kg.e) view).setLetter(gVar.f7091g);
            } else if (i14 == 5) {
                try {
                    ((zw0) view).f31455b.getImageReceiver().startAnimation();
                } catch (Exception unused) {
                }
            } else if (i14 == 8) {
                u3 u3Var = (u3) view;
                if (TextUtils.equals(u3Var.getText(), gVar.f7091g)) {
                    String str3 = gVar.h;
                    if (str3 == null) {
                        str3 = "";
                    }
                    u3Var.b(str3, gVar.f7096m);
                } else {
                    u3Var.setText(Emoji.replaceWithRestrictedEmoji(gVar.f7091g, u3Var.getTextView(), (Runnable) null));
                    if (!TextUtils.isEmpty(gVar.h)) {
                        String str4 = gVar.h;
                        cg.n nVar2 = gVar.f7096m;
                        t3 t3Var = u3Var.f22387b;
                        t3Var.c(str4, false, true);
                        t3Var.setOnClickListener(nVar2);
                        t3Var.setVisibility(0);
                    }
                }
                this.f7105s = u3Var;
            } else if (i14 == 9) {
                o8 o8Var = (o8) view;
                o8Var.e(j6.f20225v6, j6.f20207u6);
                o8Var.m(gVar.f7093j, gVar.f7091g, false);
            } else if (i14 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != gVar.f7100q) {
                    AndroidUtilities.removeFromParent(gVar.f7100q);
                    frameLayout.addView(gVar.f7100q, b6.c(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final l1 x(ViewGroup viewGroup, int i10) {
        n nVar;
        Context context = this.e;
        if (i10 == -1) {
            nVar = new View(context);
        } else if (i10 == 3) {
            nVar = new n(this.e, this.v, this.f7106w, this.d, this.f7104r);
        } else {
            f6 f6Var = this.d;
            if (i10 == 5) {
                zw0 zw0Var = new zw0(context, null, 1, f6Var);
                zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                zw0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                zw0Var.f31454a.setTranslationY(AndroidUtilities.dp(24.0f));
                nVar = zw0Var;
            } else if (i10 == 7) {
                nVar = new kg.e(context, f6Var);
            } else if (i10 == 6) {
                nVar = new kg.c(context, f6Var);
            } else if (i10 == 8) {
                nVar = new u3(context, f6Var);
            } else if (i10 == 9) {
                o8 o8Var = new o8(context, f6Var);
                o8Var.f21531n = 16;
                o8Var.f21534w = 19;
                nVar = o8Var;
            } else if (i10 == 10) {
                nVar = new FrameLayout(context);
            } else {
                nVar = new View(context);
            }
        }
        return new l1(nVar);
    }

    @Override
    public final void y(l1 l1Var) {
        View view = l1Var.f5785a;
        if (view instanceof n) {
            ((n) view).g(this.f7107x, false);
        }
    }
}
