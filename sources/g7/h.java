package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c3.i0;
import w7.h0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new e6.p(18);
    public final String f7438a;
    public final Bundle f7439b;
    public final Bundle f7440c;
    public final String d;
    public final String e;
    public final String f7441f;

    public h(String type, Bundle credentialRetrievalData, Bundle candidateQueryData, String requestMatcher, String requestType, String protocolType) {
        boolean z10;
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(credentialRetrievalData, "credentialRetrievalData");
        kotlin.jvm.internal.i.e(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.i.e(requestMatcher, "requestMatcher");
        kotlin.jvm.internal.i.e(requestType, "requestType");
        kotlin.jvm.internal.i.e(protocolType, "protocolType");
        this.f7438a = type;
        this.f7439b = credentialRetrievalData;
        this.f7440c = candidateQueryData;
        this.d = requestMatcher;
        this.e = requestType;
        this.f7441f = protocolType;
        boolean z11 = true;
        if (!rd.j.e(requestType) && !rd.j.e(protocolType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        z11 = (!rd.j.e(type) && requestType.length() == 0 && protocolType.length() == 0) ? z11 : false;
        if (!z10 && !z11) {
            StringBuilder sb2 = new StringBuilder(protocolType.length() + requestType.length() + type.length() + 31 + 19 + 69);
            i0.r(sb2, "Either type: ", type, ", or requestType: ", requestType);
            throw new IllegalArgumentException(a1.g.o(" and protocolType: ", protocolType, " must be specified, but at least one contains an invalid blank value.", sb2));
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = h0.q(dest, 20293);
        h0.l(dest, 1, this.f7438a);
        h0.b(dest, 2, this.f7439b);
        h0.b(dest, 3, this.f7440c);
        h0.l(dest, 4, this.d);
        h0.l(dest, 5, this.e);
        h0.l(dest, 6, this.f7441f);
        h0.r(dest, q6);
    }
}
