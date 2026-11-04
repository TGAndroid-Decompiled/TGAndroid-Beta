package i7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import f6.c0;
public final class f extends q6.a {
    public static final Parcelable.Creator<f> CREATOR = new c0(20);
    public final String f14674a;
    public final Bundle f14675b;
    public final Bundle f14676c;
    public final String d;
    public final String f14677e;
    public final ResultReceiver f14678f;

    public f(String type, Bundle credentialData, Bundle candidateQueryData, String str, String str2, ResultReceiver resultReceiver) {
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialData, "credentialData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        this.f14674a = type;
        this.f14675b = credentialData;
        this.f14676c = candidateQueryData;
        this.d = str;
        this.f14677e = str2;
        this.f14678f = resultReceiver;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i3) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int s6 = j8.a.s(dest, 20293);
        j8.a.m(dest, 1, this.f14674a);
        j8.a.c(dest, 2, this.f14675b);
        j8.a.c(dest, 3, this.f14676c);
        j8.a.m(dest, 4, this.d);
        j8.a.m(dest, 5, this.f14677e);
        j8.a.l(dest, 6, this.f14678f, i3);
        j8.a.t(dest, s6);
    }
}
