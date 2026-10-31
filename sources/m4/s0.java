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
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.m10;
import org.telegram.ui.t10;
import rh.t7;
public final class s0 implements e2.j, hk0, lt {
    public final int f12925a;
    public final int f12926b;
    public final Object f12927c;
    public final Object d;

    public s0(j1 j1Var, Surface surface, int i10, int i11) {
        this.f12927c = j1Var;
        this.d = surface;
        this.f12925a = i10;
        this.f12926b = i11;
    }

    @Override
    public void a(String str) {
        mt mtVar = (mt) this.f12927c;
        Runnable runnable = (Runnable) this.d;
        Editable text = mtVar.getText();
        int i10 = this.f12925a;
        int i11 = this.f12926b;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i10, i11, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof o5) && !(characterStyle instanceof vh0)) {
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
        j1 j1Var = (j1) this.f12927c;
        Surface surface = (Surface) this.d;
        n1 n1Var = (n1) obj;
        ((f0) j1Var.f12788a.get()).getClass();
        if (surface == null) {
            n1Var.R(null);
            j1Var.f12792i = null;
            return;
        }
        i1 i1Var = new i1(surface, this.f12925a, this.f12926b);
        j1Var.f12792i = i1Var;
        n1Var.R(i1Var);
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        long j10;
        boolean z10;
        boolean z11;
        float f11;
        w1 w1Var;
        i2 i2Var = (i2) this.f12927c;
        p6 p6Var = (p6) this.d;
        m10 m10Var = i2Var.V1;
        f2 f2Var = i2Var.R1;
        ArrayList arrayList = i2Var.Y1;
        HashSet hashSet = i2Var.Z1;
        boolean z12 = view instanceof p8;
        int i11 = this.f12925a;
        ng.h hVar = null;
        if (z12) {
            if (i11 == 4) {
                t10 t10Var = i2Var.f13155s2;
                if (t10Var != null) {
                    t10Var.run();
                    i2Var.dismiss();
                    return;
                }
                return;
            }
            ((z2) s4.l(i2Var.getContext(), cd.L0(2131751239, null), cd.L0(2131751244, null), null, new x1(i2Var, 2), new w1(i2Var, 9), false, false, i2Var.I0).f11587b).show();
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
                q20 q20Var = i2Var.f13156t2;
                if (q20Var != null && hVar != null) {
                    int i13 = hVar.f13783i;
                    if (i13 == 4) {
                        q20Var.a(-98L);
                    } else if (i13 == 5) {
                        q20Var.a(-97L);
                    } else {
                        q20Var.a(-99L);
                    }
                }
            } else if (user != null || chat != null) {
                if (user != null) {
                    j10 = user.f19942id;
                } else {
                    j10 = -chat.f19793id;
                }
                if (i11 == 3) {
                    q20 q20Var2 = i2Var.f13156t2;
                    if (q20Var2 != null) {
                        q20Var2.a(Long.valueOf(j10));
                    }
                } else if (i11 == 1) {
                    if (f2Var != null) {
                        org.telegram.messenger.i0.v1(f2Var.getEditText());
                    }
                    t7 t7Var = new t7(i2Var.getContext(), p6Var, user, new w1(i2Var, 11));
                    if (!org.telegram.messenger.i0.Q1()) {
                        t7Var.a0(i2Var.f21598f1);
                    }
                    t7Var.show();
                } else if (i11 != 0 && i11 != 2) {
                    int i14 = 4;
                    if (i11 == 4) {
                        if (hashSet.isEmpty()) {
                            hashSet.add(Long.valueOf(j10));
                            j20 j20Var = i2Var.f13158v2;
                            if (j20Var != null) {
                                ep epVar = i2Var.U1;
                                if (epVar == null || !epVar.f25836a.f23919q) {
                                    z13 = false;
                                }
                                j20Var.a(Boolean.valueOf(z13), hashSet);
                                i2Var.f13158v2 = null;
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
                        i2Var.f13142f2.put(Long.valueOf(j10), user);
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
                        m10Var.setVisibility(0);
                        ViewPropertyAnimator animate = m10Var.animate();
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
                        ng.i iVar = i2Var.f13144h2;
                        boolean z14 = !z11;
                        if (iVar.D != z14) {
                            iVar.D = z14;
                            org.telegram.messenger.i0.d0(iVar.f13793f, new ng.g(z14));
                        }
                    }
                    i2Var.e1();
                    f2Var.b(true, hashSet, new w1(i2Var, 2), null);
                    i2Var.p1(true, true);
                    i2Var.f1();
                } else if (h20.b(vp.r1(d20.f15147s0).a2(j10))) {
                    z20.s(cd.a0(null, null, 2131743768, org.telegram.messenger.o5.t(j10)), new cc(i2Var.f21589c, p6Var), 2131624011, 36);
                } else {
                    ph.l1 l1Var = new ph.l1(i2Var.getContext(), this.f12926b, j10, mg.k0.c(mg.k0.b(1, i2Var.f13146j2)), new x1(i2Var, 1));
                    org.telegram.messenger.w1 w1Var2 = i2Var.f13150n2;
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
        this.f12927c = i2Var;
        this.f12925a = i10;
        this.d = p6Var;
        this.f12926b = i11;
    }

    public s0(mt mtVar, int i10, int i11, Runnable runnable) {
        this.f12927c = mtVar;
        this.f12925a = i10;
        this.f12926b = i11;
        this.d = runnable;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
