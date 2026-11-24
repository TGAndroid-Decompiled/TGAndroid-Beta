package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
public abstract class w4d extends dzc implements IInterface {
    public w4d() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", (byte) 12);
    }

    public void T(ede edeVar) {
        throw new UnsupportedOperationException();
    }

    public void U() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                lud ludVar = (lud) bhd.a(parcel, lud.CREATOR);
                throw yjb.m(parcel);
            case 3:
                wae waeVar = (wae) bhd.a(parcel, wae.CREATOR);
                throw yjb.m(parcel);
            case 4:
                ovd ovdVar = (ovd) bhd.a(parcel, ovd.CREATOR);
                throw yjb.m(parcel);
            case 5:
                DataHolder dataHolder = (DataHolder) bhd.a(parcel, DataHolder.CREATOR);
                throw yjb.m(parcel);
            case 6:
                dqd dqdVar = (dqd) bhd.a(parcel, dqd.CREATOR);
                throw yjb.m(parcel);
            case 7:
                bhd.b(parcel);
                T((ede) bhd.a(parcel, ede.CREATOR));
                break;
            case 8:
                hwd hwdVar = (hwd) bhd.a(parcel, hwd.CREATOR);
                throw yjb.m(parcel);
            case 9:
                qwd qwdVar = (qwd) bhd.a(parcel, qwd.CREATOR);
                throw yjb.m(parcel);
            case 10:
                fvd fvdVar = (fvd) bhd.a(parcel, fvd.CREATOR);
                throw yjb.m(parcel);
            case 11:
                Status status = (Status) bhd.a(parcel, Status.CREATOR);
                bhd.b(parcel);
                U();
                break;
            case 12:
                wde wdeVar = (wde) bhd.a(parcel, wde.CREATOR);
                throw yjb.m(parcel);
            case 13:
                uud uudVar = (uud) bhd.a(parcel, uud.CREATOR);
                throw yjb.m(parcel);
            case 14:
                m9e m9eVar = (m9e) bhd.a(parcel, m9e.CREATOR);
                throw yjb.m(parcel);
            case 15:
                cid cidVar = (cid) bhd.a(parcel, cid.CREATOR);
                throw yjb.m(parcel);
            case 16:
                cid cidVar2 = (cid) bhd.a(parcel, cid.CREATOR);
                throw yjb.m(parcel);
            case 17:
                lrd lrdVar = (lrd) bhd.a(parcel, lrd.CREATOR);
                throw yjb.m(parcel);
            case 18:
                wrd wrdVar = (wrd) bhd.a(parcel, wrd.CREATOR);
                throw yjb.m(parcel);
            case 19:
                sfd sfdVar = (sfd) bhd.a(parcel, sfd.CREATOR);
                throw yjb.m(parcel);
            case 20:
                cgd cgdVar = (cgd) bhd.a(parcel, cgd.CREATOR);
                throw yjb.m(parcel);
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            default:
                return false;
            case 22:
                zqd zqdVar = (zqd) bhd.a(parcel, zqd.CREATOR);
                throw yjb.m(parcel);
            case 23:
                oqd oqdVar = (oqd) bhd.a(parcel, oqd.CREATOR);
                throw yjb.m(parcel);
            case 26:
                tyd tydVar = (tyd) bhd.a(parcel, tyd.CREATOR);
                throw yjb.m(parcel);
            case 27:
                ube ubeVar = (ube) bhd.a(parcel, ube.CREATOR);
                throw yjb.m(parcel);
            case 28:
                jsd jsdVar = (jsd) bhd.a(parcel, jsd.CREATOR);
                throw yjb.m(parcel);
            case 29:
                std stdVar = (std) bhd.a(parcel, std.CREATOR);
                throw yjb.m(parcel);
            case 30:
                usd usdVar = (usd) bhd.a(parcel, usd.CREATOR);
                throw yjb.m(parcel);
            case 34:
                sce sceVar = (sce) bhd.a(parcel, sce.CREATOR);
                throw yjb.m(parcel);
            case 35:
                xvd xvdVar = (xvd) bhd.a(parcel, xvd.CREATOR);
                throw yjb.m(parcel);
            case 36:
                kae kaeVar = (kae) bhd.a(parcel, kae.CREATOR);
                throw yjb.m(parcel);
            case 37:
                ytd ytdVar = (ytd) bhd.a(parcel, ytd.CREATOR);
                throw yjb.m(parcel);
            case 38:
                rid ridVar = (rid) bhd.a(parcel, rid.CREATOR);
                throw yjb.m(parcel);
            case 39:
                axd axdVar = (axd) bhd.a(parcel, axd.CREATOR);
                throw yjb.m(parcel);
            case 40:
                g9f g9fVar = (g9f) bhd.a(parcel, g9f.CREATOR);
                throw yjb.m(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
