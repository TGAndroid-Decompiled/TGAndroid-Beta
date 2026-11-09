package fi;

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
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.ui.Components.xq;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;
public final class s3 extends FrameLayout implements RendererCommon.RendererEvents, ls {
    public boolean D;
    public int f12776a;
    public final r3 f12777b;
    public final SurfaceViewRenderer f12778c;
    public final TextureViewRenderer d;
    public final org.telegram.ui.Components.l9 f12779e;
    public final TextureView f12780f;
    public View h;
    public Runnable f12781n;
    public boolean f12782r;
    public long f12783s;
    public di.i4 f12784w;
    public boolean f12785x;
    public float f12786y;

    public s3(Context context, int i7) {
        super(context);
        this.f12776a = i7;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f12779e = l9Var;
        l9Var.setAlpha(0.75f);
        addView(l9Var, c8.ha.e(-1, -1, 119));
        TextureView textureView = new TextureView(context);
        this.f12780f = textureView;
        addView(textureView, c8.ha.e(-1, -1, 119));
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context);
        this.d = textureViewRenderer;
        textureViewRenderer.setOpaque(false);
        textureViewRenderer.setEnableHardwareScaler(true);
        textureViewRenderer.setIsCamera(true);
        textureViewRenderer.setRotateTextureWithScreen(true);
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        addView(textureViewRenderer, c8.ha.e(-1, -1, 119));
        textureViewRenderer.setAlpha(1.0f);
        this.f12778c = null;
        r3 r3Var = new r3(context);
        this.f12777b = r3Var;
        r3Var.setAlpha(0.0f);
        r3Var.setVisibility(8);
        addView(r3Var, c8.ha.e(-1, -1, 119));
    }

    public final void a(Runnable runnable, boolean z9) {
        float f10;
        bi.z6 z6Var;
        if (this.D == z9) {
            return;
        }
        this.D = z9;
        r3 r3Var = this.f12777b;
        int i7 = 0;
        r3Var.setVisibility(0);
        d dVar = (d) r3Var.d;
        ViewPropertyAnimator animate = r3Var.animate();
        if (this.D) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).setInterpolator(xq.h).setDuration(320L).withEndAction(new bi.k1(6, this, z9)).start();
        dVar.setVisibility((!z9 || runnable == null) ? 8 : 8);
        if (runnable == null) {
            z6Var = null;
        } else {
            z6Var = new bi.z6(2, runnable);
        }
        dVar.setOnClickListener(z6Var);
    }

    public final void b(long r27, di.i4 r29) {
        throw new UnsupportedOperationException("Method not decompiled: fi.s3.b(long, di.i4):void");
    }

    public final void c(boolean z9, boolean z10) {
        if (!z9 && z10) {
            return;
        }
        float f10 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = getTextureView().animate();
            if (z9) {
                f10 = 1.0f;
            }
            org.telegram.messenger.camera.q.l(animate.alpha(f10), xq.h, 320L);
            return;
        }
        getTextureView().animate().cancel();
        View textureView = getTextureView();
        if (z9) {
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
                view = this.f12778c;
            }
            TextureView textureView = this.f12780f;
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
            textureView.setTranslationY(((f12 - (f13 * max)) / 2.0f) - (this.f12786y / 2.0f));
            float measuredWidth3 = view.getMeasuredWidth();
            float measuredHeight3 = view.getMeasuredHeight();
            float max2 = Math.max(measuredWidth3 / f10, measuredHeight3 / f12);
            view.setScaleX(max2);
            view.setScaleY(max2);
            view.setTranslationX((f10 - (measuredWidth3 * max2)) / 2.0f);
            view.setTranslationY(((f12 - (measuredHeight3 * max2)) / 2.0f) - (this.f12786y / 2.0f));
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        di.g1 g1Var;
        di.x0 x0Var;
        if (i7 == qs.G2) {
            long longValue = ((Long) objArr[0]).longValue();
            di.i4 i4Var = this.f12784w;
            if (i4Var != null && (g1Var = (di.g1) i4Var.f9105b) != null && g1Var.g() == longValue) {
                boolean n10 = ((di.g1) this.f12784w.f9105b).n();
                if (((di.g1) this.f12784w.f9105b).a()) {
                    di.g1 g1Var2 = (di.g1) this.f12784w.f9105b;
                    Objects.requireNonNull(g1Var2);
                    x0Var = new di.x0(g1Var2, 12);
                } else {
                    x0Var = null;
                }
                a(x0Var, n10);
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
            TextureView textureView = this.f12780f;
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
            TextureView textureView = this.f12780f;
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
            addView(view, c8.ha.g());
        }
        return this.h;
    }

    public VideoSink getSink() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        SurfaceViewRenderer surfaceViewRenderer = this.f12778c;
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
        SurfaceViewRenderer surfaceViewRenderer = this.f12778c;
        if (surfaceViewRenderer != null) {
            return surfaceViewRenderer;
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SurfaceViewRenderer surfaceViewRenderer = this.f12778c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
            textureViewRenderer.setBackgroundRenderer(this.f12780f);
        }
        qs.f(this.f12776a).c(this, qs.G2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12782r = false;
        c(false, false);
        SurfaceViewRenderer surfaceViewRenderer = this.f12778c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        qs.f(this.f12776a).n(this, qs.G2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onFirstFrameRendered() {
        if (!this.f12782r) {
            di.i4 i4Var = this.f12784w;
            if (i4Var != null && !i4Var.f9104a) {
                i4Var.f9104a = true;
                i4Var.b();
            }
            this.f12782r = true;
        }
        c(true, true);
        Runnable runnable = this.f12781n;
        if (runnable != null) {
            runnable.run();
            this.f12781n = null;
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = i11 - i7;
        int i14 = i12 - i10;
        this.f12779e.layout(0, 0, i13, i14);
        this.f12777b.layout(0, 0, i13, i14);
        View view = this.h;
        if (view != null) {
            view.layout(0, 0, i13, i14);
        }
        TextureView textureView = this.f12780f;
        textureView.layout(0, 0, textureView.getMeasuredWidth(), textureView.getMeasuredHeight());
        View view2 = this.d;
        if (view2 == null) {
            view2 = this.f12778c;
        }
        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
        d();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        View view;
        this.f12785x = true;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.setScreenRotation(defaultDisplay.getRotation());
        }
        this.f12785x = false;
        super.onMeasure(i7, i10);
        if (textureViewRenderer != null) {
            view = textureViewRenderer;
        } else {
            view = this.f12778c;
        }
        TextureView textureView = this.f12780f;
        textureView.getLayoutParams().width = view.getMeasuredWidth();
        textureView.getLayoutParams().height = view.getMeasuredHeight();
        super.onMeasure(i7, i10);
        if (textureViewRenderer != null) {
            textureViewRenderer.updateRotation();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f12785x) {
            return;
        }
        super.requestLayout();
    }

    public void setAccount(int i7) {
        if (this.f12776a == i7) {
            return;
        }
        if (isAttachedToWindow()) {
            qs f10 = qs.f(this.f12776a);
            int i10 = qs.G2;
            f10.n(this, i10);
            this.f12776a = i7;
            qs.f(i7).c(this, i10);
            return;
        }
        this.f12776a = i7;
    }

    public void setKeyboardOffset(float f10) {
        this.f12786y = f10;
        d();
    }

    public void setOnFirstFrameCallback(Runnable runnable) {
        this.f12781n = runnable;
    }

    public void setSecure(boolean z9) {
        SurfaceViewRenderer surfaceViewRenderer = this.f12778c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.setSecure(z9);
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i7, int i10, int i11) {
    }
}
