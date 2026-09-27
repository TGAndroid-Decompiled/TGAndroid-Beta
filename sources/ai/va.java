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
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.t90;
public final class va {
    public q90 f1622a;
    public org.telegram.ui.Components.z5 f1623b;
    public final m90 f1624c;
    public org.telegram.ui.Components.v5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.v5 f1625f;
    public StaticLayout f1626g;
    public ta[] h;
    public final ArrayList f1627i;
    public final Stack f1628j;
    public final vh.l f1629k;
    public int f1630l;
    public int f1631m;
    public CharSequence f1632n;
    public sa f1633o;
    public sa f1634p;
    public boolean f1635q;
    public final org.telegram.ui.Components.e6 f1636r;
    public final t90 f1637s;
    public final Path f1638t;
    public final AtomicReference f1639u;
    public final wa v;

    public va(wa waVar) {
        this.v = waVar;
        this.f1624c = new m90(waVar);
        ArrayList arrayList = new ArrayList();
        this.f1627i = arrayList;
        this.f1628j = new Stack();
        this.f1632n = "";
        this.f1636r = new org.telegram.ui.Components.e6(waVar.J, 0L, 400L, sr.h);
        Path path = new Path();
        this.f1638t = path;
        this.f1639u = new AtomicReference();
        this.f1629k = new vh.l(waVar, arrayList, new a1.c(this, 9));
        t90 t90Var = new t90();
        this.f1637s = t90Var;
        t90Var.f28537x = path;
        t90Var.j(4.0f);
        t90Var.f(org.telegram.ui.ActionBar.i6.l1(0.3f, -1), org.telegram.ui.ActionBar.i6.l1(0.1f, -1), org.telegram.ui.ActionBar.i6.l1(0.2f, -1), org.telegram.ui.ActionBar.i6.l1(0.7f, -1));
        t90Var.setCallback(waVar);
    }

    public final int a(int i10) {
        int i11;
        sa saVar = this.f1633o;
        int i12 = 0;
        if (saVar != null) {
            i11 = AndroidUtilities.dp(8.0f) + saVar.b();
        } else {
            i11 = 0;
        }
        sa saVar2 = this.f1634p;
        if (saVar2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + saVar2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        wa waVar = this.v;
        if (staticLayout == null) {
            return i10 - ((waVar.F * 2) + this.f1630l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!waVar.f1666b) {
            return i10 - ((waVar.F * 2) + this.f1630l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * waVar.f1667c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        wa waVar = this.v;
        xa xaVar = waVar.J;
        float e = this.f1636r.e(this.f1635q);
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
            if (e <= 0.0f && !this.f1635q) {
                return;
            }
            t90 t90Var = this.f1637s;
            t90Var.setAlpha((int) (e * 255.0f * lerp));
            t90Var.draw(canvas2);
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
        PorterDuffColorFilter porterDuffColorFilter = waVar.f1665a;
        xa xaVar = waVar.J;
        if (this.f1633o != null) {
            canvas.save();
            canvas.translate(waVar.E, waVar.F);
            sa saVar = this.f1633o;
            int width = waVar.getWidth();
            int i12 = waVar.E;
            saVar.a(canvas, (width - i12) - i12);
            int b10 = this.f1633o.b();
            canvas.restore();
            i10 = AndroidUtilities.dp(8.0f) + b10;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(waVar.E, waVar.F + i10);
        if (this.f1624c.f(canvas)) {
            waVar.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1638t.rewind();
        ArrayList arrayList3 = this.f1627i;
        if (arrayList3.isEmpty() && this.f1626g != null) {
            if (xaVar.W.y()) {
                canvas.save();
                canvas.translate(waVar.E, waVar.F + i10);
                xaVar.W.X(canvas);
                canvas.restore();
            }
            if (this.f1626g != null) {
                canvas.save();
                canvas.translate(waVar.E, waVar.F + i10);
                d(this.f1626g, canvas, arrayList3);
                org.telegram.ui.Components.v5 update = org.telegram.ui.Components.z5.update(0, waVar, this.f1625f, this.f1626g);
                this.f1625f = update;
                org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, this.f1626g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f1626g, waVar.E, waVar.F + i10);
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
                        float f11 = taVar.f1564c;
                        float f12 = taVar.e;
                        if (f11 == f12) {
                            if (waVar.f1672w != f10) {
                                canvas.translate(waVar.E + f12, waVar.F + i10 + taVar.f1565f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, taVar.f1563b.getWidth(), taVar.f1563b.getHeight(), (int) (waVar.f1672w * 255.0f), 31);
                                d(taVar.f1563b, canvas, arrayList);
                                if (z10) {
                                    f(taVar.f1563b, waVar.E + taVar.e, waVar.F + i10 + taVar.f1565f);
                                }
                                taVar.f1563b.draw(canvas);
                                org.telegram.ui.Components.v5 update2 = org.telegram.ui.Components.z5.update(0, waVar, taVar.f1562a, taVar.f1563b);
                                taVar.f1562a = update2;
                                arrayList2 = arrayList;
                                i11 = i13;
                                org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, taVar.f1563b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, waVar.f1672w, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, waVar.f1672w);
                            float lerp2 = AndroidUtilities.lerp(taVar.d, taVar.f1565f, sr.f28360g.getInterpolation(waVar.f1672w));
                            canvas.translate(waVar.E + lerp, waVar.F + i10 + lerp2);
                            if (z10) {
                                f(taVar.f1563b, waVar.E + lerp, waVar.F + i10 + lerp2);
                            }
                            taVar.f1563b.draw(canvas);
                            org.telegram.ui.Components.v5 update3 = org.telegram.ui.Components.z5.update(0, waVar, taVar.f1562a, taVar.f1563b);
                            taVar.f1562a = update3;
                            org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, taVar.f1563b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
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
        if (this.f1634p != null) {
            canvas.save();
            canvas.translate(waVar.E, (AndroidUtilities.lerp(this.f1631m, this.f1630l, waVar.f1672w) + waVar.F) - this.f1634p.b());
            sa saVar2 = this.f1634p;
            int width2 = waVar.getWidth();
            int i14 = waVar.E;
            saVar2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            vh.g.g(this.v, false, -1, 0, this.f1639u, 0, staticLayout, arrayList, canvas, false);
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
        va[] vaVarArr = waVar.f1670r;
        TextPaint textPaint2 = waVar.f1667c;
        boolean isEmpty = TextUtils.isEmpty(this.f1632n);
        Stack stack = this.f1628j;
        ArrayList arrayList = this.f1627i;
        if (isEmpty) {
            this.e = null;
            this.f1630l = 0;
            sa saVar = this.f1633o;
            if (saVar != null) {
                this.f1630l = AndroidUtilities.dp(4.0f) + saVar.b();
            }
            sa saVar2 = this.f1634p;
            if (saVar2 != null) {
                this.f1630l = org.telegram.messenger.l0.C(4.0f, saVar2.b(), this.f1630l);
            }
            this.f1631m = this.f1630l;
            if (this == vaVarArr[0]) {
                waVar.v = null;
            }
            this.f1626g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = wa.a(waVar, textPaint2, this.f1632n, i10);
        this.e = a2;
        this.f1630l = a2.getHeight();
        sa saVar3 = this.f1633o;
        if (saVar3 != null) {
            i11 = AndroidUtilities.dp(8.0f) + saVar3.b();
        } else {
            i11 = 0;
        }
        sa saVar4 = this.f1634p;
        if (saVar4 != null) {
            this.f1630l = org.telegram.messenger.l0.C(8.0f, saVar4.b(), this.f1630l);
        }
        this.f1630l += i11;
        float measureText = textPaint2.measureText(" ");
        if (this.e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        waVar.f1666b = z10;
        if (z10) {
            if (this.e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.f1632n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    waVar.f1666b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
        }
        if (waVar.f1666b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == vaVarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                waVar.v = wa.a(waVar, textPaint, string, i10);
                waVar.h = ((waVar.F + i11) + topPadding) - AndroidUtilities.dpf2(0.3f);
                waVar.f1669n = (waVar.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            sa saVar5 = this.f1633o;
            if (saVar5 != null) {
                i12 = AndroidUtilities.dp(8.0f) + saVar5.b();
            } else {
                i12 = 0;
            }
            int i14 = topPadding2 + i12;
            sa saVar6 = this.f1634p;
            if (saVar6 != null) {
                i13 = AndroidUtilities.dp(8.0f) + saVar6.b();
            } else {
                i13 = 0;
            }
            this.f1631m = i14 + i13;
            this.f1626g = wa.a(waVar, textPaint2, this.f1632n.subSequence(0, this.e.getLineEnd(2)), i10);
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
                        org.telegram.ui.Components.z5.release(xaVar, taVar.f1562a);
                    }
                    i15++;
                }
            }
            this.h = new ta[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i16 = 3; i16 < this.e.getLineCount(); i16++) {
                    int lineStart = this.e.getLineStart(i16);
                    int lineEnd = this.e.getLineEnd(i16);
                    CharSequence subSequence = this.f1632n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i16 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = wa.a(waVar, textPaint2, subSequence, i10);
                        ?? obj = new Object();
                        this.h[i16 - 3] = obj;
                        obj.f1563b = a10;
                        obj.e = this.e.getLineLeft(i16);
                        obj.f1565f = this.e.getTopPadding() + this.e.getLineTop(i16);
                        if (lineRight < waVar.f1669n - AndroidUtilities.dp(16.0f)) {
                            obj.d = topPadding;
                            obj.f1564c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f1565f;
                            obj.f1564c = obj.e;
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
            this.f1626g = staticLayout2;
            this.f1631m = this.f1630l;
            stack.addAll(arrayList);
            arrayList.clear();
            vh.g.c(waVar, this.e, stack, arrayList);
        }
        int i17 = waVar.E;
        int i18 = waVar.F;
        vh.l lVar = this.f1629k;
        lVar.f44774c = i17;
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
            this.f1638t.addRect(f7 + f13, f10 + f12, f7 + lineRight, f10 + f11, Path.Direction.CW);
            i10++;
            f12 = f11;
        }
    }

    public final void g(CharSequence charSequence, sa saVar, sa saVar2) {
        this.f1632n = charSequence;
        this.f1633o = saVar;
        this.f1634p = saVar2;
        wa waVar = this.v;
        if (saVar != null) {
            ua uaVar = new ua(this, 0);
            saVar.f1528r = waVar;
            saVar.f1529s = uaVar;
            new fm0(waVar);
            saVar.f1520j.setCallback(waVar);
            saVar.h.f23888a = waVar;
            saVar.f1519i.f30645a = waVar;
            saVar.c();
        }
        sa saVar3 = this.f1634p;
        if (saVar3 != null) {
            ua uaVar2 = new ua(this, 1);
            saVar3.f1528r = waVar;
            saVar3.f1529s = uaVar2;
            new fm0(waVar);
            saVar3.f1520j.setCallback(waVar);
            saVar3.h.f23888a = waVar;
            saVar3.f1519i.f30645a = waVar;
            saVar3.c();
        }
        waVar.f1671s = 0;
        waVar.requestLayout();
    }
}
