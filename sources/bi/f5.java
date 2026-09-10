package bi;

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
import org.telegram.messenger.em;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wr;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;
public final class f5 extends FrameLayout implements RendererCommon.RendererEvents, NotificationCenter.NotificationCenterDelegate {
    public int f2703a;
    public final e5 f2704b;
    public final SurfaceViewRenderer f2705c;
    public final TextureViewRenderer d;
    public final org.telegram.ui.Components.w9 e;
    public final TextureView f2706f;
    public View h;
    public Runnable f2707n;
    public boolean f2708r;
    public long f2709s;
    public k2.v v;
    public boolean f2710w;
    public float f2711x;
    public boolean f2712y;

    public f5(Context context, int i10) {
        super(context);
        this.f2703a = i10;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.e = w9Var;
        w9Var.setAlpha(0.75f);
        addView(w9Var, w7.a6.e(-1, -1, 119));
        TextureView textureView = new TextureView(context);
        this.f2706f = textureView;
        addView(textureView, w7.a6.e(-1, -1, 119));
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context);
        this.d = textureViewRenderer;
        textureViewRenderer.setOpaque(false);
        textureViewRenderer.setEnableHardwareScaler(true);
        textureViewRenderer.setIsCamera(true);
        textureViewRenderer.setRotateTextureWithScreen(true);
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        addView(textureViewRenderer, w7.a6.e(-1, -1, 119));
        textureViewRenderer.setAlpha(1.0f);
        this.f2705c = null;
        e5 e5Var = new e5(context);
        this.f2704b = e5Var;
        e5Var.setAlpha(0.0f);
        e5Var.setVisibility(8);
        addView(e5Var, w7.a6.e(-1, -1, 119));
    }

    public final boolean a() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer.isAvailable();
        }
        if (this.f2705c != null) {
            return true;
        }
        return false;
    }

    public final void b() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        SurfaceViewRenderer surfaceViewRenderer = this.f2705c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        this.f2708r = false;
        e(false, false);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f7;
        ai.v vVar;
        if (this.f2712y == z10) {
            return;
        }
        this.f2712y = z10;
        e5 e5Var = this.f2704b;
        int i10 = 0;
        e5Var.setVisibility(0);
        d dVar = e5Var.f2627b;
        ViewPropertyAnimator animate = e5Var.animate();
        if (this.f2712y) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).setInterpolator(wr.h).setDuration(320L).withEndAction(new ai.j(2, this, z10)).start();
        dVar.setVisibility((!z10 || runnable == null) ? 8 : 8);
        if (runnable == null) {
            vVar = null;
        } else {
            vVar = new ai.v(1, runnable);
        }
        dVar.setOnClickListener(vVar);
    }

    public final void d(long j3, k2.v vVar) {
        c5 c5Var;
        zh.t0 t0Var;
        zh.t0 t0Var2;
        int d;
        int d10;
        TextureViewRenderer textureViewRenderer;
        int dp;
        int width;
        if (vVar == null) {
            long j10 = this.f2709s;
            if (j10 != 0 && this.f2708r && (textureViewRenderer = this.d) != null) {
                File file = new File(FileLoader.getDirectory(4), org.telegram.ui.Cells.r6.h(j10, "live", ".jpg"));
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
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
        }
        boolean z10 = true;
        if (this.f2709s != j3) {
            org.telegram.ui.Components.w9 w9Var = this.e;
            int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            if (i10 == 0) {
                w9Var.b();
            } else {
                String absolutePath = new File(FileLoader.getDirectory(4), org.telegram.ui.Cells.r6.h(j3, "live", ".jpg")).getAbsolutePath();
                if (i10 > 0) {
                    TLRPC.User user = MessagesController.getInstance(this.f2703a).getUser(Long.valueOf(j3));
                    ImageLocation forUser = ImageLocation.getForUser(this.f2703a, user, 1);
                    if (user != null) {
                        d10 = org.telegram.ui.Components.g9.d(user.f17342id);
                    } else {
                        d10 = i0.a.d(0.2f, -16777216, -1);
                    }
                    w9Var.getImageReceiver().setImage(ImageLocation.getForPath(absolutePath), "500_500_nocache", forUser, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d10, -16777216), i0.a.d(0.4f, d10, -16777216)}), 0L, null, user, 0);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(this.f2703a).getChat(Long.valueOf(-j3));
                    ImageLocation forChat = ImageLocation.getForChat(this.f2703a, chat, 1);
                    if (chat != null) {
                        d = org.telegram.ui.Components.g9.d(chat.f17195id);
                    } else {
                        d = i0.a.d(0.2f, -16777216, -1);
                    }
                    w9Var.getImageReceiver().setImage(ImageLocation.getForPath(absolutePath), "500_500_nocache", forChat, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.d(0.2f, d, -16777216), i0.a.d(0.4f, d, -16777216)}), 0L, null, chat, 0);
                }
            }
        }
        this.f2709s = j3;
        this.v = vVar;
        if (this.f2708r && vVar != null && !vVar.f12224a) {
            vVar.f12224a = true;
            vVar.b();
        }
        z10 = (vVar == null || (t0Var2 = (zh.t0) vVar.f12225b) == null || !t0Var2.n()) ? false : false;
        if (vVar != null && (t0Var = (zh.t0) vVar.f12225b) != null && t0Var.a()) {
            zh.t0 t0Var3 = (zh.t0) vVar.f12225b;
            Objects.requireNonNull(t0Var3);
            c5Var = new c5(t0Var3, 0);
        } else {
            c5Var = null;
        }
        c(c5Var, z10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        zh.t0 t0Var;
        c5 c5Var;
        if (i10 == NotificationCenter.liveStoryUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            k2.v vVar = this.v;
            if (vVar != null && (t0Var = (zh.t0) vVar.f12225b) != null && t0Var.g() == longValue) {
                boolean n10 = ((zh.t0) this.v.f12225b).n();
                if (((zh.t0) this.v.f12225b).a()) {
                    zh.t0 t0Var2 = (zh.t0) this.v.f12225b;
                    Objects.requireNonNull(t0Var2);
                    c5Var = new c5(t0Var2, 0);
                } else {
                    c5Var = null;
                }
                c(c5Var, n10);
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
            TextureView textureView = this.f2706f;
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
            TextureView textureView = this.f2706f;
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

    public final void e(boolean z10, boolean z11) {
        if (!z10 && z11) {
            return;
        }
        float f7 = 0.0f;
        if (z11) {
            ViewPropertyAnimator animate = getTextureView().animate();
            if (z10) {
                f7 = 1.0f;
            }
            em.q(animate.alpha(f7), wr.h, 320L);
            return;
        }
        getTextureView().animate().cancel();
        View textureView = getTextureView();
        if (z10) {
            f7 = 1.0f;
        }
        textureView.setAlpha(f7);
    }

    public final void f() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (isAttachedToWindow() && measuredWidth > 0 && measuredHeight > 0) {
            View view = this.d;
            if (view == null) {
                view = this.f2705c;
            }
            TextureView textureView = this.f2706f;
            int measuredWidth2 = textureView.getMeasuredWidth();
            int measuredHeight2 = textureView.getMeasuredHeight();
            textureView.setPivotX(0.0f);
            textureView.setPivotY(0.0f);
            float f7 = measuredWidth;
            float f10 = measuredWidth2;
            float f11 = measuredHeight;
            float f12 = measuredHeight2;
            float max = Math.max(f7 / f10, f11 / f12);
            textureView.setScaleX(max);
            textureView.setScaleY(max);
            textureView.setTranslationX((f7 - (f10 * max)) / 2.0f);
            textureView.setTranslationY(((f11 - (f12 * max)) / 2.0f) - (this.f2711x / 2.0f));
            float measuredWidth3 = view.getMeasuredWidth();
            float measuredHeight3 = view.getMeasuredHeight();
            float max2 = Math.max(measuredWidth3 / f7, measuredHeight3 / f11);
            view.setScaleX(max2);
            view.setScaleY(max2);
            view.setTranslationX((f7 - (measuredWidth3 * max2)) / 2.0f);
            view.setTranslationY(((f11 - (measuredHeight3 * max2)) / 2.0f) - (this.f2711x / 2.0f));
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
            addView(view, w7.a6.g());
        }
        return this.h;
    }

    public VideoSink getSink() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        SurfaceViewRenderer surfaceViewRenderer = this.f2705c;
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
        SurfaceViewRenderer surfaceViewRenderer = this.f2705c;
        if (surfaceViewRenderer != null) {
            return surfaceViewRenderer;
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SurfaceViewRenderer surfaceViewRenderer = this.f2705c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
            textureViewRenderer.setBackgroundRenderer(this.f2706f);
        }
        NotificationCenter.getInstance(this.f2703a).addObserver(this, NotificationCenter.liveStoryUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2708r = false;
        e(false, false);
        SurfaceViewRenderer surfaceViewRenderer = this.f2705c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        NotificationCenter.getInstance(this.f2703a).removeObserver(this, NotificationCenter.liveStoryUpdated);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onFirstFrameRendered() {
        if (!this.f2708r) {
            k2.v vVar = this.v;
            if (vVar != null && !vVar.f12224a) {
                vVar.f12224a = true;
                vVar.b();
            }
            this.f2708r = true;
        }
        e(true, true);
        Runnable runnable = this.f2707n;
        if (runnable != null) {
            runnable.run();
            this.f2707n = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        this.e.layout(0, 0, i14, i15);
        this.f2704b.layout(0, 0, i14, i15);
        View view = this.h;
        if (view != null) {
            view.layout(0, 0, i14, i15);
        }
        TextureView textureView = this.f2706f;
        textureView.layout(0, 0, textureView.getMeasuredWidth(), textureView.getMeasuredHeight());
        View view2 = this.d;
        if (view2 == null) {
            view2 = this.f2705c;
        }
        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
        f();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view;
        this.f2710w = true;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.setScreenRotation(defaultDisplay.getRotation());
        }
        this.f2710w = false;
        super.onMeasure(i10, i11);
        if (textureViewRenderer != null) {
            view = textureViewRenderer;
        } else {
            view = this.f2705c;
        }
        TextureView textureView = this.f2706f;
        textureView.getLayoutParams().width = view.getMeasuredWidth();
        textureView.getLayoutParams().height = view.getMeasuredHeight();
        super.onMeasure(i10, i11);
        if (textureViewRenderer != null) {
            textureViewRenderer.updateRotation();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f2710w) {
            return;
        }
        super.requestLayout();
    }

    public void setAccount(int i10) {
        if (this.f2703a == i10) {
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f2703a);
            int i11 = NotificationCenter.liveStoryUpdated;
            notificationCenter.removeObserver(this, i11);
            this.f2703a = i10;
            NotificationCenter.getInstance(i10).addObserver(this, i11);
            return;
        }
        this.f2703a = i10;
    }

    public void setKeyboardOffset(float f7) {
        this.f2711x = f7;
        f();
    }

    public void setOnFirstFrameCallback(Runnable runnable) {
        this.f2707n = runnable;
    }

    public void setSecure(boolean z10) {
        SurfaceViewRenderer surfaceViewRenderer = this.f2705c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.setSecure(z10);
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
