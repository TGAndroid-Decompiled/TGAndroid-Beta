package ng;

import ag.l;
import ag.t0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import k2.u;
import mg.y1;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.hs;
import org.telegram.messenger.i0;
import org.telegram.messenger.k6;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.tk0;
import qg.k;
import s4.c1;
import s4.o0;
import w7.b6;
public final class i extends hg.c {
    public final p6 d;
    public final Context e;
    public tk0 f13793f;
    public ArrayList f13794n;
    public boolean f13796s;
    public z3 f13797w;
    public final boolean f13798x;
    public boolean f13799y;
    public final HashMap f13795r = new HashMap();
    public boolean D = true;
    public final boolean h = true;

    public i(Context context, p6 p6Var, boolean z10) {
        this.e = context;
        this.f13798x = z10;
        this.d = p6Var;
        l lVar = new l(this, 23);
        hs a02 = hs.a0(d20.f15147s0);
        a02.f15938a.c(new u(25, a02, lVar));
    }

    @Override
    public final boolean D(c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 != 3 && i10 != 6 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull M0 = vp.r1(d20.f15147s0).M0(chat.f19793id);
        if (M0 != null && (i10 = M0.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.f13795r;
        if (!hashMap.isEmpty() && (num = (Integer) hashMap.get(Long.valueOf(chat.f19793id))) != null) {
            return num.intValue();
        }
        return chat.participants_count;
    }

    public final void G() {
        ArrayList arrayList = this.f13794n;
        if (arrayList != null && !arrayList.isEmpty()) {
            g(this.f13794n.size() - 1);
        }
    }

    @Override
    public final int b() {
        ArrayList arrayList = this.f13794n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override
    public final int d(int i10) {
        ArrayList arrayList = this.f13794n;
        if (arrayList != null && i10 >= 0) {
            return ((h) arrayList.get(i10)).f7680a;
        }
        return -1;
    }

    @Override
    public final void t(c1 c1Var, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        ArrayList arrayList = this.f13794n;
        if (arrayList != null && i10 >= 0) {
            h hVar = (h) arrayList.get(i10);
            int i14 = c1Var.f47901f;
            View view = c1Var.f47898a;
            int i15 = 8;
            boolean z12 = true;
            if (i14 == 3) {
                k kVar = (k) view;
                Drawable drawable = hVar.f13792r;
                if (drawable != null) {
                    CharSequence charSequence = hVar.f13782g;
                    CharSequence charSequence2 = hVar.h;
                    kVar.f45557x.setVisibility(8);
                    kVar.H = null;
                    kVar.I = null;
                    g9 g9Var = kVar.f14178c;
                    g9Var.setRoundRadius(i0.L(20.0f));
                    g9Var.setImageDrawable(drawable);
                    og.c cVar = kVar.d;
                    cVar.k(charSequence);
                    boolean[] zArr = kVar.f45555s;
                    zArr[0] = false;
                    kVar.setSubtitle(charSequence2);
                    u5 u5Var = kVar.e;
                    if (zArr[0]) {
                        i13 = t6.f21114n5;
                    } else {
                        i13 = t6.f21185r5;
                    }
                    a7.Y(u5Var, i13, kVar.f14176a);
                    ep epVar = kVar.f45556w;
                    if (epVar != null) {
                        epVar.setAlpha(1.0f);
                    }
                    cVar.i(null);
                } else {
                    TLRPC.User user = hVar.f13780c;
                    if (user != null) {
                        kVar.setUser(user);
                        CharSequence charSequence3 = hVar.h;
                        if (charSequence3 != null) {
                            kVar.setSubtitle(charSequence3);
                            a7.Y(kVar.e, t6.f21185r5, this.d);
                        }
                    } else {
                        TLRPC.Chat chat = hVar.e;
                        if (chat != null) {
                            kVar.h(F(chat), chat);
                        } else {
                            TLRPC.InputPeer inputPeer = hVar.d;
                            if (inputPeer != null) {
                                if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                                    kVar.setUser(d20.i(d20.f15147s0).f());
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                                    kVar.setUser(vp.r1(d20.f15147s0).Z1(Long.valueOf(inputPeer.user_id)));
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                                    TLRPC.Chat L0 = vp.r1(d20.f15147s0).L0(Long.valueOf(inputPeer.chat_id));
                                    kVar.h(F(L0), L0);
                                } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                                    TLRPC.Chat L02 = vp.r1(d20.f15147s0).L0(Long.valueOf(inputPeer.channel_id));
                                    kVar.h(F(L02), L02);
                                }
                            }
                        }
                    }
                }
                kVar.c(hVar.f13785k, false);
                kVar.i(false, 1.0f);
                int i16 = i10 + 1;
                if (i16 < this.f13794n.size() && ((h) this.f13794n.get(i16)).f7680a != i14) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                kVar.setDivider(z10);
                if (i16 < this.f13794n.size() && ((h) this.f13794n.get(i16)).f7680a == 7) {
                    kVar.setDivider(false);
                }
                kVar.setOptions(hVar.f13788n);
                y1 y1Var = hVar.f13789o;
                y1 y1Var2 = hVar.f13790p;
                ImageView imageView = kVar.F;
                ImageView imageView2 = kVar.D;
                if (y1Var != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                kVar.f45558y = z11;
                if (z11 && kVar.G) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView2.setVisibility(i12);
                imageView2.setOnClickListener(y1Var);
                if (y1Var2 == null) {
                    z12 = false;
                }
                kVar.E = z12;
                if (z12 && kVar.G) {
                    i15 = 0;
                }
                imageView.setVisibility(i15);
                imageView.setOnClickListener(y1Var2);
                kVar.g(this.D, false);
            } else if (i14 == 6) {
                qg.b bVar = (qg.b) view;
                if (i10 >= this.f13794n.size() - 1 || (i11 = i10 + 1) >= this.f13794n.size() - 1 || ((h) this.f13794n.get(i11)).f7680a == 7) {
                    z12 = false;
                }
                bVar.f45522w = hVar.f13781f;
                bVar.f();
                bVar.setDivider(z12);
                bVar.c(hVar.f13785k, false);
            } else if (i14 == -1) {
                int i17 = hVar.f13786l;
                if (i17 < 0) {
                    i17 = (int) (i0.f16026q.y * 0.3f);
                }
                view.setLayoutParams(new o0(-1, i17));
            } else if (i14 == 7) {
                ((qg.d) view).setLetter(hVar.f13782g);
            } else if (i14 == 5) {
                try {
                    ((dw0) view).f25550b.getImageReceiver().P0(false);
                } catch (Exception unused) {
                }
            } else if (i14 == 8) {
                z3 z3Var = (z3) view;
                if (TextUtils.equals(z3Var.getText(), hVar.f13782g)) {
                    CharSequence charSequence4 = hVar.h;
                    if (charSequence4 == null) {
                        charSequence4 = "";
                    }
                    z3Var.a(charSequence4, hVar.f13787m);
                } else {
                    z3Var.setText(k6.p(hVar.f13782g, z3Var.getTextView(), null));
                    if (!TextUtils.isEmpty(hVar.h)) {
                        CharSequence charSequence5 = hVar.h;
                        t0 t0Var = hVar.f13787m;
                        y3 y3Var = z3Var.f23639b;
                        y3Var.c(charSequence5, false, true);
                        y3Var.setOnClickListener(t0Var);
                        y3Var.setVisibility(0);
                    }
                }
                this.f13797w = z3Var;
            } else if (i14 == 9) {
                p8 p8Var = (p8) view;
                p8Var.g(t6.f21259v6, t6.f21242u6);
                p8Var.o(hVar.f13784j, hVar.f13782g, false);
            } else if (i14 == 10) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() != 1 || frameLayout.getChildAt(0) != hVar.f13791q) {
                    i0.E2(hVar.f13791q);
                    frameLayout.addView(hVar.f13791q, b6.c(-2.0f, -1));
                }
            }
        }
    }

    @Override
    public final c1 w(ViewGroup viewGroup, int i10) {
        k kVar;
        Context context = this.e;
        if (i10 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            kVar = view;
        } else if (i10 == 3) {
            kVar = new k(this.e, this.f13798x, this.f13799y, this.d, this.f13796s);
        } else {
            p6 p6Var = this.d;
            if (i10 == 5) {
                dw0 dw0Var = new dw0(context, null, 1, p6Var);
                dw0Var.d.setText(cd.L0(2131748183, null));
                dw0Var.e.setText(cd.L0(2131745824, null));
                dw0Var.f25549a.setTranslationY(i0.L(24.0f));
                kVar = dw0Var;
            } else {
                boolean z10 = this.h;
                if (i10 == 7) {
                    qg.d dVar = new qg.d(context, p6Var);
                    dVar.setTag(-33024);
                    kVar = dVar;
                    if (z10) {
                        dVar.setBackground(null);
                        kVar = dVar;
                    }
                } else if (i10 == 6) {
                    qg.b bVar = new qg.b(context, p6Var);
                    bVar.setTag(-33024);
                    kVar = bVar;
                    if (z10) {
                        bVar.setBackground(null);
                        kVar = bVar;
                    }
                } else if (i10 == 8) {
                    z3 z3Var = new z3(context, p6Var);
                    z3Var.setTag(-33024);
                    kVar = z3Var;
                    if (z10) {
                        z3Var.setBackground(null);
                        kVar = z3Var;
                    }
                } else if (i10 == 9) {
                    p8 p8Var = new p8(context, p6Var);
                    p8Var.f22461n = 16;
                    p8Var.f22465x = 19;
                    kVar = p8Var;
                } else if (i10 == 10) {
                    kVar = new FrameLayout(context);
                } else {
                    kVar = new View(context);
                }
            }
        }
        return new c1(kVar);
    }

    @Override
    public final void y(c1 c1Var) {
        View view = c1Var.f47898a;
        if (view instanceof k) {
            ((k) view).g(this.D, false);
        }
    }
}
