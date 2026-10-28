package fi;

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
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;
public final class b4 extends FrameLayout implements RendererCommon.RendererEvents, NotificationCenter.NotificationCenterDelegate {
    public int f10547a;
    public final a4 f10548b;
    public final SurfaceViewRenderer f10549c;
    public final TextureViewRenderer d;
    public final org.telegram.ui.Components.y9 e;
    public final TextureView f10550f;
    public View h;
    public Runnable f10551n;
    public boolean f10552r;
    public long f10553s;
    public di.p4 v;
    public boolean f10554w;
    public float f10555x;
    public boolean f10556y;

    public b4(Context context, int i10) {
        super(context);
        this.f10547a = i10;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.e = y9Var;
        y9Var.setAlpha(0.75f);
        addView(y9Var, kb1.i(-1, -1, 119));
        TextureView textureView = new TextureView(context);
        this.f10550f = textureView;
        addView(textureView, kb1.i(-1, -1, 119));
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context);
        this.d = textureViewRenderer;
        textureViewRenderer.setOpaque(false);
        textureViewRenderer.setEnableHardwareScaler(true);
        textureViewRenderer.setIsCamera(true);
        textureViewRenderer.setRotateTextureWithScreen(true);
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        addView(textureViewRenderer, kb1.i(-1, -1, 119));
        textureViewRenderer.setAlpha(1.0f);
        this.f10549c = null;
        a4 a4Var = new a4(context);
        this.f10548b = a4Var;
        a4Var.setAlpha(0.0f);
        a4Var.setVisibility(8);
        addView(a4Var, kb1.i(-1, -1, 119));
    }

    public final boolean a() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer.isAvailable();
        }
        if (this.f10549c != null) {
            return true;
        }
        return false;
    }

    public final void b() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        SurfaceViewRenderer surfaceViewRenderer = this.f10549c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        this.f10552r = false;
        e(false, false);
    }

    public final void c(Runnable runnable, boolean z10) {
        float f7;
        bi.w6 w6Var;
        if (this.f10556y == z10) {
            return;
        }
        this.f10556y = z10;
        a4 a4Var = this.f10548b;
        int i10 = 0;
        a4Var.setVisibility(0);
        d dVar = a4Var.f10504b;
        ViewPropertyAnimator animate = a4Var.animate();
        if (this.f10556y) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        animate.alpha(f7).setInterpolator(ds.h).setDuration(320L).withEndAction(new bh.n(6, this, z10)).start();
        dVar.setVisibility((!z10 || runnable == null) ? 8 : 8);
        if (runnable == null) {
            w6Var = null;
        } else {
            w6Var = new bi.w6(2, runnable);
        }
        dVar.setOnClickListener(w6Var);
    }

    public final void d(long j10, di.p4 p4Var) {
        di.b1 b1Var;
        di.h1 h1Var;
        di.h1 h1Var2;
        int f7;
        int f10;
        TextureViewRenderer textureViewRenderer;
        int dp;
        int width;
        if (p4Var == null) {
            long j11 = this.f10553s;
            if (j11 != 0 && this.f10552r && (textureViewRenderer = this.d) != null) {
                File file = new File(FileLoader.getDirectory(4), b10.i(j11, "live", ".jpg"));
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
        if (this.f10553s != j10) {
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            org.telegram.ui.Components.y9 y9Var = this.e;
            if (i10 == 0) {
                y9Var.b();
            } else {
                String absolutePath = new File(FileLoader.getDirectory(4), b10.i(j10, "live", ".jpg")).getAbsolutePath();
                if (i10 > 0) {
                    TLRPC.User user = MessagesController.getInstance(this.f10547a).getUser(Long.valueOf(j10));
                    ImageLocation forUser = ImageLocation.getForUser(this.f10547a, user, 1);
                    if (user != null) {
                        f10 = org.telegram.ui.Components.j9.d(user.f22177id);
                    } else {
                        f10 = i0.a.f(0.2f, -16777216, -1);
                    }
                    y9Var.getImageReceiver().setImage(ImageLocation.getForPath(absolutePath), "500_500_nocache", forUser, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f10, -16777216), i0.a.f(0.4f, f10, -16777216)}), 0L, null, user, 0);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(this.f10547a).getChat(Long.valueOf(-j10));
                    ImageLocation forChat = ImageLocation.getForChat(this.f10547a, chat, 1);
                    if (chat != null) {
                        f7 = org.telegram.ui.Components.j9.d(chat.f22028id);
                    } else {
                        f7 = i0.a.f(0.2f, -16777216, -1);
                    }
                    y9Var.getImageReceiver().setImage(ImageLocation.getForPath(absolutePath), "500_500_nocache", forChat, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.a.f(0.2f, f7, -16777216), i0.a.f(0.4f, f7, -16777216)}), 0L, null, chat, 0);
                }
            }
        }
        this.f10553s = j10;
        this.v = p4Var;
        if (this.f10552r && p4Var != null && !p4Var.f8899a) {
            p4Var.f8899a = true;
            p4Var.b();
        }
        z10 = (p4Var == null || (h1Var2 = (di.h1) p4Var.f8900b) == null || !h1Var2.n()) ? false : false;
        if (p4Var != null && (h1Var = (di.h1) p4Var.f8900b) != null && h1Var.a()) {
            di.h1 h1Var3 = (di.h1) p4Var.f8900b;
            Objects.requireNonNull(h1Var3);
            b1Var = new di.b1(h1Var3, 12);
        } else {
            b1Var = null;
        }
        c(b1Var, z10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        di.h1 h1Var;
        di.b1 b1Var;
        if (i10 == NotificationCenter.liveStoryUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            di.p4 p4Var = this.v;
            if (p4Var != null && (h1Var = (di.h1) p4Var.f8900b) != null && h1Var.g() == longValue) {
                boolean n10 = ((di.h1) this.v.f8900b).n();
                if (((di.h1) this.v.f8900b).a()) {
                    di.h1 h1Var2 = (di.h1) this.v.f8900b;
                    Objects.requireNonNull(h1Var2);
                    b1Var = new di.b1(h1Var2, 12);
                } else {
                    b1Var = null;
                }
                c(b1Var, n10);
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
            TextureView textureView = this.f10550f;
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
            TextureView textureView = this.f10550f;
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
        float f7 = 0.0f;
        if (z11) {
            ViewPropertyAnimator animate = getTextureView().animate();
            if (z10) {
                f7 = 1.0f;
            }
            wh.q(animate.alpha(f7), ds.h, 320L);
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
                view = this.f10549c;
            }
            TextureView textureView = this.f10550f;
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
            textureView.setTranslationY(((f11 - (f12 * max)) / 2.0f) - (this.f10555x / 2.0f));
            float measuredWidth3 = view.getMeasuredWidth();
            float measuredHeight3 = view.getMeasuredHeight();
            float max2 = Math.max(measuredWidth3 / f7, measuredHeight3 / f11);
            view.setScaleX(max2);
            view.setScaleY(max2);
            view.setTranslationX((f7 - (measuredWidth3 * max2)) / 2.0f);
            view.setTranslationY(((f11 - (measuredHeight3 * max2)) / 2.0f) - (this.f10555x / 2.0f));
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
            addView(view, kb1.k());
        }
        return this.h;
    }

    public VideoSink getSink() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        SurfaceViewRenderer surfaceViewRenderer = this.f10549c;
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
        SurfaceViewRenderer surfaceViewRenderer = this.f10549c;
        if (surfaceViewRenderer != null) {
            return surfaceViewRenderer;
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SurfaceViewRenderer surfaceViewRenderer = this.f10549c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
            textureViewRenderer.setBackgroundRenderer(this.f10550f);
        }
        NotificationCenter.getInstance(this.f10547a).addWeakObserver(this, NotificationCenter.liveStoryUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10552r = false;
        e(false, false);
        SurfaceViewRenderer surfaceViewRenderer = this.f10549c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        NotificationCenter.getInstance(this.f10547a).removeObserver(this, NotificationCenter.liveStoryUpdated);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onFirstFrameRendered() {
        if (!this.f10552r) {
            di.p4 p4Var = this.v;
            if (p4Var != null && !p4Var.f8899a) {
                p4Var.f8899a = true;
                p4Var.b();
            }
            this.f10552r = true;
        }
        e(true, true);
        Runnable runnable = this.f10551n;
        if (runnable != null) {
            runnable.run();
            this.f10551n = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        this.e.layout(0, 0, i14, i15);
        this.f10548b.layout(0, 0, i14, i15);
        View view = this.h;
        if (view != null) {
            view.layout(0, 0, i14, i15);
        }
        TextureView textureView = this.f10550f;
        textureView.layout(0, 0, textureView.getMeasuredWidth(), textureView.getMeasuredHeight());
        View view2 = this.d;
        if (view2 == null) {
            view2 = this.f10549c;
        }
        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
        f();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view;
        this.f10554w = true;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.setScreenRotation(defaultDisplay.getRotation());
        }
        this.f10554w = false;
        super.onMeasure(i10, i11);
        if (textureViewRenderer != null) {
            view = textureViewRenderer;
        } else {
            view = this.f10549c;
        }
        TextureView textureView = this.f10550f;
        textureView.getLayoutParams().width = view.getMeasuredWidth();
        textureView.getLayoutParams().height = view.getMeasuredHeight();
        super.onMeasure(i10, i11);
        if (textureViewRenderer != null) {
            textureViewRenderer.updateRotation();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f10554w) {
            return;
        }
        super.requestLayout();
    }

    public void setAccount(int i10) {
        if (this.f10547a == i10) {
            return;
        }
        if (isAttachedToWindow()) {
            NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f10547a);
            int i11 = NotificationCenter.liveStoryUpdated;
            notificationCenter.removeObserver(this, i11);
            this.f10547a = i10;
            NotificationCenter.getInstance(i10).addWeakObserver(this, i11);
            return;
        }
        this.f10547a = i10;
    }

    public void setKeyboardOffset(float f7) {
        this.f10555x = f7;
        f();
    }

    public void setOnFirstFrameCallback(Runnable runnable) {
        this.f10551n = runnable;
    }

    public void setSecure(boolean z10) {
        SurfaceViewRenderer surfaceViewRenderer = this.f10549c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.setSecure(z10);
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
