package m8;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
public abstract class a extends a7.c implements f0 {
    public a() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", 9);
    }

    @Override
    public void A0(u0 u0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 2:
                w wVar = (w) t7.a.a(parcel, w.CREATOR);
                throw l.d.n(parcel);
            case 3:
                r0 r0Var = (r0) t7.a.a(parcel, r0.CREATOR);
                throw l.d.n(parcel);
            case 4:
                z zVar = (z) t7.a.a(parcel, z.CREATOR);
                throw l.d.n(parcel);
            case 5:
                DataHolder dataHolder = (DataHolder) t7.a.a(parcel, DataHolder.CREATOR);
                throw l.d.n(parcel);
            case 6:
                n nVar = (n) t7.a.a(parcel, n.CREATOR);
                throw l.d.n(parcel);
            case 7:
                t7.a.b(parcel);
                A0((u0) t7.a.a(parcel, u0.CREATOR));
                break;
            case 8:
                b0 b0Var = (b0) t7.a.a(parcel, b0.CREATOR);
                throw l.d.n(parcel);
            case 9:
                c0 c0Var = (c0) t7.a.a(parcel, c0.CREATOR);
                throw l.d.n(parcel);
            case 10:
                y yVar = (y) t7.a.a(parcel, y.CREATOR);
                throw l.d.n(parcel);
            case 11:
                Status status = (Status) t7.a.a(parcel, Status.CREATOR);
                t7.a.b(parcel);
                v();
                break;
            case 12:
                v0 v0Var = (v0) t7.a.a(parcel, v0.CREATOR);
                throw l.d.n(parcel);
            case 13:
                x xVar = (x) t7.a.a(parcel, x.CREATOR);
                throw l.d.n(parcel);
            case 14:
                n0 n0Var = (n0) t7.a.a(parcel, n0.CREATOR);
                throw l.d.n(parcel);
            case 15:
                i iVar = (i) t7.a.a(parcel, i.CREATOR);
                throw l.d.n(parcel);
            case 16:
                i iVar2 = (i) t7.a.a(parcel, i.CREATOR);
                throw l.d.n(parcel);
            case 17:
                q qVar = (q) t7.a.a(parcel, q.CREATOR);
                throw l.d.n(parcel);
            case 18:
                r rVar = (r) t7.a.a(parcel, r.CREATOR);
                throw l.d.n(parcel);
            case 19:
                g gVar = (g) t7.a.a(parcel, g.CREATOR);
                throw l.d.n(parcel);
            case 20:
                h hVar = (h) t7.a.a(parcel, h.CREATOR);
                throw l.d.n(parcel);
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                p pVar = (p) t7.a.a(parcel, p.CREATOR);
                throw l.d.n(parcel);
            case 23:
                o oVar = (o) t7.a.a(parcel, o.CREATOR);
                throw l.d.n(parcel);
            case 26:
                g0 g0Var = (g0) t7.a.a(parcel, g0.CREATOR);
                throw l.d.n(parcel);
            case 27:
                s0 s0Var = (s0) t7.a.a(parcel, s0.CREATOR);
                throw l.d.n(parcel);
            case 28:
                s sVar = (s) t7.a.a(parcel, s.CREATOR);
                throw l.d.n(parcel);
            case 29:
                u uVar = (u) t7.a.a(parcel, u.CREATOR);
                throw l.d.n(parcel);
            case 30:
                t tVar = (t) t7.a.a(parcel, t.CREATOR);
                throw l.d.n(parcel);
            case 34:
                t0 t0Var = (t0) t7.a.a(parcel, t0.CREATOR);
                throw l.d.n(parcel);
            case 35:
                a0 a0Var = (a0) t7.a.a(parcel, a0.CREATOR);
                throw l.d.n(parcel);
            case 36:
                q0 q0Var = (q0) t7.a.a(parcel, q0.CREATOR);
                throw l.d.n(parcel);
            case 37:
                v vVar = (v) t7.a.a(parcel, v.CREATOR);
                throw l.d.n(parcel);
            case 38:
                j jVar = (j) t7.a.a(parcel, j.CREATOR);
                throw l.d.n(parcel);
            case 39:
                d0 d0Var = (d0) t7.a.a(parcel, d0.CREATOR);
                throw l.d.n(parcel);
            case 40:
                e1 e1Var = (e1) t7.a.a(parcel, e1.CREATOR);
                throw l.d.n(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override
    public void v() {
        throw new UnsupportedOperationException();
    }
}
