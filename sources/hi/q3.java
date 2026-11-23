package hi;

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
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.messenger.o10;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.ui.Components.nr;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;
public final class q3 extends FrameLayout implements RendererCommon.RendererEvents, gs {
    public boolean E;
    public int f15292a;
    public final p3 f15293b;
    public final SurfaceViewRenderer f15294c;
    public final TextureViewRenderer d;
    public final org.telegram.ui.Components.q9 f15295e;
    public final TextureView f15296f;
    public View h;
    public Runnable f15297n;
    public boolean f15298r;
    public long f15299s;
    public fi.y3 f15300w;
    public boolean f15301x;
    public float f15302y;

    public q3(Context context, int i7) {
        super(context);
        this.f15292a = i7;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f15295e = q9Var;
        q9Var.setAlpha(0.75f);
        addView(q9Var, c8.ma.e(-1, -1, 119));
        TextureView textureView = new TextureView(context);
        this.f15296f = textureView;
        addView(textureView, c8.ma.e(-1, -1, 119));
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context);
        this.d = textureViewRenderer;
        textureViewRenderer.setOpaque(false);
        textureViewRenderer.setEnableHardwareScaler(true);
        textureViewRenderer.setIsCamera(true);
        textureViewRenderer.setRotateTextureWithScreen(true);
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        addView(textureViewRenderer, c8.ma.e(-1, -1, 119));
        textureViewRenderer.setAlpha(1.0f);
        this.f15294c = null;
        p3 p3Var = new p3(context);
        this.f15293b = p3Var;
        p3Var.setAlpha(0.0f);
        p3Var.setVisibility(8);
        addView(p3Var, c8.ma.e(-1, -1, 119));
    }

    public final void a(Runnable runnable, boolean z10) {
        float f10;
        bi.d0 d0Var;
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        p3 p3Var = this.f15293b;
        int i7 = 0;
        p3Var.setVisibility(0);
        e eVar = (e) p3Var.d;
        ViewPropertyAnimator animate = p3Var.animate();
        if (this.E) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).setInterpolator(nr.h).setDuration(320L).withEndAction(new ch.k(6, this, z10)).start();
        eVar.setVisibility((!z10 || runnable == null) ? 8 : 8);
        if (runnable == null) {
            d0Var = null;
        } else {
            d0Var = new bi.d0(3, runnable);
        }
        eVar.setOnClickListener(d0Var);
    }

    public final void b(long r27, fi.y3 r29) {
        throw new UnsupportedOperationException("Method not decompiled: hi.q3.b(long, fi.y3):void");
    }

    public final void c(boolean z10, boolean z11) {
        if (!z10 && z11) {
            return;
        }
        float f10 = 0.0f;
        if (z11) {
            ViewPropertyAnimator animate = getTextureView().animate();
            if (z10) {
                f10 = 1.0f;
            }
            o10.o(animate.alpha(f10), nr.h, 320L);
            return;
        }
        getTextureView().animate().cancel();
        View textureView = getTextureView();
        if (z10) {
            f10 = 1.0f;
        }
        textureView.setAlpha(f10);
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (isAttachedToWindow() && measuredWidth > 0 && measuredHeight > 0) {
            View view = this.d;
            if (view == null) {
                view = this.f15294c;
            }
            TextureView textureView = this.f15296f;
            int measuredWidth2 = textureView.getMeasuredWidth();
            int measuredHeight2 = textureView.getMeasuredHeight();
            textureView.setPivotX(0.0f);
            textureView.setPivotY(0.0f);
            float f10 = measuredWidth;
            float f11 = measuredWidth2;
            float f12 = measuredHeight;
            float f13 = measuredHeight2;
            float max = Math.max(f10 / f11, f12 / f13);
            textureView.setScaleX(max);
            textureView.setScaleY(max);
            textureView.setTranslationX((f10 - (f11 * max)) / 2.0f);
            textureView.setTranslationY(((f12 - (f13 * max)) / 2.0f) - (this.f15302y / 2.0f));
            float measuredWidth3 = view.getMeasuredWidth();
            float measuredHeight3 = view.getMeasuredHeight();
            float max2 = Math.max(measuredWidth3 / f10, measuredHeight3 / f12);
            view.setScaleX(max2);
            view.setScaleY(max2);
            view.setTranslationX((f10 - (measuredWidth3 * max2)) / 2.0f);
            view.setTranslationY(((f12 - (measuredHeight3 * max2)) / 2.0f) - (this.f15302y / 2.0f));
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        fi.c1 c1Var;
        fi.w0 w0Var;
        if (i7 == ls.G2) {
            long longValue = ((Long) objArr[0]).longValue();
            fi.y3 y3Var = this.f15300w;
            if (y3Var != null && (c1Var = (fi.c1) y3Var.f12814b) != null && c1Var.g() == longValue) {
                boolean n10 = ((fi.c1) this.f15300w.f12814b).n();
                if (((fi.c1) this.f15300w.f12814b).a()) {
                    fi.c1 c1Var2 = (fi.c1) this.f15300w.f12814b;
                    Objects.requireNonNull(c1Var2);
                    w0Var = new fi.w0(c1Var2, 12);
                } else {
                    w0Var = null;
                }
                a(w0Var, n10);
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
        if (org.telegram.messenger.g0.m0) {
            TextureView textureView = this.f15296f;
            if (textureView != null && (bitmap = textureView.getBitmap()) != null) {
                canvas.save();
                canvas.translate(textureView.getX(), textureView.getY());
                canvas.scale((textureView.getScaleX() * textureView.getWidth()) / bitmap.getWidth(), (textureView.getScaleY() * textureView.getHeight()) / bitmap.getHeight());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                canvas.restore();
                return;
            }
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (org.telegram.messenger.g0.m0) {
            TextureViewRenderer textureViewRenderer = this.d;
            if (view == textureViewRenderer) {
                Bitmap bitmap = textureViewRenderer.getBitmap();
                if (bitmap != null) {
                    canvas.save();
                    canvas.translate(textureViewRenderer.getX(), textureViewRenderer.getY());
                    canvas.scale((textureViewRenderer.getScaleX() * textureViewRenderer.getWidth()) / bitmap.getWidth(), (textureViewRenderer.getScaleY() * textureViewRenderer.getHeight()) / bitmap.getHeight());
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                }
                return true;
            }
            TextureView textureView = this.f15296f;
            if (view == textureView) {
                Bitmap bitmap2 = textureView.getBitmap();
                if (bitmap2 != null) {
                    canvas.save();
                    canvas.translate(textureView.getX(), textureView.getY());
                    canvas.scale((textureView.getScaleX() * textureView.getWidth()) / bitmap2.getWidth(), (textureView.getScaleY() * textureView.getHeight()) / bitmap2.getHeight());
                    canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                }
                return true;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    public Bitmap getBitmap() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer.getBitmap();
        }
        return null;
    }

    public View getPlaceholderView() {
        if (this.h == null) {
            View view = new View(getContext());
            this.h = view;
            addView(view, c8.ma.g());
        }
        return this.h;
    }

    public VideoSink getSink() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        SurfaceViewRenderer surfaceViewRenderer = this.f15294c;
        if (surfaceViewRenderer != null) {
            return surfaceViewRenderer;
        }
        return null;
    }

    public View getTextureView() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        SurfaceViewRenderer surfaceViewRenderer = this.f15294c;
        if (surfaceViewRenderer != null) {
            return surfaceViewRenderer;
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SurfaceViewRenderer surfaceViewRenderer = this.f15294c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
            textureViewRenderer.setBackgroundRenderer(this.f15296f);
        }
        ls.f(this.f15292a).c(this, ls.G2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15298r = false;
        c(false, false);
        SurfaceViewRenderer surfaceViewRenderer = this.f15294c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        ls.f(this.f15292a).n(this, ls.G2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onFirstFrameRendered() {
        if (!this.f15298r) {
            fi.y3 y3Var = this.f15300w;
            if (y3Var != null && !y3Var.f12813a) {
                y3Var.f12813a = true;
                y3Var.b();
            }
            this.f15298r = true;
        }
        c(true, true);
        Runnable runnable = this.f15297n;
        if (runnable != null) {
            runnable.run();
            this.f15297n = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        this.f15295e.layout(0, 0, i13, i14);
        this.f15293b.layout(0, 0, i13, i14);
        View view = this.h;
        if (view != null) {
            view.layout(0, 0, i13, i14);
        }
        TextureView textureView = this.f15296f;
        textureView.layout(0, 0, textureView.getMeasuredWidth(), textureView.getMeasuredHeight());
        View view2 = this.d;
        if (view2 == null) {
            view2 = this.f15294c;
        }
        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
        d();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        View view;
        this.f15301x = true;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.setScreenRotation(defaultDisplay.getRotation());
        }
        this.f15301x = false;
        super.onMeasure(i7, i10);
        if (textureViewRenderer != null) {
            view = textureViewRenderer;
        } else {
            view = this.f15294c;
        }
        TextureView textureView = this.f15296f;
        textureView.getLayoutParams().width = view.getMeasuredWidth();
        textureView.getLayoutParams().height = view.getMeasuredHeight();
        super.onMeasure(i7, i10);
        if (textureViewRenderer != null) {
            textureViewRenderer.updateRotation();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f15301x) {
            return;
        }
        super.requestLayout();
    }

    public void setAccount(int i7) {
        if (this.f15292a == i7) {
            return;
        }
        if (isAttachedToWindow()) {
            ls f10 = ls.f(this.f15292a);
            int i10 = ls.G2;
            f10.n(this, i10);
            this.f15292a = i7;
            ls.f(i7).c(this, i10);
            return;
        }
        this.f15292a = i7;
    }

    public void setKeyboardOffset(float f10) {
        this.f15302y = f10;
        d();
    }

    public void setOnFirstFrameCallback(Runnable runnable) {
        this.f15297n = runnable;
    }

    public void setSecure(boolean z10) {
        SurfaceViewRenderer surfaceViewRenderer = this.f15294c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.setSecure(z10);
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
    }
}
