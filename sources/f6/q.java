package f6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import c8.yb;
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
    public MediaInfo f11123a;
    public long f11124b;
    public int f11125c;
    public double d;
    public int f11126e;
    public int f11127f;
    public long h;
    public long f11128n;
    public double f11129r;
    public boolean f11130s;
    public long[] f11131w;
    public int f11132x;
    public int f11133y;
    public final ArrayList H = new ArrayList();
    public final SparseArray O = new SparseArray();

    static {
        q6.m.f("MediaStatus", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        CREATOR = new v(15);
    }

    public q(MediaInfo mediaInfo, long j3, int i7, double d, int i10, int i11, long j10, long j11, double d2, boolean z10, long[] jArr, int i12, int i13, String str, int i14, ArrayList arrayList, boolean z11, c cVar, u uVar, j jVar, n nVar) {
        this.f11123a = mediaInfo;
        this.f11124b = j3;
        this.f11125c = i7;
        this.d = d;
        this.f11126e = i10;
        this.f11127f = i11;
        this.h = j10;
        this.f11128n = j11;
        this.f11129r = d2;
        this.f11130s = z10;
        this.f11131w = jArr;
        this.f11132x = i12;
        this.f11133y = i13;
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
        if (nVar != null && nVar.f11114s) {
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
                sparseArray.put(oVar.f11116b, Integer.valueOf(i7));
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
                if (z10 == z11 && this.f11124b == qVar.f11124b && this.f11125c == qVar.f11125c && this.d == qVar.d && this.f11126e == qVar.f11126e && this.f11127f == qVar.f11127f && this.h == qVar.h && this.f11129r == qVar.f11129r && this.f11130s == qVar.f11130s && this.f11132x == qVar.f11132x && this.f11133y == qVar.f11133y && this.G == qVar.G && Arrays.equals(this.f11131w, qVar.f11131w) && j6.a.d(Long.valueOf(this.f11128n), Long.valueOf(qVar.f11128n)) && j6.a.d(this.H, qVar.H) && j6.a.d(this.f11123a, qVar.f11123a) && (((jSONObject = this.F) == null || (jSONObject2 = qVar.F) == null || x6.c.a(jSONObject, jSONObject2)) && this.I == qVar.I && j6.a.d(this.J, qVar.J) && j6.a.d(this.K, qVar.K) && j6.a.d(this.L, qVar.L) && q6.m.k(this.M, qVar.M) && this.N == qVar.N)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11123a, Long.valueOf(this.f11124b), Integer.valueOf(this.f11125c), Double.valueOf(this.d), Integer.valueOf(this.f11126e), Integer.valueOf(this.f11127f), Long.valueOf(this.h), Long.valueOf(this.f11128n), Double.valueOf(this.f11129r), Boolean.valueOf(this.f11130s), Integer.valueOf(Arrays.hashCode(this.f11131w)), Integer.valueOf(this.f11132x), Integer.valueOf(this.f11133y), String.valueOf(this.F), Integer.valueOf(this.G), this.H, Boolean.valueOf(this.I), this.J, this.K, this.L, this.M});
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
        int r10 = yb.r(parcel, 20293);
        yb.k(parcel, 2, this.f11123a, i7);
        long j3 = this.f11124b;
        yb.q(parcel, 3, 8);
        parcel.writeLong(j3);
        int i10 = this.f11125c;
        yb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        double d = this.d;
        yb.q(parcel, 5, 8);
        parcel.writeDouble(d);
        int i11 = this.f11126e;
        yb.q(parcel, 6, 4);
        parcel.writeInt(i11);
        int i12 = this.f11127f;
        yb.q(parcel, 7, 4);
        parcel.writeInt(i12);
        long j10 = this.h;
        yb.q(parcel, 8, 8);
        parcel.writeLong(j10);
        long j11 = this.f11128n;
        yb.q(parcel, 9, 8);
        parcel.writeLong(j11);
        double d2 = this.f11129r;
        yb.q(parcel, 10, 8);
        parcel.writeDouble(d2);
        boolean z10 = this.f11130s;
        yb.q(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        yb.j(parcel, 12, this.f11131w);
        int i13 = this.f11132x;
        yb.q(parcel, 13, 4);
        parcel.writeInt(i13);
        int i14 = this.f11133y;
        yb.q(parcel, 14, 4);
        parcel.writeInt(i14);
        yb.l(parcel, 15, this.E);
        int i15 = this.G;
        yb.q(parcel, 16, 4);
        parcel.writeInt(i15);
        yb.p(parcel, 17, this.H);
        boolean z11 = this.I;
        yb.q(parcel, 18, 4);
        parcel.writeInt(z11 ? 1 : 0);
        yb.k(parcel, 19, this.J, i7);
        yb.k(parcel, 20, this.K, i7);
        yb.k(parcel, 21, this.L, i7);
        yb.k(parcel, 22, this.M, i7);
        yb.s(parcel, r10);
    }
}
