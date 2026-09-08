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
    public final y f4706a;
    public final b0 f4707b;
    public final byte[] f4708c;
    public final List d;
    public final Double f4709e;
    public final List f4710f;
    public final m h;
    public final Integer f4711n;
    public final h0 f4712r;
    public final e f4713s;
    public final f v;
    public final String f4714w;
    public final ResultReceiver f4715x;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f4715x = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f4706a = b10.f4706a;
                this.f4707b = b10.f4707b;
                this.f4708c = b10.f4708c;
                this.d = b10.d;
                this.f4709e = b10.f4709e;
                this.f4710f = b10.f4710f;
                this.h = b10.h;
                this.f4711n = b10.f4711n;
                this.f4712r = b10.f4712r;
                this.f4713s = b10.f4713s;
                this.v = b10.v;
                this.f4714w = str2;
                return;
            } catch (JSONException e7) {
                throw new IllegalArgumentException(e7);
            }
        }
        n6.l.h(yVar);
        this.f4706a = yVar;
        n6.l.h(b0Var);
        this.f4707b = b0Var;
        n6.l.h(bArr);
        this.f4708c = bArr;
        n6.l.h(arrayList);
        this.d = arrayList;
        this.f4709e = d;
        this.f4710f = arrayList2;
        this.h = mVar;
        this.f4711n = num;
        this.f4712r = h0Var;
        if (str != null) {
            try {
                this.f4713s = e.a(str);
            } catch (d e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f4713s = null;
        }
        this.v = fVar;
        this.f4714w = null;
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
        List list3 = vVar.f4710f;
        if (n6.l.l(this.f4706a, vVar.f4706a) && n6.l.l(this.f4707b, vVar.f4707b) && Arrays.equals(this.f4708c, vVar.f4708c) && n6.l.l(this.f4709e, vVar.f4709e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f4710f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && n6.l.l(this.h, vVar.h) && n6.l.l(this.f4711n, vVar.f4711n) && n6.l.l(this.f4712r, vVar.f4712r) && n6.l.l(this.f4713s, vVar.f4713s) && n6.l.l(this.v, vVar.v) && n6.l.l(this.f4714w, vVar.f4714w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4706a, this.f4707b, Integer.valueOf(Arrays.hashCode(this.f4708c)), this.d, this.f4709e, this.f4710f, this.h, this.f4711n, this.f4712r, this.f4713s, this.v, this.f4714w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4706a);
        String valueOf2 = String.valueOf(this.f4707b);
        String c10 = u6.b.c(this.f4708c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f4710f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f4712r);
        String valueOf7 = String.valueOf(this.f4713s);
        String valueOf8 = String.valueOf(this.v);
        StringBuilder w10 = a4.a.w("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        a4.a.z(w10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        w10.append(this.f4709e);
        w10.append(", \n excludeList=");
        w10.append(valueOf4);
        w10.append(", \n authenticatorSelection=");
        w10.append(valueOf5);
        w10.append(", \n requestId=");
        w10.append(this.f4711n);
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
        w7.e0.k(parcel, 2, this.f4706a, i10);
        w7.e0.k(parcel, 3, this.f4707b, i10);
        w7.e0.c(parcel, 4, this.f4708c);
        w7.e0.p(parcel, 5, this.d);
        Double d = this.f4709e;
        if (d != null) {
            w7.e0.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        w7.e0.p(parcel, 7, this.f4710f);
        w7.e0.k(parcel, 8, this.h, i10);
        w7.e0.i(parcel, 9, this.f4711n);
        w7.e0.k(parcel, 10, this.f4712r, i10);
        e eVar = this.f4713s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f4630a;
        }
        w7.e0.l(parcel, 11, str);
        w7.e0.k(parcel, 12, this.v, i10);
        w7.e0.l(parcel, 13, this.f4714w);
        w7.e0.k(parcel, 14, this.f4715x, i10);
        w7.e0.r(parcel, q6);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f4706a = b10.f4706a;
            this.f4707b = b10.f4707b;
            this.f4708c = b10.f4708c;
            this.d = b10.d;
            this.f4709e = b10.f4709e;
            this.f4710f = b10.f4710f;
            this.h = b10.h;
            this.f4711n = b10.f4711n;
            this.f4712r = b10.f4712r;
            this.f4713s = b10.f4713s;
            this.v = b10.v;
            this.f4714w = str;
        } catch (JSONException e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
