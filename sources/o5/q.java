package o5;

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
public final class q extends a6.a {
    public static final Parcelable.Creator<q> CREATOR;
    public JSONObject A;
    public int B;
    public boolean D;
    public c E;
    public u F;
    public j G;
    public n H;
    public boolean I;
    public MediaInfo f19312a;
    public long f19313b;
    public int f19314c;
    public double d;
    public int f19315e;
    public int f19316f;
    public long h;
    public long f19317n;
    public double f19318r;
    public boolean f19319s;
    public long[] v;
    public int f19320w;
    public int f19321x;
    public String f19322y;
    public final ArrayList C = new ArrayList();
    public final SparseArray J = new SparseArray();

    static {
        z5.l.g("MediaStatus", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        CREATOR = new v(15);
    }

    public q(MediaInfo mediaInfo, long j10, int i10, double d, int i11, int i12, long j11, long j12, double d10, boolean z10, long[] jArr, int i13, int i14, String str, int i15, ArrayList arrayList, boolean z11, c cVar, u uVar, j jVar, n nVar) {
        this.f19312a = mediaInfo;
        this.f19313b = j10;
        this.f19314c = i10;
        this.d = d;
        this.f19315e = i11;
        this.f19316f = i12;
        this.h = j11;
        this.f19317n = j12;
        this.f19318r = d10;
        this.f19319s = z10;
        this.v = jArr;
        this.f19320w = i13;
        this.f19321x = i14;
        this.f19322y = str;
        if (str != null) {
            try {
                this.A = new JSONObject(this.f19322y);
            } catch (JSONException unused) {
                this.A = null;
                this.f19322y = null;
            }
        } else {
            this.A = null;
        }
        this.B = i15;
        if (arrayList != null && !arrayList.isEmpty()) {
            c(arrayList);
        }
        this.D = z11;
        this.E = cVar;
        this.F = uVar;
        this.G = jVar;
        this.H = nVar;
        boolean z12 = false;
        if (nVar != null && nVar.f19303s) {
            z12 = true;
        }
        this.I = z12;
    }

    public final int b(int r35, org.json.JSONObject r36) {
        throw new UnsupportedOperationException("Method not decompiled: o5.q.b(int, org.json.JSONObject):int");
    }

    public final void c(List list) {
        ArrayList arrayList = this.C;
        arrayList.clear();
        SparseArray sparseArray = this.J;
        sparseArray.clear();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                o oVar = (o) list.get(i10);
                arrayList.add(oVar);
                sparseArray.put(oVar.f19305b, Integer.valueOf(i10));
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
                if (this.A != null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (qVar.A != null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z10 == z11 && this.f19313b == qVar.f19313b && this.f19314c == qVar.f19314c && this.d == qVar.d && this.f19315e == qVar.f19315e && this.f19316f == qVar.f19316f && this.h == qVar.h && this.f19318r == qVar.f19318r && this.f19319s == qVar.f19319s && this.f19320w == qVar.f19320w && this.f19321x == qVar.f19321x && this.B == qVar.B && Arrays.equals(this.v, qVar.v) && s5.a.d(Long.valueOf(this.f19317n), Long.valueOf(qVar.f19317n)) && s5.a.d(this.C, qVar.C) && s5.a.d(this.f19312a, qVar.f19312a) && (((jSONObject = this.A) == null || (jSONObject2 = qVar.A) == null || g6.c.a(jSONObject, jSONObject2)) && this.D == qVar.D && s5.a.d(this.E, qVar.E) && s5.a.d(this.F, qVar.F) && s5.a.d(this.G, qVar.G) && z5.l.l(this.H, qVar.H) && this.I == qVar.I)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19312a, Long.valueOf(this.f19313b), Integer.valueOf(this.f19314c), Double.valueOf(this.d), Integer.valueOf(this.f19315e), Integer.valueOf(this.f19316f), Long.valueOf(this.h), Long.valueOf(this.f19317n), Double.valueOf(this.f19318r), Boolean.valueOf(this.f19319s), Integer.valueOf(Arrays.hashCode(this.v)), Integer.valueOf(this.f19320w), Integer.valueOf(this.f19321x), String.valueOf(this.A), Integer.valueOf(this.B), this.C, Boolean.valueOf(this.D), this.E, this.F, this.G, this.H});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        String jSONObject;
        JSONObject jSONObject2 = this.A;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.f19322y = jSONObject;
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.k(parcel, 2, this.f19312a, i10);
        long j10 = this.f19313b;
        com.google.android.gms.internal.cast.o.s(parcel, 3, 8);
        parcel.writeLong(j10);
        int i11 = this.f19314c;
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(i11);
        double d = this.d;
        com.google.android.gms.internal.cast.o.s(parcel, 5, 8);
        parcel.writeDouble(d);
        int i12 = this.f19315e;
        com.google.android.gms.internal.cast.o.s(parcel, 6, 4);
        parcel.writeInt(i12);
        int i13 = this.f19316f;
        com.google.android.gms.internal.cast.o.s(parcel, 7, 4);
        parcel.writeInt(i13);
        long j11 = this.h;
        com.google.android.gms.internal.cast.o.s(parcel, 8, 8);
        parcel.writeLong(j11);
        long j12 = this.f19317n;
        com.google.android.gms.internal.cast.o.s(parcel, 9, 8);
        parcel.writeLong(j12);
        double d10 = this.f19318r;
        com.google.android.gms.internal.cast.o.s(parcel, 10, 8);
        parcel.writeDouble(d10);
        boolean z10 = this.f19319s;
        com.google.android.gms.internal.cast.o.s(parcel, 11, 4);
        parcel.writeInt(z10 ? 1 : 0);
        com.google.android.gms.internal.cast.o.j(parcel, 12, this.v);
        int i14 = this.f19320w;
        com.google.android.gms.internal.cast.o.s(parcel, 13, 4);
        parcel.writeInt(i14);
        int i15 = this.f19321x;
        com.google.android.gms.internal.cast.o.s(parcel, 14, 4);
        parcel.writeInt(i15);
        com.google.android.gms.internal.cast.o.l(parcel, 15, this.f19322y);
        int i16 = this.B;
        com.google.android.gms.internal.cast.o.s(parcel, 16, 4);
        parcel.writeInt(i16);
        com.google.android.gms.internal.cast.o.p(parcel, 17, this.C);
        boolean z11 = this.D;
        com.google.android.gms.internal.cast.o.s(parcel, 18, 4);
        parcel.writeInt(z11 ? 1 : 0);
        com.google.android.gms.internal.cast.o.k(parcel, 19, this.E, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 20, this.F, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 21, this.G, i10);
        com.google.android.gms.internal.cast.o.k(parcel, 22, this.H, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
