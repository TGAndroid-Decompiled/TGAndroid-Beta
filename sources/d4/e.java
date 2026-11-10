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
    public static final int f8143w;
    public static final int[] f8144x;
    public static final int[] f8145y;
    public static final int[] f8146z;
    public final ArrayList f8147a = new ArrayList();
    public final SpannableStringBuilder f8148b = new SpannableStringBuilder();
    public boolean f8149c;
    public boolean d;
    public int f8150e;
    public boolean f8151f;
    public int f8152g;
    public int h;
    public int f8153i;
    public int f8154j;
    public int f8155k;
    public int f8156l;
    public int f8157m;
    public int f8158n;
    public int f8159o;
    public int f8160p;
    public int f8161q;
    public int f8162r;
    public int f8163s;
    public int f8164t;
    public int f8165u;

    static {
        int c10 = c(0, 0, 0, 0);
        f8143w = c10;
        int c11 = c(0, 0, 0, 3);
        f8144x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f8145y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f8146z = new int[]{3, 3, 3, 3, 3, 3, 1};
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
        SpannableStringBuilder spannableStringBuilder = this.f8148b;
        if (c10 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f8147a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f8159o != -1) {
                this.f8159o = 0;
            }
            if (this.f8160p != -1) {
                this.f8160p = 0;
            }
            if (this.f8161q != -1) {
                this.f8161q = 0;
            }
            if (this.f8163s != -1) {
                this.f8163s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f8154j && arrayList.size() < 15) {
                    this.f8165u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f8148b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f8159o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f8159o, length, 33);
            }
            if (this.f8160p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f8160p, length, 33);
            }
            if (this.f8161q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f8162r), this.f8161q, length, 33);
            }
            if (this.f8163s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f8164t), this.f8163s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f8147a.clear();
        this.f8148b.clear();
        this.f8159o = -1;
        this.f8160p = -1;
        this.f8161q = -1;
        this.f8163s = -1;
        this.f8165u = 0;
        this.f8149c = false;
        this.d = false;
        this.f8150e = 4;
        this.f8151f = false;
        this.f8152g = 0;
        this.h = 0;
        this.f8153i = 0;
        this.f8154j = 15;
        this.f8155k = 0;
        this.f8156l = 0;
        this.f8157m = 0;
        int i7 = f8143w;
        this.f8158n = i7;
        this.f8162r = v;
        this.f8164t = i7;
    }

    public final void e(boolean z9, boolean z10) {
        int i7 = this.f8159o;
        SpannableStringBuilder spannableStringBuilder = this.f8148b;
        if (i7 != -1) {
            if (!z9) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f8159o, spannableStringBuilder.length(), 33);
                this.f8159o = -1;
            }
        } else if (z9) {
            this.f8159o = spannableStringBuilder.length();
        }
        if (this.f8160p != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f8160p, spannableStringBuilder.length(), 33);
                this.f8160p = -1;
            }
        } else if (z10) {
            this.f8160p = spannableStringBuilder.length();
        }
    }

    public final void f(int i7, int i10) {
        int i11 = this.f8161q;
        SpannableStringBuilder spannableStringBuilder = this.f8148b;
        if (i11 != -1 && this.f8162r != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f8162r), this.f8161q, spannableStringBuilder.length(), 33);
        }
        if (i7 != v) {
            this.f8161q = spannableStringBuilder.length();
            this.f8162r = i7;
        }
        if (this.f8163s != -1 && this.f8164t != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f8164t), this.f8163s, spannableStringBuilder.length(), 33);
        }
        if (i10 != f8143w) {
            this.f8163s = spannableStringBuilder.length();
            this.f8164t = i10;
        }
    }
}
