package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.Choreographer;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
public final class rna extends Drawable {
    public static final short A;
    public static final byte B;
    public static final float[] C;
    public static final float[][] D;
    public static final Path E;
    public static Paint F;
    public static WeakHashMap G;
    public final Paint[] a;
    public final float[] b;
    public final Stack c;
    public int d;
    public final float[] e;
    public final int[] f;
    public RectF g;
    public final ArrayList h;
    public View i;
    public long j;
    public float k;
    public float l;
    public float m;
    public float n;
    public boolean o;
    public boolean p;
    public Runnable q;
    public ValueAnimator r;
    public int s;
    public TimeInterpolator t;
    public boolean u;
    public PorterDuffColorFilter v;
    public int w;
    public int x;
    public boolean y;
    public final RectF z;

    static {
        short s;
        byte b;
        if (gda.o() != 2) {
            s = 100;
        } else {
            s = 150;
        }
        A = s;
        if (gda.o() != 2) {
            b = 10;
        } else {
            b = 30;
        }
        B = b;
        C = new float[]{0.3f, 0.6f, 1.0f};
        D = (float[][]) Array.newInstance(Float.TYPE, 3, s * 5);
        E = new Path();
    }

    public rna() {
        float[] fArr = C;
        this.a = new Paint[fArr.length];
        this.b = new float[fArr.length];
        this.c = new Stack();
        this.e = new float[14];
        this.f = new int[fArr.length];
        this.h = new ArrayList();
        this.n = -1.0f;
        this.s = 255;
        this.t = new ac1((byte) 1);
        this.z = new RectF();
        for (int i = 0; i < fArr.length; i++) {
            this.a[i] = new Paint();
            Paint[] paintArr = this.a;
            if (i == 0) {
                paintArr[i].setStrokeWidth(gm.L(1.4f));
                this.a[i].setStyle(Paint.Style.STROKE);
                this.a[i].setStrokeCap(Paint.Cap.ROUND);
            } else {
                paintArr[i].setStrokeWidth(gm.L(1.2f));
                this.a[i].setStyle(Paint.Style.STROKE);
                this.a[i].setStrokeCap(Paint.Cap.ROUND);
            }
            this.b[i] = this.a[i].getStrokeWidth() * 0.5f;
        }
        gda.o();
        h(0);
    }

    public static void a(View view, Layout layout, int i, int i2, Spanned spanned, Stack stack, ArrayList arrayList, ArrayList arrayList2) {
        int i3;
        int i4;
        if (layout != null) {
            Object[] objArr = (xkb[]) spanned.getSpans(0, layout.getText().length(), xkb.class);
            for (int i5 = 0; i5 < Math.min(100, objArr.length); i5++) {
                if (objArr[i5].b()) {
                    int spanStart = spanned.getSpanStart(objArr[i5]);
                    int spanEnd = spanned.getSpanEnd(objArr[i5]);
                    if (i == -1 && i2 == -1) {
                        int lineForOffset = layout.getLineForOffset(spanEnd);
                        int i6 = Integer.MAX_VALUE;
                        int i7 = Integer.MIN_VALUE;
                        for (int lineForOffset2 = layout.getLineForOffset(spanStart); lineForOffset2 <= lineForOffset; lineForOffset2++) {
                            i6 = Math.min(i6, (int) layout.getLineLeft(lineForOffset2));
                            i7 = Math.max(i7, (int) layout.getLineRight(lineForOffset2));
                        }
                        i3 = i6;
                        i4 = i7;
                    } else {
                        i3 = i;
                        i4 = i2;
                    }
                    layout.getSelectionPath(spanStart, spanEnd, new mna(view, layout, stack, arrayList, i3, i4, arrayList2));
                }
            }
            if ((view instanceof TextView) && stack != null) {
                stack.clear();
            }
        }
    }

    public static void b(View view, Layout layout, int i, int i2, Stack stack, ArrayList arrayList) {
        if (layout.getText() instanceof Spanned) {
            a(view, layout, i, i2, (Spanned) layout.getText(), stack, arrayList, null);
        }
    }

    public static void c(View view, Layout layout, Stack stack, ArrayList arrayList) {
        if (layout.getText() instanceof Spanned) {
            a(view, layout, -1, -1, (Spanned) layout.getText(), stack, arrayList, null);
        }
    }

    public static void d(Canvas canvas, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = E;
        path.rewind();
        for (int i = 0; i < arrayList.size(); i++) {
            Rect bounds = ((rna) arrayList.get(i)).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public static void f(Canvas canvas, Layout layout) {
        if (canvas instanceof cla) {
            int alpha = layout.getPaint().getAlpha();
            layout.getPaint().setAlpha((int) (alpha * 0.4f));
            WeakHashMap weakHashMap = G;
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                G = weakHashMap;
            }
            ArrayList arrayList = (ArrayList) weakHashMap.get(layout);
            if (arrayList == null) {
                arrayList = new ArrayList();
                int lineCount = layout.getLineCount();
                for (int i = 0; i < lineCount; i++) {
                    arrayList.add(new RectF(layout.getLineLeft(i), layout.getLineTop(i), layout.getLineRight(i), layout.getLineBottom(i)));
                }
                G.put(layout, arrayList);
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                canvas.drawRect((RectF) arrayList.get(i2), layout.getPaint());
            }
            layout.getPaint().setAlpha(alpha);
            return;
        }
        layout.draw(canvas);
    }

    public static void g(View view, boolean z, int i, int i2, AtomicReference atomicReference, int i3, Layout layout, List list, Canvas canvas, boolean z2) {
        StaticLayout staticLayout;
        AtomicReference atomicReference2;
        xkb[] xkbVarArr;
        int i4;
        boolean z3;
        TextPaint textPaint;
        if (list != null && !list.isEmpty()) {
            StaticLayout staticLayout2 = (Layout) atomicReference.get();
            int i5 = 0;
            if (staticLayout2 == null || !layout.getText().toString().equals(staticLayout2.getText().toString()) || layout.getWidth() != staticLayout2.getWidth() || layout.getHeight() != staticLayout2.getHeight()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(layout.getText());
                if (layout.getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) layout.getText();
                    xkb[] xkbVarArr2 = (xkb[]) spanned.getSpans(0, spanned.length(), xkb.class);
                    int i6 = 0;
                    while (i6 < Math.min(100, xkbVarArr2.length)) {
                        xkb xkbVar = xkbVarArr2[i6];
                        if (xkbVar.b()) {
                            int spanStart = spanned.getSpanStart(xkbVar);
                            int spanEnd = spanned.getSpanEnd(xkbVar);
                            dw3[] dw3VarArr = (dw3[]) spanned.getSpans(spanStart, spanEnd, dw3.class);
                            int length = dw3VarArr.length;
                            while (true) {
                                xkbVarArr = xkbVarArr2;
                                if (i5 >= length) {
                                    break;
                                }
                                dw3 dw3Var = dw3VarArr[i5];
                                spannableStringBuilder.setSpan(new ph2(dw3Var, (byte) 3), spanned.getSpanStart(dw3Var), spanned.getSpanEnd(dw3Var), spanned.getSpanFlags(xkbVar));
                                spannableStringBuilder.removeSpan(dw3Var);
                                i5++;
                                xkbVarArr2 = xkbVarArr;
                                i6 = i6;
                                length = length;
                                dw3VarArr = dw3VarArr;
                            }
                            i4 = i6;
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(0), spanStart, spanEnd, spanned.getSpanFlags(xkbVar));
                            spannableStringBuilder.removeSpan(xkbVar);
                        } else {
                            xkbVarArr = xkbVarArr2;
                            i4 = i6;
                        }
                        i6 = i4 + 1;
                        xkbVarArr2 = xkbVarArr;
                        i5 = 0;
                    }
                }
                if (i3 == 1) {
                    staticLayout = new StaticLayout(spannableStringBuilder, layout.getPaint(), layout.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, gm.L(1.66f), false);
                } else if (Build.VERSION.SDK_INT >= 24) {
                    staticLayout2 = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), layout.getPaint(), layout.getWidth()).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(layout.getAlignment()).setLineSpacing(layout.getSpacingAdd(), layout.getSpacingMultiplier()).build();
                    atomicReference2 = atomicReference;
                    atomicReference2.set(staticLayout2);
                } else {
                    staticLayout = new StaticLayout(spannableStringBuilder, layout.getPaint(), layout.getWidth(), layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), false);
                }
                atomicReference2 = atomicReference;
                staticLayout2 = staticLayout;
                atomicReference2.set(staticLayout2);
            }
            if (!list.isEmpty()) {
                canvas.save();
                canvas.translate(0.0f, i2);
                staticLayout2.draw(canvas);
                canvas.restore();
            } else {
                f(canvas, layout);
            }
            if (!list.isEmpty()) {
                Path path = E;
                path.rewind();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Rect bounds = ((rna) it.next()).getBounds();
                    path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
                }
                int i7 = 0;
                if (!list.isEmpty() && ((rna) list.get(0)).n != -1.0f) {
                    canvas.save();
                    canvas.clipPath(path);
                    path.rewind();
                    if (!list.isEmpty()) {
                        ((rna) list.get(0)).e(path);
                    }
                    canvas.clipPath(path);
                    canvas.translate(0.0f, -view.getPaddingTop());
                    f(canvas, layout);
                    canvas.restore();
                    i7 = 0;
                }
                if (((rna) list.get(i7)).n != -1.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    int measuredWidth = view.getMeasuredWidth();
                    if (z2 && (view.getParent() instanceof View)) {
                        measuredWidth = ((View) view.getParent()).getMeasuredWidth();
                    }
                    canvas.saveLayer(0.0f, 0.0f, measuredWidth, view.getMeasuredHeight(), null, 31);
                } else {
                    canvas.save();
                }
                canvas.translate(0.0f, -view.getPaddingTop());
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    rna rnaVar = (rna) it2.next();
                    rnaVar.u = z;
                    if (rnaVar.i != view) {
                        rnaVar.i = view;
                    }
                    boolean z4 = rnaVar.p;
                    rnaVar.p = false;
                    if (z4) {
                        if (i3 == 1) {
                            textPaint = layout.getPaint();
                        } else {
                            textPaint = cmb.n2;
                        }
                        rnaVar.h(on2.f(Math.max(0.0f, rnaVar.n), i, textPaint.getColor()));
                    } else {
                        rnaVar.h(i);
                    }
                    rnaVar.draw(canvas);
                }
                if (z3) {
                    path.rewind();
                    ((rna) list.get(0)).e(path);
                    if (F == null) {
                        Paint paint = new Paint(1);
                        F = paint;
                        paint.setColor(-16777216);
                        F.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    }
                    canvas.drawPath(path, F);
                }
                canvas.restore();
                return;
            }
            return;
        }
        f(canvas, layout);
    }

    @Override
    public final void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            tna tnaVar = tna.q;
            if (tnaVar == null) {
                tnaVar = new tna();
                tna.q = tnaVar;
            }
            int i2 = tnaVar.k;
            mj4[] mj4VarArr = tnaVar.c;
            if (mj4VarArr[0] == null) {
                mj4VarArr[0] = new mj4(i2);
                tnaVar.g = new Paint();
                tnaVar.i = new ArrayList(100);
                float f = i2;
                int i3 = (int) (f / 10.0f);
                int L = (int) ((f / gm.L(200.0f)) * 60.0f);
                int i4 = 0;
                while (true) {
                    if (i4 >= 10) {
                        break;
                    }
                    int i5 = 0;
                    for (int i6 = 10; i5 < i6; i6 = 10) {
                        rna rnaVar = new rna();
                        rnaVar.x = i2;
                        int i7 = i3 * i4;
                        int i8 = i3 * i5;
                        rnaVar.setBounds(i7, i8 - gm.L(5.0f), gm.L(3.0f) + i7 + i3, gm.L(5.0f) + i8 + i3);
                        int min = Math.min(A * 5, L);
                        rnaVar.d = min;
                        while (true) {
                            Stack stack = rnaVar.c;
                            if (rnaVar.h.size() + stack.size() < min) {
                                stack.push(new Object());
                            }
                        }
                        rnaVar.h(-1);
                        tnaVar.i.add(rnaVar);
                        i5++;
                    }
                    i4++;
                }
                i = 128;
                tnaVar.a(new Canvas((Bitmap) mj4VarArr[0].b), new Rect(0, 0, i2, i2));
                tnaVar.g.setShader((BitmapShader) mj4VarArr[0].c);
                tnaVar.h = System.currentTimeMillis();
            } else {
                i = 128;
                if (tnaVar.p && !e86.e(128)) {
                    tnaVar.d = 0;
                    tnaVar.a(new Canvas((Bitmap) mj4VarArr[0].b), new Rect(0, 0, i2, i2));
                    tnaVar.g.setShader((BitmapShader) mj4VarArr[0].c);
                    tnaVar.h = System.currentTimeMillis();
                    tnaVar.p = false;
                }
            }
            Paint paint = tnaVar.g;
            paint.setColorFilter(this.v);
            canvas.drawRect(bounds, paint);
            if (e86.e(i)) {
                fi2 d = fi2.d();
                fi2.c();
                d.c.add(this);
                tna tnaVar2 = tna.q;
                if (tnaVar2 == null) {
                    tnaVar2 = new tna();
                    tna.q = tnaVar2;
                }
                int i9 = bounds.left;
                int i10 = tnaVar2.k;
                int i11 = ((i9 % i10) + i10) % i10;
                int i12 = ((bounds.top % i10) + i10) % i10;
                int min2 = Math.min(bounds.width(), i10) + i11;
                int min3 = Math.min(bounds.height(), i10) + i12;
                Rect rect = tnaVar2.m;
                rect.union(i11, i12, Math.min(min2, i10), Math.min(min3, i10));
                if (min2 > i10) {
                    rect.union(0, i12, min2 - i10, Math.min(min3, i10));
                }
                if (min3 > i10) {
                    rect.union(i11, 0, Math.min(min2, i10), min3 - i10);
                }
                if (min2 > i10 && min3 > i10) {
                    rect.union(0, 0, min2 - i10, min3 - i10);
                }
                if (!tnaVar2.l && !rect.isEmpty()) {
                    tnaVar2.l = true;
                    Choreographer.getInstance().postFrameCallback(tnaVar2.n);
                }
            }
        }
    }

    public final void e(Path path) {
        path.addCircle(this.k, this.l, pqe.a(this.n, 0.0f, 1.0f) * this.m, Path.Direction.CW);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(int i) {
        if (this.w != i) {
            int i2 = 0;
            while (true) {
                float[] fArr = C;
                if (i2 < fArr.length) {
                    this.a[i2].setColor(on2.p(i, (int) (this.s * fArr[i2])));
                    i2++;
                } else {
                    this.v = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
                    this.w = i;
                    return;
                }
            }
        }
    }

    public final void i(float f, float f2, float f3) {
        RectF rectF = this.g;
        if (rectF == null) {
            rectF = new RectF();
            this.g = rectF;
        }
        if (rectF.left == 0.0f && rectF.right == f2 && rectF.top == f && rectF.bottom == f3) {
            return;
        }
        rectF.left = 0.0f;
        rectF.top = f;
        rectF.right = f2;
        rectF.bottom = f3;
        invalidateSelf();
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        View view = this.i;
        if (view != null) {
            if (view.getParent() != null && this.u) {
                ((View) view.getParent()).invalidate();
            } else if (view instanceof hg0) {
                ((hg0) view).p();
            } else {
                view.invalidate();
            }
        }
    }

    public final void j(float f, float f2, float f3, boolean z) {
        float f4;
        int alpha;
        this.k = f;
        this.l = f2;
        this.m = f3;
        float f5 = 0.0f;
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        this.n = f4;
        this.o = z;
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.o) {
            alpha = 255;
        } else {
            alpha = this.a[C.length - 1].getAlpha();
        }
        float f6 = this.n;
        if (!z) {
            f5 = 1.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f6, f5).setDuration(pqe.a(this.m * 0.3f, 250.0f, 550.0f));
        this.r = duration;
        duration.setInterpolator(this.t);
        this.r.addUpdateListener(new by0(this, alpha, (byte) 4));
        this.r.addListener(new c39(this, (byte) 20));
        this.r.start();
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.z;
        rectF.set(rect);
        rectF.inset(0.0f, gm.L(2.5f));
    }

    @Override
    public final void setAlpha(int i) {
        this.s = i;
        int i2 = 0;
        while (true) {
            float[] fArr = C;
            if (i2 < fArr.length) {
                this.a[i2].setAlpha((int) (fArr[i2] * i));
                i2++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            nna nnaVar = (nna) it.next();
            if (!getBounds().contains((int) nnaVar.a, (int) nnaVar.b)) {
                it.remove();
            }
            Stack stack = this.c;
            if (stack.size() < this.d) {
                stack.push(nnaVar);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        for (Paint paint : this.a) {
            paint.setColorFilter(colorFilter);
        }
    }
}
