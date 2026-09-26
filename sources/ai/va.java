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
import org.telegram.ui.Components.dm0;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.rr;
public final class va {
    public o90 f1620a;
    public org.telegram.ui.Components.z5 f1621b;
    public final k90 f1622c;
    public org.telegram.ui.Components.v5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.v5 f1623f;
    public StaticLayout f1624g;
    public ta[] h;
    public final ArrayList f1625i;
    public final Stack f1626j;
    public final vh.l f1627k;
    public int f1628l;
    public int f1629m;
    public CharSequence f1630n;
    public sa f1631o;
    public sa f1632p;
    public boolean f1633q;
    public final org.telegram.ui.Components.e6 f1634r;
    public final r90 f1635s;
    public final Path f1636t;
    public final AtomicReference f1637u;
    public final wa v;

    public va(wa waVar) {
        this.v = waVar;
        this.f1622c = new k90(waVar);
        ArrayList arrayList = new ArrayList();
        this.f1625i = arrayList;
        this.f1626j = new Stack();
        this.f1630n = "";
        this.f1634r = new org.telegram.ui.Components.e6(waVar.J, 0L, 400L, rr.h);
        Path path = new Path();
        this.f1636t = path;
        this.f1637u = new AtomicReference();
        this.f1627k = new vh.l(waVar, arrayList, new a1.c(this, 9));
        r90 r90Var = new r90();
        this.f1635s = r90Var;
        r90Var.f27930x = path;
        r90Var.j(4.0f);
        r90Var.f(org.telegram.ui.ActionBar.h6.l1(0.3f, -1), org.telegram.ui.ActionBar.h6.l1(0.1f, -1), org.telegram.ui.ActionBar.h6.l1(0.2f, -1), org.telegram.ui.ActionBar.h6.l1(0.7f, -1));
        r90Var.setCallback(waVar);
    }

    public final int a(int i10) {
        int i11;
        sa saVar = this.f1631o;
        int i12 = 0;
        if (saVar != null) {
            i11 = AndroidUtilities.dp(8.0f) + saVar.b();
        } else {
            i11 = 0;
        }
        sa saVar2 = this.f1632p;
        if (saVar2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + saVar2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        wa waVar = this.v;
        if (staticLayout == null) {
            return i10 - ((waVar.F * 2) + this.f1628l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!waVar.f1664b) {
            return i10 - ((waVar.F * 2) + this.f1628l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * waVar.f1665c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        wa waVar = this.v;
        xa xaVar = waVar.J;
        float e = this.f1634r.e(this.f1633q);
        if (f7 > 0.0f) {
            float lerp = AndroidUtilities.lerp(f7, 0.7f * f7, e);
            if (lerp >= 1.0f) {
                c(canvas, e);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, xaVar.getWidth(), xaVar.getHeight(), (int) (lerp * 255.0f), 31);
                c(canvas2, e);
                canvas2.restore();
            }
            if (e <= 0.0f && !this.f1633q) {
                return;
            }
            r90 r90Var = this.f1635s;
            r90Var.setAlpha((int) (e * 255.0f * lerp));
            r90Var.draw(canvas2);
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
        PorterDuffColorFilter porterDuffColorFilter = waVar.f1663a;
        xa xaVar = waVar.J;
        if (this.f1631o != null) {
            canvas.save();
            canvas.translate(waVar.E, waVar.F);
            sa saVar = this.f1631o;
            int width = waVar.getWidth();
            int i12 = waVar.E;
            saVar.a(canvas, (width - i12) - i12);
            int b10 = this.f1631o.b();
            canvas.restore();
            i10 = AndroidUtilities.dp(8.0f) + b10;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(waVar.E, waVar.F + i10);
        if (this.f1622c.f(canvas)) {
            waVar.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1636t.rewind();
        ArrayList arrayList3 = this.f1625i;
        if (arrayList3.isEmpty() && this.f1624g != null) {
            if (xaVar.W.y()) {
                canvas.save();
                canvas.translate(waVar.E, waVar.F + i10);
                xaVar.W.X(canvas);
                canvas.restore();
            }
            if (this.f1624g != null) {
                canvas.save();
                canvas.translate(waVar.E, waVar.F + i10);
                d(this.f1624g, canvas, arrayList3);
                org.telegram.ui.Components.v5 update = org.telegram.ui.Components.z5.update(0, waVar, this.f1623f, this.f1624g);
                this.f1623f = update;
                org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, this.f1624g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f1624g, waVar.E, waVar.F + i10);
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
                        float f11 = taVar.f1562c;
                        float f12 = taVar.e;
                        if (f11 == f12) {
                            if (waVar.f1670w != f10) {
                                canvas.translate(waVar.E + f12, waVar.F + i10 + taVar.f1563f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, taVar.f1561b.getWidth(), taVar.f1561b.getHeight(), (int) (waVar.f1670w * 255.0f), 31);
                                d(taVar.f1561b, canvas, arrayList);
                                if (z10) {
                                    f(taVar.f1561b, waVar.E + taVar.e, waVar.F + i10 + taVar.f1563f);
                                }
                                taVar.f1561b.draw(canvas);
                                org.telegram.ui.Components.v5 update2 = org.telegram.ui.Components.z5.update(0, waVar, taVar.f1560a, taVar.f1561b);
                                taVar.f1560a = update2;
                                arrayList2 = arrayList;
                                i11 = i13;
                                org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, taVar.f1561b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, waVar.f1670w, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, waVar.f1670w);
                            float lerp2 = AndroidUtilities.lerp(taVar.d, taVar.f1563f, rr.f28031g.getInterpolation(waVar.f1670w));
                            canvas.translate(waVar.E + lerp, waVar.F + i10 + lerp2);
                            if (z10) {
                                f(taVar.f1561b, waVar.E + lerp, waVar.F + i10 + lerp2);
                            }
                            taVar.f1561b.draw(canvas);
                            org.telegram.ui.Components.v5 update3 = org.telegram.ui.Components.z5.update(0, waVar, taVar.f1560a, taVar.f1561b);
                            taVar.f1560a = update3;
                            org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, taVar.f1561b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
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
        } else if (this.e != null) {
            canvas.save();
            canvas.translate(waVar.E, waVar.F + i10);
            if (xaVar.W.y()) {
                xaVar.W.X(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.v5 update4 = org.telegram.ui.Components.z5.update(0, waVar, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, waVar.E, waVar.F + i10);
            }
        }
        if (this.f1632p != null) {
            canvas.save();
            canvas.translate(waVar.E, (AndroidUtilities.lerp(this.f1629m, this.f1628l, waVar.f1670w) + waVar.F) - this.f1632p.b());
            sa saVar2 = this.f1632p;
            int width2 = waVar.getWidth();
            int i14 = waVar.E;
            saVar2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            vh.g.g(this.v, false, -1, 0, this.f1637u, 0, staticLayout, arrayList, canvas, false);
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
        va[] vaVarArr = waVar.f1668r;
        TextPaint textPaint2 = waVar.f1665c;
        boolean isEmpty = TextUtils.isEmpty(this.f1630n);
        Stack stack = this.f1626j;
        ArrayList arrayList = this.f1625i;
        if (isEmpty) {
            this.e = null;
            this.f1628l = 0;
            sa saVar = this.f1631o;
            if (saVar != null) {
                this.f1628l = AndroidUtilities.dp(4.0f) + saVar.b();
            }
            sa saVar2 = this.f1632p;
            if (saVar2 != null) {
                this.f1628l = org.telegram.messenger.f0.C(4.0f, saVar2.b(), this.f1628l);
            }
            this.f1629m = this.f1628l;
            if (this == vaVarArr[0]) {
                waVar.v = null;
            }
            this.f1624g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = wa.a(waVar, textPaint2, this.f1630n, i10);
        this.e = a2;
        this.f1628l = a2.getHeight();
        sa saVar3 = this.f1631o;
        if (saVar3 != null) {
            i11 = AndroidUtilities.dp(8.0f) + saVar3.b();
        } else {
            i11 = 0;
        }
        sa saVar4 = this.f1632p;
        if (saVar4 != null) {
            this.f1628l = org.telegram.messenger.f0.C(8.0f, saVar4.b(), this.f1628l);
        }
        this.f1628l += i11;
        float measureText = textPaint2.measureText(" ");
        if (this.e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        waVar.f1664b = z10;
        if (z10) {
            if (this.e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.f1630n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    waVar.f1664b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
        }
        if (waVar.f1664b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == vaVarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                waVar.v = wa.a(waVar, textPaint, string, i10);
                waVar.h = ((waVar.F + i11) + topPadding) - AndroidUtilities.dpf2(0.3f);
                waVar.f1667n = (waVar.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            sa saVar5 = this.f1631o;
            if (saVar5 != null) {
                i12 = AndroidUtilities.dp(8.0f) + saVar5.b();
            } else {
                i12 = 0;
            }
            int i14 = topPadding2 + i12;
            sa saVar6 = this.f1632p;
            if (saVar6 != null) {
                i13 = AndroidUtilities.dp(8.0f) + saVar6.b();
            } else {
                i13 = 0;
            }
            this.f1629m = i14 + i13;
            this.f1624g = wa.a(waVar, textPaint2, this.f1630n.subSequence(0, this.e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            vh.g.c(xaVar, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i15 = 0;
                while (true) {
                    ta[] taVarArr = this.h;
                    if (i15 >= taVarArr.length) {
                        break;
                    }
                    ta taVar = taVarArr[i15];
                    if (taVar != null) {
                        org.telegram.ui.Components.z5.release(xaVar, taVar.f1560a);
                    }
                    i15++;
                }
            }
            this.h = new ta[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i16 = 3; i16 < this.e.getLineCount(); i16++) {
                    int lineStart = this.e.getLineStart(i16);
                    int lineEnd = this.e.getLineEnd(i16);
                    CharSequence subSequence = this.f1630n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i16 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = wa.a(waVar, textPaint2, subSequence, i10);
                        ?? obj = new Object();
                        this.h[i16 - 3] = obj;
                        obj.f1561b = a10;
                        obj.e = this.e.getLineLeft(i16);
                        obj.f1563f = this.e.getTopPadding() + this.e.getLineTop(i16);
                        if (lineRight < waVar.f1667n - AndroidUtilities.dp(16.0f)) {
                            obj.d = topPadding;
                            obj.f1562c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f1563f;
                            obj.f1562c = obj.e;
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
            this.f1624g = staticLayout2;
            this.f1629m = this.f1628l;
            stack.addAll(arrayList);
            arrayList.clear();
            vh.g.c(waVar, this.e, stack, arrayList);
        }
        int i17 = waVar.E;
        int i18 = waVar.F;
        vh.l lVar = this.f1627k;
        lVar.f44728c = i17;
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
            this.f1636t.addRect(f7 + f13, f10 + f12, f7 + lineRight, f10 + f11, Path.Direction.CW);
            i10++;
            f12 = f11;
        }
    }

    public final void g(CharSequence charSequence, sa saVar, sa saVar2) {
        this.f1630n = charSequence;
        this.f1631o = saVar;
        this.f1632p = saVar2;
        wa waVar = this.v;
        if (saVar != null) {
            ua uaVar = new ua(this, 0);
            saVar.f1526r = waVar;
            saVar.f1527s = uaVar;
            new dm0(waVar);
            saVar.f1518j.setCallback(waVar);
            saVar.h.f23842a = waVar;
            saVar.f1517i.f30585a = waVar;
            saVar.c();
        }
        sa saVar3 = this.f1632p;
        if (saVar3 != null) {
            ua uaVar2 = new ua(this, 1);
            saVar3.f1526r = waVar;
            saVar3.f1527s = uaVar2;
            new dm0(waVar);
            saVar3.f1518j.setCallback(waVar);
            saVar3.h.f23842a = waVar;
            saVar3.f1517i.f30585a = waVar;
            saVar3.c();
        }
        waVar.f1669s = 0;
        waVar.requestLayout();
    }
}
