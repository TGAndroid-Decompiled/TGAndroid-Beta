package fi;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuffColorFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.o80;
public final class v7 {
    public l80 f12652a;
    public org.telegram.ui.Components.x5 f12653b;
    public final n2.o0 f12654c;
    public org.telegram.ui.Components.t5 d;
    public StaticLayout f12655e;
    public org.telegram.ui.Components.t5 f12656f;
    public StaticLayout f12657g;
    public t7[] h;
    public final ArrayList f12658i;
    public final Stack f12659j;
    public final gf.c f12660k;
    public int f12661l;
    public int f12662m;
    public CharSequence f12663n;
    public s7 f12664o;
    public s7 f12665p;
    public boolean f12666q;
    public final org.telegram.ui.Components.c6 f12667r;
    public final o80 f12668s;
    public final Path f12669t;
    public final AtomicReference f12670u;
    public final w7 v;

    public v7(w7 w7Var) {
        this.v = w7Var;
        this.f12654c = new n2.o0(w7Var);
        ArrayList arrayList = new ArrayList();
        this.f12658i = arrayList;
        this.f12659j = new Stack();
        this.f12663n = "";
        this.f12667r = new org.telegram.ui.Components.c6(w7Var.K, 0L, 400L, lr.h);
        Path path = new Path();
        this.f12669t = path;
        this.f12670u = new AtomicReference();
        this.f12660k = new gf.c(w7Var, arrayList, new di.c7(this, 10));
        o80 o80Var = new o80();
        this.f12668s = o80Var;
        o80Var.f38033y = path;
        o80Var.k(4.0f);
        o80Var.g(org.telegram.ui.ActionBar.n6.r1(0.3f, -1), org.telegram.ui.ActionBar.n6.r1(0.1f, -1), org.telegram.ui.ActionBar.n6.r1(0.2f, -1), org.telegram.ui.ActionBar.n6.r1(0.7f, -1));
        o80Var.setCallback(w7Var);
    }

    public final int a(int i7) {
        int i10;
        s7 s7Var = this.f12664o;
        int i11 = 0;
        if (s7Var != null) {
            i10 = org.telegram.messenger.g0.L(8.0f) + s7Var.b();
        } else {
            i10 = 0;
        }
        s7 s7Var2 = this.f12665p;
        if (s7Var2 != null) {
            i11 = org.telegram.messenger.g0.L(8.0f) + s7Var2.b();
        }
        int i12 = i10 + i11;
        StaticLayout staticLayout = this.f12655e;
        w7 w7Var = this.v;
        if (staticLayout == null) {
            return i7 - ((w7Var.G * 2) + this.f12661l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!w7Var.f12704b) {
            return i7 - ((w7Var.G * 2) + this.f12661l);
        }
        return (i7 - ((Math.min(3, lineCount) + 1) * w7Var.f12705c.getFontMetricsInt(null))) - i12;
    }

    public final void b(Canvas canvas, float f10) {
        Canvas canvas2;
        w7 w7Var = this.v;
        x7 x7Var = w7Var.K;
        float d = this.f12667r.d(this.f12666q);
        if (f10 > 0.0f) {
            float T1 = org.telegram.messenger.g0.T1(f10, 0.7f * f10, d);
            if (T1 >= 1.0f) {
                c(canvas, d);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, x7Var.getWidth(), x7Var.getHeight(), (int) (T1 * 255.0f), 31);
                c(canvas2, d);
                canvas2.restore();
            }
            if (d <= 0.0f && !this.f12666q) {
                return;
            }
            o80 o80Var = this.f12668s;
            o80Var.setAlpha((int) (d * 255.0f * T1));
            o80Var.draw(canvas2);
            w7Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f10) {
        int i7;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        w7 w7Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = w7Var.f12703a;
        x7 x7Var = w7Var.K;
        if (this.f12664o != null) {
            canvas.save();
            canvas.translate(w7Var.F, w7Var.G);
            s7 s7Var = this.f12664o;
            int width = w7Var.getWidth();
            int i11 = w7Var.F;
            s7Var.a(canvas, (width - i11) - i11);
            int b10 = this.f12664o.b();
            canvas.restore();
            i7 = org.telegram.messenger.g0.L(8.0f) + b10;
        } else {
            i7 = 0;
        }
        canvas.save();
        canvas.translate(w7Var.F, w7Var.G + i7);
        if (this.f12654c.h(canvas)) {
            w7Var.invalidate();
        }
        canvas.restore();
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12669t.rewind();
        ArrayList arrayList3 = this.f12658i;
        if (arrayList3.isEmpty() && this.f12657g != null) {
            if (x7Var.f12738a0.x()) {
                canvas.save();
                canvas.translate(w7Var.F, w7Var.G + i7);
                x7Var.f12738a0.W(canvas);
                canvas.restore();
            }
            if (this.f12657g != null) {
                canvas.save();
                canvas.translate(w7Var.F, w7Var.G + i7);
                d(this.f12657g, canvas, arrayList3);
                org.telegram.ui.Components.t5 update = org.telegram.ui.Components.x5.update(0, w7Var, this.f12656f, this.f12657g);
                this.f12656f = update;
                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, this.f12657g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f12657g, w7Var.F, w7Var.G + i7);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i12 = 0;
                while (true) {
                    t7[] t7VarArr = this.h;
                    if (i12 >= t7VarArr.length) {
                        break;
                    }
                    t7 t7Var = t7VarArr[i12];
                    if (t7Var != null) {
                        canvas.save();
                        float f12 = t7Var.f12593c;
                        float f13 = t7Var.f12594e;
                        if (f12 == f13) {
                            if (w7Var.f12712x != f11) {
                                canvas.translate(w7Var.F + f13, w7Var.G + i7 + t7Var.f12595f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, t7Var.f12592b.getWidth(), t7Var.f12592b.getHeight(), (int) (w7Var.f12712x * 255.0f), 31);
                                d(t7Var.f12592b, canvas, arrayList);
                                if (z10) {
                                    f(t7Var.f12592b, w7Var.F + t7Var.f12594e, w7Var.G + i7 + t7Var.f12595f);
                                }
                                t7Var.f12592b.draw(canvas);
                                org.telegram.ui.Components.t5 update2 = org.telegram.ui.Components.x5.update(0, w7Var, t7Var.f12591a, t7Var.f12592b);
                                t7Var.f12591a = update2;
                                arrayList2 = arrayList;
                                i10 = i12;
                                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, t7Var.f12592b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, w7Var.f12712x, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i10 = i12;
                            float T1 = org.telegram.messenger.g0.T1(f12, f13, w7Var.f12712x);
                            float T12 = org.telegram.messenger.g0.T1(t7Var.d, t7Var.f12595f, lr.f37209g.getInterpolation(w7Var.f12712x));
                            canvas.translate(w7Var.F + T1, w7Var.G + i7 + T12);
                            if (z10) {
                                f(t7Var.f12592b, w7Var.F + T1, w7Var.G + i7 + T12);
                            }
                            t7Var.f12592b.draw(canvas);
                            org.telegram.ui.Components.t5 update3 = org.telegram.ui.Components.x5.update(0, w7Var, t7Var.f12591a, t7Var.f12592b);
                            t7Var.f12591a = update3;
                            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, t7Var.f12592b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        }
                        canvas.restore();
                        i12 = i10 + 1;
                        arrayList = arrayList2;
                        f11 = 0.0f;
                    }
                    arrayList2 = arrayList;
                    i10 = i12;
                    i12 = i10 + 1;
                    arrayList = arrayList2;
                    f11 = 0.0f;
                }
            }
        } else if (this.f12655e != null) {
            canvas.save();
            canvas.translate(w7Var.F, w7Var.G + i7);
            if (x7Var.f12738a0.x()) {
                x7Var.f12738a0.W(canvas);
            }
            d(this.f12655e, canvas, arrayList3);
            org.telegram.ui.Components.t5 update4 = org.telegram.ui.Components.x5.update(0, w7Var, this.d, this.f12655e);
            this.d = update4;
            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, this.f12655e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.f12655e, w7Var.F, w7Var.G + i7);
            }
        }
        if (this.f12665p != null) {
            canvas.save();
            canvas.translate(w7Var.F, (org.telegram.messenger.g0.W1(w7Var.f12712x, this.f12662m, this.f12661l) + w7Var.G) - this.f12665p.b());
            s7 s7Var2 = this.f12665p;
            int width2 = w7Var.getWidth();
            int i13 = w7Var.F;
            s7Var2.a(canvas, (width2 - i13) - i13);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            xh.f.g(this.v, false, -1, 0, this.f12670u, 0, staticLayout, arrayList, canvas, false);
        } else {
            staticLayout.draw(canvas);
        }
    }

    public final void e(int i7) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        w7 w7Var = this.v;
        x7 x7Var = w7Var.K;
        TextPaint textPaint = w7Var.d;
        v7[] v7VarArr = w7Var.f12709r;
        TextPaint textPaint2 = w7Var.f12705c;
        boolean isEmpty = TextUtils.isEmpty(this.f12663n);
        Stack stack = this.f12659j;
        ArrayList arrayList = this.f12658i;
        if (isEmpty) {
            this.f12655e = null;
            this.f12661l = 0;
            s7 s7Var = this.f12664o;
            if (s7Var != null) {
                this.f12661l = org.telegram.messenger.g0.L(4.0f) + s7Var.b();
            }
            s7 s7Var2 = this.f12665p;
            if (s7Var2 != null) {
                this.f12661l = org.telegram.messenger.f3.C(4.0f, s7Var2.b(), this.f12661l);
            }
            this.f12662m = this.f12661l;
            if (this == v7VarArr[0]) {
                w7Var.f12711w = null;
            }
            this.f12657g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a10 = w7.a(w7Var, textPaint2, this.f12663n, i7);
        this.f12655e = a10;
        this.f12661l = a10.getHeight();
        s7 s7Var3 = this.f12664o;
        if (s7Var3 != null) {
            i10 = org.telegram.messenger.g0.L(8.0f) + s7Var3.b();
        } else {
            i10 = 0;
        }
        s7 s7Var4 = this.f12665p;
        if (s7Var4 != null) {
            this.f12661l = org.telegram.messenger.f3.C(8.0f, s7Var4.b(), this.f12661l);
        }
        this.f12661l += i10;
        float measureText = textPaint2.measureText(" ");
        if (this.f12655e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7Var.f12704b = z10;
        if (z10) {
            i11 = 3;
            if (this.f12655e.getLineCount() == 4) {
                if (TextUtils.getTrimmedLength(this.f12663n.subSequence(this.f12655e.getLineStart(2), this.f12655e.getLineEnd(2))) == 0) {
                    w7Var.f12704b = false;
                }
            }
        } else {
            i11 = 3;
        }
        if (w7Var.f12704b) {
            float topPadding = this.f12655e.getTopPadding() + this.f12655e.getLineTop(2);
            if (this == v7VarArr[0]) {
                String M0 = gd.M0(2131745144, null);
                w7Var.f12711w = w7.a(w7Var, textPaint, M0, i7);
                w7Var.h = ((w7Var.G + i10) + topPadding) - org.telegram.messenger.g0.N(0.3f);
                w7Var.f12708n = (w7Var.F + i7) - textPaint.measureText(M0);
            }
            int topPadding2 = this.f12655e.getTopPadding() + this.f12655e.getLineBottom(2);
            s7 s7Var5 = this.f12664o;
            if (s7Var5 != null) {
                i12 = org.telegram.messenger.g0.L(8.0f) + s7Var5.b();
            } else {
                i12 = 0;
            }
            int i14 = topPadding2 + i12;
            s7 s7Var6 = this.f12665p;
            if (s7Var6 != null) {
                i13 = org.telegram.messenger.g0.L(8.0f) + s7Var6.b();
            } else {
                i13 = 0;
            }
            this.f12662m = i14 + i13;
            this.f12657g = w7.a(w7Var, textPaint2, this.f12663n.subSequence(0, this.f12655e.getLineEnd(2)), i7);
            stack.addAll(arrayList);
            arrayList.clear();
            xh.f.c(x7Var, this.f12655e, stack, arrayList);
            float lineRight = this.f12655e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i15 = 0;
                while (true) {
                    t7[] t7VarArr = this.h;
                    if (i15 >= t7VarArr.length) {
                        break;
                    }
                    t7 t7Var = t7VarArr[i15];
                    if (t7Var != null) {
                        org.telegram.ui.Components.x5.release(x7Var, t7Var.f12591a);
                    }
                    i15++;
                }
            }
            this.h = new t7[this.f12655e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i16 = i11; i16 < this.f12655e.getLineCount(); i16++) {
                    int lineStart = this.f12655e.getLineStart(i16);
                    int lineEnd = this.f12655e.getLineEnd(i16);
                    CharSequence subSequence = this.f12663n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i16 - 3] = null;
                    } else {
                        StaticLayout a11 = w7.a(w7Var, textPaint2, subSequence, i7);
                        ?? obj = new Object();
                        this.h[i16 - 3] = obj;
                        obj.f12592b = a11;
                        obj.f12594e = this.f12655e.getLineLeft(i16);
                        obj.f12595f = this.f12655e.getTopPadding() + this.f12655e.getLineTop(i16);
                        if (lineRight < w7Var.f12708n - org.telegram.messenger.g0.L(16.0f)) {
                            obj.d = topPadding;
                            obj.f12593c = lineRight;
                            lineRight = Math.abs(a11.getLineRight(0) - a11.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f12595f;
                            obj.f12593c = obj.f12594e;
                        }
                    }
                }
            }
        } else {
            if (this == v7VarArr[0]) {
                w7Var.f12711w = null;
            }
            this.f12657g = null;
            this.f12662m = this.f12661l;
            stack.addAll(arrayList);
            arrayList.clear();
            xh.f.c(w7Var, this.f12655e, stack, arrayList);
        }
        int i17 = w7Var.F;
        int i18 = w7Var.G;
        gf.c cVar = this.f12660k;
        cVar.f13530a = i17;
        cVar.f13532c = i18;
    }

    public final void f(Layout layout, float f10, float f11) {
        float f12;
        float f13 = 0.0f;
        int i7 = 0;
        while (i7 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i7);
            w7 w7Var = this.v;
            float f14 = lineLeft - (w7Var.F / 3.0f);
            float lineRight = (w7Var.F / 3.0f) + layout.getLineRight(i7);
            if (i7 == 0) {
                f13 = layout.getLineTop(i7) - (w7Var.G / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i7);
            if (i7 >= layout.getLineCount() - 1) {
                f12 = (w7Var.G / 3.0f) + lineBottom;
            } else {
                f12 = lineBottom;
            }
            this.f12669t.addRect(f10 + f14, f11 + f13, f10 + lineRight, f11 + f12, Path.Direction.CW);
            i7++;
            f13 = f12;
        }
    }

    public final void g(CharSequence charSequence, s7 s7Var, s7 s7Var2) {
        this.f12663n = charSequence;
        this.f12664o = s7Var;
        this.f12665p = s7Var2;
        w7 w7Var = this.v;
        if (s7Var != null) {
            u7 u7Var = new u7(this, 0);
            s7Var.f12549r = w7Var;
            s7Var.f12550s = u7Var;
            new mk0(w7Var);
            s7Var.f12541j.setCallback(w7Var);
            s7Var.h.f33890a = w7Var;
            s7Var.f12540i.f37428a = w7Var;
            s7Var.c();
        }
        s7 s7Var3 = this.f12665p;
        if (s7Var3 != null) {
            u7 u7Var2 = new u7(this, 1);
            s7Var3.f12549r = w7Var;
            s7Var3.f12550s = u7Var2;
            new mk0(w7Var);
            s7Var3.f12541j.setCallback(w7Var);
            s7Var3.h.f33890a = w7Var;
            s7Var3.f12540i.f37428a = w7Var;
            s7Var3.c();
        }
        w7Var.f12710s = 0;
        w7Var.requestLayout();
    }
}
