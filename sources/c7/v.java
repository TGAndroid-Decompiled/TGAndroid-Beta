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
    public final y f4155a;
    public final b0 f4156b;
    public final byte[] f4157c;
    public final List d;
    public final Double e;
    public final List f4158f;
    public final m h;
    public final Integer f4159n;
    public final h0 f4160r;
    public final e f4161s;
    public final f v;
    public final String f4162w;
    public final ResultReceiver f4163x;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f4163x = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f4155a = b10.f4155a;
                this.f4156b = b10.f4156b;
                this.f4157c = b10.f4157c;
                this.d = b10.d;
                this.e = b10.e;
                this.f4158f = b10.f4158f;
                this.h = b10.h;
                this.f4159n = b10.f4159n;
                this.f4160r = b10.f4160r;
                this.f4161s = b10.f4161s;
                this.v = b10.v;
                this.f4162w = str2;
                return;
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
        n6.l.h(yVar);
        this.f4155a = yVar;
        n6.l.h(b0Var);
        this.f4156b = b0Var;
        n6.l.h(bArr);
        this.f4157c = bArr;
        n6.l.h(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f4158f = arrayList2;
        this.h = mVar;
        this.f4159n = num;
        this.f4160r = h0Var;
        if (str != null) {
            try {
                this.f4161s = e.a(str);
            } catch (d e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            this.f4161s = null;
        }
        this.v = fVar;
        this.f4162w = null;
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
        List list3 = vVar.f4158f;
        if (n6.l.l(this.f4155a, vVar.f4155a) && n6.l.l(this.f4156b, vVar.f4156b) && Arrays.equals(this.f4157c, vVar.f4157c) && n6.l.l(this.e, vVar.e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f4158f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && n6.l.l(this.h, vVar.h) && n6.l.l(this.f4159n, vVar.f4159n) && n6.l.l(this.f4160r, vVar.f4160r) && n6.l.l(this.f4161s, vVar.f4161s) && n6.l.l(this.v, vVar.v) && n6.l.l(this.f4162w, vVar.f4162w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4155a, this.f4156b, Integer.valueOf(Arrays.hashCode(this.f4157c)), this.d, this.e, this.f4158f, this.h, this.f4159n, this.f4160r, this.f4161s, this.v, this.f4162w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4155a);
        String valueOf2 = String.valueOf(this.f4156b);
        String c10 = u6.b.c(this.f4157c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f4158f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f4160r);
        String valueOf7 = String.valueOf(this.f4161s);
        String valueOf8 = String.valueOf(this.v);
        StringBuilder w10 = a4.a.w("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        a4.a.z(w10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        w10.append(this.e);
        w10.append(", \n excludeList=");
        w10.append(valueOf4);
        w10.append(", \n authenticatorSelection=");
        w10.append(valueOf5);
        w10.append(", \n requestId=");
        w10.append(this.f4159n);
        w10.append(", \n tokenBinding=");
        w10.append(valueOf6);
        w10.append(", \n attestationConveyancePreference=");
        w10.append(valueOf7);
        w10.append(", \n authenticationExtensions=");
        w10.append(valueOf8);
        w10.append("}");
        return w10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String str;
        int q6 = w7.f0.q(parcel, 20293);
        w7.f0.k(parcel, 2, this.f4155a, i10);
        w7.f0.k(parcel, 3, this.f4156b, i10);
        w7.f0.c(parcel, 4, this.f4157c);
        w7.f0.p(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            w7.f0.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        w7.f0.p(parcel, 7, this.f4158f);
        w7.f0.k(parcel, 8, this.h, i10);
        w7.f0.i(parcel, 9, this.f4159n);
        w7.f0.k(parcel, 10, this.f4160r, i10);
        e eVar = this.f4161s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f4084a;
        }
        w7.f0.l(parcel, 11, str);
        w7.f0.k(parcel, 12, this.v, i10);
        w7.f0.l(parcel, 13, this.f4162w);
        w7.f0.k(parcel, 14, this.f4163x, i10);
        w7.f0.r(parcel, q6);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f4155a = b10.f4155a;
            this.f4156b = b10.f4156b;
            this.f4157c = b10.f4157c;
            this.d = b10.d;
            this.e = b10.e;
            this.f4158f = b10.f4158f;
            this.h = b10.h;
            this.f4159n = b10.f4159n;
            this.f4160r = b10.f4160r;
            this.f4161s = b10.f4161s;
            this.v = b10.v;
            this.f4162w = str;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
