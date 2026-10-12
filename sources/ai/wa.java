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
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.ma0;
public final class wa {
    public ja0 f1866a;
    public org.telegram.ui.Components.b6 f1867b;
    public final fa0 f1868c;
    public org.telegram.ui.Components.x5 d;
    public StaticLayout f1869e;
    public org.telegram.ui.Components.x5 f1870f;
    public StaticLayout f1871g;
    public ua[] h;
    public final ArrayList f1872i;
    public final Stack f1873j;
    public final vh.l f1874k;
    public int f1875l;
    public int f1876m;
    public CharSequence f1877n;
    public ta f1878o;
    public ta f1879p;
    public boolean f1880q;
    public final org.telegram.ui.Components.g6 f1881r;
    public final ma0 f1882s;
    public final Path f1883t;
    public final AtomicReference f1884u;
    public final xa v;

    public wa(xa xaVar) {
        this.v = xaVar;
        this.f1868c = new fa0(xaVar);
        ArrayList arrayList = new ArrayList();
        this.f1872i = arrayList;
        this.f1873j = new Stack();
        this.f1877n = "";
        this.f1881r = new org.telegram.ui.Components.g6(xaVar.J, 0L, 400L, js.h);
        Path path = new Path();
        this.f1883t = path;
        this.f1884u = new AtomicReference();
        this.f1874k = new vh.l(xaVar, arrayList, new a1.c(this, 9));
        ma0 ma0Var = new ma0();
        this.f1882s = ma0Var;
        ma0Var.f28482y = path;
        ma0Var.k(4.0f);
        ma0Var.g(org.telegram.ui.ActionBar.h6.m1(0.3f, -1), org.telegram.ui.ActionBar.h6.m1(0.1f, -1), org.telegram.ui.ActionBar.h6.m1(0.2f, -1), org.telegram.ui.ActionBar.h6.m1(0.7f, -1));
        ma0Var.setCallback(xaVar);
    }

    public final int a(int i10) {
        int i11;
        ta taVar = this.f1878o;
        int i12 = 0;
        if (taVar != null) {
            i11 = AndroidUtilities.dp(8.0f) + taVar.b();
        } else {
            i11 = 0;
        }
        ta taVar2 = this.f1879p;
        if (taVar2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + taVar2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.f1869e;
        xa xaVar = this.v;
        if (staticLayout == null) {
            return i10 - ((xaVar.F * 2) + this.f1875l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!xaVar.f1916b) {
            return i10 - ((xaVar.F * 2) + this.f1875l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * xaVar.f1917c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        xa xaVar = this.v;
        ya yaVar = xaVar.J;
        float e7 = this.f1881r.e(this.f1880q);
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
            if (e7 <= 0.0f && !this.f1880q) {
                return;
            }
            ma0 ma0Var = this.f1882s;
            ma0Var.setAlpha((int) (e7 * 255.0f * lerp));
            ma0Var.draw(canvas2);
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
        PorterDuffColorFilter porterDuffColorFilter = xaVar.f1915a;
        ya yaVar = xaVar.J;
        if (this.f1878o != null) {
            canvas.save();
            canvas.translate(xaVar.E, xaVar.F);
            ta taVar = this.f1878o;
            int width = xaVar.getWidth();
            int i12 = xaVar.E;
            taVar.a(canvas, (width - i12) - i12);
            int b10 = this.f1878o.b();
            canvas.restore();
            i10 = AndroidUtilities.dp(8.0f) + b10;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(xaVar.E, xaVar.F + i10);
        if (this.f1868c.f(canvas)) {
            xaVar.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1883t.rewind();
        ArrayList arrayList3 = this.f1872i;
        if (arrayList3.isEmpty() && this.f1871g != null) {
            if (yaVar.W.x()) {
                canvas.save();
                canvas.translate(xaVar.E, xaVar.F + i10);
                yaVar.W.W(canvas);
                canvas.restore();
            }
            if (this.f1871g != null) {
                canvas.save();
                canvas.translate(xaVar.E, xaVar.F + i10);
                d(this.f1871g, canvas, arrayList3);
                org.telegram.ui.Components.x5 update = org.telegram.ui.Components.b6.update(0, xaVar, this.f1870f, this.f1871g);
                this.f1870f = update;
                org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, this.f1871g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f1871g, xaVar.E, xaVar.F + i10);
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
                        float f11 = uaVar.f1807c;
                        float f12 = uaVar.f1808e;
                        if (f11 == f12) {
                            if (xaVar.f1923w != f10) {
                                canvas.translate(xaVar.E + f12, xaVar.F + i10 + uaVar.f1809f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, uaVar.f1806b.getWidth(), uaVar.f1806b.getHeight(), (int) (xaVar.f1923w * 255.0f), 31);
                                d(uaVar.f1806b, canvas, arrayList);
                                if (z10) {
                                    f(uaVar.f1806b, xaVar.E + uaVar.f1808e, xaVar.F + i10 + uaVar.f1809f);
                                }
                                uaVar.f1806b.draw(canvas);
                                org.telegram.ui.Components.x5 update2 = org.telegram.ui.Components.b6.update(0, xaVar, uaVar.f1805a, uaVar.f1806b);
                                uaVar.f1805a = update2;
                                arrayList2 = arrayList;
                                i11 = i13;
                                org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, uaVar.f1806b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, xaVar.f1923w, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, xaVar.f1923w);
                            float lerp2 = AndroidUtilities.lerp(uaVar.d, uaVar.f1809f, js.f27635g.getInterpolation(xaVar.f1923w));
                            canvas.translate(xaVar.E + lerp, xaVar.F + i10 + lerp2);
                            if (z10) {
                                f(uaVar.f1806b, xaVar.E + lerp, xaVar.F + i10 + lerp2);
                            }
                            uaVar.f1806b.draw(canvas);
                            org.telegram.ui.Components.x5 update3 = org.telegram.ui.Components.b6.update(0, xaVar, uaVar.f1805a, uaVar.f1806b);
                            uaVar.f1805a = update3;
                            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, uaVar.f1806b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
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
        } else if (this.f1869e != null) {
            canvas.save();
            canvas.translate(xaVar.E, xaVar.F + i10);
            if (yaVar.W.x()) {
                yaVar.W.W(canvas);
            }
            d(this.f1869e, canvas, arrayList3);
            org.telegram.ui.Components.x5 update4 = org.telegram.ui.Components.b6.update(0, xaVar, this.d, this.f1869e);
            this.d = update4;
            org.telegram.ui.Components.b6.drawAnimatedEmojis(canvas, this.f1869e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.f1869e, xaVar.E, xaVar.F + i10);
            }
        }
        if (this.f1879p != null) {
            canvas.save();
            canvas.translate(xaVar.E, (AndroidUtilities.lerp(this.f1876m, this.f1875l, xaVar.f1923w) + xaVar.F) - this.f1879p.b());
            ta taVar2 = this.f1879p;
            int width2 = xaVar.getWidth();
            int i14 = xaVar.E;
            taVar2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            vh.g.g(this.v, false, -1, 0, this.f1884u, 0, staticLayout, arrayList, canvas, false);
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
        wa[] waVarArr = xaVar.f1921r;
        TextPaint textPaint2 = xaVar.f1917c;
        boolean isEmpty = TextUtils.isEmpty(this.f1877n);
        Stack stack = this.f1873j;
        ArrayList arrayList = this.f1872i;
        if (isEmpty) {
            this.f1869e = null;
            this.f1875l = 0;
            ta taVar = this.f1878o;
            if (taVar != null) {
                this.f1875l = AndroidUtilities.dp(4.0f) + taVar.b();
            }
            ta taVar2 = this.f1879p;
            if (taVar2 != null) {
                this.f1875l = org.telegram.messenger.v0.C(4.0f, taVar2.b(), this.f1875l);
            }
            this.f1876m = this.f1875l;
            if (this == waVarArr[0]) {
                xaVar.v = null;
            }
            this.f1871g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = xa.a(xaVar, textPaint2, this.f1877n, i10);
        this.f1869e = a2;
        this.f1875l = a2.getHeight();
        ta taVar3 = this.f1878o;
        if (taVar3 != null) {
            i11 = AndroidUtilities.dp(8.0f) + taVar3.b();
        } else {
            i11 = 0;
        }
        ta taVar4 = this.f1879p;
        if (taVar4 != null) {
            this.f1875l = org.telegram.messenger.v0.C(8.0f, taVar4.b(), this.f1875l);
        }
        this.f1875l += i11;
        float measureText = textPaint2.measureText(" ");
        if (this.f1869e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        xaVar.f1916b = z10;
        if (z10) {
            i12 = 3;
            if (this.f1869e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.f1877n.subSequence(this.f1869e.getLineStart(2), this.f1869e.getLineEnd(2))) == 0) {
                    xaVar.f1916b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
            i12 = 3;
        }
        if (xaVar.f1916b) {
            float topPadding = this.f1869e.getTopPadding() + this.f1869e.getLineTop(2);
            if (this == waVarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                xaVar.v = xa.a(xaVar, textPaint, string, i10);
                xaVar.h = ((xaVar.F + i11) + topPadding) - AndroidUtilities.dpf2(0.3f);
                xaVar.f1920n = (xaVar.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.f1869e.getTopPadding() + this.f1869e.getLineBottom(2);
            ta taVar5 = this.f1878o;
            if (taVar5 != null) {
                i13 = AndroidUtilities.dp(8.0f) + taVar5.b();
            } else {
                i13 = 0;
            }
            int i15 = topPadding2 + i13;
            ta taVar6 = this.f1879p;
            if (taVar6 != null) {
                i14 = AndroidUtilities.dp(8.0f) + taVar6.b();
            } else {
                i14 = 0;
            }
            this.f1876m = i15 + i14;
            this.f1871g = xa.a(xaVar, textPaint2, this.f1877n.subSequence(0, this.f1869e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            vh.g.c(yaVar, this.f1869e, stack, arrayList);
            float lineRight = this.f1869e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i16 = 0;
                while (true) {
                    ua[] uaVarArr = this.h;
                    if (i16 >= uaVarArr.length) {
                        break;
                    }
                    ua uaVar = uaVarArr[i16];
                    if (uaVar != null) {
                        org.telegram.ui.Components.b6.release(yaVar, uaVar.f1805a);
                    }
                    i16++;
                }
            }
            this.h = new ua[this.f1869e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i17 = i12; i17 < this.f1869e.getLineCount(); i17++) {
                    int lineStart = this.f1869e.getLineStart(i17);
                    int lineEnd = this.f1869e.getLineEnd(i17);
                    CharSequence subSequence = this.f1877n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i17 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = xa.a(xaVar, textPaint2, subSequence, i10);
                        ?? obj = new Object();
                        this.h[i17 - 3] = obj;
                        obj.f1806b = a10;
                        obj.f1808e = this.f1869e.getLineLeft(i17);
                        obj.f1809f = this.f1869e.getTopPadding() + this.f1869e.getLineTop(i17);
                        if (lineRight < xaVar.f1920n - AndroidUtilities.dp(16.0f)) {
                            obj.d = topPadding;
                            obj.f1807c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f1809f;
                            obj.f1807c = obj.f1808e;
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
            this.f1871g = staticLayout2;
            this.f1876m = this.f1875l;
            stack.addAll(arrayList);
            arrayList.clear();
            vh.g.c(xaVar, this.f1869e, stack, arrayList);
        }
        int i18 = xaVar.E;
        int i19 = xaVar.F;
        vh.l lVar = this.f1874k;
        lVar.f49962c = i18;
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
            this.f1883t.addRect(f7 + f13, f10 + f12, f7 + lineRight, f10 + f11, Path.Direction.CW);
            i10++;
            f12 = f11;
        }
    }

    public final void g(CharSequence charSequence, ta taVar, ta taVar2) {
        this.f1877n = charSequence;
        this.f1878o = taVar;
        this.f1879p = taVar2;
        xa xaVar = this.v;
        if (taVar != null) {
            va vaVar = new va(this, 0);
            taVar.f1766r = xaVar;
            taVar.f1767s = vaVar;
            new dn0(xaVar);
            taVar.f1758j.setCallback(xaVar);
            taVar.h.f26299a = xaVar;
            taVar.f1757i.f24281a = xaVar;
            taVar.c();
        }
        ta taVar3 = this.f1879p;
        if (taVar3 != null) {
            va vaVar2 = new va(this, 1);
            taVar3.f1766r = xaVar;
            taVar3.f1767s = vaVar2;
            new dn0(xaVar);
            taVar3.f1758j.setCallback(xaVar);
            taVar3.h.f26299a = xaVar;
            taVar3.f1757i.f24281a = xaVar;
            taVar3.c();
        }
        xaVar.f1922s = 0;
        xaVar.requestLayout();
    }
}
