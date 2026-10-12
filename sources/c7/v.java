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
    public final y f4534a;
    public final b0 f4535b;
    public final byte[] f4536c;
    public final List d;
    public final Double f4537e;
    public final List f4538f;
    public final m h;
    public final Integer f4539n;
    public final h0 f4540r;
    public final e f4541s;
    public final f v;
    public final String f4542w;
    public final ResultReceiver f4543x;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f4543x = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f4534a = b10.f4534a;
                this.f4535b = b10.f4535b;
                this.f4536c = b10.f4536c;
                this.d = b10.d;
                this.f4537e = b10.f4537e;
                this.f4538f = b10.f4538f;
                this.h = b10.h;
                this.f4539n = b10.f4539n;
                this.f4540r = b10.f4540r;
                this.f4541s = b10.f4541s;
                this.v = b10.v;
                this.f4542w = str2;
                return;
            } catch (JSONException e7) {
                throw new IllegalArgumentException(e7);
            }
        }
        n6.m.h(yVar);
        this.f4534a = yVar;
        n6.m.h(b0Var);
        this.f4535b = b0Var;
        n6.m.h(bArr);
        this.f4536c = bArr;
        n6.m.h(arrayList);
        this.d = arrayList;
        this.f4537e = d;
        this.f4538f = arrayList2;
        this.h = mVar;
        this.f4539n = num;
        this.f4540r = h0Var;
        if (str != null) {
            try {
                this.f4541s = e.a(str);
            } catch (d e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f4541s = null;
        }
        this.v = fVar;
        this.f4542w = null;
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
        List list3 = vVar.f4538f;
        if (n6.m.l(this.f4534a, vVar.f4534a) && n6.m.l(this.f4535b, vVar.f4535b) && Arrays.equals(this.f4536c, vVar.f4536c) && n6.m.l(this.f4537e, vVar.f4537e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f4538f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && n6.m.l(this.h, vVar.h) && n6.m.l(this.f4539n, vVar.f4539n) && n6.m.l(this.f4540r, vVar.f4540r) && n6.m.l(this.f4541s, vVar.f4541s) && n6.m.l(this.v, vVar.v) && n6.m.l(this.f4542w, vVar.f4542w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4534a, this.f4535b, Integer.valueOf(Arrays.hashCode(this.f4536c)), this.d, this.f4537e, this.f4538f, this.h, this.f4539n, this.f4540r, this.f4541s, this.v, this.f4542w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4534a);
        String valueOf2 = String.valueOf(this.f4535b);
        String c10 = u6.b.c(this.f4536c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f4538f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f4540r);
        String valueOf7 = String.valueOf(this.f4541s);
        String valueOf8 = String.valueOf(this.v);
        StringBuilder x10 = a1.g.x("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        a1.g.A(x10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        x10.append(this.f4537e);
        x10.append(", \n excludeList=");
        x10.append(valueOf4);
        x10.append(", \n authenticatorSelection=");
        x10.append(valueOf5);
        x10.append(", \n requestId=");
        x10.append(this.f4539n);
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
        int q6 = w7.c0.q(parcel, 20293);
        w7.c0.k(parcel, 2, this.f4534a, i10);
        w7.c0.k(parcel, 3, this.f4535b, i10);
        w7.c0.c(parcel, 4, this.f4536c);
        w7.c0.p(parcel, 5, this.d);
        Double d = this.f4537e;
        if (d != null) {
            w7.c0.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        w7.c0.p(parcel, 7, this.f4538f);
        w7.c0.k(parcel, 8, this.h, i10);
        w7.c0.i(parcel, 9, this.f4539n);
        w7.c0.k(parcel, 10, this.f4540r, i10);
        e eVar = this.f4541s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f4458a;
        }
        w7.c0.l(parcel, 11, str);
        w7.c0.k(parcel, 12, this.v, i10);
        w7.c0.l(parcel, 13, this.f4542w);
        w7.c0.k(parcel, 14, this.f4543x, i10);
        w7.c0.r(parcel, q6);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f4534a = b10.f4534a;
            this.f4535b = b10.f4535b;
            this.f4536c = b10.f4536c;
            this.d = b10.d;
            this.f4537e = b10.f4537e;
            this.f4538f = b10.f4538f;
            this.h = b10.h;
            this.f4539n = b10.f4539n;
            this.f4540r = b10.f4540r;
            this.f4541s = b10.f4541s;
            this.v = b10.v;
            this.f4542w = str;
        } catch (JSONException e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
