package di;

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
import org.telegram.messenger.id;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y70;
public final class g8 {
    public y70 f9036a;
    public org.telegram.ui.Components.r5 f9037b;
    public final n2.n0 f9038c;
    public org.telegram.ui.Components.n5 d;
    public StaticLayout f9039e;
    public org.telegram.ui.Components.n5 f9040f;
    public StaticLayout f9041g;
    public d8[] h;
    public final ArrayList f9042i;
    public final Stack f9043j;
    public final gf.c f9044k;
    public int f9045l;
    public int f9046m;
    public CharSequence f9047n;
    public c8 f9048o;
    public c8 f9049p;
    public boolean f9050q;
    public final org.telegram.ui.Components.w5 f9051r;
    public final b80 f9052s;
    public final Path f9053t;
    public final AtomicReference f9054u;
    public final h8 v;

    public g8(h8 h8Var) {
        this.v = h8Var;
        this.f9038c = new n2.n0(h8Var);
        ArrayList arrayList = new ArrayList();
        this.f9042i = arrayList;
        this.f9043j = new Stack();
        this.f9047n = "";
        this.f9051r = new org.telegram.ui.Components.w5(h8Var.J, 0L, 400L, xq.h);
        Path path = new Path();
        this.f9053t = path;
        this.f9054u = new AtomicReference();
        this.f9044k = new gf.c(h8Var, arrayList, new r4(this, 3));
        b80 b80Var = new b80();
        this.f9052s = b80Var;
        b80Var.f32187y = path;
        b80Var.k(4.0f);
        b80Var.g(org.telegram.ui.ActionBar.l6.r1(0.3f, -1), org.telegram.ui.ActionBar.l6.r1(0.1f, -1), org.telegram.ui.ActionBar.l6.r1(0.2f, -1), org.telegram.ui.ActionBar.l6.r1(0.7f, -1));
        b80Var.setCallback(h8Var);
    }

    public final int a(int i7) {
        int i10;
        c8 c8Var = this.f9048o;
        int i11 = 0;
        if (c8Var != null) {
            i10 = org.telegram.messenger.g0.L(8.0f) + c8Var.b();
        } else {
            i10 = 0;
        }
        c8 c8Var2 = this.f9049p;
        if (c8Var2 != null) {
            i11 = org.telegram.messenger.g0.L(8.0f) + c8Var2.b();
        }
        int i12 = i10 + i11;
        StaticLayout staticLayout = this.f9039e;
        h8 h8Var = this.v;
        if (staticLayout == null) {
            return i7 - ((h8Var.F * 2) + this.f9045l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!h8Var.f9078b) {
            return i7 - ((h8Var.F * 2) + this.f9045l);
        }
        return (i7 - ((Math.min(3, lineCount) + 1) * h8Var.f9079c.getFontMetricsInt(null))) - i12;
    }

    public final void b(Canvas canvas, float f10) {
        Canvas canvas2;
        h8 h8Var = this.v;
        i8 i8Var = h8Var.J;
        float d = this.f9051r.d(this.f9050q);
        if (f10 > 0.0f) {
            float T1 = org.telegram.messenger.g0.T1(f10, 0.7f * f10, d);
            if (T1 >= 1.0f) {
                c(canvas, d);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, i8Var.getWidth(), i8Var.getHeight(), (int) (T1 * 255.0f), 31);
                c(canvas2, d);
                canvas2.restore();
            }
            if (d <= 0.0f && !this.f9050q) {
                return;
            }
            b80 b80Var = this.f9052s;
            b80Var.setAlpha((int) (d * 255.0f * T1));
            b80Var.draw(canvas2);
            h8Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f10) {
        int i7;
        boolean z9;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        h8 h8Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = h8Var.f9077a;
        i8 i8Var = h8Var.J;
        if (this.f9048o != null) {
            canvas.save();
            canvas.translate(h8Var.E, h8Var.F);
            c8 c8Var = this.f9048o;
            int width = h8Var.getWidth();
            int i11 = h8Var.E;
            c8Var.a(canvas, (width - i11) - i11);
            int b10 = this.f9048o.b();
            canvas.restore();
            i7 = org.telegram.messenger.g0.L(8.0f) + b10;
        } else {
            i7 = 0;
        }
        canvas.save();
        canvas.translate(h8Var.E, h8Var.F + i7);
        if (this.f9038c.h(canvas)) {
            h8Var.invalidate();
        }
        canvas.restore();
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f9053t.rewind();
        ArrayList arrayList3 = this.f9042i;
        if (arrayList3.isEmpty() && this.f9041g != null) {
            if (i8Var.W.x()) {
                canvas.save();
                canvas.translate(h8Var.E, h8Var.F + i7);
                i8Var.W.W(canvas);
                canvas.restore();
            }
            if (this.f9041g != null) {
                canvas.save();
                canvas.translate(h8Var.E, h8Var.F + i7);
                d(this.f9041g, canvas, arrayList3);
                org.telegram.ui.Components.n5 update = org.telegram.ui.Components.r5.update(0, h8Var, this.f9040f, this.f9041g);
                this.f9040f = update;
                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, this.f9041g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z9) {
                    f(this.f9041g, h8Var.E, h8Var.F + i7);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i12 = 0;
                while (true) {
                    d8[] d8VarArr = this.h;
                    if (i12 >= d8VarArr.length) {
                        break;
                    }
                    d8 d8Var = d8VarArr[i12];
                    if (d8Var != null) {
                        canvas.save();
                        float f12 = d8Var.f8934c;
                        float f13 = d8Var.f8935e;
                        if (f12 == f13) {
                            if (h8Var.f9086x != f11) {
                                canvas.translate(h8Var.E + f13, h8Var.F + i7 + d8Var.f8936f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, d8Var.f8933b.getWidth(), d8Var.f8933b.getHeight(), (int) (h8Var.f9086x * 255.0f), 31);
                                d(d8Var.f8933b, canvas, arrayList);
                                if (z9) {
                                    f(d8Var.f8933b, h8Var.E + d8Var.f8935e, h8Var.F + i7 + d8Var.f8936f);
                                }
                                d8Var.f8933b.draw(canvas);
                                org.telegram.ui.Components.n5 update2 = org.telegram.ui.Components.r5.update(0, h8Var, d8Var.f8932a, d8Var.f8933b);
                                d8Var.f8932a = update2;
                                arrayList2 = arrayList;
                                i10 = i12;
                                org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, d8Var.f8933b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, h8Var.f9086x, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i10 = i12;
                            float T1 = org.telegram.messenger.g0.T1(f12, f13, h8Var.f9086x);
                            float T12 = org.telegram.messenger.g0.T1(d8Var.d, d8Var.f8936f, xq.f40459g.getInterpolation(h8Var.f9086x));
                            canvas.translate(h8Var.E + T1, h8Var.F + i7 + T12);
                            if (z9) {
                                f(d8Var.f8933b, h8Var.E + T1, h8Var.F + i7 + T12);
                            }
                            d8Var.f8933b.draw(canvas);
                            org.telegram.ui.Components.n5 update3 = org.telegram.ui.Components.r5.update(0, h8Var, d8Var.f8932a, d8Var.f8933b);
                            d8Var.f8932a = update3;
                            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, d8Var.f8933b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
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
        } else if (this.f9039e != null) {
            canvas.save();
            canvas.translate(h8Var.E, h8Var.F + i7);
            if (i8Var.W.x()) {
                i8Var.W.W(canvas);
            }
            d(this.f9039e, canvas, arrayList3);
            org.telegram.ui.Components.n5 update4 = org.telegram.ui.Components.r5.update(0, h8Var, this.d, this.f9039e);
            this.d = update4;
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, this.f9039e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z9) {
                f(this.f9039e, h8Var.E, h8Var.F + i7);
            }
        }
        if (this.f9049p != null) {
            canvas.save();
            canvas.translate(h8Var.E, (org.telegram.messenger.g0.W1(h8Var.f9086x, this.f9046m, this.f9045l) + h8Var.F) - this.f9049p.b());
            c8 c8Var2 = this.f9049p;
            int width2 = h8Var.getWidth();
            int i13 = h8Var.E;
            c8Var2.a(canvas, (width2 - i13) - i13);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            xh.f.g(this.v, false, -1, 0, this.f9054u, 0, staticLayout, arrayList, canvas, false);
        } else {
            staticLayout.draw(canvas);
        }
    }

    public final void e(int i7) {
        int i10;
        boolean z9;
        int i11;
        int i12;
        int i13;
        h8 h8Var = this.v;
        i8 i8Var = h8Var.J;
        TextPaint textPaint = h8Var.d;
        g8[] g8VarArr = h8Var.f9083r;
        TextPaint textPaint2 = h8Var.f9079c;
        boolean isEmpty = TextUtils.isEmpty(this.f9047n);
        Stack stack = this.f9043j;
        ArrayList arrayList = this.f9042i;
        if (isEmpty) {
            this.f9039e = null;
            this.f9045l = 0;
            c8 c8Var = this.f9048o;
            if (c8Var != null) {
                this.f9045l = org.telegram.messenger.g0.L(4.0f) + c8Var.b();
            }
            c8 c8Var2 = this.f9049p;
            if (c8Var2 != null) {
                this.f9045l = org.telegram.messenger.k5.C(4.0f, c8Var2.b(), this.f9045l);
            }
            this.f9046m = this.f9045l;
            if (this == g8VarArr[0]) {
                h8Var.f9085w = null;
            }
            this.f9041g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a10 = h8.a(h8Var, textPaint2, this.f9047n, i7);
        this.f9039e = a10;
        this.f9045l = a10.getHeight();
        c8 c8Var3 = this.f9048o;
        if (c8Var3 != null) {
            i10 = org.telegram.messenger.g0.L(8.0f) + c8Var3.b();
        } else {
            i10 = 0;
        }
        c8 c8Var4 = this.f9049p;
        if (c8Var4 != null) {
            this.f9045l = org.telegram.messenger.k5.C(8.0f, c8Var4.b(), this.f9045l);
        }
        this.f9045l += i10;
        float measureText = textPaint2.measureText(" ");
        if (this.f9039e.getLineCount() > 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        h8Var.f9078b = z9;
        if (z9) {
            i11 = 3;
            if (this.f9039e.getLineCount() == 4) {
                if (TextUtils.getTrimmedLength(this.f9047n.subSequence(this.f9039e.getLineStart(2), this.f9039e.getLineEnd(2))) == 0) {
                    h8Var.f9078b = false;
                }
            }
        } else {
            i11 = 3;
        }
        if (h8Var.f9078b) {
            float topPadding = this.f9039e.getTopPadding() + this.f9039e.getLineTop(2);
            if (this == g8VarArr[0]) {
                String M0 = id.M0(2131745339, null);
                h8Var.f9085w = h8.a(h8Var, textPaint, M0, i7);
                h8Var.h = ((h8Var.F + i10) + topPadding) - org.telegram.messenger.g0.N(0.3f);
                h8Var.f9082n = (h8Var.E + i7) - textPaint.measureText(M0);
            }
            int topPadding2 = this.f9039e.getTopPadding() + this.f9039e.getLineBottom(2);
            c8 c8Var5 = this.f9048o;
            if (c8Var5 != null) {
                i12 = org.telegram.messenger.g0.L(8.0f) + c8Var5.b();
            } else {
                i12 = 0;
            }
            int i14 = topPadding2 + i12;
            c8 c8Var6 = this.f9049p;
            if (c8Var6 != null) {
                i13 = org.telegram.messenger.g0.L(8.0f) + c8Var6.b();
            } else {
                i13 = 0;
            }
            this.f9046m = i14 + i13;
            this.f9041g = h8.a(h8Var, textPaint2, this.f9047n.subSequence(0, this.f9039e.getLineEnd(2)), i7);
            stack.addAll(arrayList);
            arrayList.clear();
            xh.f.c(i8Var, this.f9039e, stack, arrayList);
            float lineRight = this.f9039e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i15 = 0;
                while (true) {
                    d8[] d8VarArr = this.h;
                    if (i15 >= d8VarArr.length) {
                        break;
                    }
                    d8 d8Var = d8VarArr[i15];
                    if (d8Var != null) {
                        org.telegram.ui.Components.r5.release(i8Var, d8Var.f8932a);
                    }
                    i15++;
                }
            }
            this.h = new d8[this.f9039e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i16 = i11; i16 < this.f9039e.getLineCount(); i16++) {
                    int lineStart = this.f9039e.getLineStart(i16);
                    int lineEnd = this.f9039e.getLineEnd(i16);
                    CharSequence subSequence = this.f9047n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i16 - 3] = null;
                    } else {
                        StaticLayout a11 = h8.a(h8Var, textPaint2, subSequence, i7);
                        ?? obj = new Object();
                        this.h[i16 - 3] = obj;
                        obj.f8933b = a11;
                        obj.f8935e = this.f9039e.getLineLeft(i16);
                        obj.f8936f = this.f9039e.getTopPadding() + this.f9039e.getLineTop(i16);
                        if (lineRight < h8Var.f9082n - org.telegram.messenger.g0.L(16.0f)) {
                            obj.d = topPadding;
                            obj.f8934c = lineRight;
                            lineRight = Math.abs(a11.getLineRight(0) - a11.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f8936f;
                            obj.f8934c = obj.f8935e;
                        }
                    }
                }
            }
        } else {
            if (this == g8VarArr[0]) {
                h8Var.f9085w = null;
            }
            this.f9041g = null;
            this.f9046m = this.f9045l;
            stack.addAll(arrayList);
            arrayList.clear();
            xh.f.c(h8Var, this.f9039e, stack, arrayList);
        }
        int i17 = h8Var.E;
        int i18 = h8Var.F;
        gf.c cVar = this.f9044k;
        cVar.f13871a = i17;
        cVar.f13873c = i18;
    }

    public final void f(Layout layout, float f10, float f11) {
        float f12;
        float f13 = 0.0f;
        int i7 = 0;
        while (i7 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i7);
            h8 h8Var = this.v;
            float f14 = lineLeft - (h8Var.E / 3.0f);
            float lineRight = (h8Var.E / 3.0f) + layout.getLineRight(i7);
            if (i7 == 0) {
                f13 = layout.getLineTop(i7) - (h8Var.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i7);
            if (i7 >= layout.getLineCount() - 1) {
                f12 = (h8Var.F / 3.0f) + lineBottom;
            } else {
                f12 = lineBottom;
            }
            this.f9053t.addRect(f10 + f14, f11 + f13, f10 + lineRight, f11 + f12, Path.Direction.CW);
            i7++;
            f13 = f12;
        }
    }

    public final void g(CharSequence charSequence, c8 c8Var, c8 c8Var2) {
        this.f9047n = charSequence;
        this.f9048o = c8Var;
        this.f9049p = c8Var2;
        h8 h8Var = this.v;
        if (c8Var != null) {
            e8 e8Var = new e8(this, 0);
            c8Var.f8898r = h8Var;
            c8Var.f8899s = e8Var;
            new ak0(h8Var);
            c8Var.f8890j.setCallback(h8Var);
            c8Var.h.f39908a = h8Var;
            c8Var.f8889i.f34696a = h8Var;
            c8Var.c();
        }
        c8 c8Var3 = this.f9049p;
        if (c8Var3 != null) {
            e8 e8Var2 = new e8(this, 1);
            c8Var3.f8898r = h8Var;
            c8Var3.f8899s = e8Var2;
            new ak0(h8Var);
            c8Var3.f8890j.setCallback(h8Var);
            c8Var3.h.f39908a = h8Var;
            c8Var3.f8889i.f34696a = h8Var;
            c8Var3.c();
        }
        h8Var.f9084s = 0;
        h8Var.requestLayout();
    }
}
