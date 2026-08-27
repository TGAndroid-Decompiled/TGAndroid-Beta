package m5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import h7.r8;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

public final class i extends z5.a {
    public static final Parcelable.Creator<i> CREATOR = new w(5);

    public final boolean f17788a;

    public final String f17789b;

    public final boolean f17790c;
    public final h d;

    public i(boolean z10, String str, boolean z11, h hVar) {
        this.f17788a = z10;
        this.f17789b = str;
        this.f17790c = z11;
        this.d = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f17788a == iVar.f17788a && r5.a.d(this.f17789b, iVar.f17789b) && this.f17790c == iVar.f17790c && r5.a.d(this.d, iVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f17788a), this.f17789b, Boolean.valueOf(this.f17790c), this.d});
    }

    public final String toString() {
        return "LaunchOptions(relaunchIfRunning=" + this.f17788a + ", language=" + this.f17789b + ", androidReceiverCompatible: " + this.f17790c + ")";
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f17788a ? 1 : 0);
        r8.l(parcel, 3, this.f17789b);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.f17790c ? 1 : 0);
        r8.k(parcel, 5, this.d, i10);
        r8.r(parcel, iQ);
    }

    public i() {
        Locale locale = Locale.getDefault();
        Pattern pattern = r5.a.f46766a;
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb2.append('-');
            sb2.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb2.append('-');
            sb2.append(variant);
        }
        this(false, sb2.toString(), false, null);
    }
}
