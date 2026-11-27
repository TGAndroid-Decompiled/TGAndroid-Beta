package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
public abstract class p9d extends u3d implements IInterface {
    public p9d() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", (byte) 12);
    }

    public void T(vhe vheVar) {
        throw new UnsupportedOperationException();
    }

    public void U() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                bzd bzdVar = (bzd) sld.a(parcel, bzd.CREATOR);
                throw xnb.m(parcel);
            case 3:
                mfe mfeVar = (mfe) sld.a(parcel, mfe.CREATOR);
                throw xnb.m(parcel);
            case 4:
                e0e e0eVar = (e0e) sld.a(parcel, e0e.CREATOR);
                throw xnb.m(parcel);
            case 5:
                DataHolder dataHolder = (DataHolder) sld.a(parcel, DataHolder.CREATOR);
                throw xnb.m(parcel);
            case 6:
                tud tudVar = (tud) sld.a(parcel, tud.CREATOR);
                throw xnb.m(parcel);
            case 7:
                sld.b(parcel);
                T((vhe) sld.a(parcel, vhe.CREATOR));
                break;
            case 8:
                x0e x0eVar = (x0e) sld.a(parcel, x0e.CREATOR);
                throw xnb.m(parcel);
            case 9:
                g1e g1eVar = (g1e) sld.a(parcel, g1e.CREATOR);
                throw xnb.m(parcel);
            case 10:
                vzd vzdVar = (vzd) sld.a(parcel, vzd.CREATOR);
                throw xnb.m(parcel);
            case 11:
                Status status = (Status) sld.a(parcel, Status.CREATOR);
                sld.b(parcel);
                U();
                break;
            case 12:
                nie nieVar = (nie) sld.a(parcel, nie.CREATOR);
                throw xnb.m(parcel);
            case 13:
                kzd kzdVar = (kzd) sld.a(parcel, kzd.CREATOR);
                throw xnb.m(parcel);
            case 14:
                cee ceeVar = (cee) sld.a(parcel, cee.CREATOR);
                throw xnb.m(parcel);
            case 15:
                tmd tmdVar = (tmd) sld.a(parcel, tmd.CREATOR);
                throw xnb.m(parcel);
            case 16:
                tmd tmdVar2 = (tmd) sld.a(parcel, tmd.CREATOR);
                throw xnb.m(parcel);
            case 17:
                bwd bwdVar = (bwd) sld.a(parcel, bwd.CREATOR);
                throw xnb.m(parcel);
            case 18:
                mwd mwdVar = (mwd) sld.a(parcel, mwd.CREATOR);
                throw xnb.m(parcel);
            case 19:
                jkd jkdVar = (jkd) sld.a(parcel, jkd.CREATOR);
                throw xnb.m(parcel);
            case 20:
                tkd tkdVar = (tkd) sld.a(parcel, tkd.CREATOR);
                throw xnb.m(parcel);
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                pvd pvdVar = (pvd) sld.a(parcel, pvd.CREATOR);
                throw xnb.m(parcel);
            case 23:
                evd evdVar = (evd) sld.a(parcel, evd.CREATOR);
                throw xnb.m(parcel);
            case 26:
                j3e j3eVar = (j3e) sld.a(parcel, j3e.CREATOR);
                throw xnb.m(parcel);
            case 27:
                kge kgeVar = (kge) sld.a(parcel, kge.CREATOR);
                throw xnb.m(parcel);
            case 28:
                zwd zwdVar = (zwd) sld.a(parcel, zwd.CREATOR);
                throw xnb.m(parcel);
            case 29:
                iyd iydVar = (iyd) sld.a(parcel, iyd.CREATOR);
                throw xnb.m(parcel);
            case 30:
                kxd kxdVar = (kxd) sld.a(parcel, kxd.CREATOR);
                throw xnb.m(parcel);
            case 34:
                jhe jheVar = (jhe) sld.a(parcel, jhe.CREATOR);
                throw xnb.m(parcel);
            case 35:
                n0e n0eVar = (n0e) sld.a(parcel, n0e.CREATOR);
                throw xnb.m(parcel);
            case 36:
                afe afeVar = (afe) sld.a(parcel, afe.CREATOR);
                throw xnb.m(parcel);
            case 37:
                oyd oydVar = (oyd) sld.a(parcel, oyd.CREATOR);
                throw xnb.m(parcel);
            case 38:
                ind indVar = (ind) sld.a(parcel, ind.CREATOR);
                throw xnb.m(parcel);
            case 39:
                q1e q1eVar = (q1e) sld.a(parcel, q1e.CREATOR);
                throw xnb.m(parcel);
            case 40:
                xdf xdfVar = (xdf) sld.a(parcel, xdf.CREATOR);
                throw xnb.m(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
