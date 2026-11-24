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
public final class zi9 extends mg9 implements fwc {
    public static final AtomicInteger t0 = new AtomicInteger();
    public final TL_iv.pageBlockEmbed X;
    public bwc Y;
    public final boolean Z;
    public int a0;
    public final Path b0;
    public final float[] c0;
    public final int d0;
    public gwc e0;
    public boolean f0;
    public long g0;
    public boolean h0;
    public final sr8 i0;
    public int j0;
    public int k0;
    public String l0;
    public rwc m0;
    public pib[] n0;
    public boolean o0;
    public long p0;
    public boolean q0;
    public boolean r0;
    public float s0;

    public zi9(defpackage.rh9 r4, android.graphics.Rect r5, int r6, org.telegram.tgnet.tl.TL_iv.pageBlockEmbed r7, boolean r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi9.<init>(rh9, android.graphics.Rect, int, org.telegram.tgnet.tl.TL_iv$pageBlockEmbed, boolean):void");
    }

    public static int j0() {
        int i;
        int i2 = gba.U0;
        if (i2 >= 15) {
            i = gl.L(2.0f);
        } else if (i2 >= 11) {
            i = gl.L(1.0f);
        } else {
            i = 0;
        }
        return (gl.L(9.0f) + i) - gl.L(2.0f);
    }

    public static float l0(int i) {
        return (float) Math.ceil((i / gl.p) - 0.01f);
    }

    public static int t0(int i, boolean z) {
        int i2;
        float f = 6.0f;
        int L = gl.L(6.0f) + i;
        if (gba.U0 < 10) {
            f = 4.0f;
        }
        int L2 = L + (gl.L(f) << 1);
        if (z) {
            i2 = gl.L(20.0f);
        } else {
            i2 = 0;
        }
        return gl.L(4.0f) + L2 + i2;
    }

    @Override
    public final int I() {
        Rect rect = this.b;
        return rect.top + this.j0 + rect.bottom;
    }

    @Override
    public final pib[] L() {
        return this.n0;
    }

    @Override
    public final boolean Q() {
        gwc gwcVar = this.e0;
        if (gwcVar != null && this.f0 && gwcVar.w && (gwcVar.L & 3) != 2) {
            if (gwcVar.z || gwcVar.o()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void T() {
        bwc bwcVar = this.Y;
        TL_iv.pageBlockEmbed pageblockembed = this.X;
        if (bwcVar == null) {
            bwcVar = vvc.h(pageblockembed.url);
            this.Y = bwcVar;
        }
        if (bwcVar == null) {
            return;
        }
        if (this.e0 == null) {
            this.e0 = new gwc(this, gl.p);
        }
        svc svcVar = (svc) vvc.a.get(pageblockembed.url);
        if (svcVar != null) {
            ArrayList arrayList = svcVar.v;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            boolean z = false;
            if (vvc.p(arrayList) != this) {
                gwc gwcVar = this.e0;
                bwc bwcVar2 = this.Y;
                gwcVar.r();
                gwcVar.p = bwcVar2;
                if (bwcVar2 != null) {
                    z = true;
                }
                gwcVar.r = z;
                return;
            }
            zi9 zi9Var = svcVar.w;
            svcVar.w = this;
            if (zi9Var != null && zi9Var != this && zi9Var.f0 && zi9Var.e0 != null) {
                zi9Var.s0();
                gwc gwcVar2 = zi9Var.e0;
                bwc bwcVar3 = zi9Var.Y;
                gwcVar2.r();
                gwcVar2.p = bwcVar3;
                if (bwcVar3 != null) {
                    z = true;
                }
                gwcVar2.r = z;
                View view = zi9Var.W;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        r0();
    }

    @Override
    public final void V() {
        gwc gwcVar;
        if (this.e0 != null) {
            s0();
            this.e0.r();
            svc svcVar = (svc) vvc.a.get(this.X.url);
            if (svcVar != null) {
                ArrayList arrayList = svcVar.v;
                arrayList.remove(this);
                if (svcVar.w == this) {
                    zi9 p = vvc.p(arrayList);
                    svcVar.w = p;
                    if (p != null && !p.f0 && p.W != null && (gwcVar = p.e0) != null && p.Y != null) {
                        gwcVar.r();
                        p.r0();
                        p.W.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void W(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi9.W(android.graphics.Canvas):void");
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        svc svcVar;
        if (this.e0 != null && this.f0) {
            String str = this.X.url;
            if (vvc.m(str)) {
                svcVar = (svc) vvc.a.get(str);
            } else {
                svcVar = null;
            }
            if (svcVar == null || !svcVar.k) {
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
        gb2 gb2Var = this.a.E;
        if (gb2Var != null && gb2Var.eb != null) {
            try {
                gb2Var.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            gb2Var.eb.A(gb2Var, gb2Var.h1, gb2Var.i1);
        }
    }

    @Override
    public final void f(String str) {
        View view = this.W;
        if (view != null && Build.VERSION.SDK_INT >= 24) {
            kh0.k(view, str);
        }
    }

    @Override
    public final void g() {
        kwc d;
        rwc rwcVar;
        bwc bwcVar = this.Y;
        if (bwcVar == null) {
            d = null;
        } else {
            d = bwcVar.d();
        }
        if (d == null) {
            rwcVar = null;
        } else {
            rwcVar = d.g;
        }
        if (rwcVar != this.m0) {
            this.m0 = rwcVar;
            if (rwcVar == null) {
                this.n0 = null;
            } else {
                ArrayList arrayList = rwcVar.a;
                this.n0 = new pib[arrayList.size()];
                int i = 0;
                while (true) {
                    pib[] pibVarArr = this.n0;
                    if (i >= pibVarArr.length) {
                        break;
                    }
                    pibVarArr[i] = new kb9(this, (pwc) arrayList.get(i));
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

    public final boolean i0() {
        svc svcVar;
        boolean z;
        String str = this.X.url;
        bwc bwcVar = this.Y;
        ConcurrentHashMap concurrentHashMap = vvc.a;
        if (bwcVar != null && bwcVar.h > 0) {
            return bwcVar.k;
        }
        tvc tvcVar = null;
        if (vvc.m(str)) {
            svcVar = (svc) vvc.a.get(str);
        } else {
            svcVar = null;
        }
        if (svcVar != null) {
            tvcVar = (tvc) vvc.b.get(svcVar.a());
        }
        if (tvcVar != null) {
            synchronized (tvcVar) {
                if (!tvcVar.a.isEmpty() && ((int[]) tvcVar.a.get(0)).length > 2) {
                    if (((int[]) tvcVar.a.get(0))[2] != 0) {
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

    @Override
    public final void j() {
        kwc kwcVar;
        sr8 sr8Var = this.i0;
        gl.r(sr8Var);
        if (!this.h0) {
            z zVar = this.Y.e;
            if (zVar != null && (kwcVar = zVar.N) != null && (kwcVar.h || zVar.F)) {
                this.h0 = true;
                this.g0 = SystemClock.uptimeMillis();
                if (k0() != this.j0) {
                    q0("on screen, loaded", true);
                    return;
                }
                return;
            }
            gl.d3(sr8Var, 1500L);
        } else if (SystemClock.uptimeMillis() - this.g0 < 1500) {
            gl.d3(sr8Var, 200L);
        } else if (k0() != this.j0) {
            q0("on screen", true);
        }
    }

    public final int k0() {
        return vvc.c(this.X.url, this.Y, u0());
    }

    public final float m0() {
        return this.b.top + this.s0;
    }

    public final float n0() {
        return u0() + (this.b.left - this.k0);
    }

    public final void o0(int i, String str, String str2, boolean z) {
        long j;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (!w01.a) {
            return;
        }
        long j2 = -1;
        if (this.f0) {
            j = SystemClock.uptimeMillis() - this.g0;
        } else {
            j = -1;
        }
        gwc gwcVar = this.e0;
        if (gwcVar != null && gwcVar.s != 0) {
            j2 = SystemClock.uptimeMillis() - gwcVar.s;
        }
        StringBuilder sb = new StringBuilder("widget height ");
        sb.append(this.X.url.substring(10));
        sb.append(": ");
        sb.append(str);
        sb.append(", ");
        sb.append(Math.round(i / gl.p));
        sb.append(" (");
        sb.append(str2);
        sb.append(") -> ");
        sb.append(Math.round(this.j0 / gl.p));
        sb.append(" (");
        sb.append(this.l0);
        sb.append("), width ");
        sb.append(Math.round(u0() / gl.p));
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
            str5 = ug8.n(j, ", running ", " ms");
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
            str9 = ug8.n(j2, ", touched ", " ms ago");
        }
        de9.s(str9, sb);
    }

    public final void p0(String str) {
        if (this.W != null) {
            bwc bwcVar = this.Y;
            if ((bwcVar == null || bwcVar.h <= 0) && k0() != this.j0) {
                q0("on screen: ".concat(str), false);
                return;
            }
            return;
        }
        int k0 = k0();
        int i = this.j0;
        if (k0 == i) {
            return;
        }
        String str2 = this.l0;
        this.j0 = k0;
        this.l0 = vvc.j(this.X.url, this.Y, u0());
        o0(i, "away: ".concat(str), str2, false);
        rh9 rh9Var = this.a;
        rh9Var.P();
        k27 k27Var = rh9Var.b;
        if (k27Var != null) {
            k27Var.M1 = true;
        }
        this.o0 = true;
    }

    public final void q0(String str, boolean z) {
        boolean z2;
        int k0 = k0();
        int i = this.j0;
        boolean z3 = false;
        if (k0 != i) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str2 = this.l0;
        this.j0 = k0;
        this.l0 = vvc.j(this.X.url, this.Y, u0());
        rh9 rh9Var = this.a;
        if (z2) {
            o0(i, str, str2, z);
            rh9Var.P();
            if (z) {
                this.p0 = SystemClock.uptimeMillis();
                this.q0 = false;
            }
        }
        k27 k27Var = rh9Var.b;
        if (k27Var != null) {
            k27Var.M1 = true;
        }
        gb2 gb2Var = rh9Var.E;
        bb2 bb2Var = rh9Var.F;
        View view = this.W;
        if (view != null && gb2Var != null && bb2Var != null) {
            if (z2 && !i0() && (gb2Var.getParent() instanceof RecyclerView)) {
                View view2 = (View) gb2Var.getParent();
                if (gb2Var.getBottom() > view2.getPaddingTop() && gb2Var.getTop() < view2.getHeight() - view2.getPaddingBottom()) {
                    z3 = true;
                }
            }
            if (z) {
                bb2Var.G1(gb2Var, z3, z3);
            } else {
                bb2Var.x2(gb2Var, z3, z3);
            }
        } else if (view != null) {
            view.requestLayout();
        }
    }

    public final void r0() {
        boolean z;
        wjb wjbVar;
        k27 k27Var;
        kwc kwcVar;
        boolean z2 = true;
        this.f0 = true;
        this.g0 = SystemClock.uptimeMillis();
        z zVar = this.Y.e;
        if (zVar != null && (kwcVar = zVar.N) != null && (kwcVar.h || zVar.F)) {
            z = true;
        } else {
            z = false;
        }
        this.h0 = z;
        this.Y.l(u0());
        rh9 rh9Var = this.a;
        gb2 gb2Var = rh9Var.E;
        if (gb2Var != null) {
            wjbVar = gb2Var.getResourcesProvider();
        } else {
            wjbVar = null;
        }
        this.a0 = mwc.e(wjbVar, rh9Var.D());
        this.Y.j(mwc.a(wjbVar, rh9Var.D()));
        this.e0.b(this.Y);
        this.e0.q(true);
        svc svcVar = (svc) vvc.a.get(this.X.url);
        if (svcVar != null) {
            svcVar.u = this;
        }
        vvc.t(this.Y);
        if (!this.o0 || (k27Var = this.a.b) == null || !k27Var.M1) {
            z2 = false;
        }
        this.o0 = false;
        if (!z2 && k0() == this.j0) {
            return;
        }
        gl.c3(new k08((byte) 6, this, z2));
    }

    public final void s0() {
        if (this.f0) {
            this.f0 = false;
            gl.r(this.i0);
            this.e0.q(false);
            this.e0.r();
            bwc bwcVar = this.Y;
            if (bwcVar != null) {
                vvc.r(bwcVar);
            }
        }
    }

    public final int u0() {
        return this.c + (j0() << 1);
    }
}
