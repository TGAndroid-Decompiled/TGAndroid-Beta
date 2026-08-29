package org.telegram.messenger;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.u10;
public class BotFullscreenButtons extends View {
    private final org.telegram.ui.Components.d6 animatedBack;
    private final org.telegram.ui.Components.d6 animatedDownloading;
    private final org.telegram.ui.Components.d6 animatedPreview;
    private boolean back;
    private final zz0 backText;
    private final Paint backgroundPaint;
    private final Path backgroundPath;
    private RenderNode blurNode;
    private final org.telegram.ui.Components.uc closeBounce;
    private final RectF closeRect;
    private final RectF closeRectArea;
    private final zz0 closeText;
    private final org.telegram.ui.Components.uc collapseBounce;
    private final RectF collapseClickRect;
    private final RectF collapseRect;
    private final Paint downloadPaint;
    private final Path downloadPath;
    private boolean downloading;
    private final Runnable hidePreview;
    private final Paint iconPaint;
    private final Paint iconStrokePaint;
    private final RectF insets;
    private final RectF leftMenu;
    private final org.telegram.ui.Components.uc menuBounce;
    private final RectF menuClickRect;
    private final RectF menuRect;
    private final org.telegram.ui.Components.uc nullBounce;
    public Runnable onCloseClickListener;
    public Runnable onCollapseClickListener;
    public Runnable onMenuClickListener;
    public Object parentRenderNode;
    int pressed;
    private boolean preview;
    private final u10 previewClip;
    private zz0 previewText;
    private final RectF rightMenu;
    private final long start;
    private Drawable verifiedBackground;
    private Drawable verifiedForeground;
    public WebView webView;

    public static class OptionsIcon extends Drawable {
        private final org.telegram.ui.Components.d6 animatedDownloading;
        private final Paint downloadPaint;
        private final Path downloadPath;
        private boolean downloading;
        private final Drawable drawable;
        private final long start;

        public OptionsIcon(Context context) {
            Paint paint = new Paint(1);
            this.downloadPaint = paint;
            Path path = new Path();
            this.downloadPath = path;
            this.downloading = false;
            this.animatedDownloading = new org.telegram.ui.Components.d6(new d1(this, 14), 420L, jr.h, 0);
            this.start = System.currentTimeMillis();
            this.drawable = context.getResources().getDrawable(R.drawable.ic_ab_other).mutate();
            paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.0f)));
            path.rewind();
            path.moveTo(-AndroidUtilities.dpf2(1.33f), AndroidUtilities.dpf2(0.16f));
            path.lineTo(-AndroidUtilities.dpf2(1.33f), -AndroidUtilities.dpf2(3.5f));
            path.lineTo(AndroidUtilities.dpf2(1.33f), -AndroidUtilities.dpf2(3.5f));
            path.lineTo(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dpf2(0.16f));
            path.lineTo(AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(0.16f));
            path.lineTo(0.0f, AndroidUtilities.dpf2(3.5f));
            path.lineTo(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(0.16f));
            path.close();
        }

        @Override
        public void draw(Canvas canvas) {
            this.drawable.setBounds(getBounds());
            this.drawable.draw(canvas);
            float e10 = this.animatedDownloading.e(this.downloading);
            if (e10 > 0.0f) {
                canvas.save();
                canvas.translate(getBounds().centerX(), getBounds().centerY());
                canvas.translate(-AndroidUtilities.dpf2(8.166f), AndroidUtilities.dpf2(5.0f));
                float f9 = (e10 * 0.5f) + 0.5f;
                canvas.scale(f9, f9);
                this.downloadPaint.setColor(org.telegram.ui.ActionBar.g6.l1(0.4f, -1));
                canvas.drawPath(this.downloadPath, this.downloadPaint);
                float currentTimeMillis = ((float) ((System.currentTimeMillis() - this.start) % 450)) / 450.0f;
                float f10 = 0.5f + currentTimeMillis;
                canvas.save();
                canvas.clipRect(-AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), currentTimeMillis), AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), f10));
                this.downloadPaint.setColor(org.telegram.ui.ActionBar.g6.l1(1.0f, -1));
                canvas.drawPath(this.downloadPath, this.downloadPaint);
                canvas.restore();
                if (f10 > 1.0f) {
                    canvas.save();
                    canvas.clipRect(-AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), 0.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), f10 - 1.0f));
                    this.downloadPaint.setColor(org.telegram.ui.ActionBar.g6.l1(1.0f, -1));
                    canvas.drawPath(this.downloadPath, this.downloadPaint);
                    canvas.restore();
                }
                canvas.restore();
                invalidateSelf();
            }
        }

        @Override
        public int getIntrinsicHeight() {
            return this.drawable.getIntrinsicHeight();
        }

        @Override
        public int getIntrinsicWidth() {
            return this.drawable.getIntrinsicWidth();
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i10) {
            this.drawable.setAlpha(i10);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.downloadPaint.setColorFilter(colorFilter);
            this.drawable.setColorFilter(colorFilter);
        }

        public void setDownloading(boolean z10) {
            if (this.downloading == z10) {
                return;
            }
            this.downloading = z10;
            invalidateSelf();
        }
    }

    public BotFullscreenButtons(Context context) {
        super(context);
        this.backgroundPaint = new Paint(1);
        this.iconPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.iconStrokePaint = paint;
        this.backgroundPath = new Path();
        Paint paint2 = new Paint(1);
        this.downloadPaint = paint2;
        Path path = new Path();
        this.downloadPath = path;
        this.insets = new RectF();
        this.leftMenu = new RectF();
        this.nullBounce = new org.telegram.ui.Components.uc((View) null);
        this.closeRect = new RectF();
        this.closeRectArea = new RectF();
        this.closeBounce = new org.telegram.ui.Components.uc(this);
        this.rightMenu = new RectF();
        this.collapseRect = new RectF();
        this.collapseClickRect = new RectF();
        this.collapseBounce = new org.telegram.ui.Components.uc(this);
        this.menuRect = new RectF();
        this.menuClickRect = new RectF();
        this.menuBounce = new org.telegram.ui.Components.uc(this);
        jr jrVar = jr.h;
        this.animatedBack = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.preview = true;
        this.animatedPreview = new org.telegram.ui.Components.d6(this, 0L, 420L, jrVar);
        this.downloading = false;
        this.animatedDownloading = new org.telegram.ui.Components.d6(this, 0L, 420L, jrVar);
        this.previewClip = new u10();
        this.hidePreview = new d1(this, 13);
        this.start = System.currentTimeMillis();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.backText = new zz0(LocaleController.getString(R.string.BotFullscreenBack), 13.0f, AndroidUtilities.bold());
        this.closeText = new zz0(LocaleController.getString(R.string.BotFullscreenClose), 13.0f, AndroidUtilities.bold());
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(1.0f)));
        path.rewind();
        path.moveTo(-AndroidUtilities.dpf2(1.33f), AndroidUtilities.dpf2(0.16f));
        path.lineTo(-AndroidUtilities.dpf2(1.33f), -AndroidUtilities.dpf2(3.5f));
        path.lineTo(AndroidUtilities.dpf2(1.33f), -AndroidUtilities.dpf2(3.5f));
        path.lineTo(AndroidUtilities.dpf2(1.33f), AndroidUtilities.dpf2(0.16f));
        path.lineTo(AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(0.16f));
        path.lineTo(0.0f, AndroidUtilities.dpf2(3.5f));
        path.lineTo(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(0.16f));
        path.close();
    }

    public static void a(BotFullscreenButtons botFullscreenButtons) {
        botFullscreenButtons.lambda$new$0();
    }

    private org.telegram.ui.Components.uc getBounce(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return this.nullBounce;
                }
                return this.menuBounce;
            }
            return this.collapseBounce;
        }
        return this.closeBounce;
    }

    private int getButton(MotionEvent motionEvent) {
        if (this.closeRectArea.contains(motionEvent.getX(), motionEvent.getY())) {
            return 1;
        }
        if (this.collapseClickRect.contains(motionEvent.getX(), motionEvent.getY())) {
            return 2;
        }
        if (this.menuClickRect.contains(motionEvent.getX(), motionEvent.getY())) {
            return 3;
        }
        return 0;
    }

    public void lambda$new$0() {
        setPreview(false, true);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f9;
        float f10;
        float dp;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        WebView webView;
        super.onDraw(canvas);
        this.iconPaint.setColor(-1);
        this.iconStrokePaint.setColor(-1);
        this.iconStrokePaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.backgroundPath.rewind();
        this.rightMenu.set((getWidth() - this.insets.right) - AndroidUtilities.dp(79.66f), this.insets.top + AndroidUtilities.dp(8.0f), (getWidth() - this.insets.right) - AndroidUtilities.dp(8.0f), this.insets.top + AndroidUtilities.dp(38.0f));
        RectF rectF = this.collapseRect;
        RectF rectF2 = this.rightMenu;
        rectF.set(rectF2.left, rectF2.top, rectF2.centerX(), this.rightMenu.bottom);
        RectF rectF3 = this.collapseClickRect;
        float dp2 = this.collapseRect.left - AndroidUtilities.dp(8.0f);
        float dp3 = this.collapseRect.top - AndroidUtilities.dp(8.0f);
        RectF rectF4 = this.collapseRect;
        rectF3.set(dp2, dp3, rectF4.right, rectF4.bottom + AndroidUtilities.dp(8.0f));
        RectF rectF5 = this.menuRect;
        float centerX = this.rightMenu.centerX();
        RectF rectF6 = this.rightMenu;
        rectF5.set(centerX, rectF6.top, rectF6.right, rectF6.bottom);
        RectF rectF7 = this.menuClickRect;
        RectF rectF8 = this.menuRect;
        rectF7.set(rectF8.left, rectF8.top - AndroidUtilities.dp(8.0f), this.menuRect.right + AndroidUtilities.dp(8.0f), this.menuRect.bottom + AndroidUtilities.dp(8.0f));
        Path.Direction direction = Path.Direction.CW;
        this.backgroundPath.addRoundRect(this.rightMenu, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), direction);
        float e10 = this.animatedBack.e(this.back);
        float e11 = this.animatedPreview.e(this.preview);
        float dp4 = (this.rightMenu.left - AndroidUtilities.dp(18.0f)) - (this.insets.left + AndroidUtilities.dp(38.0f));
        zz0 zz0Var = this.previewText;
        if (zz0Var == null) {
            dp = 0.0f;
            f9 = 18.0f;
        } else {
            float f16 = zz0Var.f35462c;
            f9 = 18.0f;
            if (this.verifiedBackground != null) {
                f10 = 30.0f;
            } else {
                f10 = 12.0f;
            }
            dp = f16 + AndroidUtilities.dp(f10);
        }
        float min = Math.min(dp4, dp);
        this.leftMenu.set(this.insets.left + AndroidUtilities.dp(8.0f), this.insets.top + AndroidUtilities.dp(8.0f), this.insets.left + AndroidUtilities.dp(38.0f) + AndroidUtilities.lerp(AndroidUtilities.lerp(this.closeText.f35462c, this.backText.f35462c, e10) + AndroidUtilities.dp(12.0f), min, e11), this.insets.top + AndroidUtilities.dp(38.0f));
        RectF rectF9 = this.closeRect;
        RectF rectF10 = this.leftMenu;
        float f17 = rectF10.left;
        rectF9.set(f17, rectF10.top, AndroidUtilities.dp(30.0f) + f17, this.leftMenu.bottom);
        this.closeRectArea.set(this.closeRect);
        this.closeRectArea.right = AndroidUtilities.lerp(this.leftMenu.right, this.closeRect.left + AndroidUtilities.dp(30.0f), e11);
        this.closeRectArea.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        this.backgroundPath.addRoundRect(this.leftMenu, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), direction);
        if (this.parentRenderNode == null || Build.VERSION.SDK_INT < 31 || !canvas.isHardwareAccelerated() || ((webView = this.webView) != null && webView.getLayerType() != 2)) {
            f11 = 12.0f;
            f12 = 16.0f;
            this.backgroundPaint.setColor(org.telegram.ui.ActionBar.g6.l1(0.35f, -16777216));
            canvas.drawPath(this.backgroundPath, this.backgroundPaint);
        } else {
            if (this.blurNode == null) {
                RenderNode renderNode = new RenderNode("bot_fullscreen_blur");
                this.blurNode = renderNode;
                f11 = 12.0f;
                renderNode.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(f9), AndroidUtilities.dp(f9), Shader.TileMode.CLAMP));
            } else {
                f11 = 12.0f;
            }
            RenderNode c3 = b.c(this.parentRenderNode);
            f12 = 16.0f;
            this.blurNode.setPosition(0, 0, j7.l1.d(16.0f, c3.getWidth(), 1), Math.max(1, (int) Math.min(this.insets.top + AndroidUtilities.dp(46.0f), c3.getHeight())));
            RecordingCanvas beginRecording = this.blurNode.beginRecording();
            beginRecording.translate(-AndroidUtilities.dp(8.0f), 0.0f);
            beginRecording.drawRenderNode(c3);
            this.blurNode.endRecording();
            canvas.save();
            canvas.clipPath(this.backgroundPath);
            canvas.save();
            canvas.translate(AndroidUtilities.dp(8.0f), 0.0f);
            canvas.drawRenderNode(this.blurNode);
            canvas.restore();
            this.backgroundPaint.setColor(org.telegram.ui.ActionBar.g6.l1(0.22f, -16777216));
            canvas.drawPaint(this.backgroundPaint);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(this.closeRect.centerX(), this.closeRect.centerY());
        float a2 = this.closeBounce.a(0.1f);
        canvas.scale(a2, a2);
        canvas.translate((-AndroidUtilities.dp(6.5f)) * e10, 0.0f);
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(5.5f), e10);
        float f18 = -lerp;
        canvas.drawLine(AndroidUtilities.lerp(f18, 0.0f, e10), AndroidUtilities.lerp(f18, 0.0f, e10), lerp, lerp, this.iconStrokePaint);
        canvas.drawLine(AndroidUtilities.lerp(f18, 0.0f, e10), AndroidUtilities.lerp(lerp, 0.0f, e10), lerp, f18, this.iconStrokePaint);
        int i10 = (e10 > 0.0f ? 1 : (e10 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            canvas.drawLine(0.0f, 0.0f, AndroidUtilities.dp(11.6f) * e10, 0.0f, this.iconStrokePaint);
        }
        canvas.restore();
        float dp5 = (this.leftMenu.left + AndroidUtilities.dp(30.0f)) - AndroidUtilities.dp(10.0f);
        RectF rectF11 = this.leftMenu;
        float f19 = rectF11.top;
        float f20 = rectF11.right;
        float f21 = rectF11.bottom;
        Canvas canvas2 = canvas;
        canvas2.saveLayerAlpha(dp5, f19, f20, f21, 255, 31);
        if (e11 > 0.0f && this.previewText != null) {
            canvas2.save();
            canvas2.translate(org.telegram.ui.th.b(1.0f, e11, min, this.leftMenu.left + AndroidUtilities.dp(30.0f)), this.leftMenu.centerY());
            zz0 zz0Var2 = this.previewText;
            float f22 = this.leftMenu.right;
            if (this.verifiedBackground != null) {
                f15 = 30.0f;
            } else {
                f15 = 12.0f;
            }
            zz0Var2.f35473p = ((f22 - AndroidUtilities.dp(f15)) - (this.leftMenu.left + AndroidUtilities.dp(30.0f))) + 2.0f;
            f14 = 1.0f;
            zz0Var2.c(0.0f, 0.0f, e11, -1, canvas);
            f13 = e11;
            canvas2 = canvas;
            canvas2.translate(this.previewText.l() + AndroidUtilities.dp(5.0f), 0.0f);
            int dp6 = AndroidUtilities.dp(f12);
            Drawable drawable = this.verifiedBackground;
            if (drawable != null) {
                drawable.setBounds(0, (-dp6) / 2, dp6, dp6 / 2);
                this.verifiedBackground.setAlpha((int) (75.0f * f13));
                this.verifiedBackground.draw(canvas2);
            }
            Drawable drawable2 = this.verifiedForeground;
            if (drawable2 != null) {
                drawable2.setBounds(0, (-dp6) / 2, dp6, dp6 / 2);
                this.verifiedForeground.setAlpha((int) (255.0f * f13));
                this.verifiedForeground.draw(canvas2);
            }
            RectF rectF12 = AndroidUtilities.rectTmp;
            float dp7 = (this.leftMenu.left + AndroidUtilities.dp(30.0f)) - AndroidUtilities.dp(10.0f);
            RectF rectF13 = this.leftMenu;
            rectF12.set(dp7, rectF13.top, rectF13.left + AndroidUtilities.dp(30.0f), this.leftMenu.bottom);
            this.previewClip.b(canvas2, rectF12, 2, 1.0f);
            canvas2.restore();
        } else {
            f13 = e11;
            f14 = 1.0f;
        }
        if (f13 < f14) {
            canvas2.save();
            float a10 = this.closeBounce.a(0.1f);
            canvas2.scale(a10, a10, this.closeRect.centerX(), this.closeRect.centerY());
            float f23 = f14 - e10;
            if (f23 > 0.0f) {
                this.closeText.c(((this.closeRect.left + AndroidUtilities.dp(30.0f)) - (AndroidUtilities.dp(f11) * e10)) + (AndroidUtilities.dp(32.0f) * f13), this.closeRect.centerY(), (f14 - f13) * f23, -1, canvas);
            }
            if (i10 > 0) {
                this.backText.c((AndroidUtilities.dp(32.0f) * f13) + (AndroidUtilities.dp(f11) * f23) + this.closeRect.left + AndroidUtilities.dp(30.0f), this.closeRect.centerY(), (f14 - f13) * e10, -1, canvas);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            canvas2.restore();
        }
        canvas2.restore();
        canvas2.save();
        canvas2.translate(this.collapseRect.centerX() + AndroidUtilities.dp(2.0f), this.collapseRect.centerY());
        float a11 = this.collapseBounce.a(0.1f);
        canvas2.scale(a11, a11);
        float dp8 = AndroidUtilities.dp(6.0f);
        float dp9 = AndroidUtilities.dp(3.0f);
        float f24 = -dp9;
        canvas2.drawLine(-dp8, f24, 0.0f, dp9, this.iconStrokePaint);
        canvas.drawLine(0.0f, dp9, dp8, f24, this.iconStrokePaint);
        canvas.restore();
        canvas.save();
        canvas.translate(this.menuRect.centerX() + AndroidUtilities.dp(f14), this.menuRect.centerY());
        float a12 = this.menuBounce.a(0.1f);
        canvas.scale(a12, a12);
        canvas.drawCircle(0.0f, -AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.66f), this.iconPaint);
        canvas.drawCircle(0.0f, 0.0f, AndroidUtilities.dp(1.66f), this.iconPaint);
        canvas.drawCircle(0.0f, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.66f), this.iconPaint);
        float e12 = this.animatedDownloading.e(this.downloading);
        if (e12 > 0.0f) {
            canvas.translate(-AndroidUtilities.dpf2(8.166f), AndroidUtilities.dpf2(3.5f));
            float f25 = (e12 * 0.5f) + 0.5f;
            canvas.scale(f25, f25);
            this.downloadPaint.setColor(org.telegram.ui.ActionBar.g6.l1(0.4f, -1));
            canvas.drawPath(this.downloadPath, this.downloadPaint);
            float currentTimeMillis = ((float) ((System.currentTimeMillis() - this.start) % 450)) / 450.0f;
            float f26 = 0.5f + currentTimeMillis;
            canvas.save();
            canvas.clipRect(-AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), currentTimeMillis), AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), f26));
            this.downloadPaint.setColor(org.telegram.ui.ActionBar.g6.l1(f14, -1));
            canvas.drawPath(this.downloadPath, this.downloadPaint);
            canvas.restore();
            if (f26 > f14) {
                canvas.save();
                canvas.clipRect(-AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), 0.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), f26 - f14));
                this.downloadPaint.setColor(org.telegram.ui.ActionBar.g6.l1(f14, -1));
                canvas.drawPath(this.downloadPath, this.downloadPaint);
                canvas.restore();
            }
            invalidate();
        }
        canvas.restore();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        if (motionEvent.getAction() == 0) {
            getBounce(this.pressed).c(false);
            int button = getButton(motionEvent);
            this.pressed = button;
            getBounce(button).c(true);
        } else if (motionEvent.getAction() == 2) {
            if (getButton(motionEvent) != this.pressed) {
                this.pressed = 0;
                getBounce(0).c(false);
            }
        } else if (motionEvent.getAction() == 1) {
            int i10 = this.pressed;
            if (i10 == 1 && (runnable3 = this.onCloseClickListener) != null) {
                runnable3.run();
            } else if (i10 == 2 && (runnable2 = this.onCollapseClickListener) != null) {
                runnable2.run();
            } else if (i10 == 3 && (runnable = this.onMenuClickListener) != null) {
                runnable.run();
            }
            getBounce(this.pressed).c(false);
            this.pressed = 0;
        } else if (motionEvent.getAction() == 3) {
            getBounce(this.pressed).c(false);
            this.pressed = 0;
        }
        if (this.pressed != 0) {
            return true;
        }
        return false;
    }

    public void setBack(boolean z10) {
        setBack(z10, true);
    }

    public void setDownloading(boolean z10) {
        if (this.downloading == z10) {
            return;
        }
        this.downloading = z10;
        invalidate();
    }

    public void setInsets(RectF rectF) {
        this.insets.set(rectF);
    }

    public void setName(String str, boolean z10) {
        this.previewText = new zz0(str, 13.0f, AndroidUtilities.bold());
        if (!z10) {
            this.verifiedBackground = null;
            this.verifiedForeground = null;
            return;
        }
        this.verifiedBackground = getContext().getResources().getDrawable(R.drawable.verified_area).mutate();
        this.verifiedForeground = getContext().getResources().getDrawable(R.drawable.verified_check).mutate();
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.onCloseClickListener = runnable;
    }

    public void setOnCollapseClickListener(Runnable runnable) {
        this.onCollapseClickListener = runnable;
    }

    public void setOnMenuClickListener(Runnable runnable) {
        this.onMenuClickListener = runnable;
    }

    public void setParentRenderNode(Object obj) {
        this.parentRenderNode = obj;
    }

    public void setPreview(boolean z10, boolean z11) {
        AndroidUtilities.cancelRunOnUIThread(this.hidePreview);
        this.preview = z10;
        if (!z11) {
            this.animatedPreview.f(z10, true);
        }
        invalidate();
        if (z10) {
            AndroidUtilities.runOnUIThread(this.hidePreview, 2500L);
        }
    }

    public void setWebView(WebView webView) {
        this.webView = webView;
    }

    public void setBack(boolean z10, boolean z11) {
        this.back = z10;
        if (!z11) {
            this.animatedBack.e(z10);
        }
        invalidate();
    }

    public void setInsets(Rect rect) {
        this.insets.set(rect);
    }
}
