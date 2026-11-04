package i7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;
import org.telegram.ui.Cells.f1;
public final class h extends q6.a {
    public static final Parcelable.Creator<h> CREATOR = new c0(22);
    public final String f14681a;
    public final Bundle f14682b;
    public final Bundle f14683c;
    public final String d;
    public final String f14684e;
    public final String f14685f;

    public h(String type, Bundle credentialRetrievalData, Bundle candidateQueryData, String requestMatcher, String requestType, String protocolType) {
        boolean z10;
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialRetrievalData, "credentialRetrievalData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.j.e(requestMatcher, "requestMatcher");
        kotlin.jvm.internal.j.e(requestType, "requestType");
        kotlin.jvm.internal.j.e(protocolType, "protocolType");
        this.f14681a = type;
        this.f14682b = credentialRetrievalData;
        this.f14683c = candidateQueryData;
        this.d = requestMatcher;
        this.f14684e = requestType;
        this.f14685f = protocolType;
        boolean z11 = true;
        if (!ud.d.j(requestType) && !ud.d.j(protocolType)) {
            z10 = true;
        } else {
            z10 = false;
        }
        z11 = (!ud.d.j(type) && requestType.length() == 0 && protocolType.length() == 0) ? z11 : false;
        if (!z10 && !z11) {
            StringBuilder sb2 = new StringBuilder(protocolType.length() + requestType.length() + type.length() + 31 + 19 + 69);
            com.google.android.recaptcha.internal.a.s(sb2, "Either type: ", type, ", or requestType: ", requestType);
            throw new IllegalArgumentException(f1.r(" and protocolType: ", protocolType, " must be specified, but at least one contains an invalid blank value.", sb2));
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i3) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int s6 = j8.a.s(dest, 20293);
        j8.a.m(dest, 1, this.f14681a);
        j8.a.c(dest, 2, this.f14682b);
        j8.a.c(dest, 3, this.f14683c);
        j8.a.m(dest, 4, this.d);
        j8.a.m(dest, 5, this.f14684e);
        j8.a.m(dest, 6, this.f14685f);
        j8.a.t(dest, s6);
    }
}
