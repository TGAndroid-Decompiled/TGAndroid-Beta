package nh;

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
import org.telegram.ui.Components.b90;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.nr;
public final class y7 {
    public f90 f16085a;
    public org.telegram.ui.Components.u5 f16086b;
    public final b90 f16087c;
    public org.telegram.ui.Components.q5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.q5 f16088f;
    public StaticLayout f16089g;
    public w7[] h;
    public final ArrayList f16090i;
    public final Stack f16091j;
    public final ih.p f16092k;
    public int f16093l;
    public int f16094m;
    public CharSequence f16095n;
    public v7 f16096o;
    public v7 f16097p;
    public boolean f16098q;
    public final org.telegram.ui.Components.z5 f16099r;
    public final i90 f16100s;
    public final Path f16101t;
    public final AtomicReference f16102u;
    public final z7 v;

    public y7(z7 z7Var) {
        this.v = z7Var;
        this.f16087c = new b90(z7Var);
        ArrayList arrayList = new ArrayList();
        this.f16090i = arrayList;
        this.f16091j = new Stack();
        this.f16095n = "";
        this.f16099r = new org.telegram.ui.Components.z5(z7Var.G, 0L, 400L, nr.h);
        Path path = new Path();
        this.f16101t = path;
        this.f16102u = new AtomicReference();
        this.f16092k = new ih.p(z7Var, arrayList, new lh.m5(this, 12));
        i90 i90Var = new i90();
        this.f16100s = i90Var;
        i90Var.f25651x = path;
        i90Var.j(4.0f);
        i90Var.f(org.telegram.ui.ActionBar.j6.l1(0.3f, -1), org.telegram.ui.ActionBar.j6.l1(0.1f, -1), org.telegram.ui.ActionBar.j6.l1(0.2f, -1), org.telegram.ui.ActionBar.j6.l1(0.7f, -1));
        i90Var.setCallback(z7Var);
    }

    public final int a(int i10) {
        int i11;
        v7 v7Var = this.f16096o;
        int i12 = 0;
        if (v7Var != null) {
            i11 = AndroidUtilities.dp(8.0f) + v7Var.b();
        } else {
            i11 = 0;
        }
        v7 v7Var2 = this.f16097p;
        if (v7Var2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + v7Var2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        z7 z7Var = this.v;
        if (staticLayout == null) {
            return i10 - ((z7Var.C * 2) + this.f16093l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!z7Var.f16124b) {
            return i10 - ((z7Var.C * 2) + this.f16093l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * z7Var.f16125c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f10) {
        Canvas canvas2;
        z7 z7Var = this.v;
        a8 a8Var = z7Var.G;
        float e = this.f16099r.e(this.f16098q);
        if (f10 > 0.0f) {
            float lerp = AndroidUtilities.lerp(f10, 0.7f * f10, e);
            if (lerp >= 1.0f) {
                c(canvas, e);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, a8Var.getWidth(), a8Var.getHeight(), (int) (lerp * 255.0f), 31);
                c(canvas2, e);
                canvas2.restore();
            }
            if (e <= 0.0f && !this.f16098q) {
                return;
            }
            i90 i90Var = this.f16100s;
            i90Var.setAlpha((int) (e * 255.0f * lerp));
            i90Var.draw(canvas2);
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
        PorterDuffColorFilter porterDuffColorFilter = z7Var.f16123a;
        a8 a8Var = z7Var.G;
        if (this.f16096o != null) {
            canvas.save();
            canvas.translate(z7Var.B, z7Var.C);
            v7 v7Var = this.f16096o;
            int width = z7Var.getWidth();
            int i12 = z7Var.B;
            v7Var.a(canvas, (width - i12) - i12);
            int b10 = this.f16096o.b();
            canvas.restore();
            i10 = AndroidUtilities.dp(8.0f) + b10;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(z7Var.B, z7Var.C + i10);
        if (this.f16087c.f(canvas)) {
            z7Var.invalidate();
        }
        canvas.restore();
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f16101t.rewind();
        ArrayList arrayList3 = this.f16090i;
        if (arrayList3.isEmpty() && this.f16089g != null) {
            if (a8Var.T.y()) {
                canvas.save();
                canvas.translate(z7Var.B, z7Var.C + i10);
                a8Var.T.X(canvas);
                canvas.restore();
            }
            if (this.f16089g != null) {
                canvas.save();
                canvas.translate(z7Var.B, z7Var.C + i10);
                d(this.f16089g, canvas, arrayList3);
                org.telegram.ui.Components.q5 update = org.telegram.ui.Components.u5.update(0, z7Var, this.f16088f, this.f16089g);
                this.f16088f = update;
                org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.f16089g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z4) {
                    f(this.f16089g, z7Var.B, z7Var.C + i10);
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
                        float f12 = w7Var.f16040c;
                        float f13 = w7Var.e;
                        if (f12 == f13) {
                            if (z7Var.f16130w != f11) {
                                canvas.translate(z7Var.B + f13, z7Var.C + i10 + w7Var.f16041f);
                                canvas.saveLayerAlpha(0.0f, 0.0f, w7Var.f16039b.getWidth(), w7Var.f16039b.getHeight(), (int) (z7Var.f16130w * 255.0f), 31);
                                d(w7Var.f16039b, canvas, arrayList);
                                if (z4) {
                                    f(w7Var.f16039b, z7Var.B + w7Var.e, z7Var.C + i10 + w7Var.f16041f);
                                }
                                w7Var.f16039b.draw(canvas);
                                org.telegram.ui.Components.q5 update2 = org.telegram.ui.Components.u5.update(0, z7Var, w7Var.f16038a, w7Var.f16039b);
                                w7Var.f16038a = update2;
                                arrayList2 = arrayList;
                                i11 = i13;
                                org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, w7Var.f16039b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, z7Var.f16130w, porterDuffColorFilter);
                                canvas.restore();
                            }
                        } else {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f12, f13, z7Var.f16130w);
                            float lerp2 = AndroidUtilities.lerp(w7Var.d, w7Var.f16041f, nr.f27347g.getInterpolation(z7Var.f16130w));
                            canvas.translate(z7Var.B + lerp, z7Var.C + i10 + lerp2);
                            if (z4) {
                                f(w7Var.f16039b, z7Var.B + lerp, z7Var.C + i10 + lerp2);
                            }
                            w7Var.f16039b.draw(canvas);
                            org.telegram.ui.Components.q5 update3 = org.telegram.ui.Components.u5.update(0, z7Var, w7Var.f16038a, w7Var.f16039b);
                            w7Var.f16038a = update3;
                            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, w7Var.f16039b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
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
        } else if (this.e != null) {
            canvas.save();
            canvas.translate(z7Var.B, z7Var.C + i10);
            if (a8Var.T.y()) {
                a8Var.T.X(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.q5 update4 = org.telegram.ui.Components.u5.update(0, z7Var, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z4) {
                f(this.e, z7Var.B, z7Var.C + i10);
            }
        }
        if (this.f16097p != null) {
            canvas.save();
            canvas.translate(z7Var.B, (AndroidUtilities.lerp(this.f16094m, this.f16093l, z7Var.f16130w) + z7Var.C) - this.f16097p.b());
            v7 v7Var2 = this.f16097p;
            int width2 = z7Var.getWidth();
            int i14 = z7Var.B;
            v7Var2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            ih.k.g(this.v, false, -1, 0, this.f16102u, 0, staticLayout, arrayList, canvas, false);
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
        y7[] y7VarArr = z7Var.f16128r;
        TextPaint textPaint2 = z7Var.f16125c;
        boolean isEmpty = TextUtils.isEmpty(this.f16095n);
        Stack stack = this.f16091j;
        ArrayList arrayList = this.f16090i;
        if (isEmpty) {
            this.e = null;
            this.f16093l = 0;
            v7 v7Var = this.f16096o;
            if (v7Var != null) {
                this.f16093l = AndroidUtilities.dp(4.0f) + v7Var.b();
            }
            v7 v7Var2 = this.f16097p;
            if (v7Var2 != null) {
                this.f16093l = org.telegram.messenger.y3.C(4.0f, v7Var2.b(), this.f16093l);
            }
            this.f16094m = this.f16093l;
            if (this == y7VarArr[0]) {
                z7Var.v = null;
            }
            this.f16089g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = z7.a(z7Var, textPaint2, this.f16095n, i10);
        this.e = a2;
        this.f16093l = a2.getHeight();
        v7 v7Var3 = this.f16096o;
        if (v7Var3 != null) {
            i11 = AndroidUtilities.dp(8.0f) + v7Var3.b();
        } else {
            i11 = 0;
        }
        v7 v7Var4 = this.f16097p;
        if (v7Var4 != null) {
            this.f16093l = org.telegram.messenger.y3.C(8.0f, v7Var4.b(), this.f16093l);
        }
        this.f16093l += i11;
        float measureText = textPaint2.measureText(" ");
        if (this.e.getLineCount() > 3) {
            z4 = true;
        } else {
            z4 = false;
        }
        z7Var.f16124b = z4;
        if (z4) {
            if (this.e.getLineCount() == 4) {
                staticLayout = null;
                if (TextUtils.getTrimmedLength(this.f16095n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    z7Var.f16124b = false;
                }
            } else {
                staticLayout = null;
            }
        } else {
            staticLayout = null;
        }
        if (z7Var.f16124b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == y7VarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                z7Var.v = z7.a(z7Var, textPaint, string, i10);
                z7Var.h = ((z7Var.C + i11) + topPadding) - AndroidUtilities.dpf2(0.3f);
                z7Var.f16127n = (z7Var.B + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            v7 v7Var5 = this.f16096o;
            if (v7Var5 != null) {
                i12 = AndroidUtilities.dp(8.0f) + v7Var5.b();
            } else {
                i12 = 0;
            }
            int i14 = topPadding2 + i12;
            v7 v7Var6 = this.f16097p;
            if (v7Var6 != null) {
                i13 = AndroidUtilities.dp(8.0f) + v7Var6.b();
            } else {
                i13 = 0;
            }
            this.f16094m = i14 + i13;
            this.f16089g = z7.a(z7Var, textPaint2, this.f16095n.subSequence(0, this.e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            ih.k.c(a8Var, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i15 = 0;
                while (true) {
                    w7[] w7VarArr = this.h;
                    if (i15 >= w7VarArr.length) {
                        break;
                    }
                    w7 w7Var = w7VarArr[i15];
                    if (w7Var != null) {
                        org.telegram.ui.Components.u5.release(a8Var, w7Var.f16038a);
                    }
                    i15++;
                }
            }
            this.h = new w7[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i16 = 3; i16 < this.e.getLineCount(); i16++) {
                    int lineStart = this.e.getLineStart(i16);
                    int lineEnd = this.e.getLineEnd(i16);
                    CharSequence subSequence = this.f16095n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i16 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = z7.a(z7Var, textPaint2, subSequence, i10);
                        ?? obj = new Object();
                        this.h[i16 - 3] = obj;
                        obj.f16039b = a10;
                        obj.e = this.e.getLineLeft(i16);
                        obj.f16041f = this.e.getTopPadding() + this.e.getLineTop(i16);
                        if (lineRight < z7Var.f16127n - AndroidUtilities.dp(16.0f)) {
                            obj.d = topPadding;
                            obj.f16040c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            obj.d = obj.f16041f;
                            obj.f16040c = obj.e;
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
            this.f16089g = staticLayout2;
            this.f16094m = this.f16093l;
            stack.addAll(arrayList);
            arrayList.clear();
            ih.k.c(z7Var, this.e, stack, arrayList);
        }
        int i17 = z7Var.B;
        int i18 = z7Var.C;
        ih.p pVar = this.f16092k;
        pVar.f7647c = i17;
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
            this.f16101t.addRect(f10 + f14, f11 + f13, f10 + lineRight, f11 + f12, Path.Direction.CW);
            i10++;
            f13 = f12;
        }
    }

    public final void g(CharSequence charSequence, v7 v7Var, v7 v7Var2) {
        this.f16095n = charSequence;
        this.f16096o = v7Var;
        this.f16097p = v7Var2;
        z7 z7Var = this.v;
        if (v7Var != null) {
            x7 x7Var = new x7(this, 0);
            v7Var.f16009r = z7Var;
            v7Var.f16010s = x7Var;
            new am0(z7Var);
            v7Var.f16001j.setCallback(z7Var);
            v7Var.h.f31239a = z7Var;
            v7Var.f16000i.f28440a = z7Var;
            v7Var.c();
        }
        v7 v7Var3 = this.f16097p;
        if (v7Var3 != null) {
            x7 x7Var2 = new x7(this, 1);
            v7Var3.f16009r = z7Var;
            v7Var3.f16010s = x7Var2;
            new am0(z7Var);
            v7Var3.f16001j.setCallback(z7Var);
            v7Var3.h.f31239a = z7Var;
            v7Var3.f16000i.f28440a = z7Var;
            v7Var3.c();
        }
        z7Var.f16129s = 0;
        z7Var.requestLayout();
    }
}
