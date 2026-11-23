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
    public final y f11603a;
    public final b0 f11604b;
    public final byte[] f11605c;
    public final List d;
    public final Double f11606e;
    public final List f11607f;
    public final m h;
    public final Integer f11608n;
    public final h0 f11609r;
    public final e f11610s;
    public final f f11611w;
    public final String f11612x;
    public final ResultReceiver f11613y;

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f11613y = resultReceiver;
        if (str2 != null) {
            try {
                v b10 = b(new JSONObject(str2));
                this.f11603a = b10.f11603a;
                this.f11604b = b10.f11604b;
                this.f11605c = b10.f11605c;
                this.d = b10.d;
                this.f11606e = b10.f11606e;
                this.f11607f = b10.f11607f;
                this.h = b10.h;
                this.f11608n = b10.f11608n;
                this.f11609r = b10.f11609r;
                this.f11610s = b10.f11610s;
                this.f11611w = b10.f11611w;
                this.f11612x = str2;
                return;
            } catch (JSONException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        q6.m.h(yVar);
        this.f11603a = yVar;
        q6.m.h(b0Var);
        this.f11604b = b0Var;
        q6.m.h(bArr);
        this.f11605c = bArr;
        q6.m.h(arrayList);
        this.d = arrayList;
        this.f11606e = d;
        this.f11607f = arrayList2;
        this.h = mVar;
        this.f11608n = num;
        this.f11609r = h0Var;
        if (str != null) {
            try {
                this.f11610s = e.a(str);
            } catch (d e11) {
                throw new IllegalArgumentException(e11);
            }
        } else {
            this.f11610s = null;
        }
        this.f11611w = fVar;
        this.f11612x = null;
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
        List list3 = vVar.f11607f;
        if (q6.m.l(this.f11603a, vVar.f11603a) && q6.m.l(this.f11604b, vVar.f11604b) && Arrays.equals(this.f11605c, vVar.f11605c) && q6.m.l(this.f11606e, vVar.f11606e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f11607f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && q6.m.l(this.h, vVar.h) && q6.m.l(this.f11608n, vVar.f11608n) && q6.m.l(this.f11609r, vVar.f11609r) && q6.m.l(this.f11610s, vVar.f11610s) && q6.m.l(this.f11611w, vVar.f11611w) && q6.m.l(this.f11612x, vVar.f11612x))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11603a, this.f11604b, Integer.valueOf(Arrays.hashCode(this.f11605c)), this.d, this.f11606e, this.f11607f, this.h, this.f11608n, this.f11609r, this.f11610s, this.f11611w, this.f11612x});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11603a);
        String valueOf2 = String.valueOf(this.f11604b);
        String c10 = x6.b.c(this.f11605c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f11607f);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.f11609r);
        String valueOf7 = String.valueOf(this.f11610s);
        String valueOf8 = String.valueOf(this.f11611w);
        StringBuilder n10 = e2.n("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        e2.r(n10, c10, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        n10.append(this.f11606e);
        n10.append(", \n excludeList=");
        n10.append(valueOf4);
        n10.append(", \n authenticatorSelection=");
        n10.append(valueOf5);
        n10.append(", \n requestId=");
        n10.append(this.f11608n);
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
        bc.k(parcel, 2, this.f11603a, i7);
        bc.k(parcel, 3, this.f11604b, i7);
        bc.c(parcel, 4, this.f11605c);
        bc.p(parcel, 5, this.d);
        Double d = this.f11606e;
        if (d != null) {
            bc.q(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        bc.p(parcel, 7, this.f11607f);
        bc.k(parcel, 8, this.h, i7);
        bc.i(parcel, 9, this.f11608n);
        bc.k(parcel, 10, this.f11609r, i7);
        e eVar = this.f11610s;
        if (eVar == null) {
            str = null;
        } else {
            str = eVar.f11526a;
        }
        bc.l(parcel, 11, str);
        bc.k(parcel, 12, this.f11611w, i7);
        bc.l(parcel, 13, this.f11612x);
        bc.k(parcel, 14, this.f11613y, i7);
        bc.s(parcel, r10);
    }

    public v(String str) {
        try {
            v b10 = b(new JSONObject(str));
            this.f11603a = b10.f11603a;
            this.f11604b = b10.f11604b;
            this.f11605c = b10.f11605c;
            this.d = b10.d;
            this.f11606e = b10.f11606e;
            this.f11607f = b10.f11607f;
            this.h = b10.h;
            this.f11608n = b10.f11608n;
            this.f11609r = b10.f11609r;
            this.f11610s = b10.f11610s;
            this.f11611w = b10.f11611w;
            this.f11612x = str;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
