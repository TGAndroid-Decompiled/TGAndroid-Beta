package d4;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
public final class e {
    public static final boolean[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int v = c(2, 2, 2, 0);
    public static final int f7526w;
    public static final int[] f7527x;
    public static final int[] f7528y;
    public static final int[] f7529z;
    public final ArrayList f7530a = new ArrayList();
    public final SpannableStringBuilder f7531b = new SpannableStringBuilder();
    public boolean f7532c;
    public boolean d;
    public int f7533e;
    public boolean f7534f;
    public int f7535g;
    public int h;
    public int f7536i;
    public int f7537j;
    public int f7538k;
    public int f7539l;
    public int f7540m;
    public int f7541n;
    public int f7542o;
    public int f7543p;
    public int f7544q;
    public int f7545r;
    public int f7546s;
    public int f7547t;
    public int f7548u;

    static {
        int c10 = c(0, 0, 0, 0);
        f7526w = c10;
        int c11 = c(0, 0, 0, 3);
        f7527x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f7528y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f7529z = new int[]{3, 3, 3, 3, 3, 3, 1};
        A = new boolean[]{false, false, false, true, true, true, false};
        B = new int[]{c10, c11, c10, c10, c11, c10, c10};
        C = new int[]{0, 1, 2, 3, 4, 3, 4};
        D = new int[]{0, 0, 0, 0, 0, 3, 3};
        E = new int[]{c10, c10, c10, c10, c10, c11, c11};
    }

    public e() {
        d();
    }

    public static int c(int r4, int r5, int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: d4.e.c(int, int, int, int):int");
    }

    public final void a(char c10) {
        SpannableStringBuilder spannableStringBuilder = this.f7531b;
        if (c10 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f7530a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f7542o != -1) {
                this.f7542o = 0;
            }
            if (this.f7543p != -1) {
                this.f7543p = 0;
            }
            if (this.f7544q != -1) {
                this.f7544q = 0;
            }
            if (this.f7546s != -1) {
                this.f7546s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f7537j && arrayList.size() < 15) {
                    this.f7548u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f7531b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f7542o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f7542o, length, 33);
            }
            if (this.f7543p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7543p, length, 33);
            }
            if (this.f7544q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7545r), this.f7544q, length, 33);
            }
            if (this.f7546s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7547t), this.f7546s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f7530a.clear();
        this.f7531b.clear();
        this.f7542o = -1;
        this.f7543p = -1;
        this.f7544q = -1;
        this.f7546s = -1;
        this.f7548u = 0;
        this.f7532c = false;
        this.d = false;
        this.f7533e = 4;
        this.f7534f = false;
        this.f7535g = 0;
        this.h = 0;
        this.f7536i = 0;
        this.f7537j = 15;
        this.f7538k = 0;
        this.f7539l = 0;
        this.f7540m = 0;
        int i7 = f7526w;
        this.f7541n = i7;
        this.f7545r = v;
        this.f7547t = i7;
    }

    public final void e(boolean z10, boolean z11) {
        int i7 = this.f7542o;
        SpannableStringBuilder spannableStringBuilder = this.f7531b;
        if (i7 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f7542o, spannableStringBuilder.length(), 33);
                this.f7542o = -1;
            }
        } else if (z10) {
            this.f7542o = spannableStringBuilder.length();
        }
        if (this.f7543p != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7543p, spannableStringBuilder.length(), 33);
                this.f7543p = -1;
            }
        } else if (z11) {
            this.f7543p = spannableStringBuilder.length();
        }
    }

    public final void f(int i7, int i10) {
        int i11 = this.f7544q;
        SpannableStringBuilder spannableStringBuilder = this.f7531b;
        if (i11 != -1 && this.f7545r != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7545r), this.f7544q, spannableStringBuilder.length(), 33);
        }
        if (i7 != v) {
            this.f7544q = spannableStringBuilder.length();
            this.f7545r = i7;
        }
        if (this.f7546s != -1 && this.f7547t != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7547t), this.f7546s, spannableStringBuilder.length(), 33);
        }
        if (i10 != f7526w) {
            this.f7546s = spannableStringBuilder.length();
            this.f7547t = i10;
        }
    }
}
