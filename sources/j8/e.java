package j8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import h7.r8;

public final class e extends z5.a {
    public static final Parcelable.Creator<e> CREATOR = new c(1);

    public final f f12774a;

    public final int f12775b;

    public final int f12776c;
    public final int d;

    public e(f fVar, int i10, int i11, int i12) {
        this.f12774a = fVar;
        this.f12775b = i10;
        this.f12776c = i11;
        this.d = i12;
    }

    public final void b(i8.c cVar) {
        f fVar = this.f12774a;
        int i10 = this.f12775b;
        if (i10 == 1) {
            cVar.onChannelOpened(fVar);
            return;
        }
        int i11 = this.d;
        int i12 = this.f12776c;
        if (i10 == 2) {
            cVar.onChannelClosed(fVar, i12, i11);
            return;
        }
        if (i10 == 3) {
            cVar.onInputClosed(fVar, i12, i11);
        } else {
            if (i10 == 4) {
                cVar.onOutputClosed(fVar, i12, i11);
                return;
            }
            Log.w("ChannelEventParcelable", "Unknown type: " + i10);
        }
    }

    public final String toString() {
        String string;
        String string2;
        String strValueOf = String.valueOf(this.f12774a);
        int i10 = this.f12775b;
        if (i10 == 1) {
            string = "CHANNEL_OPENED";
        } else if (i10 == 2) {
            string = "CHANNEL_CLOSED";
        } else if (i10 != 3) {
            string = i10 != 4 ? Integer.toString(i10) : "OUTPUT_CLOSED";
        } else {
            string = "INPUT_CLOSED";
        }
        int i11 = this.f12776c;
        if (i11 == 0) {
            string2 = "CLOSE_REASON_NORMAL";
        } else if (i11 == 1) {
            string2 = "CLOSE_REASON_DISCONNECTED";
        } else if (i11 != 2) {
            string2 = i11 != 3 ? Integer.toString(i11) : "CLOSE_REASON_LOCAL_CLOSE";
        } else {
            string2 = "CLOSE_REASON_REMOTE_CLOSE";
        }
        StringBuilder sbP = i0.a.p("ChannelEventParcelable[, channel=", strValueOf, ", type=", string, ", closeReason=");
        sbP.append(string2);
        sbP.append(", appErrorCode=");
        sbP.append(this.d);
        sbP.append("]");
        return sbP.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.f12774a, i10);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.f12775b);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.f12776c);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        r8.r(parcel, iQ);
    }
}
