package oh;

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
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.pr;
public final class y7 {
    public h90 f17966a;
    public org.telegram.ui.Components.u5 f17967b;
    public final d90 f17968c;
    public org.telegram.ui.Components.q5 d;
    public StaticLayout f17969e;
    public org.telegram.ui.Components.q5 f17970f;
    public StaticLayout f17971g;
    public w7[] h;
    public final ArrayList f17972i;
    public final Stack f17973j;
    public final jh.p f17974k;
    public int f17975l;
    public int f17976m;
    public CharSequence f17977n;
    public v7 f17978o;
    public v7 f17979p;
    public boolean f17980q;
    public final org.telegram.ui.Components.z5 f17981r;
    public final k90 f17982s;
    public final Path f17983t;
    public final AtomicReference f17984u;
    public final z7 v;

    public y7(z7 z7Var) {
        this.v = z7Var;
        this.f17968c = new d90(z7Var);
        ArrayList arrayList = new ArrayList();
        this.f17972i = arrayList;
        this.f17973j = new Stack();
        this.f17977n = "";
        this.f17981r = new org.telegram.ui.Components.z5(z7Var.G, 0L, 400L, pr.h);
        Path path = new Path();
        this.f17983t = path;
        this.f17984u = new AtomicReference();
        this.f17974k = new jh.p(z7Var, arrayList, new mh.m5(this, 13));
        k90 k90Var = new k90();
        this.f17982s = k90Var;
        k90Var.f28370x = path;
        k90Var.j(4.0f);
        k90Var.f(org.telegram.ui.ActionBar.k6.l1(0.3f, -1), org.telegram.ui.ActionBar.k6.l1(0.1f, -1), org.telegram.ui.ActionBar.k6.l1(0.2f, -1), org.telegram.ui.ActionBar.k6.l1(0.7f, -1));
        k90Var.setCallback(z7Var);
    }

    public final int a(int i10) {
        int i11;
        v7 v7Var = this.f17978o;
        int i12 = 0;
        if (v7Var != null) {
            i11 = AndroidUtilities.dp(8.0f) + v7Var.b();
        } else {
            i11 = 0;
        }
        v7 v7Var2 = this.f17979p;
        if (v7Var2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + v7Var2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.f17969e;
        z7 z7Var = this.v;
        if (staticLayout == null) {
            return i10 - ((z7Var.C * 2) + this.f17975l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!z7Var.f18000b) {
            return i10 - ((z7Var.C * 2) + this.f17975l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * z7Var.f18001c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f10) {
        Canvas canvas2;
        z7 z7Var = this.v;
        a8 a8Var = z7Var.G;
        float e6 = this.f17981r.e(this.f17980q);
        if (f10 > 0.0f) {
            float lerp = AndroidUtilities.lerp(f10, 0.7f * f10, e6);
            if (lerp >= 1.0f) {
                c(canvas, e6);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, a8Var.getWidth(), a8Var.getHeight(), (int) (lerp * 255.0f), 31);
                c(canvas2, e6);
                canvas2.restore();
            }
            if (e6 <= 0.0f && !this.f17980q) {
                return;
            }
            k90 k90Var = this.f17982s;
            k90Var.setAlpha((int) (e6 * 255.0f * lerp));
            k90Var.draw(canvas2);
            z7Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f10) {
        int i10;
        boolean z4;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        z7 z7Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = z7Var.f17999a;
        a8 a8Var = z7Var.G;
        if (this.f17978o != null) {
            canvas.save();
            canvas.translate(z7Var.B, z7Var.C);
            v7 v7Var = this.f17978o;
            int width = z7Var.getWidth();
            int i12 = z7Var.B;
            v7Var.a(canvas, (width - i12) - i12);
            int b10 = this.f17978o.b();
            canvas.restore();
            i10 = AndroidUtilities.dp(8.0f) + b10;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(z7Var.B, z7Var.C + i10);
        if (this.f17968c.f(canvas)) {
            z7Var.invalidate();
        }
        canvas.restore();
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f17983t.rewind();
        ArrayList arrayList3 = this.f17972i;
        if (arrayList3.isEmpty() && this.f17971g != null) {
            if (a8Var.T.y()) {
                canvas.save();
                canvas.translate(z7Var.B, z7Var.C + i10);
                a8Var.T.X(canvas);
                canvas.restore();
            }
            if (this.f17971g != null) {
                canvas.save();
                canvas.translate(z7Var.B, z7Var.C + i10);
                d(this.f17971g, canvas, arrayList3);
                org.telegram.ui.Components.q5 update = org.telegram.ui.Components.u5.update(0, z7Var, this.f17970f, this.f17971g);
                this.f17970f = update;
                org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.f17971g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z4) {
                    f(this.f17971g, z7Var.B, z7Var.C + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    w7[] w7VarArr = this.h;
                    if (i13 >= w7VarArr.length) {
                        break;
                    }
                    w7 w7Var = w7VarArr[i13];
                    if (w7Var != null) {
                        canvas.save();
                        float f12 = w7Var.f17910c;
                        float f13 = w7Var.f17911e;
                        if (f12 == f13) {
                            if (z7Var.f18007w != f11) {
                                canvas.translate(z7Var.B + f13, z7Var.C + i10 + w7Var.f17912f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, w7Var.f17909b.getWidth(), w7Var.f17909b.getHeight(), (int) (z7Var.f18007w * 255.0f), 31);
                                d(w7Var.f17909b, canvas, arrayList);
                                if (z4) {
                                    f(w7Var.f17909b, z7Var.B + w7Var.f17911e, z7Var.C + i10 + w7Var.f17912f);
                                }
                                w7Var.f17909b.draw(canvas);
                                org.telegram.ui.Components.q5 update2 = org.telegram.ui.Components.u5.update(0, z7Var, w7Var.f17908a, w7Var.f17909b);
                                w7Var.f17908a = update2;
                                arrayList2 = arrayList;
                                i11 = i13;
                                org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, w7Var.f17909b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, z7Var.f18007w, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f12, f13, z7Var.f18007w);
                            float lerp2 = AndroidUtilities.lerp(w7Var.d, w7Var.f17912f, pr.f30169g.getInterpolation(z7Var.f18007w));
                            canvas.translate(z7Var.B + lerp, z7Var.C + i10 + lerp2);
                            if (z4) {
                                f(w7Var.f17909b, z7Var.B + lerp, z7Var.C + i10 + lerp2);
                            }
                            w7Var.f17909b.draw(canvas);
                            org.telegram.ui.Components.q5 update3 = org.telegram.ui.Components.u5.update(0, z7Var, w7Var.f17908a, w7Var.f17909b);
                            w7Var.f17908a = update3;
                            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, w7Var.f17909b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        }
                        canvas.restore();
                        i13 = i11 + 1;
                        arrayList = arrayList2;
                        f11 = 0.0f;
                    }
                    arrayList2 = arrayList;
                    i11 = i13;
                    i13 = i11 + 1;
                    arrayList = arrayList2;
                    f11 = 0.0f;
                }
            }
        } else if (this.f17969e != null) {
            canvas.save();
            canvas.translate(z7Var.B, z7Var.C + i10);
            if (a8Var.T.y()) {
                a8Var.T.X(canvas);
            }
            d(this.f17969e, canvas, arrayList3);
            org.telegram.ui.Components.q5 update4 = org.telegram.ui.Components.u5.update(0, z7Var, this.d, this.f17969e);
            this.d = update4;
            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.f17969e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z4) {
                f(this.f17969e, z7Var.B, z7Var.C + i10);
            }
        }
        if (this.f17979p != null) {
            canvas.save();
            canvas.translate(z7Var.B, (AndroidUtilities.lerp(this.f17976m, this.f17975l, z7Var.f18007w) + z7Var.C) - this.f17979p.b());
            v7 v7Var2 = this.f17979p;
            int width2 = z7Var.getWidth();
            int i14 = z7Var.B;
            v7Var2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            jh.k.g(this.v, false, -1, 0, this.f17984u, 0, staticLayout, arrayList, canvas, false);
        } else {
            staticLayout.draw(canvas);
        }
    }

    public final void e(int i10) {
        int i11;
        boolean z4;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        int i12;
        int i13;
        z7 z7Var = this.v;
        a8 a8Var = z7Var.G;
        TextPaint textPaint = z7Var.d;
        y7[] y7VarArr = z7Var.f18005r;
        TextPaint textPaint2 = z7Var.f18001c;
        boolean isEmpty = TextUtils.isEmpty(this.f17977n);
        Stack stack = this.f17973j;
        ArrayList arrayList = this.f17972i;
        if (isEmpty) {
            this.f17969e = null;
            this.f17975l = 0;
            v7 v7Var = this.f17978o;
            if (v7Var != null) {
                this.f17975l = AndroidUtilities.dp(4.0f) + v7Var.b();
            }
            v7 v7Var2 = this.f17979p;
            if (v7Var2 != null) {
                this.f17975l = org.telegram.messenger.y3.C(4.0f, v7Var2.b(), this.f17975l);
            }
            this.f17976m = this.f17975l;
            if (this == y7VarArr[0]) {
                z7Var.v = null;
            }
            this.f17971g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = z7.a(z7Var, textPaint2, this.f17977n, i10);
        this.f17969e = a2;
        this.f17975l = a2.getHeight();
        v7 v7Var3 = this.f17978o;
        if (v7Var3 != null) {
            i11 = AndroidUtilities.dp(8.0f) + v7Var3.b();
        } else {
            i11 = 0;
        }
        v7 v7Var4 = this.f17979p;
        if (v7Var4 != null) {
            this.f17975l = org.telegram.messenger.y3.C(8.0f, v7Var4.b(), this.f17975l);
        }
        this.f17975l += i11;
        float measureText = textPaint2.measureText(" ");
        if (this.f17969e.getLineCount() > 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        z7Var.f18000b = z4;
        if (z4) {
            if (this.f17969e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.f17977n.subSequence(this.f17969e.getLineStart(2), this.f17969e.getLineEnd(2))) == 0) {
                    z7Var.f18000b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
        }
        if (z7Var.f18000b) {
            float topPadding = this.f17969e.getTopPadding() + this.f17969e.getLineTop(2);
            if (this == y7VarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                z7Var.v = z7.a(z7Var, textPaint, string, i10);
                z7Var.h = ((z7Var.C + i11) + topPadding) - AndroidUtilities.dpf2(0.3f);
                z7Var.f18004n = (z7Var.B + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.f17969e.getTopPadding() + this.f17969e.getLineBottom(2);
            v7 v7Var5 = this.f17978o;
            if (v7Var5 != null) {
                i12 = AndroidUtilities.dp(8.0f) + v7Var5.b();
            } else {
                i12 = 0;
            }
            int i14 = topPadding2 + i12;
            v7 v7Var6 = this.f17979p;
            if (v7Var6 != null) {
                i13 = AndroidUtilities.dp(8.0f) + v7Var6.b();
            } else {
                i13 = 0;
            }
            this.f17976m = i14 + i13;
            this.f17971g = z7.a(z7Var, textPaint2, this.f17977n.subSequence(0, this.f17969e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            jh.k.c(a8Var, this.f17969e, stack, arrayList);
            float lineRight = this.f17969e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i15 = 0;
                while (true) {
                    w7[] w7VarArr = this.h;
                    if (i15 >= w7VarArr.length) {
                        break;
                    }
                    w7 w7Var = w7VarArr[i15];
                    if (w7Var != null) {
                        org.telegram.ui.Components.u5.release(a8Var, w7Var.f17908a);
                    }
                    i15++;
                }
            }
            this.h = new w7[this.f17969e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i16 = 3; i16 < this.f17969e.getLineCount(); i16++) {
                    int lineStart = this.f17969e.getLineStart(i16);
                    int lineEnd = this.f17969e.getLineEnd(i16);
                    CharSequence subSequence = this.f17977n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i16 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = z7.a(z7Var, textPaint2, subSequence, i10);
                        ?? obj = new Object();
                        this.h[i16 - 3] = obj;
                        obj.f17909b = a10;
                        obj.f17911e = this.f17969e.getLineLeft(i16);
                        obj.f17912f = this.f17969e.getTopPadding() + this.f17969e.getLineTop(i16);
                        if (lineRight < z7Var.f18004n - AndroidUtilities.dp(16.0f)) {
                            obj.d = topPadding;
                            obj.f17910c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f17912f;
                            obj.f17910c = obj.f17911e;
                        }
                    }
                }
            }
        } else {
            if (this == y7VarArr[0]) {
                staticLayout2 = staticLayout;
                z7Var.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.f17971g = staticLayout2;
            this.f17976m = this.f17975l;
            stack.addAll(arrayList);
            arrayList.clear();
            jh.k.c(z7Var, this.f17969e, stack, arrayList);
        }
        int i17 = z7Var.B;
        int i18 = z7Var.C;
        jh.p pVar = this.f17974k;
        pVar.f10179c = i17;
        pVar.d = i18;
    }

    public final void f(Layout layout, float f10, float f11) {
        float f12;
        float f13 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            z7 z7Var = this.v;
            float f14 = lineLeft - (z7Var.B / 3.0f);
            float lineRight = (z7Var.B / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f13 = layout.getLineTop(i10) - (z7Var.C / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            if (i10 >= layout.getLineCount() - 1) {
                f12 = (z7Var.C / 3.0f) + lineBottom;
            } else {
                f12 = lineBottom;
            }
            this.f17983t.addRect(f10 + f14, f11 + f13, f10 + lineRight, f11 + f12, Path.Direction.CW);
            i10++;
            f13 = f12;
        }
    }

    public final void g(CharSequence charSequence, v7 v7Var, v7 v7Var2) {
        this.f17977n = charSequence;
        this.f17978o = v7Var;
        this.f17979p = v7Var2;
        z7 z7Var = this.v;
        if (v7Var != null) {
            x7 x7Var = new x7(this, 0);
            v7Var.f17874r = z7Var;
            v7Var.f17875s = x7Var;
            new am0(z7Var);
            v7Var.f17866j.setCallback(z7Var);
            v7Var.h.f33761a = z7Var;
            v7Var.f17865i.f30720a = z7Var;
            v7Var.c();
        }
        v7 v7Var3 = this.f17979p;
        if (v7Var3 != null) {
            x7 x7Var2 = new x7(this, 1);
            v7Var3.f17874r = z7Var;
            v7Var3.f17875s = x7Var2;
            new am0(z7Var);
            v7Var3.f17866j.setCallback(z7Var);
            v7Var3.h.f33761a = z7Var;
            v7Var3.f17865i.f30720a = z7Var;
            v7Var3.c();
        }
        z7Var.f18006s = 0;
        z7Var.requestLayout();
    }
}
