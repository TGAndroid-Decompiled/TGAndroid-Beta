package h7;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c3.h0;
public final class h extends p6.a {
    public static final Parcelable.Creator<h> CREATOR = new f6.i(19);
    public final String f12691a;
    public final Bundle f12692b;
    public final Bundle f12693c;
    public final String d;
    public final String e;
    public final String f12694f;

    public h(String type, Bundle credentialRetrievalData, Bundle candidateQueryData, String requestMatcher, String requestType, String protocolType) {
        boolean z10;
        kotlin.jvm.internal.i.e(type, "type");
        kotlin.jvm.internal.i.e(credentialRetrievalData, "credentialRetrievalData");
        kotlin.jvm.internal.i.e(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.i.e(requestMatcher, "requestMatcher");
        kotlin.jvm.internal.i.e(requestType, "requestType");
        kotlin.jvm.internal.i.e(protocolType, "protocolType");
        this.f12691a = type;
        this.f12692b = credentialRetrievalData;
        this.f12693c = candidateQueryData;
        this.d = requestMatcher;
        this.e = requestType;
        this.f12694f = protocolType;
        boolean z11 = true;
        if (!ae.k.e(requestType) && !ae.k.e(protocolType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        z11 = (!ae.k.e(type) && requestType.length() == 0 && protocolType.length() == 0) ? z11 : false;
        if (!z10 && !z11) {
            StringBuilder sb2 = new StringBuilder(protocolType.length() + requestType.length() + type.length() + 31 + 19 + 69);
            h0.r(sb2, "Either type: ", type, ", or requestType: ", requestType);
            throw new IllegalArgumentException(a1.g.q(" and protocolType: ", protocolType, " must be specified, but at least one contains an invalid blank value.", sb2));
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.i.e(dest, "dest");
        int q5 = df.q(dest, 20293);
        df.l(dest, 1, this.f12691a);
        df.b(dest, 2, this.f12692b);
        df.b(dest, 3, this.f12693c);
        df.l(dest, 4, this.d);
        df.l(dest, 5, this.e);
        df.l(dest, 6, this.f12694f);
        df.r(dest, q5);
    }
}
