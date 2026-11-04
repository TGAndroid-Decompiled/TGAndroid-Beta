package a9;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
public final class e extends q6.a {
    public static final Parcelable.Creator<e> CREATOR = new c(1);
    public final f f187a;
    public final int f188b;
    public final int f189c;
    public final int d;

    public e(f fVar, int i3, int i10, int i11) {
        this.f187a = fVar;
        this.f188b = i3;
        this.f189c = i10;
        this.d = i11;
    }

    public final void b(z8.a aVar) {
        f fVar = this.f187a;
        int i3 = this.f188b;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        Log.w("ChannelEventParcelable", "Unknown type: " + i3);
                        return;
                    }
                    aVar.c(fVar);
                    return;
                }
                aVar.d(fVar);
                return;
            }
            aVar.b(fVar);
            return;
        }
        aVar.a(fVar);
    }

    public final String toString() {
        String str;
        String str2;
        String valueOf = String.valueOf(this.f187a);
        int i3 = this.f188b;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        str = Integer.toString(i3);
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
        int i10 = this.f189c;
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
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("ChannelEventParcelable[, channel=", valueOf, ", type=", str, ", closeReason=");
        n4.append(str2);
        n4.append(", appErrorCode=");
        n4.append(this.d);
        n4.append("]");
        return n4.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.l(parcel, 2, this.f187a, i3);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.f188b);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.f189c);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.d);
        j8.a.t(parcel, s6);
    }
}
