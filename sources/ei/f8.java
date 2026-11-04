package ei;

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
import org.telegram.messenger.bd;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xq;
public final class f8 {
    public t70 f10273a;
    public org.telegram.ui.Components.p5 f10274b;
    public final m2.p0 f10275c;
    public org.telegram.ui.Components.l5 d;
    public StaticLayout f10276e;
    public org.telegram.ui.Components.l5 f10277f;
    public StaticLayout f10278g;
    public d8[] h;
    public final ArrayList f10279i;
    public final Stack f10280j;
    public final df.c f10281k;
    public int f10282l;
    public int f10283m;
    public CharSequence f10284n;
    public c8 f10285o;
    public c8 f10286p;
    public boolean f10287q;
    public final org.telegram.ui.Components.u5 f10288r;
    public final w70 f10289s;
    public final Path f10290t;
    public final AtomicReference f10291u;
    public final g8 v;

    public f8(g8 g8Var) {
        this.v = g8Var;
        this.f10275c = new m2.p0(g8Var);
        ArrayList arrayList = new ArrayList();
        this.f10279i = arrayList;
        this.f10280j = new Stack();
        this.f10284n = "";
        this.f10288r = new org.telegram.ui.Components.u5(g8Var.K, 0L, 400L, xq.h);
        Path path = new Path();
        this.f10290t = path;
        this.f10291u = new AtomicReference();
        this.f10281k = new df.c(g8Var, arrayList, new a1.c(this, 29));
        w70 w70Var = new w70();
        this.f10289s = w70Var;
        w70Var.f39945y = path;
        w70Var.k(4.0f);
        w70Var.g(org.telegram.ui.ActionBar.k6.r1(0.3f, -1), org.telegram.ui.ActionBar.k6.r1(0.1f, -1), org.telegram.ui.ActionBar.k6.r1(0.2f, -1), org.telegram.ui.ActionBar.k6.r1(0.7f, -1));
        w70Var.setCallback(g8Var);
    }

    public final int a(int i3) {
        int i10;
        c8 c8Var = this.f10285o;
        int i11 = 0;
        if (c8Var != null) {
            i10 = org.telegram.messenger.g0.L(8.0f) + c8Var.b();
        } else {
            i10 = 0;
        }
        c8 c8Var2 = this.f10286p;
        if (c8Var2 != null) {
            i11 = org.telegram.messenger.g0.L(8.0f) + c8Var2.b();
        }
        int i12 = i10 + i11;
        StaticLayout staticLayout = this.f10276e;
        g8 g8Var = this.v;
        if (staticLayout == null) {
            return i3 - ((g8Var.G * 2) + this.f10282l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!g8Var.f10339b) {
            return i3 - ((g8Var.G * 2) + this.f10282l);
        }
        return (i3 - ((Math.min(3, lineCount) + 1) * g8Var.f10340c.getFontMetricsInt(null))) - i12;
    }

    public final void b(Canvas canvas, float f10) {
        Canvas canvas2;
        g8 g8Var = this.v;
        h8 h8Var = g8Var.K;
        float d = this.f10288r.d(this.f10287q);
        if (f10 > 0.0f) {
            float T1 = org.telegram.messenger.g0.T1(f10, 0.7f * f10, d);
            if (T1 >= 1.0f) {
                c(canvas, d);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, h8Var.getWidth(), h8Var.getHeight(), (int) (T1 * 255.0f), 31);
                c(canvas2, d);
                canvas2.restore();
            }
            if (d <= 0.0f && !this.f10287q) {
                return;
            }
            w70 w70Var = this.f10289s;
            w70Var.setAlpha((int) (d * 255.0f * T1));
            w70Var.draw(canvas2);
            g8Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f10) {
        int i3;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        g8 g8Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = g8Var.f10338a;
        h8 h8Var = g8Var.K;
        if (this.f10285o != null) {
            canvas.save();
            canvas.translate(g8Var.F, g8Var.G);
            c8 c8Var = this.f10285o;
            int width = g8Var.getWidth();
            int i11 = g8Var.F;
            c8Var.a(canvas, (width - i11) - i11);
            int b10 = this.f10285o.b();
            canvas.restore();
            i3 = org.telegram.messenger.g0.L(8.0f) + b10;
        } else {
            i3 = 0;
        }
        canvas.save();
        canvas.translate(g8Var.F, g8Var.G + i3);
        if (this.f10275c.h(canvas)) {
            g8Var.invalidate();
        }
        canvas.restore();
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10290t.rewind();
        ArrayList arrayList3 = this.f10279i;
        if (arrayList3.isEmpty() && this.f10278g != null) {
            if (h8Var.f10373a0.x()) {
                canvas.save();
                canvas.translate(g8Var.F, g8Var.G + i3);
                h8Var.f10373a0.W(canvas);
                canvas.restore();
            }
            if (this.f10278g != null) {
                canvas.save();
                canvas.translate(g8Var.F, g8Var.G + i3);
                d(this.f10278g, canvas, arrayList3);
                org.telegram.ui.Components.l5 update = org.telegram.ui.Components.p5.update(0, g8Var, this.f10277f, this.f10278g);
                this.f10277f = update;
                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.f10278g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f10278g, g8Var.F, g8Var.G + i3);
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
                        float f12 = d8Var.f10208c;
                        float f13 = d8Var.f10209e;
                        if (f12 == f13) {
                            if (g8Var.f10347x != f11) {
                                canvas.translate(g8Var.F + f13, g8Var.G + i3 + d8Var.f10210f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, d8Var.f10207b.getWidth(), d8Var.f10207b.getHeight(), (int) (g8Var.f10347x * 255.0f), 31);
                                d(d8Var.f10207b, canvas, arrayList);
                                if (z10) {
                                    f(d8Var.f10207b, g8Var.F + d8Var.f10209e, g8Var.G + i3 + d8Var.f10210f);
                                }
                                d8Var.f10207b.draw(canvas);
                                org.telegram.ui.Components.l5 update2 = org.telegram.ui.Components.p5.update(0, g8Var, d8Var.f10206a, d8Var.f10207b);
                                d8Var.f10206a = update2;
                                arrayList2 = arrayList;
                                i10 = i12;
                                org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, d8Var.f10207b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, g8Var.f10347x, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i10 = i12;
                            float T1 = org.telegram.messenger.g0.T1(f12, f13, g8Var.f10347x);
                            float T12 = org.telegram.messenger.g0.T1(d8Var.d, d8Var.f10210f, xq.f40453g.getInterpolation(g8Var.f10347x));
                            canvas.translate(g8Var.F + T1, g8Var.G + i3 + T12);
                            if (z10) {
                                f(d8Var.f10207b, g8Var.F + T1, g8Var.G + i3 + T12);
                            }
                            d8Var.f10207b.draw(canvas);
                            org.telegram.ui.Components.l5 update3 = org.telegram.ui.Components.p5.update(0, g8Var, d8Var.f10206a, d8Var.f10207b);
                            d8Var.f10206a = update3;
                            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, d8Var.f10207b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
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
        } else if (this.f10276e != null) {
            canvas.save();
            canvas.translate(g8Var.F, g8Var.G + i3);
            if (h8Var.f10373a0.x()) {
                h8Var.f10373a0.W(canvas);
            }
            d(this.f10276e, canvas, arrayList3);
            org.telegram.ui.Components.l5 update4 = org.telegram.ui.Components.p5.update(0, g8Var, this.d, this.f10276e);
            this.d = update4;
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.f10276e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.f10276e, g8Var.F, g8Var.G + i3);
            }
        }
        if (this.f10286p != null) {
            canvas.save();
            canvas.translate(g8Var.F, (org.telegram.messenger.g0.W1(g8Var.f10347x, this.f10283m, this.f10282l) + g8Var.G) - this.f10286p.b());
            c8 c8Var2 = this.f10286p;
            int width2 = g8Var.getWidth();
            int i13 = g8Var.F;
            c8Var2.a(canvas, (width2 - i13) - i13);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            yh.f.g(this.v, false, -1, 0, this.f10291u, 0, staticLayout, arrayList, canvas, false);
        } else {
            staticLayout.draw(canvas);
        }
    }

    public final void e(int i3) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        g8 g8Var = this.v;
        h8 h8Var = g8Var.K;
        TextPaint textPaint = g8Var.d;
        f8[] f8VarArr = g8Var.f10344r;
        TextPaint textPaint2 = g8Var.f10340c;
        boolean isEmpty = TextUtils.isEmpty(this.f10284n);
        Stack stack = this.f10280j;
        ArrayList arrayList = this.f10279i;
        if (isEmpty) {
            this.f10276e = null;
            this.f10282l = 0;
            c8 c8Var = this.f10285o;
            if (c8Var != null) {
                this.f10282l = org.telegram.messenger.g0.L(4.0f) + c8Var.b();
            }
            c8 c8Var2 = this.f10286p;
            if (c8Var2 != null) {
                this.f10282l = org.telegram.messenger.k5.C(4.0f, c8Var2.b(), this.f10282l);
            }
            this.f10283m = this.f10282l;
            if (this == f8VarArr[0]) {
                g8Var.f10346w = null;
            }
            this.f10278g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a10 = g8.a(g8Var, textPaint2, this.f10284n, i3);
        this.f10276e = a10;
        this.f10282l = a10.getHeight();
        c8 c8Var3 = this.f10285o;
        if (c8Var3 != null) {
            i10 = org.telegram.messenger.g0.L(8.0f) + c8Var3.b();
        } else {
            i10 = 0;
        }
        c8 c8Var4 = this.f10286p;
        if (c8Var4 != null) {
            this.f10282l = org.telegram.messenger.k5.C(8.0f, c8Var4.b(), this.f10282l);
        }
        this.f10282l += i10;
        float measureText = textPaint2.measureText(" ");
        if (this.f10276e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        g8Var.f10339b = z10;
        if (z10) {
            i11 = 3;
            if (this.f10276e.getLineCount() == 4) {
                if (TextUtils.getTrimmedLength(this.f10284n.subSequence(this.f10276e.getLineStart(2), this.f10276e.getLineEnd(2))) == 0) {
                    g8Var.f10339b = false;
                }
            }
        } else {
            i11 = 3;
        }
        if (g8Var.f10339b) {
            float topPadding = this.f10276e.getTopPadding() + this.f10276e.getLineTop(2);
            if (this == f8VarArr[0]) {
                String M0 = bd.M0(2131745349, null);
                g8Var.f10346w = g8.a(g8Var, textPaint, M0, i3);
                g8Var.h = ((g8Var.G + i10) + topPadding) - org.telegram.messenger.g0.N(0.3f);
                g8Var.f10343n = (g8Var.F + i3) - textPaint.measureText(M0);
            }
            int topPadding2 = this.f10276e.getTopPadding() + this.f10276e.getLineBottom(2);
            c8 c8Var5 = this.f10285o;
            if (c8Var5 != null) {
                i12 = org.telegram.messenger.g0.L(8.0f) + c8Var5.b();
            } else {
                i12 = 0;
            }
            int i14 = topPadding2 + i12;
            c8 c8Var6 = this.f10286p;
            if (c8Var6 != null) {
                i13 = org.telegram.messenger.g0.L(8.0f) + c8Var6.b();
            } else {
                i13 = 0;
            }
            this.f10283m = i14 + i13;
            this.f10278g = g8.a(g8Var, textPaint2, this.f10284n.subSequence(0, this.f10276e.getLineEnd(2)), i3);
            stack.addAll(arrayList);
            arrayList.clear();
            yh.f.c(h8Var, this.f10276e, stack, arrayList);
            float lineRight = this.f10276e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i15 = 0;
                while (true) {
                    d8[] d8VarArr = this.h;
                    if (i15 >= d8VarArr.length) {
                        break;
                    }
                    d8 d8Var = d8VarArr[i15];
                    if (d8Var != null) {
                        org.telegram.ui.Components.p5.release(h8Var, d8Var.f10206a);
                    }
                    i15++;
                }
            }
            this.h = new d8[this.f10276e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i16 = i11; i16 < this.f10276e.getLineCount(); i16++) {
                    int lineStart = this.f10276e.getLineStart(i16);
                    int lineEnd = this.f10276e.getLineEnd(i16);
                    CharSequence subSequence = this.f10284n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i16 - 3] = null;
                    } else {
                        StaticLayout a11 = g8.a(g8Var, textPaint2, subSequence, i3);
                        ?? obj = new Object();
                        this.h[i16 - 3] = obj;
                        obj.f10207b = a11;
                        obj.f10209e = this.f10276e.getLineLeft(i16);
                        obj.f10210f = this.f10276e.getTopPadding() + this.f10276e.getLineTop(i16);
                        if (lineRight < g8Var.f10343n - org.telegram.messenger.g0.L(16.0f)) {
                            obj.d = topPadding;
                            obj.f10208c = lineRight;
                            lineRight = Math.abs(a11.getLineRight(0) - a11.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f10210f;
                            obj.f10208c = obj.f10209e;
                        }
                    }
                }
            }
        } else {
            if (this == f8VarArr[0]) {
                g8Var.f10346w = null;
            }
            this.f10278g = null;
            this.f10283m = this.f10282l;
            stack.addAll(arrayList);
            arrayList.clear();
            yh.f.c(g8Var, this.f10276e, stack, arrayList);
        }
        int i17 = g8Var.F;
        int i18 = g8Var.G;
        df.c cVar = this.f10281k;
        cVar.f8843a = i17;
        cVar.f8845c = i18;
    }

    public final void f(Layout layout, float f10, float f11) {
        float f12;
        float f13 = 0.0f;
        int i3 = 0;
        while (i3 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i3);
            g8 g8Var = this.v;
            float f14 = lineLeft - (g8Var.F / 3.0f);
            float lineRight = (g8Var.F / 3.0f) + layout.getLineRight(i3);
            if (i3 == 0) {
                f13 = layout.getLineTop(i3) - (g8Var.G / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i3);
            if (i3 >= layout.getLineCount() - 1) {
                f12 = (g8Var.G / 3.0f) + lineBottom;
            } else {
                f12 = lineBottom;
            }
            this.f10290t.addRect(f10 + f14, f11 + f13, f10 + lineRight, f11 + f12, Path.Direction.CW);
            i3++;
            f13 = f12;
        }
    }

    public final void g(CharSequence charSequence, c8 c8Var, c8 c8Var2) {
        this.f10284n = charSequence;
        this.f10285o = c8Var;
        this.f10286p = c8Var2;
        g8 g8Var = this.v;
        if (c8Var != null) {
            e8 e8Var = new e8(this, 0);
            c8Var.f10176r = g8Var;
            c8Var.f10177s = e8Var;
            new dk0(g8Var);
            c8Var.f10168j.setCallback(g8Var);
            c8Var.h.f38643a = g8Var;
            c8Var.f10167i.f34043a = g8Var;
            c8Var.c();
        }
        c8 c8Var3 = this.f10286p;
        if (c8Var3 != null) {
            e8 e8Var2 = new e8(this, 1);
            c8Var3.f10176r = g8Var;
            c8Var3.f10177s = e8Var2;
            new dk0(g8Var);
            c8Var3.f10168j.setCallback(g8Var);
            c8Var3.h.f38643a = g8Var;
            c8Var3.f10167i.f34043a = g8Var;
            c8Var3.c();
        }
        g8Var.f10345s = 0;
        g8Var.requestLayout();
    }
}
