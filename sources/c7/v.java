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
    public final y f4150a;
    public final b0 f4151b;
    public final byte[] f4152c;
    public final List d;
    public final Double e;
    public final List f4153f;
    public final m h;
    public final Integer f4154n;
    public final h0 f4155r;
    public final e f4156s;
    public final f v;
    public final String f4157w;
    public final ResultReceiver f4158x;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f4158x = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f4150a = b10.f4150a;
                this.f4151b = b10.f4151b;
                this.f4152c = b10.f4152c;
                this.d = b10.d;
                this.e = b10.e;
                this.f4153f = b10.f4153f;
                this.h = b10.h;
                this.f4154n = b10.f4154n;
                this.f4155r = b10.f4155r;
                this.f4156s = b10.f4156s;
                this.v = b10.v;
                this.f4157w = str2;
                return;
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
        n6.l.h(yVar);
        this.f4150a = yVar;
        n6.l.h(b0Var);
        this.f4151b = b0Var;
        n6.l.h(bArr);
        this.f4152c = bArr;
        n6.l.h(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f4153f = arrayList2;
        this.h = mVar;
        this.f4154n = num;
        this.f4155r = h0Var;
        if (str != null) {
            try {
                this.f4156s = e.a(str);
            } catch (d e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            this.f4156s = null;
        }
        this.v = fVar;
        this.f4157w = null;
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
        List list3 = vVar.f4153f;
        if (n6.l.l(this.f4150a, vVar.f4150a) && n6.l.l(this.f4151b, vVar.f4151b) && Arrays.equals(this.f4152c, vVar.f4152c) && n6.l.l(this.e, vVar.e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f4153f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && n6.l.l(this.h, vVar.h) && n6.l.l(this.f4154n, vVar.f4154n) && n6.l.l(this.f4155r, vVar.f4155r) && n6.l.l(this.f4156s, vVar.f4156s) && n6.l.l(this.v, vVar.v) && n6.l.l(this.f4157w, vVar.f4157w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4150a, this.f4151b, Integer.valueOf(Arrays.hashCode(this.f4152c)), this.d, this.e, this.f4153f, this.h, this.f4154n, this.f4155r, this.f4156s, this.v, this.f4157w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4150a);
        String valueOf2 = String.valueOf(this.f4151b);
        String c10 = u6.b.c(this.f4152c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f4153f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f4155r);
        String valueOf7 = String.valueOf(this.f4156s);
        String valueOf8 = String.valueOf(this.v);
        StringBuilder w10 = a4.a.w("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        a4.a.z(w10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        w10.append(this.e);
        w10.append(", \n excludeList=");
        w10.append(valueOf4);
        w10.append(", \n authenticatorSelection=");
        w10.append(valueOf5);
        w10.append(", \n requestId=");
        w10.append(this.f4154n);
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
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.k(parcel, 2, this.f4150a, i10);
        w7.e0.k(parcel, 3, this.f4151b, i10);
        w7.e0.c(parcel, 4, this.f4152c);
        w7.e0.p(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            w7.e0.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        w7.e0.p(parcel, 7, this.f4153f);
        w7.e0.k(parcel, 8, this.h, i10);
        w7.e0.i(parcel, 9, this.f4154n);
        w7.e0.k(parcel, 10, this.f4155r, i10);
        e eVar = this.f4156s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f4079a;
        }
        w7.e0.l(parcel, 11, str);
        w7.e0.k(parcel, 12, this.v, i10);
        w7.e0.l(parcel, 13, this.f4157w);
        w7.e0.k(parcel, 14, this.f4158x, i10);
        w7.e0.r(parcel, q6);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f4150a = b10.f4150a;
            this.f4151b = b10.f4151b;
            this.f4152c = b10.f4152c;
            this.d = b10.d;
            this.e = b10.e;
            this.f4153f = b10.f4153f;
            this.h = b10.h;
            this.f4154n = b10.f4154n;
            this.f4155r = b10.f4155r;
            this.f4156s = b10.f4156s;
            this.v = b10.v;
            this.f4157w = str;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
