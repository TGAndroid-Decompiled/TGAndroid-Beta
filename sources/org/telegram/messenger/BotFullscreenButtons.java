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
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.GradientClip;

public class BotFullscreenButtons extends View {
    private final AnimatedFloat animatedBack;
    private final AnimatedFloat animatedDownloading;
    private final AnimatedFloat animatedPreview;
    private boolean back;
    private final Text backText;
    private final Paint backgroundPaint;
    private final Path backgroundPath;
    private RenderNode blurNode;
    private final ButtonBounce closeBounce;
    private final RectF closeRect;
    private final RectF closeRectArea;
    private final Text closeText;
    private final ButtonBounce collapseBounce;
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
    private final ButtonBounce menuBounce;
    private final RectF menuClickRect;
    private final RectF menuRect;
    private final ButtonBounce nullBounce;
    public Runnable onCloseClickListener;
    public Runnable onCollapseClickListener;
    public Runnable onMenuClickListener;
    public Object parentRenderNode;
    int pressed;
    private boolean preview;
    private final GradientClip previewClip;
    private Text previewText;
    private final RectF rightMenu;
    private final long start;
    private Drawable verifiedBackground;
    private Drawable verifiedForeground;
    public WebView webView;

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
        this.nullBounce = new ButtonBounce(null);
        this.closeRect = new RectF();
        this.closeRectArea = new RectF();
        this.closeBounce = new ButtonBounce(this);
        this.rightMenu = new RectF();
        this.collapseRect = new RectF();
        this.collapseClickRect = new RectF();
        this.collapseBounce = new ButtonBounce(this);
        this.menuRect = new RectF();
        this.menuClickRect = new RectF();
        this.menuBounce = new ButtonBounce(this);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatedBack = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
        this.preview = true;
        this.animatedPreview = new AnimatedFloat(this, 0L, 420L, cubicBezierInterpolator);
        this.downloading = false;
        this.animatedDownloading = new AnimatedFloat(this, 0L, 420L, cubicBezierInterpolator);
        this.previewClip = new GradientClip();
        this.hidePreview = new Runnable() {
            @Override
            public final void run() {
                this.f$0.setPreview(false, true);
            }
        };
        this.start = System.currentTimeMillis();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.backText = new Text(LocaleController.getString(R.string.BotFullscreenBack), 13.0f, AndroidUtilities.bold());
        this.closeText = new Text(LocaleController.getString(R.string.BotFullscreenClose), 13.0f, AndroidUtilities.bold());
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

    public void setInsets(RectF rectF) {
        this.insets.set(rectF);
    }

    public void setInsets(Rect rect) {
        this.insets.set(rect);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        float f;
        float currentWidth;
        float f2;
        float f3;
        float f4;
        float f5;
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
        float fDp = this.collapseRect.left - AndroidUtilities.dp(8.0f);
        float fDp2 = this.collapseRect.top - AndroidUtilities.dp(8.0f);
        RectF rectF4 = this.collapseRect;
        rectF3.set(fDp, fDp2, rectF4.right, rectF4.bottom + AndroidUtilities.dp(8.0f));
        RectF rectF5 = this.menuRect;
        float fCenterX = this.rightMenu.centerX();
        RectF rectF6 = this.rightMenu;
        rectF5.set(fCenterX, rectF6.top, rectF6.right, rectF6.bottom);
        RectF rectF7 = this.menuClickRect;
        RectF rectF8 = this.menuRect;
        rectF7.set(rectF8.left, rectF8.top - AndroidUtilities.dp(8.0f), this.menuRect.right + AndroidUtilities.dp(8.0f), this.menuRect.bottom + AndroidUtilities.dp(8.0f));
        Path path = this.backgroundPath;
        RectF rectF9 = this.rightMenu;
        float fDp3 = AndroidUtilities.dp(15.0f);
        float fDp4 = AndroidUtilities.dp(15.0f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF9, fDp3, fDp4, direction);
        float f6 = this.animatedBack.set(this.back);
        float f7 = this.animatedPreview.set(this.preview);
        float fDp5 = (this.rightMenu.left - AndroidUtilities.dp(18.0f)) - (this.insets.left + AndroidUtilities.dp(38.0f));
        Text text = this.previewText;
        if (text == null) {
            currentWidth = 0.0f;
            f = 18.0f;
        } else {
            f = 18.0f;
            currentWidth = text.getCurrentWidth() + AndroidUtilities.dp(this.verifiedBackground != null ? 30.0f : 12.0f);
        }
        float fMin = Math.min(fDp5, currentWidth);
        this.leftMenu.set(this.insets.left + AndroidUtilities.dp(8.0f), this.insets.top + AndroidUtilities.dp(8.0f), this.insets.left + AndroidUtilities.dp(38.0f) + AndroidUtilities.lerp(AndroidUtilities.lerp(this.closeText.getCurrentWidth(), this.backText.getCurrentWidth(), f6) + AndroidUtilities.dp(12.0f), fMin, f7), this.insets.top + AndroidUtilities.dp(38.0f));
        RectF rectF10 = this.closeRect;
        RectF rectF11 = this.leftMenu;
        float f8 = rectF11.left;
        rectF10.set(f8, rectF11.top, AndroidUtilities.dp(30.0f) + f8, this.leftMenu.bottom);
        this.closeRectArea.set(this.closeRect);
        this.closeRectArea.right = AndroidUtilities.lerp(this.leftMenu.right, this.closeRect.left + AndroidUtilities.dp(30.0f), f7);
        this.closeRectArea.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        this.backgroundPath.addRoundRect(this.leftMenu, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), direction);
        if (this.parentRenderNode != null && Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated() && ((webView = this.webView) == null || webView.getLayerType() == 2)) {
            if (this.blurNode == null) {
                RenderNode renderNodeM = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("bot_fullscreen_blur");
                this.blurNode = renderNodeM;
                float fDp6 = AndroidUtilities.dp(f);
                float fDp7 = AndroidUtilities.dp(f);
                f2 = 16.0f;
                renderNodeM.setRenderEffect(RenderEffect.createBlurEffect(fDp6, fDp7, Shader.TileMode.CLAMP));
            } else {
                f2 = 16.0f;
            }
            RenderNode renderNodeM2 = BotFullscreenButtons$$ExternalSyntheticApiModelOutline2.m(this.parentRenderNode);
            f3 = 12.0f;
            this.blurNode.setPosition(0, 0, Math.max(1, renderNodeM2.getWidth() - AndroidUtilities.dp(f2)), Math.max(1, (int) Math.min(this.insets.top + AndroidUtilities.dp(46.0f), renderNodeM2.getHeight())));
            RecordingCanvas recordingCanvasBeginRecording = this.blurNode.beginRecording();
            recordingCanvasBeginRecording.translate(-AndroidUtilities.dp(8.0f), 0.0f);
            recordingCanvasBeginRecording.drawRenderNode(renderNodeM2);
            this.blurNode.endRecording();
            canvas.save();
            canvas.clipPath(this.backgroundPath);
            canvas.save();
            canvas.translate(AndroidUtilities.dp(8.0f), 0.0f);
            canvas.drawRenderNode(this.blurNode);
            canvas.restore();
            this.backgroundPaint.setColor(Theme.multAlpha(-16777216, 0.22f));
            canvas.drawPaint(this.backgroundPaint);
            canvas.restore();
        } else {
            f2 = 16.0f;
            f3 = 12.0f;
            this.backgroundPaint.setColor(Theme.multAlpha(-16777216, 0.35f));
            canvas.drawPath(this.backgroundPath, this.backgroundPaint);
        }
        canvas.save();
        canvas.translate(this.closeRect.centerX(), this.closeRect.centerY());
        float scale = this.closeBounce.getScale(0.1f);
        canvas.scale(scale, scale);
        canvas.translate((-AndroidUtilities.dp(6.5f)) * f6, 0.0f);
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(5.5f), f6);
        float f9 = -fLerp;
        canvas.drawLine(AndroidUtilities.lerp(f9, 0.0f, f6), AndroidUtilities.lerp(f9, 0.0f, f6), fLerp, fLerp, this.iconStrokePaint);
        canvas.drawLine(AndroidUtilities.lerp(f9, 0.0f, f6), AndroidUtilities.lerp(fLerp, 0.0f, f6), fLerp, f9, this.iconStrokePaint);
        if (f6 > 0.0f) {
            canvas.drawLine(0.0f, 0.0f, AndroidUtilities.dp(11.6f) * f6, 0.0f, this.iconStrokePaint);
        }
        canvas.restore();
        float fDp8 = (this.leftMenu.left + AndroidUtilities.dp(30.0f)) - AndroidUtilities.dp(10.0f);
        RectF rectF12 = this.leftMenu;
        float f10 = rectF12.top;
        float f11 = rectF12.right;
        float f12 = rectF12.bottom;
        Canvas canvas2 = canvas;
        canvas2.saveLayerAlpha(fDp8, f10, f11, f12, 255, 31);
        if (f7 <= 0.0f || this.previewText == null) {
            f4 = f7;
            f5 = 1.0f;
        } else {
            canvas2.save();
            canvas2.translate((this.leftMenu.left + AndroidUtilities.dp(30.0f)) - ((1.0f - f7) * fMin), this.leftMenu.centerY());
            f5 = 1.0f;
            this.previewText.ellipsize(((this.leftMenu.right - AndroidUtilities.dp(this.verifiedBackground != null ? 30.0f : 12.0f)) - (this.leftMenu.left + AndroidUtilities.dp(30.0f))) + 2.0f).draw(canvas, 0.0f, 0.0f, -1, f7);
            canvas2 = canvas;
            f4 = f7;
            canvas2.translate(this.previewText.getWidth() + AndroidUtilities.dp(5.0f), 0.0f);
            int iDp = AndroidUtilities.dp(f2);
            Drawable drawable = this.verifiedBackground;
            if (drawable != null) {
                drawable.setBounds(0, (-iDp) / 2, iDp, iDp / 2);
                this.verifiedBackground.setAlpha((int) (75.0f * f4));
                this.verifiedBackground.draw(canvas2);
            }
            Drawable drawable2 = this.verifiedForeground;
            if (drawable2 != null) {
                drawable2.setBounds(0, (-iDp) / 2, iDp, iDp / 2);
                this.verifiedForeground.setAlpha((int) (255.0f * f4));
                this.verifiedForeground.draw(canvas2);
            }
            RectF rectF13 = AndroidUtilities.rectTmp;
            float fDp9 = (this.leftMenu.left + AndroidUtilities.dp(30.0f)) - AndroidUtilities.dp(10.0f);
            RectF rectF14 = this.leftMenu;
            rectF13.set(fDp9, rectF14.top, rectF14.left + AndroidUtilities.dp(30.0f), this.leftMenu.bottom);
            this.previewClip.draw(canvas2, rectF13, 2, 1.0f);
            canvas2.restore();
        }
        if (f4 < f5) {
            canvas2.save();
            float scale2 = this.closeBounce.getScale(0.1f);
            canvas2.scale(scale2, scale2, this.closeRect.centerX(), this.closeRect.centerY());
            float f13 = f5 - f6;
            if (f13 > 0.0f) {
                this.closeText.draw(canvas, (AndroidUtilities.dp(32.0f) * f4) + ((this.closeRect.left + AndroidUtilities.dp(30.0f)) - (AndroidUtilities.dp(f3) * f6)), this.closeRect.centerY(), -1, f13 * (f5 - f4));
            }
            if (f6 > 0.0f) {
                this.backText.draw(canvas, (AndroidUtilities.dp(32.0f) * f4) + this.closeRect.left + AndroidUtilities.dp(30.0f) + (AndroidUtilities.dp(f3) * f13), this.closeRect.centerY(), -1, f6 * (f5 - f4));
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
            }
            canvas2.restore();
        }
        canvas2.restore();
        canvas2.save();
        canvas2.translate(this.collapseRect.centerX() + AndroidUtilities.dp(2.0f), this.collapseRect.centerY());
        float scale3 = this.collapseBounce.getScale(0.1f);
        canvas2.scale(scale3, scale3);
        float fDp10 = AndroidUtilities.dp(6.0f);
        float fDp11 = AndroidUtilities.dp(3.0f);
        float f14 = -fDp11;
        canvas2.drawLine(-fDp10, f14, 0.0f, fDp11, this.iconStrokePaint);
        canvas.drawLine(0.0f, fDp11, fDp10, f14, this.iconStrokePaint);
        canvas.restore();
        canvas.save();
        canvas.translate(this.menuRect.centerX() + AndroidUtilities.dp(f5), this.menuRect.centerY());
        float scale4 = this.menuBounce.getScale(0.1f);
        canvas.scale(scale4, scale4);
        canvas.drawCircle(0.0f, -AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.66f), this.iconPaint);
        canvas.drawCircle(0.0f, 0.0f, AndroidUtilities.dp(1.66f), this.iconPaint);
        canvas.drawCircle(0.0f, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.66f), this.iconPaint);
        float f15 = this.animatedDownloading.set(this.downloading);
        if (f15 > 0.0f) {
            canvas.translate(-AndroidUtilities.dpf2(8.166f), AndroidUtilities.dpf2(3.5f));
            float f16 = (f15 * 0.5f) + 0.5f;
            canvas.scale(f16, f16);
            this.downloadPaint.setColor(Theme.multAlpha(-1, 0.4f));
            canvas.drawPath(this.downloadPath, this.downloadPaint);
            float fCurrentTimeMillis = ((System.currentTimeMillis() - this.start) % 450) / 450.0f;
            float f17 = 0.5f + fCurrentTimeMillis;
            canvas.save();
            canvas.clipRect(-AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), fCurrentTimeMillis), AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), f17));
            this.downloadPaint.setColor(Theme.multAlpha(-1, f5));
            canvas.drawPath(this.downloadPath, this.downloadPaint);
            canvas.restore();
            if (f17 > f5) {
                canvas.save();
                canvas.clipRect(-AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), 0.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), f17 - f5));
                this.downloadPaint.setColor(Theme.multAlpha(-1, f5));
                canvas.drawPath(this.downloadPath, this.downloadPaint);
                canvas.restore();
            }
            invalidate();
        }
        canvas.restore();
    }

    public void setDownloading(boolean z) {
        if (this.downloading == z) {
            return;
        }
        this.downloading = z;
        invalidate();
    }

    public void setName(String str, boolean z) {
        this.previewText = new Text(str, 13.0f, AndroidUtilities.bold());
        if (!z) {
            this.verifiedBackground = null;
            this.verifiedForeground = null;
        } else {
            this.verifiedBackground = getContext().getResources().getDrawable(R.drawable.verified_area).mutate();
            this.verifiedForeground = getContext().getResources().getDrawable(R.drawable.verified_check).mutate();
        }
    }

    public void setPreview(boolean z, boolean z2) {
        AndroidUtilities.cancelRunOnUIThread(this.hidePreview);
        this.preview = z;
        if (!z2) {
            this.animatedPreview.set(z, true);
        }
        invalidate();
        if (z) {
            AndroidUtilities.runOnUIThread(this.hidePreview, 2500L);
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

    public void setWebView(WebView webView) {
        this.webView = webView;
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

    private ButtonBounce getBounce(int i) {
        if (i == 1) {
            return this.closeBounce;
        }
        if (i == 2) {
            return this.collapseBounce;
        }
        if (i == 3) {
            return this.menuBounce;
        }
        return this.nullBounce;
    }

    public void setBack(boolean z) {
        setBack(z, true);
    }

    public void setBack(boolean z, boolean z2) {
        this.back = z;
        if (!z2) {
            this.animatedBack.set(z);
        }
        invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        if (motionEvent.getAction() == 0) {
            getBounce(this.pressed).setPressed(false);
            int button = getButton(motionEvent);
            this.pressed = button;
            getBounce(button).setPressed(true);
        } else if (motionEvent.getAction() == 2) {
            if (getButton(motionEvent) != this.pressed) {
                this.pressed = 0;
                getBounce(0).setPressed(false);
            }
        } else if (motionEvent.getAction() == 1) {
            int i = this.pressed;
            if (i == 1 && (runnable3 = this.onCloseClickListener) != null) {
                runnable3.run();
            } else if (i == 2 && (runnable2 = this.onCollapseClickListener) != null) {
                runnable2.run();
            } else if (i == 3 && (runnable = this.onMenuClickListener) != null) {
                runnable.run();
            }
            getBounce(this.pressed).setPressed(false);
            this.pressed = 0;
        } else if (motionEvent.getAction() == 3) {
            getBounce(this.pressed).setPressed(false);
            this.pressed = 0;
        }
        return this.pressed != 0;
    }

    public static class OptionsIcon extends Drawable {
        private final AnimatedFloat animatedDownloading;
        private final Paint downloadPaint;
        private final Path downloadPath;
        private boolean downloading;
        private final Drawable drawable;
        private final long start;

        @Override
        public int getOpacity() {
            return -2;
        }

        public OptionsIcon(Context context) {
            Paint paint = new Paint(1);
            this.downloadPaint = paint;
            Path path = new Path();
            this.downloadPath = path;
            this.downloading = false;
            this.animatedDownloading = new AnimatedFloat(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.invalidateSelf();
                }
            }, 0L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
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
            float f = this.animatedDownloading.set(this.downloading);
            if (f > 0.0f) {
                canvas.save();
                canvas.translate(getBounds().centerX(), getBounds().centerY());
                canvas.translate(-AndroidUtilities.dpf2(8.166f), AndroidUtilities.dpf2(5.0f));
                float f2 = (f * 0.5f) + 0.5f;
                canvas.scale(f2, f2);
                this.downloadPaint.setColor(Theme.multAlpha(-1, 0.4f));
                canvas.drawPath(this.downloadPath, this.downloadPaint);
                float fCurrentTimeMillis = ((System.currentTimeMillis() - this.start) % 450) / 450.0f;
                float f3 = 0.5f + fCurrentTimeMillis;
                canvas.save();
                canvas.clipRect(-AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), fCurrentTimeMillis), AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), f3));
                this.downloadPaint.setColor(Theme.multAlpha(-1, 1.0f));
                canvas.drawPath(this.downloadPath, this.downloadPaint);
                canvas.restore();
                if (f3 > 1.0f) {
                    canvas.save();
                    canvas.clipRect(-AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), 0.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.lerp(-AndroidUtilities.dpf2(3.5f), AndroidUtilities.dpf2(3.5f), f3 - 1.0f));
                    this.downloadPaint.setColor(Theme.multAlpha(-1, 1.0f));
                    canvas.drawPath(this.downloadPath, this.downloadPaint);
                    canvas.restore();
                }
                canvas.restore();
                invalidateSelf();
            }
        }

        public void setDownloading(boolean z) {
            if (this.downloading == z) {
                return;
            }
            this.downloading = z;
            invalidateSelf();
        }

        @Override
        public void setAlpha(int i) {
            this.drawable.setAlpha(i);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.downloadPaint.setColorFilter(colorFilter);
            this.drawable.setColorFilter(colorFilter);
        }

        @Override
        public int getIntrinsicWidth() {
            return this.drawable.getIntrinsicWidth();
        }

        @Override
        public int getIntrinsicHeight() {
            return this.drawable.getIntrinsicHeight();
        }
    }
}
