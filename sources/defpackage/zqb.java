package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public class zqb extends FrameLayout implements fn7, snb {
    public ValueAnimator E;
    public TextPaint F;
    public StaticLayout G;
    public ne2 H;
    public final de0 I;
    public final int J;
    public s8b K;
    public final byte L;
    public int M;
    public float N;
    public g82 O;
    public boolean P;
    public final ImageReceiver Q;
    public rb0 R;
    public final t37 S;
    public final t37 T;
    public TLRPC.WallPaper U;
    public long V;
    public int W;
    public final float a;
    public boolean a0;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public yqb f;
    public yqb h;
    public float n;
    public final Paint r;
    public final Paint s;
    public final RectF w;
    public final Path x;
    public final vnb y;

    public zqb(int i, int i2, vnb vnbVar, Context context) {
        super(context);
        this.a = hl.L(8.0f);
        this.b = hl.L(6.0f);
        this.c = hl.L(4.0f);
        this.d = hl.L(21.0f);
        this.e = hl.L(41.0f);
        this.f = new yqb(this);
        this.n = 1.0f;
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.w = new RectF();
        this.x = new Path();
        this.S = new t37(0, true, false, null);
        this.T = new t37(0, false, false, null);
        this.L = i2;
        this.J = i;
        this.y = vnbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Q = imageReceiver;
        imageReceiver.q0(hl.L(8.0f));
        yob.h(aob.i5, vnbVar, this);
        de0 de0Var = new de0(context);
        this.I = de0Var;
        de0Var.getImageReceiver().B0 = true;
        de0Var.getImageReceiver().v0 = false;
        de0Var.getImageReceiver().M(0);
        if (i2 != 0 && i2 != 3 && i2 != 2) {
            addView(de0Var, tre.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(de0Var, tre.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        }
        paint.setStrokeWidth(hl.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(551805923);
    }

    public static Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        float max = Math.max(hl.L(120.0f) / bitmap.getWidth(), hl.L(140.0f) / bitmap.getHeight());
        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && Math.abs(max - 1.0f) >= 0.0125f) {
            int width = (int) (bitmap.getWidth() * max);
            int height = (int) (bitmap.getHeight() * max);
            if (height > 0 && width > 0) {
                return Bitmap.createScaledBitmap(bitmap, width, height, true);
            }
            return bitmap;
        }
        return bitmap;
    }

    public StaticLayout getNoThemeStaticLayout() {
        StaticLayout staticLayout = this.G;
        if (staticLayout != null) {
            return staticLayout;
        }
        TextPaint textPaint = new TextPaint(129);
        this.F = textPaint;
        textPaint.setColor(aob.v0(aob.Of, this.y));
        this.F.setTextSize(hl.L(c()));
        this.F.setTypeface(hl.o());
        int L = hl.L(52.0f);
        byte b = this.L;
        if (b == 3 || b == 4) {
            L = hl.L(77.0f);
        }
        String b2 = b();
        TextPaint textPaint2 = this.F;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = o0b.d(b2, textPaint2, true, L, 3);
        this.G = d;
        return d;
    }

    public String b() {
        return ob6.M0(2131752182, null);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.I.getImageReceiver().y() != null) {
            hl.r(this.K);
            this.I.setVisibility(0);
            if (!this.I.getImageReceiver().y().l0) {
                this.I.getImageReceiver().y().I(0, true, false);
                this.I.getImageReceiver().y().start();
            }
            this.I.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(hl.H).start();
            s8b s8bVar = new s8b(this, (byte) 23);
            this.K = s8bVar;
            hl.d3(s8bVar, 2500L);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        yqb yqbVar;
        yqb yqbVar2;
        if (this.H == null) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.O != null) {
            canvas.save();
            canvas.clipPath(this.x);
            this.O.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.O.draw(canvas);
            canvas.restore();
        }
        if (this.n != 1.0f && (yqbVar2 = this.h) != null) {
            yqbVar2.b(canvas, 1.0f);
        }
        float f = this.n;
        if (f != 0.0f) {
            this.f.b(canvas, f);
        }
        if (this.n != 1.0f && (yqbVar = this.h) != null) {
            yqbVar.a(canvas, 1.0f);
        }
        float f2 = this.n;
        if (f2 != 0.0f) {
            this.f.a(canvas, f2);
        }
        float f3 = this.n;
        if (f3 != 1.0f) {
            float f4 = f3 + 0.10666667f;
            this.n = f4;
            if (f4 >= 1.0f) {
                this.n = 1.0f;
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void f(defpackage.ne2 r26, long r27, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zqb.f(ne2, long, boolean):void");
    }

    public final void g(boolean z, boolean z2) {
        float f = 0.0f;
        if (!z2) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.a0 = z;
            if (z) {
                f = 1.0f;
            }
            this.N = f;
            invalidate();
            return;
        }
        if (this.a0 != z) {
            float f2 = this.N;
            ValueAnimator valueAnimator2 = this.E;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            if (z) {
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.E = ofFloat;
            ofFloat.addUpdateListener(new ija(this, (byte) 26));
            this.E.addListener(new i1a((byte) 7, this, z));
            this.E.setDuration(250L);
            this.E.start();
        }
        this.a0 = z;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.e().b(this, jn7.l4);
        this.P = true;
        g82 g82Var = this.O;
        if (g82Var != null) {
            g82Var.f(this);
        }
        this.Q.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.l4);
        this.P = false;
        g82 g82Var = this.O;
        if (g82Var != null) {
            g82Var.g(this);
        }
        this.Q.K();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setSelected(this.a0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        byte b = this.L;
        if (b != 1 && b != 4) {
            if (b == 0) {
                f = 77.0f;
            } else {
                f = 83.0f;
            }
            int L = hl.L(f);
            int size = View.MeasureSpec.getSize(i2);
            if (size == 0) {
                size = (int) (L * 1.35f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        } else {
            int size2 = View.MeasureSpec.getSize(i);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 1.2f), 1073741824));
        }
        de0 de0Var = this.I;
        de0Var.setPivotY(de0Var.getMeasuredHeight());
        de0Var.setPivotX(de0Var.getMeasuredWidth() / 2.0f);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        float f = this.c;
        RectF rectF = this.w;
        rectF.set(f, f, i - f, i2 - f);
        Path path = this.x;
        path.reset();
        float f2 = this.b;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
    }

    @Override
    public void setBackgroundColor(int i) {
        int i2 = aob.i5;
        vnb vnbVar = this.y;
        this.s.setColor(aob.v0(i2, vnbVar));
        TextPaint textPaint = this.F;
        if (textPaint != null) {
            textPaint.setColor(aob.v0(aob.Of, vnbVar));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.U != wallPaper) {
            this.U = wallPaper;
            ne2 ne2Var = this.H;
            if (ne2Var != null) {
                this.H = null;
                f(ne2Var, 0L, false);
            }
        }
    }

    @Override
    public final void updateColors() {
        vnb vnbVar = this.y;
        try {
            this.s.setColor(aob.v0(aob.i5, vnbVar));
            TextPaint textPaint = this.F;
            if (textPaint != null) {
                textPaint.setColor(aob.v0(aob.Of, vnbVar));
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
