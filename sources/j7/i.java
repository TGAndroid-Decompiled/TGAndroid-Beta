package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import org.telegram.ui.Cells.f1;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new b(7);
    public final String f16567a;
    public final Bundle f16568b;
    public final Bundle f16569c;
    public final String d;
    public final String f16570e;
    public final String f16571f;

    public i(String type, Bundle credentialRetrievalData, Bundle candidateQueryData, String requestMatcher, String requestType, String protocolType) {
        boolean z9;
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialRetrievalData, "credentialRetrievalData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.j.e(requestMatcher, "requestMatcher");
        kotlin.jvm.internal.j.e(requestType, "requestType");
        kotlin.jvm.internal.j.e(protocolType, "protocolType");
        this.f16567a = type;
        this.f16568b = credentialRetrievalData;
        this.f16569c = candidateQueryData;
        this.d = requestMatcher;
        this.f16570e = requestType;
        this.f16571f = protocolType;
        boolean z10 = true;
        if (!xd.d.j(requestType) && !xd.d.j(protocolType)) {
            z9 = true;
        } else {
            z9 = false;
        }
        z10 = (!xd.d.j(type) && requestType.length() == 0 && protocolType.length() == 0) ? z10 : false;
        if (!z9 && !z10) {
            StringBuilder sb2 = new StringBuilder(protocolType.length() + requestType.length() + type.length() + 31 + 19 + 69);
            com.google.android.recaptcha.internal.a.s(sb2, "Either type: ", type, ", or requestType: ", requestType);
            throw new IllegalArgumentException(f1.n(" and protocolType: ", protocolType, " must be specified, but at least one contains an invalid blank value.", sb2));
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = xb.r(dest, 20293);
        xb.l(dest, 1, this.f16567a);
        xb.b(dest, 2, this.f16568b);
        xb.b(dest, 3, this.f16569c);
        xb.l(dest, 4, this.d);
        xb.l(dest, 5, this.f16570e);
        xb.l(dest, 6, this.f16571f);
        xb.s(dest, r10);
    }
}
