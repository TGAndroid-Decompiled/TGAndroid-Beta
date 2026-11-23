package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import c8.cc;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
public final class q extends r6.a {
    public static final Parcelable.Creator<q> CREATOR;
    public String E;
    public JSONObject F;
    public int G;
    public boolean I;
    public c J;
    public u K;
    public j L;
    public n M;
    public boolean N;
    public MediaInfo f11435a;
    public long f11436b;
    public int f11437c;
    public double d;
    public int f11438e;
    public int f11439f;
    public long h;
    public long f11440n;
    public double f11441r;
    public boolean f11442s;
    public long[] f11443w;
    public int f11444x;
    public int f11445y;
    public final ArrayList H = new ArrayList();
    public final SparseArray O = new SparseArray();

    static {
        q6.m.g("MediaStatus", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        CREATOR = new v(15);
    }

    public q(MediaInfo mediaInfo, long j3, int i7, double d, int i10, int i11, long j10, long j11, double d2, boolean z10, long[] jArr, int i12, int i13, String str, int i14, ArrayList arrayList, boolean z11, c cVar, u uVar, j jVar, n nVar) {
        this.f11435a = mediaInfo;
        this.f11436b = j3;
        this.f11437c = i7;
        this.d = d;
        this.f11438e = i10;
        this.f11439f = i11;
        this.h = j10;
        this.f11440n = j11;
        this.f11441r = d2;
        this.f11442s = z10;
        this.f11443w = jArr;
        this.f11444x = i12;
        this.f11445y = i13;
        this.E = str;
        if (str != null) {
            try {
                this.F = new JSONObject(this.E);
            } catch (JSONException unused) {
                this.F = null;
                this.E = null;
            }
        } else {
            this.F = null;
        }
        this.G = i14;
        if (arrayList != null && !arrayList.isEmpty()) {
            c(arrayList);
        }
        this.I = z11;
        this.J = cVar;
        this.K = uVar;
        this.L = jVar;
        this.M = nVar;
        boolean z12 = false;
        if (nVar != null && nVar.f11426s) {
            z12 = true;
        }
        this.N = z12;
    }

    public final int b(org.json.JSONObject r35, int r36) {
        throw new UnsupportedOperationException("Method not decompiled: f6.q.b(org.json.JSONObject, int):int");
    }

    public final void c(List list) {
        ArrayList arrayList = this.H;
        arrayList.clear();
        SparseArray sparseArray = this.O;
        sparseArray.clear();
        if (list != null) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                o oVar = (o) list.get(i7);
                arrayList.add(oVar);
                sparseArray.put(oVar.f11428b, Integer.valueOf(i7));
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof q) {
                q qVar = (q) obj;
                if (this.F != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (qVar.F != null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z10 == z11 && this.f11436b == qVar.f11436b && this.f11437c == qVar.f11437c && this.d == qVar.d && this.f11438e == qVar.f11438e && this.f11439f == qVar.f11439f && this.h == qVar.h && this.f11441r == qVar.f11441r && this.f11442s == qVar.f11442s && this.f11444x == qVar.f11444x && this.f11445y == qVar.f11445y && this.G == qVar.G && Arrays.equals(this.f11443w, qVar.f11443w) && j6.a.d(Long.valueOf(this.f11440n), Long.valueOf(qVar.f11440n)) && j6.a.d(this.H, qVar.H) && j6.a.d(this.f11435a, qVar.f11435a) && (((jSONObject = this.F) == null || (jSONObject2 = qVar.F) == null || x6.c.a(jSONObject, jSONObject2)) && this.I == qVar.I && j6.a.d(this.J, qVar.J) && j6.a.d(this.K, qVar.K) && j6.a.d(this.L, qVar.L) && q6.m.l(this.M, qVar.M) && this.N == qVar.N)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11435a, Long.valueOf(this.f11436b), Integer.valueOf(this.f11437c), Double.valueOf(this.d), Integer.valueOf(this.f11438e), Integer.valueOf(this.f11439f), Long.valueOf(this.h), Long.valueOf(this.f11440n), Double.valueOf(this.f11441r), Boolean.valueOf(this.f11442s), Integer.valueOf(Arrays.hashCode(this.f11443w)), Integer.valueOf(this.f11444x), Integer.valueOf(this.f11445y), String.valueOf(this.F), Integer.valueOf(this.G), this.H, Boolean.valueOf(this.I), this.J, this.K, this.L, this.M});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        String jSONObject;
        JSONObject jSONObject2 = this.F;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.E = jSONObject;
        int r10 = cc.r(parcel, 20293);
        cc.k(parcel, 2, this.f11435a, i7);
        long j3 = this.f11436b;
        cc.q(parcel, 3, 8);
        parcel.writeLong(j3);
        int i10 = this.f11437c;
        cc.q(parcel, 4, 4);
        parcel.writeInt(i10);
        double d = this.d;
        cc.q(parcel, 5, 8);
        parcel.writeDouble(d);
        int i11 = this.f11438e;
        cc.q(parcel, 6, 4);
        parcel.writeInt(i11);
        int i12 = this.f11439f;
        cc.q(parcel, 7, 4);
        parcel.writeInt(i12);
        long j10 = this.h;
        cc.q(parcel, 8, 8);
        parcel.writeLong(j10);
        long j11 = this.f11440n;
        cc.q(parcel, 9, 8);
        parcel.writeLong(j11);
        double d2 = this.f11441r;
        cc.q(parcel, 10, 8);
        parcel.writeDouble(d2);
        boolean z10 = this.f11442s;
        cc.q(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        cc.j(parcel, 12, this.f11443w);
        int i13 = this.f11444x;
        cc.q(parcel, 13, 4);
        parcel.writeInt(i13);
        int i14 = this.f11445y;
        cc.q(parcel, 14, 4);
        parcel.writeInt(i14);
        cc.l(parcel, 15, this.E);
        int i15 = this.G;
        cc.q(parcel, 16, 4);
        parcel.writeInt(i15);
        cc.p(parcel, 17, this.H);
        boolean z11 = this.I;
        cc.q(parcel, 18, 4);
        parcel.writeInt(z11 ? 1 : 0);
        cc.k(parcel, 19, this.J, i7);
        cc.k(parcel, 20, this.K, i7);
        cc.k(parcel, 21, this.L, i7);
        cc.k(parcel, 22, this.M, i7);
        cc.s(parcel, r10);
    }
}
