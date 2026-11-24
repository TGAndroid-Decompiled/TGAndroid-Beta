package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.utils.twidget.z;
public final class al9 extends qi9 implements gyc {
    public static final AtomicInteger t0 = new AtomicInteger();
    public final TL_iv.pageBlockEmbed X;
    public cyc Y;
    public final boolean Z;
    public int a0;
    public final Path b0;
    public final float[] c0;
    public final int d0;
    public hyc e0;
    public boolean f0;
    public long g0;
    public boolean h0;
    public final kf9 i0;
    public int j0;
    public int k0;
    public String l0;
    public syc m0;
    public qkb[] n0;
    public boolean o0;
    public long p0;
    public boolean q0;
    public boolean r0;
    public float s0;

    public al9(defpackage.uj9 r4, android.graphics.Rect r5, int r6, org.telegram.tgnet.tl.TL_iv.pageBlockEmbed r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al9.<init>(uj9, android.graphics.Rect, int, org.telegram.tgnet.tl.TL_iv$pageBlockEmbed, boolean):void");
    }

    public static int i0() {
        int i;
        int i2 = gda.U0;
        if (i2 >= 15) {
            i = gm.L(2.0f);
        } else if (i2 >= 11) {
            i = gm.L(1.0f);
        } else {
            i = 0;
        }
        return (gm.L(9.0f) + i) - gm.L(2.0f);
    }

    public static float k0(int i) {
        return (float) Math.ceil((i / gm.p) - 0.01f);
    }

    public static int s0(int i, boolean z) {
        int i2;
        float f = 6.0f;
        int L = gm.L(6.0f) + i;
        if (gda.U0 < 10) {
            f = 4.0f;
        }
        int L2 = L + (gm.L(f) << 1);
        if (z) {
            i2 = gm.L(20.0f);
        } else {
            i2 = 0;
        }
        return gm.L(4.0f) + L2 + i2;
    }

    @Override
    public final int H() {
        Rect rect = this.b;
        return rect.top + this.j0 + rect.bottom;
    }

    @Override
    public final qkb[] K() {
        return this.n0;
    }

    @Override
    public final boolean P() {
        hyc hycVar = this.e0;
        if (hycVar != null && this.f0 && hycVar.w && (hycVar.L & 3) != 2) {
            if (hycVar.z || hycVar.o()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void S() {
        cyc cycVar = this.Y;
        TL_iv.pageBlockEmbed pageblockembed = this.X;
        if (cycVar == null) {
            cycVar = wxc.h(pageblockembed.url);
            this.Y = cycVar;
        }
        if (cycVar == null) {
            return;
        }
        if (this.e0 == null) {
            this.e0 = new hyc(this, gm.p);
        }
        txc txcVar = (txc) wxc.a.get(pageblockembed.url);
        if (txcVar != null) {
            ArrayList arrayList = txcVar.x;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            boolean z = false;
            if (wxc.p(arrayList) != this) {
                hyc hycVar = this.e0;
                cyc cycVar2 = this.Y;
                hycVar.r();
                hycVar.p = cycVar2;
                if (cycVar2 != null) {
                    z = true;
                }
                hycVar.r = z;
                return;
            }
            al9 al9Var = txcVar.y;
            txcVar.y = this;
            if (al9Var != null && al9Var != this && al9Var.f0 && al9Var.e0 != null) {
                al9Var.r0();
                hyc hycVar2 = al9Var.e0;
                cyc cycVar3 = al9Var.Y;
                hycVar2.r();
                hycVar2.p = cycVar3;
                if (cycVar3 != null) {
                    z = true;
                }
                hycVar2.r = z;
                View view = al9Var.W;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        q0();
    }

    @Override
    public final void U() {
        hyc hycVar;
        if (this.e0 != null) {
            r0();
            this.e0.r();
            txc txcVar = (txc) wxc.a.get(this.X.url);
            if (txcVar != null) {
                ArrayList arrayList = txcVar.x;
                arrayList.remove(this);
                if (txcVar.y == this) {
                    al9 p = wxc.p(arrayList);
                    txcVar.y = p;
                    if (p != null && !p.f0 && p.W != null && (hycVar = p.e0) != null && p.Y != null) {
                        hycVar.r();
                        p.q0();
                        p.W.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void V(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al9.V(android.graphics.Canvas):void");
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        txc txcVar;
        if (this.e0 != null && this.f0) {
            String str = this.X.url;
            if (wxc.m(str)) {
                txcVar = (txc) wxc.a.get(str);
            } else {
                txcVar = null;
            }
            if (txcVar == null || !txcVar.k) {
                motionEvent.offsetLocation(this.k0, 0.0f);
                try {
                    return this.e0.n(motionEvent);
                } finally {
                    motionEvent.offsetLocation(-this.k0, 0.0f);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public final void d() {
        rc2 rc2Var = this.a.E;
        if (rc2Var != null && rc2Var.eb != null) {
            try {
                rc2Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            rc2Var.eb.u(rc2Var, rc2Var.h1, rc2Var.i1);
        }
    }

    @Override
    public final void f() {
        lyc d;
        syc sycVar;
        cyc cycVar = this.Y;
        if (cycVar == null) {
            d = null;
        } else {
            d = cycVar.d();
        }
        if (d == null) {
            sycVar = null;
        } else {
            sycVar = d.g;
        }
        if (sycVar != this.m0) {
            this.m0 = sycVar;
            if (sycVar == null) {
                this.n0 = null;
            } else {
                ArrayList arrayList = sycVar.a;
                this.n0 = new qkb[arrayList.size()];
                int i = 0;
                while (true) {
                    qkb[] qkbVarArr = this.n0;
                    if (i >= qkbVarArr.length) {
                        break;
                    }
                    qkbVarArr[i] = new kd9(this, (qyc) arrayList.get(i));
                    i++;
                }
            }
            this.a.P();
        }
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override
    public final void h() {
        kf9 kf9Var = this.i0;
        gm.r(kf9Var);
        if (!this.h0) {
            if (!this.Y.e()) {
                gm.d3(kf9Var, 1500L);
                return;
            }
            this.h0 = true;
            this.g0 = SystemClock.uptimeMillis();
            if (j0() != this.j0) {
                p0("on screen, loaded", true);
            }
        } else if (SystemClock.uptimeMillis() - this.g0 < 1500) {
            gm.d3(kf9Var, 200L);
        } else if (j0() != this.j0) {
            p0("on screen", true);
        }
    }

    public final boolean h0() {
        txc txcVar;
        boolean z;
        String str = this.X.url;
        cyc cycVar = this.Y;
        ConcurrentHashMap concurrentHashMap = wxc.a;
        if (cycVar != null && cycVar.h > 0) {
            return cycVar.k;
        }
        uxc uxcVar = null;
        if (wxc.m(str)) {
            txcVar = (txc) wxc.a.get(str);
        } else {
            txcVar = null;
        }
        if (txcVar != null) {
            uxcVar = (uxc) wxc.b.get(txcVar.a());
        }
        if (uxcVar != null) {
            synchronized (uxcVar) {
                if (!uxcVar.a.isEmpty() && ((int[]) uxcVar.a.get(0)).length > 2) {
                    if (((int[]) uxcVar.a.get(0))[2] != 0) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final int j0() {
        return wxc.c(this.X.url, this.Y, t0());
    }

    public final float l0() {
        return this.b.top + this.s0;
    }

    public final float m0() {
        return t0() + (this.b.left - this.k0);
    }

    public final void n0(int i, String str, String str2, boolean z) {
        long j;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (!e21.a) {
            return;
        }
        long j2 = -1;
        if (this.f0) {
            j = SystemClock.uptimeMillis() - this.g0;
        } else {
            j = -1;
        }
        hyc hycVar = this.e0;
        if (hycVar != null && hycVar.s != 0) {
            j2 = SystemClock.uptimeMillis() - hycVar.s;
        }
        StringBuilder sb = new StringBuilder("widget height ");
        sb.append(this.X.url.substring(10));
        sb.append(": ");
        sb.append(str);
        sb.append(", ");
        sb.append(Math.round(i / gm.p));
        sb.append(" (");
        sb.append(str2);
        sb.append(") -> ");
        sb.append(Math.round(this.j0 / gm.p));
        sb.append(" (");
        sb.append(this.l0);
        sb.append("), width ");
        sb.append(Math.round(t0() / gm.p));
        String str9 = "";
        if (!z) {
            str3 = "";
        } else {
            str3 = ", animated";
        }
        sb.append(str3);
        if (this.W != null) {
            str4 = ", on screen";
        } else {
            str4 = ", off screen";
        }
        sb.append(str4);
        if (j >= 0) {
            str5 = wi8.n(j, ", running ", " ms");
        } else {
            str5 = ", not running";
        }
        sb.append(str5);
        if (this.Y != null) {
            StringBuilder sb2 = new StringBuilder(", session ");
            sb2.append(this.Y.p);
            if (this.Y.f == null) {
                str7 = "";
            } else {
                str7 = " (snapshot)";
            }
            sb2.append(str7);
            z zVar = this.Y.e;
            if (zVar != null && zVar.I) {
                str8 = "";
            } else {
                str8 = ", scripts held";
            }
            sb2.append(str8);
            str6 = sb2.toString();
        } else {
            str6 = ", no widget yet";
        }
        sb.append(str6);
        if (j2 >= 0 && j2 < 5000) {
            str9 = wi8.n(j2, ", touched ", " ms ago");
        }
        hg9.r(str9, sb);
    }

    public final void o0(String str) {
        if (this.W != null) {
            cyc cycVar = this.Y;
            if ((cycVar == null || cycVar.h <= 0) && j0() != this.j0) {
                p0("on screen: ".concat(str), false);
                return;
            }
            return;
        }
        int j0 = j0();
        int i = this.j0;
        if (j0 == i) {
            return;
        }
        String str2 = this.l0;
        this.j0 = j0;
        this.l0 = wxc.j(this.X.url, this.Y, t0());
        n0(i, "away: ".concat(str), str2, false);
        uj9 uj9Var = this.a;
        uj9Var.P();
        k47 k47Var = uj9Var.b;
        if (k47Var != null) {
            k47Var.M1 = true;
        }
        this.o0 = true;
    }

    public final void p0(String str, boolean z) {
        boolean z2;
        int j0 = j0();
        int i = this.j0;
        boolean z3 = false;
        if (j0 != i) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str2 = this.l0;
        this.j0 = j0;
        this.l0 = wxc.j(this.X.url, this.Y, t0());
        uj9 uj9Var = this.a;
        if (z2) {
            n0(i, str, str2, z);
            uj9Var.P();
            if (z) {
                this.p0 = SystemClock.uptimeMillis();
                this.q0 = false;
            }
        }
        k47 k47Var = uj9Var.b;
        if (k47Var != null) {
            k47Var.M1 = true;
        }
        rc2 rc2Var = uj9Var.E;
        mc2 mc2Var = uj9Var.F;
        View view = this.W;
        if (view != null && rc2Var != null && mc2Var != null) {
            if (z2 && !h0() && (rc2Var.getParent() instanceof RecyclerView)) {
                View view2 = (View) rc2Var.getParent();
                if (rc2Var.getBottom() > view2.getPaddingTop() && rc2Var.getTop() < view2.getHeight() - view2.getPaddingBottom()) {
                    z3 = true;
                }
            }
            if (z) {
                mc2Var.u1(rc2Var, z3, z3);
            } else {
                mc2Var.l2(rc2Var, z3, z3);
            }
        } else if (view != null) {
            view.requestLayout();
        }
    }

    public final void q0() {
        ylb ylbVar;
        k47 k47Var;
        boolean z = true;
        this.f0 = true;
        this.g0 = SystemClock.uptimeMillis();
        this.h0 = this.Y.e();
        this.Y.m(t0());
        uj9 uj9Var = this.a;
        rc2 rc2Var = uj9Var.E;
        if (rc2Var != null) {
            ylbVar = rc2Var.getResourcesProvider();
        } else {
            ylbVar = null;
        }
        this.a0 = nyc.e(ylbVar, uj9Var.D());
        this.Y.k(nyc.a(ylbVar, uj9Var.D()));
        this.e0.b(this.Y);
        this.e0.q(true);
        txc txcVar = (txc) wxc.a.get(this.X.url);
        if (txcVar != null) {
            txcVar.w = this;
        }
        wxc.u(this.Y);
        if (!this.o0 || (k47Var = uj9Var.b) == null || !k47Var.M1) {
            z = false;
        }
        this.o0 = false;
        if (!z && j0() == this.j0) {
            return;
        }
        gm.c3(new n28((byte) 6, this, z));
    }

    public final void r0() {
        if (this.f0) {
            this.f0 = false;
            gm.r(this.i0);
            this.e0.q(false);
            this.e0.r();
            cyc cycVar = this.Y;
            if (cycVar != null) {
                wxc.r(cycVar);
            }
        }
    }

    @Override
    public final void setCursor(String str) {
        View view = this.W;
        if (view != null && Build.VERSION.SDK_INT >= 24) {
            ki0.k(view, str);
        }
    }

    public final int t0() {
        return this.c + (i0() << 1);
    }
}
