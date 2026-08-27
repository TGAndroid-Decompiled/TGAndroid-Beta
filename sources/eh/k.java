package eh;

import ag.r1;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.yz0;

public final class k extends Drawable {
    public static final int A;
    public static final int B;
    public static final float[] C;
    public static final float[][] D;
    public static final Path E;
    public static Paint F;
    public static WeakHashMap G;

    public final Paint[] f5511a;

    public final float[] f5512b;

    public final Stack f5513c;
    public int d;

    public final float[] f5514e;

    public final int[] f5515f;

    public RectF f5516g;
    public final ArrayList h;

    public View f5517i;

    public long f5518j;

    public float f5519k;

    public float f5520l;

    public float f5521m;

    public float f5522n;

    public boolean f5523o;

    public boolean f5524p;

    public Runnable f5525q;

    public ValueAnimator f5526r;

    public int f5527s;

    public TimeInterpolator f5528t;

    public boolean f5529u;
    public PorterDuffColorFilter v;

    public int f5530w;

    public int f5531x;

    public boolean f5532y;

    public final RectF f5533z;

    static {
        int i10 = SharedConfig.getDevicePerformanceClass() != 2 ? 100 : 150;
        A = i10;
        B = SharedConfig.getDevicePerformanceClass() != 2 ? 10 : 30;
        float[] fArr = {0.3f, 0.6f, 1.0f};
        C = fArr;
        D = (float[][]) Array.newInstance((Class<?>) Float.TYPE, fArr.length, i10 * 5);
        E = new Path();
    }

    public k() {
        float[] fArr = C;
        this.f5511a = new Paint[fArr.length];
        this.f5512b = new float[fArr.length];
        this.f5513c = new Stack();
        this.f5514e = new float[14];
        this.f5515f = new int[fArr.length];
        this.h = new ArrayList();
        this.f5522n = -1.0f;
        this.f5527s = 255;
        this.f5528t = new a(0);
        this.f5533z = new RectF();
        for (int i10 = 0; i10 < fArr.length; i10++) {
            this.f5511a[i10] = new Paint();
            if (i10 == 0) {
                this.f5511a[i10].setStrokeWidth(AndroidUtilities.dp(1.4f));
                this.f5511a[i10].setStyle(Paint.Style.STROKE);
                this.f5511a[i10].setStrokeCap(Paint.Cap.ROUND);
            } else {
                this.f5511a[i10].setStrokeWidth(AndroidUtilities.dp(1.2f));
                this.f5511a[i10].setStyle(Paint.Style.STROKE);
                this.f5511a[i10].setStrokeCap(Paint.Cap.ROUND);
            }
            this.f5512b[i10] = this.f5511a[i10].getStrokeWidth() * 0.5f;
        }
        SharedConfig.getDevicePerformanceClass();
        h(0);
    }

    public static void a(View view, Layout layout, int i10, int i11, Spanned spanned, Stack stack, List list, ArrayList arrayList) {
        int i12;
        int i13;
        if (layout == null) {
            return;
        }
        yz0[] yz0VarArr = (yz0[]) spanned.getSpans(0, layout.getText().length(), yz0.class);
        for (int i14 = 0; i14 < Math.min(100, yz0VarArr.length); i14++) {
            if (yz0VarArr[i14].c()) {
                int spanStart = spanned.getSpanStart(yz0VarArr[i14]);
                int spanEnd = spanned.getSpanEnd(yz0VarArr[i14]);
                if (i10 == -1 && i11 == -1) {
                    int lineForOffset = layout.getLineForOffset(spanEnd);
                    int iMin = Integer.MAX_VALUE;
                    int iMax = Integer.MIN_VALUE;
                    for (int lineForOffset2 = layout.getLineForOffset(spanStart); lineForOffset2 <= lineForOffset; lineForOffset2++) {
                        iMin = Math.min(iMin, (int) layout.getLineLeft(lineForOffset2));
                        iMax = Math.max(iMax, (int) layout.getLineRight(lineForOffset2));
                    }
                    i12 = iMin;
                    i13 = iMax;
                } else {
                    i12 = i10;
                    i13 = i11;
                }
                layout.getSelectionPath(spanStart, spanEnd, new c(view, layout, stack, list, i12, i13, arrayList));
            }
        }
        if (!(view instanceof TextView) || stack == null) {
            return;
        }
        stack.clear();
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
        if (!(canvas instanceof xu0)) {
            layout.draw(canvas);
            return;
        }
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
    }

    public static void g(View view, boolean z10, int i10, int i11, AtomicReference atomicReference, int i12, Layout layout, List list, Canvas canvas, boolean z11) {
        StaticLayout staticLayout;
        yz0[] yz0VarArr;
        int i13;
        if (list == null || list.isEmpty()) {
            f(canvas, layout);
            return;
        }
        Layout layoutBuild = (Layout) atomicReference.get();
        int i14 = 0;
        if (layoutBuild == null || !layout.getText().toString().equals(layoutBuild.getText().toString()) || layout.getWidth() != layoutBuild.getWidth() || layout.getHeight() != layoutBuild.getHeight()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(layout.getText());
            if (layout.getText() instanceof Spanned) {
                Spanned spanned = (Spanned) layout.getText();
                yz0[] yz0VarArr2 = (yz0[]) spanned.getSpans(0, spanned.length(), yz0.class);
                int i15 = 0;
                while (i15 < Math.min(100, yz0VarArr2.length)) {
                    yz0 yz0Var = yz0VarArr2[i15];
                    if (yz0Var.c()) {
                        int spanStart = spanned.getSpanStart(yz0Var);
                        int spanEnd = spanned.getSpanEnd(yz0Var);
                        Emoji.EmojiSpan[] emojiSpanArr = (Emoji.EmojiSpan[]) spanned.getSpans(spanStart, spanEnd, Emoji.EmojiSpan.class);
                        int length = emojiSpanArr.length;
                        while (i14 < length) {
                            yz0[] yz0VarArr3 = yz0VarArr2;
                            Emoji.EmojiSpan emojiSpan = emojiSpanArr[i14];
                            spannableStringBuilder.setSpan(new d(emojiSpan), spanned.getSpanStart(emojiSpan), spanned.getSpanEnd(emojiSpan), spanned.getSpanFlags(yz0Var));
                            spannableStringBuilder.removeSpan(emojiSpan);
                            i14++;
                            yz0VarArr2 = yz0VarArr3;
                            i15 = i15;
                            length = length;
                            emojiSpanArr = emojiSpanArr;
                        }
                        yz0VarArr = yz0VarArr2;
                        i13 = i15;
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(0), spanStart, spanEnd, spanned.getSpanFlags(yz0Var));
                        spannableStringBuilder.removeSpan(yz0Var);
                    } else {
                        yz0VarArr = yz0VarArr2;
                        i13 = i15;
                    }
                    i15 = i13 + 1;
                    yz0VarArr2 = yz0VarArr;
                    i14 = 0;
                }
            }
            if (i12 == 1) {
                staticLayout = new StaticLayout(spannableStringBuilder, layout.getPaint(), layout.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, AndroidUtilities.dp(1.66f), false);
            } else {
                if (Build.VERSION.SDK_INT >= 24) {
                    layoutBuild = StaticLayout.Builder.obtain(spannableStringBuilder, 0, spannableStringBuilder.length(), layout.getPaint(), layout.getWidth()).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(layout.getAlignment()).setLineSpacing(layout.getSpacingAdd(), layout.getSpacingMultiplier()).build();
                } else {
                    staticLayout = new StaticLayout(spannableStringBuilder, layout.getPaint(), layout.getWidth(), layout.getAlignment(), layout.getSpacingMultiplier(), layout.getSpacingAdd(), false);
                }
                atomicReference.set(layoutBuild);
            }
            layoutBuild = staticLayout;
            atomicReference.set(layoutBuild);
        }
        if (list.isEmpty()) {
            f(canvas, layout);
        } else {
            canvas.save();
            canvas.translate(0.0f, i11);
            layoutBuild.draw(canvas);
            canvas.restore();
        }
        if (list.isEmpty()) {
            return;
        }
        Path path = E;
        path.rewind();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Rect bounds = ((k) it.next()).getBounds();
            path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
        }
        int i16 = 0;
        if (!list.isEmpty() && ((k) list.get(0)).f5522n != -1.0f) {
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
        boolean z12 = ((k) list.get(i16)).f5522n != -1.0f;
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
            kVar.f5529u = z10;
            if (kVar.f5517i != view) {
                kVar.f5517i = view;
            }
            boolean z13 = kVar.f5524p;
            kVar.f5524p = false;
            if (z13) {
                kVar.h(i0.b.d(Math.max(0.0f, kVar.f5522n), i10, (i12 == 1 ? layout.getPaint() : g6.f23247o2).getColor()));
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
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        if (m.f5537q == null) {
            m.f5537q = new m();
        }
        m mVar = m.f5537q;
        int i11 = mVar.f5546k;
        xe.b[] bVarArr = mVar.f5540c;
        if (bVarArr[0] == null) {
            bVarArr[0] = new xe.b(i11);
            mVar.f5543g = new Paint();
            mVar.f5544i = new ArrayList(100);
            float f10 = i11;
            int i12 = (int) (f10 / 10.0f);
            int iDp = (int) ((f10 / AndroidUtilities.dp(200.0f)) * 60.0f);
            int i13 = 0;
            while (true) {
                if (i13 >= 10) {
                    break;
                }
                int i14 = 0;
                for (int i15 = 10; i14 < i15; i15 = 10) {
                    k kVar = new k();
                    kVar.f5531x = i11;
                    int i16 = i12 * i13;
                    int i17 = i12 * i14;
                    kVar.setBounds(i16, i17 - AndroidUtilities.dp(5.0f), AndroidUtilities.dp(3.0f) + i16 + i12, AndroidUtilities.dp(5.0f) + i17 + i12);
                    int iMin = Math.min(A * 5, iDp);
                    kVar.d = iMin;
                    while (true) {
                        Stack stack = kVar.f5513c;
                        if (kVar.h.size() + stack.size() < iMin) {
                            stack.push(new e());
                        }
                    }
                    kVar.h(-1);
                    mVar.f5544i.add(kVar);
                    i14++;
                }
                i13++;
            }
            i10 = 128;
            mVar.a(new Canvas((Bitmap) bVarArr[0].f49392b), new Rect(0, 0, i11, i11));
            mVar.f5543g.setShader((BitmapShader) bVarArr[0].f49393c);
            mVar.h = System.currentTimeMillis();
        } else {
            i10 = 128;
            if (mVar.f5551p && !LiteMode.isEnabled(128)) {
                mVar.d = 0;
                mVar.a(new Canvas((Bitmap) bVarArr[0].f49392b), new Rect(0, 0, i11, i11));
                mVar.f5543g.setShader((BitmapShader) bVarArr[0].f49393c);
                mVar.h = System.currentTimeMillis();
                mVar.f5551p = false;
            }
        }
        Paint paint = mVar.f5543g;
        paint.setColorFilter(this.v);
        canvas.drawRect(bounds, paint);
        if (LiteMode.isEnabled(i10)) {
            gf.k kVarD = gf.k.d();
            kVarD.getClass();
            gf.k.c();
            kVarD.d.add(this);
            if (m.f5537q == null) {
                m.f5537q = new m();
            }
            m mVar2 = m.f5537q;
            mVar2.getClass();
            int i18 = bounds.left;
            int i19 = mVar2.f5546k;
            int i20 = ((i18 % i19) + i19) % i19;
            int i21 = ((bounds.top % i19) + i19) % i19;
            int iMin2 = Math.min(bounds.width(), i19) + i20;
            int iMin3 = Math.min(bounds.height(), i19) + i21;
            Rect rect = mVar2.f5548m;
            rect.union(i20, i21, Math.min(iMin2, i19), Math.min(iMin3, i19));
            if (iMin2 > i19) {
                rect.union(0, i21, iMin2 - i19, Math.min(iMin3, i19));
            }
            if (iMin3 > i19) {
                rect.union(i20, 0, Math.min(iMin2, i19), iMin3 - i19);
            }
            if (iMin2 > i19 && iMin3 > i19) {
                rect.union(0, 0, iMin2 - i19, iMin3 - i19);
            }
            if (mVar2.f5547l || rect.isEmpty()) {
                return;
            }
            mVar2.f5547l = true;
            Choreographer.getInstance().postFrameCallback(mVar2.f5549n);
        }
    }

    public final void e(Path path) {
        path.addCircle(this.f5519k, this.f5520l, h7.n.a(this.f5522n, 0.0f, 1.0f) * this.f5521m, Path.Direction.CW);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(int i10) {
        if (this.f5530w == i10) {
            return;
        }
        int i11 = 0;
        while (true) {
            float[] fArr = C;
            if (i11 >= fArr.length) {
                this.v = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
                this.f5530w = i10;
                return;
            } else {
                this.f5511a[i11].setColor(i0.b.k(i10, (int) (this.f5527s * fArr[i11])));
                i11++;
            }
        }
    }

    public final void i(float f10, float f11, float f12) {
        if (this.f5516g == null) {
            this.f5516g = new RectF();
        }
        RectF rectF = this.f5516g;
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
        View view = this.f5517i;
        if (view != null) {
            if (view.getParent() != null && this.f5529u) {
                ((View) view.getParent()).invalidate();
            } else if (view instanceof a0) {
                ((a0) view).l();
            } else {
                view.invalidate();
            }
        }
    }

    public final void j(float f10, float f11, float f12, boolean z10) {
        this.f5519k = f10;
        this.f5520l = f11;
        this.f5521m = f12;
        this.f5522n = z10 ? 1.0f : 0.0f;
        this.f5523o = z10;
        ValueAnimator valueAnimator = this.f5526r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int alpha = this.f5523o ? 255 : this.f5511a[C.length - 1].getAlpha();
        ValueAnimator duration = ValueAnimator.ofFloat(this.f5522n, z10 ? 0.0f : 1.0f).setDuration((long) h7.n.a(this.f5521m * 0.3f, 250.0f, 550.0f));
        this.f5526r = duration;
        duration.setInterpolator(this.f5528t);
        this.f5526r.addUpdateListener(new b(this, alpha, 0));
        this.f5526r.addListener(new r1(this, 4));
        this.f5526r.start();
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.f5533z;
        rectF.set(rect);
        rectF.inset(0.0f, AndroidUtilities.dp(2.5f));
    }

    @Override
    public final void setAlpha(int i10) {
        this.f5527s = i10;
        int i11 = 0;
        while (true) {
            float[] fArr = C;
            if (i11 >= fArr.length) {
                return;
            }
            this.f5511a[i11].setAlpha((int) (fArr[i11] * i10));
            i11++;
        }
    }

    @Override
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (!getBounds().contains((int) eVar.f5477a, (int) eVar.f5478b)) {
                it.remove();
            }
            Stack stack = this.f5513c;
            if (stack.size() < this.d) {
                stack.push(eVar);
            }
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        for (Paint paint : this.f5511a) {
            paint.setColorFilter(colorFilter);
        }
    }
}
