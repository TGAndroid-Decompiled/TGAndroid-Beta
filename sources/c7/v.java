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
    public final y f4147a;
    public final b0 f4148b;
    public final byte[] f4149c;
    public final List d;
    public final Double e;
    public final List f4150f;
    public final m h;
    public final Integer f4151n;
    public final h0 f4152r;
    public final e f4153s;
    public final f v;
    public final String f4154w;
    public final ResultReceiver f4155x;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f4155x = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f4147a = b10.f4147a;
                this.f4148b = b10.f4148b;
                this.f4149c = b10.f4149c;
                this.d = b10.d;
                this.e = b10.e;
                this.f4150f = b10.f4150f;
                this.h = b10.h;
                this.f4151n = b10.f4151n;
                this.f4152r = b10.f4152r;
                this.f4153s = b10.f4153s;
                this.v = b10.v;
                this.f4154w = str2;
                return;
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
        n6.l.h(yVar);
        this.f4147a = yVar;
        n6.l.h(b0Var);
        this.f4148b = b0Var;
        n6.l.h(bArr);
        this.f4149c = bArr;
        n6.l.h(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f4150f = arrayList2;
        this.h = mVar;
        this.f4151n = num;
        this.f4152r = h0Var;
        if (str != null) {
            try {
                this.f4153s = e.a(str);
            } catch (d e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            this.f4153s = null;
        }
        this.v = fVar;
        this.f4154w = null;
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
        List list3 = vVar.f4150f;
        if (n6.l.l(this.f4147a, vVar.f4147a) && n6.l.l(this.f4148b, vVar.f4148b) && Arrays.equals(this.f4149c, vVar.f4149c) && n6.l.l(this.e, vVar.e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f4150f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && n6.l.l(this.h, vVar.h) && n6.l.l(this.f4151n, vVar.f4151n) && n6.l.l(this.f4152r, vVar.f4152r) && n6.l.l(this.f4153s, vVar.f4153s) && n6.l.l(this.v, vVar.v) && n6.l.l(this.f4154w, vVar.f4154w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4147a, this.f4148b, Integer.valueOf(Arrays.hashCode(this.f4149c)), this.d, this.e, this.f4150f, this.h, this.f4151n, this.f4152r, this.f4153s, this.v, this.f4154w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4147a);
        String valueOf2 = String.valueOf(this.f4148b);
        String c10 = u6.b.c(this.f4149c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f4150f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f4152r);
        String valueOf7 = String.valueOf(this.f4153s);
        String valueOf8 = String.valueOf(this.v);
        StringBuilder x10 = a4.a.x("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        a4.a.A(x10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        x10.append(this.e);
        x10.append(", \n excludeList=");
        x10.append(valueOf4);
        x10.append(", \n authenticatorSelection=");
        x10.append(valueOf5);
        x10.append(", \n requestId=");
        x10.append(this.f4151n);
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
        w7.e0.k(parcel, 2, this.f4147a, i10);
        w7.e0.k(parcel, 3, this.f4148b, i10);
        w7.e0.c(parcel, 4, this.f4149c);
        w7.e0.p(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            w7.e0.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        w7.e0.p(parcel, 7, this.f4150f);
        w7.e0.k(parcel, 8, this.h, i10);
        w7.e0.i(parcel, 9, this.f4151n);
        w7.e0.k(parcel, 10, this.f4152r, i10);
        e eVar = this.f4153s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f4076a;
        }
        w7.e0.l(parcel, 11, str);
        w7.e0.k(parcel, 12, this.v, i10);
        w7.e0.l(parcel, 13, this.f4154w);
        w7.e0.k(parcel, 14, this.f4155x, i10);
        w7.e0.r(parcel, q6);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f4147a = b10.f4147a;
            this.f4148b = b10.f4148b;
            this.f4149c = b10.f4149c;
            this.d = b10.d;
            this.e = b10.e;
            this.f4150f = b10.f4150f;
            this.h = b10.h;
            this.f4151n = b10.f4151n;
            this.f4152r = b10.f4152r;
            this.f4153s = b10.f4153s;
            this.v = b10.v;
            this.f4154w = str;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
