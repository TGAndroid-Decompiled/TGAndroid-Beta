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
    public static final int f8140w;
    public static final int[] f8141x;
    public static final int[] f8142y;
    public static final int[] f8143z;
    public final ArrayList f8144a = new ArrayList();
    public final SpannableStringBuilder f8145b = new SpannableStringBuilder();
    public boolean f8146c;
    public boolean d;
    public int f8147e;
    public boolean f8148f;
    public int f8149g;
    public int h;
    public int f8150i;
    public int f8151j;
    public int f8152k;
    public int f8153l;
    public int f8154m;
    public int f8155n;
    public int f8156o;
    public int f8157p;
    public int f8158q;
    public int f8159r;
    public int f8160s;
    public int f8161t;
    public int f8162u;

    static {
        int c10 = c(0, 0, 0, 0);
        f8140w = c10;
        int c11 = c(0, 0, 0, 3);
        f8141x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f8142y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f8143z = new int[]{3, 3, 3, 3, 3, 3, 1};
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
        SpannableStringBuilder spannableStringBuilder = this.f8145b;
        if (c10 == '\n') {
            SpannableString b10 = b();
            ArrayList arrayList = this.f8144a;
            arrayList.add(b10);
            spannableStringBuilder.clear();
            if (this.f8156o != -1) {
                this.f8156o = 0;
            }
            if (this.f8157p != -1) {
                this.f8157p = 0;
            }
            if (this.f8158q != -1) {
                this.f8158q = 0;
            }
            if (this.f8160s != -1) {
                this.f8160s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f8151j && arrayList.size() < 15) {
                    this.f8162u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        } else {
            spannableStringBuilder.append(c10);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f8145b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f8156o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f8156o, length, 33);
            }
            if (this.f8157p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f8157p, length, 33);
            }
            if (this.f8158q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f8159r), this.f8158q, length, 33);
            }
            if (this.f8160s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f8161t), this.f8160s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f8144a.clear();
        this.f8145b.clear();
        this.f8156o = -1;
        this.f8157p = -1;
        this.f8158q = -1;
        this.f8160s = -1;
        this.f8162u = 0;
        this.f8146c = false;
        this.d = false;
        this.f8147e = 4;
        this.f8148f = false;
        this.f8149g = 0;
        this.h = 0;
        this.f8150i = 0;
        this.f8151j = 15;
        this.f8152k = 0;
        this.f8153l = 0;
        this.f8154m = 0;
        int i7 = f8140w;
        this.f8155n = i7;
        this.f8159r = v;
        this.f8161t = i7;
    }

    public final void e(boolean z9, boolean z10) {
        int i7 = this.f8156o;
        SpannableStringBuilder spannableStringBuilder = this.f8145b;
        if (i7 != -1) {
            if (!z9) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f8156o, spannableStringBuilder.length(), 33);
                this.f8156o = -1;
            }
        } else if (z9) {
            this.f8156o = spannableStringBuilder.length();
        }
        if (this.f8157p != -1) {
            if (!z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f8157p, spannableStringBuilder.length(), 33);
                this.f8157p = -1;
            }
        } else if (z10) {
            this.f8157p = spannableStringBuilder.length();
        }
    }

    public final void f(int i7, int i10) {
        int i11 = this.f8158q;
        SpannableStringBuilder spannableStringBuilder = this.f8145b;
        if (i11 != -1 && this.f8159r != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f8159r), this.f8158q, spannableStringBuilder.length(), 33);
        }
        if (i7 != v) {
            this.f8158q = spannableStringBuilder.length();
            this.f8159r = i7;
        }
        if (this.f8160s != -1 && this.f8161t != i10) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f8161t), this.f8160s, spannableStringBuilder.length(), 33);
        }
        if (i10 != f8140w) {
            this.f8160s = spannableStringBuilder.length();
            this.f8161t = i10;
        }
    }
}
