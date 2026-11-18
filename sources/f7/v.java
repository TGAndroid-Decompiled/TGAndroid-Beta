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
    public final y f11574a;
    public final b0 f11575b;
    public final byte[] f11576c;
    public final List d;
    public final Double f11577e;
    public final List f11578f;
    public final m h;
    public final Integer f11579n;
    public final h0 f11580r;
    public final e f11581s;
    public final f f11582w;
    public final String f11583x;
    public final ResultReceiver f11584y;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f11584y = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f11574a = b10.f11574a;
                this.f11575b = b10.f11575b;
                this.f11576c = b10.f11576c;
                this.d = b10.d;
                this.f11577e = b10.f11577e;
                this.f11578f = b10.f11578f;
                this.h = b10.h;
                this.f11579n = b10.f11579n;
                this.f11580r = b10.f11580r;
                this.f11581s = b10.f11581s;
                this.f11582w = b10.f11582w;
                this.f11583x = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        q6.m.h(yVar);
        this.f11574a = yVar;
        q6.m.h(b0Var);
        this.f11575b = b0Var;
        q6.m.h(bArr);
        this.f11576c = bArr;
        q6.m.h(arrayList);
        this.d = arrayList;
        this.f11577e = d;
        this.f11578f = arrayList2;
        this.h = mVar;
        this.f11579n = num;
        this.f11580r = h0Var;
        if (str != null) {
            try {
                this.f11581s = e.a(str);
            } catch (d e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f11581s = null;
        }
        this.f11582w = fVar;
        this.f11583x = null;
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
        List list3 = vVar.f11578f;
        if (q6.m.l(this.f11574a, vVar.f11574a) && q6.m.l(this.f11575b, vVar.f11575b) && Arrays.equals(this.f11576c, vVar.f11576c) && q6.m.l(this.f11577e, vVar.f11577e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f11578f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && q6.m.l(this.h, vVar.h) && q6.m.l(this.f11579n, vVar.f11579n) && q6.m.l(this.f11580r, vVar.f11580r) && q6.m.l(this.f11581s, vVar.f11581s) && q6.m.l(this.f11582w, vVar.f11582w) && q6.m.l(this.f11583x, vVar.f11583x))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11574a, this.f11575b, Integer.valueOf(Arrays.hashCode(this.f11576c)), this.d, this.f11577e, this.f11578f, this.h, this.f11579n, this.f11580r, this.f11581s, this.f11582w, this.f11583x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11574a);
        String valueOf2 = String.valueOf(this.f11575b);
        String c10 = x6.b.c(this.f11576c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f11578f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f11580r);
        String valueOf7 = String.valueOf(this.f11581s);
        String valueOf8 = String.valueOf(this.f11582w);
        StringBuilder n10 = e2.n("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        e2.r(n10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        n10.append(this.f11577e);
        n10.append(", \n excludeList=");
        n10.append(valueOf4);
        n10.append(", \n authenticatorSelection=");
        n10.append(valueOf5);
        n10.append(", \n requestId=");
        n10.append(this.f11579n);
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
        bc.k(parcel, 2, this.f11574a, i7);
        bc.k(parcel, 3, this.f11575b, i7);
        bc.c(parcel, 4, this.f11576c);
        bc.p(parcel, 5, this.d);
        Double d = this.f11577e;
        if (d != null) {
            bc.q(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        bc.p(parcel, 7, this.f11578f);
        bc.k(parcel, 8, this.h, i7);
        bc.i(parcel, 9, this.f11579n);
        bc.k(parcel, 10, this.f11580r, i7);
        e eVar = this.f11581s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f11497a;
        }
        bc.l(parcel, 11, str);
        bc.k(parcel, 12, this.f11582w, i7);
        bc.l(parcel, 13, this.f11583x);
        bc.k(parcel, 14, this.f11584y, i7);
        bc.s(parcel, r10);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f11574a = b10.f11574a;
            this.f11575b = b10.f11575b;
            this.f11576c = b10.f11576c;
            this.d = b10.d;
            this.f11577e = b10.f11577e;
            this.f11578f = b10.f11578f;
            this.h = b10.h;
            this.f11579n = b10.f11579n;
            this.f11580r = b10.f11580r;
            this.f11581s = b10.f11581s;
            this.f11582w = b10.f11582w;
            this.f11583x = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
