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
    public final y f4152a;
    public final b0 f4153b;
    public final byte[] f4154c;
    public final List d;
    public final Double e;
    public final List f4155f;
    public final m h;
    public final Integer f4156n;
    public final h0 f4157r;
    public final e f4158s;
    public final f v;
    public final String f4159w;
    public final ResultReceiver f4160x;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f4160x = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f4152a = b10.f4152a;
                this.f4153b = b10.f4153b;
                this.f4154c = b10.f4154c;
                this.d = b10.d;
                this.e = b10.e;
                this.f4155f = b10.f4155f;
                this.h = b10.h;
                this.f4156n = b10.f4156n;
                this.f4157r = b10.f4157r;
                this.f4158s = b10.f4158s;
                this.v = b10.v;
                this.f4159w = str2;
                return;
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
        n6.l.h(yVar);
        this.f4152a = yVar;
        n6.l.h(b0Var);
        this.f4153b = b0Var;
        n6.l.h(bArr);
        this.f4154c = bArr;
        n6.l.h(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f4155f = arrayList2;
        this.h = mVar;
        this.f4156n = num;
        this.f4157r = h0Var;
        if (str != null) {
            try {
                this.f4158s = e.a(str);
            } catch (d e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            this.f4158s = null;
        }
        this.v = fVar;
        this.f4159w = null;
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
        List list3 = vVar.f4155f;
        if (n6.l.l(this.f4152a, vVar.f4152a) && n6.l.l(this.f4153b, vVar.f4153b) && Arrays.equals(this.f4154c, vVar.f4154c) && n6.l.l(this.e, vVar.e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f4155f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && n6.l.l(this.h, vVar.h) && n6.l.l(this.f4156n, vVar.f4156n) && n6.l.l(this.f4157r, vVar.f4157r) && n6.l.l(this.f4158s, vVar.f4158s) && n6.l.l(this.v, vVar.v) && n6.l.l(this.f4159w, vVar.f4159w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4152a, this.f4153b, Integer.valueOf(Arrays.hashCode(this.f4154c)), this.d, this.e, this.f4155f, this.h, this.f4156n, this.f4157r, this.f4158s, this.v, this.f4159w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4152a);
        String valueOf2 = String.valueOf(this.f4153b);
        String c10 = u6.b.c(this.f4154c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f4155f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f4157r);
        String valueOf7 = String.valueOf(this.f4158s);
        String valueOf8 = String.valueOf(this.v);
        StringBuilder x10 = a4.a.x("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        a4.a.A(x10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        x10.append(this.e);
        x10.append(", \n excludeList=");
        x10.append(valueOf4);
        x10.append(", \n authenticatorSelection=");
        x10.append(valueOf5);
        x10.append(", \n requestId=");
        x10.append(this.f4156n);
        x10.append(", \n tokenBinding=");
        x10.append(valueOf6);
        x10.append(", \n attestationConveyancePreference=");
        x10.append(valueOf7);
        x10.append(", \n authenticationExtensions=");
        x10.append(valueOf8);
        x10.append("}");
        return x10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String str;
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.f4152a, i10);
        w7.e0.k(parcel, 3, this.f4153b, i10);
        w7.e0.c(parcel, 4, this.f4154c);
        w7.e0.p(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            w7.e0.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        w7.e0.p(parcel, 7, this.f4155f);
        w7.e0.k(parcel, 8, this.h, i10);
        w7.e0.i(parcel, 9, this.f4156n);
        w7.e0.k(parcel, 10, this.f4157r, i10);
        e eVar = this.f4158s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f4081a;
        }
        w7.e0.l(parcel, 11, str);
        w7.e0.k(parcel, 12, this.v, i10);
        w7.e0.l(parcel, 13, this.f4159w);
        w7.e0.k(parcel, 14, this.f4160x, i10);
        w7.e0.r(parcel, q6);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f4152a = b10.f4152a;
            this.f4153b = b10.f4153b;
            this.f4154c = b10.f4154c;
            this.d = b10.d;
            this.e = b10.e;
            this.f4155f = b10.f4155f;
            this.h = b10.h;
            this.f4156n = b10.f4156n;
            this.f4157r = b10.f4157r;
            this.f4158s = b10.f4158s;
            this.v = b10.v;
            this.f4159w = str;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
