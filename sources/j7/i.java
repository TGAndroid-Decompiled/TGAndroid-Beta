package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import com.google.android.gms.internal.vision.e2;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new b(7);
    public final String f17399a;
    public final Bundle f17400b;
    public final Bundle f17401c;
    public final String d;
    public final String f17402e;
    public final String f17403f;

    public i(String type, Bundle credentialRetrievalData, Bundle candidateQueryData, String requestMatcher, String requestType, String protocolType) {
        boolean z10;
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialRetrievalData, "credentialRetrievalData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.j.e(requestMatcher, "requestMatcher");
        kotlin.jvm.internal.j.e(requestType, "requestType");
        kotlin.jvm.internal.j.e(protocolType, "protocolType");
        this.f17399a = type;
        this.f17400b = credentialRetrievalData;
        this.f17401c = candidateQueryData;
        this.d = requestMatcher;
        this.f17402e = requestType;
        this.f17403f = protocolType;
        boolean z11 = true;
        if (!xd.d.j(requestType) && !xd.d.j(protocolType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        z11 = (!xd.d.j(type) && requestType.length() == 0 && protocolType.length() == 0) ? z11 : false;
        if (!z10 && !z11) {
            StringBuilder sb2 = new StringBuilder(protocolType.length() + requestType.length() + type.length() + 31 + 19 + 69);
            e2.r(sb2, "Either type: ", type, ", or requestType: ", requestType);
            throw new IllegalArgumentException(p5.c.m(" and protocolType: ", protocolType, " must be specified, but at least one contains an invalid blank value.", sb2));
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = cc.r(dest, 20293);
        cc.l(dest, 1, this.f17399a);
        cc.b(dest, 2, this.f17400b);
        cc.b(dest, 3, this.f17401c);
        cc.l(dest, 4, this.d);
        cc.l(dest, 5, this.f17402e);
        cc.l(dest, 6, this.f17403f);
        cc.s(dest, r10);
    }
}
