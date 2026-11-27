package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
public final class j07 extends c4 {
    public static final Parcelable.Creator<j07> CREATOR;
    public String E;
    public JSONObject F;
    public int G;
    public boolean I;
    public ba J;
    public bfc K;
    public it6 L;
    public du6 M;
    public boolean N;
    public MediaInfo a;
    public long b;
    public int c;
    public double d;
    public int e;
    public int f;
    public long h;
    public long n;
    public double r;
    public boolean s;
    public long[] w;
    public int x;
    public int y;
    public final ArrayList H = new ArrayList();
    public final SparseArray O = new SparseArray();

    static {
        xve.g("MediaStatus", "The log tag cannot be null or empty.");
        CREATOR = new zkd((byte) 16);
    }

    public j07(MediaInfo mediaInfo, long j, int i, double d, int i2, int i3, long j2, long j3, double d2, boolean z, long[] jArr, int i4, int i5, String str, int i6, ArrayList arrayList, boolean z2, ba baVar, bfc bfcVar, it6 it6Var, du6 du6Var) {
        this.a = mediaInfo;
        this.b = j;
        this.c = i;
        this.d = d;
        this.e = i2;
        this.f = i3;
        this.h = j2;
        this.n = j3;
        this.r = d2;
        this.s = z;
        this.w = jArr;
        this.x = i4;
        this.y = i5;
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
        this.G = i6;
        if (arrayList != null && !arrayList.isEmpty()) {
            c(arrayList);
        }
        this.I = z2;
        this.J = baVar;
        this.K = bfcVar;
        this.L = it6Var;
        this.M = du6Var;
        boolean z3 = false;
        if (du6Var != null && du6Var.s) {
            z3 = true;
        }
        this.N = z3;
    }

    public final int b(org.json.JSONObject r34, int r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j07.b(org.json.JSONObject, int):int");
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = this.H;
        arrayList2.clear();
        SparseArray sparseArray = this.O;
        sparseArray.clear();
        for (int i = 0; i < arrayList.size(); i++) {
            eu6 eu6Var = (eu6) arrayList.get(i);
            arrayList2.add(eu6Var);
            sparseArray.put(eu6Var.b, Integer.valueOf(i));
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof j07) {
                j07 j07Var = (j07) obj;
                if (this.F != null) {
                    z = false;
                } else {
                    z = true;
                }
                if (j07Var.F != null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z != z2 || this.b != j07Var.b || this.c != j07Var.c || this.d != j07Var.d || this.e != j07Var.e || this.f != j07Var.f || this.h != j07Var.h || this.r != j07Var.r || this.s != j07Var.s || this.x != j07Var.x || this.y != j07Var.y || this.G != j07Var.G || !Arrays.equals(this.w, j07Var.w) || !qd1.d(Long.valueOf(this.n), Long.valueOf(j07Var.n)) || !qd1.d(this.H, j07Var.H) || !qd1.d(this.a, j07Var.a) || (((jSONObject = this.F) != null && (jSONObject2 = j07Var.F) != null && !ax5.a(jSONObject, jSONObject2)) || this.I != j07Var.I || !qd1.d(this.J, j07Var.J) || !qd1.d(this.K, j07Var.K) || !qd1.d(this.L, j07Var.L) || !vue.a(this.M, j07Var.M) || this.N != j07Var.N)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.h), Long.valueOf(this.n), Double.valueOf(this.r), Boolean.valueOf(this.s), Integer.valueOf(Arrays.hashCode(this.w)), Integer.valueOf(this.x), Integer.valueOf(this.y), String.valueOf(this.F), Integer.valueOf(this.G), this.H, Boolean.valueOf(this.I), this.J, this.K, this.L, this.M});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        JSONObject jSONObject2 = this.F;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.E = jSONObject;
        int r = bye.r(parcel, 20293);
        bye.k(parcel, 2, this.a, i);
        long j = this.b;
        bye.q(parcel, 3, 8);
        parcel.writeLong(j);
        int i2 = this.c;
        bye.q(parcel, 4, 4);
        parcel.writeInt(i2);
        double d = this.d;
        bye.q(parcel, 5, 8);
        parcel.writeDouble(d);
        int i3 = this.e;
        bye.q(parcel, 6, 4);
        parcel.writeInt(i3);
        int i4 = this.f;
        bye.q(parcel, 7, 4);
        parcel.writeInt(i4);
        long j2 = this.h;
        bye.q(parcel, 8, 8);
        parcel.writeLong(j2);
        long j3 = this.n;
        bye.q(parcel, 9, 8);
        parcel.writeLong(j3);
        double d2 = this.r;
        bye.q(parcel, 10, 8);
        parcel.writeDouble(d2);
        boolean z = this.s;
        bye.q(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        bye.j(parcel, 12, this.w);
        int i5 = this.x;
        bye.q(parcel, 13, 4);
        parcel.writeInt(i5);
        int i6 = this.y;
        bye.q(parcel, 14, 4);
        parcel.writeInt(i6);
        bye.l(parcel, 15, this.E);
        int i7 = this.G;
        bye.q(parcel, 16, 4);
        parcel.writeInt(i7);
        bye.p(parcel, 17, this.H);
        boolean z2 = this.I;
        bye.q(parcel, 18, 4);
        parcel.writeInt(z2 ? 1 : 0);
        bye.k(parcel, 19, this.J, i);
        bye.k(parcel, 20, this.K, i);
        bye.k(parcel, 21, this.L, i);
        bye.k(parcel, 22, this.M, i);
        bye.s(parcel, r);
    }
}
