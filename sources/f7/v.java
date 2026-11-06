package f7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c8.wb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
public final class v extends r6.a {
    public static final Parcelable.Creator<v> CREATOR = new db.k(13);
    public final y f11440a;
    public final b0 f11441b;
    public final byte[] f11442c;
    public final List d;
    public final Double f11443e;
    public final List f11444f;
    public final m h;
    public final Integer f11445n;
    public final h0 f11446r;
    public final e f11447s;
    public final f f11448w;
    public final String f11449x;
    public final ResultReceiver f11450y;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f11450y = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f11440a = b10.f11440a;
                this.f11441b = b10.f11441b;
                this.f11442c = b10.f11442c;
                this.d = b10.d;
                this.f11443e = b10.f11443e;
                this.f11444f = b10.f11444f;
                this.h = b10.h;
                this.f11445n = b10.f11445n;
                this.f11446r = b10.f11446r;
                this.f11447s = b10.f11447s;
                this.f11448w = b10.f11448w;
                this.f11449x = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        q6.m.g(yVar);
        this.f11440a = yVar;
        q6.m.g(b0Var);
        this.f11441b = b0Var;
        q6.m.g(bArr);
        this.f11442c = bArr;
        q6.m.g(arrayList);
        this.d = arrayList;
        this.f11443e = d;
        this.f11444f = arrayList2;
        this.h = mVar;
        this.f11445n = num;
        this.f11446r = h0Var;
        if (str != null) {
            try {
                this.f11447s = e.a(str);
            } catch (d e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f11447s = null;
        }
        this.f11448w = fVar;
        this.f11449x = null;
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
        List list3 = vVar.f11444f;
        if (q6.m.k(this.f11440a, vVar.f11440a) && q6.m.k(this.f11441b, vVar.f11441b) && Arrays.equals(this.f11442c, vVar.f11442c) && q6.m.k(this.f11443e, vVar.f11443e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f11444f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && q6.m.k(this.h, vVar.h) && q6.m.k(this.f11445n, vVar.f11445n) && q6.m.k(this.f11446r, vVar.f11446r) && q6.m.k(this.f11447s, vVar.f11447s) && q6.m.k(this.f11448w, vVar.f11448w) && q6.m.k(this.f11449x, vVar.f11449x))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11440a, this.f11441b, Integer.valueOf(Arrays.hashCode(this.f11442c)), this.d, this.f11443e, this.f11444f, this.h, this.f11445n, this.f11446r, this.f11447s, this.f11448w, this.f11449x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11440a);
        String valueOf2 = String.valueOf(this.f11441b);
        String c10 = x6.b.c(this.f11442c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f11444f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f11446r);
        String valueOf7 = String.valueOf(this.f11447s);
        String valueOf8 = String.valueOf(this.f11448w);
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        com.google.android.recaptcha.internal.a.s(n10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        n10.append(this.f11443e);
        n10.append(", \n excludeList=");
        n10.append(valueOf4);
        n10.append(", \n authenticatorSelection=");
        n10.append(valueOf5);
        n10.append(", \n requestId=");
        n10.append(this.f11445n);
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
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 2, this.f11440a, i7);
        wb.k(parcel, 3, this.f11441b, i7);
        wb.c(parcel, 4, this.f11442c);
        wb.p(parcel, 5, this.d);
        Double d = this.f11443e;
        if (d != null) {
            wb.q(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        wb.p(parcel, 7, this.f11444f);
        wb.k(parcel, 8, this.h, i7);
        wb.i(parcel, 9, this.f11445n);
        wb.k(parcel, 10, this.f11446r, i7);
        e eVar = this.f11447s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f11363a;
        }
        wb.l(parcel, 11, str);
        wb.k(parcel, 12, this.f11448w, i7);
        wb.l(parcel, 13, this.f11449x);
        wb.k(parcel, 14, this.f11450y, i7);
        wb.s(parcel, r10);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f11440a = b10.f11440a;
            this.f11441b = b10.f11441b;
            this.f11442c = b10.f11442c;
            this.d = b10.d;
            this.f11443e = b10.f11443e;
            this.f11444f = b10.f11444f;
            this.h = b10.h;
            this.f11445n = b10.f11445n;
            this.f11446r = b10.f11446r;
            this.f11447s = b10.f11447s;
            this.f11448w = b10.f11448w;
            this.f11449x = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
