package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.q;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class vj6 implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;

    public vj6(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    private final void a() {
        String G;
        int i;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        vx7 vx7Var = ((lx7) this.c).e;
        if (this.b) {
            i = ((d) vx7Var).currentAccount;
            y6c.h(i).t();
            vx7Var.O0 = (byte) 0;
            vx7Var.U1();
            ViewGroup[] viewGroupArr = vx7Var.a0;
            if (viewGroupArr != null && viewGroupArr[0].getVisibility() == 0) {
                vx7Var.Z[0].requestFocus();
                gl.E3(vx7Var.Z[0]);
                return;
            }
            return;
        }
        vx7Var.P1(true, false);
        if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            vx7Var.C1(true);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = k96.G(intValue, "Seconds", new Object[0]);
            } else {
                G = k96.G(intValue / 60, "Minutes", new Object[0]);
            }
            vx7Var.O1(k96.M0(2131689472, null), k96.a0("FloodWaitTime", null, 2131750669, G));
        } else {
            vx7Var.O1(k96.M0(2131689472, null), tL_error.text);
        }
    }

    private final void b() {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        View view = (View) this.d;
        Drawable[] drawableArr = PhotoViewer.d9;
        if (!this.b) {
            view.setVisibility(8);
        }
        photoViewer.D2();
    }

    private final void c() {
        PhotoViewer photoViewer = (PhotoViewer) this.c;
        String str = (String) this.d;
        Drawable[] drawableArr = PhotoViewer.d9;
        if (str.equals(photoViewer.B4.R)) {
            photoViewer.v4 = this.b ? (byte) 1 : (byte) 0;
            photoViewer.w4 = str;
        }
    }

    private final void d() {
        yf8 yf8Var = (yf8) this.c;
        q5c q5cVar = yf8Var.c;
        ArrayList arrayList = (ArrayList) this.d;
        if (this.b) {
            arrayList = yf8Var.e;
        }
        if (!arrayList.isEmpty()) {
            if (q5cVar.canScrollVertically(1)) {
                for (int i = 0; i < q5cVar.getChildCount(); i++) {
                    if (!(q5cVar.getChildAt(i) instanceof pi4)) {
                    }
                }
                return;
            }
            yf8Var.a(false);
        }
    }

    private final void e() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean[] zArr = (boolean[]) this.d;
        RectF rectF = ProfileActivity.Z6;
        if (this.b && profileActivity.P4 == -1) {
            pl8 pl8Var = profileActivity.a0;
            if (pl8Var != null) {
                ml8 i = pl8.i(7, pl8Var.a);
                if (i != null && i.s) {
                    i.s = false;
                    pl8Var.invalidate();
                }
                if (zArr[0]) {
                    pl8 pl8Var2 = profileActivity.a0;
                    pl8Var2.G = true;
                    pl8Var2.o(7, false);
                    profileActivity.a0.o(9, true);
                    pl8 pl8Var3 = profileActivity.a0;
                    if (pl8Var3.G) {
                        pl8Var3.G = false;
                        pl8Var3.d();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        profileActivity.e4();
        ko8 ko8Var = profileActivity.d;
        if (ko8Var != null) {
            ko8Var.f();
        }
    }

    private final void f() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj6.f():void");
    }

    private final void g() {
        ye9 ye9Var = (ye9) this.c;
        ii9 ii9Var = (ii9) this.d;
        boolean z = this.b;
        boolean z2 = !z;
        ki9 ki9Var = ii9Var.w;
        Iterator it = ii9Var.I.iterator();
        while (it.hasNext()) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
            li9 m = ki9Var.m(pagetablecell);
            boolean z3 = true;
            if (m != null) {
                if (m.b != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m.a.getText());
                    if (spannableStringBuilder.length() <= 0 || (yi9.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) == 0) {
                        z3 = false;
                    }
                    ffb.l(m.b, z2);
                    if (!z) {
                        if (spannableStringBuilder.length() > 0) {
                            yi9.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        }
                    } else if (z3) {
                        yi9.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                    }
                    ffb.d(m.b, spannableStringBuilder);
                    m.b(m.b);
                }
            } else {
                boolean z4 = true;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ffb.h(pagetablecell));
                if (spannableStringBuilder2.length() <= 0 || (yi9.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) == 0) {
                    z4 = false;
                }
                ffb.l(pagetablecell, z2);
                if (!z) {
                    if (spannableStringBuilder2.length() > 0) {
                        yi9.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                    }
                } else if (z4) {
                    yi9.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                }
                ffb.d(pagetablecell, spannableStringBuilder2);
            }
        }
        ki9Var.invalidate();
        ge9 ge9Var = ii9Var.F;
        if (ge9Var != null && ii9Var.a != null) {
            ge9Var.a();
        }
        ye9Var.I2();
    }

    private final void h() {
        xe9 xe9Var = (xe9) this.d;
        xe9Var.f.k3(true);
        lf9.k((d) this.c, this.b, new if9(xe9Var, (byte) 2));
    }

    private final void i() {
        Size size;
        int i;
        boolean z;
        jk9 jk9Var = (jk9) this.c;
        boolean z2 = this.b;
        qj9 qj9Var = (qj9) this.d;
        if (!jk9Var.f) {
            return;
        }
        jk9Var.F = z2;
        if (z2) {
            size = jk9Var.c;
        } else {
            size = jk9Var.b;
        }
        jk9Var.a = size;
        if (z2) {
            i = jk9Var.l;
        } else {
            i = jk9Var.k;
        }
        jk9Var.j = i;
        if (z2) {
            z = jk9Var.o;
        } else {
            z = jk9Var.n;
        }
        jk9Var.m = z;
        tk9 tk9Var = jk9Var.N;
        if (tk9Var != null) {
            tk9Var.c = size;
            tk9Var.d = i;
            tk9Var.v();
            tk9Var.B = false;
            tk9Var.A = 0L;
        }
        jk9Var.Q = -1L;
        jk9Var.v0 = qj9Var;
        ek9 ek9Var = jk9Var.i;
        ek9Var.b("GL dual input selected: input=" + (z2 ? 1 : 0));
    }

    private final void j() {
        int i;
        String str;
        long cameraFlipElapsedMs;
        xj9 xj9Var = (xj9) this.d;
        ul9 ul9Var = (ul9) ((g29) this.c).b;
        int i2 = ul9Var.a0;
        if (i2 != 7 && i2 != 8 && i2 != 9 && i2 != 10) {
            nl9 nl9Var = xj9Var.a;
            pl9 pl9Var = xj9Var.c;
            ol9 ol9Var = xj9Var.b;
            ul9Var.s = nl9Var;
            ul9Var.t = ol9Var;
            ul9Var.u = pl9Var;
            ul9Var.v = xj9Var.e;
            if (nl9Var == nl9.a) {
                if (ul9Var.f != null) {
                    i = 3;
                }
                i = 1;
            } else {
                if (xj9Var.f) {
                    i = 2;
                }
                i = 1;
            }
            ul9Var.b0 = i;
            ul9Var.n();
            ek9 ek9Var = ul9Var.m;
            StringBuilder sb = new StringBuilder("camera configured: facing=");
            sb.append(nl9Var);
            sb.append(", mode=");
            sb.append(ol9Var);
            sb.append(", recording=");
            sb.append(xj9Var.d);
            sb.append(", fps=");
            sb.append((int) pl9Var.a);
            sb.append(", maxZoom=");
            sb.append(ul9Var.v);
            sb.append(", flash=");
            int i3 = ul9Var.b0;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        str = "null";
                    } else {
                        str = "SCREEN";
                    }
                } else {
                    str = "TORCH";
                }
            } else {
                str = "NONE";
            }
            sb.append(str);
            sb.append(", switch=");
            boolean z = this.b;
            sb.append(z);
            ek9Var.b(sb.toString());
            if (!z && !ul9Var.y) {
                return;
            }
            ul9Var.y = false;
            q qVar = (q) ul9Var.d.a;
            qVar.r0 = true;
            StringBuilder sb2 = new StringBuilder("RoundVideo camera flip session ready: facing=");
            sb2.append(nl9Var);
            sb2.append(", elapsedMs=");
            cameraFlipElapsedMs = qVar.getCameraFlipElapsedMs();
            sb2.append(cameraFlipElapsedMs);
            fa4.b(sb2.toString());
            qVar.q();
            ul9Var.o();
        }
    }

    private final void k() {
        wb5 wb5Var = (wb5) this.c;
        tj9 tj9Var = (tj9) this.d;
        if (this.b) {
            na7.q1(wb5Var.a).l0(true);
            tj9Var.run();
        } else {
            d S = LaunchActivity.S();
            if (S == null) {
                return;
            }
            S.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.o0(3)));
        }
        wb5Var.dismiss();
    }

    private final void l() {
        cs5 cs5Var = (cs5) this.d;
        ((Runnable) this.c).run();
        if (this.b) {
            cs5Var.u();
        }
    }

    private final void m() {
        ((ae2) this.c).a(Boolean.valueOf(this.b), (String) this.d);
    }

    private final void n() {
        ((i8c) this.c).a(Boolean.valueOf(this.b), (String) this.d);
    }

    private final void o() {
        ((et4) this.c).a(Boolean.valueOf(this.b), (String) this.d);
    }

    private final void p() {
        ((TwoStepVerificationActivity) this.c).m0((byte[]) this.d, this.b);
    }

    private final void q() {
        ((VoIPService) this.c).lambda$startConferenceGroupCall$55((ArrayList) this.d, this.b);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj6.run():void");
    }

    public vj6(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}
