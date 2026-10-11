package ai;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ym0;
public final class wa {
    public fa0 f1868a;
    public org.telegram.ui.Components.b6 f1869b;
    public final ba0 f1870c;
    public org.telegram.ui.Components.x5 d;
    public StaticLayout f1871e;
    public org.telegram.ui.Components.x5 f1872f;
    public StaticLayout f1873g;
    public ua[] h;
    public final ArrayList f1874i;
    public final Stack f1875j;
    public final vh.l f1876k;
    public int f1877l;
    public int f1878m;
    public CharSequence f1879n;
    public ta f1880o;
    public ta f1881p;
    public boolean f1882q;
    public final org.telegram.ui.Components.g6 f1883r;
    public final ia0 f1884s;
    public final Path f1885t;
    public final AtomicReference f1886u;
    public final xa v;

    public wa(xa xaVar) {
        this.v = xaVar;
        this.f1870c = new ba0(xaVar);
        ArrayList arrayList = new ArrayList();
        this.f1874i = arrayList;
        this.f1875j = new Stack();
        this.f1879n = "";
        this.f1883r = new org.telegram.ui.Components.g6(xaVar.J, 0L, 400L, is.h);
        Path path = new Path();
        this.f1885t = path;
        this.f1886u = new AtomicReference();
        this.f1876k = new vh.l(xaVar, arrayList, new a1.c(this, 9));
        ia0 ia0Var = new ia0();
        this.f1884s = ia0Var;
        ia0Var.f27405y = path;
        ia0Var.k(4.0f);
        ia0Var.g(org.telegram.ui.ActionBar.h6.m1(0.3f, -1), org.telegram.ui.ActionBar.h6.m1(0.1f, -1), org.telegram.ui.ActionBar.h6.m1(0.2f, -1), org.telegram.ui.ActionBar.h6.m1(0.7f, -1));
        ia0Var.setCallback(xaVar);
    }

    public final int a(int i10) {
        int i11;
        ta taVar = this.f1880o;
        int i12 = 0;
        if (taVar != null) {
            i11 = AndroidUtilities.dp(8.0f) + taVar.b();
        } else {
            i11 = 0;
        }
        ta taVar2 = this.f1881p;
        if (taVar2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + taVar2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.f1871e;
        xa xaVar = this.v;
        if (staticLayout == null) {
            return i10 - ((xaVar.F * 2) + this.f1877l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!xaVar.f1918b) {
            return i10 - ((xaVar.F * 2) + this.f1877l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * xaVar.f1919c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        xa xaVar = this.v;
        ya yaVar = xaVar.J;
        float e7 = this.f1883r.e(this.f1882q);
        if (f7 > 0.0f) {
            float lerp = AndroidUtilities.lerp(f7, 0.7f * f7, e7);
            if (lerp >= 1.0f) {
                c(canvas, e7);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, yaVar.getWidth(), yaVar.getHeight(), (int) (lerp * 255.0f), 31);
                c(canvas2, e7);
                canvas2.restore();
            }
            if (e7 <= 0.0f && !this.f1882q) {
                return;
            }
            ia0 ia0Var = this.f1884s;
            ia0Var.setAlpha((int) (e7 * 255.0f * lerp));
            ia0Var.draw(canvas2);
            xaVar.invalidate();
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        xa xaVar = this.v;
        PorterDuffColorFilter porterDuffColorFilter = xaVar.f1917a;
        ya yaVar = xaVar.J;
        if (this.f1880o != null) {
            canvas.save();
            canvas.translate(xaVar.E, xaVar.F);
            ta taVar = this.f1880o;
            int width = xaVar.getWidth();
            int i12 = xaVar.E;
            taVar.a(canvas, (width - i12) - i12);
            int b10 = this.f1880o.b();
            canvas.restore();
            i10 = AndroidUtilities.dp(8.0f) + b10;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(xaVar.E, xaVar.F + i10);
        if (this.f1870c.f(canvas)) {
            xaVar.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1885t.rewind();
        ArrayList arrayList3 = this.f1874i;
        if (arrayList3.isEmpty() && this.f1873g != null) {
            if (yaVar.W.x()) {
                canvas.save();
                canvas.translate(xaVar.E, xaVar.F + i10);
                yaVar.W.W(canvas);
                canvas.restore();
            }
            if (this.f1873g != null) {
                canvas.save();
                canvas.translate(xaVar.E, xaVar.F + i10);
                d(this.f1873g, canvas, arrayList3);
                org.telegram.ui.Components.x5 update = org.telegram.ui.Components.b6.update(0, xaVar, this.f1872f, this.f1873g);
                this.f1872f = update;
                org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, this.f1873g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f1873g, xaVar.E, xaVar.F + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    ua[] uaVarArr = this.h;
                    if (i13 >= uaVarArr.length) {
                        break;
                    }
                    ua uaVar = uaVarArr[i13];
                    if (uaVar != null) {
                        canvas.save();
                        float f11 = uaVar.f1809c;
                        float f12 = uaVar.f1810e;
                        if (f11 == f12) {
                            if (xaVar.f1925w != f10) {
                                canvas.translate(xaVar.E + f12, xaVar.F + i10 + uaVar.f1811f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, uaVar.f1808b.getWidth(), uaVar.f1808b.getHeight(), (int) (xaVar.f1925w * 255.0f), 31);
                                d(uaVar.f1808b, canvas, arrayList);
                                if (z10) {
                                    f(uaVar.f1808b, xaVar.E + uaVar.f1810e, xaVar.F + i10 + uaVar.f1811f);
                                }
                                uaVar.f1808b.draw(canvas);
                                org.telegram.ui.Components.x5 update2 = org.telegram.ui.Components.b6.update(0, xaVar, uaVar.f1807a, uaVar.f1808b);
                                uaVar.f1807a = update2;
                                arrayList2 = arrayList;
                                i11 = i13;
                                org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, uaVar.f1808b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, xaVar.f1925w, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, xaVar.f1925w);
                            float lerp2 = AndroidUtilities.lerp(uaVar.d, uaVar.f1811f, is.f27501g.getInterpolation(xaVar.f1925w));
                            canvas.translate(xaVar.E + lerp, xaVar.F + i10 + lerp2);
                            if (z10) {
                                f(uaVar.f1808b, xaVar.E + lerp, xaVar.F + i10 + lerp2);
                            }
                            uaVar.f1808b.draw(canvas);
                            org.telegram.ui.Components.x5 update3 = org.telegram.ui.Components.b6.update(0, xaVar, uaVar.f1807a, uaVar.f1808b);
                            uaVar.f1807a = update3;
                            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, uaVar.f1808b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        }
                        canvas.restore();
                        i13 = i11 + 1;
                        arrayList = arrayList2;
                        f10 = 0.0f;
                    }
                    arrayList2 = arrayList;
                    i11 = i13;
                    i13 = i11 + 1;
                    arrayList = arrayList2;
                    f10 = 0.0f;
                }
            }
        } else if (this.f1871e != null) {
            canvas.save();
            canvas.translate(xaVar.E, xaVar.F + i10);
            if (yaVar.W.x()) {
                yaVar.W.W(canvas);
            }
            d(this.f1871e, canvas, arrayList3);
            org.telegram.ui.Components.x5 update4 = org.telegram.ui.Components.b6.update(0, xaVar, this.d, this.f1871e);
            this.d = update4;
            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, this.f1871e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.f1871e, xaVar.E, xaVar.F + i10);
            }
        }
        if (this.f1881p != null) {
            canvas.save();
            canvas.translate(xaVar.E, (AndroidUtilities.lerp(this.f1878m, this.f1877l, xaVar.f1925w) + xaVar.F) - this.f1881p.b());
            ta taVar2 = this.f1881p;
            int width2 = xaVar.getWidth();
            int i14 = xaVar.E;
            taVar2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            vh.g.g(this.v, false, -1, 0, this.f1886u, 0, staticLayout, arrayList, canvas, false);
        } else {
            staticLayout.draw(canvas);
        }
    }

    public final void e(int i10) {
        int i11;
        boolean z10;
        StaticLayout staticLayout;
        int i12;
        StaticLayout staticLayout2;
        int i13;
        int i14;
        xa xaVar = this.v;
        ya yaVar = xaVar.J;
        TextPaint textPaint = xaVar.d;
        wa[] waVarArr = xaVar.f1923r;
        TextPaint textPaint2 = xaVar.f1919c;
        boolean isEmpty = TextUtils.isEmpty(this.f1879n);
        Stack stack = this.f1875j;
        ArrayList arrayList = this.f1874i;
        if (isEmpty) {
            this.f1871e = null;
            this.f1877l = 0;
            ta taVar = this.f1880o;
            if (taVar != null) {
                this.f1877l = AndroidUtilities.dp(4.0f) + taVar.b();
            }
            ta taVar2 = this.f1881p;
            if (taVar2 != null) {
                this.f1877l = org.telegram.messenger.q.C(4.0f, taVar2.b(), this.f1877l);
            }
            this.f1878m = this.f1877l;
            if (this == waVarArr[0]) {
                xaVar.v = null;
            }
            this.f1873g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = xa.a(xaVar, textPaint2, this.f1879n, i10);
        this.f1871e = a2;
        this.f1877l = a2.getHeight();
        ta taVar3 = this.f1880o;
        if (taVar3 != null) {
            i11 = AndroidUtilities.dp(8.0f) + taVar3.b();
        } else {
            i11 = 0;
        }
        ta taVar4 = this.f1881p;
        if (taVar4 != null) {
            this.f1877l = org.telegram.messenger.q.C(8.0f, taVar4.b(), this.f1877l);
        }
        this.f1877l += i11;
        float measureText = textPaint2.measureText(" ");
        if (this.f1871e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        xaVar.f1918b = z10;
        if (z10) {
            i12 = 3;
            if (this.f1871e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.f1879n.subSequence(this.f1871e.getLineStart(2), this.f1871e.getLineEnd(2))) == 0) {
                    xaVar.f1918b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
            i12 = 3;
        }
        if (xaVar.f1918b) {
            float topPadding = this.f1871e.getTopPadding() + this.f1871e.getLineTop(2);
            if (this == waVarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                xaVar.v = xa.a(xaVar, textPaint, string, i10);
                xaVar.h = ((xaVar.F + i11) + topPadding) - AndroidUtilities.dpf2(0.3f);
                xaVar.f1922n = (xaVar.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.f1871e.getTopPadding() + this.f1871e.getLineBottom(2);
            ta taVar5 = this.f1880o;
            if (taVar5 != null) {
                i13 = AndroidUtilities.dp(8.0f) + taVar5.b();
            } else {
                i13 = 0;
            }
            int i15 = topPadding2 + i13;
            ta taVar6 = this.f1881p;
            if (taVar6 != null) {
                i14 = AndroidUtilities.dp(8.0f) + taVar6.b();
            } else {
                i14 = 0;
            }
            this.f1878m = i15 + i14;
            this.f1873g = xa.a(xaVar, textPaint2, this.f1879n.subSequence(0, this.f1871e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            vh.g.c(yaVar, this.f1871e, stack, arrayList);
            float lineRight = this.f1871e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i16 = 0;
                while (true) {
                    ua[] uaVarArr = this.h;
                    if (i16 >= uaVarArr.length) {
                        break;
                    }
                    ua uaVar = uaVarArr[i16];
                    if (uaVar != null) {
                        org.telegram.ui.Components.b6.release(yaVar, uaVar.f1807a);
                    }
                    i16++;
                }
            }
            this.h = new ua[this.f1871e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i17 = i12; i17 < this.f1871e.getLineCount(); i17++) {
                    int lineStart = this.f1871e.getLineStart(i17);
                    int lineEnd = this.f1871e.getLineEnd(i17);
                    CharSequence subSequence = this.f1879n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i17 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = xa.a(xaVar, textPaint2, subSequence, i10);
                        ?? obj = new Object();
                        this.h[i17 - 3] = obj;
                        obj.f1808b = a10;
                        obj.f1810e = this.f1871e.getLineLeft(i17);
                        obj.f1811f = this.f1871e.getTopPadding() + this.f1871e.getLineTop(i17);
                        if (lineRight < xaVar.f1922n - AndroidUtilities.dp(16.0f)) {
                            obj.d = topPadding;
                            obj.f1809c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f1811f;
                            obj.f1809c = obj.f1810e;
                        }
                    }
                }
            }
        } else {
            if (this == waVarArr[0]) {
                staticLayout2 = staticLayout;
                xaVar.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.f1873g = staticLayout2;
            this.f1878m = this.f1877l;
            stack.addAll(arrayList);
            arrayList.clear();
            vh.g.c(xaVar, this.f1871e, stack, arrayList);
        }
        int i18 = xaVar.E;
        int i19 = xaVar.F;
        vh.l lVar = this.f1876k;
        lVar.f49847c = i18;
        lVar.d = i19;
    }

    public final void f(Layout layout, float f7, float f10) {
        float f11;
        float f12 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            xa xaVar = this.v;
            float f13 = lineLeft - (xaVar.E / 3.0f);
            float lineRight = (xaVar.E / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f12 = layout.getLineTop(i10) - (xaVar.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            if (i10 >= layout.getLineCount() - 1) {
                f11 = (xaVar.F / 3.0f) + lineBottom;
            } else {
                f11 = lineBottom;
            }
            this.f1885t.addRect(f7 + f13, f10 + f12, f7 + lineRight, f10 + f11, Path.Direction.CW);
            i10++;
            f12 = f11;
        }
    }

    public final void g(CharSequence charSequence, ta taVar, ta taVar2) {
        this.f1879n = charSequence;
        this.f1880o = taVar;
        this.f1881p = taVar2;
        xa xaVar = this.v;
        if (taVar != null) {
            va vaVar = new va(this, 0);
            taVar.f1768r = xaVar;
            taVar.f1769s = vaVar;
            new ym0(xaVar);
            taVar.f1760j.setCallback(xaVar);
            taVar.h.f26663a = xaVar;
            taVar.f1759i.f24975a = xaVar;
            taVar.c();
        }
        ta taVar3 = this.f1881p;
        if (taVar3 != null) {
            va vaVar2 = new va(this, 1);
            taVar3.f1768r = xaVar;
            taVar3.f1769s = vaVar2;
            new ym0(xaVar);
            taVar3.f1760j.setCallback(xaVar);
            taVar3.h.f26663a = xaVar;
            taVar3.f1759i.f24975a = xaVar;
            taVar3.c();
        }
        xaVar.f1924s = 0;
        xaVar.requestLayout();
    }
}
