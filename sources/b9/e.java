package b9;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new c(1);
    public final f f2992a;
    public final int f2993b;
    public final int f2994c;
    public final int d;

    public e(f fVar, int i7, int i10, int i11) {
        this.f2992a = fVar;
        this.f2993b = i7;
        this.f2994c = i10;
        this.d = i11;
    }

    public final void b(a9.a aVar) {
        f fVar = this.f2992a;
        int i7 = this.f2993b;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        Log.w("ChannelEventParcelable", "Unknown type: " + i7);
                        return;
                    }
                    aVar.b(fVar);
                    return;
                }
                aVar.d(fVar);
                return;
            }
            aVar.a(fVar);
            return;
        }
        aVar.c(fVar);
    }

    public final String toString() {
        String str;
        String str2;
        String valueOf = String.valueOf(this.f2992a);
        int i7 = this.f2993b;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        str = Integer.toString(i7);
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
        int i10 = this.f2994c;
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
        StringBuilder n10 = e2.n("ChannelEventParcelable[, channel=", valueOf, ", type=", str, ", closeReason=");
        n10.append(str2);
        n10.append(", appErrorCode=");
        n10.append(this.d);
        n10.append("]");
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f2992a, i7);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.f2993b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.f2994c);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        bc.s(parcel, r10);
    }
}
