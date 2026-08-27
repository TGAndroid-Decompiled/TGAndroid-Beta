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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.v10;

public class BotFullscreenButtons extends View {
    private final org.telegram.ui.Components.y5 animatedBack;
    private final org.telegram.ui.Components.y5 animatedDownloading;
    private final org.telegram.ui.Components.y5 animatedPreview;
    private boolean back;
    private final pz0 backText;
    private final Paint backgroundPaint;
    private final Path backgroundPath;
    private RenderNode blurNode;
    private final org.telegram.ui.Components.nc closeBounce;
    private final RectF closeRect;
    private final RectF closeRectArea;
    private final pz0 closeText;
    private final org.telegram.ui.Components.nc collapseBounce;
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
    private final org.telegram.ui.Components.nc menuBounce;
    private final RectF menuClickRect;
    private final RectF menuRect;
    private final org.telegram.ui.Components.nc nullBounce;
    public Runnable onCloseClickListener;
    public Runnable onCollapseClickListener;
    public Runnable onMenuClickListener;
    public Object parentRenderNode;
    int pressed;
    private boolean preview;
    private final v10 previewClip;
    private pz0 previewText;
    private final RectF rightMenu;
    private final long start;
    private Drawable verifiedBackground;
    private Drawable verifiedForeground;
    public WebView webView;

    public static class OptionsIcon extends Drawable {
        private final org.telegram.ui.Components.y5 animatedDownloading;
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
            this.animatedDownloading = new org.telegram.ui.Components.y5(new d1(this, 14), 420L, er.h, 0);
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
            float fE = this.animatedDownloading.e(this.downloading);
            if (fE > 0.0f) {
                canvas.save();
                canvas.translate(getBounds().centerX(), getBounds().centerY());
                canvas.translate(-AndroidUtilities.dpf2(8.166f), AndroidUtilities.dpf2(5.0f));
                float f10 = (fE * 0.5f) + 0.5f;
                canvas.scale(f10, f10);
                this.downloadPaint.setColor(org.telegram.ui.ActionBar.g6.l1(0.4f, -1));
                canvas.drawPath(this.downloadPath, this.downloadPaint);
                float fCurrentTimeMillis = ((System.currentTimeMillis() - this.start) % 450) / 450.0f;
                float f11 = 0.5f + fCurrentTimeMillis;
                canvas.save();
                canvas.clipRect(-AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), fCurrentTimeMillis), AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), f11));
                this.downloadPaint.setColor(org.telegram.ui.ActionBar.g6.l1(1.0f, -1));
                canvas.drawPath(this.downloadPath, this.downloadPaint);
                canvas.restore();
                if (f11 > 1.0f) {
                    canvas.save();
                    canvas.clipRect(-AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), 0.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), f11 - 1.0f));
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
        this.nullBounce = new org.telegram.ui.Components.nc((View) null);
        this.closeRect = new RectF();
        this.closeRectArea = new RectF();
        this.closeBounce = new org.telegram.ui.Components.nc(this);
        this.rightMenu = new RectF();
        this.collapseRect = new RectF();
        this.collapseClickRect = new RectF();
        this.collapseBounce = new org.telegram.ui.Components.nc(this);
        this.menuRect = new RectF();
        this.menuClickRect = new RectF();
        this.menuBounce = new org.telegram.ui.Components.nc(this);
        er erVar = er.h;
        this.animatedBack = new org.telegram.ui.Components.y5(this, 0L, 320L, erVar);
        this.preview = true;
        this.animatedPreview = new org.telegram.ui.Components.y5(this, 0L, 420L, erVar);
        this.downloading = false;
        this.animatedDownloading = new org.telegram.ui.Components.y5(this, 0L, 420L, erVar);
        this.previewClip = new v10();
        this.hidePreview = new d1(this, 13);
        this.start = System.currentTimeMillis();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.backText = new pz0(LocaleController.getString(R.string.BotFullscreenBack), 13.0f, AndroidUtilities.bold());
        this.closeText = new pz0(LocaleController.getString(R.string.BotFullscreenClose), 13.0f, AndroidUtilities.bold());
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

    private org.telegram.ui.Components.nc getBounce(int i10) {
        if (i10 == 1) {
            return this.closeBounce;
        }
        if (i10 != 2) {
            return i10 != 3 ? this.nullBounce : this.menuBounce;
        }
        return this.collapseBounce;
    }

    private int getButton(MotionEvent motionEvent) {
        if (this.closeRectArea.contains(motionEvent.getX(), motionEvent.getY())) {
            return 1;
        }
        if (this.collapseClickRect.contains(motionEvent.getX(), motionEvent.getY())) {
            return 2;
        }
        return this.menuClickRect.contains(motionEvent.getX(), motionEvent.getY()) ? 3 : 0;
    }

    public void lambda$new$0() {
        setPreview(false, true);
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        float fDp;
        float f11;
        float f12;
        float f13;
        float f14;
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
        float fDp2 = this.collapseRect.left - AndroidUtilities.dp(8.0f);
        float fDp3 = this.collapseRect.top - AndroidUtilities.dp(8.0f);
        RectF rectF4 = this.collapseRect;
        rectF3.set(fDp2, fDp3, rectF4.right, rectF4.bottom + AndroidUtilities.dp(8.0f));
        RectF rectF5 = this.menuRect;
        float fCenterX = this.rightMenu.centerX();
        RectF rectF6 = this.rightMenu;
        rectF5.set(fCenterX, rectF6.top, rectF6.right, rectF6.bottom);
        RectF rectF7 = this.menuClickRect;
        RectF rectF8 = this.menuRect;
        rectF7.set(rectF8.left, rectF8.top - AndroidUtilities.dp(8.0f), this.menuRect.right + AndroidUtilities.dp(8.0f), this.menuRect.bottom + AndroidUtilities.dp(8.0f));
        Path path = this.backgroundPath;
        RectF rectF9 = this.rightMenu;
        float fDp4 = AndroidUtilities.dp(15.0f);
        float fDp5 = AndroidUtilities.dp(15.0f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF9, fDp4, fDp5, direction);
        float fE = this.animatedBack.e(this.back);
        float fE2 = this.animatedPreview.e(this.preview);
        float fDp6 = (this.rightMenu.left - AndroidUtilities.dp(18.0f)) - (this.insets.left + AndroidUtilities.dp(38.0f));
        pz0 pz0Var = this.previewText;
        if (pz0Var == null) {
            fDp = 0.0f;
            f10 = 18.0f;
        } else {
            f10 = 18.0f;
            fDp = pz0Var.f31697c + AndroidUtilities.dp(this.verifiedBackground != null ? 30.0f : 12.0f);
        }
        float fMin = Math.min(fDp6, fDp);
        this.leftMenu.set(this.insets.left + AndroidUtilities.dp(8.0f), this.insets.top + AndroidUtilities.dp(8.0f), this.insets.left + AndroidUtilities.dp(38.0f) + AndroidUtilities.lerp(AndroidUtilities.lerp(this.closeText.f31697c, this.backText.f31697c, fE) + AndroidUtilities.dp(12.0f), fMin, fE2), this.insets.top + AndroidUtilities.dp(38.0f));
        RectF rectF10 = this.closeRect;
        RectF rectF11 = this.leftMenu;
        float f15 = rectF11.left;
        rectF10.set(f15, rectF11.top, AndroidUtilities.dp(30.0f) + f15, this.leftMenu.bottom);
        this.closeRectArea.set(this.closeRect);
        this.closeRectArea.right = AndroidUtilities.lerp(this.leftMenu.right, this.closeRect.left + AndroidUtilities.dp(30.0f), fE2);
        this.closeRectArea.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        this.backgroundPath.addRoundRect(this.leftMenu, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), direction);
        if (this.parentRenderNode == null || Build.VERSION.SDK_INT < 31 || !canvas.isHardwareAccelerated() || !((webView = this.webView) == null || webView.getLayerType() == 2)) {
            f11 = 12.0f;
            f12 = 16.0f;
            this.backgroundPaint.setColor(org.telegram.ui.ActionBar.g6.l1(0.35f, -16777216));
            canvas.drawPath(this.backgroundPath, this.backgroundPaint);
        } else {
            if (this.blurNode == null) {
                RenderNode renderNode = new RenderNode("bot_fullscreen_blur");
                this.blurNode = renderNode;
                float fDp7 = AndroidUtilities.dp(f10);
                float fDp8 = AndroidUtilities.dp(f10);
                f11 = 12.0f;
                renderNode.setRenderEffect(RenderEffect.createBlurEffect(fDp7, fDp8, Shader.TileMode.CLAMP));
            } else {
                f11 = 12.0f;
            }
            RenderNode renderNodeC = b.c(this.parentRenderNode);
            f12 = 16.0f;
            this.blurNode.setPosition(0, 0, i0.a.d(16.0f, renderNodeC.getWidth(), 1), Math.max(1, (int) Math.min(this.insets.top + AndroidUtilities.dp(46.0f), renderNodeC.getHeight())));
            RecordingCanvas recordingCanvasBeginRecording = this.blurNode.beginRecording();
            recordingCanvasBeginRecording.translate(-AndroidUtilities.dp(8.0f), 0.0f);
            recordingCanvasBeginRecording.drawRenderNode(renderNodeC);
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
        float fA = this.closeBounce.a(0.1f);
        canvas.scale(fA, fA);
        canvas.translate((-AndroidUtilities.dp(6.5f)) * fE, 0.0f);
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(5.5f), fE);
        float f16 = -fLerp;
        canvas.drawLine(AndroidUtilities.lerp(f16, 0.0f, fE), AndroidUtilities.lerp(f16, 0.0f, fE), fLerp, fLerp, this.iconStrokePaint);
        canvas.drawLine(AndroidUtilities.lerp(f16, 0.0f, fE), AndroidUtilities.lerp(fLerp, 0.0f, fE), fLerp, f16, this.iconStrokePaint);
        if (fE > 0.0f) {
            canvas.drawLine(0.0f, 0.0f, AndroidUtilities.dp(11.6f) * fE, 0.0f, this.iconStrokePaint);
        }
        canvas.restore();
        float fDp9 = (this.leftMenu.left + AndroidUtilities.dp(30.0f)) - AndroidUtilities.dp(10.0f);
        RectF rectF12 = this.leftMenu;
        float f17 = rectF12.top;
        float f18 = rectF12.right;
        float f19 = rectF12.bottom;
        Canvas canvas2 = canvas;
        canvas2.saveLayerAlpha(fDp9, f17, f18, f19, 255, 31);
        if (fE2 <= 0.0f || this.previewText == null) {
            f13 = fE2;
            f14 = 1.0f;
        } else {
            canvas2.save();
            canvas2.translate(org.telegram.ui.Cells.pa.b(1.0f, fE2, fMin, this.leftMenu.left + AndroidUtilities.dp(30.0f)), this.leftMenu.centerY());
            pz0 pz0Var2 = this.previewText;
            pz0Var2.f31708p = ((this.leftMenu.right - AndroidUtilities.dp(this.verifiedBackground != null ? 30.0f : 12.0f)) - (this.leftMenu.left + AndroidUtilities.dp(30.0f))) + 2.0f;
            f14 = 1.0f;
            pz0Var2.c(0.0f, 0.0f, fE2, -1, canvas);
            f13 = fE2;
            canvas2 = canvas;
            canvas2.translate(this.previewText.l() + AndroidUtilities.dp(5.0f), 0.0f);
            int iDp = AndroidUtilities.dp(f12);
            Drawable drawable = this.verifiedBackground;
            if (drawable != null) {
                drawable.setBounds(0, (-iDp) / 2, iDp, iDp / 2);
                this.verifiedBackground.setAlpha((int) (75.0f * f13));
                this.verifiedBackground.draw(canvas2);
            }
            Drawable drawable2 = this.verifiedForeground;
            if (drawable2 != null) {
                drawable2.setBounds(0, (-iDp) / 2, iDp, iDp / 2);
                this.verifiedForeground.setAlpha((int) (255.0f * f13));
                this.verifiedForeground.draw(canvas2);
            }
            RectF rectF13 = AndroidUtilities.rectTmp;
            float fDp10 = (this.leftMenu.left + AndroidUtilities.dp(30.0f)) - AndroidUtilities.dp(10.0f);
            RectF rectF14 = this.leftMenu;
            rectF13.set(fDp10, rectF14.top, rectF14.left + AndroidUtilities.dp(30.0f), this.leftMenu.bottom);
            this.previewClip.b(canvas2, rectF13, 2, 1.0f);
            canvas2.restore();
        }
        if (f13 < f14) {
            canvas2.save();
            float fA2 = this.closeBounce.a(0.1f);
            canvas2.scale(fA2, fA2, this.closeRect.centerX(), this.closeRect.centerY());
            float f20 = f14 - fE;
            if (f20 > 0.0f) {
                this.closeText.c(((this.closeRect.left + AndroidUtilities.dp(30.0f)) - (AndroidUtilities.dp(f11) * fE)) + (AndroidUtilities.dp(32.0f) * f13), this.closeRect.centerY(), (f14 - f13) * f20, -1, canvas);
            }
            if (fE > 0.0f) {
                this.backText.c((AndroidUtilities.dp(32.0f) * f13) + (AndroidUtilities.dp(f11) * f20) + this.closeRect.left + AndroidUtilities.dp(30.0f), this.closeRect.centerY(), (f14 - f13) * fE, -1, canvas);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            canvas2.restore();
        }
        canvas2.restore();
        canvas2.save();
        canvas2.translate(this.collapseRect.centerX() + AndroidUtilities.dp(2.0f), this.collapseRect.centerY());
        float fA3 = this.collapseBounce.a(0.1f);
        canvas2.scale(fA3, fA3);
        float fDp11 = AndroidUtilities.dp(6.0f);
        float fDp12 = AndroidUtilities.dp(3.0f);
        float f21 = -fDp12;
        canvas2.drawLine(-fDp11, f21, 0.0f, fDp12, this.iconStrokePaint);
        canvas.drawLine(0.0f, fDp12, fDp11, f21, this.iconStrokePaint);
        canvas.restore();
        canvas.save();
        canvas.translate(this.menuRect.centerX() + AndroidUtilities.dp(f14), this.menuRect.centerY());
        float fA4 = this.menuBounce.a(0.1f);
        canvas.scale(fA4, fA4);
        canvas.drawCircle(0.0f, -AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.66f), this.iconPaint);
        canvas.drawCircle(0.0f, 0.0f, AndroidUtilities.dp(1.66f), this.iconPaint);
        canvas.drawCircle(0.0f, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.66f), this.iconPaint);
        float fE3 = this.animatedDownloading.e(this.downloading);
        if (fE3 > 0.0f) {
            canvas.translate(-AndroidUtilities.dpf2(8.166f), AndroidUtilities.dpf2(3.5f));
            float f22 = (fE3 * 0.5f) + 0.5f;
            canvas.scale(f22, f22);
            this.downloadPaint.setColor(org.telegram.ui.ActionBar.g6.l1(0.4f, -1));
            canvas.drawPath(this.downloadPath, this.downloadPaint);
            float fCurrentTimeMillis = ((System.currentTimeMillis() - this.start) % 450) / 450.0f;
            float f23 = 0.5f + fCurrentTimeMillis;
            canvas.save();
            canvas.clipRect(-AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), fCurrentTimeMillis), AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), f23));
            this.downloadPaint.setColor(org.telegram.ui.ActionBar.g6.l1(f14, -1));
            canvas.drawPath(this.downloadPath, this.downloadPaint);
            canvas.restore();
            if (f23 > f14) {
                canvas.save();
                canvas.clipRect(-AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), 0.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), f23 - f14));
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
        return this.pressed != 0;
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
        this.previewText = new pz0(str, 13.0f, AndroidUtilities.bold());
        if (z10) {
            this.verifiedBackground = getContext().getResources().getDrawable(R.drawable.verified_area).mutate();
            this.verifiedForeground = getContext().getResources().getDrawable(R.drawable.verified_check).mutate();
        } else {
            this.verifiedBackground = null;
            this.verifiedForeground = null;
        }
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
