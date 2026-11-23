package f7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c8.cc;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
public final class v extends r6.a {
    public static final Parcelable.Creator<v> CREATOR = new db.k(13);
    public final y f11565a;
    public final b0 f11566b;
    public final byte[] f11567c;
    public final List d;
    public final Double f11568e;
    public final List f11569f;
    public final m h;
    public final Integer f11570n;
    public final h0 f11571r;
    public final e f11572s;
    public final f f11573w;
    public final String f11574x;
    public final ResultReceiver f11575y;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f11575y = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f11565a = b10.f11565a;
                this.f11566b = b10.f11566b;
                this.f11567c = b10.f11567c;
                this.d = b10.d;
                this.f11568e = b10.f11568e;
                this.f11569f = b10.f11569f;
                this.h = b10.h;
                this.f11570n = b10.f11570n;
                this.f11571r = b10.f11571r;
                this.f11572s = b10.f11572s;
                this.f11573w = b10.f11573w;
                this.f11574x = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        q6.m.h(yVar);
        this.f11565a = yVar;
        q6.m.h(b0Var);
        this.f11566b = b0Var;
        q6.m.h(bArr);
        this.f11567c = bArr;
        q6.m.h(arrayList);
        this.d = arrayList;
        this.f11568e = d;
        this.f11569f = arrayList2;
        this.h = mVar;
        this.f11570n = num;
        this.f11571r = h0Var;
        if (str != null) {
            try {
                this.f11572s = e.a(str);
            } catch (d e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f11572s = null;
        }
        this.f11573w = fVar;
        this.f11574x = null;
    }

    public static f7.v b(org.json.JSONObject r32) {
        throw new UnsupportedOperationException("Method not decompiled: f7.v.b(org.json.JSONObject):f7.v");
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        List list2 = vVar.d;
        List list3 = vVar.f11569f;
        if (q6.m.l(this.f11565a, vVar.f11565a) && q6.m.l(this.f11566b, vVar.f11566b) && Arrays.equals(this.f11567c, vVar.f11567c) && q6.m.l(this.f11568e, vVar.f11568e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f11569f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && q6.m.l(this.h, vVar.h) && q6.m.l(this.f11570n, vVar.f11570n) && q6.m.l(this.f11571r, vVar.f11571r) && q6.m.l(this.f11572s, vVar.f11572s) && q6.m.l(this.f11573w, vVar.f11573w) && q6.m.l(this.f11574x, vVar.f11574x))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11565a, this.f11566b, Integer.valueOf(Arrays.hashCode(this.f11567c)), this.d, this.f11568e, this.f11569f, this.h, this.f11570n, this.f11571r, this.f11572s, this.f11573w, this.f11574x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11565a);
        String valueOf2 = String.valueOf(this.f11566b);
        String c10 = x6.b.c(this.f11567c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f11569f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f11571r);
        String valueOf7 = String.valueOf(this.f11572s);
        String valueOf8 = String.valueOf(this.f11573w);
        StringBuilder n10 = e2.n("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        e2.r(n10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        n10.append(this.f11568e);
        n10.append(", \n excludeList=");
        n10.append(valueOf4);
        n10.append(", \n authenticatorSelection=");
        n10.append(valueOf5);
        n10.append(", \n requestId=");
        n10.append(this.f11570n);
        n10.append(", \n tokenBinding=");
        n10.append(valueOf6);
        n10.append(", \n attestationConveyancePreference=");
        n10.append(valueOf7);
        n10.append(", \n authenticationExtensions=");
        n10.append(valueOf8);
        n10.append("}");
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str;
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.f11565a, i7);
        cc.k(parcel, 3, this.f11566b, i7);
        cc.c(parcel, 4, this.f11567c);
        cc.p(parcel, 5, this.d);
        Double d = this.f11568e;
        if (d != null) {
            cc.q(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        cc.p(parcel, 7, this.f11569f);
        cc.k(parcel, 8, this.h, i7);
        cc.i(parcel, 9, this.f11570n);
        cc.k(parcel, 10, this.f11571r, i7);
        e eVar = this.f11572s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f11488a;
        }
        cc.l(parcel, 11, str);
        cc.k(parcel, 12, this.f11573w, i7);
        cc.l(parcel, 13, this.f11574x);
        cc.k(parcel, 14, this.f11575y, i7);
        cc.s(parcel, r10);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f11565a = b10.f11565a;
            this.f11566b = b10.f11566b;
            this.f11567c = b10.f11567c;
            this.d = b10.d;
            this.f11568e = b10.f11568e;
            this.f11569f = b10.f11569f;
            this.h = b10.h;
            this.f11570n = b10.f11570n;
            this.f11571r = b10.f11571r;
            this.f11572s = b10.f11572s;
            this.f11573w = b10.f11573w;
            this.f11574x = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
