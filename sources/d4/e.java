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
    public static final int f8138w;
    public static final int[] f8139x;
    public static final int[] f8140y;
    public static final int[] f8141z;
    public final ArrayList f8142a = new ArrayList();
    public final SpannableStringBuilder f8143b = new SpannableStringBuilder();
    public boolean f8144c;
    public boolean d;
    public int f8145e;
    public boolean f8146f;
    public int f8147g;
    public int h;
    public int f8148i;
    public int f8149j;
    public int f8150k;
    public int f8151l;
    public int f8152m;
    public int f8153n;
    public int f8154o;
    public int f8155p;
    public int f8156q;
    public int f8157r;
    public int f8158s;
    public int f8159t;
    public int f8160u;

    static {
        int c10 = c(0, 0, 0, 0);
        f8138w = c10;
        int c11 = c(0, 0, 0, 3);
        f8139x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f8140y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f8141z = new int[]{3, 3, 3, 3, 3, 3, 1};
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
        SpannableStringBuilder spannableStringBuilder = this.f8143b;
        if (c10 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f8142a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f8154o != -1) {
                this.f8154o = 0;
            }
            if (this.f8155p != -1) {
                this.f8155p = 0;
            }
            if (this.f8156q != -1) {
                this.f8156q = 0;
            }
            if (this.f8158s != -1) {
                this.f8158s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f8149j && arrayList.size() < 15) {
                    this.f8160u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f8143b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f8154o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f8154o, length, 33);
            }
            if (this.f8155p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f8155p, length, 33);
            }
            if (this.f8156q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f8157r), this.f8156q, length, 33);
            }
            if (this.f8158s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f8159t), this.f8158s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f8142a.clear();
        this.f8143b.clear();
        this.f8154o = -1;
        this.f8155p = -1;
        this.f8156q = -1;
        this.f8158s = -1;
        this.f8160u = 0;
        this.f8144c = false;
        this.d = false;
        this.f8145e = 4;
        this.f8146f = false;
        this.f8147g = 0;
        this.h = 0;
        this.f8148i = 0;
        this.f8149j = 15;
        this.f8150k = 0;
        this.f8151l = 0;
        this.f8152m = 0;
        int i7 = f8138w;
        this.f8153n = i7;
        this.f8157r = v;
        this.f8159t = i7;
    }

    public final void e(boolean z9, boolean z10) {
        int i7 = this.f8154o;
        SpannableStringBuilder spannableStringBuilder = this.f8143b;
        if (i7 != -1) {
            if (!z9) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f8154o, spannableStringBuilder.length(), 33);
                this.f8154o = -1;
            }
        } else if (z9) {
            this.f8154o = spannableStringBuilder.length();
        }
        if (this.f8155p != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f8155p, spannableStringBuilder.length(), 33);
                this.f8155p = -1;
            }
        } else if (z10) {
            this.f8155p = spannableStringBuilder.length();
        }
    }

    public final void f(int i7, int i10) {
        int i11 = this.f8156q;
        SpannableStringBuilder spannableStringBuilder = this.f8143b;
        if (i11 != -1 && this.f8157r != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f8157r), this.f8156q, spannableStringBuilder.length(), 33);
        }
        if (i7 != v) {
            this.f8156q = spannableStringBuilder.length();
            this.f8157r = i7;
        }
        if (this.f8158s != -1 && this.f8159t != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f8159t), this.f8158s, spannableStringBuilder.length(), 33);
        }
        if (i10 != f8138w) {
            this.f8158s = spannableStringBuilder.length();
            this.f8159t = i10;
        }
    }
}
