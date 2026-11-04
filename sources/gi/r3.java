package gi;

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
import b8.mf;
import j$.util.Objects;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.ui.Components.xq;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;
public final class r3 extends FrameLayout implements RendererCommon.RendererEvents, cs {
    public boolean E;
    public int f13493a;
    public final q3 f13494b;
    public final SurfaceViewRenderer f13495c;
    public final TextureViewRenderer d;
    public final org.telegram.ui.Components.k9 f13496e;
    public final TextureView f13497f;
    public View h;
    public Runnable f13498n;
    public boolean f13499r;
    public long f13500s;
    public ei.i4 f13501w;
    public boolean f13502x;
    public float f13503y;

    public r3(Context context, int i3) {
        super(context);
        this.f13493a = i3;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f13496e = k9Var;
        k9Var.setAlpha(0.75f);
        addView(k9Var, mf.e(-1, -1, 119));
        TextureView textureView = new TextureView(context);
        this.f13497f = textureView;
        addView(textureView, mf.e(-1, -1, 119));
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context);
        this.d = textureViewRenderer;
        textureViewRenderer.setOpaque(false);
        textureViewRenderer.setEnableHardwareScaler(true);
        textureViewRenderer.setIsCamera(true);
        textureViewRenderer.setRotateTextureWithScreen(true);
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        addView(textureViewRenderer, mf.e(-1, -1, 119));
        textureViewRenderer.setAlpha(1.0f);
        this.f13495c = null;
        q3 q3Var = new q3(context);
        this.f13494b = q3Var;
        q3Var.setAlpha(0.0f);
        q3Var.setVisibility(8);
        addView(q3Var, mf.e(-1, -1, 119));
    }

    public final boolean a() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer.isAvailable();
        }
        if (this.f13495c != null) {
            return true;
        }
        return false;
    }

    public final void b() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        SurfaceViewRenderer surfaceViewRenderer = this.f13495c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        this.f13499r = false;
        e(false, false);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f10;
        ai.j0 j0Var;
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        q3 q3Var = this.f13494b;
        int i3 = 0;
        q3Var.setVisibility(0);
        d dVar = (d) q3Var.d;
        ViewPropertyAnimator animate = q3Var.animate();
        if (this.E) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).setInterpolator(xq.h).setDuration(320L).withEndAction(new ci.e1(6, this, z10)).start();
        dVar.setVisibility((!z10 || runnable == null) ? 8 : 8);
        if (runnable == null) {
            j0Var = null;
        } else {
            j0Var = new ai.j0(3, runnable);
        }
        dVar.setOnClickListener(j0Var);
    }

    public final void d(long r27, ei.i4 r29) {
        throw new UnsupportedOperationException("Method not decompiled: gi.r3.d(long, ei.i4):void");
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        ei.g1 g1Var;
        ei.a1 a1Var;
        if (i3 == hs.G2) {
            long longValue = ((Long) objArr[0]).longValue();
            ei.i4 i4Var = this.f13501w;
            if (i4Var != null && (g1Var = (ei.g1) i4Var.f10403b) != null && g1Var.g() == longValue) {
                boolean n4 = ((ei.g1) this.f13501w.f10403b).n();
                if (((ei.g1) this.f13501w.f10403b).a()) {
                    ei.g1 g1Var2 = (ei.g1) this.f13501w.f10403b;
                    Objects.requireNonNull(g1Var2);
                    a1Var = new ei.a1(g1Var2, 12);
                } else {
                    a1Var = null;
                }
                c(a1Var, n4);
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
            TextureView textureView = this.f13497f;
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
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
            TextureView textureView = this.f13497f;
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
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10, boolean z11) {
        if (!z10 && z11) {
            return;
        }
        float f10 = 0.0f;
        if (z11) {
            ViewPropertyAnimator animate = getTextureView().animate();
            if (z10) {
                f10 = 1.0f;
            }
            org.telegram.messenger.camera.q.l(animate.alpha(f10), xq.h, 320L);
            return;
        }
        getTextureView().animate().cancel();
        View textureView = getTextureView();
        if (z10) {
            f10 = 1.0f;
        }
        textureView.setAlpha(f10);
    }

    public final void f() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (isAttachedToWindow() && measuredWidth > 0 && measuredHeight > 0) {
            View view = this.d;
            if (view == null) {
                view = this.f13495c;
            }
            TextureView textureView = this.f13497f;
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
            textureView.setTranslationY(((f12 - (f13 * max)) / 2.0f) - (this.f13503y / 2.0f));
            float measuredWidth3 = view.getMeasuredWidth();
            float measuredHeight3 = view.getMeasuredHeight();
            float max2 = Math.max(measuredWidth3 / f10, measuredHeight3 / f12);
            view.setScaleX(max2);
            view.setScaleY(max2);
            view.setTranslationX((f10 - (measuredWidth3 * max2)) / 2.0f);
            view.setTranslationY(((f12 - (measuredHeight3 * max2)) / 2.0f) - (this.f13503y / 2.0f));
        }
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
            addView(view, mf.g());
        }
        return this.h;
    }

    public VideoSink getSink() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        SurfaceViewRenderer surfaceViewRenderer = this.f13495c;
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
        SurfaceViewRenderer surfaceViewRenderer = this.f13495c;
        if (surfaceViewRenderer != null) {
            return surfaceViewRenderer;
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SurfaceViewRenderer surfaceViewRenderer = this.f13495c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
            textureViewRenderer.setBackgroundRenderer(this.f13497f);
        }
        hs.f(this.f13493a).c(this, hs.G2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13499r = false;
        e(false, false);
        SurfaceViewRenderer surfaceViewRenderer = this.f13495c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        hs.f(this.f13493a).n(this, hs.G2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onFirstFrameRendered() {
        if (!this.f13499r) {
            ei.i4 i4Var = this.f13501w;
            if (i4Var != null && !i4Var.f10402a) {
                i4Var.f10402a = true;
                i4Var.b();
            }
            this.f13499r = true;
        }
        e(true, true);
        Runnable runnable = this.f13498n;
        if (runnable != null) {
            runnable.run();
            this.f13498n = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = i11 - i3;
        int i14 = i12 - i10;
        this.f13496e.layout(0, 0, i13, i14);
        this.f13494b.layout(0, 0, i13, i14);
        View view = this.h;
        if (view != null) {
            view.layout(0, 0, i13, i14);
        }
        TextureView textureView = this.f13497f;
        textureView.layout(0, 0, textureView.getMeasuredWidth(), textureView.getMeasuredHeight());
        View view2 = this.d;
        if (view2 == null) {
            view2 = this.f13495c;
        }
        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
        f();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        View view;
        this.f13502x = true;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.setScreenRotation(defaultDisplay.getRotation());
        }
        this.f13502x = false;
        super.onMeasure(i3, i10);
        if (textureViewRenderer != null) {
            view = textureViewRenderer;
        } else {
            view = this.f13495c;
        }
        TextureView textureView = this.f13497f;
        textureView.getLayoutParams().width = view.getMeasuredWidth();
        textureView.getLayoutParams().height = view.getMeasuredHeight();
        super.onMeasure(i3, i10);
        if (textureViewRenderer != null) {
            textureViewRenderer.updateRotation();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f13502x) {
            return;
        }
        super.requestLayout();
    }

    public void setAccount(int i3) {
        if (this.f13493a == i3) {
            return;
        }
        if (isAttachedToWindow()) {
            hs f10 = hs.f(this.f13493a);
            int i10 = hs.G2;
            f10.n(this, i10);
            this.f13493a = i3;
            hs.f(i3).c(this, i10);
            return;
        }
        this.f13493a = i3;
    }

    public void setKeyboardOffset(float f10) {
        this.f13503y = f10;
        f();
    }

    public void setOnFirstFrameCallback(Runnable runnable) {
        this.f13498n = runnable;
    }

    public void setSecure(boolean z10) {
        SurfaceViewRenderer surfaceViewRenderer = this.f13495c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.setSecure(z10);
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i3, int i10, int i11) {
    }
}
