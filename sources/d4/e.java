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
    public static final int f7838w;
    public static final int[] f7839x;
    public static final int[] f7840y;
    public static final int[] f7841z;
    public final ArrayList f7842a = new ArrayList();
    public final SpannableStringBuilder f7843b = new SpannableStringBuilder();
    public boolean f7844c;
    public boolean d;
    public int f7845e;
    public boolean f7846f;
    public int f7847g;
    public int h;
    public int f7848i;
    public int f7849j;
    public int f7850k;
    public int f7851l;
    public int f7852m;
    public int f7853n;
    public int f7854o;
    public int f7855p;
    public int f7856q;
    public int f7857r;
    public int f7858s;
    public int f7859t;
    public int f7860u;

    static {
        int c10 = c(0, 0, 0, 0);
        f7838w = c10;
        int c11 = c(0, 0, 0, 3);
        f7839x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f7840y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f7841z = new int[]{3, 3, 3, 3, 3, 3, 1};
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
        SpannableStringBuilder spannableStringBuilder = this.f7843b;
        if (c10 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f7842a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f7854o != -1) {
                this.f7854o = 0;
            }
            if (this.f7855p != -1) {
                this.f7855p = 0;
            }
            if (this.f7856q != -1) {
                this.f7856q = 0;
            }
            if (this.f7858s != -1) {
                this.f7858s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f7849j && arrayList.size() < 15) {
                    this.f7860u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f7843b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f7854o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f7854o, length, 33);
            }
            if (this.f7855p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7855p, length, 33);
            }
            if (this.f7856q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7857r), this.f7856q, length, 33);
            }
            if (this.f7858s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7859t), this.f7858s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f7842a.clear();
        this.f7843b.clear();
        this.f7854o = -1;
        this.f7855p = -1;
        this.f7856q = -1;
        this.f7858s = -1;
        this.f7860u = 0;
        this.f7844c = false;
        this.d = false;
        this.f7845e = 4;
        this.f7846f = false;
        this.f7847g = 0;
        this.h = 0;
        this.f7848i = 0;
        this.f7849j = 15;
        this.f7850k = 0;
        this.f7851l = 0;
        this.f7852m = 0;
        int i7 = f7838w;
        this.f7853n = i7;
        this.f7857r = v;
        this.f7859t = i7;
    }

    public final void e(boolean z10, boolean z11) {
        int i7 = this.f7854o;
        SpannableStringBuilder spannableStringBuilder = this.f7843b;
        if (i7 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f7854o, spannableStringBuilder.length(), 33);
                this.f7854o = -1;
            }
        } else if (z10) {
            this.f7854o = spannableStringBuilder.length();
        }
        if (this.f7855p != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7855p, spannableStringBuilder.length(), 33);
                this.f7855p = -1;
            }
        } else if (z11) {
            this.f7855p = spannableStringBuilder.length();
        }
    }

    public final void f(int i7, int i10) {
        int i11 = this.f7856q;
        SpannableStringBuilder spannableStringBuilder = this.f7843b;
        if (i11 != -1 && this.f7857r != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7857r), this.f7856q, spannableStringBuilder.length(), 33);
        }
        if (i7 != v) {
            this.f7856q = spannableStringBuilder.length();
            this.f7857r = i7;
        }
        if (this.f7858s != -1 && this.f7859t != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7859t), this.f7858s, spannableStringBuilder.length(), 33);
        }
        if (i10 != f7838w) {
            this.f7858s = spannableStringBuilder.length();
            this.f7859t = i10;
        }
    }
}
