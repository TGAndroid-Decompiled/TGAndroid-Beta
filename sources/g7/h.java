package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.d0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new e6.i(19);
    public final String f10398a;
    public final Bundle f10399b;
    public final Bundle f10400c;
    public final String d;
    public final String f10401e;
    public final String f10402f;

    public h(String type, Bundle credentialRetrievalData, Bundle candidateQueryData, String requestMatcher, String requestType, String protocolType) {
        boolean z10;
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(credentialRetrievalData, "credentialRetrievalData");
        kotlin.jvm.internal.i.e(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.i.e(requestMatcher, "requestMatcher");
        kotlin.jvm.internal.i.e(requestType, "requestType");
        kotlin.jvm.internal.i.e(protocolType, "protocolType");
        this.f10398a = type;
        this.f10399b = credentialRetrievalData;
        this.f10400c = candidateQueryData;
        this.d = requestMatcher;
        this.f10401e = requestType;
        this.f10402f = protocolType;
        boolean z11 = true;
        if (!yd.j.e(requestType) && !yd.j.e(protocolType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        z11 = (!yd.j.e(type) && requestType.length() == 0 && protocolType.length() == 0) ? z11 : false;
        if (!z10 && !z11) {
            StringBuilder sb2 = new StringBuilder(protocolType.length() + requestType.length() + type.length() + 31 + 19 + 69);
            a1.g.A(sb2, "Either type: ", type, ", or requestType: ", requestType);
            throw new IllegalArgumentException(a1.g.r(" and protocolType: ", protocolType, " must be specified, but at least one contains an invalid blank value.", sb2));
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = d0.q(dest, 20293);
        d0.l(dest, 1, this.f10398a);
        d0.b(dest, 2, this.f10399b);
        d0.b(dest, 3, this.f10400c);
        d0.l(dest, 4, this.d);
        d0.l(dest, 5, this.f10401e);
        d0.l(dest, 6, this.f10402f);
        d0.r(dest, q6);
    }
}
