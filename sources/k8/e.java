package k8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.telegram.ui.th;
public final class e extends a6.a {
    public static final Parcelable.Creator<e> CREATOR = new c(1);
    public final f f13494a;
    public final int f13495b;
    public final int f13496c;
    public final int d;

    public e(f fVar, int i10, int i11, int i12) {
        this.f13494a = fVar;
        this.f13495b = i10;
        this.f13496c = i11;
        this.d = i12;
    }

    public final void b(j8.c cVar) {
        f fVar = this.f13494a;
        int i10 = this.f13495b;
        if (i10 != 1) {
            int i11 = this.d;
            int i12 = this.f13496c;
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        Log.w("ChannelEventParcelable", "Unknown type: " + i10);
                        return;
                    }
                    cVar.onOutputClosed(fVar, i12, i11);
                    return;
                }
                cVar.onInputClosed(fVar, i12, i11);
                return;
            }
            cVar.onChannelClosed(fVar, i12, i11);
            return;
        }
        cVar.onChannelOpened(fVar);
    }

    public final String toString() {
        String str;
        String str2;
        String valueOf = String.valueOf(this.f13494a);
        int i10 = this.f13495b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        str = Integer.toString(i10);
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
        int i11 = this.f13496c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        str2 = Integer.toString(i11);
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
        StringBuilder k9 = th.k("ChannelEventParcelable[, channel=", valueOf, ", type=", str, ", closeReason=");
        k9.append(str2);
        k9.append(", appErrorCode=");
        k9.append(this.d);
        k9.append("]");
        return k9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.f13494a, i10);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.f13495b);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.f13496c);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
