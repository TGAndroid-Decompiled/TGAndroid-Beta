package j7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import com.google.android.gms.internal.vision.e2;
import org.telegram.ui.Cells.y0;
public final class i extends r6.a {
    public static final Parcelable.Creator<i> CREATOR = new b(7);
    public final String f16923a;
    public final Bundle f16924b;
    public final Bundle f16925c;
    public final String d;
    public final String f16926e;
    public final String f16927f;

    public i(String type, Bundle credentialRetrievalData, Bundle candidateQueryData, String requestMatcher, String requestType, String protocolType) {
        boolean z10;
        kotlin.jvm.internal.j.e(type, "type");
        kotlin.jvm.internal.j.e(credentialRetrievalData, "credentialRetrievalData");
        kotlin.jvm.internal.j.e(candidateQueryData, "candidateQueryData");
        kotlin.jvm.internal.j.e(requestMatcher, "requestMatcher");
        kotlin.jvm.internal.j.e(requestType, "requestType");
        kotlin.jvm.internal.j.e(protocolType, "protocolType");
        this.f16923a = type;
        this.f16924b = credentialRetrievalData;
        this.f16925c = candidateQueryData;
        this.d = requestMatcher;
        this.f16926e = requestType;
        this.f16927f = protocolType;
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
            throw new IllegalArgumentException(y0.m(" and protocolType: ", protocolType, " must be specified, but at least one contains an invalid blank value.", sb2));
        }
    }

    @Override
    public final void writeToParcel(Parcel dest, int i7) {
        kotlin.jvm.internal.j.e(dest, "dest");
        int r10 = yb.r(dest, 20293);
        yb.l(dest, 1, this.f16923a);
        yb.b(dest, 2, this.f16924b);
        yb.b(dest, 3, this.f16925c);
        yb.l(dest, 4, this.d);
        yb.l(dest, 5, this.f16926e);
        yb.l(dest, 6, this.f16927f);
        yb.s(dest, r10);
    }
}
