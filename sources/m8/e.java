package m8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import j7.f5;
import org.telegram.ui.yh;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new c(1);
    public final f f13799a;
    public final int f13800b;
    public final int f13801c;
    public final int d;

    public e(f fVar, int i10, int i11, int i12) {
        this.f13799a = fVar;
        this.f13800b = i10;
        this.f13801c = i11;
        this.d = i12;
    }

    public final void e(l8.c cVar) {
        f fVar = this.f13799a;
        int i10 = this.f13800b;
        if (i10 != 1) {
            int i11 = this.d;
            int i12 = this.f13801c;
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
        String valueOf = String.valueOf(this.f13799a);
        int i10 = this.f13800b;
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
        int i11 = this.f13801c;
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
        StringBuilder m9 = yh.m("ChannelEventParcelable[, channel=", valueOf, ", type=", str, ", closeReason=");
        m9.append(str2);
        m9.append(", appErrorCode=");
        m9.append(this.d);
        m9.append("]");
        return m9.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f13799a, i10);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f13800b);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.f13801c);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        f5.r(parcel, q10);
    }
}
