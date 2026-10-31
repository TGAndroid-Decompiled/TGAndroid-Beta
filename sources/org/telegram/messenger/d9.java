package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Set;
public final class d9 {
    public byte[] A;
    public final boolean B;
    public int C;
    public boolean D;
    public boolean E;
    public String F;
    public long G;
    public int H;
    public RandomAccessFile I;
    public boolean J;
    public int K;
    public SharedPreferences L;
    public final int M;
    public int N;
    public long O;
    public boolean P;
    public long S;
    public volatile boolean T;
    public final int f15195a;
    public boolean f15196b;
    public boolean f15197c;
    public int d;
    public int e;
    public boolean f15200i;
    public ArrayList f15201j;
    public int f15202k;
    public final String f15203l;
    public int f15204m;
    public byte[] f15205n;
    public y7 f15206o;
    public int f15209r;
    public long f15210s;
    public long f15211t;
    public int f15212u;
    public long v;
    public long f15213w;
    public int f15214x;
    public byte[] f15215y;
    public byte[] f15216z;
    public int f15198f = 4;
    public final int[] f15199g = new int[8];
    public int h = 65536;
    public final SparseIntArray f15207p = new SparseIntArray();
    public final ArrayList f15208q = new ArrayList();
    public final SparseArray Q = new SparseArray();
    public final boolean[] R = {false, false};

    public d9(int i10, int i11, long j10, String str, boolean z10) {
        boolean z11;
        this.f15195a = i10;
        this.f15203l = str;
        this.B = z10;
        this.G = j10;
        this.M = i11;
        if (j10 != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.P = z11;
    }

    public final void a() {
        if (this.P) {
            if (this.D) {
                long j10 = this.f15211t;
                long j11 = this.h;
                this.f15212u = ((int) ((((j10 - j11) + j11) - 1) / j11)) + 1;
                return;
            }
            long j12 = this.h;
            this.f15212u = ((int) ((((this.f15211t - 1024) + j12) - 1) / j12)) + 1;
            return;
        }
        long j13 = this.f15211t;
        long j14 = this.h;
        this.f15212u = (int) (((j13 + j14) - 1) / j14);
    }

    public final void b() {
        if (this.L == null) {
            this.L = w0.f19025b.getSharedPreferences("uploadinfo", 0);
        }
        SharedPreferences.Editor edit = this.L.edit();
        SharedPreferences.Editor remove = edit.remove(this.F + "_time");
        SharedPreferences.Editor remove2 = remove.remove(this.F + "_size");
        SharedPreferences.Editor remove3 = remove2.remove(this.F + "_uploaded");
        SharedPreferences.Editor remove4 = remove3.remove(this.F + "_id");
        SharedPreferences.Editor remove5 = remove4.remove(this.F + "_iv");
        SharedPreferences.Editor remove6 = remove5.remove(this.F + "_key");
        remove6.remove(this.F + "_ivc").commit();
        try {
            RandomAccessFile randomAccessFile = this.I;
            if (randomAccessFile != null) {
                randomAccessFile.close();
                this.I = null;
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
        String str = this.f15203l;
        if (str == null) {
            Set set = c1.f14889a;
        } else {
            c1.f14889a.remove(str);
        }
    }

    public final void c() {
        if (this.f15204m != 0) {
            return;
        }
        this.f15204m = 1;
        String str = this.f15203l;
        if (str == null) {
            Set set = c1.f14889a;
        } else {
            c1.f14889a.add(str);
        }
        Utilities.d.c(new z8(this, 0));
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d9.d():void");
    }

    public final void e() {
        int i10;
        while (this.f15204m == 1 && (i10 = this.K) < this.e) {
            d();
            if (this.K == i10) {
                return;
            }
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = this.L.edit();
        edit.putInt(a1.g.r(new StringBuilder(), this.F, "_time"), this.H);
        edit.putLong(a1.g.r(new StringBuilder(), this.F, "_size"), this.f15211t);
        edit.putLong(a1.g.r(new StringBuilder(), this.F, "_id"), this.f15210s);
        edit.remove(this.F + "_uploaded");
        if (this.B) {
            edit.putString(a1.g.r(new StringBuilder(), this.F, "_iv"), Utilities.f(this.f15216z));
            edit.putString(a1.g.r(new StringBuilder(), this.F, "_ivc"), Utilities.f(this.A));
            edit.putString(a1.g.r(new StringBuilder(), this.F, "_key"), Utilities.f(this.f15215y));
        }
        edit.commit();
    }
}
