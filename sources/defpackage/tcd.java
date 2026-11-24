package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
public final class tcd extends b4 {
    public static final Parcelable.Creator<tcd> CREATOR = new j9d((byte) 24);
    public final oed a;
    public final int b;
    public final int c;
    public final int d;

    public tcd(oed oedVar, int i, int i2, int i3) {
        this.a = oedVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final void b(fg1 fg1Var) {
        oed oedVar = this.a;
        int i = this.b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        Log.w("ChannelEventParcelable", "Unknown type: " + i);
                        return;
                    }
                    fg1Var.d(oedVar);
                    return;
                }
                fg1Var.c(oedVar);
                return;
            }
            fg1Var.b(oedVar);
            return;
        }
        fg1Var.a(oedVar);
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
        StringBuilder l = yjb.l("ChannelEventParcelable[, channel=", valueOf, ", type=", str, ", closeReason=");
        l.append(str2);
        l.append(", appErrorCode=");
        l.append(this.d);
        l.append("]");
        return l.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.k(parcel, 2, this.a, i);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        jte.q(parcel, 5, 4);
        parcel.writeInt(this.d);
        jte.s(parcel, r);
    }
}
