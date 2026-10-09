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
    public final y f4536a;
    public final b0 f4537b;
    public final byte[] f4538c;
    public final List d;
    public final Double f4539e;
    public final List f4540f;
    public final m h;
    public final Integer f4541n;
    public final h0 f4542r;
    public final e f4543s;
    public final f v;
    public final String f4544w;
    public final ResultReceiver f4545x;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f4545x = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f4536a = b10.f4536a;
                this.f4537b = b10.f4537b;
                this.f4538c = b10.f4538c;
                this.d = b10.d;
                this.f4539e = b10.f4539e;
                this.f4540f = b10.f4540f;
                this.h = b10.h;
                this.f4541n = b10.f4541n;
                this.f4542r = b10.f4542r;
                this.f4543s = b10.f4543s;
                this.v = b10.v;
                this.f4544w = str2;
                return;
            } catch (JSONException e7) {
                throw new IllegalArgumentException(e7);
            }
        }
        n6.l.h(yVar);
        this.f4536a = yVar;
        n6.l.h(b0Var);
        this.f4537b = b0Var;
        n6.l.h(bArr);
        this.f4538c = bArr;
        n6.l.h(arrayList);
        this.d = arrayList;
        this.f4539e = d;
        this.f4540f = arrayList2;
        this.h = mVar;
        this.f4541n = num;
        this.f4542r = h0Var;
        if (str != null) {
            try {
                this.f4543s = e.a(str);
            } catch (d e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f4543s = null;
        }
        this.v = fVar;
        this.f4544w = null;
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
        List list3 = vVar.f4540f;
        if (n6.l.l(this.f4536a, vVar.f4536a) && n6.l.l(this.f4537b, vVar.f4537b) && Arrays.equals(this.f4538c, vVar.f4538c) && n6.l.l(this.f4539e, vVar.f4539e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f4540f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && n6.l.l(this.h, vVar.h) && n6.l.l(this.f4541n, vVar.f4541n) && n6.l.l(this.f4542r, vVar.f4542r) && n6.l.l(this.f4543s, vVar.f4543s) && n6.l.l(this.v, vVar.v) && n6.l.l(this.f4544w, vVar.f4544w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4536a, this.f4537b, Integer.valueOf(Arrays.hashCode(this.f4538c)), this.d, this.f4539e, this.f4540f, this.h, this.f4541n, this.f4542r, this.f4543s, this.v, this.f4544w});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4536a);
        String valueOf2 = String.valueOf(this.f4537b);
        String c10 = u6.b.c(this.f4538c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f4540f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f4542r);
        String valueOf7 = String.valueOf(this.f4543s);
        String valueOf8 = String.valueOf(this.v);
        StringBuilder x10 = a1.g.x("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        a1.g.A(x10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        x10.append(this.f4539e);
        x10.append(", \n excludeList=");
        x10.append(valueOf4);
        x10.append(", \n authenticatorSelection=");
        x10.append(valueOf5);
        x10.append(", \n requestId=");
        x10.append(this.f4541n);
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
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.k(parcel, 2, this.f4536a, i10);
        w7.d0.k(parcel, 3, this.f4537b, i10);
        w7.d0.c(parcel, 4, this.f4538c);
        w7.d0.p(parcel, 5, this.d);
        Double d = this.f4539e;
        if (d != null) {
            w7.d0.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        w7.d0.p(parcel, 7, this.f4540f);
        w7.d0.k(parcel, 8, this.h, i10);
        w7.d0.i(parcel, 9, this.f4541n);
        w7.d0.k(parcel, 10, this.f4542r, i10);
        e eVar = this.f4543s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f4460a;
        }
        w7.d0.l(parcel, 11, str);
        w7.d0.k(parcel, 12, this.v, i10);
        w7.d0.l(parcel, 13, this.f4544w);
        w7.d0.k(parcel, 14, this.f4545x, i10);
        w7.d0.r(parcel, q6);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f4536a = b10.f4536a;
            this.f4537b = b10.f4537b;
            this.f4538c = b10.f4538c;
            this.d = b10.d;
            this.f4539e = b10.f4539e;
            this.f4540f = b10.f4540f;
            this.h = b10.h;
            this.f4541n = b10.f4541n;
            this.f4542r = b10.f4542r;
            this.f4543s = b10.f4543s;
            this.v = b10.v;
            this.f4544w = str;
        } catch (JSONException e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
