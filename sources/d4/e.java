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
    public static final int f7809w;
    public static final int[] f7810x;
    public static final int[] f7811y;
    public static final int[] f7812z;
    public final ArrayList f7813a = new ArrayList();
    public final SpannableStringBuilder f7814b = new SpannableStringBuilder();
    public boolean f7815c;
    public boolean d;
    public int f7816e;
    public boolean f7817f;
    public int f7818g;
    public int h;
    public int f7819i;
    public int f7820j;
    public int f7821k;
    public int f7822l;
    public int f7823m;
    public int f7824n;
    public int f7825o;
    public int f7826p;
    public int f7827q;
    public int f7828r;
    public int f7829s;
    public int f7830t;
    public int f7831u;

    static {
        int c10 = c(0, 0, 0, 0);
        f7809w = c10;
        int c11 = c(0, 0, 0, 3);
        f7810x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f7811y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f7812z = new int[]{3, 3, 3, 3, 3, 3, 1};
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
        SpannableStringBuilder spannableStringBuilder = this.f7814b;
        if (c10 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f7813a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f7825o != -1) {
                this.f7825o = 0;
            }
            if (this.f7826p != -1) {
                this.f7826p = 0;
            }
            if (this.f7827q != -1) {
                this.f7827q = 0;
            }
            if (this.f7829s != -1) {
                this.f7829s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f7820j && arrayList.size() < 15) {
                    this.f7831u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f7814b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f7825o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f7825o, length, 33);
            }
            if (this.f7826p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7826p, length, 33);
            }
            if (this.f7827q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7828r), this.f7827q, length, 33);
            }
            if (this.f7829s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7830t), this.f7829s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f7813a.clear();
        this.f7814b.clear();
        this.f7825o = -1;
        this.f7826p = -1;
        this.f7827q = -1;
        this.f7829s = -1;
        this.f7831u = 0;
        this.f7815c = false;
        this.d = false;
        this.f7816e = 4;
        this.f7817f = false;
        this.f7818g = 0;
        this.h = 0;
        this.f7819i = 0;
        this.f7820j = 15;
        this.f7821k = 0;
        this.f7822l = 0;
        this.f7823m = 0;
        int i7 = f7809w;
        this.f7824n = i7;
        this.f7828r = v;
        this.f7830t = i7;
    }

    public final void e(boolean z10, boolean z11) {
        int i7 = this.f7825o;
        SpannableStringBuilder spannableStringBuilder = this.f7814b;
        if (i7 != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f7825o, spannableStringBuilder.length(), 33);
                this.f7825o = -1;
            }
        } else if (z10) {
            this.f7825o = spannableStringBuilder.length();
        }
        if (this.f7826p != -1) {
            if (!z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7826p, spannableStringBuilder.length(), 33);
                this.f7826p = -1;
            }
        } else if (z11) {
            this.f7826p = spannableStringBuilder.length();
        }
    }

    public final void f(int i7, int i10) {
        int i11 = this.f7827q;
        SpannableStringBuilder spannableStringBuilder = this.f7814b;
        if (i11 != -1 && this.f7828r != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7828r), this.f7827q, spannableStringBuilder.length(), 33);
        }
        if (i7 != v) {
            this.f7827q = spannableStringBuilder.length();
            this.f7828r = i7;
        }
        if (this.f7829s != -1 && this.f7830t != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7830t), this.f7829s, spannableStringBuilder.length(), 33);
        }
        if (i10 != f7809w) {
            this.f7829s = spannableStringBuilder.length();
            this.f7830t = i10;
        }
    }
}
