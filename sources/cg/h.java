package cg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bg.i;
import bg.t2;
import bg.u1;
import f2.a1;
import f2.q1;
import fg.p;
import g7.e6;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.wk0;
public final class h extends wf.b {
    public final b6 d;
    public final Context f2418e;
    public wk0 f2419f;
    public ArrayList h;
    public boolean f2421r;
    public v3 f2422s;
    public final boolean v;
    public boolean f2423w;
    public final HashMap f2420n = new HashMap();
    public boolean f2424x = true;

    public h(Context context, b6 b6Var, boolean z10) {
        this.f2418e = context;
        this.v = z10;
        this.d = b6Var;
        i iVar = new i(this, 5);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new a1.e(13, messagesStorage, iVar));
    }

    @Override
    public final boolean D(q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 3 && i9 != 6 && i9 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i9;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f22380id);
        if (chatFull != null && (i9 = chatFull.participants_count) > 0) {
            return i9;
        }
        HashMap hashMap = this.f2420n;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f22380id))) != null) {
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
    public final int j(int i9) {
        ArrayList arrayList = this.h;
        if (arrayList != null && i9 >= 0) {
            return ((g) arrayList.get(i9)).f48814a;
        }
        return -1;
    }

    @Override
    public final void v(q1 q1Var, int i9) {
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        ArrayList arrayList = this.h;
        if (arrayList != null && i9 >= 0) {
            g gVar = (g) arrayList.get(i9);
            int i13 = q1Var.f5505f;
            View view = q1Var.f5501a;
            int i14 = 8;
            boolean z12 = true;
            if (i13 == 3) {
                p pVar = (p) view;
                fq fqVar = gVar.f2417r;
                if (fqVar != null) {
                    CharSequence charSequence = gVar.f2407g;
                    String str = gVar.h;
                    pVar.v.setVisibility(8);
                    pVar.C = null;
                    pVar.D = null;
                    o9 o9Var = pVar.f4500c;
                    o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    o9Var.setImageDrawable(fqVar);
                    dg.c cVar = pVar.d;
                    cVar.k(charSequence);
                    boolean[] zArr = pVar.f6323r;
                    zArr[0] = false;
                    pVar.setSubtitle(str);
                    h5 h5Var = pVar.f4501e;
                    if (zArr[0]) {
                        i12 = f6.f23178n5;
                    } else {
                        i12 = f6.f23247r5;
                    }
                    h5Var.setTextColor(f6.v0(i12, pVar.f4498a));
                    dp dpVar = pVar.f6324s;
                    if (dpVar != null) {
                        dpVar.setAlpha(1.0f);
                    }
                    cVar.i(null);
                } else {
                    TLRPC.User user = gVar.f2404c;
                    if (user != null) {
                        pVar.setUser(user);
                        String str2 = gVar.h;
                        if (str2 != null) {
                            pVar.setSubtitle(str2);
                            pVar.f4501e.setTextColor(f6.v0(f6.f23247r5, this.d));
                        }
                    } else {
                        TLRPC.Chat chat = gVar.f2405e;
                        if (chat != null) {
                            pVar.h(F(chat), chat);
                        } else {
                            TLRPC.InputPeer inputPeer = gVar.d;
                            if (inputPeer != null) {
                                if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                                    pVar.setUser(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                                    pVar.setUser(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(inputPeer.user_id)));
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                    TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                                    pVar.h(F(chat2), chat2);
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                    TLRPC.Chat chat3 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                                    pVar.h(F(chat3), chat3);
                                }
                            }
                        }
                    }
                }
                pVar.c(gVar.f2410k, false);
                pVar.i(1.0f, false);
                int i15 = i9 + 1;
                if (i15 < this.h.size() && ((g) this.h.get(i15)).f48814a != i13) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                pVar.setDivider(z10);
                if (i15 < this.h.size() && ((g) this.h.get(i15)).f48814a == 7) {
                    pVar.setDivider(false);
                }
                pVar.setOptions(gVar.f2413n);
                t2 t2Var = gVar.f2414o;
                t2 t2Var2 = gVar.f2415p;
                ImageView imageView = pVar.A;
                ImageView imageView2 = pVar.f6326x;
                if (t2Var != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                pVar.f6325w = z11;
                if (z11 && pVar.B) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView2.setVisibility(i11);
                imageView2.setOnClickListener(t2Var);
                if (t2Var2 == null) {
                    z12 = false;
                }
                pVar.f6327y = z12;
                if (z12 && pVar.B) {
                    i14 = 0;
                }
                imageView.setVisibility(i14);
                imageView.setOnClickListener(t2Var2);
                pVar.g(this.f2424x, false);
            } else if (i13 == 6) {
                fg.c cVar2 = (fg.c) view;
                z12 = (i9 >= this.h.size() - 1 || (i10 = i9 + 1) >= this.h.size() - 1 || ((g) this.h.get(i10)).f48814a == 7) ? false : false;
                cVar2.f6279s = gVar.f2406f;
                cVar2.f();
                cVar2.setDivider(z12);
                cVar2.c(gVar.f2410k, false);
            } else if (i13 == -1) {
                int i16 = gVar.f2411l;
                if (i16 < 0) {
                    i16 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new a1(-1, i16));
            } else if (i13 == 7) {
                ((fg.e) view).setLetter(gVar.f2407g);
            } else if (i13 == 5) {
                try {
                    ((gw0) view).f28883b.getImageReceiver().startAnimation();
                } catch (Exception unused) {
                }
            } else if (i13 == 8) {
                v3 v3Var = (v3) view;
                if (TextUtils.equals(v3Var.getText(), gVar.f2407g)) {
                    String str3 = gVar.h;
                    if (str3 == null) {
                        str3 = "";
                    }
                    v3Var.b(str3, gVar.f2412m);
                } else {
                    v3Var.setText(Emoji.replaceWithRestrictedEmoji(gVar.f2407g, v3Var.getTextView(), (Runnable) null));
                    if (!TextUtils.isEmpty(gVar.h)) {
                        String str4 = gVar.h;
                        u1 u1Var = gVar.f2412m;
                        u3 u3Var = v3Var.f25787b;
                        u3Var.c(str4, false, true);
                        u3Var.setOnClickListener(u1Var);
                        u3Var.setVisibility(0);
                    }
                }
                this.f2422s = v3Var;
            } else if (i13 == 9) {
                p8 p8Var = (p8) view;
                p8Var.e(f6.f23319v6, f6.f23303u6);
                p8Var.m(gVar.f2409j, gVar.f2407g, false);
            } else if (i13 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != gVar.f2416q) {
                    AndroidUtilities.removeFromParent(gVar.f2416q);
                    frameLayout.addView(gVar.f2416q, e6.c(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final q1 x(ViewGroup viewGroup, int i9) {
        p pVar;
        Context context = this.f2418e;
        if (i9 == -1) {
            pVar = new View(context);
        } else if (i9 == 3) {
            pVar = new p(this.f2418e, this.v, this.f2423w, this.d, this.f2421r);
        } else {
            b6 b6Var = this.d;
            if (i9 == 5) {
                gw0 gw0Var = new gw0(context, null, 1, b6Var);
                gw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                gw0Var.f28885e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                gw0Var.f28882a.setTranslationY(AndroidUtilities.dp(24.0f));
                pVar = gw0Var;
            } else if (i9 == 7) {
                pVar = new fg.e(context, b6Var);
            } else if (i9 == 6) {
                pVar = new fg.c(context, b6Var);
            } else if (i9 == 8) {
                pVar = new v3(context, b6Var);
            } else if (i9 == 9) {
                p8 p8Var = new p8(context, b6Var);
                p8Var.f24877n = 16;
                p8Var.f24880w = 19;
                pVar = p8Var;
            } else if (i9 == 10) {
                pVar = new FrameLayout(context);
            } else {
                pVar = new View(context);
            }
        }
        return new q1(pVar);
    }

    @Override
    public final void y(q1 q1Var) {
        View view = q1Var.f5501a;
        if (view instanceof p) {
            ((p) view).g(this.f2424x, false);
        }
    }
}
