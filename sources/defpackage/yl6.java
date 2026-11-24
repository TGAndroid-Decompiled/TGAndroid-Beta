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
public final class yl6 implements Runnable {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;

    public yl6(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    private final void a() {
        String G;
        int i;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        xz7 xz7Var = ((nz7) this.c).e;
        if (this.b) {
            i = ((d) xz7Var).currentAccount;
            z8c.h(i).t();
            xz7Var.O0 = (byte) 0;
            xz7Var.V1();
            ViewGroup[] viewGroupArr = xz7Var.a0;
            if (viewGroupArr != null && viewGroupArr[0].getVisibility() == 0) {
                xz7Var.Z[0].requestFocus();
                gm.E3(xz7Var.Z[0]);
                return;
            }
            return;
        }
        xz7Var.Q1(true, false);
        if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            xz7Var.D1(true);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = jb6.G(intValue, "Seconds", new Object[0]);
            } else {
                G = jb6.G(intValue / 60, "Minutes", new Object[0]);
            }
            xz7Var.P1(jb6.M0(2131689472, null), jb6.a0("FloodWaitTime", null, 2131750618, G));
        } else {
            xz7Var.P1(jb6.M0(2131689472, null), tL_error.text);
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
        ai8 ai8Var = (ai8) this.c;
        q7c q7cVar = ai8Var.c;
        ArrayList arrayList = (ArrayList) this.d;
        if (this.b) {
            arrayList = ai8Var.e;
        }
        if (!arrayList.isEmpty()) {
            if (q7cVar.canScrollVertically(1)) {
                for (int i = 0; i < q7cVar.getChildCount(); i++) {
                    if (!(q7cVar.getChildAt(i) instanceof tk4)) {
                    }
                }
                return;
            }
            ai8Var.a(false);
        }
    }

    private final void e() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean[] zArr = (boolean[]) this.d;
        RectF rectF = ProfileActivity.e7;
        if (this.b && profileActivity.U4 == -1) {
            qn8 qn8Var = profileActivity.a0;
            if (qn8Var != null) {
                nn8 i = qn8.i(7, qn8Var.a);
                if (i != null && i.s) {
                    i.s = false;
                    qn8Var.invalidate();
                }
                if (zArr[0]) {
                    qn8 qn8Var2 = profileActivity.a0;
                    qn8Var2.G = true;
                    qn8Var2.o(7, false);
                    profileActivity.a0.o(9, true);
                    qn8 qn8Var3 = profileActivity.a0;
                    if (qn8Var3.G) {
                        qn8Var3.G = false;
                        qn8Var3.d();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        profileActivity.i4();
        lq8 lq8Var = profileActivity.d;
        if (lq8Var != null) {
            lq8Var.f();
        }
    }

    private final void f() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl6.f():void");
    }

    private final void g() {
        ch9 ch9Var = (ch9) this.c;
        kk9 kk9Var = (kk9) this.d;
        boolean z = this.b;
        boolean z2 = !z;
        mk9 mk9Var = kk9Var.w;
        Iterator it = kk9Var.I.iterator();
        while (it.hasNext()) {
            TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) it.next();
            nk9 m = mk9Var.m(pagetablecell);
            boolean z3 = true;
            if (m != null) {
                if (m.b != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m.a.getText());
                    if (spannableStringBuilder.length() <= 0 || (zk9.q(0, spannableStringBuilder.length(), spannableStringBuilder) & 1) == 0) {
                        z3 = false;
                    }
                    fhb.l(m.b, z2);
                    if (!z) {
                        if (spannableStringBuilder.length() > 0) {
                            zk9.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, true, null);
                        }
                    } else if (z3) {
                        zk9.o(spannableStringBuilder, 0, spannableStringBuilder.length(), 1, false, null);
                    }
                    fhb.d(m.b, spannableStringBuilder);
                    m.b(m.b);
                }
            } else {
                boolean z4 = true;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(fhb.h(pagetablecell));
                if (spannableStringBuilder2.length() <= 0 || (zk9.q(0, spannableStringBuilder2.length(), spannableStringBuilder2) & 1) == 0) {
                    z4 = false;
                }
                fhb.l(pagetablecell, z2);
                if (!z) {
                    if (spannableStringBuilder2.length() > 0) {
                        zk9.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, true, null);
                    }
                } else if (z4) {
                    zk9.o(spannableStringBuilder2, 0, spannableStringBuilder2.length(), 1, false, null);
                }
                fhb.d(pagetablecell, spannableStringBuilder2);
            }
        }
        mk9Var.invalidate();
        kg9 kg9Var = kk9Var.F;
        if (kg9Var != null && kk9Var.a != null) {
            kg9Var.a();
        }
        ch9Var.I2();
    }

    private final void h() {
        bh9 bh9Var = (bh9) this.d;
        bh9Var.f.k3(true);
        ph9.k((d) this.c, this.b, new mh9(bh9Var, (byte) 2));
    }

    private final void i() {
        Size size;
        int i;
        boolean z;
        km9 km9Var = (km9) this.c;
        boolean z2 = this.b;
        sl9 sl9Var = (sl9) this.d;
        if (!km9Var.f) {
            return;
        }
        km9Var.F = z2;
        if (z2) {
            size = km9Var.c;
        } else {
            size = km9Var.b;
        }
        km9Var.a = size;
        if (z2) {
            i = km9Var.l;
        } else {
            i = km9Var.k;
        }
        km9Var.j = i;
        if (z2) {
            z = km9Var.o;
        } else {
            z = km9Var.n;
        }
        km9Var.m = z;
        um9 um9Var = km9Var.N;
        if (um9Var != null) {
            um9Var.c = size;
            um9Var.d = i;
            um9Var.v();
            um9Var.B = false;
            um9Var.A = 0L;
        }
        km9Var.Q = -1L;
        km9Var.v0 = sl9Var;
        fm9 fm9Var = km9Var.i;
        fm9Var.b("GL dual input selected: input=" + (z2 ? 1 : 0));
    }

    private final void j() {
        int i;
        String str;
        long cameraFlipElapsedMs;
        yl9 yl9Var = (yl9) this.d;
        un9 un9Var = (un9) ((et8) this.c).b;
        int i2 = un9Var.a0;
        if (i2 != 7 && i2 != 8 && i2 != 9 && i2 != 10) {
            nn9 nn9Var = yl9Var.a;
            pn9 pn9Var = yl9Var.c;
            on9 on9Var = yl9Var.b;
            un9Var.s = nn9Var;
            un9Var.t = on9Var;
            un9Var.u = pn9Var;
            un9Var.v = yl9Var.e;
            if (nn9Var == nn9.a) {
                if (un9Var.f != null) {
                    i = 3;
                }
                i = 1;
            } else {
                if (yl9Var.f) {
                    i = 2;
                }
                i = 1;
            }
            un9Var.b0 = i;
            un9Var.n();
            fm9 fm9Var = un9Var.m;
            StringBuilder sb = new StringBuilder("camera configured: facing=");
            sb.append(nn9Var);
            sb.append(", mode=");
            sb.append(on9Var);
            sb.append(", recording=");
            sb.append(yl9Var.d);
            sb.append(", fps=");
            sb.append((int) pn9Var.a);
            sb.append(", maxZoom=");
            sb.append(un9Var.v);
            sb.append(", flash=");
            int i3 = un9Var.b0;
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
            fm9Var.b(sb.toString());
            if (!z && !un9Var.y) {
                return;
            }
            un9Var.y = false;
            q qVar = (q) un9Var.d.a;
            qVar.r0 = true;
            StringBuilder sb2 = new StringBuilder("RoundVideo camera flip session ready: facing=");
            sb2.append(nn9Var);
            sb2.append(", elapsedMs=");
            cameraFlipElapsedMs = qVar.getCameraFlipElapsedMs();
            sb2.append(cameraFlipElapsedMs);
            fc4.b(sb2.toString());
            qVar.q();
            un9Var.o();
        }
    }

    private final void k() {
        ud5 ud5Var = (ud5) this.c;
        il9 il9Var = (il9) this.d;
        if (this.b) {
            oc7.r1(ud5Var.a).l0(true);
            il9Var.run();
        } else {
            d S = LaunchActivity.S();
            if (S == null) {
                return;
            }
            S.presentFragment(new PremiumPreviewFragment(0, PremiumPreviewFragment.p0(3)));
        }
        ud5Var.dismiss();
    }

    private final void l() {
        bu5 bu5Var = (bu5) this.d;
        ((Runnable) this.c).run();
        if (this.b) {
            bu5Var.u();
        }
    }

    private final void m() {
        ((lf2) this.c).a(Boolean.valueOf(this.b), (String) this.d);
    }

    private final void n() {
        ((jac) this.c).a(Boolean.valueOf(this.b), (String) this.d);
    }

    private final void o() {
        ((fv4) this.c).a(Boolean.valueOf(this.b), (String) this.d);
    }

    private final void p() {
        ((TwoStepVerificationActivity) this.c).n0((byte[]) this.d, this.b);
    }

    private final void q() {
        ((VoIPService) this.c).lambda$startConferenceGroupCall$55((ArrayList) this.d, this.b);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl6.run():void");
    }

    public yl6(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }
}
