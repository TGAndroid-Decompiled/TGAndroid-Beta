package o4;

import ai.b3;
import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.Surface;
import android.view.View;
import android.view.ViewPropertyAnimator;
import ci.hb;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.ws;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;
import org.telegram.ui.hg0;
import org.telegram.ui.p00;
public final class r0 implements g2.k, ws, gj0 {
    public final int f20837a;
    public final int f20838b;
    public final Object f20839c;
    public final Object d;

    public r0(h1 h1Var, Surface surface, int i3, int i10) {
        this.f20839c = h1Var;
        this.d = surface;
        this.f20837a = i3;
        this.f20838b = i10;
    }

    @Override
    public void a(String str) {
        xs xsVar = (xs) this.f20839c;
        Runnable runnable = (Runnable) this.d;
        Editable text = xsVar.getText();
        int i3 = this.f20837a;
        int i10 = this.f20838b;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i3, i10, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof p5) && !(characterStyle instanceof wg0)) {
                    int spanStart = text.getSpanStart(characterStyle);
                    int spanEnd = text.getSpanEnd(characterStyle);
                    text.removeSpan(characterStyle);
                    if (spanStart < i3) {
                        text.setSpan(characterStyle, spanStart, i3, 33);
                    }
                    if (spanEnd > i10) {
                        text.setSpan(characterStyle, i10, spanEnd, 33);
                    }
                }
            }
        }
        try {
            text.setSpan(xsVar.A(str), i3, i10, 33);
        } catch (Exception unused) {
        }
        vs vsVar = xsVar.O1;
        if (vsVar != null) {
            vsVar.m();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void accept(Object obj) {
        h1 h1Var = (h1) this.f20839c;
        Surface surface = (Surface) this.d;
        l1 l1Var = (l1) obj;
        ((e0) h1Var.f20660a.get()).getClass();
        if (surface == null) {
            l1Var.Q(null);
            h1Var.f20665i = null;
            return;
        }
        g1 g1Var = new g1(surface, this.f20837a, this.f20838b);
        h1Var.f20665i = g1Var;
        l1Var.Q(g1Var);
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        long j10;
        boolean z10;
        boolean z11;
        float f12;
        xg.x0 x0Var;
        xg.e1 e1Var = (xg.e1) this.f20839c;
        e6 e6Var = (e6) this.d;
        bh.a aVar = e1Var.W1;
        hg0 hg0Var = e1Var.S1;
        ArrayList arrayList = e1Var.Z1;
        HashSet hashSet = e1Var.f58673a2;
        boolean z12 = view instanceof l8;
        int i10 = this.f20837a;
        yg.g gVar = null;
        if (z12) {
            if (i10 == 4) {
                p00 p00Var = e1Var.f58691t2;
                if (p00Var != null) {
                    p00Var.run();
                    e1Var.dismiss();
                    return;
                }
                return;
            }
            ((t2) t4.l(e1Var.getContext(), bd.M0(2131751239, null), bd.M0(2131751244, null), null, new xg.y0(e1Var, 2), new xg.x0(e1Var, 9), false, false, e1Var.J0).f14429b).show();
        } else if (view instanceof bh.p) {
            bh.p pVar = (bh.p) view;
            TLRPC.User user = pVar.getUser();
            TLRPC.Chat chat = pVar.getChat();
            boolean z13 = true;
            if (user == null && chat == null && i10 == 3) {
                int i11 = i3 - 1;
                if (i11 >= 0 && i11 < arrayList.size()) {
                    gVar = (yg.g) arrayList.get(i11);
                }
                u10 u10Var = e1Var.f58692u2;
                if (u10Var != null && gVar != null) {
                    int i12 = gVar.f59452i;
                    if (i12 == 4) {
                        u10Var.a(-98L);
                    } else if (i12 == 5) {
                        u10Var.a(-97L);
                    } else {
                        u10Var.a(-99L);
                    }
                }
            } else if (user != null || chat != null) {
                if (user != null) {
                    j10 = user.f27150id;
                } else {
                    j10 = -chat.f27001id;
                }
                if (i10 == 3) {
                    u10 u10Var2 = e1Var.f58692u2;
                    if (u10Var2 != null) {
                        u10Var2.a(Long.valueOf(j10));
                    }
                } else if (i10 == 1) {
                    if (hg0Var != null) {
                        org.telegram.messenger.g0.v1(hg0Var.getEditText());
                    }
                    hb hbVar = new hb(e1Var.getContext(), e6Var, user, new xg.x0(e1Var, 11));
                    if (!org.telegram.messenger.g0.Q1()) {
                        hbVar.a0(e1Var.f28601g1);
                    }
                    hbVar.show();
                } else if (i10 != 0 && i10 != 2) {
                    int i13 = 4;
                    if (i10 == 4) {
                        if (hashSet.isEmpty()) {
                            hashSet.add(Long.valueOf(j10));
                            n10 n10Var = e1Var.f58694w2;
                            if (n10Var != null) {
                                wo woVar = e1Var.V1;
                                if (woVar == null || !woVar.f40035a.f31334q) {
                                    z13 = false;
                                }
                                n10Var.a(Boolean.valueOf(z13), hashSet);
                                e1Var.f58694w2 = null;
                            }
                            e1Var.dismiss();
                            return;
                        }
                        i13 = 4;
                    }
                    if (i10 == i13 && hashSet.isEmpty()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (hashSet.contains(Long.valueOf(j10))) {
                        hashSet.remove(Long.valueOf(j10));
                    } else {
                        hashSet.add(Long.valueOf(j10));
                        e1Var.f58678g2.put(Long.valueOf(j10), user);
                    }
                    if (hashSet.size() == e1Var.h1() + 1) {
                        hashSet.remove(Long.valueOf(j10));
                        e1Var.m1();
                        return;
                    }
                    if (i10 == 4 && hashSet.isEmpty()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z10 != z11) {
                        aVar.setVisibility(0);
                        ViewPropertyAnimator animate = aVar.animate();
                        float f13 = 0.0f;
                        if (z11) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        ViewPropertyAnimator alpha = animate.alpha(f12);
                        if (!z11) {
                            f13 = org.telegram.messenger.g0.L(12.0f);
                        }
                        ViewPropertyAnimator duration = alpha.translationY(f13).setInterpolator(xq.h).setDuration(320L);
                        if (!z11) {
                            x0Var = new xg.x0(e1Var, 1);
                        } else {
                            x0Var = null;
                        }
                        duration.withEndAction(x0Var).start();
                        yg.h hVar = e1Var.f58680i2;
                        boolean z14 = !z11;
                        if (hVar.E != z14) {
                            hVar.E = z14;
                            org.telegram.messenger.g0.d0(hVar.f59463f, new yg.f(z14));
                        }
                    }
                    e1Var.e1();
                    hg0Var.b(true, hashSet, new xg.x0(e1Var, 2), null);
                    e1Var.p1(true, true);
                    e1Var.f1();
                } else if (l10.b(hp.s1(h10.f22829t0).b2(j10))) {
                    org.telegram.messenger.camera.q.s(bd.a0(null, null, 2131743752, m5.t(j10)), new fc(e1Var.f28589c, e6Var), 2131624011, 36);
                } else {
                    b3 b3Var = new b3(e1Var.getContext(), this.f20838b, j10, xg.s.c(xg.s.b(1, e1Var.f58682k2)), new xg.y0(e1Var, 1));
                    org.telegram.messenger.t1 t1Var = e1Var.f58686o2;
                    if (t1Var == null || !t1Var.a(j10)) {
                        z13 = false;
                    }
                    b3Var.e1(z13);
                    b3Var.show();
                }
            }
        }
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    public r0(xs xsVar, int i3, int i10, Runnable runnable) {
        this.f20839c = xsVar;
        this.f20837a = i3;
        this.f20838b = i10;
        this.d = runnable;
    }

    public r0(xg.e1 e1Var, int i3, e6 e6Var, int i10) {
        this.f20839c = e1Var;
        this.f20837a = i3;
        this.d = e6Var;
        this.f20838b = i10;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
