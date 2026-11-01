package m4;

import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.Surface;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import mg.f2;
import mg.i2;
import mg.w1;
import mg.x1;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.i20;
import org.telegram.messenger.k20;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.l10;
import org.telegram.ui.s10;
import rh.t7;
public final class s0 implements e2.j, ik0, lt {
    public final int f12926a;
    public final int f12927b;
    public final Object f12928c;
    public final Object d;

    public s0(j1 j1Var, Surface surface, int i10, int i11) {
        this.f12928c = j1Var;
        this.d = surface;
        this.f12926a = i10;
        this.f12927b = i11;
    }

    @Override
    public void a(String str) {
        mt mtVar = (mt) this.f12928c;
        Runnable runnable = (Runnable) this.d;
        Editable text = mtVar.getText();
        int i10 = this.f12926a;
        int i11 = this.f12927b;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof o5) && !(characterStyle instanceof wh0)) {
                    int spanStart = text.getSpanStart(characterStyle);
                    int spanEnd = text.getSpanEnd(characterStyle);
                    text.removeSpan(characterStyle);
                    if (spanStart < i10) {
                        text.setSpan(characterStyle, spanStart, i10, 33);
                    }
                    if (spanEnd > i11) {
                        text.setSpan(characterStyle, i11, spanEnd, 33);
                    }
                }
            }
        }
        try {
            text.setSpan(mtVar.A(str), i10, i11, 33);
        } catch (Exception unused) {
        }
        kt ktVar = mtVar.N1;
        if (ktVar != null) {
            ktVar.m();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void accept(Object obj) {
        j1 j1Var = (j1) this.f12928c;
        Surface surface = (Surface) this.d;
        n1 n1Var = (n1) obj;
        ((f0) j1Var.f12789a.get()).getClass();
        if (surface == null) {
            n1Var.R(null);
            j1Var.f12793i = null;
            return;
        }
        i1 i1Var = new i1(surface, this.f12926a, this.f12927b);
        j1Var.f12793i = i1Var;
        n1Var.R(i1Var);
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        long j10;
        boolean z10;
        boolean z11;
        float f11;
        w1 w1Var;
        i2 i2Var = (i2) this.f12928c;
        p6 p6Var = (p6) this.d;
        l10 l10Var = i2Var.V1;
        f2 f2Var = i2Var.R1;
        ArrayList arrayList = i2Var.Y1;
        HashSet hashSet = i2Var.Z1;
        boolean z12 = view instanceof p8;
        int i11 = this.f12926a;
        ng.h hVar = null;
        if (z12) {
            if (i11 == 4) {
                s10 s10Var = i2Var.f13156s2;
                if (s10Var != null) {
                    s10Var.run();
                    i2Var.dismiss();
                    return;
                }
                return;
            }
            ((z2) s4.l(i2Var.getContext(), dd.L0(2131751239, null), dd.L0(2131751244, null), null, new x1(i2Var, 2), new w1(i2Var, 9), false, false, i2Var.I0).f11588b).show();
        } else if (view instanceof qg.k) {
            qg.k kVar = (qg.k) view;
            TLRPC.User user = kVar.getUser();
            TLRPC.Chat chat = kVar.getChat();
            boolean z13 = true;
            if (user == null && chat == null && i11 == 3) {
                int i12 = i10 - 1;
                if (i12 >= 0 && i12 < arrayList.size()) {
                    hVar = (ng.h) arrayList.get(i12);
                }
                r20 r20Var = i2Var.f13157t2;
                if (r20Var != null && hVar != null) {
                    int i13 = hVar.f13784i;
                    if (i13 == 4) {
                        r20Var.a(-98L);
                    } else if (i13 == 5) {
                        r20Var.a(-97L);
                    } else {
                        r20Var.a(-99L);
                    }
                }
            } else if (user != null || chat != null) {
                if (user != null) {
                    j10 = user.f19943id;
                } else {
                    j10 = -chat.f19794id;
                }
                if (i11 == 3) {
                    r20 r20Var2 = i2Var.f13157t2;
                    if (r20Var2 != null) {
                        r20Var2.a(Long.valueOf(j10));
                    }
                } else if (i11 == 1) {
                    if (f2Var != null) {
                        org.telegram.messenger.i0.v1(f2Var.getEditText());
                    }
                    t7 t7Var = new t7(i2Var.getContext(), p6Var, user, new w1(i2Var, 11));
                    if (!org.telegram.messenger.i0.Q1()) {
                        t7Var.a0(i2Var.f21599f1);
                    }
                    t7Var.show();
                } else if (i11 != 0 && i11 != 2) {
                    int i14 = 4;
                    if (i11 == 4) {
                        if (hashSet.isEmpty()) {
                            hashSet.add(Long.valueOf(j10));
                            k20 k20Var = i2Var.f13159v2;
                            if (k20Var != null) {
                                ep epVar = i2Var.U1;
                                if (epVar == null || !epVar.f25895a.f23920q) {
                                    z13 = false;
                                }
                                k20Var.a(Boolean.valueOf(z13), hashSet);
                                i2Var.f13159v2 = null;
                            }
                            i2Var.dismiss();
                            return;
                        }
                        i14 = 4;
                    }
                    if (i11 == i14 && hashSet.isEmpty()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (hashSet.contains(Long.valueOf(j10))) {
                        hashSet.remove(Long.valueOf(j10));
                    } else {
                        hashSet.add(Long.valueOf(j10));
                        i2Var.f13143f2.put(Long.valueOf(j10), user);
                    }
                    if (hashSet.size() == i2Var.h1() + 1) {
                        hashSet.remove(Long.valueOf(j10));
                        i2Var.m1();
                        return;
                    }
                    if (i11 == 4 && hashSet.isEmpty()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z10 != z11) {
                        l10Var.setVisibility(0);
                        ViewPropertyAnimator animate = l10Var.animate();
                        float f12 = 0.0f;
                        if (z11) {
                            f11 = 1.0f;
                        } else {
                            f11 = 0.0f;
                        }
                        ViewPropertyAnimator alpha = animate.alpha(f11);
                        if (!z11) {
                            f12 = org.telegram.messenger.i0.L(12.0f);
                        }
                        ViewPropertyAnimator duration = alpha.translationY(f12).setInterpolator(gr.h).setDuration(320L);
                        if (!z11) {
                            w1Var = new w1(i2Var, 1);
                        } else {
                            w1Var = null;
                        }
                        duration.withEndAction(w1Var).start();
                        ng.i iVar = i2Var.f13145h2;
                        boolean z14 = !z11;
                        if (iVar.D != z14) {
                            iVar.D = z14;
                            org.telegram.messenger.i0.d0(iVar.f13794f, new ng.g(z14));
                        }
                    }
                    i2Var.e1();
                    f2Var.b(true, hashSet, new w1(i2Var, 2), null);
                    i2Var.p1(true, true);
                    i2Var.f1();
                } else if (i20.b(wp.r1(e20.f15506s0).a2(j10))) {
                    a30.s(dd.a0(null, null, 2131743768, org.telegram.messenger.o5.t(j10)), new cc(i2Var.f21590c, p6Var), 2131624011, 36);
                } else {
                    ph.l1 l1Var = new ph.l1(i2Var.getContext(), this.f12927b, j10, mg.k0.c(mg.k0.b(1, i2Var.f13147j2)), new x1(i2Var, 1));
                    org.telegram.messenger.w1 w1Var2 = i2Var.f13151n2;
                    if (w1Var2 == null || !w1Var2.a(j10)) {
                        z13 = false;
                    }
                    l1Var.e1(z13);
                    l1Var.show();
                }
            }
        }
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    public s0(i2 i2Var, int i10, p6 p6Var, int i11) {
        this.f12928c = i2Var;
        this.f12926a = i10;
        this.d = p6Var;
        this.f12927b = i11;
    }

    public s0(mt mtVar, int i10, int i11, Runnable runnable) {
        this.f12928c = mtVar;
        this.f12926a = i10;
        this.f12927b = i11;
        this.d = runnable;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
