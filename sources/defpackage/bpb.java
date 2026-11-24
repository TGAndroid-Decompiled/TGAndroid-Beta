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
public class bpb extends FrameLayout implements jm7, vlb {
    public ValueAnimator E;
    public TextPaint F;
    public StaticLayout G;
    public hf2 H;
    public final bf0 I;
    public final int J;
    public zcb K;
    public final byte L;
    public int M;
    public float N;
    public a92 O;
    public boolean P;
    public final ImageReceiver Q;
    public pc0 R;
    public final m37 S;
    public final m37 T;
    public TLRPC.WallPaper U;
    public long V;
    public int W;
    public final float a;
    public boolean a0;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public apb f;
    public apb h;
    public float n;
    public final Paint r;
    public final Paint s;
    public final RectF w;
    public final Path x;
    public final ylb y;

    public bpb(int i, int i2, ylb ylbVar, Context context) {
        super(context);
        this.a = gm.L(8.0f);
        this.b = gm.L(6.0f);
        this.c = gm.L(4.0f);
        this.d = gm.L(21.0f);
        this.e = gm.L(41.0f);
        this.f = new apb(this);
        this.n = 1.0f;
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.w = new RectF();
        this.x = new Path();
        this.S = new m37(0, true, false, null);
        this.T = new m37(0, false, false, null);
        this.L = i2;
        this.J = i;
        this.y = ylbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Q = imageReceiver;
        imageReceiver.q0(gm.L(8.0f));
        anb.h(cmb.h5, ylbVar, this);
        bf0 bf0Var = new bf0(context);
        this.I = bf0Var;
        bf0Var.getImageReceiver().B0 = true;
        bf0Var.getImageReceiver().v0 = false;
        bf0Var.getImageReceiver().M(0);
        if (i2 != 0 && i2 != 3 && i2 != 2) {
            addView(bf0Var, qoe.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        } else {
            addView(bf0Var, qoe.d(28, 28.0f, 81, 0.0f, 0.0f, 0.0f, 12.0f));
        }
        paint.setStrokeWidth(gm.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(551805923);
    }

    public static Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        float max = Math.max(gm.L(120.0f) / bitmap.getWidth(), gm.L(140.0f) / bitmap.getHeight());
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
        textPaint.setColor(cmb.v0(cmb.Nf, this.y));
        this.F.setTextSize(gm.L(c()));
        this.F.setTypeface(gm.o());
        int L = gm.L(52.0f);
        byte b = this.L;
        if (b == 3 || b == 4) {
            L = gm.L(77.0f);
        }
        String b2 = b();
        TextPaint textPaint2 = this.F;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        StaticLayout d = oya.d(b2, textPaint2, true, L, 3);
        this.G = d;
        return d;
    }

    public String b() {
        return jb6.M0(2131752154, null);
    }

    public int c() {
        return 14;
    }

    public final void d() {
        if (this.I.getImageReceiver().y() != null) {
            gm.r(this.K);
            this.I.setVisibility(0);
            if (!this.I.getImageReceiver().y().l0) {
                this.I.getImageReceiver().y().I(0, true, false);
                this.I.getImageReceiver().y().start();
            }
            this.I.animate().scaleX(2.0f).scaleY(2.0f).setDuration(300L).setInterpolator(gm.H).start();
            zcb zcbVar = new zcb(this, (byte) 14);
            this.K = zcbVar;
            gm.d3(zcbVar, 2500L);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.m4) {
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        apb apbVar;
        apb apbVar2;
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
        if (this.n != 1.0f && (apbVar2 = this.h) != null) {
            apbVar2.b(canvas, 1.0f);
        }
        float f = this.n;
        if (f != 0.0f) {
            this.f.b(canvas, f);
        }
        if (this.n != 1.0f && (apbVar = this.h) != null) {
            apbVar.a(canvas, 1.0f);
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

    public final void f(defpackage.hf2 r26, long r27, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpb.f(hf2, long, boolean):void");
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
            ofFloat.addUpdateListener(new rha(this, (byte) 26));
            this.E.addListener(new sw9((byte) 8, this, z));
            this.E.setDuration(250L);
            this.E.start();
        }
        this.a0 = z;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.e().b(this, nm7.m4);
        this.P = true;
        a92 a92Var = this.O;
        if (a92Var != null) {
            a92Var.f(this);
        }
        this.Q.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.m4);
        this.P = false;
        a92 a92Var = this.O;
        if (a92Var != null) {
            a92Var.g(this);
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
            int L = gm.L(f);
            int size = View.MeasureSpec.getSize(i2);
            if (size == 0) {
                size = (int) (L * 1.35f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        } else {
            int size2 = View.MeasureSpec.getSize(i);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 1.2f), 1073741824));
        }
        bf0 bf0Var = this.I;
        bf0Var.setPivotY(bf0Var.getMeasuredHeight());
        bf0Var.setPivotX(bf0Var.getMeasuredWidth() / 2.0f);
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
        int i2 = cmb.h5;
        ylb ylbVar = this.y;
        this.s.setColor(cmb.v0(i2, ylbVar));
        TextPaint textPaint = this.F;
        if (textPaint != null) {
            textPaint.setColor(cmb.v0(cmb.Nf, ylbVar));
        }
        invalidate();
    }

    public void setFallbackWallpaper(TLRPC.WallPaper wallPaper) {
        if (this.U != wallPaper) {
            this.U = wallPaper;
            hf2 hf2Var = this.H;
            if (hf2Var != null) {
                this.H = null;
                f(hf2Var, 0L, false);
            }
        }
    }

    @Override
    public final void updateColors() {
        ylb ylbVar = this.y;
        try {
            this.s.setColor(cmb.v0(cmb.h5, ylbVar));
            TextPaint textPaint = this.F;
            if (textPaint != null) {
                textPaint.setColor(cmb.v0(cmb.Nf, ylbVar));
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
