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
    public static final int f7841w;
    public static final int[] f7842x;
    public static final int[] f7843y;
    public static final int[] f7844z;
    public final ArrayList f7845a = new ArrayList();
    public final SpannableStringBuilder f7846b = new SpannableStringBuilder();
    public boolean f7847c;
    public boolean d;
    public int f7848e;
    public boolean f7849f;
    public int f7850g;
    public int h;
    public int f7851i;
    public int f7852j;
    public int f7853k;
    public int f7854l;
    public int f7855m;
    public int f7856n;
    public int f7857o;
    public int f7858p;
    public int f7859q;
    public int f7860r;
    public int f7861s;
    public int f7862t;
    public int f7863u;

    static {
        int c10 = c(0, 0, 0, 0);
        f7841w = c10;
        int c11 = c(0, 0, 0, 3);
        f7842x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f7843y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f7844z = new int[]{3, 3, 3, 3, 3, 3, 1};
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
        SpannableStringBuilder spannableStringBuilder = this.f7846b;
        if (c10 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f7845a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f7857o != -1) {
                this.f7857o = 0;
            }
            if (this.f7858p != -1) {
                this.f7858p = 0;
            }
            if (this.f7859q != -1) {
                this.f7859q = 0;
            }
            if (this.f7861s != -1) {
                this.f7861s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f7852j && arrayList.size() < 15) {
                    this.f7863u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f7846b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f7857o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f7857o, length, 33);
            }
            if (this.f7858p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7858p, length, 33);
            }
            if (this.f7859q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7860r), this.f7859q, length, 33);
            }
            if (this.f7861s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7862t), this.f7861s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f7845a.clear();
        this.f7846b.clear();
        this.f7857o = -1;
        this.f7858p = -1;
        this.f7859q = -1;
        this.f7861s = -1;
        this.f7863u = 0;
        this.f7847c = false;
        this.d = false;
        this.f7848e = 4;
        this.f7849f = false;
        this.f7850g = 0;
        this.h = 0;
        this.f7851i = 0;
        this.f7852j = 15;
        this.f7853k = 0;
        this.f7854l = 0;
        this.f7855m = 0;
        int i7 = f7841w;
        this.f7856n = i7;
        this.f7860r = v;
        this.f7862t = i7;
    }

    public final void e(boolean z10, boolean z11) {
        int i7 = this.f7857o;
        SpannableStringBuilder spannableStringBuilder = this.f7846b;
        if (i7 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f7857o, spannableStringBuilder.length(), 33);
                this.f7857o = -1;
            }
        } else if (z10) {
            this.f7857o = spannableStringBuilder.length();
        }
        if (this.f7858p != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7858p, spannableStringBuilder.length(), 33);
                this.f7858p = -1;
            }
        } else if (z11) {
            this.f7858p = spannableStringBuilder.length();
        }
    }

    public final void f(int i7, int i10) {
        int i11 = this.f7859q;
        SpannableStringBuilder spannableStringBuilder = this.f7846b;
        if (i11 != -1 && this.f7860r != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7860r), this.f7859q, spannableStringBuilder.length(), 33);
        }
        if (i7 != v) {
            this.f7859q = spannableStringBuilder.length();
            this.f7860r = i7;
        }
        if (this.f7861s != -1 && this.f7862t != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7862t), this.f7861s, spannableStringBuilder.length(), 33);
        }
        if (i10 != f7841w) {
            this.f7861s = spannableStringBuilder.length();
            this.f7862t = i10;
        }
    }
}
