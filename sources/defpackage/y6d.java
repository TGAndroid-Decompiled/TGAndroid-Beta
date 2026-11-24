package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
public abstract class y6d extends e1d implements IInterface {
    public y6d() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", (byte) 12);
    }

    public void T(ffe ffeVar) {
        throw new UnsupportedOperationException();
    }

    public void U() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                owd owdVar = (owd) cjd.a(parcel, owd.CREATOR);
                throw mlb.n(parcel);
            case 3:
                xce xceVar = (xce) cjd.a(parcel, xce.CREATOR);
                throw mlb.n(parcel);
            case 4:
                rxd rxdVar = (rxd) cjd.a(parcel, rxd.CREATOR);
                throw mlb.n(parcel);
            case 5:
                DataHolder dataHolder = (DataHolder) cjd.a(parcel, DataHolder.CREATOR);
                throw mlb.n(parcel);
            case 6:
                gsd gsdVar = (gsd) cjd.a(parcel, gsd.CREATOR);
                throw mlb.n(parcel);
            case 7:
                cjd.b(parcel);
                T((ffe) cjd.a(parcel, ffe.CREATOR));
                break;
            case 8:
                kyd kydVar = (kyd) cjd.a(parcel, kyd.CREATOR);
                throw mlb.n(parcel);
            case 9:
                tyd tydVar = (tyd) cjd.a(parcel, tyd.CREATOR);
                throw mlb.n(parcel);
            case 10:
                ixd ixdVar = (ixd) cjd.a(parcel, ixd.CREATOR);
                throw mlb.n(parcel);
            case 11:
                Status status = (Status) cjd.a(parcel, Status.CREATOR);
                cjd.b(parcel);
                U();
                break;
            case 12:
                xfe xfeVar = (xfe) cjd.a(parcel, xfe.CREATOR);
                throw mlb.n(parcel);
            case 13:
                xwd xwdVar = (xwd) cjd.a(parcel, xwd.CREATOR);
                throw mlb.n(parcel);
            case 14:
                nbe nbeVar = (nbe) cjd.a(parcel, nbe.CREATOR);
                throw mlb.n(parcel);
            case 15:
                dkd dkdVar = (dkd) cjd.a(parcel, dkd.CREATOR);
                throw mlb.n(parcel);
            case 16:
                dkd dkdVar2 = (dkd) cjd.a(parcel, dkd.CREATOR);
                throw mlb.n(parcel);
            case 17:
                otd otdVar = (otd) cjd.a(parcel, otd.CREATOR);
                throw mlb.n(parcel);
            case 18:
                ztd ztdVar = (ztd) cjd.a(parcel, ztd.CREATOR);
                throw mlb.n(parcel);
            case 19:
                thd thdVar = (thd) cjd.a(parcel, thd.CREATOR);
                throw mlb.n(parcel);
            case 20:
                did didVar = (did) cjd.a(parcel, did.CREATOR);
                throw mlb.n(parcel);
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                ctd ctdVar = (ctd) cjd.a(parcel, ctd.CREATOR);
                throw mlb.n(parcel);
            case 23:
                rsd rsdVar = (rsd) cjd.a(parcel, rsd.CREATOR);
                throw mlb.n(parcel);
            case 26:
                w0e w0eVar = (w0e) cjd.a(parcel, w0e.CREATOR);
                throw mlb.n(parcel);
            case 27:
                vde vdeVar = (vde) cjd.a(parcel, vde.CREATOR);
                throw mlb.n(parcel);
            case 28:
                mud mudVar = (mud) cjd.a(parcel, mud.CREATOR);
                throw mlb.n(parcel);
            case 29:
                vvd vvdVar = (vvd) cjd.a(parcel, vvd.CREATOR);
                throw mlb.n(parcel);
            case 30:
                xud xudVar = (xud) cjd.a(parcel, xud.CREATOR);
                throw mlb.n(parcel);
            case 34:
                tee teeVar = (tee) cjd.a(parcel, tee.CREATOR);
                throw mlb.n(parcel);
            case 35:
                ayd aydVar = (ayd) cjd.a(parcel, ayd.CREATOR);
                throw mlb.n(parcel);
            case 36:
                lce lceVar = (lce) cjd.a(parcel, lce.CREATOR);
                throw mlb.n(parcel);
            case 37:
                bwd bwdVar = (bwd) cjd.a(parcel, bwd.CREATOR);
                throw mlb.n(parcel);
            case 38:
                tkd tkdVar = (tkd) cjd.a(parcel, tkd.CREATOR);
                throw mlb.n(parcel);
            case 39:
                dzd dzdVar = (dzd) cjd.a(parcel, dzd.CREATOR);
                throw mlb.n(parcel);
            case 40:
                ibf ibfVar = (ibf) cjd.a(parcel, ibf.CREATOR);
                throw mlb.n(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
