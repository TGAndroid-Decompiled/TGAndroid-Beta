package bi;

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
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sl0;
public final class ca {
    public e90 f2851a;
    public org.telegram.ui.Components.z5 f2852b;
    public final a90 f2853c;
    public org.telegram.ui.Components.v5 d;
    public StaticLayout f2854e;
    public org.telegram.ui.Components.v5 f2855f;
    public StaticLayout f2856g;
    public aa[] h;
    public final ArrayList f2857i;
    public final Stack f2858j;
    public final wh.m f2859k;
    public int f2860l;
    public int f2861m;
    public CharSequence f2862n;
    public z9 f2863o;
    public z9 f2864p;
    public boolean f2865q;
    public final org.telegram.ui.Components.e6 f2866r;
    public final h90 f2867s;
    public final Path f2868t;
    public final AtomicReference f2869u;
    public final da v;

    public ca(da daVar) {
        this.v = daVar;
        this.f2853c = new a90(daVar);
        ArrayList arrayList = new ArrayList();
        this.f2857i = arrayList;
        this.f2858j = new Stack();
        this.f2862n = "";
        this.f2866r = new org.telegram.ui.Components.e6(daVar.J, 0L, 400L, pr.h);
        Path path = new Path();
        this.f2868t = path;
        this.f2869u = new AtomicReference();
        this.f2859k = new wh.m(daVar, arrayList, new a1.c(this, 9));
        h90 h90Var = new h90();
        this.f2867s = h90Var;
        h90Var.f26718x = path;
        h90Var.j(4.0f);
        h90Var.f(org.telegram.ui.ActionBar.j6.l1(0.3f, -1), org.telegram.ui.ActionBar.j6.l1(0.1f, -1), org.telegram.ui.ActionBar.j6.l1(0.2f, -1), org.telegram.ui.ActionBar.j6.l1(0.7f, -1));
        h90Var.setCallback(daVar);
    }

    public final int a(int i10) {
        int i11;
        z9 z9Var = this.f2863o;
        int i12 = 0;
        if (z9Var != null) {
            i11 = AndroidUtilities.dp(8.0f) + z9Var.b();
        } else {
            i11 = 0;
        }
        z9 z9Var2 = this.f2864p;
        if (z9Var2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + z9Var2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.f2854e;
        da daVar = this.v;
        if (staticLayout == null) {
            return i10 - ((daVar.F * 2) + this.f2860l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!daVar.f2904b) {
            return i10 - ((daVar.F * 2) + this.f2860l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * daVar.f2905c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        da daVar = this.v;
        ea eaVar = daVar.J;
        float e7 = this.f2866r.e(this.f2865q);
        if (f7 > 0.0f) {
            float lerp = AndroidUtilities.lerp(f7, 0.7f * f7, e7);
            if (lerp >= 1.0f) {
                c(canvas, e7);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, eaVar.getWidth(), eaVar.getHeight(), (int) (lerp * 255.0f), 31);
                c(canvas2, e7);
                canvas2.restore();
            }
            if (e7 <= 0.0f && !this.f2865q) {
                return;
            }
            h90 h90Var = this.f2867s;
            h90Var.setAlpha((int) (e7 * 255.0f * lerp));
            h90Var.draw(canvas2);
            daVar.invalidate();
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        da daVar = this.v;
        PorterDuffColorFilter porterDuffColorFilter = daVar.f2903a;
        ea eaVar = daVar.J;
        if (this.f2863o != null) {
            canvas.save();
            canvas.translate(daVar.E, daVar.F);
            z9 z9Var = this.f2863o;
            int width = daVar.getWidth();
            int i12 = daVar.E;
            z9Var.a(canvas, (width - i12) - i12);
            int b10 = this.f2863o.b();
            canvas.restore();
            i10 = AndroidUtilities.dp(8.0f) + b10;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(daVar.E, daVar.F + i10);
        if (this.f2853c.f(canvas)) {
            daVar.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2868t.rewind();
        ArrayList arrayList3 = this.f2857i;
        if (arrayList3.isEmpty() && this.f2856g != null) {
            if (eaVar.W.y()) {
                canvas.save();
                canvas.translate(daVar.E, daVar.F + i10);
                eaVar.W.X(canvas);
                canvas.restore();
            }
            if (this.f2856g != null) {
                canvas.save();
                canvas.translate(daVar.E, daVar.F + i10);
                d(this.f2856g, canvas, arrayList3);
                org.telegram.ui.Components.v5 update = org.telegram.ui.Components.z5.update(0, daVar, this.f2855f, this.f2856g);
                this.f2855f = update;
                org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, this.f2856g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.f2856g, daVar.E, daVar.F + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    aa[] aaVarArr = this.h;
                    if (i13 >= aaVarArr.length) {
                        break;
                    }
                    aa aaVar = aaVarArr[i13];
                    if (aaVar != null) {
                        canvas.save();
                        float f11 = aaVar.f2802c;
                        float f12 = aaVar.f2803e;
                        if (f11 == f12) {
                            if (daVar.f2911w != f10) {
                                canvas.translate(daVar.E + f12, daVar.F + i10 + aaVar.f2804f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, aaVar.f2801b.getWidth(), aaVar.f2801b.getHeight(), (int) (daVar.f2911w * 255.0f), 31);
                                d(aaVar.f2801b, canvas, arrayList);
                                if (z10) {
                                    f(aaVar.f2801b, daVar.E + aaVar.f2803e, daVar.F + i10 + aaVar.f2804f);
                                }
                                aaVar.f2801b.draw(canvas);
                                org.telegram.ui.Components.v5 update2 = org.telegram.ui.Components.z5.update(0, daVar, aaVar.f2800a, aaVar.f2801b);
                                aaVar.f2800a = update2;
                                arrayList2 = arrayList;
                                i11 = i13;
                                org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, aaVar.f2801b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, daVar.f2911w, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, daVar.f2911w);
                            float lerp2 = AndroidUtilities.lerp(aaVar.d, aaVar.f2804f, pr.f29494g.getInterpolation(daVar.f2911w));
                            canvas.translate(daVar.E + lerp, daVar.F + i10 + lerp2);
                            if (z10) {
                                f(aaVar.f2801b, daVar.E + lerp, daVar.F + i10 + lerp2);
                            }
                            aaVar.f2801b.draw(canvas);
                            org.telegram.ui.Components.v5 update3 = org.telegram.ui.Components.z5.update(0, daVar, aaVar.f2800a, aaVar.f2801b);
                            aaVar.f2800a = update3;
                            org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, aaVar.f2801b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
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
        } else if (this.f2854e != null) {
            canvas.save();
            canvas.translate(daVar.E, daVar.F + i10);
            if (eaVar.W.y()) {
                eaVar.W.X(canvas);
            }
            d(this.f2854e, canvas, arrayList3);
            org.telegram.ui.Components.v5 update4 = org.telegram.ui.Components.z5.update(0, daVar, this.d, this.f2854e);
            this.d = update4;
            org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, this.f2854e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.f2854e, daVar.E, daVar.F + i10);
            }
        }
        if (this.f2864p != null) {
            canvas.save();
            canvas.translate(daVar.E, (AndroidUtilities.lerp(this.f2861m, this.f2860l, daVar.f2911w) + daVar.F) - this.f2864p.b());
            z9 z9Var2 = this.f2864p;
            int width2 = daVar.getWidth();
            int i14 = daVar.E;
            z9Var2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            wh.h.g(this.v, false, -1, 0, this.f2869u, 0, staticLayout, arrayList, canvas, false);
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
        da daVar = this.v;
        ea eaVar = daVar.J;
        TextPaint textPaint = daVar.d;
        ca[] caVarArr = daVar.f2909r;
        TextPaint textPaint2 = daVar.f2905c;
        boolean isEmpty = TextUtils.isEmpty(this.f2862n);
        Stack stack = this.f2858j;
        ArrayList arrayList = this.f2857i;
        if (isEmpty) {
            this.f2854e = null;
            this.f2860l = 0;
            z9 z9Var = this.f2863o;
            if (z9Var != null) {
                this.f2860l = AndroidUtilities.dp(4.0f) + z9Var.b();
            }
            z9 z9Var2 = this.f2864p;
            if (z9Var2 != null) {
                this.f2860l = org.telegram.messenger.w1.C(4.0f, z9Var2.b(), this.f2860l);
            }
            this.f2861m = this.f2860l;
            if (this == caVarArr[0]) {
                daVar.v = null;
            }
            this.f2856g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = da.a(daVar, textPaint2, this.f2862n, i10);
        this.f2854e = a2;
        this.f2860l = a2.getHeight();
        z9 z9Var3 = this.f2863o;
        if (z9Var3 != null) {
            i11 = AndroidUtilities.dp(8.0f) + z9Var3.b();
        } else {
            i11 = 0;
        }
        z9 z9Var4 = this.f2864p;
        if (z9Var4 != null) {
            this.f2860l = org.telegram.messenger.w1.C(8.0f, z9Var4.b(), this.f2860l);
        }
        this.f2860l += i11;
        float measureText = textPaint2.measureText(" ");
        if (this.f2854e.getLineCount() > 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        daVar.f2904b = z10;
        if (z10) {
            if (this.f2854e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.f2862n.subSequence(this.f2854e.getLineStart(2), this.f2854e.getLineEnd(2))) == 0) {
                    daVar.f2904b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
        }
        if (daVar.f2904b) {
            float topPadding = this.f2854e.getTopPadding() + this.f2854e.getLineTop(2);
            if (this == caVarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                daVar.v = da.a(daVar, textPaint, string, i10);
                daVar.h = ((daVar.F + i11) + topPadding) - AndroidUtilities.dpf2(0.3f);
                daVar.f2908n = (daVar.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.f2854e.getTopPadding() + this.f2854e.getLineBottom(2);
            z9 z9Var5 = this.f2863o;
            if (z9Var5 != null) {
                i12 = AndroidUtilities.dp(8.0f) + z9Var5.b();
            } else {
                i12 = 0;
            }
            int i14 = topPadding2 + i12;
            z9 z9Var6 = this.f2864p;
            if (z9Var6 != null) {
                i13 = AndroidUtilities.dp(8.0f) + z9Var6.b();
            } else {
                i13 = 0;
            }
            this.f2861m = i14 + i13;
            this.f2856g = da.a(daVar, textPaint2, this.f2862n.subSequence(0, this.f2854e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            wh.h.c(eaVar, this.f2854e, stack, arrayList);
            float lineRight = this.f2854e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i15 = 0;
                while (true) {
                    aa[] aaVarArr = this.h;
                    if (i15 >= aaVarArr.length) {
                        break;
                    }
                    aa aaVar = aaVarArr[i15];
                    if (aaVar != null) {
                        org.telegram.ui.Components.z5.release(eaVar, aaVar.f2800a);
                    }
                    i15++;
                }
            }
            this.h = new aa[this.f2854e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i16 = 3; i16 < this.f2854e.getLineCount(); i16++) {
                    int lineStart = this.f2854e.getLineStart(i16);
                    int lineEnd = this.f2854e.getLineEnd(i16);
                    CharSequence subSequence = this.f2862n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i16 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = da.a(daVar, textPaint2, subSequence, i10);
                        ?? obj = new Object();
                        this.h[i16 - 3] = obj;
                        obj.f2801b = a10;
                        obj.f2803e = this.f2854e.getLineLeft(i16);
                        obj.f2804f = this.f2854e.getTopPadding() + this.f2854e.getLineTop(i16);
                        if (lineRight < daVar.f2908n - AndroidUtilities.dp(16.0f)) {
                            obj.d = topPadding;
                            obj.f2802c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f2804f;
                            obj.f2802c = obj.f2803e;
                        }
                    }
                }
            }
        } else {
            if (this == caVarArr[0]) {
                staticLayout2 = staticLayout;
                daVar.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.f2856g = staticLayout2;
            this.f2861m = this.f2860l;
            stack.addAll(arrayList);
            arrayList.clear();
            wh.h.c(daVar, this.f2854e, stack, arrayList);
        }
        int i17 = daVar.E;
        int i18 = daVar.F;
        wh.m mVar = this.f2859k;
        mVar.f48688c = i17;
        mVar.d = i18;
    }

    public final void f(Layout layout, float f7, float f10) {
        float f11;
        float f12 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            da daVar = this.v;
            float f13 = lineLeft - (daVar.E / 3.0f);
            float lineRight = (daVar.E / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f12 = layout.getLineTop(i10) - (daVar.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            if (i10 >= layout.getLineCount() - 1) {
                f11 = (daVar.F / 3.0f) + lineBottom;
            } else {
                f11 = lineBottom;
            }
            this.f2868t.addRect(f7 + f13, f10 + f12, f7 + lineRight, f10 + f11, Path.Direction.CW);
            i10++;
            f12 = f11;
        }
    }

    public final void g(CharSequence charSequence, z9 z9Var, z9 z9Var2) {
        this.f2862n = charSequence;
        this.f2863o = z9Var;
        this.f2864p = z9Var2;
        da daVar = this.v;
        if (z9Var != null) {
            ba baVar = new ba(this, 0);
            z9Var.f4116r = daVar;
            z9Var.f4117s = baVar;
            new sl0(daVar);
            z9Var.f4108j.setCallback(daVar);
            z9Var.h.f25590a = daVar;
            z9Var.f4107i.f33145a = daVar;
            z9Var.c();
        }
        z9 z9Var3 = this.f2864p;
        if (z9Var3 != null) {
            ba baVar2 = new ba(this, 1);
            z9Var3.f4116r = daVar;
            z9Var3.f4117s = baVar2;
            new sl0(daVar);
            z9Var3.f4108j.setCallback(daVar);
            z9Var3.h.f25590a = daVar;
            z9Var3.f4107i.f33145a = daVar;
            z9Var3.c();
        }
        daVar.f2910s = 0;
        daVar.requestLayout();
    }
}
