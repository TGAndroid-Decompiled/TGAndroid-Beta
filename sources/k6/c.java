package k6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.h0;
public final class c extends o6.a {
    public static final Parcelable.Creator<c> CREATOR = new g8.g(17);
    public final String f10931a;
    public final int f10932b;
    public final long f10933c;

    public c(int i10, String str, long j10) {
        this.f10931a = str;
        this.f10932b = i10;
        this.f10933c = j10;
    }

    public final long b() {
        long j10 = this.f10933c;
        if (j10 == -1) {
            return this.f10932b;
        }
        return j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f10931a;
            String str2 = this.f10931a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && b() == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10931a, Long.valueOf(b())});
    }

    public final String toString() {
        m4.c cVar = new m4.c(this);
        cVar.u(this.f10931a, "name");
        cVar.u(Long.valueOf(b()), "version");
        return cVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 1, this.f10931a);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.f10932b);
        long b10 = b();
        h0.s(parcel, 3, 8);
        parcel.writeLong(b10);
        h0.r(parcel, q6);
    }

    public c(String str, long j10) {
        this.f10931a = str;
        this.f10933c = j10;
        this.f10932b = -1;
    }
}
