package gh;

import ag.m0;
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
import i7.w;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.i01;
public final class k extends Drawable {
    public static final int A;
    public static final int B;
    public static final float[] C;
    public static final float[][] D;
    public static final Path E;
    public static Paint F;
    public static WeakHashMap G;
    public final Paint[] f7403a;
    public final float[] f7404b;
    public final Stack f7405c;
    public int d;
    public final float[] f7406e;
    public final int[] f7407f;
    public RectF f7408g;
    public final ArrayList h;
    public View f7409i;
    public long f7410j;
    public float f7411k;
    public float f7412l;
    public float f7413m;
    public float f7414n;
    public boolean f7415o;
    public boolean f7416p;
    public Runnable f7417q;
    public ValueAnimator f7418r;
    public int f7419s;
    public TimeInterpolator f7420t;
    public boolean f7421u;
    public PorterDuffColorFilter v;
    public int f7422w;
    public int f7423x;
    public boolean f7424y;
    public final RectF f7425z;

    static {
        int i10;
        int i11;
        if (SharedConfig.getDevicePerformanceClass() != 2) {
            i10 = 100;
        } else {
            i10 = 150;
        }
        A = i10;
        if (SharedConfig.getDevicePerformanceClass() != 2) {
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

    public k() {
        float[] fArr = C;
        this.f7403a = new Paint[fArr.length];
        this.f7404b = new float[fArr.length];
        this.f7405c = new Stack();
        this.f7406e = new float[14];
        this.f7407f = new int[fArr.length];
        this.h = new ArrayList();
        this.f7414n = -1.0f;
        this.f7419s = 255;
        this.f7420t = new a(0);
        this.f7425z = new RectF();
        for (int i10 = 0; i10 < fArr.length; i10++) {
            this.f7403a[i10] = new Paint();
            if (i10 == 0) {
                this.f7403a[i10].setStrokeWidth(AndroidUtilities.dp(1.4f));
                this.f7403a[i10].setStyle(Paint.Style.STROKE);
                this.f7403a[i10].setStrokeCap(Paint.Cap.ROUND);
            } else {
                this.f7403a[i10].setStrokeWidth(AndroidUtilities.dp(1.2f));
                this.f7403a[i10].setStyle(Paint.Style.STROKE);
                this.f7403a[i10].setStrokeCap(Paint.Cap.ROUND);
            }
            this.f7404b[i10] = this.f7403a[i10].getStrokeWidth() * 0.5f;
        }
        SharedConfig.getDevicePerformanceClass();
        h(0);
    }

    public static void a(View view, Layout layout, int i10, int i11, Spanned spanned, Stack stack, List list, ArrayList arrayList) {
        int i12;
        int i13;
        if (layout != null) {
            Object[] objArr = (i01[]) spanned.getSpans(0, layout.getText().length(), i01.class);
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

    public static void c(View view, Layout layout, Stack stack, List list) {
        if (layout.getText() instanceof Spanned) {
            a(view, layout, -1, -1, (Spanned) layout.getText(), stack, list, null);
        }
    }

    public static void d(Canvas canvas, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Path path = E;
        path.rewind();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Rect bounds = ((k) arrayList.get(i10)).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public static void f(Canvas canvas, Layout layout) {
        if (canvas instanceof fv0) {
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
        i01[] i01VarArr;
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
                    i01[] i01VarArr2 = (i01[]) spanned.getSpans(0, spanned.length(), i01.class);
                    int i15 = 0;
                    while (i15 < Math.min(100, i01VarArr2.length)) {
                        i01 i01Var = i01VarArr2[i15];
                        if (i01Var.c()) {
                            int spanStart = spanned.getSpanStart(i01Var);
                            int spanEnd = spanned.getSpanEnd(i01Var);
                            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(spanStart, spanEnd, Emoji.EmojiSpan.class);
                            int length = emojiSpanArr.length;
                            while (i14 < length) {
                                i01[] i01VarArr3 = i01VarArr2;
                                Emoji.EmojiSpan emojiSpan = emojiSpanArr[i14];
                                spannableStringBuilder.setSpan(new d(emojiSpan), spanned.getSpanStart(emojiSpan), spanned.getSpanEnd(emojiSpan), spanned.getSpanFlags(i01Var));
                                spannableStringBuilder.removeSpan(emojiSpan);
                                i14++;
                                i01VarArr2 = i01VarArr3;
                                i15 = i15;
                                length = length;
                                emojiSpanArr = emojiSpanArr;
                            }
                            i01VarArr = i01VarArr2;
                            i13 = i15;
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(0), spanStart, spanEnd, spanned.getSpanFlags(i01Var));
                            spannableStringBuilder.removeSpan(i01Var);
                        } else {
                            i01VarArr = i01VarArr2;
                            i13 = i15;
                        }
                        i15 = i13 + 1;
                        i01VarArr2 = i01VarArr;
                        i14 = 0;
                    }
                }
                if (i12 == 1) {
                    staticLayout = new StaticLayout(spannableStringBuilder, layout.getPaint(), layout.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, AndroidUtilities.dp(1.66f), false);
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
                    Rect bounds = ((k) it.next()).getBounds();
                    path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
                }
                int i16 = 0;
                if (!list.isEmpty() && ((k) list.get(0)).f7414n != -1.0f) {
                    canvas.save();
                    canvas.clipPath(path);
                    path.rewind();
                    if (!list.isEmpty()) {
                        ((k) list.get(0)).e(path);
                    }
                    canvas.clipPath(path);
                    canvas.translate(0.0f, -view.getPaddingTop());
                    f(canvas, layout);
                    canvas.restore();
                    i16 = 0;
                }
                if (((k) list.get(i16)).f7414n != -1.0f) {
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
                    k kVar = (k) it2.next();
                    kVar.f7421u = z10;
                    if (kVar.f7409i != view) {
                        kVar.f7409i = view;
                    }
                    boolean z13 = kVar.f7416p;
                    kVar.f7416p = false;
                    if (z13) {
                        if (i12 == 1) {
                            textPaint = layout.getPaint();
                        } else {
                            textPaint = g6.f23256o2;
                        }
                        kVar.h(i0.a.d(Math.max(0.0f, kVar.f7414n), i10, textPaint.getColor()));
                    } else {
                        kVar.h(i10);
                    }
                    kVar.draw(canvas);
                }
                if (z12) {
                    path.rewind();
                    ((k) list.get(0)).e(path);
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
            if (m.f7429q == null) {
                m.f7429q = new m();
            }
            m mVar = m.f7429q;
            int i11 = mVar.f7438k;
            g9.l[] lVarArr = mVar.f7432c;
            if (lVarArr[0] == null) {
                lVarArr[0] = new g9.l(i11);
                mVar.f7435g = new Paint();
                mVar.f7436i = new ArrayList(100);
                float f9 = i11;
                int i12 = (int) (f9 / 10.0f);
                int dp = (int) ((f9 / AndroidUtilities.dp(200.0f)) * 60.0f);
                int i13 = 0;
                while (true) {
                    if (i13 >= 10) {
                        break;
                    }
                    int i14 = 0;
                    for (int i15 = 10; i14 < i15; i15 = 10) {
                        k kVar = new k();
                        kVar.f7423x = i11;
                        int i16 = i12 * i13;
                        int i17 = i12 * i14;
                        kVar.setBounds(i16, i17 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f) + i16 + i12, AndroidUtilities.dp(5.0f) + i17 + i12);
                        int min = Math.min(A * 5, dp);
                        kVar.d = min;
                        while (true) {
                            Stack stack = kVar.f7405c;
                            if (kVar.h.size() + stack.size() < min) {
                                stack.push(new Object());
                            }
                        }
                        kVar.h(-1);
                        mVar.f7436i.add(kVar);
                        i14++;
                    }
                    i13++;
                }
                i10 = 128;
                mVar.a(new Canvas((Bitmap) lVarArr[0].f7168b), new Rect(0, 0, i11, i11));
                mVar.f7435g.setShader((BitmapShader) lVarArr[0].f7169c);
                mVar.h = System.currentTimeMillis();
            } else {
                i10 = 128;
                if (mVar.f7443p && !LiteMode.isEnabled(128)) {
                    mVar.d = 0;
                    mVar.a(new Canvas((Bitmap) lVarArr[0].f7168b), new Rect(0, 0, i11, i11));
                    mVar.f7435g.setShader((BitmapShader) lVarArr[0].f7169c);
                    mVar.h = System.currentTimeMillis();
                    mVar.f7443p = false;
                }
            }
            Paint paint = mVar.f7435g;
            paint.setColorFilter(this.v);
            canvas.drawRect(bounds, paint);
            if (LiteMode.isEnabled(i10)) {
                jf.j d = jf.j.d();
                d.getClass();
                jf.j.c();
                d.d.add(this);
                if (m.f7429q == null) {
                    m.f7429q = new m();
                }
                m mVar2 = m.f7429q;
                mVar2.getClass();
                int i18 = bounds.left;
                int i19 = mVar2.f7438k;
                int i20 = ((i18 % i19) + i19) % i19;
                int i21 = ((bounds.top % i19) + i19) % i19;
                int min2 = Math.min(bounds.width(), i19) + i20;
                int min3 = Math.min(bounds.height(), i19) + i21;
                Rect rect = mVar2.f7440m;
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
                if (!mVar2.f7439l && !rect.isEmpty()) {
                    mVar2.f7439l = true;
                    Choreographer.getInstance().postFrameCallback(mVar2.f7441n);
                }
            }
        }
    }

    public final void e(Path path) {
        path.addCircle(this.f7411k, this.f7412l, w.a(this.f7414n, 0.0f, 1.0f) * this.f7413m, Path.Direction.CW);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(int i10) {
        if (this.f7422w != i10) {
            int i11 = 0;
            while (true) {
                float[] fArr = C;
                if (i11 < fArr.length) {
                    this.f7403a[i11].setColor(i0.a.k(i10, (int) (this.f7419s * fArr[i11])));
                    i11++;
                } else {
                    this.v = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
                    this.f7422w = i10;
                    return;
                }
            }
        }
    }

    public final void i(float f9, float f10, float f11) {
        if (this.f7408g == null) {
            this.f7408g = new RectF();
        }
        RectF rectF = this.f7408g;
        if (rectF.left == 0.0f && rectF.right == f10 && rectF.top == f9 && rectF.bottom == f11) {
            return;
        }
        rectF.left = 0.0f;
        rectF.top = f9;
        rectF.right = f10;
        rectF.bottom = f11;
        invalidateSelf();
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        View view = this.f7409i;
        if (view != null) {
            if (view.getParent() != null && this.f7421u) {
                ((View) view.getParent()).invalidate();
            } else if (view instanceof a0) {
                ((a0) view).l();
            } else {
                view.invalidate();
            }
        }
    }

    public final void j(float f9, float f10, float f11, boolean z10) {
        float f12;
        int alpha;
        this.f7411k = f9;
        this.f7412l = f10;
        this.f7413m = f11;
        float f13 = 0.0f;
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        this.f7414n = f12;
        this.f7415o = z10;
        ValueAnimator valueAnimator = this.f7418r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f7415o) {
            alpha = 255;
        } else {
            alpha = this.f7403a[C.length - 1].getAlpha();
        }
        float f14 = this.f7414n;
        if (!z10) {
            f13 = 1.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f14, f13).setDuration(w.a(this.f7413m * 0.3f, 250.0f, 550.0f));
        this.f7418r = duration;
        duration.setInterpolator(this.f7420t);
        this.f7418r.addUpdateListener(new b(this, alpha, 0));
        this.f7418r.addListener(new m0(this, 7));
        this.f7418r.start();
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.f7425z;
        rectF.set(rect);
        rectF.inset(0.0f, AndroidUtilities.dp(2.5f));
    }

    @Override
    public final void setAlpha(int i10) {
        this.f7419s = i10;
        int i11 = 0;
        while (true) {
            float[] fArr = C;
            if (i11 < fArr.length) {
                this.f7403a[i11].setAlpha((int) (fArr[i11] * i10));
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
            e eVar = (e) it.next();
            if (!getBounds().contains((int) eVar.f7369a, (int) eVar.f7370b)) {
                it.remove();
            }
            Stack stack = this.f7405c;
            if (stack.size() < this.d) {
                stack.push(eVar);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        for (Paint paint : this.f7403a) {
            paint.setColorFilter(colorFilter);
        }
    }
}
