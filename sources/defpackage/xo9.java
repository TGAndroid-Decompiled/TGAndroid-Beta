package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.Components.q;
public final class xo9 implements Runnable {
    public final byte a;
    public final jp9 b;
    public final long c;

    public xo9(jp9 jp9Var, long j, byte b) {
        this.a = b;
        this.b = jp9Var;
        this.c = j;
    }

    @Override
    public final void run() {
        boolean z;
        long j;
        zs6 zs6Var;
        ?? r3;
        char c;
        bt6 bt6Var;
        File file;
        long j2;
        long j3;
        nr1 nr1Var;
        qgc qgcVar;
        ys6 ys6Var;
        switch (this.a) {
            case 0:
                jp9 jp9Var = this.b;
                long j4 = this.c;
                if (jp9Var.a0 == 6) {
                    jp9Var.I = j4;
                    jp9Var.O = 0L;
                    jp9Var.K = 0L;
                    jp9Var.L = j4;
                    jp9Var.x(2);
                    jp9Var.l.V(jp9Var.U, jp9Var.I * 1000, jp9Var.r);
                    return;
                }
                return;
            default:
                jp9 jp9Var2 = this.b;
                long j5 = this.c;
                if (jp9Var2.a0 == 4) {
                    jp9Var2.O = j5;
                    long min = Math.min(jp9Var2.q, j5);
                    jp9Var2.I = min;
                    jp9Var2.K = 0L;
                    jp9Var2.L = min;
                    jp9Var2.b.setSurfaceTextureListener(null);
                    jp9Var2.b.setTransform(jp9Var2.h);
                    s64 a = new f64(jp9Var2.a).a();
                    jp9Var2.W = a;
                    a.s1(jp9Var2.b);
                    s64 s64Var = jp9Var2.W;
                    Uri fromFile = Uri.fromFile(jp9Var2.V);
                    us6 us6Var = new us6();
                    xs6 xs6Var = new xs6();
                    List list = Collections.EMPTY_LIST;
                    no5 no5Var = po5.b;
                    j99 j99Var = j99.e;
                    zs6 zs6Var2 = new zs6();
                    ct6 ct6Var = ct6.d;
                    if (xs6Var.b != null && xs6Var.a == null) {
                        z = false;
                    } else {
                        z = true;
                    }
                    yve.p(z);
                    if (fromFile != null) {
                        if (xs6Var.a != null) {
                            ys6Var = new ys6(xs6Var);
                        } else {
                            ys6Var = null;
                        }
                        j = 0;
                        zs6Var = zs6Var2;
                        r3 = 0;
                        c = 2;
                        bt6Var = new bt6(fromFile, null, ys6Var, null, list, null, j99Var, -9223372036854775807L);
                    } else {
                        j = 0;
                        zs6Var = zs6Var2;
                        r3 = 0;
                        c = 2;
                        bt6Var = null;
                    }
                    s64Var.q0(new ft6("", new vs6(us6Var), bt6Var, new at6(zs6Var), nt6.M, ct6Var));
                    jp9Var2.W.n0(r3);
                    jp9Var2.W.R(1.0f);
                    jp9Var2.W.y(jp9Var2.Z);
                    jp9Var2.W.a();
                    jp9Var2.W.k1(jp9Var2.K);
                    jp9Var2.m.b("preview player prepared: durationMs=" + jp9Var2.I + ", trim=" + jp9Var2.K + ".." + jp9Var2.L);
                    jp9Var2.x(5);
                    kj4 kj4Var = jp9Var2.d;
                    long j6 = jp9Var2.I;
                    long j7 = jp9Var2.K;
                    long j8 = jp9Var2.L;
                    ((q) kj4Var.b).x.setProgress(((float) j6) / 60000.0f);
                    q qVar = (q) kj4Var.b;
                    qVar.l0 = r3;
                    qVar.J.setAlpha(0.0f);
                    q qVar2 = (q) kj4Var.b;
                    if (qVar2.W == null) {
                        jp9 jp9Var3 = qVar2.Q;
                        if (jp9Var3 == null) {
                            file = null;
                        } else {
                            jp9.v();
                            file = jp9Var3.V;
                        }
                        if (file != null) {
                            q qVar3 = (q) kj4Var.b;
                            qVar3.V = qVar3.i(file, j6, null);
                            q qVar4 = (q) kj4Var.b;
                            oec oecVar = qVar4.V;
                            char c2 = r3;
                            File file2 = file;
                            if (j7 > j) {
                                j2 = j7;
                            } else {
                                j2 = -1;
                            }
                            oecVar.a = j2;
                            if (j8 < j6) {
                                j3 = j8;
                            } else {
                                j3 = -1;
                            }
                            oecVar.b = j3;
                            jn7 f = jn7.f(qVar4.h);
                            Integer valueOf = Integer.valueOf(((q) kj4Var.b).n);
                            oec oecVar2 = ((q) kj4Var.b).V;
                            String absolutePath = file2.getAbsolutePath();
                            ArrayList arrayList = new ArrayList();
                            Object[] objArr = new Object[4];
                            objArr[c2] = valueOf;
                            objArr[1] = oecVar2;
                            objArr[c] = absolutePath;
                            objArr[3] = arrayList;
                            f.k(163, objArr);
                            float max = (float) Math.max(1L, j6);
                            float f2 = ((float) j7) / max;
                            float f3 = ((float) j8) / max;
                            br5 br5Var = ((q) kj4Var.b).b;
                            if (br5Var != null && (nr1Var = ((el1) br5Var).b.a0) != null && (qgcVar = nr1Var.g1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f2));
                                qgcVar.b = max2;
                                qgcVar.c = Math.max(max2, Math.min(1.0f, f3));
                                qgcVar.invalidate();
                            }
                        }
                    }
                    jp9Var2.r();
                    return;
                }
                return;
        }
    }
}
