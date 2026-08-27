package lh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
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
import org.telegram.messenger.rl;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
import org.webrtc.VideoSink;

public final class c4 extends FrameLayout implements RendererCommon.RendererEvents, NotificationCenter.NotificationCenterDelegate {

    public int f15734a;

    public final b4 f15735b;

    public final SurfaceViewRenderer f15736c;
    public final TextureViewRenderer d;

    public final org.telegram.ui.Components.n9 f15737e;

    public final TextureView f15738f;
    public View h;

    public Runnable f15739n;

    public boolean f15740r;

    public long f15741s;
    public jh.d4 v;

    public boolean f15742w;

    public float f15743x;

    public boolean f15744y;

    public c4(Context context, int i10) {
        super(context);
        this.f15734a = i10;
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f15737e = n9Var;
        n9Var.setAlpha(0.75f);
        addView(n9Var, h7.z5.e(-1, -1, 119));
        TextureView textureView = new TextureView(context);
        this.f15738f = textureView;
        addView(textureView, h7.z5.e(-1, -1, 119));
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context);
        this.d = textureViewRenderer;
        textureViewRenderer.setOpaque(false);
        textureViewRenderer.setEnableHardwareScaler(true);
        textureViewRenderer.setIsCamera(true);
        textureViewRenderer.setRotateTextureWithScreen(true);
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        addView(textureViewRenderer, h7.z5.e(-1, -1, 119));
        textureViewRenderer.setAlpha(1.0f);
        this.f15736c = null;
        b4 b4Var = new b4(context);
        this.f15735b = b4Var;
        b4Var.setAlpha(0.0f);
        b4Var.setVisibility(8);
        addView(b4Var, h7.z5.e(-1, -1, 119));
    }

    public final boolean a() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer.isAvailable();
        }
        return this.f15736c != null;
    }

    public final void b() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        SurfaceViewRenderer surfaceViewRenderer = this.f15736c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        this.f15740r = false;
        e(false, false);
    }

    public final void c(Runnable runnable, boolean z10) {
        if (this.f15744y == z10) {
            return;
        }
        this.f15744y = z10;
        b4 b4Var = this.f15735b;
        b4Var.setVisibility(0);
        d dVar = b4Var.f15678b;
        b4Var.animate().alpha(this.f15744y ? 1.0f : 0.0f).setInterpolator(er.h).setDuration(320L).withEndAction(new fh.f(8, this, z10)).start();
        dVar.setVisibility((!z10 || runnable == null) ? 8 : 0);
        dVar.setOnClickListener(runnable == null ? null : new eg.v(4, runnable));
    }

    public final void d(long j10, jh.d4 d4Var) {
        jh.y0 y0Var;
        jh.d1 d1Var;
        jh.d1 d1Var2;
        TextureViewRenderer textureViewRenderer;
        int iDp;
        int width;
        if (d4Var == null) {
            long j11 = this.f15741s;
            if (j11 != 0 && this.f15740r && (textureViewRenderer = this.d) != null) {
                File file = new File(FileLoader.getDirectory(4), com.google.android.recaptcha.internal.a.m(j11, "live", ".jpg"));
                Bitmap bitmap = textureViewRenderer.getBitmap();
                if (bitmap != null) {
                    Paint paint = new Paint(3);
                    if (bitmap.getWidth() > bitmap.getHeight()) {
                        width = AndroidUtilities.dp(100.0f);
                        iDp = (int) ((bitmap.getHeight() / bitmap.getWidth()) * AndroidUtilities.dp(100.0f));
                    } else {
                        iDp = AndroidUtilities.dp(100.0f);
                        width = (int) ((bitmap.getWidth() / bitmap.getHeight()) * AndroidUtilities.dp(100.0f));
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, iDp, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    float width2 = width / bitmap.getWidth();
                    canvas.scale(width2, width2);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                    Utilities.stackBlurBitmap(bitmapCreateBitmap, AndroidUtilities.dp(4.0f));
                    try {
                        bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                }
            }
        }
        if (this.f15741s != j10) {
            org.telegram.ui.Components.n9 n9Var = this.f15737e;
            if (j10 == 0) {
                n9Var.b();
            } else {
                String absolutePath = new File(FileLoader.getDirectory(4), com.google.android.recaptcha.internal.a.m(j10, "live", ".jpg")).getAbsolutePath();
                if (j10 > 0) {
                    TLRPC.User user = MessagesController.getInstance(this.f15734a).getUser(Long.valueOf(j10));
                    ImageLocation forUser = ImageLocation.getForUser(this.f15734a, user, 1);
                    int iD = user != null ? org.telegram.ui.Components.y8.d(user.f22527id) : i0.b.d(0.2f, -16777216, -1);
                    n9Var.getImageReceiver().setImage(ImageLocation.getForPath(absolutePath), "500_500_nocache", forUser, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.b.d(0.2f, iD, -16777216), i0.b.d(0.4f, iD, -16777216)}), 0L, null, user, 0);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(this.f15734a).getChat(Long.valueOf(-j10));
                    ImageLocation forChat = ImageLocation.getForChat(this.f15734a, chat, 1);
                    int iD2 = chat != null ? org.telegram.ui.Components.y8.d(chat.f22380id) : i0.b.d(0.2f, -16777216, -1);
                    n9Var.getImageReceiver().setImage(ImageLocation.getForPath(absolutePath), "500_500_nocache", forChat, "50_50_b2", null, null, new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i0.b.d(0.2f, iD2, -16777216), i0.b.d(0.4f, iD2, -16777216)}), 0L, null, chat, 0);
                }
            }
        }
        this.f15741s = j10;
        this.v = d4Var;
        if (this.f15740r && d4Var != null && !d4Var.f13195f) {
            d4Var.f13195f = true;
            d4Var.a();
        }
        boolean z10 = (d4Var == null || (d1Var2 = d4Var.f13191a) == null || !d1Var2.n()) ? false : true;
        if (d4Var == null || (d1Var = d4Var.f13191a) == null || !d1Var.a()) {
            y0Var = null;
        } else {
            jh.d1 d1Var3 = d4Var.f13191a;
            Objects.requireNonNull(d1Var3);
            y0Var = new jh.y0(d1Var3, 12);
        }
        c(y0Var, z10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        jh.d1 d1Var;
        jh.y0 y0Var;
        if (i10 == NotificationCenter.liveStoryUpdated) {
            long jLongValue = ((Long) objArr[0]).longValue();
            jh.d4 d4Var = this.v;
            if (d4Var == null || (d1Var = d4Var.f13191a) == null || d1Var.g() != jLongValue) {
                return;
            }
            boolean zN = this.v.f13191a.n();
            if (this.v.f13191a.a()) {
                jh.d1 d1Var2 = this.v.f13191a;
                Objects.requireNonNull(d1Var2);
                y0Var = new jh.y0(d1Var2, 12);
            } else {
                y0Var = null;
            }
            c(y0Var, zN);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!AndroidUtilities.makingGlobalBlurBitmap) {
            super.draw(canvas);
            return;
        }
        TextureView textureView = this.f15738f;
        if (textureView == null || (bitmap = textureView.getBitmap()) == null) {
            return;
        }
        canvas.save();
        canvas.translate(textureView.getX(), textureView.getY());
        canvas.scale((textureView.getScaleX() * textureView.getWidth()) / bitmap.getWidth(), (textureView.getScaleY() * textureView.getHeight()) / bitmap.getHeight());
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
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
            TextureView textureView = this.f15738f;
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
        if (z10 || !z11) {
            if (z11) {
                rl.o(getTextureView().animate().alpha(z10 ? 1.0f : 0.0f), er.h, 320L);
            } else {
                getTextureView().animate().cancel();
                getTextureView().setAlpha(z10 ? 1.0f : 0.0f);
            }
        }
    }

    public final void f() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!isAttachedToWindow() || measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        View view = this.d;
        if (view == null) {
            view = this.f15736c;
        }
        TextureView textureView = this.f15738f;
        int measuredWidth2 = textureView.getMeasuredWidth();
        int measuredHeight2 = textureView.getMeasuredHeight();
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        float f10 = measuredWidth;
        float f11 = measuredWidth2;
        float f12 = measuredHeight;
        float f13 = measuredHeight2;
        float fMax = Math.max(f10 / f11, f12 / f13);
        textureView.setScaleX(fMax);
        textureView.setScaleY(fMax);
        textureView.setTranslationX((f10 - (f11 * fMax)) / 2.0f);
        textureView.setTranslationY(((f12 - (f13 * fMax)) / 2.0f) - (this.f15743x / 2.0f));
        float measuredWidth3 = view.getMeasuredWidth();
        float measuredHeight3 = view.getMeasuredHeight();
        float fMax2 = Math.max(measuredWidth3 / f10, measuredHeight3 / f12);
        view.setScaleX(fMax2);
        view.setScaleY(fMax2);
        view.setTranslationX((f10 - (measuredWidth3 * fMax2)) / 2.0f);
        view.setTranslationY(((f12 - (measuredHeight3 * fMax2)) / 2.0f) - (this.f15743x / 2.0f));
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
            addView(view, h7.z5.g());
        }
        return this.h;
    }

    public VideoSink getSink() {
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            return textureViewRenderer;
        }
        SurfaceViewRenderer surfaceViewRenderer = this.f15736c;
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
        SurfaceViewRenderer surfaceViewRenderer = this.f15736c;
        if (surfaceViewRenderer != null) {
            return surfaceViewRenderer;
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SurfaceViewRenderer surfaceViewRenderer = this.f15736c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), this);
            textureViewRenderer.setBackgroundRenderer(this.f15738f);
        }
        NotificationCenter.getInstance(this.f15734a).addObserver(this, NotificationCenter.liveStoryUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15740r = false;
        e(false, false);
        SurfaceViewRenderer surfaceViewRenderer = this.f15736c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.release();
        }
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.release();
        }
        NotificationCenter.getInstance(this.f15734a).removeObserver(this, NotificationCenter.liveStoryUpdated);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onFirstFrameRendered() {
        if (!this.f15740r) {
            jh.d4 d4Var = this.v;
            if (d4Var != null && !d4Var.f13195f) {
                d4Var.f13195f = true;
                d4Var.a();
            }
            this.f15740r = true;
        }
        e(true, true);
        Runnable runnable = this.f15739n;
        if (runnable != null) {
            runnable.run();
            this.f15739n = null;
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        this.f15737e.layout(0, 0, i14, i15);
        this.f15735b.layout(0, 0, i14, i15);
        View view = this.h;
        if (view != null) {
            view.layout(0, 0, i14, i15);
        }
        TextureView textureView = this.f15738f;
        textureView.layout(0, 0, textureView.getMeasuredWidth(), textureView.getMeasuredHeight());
        View view2 = this.d;
        if (view2 == null) {
            view2 = this.f15736c;
        }
        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
        f();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f15742w = true;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        TextureViewRenderer textureViewRenderer = this.d;
        if (textureViewRenderer != null) {
            textureViewRenderer.setScreenRotation(defaultDisplay.getRotation());
        }
        this.f15742w = false;
        super.onMeasure(i10, i11);
        View view = textureViewRenderer != null ? textureViewRenderer : this.f15736c;
        TextureView textureView = this.f15738f;
        textureView.getLayoutParams().width = view.getMeasuredWidth();
        textureView.getLayoutParams().height = view.getMeasuredHeight();
        super.onMeasure(i10, i11);
        if (textureViewRenderer != null) {
            textureViewRenderer.updateRotation();
        }
    }

    @Override
    public final void requestLayout() {
        if (this.f15742w) {
            return;
        }
        super.requestLayout();
    }

    public void setAccount(int i10) {
        if (this.f15734a == i10) {
            return;
        }
        if (!isAttachedToWindow()) {
            this.f15734a = i10;
            return;
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f15734a);
        int i11 = NotificationCenter.liveStoryUpdated;
        notificationCenter.removeObserver(this, i11);
        this.f15734a = i10;
        NotificationCenter.getInstance(i10).addObserver(this, i11);
    }

    public void setKeyboardOffset(float f10) {
        this.f15743x = f10;
        f();
    }

    public void setOnFirstFrameCallback(Runnable runnable) {
        this.f15739n = runnable;
    }

    public void setSecure(boolean z10) {
        SurfaceViewRenderer surfaceViewRenderer = this.f15736c;
        if (surfaceViewRenderer != null) {
            surfaceViewRenderer.setSecure(z10);
        }
    }

    @Override
    public final void onFrameResolutionChanged(int i10, int i11, int i12) {
    }
}
