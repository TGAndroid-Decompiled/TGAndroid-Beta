package c6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
public final class q extends o6.a {
    public static final Parcelable.Creator<q> CREATOR;
    public JSONObject E;
    public int F;
    public boolean H;
    public c I;
    public u J;
    public j K;
    public n L;
    public boolean M;
    public MediaInfo f4407a;
    public long f4408b;
    public int f4409c;
    public double d;
    public int f4410e;
    public int f4411f;
    public long h;
    public long f4412n;
    public double f4413r;
    public boolean f4414s;
    public long[] v;
    public int f4415w;
    public int f4416x;
    public String f4417y;
    public final ArrayList G = new ArrayList();
    public final SparseArray N = new SparseArray();

    static {
        n6.l.g("MediaStatus", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        CREATOR = new v(15);
    }

    public q(MediaInfo mediaInfo, long j3, int i10, double d, int i11, int i12, long j10, long j11, double d10, boolean z10, long[] jArr, int i13, int i14, String str, int i15, ArrayList arrayList, boolean z11, c cVar, u uVar, j jVar, n nVar) {
        this.f4407a = mediaInfo;
        this.f4408b = j3;
        this.f4409c = i10;
        this.d = d;
        this.f4410e = i11;
        this.f4411f = i12;
        this.h = j10;
        this.f4412n = j11;
        this.f4413r = d10;
        this.f4414s = z10;
        this.v = jArr;
        this.f4415w = i13;
        this.f4416x = i14;
        this.f4417y = str;
        if (str != null) {
            try {
                this.E = new JSONObject(this.f4417y);
            } catch (JSONException unused) {
                this.E = null;
                this.f4417y = null;
            }
        } else {
            this.E = null;
        }
        this.F = i15;
        if (arrayList != null && !arrayList.isEmpty()) {
            c(arrayList);
        }
        this.H = z11;
        this.I = cVar;
        this.J = uVar;
        this.K = jVar;
        this.L = nVar;
        boolean z12 = false;
        if (nVar != null && nVar.f4398s) {
            z12 = true;
        }
        this.M = z12;
    }

    public final int b(int r35, org.json.JSONObject r36) {
        throw new UnsupportedOperationException("Method not decompiled: c6.q.b(int, org.json.JSONObject):int");
    }

    public final void c(List list) {
        ArrayList arrayList = this.G;
        arrayList.clear();
        SparseArray sparseArray = this.N;
        sparseArray.clear();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                o oVar = (o) list.get(i10);
                arrayList.add(oVar);
                sparseArray.put(oVar.f4400b, Integer.valueOf(i10));
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
                if (this.E != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (qVar.E != null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z10 == z11 && this.f4408b == qVar.f4408b && this.f4409c == qVar.f4409c && this.d == qVar.d && this.f4410e == qVar.f4410e && this.f4411f == qVar.f4411f && this.h == qVar.h && this.f4413r == qVar.f4413r && this.f4414s == qVar.f4414s && this.f4415w == qVar.f4415w && this.f4416x == qVar.f4416x && this.F == qVar.F && Arrays.equals(this.v, qVar.v) && g6.a.d(Long.valueOf(this.f4412n), Long.valueOf(qVar.f4412n)) && g6.a.d(this.G, qVar.G) && g6.a.d(this.f4407a, qVar.f4407a) && (((jSONObject = this.E) == null || (jSONObject2 = qVar.E) == null || u6.c.a(jSONObject, jSONObject2)) && this.H == qVar.H && g6.a.d(this.I, qVar.I) && g6.a.d(this.J, qVar.J) && g6.a.d(this.K, qVar.K) && n6.l.l(this.L, qVar.L) && this.M == qVar.M)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4407a, Long.valueOf(this.f4408b), Integer.valueOf(this.f4409c), Double.valueOf(this.d), Integer.valueOf(this.f4410e), Integer.valueOf(this.f4411f), Long.valueOf(this.h), Long.valueOf(this.f4412n), Double.valueOf(this.f4413r), Boolean.valueOf(this.f4414s), Integer.valueOf(Arrays.hashCode(this.v)), Integer.valueOf(this.f4415w), Integer.valueOf(this.f4416x), String.valueOf(this.E), Integer.valueOf(this.F), this.G, Boolean.valueOf(this.H), this.I, this.J, this.K, this.L});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.E;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f4417y = jSONObject;
        int q6 = w7.d0.q(parcel, 20293);
        w7.d0.k(parcel, 2, this.f4407a, i10);
        long j3 = this.f4408b;
        w7.d0.s(parcel, 3, 8);
        parcel.writeLong(j3);
        int i11 = this.f4409c;
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        double d = this.d;
        w7.d0.s(parcel, 5, 8);
        parcel.writeDouble(d);
        int i12 = this.f4410e;
        w7.d0.s(parcel, 6, 4);
        parcel.writeInt(i12);
        int i13 = this.f4411f;
        w7.d0.s(parcel, 7, 4);
        parcel.writeInt(i13);
        long j10 = this.h;
        w7.d0.s(parcel, 8, 8);
        parcel.writeLong(j10);
        long j11 = this.f4412n;
        w7.d0.s(parcel, 9, 8);
        parcel.writeLong(j11);
        double d10 = this.f4413r;
        w7.d0.s(parcel, 10, 8);
        parcel.writeDouble(d10);
        boolean z10 = this.f4414s;
        w7.d0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        w7.d0.j(parcel, 12, this.v);
        int i14 = this.f4415w;
        w7.d0.s(parcel, 13, 4);
        parcel.writeInt(i14);
        int i15 = this.f4416x;
        w7.d0.s(parcel, 14, 4);
        parcel.writeInt(i15);
        w7.d0.l(parcel, 15, this.f4417y);
        int i16 = this.F;
        w7.d0.s(parcel, 16, 4);
        parcel.writeInt(i16);
        w7.d0.p(parcel, 17, this.G);
        boolean z11 = this.H;
        w7.d0.s(parcel, 18, 4);
        parcel.writeInt(z11 ? 1 : 0);
        w7.d0.k(parcel, 19, this.I, i10);
        w7.d0.k(parcel, 20, this.J, i10);
        w7.d0.k(parcel, 21, this.K, i10);
        w7.d0.k(parcel, 22, this.L, i10);
        w7.d0.r(parcel, q6);
    }
}
