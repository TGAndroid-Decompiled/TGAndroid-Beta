package m8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import j7.f5;
import org.telegram.ui.ai;
public final class e extends c6.a {
    public static final Parcelable.Creator<e> CREATOR = new c(1);
    public final f f13783a;
    public final int f13784b;
    public final int f13785c;
    public final int d;

    public e(f fVar, int i10, int i11, int i12) {
        this.f13783a = fVar;
        this.f13784b = i10;
        this.f13785c = i11;
        this.d = i12;
    }

    public final void e(l8.c cVar) {
        f fVar = this.f13783a;
        int i10 = this.f13784b;
        if (i10 != 1) {
            int i11 = this.d;
            int i12 = this.f13785c;
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
        String valueOf = String.valueOf(this.f13783a);
        int i10 = this.f13784b;
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
        int i11 = this.f13785c;
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
        StringBuilder l10 = ai.l("ChannelEventParcelable[, channel=", valueOf, ", type=", str, ", closeReason=");
        l10.append(str2);
        l10.append(", appErrorCode=");
        l10.append(this.d);
        l10.append("]");
        return l10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.k(parcel, 2, this.f13783a, i10);
        f5.s(parcel, 3, 4);
        parcel.writeInt(this.f13784b);
        f5.s(parcel, 4, 4);
        parcel.writeInt(this.f13785c);
        f5.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        f5.r(parcel, q10);
    }
}
