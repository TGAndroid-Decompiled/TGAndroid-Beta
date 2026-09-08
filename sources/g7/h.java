package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.e0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new e6.i(19);
    public final String f10489a;
    public final Bundle f10490b;
    public final Bundle f10491c;
    public final String d;
    public final String f10492e;
    public final String f10493f;

    public h(String type, Bundle credentialRetrievalData, Bundle candidateQueryData, String requestMatcher, String requestType, String protocolType) {
        boolean z10;
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(credentialRetrievalData, "credentialRetrievalData");
        kotlin.jvm.internal.i.e(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.i.e(requestMatcher, "requestMatcher");
        kotlin.jvm.internal.i.e(requestType, "requestType");
        kotlin.jvm.internal.i.e(protocolType, "protocolType");
        this.f10489a = type;
        this.f10490b = credentialRetrievalData;
        this.f10491c = candidateQueryData;
        this.d = requestMatcher;
        this.f10492e = requestType;
        this.f10493f = protocolType;
        boolean z11 = true;
        if (!xd.j.e(requestType) && !xd.j.e(protocolType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        z11 = (!xd.j.e(type) && requestType.length() == 0 && protocolType.length() == 0) ? false : false;
        if (!z10 && !z11) {
            StringBuilder sb2 = new StringBuilder(protocolType.length() + requestType.length() + type.length() + 31 + 19 + 69);
            a4.a.z(sb2, "Either type: ", type, ", or requestType: ", requestType);
            throw new IllegalArgumentException(a4.a.q(" and protocolType: ", protocolType, " must be specified, but at least one contains an invalid blank value.", sb2));
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = e0.q(dest, 20293);
        e0.l(dest, 1, this.f10489a);
        e0.b(dest, 2, this.f10490b);
        e0.b(dest, 3, this.f10491c);
        e0.l(dest, 4, this.d);
        e0.l(dest, 5, this.f10492e);
        e0.l(dest, 6, this.f10493f);
        e0.r(dest, q6);
    }
}
