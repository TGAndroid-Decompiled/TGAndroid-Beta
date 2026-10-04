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
import w7.g0;
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
    public MediaInfo f4357a;
    public long f4358b;
    public int f4359c;
    public double d;
    public int f4360e;
    public int f4361f;
    public long h;
    public long f4362n;
    public double f4363r;
    public boolean f4364s;
    public long[] v;
    public int f4365w;
    public int f4366x;
    public String f4367y;
    public final ArrayList G = new ArrayList();
    public final SparseArray N = new SparseArray();

    static {
        n6.l.g("MediaStatus", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        CREATOR = new v(15);
    }

    public q(MediaInfo mediaInfo, long j3, int i10, double d, int i11, int i12, long j10, long j11, double d10, boolean z10, long[] jArr, int i13, int i14, String str, int i15, ArrayList arrayList, boolean z11, c cVar, u uVar, j jVar, n nVar) {
        this.f4357a = mediaInfo;
        this.f4358b = j3;
        this.f4359c = i10;
        this.d = d;
        this.f4360e = i11;
        this.f4361f = i12;
        this.h = j10;
        this.f4362n = j11;
        this.f4363r = d10;
        this.f4364s = z10;
        this.v = jArr;
        this.f4365w = i13;
        this.f4366x = i14;
        this.f4367y = str;
        if (str != null) {
            try {
                this.E = new JSONObject(this.f4367y);
            } catch (JSONException unused) {
                this.E = null;
                this.f4367y = null;
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
        if (nVar != null && nVar.f4348s) {
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
                sparseArray.put(oVar.f4350b, Integer.valueOf(i10));
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
                if (z10 == z11 && this.f4358b == qVar.f4358b && this.f4359c == qVar.f4359c && this.d == qVar.d && this.f4360e == qVar.f4360e && this.f4361f == qVar.f4361f && this.h == qVar.h && this.f4363r == qVar.f4363r && this.f4364s == qVar.f4364s && this.f4365w == qVar.f4365w && this.f4366x == qVar.f4366x && this.F == qVar.F && Arrays.equals(this.v, qVar.v) && g6.a.d(Long.valueOf(this.f4362n), Long.valueOf(qVar.f4362n)) && g6.a.d(this.G, qVar.G) && g6.a.d(this.f4357a, qVar.f4357a) && (((jSONObject = this.E) == null || (jSONObject2 = qVar.E) == null || u6.c.a(jSONObject, jSONObject2)) && this.H == qVar.H && g6.a.d(this.I, qVar.I) && g6.a.d(this.J, qVar.J) && g6.a.d(this.K, qVar.K) && n6.l.l(this.L, qVar.L) && this.M == qVar.M)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4357a, Long.valueOf(this.f4358b), Integer.valueOf(this.f4359c), Double.valueOf(this.d), Integer.valueOf(this.f4360e), Integer.valueOf(this.f4361f), Long.valueOf(this.h), Long.valueOf(this.f4362n), Double.valueOf(this.f4363r), Boolean.valueOf(this.f4364s), Integer.valueOf(Arrays.hashCode(this.v)), Integer.valueOf(this.f4365w), Integer.valueOf(this.f4366x), String.valueOf(this.E), Integer.valueOf(this.F), this.G, Boolean.valueOf(this.H), this.I, this.J, this.K, this.L});
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
        this.f4367y = jSONObject;
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 2, this.f4357a, i10);
        long j3 = this.f4358b;
        g0.s(parcel, 3, 8);
        parcel.writeLong(j3);
        int i11 = this.f4359c;
        g0.s(parcel, 4, 4);
        parcel.writeInt(i11);
        double d = this.d;
        g0.s(parcel, 5, 8);
        parcel.writeDouble(d);
        int i12 = this.f4360e;
        g0.s(parcel, 6, 4);
        parcel.writeInt(i12);
        int i13 = this.f4361f;
        g0.s(parcel, 7, 4);
        parcel.writeInt(i13);
        long j10 = this.h;
        g0.s(parcel, 8, 8);
        parcel.writeLong(j10);
        long j11 = this.f4362n;
        g0.s(parcel, 9, 8);
        parcel.writeLong(j11);
        double d10 = this.f4363r;
        g0.s(parcel, 10, 8);
        parcel.writeDouble(d10);
        boolean z10 = this.f4364s;
        g0.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        g0.j(parcel, 12, this.v);
        int i14 = this.f4365w;
        g0.s(parcel, 13, 4);
        parcel.writeInt(i14);
        int i15 = this.f4366x;
        g0.s(parcel, 14, 4);
        parcel.writeInt(i15);
        g0.l(parcel, 15, this.f4367y);
        int i16 = this.F;
        g0.s(parcel, 16, 4);
        parcel.writeInt(i16);
        g0.p(parcel, 17, this.G);
        boolean z11 = this.H;
        g0.s(parcel, 18, 4);
        parcel.writeInt(z11 ? 1 : 0);
        g0.k(parcel, 19, this.I, i10);
        g0.k(parcel, 20, this.J, i10);
        g0.k(parcel, 21, this.K, i10);
        g0.k(parcel, 22, this.L, i10);
        g0.r(parcel, q6);
    }
}
