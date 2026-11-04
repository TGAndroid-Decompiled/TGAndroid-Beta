package c4;

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
    public static final int f4166w;
    public static final int[] f4167x;
    public static final int[] f4168y;
    public static final int[] f4169z;
    public final ArrayList f4170a = new ArrayList();
    public final SpannableStringBuilder f4171b = new SpannableStringBuilder();
    public boolean f4172c;
    public boolean d;
    public int f4173e;
    public boolean f4174f;
    public int f4175g;
    public int h;
    public int f4176i;
    public int f4177j;
    public int f4178k;
    public int f4179l;
    public int f4180m;
    public int f4181n;
    public int f4182o;
    public int f4183p;
    public int f4184q;
    public int f4185r;
    public int f4186s;
    public int f4187t;
    public int f4188u;

    static {
        int c2 = c(0, 0, 0, 0);
        f4166w = c2;
        int c10 = c(0, 0, 0, 3);
        f4167x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f4168y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f4169z = new int[]{3, 3, 3, 3, 3, 3, 1};
        A = new boolean[]{false, false, false, true, true, true, false};
        B = new int[]{c2, c10, c2, c2, c10, c2, c2};
        C = new int[]{0, 1, 2, 3, 4, 3, 4};
        D = new int[]{0, 0, 0, 0, 0, 3, 3};
        E = new int[]{c2, c2, c2, c2, c2, c10, c10};
    }

    public e() {
        d();
    }

    public static int c(int r4, int r5, int r6, int r7) {
        throw new UnsupportedOperationException("Method not decompiled: c4.e.c(int, int, int, int):int");
    }

    public final void a(char c2) {
        SpannableStringBuilder spannableStringBuilder = this.f4171b;
        if (c2 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f4170a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f4182o != -1) {
                this.f4182o = 0;
            }
            if (this.f4183p != -1) {
                this.f4183p = 0;
            }
            if (this.f4184q != -1) {
                this.f4184q = 0;
            }
            if (this.f4186s != -1) {
                this.f4186s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f4177j && arrayList.size() < 15) {
                    this.f4188u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c2);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f4171b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f4182o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f4182o, length, 33);
            }
            if (this.f4183p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f4183p, length, 33);
            }
            if (this.f4184q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f4185r), this.f4184q, length, 33);
            }
            if (this.f4186s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f4187t), this.f4186s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f4170a.clear();
        this.f4171b.clear();
        this.f4182o = -1;
        this.f4183p = -1;
        this.f4184q = -1;
        this.f4186s = -1;
        this.f4188u = 0;
        this.f4172c = false;
        this.d = false;
        this.f4173e = 4;
        this.f4174f = false;
        this.f4175g = 0;
        this.h = 0;
        this.f4176i = 0;
        this.f4177j = 15;
        this.f4178k = 0;
        this.f4179l = 0;
        this.f4180m = 0;
        int i3 = f4166w;
        this.f4181n = i3;
        this.f4185r = v;
        this.f4187t = i3;
    }

    public final void e(boolean z10, boolean z11) {
        int i3 = this.f4182o;
        SpannableStringBuilder spannableStringBuilder = this.f4171b;
        if (i3 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f4182o, spannableStringBuilder.length(), 33);
                this.f4182o = -1;
            }
        } else if (z10) {
            this.f4182o = spannableStringBuilder.length();
        }
        if (this.f4183p != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f4183p, spannableStringBuilder.length(), 33);
                this.f4183p = -1;
            }
        } else if (z11) {
            this.f4183p = spannableStringBuilder.length();
        }
    }

    public final void f(int i3, int i10) {
        int i11 = this.f4184q;
        SpannableStringBuilder spannableStringBuilder = this.f4171b;
        if (i11 != -1 && this.f4185r != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f4185r), this.f4184q, spannableStringBuilder.length(), 33);
        }
        if (i3 != v) {
            this.f4184q = spannableStringBuilder.length();
            this.f4185r = i3;
        }
        if (this.f4186s != -1 && this.f4187t != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f4187t), this.f4186s, spannableStringBuilder.length(), 33);
        }
        if (i10 != f4166w) {
            this.f4186s = spannableStringBuilder.length();
            this.f4187t = i10;
        }
    }
}
