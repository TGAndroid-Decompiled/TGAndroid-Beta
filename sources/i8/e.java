package i8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import g7.p8;
public final class e extends y5.a {
    public static final Parcelable.Creator<e> CREATOR = new c(1);
    public final f f10971a;
    public final int f10972b;
    public final int f10973c;
    public final int d;

    public e(f fVar, int i9, int i10, int i11) {
        this.f10971a = fVar;
        this.f10972b = i9;
        this.f10973c = i10;
        this.d = i11;
    }

    public final void b(h8.c cVar) {
        f fVar = this.f10971a;
        int i9 = this.f10972b;
        if (i9 != 1) {
            int i10 = this.d;
            int i11 = this.f10973c;
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        Log.w("ChannelEventParcelable", "Unknown type: " + i9);
                        return;
                    }
                    cVar.onOutputClosed(fVar, i11, i10);
                    return;
                }
                cVar.onInputClosed(fVar, i11, i10);
                return;
            }
            cVar.onChannelClosed(fVar, i11, i10);
            return;
        }
        cVar.onChannelOpened(fVar);
    }

    public final String toString() {
        String str;
        String str2;
        String valueOf = String.valueOf(this.f10971a);
        int i9 = this.f10972b;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        str = Integer.toString(i9);
                    } else {
                        str = "OUTPUT_CLOSED";
                    }
                } else {
                    str = "INPUT_CLOSED";
                }
            } else {
                str = "CHANNEL_CLOSED";
            }
        } else {
            str = "CHANNEL_OPENED";
        }
        int i10 = this.f10973c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        str2 = Integer.toString(i10);
                    } else {
                        str2 = "CLOSE_REASON_LOCAL_CLOSE";
                    }
                } else {
                    str2 = "CLOSE_REASON_REMOTE_CLOSE";
                }
            } else {
                str2 = "CLOSE_REASON_DISCONNECTED";
            }
        } else {
            str2 = "CLOSE_REASON_NORMAL";
        }
        StringBuilder q10 = j3.r0.q("ChannelEventParcelable[, channel=", valueOf, ", type=", str, ", closeReason=");
        q10.append(str2);
        q10.append(", appErrorCode=");
        q10.append(this.d);
        q10.append("]");
        return q10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 2, this.f10971a, i9);
        p8.s(parcel, 3, 4);
        parcel.writeInt(this.f10972b);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.f10973c);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        p8.r(parcel, q10);
    }
}
