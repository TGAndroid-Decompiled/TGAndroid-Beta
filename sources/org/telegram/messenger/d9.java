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
    public final int f15310a;
    public boolean f15311b;
    public boolean f15312c;
    public int d;
    public int e;
    public boolean f15315i;
    public ArrayList f15316j;
    public int f15317k;
    public final String f15318l;
    public int f15319m;
    public byte[] f15320n;
    public y7 f15321o;
    public int f15324r;
    public long f15325s;
    public long f15326t;
    public int f15327u;
    public long v;
    public long f15328w;
    public int f15329x;
    public byte[] f15330y;
    public byte[] f15331z;
    public int f15313f = 4;
    public final int[] f15314g = new int[8];
    public int h = 65536;
    public final SparseIntArray f15322p = new SparseIntArray();
    public final ArrayList f15323q = new ArrayList();
    public final SparseArray Q = new SparseArray();
    public final boolean[] R = {false, false};

    public d9(int i10, int i11, long j10, String str, boolean z10) {
        boolean z11;
        this.f15310a = i10;
        this.f15318l = str;
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
                long j10 = this.f15326t;
                long j11 = this.h;
                this.f15327u = ((int) ((((j10 - j11) + j11) - 1) / j11)) + 1;
                return;
            }
            long j12 = this.h;
            this.f15327u = ((int) ((((this.f15326t - 1024) + j12) - 1) / j12)) + 1;
            return;
        }
        long j13 = this.f15326t;
        long j14 = this.h;
        this.f15327u = (int) (((j13 + j14) - 1) / j14);
    }

    public final void b() {
        if (this.L == null) {
            this.L = w0.f18945b.getSharedPreferences("uploadinfo", 0);
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
        String str = this.f15318l;
        if (str == null) {
            Set set = c1.f15048a;
        } else {
            c1.f15048a.remove(str);
        }
    }

    public final void c() {
        if (this.f15319m != 0) {
            return;
        }
        this.f15319m = 1;
        String str = this.f15318l;
        if (str == null) {
            Set set = c1.f15048a;
        } else {
            c1.f15048a.add(str);
        }
        Utilities.d.c(new z8(this, 0));
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d9.d():void");
    }

    public final void e() {
        int i10;
        while (this.f15319m == 1 && (i10 = this.K) < this.e) {
            d();
            if (this.K == i10) {
                return;
            }
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = this.L.edit();
        edit.putInt(a1.g.r(new StringBuilder(), this.F, "_time"), this.H);
        edit.putLong(a1.g.r(new StringBuilder(), this.F, "_size"), this.f15326t);
        edit.putLong(a1.g.r(new StringBuilder(), this.F, "_id"), this.f15325s);
        edit.remove(this.F + "_uploaded");
        if (this.B) {
            edit.putString(a1.g.r(new StringBuilder(), this.F, "_iv"), Utilities.f(this.f15331z));
            edit.putString(a1.g.r(new StringBuilder(), this.F, "_ivc"), Utilities.f(this.A));
            edit.putString(a1.g.r(new StringBuilder(), this.F, "_key"), Utilities.f(this.f15330y));
        }
        edit.commit();
    }
}
