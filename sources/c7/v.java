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
    public final y f4486a;
    public final b0 f4487b;
    public final byte[] f4488c;
    public final List d;
    public final Double f4489e;
    public final List f4490f;
    public final m h;
    public final Integer f4491n;
    public final h0 f4492r;
    public final e f4493s;
    public final f v;
    public final String f4494w;
    public final ResultReceiver f4495x;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f4495x = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f4486a = b10.f4486a;
                this.f4487b = b10.f4487b;
                this.f4488c = b10.f4488c;
                this.d = b10.d;
                this.f4489e = b10.f4489e;
                this.f4490f = b10.f4490f;
                this.h = b10.h;
                this.f4491n = b10.f4491n;
                this.f4492r = b10.f4492r;
                this.f4493s = b10.f4493s;
                this.v = b10.v;
                this.f4494w = str2;
                return;
            } catch (JSONException e7) {
                throw new IllegalArgumentException(e7);
            }
        }
        n6.l.h(yVar);
        this.f4486a = yVar;
        n6.l.h(b0Var);
        this.f4487b = b0Var;
        n6.l.h(bArr);
        this.f4488c = bArr;
        n6.l.h(arrayList);
        this.d = arrayList;
        this.f4489e = d;
        this.f4490f = arrayList2;
        this.h = mVar;
        this.f4491n = num;
        this.f4492r = h0Var;
        if (str != null) {
            try {
                this.f4493s = e.a(str);
            } catch (d e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f4493s = null;
        }
        this.v = fVar;
        this.f4494w = null;
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
        List list3 = vVar.f4490f;
        if (n6.l.l(this.f4486a, vVar.f4486a) && n6.l.l(this.f4487b, vVar.f4487b) && Arrays.equals(this.f4488c, vVar.f4488c) && n6.l.l(this.f4489e, vVar.f4489e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f4490f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && n6.l.l(this.h, vVar.h) && n6.l.l(this.f4491n, vVar.f4491n) && n6.l.l(this.f4492r, vVar.f4492r) && n6.l.l(this.f4493s, vVar.f4493s) && n6.l.l(this.v, vVar.v) && n6.l.l(this.f4494w, vVar.f4494w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4486a, this.f4487b, Integer.valueOf(Arrays.hashCode(this.f4488c)), this.d, this.f4489e, this.f4490f, this.h, this.f4491n, this.f4492r, this.f4493s, this.v, this.f4494w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4486a);
        String valueOf2 = String.valueOf(this.f4487b);
        String c10 = u6.b.c(this.f4488c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f4490f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f4492r);
        String valueOf7 = String.valueOf(this.f4493s);
        String valueOf8 = String.valueOf(this.v);
        StringBuilder x10 = a4.a.x("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        a4.a.A(x10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        x10.append(this.f4489e);
        x10.append(", \n excludeList=");
        x10.append(valueOf4);
        x10.append(", \n authenticatorSelection=");
        x10.append(valueOf5);
        x10.append(", \n requestId=");
        x10.append(this.f4491n);
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
        int q6 = w7.g0.q(parcel, 20293);
        w7.g0.k(parcel, 2, this.f4486a, i10);
        w7.g0.k(parcel, 3, this.f4487b, i10);
        w7.g0.c(parcel, 4, this.f4488c);
        w7.g0.p(parcel, 5, this.d);
        Double d = this.f4489e;
        if (d != null) {
            w7.g0.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        w7.g0.p(parcel, 7, this.f4490f);
        w7.g0.k(parcel, 8, this.h, i10);
        w7.g0.i(parcel, 9, this.f4491n);
        w7.g0.k(parcel, 10, this.f4492r, i10);
        e eVar = this.f4493s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f4410a;
        }
        w7.g0.l(parcel, 11, str);
        w7.g0.k(parcel, 12, this.v, i10);
        w7.g0.l(parcel, 13, this.f4494w);
        w7.g0.k(parcel, 14, this.f4495x, i10);
        w7.g0.r(parcel, q6);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f4486a = b10.f4486a;
            this.f4487b = b10.f4487b;
            this.f4488c = b10.f4488c;
            this.d = b10.d;
            this.f4489e = b10.f4489e;
            this.f4490f = b10.f4490f;
            this.h = b10.h;
            this.f4491n = b10.f4491n;
            this.f4492r = b10.f4492r;
            this.f4493s = b10.f4493s;
            this.v = b10.v;
            this.f4494w = str;
        } catch (JSONException e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
