package dh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.wz0;
public final class l extends Drawable {
    public static final int A;
    public static final int B;
    public static final float[] C;
    public static final float[][] D;
    public static final Path E;
    public static Paint F;
    public static WeakHashMap G;
    public final Paint[] f4613a;
    public final float[] f4614b;
    public final Stack f4615c;
    public int d;
    public final float[] f4616e;
    public final int[] f4617f;
    public RectF f4618g;
    public final ArrayList h;
    public View f4619i;
    public long f4620j;
    public float f4621k;
    public float f4622l;
    public float f4623m;
    public float f4624n;
    public boolean f4625o;
    public boolean f4626p;
    public Runnable f4627q;
    public ValueAnimator f4628r;
    public int f4629s;
    public TimeInterpolator f4630t;
    public boolean f4631u;
    public PorterDuffColorFilter v;
    public int f4632w;
    public int f4633x;
    public boolean f4634y;
    public final RectF f4635z;

    static {
        int i9;
        int i10;
        if (SharedConfig.getDevicePerformanceClass() != 2) {
            i9 = 100;
        } else {
            i9 = 150;
        }
        A = i9;
        if (SharedConfig.getDevicePerformanceClass() != 2) {
            i10 = 10;
        } else {
            i10 = 30;
        }
        B = i10;
        float[] fArr = {0.3f, 0.6f, 1.0f};
        C = fArr;
        D = (float[][]) Array.newInstance(Float.TYPE, fArr.length, i9 * 5);
        E = new Path();
    }

    public l() {
        float[] fArr = C;
        this.f4613a = new Paint[fArr.length];
        this.f4614b = new float[fArr.length];
        this.f4615c = new Stack();
        this.f4616e = new float[14];
        this.f4617f = new int[fArr.length];
        this.h = new ArrayList();
        this.f4624n = -1.0f;
        this.f4629s = 255;
        this.f4630t = new a(0);
        this.f4635z = new RectF();
        for (int i9 = 0; i9 < fArr.length; i9++) {
            this.f4613a[i9] = new Paint();
            if (i9 == 0) {
                this.f4613a[i9].setStrokeWidth(AndroidUtilities.dp(1.4f));
                this.f4613a[i9].setStyle(Paint.Style.STROKE);
                this.f4613a[i9].setStrokeCap(Paint.Cap.ROUND);
            } else {
                this.f4613a[i9].setStrokeWidth(AndroidUtilities.dp(1.2f));
                this.f4613a[i9].setStyle(Paint.Style.STROKE);
                this.f4613a[i9].setStrokeCap(Paint.Cap.ROUND);
            }
            this.f4614b[i9] = this.f4613a[i9].getStrokeWidth() * 0.5f;
        }
        SharedConfig.getDevicePerformanceClass();
        h(0);
    }

    public static void a(View view, Layout layout, int i9, int i10, Spanned spanned, Stack stack, List list, ArrayList arrayList) {
        int i11;
        int i12;
        if (layout != null) {
            Object[] objArr = (wz0[]) spanned.getSpans(0, layout.getText().length(), wz0.class);
            for (int i13 = 0; i13 < Math.min(100, objArr.length); i13++) {
                if (objArr[i13].c()) {
                    int spanStart = spanned.getSpanStart(objArr[i13]);
                    int spanEnd = spanned.getSpanEnd(objArr[i13]);
                    if (i9 == -1 && i10 == -1) {
                        int lineForOffset = layout.getLineForOffset(spanEnd);
                        int i14 = Integer.MAX_VALUE;
                        int i15 = Integer.MIN_VALUE;
                        for (int lineForOffset2 = layout.getLineForOffset(spanStart); lineForOffset2 <= lineForOffset; lineForOffset2++) {
                            i14 = Math.min(i14, (int) layout.getLineLeft(lineForOffset2));
                            i15 = Math.max(i15, (int) layout.getLineRight(lineForOffset2));
                        }
                        i11 = i14;
                        i12 = i15;
                    } else {
                        i11 = i9;
                        i12 = i10;
                    }
                    layout.getSelectionPath(spanStart, spanEnd, new c(view, layout, stack, list, i11, i12, arrayList));
                }
            }
            if ((view instanceof TextView) && stack != null) {
                stack.clear();
            }
        }
    }

    public static void b(View view, Layout layout, int i9, int i10, Stack stack, List list) {
        if (layout.getText() instanceof Spanned) {
            a(view, layout, i9, i10, (Spanned) layout.getText(), stack, list, null);
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
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            Rect bounds = ((l) arrayList.get(i9)).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    public static void f(Canvas canvas, Layout layout) {
        if (canvas instanceof vu0) {
            int alpha = layout.getPaint().getAlpha();
            layout.getPaint().setAlpha((int) (alpha * 0.4f));
            if (G == null) {
                G = new WeakHashMap();
            }
            ArrayList arrayList = (ArrayList) G.get(layout);
            if (arrayList == null) {
                arrayList = new ArrayList();
                int lineCount = layout.getLineCount();
                for (int i9 = 0; i9 < lineCount; i9++) {
                    arrayList.add(new RectF(layout.getLineLeft(i9), layout.getLineTop(i9), layout.getLineRight(i9), layout.getLineBottom(i9)));
                }
                G.put(layout, arrayList);
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                canvas.drawRect((RectF) arrayList.get(i10), layout.getPaint());
            }
            layout.getPaint().setAlpha(alpha);
            return;
        }
        layout.draw(canvas);
    }

    public static void g(View view, boolean z10, int i9, int i10, AtomicReference atomicReference, int i11, Layout layout, List list, Canvas canvas, boolean z11) {
        StaticLayout staticLayout;
        AtomicReference atomicReference2;
        wz0[] wz0VarArr;
        int i12;
        boolean z12;
        TextPaint textPaint;
        if (list != null && !list.isEmpty()) {
            StaticLayout staticLayout2 = (Layout) atomicReference.get();
            int i13 = 0;
            if (staticLayout2 == null || !layout.getText().toString().equals(staticLayout2.getText().toString()) || layout.getWidth() != staticLayout2.getWidth() || layout.getHeight() != staticLayout2.getHeight()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(layout.getText());
                if (layout.getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) layout.getText();
                    wz0[] wz0VarArr2 = (wz0[]) spanned.getSpans(0, spanned.length(), wz0.class);
                    int i14 = 0;
                    while (i14 < Math.min(100, wz0VarArr2.length)) {
                        wz0 wz0Var = wz0VarArr2[i14];
                        if (wz0Var.c()) {
                            int spanStart = spanned.getSpanStart(wz0Var);
                            int spanEnd = spanned.getSpanEnd(wz0Var);
                            Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(spanStart, spanEnd, Emoji.EmojiSpan.class);
                            int length = emojiSpanArr.length;
                            while (i13 < length) {
                                wz0[] wz0VarArr3 = wz0VarArr2;
                                Emoji.EmojiSpan emojiSpan = emojiSpanArr[i13];
                                spannableStringBuilder.setSpan(new d(emojiSpan), spanned.getSpanStart(emojiSpan), spanned.getSpanEnd(emojiSpan), spanned.getSpanFlags(wz0Var));
                                spannableStringBuilder.removeSpan(emojiSpan);
                                i13++;
                                wz0VarArr2 = wz0VarArr3;
                                i14 = i14;
                                length = length;
                                emojiSpanArr = emojiSpanArr;
                            }
                            wz0VarArr = wz0VarArr2;
                            i12 = i14;
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(0), spanStart, spanEnd, spanned.getSpanFlags(wz0Var));
                            spannableStringBuilder.removeSpan(wz0Var);
                        } else {
                            wz0VarArr = wz0VarArr2;
                            i12 = i14;
                        }
                        i14 = i12 + 1;
                        wz0VarArr2 = wz0VarArr;
                        i13 = 0;
                    }
                }
                if (i11 == 1) {
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
                canvas.translate(0.0f, i10);
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
                    Rect bounds = ((l) it.next()).getBounds();
                    path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
                }
                int i15 = 0;
                if (!list.isEmpty() && ((l) list.get(0)).f4624n != -1.0f) {
                    canvas.save();
                    canvas.clipPath(path);
                    path.rewind();
                    if (!list.isEmpty()) {
                        ((l) list.get(0)).e(path);
                    }
                    canvas.clipPath(path);
                    canvas.translate(0.0f, -view.getPaddingTop());
                    f(canvas, layout);
                    canvas.restore();
                    i15 = 0;
                }
                if (((l) list.get(i15)).f4624n != -1.0f) {
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
                    l lVar = (l) it2.next();
                    lVar.f4631u = z10;
                    if (lVar.f4619i != view) {
                        lVar.f4619i = view;
                    }
                    boolean z13 = lVar.f4626p;
                    lVar.f4626p = false;
                    if (z13) {
                        if (i11 == 1) {
                            textPaint = layout.getPaint();
                        } else {
                            textPaint = f6.f23193o2;
                        }
                        lVar.h(i0.a.d(Math.max(0.0f, lVar.f4624n), i9, textPaint.getColor()));
                    } else {
                        lVar.h(i9);
                    }
                    lVar.draw(canvas);
                }
                if (z12) {
                    path.rewind();
                    ((l) list.get(0)).e(path);
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
        int i9;
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            if (o.f4641q == null) {
                o.f4641q = new o();
            }
            o oVar = o.f4641q;
            int i10 = oVar.f4650k;
            we.b[] bVarArr = oVar.f4644c;
            if (bVarArr[0] == null) {
                bVarArr[0] = new we.b(i10);
                oVar.f4647g = new Paint();
                oVar.f4648i = new ArrayList(100);
                float f10 = i10;
                int i11 = (int) (f10 / 10.0f);
                int dp = (int) ((f10 / AndroidUtilities.dp(200.0f)) * 60.0f);
                int i12 = 0;
                while (true) {
                    if (i12 >= 10) {
                        break;
                    }
                    int i13 = 0;
                    for (int i14 = 10; i13 < i14; i14 = 10) {
                        l lVar = new l();
                        lVar.f4633x = i10;
                        int i15 = i11 * i12;
                        int i16 = i11 * i13;
                        lVar.setBounds(i15, i16 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f) + i15 + i11, AndroidUtilities.dp(5.0f) + i16 + i11);
                        int min = Math.min(A * 5, dp);
                        lVar.d = min;
                        while (true) {
                            Stack stack = lVar.f4615c;
                            if (lVar.h.size() + stack.size() < min) {
                                stack.push(new Object());
                            }
                        }
                        lVar.h(-1);
                        oVar.f4648i.add(lVar);
                        i13++;
                    }
                    i12++;
                }
                i9 = 128;
                oVar.a(new Canvas((Bitmap) bVarArr[0].f48793b), new Rect(0, 0, i10, i10));
                oVar.f4647g.setShader((BitmapShader) bVarArr[0].f48794c);
                oVar.h = System.currentTimeMillis();
            } else {
                i9 = 128;
                if (oVar.f4655p && !LiteMode.isEnabled(128)) {
                    oVar.d = 0;
                    oVar.a(new Canvas((Bitmap) bVarArr[0].f48793b), new Rect(0, 0, i10, i10));
                    oVar.f4647g.setShader((BitmapShader) bVarArr[0].f48794c);
                    oVar.h = System.currentTimeMillis();
                    oVar.f4655p = false;
                }
            }
            Paint paint = oVar.f4647g;
            paint.setColorFilter(this.v);
            canvas.drawRect(bounds, paint);
            if (LiteMode.isEnabled(i9)) {
                ff.k d = ff.k.d();
                d.getClass();
                ff.k.c();
                d.d.add(this);
                if (o.f4641q == null) {
                    o.f4641q = new o();
                }
                o oVar2 = o.f4641q;
                oVar2.getClass();
                int i17 = bounds.left;
                int i18 = oVar2.f4650k;
                int i19 = ((i17 % i18) + i18) % i18;
                int i20 = ((bounds.top % i18) + i18) % i18;
                int min2 = Math.min(bounds.width(), i18) + i19;
                int min3 = Math.min(bounds.height(), i18) + i20;
                Rect rect = oVar2.f4652m;
                rect.union(i19, i20, Math.min(min2, i18), Math.min(min3, i18));
                if (min2 > i18) {
                    rect.union(0, i20, min2 - i18, Math.min(min3, i18));
                }
                if (min3 > i18) {
                    rect.union(i19, 0, Math.min(min2, i18), min3 - i18);
                }
                if (min2 > i18 && min3 > i18) {
                    rect.union(0, 0, min2 - i18, min3 - i18);
                }
                if (!oVar2.f4651l && !rect.isEmpty()) {
                    oVar2.f4651l = true;
                    Choreographer.getInstance().postFrameCallback(oVar2.f4653n);
                }
            }
        }
    }

    public final void e(Path path) {
        path.addCircle(this.f4621k, this.f4622l, g7.n.a(this.f4624n, 0.0f, 1.0f) * this.f4623m, Path.Direction.CW);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(int i9) {
        if (this.f4632w != i9) {
            int i10 = 0;
            while (true) {
                float[] fArr = C;
                if (i10 < fArr.length) {
                    this.f4613a[i10].setColor(i0.a.k(i9, (int) (this.f4629s * fArr[i10])));
                    i10++;
                } else {
                    this.v = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
                    this.f4632w = i9;
                    return;
                }
            }
        }
    }

    public final void i(float f10, float f11, float f12) {
        if (this.f4618g == null) {
            this.f4618g = new RectF();
        }
        RectF rectF = this.f4618g;
        if (rectF.left == 0.0f && rectF.right == f11 && rectF.top == f10 && rectF.bottom == f12) {
            return;
        }
        rectF.left = 0.0f;
        rectF.top = f10;
        rectF.right = f11;
        rectF.bottom = f12;
        invalidateSelf();
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        View view = this.f4619i;
        if (view != null) {
            if (view.getParent() != null && this.f4631u) {
                ((View) view.getParent()).invalidate();
            } else if (view instanceof a0) {
                ((a0) view).l();
            } else {
                view.invalidate();
            }
        }
    }

    public final void j(float f10, float f11, float f12, boolean z10) {
        float f13;
        int alpha;
        this.f4621k = f10;
        this.f4622l = f11;
        this.f4623m = f12;
        float f14 = 0.0f;
        if (z10) {
            f13 = 1.0f;
        } else {
            f13 = 0.0f;
        }
        this.f4624n = f13;
        this.f4625o = z10;
        ValueAnimator valueAnimator = this.f4628r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f4625o) {
            alpha = 255;
        } else {
            alpha = this.f4613a[C.length - 1].getAlpha();
        }
        float f15 = this.f4624n;
        if (!z10) {
            f14 = 1.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f15, f14).setDuration(g7.n.a(this.f4623m * 0.3f, 250.0f, 550.0f));
        this.f4628r = duration;
        duration.setInterpolator(this.f4630t);
        this.f4628r.addUpdateListener(new b(this, alpha, 0));
        this.f4628r.addListener(new ag.e(this, 2));
        this.f4628r.start();
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.f4635z;
        rectF.set(rect);
        rectF.inset(0.0f, AndroidUtilities.dp(2.5f));
    }

    @Override
    public final void setAlpha(int i9) {
        this.f4629s = i9;
        int i10 = 0;
        while (true) {
            float[] fArr = C;
            if (i10 < fArr.length) {
                this.f4613a[i10].setAlpha((int) (fArr[i10] * i9));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void setBounds(int i9, int i10, int i11, int i12) {
        super.setBounds(i9, i10, i11, i12);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (!getBounds().contains((int) eVar.f4578a, (int) eVar.f4579b)) {
                it.remove();
            }
            Stack stack = this.f4615c;
            if (stack.size() < this.d) {
                stack.push(eVar);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        for (Paint paint : this.f4613a) {
            paint.setColorFilter(colorFilter);
        }
    }
}
