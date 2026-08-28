package kh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;
public final class d4 extends FrameLayout implements RendererCommon.RendererEvents, NotificationCenter.NotificationCenterDelegate {
    public int f15093a;
    public final c4 f15094b;
    public final SurfaceViewRenderer f15095c;
    public final TextureViewRenderer d;
    public final org.telegram.ui.Components.o9 f15096e;
    public final TextureView f15097f;
    public View h;
    public Runnable f15098n;
    public boolean f15099r;
    public long f15100s;
    public ih.h4 v;
    public boolean f15101w;
    public float f15102x;
    public boolean f15103y;

    public d4(Context context, int i9) {
        super(context);
        this.f15093a = i9;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f15096e = o9Var;
        o9Var.setAlpha(0.75f);
        addView(o9Var, g7.e6.e(-1, -1, 119));
        TextureView textureView = new TextureView(context);
        this.f15097f = textureView;
        addView(textureView, g7.e6.e(-1, -1, 119));
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context);
        this.d = textureViewRenderer;
        textureViewRenderer.setOpaque(false);
        textureViewRenderer.setEnableHardwareScaler(true);
        textureViewRenderer.setIsCamera(true);
        textureViewRenderer.setRotateTextureWithScreen(true);
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        addView(textureViewRenderer, g7.e6.e(-1, -1, 119));
        textureViewRenderer.setAlpha(1.0f);
        this.f15095c = null;
        c4 c4Var = new c4(context);
        this.f15094b = c4Var;
        c4Var.setAlpha(0.0f);
        c4Var.setVisibility(8);
        addView(c4Var, g7.e6.e(-1, -1, 119));
    }

    public final boolean a() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer.isAvailable();
        }
        if (this.f15095c != null) {
            return true;
        }
        return false;
    }

    public final void b() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        SurfaceViewRenderer surfaceViewRenderer = this.f15095c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        this.f15099r = false;
        e(false, false);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f10;
        dg.w wVar;
        if (this.f15103y == z10) {
            return;
        }
        this.f15103y = z10;
        c4 c4Var = this.f15094b;
        int i9 = 0;
        c4Var.setVisibility(0);
        d dVar = c4Var.f15033b;
        ViewPropertyAnimator animate = c4Var.animate();
        if (this.f15103y) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animate.alpha(f10).setInterpolator(gr.h).setDuration(320L).withEndAction(new eh.f(8, this, z10)).start();
        dVar.setVisibility((!z10 || runnable == null) ? 8 : 8);
        if (runnable == null) {
            wVar = null;
        } else {
            wVar = new dg.w(4, runnable);
        }
        dVar.setOnClickListener(wVar);
    }

    public final void d(long j10, ih.h4 h4Var) {
        ih.a1 a1Var;
        ih.f1 f1Var;
        ih.f1 f1Var2;
        int d;
        int d9;
        TextureViewRenderer textureViewRenderer;
        int dp;
        int width;
        if (h4Var == null) {
            long j11 = this.f15100s;
            if (j11 != 0 && this.f15099r && (textureViewRenderer = this.d) != null) {
                File file = new File(FileLoader.getDirectory(4), aa.d.n(j11, "live", ".jpg"));
                Bitmap bitmap = textureViewRenderer.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(3);
                    if (bitmap.getWidth() > bitmap.getHeight()) {
                        width = AndroidUtilities.dp(100.0f);
                        dp = (int) ((bitmap.getHeight() / bitmap.getWidth()) * AndroidUtilities.dp(100.0f));
                    } else {
                        dp = AndroidUtilities.dp(100.0f);
                        width = (int) ((bitmap.getWidth() / bitmap.getHeight()) * AndroidUtilities.dp(100.0f));
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(width, dp, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    float width2 = width / bitmap.getWidth();
                    canvas.scale(width2, width2);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    Utilities.stackBlurBitmap(createBitmap, AndroidUtilities.dp(4.0f));
                    try {
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
            }
        }
        boolean z10 = true;
        if (this.f15100s != j10) {
            org.telegram.ui.Components.o9 o9Var = this.f15096e;
            int i9 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i9 == 0) {
                o9Var.b();
            } else {
                String absolutePath = new File(FileLoader.getDirectory(4), aa.d.n(j10, "live", ".jpg")).getAbsolutePath();
                if (i9 > 0) {
                    TLRPC.User user = MessagesController.getInstance(this.f15093a).getUser(Long.valueOf(j10));
                    ImageLocation forUser = ImageLocation.getForUser(this.f15093a, user, 1);
                    if (user != null) {
                        d9 = org.telegram.ui.Components.z8.d(user.f22527id);
                    } else {
                        d9 = i0.a.d(0.2f, -16777216, -1);
                    }
                    o9Var.getImageReceiver().setImage(ImageLocation.getForPath(absolutePath), "500_500_nocache", forUser, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d9, -16777216), i0.a.d(0.4f, d9, -16777216)}), 0L, null, user, 0);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(this.f15093a).getChat(Long.valueOf(-j10));
                    ImageLocation forChat = ImageLocation.getForChat(this.f15093a, chat, 1);
                    if (chat != null) {
                        d = org.telegram.ui.Components.z8.d(chat.f22380id);
                    } else {
                        d = i0.a.d(0.2f, -16777216, -1);
                    }
                    o9Var.getImageReceiver().setImage(ImageLocation.getForPath(absolutePath), "500_500_nocache", forChat, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), 0L, null, chat, 0);
                }
            }
        }
        this.f15100s = j10;
        this.v = h4Var;
        if (this.f15099r && h4Var != null && !h4Var.f11504f) {
            h4Var.f11504f = true;
            h4Var.a();
        }
        z10 = (h4Var == null || (f1Var2 = h4Var.f11500a) == null || !f1Var2.n()) ? false : false;
        if (h4Var != null && (f1Var = h4Var.f11500a) != null && f1Var.a()) {
            ih.f1 f1Var3 = h4Var.f11500a;
            Objects.requireNonNull(f1Var3);
            a1Var = new ih.a1(f1Var3, 12);
        } else {
            a1Var = null;
        }
        c(a1Var, z10);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        ih.f1 f1Var;
        ih.a1 a1Var;
        if (i9 == NotificationCenter.liveStoryUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            ih.h4 h4Var = this.v;
            if (h4Var != null && (f1Var = h4Var.f11500a) != null && f1Var.g() == longValue) {
                boolean n10 = this.v.f11500a.n();
                if (this.v.f11500a.a()) {
                    ih.f1 f1Var2 = this.v.f11500a;
                    Objects.requireNonNull(f1Var2);
                    a1Var = new ih.a1(f1Var2, 12);
                } else {
                    a1Var = null;
                }
                c(a1Var, n10);
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
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            TextureView textureView = this.f15097f;
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
        if (AndroidUtilities.makingGlobalBlurBitmap) {
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
            TextureView textureView = this.f15097f;
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
            ll.r(animate.alpha(f10), gr.h, 320L);
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
                view = this.f15095c;
            }
            TextureView textureView = this.f15097f;
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
            textureView.setTranslationY(((f12 - (f13 * max)) / 2.0f) - (this.f15102x / 2.0f));
            float measuredWidth3 = view.getMeasuredWidth();
            float measuredHeight3 = view.getMeasuredHeight();
            float max2 = Math.max(measuredWidth3 / f10, measuredHeight3 / f12);
            view.setScaleX(max2);
            view.setScaleY(max2);
            view.setTranslationX((f10 - (measuredWidth3 * max2)) / 2.0f);
            view.setTranslationY(((f12 - (measuredHeight3 * max2)) / 2.0f) - (this.f15102x / 2.0f));
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
            addView(view, g7.e6.g());
        }
        return this.h;
    }

    public VideoSink getSink() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        SurfaceViewRenderer surfaceViewRenderer = this.f15095c;
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
        SurfaceViewRenderer surfaceViewRenderer = this.f15095c;
        if (surfaceViewRenderer != null) {
            return surfaceViewRenderer;
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SurfaceViewRenderer surfaceViewRenderer = this.f15095c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
            textureViewRenderer.setBackgroundRenderer(this.f15097f);
        }
        NotificationCenter.getInstance(this.f15093a).addObserver(this, NotificationCenter.liveStoryUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15099r = false;
        e(false, false);
        SurfaceViewRenderer surfaceViewRenderer = this.f15095c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        NotificationCenter.getInstance(this.f15093a).removeObserver(this, NotificationCenter.liveStoryUpdated);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onFirstFrameRendered() {
        if (!this.f15099r) {
            ih.h4 h4Var = this.v;
            if (h4Var != null && !h4Var.f11504f) {
                h4Var.f11504f = true;
                h4Var.a();
            }
            this.f15099r = true;
        }
        e(true, true);
        Runnable runnable = this.f15098n;
        if (runnable != null) {
            runnable.run();
            this.f15098n = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        this.f15096e.layout(0, 0, i13, i14);
        this.f15094b.layout(0, 0, i13, i14);
        View view = this.h;
        if (view != null) {
            view.layout(0, 0, i13, i14);
        }
        TextureView textureView = this.f15097f;
        textureView.layout(0, 0, textureView.getMeasuredWidth(), textureView.getMeasuredHeight());
        View view2 = this.d;
        if (view2 == null) {
            view2 = this.f15095c;
        }
        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
        f();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        View view;
        this.f15101w = true;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.setScreenRotation(defaultDisplay.getRotation());
        }
        this.f15101w = false;
        super.onMeasure(i9, i10);
        if (textureViewRenderer != null) {
            view = textureViewRenderer;
        } else {
            view = this.f15095c;
        }
        TextureView textureView = this.f15097f;
        textureView.getLayoutParams().width = view.getMeasuredWidth();
        textureView.getLayoutParams().height = view.getMeasuredHeight();
        super.onMeasure(i9, i10);
        if (textureViewRenderer != null) {
            textureViewRenderer.updateRotation();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f15101w) {
            return;
        }
        super.requestLayout();
    }

    public void setAccount(int i9) {
        if (this.f15093a == i9) {
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f15093a);
            int i10 = NotificationCenter.liveStoryUpdated;
            notificationCenter.removeObserver(this, i10);
            this.f15093a = i9;
            NotificationCenter.getInstance(i9).addObserver(this, i10);
            return;
        }
        this.f15093a = i9;
    }

    public void setKeyboardOffset(float f10) {
        this.f15102x = f10;
        f();
    }

    public void setOnFirstFrameCallback(Runnable runnable) {
        this.f15098n = runnable;
    }

    public void setSecure(boolean z10) {
        SurfaceViewRenderer surfaceViewRenderer = this.f15095c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.setSecure(z10);
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i9, int i10, int i11) {
    }
}
