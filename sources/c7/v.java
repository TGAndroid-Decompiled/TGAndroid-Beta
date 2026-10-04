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
    public final y f4485a;
    public final b0 f4486b;
    public final byte[] f4487c;
    public final List d;
    public final Double f4488e;
    public final List f4489f;
    public final m h;
    public final Integer f4490n;
    public final h0 f4491r;
    public final e f4492s;
    public final f v;
    public final String f4493w;
    public final ResultReceiver f4494x;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f4494x = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f4485a = b10.f4485a;
                this.f4486b = b10.f4486b;
                this.f4487c = b10.f4487c;
                this.d = b10.d;
                this.f4488e = b10.f4488e;
                this.f4489f = b10.f4489f;
                this.h = b10.h;
                this.f4490n = b10.f4490n;
                this.f4491r = b10.f4491r;
                this.f4492s = b10.f4492s;
                this.v = b10.v;
                this.f4493w = str2;
                return;
            } catch (JSONException e7) {
                throw new IllegalArgumentException(e7);
            }
        }
        n6.l.h(yVar);
        this.f4485a = yVar;
        n6.l.h(b0Var);
        this.f4486b = b0Var;
        n6.l.h(bArr);
        this.f4487c = bArr;
        n6.l.h(arrayList);
        this.d = arrayList;
        this.f4488e = d;
        this.f4489f = arrayList2;
        this.h = mVar;
        this.f4490n = num;
        this.f4491r = h0Var;
        if (str != null) {
            try {
                this.f4492s = e.a(str);
            } catch (d e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f4492s = null;
        }
        this.v = fVar;
        this.f4493w = null;
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
        List list3 = vVar.f4489f;
        if (n6.l.l(this.f4485a, vVar.f4485a) && n6.l.l(this.f4486b, vVar.f4486b) && Arrays.equals(this.f4487c, vVar.f4487c) && n6.l.l(this.f4488e, vVar.f4488e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f4489f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && n6.l.l(this.h, vVar.h) && n6.l.l(this.f4490n, vVar.f4490n) && n6.l.l(this.f4491r, vVar.f4491r) && n6.l.l(this.f4492s, vVar.f4492s) && n6.l.l(this.v, vVar.v) && n6.l.l(this.f4493w, vVar.f4493w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4485a, this.f4486b, Integer.valueOf(Arrays.hashCode(this.f4487c)), this.d, this.f4488e, this.f4489f, this.h, this.f4490n, this.f4491r, this.f4492s, this.v, this.f4493w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4485a);
        String valueOf2 = String.valueOf(this.f4486b);
        String c10 = u6.b.c(this.f4487c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f4489f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f4491r);
        String valueOf7 = String.valueOf(this.f4492s);
        String valueOf8 = String.valueOf(this.v);
        StringBuilder w10 = a4.a.w("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        a4.a.z(w10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        w10.append(this.f4488e);
        w10.append(", \n excludeList=");
        w10.append(valueOf4);
        w10.append(", \n authenticatorSelection=");
        w10.append(valueOf5);
        w10.append(", \n requestId=");
        w10.append(this.f4490n);
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
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.k(parcel, 2, this.f4485a, i10);
        w7.g0.k(parcel, 3, this.f4486b, i10);
        w7.g0.c(parcel, 4, this.f4487c);
        w7.g0.p(parcel, 5, this.d);
        Double d = this.f4488e;
        if (d != null) {
            w7.g0.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        w7.g0.p(parcel, 7, this.f4489f);
        w7.g0.k(parcel, 8, this.h, i10);
        w7.g0.i(parcel, 9, this.f4490n);
        w7.g0.k(parcel, 10, this.f4491r, i10);
        e eVar = this.f4492s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f4409a;
        }
        w7.g0.l(parcel, 11, str);
        w7.g0.k(parcel, 12, this.v, i10);
        w7.g0.l(parcel, 13, this.f4493w);
        w7.g0.k(parcel, 14, this.f4494x, i10);
        w7.g0.r(parcel, q6);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f4485a = b10.f4485a;
            this.f4486b = b10.f4486b;
            this.f4487c = b10.f4487c;
            this.d = b10.d;
            this.f4488e = b10.f4488e;
            this.f4489f = b10.f4489f;
            this.h = b10.h;
            this.f4490n = b10.f4490n;
            this.f4491r = b10.f4491r;
            this.f4492s = b10.f4492s;
            this.v = b10.v;
            this.f4493w = str;
        } catch (JSONException e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
