package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.nio.ByteBuffer;
import java.util.ArrayList;
public final class sf7 extends uh0 implements Handler.Callback {
    public final k1f K;
    public final c74 L;
    public final Handler M;
    public final pf7 N;
    public iwe O;
    public boolean P;
    public boolean Q;
    public long R;
    public nf7 S;
    public long T;

    public sf7(c74 c74Var, Looper looper) {
        super(5);
        Handler handler;
        k1f k1fVar = k1f.d;
        this.L = c74Var;
        if (looper == null) {
            handler = null;
        } else {
            String str = hac.a;
            handler = new Handler(looper, this);
        }
        this.M = handler;
        this.K = k1fVar;
        this.N = new pf7();
        this.T = -9223372036854775807L;
    }

    @Override
    public final void B(long r12, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf7.B(long, long):void");
    }

    @Override
    public final int G(go4 go4Var) {
        int i;
        if (this.K.n(go4Var)) {
            if (go4Var.X == 0) {
                i = 4;
            } else {
                i = 2;
            }
            return kt6.a(i, 0, 0, 0);
        }
        return kt6.a(0, 0, 0, 0);
    }

    public final void K(nf7 nf7Var, ArrayList arrayList) {
        int i = 0;
        while (true) {
            lf7[] lf7VarArr = nf7Var.a;
            if (i < lf7VarArr.length) {
                go4 a = lf7VarArr[i].a();
                if (a != null) {
                    k1f k1fVar = this.K;
                    if (k1fVar.n(a)) {
                        iwe l = k1fVar.l(a);
                        byte[] c = lf7VarArr[i].c();
                        c.getClass();
                        pf7 pf7Var = this.N;
                        pf7Var.clear();
                        pf7Var.c(c.length);
                        ByteBuffer byteBuffer = pf7Var.c;
                        String str = hac.a;
                        byteBuffer.put(c);
                        pf7Var.d();
                        nf7 a2 = l.a(pf7Var);
                        if (a2 != null) {
                            K(a2, arrayList);
                        }
                        i++;
                    }
                }
                arrayList.add(lf7VarArr[i]);
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
        jte.p(z);
        if (this.T != -9223372036854775807L) {
            z2 = true;
        }
        jte.p(z2);
        return j - this.T;
    }

    public final void M(nf7 nf7Var) {
        c74 c74Var = this.L;
        h74 h74Var = c74Var.a;
        jt6 jt6Var = h74Var.o0;
        a86 a86Var = h74Var.m;
        ht6 a = jt6Var.a();
        int i = 0;
        while (true) {
            lf7[] lf7VarArr = nf7Var.a;
            if (i >= lf7VarArr.length) {
                break;
            }
            lf7VarArr[i].b(a);
            i++;
        }
        h74Var.o0 = new jt6(a);
        jt6 S0 = h74Var.S0();
        if (!S0.equals(h74Var.Q)) {
            h74Var.Q = S0;
            a86Var.c(14, new yu3(c74Var, (byte) 12));
        }
        a86Var.c(28, new yu3(nf7Var, (byte) 13));
        a86Var.b();
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            M((nf7) message.obj);
            return true;
        }
        rjb.h();
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
    public final void y(go4[] go4VarArr, long j, long j2, rz6 rz6Var) {
        this.O = this.K.l(go4VarArr[0]);
        nf7 nf7Var = this.S;
        if (nf7Var != null) {
            long j3 = nf7Var.b;
            long j4 = (this.T + j3) - j2;
            if (j3 != j4) {
                nf7Var = new nf7(j4, nf7Var.a);
            }
            this.S = nf7Var;
        }
        this.T = j2;
    }
}
