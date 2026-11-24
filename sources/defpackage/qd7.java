package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public final class qd7 extends ug0 implements Handler.Callback {
    public final ize K;
    public final t54 L;
    public final Handler M;
    public final nd7 N;
    public fue O;
    public boolean P;
    public boolean Q;
    public long R;
    public ld7 S;
    public long T;

    public qd7(t54 t54Var, Looper looper) {
        super(5);
        Handler handler;
        ize izeVar = ize.d;
        this.L = t54Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = g8c.a;
            handler = new Handler(looper, this);
        }
        this.M = handler;
        this.K = izeVar;
        this.N = new nd7();
        this.T = -9223372036854775807L;
    }

    @Override
    public final void B(long r12, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qd7.B(long, long):void");
    }

    @Override
    public final int G(fm4 fm4Var) {
        int i;
        if (this.K.j(fm4Var)) {
            if (fm4Var.X == 0) {
                i = 4;
            } else {
                i = 2;
            }
            return ls6.a(i, 0, 0, 0);
        }
        return ls6.a(0, 0, 0, 0);
    }

    public final void K(ld7 ld7Var, ArrayList arrayList) {
        int i = 0;
        while (true) {
            jd7[] jd7VarArr = ld7Var.a;
            if (i < jd7VarArr.length) {
                fm4 a = jd7VarArr[i].a();
                if (a != null) {
                    ize izeVar = this.K;
                    if (izeVar.j(a)) {
                        fue g = izeVar.g(a);
                        byte[] c = jd7VarArr[i].c();
                        c.getClass();
                        nd7 nd7Var = this.N;
                        nd7Var.clear();
                        nd7Var.c(c.length);
                        ByteBuffer byteBuffer = nd7Var.c;
                        String str = g8c.a;
                        byteBuffer.put(c);
                        nd7Var.d();
                        ld7 a2 = g.a(nd7Var);
                        if (a2 != null) {
                            K(a2, arrayList);
                        }
                        i++;
                    }
                }
                arrayList.add(jd7VarArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final long L(long j) {
        boolean z;
        boolean z2 = false;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        if (this.T != -9223372036854775807L) {
            z2 = true;
        }
        gre.p(z2);
        return j - this.T;
    }

    public final void M(ld7 ld7Var) {
        t54 t54Var = this.L;
        y54 y54Var = t54Var.a;
        jr6 jr6Var = y54Var.o0;
        a66 a66Var = y54Var.m;
        hr6 a = jr6Var.a();
        int i = 0;
        while (true) {
            jd7[] jd7VarArr = ld7Var.a;
            if (i >= jd7VarArr.length) {
                break;
            }
            jd7VarArr[i].b(a);
            i++;
        }
        y54Var.o0 = new jr6(a);
        jr6 S0 = y54Var.S0();
        if (!S0.equals(y54Var.Q)) {
            y54Var.Q = S0;
            a66Var.c(14, new kx3(t54Var, (byte) 9));
        }
        a66Var.c(28, new kx3(ld7Var, (byte) 10));
        a66Var.b();
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            M((ld7) message.obj);
            return true;
        }
        sdb.a();
        return false;
    }

    @Override
    public final String l() {
        return "MetadataRenderer";
    }

    @Override
    public final boolean n() {
        return this.Q;
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final void q() {
        this.S = null;
        this.O = null;
        this.T = -9223372036854775807L;
    }

    @Override
    public final void s(long j, boolean z, boolean z2) {
        this.S = null;
        this.P = false;
        this.Q = false;
    }

    @Override
    public final void y(fm4[] fm4VarArr, long j, long j2, rx6 rx6Var) {
        this.O = this.K.g(fm4VarArr[0]);
        ld7 ld7Var = this.S;
        if (ld7Var != null) {
            long j3 = ld7Var.b;
            long j4 = (this.T + j3) - j2;
            if (j3 != j4) {
                ld7Var = new ld7(j4, ld7Var.a);
            }
            this.S = ld7Var;
        }
        this.T = j2;
    }
}
