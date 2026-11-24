package defpackage;

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
public final class i3b {
    public m46 a;
    public gm b;
    public final i46 c;
    public cm d;
    public StaticLayout e;
    public cm f;
    public StaticLayout g;
    public g3b[] h;
    public final ArrayList i;
    public final Stack j;
    public final mk0 k;
    public int l;
    public int m;
    public CharSequence n;
    public f3b o;
    public f3b p;
    public boolean q;
    public final lm r;
    public final r86 s;
    public final Path t;
    public final AtomicReference u;
    public final j3b v;

    public i3b(j3b j3bVar) {
        this.v = j3bVar;
        this.c = new i46(j3bVar);
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new Stack();
        this.n = "";
        this.r = new lm(j3bVar.K, 0L, 400L, s33.h);
        Path path = new Path();
        this.t = path;
        this.u = new AtomicReference();
        this.k = new mk0(j3bVar, arrayList, new hza(this, (byte) 6));
        r86 r86Var = new r86();
        this.s = r86Var;
        r86Var.y = path;
        r86Var.j(4.0f);
        r86Var.g(bkb.p1(0.3f, -1), bkb.p1(0.1f, -1), bkb.p1(0.2f, -1), bkb.p1(0.7f, -1));
        r86Var.setCallback(j3bVar);
    }

    public final int a(int i) {
        int i2;
        f3b f3bVar = this.o;
        int i3 = 0;
        if (f3bVar != null) {
            i2 = gl.L(8.0f) + f3bVar.b();
        } else {
            i2 = 0;
        }
        f3b f3bVar2 = this.p;
        if (f3bVar2 != null) {
            i3 = gl.L(8.0f) + f3bVar2.b();
        }
        int i4 = i2 + i3;
        StaticLayout staticLayout = this.e;
        j3b j3bVar = this.v;
        if (staticLayout == null) {
            return i - ((j3bVar.G << 1) + this.l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!j3bVar.b) {
            return i - ((j3bVar.G << 1) + this.l);
        }
        return (i - ((Math.min(3, lineCount) + 1) * j3bVar.c.getFontMetricsInt(null))) - i4;
    }

    public final void b(Canvas canvas, float f) {
        Canvas canvas2;
        j3b j3bVar = this.v;
        k3b k3bVar = j3bVar.K;
        float d = this.r.d(this.q);
        if (f > 0.0f) {
            float R1 = gl.R1(f, 0.7f * f, d);
            if (R1 >= 1.0f) {
                c(canvas, d);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, k3bVar.getWidth(), k3bVar.getHeight(), (int) (R1 * 255.0f), 31);
                c(canvas2, d);
                canvas2.restore();
            }
            if (d <= 0.0f && !this.q) {
                return;
            }
            r86 r86Var = this.s;
            r86Var.setAlpha((int) (d * 255.0f * R1));
            r86Var.draw(canvas2);
            j3bVar.invalidate();
        }
    }

    public final void c(Canvas canvas, float f) {
        int i;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i2;
        j3b j3bVar = this.v;
        PorterDuffColorFilter porterDuffColorFilter = j3bVar.a;
        k3b k3bVar = j3bVar.K;
        if (this.o != null) {
            canvas.save();
            canvas.translate(j3bVar.F, j3bVar.G);
            f3b f3bVar = this.o;
            int width = j3bVar.getWidth();
            int i3 = j3bVar.F;
            f3bVar.a(canvas, (width - i3) - i3);
            int b = this.o.b();
            canvas.restore();
            i = gl.L(8.0f) + b;
        } else {
            i = 0;
        }
        canvas.save();
        canvas.translate(j3bVar.F, j3bVar.G + i);
        if (this.c.g(canvas)) {
            j3bVar.invalidate();
        }
        canvas.restore();
        float f2 = 0.0f;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        this.t.rewind();
        ArrayList arrayList3 = this.i;
        if (arrayList3.isEmpty() && this.g != null) {
            if (k3bVar.W.w()) {
                canvas.save();
                canvas.translate(j3bVar.F, j3bVar.G + i);
                k3bVar.W.V(canvas);
                canvas.restore();
            }
            if (this.g != null) {
                canvas.save();
                canvas.translate(j3bVar.F, j3bVar.G + i);
                d(this.g, canvas, arrayList3);
                cm update = gm.update(0, j3bVar, this.f, this.g);
                this.f = update;
                gm.drawAnimatedEmojis(canvas, this.g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z) {
                    f(this.g, j3bVar.F, j3bVar.G + i);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i4 = 0;
                while (true) {
                    g3b[] g3bVarArr = this.h;
                    if (i4 >= g3bVarArr.length) {
                        break;
                    }
                    g3b g3bVar = g3bVarArr[i4];
                    if (g3bVar != null) {
                        canvas.save();
                        float f3 = g3bVar.c;
                        float f4 = g3bVar.e;
                        int i5 = (f3 > f4 ? 1 : (f3 == f4 ? 0 : -1));
                        float f5 = j3bVar.x;
                        if (i5 == 0) {
                            if (f5 != f2) {
                                canvas.translate(j3bVar.F + f4, j3bVar.G + i + g3bVar.f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, g3bVar.b.getWidth(), g3bVar.b.getHeight(), (int) (j3bVar.x * 255.0f), 31);
                                d(g3bVar.b, canvas, arrayList);
                                if (z) {
                                    f(g3bVar.b, j3bVar.F + g3bVar.e, j3bVar.G + i + g3bVar.f);
                                }
                                g3bVar.b.draw(canvas);
                                cm update2 = gm.update(0, j3bVar, g3bVar.a, g3bVar.b);
                                g3bVar.a = update2;
                                arrayList2 = arrayList;
                                i2 = i4;
                                gm.drawAnimatedEmojis(canvas, g3bVar.b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, j3bVar.x, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i2 = i4;
                            float R1 = gl.R1(f3, f4, f5);
                            float R12 = gl.R1(g3bVar.d, g3bVar.f, s33.g.getInterpolation(j3bVar.x));
                            canvas.translate(j3bVar.F + R1, j3bVar.G + i + R12);
                            if (z) {
                                f(g3bVar.b, j3bVar.F + R1, j3bVar.G + i + R12);
                            }
                            g3bVar.b.draw(canvas);
                            cm update3 = gm.update(0, j3bVar, g3bVar.a, g3bVar.b);
                            g3bVar.a = update3;
                            gm.drawAnimatedEmojis(canvas, g3bVar.b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        }
                        canvas.restore();
                        i4 = i2 + 1;
                        arrayList = arrayList2;
                        f2 = 0.0f;
                    }
                    arrayList2 = arrayList;
                    i2 = i4;
                    i4 = i2 + 1;
                    arrayList = arrayList2;
                    f2 = 0.0f;
                }
            }
        } else if (this.e != null) {
            canvas.save();
            canvas.translate(j3bVar.F, j3bVar.G + i);
            if (k3bVar.W.w()) {
                k3bVar.W.V(canvas);
            }
            d(this.e, canvas, arrayList3);
            cm update4 = gm.update(0, j3bVar, this.d, this.e);
            this.d = update4;
            gm.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z) {
                f(this.e, j3bVar.F, j3bVar.G + i);
            }
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(j3bVar.F, (gl.U1(j3bVar.x, this.m, this.l) + j3bVar.G) - this.p.b());
            f3b f3bVar2 = this.p;
            int width2 = j3bVar.getWidth();
            int i6 = j3bVar.F;
            f3bVar2.a(canvas, (width2 - i6) - i6);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            qla.g(this.v, false, -1, 0, this.u, 0, staticLayout, arrayList, canvas, false);
        } else {
            staticLayout.draw(canvas);
        }
    }

    public final void e(int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        j3b j3bVar = this.v;
        k3b k3bVar = j3bVar.K;
        TextPaint textPaint = j3bVar.d;
        i3b[] i3bVarArr = j3bVar.r;
        TextPaint textPaint2 = j3bVar.c;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        Stack stack = this.j;
        ArrayList arrayList = this.i;
        if (isEmpty) {
            this.e = null;
            this.l = 0;
            f3b f3bVar = this.o;
            if (f3bVar != null) {
                i6 = gl.L(4.0f) + f3bVar.b();
                this.l = i6;
            } else {
                i6 = 0;
            }
            f3b f3bVar2 = this.p;
            if (f3bVar2 != null) {
                i6 = de9.w(4.0f, f3bVar2.b(), i6);
                this.l = i6;
            }
            this.m = i6;
            if (this == i3bVarArr[0]) {
                j3bVar.w = null;
            }
            this.g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a = j3b.a(i, textPaint2, this.n);
        this.e = a;
        this.l = a.getHeight();
        f3b f3bVar3 = this.o;
        if (f3bVar3 != null) {
            i2 = gl.L(8.0f) + f3bVar3.b();
        } else {
            i2 = 0;
        }
        f3b f3bVar4 = this.p;
        if (f3bVar4 != null) {
            this.l = de9.w(8.0f, f3bVar4.b(), this.l);
        }
        this.l += i2;
        float measureText = textPaint2.measureText(" ");
        if (this.e.getLineCount() > 3) {
            z = true;
        } else {
            z = false;
        }
        j3bVar.b = z;
        if (z) {
            i3 = 3;
            if (this.e.getLineCount() == 4) {
                if (TextUtils.getTrimmedLength(this.n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    j3bVar.b = false;
                }
            }
        } else {
            i3 = 3;
        }
        if (j3bVar.b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == i3bVarArr[0]) {
                String M0 = k96.M0(2131745147, null);
                j3bVar.w = j3b.a(i, textPaint, M0);
                j3bVar.h = ((j3bVar.G + i2) + topPadding) - gl.N(0.3f);
                j3bVar.n = (j3bVar.F + i) - textPaint.measureText(M0);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            f3b f3bVar5 = this.o;
            if (f3bVar5 != null) {
                i4 = gl.L(8.0f) + f3bVar5.b();
            } else {
                i4 = 0;
            }
            int i7 = topPadding2 + i4;
            f3b f3bVar6 = this.p;
            if (f3bVar6 != null) {
                i5 = gl.L(8.0f) + f3bVar6.b();
            } else {
                i5 = 0;
            }
            this.m = i7 + i5;
            this.g = j3b.a(i, textPaint2, this.n.subSequence(0, this.e.getLineEnd(2)));
            stack.addAll(arrayList);
            arrayList.clear();
            qla.c(k3bVar, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i8 = 0;
                while (true) {
                    g3b[] g3bVarArr = this.h;
                    if (i8 >= g3bVarArr.length) {
                        break;
                    }
                    g3b g3bVar = g3bVarArr[i8];
                    if (g3bVar != null) {
                        gm.release(k3bVar, g3bVar.a);
                    }
                    i8++;
                }
            }
            this.h = new g3b[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i9 = i3; i9 < this.e.getLineCount(); i9++) {
                    int lineStart = this.e.getLineStart(i9);
                    int lineEnd = this.e.getLineEnd(i9);
                    CharSequence subSequence = this.n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i9 - 3] = null;
                    } else {
                        StaticLayout a2 = j3b.a(i, textPaint2, subSequence);
                        ?? obj = new Object();
                        this.h[i9 - 3] = obj;
                        obj.b = a2;
                        obj.e = this.e.getLineLeft(i9);
                        obj.f = this.e.getTopPadding() + this.e.getLineTop(i9);
                        if (lineRight < j3bVar.n - gl.L(16.0f)) {
                            obj.d = topPadding;
                            obj.c = lineRight;
                            lineRight = Math.abs(a2.getLineRight(0) - a2.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f;
                            obj.c = obj.e;
                        }
                    }
                }
            }
        } else {
            if (this == i3bVarArr[0]) {
                j3bVar.w = null;
            }
            this.g = null;
            this.m = this.l;
            stack.addAll(arrayList);
            arrayList.clear();
            qla.c(j3bVar, this.e, stack, arrayList);
        }
        int i10 = j3bVar.F;
        int i11 = j3bVar.G;
        mk0 mk0Var = this.k;
        mk0Var.b = i10;
        mk0Var.c = i11;
    }

    public final void f(Layout layout, float f, float f2) {
        float f3;
        float f4 = 0.0f;
        int i = 0;
        while (i < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i);
            j3b j3bVar = this.v;
            float f5 = lineLeft - (j3bVar.F / 3.0f);
            float lineRight = (j3bVar.F / 3.0f) + layout.getLineRight(i);
            if (i == 0) {
                f4 = layout.getLineTop(i) - (j3bVar.G / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i);
            if (i >= layout.getLineCount() - 1) {
                f3 = (j3bVar.G / 3.0f) + lineBottom;
            } else {
                f3 = lineBottom;
            }
            this.t.addRect(f + f5, f2 + f4, f + lineRight, f2 + f3, Path.Direction.CW);
            i++;
            f4 = f3;
        }
    }

    public final void g(CharSequence charSequence, f3b f3bVar, f3b f3bVar2) {
        this.n = charSequence;
        this.o = f3bVar;
        this.p = f3bVar2;
        j3b j3bVar = this.v;
        if (f3bVar != null) {
            h3b h3bVar = new h3b(this, (byte) 0);
            f3bVar.r = j3bVar;
            f3bVar.s = h3bVar;
            new n79(j3bVar);
            f3bVar.j.setCallback(j3bVar);
            f3bVar.h.a = j3bVar;
            f3bVar.i.a = j3bVar;
            f3bVar.c();
        }
        f3b f3bVar3 = this.p;
        if (f3bVar3 != null) {
            h3b h3bVar2 = new h3b(this, (byte) 1);
            f3bVar3.r = j3bVar;
            f3bVar3.s = h3bVar2;
            new n79(j3bVar);
            f3bVar3.j.setCallback(j3bVar);
            f3bVar3.h.a = j3bVar;
            f3bVar3.i.a = j3bVar;
            f3bVar3.c();
        }
        j3bVar.s = 0;
        j3bVar.requestLayout();
    }
}
