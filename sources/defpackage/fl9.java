package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.ui.Components.q;
public final class fl9 implements Runnable {
    public final byte a;
    public final ul9 b;
    public final long c;

    public fl9(ul9 ul9Var, long j, byte b) {
        this.a = b;
        this.b = ul9Var;
        this.c = j;
    }

    @Override
    public final void run() {
        boolean z;
        long j;
        vq6 vq6Var;
        ?? r3;
        char c;
        xq6 xq6Var;
        File file;
        long j2;
        long j3;
        ar1 ar1Var;
        scc sccVar;
        uq6 uq6Var;
        switch (this.a) {
            case 0:
                ul9 ul9Var = this.b;
                long j4 = this.c;
                if (ul9Var.a0 == 6) {
                    ul9Var.I = j4;
                    ul9Var.O = 0L;
                    ul9Var.K = 0L;
                    ul9Var.L = j4;
                    ul9Var.x(2);
                    ul9Var.l.V(ul9Var.U, ul9Var.I * 1000, ul9Var.r);
                    return;
                }
                return;
            default:
                ul9 ul9Var2 = this.b;
                long j5 = this.c;
                if (ul9Var2.a0 == 4) {
                    ul9Var2.O = j5;
                    long min = Math.min(ul9Var2.q, j5);
                    ul9Var2.I = min;
                    ul9Var2.K = 0L;
                    ul9Var2.L = min;
                    ul9Var2.b.setSurfaceTextureListener(null);
                    ul9Var2.b.setTransform(ul9Var2.h);
                    y54 a = new k54(ul9Var2.a).a();
                    ul9Var2.W = a;
                    a.s1(ul9Var2.b);
                    y54 y54Var = ul9Var2.W;
                    Uri fromFile = Uri.fromFile(ul9Var2.V);
                    qq6 qq6Var = new qq6();
                    tq6 tq6Var = new tq6();
                    List list = Collections.EMPTY_LIST;
                    km5 km5Var = mm5.b;
                    w59 w59Var = w59.e;
                    vq6 vq6Var2 = new vq6();
                    yq6 yq6Var = yq6.d;
                    if (tq6Var.b != null && tq6Var.a == null) {
                        z = false;
                    } else {
                        z = true;
                    }
                    gre.p(z);
                    if (fromFile != null) {
                        if (tq6Var.a != null) {
                            uq6Var = new uq6(tq6Var);
                        } else {
                            uq6Var = null;
                        }
                        j = 0;
                        vq6Var = vq6Var2;
                        r3 = 0;
                        c = 2;
                        xq6Var = new xq6(fromFile, null, uq6Var, null, list, null, w59Var, -9223372036854775807L);
                    } else {
                        j = 0;
                        vq6Var = vq6Var2;
                        r3 = 0;
                        c = 2;
                        xq6Var = null;
                    }
                    y54Var.q0(new br6("", new rq6(qq6Var), xq6Var, new wq6(vq6Var), jr6.M, yq6Var));
                    ul9Var2.W.n0(r3);
                    ul9Var2.W.R(1.0f);
                    ul9Var2.W.y(ul9Var2.Z);
                    ul9Var2.W.a();
                    ul9Var2.W.k1(ul9Var2.K);
                    ul9Var2.m.b("preview player prepared: durationMs=" + ul9Var2.I + ", trim=" + ul9Var2.K + ".." + ul9Var2.L);
                    ul9Var2.x(5);
                    gi3 gi3Var = ul9Var2.d;
                    long j6 = ul9Var2.I;
                    long j7 = ul9Var2.K;
                    long j8 = ul9Var2.L;
                    ((q) gi3Var.a).x.setProgress(((float) j6) / 60000.0f);
                    q qVar = (q) gi3Var.a;
                    qVar.l0 = r3;
                    qVar.J.setAlpha(0.0f);
                    q qVar2 = (q) gi3Var.a;
                    if (qVar2.W == null) {
                        ul9 ul9Var3 = qVar2.Q;
                        if (ul9Var3 == null) {
                            file = null;
                        } else {
                            ul9.v();
                            file = ul9Var3.V;
                        }
                        if (file != null) {
                            q qVar3 = (q) gi3Var.a;
                            qVar3.V = qVar3.i(file, j6, null);
                            q qVar4 = (q) gi3Var.a;
                            oac oacVar = qVar4.V;
                            char c2 = r3;
                            File file2 = file;
                            if (j7 > j) {
                                j2 = j7;
                            } else {
                                j2 = -1;
                            }
                            oacVar.a = j2;
                            if (j8 < j6) {
                                j3 = j8;
                            } else {
                                j3 = -1;
                            }
                            oacVar.b = j3;
                            kk7 f = kk7.f(qVar4.h);
                            Integer valueOf = Integer.valueOf(((q) gi3Var.a).n);
                            oac oacVar2 = ((q) gi3Var.a).V;
                            String absolutePath = file2.getAbsolutePath();
                            ArrayList arrayList = new ArrayList();
                            Object[] objArr = new Object[4];
                            objArr[c2] = valueOf;
                            objArr[1] = oacVar2;
                            objArr[c] = absolutePath;
                            objArr[3] = arrayList;
                            f.k(162, objArr);
                            float max = (float) Math.max(1L, j6);
                            float f2 = ((float) j7) / max;
                            float f3 = ((float) j8) / max;
                            yo5 yo5Var = ((q) gi3Var.a).b;
                            if (yo5Var != null && (ar1Var = ((yk1) yo5Var).b.a0) != null && (sccVar = ar1Var.g1) != null) {
                                float max2 = Math.max(0.0f, Math.min(1.0f, f2));
                                sccVar.b = max2;
                                sccVar.c = Math.max(max2, Math.min(1.0f, f3));
                                sccVar.invalidate();
                            }
                        }
                    }
                    ul9Var2.r();
                    return;
                }
                return;
        }
    }
}
