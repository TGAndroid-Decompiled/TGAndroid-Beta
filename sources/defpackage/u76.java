package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;
public final class u76 extends FrameLayout implements RendererCommon.RendererEvents, gk7 {
    public long E;
    public c30 F;
    public boolean G;
    public float H;
    public boolean I;
    public int a;
    public final oi3 b;
    public TextureViewRenderer c;
    public TextureView d;
    public a86 e;
    public s71 f;
    public Bitmap h;
    public long n;
    public boolean r;
    public final be0 s;
    public View w;
    public Runnable x;
    public boolean y;

    public u76(Context context, int i) {
        super(context);
        this.a = i;
        be0 be0Var = new be0(context);
        this.s = be0Var;
        be0Var.setAlpha(0.75f);
        addView(be0Var, nme.e(-1, -1, 119));
        oi3 oi3Var = new oi3(context);
        this.b = oi3Var;
        oi3Var.setAlpha(0.0f);
        oi3Var.setVisibility(8);
        addView(oi3Var, nme.e(-1, -1, 119));
    }

    private void setStreamMode(boolean z) {
        int i;
        int i2;
        int i3;
        View view = this.b;
        if (z) {
            if (this.e == null) {
                int indexOfChild = indexOfChild(view);
                s71 s71Var = new s71(getContext(), (byte) 14);
                this.f = s71Var;
                addView(s71Var, indexOfChild, nme.e(-1, -1, 119));
                a86 a86Var = new a86(getContext(), new gi3(this));
                this.e = a86Var;
                addView(a86Var, indexOfChild + 1, nme.e(-1, -1, 119));
                this.e.setAlpha(0.0f);
            }
        } else if (this.d == null) {
            int indexOfChild2 = indexOfChild(view);
            TextureView textureView = new TextureView(getContext());
            this.d = textureView;
            addView(textureView, indexOfChild2, nme.e(-1, -1, 119));
            TextureViewRenderer textureViewRenderer = new TextureViewRenderer(getContext());
            this.c = textureViewRenderer;
            textureViewRenderer.setOpaque(false);
            this.c.setEnableHardwareScaler(true);
            this.c.setIsCamera(true);
            this.c.setRotateTextureWithScreen(true);
            this.c.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView(this.c, indexOfChild2 + 1, nme.e(-1, -1, 119));
            this.c.setAlpha(1.0f);
            if (isAttachedToWindow()) {
                c();
            }
        }
        a86 a86Var2 = this.e;
        int i4 = 8;
        if (a86Var2 != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            a86Var2.setVisibility(i2);
            s71 s71Var2 = this.f;
            if (z) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            s71Var2.setVisibility(i3);
        }
        TextureViewRenderer textureViewRenderer2 = this.c;
        if (textureViewRenderer2 == null) {
            textureViewRenderer2 = null;
        }
        if (textureViewRenderer2 != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            textureViewRenderer2.setVisibility(i);
            TextureView textureView2 = this.d;
            if (!z) {
                i4 = 0;
            }
            textureView2.setVisibility(i4);
        }
        if (this.r != z) {
            this.r = z;
            this.y = false;
            f(false, false);
            requestLayout();
        }
    }

    public final void a(t76 t76Var) {
        if (t76Var instanceof um9) {
            setStreamMode(true);
            ((um9) t76Var).L(this.e);
        } else if (t76Var instanceof nm9) {
            setStreamMode(false);
            ((nm9) t76Var).L(getSink());
        }
    }

    public final void b(View view, int i, int i2) {
        float measuredWidth = view.getMeasuredWidth();
        float f = i;
        float measuredHeight = view.getMeasuredHeight();
        float f2 = i2;
        float max = Math.max(measuredWidth / f, measuredHeight / f2);
        view.setScaleX(max);
        view.setScaleY(max);
        view.setTranslationX((f - (measuredWidth * max)) / 2.0f);
        view.setTranslationY(((f2 - (measuredHeight * max)) / 2.0f) - (this.H / 2.0f));
    }

    public final void c() {
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            textureViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
            this.c.setBackgroundRenderer(this.d);
        }
    }

    public final void d(Runnable runnable, boolean z) {
        float f;
        nk3 nk3Var;
        if (this.I == z) {
            return;
        }
        this.I = z;
        oi3 oi3Var = this.b;
        int i = 0;
        oi3Var.setVisibility(0);
        u41 u41Var = (u41) oi3Var.d;
        ViewPropertyAnimator animate = oi3Var.animate();
        if (this.I) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        animate.alpha(f).setInterpolator(s33.h).setDuration(320L).withEndAction(new x6c((byte) 23, this, z)).start();
        u41Var.setVisibility((!z || runnable == null) ? 8 : 8);
        if (runnable == null) {
            nk3Var = null;
        } else {
            nk3Var = new nk3(runnable, (byte) 5);
        }
        u41Var.setOnClickListener(nk3Var);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        t76 t76Var;
        r76 r76Var;
        if (i == kk7.F2) {
            long longValue = ((Long) objArr[0]).longValue();
            c30 c30Var = this.F;
            if (c30Var != null && (t76Var = (t76) c30Var.b) != null && t76Var.j() == longValue) {
                boolean p = ((t76) this.F.b).p();
                if (((t76) this.F.b).b()) {
                    t76 t76Var2 = (t76) this.F.b;
                    Objects.requireNonNull(t76Var2);
                    r76Var = new r76(t76Var2, (byte) 9);
                } else {
                    r76Var = null;
                }
                d(r76Var, p);
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (gl.m0) {
            if (this.r) {
                if (this.f != null) {
                    canvas.save();
                    canvas.translate(this.f.getX(), this.f.getY());
                    this.f.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            }
            TextureView textureView = this.d;
            if (textureView != null && (bitmap = textureView.getBitmap()) != null) {
                canvas.save();
                canvas.translate(this.d.getX(), this.d.getY());
                canvas.scale((this.d.getScaleX() * this.d.getWidth()) / bitmap.getWidth(), (this.d.getScaleY() * this.d.getHeight()) / bitmap.getHeight());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                canvas.restore();
                return;
            }
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (gl.m0 && (view instanceof TextureView) && view.getVisibility() == 0) {
            TextureView textureView = (TextureView) view;
            Bitmap bitmap = textureView.getBitmap();
            if (bitmap != null) {
                canvas.save();
                canvas.translate(textureView.getX(), textureView.getY());
                canvas.scale((textureView.getScaleX() * textureView.getWidth()) / bitmap.getWidth(), (textureView.getScaleY() * textureView.getHeight()) / bitmap.getHeight());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(long r27, defpackage.c30 r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u76.e(long, c30):void");
    }

    public final void f(boolean z, boolean z2) {
        View textureView;
        if ((!z && z2) || (textureView = getTextureView()) == null) {
            return;
        }
        float f = 0.0f;
        if (z2) {
            ViewPropertyAnimator animate = textureView.animate();
            if (z) {
                f = 1.0f;
            }
            ug8.t(animate.alpha(f), s33.h, 320L);
            return;
        }
        textureView.animate().cancel();
        if (z) {
            f = 1.0f;
        }
        textureView.setAlpha(f);
    }

    public final void g() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (isAttachedToWindow() && measuredWidth > 0 && measuredHeight > 0) {
            if (this.r) {
                if (this.e != null) {
                    this.f.setTranslationY((-this.H) / 2.0f);
                    b(this.e, measuredWidth, measuredHeight);
                    return;
                }
                return;
            }
            TextureView textureView = this.d;
            if (textureView != null) {
                TextureViewRenderer textureViewRenderer = this.c;
                if (textureViewRenderer == null) {
                    textureViewRenderer = null;
                }
                int measuredWidth2 = textureView.getMeasuredWidth();
                int measuredHeight2 = this.d.getMeasuredHeight();
                this.d.setPivotX(0.0f);
                this.d.setPivotY(0.0f);
                float f = measuredWidth;
                float f2 = measuredWidth2;
                float f3 = measuredHeight;
                float f4 = measuredHeight2;
                float max = Math.max(f / f2, f3 / f4);
                this.d.setScaleX(max);
                this.d.setScaleY(max);
                this.d.setTranslationX((f - (f2 * max)) / 2.0f);
                this.d.setTranslationY(b00.b(f4, max, f3, 2.0f) - (this.H / 2.0f));
                b(textureViewRenderer, measuredWidth, measuredHeight);
            }
        }
    }

    public Bitmap getBitmap() {
        TextureView videoTextureView = getVideoTextureView();
        if (videoTextureView != null) {
            return videoTextureView.getBitmap();
        }
        return null;
    }

    public View getPlaceholderView() {
        if (this.w == null) {
            View view = new View(getContext());
            this.w = view;
            addView(view, nme.g());
        }
        return this.w;
    }

    public VideoSink getSink() {
        setStreamMode(false);
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        return null;
    }

    public View getTextureView() {
        if (this.r) {
            return this.e;
        }
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        return null;
    }

    public TextureView getVideoTextureView() {
        if (this.r) {
            return this.e;
        }
        return this.c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
        kk7.f(this.a).b(this, kk7.F2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        f(false, false);
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        kk7.f(this.a).n(this, kk7.F2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onFirstFrameRendered() {
        if (!this.y) {
            c30 c30Var = this.F;
            if (c30Var != null && !c30Var.a) {
                c30Var.a = true;
                c30Var.m();
            }
            this.y = true;
        }
        f(true, true);
        Runnable runnable = this.x;
        if (runnable != null) {
            runnable.run();
            this.x = null;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.s.layout(0, 0, i5, i6);
        this.b.layout(0, 0, i5, i6);
        View view = this.w;
        if (view != null) {
            view.layout(0, 0, i5, i6);
        }
        TextureView textureView = this.d;
        if (textureView != null) {
            textureView.layout(0, 0, textureView.getMeasuredWidth(), this.d.getMeasuredHeight());
            TextureViewRenderer textureViewRenderer = this.c;
            if (textureViewRenderer == null) {
                textureViewRenderer = null;
            }
            textureViewRenderer.layout(0, 0, textureViewRenderer.getMeasuredWidth(), textureViewRenderer.getMeasuredHeight());
        }
        if (this.e != null) {
            this.f.layout(0, 0, i5, i6);
            a86 a86Var = this.e;
            a86Var.layout(0, 0, a86Var.getMeasuredWidth(), this.e.getMeasuredHeight());
        }
        g();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (!this.r && this.d != null) {
            this.G = true;
            Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
            TextureViewRenderer textureViewRenderer = this.c;
            if (textureViewRenderer != null) {
                textureViewRenderer.setScreenRotation(defaultDisplay.getRotation());
            }
            this.G = false;
            super.onMeasure(i, i2);
            TextureViewRenderer textureViewRenderer2 = this.c;
            if (textureViewRenderer2 == null) {
                textureViewRenderer2 = null;
            }
            this.d.getLayoutParams().width = textureViewRenderer2.getMeasuredWidth();
            this.d.getLayoutParams().height = textureViewRenderer2.getMeasuredHeight();
            super.onMeasure(i, i2);
            TextureViewRenderer textureViewRenderer3 = this.c;
            if (textureViewRenderer3 != null) {
                textureViewRenderer3.updateRotation();
                return;
            }
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setAccount(int i) {
        if (this.a == i) {
            return;
        }
        if (isAttachedToWindow()) {
            kk7 f = kk7.f(this.a);
            int i2 = kk7.F2;
            f.n(this, i2);
            this.a = i;
            kk7.f(i).b(this, i2);
            return;
        }
        this.a = i;
    }

    public void setKeyboardOffset(float f) {
        this.H = f;
        g();
    }

    public void setOnFirstFrameCallback(Runnable runnable) {
        this.x = runnable;
    }

    public void setSecure(boolean z) {
    }

    @Override
    public final void onFrameResolutionChanged(int i, int i2, int i3) {
    }
}
