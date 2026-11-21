package f7;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
public final class v extends r6.a {
    public static final Parcelable.Creator<v> CREATOR = new db.k(13);
    public final y f11600a;
    public final b0 f11601b;
    public final byte[] f11602c;
    public final List d;
    public final Double f11603e;
    public final List f11604f;
    public final m h;
    public final Integer f11605n;
    public final h0 f11606r;
    public final e f11607s;
    public final f f11608w;
    public final String f11609x;
    public final ResultReceiver f11610y;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f11610y = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f11600a = b10.f11600a;
                this.f11601b = b10.f11601b;
                this.f11602c = b10.f11602c;
                this.d = b10.d;
                this.f11603e = b10.f11603e;
                this.f11604f = b10.f11604f;
                this.h = b10.h;
                this.f11605n = b10.f11605n;
                this.f11606r = b10.f11606r;
                this.f11607s = b10.f11607s;
                this.f11608w = b10.f11608w;
                this.f11609x = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        q6.m.h(yVar);
        this.f11600a = yVar;
        q6.m.h(b0Var);
        this.f11601b = b0Var;
        q6.m.h(bArr);
        this.f11602c = bArr;
        q6.m.h(arrayList);
        this.d = arrayList;
        this.f11603e = d;
        this.f11604f = arrayList2;
        this.h = mVar;
        this.f11605n = num;
        this.f11606r = h0Var;
        if (str != null) {
            try {
                this.f11607s = e.a(str);
            } catch (d e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f11607s = null;
        }
        this.f11608w = fVar;
        this.f11609x = null;
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
        List list3 = vVar.f11604f;
        if (q6.m.l(this.f11600a, vVar.f11600a) && q6.m.l(this.f11601b, vVar.f11601b) && Arrays.equals(this.f11602c, vVar.f11602c) && q6.m.l(this.f11603e, vVar.f11603e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f11604f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && q6.m.l(this.h, vVar.h) && q6.m.l(this.f11605n, vVar.f11605n) && q6.m.l(this.f11606r, vVar.f11606r) && q6.m.l(this.f11607s, vVar.f11607s) && q6.m.l(this.f11608w, vVar.f11608w) && q6.m.l(this.f11609x, vVar.f11609x))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11600a, this.f11601b, Integer.valueOf(Arrays.hashCode(this.f11602c)), this.d, this.f11603e, this.f11604f, this.h, this.f11605n, this.f11606r, this.f11607s, this.f11608w, this.f11609x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11600a);
        String valueOf2 = String.valueOf(this.f11601b);
        String c10 = x6.b.c(this.f11602c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f11604f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f11606r);
        String valueOf7 = String.valueOf(this.f11607s);
        String valueOf8 = String.valueOf(this.f11608w);
        StringBuilder n10 = e2.n("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        e2.r(n10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        n10.append(this.f11603e);
        n10.append(", \n excludeList=");
        n10.append(valueOf4);
        n10.append(", \n authenticatorSelection=");
        n10.append(valueOf5);
        n10.append(", \n requestId=");
        n10.append(this.f11605n);
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
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 2, this.f11600a, i7);
        bc.k(parcel, 3, this.f11601b, i7);
        bc.c(parcel, 4, this.f11602c);
        bc.p(parcel, 5, this.d);
        Double d = this.f11603e;
        if (d != null) {
            bc.q(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        bc.p(parcel, 7, this.f11604f);
        bc.k(parcel, 8, this.h, i7);
        bc.i(parcel, 9, this.f11605n);
        bc.k(parcel, 10, this.f11606r, i7);
        e eVar = this.f11607s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f11523a;
        }
        bc.l(parcel, 11, str);
        bc.k(parcel, 12, this.f11608w, i7);
        bc.l(parcel, 13, this.f11609x);
        bc.k(parcel, 14, this.f11610y, i7);
        bc.s(parcel, r10);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f11600a = b10.f11600a;
            this.f11601b = b10.f11601b;
            this.f11602c = b10.f11602c;
            this.d = b10.d;
            this.f11603e = b10.f11603e;
            this.f11604f = b10.f11604f;
            this.h = b10.h;
            this.f11605n = b10.f11605n;
            this.f11606r = b10.f11606r;
            this.f11607s = b10.f11607s;
            this.f11608w = b10.f11608w;
            this.f11609x = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
