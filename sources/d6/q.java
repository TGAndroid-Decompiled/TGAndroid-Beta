package d6;

import a8.df;
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
public final class q extends p6.a {
    public static final Parcelable.Creator<q> CREATOR;
    public JSONObject E;
    public int F;
    public boolean H;
    public c I;
    public u J;
    public j K;
    public n L;
    public boolean M;
    public MediaInfo f8118a;
    public long f8119b;
    public int f8120c;
    public double d;
    public int e;
    public int f8121f;
    public long h;
    public long f8122n;
    public double f8123r;
    public boolean f8124s;
    public long[] v;
    public int f8125w;
    public int f8126x;
    public String f8127y;
    public final ArrayList G = new ArrayList();
    public final SparseArray N = new SparseArray();

    static {
        o6.l.g("MediaStatus", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        CREATOR = new v(15);
    }

    public q(MediaInfo mediaInfo, long j10, int i10, double d, int i11, int i12, long j11, long j12, double d10, boolean z10, long[] jArr, int i13, int i14, String str, int i15, ArrayList arrayList, boolean z11, c cVar, u uVar, j jVar, n nVar) {
        this.f8118a = mediaInfo;
        this.f8119b = j10;
        this.f8120c = i10;
        this.d = d;
        this.e = i11;
        this.f8121f = i12;
        this.h = j11;
        this.f8122n = j12;
        this.f8123r = d10;
        this.f8124s = z10;
        this.v = jArr;
        this.f8125w = i13;
        this.f8126x = i14;
        this.f8127y = str;
        if (str != null) {
            try {
                this.E = new JSONObject(this.f8127y);
            } catch (JSONException unused) {
                this.E = null;
                this.f8127y = null;
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
        if (nVar != null && nVar.f8110s) {
            z12 = true;
        }
        this.M = z12;
    }

    public final int b(int r35, org.json.JSONObject r36) {
        throw new UnsupportedOperationException("Method not decompiled: d6.q.b(int, org.json.JSONObject):int");
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
                sparseArray.put(oVar.f8112b, Integer.valueOf(i10));
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
                if (z10 == z11 && this.f8119b == qVar.f8119b && this.f8120c == qVar.f8120c && this.d == qVar.d && this.e == qVar.e && this.f8121f == qVar.f8121f && this.h == qVar.h && this.f8123r == qVar.f8123r && this.f8124s == qVar.f8124s && this.f8125w == qVar.f8125w && this.f8126x == qVar.f8126x && this.F == qVar.F && Arrays.equals(this.v, qVar.v) && h6.a.d(Long.valueOf(this.f8122n), Long.valueOf(qVar.f8122n)) && h6.a.d(this.G, qVar.G) && h6.a.d(this.f8118a, qVar.f8118a) && (((jSONObject = this.E) == null || (jSONObject2 = qVar.E) == null || v6.c.a(jSONObject, jSONObject2)) && this.H == qVar.H && h6.a.d(this.I, qVar.I) && h6.a.d(this.J, qVar.J) && h6.a.d(this.K, qVar.K) && o6.l.l(this.L, qVar.L) && this.M == qVar.M)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8118a, Long.valueOf(this.f8119b), Integer.valueOf(this.f8120c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f8121f), Long.valueOf(this.h), Long.valueOf(this.f8122n), Double.valueOf(this.f8123r), Boolean.valueOf(this.f8124s), Integer.valueOf(Arrays.hashCode(this.v)), Integer.valueOf(this.f8125w), Integer.valueOf(this.f8126x), String.valueOf(this.E), Integer.valueOf(this.F), this.G, Boolean.valueOf(this.H), this.I, this.J, this.K, this.L});
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
        this.f8127y = jSONObject;
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 2, this.f8118a, i10);
        long j10 = this.f8119b;
        df.s(parcel, 3, 8);
        parcel.writeLong(j10);
        int i11 = this.f8120c;
        df.s(parcel, 4, 4);
        parcel.writeInt(i11);
        double d = this.d;
        df.s(parcel, 5, 8);
        parcel.writeDouble(d);
        int i12 = this.e;
        df.s(parcel, 6, 4);
        parcel.writeInt(i12);
        int i13 = this.f8121f;
        df.s(parcel, 7, 4);
        parcel.writeInt(i13);
        long j11 = this.h;
        df.s(parcel, 8, 8);
        parcel.writeLong(j11);
        long j12 = this.f8122n;
        df.s(parcel, 9, 8);
        parcel.writeLong(j12);
        double d10 = this.f8123r;
        df.s(parcel, 10, 8);
        parcel.writeDouble(d10);
        boolean z10 = this.f8124s;
        df.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        df.j(parcel, 12, this.v);
        int i14 = this.f8125w;
        df.s(parcel, 13, 4);
        parcel.writeInt(i14);
        int i15 = this.f8126x;
        df.s(parcel, 14, 4);
        parcel.writeInt(i15);
        df.l(parcel, 15, this.f8127y);
        int i16 = this.F;
        df.s(parcel, 16, 4);
        parcel.writeInt(i16);
        df.p(parcel, 17, this.G);
        boolean z11 = this.H;
        df.s(parcel, 18, 4);
        parcel.writeInt(z11 ? 1 : 0);
        df.k(parcel, 19, this.I, i10);
        df.k(parcel, 20, this.J, i10);
        df.k(parcel, 21, this.K, i10);
        df.k(parcel, 22, this.L, i10);
        df.r(parcel, q5);
    }
}
