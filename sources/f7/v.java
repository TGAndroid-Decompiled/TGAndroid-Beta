package f7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c8.xb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
public final class v extends r6.a {
    public static final Parcelable.Creator<v> CREATOR = new db.k(13);
    public final y f11445a;
    public final b0 f11446b;
    public final byte[] f11447c;
    public final List d;
    public final Double f11448e;
    public final List f11449f;
    public final m h;
    public final Integer f11450n;
    public final h0 f11451r;
    public final e f11452s;
    public final f f11453w;
    public final String f11454x;
    public final ResultReceiver f11455y;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f11455y = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f11445a = b10.f11445a;
                this.f11446b = b10.f11446b;
                this.f11447c = b10.f11447c;
                this.d = b10.d;
                this.f11448e = b10.f11448e;
                this.f11449f = b10.f11449f;
                this.h = b10.h;
                this.f11450n = b10.f11450n;
                this.f11451r = b10.f11451r;
                this.f11452s = b10.f11452s;
                this.f11453w = b10.f11453w;
                this.f11454x = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        q6.m.g(yVar);
        this.f11445a = yVar;
        q6.m.g(b0Var);
        this.f11446b = b0Var;
        q6.m.g(bArr);
        this.f11447c = bArr;
        q6.m.g(arrayList);
        this.d = arrayList;
        this.f11448e = d;
        this.f11449f = arrayList2;
        this.h = mVar;
        this.f11450n = num;
        this.f11451r = h0Var;
        if (str != null) {
            try {
                this.f11452s = e.a(str);
            } catch (d e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f11452s = null;
        }
        this.f11453w = fVar;
        this.f11454x = null;
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
        List list3 = vVar.f11449f;
        if (q6.m.k(this.f11445a, vVar.f11445a) && q6.m.k(this.f11446b, vVar.f11446b) && Arrays.equals(this.f11447c, vVar.f11447c) && q6.m.k(this.f11448e, vVar.f11448e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f11449f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && q6.m.k(this.h, vVar.h) && q6.m.k(this.f11450n, vVar.f11450n) && q6.m.k(this.f11451r, vVar.f11451r) && q6.m.k(this.f11452s, vVar.f11452s) && q6.m.k(this.f11453w, vVar.f11453w) && q6.m.k(this.f11454x, vVar.f11454x))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11445a, this.f11446b, Integer.valueOf(Arrays.hashCode(this.f11447c)), this.d, this.f11448e, this.f11449f, this.h, this.f11450n, this.f11451r, this.f11452s, this.f11453w, this.f11454x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11445a);
        String valueOf2 = String.valueOf(this.f11446b);
        String c10 = x6.b.c(this.f11447c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f11449f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f11451r);
        String valueOf7 = String.valueOf(this.f11452s);
        String valueOf8 = String.valueOf(this.f11453w);
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        com.google.android.recaptcha.internal.a.s(n10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        n10.append(this.f11448e);
        n10.append(", \n excludeList=");
        n10.append(valueOf4);
        n10.append(", \n authenticatorSelection=");
        n10.append(valueOf5);
        n10.append(", \n requestId=");
        n10.append(this.f11450n);
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
        int r10 = xb.r(parcel, 20293);
        xb.k(parcel, 2, this.f11445a, i7);
        xb.k(parcel, 3, this.f11446b, i7);
        xb.c(parcel, 4, this.f11447c);
        xb.p(parcel, 5, this.d);
        Double d = this.f11448e;
        if (d != null) {
            xb.q(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        xb.p(parcel, 7, this.f11449f);
        xb.k(parcel, 8, this.h, i7);
        xb.i(parcel, 9, this.f11450n);
        xb.k(parcel, 10, this.f11451r, i7);
        e eVar = this.f11452s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f11368a;
        }
        xb.l(parcel, 11, str);
        xb.k(parcel, 12, this.f11453w, i7);
        xb.l(parcel, 13, this.f11454x);
        xb.k(parcel, 14, this.f11455y, i7);
        xb.s(parcel, r10);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f11445a = b10.f11445a;
            this.f11446b = b10.f11446b;
            this.f11447c = b10.f11447c;
            this.d = b10.d;
            this.f11448e = b10.f11448e;
            this.f11449f = b10.f11449f;
            this.h = b10.h;
            this.f11450n = b10.f11450n;
            this.f11451r = b10.f11451r;
            this.f11452s = b10.f11452s;
            this.f11453w = b10.f11453w;
            this.f11454x = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
