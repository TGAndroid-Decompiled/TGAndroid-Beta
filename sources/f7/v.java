package f7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
public final class v extends r6.a {
    public static final Parcelable.Creator<v> CREATOR = new db.k(13);
    public final y f11571a;
    public final b0 f11572b;
    public final byte[] f11573c;
    public final List d;
    public final Double f11574e;
    public final List f11575f;
    public final m h;
    public final Integer f11576n;
    public final h0 f11577r;
    public final e f11578s;
    public final f f11579w;
    public final String f11580x;
    public final ResultReceiver f11581y;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f11581y = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f11571a = b10.f11571a;
                this.f11572b = b10.f11572b;
                this.f11573c = b10.f11573c;
                this.d = b10.d;
                this.f11574e = b10.f11574e;
                this.f11575f = b10.f11575f;
                this.h = b10.h;
                this.f11576n = b10.f11576n;
                this.f11577r = b10.f11577r;
                this.f11578s = b10.f11578s;
                this.f11579w = b10.f11579w;
                this.f11580x = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        q6.m.h(yVar);
        this.f11571a = yVar;
        q6.m.h(b0Var);
        this.f11572b = b0Var;
        q6.m.h(bArr);
        this.f11573c = bArr;
        q6.m.h(arrayList);
        this.d = arrayList;
        this.f11574e = d;
        this.f11575f = arrayList2;
        this.h = mVar;
        this.f11576n = num;
        this.f11577r = h0Var;
        if (str != null) {
            try {
                this.f11578s = e.a(str);
            } catch (d e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f11578s = null;
        }
        this.f11579w = fVar;
        this.f11580x = null;
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
        List list3 = vVar.f11575f;
        if (q6.m.l(this.f11571a, vVar.f11571a) && q6.m.l(this.f11572b, vVar.f11572b) && Arrays.equals(this.f11573c, vVar.f11573c) && q6.m.l(this.f11574e, vVar.f11574e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f11575f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && q6.m.l(this.h, vVar.h) && q6.m.l(this.f11576n, vVar.f11576n) && q6.m.l(this.f11577r, vVar.f11577r) && q6.m.l(this.f11578s, vVar.f11578s) && q6.m.l(this.f11579w, vVar.f11579w) && q6.m.l(this.f11580x, vVar.f11580x))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11571a, this.f11572b, Integer.valueOf(Arrays.hashCode(this.f11573c)), this.d, this.f11574e, this.f11575f, this.h, this.f11576n, this.f11577r, this.f11578s, this.f11579w, this.f11580x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11571a);
        String valueOf2 = String.valueOf(this.f11572b);
        String c10 = x6.b.c(this.f11573c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f11575f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f11577r);
        String valueOf7 = String.valueOf(this.f11578s);
        String valueOf8 = String.valueOf(this.f11579w);
        StringBuilder n10 = e2.n("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        e2.r(n10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        n10.append(this.f11574e);
        n10.append(", \n excludeList=");
        n10.append(valueOf4);
        n10.append(", \n authenticatorSelection=");
        n10.append(valueOf5);
        n10.append(", \n requestId=");
        n10.append(this.f11576n);
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
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f11571a, i7);
        bc.k(parcel, 3, this.f11572b, i7);
        bc.c(parcel, 4, this.f11573c);
        bc.p(parcel, 5, this.d);
        Double d = this.f11574e;
        if (d != null) {
            bc.q(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        bc.p(parcel, 7, this.f11575f);
        bc.k(parcel, 8, this.h, i7);
        bc.i(parcel, 9, this.f11576n);
        bc.k(parcel, 10, this.f11577r, i7);
        e eVar = this.f11578s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f11494a;
        }
        bc.l(parcel, 11, str);
        bc.k(parcel, 12, this.f11579w, i7);
        bc.l(parcel, 13, this.f11580x);
        bc.k(parcel, 14, this.f11581y, i7);
        bc.s(parcel, r10);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f11571a = b10.f11571a;
            this.f11572b = b10.f11572b;
            this.f11573c = b10.f11573c;
            this.d = b10.d;
            this.f11574e = b10.f11574e;
            this.f11575f = b10.f11575f;
            this.h = b10.h;
            this.f11576n = b10.f11576n;
            this.f11577r = b10.f11577r;
            this.f11578s = b10.f11578s;
            this.f11579w = b10.f11579w;
            this.f11580x = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
