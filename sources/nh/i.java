package nh;

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
import mg.d2;
import org.telegram.messenger.h6;
import org.telegram.messenger.i0;
import org.telegram.messenger.tc;
import org.telegram.messenger.uz;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.a01;
import org.telegram.ui.Components.tu0;
import w7.u;
public final class i extends Drawable {
    public static final int A;
    public static final int B;
    public static final float[] C;
    public static final float[][] D;
    public static final Path E;
    public static Paint F;
    public static WeakHashMap G;
    public final Paint[] f13840a;
    public final float[] f13841b;
    public final Stack f13842c;
    public int d;
    public final float[] e;
    public final int[] f13843f;
    public RectF f13844g;
    public final ArrayList h;
    public View f13845i;
    public long f13846j;
    public float f13847k;
    public float f13848l;
    public float f13849m;
    public float f13850n;
    public boolean f13851o;
    public boolean f13852p;
    public Runnable f13853q;
    public ValueAnimator f13854r;
    public int f13855s;
    public TimeInterpolator f13856t;
    public boolean f13857u;
    public PorterDuffColorFilter v;
    public int f13858w;
    public int f13859x;
    public boolean f13860y;
    public final RectF f13861z;

    static {
        int i10;
        int i11;
        if (uz.o() != 2) {
            i10 = 100;
        } else {
            i10 = 150;
        }
        A = i10;
        if (uz.o() != 2) {
            i11 = 10;
        } else {
            i11 = 30;
        }
        B = i11;
        float[] fArr = {0.3f, 0.6f, 1.0f};
        C = fArr;
        D = (float[][]) Array.newInstance(Float.TYPE, fArr.length, i10 * 5);
        E = new Path();
    }

    public i() {
        float[] fArr = C;
        this.f13840a = new Paint[fArr.length];
        this.f13841b = new float[fArr.length];
        this.f13842c = new Stack();
        this.e = new float[14];
        this.f13843f = new int[fArr.length];
        this.h = new ArrayList();
        this.f13850n = -1.0f;
        this.f13855s = 255;
        this.f13856t = new a(0);
        this.f13861z = new RectF();
        for (int i10 = 0; i10 < fArr.length; i10++) {
            this.f13840a[i10] = new Paint();
            if (i10 == 0) {
                this.f13840a[i10].setStrokeWidth(i0.L(1.4f));
                this.f13840a[i10].setStyle(Paint.Style.STROKE);
                this.f13840a[i10].setStrokeCap(Paint.Cap.ROUND);
            } else {
                this.f13840a[i10].setStrokeWidth(i0.L(1.2f));
                this.f13840a[i10].setStyle(Paint.Style.STROKE);
                this.f13840a[i10].setStrokeCap(Paint.Cap.ROUND);
            }
            this.f13841b[i10] = this.f13840a[i10].getStrokeWidth() * 0.5f;
        }
        uz.o();
        h(0);
    }

    public static void a(View view, Layout layout, int i10, int i11, Spanned spanned, Stack stack, List list, ArrayList arrayList) {
        int i12;
        int i13;
        if (layout != null) {
            Object[] objArr = (a01[]) spanned.getSpans(0, layout.getText().length(), a01.class);
            for (int i14 = 0; i14 < Math.min(100, objArr.length); i14++) {
                if (objArr[i14].c()) {
                    int spanStart = spanned.getSpanStart(objArr[i14]);
                    int spanEnd = spanned.getSpanEnd(objArr[i14]);
                    if (i10 == -1 && i11 == -1) {
                        int lineForOffset = layout.getLineForOffset(spanEnd);
                        int i15 = Integer.MAX_VALUE;
                        int i16 = Integer.MIN_VALUE;
                        for (int lineForOffset2 = layout.getLineForOffset(spanStart); lineForOffset2 <= lineForOffset; lineForOffset2++) {
                            i15 = Math.min(i15, (int) layout.getLineLeft(lineForOffset2));
                            i16 = Math.max(i16, (int) layout.getLineRight(lineForOffset2));
                        }
                        i12 = i15;
                        i13 = i16;
                    } else {
                        i12 = i10;
                        i13 = i11;
                    }
                    layout.getSelectionPath(spanStart, spanEnd, new c(view, layout, stack, list, i12, i13, arrayList));
                }
            }
            if ((view instanceof TextView) && stack != null) {
                stack.clear();
            }
        }
    }

    public static void b(View view, Layout layout, int i10, int i11, Stack stack, List list) {
        if (layout.getText() instanceof Spanned) {
            a(view, layout, i10, i11, (Spanned) layout.getText(), stack, list, null);
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
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Rect bounds = ((i) arrayList.get(i10)).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public static void f(Canvas canvas, Layout layout) {
        if (canvas instanceof tu0) {
            int alpha = layout.getPaint().getAlpha();
            layout.getPaint().setAlpha((int) (alpha * 0.4f));
            if (G == null) {
                G = new WeakHashMap();
            }
            ArrayList arrayList = (ArrayList) G.get(layout);
            if (arrayList == null) {
                arrayList = new ArrayList();
                int lineCount = layout.getLineCount();
                for (int i10 = 0; i10 < lineCount; i10++) {
                    arrayList.add(new RectF(layout.getLineLeft(i10), layout.getLineTop(i10), layout.getLineRight(i10), layout.getLineBottom(i10)));
                }
                G.put(layout, arrayList);
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                canvas.drawRect((RectF) arrayList.get(i11), layout.getPaint());
            }
            layout.getPaint().setAlpha(alpha);
            return;
        }
        layout.draw(canvas);
    }

    public static void g(View view, boolean z10, int i10, int i11, AtomicReference atomicReference, int i12, Layout layout, List list, Canvas canvas, boolean z11) {
        StaticLayout staticLayout;
        AtomicReference atomicReference2;
        a01[] a01VarArr;
        int i13;
        boolean z12;
        TextPaint textPaint;
        if (list != null && !list.isEmpty()) {
            StaticLayout staticLayout2 = (Layout) atomicReference.get();
            int i14 = 0;
            if (staticLayout2 == null || !layout.getText().toString().equals(staticLayout2.getText().toString()) || layout.getWidth() != staticLayout2.getWidth() || layout.getHeight() != staticLayout2.getHeight()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(layout.getText());
                if (layout.getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) layout.getText();
                    a01[] a01VarArr2 = (a01[]) spanned.getSpans(0, spanned.length(), a01.class);
                    int i15 = 0;
                    while (i15 < Math.min(100, a01VarArr2.length)) {
                        a01 a01Var = a01VarArr2[i15];
                        if (a01Var.c()) {
                            int spanStart = spanned.getSpanStart(a01Var);
                            int spanEnd = spanned.getSpanEnd(a01Var);
                            h6[] h6VarArr = (h6[]) spanned.getSpans(spanStart, spanEnd, h6.class);
                            int length = h6VarArr.length;
                            while (i14 < length) {
                                a01[] a01VarArr3 = a01VarArr2;
                                h6 h6Var = h6VarArr[i14];
                                spannableStringBuilder.setSpan(new d2(h6Var, 1), spanned.getSpanStart(h6Var), spanned.getSpanEnd(h6Var), spanned.getSpanFlags(a01Var));
                                spannableStringBuilder.removeSpan(h6Var);
                                i14++;
                                a01VarArr2 = a01VarArr3;
                                i15 = i15;
                                length = length;
                                h6VarArr = h6VarArr;
                            }
                            a01VarArr = a01VarArr2;
                            i13 = i15;
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(0), spanStart, spanEnd, spanned.getSpanFlags(a01Var));
                            spannableStringBuilder.removeSpan(a01Var);
                        } else {
                            a01VarArr = a01VarArr2;
                            i13 = i15;
                        }
                        i15 = i13 + 1;
                        a01VarArr2 = a01VarArr;
                        i14 = 0;
                    }
                }
                if (i12 == 1) {
                    staticLayout = new StaticLayout(spannableStringBuilder, layout.getPaint(), layout.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, i0.L(1.66f), false);
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
                canvas.translate(0.0f, i11);
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
                    Rect bounds = ((i) it.next()).getBounds();
                    path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
                }
                int i16 = 0;
                if (!list.isEmpty() && ((i) list.get(0)).f13850n != -1.0f) {
                    canvas.save();
                    canvas.clipPath(path);
                    path.rewind();
                    if (!list.isEmpty()) {
                        ((i) list.get(0)).e(path);
                    }
                    canvas.clipPath(path);
                    canvas.translate(0.0f, -view.getPaddingTop());
                    f(canvas, layout);
                    canvas.restore();
                    i16 = 0;
                }
                if (((i) list.get(i16)).f13850n != -1.0f) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    int measuredWidth = view.getMeasuredWidth();
                    if (z11 && (view.getParent() instanceof View)) {
                        measuredWidth = ((View) view.getParent()).getMeasuredWidth();
                    }
                    canvas.saveLayer(0.0f, 0.0f, measuredWidth, view.getMeasuredHeight(), null, 31);
                } else {
                    canvas.save();
                }
                canvas.translate(0.0f, -view.getPaddingTop());
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    i iVar = (i) it2.next();
                    iVar.f13857u = z10;
                    if (iVar.f13845i != view) {
                        iVar.f13845i = view;
                    }
                    boolean z13 = iVar.f13852p;
                    iVar.f13852p = false;
                    if (z13) {
                        if (i12 == 1) {
                            textPaint = layout.getPaint();
                        } else {
                            textPaint = t6.f21131o2;
                        }
                        iVar.h(i0.b.f(Math.max(0.0f, iVar.f13850n), i10, textPaint.getColor()));
                    } else {
                        iVar.h(i10);
                    }
                    iVar.draw(canvas);
                }
                if (z12) {
                    path.rewind();
                    ((i) list.get(0)).e(path);
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
        int i10;
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            if (k.f13865q == null) {
                k.f13865q = new k();
            }
            k kVar = k.f13865q;
            int i11 = kVar.f13873k;
            m4.c[] cVarArr = kVar.f13868c;
            if (cVarArr[0] == null) {
                cVarArr[0] = new m4.c(i11);
                kVar.f13870g = new Paint();
                kVar.f13871i = new ArrayList(100);
                float f7 = i11;
                int i12 = (int) (f7 / 10.0f);
                int L = (int) ((f7 / i0.L(200.0f)) * 60.0f);
                int i13 = 0;
                while (true) {
                    if (i13 >= 10) {
                        break;
                    }
                    int i14 = 0;
                    for (int i15 = 10; i14 < i15; i15 = 10) {
                        i iVar = new i();
                        iVar.f13859x = i11;
                        int i16 = i12 * i13;
                        int i17 = i12 * i14;
                        iVar.setBounds(i16, i17 - i0.L(5.0f), i0.L(3.0f) + i16 + i12, i0.L(5.0f) + i17 + i12);
                        int min = Math.min(A * 5, L);
                        iVar.d = min;
                        while (true) {
                            Stack stack = iVar.f13842c;
                            if (iVar.h.size() + stack.size() < min) {
                                stack.push(new Object());
                            }
                        }
                        iVar.h(-1);
                        kVar.f13871i.add(iVar);
                        i14++;
                    }
                    i13++;
                }
                i10 = 128;
                kVar.a(new Canvas((Bitmap) cVarArr[0].f12706b), new Rect(0, 0, i11, i11));
                kVar.f13870g.setShader((BitmapShader) cVarArr[0].f12707c);
                kVar.h = System.currentTimeMillis();
            } else {
                i10 = 128;
                if (kVar.f13878p && !tc.e(128)) {
                    kVar.d = 0;
                    kVar.a(new Canvas((Bitmap) cVarArr[0].f12706b), new Rect(0, 0, i11, i11));
                    kVar.f13870g.setShader((BitmapShader) cVarArr[0].f12707c);
                    kVar.h = System.currentTimeMillis();
                    kVar.f13878p = false;
                }
            }
            Paint paint = kVar.f13870g;
            paint.setColorFilter(this.v);
            canvas.drawRect(bounds, paint);
            if (tc.e(i10)) {
                rf.g d = rf.g.d();
                d.getClass();
                rf.g.c();
                d.f46547c.add(this);
                if (k.f13865q == null) {
                    k.f13865q = new k();
                }
                k kVar2 = k.f13865q;
                kVar2.getClass();
                int i18 = bounds.left;
                int i19 = kVar2.f13873k;
                int i20 = ((i18 % i19) + i19) % i19;
                int i21 = ((bounds.top % i19) + i19) % i19;
                int min2 = Math.min(bounds.width(), i19) + i20;
                int min3 = Math.min(bounds.height(), i19) + i21;
                Rect rect = kVar2.f13875m;
                rect.union(i20, i21, Math.min(min2, i19), Math.min(min3, i19));
                if (min2 > i19) {
                    rect.union(0, i21, min2 - i19, Math.min(min3, i19));
                }
                if (min3 > i19) {
                    rect.union(i20, 0, Math.min(min2, i19), min3 - i19);
                }
                if (min2 > i19 && min3 > i19) {
                    rect.union(0, 0, min2 - i19, min3 - i19);
                }
                if (!kVar2.f13874l && !rect.isEmpty()) {
                    kVar2.f13874l = true;
                    Choreographer.getInstance().postFrameCallback(kVar2.f13876n);
                }
            }
        }
    }

    public final void e(Path path) {
        path.addCircle(this.f13847k, this.f13848l, u.a(this.f13850n, 0.0f, 1.0f) * this.f13849m, Path.Direction.CW);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(int i10) {
        if (this.f13858w != i10) {
            int i11 = 0;
            while (true) {
                float[] fArr = C;
                if (i11 < fArr.length) {
                    this.f13840a[i11].setColor(i0.b.o(i10, (int) (this.f13855s * fArr[i11])));
                    i11++;
                } else {
                    this.v = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    this.f13858w = i10;
                    return;
                }
            }
        }
    }

    public final void i(float f7, float f10, float f11) {
        if (this.f13844g == null) {
            this.f13844g = new RectF();
        }
        RectF rectF = this.f13844g;
        if (rectF.left == 0.0f && rectF.right == f10 && rectF.top == f7 && rectF.bottom == f11) {
            return;
        }
        rectF.left = 0.0f;
        rectF.top = f7;
        rectF.right = f10;
        rectF.bottom = f11;
        invalidateSelf();
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        View view = this.f13845i;
        if (view != null) {
            if (view.getParent() != null && this.f13857u) {
                ((View) view.getParent()).invalidate();
            } else if (view instanceof z) {
                ((z) view).n();
            } else {
                view.invalidate();
            }
        }
    }

    public final void j(float f7, float f10, float f11, boolean z10) {
        float f12;
        int alpha;
        this.f13847k = f7;
        this.f13848l = f10;
        this.f13849m = f11;
        float f13 = 0.0f;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        this.f13850n = f12;
        this.f13851o = z10;
        ValueAnimator valueAnimator = this.f13854r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f13851o) {
            alpha = 255;
        } else {
            alpha = this.f13840a[C.length - 1].getAlpha();
        }
        float f14 = this.f13850n;
        if (!z10) {
            f13 = 1.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f14, f13).setDuration(u.a(this.f13849m * 0.3f, 250.0f, 550.0f));
        this.f13854r = duration;
        duration.setInterpolator(this.f13856t);
        this.f13854r.addUpdateListener(new b(this, alpha, 0));
        this.f13854r.addListener(new bg.e(this, 14));
        this.f13854r.start();
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.f13861z;
        rectF.set(rect);
        rectF.inset(0.0f, i0.L(2.5f));
    }

    @Override
    public final void setAlpha(int i10) {
        this.f13855s = i10;
        int i11 = 0;
        while (true) {
            float[] fArr = C;
            if (i11 < fArr.length) {
                this.f13840a[i11].setAlpha((int) (fArr[i11] * i10));
                i11++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (!getBounds().contains((int) dVar.f13810a, (int) dVar.f13811b)) {
                it.remove();
            }
            Stack stack = this.f13842c;
            if (stack.size() < this.d) {
                stack.push(dVar);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        for (Paint paint : this.f13840a) {
            paint.setColorFilter(colorFilter);
        }
    }
}
