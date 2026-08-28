package i8;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
public abstract class a extends a7.a implements f0 {
    public a() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", 8);
    }

    @Override
    public final boolean H0(int i9, Parcel parcel, Parcel parcel2) {
        switch (i9) {
            case 2:
                w wVar = (w) p7.a.a(parcel, w.CREATOR);
                throw e2.c.p(parcel);
            case 3:
                s0 s0Var = (s0) p7.a.a(parcel, s0.CREATOR);
                throw e2.c.p(parcel);
            case 4:
                z zVar = (z) p7.a.a(parcel, z.CREATOR);
                throw e2.c.p(parcel);
            case 5:
                DataHolder dataHolder = (DataHolder) p7.a.a(parcel, DataHolder.CREATOR);
                throw e2.c.p(parcel);
            case 6:
                n nVar = (n) p7.a.a(parcel, n.CREATOR);
                throw e2.c.p(parcel);
            case 7:
                p7.a.b(parcel);
                n((v0) p7.a.a(parcel, v0.CREATOR));
                break;
            case 8:
                b0 b0Var = (b0) p7.a.a(parcel, b0.CREATOR);
                throw e2.c.p(parcel);
            case 9:
                c0 c0Var = (c0) p7.a.a(parcel, c0.CREATOR);
                throw e2.c.p(parcel);
            case 10:
                y yVar = (y) p7.a.a(parcel, y.CREATOR);
                throw e2.c.p(parcel);
            case 11:
                Status status = (Status) p7.a.a(parcel, Status.CREATOR);
                p7.a.b(parcel);
                x();
                break;
            case 12:
                w0 w0Var = (w0) p7.a.a(parcel, w0.CREATOR);
                throw e2.c.p(parcel);
            case 13:
                x xVar = (x) p7.a.a(parcel, x.CREATOR);
                throw e2.c.p(parcel);
            case 14:
                o0 o0Var = (o0) p7.a.a(parcel, o0.CREATOR);
                throw e2.c.p(parcel);
            case 15:
                i iVar = (i) p7.a.a(parcel, i.CREATOR);
                throw e2.c.p(parcel);
            case 16:
                i iVar2 = (i) p7.a.a(parcel, i.CREATOR);
                throw e2.c.p(parcel);
            case 17:
                q qVar = (q) p7.a.a(parcel, q.CREATOR);
                throw e2.c.p(parcel);
            case 18:
                r rVar = (r) p7.a.a(parcel, r.CREATOR);
                throw e2.c.p(parcel);
            case 19:
                g gVar = (g) p7.a.a(parcel, g.CREATOR);
                throw e2.c.p(parcel);
            case 20:
                h hVar = (h) p7.a.a(parcel, h.CREATOR);
                throw e2.c.p(parcel);
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                p pVar = (p) p7.a.a(parcel, p.CREATOR);
                throw e2.c.p(parcel);
            case 23:
                o oVar = (o) p7.a.a(parcel, o.CREATOR);
                throw e2.c.p(parcel);
            case 26:
                g0 g0Var = (g0) p7.a.a(parcel, g0.CREATOR);
                throw e2.c.p(parcel);
            case 27:
                t0 t0Var = (t0) p7.a.a(parcel, t0.CREATOR);
                throw e2.c.p(parcel);
            case 28:
                s sVar = (s) p7.a.a(parcel, s.CREATOR);
                throw e2.c.p(parcel);
            case 29:
                u uVar = (u) p7.a.a(parcel, u.CREATOR);
                throw e2.c.p(parcel);
            case 30:
                t tVar = (t) p7.a.a(parcel, t.CREATOR);
                throw e2.c.p(parcel);
            case 34:
                u0 u0Var = (u0) p7.a.a(parcel, u0.CREATOR);
                throw e2.c.p(parcel);
            case 35:
                a0 a0Var = (a0) p7.a.a(parcel, a0.CREATOR);
                throw e2.c.p(parcel);
            case 36:
                r0 r0Var = (r0) p7.a.a(parcel, r0.CREATOR);
                throw e2.c.p(parcel);
            case 37:
                v vVar = (v) p7.a.a(parcel, v.CREATOR);
                throw e2.c.p(parcel);
            case 38:
                j jVar = (j) p7.a.a(parcel, j.CREATOR);
                throw e2.c.p(parcel);
            case 39:
                d0 d0Var = (d0) p7.a.a(parcel, d0.CREATOR);
                throw e2.c.p(parcel);
            case 40:
                f1 f1Var = (f1) p7.a.a(parcel, f1.CREATOR);
                throw e2.c.p(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override
    public void n(v0 v0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void x() {
        throw new UnsupportedOperationException();
    }
}
