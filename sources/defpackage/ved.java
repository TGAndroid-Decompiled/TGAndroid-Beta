package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
public final class ved extends b4 {
    public static final Parcelable.Creator<ved> CREATOR = new lbd((byte) 24);
    public final pgd a;
    public final int b;
    public final int c;
    public final int d;

    public ved(pgd pgdVar, int i, int i2, int i3) {
        this.a = pgdVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void b(nh1 nh1Var) {
        pgd pgdVar = this.a;
        int i = this.b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        Log.w("ChannelEventParcelable", "Unknown type: " + i);
                        return;
                    }
                    nh1Var.d(pgdVar);
                    return;
                }
                nh1Var.c(pgdVar);
                return;
            }
            nh1Var.b(pgdVar);
            return;
        }
        nh1Var.a(pgdVar);
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
        StringBuilder m = mlb.m("ChannelEventParcelable[, channel=", valueOf, ", type=", str, ", closeReason=");
        m.append(str2);
        m.append(", appErrorCode=");
        m.append(this.d);
        m.append("]");
        return m.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.k(parcel, 2, this.a, i);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        mve.s(parcel, r);
    }
}
