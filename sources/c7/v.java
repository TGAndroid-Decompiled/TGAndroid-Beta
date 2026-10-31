package c7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
public final class v extends o6.a {
    public static final Parcelable.Creator<v> CREATOR = new w.a(24);
    public final y f4044a;
    public final b0 f4045b;
    public final byte[] f4046c;
    public final List d;
    public final Double e;
    public final List f4047f;
    public final m h;
    public final Integer f4048n;
    public final h0 f4049r;
    public final e f4050s;
    public final f f4051w;
    public final String f4052x;
    public final ResultReceiver f4053y;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f4053y = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f4044a = b10.f4044a;
                this.f4045b = b10.f4045b;
                this.f4046c = b10.f4046c;
                this.d = b10.d;
                this.e = b10.e;
                this.f4047f = b10.f4047f;
                this.h = b10.h;
                this.f4048n = b10.f4048n;
                this.f4049r = b10.f4049r;
                this.f4050s = b10.f4050s;
                this.f4051w = b10.f4051w;
                this.f4052x = str2;
                return;
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
        n6.l.g(yVar);
        this.f4044a = yVar;
        n6.l.g(b0Var);
        this.f4045b = b0Var;
        n6.l.g(bArr);
        this.f4046c = bArr;
        n6.l.g(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f4047f = arrayList2;
        this.h = mVar;
        this.f4048n = num;
        this.f4049r = h0Var;
        if (str != null) {
            try {
                this.f4050s = e.a(str);
            } catch (d e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            this.f4050s = null;
        }
        this.f4051w = fVar;
        this.f4052x = null;
    }

    public static c7.v b(org.json.JSONObject r32) {
        throw new UnsupportedOperationException("Method not decompiled: c7.v.b(org.json.JSONObject):c7.v");
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        List list2 = vVar.d;
        List list3 = vVar.f4047f;
        if (n6.l.k(this.f4044a, vVar.f4044a) && n6.l.k(this.f4045b, vVar.f4045b) && Arrays.equals(this.f4046c, vVar.f4046c) && n6.l.k(this.e, vVar.e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f4047f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && n6.l.k(this.h, vVar.h) && n6.l.k(this.f4048n, vVar.f4048n) && n6.l.k(this.f4049r, vVar.f4049r) && n6.l.k(this.f4050s, vVar.f4050s) && n6.l.k(this.f4051w, vVar.f4051w) && n6.l.k(this.f4052x, vVar.f4052x))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4044a, this.f4045b, Integer.valueOf(Arrays.hashCode(this.f4046c)), this.d, this.e, this.f4047f, this.h, this.f4048n, this.f4049r, this.f4050s, this.f4051w, this.f4052x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4044a);
        String valueOf2 = String.valueOf(this.f4045b);
        String c10 = u6.b.c(this.f4046c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f4047f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f4049r);
        String valueOf7 = String.valueOf(this.f4050s);
        String valueOf8 = String.valueOf(this.f4051w);
        StringBuilder v = a1.g.v("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        c3.i0.r(v, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        v.append(this.e);
        v.append(", \n excludeList=");
        v.append(valueOf4);
        v.append(", \n authenticatorSelection=");
        v.append(valueOf5);
        v.append(", \n requestId=");
        v.append(this.f4048n);
        v.append(", \n tokenBinding=");
        v.append(valueOf6);
        v.append(", \n attestationConveyancePreference=");
        v.append(valueOf7);
        v.append(", \n authenticationExtensions=");
        v.append(valueOf8);
        v.append("}");
        return v.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String str;
        int q6 = w7.h0.q(parcel, 20293);
        w7.h0.k(parcel, 2, this.f4044a, i10);
        w7.h0.k(parcel, 3, this.f4045b, i10);
        w7.h0.c(parcel, 4, this.f4046c);
        w7.h0.p(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            w7.h0.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        w7.h0.p(parcel, 7, this.f4047f);
        w7.h0.k(parcel, 8, this.h, i10);
        w7.h0.i(parcel, 9, this.f4048n);
        w7.h0.k(parcel, 10, this.f4049r, i10);
        e eVar = this.f4050s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f3972a;
        }
        w7.h0.l(parcel, 11, str);
        w7.h0.k(parcel, 12, this.f4051w, i10);
        w7.h0.l(parcel, 13, this.f4052x);
        w7.h0.k(parcel, 14, this.f4053y, i10);
        w7.h0.r(parcel, q6);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f4044a = b10.f4044a;
            this.f4045b = b10.f4045b;
            this.f4046c = b10.f4046c;
            this.d = b10.d;
            this.e = b10.e;
            this.f4047f = b10.f4047f;
            this.h = b10.h;
            this.f4048n = b10.f4048n;
            this.f4049r = b10.f4049r;
            this.f4050s = b10.f4050s;
            this.f4051w = b10.f4051w;
            this.f4052x = str;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
