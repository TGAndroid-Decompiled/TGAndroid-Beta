package fg;

import ag.i0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import eg.j2;
import f2.n1;
import f2.x0;
import i7.f6;
import ig.n;
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
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.r3;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.t9;
public final class h extends zf.b {
    public final c6 d;
    public final Context f6757e;
    public jl0 f6758f;
    public ArrayList h;
    public boolean f6760r;
    public s3 f6761s;
    public final boolean v;
    public boolean f6762w;
    public final HashMap f6759n = new HashMap();
    public boolean f6763x = true;

    public h(Context context, c6 c6Var, boolean z10) {
        this.f6757e = context;
        this.v = z10;
        this.d = c6Var;
        i0 i0Var = new i0(this, 12);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new ef.c(6, messagesStorage, i0Var));
    }

    @Override
    public final boolean D(n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 3 && i10 != 6 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.f22392id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f6759n;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f22392id))) != null) {
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
            return ((g) arrayList.get(i10)).f50845a;
        }
        return -1;
    }

    @Override
    public final void v(n1 n1Var, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        ArrayList arrayList = this.h;
        if (arrayList != null && i10 >= 0) {
            g gVar = (g) arrayList.get(i10);
            int i14 = n1Var.f6436f;
            View view = n1Var.f6432a;
            int i15 = 8;
            boolean z12 = true;
            if (i14 == 3) {
                n nVar = (n) view;
                jq jqVar = gVar.f6756r;
                if (jqVar != null) {
                    CharSequence charSequence = gVar.f6746g;
                    String str = gVar.h;
                    nVar.v.setVisibility(8);
                    nVar.C = null;
                    nVar.D = null;
                    t9 t9Var = nVar.f7290c;
                    t9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
                    t9Var.setImageDrawable(jqVar);
                    gg.c cVar = nVar.d;
                    cVar.k(charSequence);
                    boolean[] zArr = nVar.f9007r;
                    zArr[0] = false;
                    nVar.setSubtitle(str);
                    h5 h5Var = nVar.f7291e;
                    if (zArr[0]) {
                        i13 = g6.f23240n5;
                    } else {
                        i13 = g6.f23310r5;
                    }
                    h5Var.setTextColor(g6.v0(i13, nVar.f7288a));
                    hp hpVar = nVar.f9008s;
                    if (hpVar != null) {
                        hpVar.setAlpha(1.0f);
                    }
                    cVar.i(null);
                } else {
                    TLRPC.User user = gVar.f6743c;
                    if (user != null) {
                        nVar.setUser(user);
                        String str2 = gVar.h;
                        if (str2 != null) {
                            nVar.setSubtitle(str2);
                            nVar.f7291e.setTextColor(g6.v0(g6.f23310r5, this.d));
                        }
                    } else {
                        TLRPC.Chat chat = gVar.f6744e;
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
                nVar.c(gVar.f6749k, false);
                nVar.i(1.0f, false);
                int i16 = i10 + 1;
                if (i16 < this.h.size() && ((g) this.h.get(i16)).f50845a != i14) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                nVar.setDivider(z10);
                if (i16 < this.h.size() && ((g) this.h.get(i16)).f50845a == 7) {
                    nVar.setDivider(false);
                }
                nVar.setOptions(gVar.f6752n);
                j2 j2Var = gVar.f6753o;
                j2 j2Var2 = gVar.f6754p;
                ImageView imageView = nVar.A;
                ImageView imageView2 = nVar.f9010x;
                if (j2Var != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                nVar.f9009w = z11;
                if (z11 && nVar.B) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView2.setVisibility(i12);
                imageView2.setOnClickListener(j2Var);
                if (j2Var2 == null) {
                    z12 = false;
                }
                nVar.f9011y = z12;
                if (z12 && nVar.B) {
                    i15 = 0;
                }
                imageView.setVisibility(i15);
                imageView.setOnClickListener(j2Var2);
                nVar.g(this.f6763x, false);
            } else if (i14 == 6) {
                ig.c cVar2 = (ig.c) view;
                z12 = (i10 >= this.h.size() - 1 || (i11 = i10 + 1) >= this.h.size() - 1 || ((g) this.h.get(i11)).f50845a == 7) ? false : false;
                cVar2.f8969s = gVar.f6745f;
                cVar2.f();
                cVar2.setDivider(z12);
                cVar2.c(gVar.f6749k, false);
            } else if (i14 == -1) {
                int i17 = gVar.f6750l;
                if (i17 < 0) {
                    i17 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new x0(-1, i17));
            } else if (i14 == 7) {
                ((ig.e) view).setLetter(gVar.f6746g);
            } else if (i14 == 5) {
                try {
                    ((qw0) view).f32120b.getImageReceiver().startAnimation();
                } catch (Exception unused) {
                }
            } else if (i14 == 8) {
                s3 s3Var = (s3) view;
                if (TextUtils.equals(s3Var.getText(), gVar.f6746g)) {
                    String str3 = gVar.h;
                    if (str3 == null) {
                        str3 = "";
                    }
                    s3Var.b(str3, gVar.f6751m);
                } else {
                    s3Var.setText(Emoji.replaceWithRestrictedEmoji(gVar.f6746g, s3Var.getTextView(), (Runnable) null));
                    if (!TextUtils.isEmpty(gVar.h)) {
                        String str4 = gVar.h;
                        ag.n nVar2 = gVar.f6751m;
                        r3 r3Var = s3Var.f25639b;
                        r3Var.c(str4, false, true);
                        r3Var.setOnClickListener(nVar2);
                        r3Var.setVisibility(0);
                    }
                }
                this.f6761s = s3Var;
            } else if (i14 == 9) {
                m8 m8Var = (m8) view;
                m8Var.e(g6.f23383v6, g6.f23365u6);
                m8Var.m(gVar.f6748j, gVar.f6746g, false);
            } else if (i14 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != gVar.f6755q) {
                    AndroidUtilities.removeFromParent(gVar.f6755q);
                    frameLayout.addView(gVar.f6755q, f6.c(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final n1 x(ViewGroup viewGroup, int i10) {
        n nVar;
        Context context = this.f6757e;
        if (i10 == -1) {
            nVar = new View(context);
        } else if (i10 == 3) {
            nVar = new n(this.f6757e, this.v, this.f6762w, this.d, this.f6760r);
        } else {
            c6 c6Var = this.d;
            if (i10 == 5) {
                qw0 qw0Var = new qw0(context, null, 1, c6Var);
                qw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                qw0Var.f32122e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                qw0Var.f32119a.setTranslationY(AndroidUtilities.dp(24.0f));
                nVar = qw0Var;
            } else if (i10 == 7) {
                nVar = new ig.e(context, c6Var);
            } else if (i10 == 6) {
                nVar = new ig.c(context, c6Var);
            } else if (i10 == 8) {
                nVar = new s3(context, c6Var);
            } else if (i10 == 9) {
                m8 m8Var = new m8(context, c6Var);
                m8Var.f24713n = 16;
                m8Var.f24716w = 19;
                nVar = m8Var;
            } else if (i10 == 10) {
                nVar = new FrameLayout(context);
            } else {
                nVar = new View(context);
            }
        }
        return new n1(nVar);
    }

    @Override
    public final void y(n1 n1Var) {
        View view = n1Var.f6432a;
        if (view instanceof n) {
            ((n) view).g(this.f6763x, false);
        }
    }
}
