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
public final class t96 extends FrameLayout implements RendererCommon.RendererEvents, jm7 {
    public long E;
    public c40 F;
    public boolean G;
    public float H;
    public boolean I;
    public int a;
    public final yj3 b;
    public TextureViewRenderer c;
    public TextureView d;
    public z96 e;
    public a91 f;
    public Bitmap h;
    public long n;
    public boolean r;
    public final bf0 s;
    public View w;
    public Runnable x;
    public boolean y;

    public t96(Context context, int i) {
        super(context);
        this.a = i;
        bf0 bf0Var = new bf0(context);
        this.s = bf0Var;
        bf0Var.setAlpha(0.75f);
        addView(bf0Var, qoe.e(-1, -1, 119));
        yj3 yj3Var = new yj3(context);
        this.b = yj3Var;
        yj3Var.setAlpha(0.0f);
        yj3Var.setVisibility(8);
        addView(yj3Var, qoe.e(-1, -1, 119));
    }

    private void setStreamMode(boolean z) {
        int i;
        int i2;
        int i3;
        View view = this.b;
        if (z) {
            if (this.e == null) {
                int indexOfChild = indexOfChild(view);
                a91 a91Var = new a91(getContext());
                this.f = a91Var;
                addView(a91Var, indexOfChild, qoe.e(-1, -1, 119));
                z96 z96Var = new z96(getContext(), new lj4(this));
                this.e = z96Var;
                addView(z96Var, indexOfChild + 1, qoe.e(-1, -1, 119));
                this.e.setAlpha(0.0f);
            }
        } else if (this.d == null) {
            int indexOfChild2 = indexOfChild(view);
            TextureView textureView = new TextureView(getContext());
            this.d = textureView;
            addView(textureView, indexOfChild2, qoe.e(-1, -1, 119));
            TextureViewRenderer textureViewRenderer = new TextureViewRenderer(getContext());
            this.c = textureViewRenderer;
            textureViewRenderer.setOpaque(false);
            this.c.setEnableHardwareScaler(true);
            this.c.setIsCamera(true);
            this.c.setRotateTextureWithScreen(true);
            this.c.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
            addView(this.c, indexOfChild2 + 1, qoe.e(-1, -1, 119));
            this.c.setAlpha(1.0f);
            if (isAttachedToWindow()) {
                c();
            }
        }
        z96 z96Var2 = this.e;
        int i4 = 8;
        if (z96Var2 != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            z96Var2.setVisibility(i2);
            a91 a91Var2 = this.f;
            if (z) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            a91Var2.setVisibility(i3);
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

    public final void a(s96 s96Var) {
        if (s96Var instanceof vo9) {
            setStreamMode(true);
            ((vo9) s96Var).L(this.e);
        } else if (s96Var instanceof oo9) {
            setStreamMode(false);
            ((oo9) s96Var).L(getSink());
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
        xl3 xl3Var;
        if (this.I == z) {
            return;
        }
        this.I = z;
        yj3 yj3Var = this.b;
        int i = 0;
        yj3Var.setVisibility(0);
        b61 b61Var = (b61) yj3Var.d;
        ViewPropertyAnimator animate = yj3Var.animate();
        if (this.I) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        animate.alpha(f).setInterpolator(d53.h).setDuration(320L).withEndAction(new y8c((byte) 23, this, z)).start();
        b61Var.setVisibility((!z || runnable == null) ? 8 : 8);
        if (runnable == null) {
            xl3Var = null;
        } else {
            xl3Var = new xl3(runnable, (byte) 5);
        }
        b61Var.setOnClickListener(xl3Var);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        s96 s96Var;
        q96 q96Var;
        if (i == nm7.G2) {
            long longValue = ((Long) objArr[0]).longValue();
            c40 c40Var = this.F;
            if (c40Var != null && (s96Var = (s96) c40Var.b) != null && s96Var.j() == longValue) {
                boolean p = ((s96) this.F.b).p();
                if (((s96) this.F.b).b()) {
                    s96 s96Var2 = (s96) this.F.b;
                    Objects.requireNonNull(s96Var2);
                    q96Var = new q96(s96Var2, (byte) 9);
                } else {
                    q96Var = null;
                }
                d(q96Var, p);
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
        if (gm.m0) {
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
        if (gm.m0 && (view instanceof TextureView) && view.getVisibility() == 0) {
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

    public final void e(long r27, defpackage.c40 r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t96.e(long, c40):void");
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
            wi8.t(animate.alpha(f), d53.h, 320L);
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
                this.d.setTranslationY(b10.b(f4, max, f3, 2.0f) - (this.H / 2.0f));
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
            addView(view, qoe.g());
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
        nm7.f(this.a).b(this, nm7.G2);
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
        nm7.f(this.a).n(this, nm7.G2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onFirstFrameRendered() {
        if (!this.y) {
            c40 c40Var = this.F;
            if (c40Var != null && !c40Var.a) {
                c40Var.a = true;
                c40Var.m();
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
            z96 z96Var = this.e;
            z96Var.layout(0, 0, z96Var.getMeasuredWidth(), this.e.getMeasuredHeight());
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
            nm7 f = nm7.f(this.a);
            int i2 = nm7.G2;
            f.n(this, i2);
            this.a = i;
            nm7.f(i).b(this, i2);
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
