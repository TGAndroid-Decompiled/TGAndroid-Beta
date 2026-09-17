package a4;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
public final class g {
    public static final boolean[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int v = c(2, 2, 2, 0);
    public static final int f250w;
    public static final int[] f251x;
    public static final int[] f252y;
    public static final int[] f253z;
    public final ArrayList f254a = new ArrayList();
    public final SpannableStringBuilder f255b = new SpannableStringBuilder();
    public boolean f256c;
    public boolean d;
    public int f257e;
    public boolean f258f;
    public int f259g;
    public int h;
    public int f260i;
    public int f261j;
    public int f262k;
    public int f263l;
    public int f264m;
    public int f265n;
    public int f266o;
    public int f267p;
    public int f268q;
    public int f269r;
    public int f270s;
    public int f271t;
    public int f272u;

    static {
        int c10 = c(0, 0, 0, 0);
        f250w = c10;
        int c11 = c(0, 0, 0, 3);
        f251x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f252y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f253z = new int[]{3, 3, 3, 3, 3, 3, 1};
        A = new boolean[]{false, false, false, true, true, true, false};
        B = new int[]{c10, c11, c10, c10, c11, c10, c10};
        C = new int[]{0, 1, 2, 3, 4, 3, 4};
        D = new int[]{0, 0, 0, 0, 0, 3, 3};
        E = new int[]{c10, c10, c10, c10, c10, c11, c11};
    }

    public g() {
        d();
    }

    public static int c(int r4, int r5, int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: a4.g.c(int, int, int, int):int");
    }

    public final void a(char c10) {
        SpannableStringBuilder spannableStringBuilder = this.f255b;
        if (c10 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f254a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f266o != -1) {
                this.f266o = 0;
            }
            if (this.f267p != -1) {
                this.f267p = 0;
            }
            if (this.f268q != -1) {
                this.f268q = 0;
            }
            if (this.f270s != -1) {
                this.f270s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f261j && arrayList.size() < 15) {
                    this.f272u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f255b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f266o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f266o, length, 33);
            }
            if (this.f267p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f267p, length, 33);
            }
            if (this.f268q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f269r), this.f268q, length, 33);
            }
            if (this.f270s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f271t), this.f270s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f254a.clear();
        this.f255b.clear();
        this.f266o = -1;
        this.f267p = -1;
        this.f268q = -1;
        this.f270s = -1;
        this.f272u = 0;
        this.f256c = false;
        this.d = false;
        this.f257e = 4;
        this.f258f = false;
        this.f259g = 0;
        this.h = 0;
        this.f260i = 0;
        this.f261j = 15;
        this.f262k = 0;
        this.f263l = 0;
        this.f264m = 0;
        int i10 = f250w;
        this.f265n = i10;
        this.f269r = v;
        this.f271t = i10;
    }

    public final void e(boolean z10, boolean z11) {
        int i10 = this.f266o;
        SpannableStringBuilder spannableStringBuilder = this.f255b;
        if (i10 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f266o, spannableStringBuilder.length(), 33);
                this.f266o = -1;
            }
        } else if (z10) {
            this.f266o = spannableStringBuilder.length();
        }
        if (this.f267p != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f267p, spannableStringBuilder.length(), 33);
                this.f267p = -1;
            }
        } else if (z11) {
            this.f267p = spannableStringBuilder.length();
        }
    }

    public final void f(int i10, int i11) {
        int i12 = this.f268q;
        SpannableStringBuilder spannableStringBuilder = this.f255b;
        if (i12 != -1 && this.f269r != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f269r), this.f268q, spannableStringBuilder.length(), 33);
        }
        if (i10 != v) {
            this.f268q = spannableStringBuilder.length();
            this.f269r = i10;
        }
        if (this.f270s != -1 && this.f271t != i11) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f271t), this.f270s, spannableStringBuilder.length(), 33);
        }
        if (i11 != f250w) {
            this.f270s = spannableStringBuilder.length();
            this.f271t = i11;
        }
    }
}
