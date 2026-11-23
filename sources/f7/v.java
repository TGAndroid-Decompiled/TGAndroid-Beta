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
    public final y f11566a;
    public final b0 f11567b;
    public final byte[] f11568c;
    public final List d;
    public final Double f11569e;
    public final List f11570f;
    public final m h;
    public final Integer f11571n;
    public final h0 f11572r;
    public final e f11573s;
    public final f f11574w;
    public final String f11575x;
    public final ResultReceiver f11576y;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f11576y = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f11566a = b10.f11566a;
                this.f11567b = b10.f11567b;
                this.f11568c = b10.f11568c;
                this.d = b10.d;
                this.f11569e = b10.f11569e;
                this.f11570f = b10.f11570f;
                this.h = b10.h;
                this.f11571n = b10.f11571n;
                this.f11572r = b10.f11572r;
                this.f11573s = b10.f11573s;
                this.f11574w = b10.f11574w;
                this.f11575x = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        q6.m.h(yVar);
        this.f11566a = yVar;
        q6.m.h(b0Var);
        this.f11567b = b0Var;
        q6.m.h(bArr);
        this.f11568c = bArr;
        q6.m.h(arrayList);
        this.d = arrayList;
        this.f11569e = d;
        this.f11570f = arrayList2;
        this.h = mVar;
        this.f11571n = num;
        this.f11572r = h0Var;
        if (str != null) {
            try {
                this.f11573s = e.a(str);
            } catch (d e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f11573s = null;
        }
        this.f11574w = fVar;
        this.f11575x = null;
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
        List list3 = vVar.f11570f;
        if (q6.m.l(this.f11566a, vVar.f11566a) && q6.m.l(this.f11567b, vVar.f11567b) && Arrays.equals(this.f11568c, vVar.f11568c) && q6.m.l(this.f11569e, vVar.f11569e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f11570f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && q6.m.l(this.h, vVar.h) && q6.m.l(this.f11571n, vVar.f11571n) && q6.m.l(this.f11572r, vVar.f11572r) && q6.m.l(this.f11573s, vVar.f11573s) && q6.m.l(this.f11574w, vVar.f11574w) && q6.m.l(this.f11575x, vVar.f11575x))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11566a, this.f11567b, Integer.valueOf(Arrays.hashCode(this.f11568c)), this.d, this.f11569e, this.f11570f, this.h, this.f11571n, this.f11572r, this.f11573s, this.f11574w, this.f11575x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11566a);
        String valueOf2 = String.valueOf(this.f11567b);
        String c10 = x6.b.c(this.f11568c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f11570f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f11572r);
        String valueOf7 = String.valueOf(this.f11573s);
        String valueOf8 = String.valueOf(this.f11574w);
        StringBuilder n10 = e2.n("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        e2.r(n10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        n10.append(this.f11569e);
        n10.append(", \n excludeList=");
        n10.append(valueOf4);
        n10.append(", \n authenticatorSelection=");
        n10.append(valueOf5);
        n10.append(", \n requestId=");
        n10.append(this.f11571n);
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
        cc.k(parcel, 2, this.f11566a, i7);
        cc.k(parcel, 3, this.f11567b, i7);
        cc.c(parcel, 4, this.f11568c);
        cc.p(parcel, 5, this.d);
        Double d = this.f11569e;
        if (d != null) {
            cc.q(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        cc.p(parcel, 7, this.f11570f);
        cc.k(parcel, 8, this.h, i7);
        cc.i(parcel, 9, this.f11571n);
        cc.k(parcel, 10, this.f11572r, i7);
        e eVar = this.f11573s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f11489a;
        }
        cc.l(parcel, 11, str);
        cc.k(parcel, 12, this.f11574w, i7);
        cc.l(parcel, 13, this.f11575x);
        cc.k(parcel, 14, this.f11576y, i7);
        cc.s(parcel, r10);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f11566a = b10.f11566a;
            this.f11567b = b10.f11567b;
            this.f11568c = b10.f11568c;
            this.d = b10.d;
            this.f11569e = b10.f11569e;
            this.f11570f = b10.f11570f;
            this.h = b10.h;
            this.f11571n = b10.f11571n;
            this.f11572r = b10.f11572r;
            this.f11573s = b10.f11573s;
            this.f11574w = b10.f11574w;
            this.f11575x = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
