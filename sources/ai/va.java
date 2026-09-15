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
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.z80;
public final class va {
    public d90 f1614a;
    public org.telegram.ui.Components.x5 f1615b;
    public final z80 f1616c;
    public org.telegram.ui.Components.t5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.t5 f1617f;
    public StaticLayout f1618g;
    public ta[] h;
    public final ArrayList f1619i;
    public final Stack f1620j;
    public final vh.m f1621k;
    public int f1622l;
    public int f1623m;
    public CharSequence f1624n;
    public sa f1625o;
    public sa f1626p;
    public boolean f1627q;
    public final org.telegram.ui.Components.c6 f1628r;
    public final g90 f1629s;
    public final Path f1630t;
    public final AtomicReference f1631u;
    public final wa v;

    public va(wa waVar) {
        this.v = waVar;
        this.f1616c = new z80(waVar);
        ArrayList arrayList = new ArrayList();
        this.f1619i = arrayList;
        this.f1620j = new Stack();
        this.f1624n = "";
        this.f1628r = new org.telegram.ui.Components.c6(waVar.J, 0L, 400L, qr.h);
        Path path = new Path();
        this.f1630t = path;
        this.f1631u = new AtomicReference();
        this.f1621k = new vh.m(waVar, arrayList, new a1.c(this, 9));
        g90 g90Var = new g90();
        this.f1629s = g90Var;
        g90Var.f24280x = path;
        g90Var.j(4.0f);
        g90Var.f(org.telegram.ui.ActionBar.i6.l1(0.3f, -1), org.telegram.ui.ActionBar.i6.l1(0.1f, -1), org.telegram.ui.ActionBar.i6.l1(0.2f, -1), org.telegram.ui.ActionBar.i6.l1(0.7f, -1));
        g90Var.setCallback(waVar);
    }

    public final int a(int i10) {
        int i11;
        sa saVar = this.f1625o;
        int i12 = 0;
        if (saVar != null) {
            i11 = AndroidUtilities.dp(8.0f) + saVar.b();
        } else {
            i11 = 0;
        }
        sa saVar2 = this.f1626p;
        if (saVar2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + saVar2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        wa waVar = this.v;
        if (staticLayout == null) {
            return i10 - ((waVar.F * 2) + this.f1622l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!waVar.f1664b) {
            return i10 - ((waVar.F * 2) + this.f1622l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * waVar.f1665c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        wa waVar = this.v;
        xa xaVar = waVar.J;
        float e = this.f1628r.e(this.f1627q);
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
            if (e <= 0.0f && !this.f1627q) {
                return;
            }
            g90 g90Var = this.f1629s;
            g90Var.setAlpha((int) (e * 255.0f * lerp));
            g90Var.draw(canvas2);
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
        if (this.f1625o != null) {
            canvas.save();
            canvas.translate(waVar.E, waVar.F);
            sa saVar = this.f1625o;
            int width = waVar.getWidth();
            int i12 = waVar.E;
            saVar.a(canvas, (width - i12) - i12);
            int b10 = this.f1625o.b();
            canvas.restore();
            i10 = AndroidUtilities.dp(8.0f) + b10;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(waVar.E, waVar.F + i10);
        if (this.f1616c.f(canvas)) {
            waVar.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1630t.rewind();
        ArrayList arrayList3 = this.f1619i;
        if (arrayList3.isEmpty() && this.f1618g != null) {
            if (xaVar.W.y()) {
                canvas.save();
                canvas.translate(waVar.E, waVar.F + i10);
                xaVar.W.X(canvas);
                canvas.restore();
            }
            if (this.f1618g != null) {
                canvas.save();
                canvas.translate(waVar.E, waVar.F + i10);
                d(this.f1618g, canvas, arrayList3);
                org.telegram.ui.Components.t5 update = org.telegram.ui.Components.x5.update(0, waVar, this.f1617f, this.f1618g);
                this.f1617f = update;
                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, this.f1618g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f1618g, waVar.E, waVar.F + i10);
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
                        float f11 = taVar.f1554c;
                        float f12 = taVar.e;
                        if (f11 == f12) {
                            if (waVar.f1670w != f10) {
                                canvas.translate(waVar.E + f12, waVar.F + i10 + taVar.f1555f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, taVar.f1553b.getWidth(), taVar.f1553b.getHeight(), (int) (waVar.f1670w * 255.0f), 31);
                                d(taVar.f1553b, canvas, arrayList);
                                if (z10) {
                                    f(taVar.f1553b, waVar.E + taVar.e, waVar.F + i10 + taVar.f1555f);
                                }
                                taVar.f1553b.draw(canvas);
                                org.telegram.ui.Components.t5 update2 = org.telegram.ui.Components.x5.update(0, waVar, taVar.f1552a, taVar.f1553b);
                                taVar.f1552a = update2;
                                arrayList2 = arrayList;
                                i11 = i13;
                                org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, taVar.f1553b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, waVar.f1670w, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, waVar.f1670w);
                            float lerp2 = AndroidUtilities.lerp(taVar.d, taVar.f1555f, qr.f27424g.getInterpolation(waVar.f1670w));
                            canvas.translate(waVar.E + lerp, waVar.F + i10 + lerp2);
                            if (z10) {
                                f(taVar.f1553b, waVar.E + lerp, waVar.F + i10 + lerp2);
                            }
                            taVar.f1553b.draw(canvas);
                            org.telegram.ui.Components.t5 update3 = org.telegram.ui.Components.x5.update(0, waVar, taVar.f1552a, taVar.f1553b);
                            taVar.f1552a = update3;
                            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, taVar.f1553b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
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
            org.telegram.ui.Components.t5 update4 = org.telegram.ui.Components.x5.update(0, waVar, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, waVar.E, waVar.F + i10);
            }
        }
        if (this.f1626p != null) {
            canvas.save();
            canvas.translate(waVar.E, (AndroidUtilities.lerp(this.f1623m, this.f1622l, waVar.f1670w) + waVar.F) - this.f1626p.b());
            sa saVar2 = this.f1626p;
            int width2 = waVar.getWidth();
            int i14 = waVar.E;
            saVar2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            vh.h.g(this.v, false, -1, 0, this.f1631u, 0, staticLayout, arrayList, canvas, false);
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
        boolean isEmpty = TextUtils.isEmpty(this.f1624n);
        Stack stack = this.f1620j;
        ArrayList arrayList = this.f1619i;
        if (isEmpty) {
            this.e = null;
            this.f1622l = 0;
            sa saVar = this.f1625o;
            if (saVar != null) {
                this.f1622l = AndroidUtilities.dp(4.0f) + saVar.b();
            }
            sa saVar2 = this.f1626p;
            if (saVar2 != null) {
                this.f1622l = org.telegram.messenger.w1.C(4.0f, saVar2.b(), this.f1622l);
            }
            this.f1623m = this.f1622l;
            if (this == vaVarArr[0]) {
                waVar.v = null;
            }
            this.f1618g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = wa.a(waVar, textPaint2, this.f1624n, i10);
        this.e = a2;
        this.f1622l = a2.getHeight();
        sa saVar3 = this.f1625o;
        if (saVar3 != null) {
            i11 = AndroidUtilities.dp(8.0f) + saVar3.b();
        } else {
            i11 = 0;
        }
        sa saVar4 = this.f1626p;
        if (saVar4 != null) {
            this.f1622l = org.telegram.messenger.w1.C(8.0f, saVar4.b(), this.f1622l);
        }
        this.f1622l += i11;
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
                if (TextUtils.getTrimmedLength(this.f1624n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
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
            sa saVar5 = this.f1625o;
            if (saVar5 != null) {
                i12 = AndroidUtilities.dp(8.0f) + saVar5.b();
            } else {
                i12 = 0;
            }
            int i14 = topPadding2 + i12;
            sa saVar6 = this.f1626p;
            if (saVar6 != null) {
                i13 = AndroidUtilities.dp(8.0f) + saVar6.b();
            } else {
                i13 = 0;
            }
            this.f1623m = i14 + i13;
            this.f1618g = wa.a(waVar, textPaint2, this.f1624n.subSequence(0, this.e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            vh.h.c(xaVar, this.e, stack, arrayList);
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
                        org.telegram.ui.Components.x5.release(xaVar, taVar.f1552a);
                    }
                    i15++;
                }
            }
            this.h = new ta[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i16 = 3; i16 < this.e.getLineCount(); i16++) {
                    int lineStart = this.e.getLineStart(i16);
                    int lineEnd = this.e.getLineEnd(i16);
                    CharSequence subSequence = this.f1624n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i16 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = wa.a(waVar, textPaint2, subSequence, i10);
                        ?? obj = new Object();
                        this.h[i16 - 3] = obj;
                        obj.f1553b = a10;
                        obj.e = this.e.getLineLeft(i16);
                        obj.f1555f = this.e.getTopPadding() + this.e.getLineTop(i16);
                        if (lineRight < waVar.f1667n - AndroidUtilities.dp(16.0f)) {
                            obj.d = topPadding;
                            obj.f1554c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f1555f;
                            obj.f1554c = obj.e;
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
            this.f1618g = staticLayout2;
            this.f1623m = this.f1622l;
            stack.addAll(arrayList);
            arrayList.clear();
            vh.h.c(waVar, this.e, stack, arrayList);
        }
        int i17 = waVar.E;
        int i18 = waVar.F;
        vh.m mVar = this.f1621k;
        mVar.f44448c = i17;
        mVar.d = i18;
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
            this.f1630t.addRect(f7 + f13, f10 + f12, f7 + lineRight, f10 + f11, Path.Direction.CW);
            i10++;
            f12 = f11;
        }
    }

    public final void g(CharSequence charSequence, sa saVar, sa saVar2) {
        this.f1624n = charSequence;
        this.f1625o = saVar;
        this.f1626p = saVar2;
        wa waVar = this.v;
        if (saVar != null) {
            ua uaVar = new ua(this, 0);
            saVar.f1522r = waVar;
            saVar.f1523s = uaVar;
            new sl0(waVar);
            saVar.f1514j.setCallback(waVar);
            saVar.h.f22951a = waVar;
            saVar.f1513i.f29688a = waVar;
            saVar.c();
        }
        sa saVar3 = this.f1626p;
        if (saVar3 != null) {
            ua uaVar2 = new ua(this, 1);
            saVar3.f1522r = waVar;
            saVar3.f1523s = uaVar2;
            new sl0(waVar);
            saVar3.f1514j.setCallback(waVar);
            saVar3.h.f22951a = waVar;
            saVar3.f1513i.f29688a = waVar;
            saVar3.c();
        }
        waVar.f1669s = 0;
        waVar.requestLayout();
    }
}
