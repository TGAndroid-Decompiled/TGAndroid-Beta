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
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u90;
public final class va {
    public r90 f1764a;
    public org.telegram.ui.Components.z5 f1765b;
    public final n90 f1766c;
    public org.telegram.ui.Components.v5 d;
    public StaticLayout f1767e;
    public org.telegram.ui.Components.v5 f1768f;
    public StaticLayout f1769g;
    public ta[] h;
    public final ArrayList f1770i;
    public final Stack f1771j;
    public final vh.l f1772k;
    public int f1773l;
    public int f1774m;
    public CharSequence f1775n;
    public sa f1776o;
    public sa f1777p;
    public boolean f1778q;
    public final org.telegram.ui.Components.e6 f1779r;
    public final u90 f1780s;
    public final Path f1781t;
    public final AtomicReference f1782u;
    public final wa v;

    public va(wa waVar) {
        this.v = waVar;
        this.f1766c = new n90(waVar);
        ArrayList arrayList = new ArrayList();
        this.f1770i = arrayList;
        this.f1771j = new Stack();
        this.f1775n = "";
        this.f1779r = new org.telegram.ui.Components.e6(waVar.J, 0L, 400L, tr.h);
        Path path = new Path();
        this.f1781t = path;
        this.f1782u = new AtomicReference();
        this.f1772k = new vh.l(waVar, arrayList, new a1.c(this, 9));
        u90 u90Var = new u90();
        this.f1780s = u90Var;
        u90Var.f31406x = path;
        u90Var.j(4.0f);
        u90Var.f(org.telegram.ui.ActionBar.i6.l1(0.3f, -1), org.telegram.ui.ActionBar.i6.l1(0.1f, -1), org.telegram.ui.ActionBar.i6.l1(0.2f, -1), org.telegram.ui.ActionBar.i6.l1(0.7f, -1));
        u90Var.setCallback(waVar);
    }

    public final int a(int i10) {
        int i11;
        sa saVar = this.f1776o;
        int i12 = 0;
        if (saVar != null) {
            i11 = AndroidUtilities.dp(8.0f) + saVar.b();
        } else {
            i11 = 0;
        }
        sa saVar2 = this.f1777p;
        if (saVar2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + saVar2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.f1767e;
        wa waVar = this.v;
        if (staticLayout == null) {
            return i10 - ((waVar.F * 2) + this.f1773l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!waVar.f1812b) {
            return i10 - ((waVar.F * 2) + this.f1773l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * waVar.f1813c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        wa waVar = this.v;
        xa xaVar = waVar.J;
        float e7 = this.f1779r.e(this.f1778q);
        if (f7 > 0.0f) {
            float lerp = AndroidUtilities.lerp(f7, 0.7f * f7, e7);
            if (lerp >= 1.0f) {
                c(canvas, e7);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, xaVar.getWidth(), xaVar.getHeight(), (int) (lerp * 255.0f), 31);
                c(canvas2, e7);
                canvas2.restore();
            }
            if (e7 <= 0.0f && !this.f1778q) {
                return;
            }
            u90 u90Var = this.f1780s;
            u90Var.setAlpha((int) (e7 * 255.0f * lerp));
            u90Var.draw(canvas2);
            waVar.invalidate();
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        wa waVar = this.v;
        PorterDuffColorFilter porterDuffColorFilter = waVar.f1811a;
        xa xaVar = waVar.J;
        if (this.f1776o != null) {
            canvas.save();
            canvas.translate(waVar.E, waVar.F);
            sa saVar = this.f1776o;
            int width = waVar.getWidth();
            int i12 = waVar.E;
            saVar.a(canvas, (width - i12) - i12);
            int b10 = this.f1776o.b();
            canvas.restore();
            i10 = AndroidUtilities.dp(8.0f) + b10;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(waVar.E, waVar.F + i10);
        if (this.f1766c.f(canvas)) {
            waVar.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1781t.rewind();
        ArrayList arrayList3 = this.f1770i;
        if (arrayList3.isEmpty() && this.f1769g != null) {
            if (xaVar.W.y()) {
                canvas.save();
                canvas.translate(waVar.E, waVar.F + i10);
                xaVar.W.X(canvas);
                canvas.restore();
            }
            if (this.f1769g != null) {
                canvas.save();
                canvas.translate(waVar.E, waVar.F + i10);
                d(this.f1769g, canvas, arrayList3);
                org.telegram.ui.Components.v5 update = org.telegram.ui.Components.z5.update(0, waVar, this.f1768f, this.f1769g);
                this.f1768f = update;
                org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, this.f1769g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f1769g, waVar.E, waVar.F + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    ta[] taVarArr = this.h;
                    if (i13 >= taVarArr.length) {
                        break;
                    }
                    ta taVar = taVarArr[i13];
                    if (taVar != null) {
                        canvas.save();
                        float f11 = taVar.f1701c;
                        float f12 = taVar.f1702e;
                        if (f11 == f12) {
                            if (waVar.f1819w != f10) {
                                canvas.translate(waVar.E + f12, waVar.F + i10 + taVar.f1703f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, taVar.f1700b.getWidth(), taVar.f1700b.getHeight(), (int) (waVar.f1819w * 255.0f), 31);
                                d(taVar.f1700b, canvas, arrayList);
                                if (z10) {
                                    f(taVar.f1700b, waVar.E + taVar.f1702e, waVar.F + i10 + taVar.f1703f);
                                }
                                taVar.f1700b.draw(canvas);
                                org.telegram.ui.Components.v5 update2 = org.telegram.ui.Components.z5.update(0, waVar, taVar.f1699a, taVar.f1700b);
                                taVar.f1699a = update2;
                                arrayList2 = arrayList;
                                i11 = i13;
                                org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, taVar.f1700b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, waVar.f1819w, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, waVar.f1819w);
                            float lerp2 = AndroidUtilities.lerp(taVar.d, taVar.f1703f, tr.f31216g.getInterpolation(waVar.f1819w));
                            canvas.translate(waVar.E + lerp, waVar.F + i10 + lerp2);
                            if (z10) {
                                f(taVar.f1700b, waVar.E + lerp, waVar.F + i10 + lerp2);
                            }
                            taVar.f1700b.draw(canvas);
                            org.telegram.ui.Components.v5 update3 = org.telegram.ui.Components.z5.update(0, waVar, taVar.f1699a, taVar.f1700b);
                            taVar.f1699a = update3;
                            org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, taVar.f1700b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
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
        } else if (this.f1767e != null) {
            canvas.save();
            canvas.translate(waVar.E, waVar.F + i10);
            if (xaVar.W.y()) {
                xaVar.W.X(canvas);
            }
            d(this.f1767e, canvas, arrayList3);
            org.telegram.ui.Components.v5 update4 = org.telegram.ui.Components.z5.update(0, waVar, this.d, this.f1767e);
            this.d = update4;
            org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, this.f1767e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.f1767e, waVar.E, waVar.F + i10);
            }
        }
        if (this.f1777p != null) {
            canvas.save();
            canvas.translate(waVar.E, (AndroidUtilities.lerp(this.f1774m, this.f1773l, waVar.f1819w) + waVar.F) - this.f1777p.b());
            sa saVar2 = this.f1777p;
            int width2 = waVar.getWidth();
            int i14 = waVar.E;
            saVar2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            vh.g.g(this.v, false, -1, 0, this.f1782u, 0, staticLayout, arrayList, canvas, false);
        } else {
            staticLayout.draw(canvas);
        }
    }

    public final void e(int i10) {
        int i11;
        boolean z10;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        int i12;
        int i13;
        wa waVar = this.v;
        xa xaVar = waVar.J;
        TextPaint textPaint = waVar.d;
        va[] vaVarArr = waVar.f1817r;
        TextPaint textPaint2 = waVar.f1813c;
        boolean isEmpty = TextUtils.isEmpty(this.f1775n);
        Stack stack = this.f1771j;
        ArrayList arrayList = this.f1770i;
        if (isEmpty) {
            this.f1767e = null;
            this.f1773l = 0;
            sa saVar = this.f1776o;
            if (saVar != null) {
                this.f1773l = AndroidUtilities.dp(4.0f) + saVar.b();
            }
            sa saVar2 = this.f1777p;
            if (saVar2 != null) {
                this.f1773l = org.telegram.messenger.q.C(4.0f, saVar2.b(), this.f1773l);
            }
            this.f1774m = this.f1773l;
            if (this == vaVarArr[0]) {
                waVar.v = null;
            }
            this.f1769g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = wa.a(waVar, textPaint2, this.f1775n, i10);
        this.f1767e = a2;
        this.f1773l = a2.getHeight();
        sa saVar3 = this.f1776o;
        if (saVar3 != null) {
            i11 = AndroidUtilities.dp(8.0f) + saVar3.b();
        } else {
            i11 = 0;
        }
        sa saVar4 = this.f1777p;
        if (saVar4 != null) {
            this.f1773l = org.telegram.messenger.q.C(8.0f, saVar4.b(), this.f1773l);
        }
        this.f1773l += i11;
        float measureText = textPaint2.measureText(" ");
        if (this.f1767e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        waVar.f1812b = z10;
        if (z10) {
            if (this.f1767e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.f1775n.subSequence(this.f1767e.getLineStart(2), this.f1767e.getLineEnd(2))) == 0) {
                    waVar.f1812b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
        }
        if (waVar.f1812b) {
            float topPadding = this.f1767e.getTopPadding() + this.f1767e.getLineTop(2);
            if (this == vaVarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                waVar.v = wa.a(waVar, textPaint, string, i10);
                waVar.h = ((waVar.F + i11) + topPadding) - AndroidUtilities.dpf2(0.3f);
                waVar.f1816n = (waVar.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.f1767e.getTopPadding() + this.f1767e.getLineBottom(2);
            sa saVar5 = this.f1776o;
            if (saVar5 != null) {
                i12 = AndroidUtilities.dp(8.0f) + saVar5.b();
            } else {
                i12 = 0;
            }
            int i14 = topPadding2 + i12;
            sa saVar6 = this.f1777p;
            if (saVar6 != null) {
                i13 = AndroidUtilities.dp(8.0f) + saVar6.b();
            } else {
                i13 = 0;
            }
            this.f1774m = i14 + i13;
            this.f1769g = wa.a(waVar, textPaint2, this.f1775n.subSequence(0, this.f1767e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            vh.g.c(xaVar, this.f1767e, stack, arrayList);
            float lineRight = this.f1767e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i15 = 0;
                while (true) {
                    ta[] taVarArr = this.h;
                    if (i15 >= taVarArr.length) {
                        break;
                    }
                    ta taVar = taVarArr[i15];
                    if (taVar != null) {
                        org.telegram.ui.Components.z5.release(xaVar, taVar.f1699a);
                    }
                    i15++;
                }
            }
            this.h = new ta[this.f1767e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i16 = 3; i16 < this.f1767e.getLineCount(); i16++) {
                    int lineStart = this.f1767e.getLineStart(i16);
                    int lineEnd = this.f1767e.getLineEnd(i16);
                    CharSequence subSequence = this.f1775n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i16 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = wa.a(waVar, textPaint2, subSequence, i10);
                        ?? obj = new Object();
                        this.h[i16 - 3] = obj;
                        obj.f1700b = a10;
                        obj.f1702e = this.f1767e.getLineLeft(i16);
                        obj.f1703f = this.f1767e.getTopPadding() + this.f1767e.getLineTop(i16);
                        if (lineRight < waVar.f1816n - AndroidUtilities.dp(16.0f)) {
                            obj.d = topPadding;
                            obj.f1701c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f1703f;
                            obj.f1701c = obj.f1702e;
                        }
                    }
                }
            }
        } else {
            if (this == vaVarArr[0]) {
                staticLayout2 = staticLayout;
                waVar.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.f1769g = staticLayout2;
            this.f1774m = this.f1773l;
            stack.addAll(arrayList);
            arrayList.clear();
            vh.g.c(waVar, this.f1767e, stack, arrayList);
        }
        int i17 = waVar.E;
        int i18 = waVar.F;
        vh.l lVar = this.f1772k;
        lVar.f48444c = i17;
        lVar.d = i18;
    }

    public final void f(Layout layout, float f7, float f10) {
        float f11;
        float f12 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            wa waVar = this.v;
            float f13 = lineLeft - (waVar.E / 3.0f);
            float lineRight = (waVar.E / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f12 = layout.getLineTop(i10) - (waVar.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            if (i10 >= layout.getLineCount() - 1) {
                f11 = (waVar.F / 3.0f) + lineBottom;
            } else {
                f11 = lineBottom;
            }
            this.f1781t.addRect(f7 + f13, f10 + f12, f7 + lineRight, f10 + f11, Path.Direction.CW);
            i10++;
            f12 = f11;
        }
    }

    public final void g(CharSequence charSequence, sa saVar, sa saVar2) {
        this.f1775n = charSequence;
        this.f1776o = saVar;
        this.f1777p = saVar2;
        wa waVar = this.v;
        if (saVar != null) {
            ua uaVar = new ua(this, 0);
            saVar.f1661r = waVar;
            saVar.f1662s = uaVar;
            new jm0(waVar);
            saVar.f1653j.setCallback(waVar);
            saVar.h.f25985a = waVar;
            saVar.f1652i.f33482a = waVar;
            saVar.c();
        }
        sa saVar3 = this.f1777p;
        if (saVar3 != null) {
            ua uaVar2 = new ua(this, 1);
            saVar3.f1661r = waVar;
            saVar3.f1662s = uaVar2;
            new jm0(waVar);
            saVar3.f1653j.setCallback(waVar);
            saVar3.h.f25985a = waVar;
            saVar3.f1652i.f33482a = waVar;
            saVar3.c();
        }
        waVar.f1818s = 0;
        waVar.requestLayout();
    }
}
