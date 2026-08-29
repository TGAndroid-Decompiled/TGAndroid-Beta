package k8;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import j7.l1;
public abstract class a extends c7.a implements f0 {
    public a() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", 8);
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 2:
                w wVar = (w) r7.a.a(parcel, w.CREATOR);
                throw l1.p(parcel);
            case 3:
                s0 s0Var = (s0) r7.a.a(parcel, s0.CREATOR);
                throw l1.p(parcel);
            case 4:
                z zVar = (z) r7.a.a(parcel, z.CREATOR);
                throw l1.p(parcel);
            case 5:
                DataHolder dataHolder = (DataHolder) r7.a.a(parcel, DataHolder.CREATOR);
                throw l1.p(parcel);
            case 6:
                n nVar = (n) r7.a.a(parcel, n.CREATOR);
                throw l1.p(parcel);
            case 7:
                r7.a.b(parcel);
                m0((v0) r7.a.a(parcel, v0.CREATOR));
                break;
            case 8:
                b0 b0Var = (b0) r7.a.a(parcel, b0.CREATOR);
                throw l1.p(parcel);
            case 9:
                c0 c0Var = (c0) r7.a.a(parcel, c0.CREATOR);
                throw l1.p(parcel);
            case 10:
                y yVar = (y) r7.a.a(parcel, y.CREATOR);
                throw l1.p(parcel);
            case 11:
                Status status = (Status) r7.a.a(parcel, Status.CREATOR);
                r7.a.b(parcel);
                w();
                break;
            case 12:
                w0 w0Var = (w0) r7.a.a(parcel, w0.CREATOR);
                throw l1.p(parcel);
            case 13:
                x xVar = (x) r7.a.a(parcel, x.CREATOR);
                throw l1.p(parcel);
            case 14:
                o0 o0Var = (o0) r7.a.a(parcel, o0.CREATOR);
                throw l1.p(parcel);
            case 15:
                i iVar = (i) r7.a.a(parcel, i.CREATOR);
                throw l1.p(parcel);
            case 16:
                i iVar2 = (i) r7.a.a(parcel, i.CREATOR);
                throw l1.p(parcel);
            case 17:
                q qVar = (q) r7.a.a(parcel, q.CREATOR);
                throw l1.p(parcel);
            case 18:
                r rVar = (r) r7.a.a(parcel, r.CREATOR);
                throw l1.p(parcel);
            case 19:
                g gVar = (g) r7.a.a(parcel, g.CREATOR);
                throw l1.p(parcel);
            case 20:
                h hVar = (h) r7.a.a(parcel, h.CREATOR);
                throw l1.p(parcel);
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                p pVar = (p) r7.a.a(parcel, p.CREATOR);
                throw l1.p(parcel);
            case 23:
                o oVar = (o) r7.a.a(parcel, o.CREATOR);
                throw l1.p(parcel);
            case 26:
                g0 g0Var = (g0) r7.a.a(parcel, g0.CREATOR);
                throw l1.p(parcel);
            case 27:
                t0 t0Var = (t0) r7.a.a(parcel, t0.CREATOR);
                throw l1.p(parcel);
            case 28:
                s sVar = (s) r7.a.a(parcel, s.CREATOR);
                throw l1.p(parcel);
            case 29:
                u uVar = (u) r7.a.a(parcel, u.CREATOR);
                throw l1.p(parcel);
            case 30:
                t tVar = (t) r7.a.a(parcel, t.CREATOR);
                throw l1.p(parcel);
            case 34:
                u0 u0Var = (u0) r7.a.a(parcel, u0.CREATOR);
                throw l1.p(parcel);
            case 35:
                a0 a0Var = (a0) r7.a.a(parcel, a0.CREATOR);
                throw l1.p(parcel);
            case 36:
                r0 r0Var = (r0) r7.a.a(parcel, r0.CREATOR);
                throw l1.p(parcel);
            case 37:
                v vVar = (v) r7.a.a(parcel, v.CREATOR);
                throw l1.p(parcel);
            case 38:
                j jVar = (j) r7.a.a(parcel, j.CREATOR);
                throw l1.p(parcel);
            case 39:
                d0 d0Var = (d0) r7.a.a(parcel, d0.CREATOR);
                throw l1.p(parcel);
            case 40:
                f1 f1Var = (f1) r7.a.a(parcel, f1.CREATOR);
                throw l1.p(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override
    public void m0(v0 v0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void w() {
        throw new UnsupportedOperationException();
    }
}
