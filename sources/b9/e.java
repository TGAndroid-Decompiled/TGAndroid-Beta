package b9;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import c8.xb;
public final class e extends r6.a {
    public static final Parcelable.Creator<e> CREATOR = new c(1);
    public final f f3040a;
    public final int f3041b;
    public final int f3042c;
    public final int d;

    public e(f fVar, int i7, int i10, int i11) {
        this.f3040a = fVar;
        this.f3041b = i7;
        this.f3042c = i10;
        this.d = i11;
    }

    public final void b(a9.a aVar) {
        f fVar = this.f3040a;
        int i7 = this.f3041b;
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
        String valueOf = String.valueOf(this.f3040a);
        int i7 = this.f3041b;
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
        int i10 = this.f3042c;
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
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("ChannelEventParcelable[, channel=", valueOf, ", type=", str, ", closeReason=");
        n10.append(str2);
        n10.append(", appErrorCode=");
        n10.append(this.d);
        n10.append("]");
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.f3040a, i7);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.f3041b);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.f3042c);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        xb.s(parcel, r10);
    }
}
