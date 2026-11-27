package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
public final class mhd extends c4 {
    public static final Parcelable.Creator<mhd> CREATOR = new ced((byte) 24);
    public final fjd a;
    public final int b;
    public final int c;
    public final int d;

    public mhd(fjd fjdVar, int i, int i2, int i3) {
        this.a = fjdVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void b(og1 og1Var) {
        fjd fjdVar = this.a;
        int i = this.b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        Log.w("ChannelEventParcelable", "Unknown type: " + i);
                        return;
                    }
                    og1Var.d(fjdVar);
                    return;
                }
                og1Var.c(fjdVar);
                return;
            }
            og1Var.b(fjdVar);
            return;
        }
        og1Var.a(fjdVar);
    }

    public final String toString() {
        String str;
        String str2;
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = Integer.toString(i);
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
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        str2 = Integer.toString(i2);
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
        StringBuilder l = xnb.l("ChannelEventParcelable[, channel=", valueOf, ", type=", str, ", closeReason=");
        l.append(str2);
        l.append(", appErrorCode=");
        l.append(this.d);
        l.append("]");
        return l.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 2, this.a, i);
        bye.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        bye.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        bye.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        bye.s(parcel, r);
    }
}
