package defpackage;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.nio.charset.Charset;
public final class g6e implements f69, k6a {
    public final byte a;
    public Object b;

    public g6e(lje ljeVar) {
        this.a = (byte) 2;
        Charset charset = foe.a;
        this.b = ljeVar;
        ljeVar.a = this;
    }

    @Override
    public final void E(d5a d5aVar, boolean z) {
        xhf xhfVar = new xhf(new ab8(4));
        gl2 gl2Var = (gl2) this.b;
        gl2.S(gl2Var, xhfVar);
        mhf mhfVar = (mhf) gl2Var.e;
        fre.h(mhfVar);
        mhfVar.a((ed1) d5aVar);
    }

    @Override
    public final void F(d5a d5aVar, int i) {
        ed1 ed1Var = (ed1) d5aVar;
        ab8 ab8Var = new ab8(8);
        ab8Var.b = Integer.valueOf(i);
        xhf xhfVar = new xhf(ab8Var);
        gl2 gl2Var = (gl2) this.b;
        gl2.S(gl2Var, xhfVar);
        gl2Var.U();
    }

    @Override
    public final void K(d5a d5aVar, int i) {
        ed1 ed1Var = (ed1) d5aVar;
        ab8 ab8Var = new ab8(5);
        ab8Var.b = Integer.valueOf(i);
        xhf xhfVar = new xhf(ab8Var);
        gl2 gl2Var = (gl2) this.b;
        gl2.S(gl2Var, xhfVar);
        gl2Var.U();
    }

    @Override
    public final void R(d5a d5aVar, String str) {
        xhf xhfVar = new xhf(new ab8(7));
        gl2 gl2Var = (gl2) this.b;
        gl2.S(gl2Var, xhfVar);
        mhf mhfVar = (mhf) gl2Var.e;
        fre.h(mhfVar);
        mhfVar.a((ed1) d5aVar);
        mhf mhfVar2 = (mhf) gl2Var.e;
        fre.h(mhfVar2);
        String str2 = mhfVar2.k;
        if (str2 == null) {
            mhfVar2.k = str;
        } else if (!TextUtils.equals(str, str2)) {
            mhfVar2.b(4);
        }
    }

    @Override
    public final void T(d5a d5aVar, String str) {
        xhf xhfVar = new xhf(new ab8(4));
        gl2 gl2Var = (gl2) this.b;
        gl2.S(gl2Var, xhfVar);
        mhf mhfVar = (mhf) gl2Var.e;
        fre.h(mhfVar);
        mhfVar.a((ed1) d5aVar);
        mhf mhfVar2 = (mhf) gl2Var.e;
        fre.h(mhfVar2);
        String str2 = mhfVar2.k;
        if (str2 == null) {
            mhfVar2.k = str;
        } else if (!TextUtils.equals(str, str2)) {
            mhfVar2.b(4);
        }
    }

    public final void a(int i, Object obj, xwe xweVar) {
        lje ljeVar = (lje) this.b;
        qde qdeVar = (qde) obj;
        ljeVar.c(i, 2);
        int c = qdeVar.c();
        if (c == -1) {
            c = xweVar.zzb(qdeVar);
            qdeVar.b(c);
        }
        ljeVar.g(c);
        xweVar.d(qdeVar, ljeVar.a);
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                pp5 pp5Var = new pp5((TaskCompletionSource) obj2, (byte) 0);
                ho hoVar = new ho(new jp2(-1, -1, 0, true), false);
                hoVar.c = false;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i = qgd.a;
                obtain.writeStrongBinder(pp5Var);
                qgd.b(obtain, (h03) this.b);
                qgd.b(obtain, hoVar);
                ((ih5) ((kh5) ((zj5) obj).k())).a(obtain, 6);
                return;
            default:
                cse cseVar = new cse((TaskCompletionSource) obj2, (byte) 2);
                n7d n7dVar = (n7d) ((e5f) obj).k();
                Parcel R = n7dVar.R();
                jgd.d(R, cseVar);
                R.writeStringArray((String[]) this.b);
                n7dVar.W(R, 7);
                return;
        }
    }

    public final void b(int i, sie sieVar) {
        lje ljeVar = (lje) this.b;
        ljeVar.c(i, 2);
        ljeVar.g(sieVar.i());
        ljeVar.k(sieVar.b, sieVar.m(), sieVar.i());
    }

    public final void c(int i, Object obj, xwe xweVar) {
        lje ljeVar = (lje) this.b;
        ljeVar.c(i, 3);
        xweVar.d((qde) obj, ljeVar.a);
        ljeVar.c(i, 4);
    }

    @Override
    public final void n(d5a d5aVar, int i) {
        boolean z;
        ed1 ed1Var = (ed1) d5aVar;
        ab8 ab8Var = new ab8(9);
        ab8Var.b = Integer.valueOf(i);
        gl2 gl2Var = (gl2) this.b;
        if (((p6d) gl2Var.c).c == 2) {
            z = true;
        } else {
            z = false;
        }
        ab8Var.c = Boolean.valueOf(z);
        gl2.S(gl2Var, new xhf(ab8Var));
        gl2Var.U();
    }

    @Override
    public final void p(d5a d5aVar) {
        boolean z;
        ed1 ed1Var = (ed1) d5aVar;
        ab8 ab8Var = new ab8(2);
        gl2 gl2Var = (gl2) this.b;
        if (((p6d) gl2Var.c).c == 2) {
            z = true;
        } else {
            z = false;
        }
        ab8Var.c = Boolean.valueOf(z);
        gl2.S(gl2Var, new xhf(ab8Var));
        mhf mhfVar = (mhf) gl2Var.e;
        fre.h(mhfVar);
        mhfVar.a(ed1Var);
        ed1Var.l = (e6e) gl2Var.f;
    }

    @Override
    public final void q(d5a d5aVar, int i) {
        ab8 ab8Var = new ab8(6);
        ab8Var.b = Integer.valueOf(i);
        xhf xhfVar = new xhf(ab8Var);
        gl2 gl2Var = (gl2) this.b;
        gl2.S(gl2Var, xhfVar);
        mhf mhfVar = (mhf) gl2Var.e;
        fre.h(mhfVar);
        mhfVar.a((ed1) d5aVar);
    }

    @Override
    public final void z(d5a d5aVar) {
        ed1 ed1Var = (ed1) d5aVar;
    }

    public g6e(u84 u84Var, String[] strArr) {
        this.a = (byte) 1;
        this.b = strArr;
    }

    public g6e(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public g6e() {
        this.a = (byte) 3;
    }
}
