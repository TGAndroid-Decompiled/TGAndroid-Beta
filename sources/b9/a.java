package b9;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
public abstract class a extends a8.q implements d0 {
    public a() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", 6);
    }

    @Override
    public void H() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void O(t0 t0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean k1(int i7, Parcel parcel, Parcel parcel2) {
        switch (i7) {
            case 2:
                u uVar = (u) i8.a.a(parcel, u.CREATOR);
                throw a8.p0.v(parcel);
            case 3:
                q0 q0Var = (q0) i8.a.a(parcel, q0.CREATOR);
                throw a8.p0.v(parcel);
            case 4:
                x xVar = (x) i8.a.a(parcel, x.CREATOR);
                throw a8.p0.v(parcel);
            case 5:
                DataHolder dataHolder = (DataHolder) i8.a.a(parcel, DataHolder.CREATOR);
                throw a8.p0.v(parcel);
            case 6:
                l lVar = (l) i8.a.a(parcel, l.CREATOR);
                throw a8.p0.v(parcel);
            case 7:
                i8.a.b(parcel);
                O((t0) i8.a.a(parcel, t0.CREATOR));
                break;
            case 8:
                z zVar = (z) i8.a.a(parcel, z.CREATOR);
                throw a8.p0.v(parcel);
            case 9:
                a0 a0Var = (a0) i8.a.a(parcel, a0.CREATOR);
                throw a8.p0.v(parcel);
            case 10:
                w wVar = (w) i8.a.a(parcel, w.CREATOR);
                throw a8.p0.v(parcel);
            case 11:
                Status status = (Status) i8.a.a(parcel, Status.CREATOR);
                i8.a.b(parcel);
                H();
                break;
            case 12:
                u0 u0Var = (u0) i8.a.a(parcel, u0.CREATOR);
                throw a8.p0.v(parcel);
            case 13:
                v vVar = (v) i8.a.a(parcel, v.CREATOR);
                throw a8.p0.v(parcel);
            case 14:
                m0 m0Var = (m0) i8.a.a(parcel, m0.CREATOR);
                throw a8.p0.v(parcel);
            case 15:
                i iVar = (i) i8.a.a(parcel, i.CREATOR);
                throw a8.p0.v(parcel);
            case 16:
                i iVar2 = (i) i8.a.a(parcel, i.CREATOR);
                throw a8.p0.v(parcel);
            case 17:
                o oVar = (o) i8.a.a(parcel, o.CREATOR);
                throw a8.p0.v(parcel);
            case 18:
                p pVar = (p) i8.a.a(parcel, p.CREATOR);
                throw a8.p0.v(parcel);
            case 19:
                g gVar = (g) i8.a.a(parcel, g.CREATOR);
                throw a8.p0.v(parcel);
            case 20:
                h hVar = (h) i8.a.a(parcel, h.CREATOR);
                throw a8.p0.v(parcel);
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                n nVar = (n) i8.a.a(parcel, n.CREATOR);
                throw a8.p0.v(parcel);
            case 23:
                m mVar = (m) i8.a.a(parcel, m.CREATOR);
                throw a8.p0.v(parcel);
            case 26:
                e0 e0Var = (e0) i8.a.a(parcel, e0.CREATOR);
                throw a8.p0.v(parcel);
            case 27:
                r0 r0Var = (r0) i8.a.a(parcel, r0.CREATOR);
                throw a8.p0.v(parcel);
            case 28:
                q qVar = (q) i8.a.a(parcel, q.CREATOR);
                throw a8.p0.v(parcel);
            case 29:
                s sVar = (s) i8.a.a(parcel, s.CREATOR);
                throw a8.p0.v(parcel);
            case 30:
                r rVar = (r) i8.a.a(parcel, r.CREATOR);
                throw a8.p0.v(parcel);
            case 34:
                s0 s0Var = (s0) i8.a.a(parcel, s0.CREATOR);
                throw a8.p0.v(parcel);
            case 35:
                y yVar = (y) i8.a.a(parcel, y.CREATOR);
                throw a8.p0.v(parcel);
            case 36:
                p0 p0Var = (p0) i8.a.a(parcel, p0.CREATOR);
                throw a8.p0.v(parcel);
            case 37:
                t tVar = (t) i8.a.a(parcel, t.CREATOR);
                throw a8.p0.v(parcel);
            case 38:
                j jVar = (j) i8.a.a(parcel, j.CREATOR);
                throw a8.p0.v(parcel);
            case 39:
                b0 b0Var = (b0) i8.a.a(parcel, b0.CREATOR);
                throw a8.p0.v(parcel);
            case 40:
                d1 d1Var = (d1) i8.a.a(parcel, d1.CREATOR);
                throw a8.p0.v(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
