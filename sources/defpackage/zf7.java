package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public final class zf7 extends vg0 implements Handler.Callback {
    public final z3f K;
    public final n64 L;
    public final Handler M;
    public final wf7 N;
    public yye O;
    public boolean P;
    public boolean Q;
    public long R;
    public uf7 S;
    public long T;

    public zf7(n64 n64Var, Looper looper) {
        super(5);
        Handler handler;
        z3f z3fVar = z3f.d;
        this.L = n64Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = gcc.a;
            handler = new Handler(looper, this);
        }
        this.M = handler;
        this.K = z3fVar;
        this.N = new wf7();
        this.T = -9223372036854775807L;
    }

    @Override
    public final void B(long r12, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zf7.B(long, long):void");
    }

    @Override
    public final int G(ko4 ko4Var) {
        int i;
        if (this.K.o(ko4Var)) {
            if (ko4Var.X == 0) {
                i = 4;
            } else {
                i = 2;
            }
            return qu6.a(i, 0, 0, 0);
        }
        return qu6.a(0, 0, 0, 0);
    }

    public final void K(uf7 uf7Var, ArrayList arrayList) {
        int i = 0;
        while (true) {
            sf7[] sf7VarArr = uf7Var.a;
            if (i < sf7VarArr.length) {
                ko4 a = sf7VarArr[i].a();
                if (a != null) {
                    z3f z3fVar = this.K;
                    if (z3fVar.o(a)) {
                        yye k = z3fVar.k(a);
                        byte[] c = sf7VarArr[i].c();
                        c.getClass();
                        wf7 wf7Var = this.N;
                        wf7Var.clear();
                        wf7Var.c(c.length);
                        ByteBuffer byteBuffer = wf7Var.c;
                        String str = gcc.a;
                        byteBuffer.put(c);
                        wf7Var.d();
                        uf7 a2 = k.a(wf7Var);
                        if (a2 != null) {
                            K(a2, arrayList);
                        }
                        i++;
                    }
                }
                arrayList.add(sf7VarArr[i]);
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
        yve.p(z);
        if (this.T != -9223372036854775807L) {
            z2 = true;
        }
        yve.p(z2);
        return j - this.T;
    }

    public final void M(uf7 uf7Var) {
        n64 n64Var = this.L;
        s64 s64Var = n64Var.a;
        nt6 nt6Var = s64Var.o0;
        e86 e86Var = s64Var.m;
        lt6 a = nt6Var.a();
        int i = 0;
        while (true) {
            sf7[] sf7VarArr = uf7Var.a;
            if (i >= sf7VarArr.length) {
                break;
            }
            sf7VarArr[i].b(a);
            i++;
        }
        s64Var.o0 = new nt6(a);
        nt6 S0 = s64Var.S0();
        if (!S0.equals(s64Var.Q)) {
            s64Var.Q = S0;
            e86Var.c(14, new lu3(n64Var, (byte) 11));
        }
        e86Var.c(28, new lu3(uf7Var, (byte) 12));
        e86Var.b();
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            M((uf7) message.obj);
            return true;
        }
        grb.g();
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
    public final void y(ko4[] ko4VarArr, long j, long j2, vz6 vz6Var) {
        this.O = this.K.k(ko4VarArr[0]);
        uf7 uf7Var = this.S;
        if (uf7Var != null) {
            long j3 = uf7Var.b;
            long j4 = (this.T + j3) - j2;
            if (j3 != j4) {
                uf7Var = new uf7(j4, uf7Var.a);
            }
            this.S = uf7Var;
        }
        this.T = j2;
    }
}
