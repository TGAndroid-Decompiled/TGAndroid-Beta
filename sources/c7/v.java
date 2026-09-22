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
    public final y f4154a;
    public final b0 f4155b;
    public final byte[] f4156c;
    public final List d;
    public final Double e;
    public final List f4157f;
    public final m h;
    public final Integer f4158n;
    public final h0 f4159r;
    public final e f4160s;
    public final f v;
    public final String f4161w;
    public final ResultReceiver f4162x;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f4162x = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f4154a = b10.f4154a;
                this.f4155b = b10.f4155b;
                this.f4156c = b10.f4156c;
                this.d = b10.d;
                this.e = b10.e;
                this.f4157f = b10.f4157f;
                this.h = b10.h;
                this.f4158n = b10.f4158n;
                this.f4159r = b10.f4159r;
                this.f4160s = b10.f4160s;
                this.v = b10.v;
                this.f4161w = str2;
                return;
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
        n6.l.h(yVar);
        this.f4154a = yVar;
        n6.l.h(b0Var);
        this.f4155b = b0Var;
        n6.l.h(bArr);
        this.f4156c = bArr;
        n6.l.h(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f4157f = arrayList2;
        this.h = mVar;
        this.f4158n = num;
        this.f4159r = h0Var;
        if (str != null) {
            try {
                this.f4160s = e.a(str);
            } catch (d e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            this.f4160s = null;
        }
        this.v = fVar;
        this.f4161w = null;
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
        List list3 = vVar.f4157f;
        if (n6.l.l(this.f4154a, vVar.f4154a) && n6.l.l(this.f4155b, vVar.f4155b) && Arrays.equals(this.f4156c, vVar.f4156c) && n6.l.l(this.e, vVar.e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f4157f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && n6.l.l(this.h, vVar.h) && n6.l.l(this.f4158n, vVar.f4158n) && n6.l.l(this.f4159r, vVar.f4159r) && n6.l.l(this.f4160s, vVar.f4160s) && n6.l.l(this.v, vVar.v) && n6.l.l(this.f4161w, vVar.f4161w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4154a, this.f4155b, Integer.valueOf(Arrays.hashCode(this.f4156c)), this.d, this.e, this.f4157f, this.h, this.f4158n, this.f4159r, this.f4160s, this.v, this.f4161w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4154a);
        String valueOf2 = String.valueOf(this.f4155b);
        String c10 = u6.b.c(this.f4156c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f4157f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f4159r);
        String valueOf7 = String.valueOf(this.f4160s);
        String valueOf8 = String.valueOf(this.v);
        StringBuilder w10 = a4.a.w("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        a4.a.z(w10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        w10.append(this.e);
        w10.append(", \n excludeList=");
        w10.append(valueOf4);
        w10.append(", \n authenticatorSelection=");
        w10.append(valueOf5);
        w10.append(", \n requestId=");
        w10.append(this.f4158n);
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
        w7.f0.k(parcel, 2, this.f4154a, i10);
        w7.f0.k(parcel, 3, this.f4155b, i10);
        w7.f0.c(parcel, 4, this.f4156c);
        w7.f0.p(parcel, 5, this.d);
        Double d = this.e;
        if (d != null) {
            w7.f0.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        w7.f0.p(parcel, 7, this.f4157f);
        w7.f0.k(parcel, 8, this.h, i10);
        w7.f0.i(parcel, 9, this.f4158n);
        w7.f0.k(parcel, 10, this.f4159r, i10);
        e eVar = this.f4160s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f4083a;
        }
        w7.f0.l(parcel, 11, str);
        w7.f0.k(parcel, 12, this.v, i10);
        w7.f0.l(parcel, 13, this.f4161w);
        w7.f0.k(parcel, 14, this.f4162x, i10);
        w7.f0.r(parcel, q6);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f4154a = b10.f4154a;
            this.f4155b = b10.f4155b;
            this.f4156c = b10.f4156c;
            this.d = b10.d;
            this.e = b10.e;
            this.f4157f = b10.f4157f;
            this.h = b10.h;
            this.f4158n = b10.f4158n;
            this.f4159r = b10.f4159r;
            this.f4160s = b10.f4160s;
            this.v = b10.v;
            this.f4161w = str;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
