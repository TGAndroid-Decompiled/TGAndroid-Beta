package g7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import w7.f0;
public final class h extends o6.a {
    public static final Parcelable.Creator<h> CREATOR = new e6.i(19);
    public final String f10914a;
    public final Bundle f10915b;
    public final Bundle f10916c;
    public final String d;
    public final String e;
    public final String f10917f;

    public h(String type, Bundle credentialRetrievalData, Bundle candidateQueryData, String requestMatcher, String requestType, String protocolType) {
        boolean z10;
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(credentialRetrievalData, "credentialRetrievalData");
        kotlin.jvm.internal.i.e(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.i.e(requestMatcher, "requestMatcher");
        kotlin.jvm.internal.i.e(requestType, "requestType");
        kotlin.jvm.internal.i.e(protocolType, "protocolType");
        this.f10914a = type;
        this.f10915b = credentialRetrievalData;
        this.f10916c = candidateQueryData;
        this.d = requestMatcher;
        this.e = requestType;
        this.f10917f = protocolType;
        boolean z11 = true;
        if (!zd.j.e(requestType) && !zd.j.e(protocolType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        z11 = (!zd.j.e(type) && requestType.length() == 0 && protocolType.length() == 0) ? z11 : false;
        if (!z10 && !z11) {
            StringBuilder sb2 = new StringBuilder(protocolType.length() + requestType.length() + type.length() + 31 + 19 + 69);
            a1.g.A(sb2, "Either type: ", type, ", or requestType: ", requestType);
            throw new IllegalArgumentException(a1.g.q(" and protocolType: ", protocolType, " must be specified, but at least one contains an invalid blank value.", sb2));
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q6 = f0.q(dest, 20293);
        f0.l(dest, 1, this.f10914a);
        f0.b(dest, 2, this.f10915b);
        f0.b(dest, 3, this.f10916c);
        f0.l(dest, 4, this.d);
        f0.l(dest, 5, this.e);
        f0.l(dest, 6, this.f10917f);
        f0.r(dest, q6);
    }
}
