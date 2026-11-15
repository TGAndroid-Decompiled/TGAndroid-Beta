package f7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c8.yb;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
public final class v extends r6.a {
    public static final Parcelable.Creator<v> CREATOR = new db.k(13);
    public final y f11254a;
    public final b0 f11255b;
    public final byte[] f11256c;
    public final List d;
    public final Double f11257e;
    public final List f11258f;
    public final m h;
    public final Integer f11259n;
    public final h0 f11260r;
    public final e f11261s;
    public final f f11262w;
    public final String f11263x;
    public final ResultReceiver f11264y;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f11264y = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f11254a = b10.f11254a;
                this.f11255b = b10.f11255b;
                this.f11256c = b10.f11256c;
                this.d = b10.d;
                this.f11257e = b10.f11257e;
                this.f11258f = b10.f11258f;
                this.h = b10.h;
                this.f11259n = b10.f11259n;
                this.f11260r = b10.f11260r;
                this.f11261s = b10.f11261s;
                this.f11262w = b10.f11262w;
                this.f11263x = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        q6.m.g(yVar);
        this.f11254a = yVar;
        q6.m.g(b0Var);
        this.f11255b = b0Var;
        q6.m.g(bArr);
        this.f11256c = bArr;
        q6.m.g(arrayList);
        this.d = arrayList;
        this.f11257e = d;
        this.f11258f = arrayList2;
        this.h = mVar;
        this.f11259n = num;
        this.f11260r = h0Var;
        if (str != null) {
            try {
                this.f11261s = e.a(str);
            } catch (d e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f11261s = null;
        }
        this.f11262w = fVar;
        this.f11263x = null;
    }

    public static f7.v b(org.json.JSONObject r32) {
        throw new UnsupportedOperationException("Method not decompiled: f7.v.b(org.json.JSONObject):f7.v");
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        List list2 = vVar.d;
        List list3 = vVar.f11258f;
        if (q6.m.k(this.f11254a, vVar.f11254a) && q6.m.k(this.f11255b, vVar.f11255b) && Arrays.equals(this.f11256c, vVar.f11256c) && q6.m.k(this.f11257e, vVar.f11257e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f11258f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && q6.m.k(this.h, vVar.h) && q6.m.k(this.f11259n, vVar.f11259n) && q6.m.k(this.f11260r, vVar.f11260r) && q6.m.k(this.f11261s, vVar.f11261s) && q6.m.k(this.f11262w, vVar.f11262w) && q6.m.k(this.f11263x, vVar.f11263x))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11254a, this.f11255b, Integer.valueOf(Arrays.hashCode(this.f11256c)), this.d, this.f11257e, this.f11258f, this.h, this.f11259n, this.f11260r, this.f11261s, this.f11262w, this.f11263x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11254a);
        String valueOf2 = String.valueOf(this.f11255b);
        String c10 = x6.b.c(this.f11256c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f11258f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f11260r);
        String valueOf7 = String.valueOf(this.f11261s);
        String valueOf8 = String.valueOf(this.f11262w);
        StringBuilder n10 = e2.n("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        e2.r(n10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        n10.append(this.f11257e);
        n10.append(", \n excludeList=");
        n10.append(valueOf4);
        n10.append(", \n authenticatorSelection=");
        n10.append(valueOf5);
        n10.append(", \n requestId=");
        n10.append(this.f11259n);
        n10.append(", \n tokenBinding=");
        n10.append(valueOf6);
        n10.append(", \n attestationConveyancePreference=");
        n10.append(valueOf7);
        n10.append(", \n authenticationExtensions=");
        n10.append(valueOf8);
        n10.append("}");
        return n10.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String str;
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 2, this.f11254a, i7);
        yb.k(parcel, 3, this.f11255b, i7);
        yb.c(parcel, 4, this.f11256c);
        yb.p(parcel, 5, this.d);
        Double d = this.f11257e;
        if (d != null) {
            yb.q(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        yb.p(parcel, 7, this.f11258f);
        yb.k(parcel, 8, this.h, i7);
        yb.i(parcel, 9, this.f11259n);
        yb.k(parcel, 10, this.f11260r, i7);
        e eVar = this.f11261s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f11177a;
        }
        yb.l(parcel, 11, str);
        yb.k(parcel, 12, this.f11262w, i7);
        yb.l(parcel, 13, this.f11263x);
        yb.k(parcel, 14, this.f11264y, i7);
        yb.s(parcel, r10);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f11254a = b10.f11254a;
            this.f11255b = b10.f11255b;
            this.f11256c = b10.f11256c;
            this.d = b10.d;
            this.f11257e = b10.f11257e;
            this.f11258f = b10.f11258f;
            this.h = b10.h;
            this.f11259n = b10.f11259n;
            this.f11260r = b10.f11260r;
            this.f11261s = b10.f11261s;
            this.f11262w = b10.f11262w;
            this.f11263x = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
