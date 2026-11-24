package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class qs0 extends View {
    public final im0 a;
    public final TextPaint b;
    public final TextPaint c;
    public final RectF d;
    public final RectF e;
    public StaticLayout f;
    public StaticLayout h;
    public float n;
    public float r;
    public float s;
    public final rs0 w;

    public qs0(rs0 rs0Var, Context context, eh0 eh0Var) {
        super(context);
        this.w = rs0Var;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.c = textPaint2;
        this.d = new RectF();
        this.e = new RectF();
        this.s = 1.0f;
        im0 c = eh0Var.c.c(this, null, false);
        this.a = c;
        c.r(gm.L(23.0f));
        textPaint.setTypeface(gm.o());
        textPaint.setTextSize(gm.L(16.0f));
        textPaint2.setTextSize(gm.L(13.0f));
        setOnClickListener(new j1(this, (byte) 22));
    }

    public static void a(Canvas canvas, View view, RectF rectF, float f, float f2, float f3) {
        if (view != null && !rectF.isEmpty() && f2 > 0.0f) {
            canvas.saveLayerAlpha((rectF.left + f) - rectF.width(), (rectF.top + 0.0f) - rectF.height(), rectF.width() + rectF.right + f, rectF.height() + rectF.bottom + 0.0f, (int) (f2 * 255.0f));
            canvas.translate(rectF.left + f, rectF.top + 0.0f);
            canvas.scale(f3, f3, rectF.width() / 2.0f, rectF.height() / 2.0f);
            view.draw(canvas);
            canvas.restore();
        }
    }

    public final void b() {
        rja rjaVar;
        rja rjaVar2;
        rja rjaVar3;
        rs0 rs0Var = this.w;
        rjaVar = ((d) rs0Var).simpleActionBar;
        View backButton = rjaVar.getBackButton();
        if (backButton != null && this.f != null) {
            rjaVar2 = ((d) rs0Var).simpleActionBar;
            if (rjaVar2.getHeight() != 0) {
                rjaVar3 = ((d) rs0Var).simpleActionBar;
                float height = (backButton.getHeight() / 2.0f) + backButton.getY() + rjaVar3.getTop();
                float max = (Math.max(this.n, this.r) + gm.L(36.0f)) / 2.0f;
                float height2 = backButton.getHeight() / 2.0f;
                float f = height + height2;
                this.d.set((getWidth() / 2.0f) - max, height - height2, (getWidth() / 2.0f) + max, f);
                invalidate();
            }
        }
    }

    public final void c() {
        String r;
        String p;
        String h;
        rs0 rs0Var = this.w;
        TLRPC.User W1 = rs0Var.getMessagesController().W1(Long.valueOf(rs0Var.a));
        int themedColor = rs0Var.getThemedColor(cmb.F6);
        TextPaint textPaint = this.b;
        textPaint.setColor(themedColor);
        int themedColor2 = rs0Var.getThemedColor(cmb.x6);
        TextPaint textPaint2 = this.c;
        textPaint2.setColor(themedColor2);
        if (W1 == null) {
            r = "";
            p = null;
        } else {
            r = m9c.r(W1);
            p = m9c.p(W1);
        }
        if (TextUtils.isEmpty(p)) {
            h = jb6.M0(2131753121, null);
        } else {
            h = b10.h("@", p);
        }
        float c = b10.c(156.0f, getWidth(), gm.L(40.0f));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        CharSequence ellipsize = TextUtils.ellipsize(r, textPaint, c, truncateAt);
        CharSequence ellipsize2 = TextUtils.ellipsize(h, textPaint2, c, truncateAt);
        this.n = textPaint.measureText(ellipsize, 0, ellipsize.length());
        this.r = textPaint2.measureText(ellipsize2, 0, ellipsize2.length());
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f = new StaticLayout(ellipsize, textPaint, ((int) Math.ceil(this.n)) + 1, alignment, 1.0f, 0.0f, false);
        this.h = new StaticLayout(ellipsize2, textPaint2, ((int) Math.ceil(this.r)) + 1, alignment, 1.0f, 0.0f, false);
        b();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        TextPaint textPaint;
        float f4;
        RectF rectF;
        float f5;
        float f6;
        float f7;
        float f8;
        Canvas canvas2 = canvas;
        if (this.f != null) {
            RectF rectF2 = this.d;
            if (!rectF2.isEmpty()) {
                rs0 rs0Var = this.w;
                eq eqVar = rs0Var.s;
                RectF rectF3 = this.e;
                if (eqVar != null) {
                    if (rs0Var.w) {
                        float f9 = rs0Var.x;
                        float interpolation = d53.g.getInterpolation(Math.min(1.0f, 1.15f * f9));
                        RectF rectF4 = (RectF) eqVar.a;
                        rectF3.set(gm.R1(rectF4.left, rectF2.left, interpolation), gm.R1(rectF4.top, rectF2.top, interpolation), gm.R1(rectF4.right, rectF2.right, interpolation), gm.R1(rectF4.bottom, rectF2.bottom, interpolation));
                        f = f9;
                        f2 = interpolation;
                    } else {
                        return;
                    }
                } else {
                    rectF3.set(rectF2);
                    f = 1.0f;
                    f2 = 1.0f;
                }
                int L = gm.L(6.0f);
                im0 im0Var = this.a;
                im0Var.r(rectF3.height() / 2.0f);
                im0Var.setBounds(((int) rectF3.left) - L, ((int) rectF3.top) - L, ((int) rectF3.right) + L, ((int) rectF3.bottom) + L);
                im0Var.draw(canvas2);
                float centerY = rectF3.centerY() - ((this.h.getHeight() + this.f.getHeight()) / 2.0f);
                float centerX = rectF3.centerX() - (this.n / 2.0f);
                float centerX2 = rectF3.centerX() - (this.r / 2.0f);
                canvas2.save();
                canvas2.clipRect(rectF3);
                TextPaint textPaint2 = this.c;
                TextPaint textPaint3 = this.b;
                if (eqVar != null) {
                    RectF rectF5 = (RectF) eqVar.c;
                    float min = 1.0f - Math.min(1.0f, 1.6f * f);
                    float f10 = rectF3.left - ((RectF) eqVar.a).left;
                    if (min > 0.0f) {
                        f3 = 2.0f;
                        textPaint = textPaint3;
                        rectF = rectF5;
                        f4 = 0.0f;
                        a(canvas, ((pr1) eqVar.f).e, (RectF) eqVar.b, f10, min, gm.R1(1.0f, 0.6f, 1.0f - min));
                        a(canvas, ((pr1) eqVar.f).getSubtitleTextView(), (RectF) eqVar.d, f10, min, 1.0f);
                    } else {
                        textPaint = textPaint3;
                        f4 = 0.0f;
                        f3 = 2.0f;
                        rectF = rectF5;
                    }
                    lka titleTextView = ((pr1) eqVar.f).getTitleTextView();
                    float textSize = titleTextView.getTextPaint().getTextSize();
                    if (textSize > f4) {
                        f5 = textPaint.getTextSize() / textSize;
                    } else {
                        f5 = 1.0f;
                    }
                    float textWidth = (titleTextView.getTextWidth() / f3) + rectF.left + titleTextView.getPaddingLeft();
                    float centerY2 = rectF.centerY();
                    float height = (this.f.getHeight() / f3) + centerY;
                    float R1 = gm.R1(textWidth, rectF3.centerX(), f2);
                    float R12 = gm.R1(centerY2, height, f2);
                    float f11 = 1.0f;
                    float min2 = Math.min(1.0f, 2.4f * f);
                    if (min2 < 1.0f) {
                        f7 = R12;
                        f8 = f;
                        f6 = f5;
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, (int) ((1.0f - min2) * 255.0f));
                        float R13 = gm.R1(1.0f, f6, f2);
                        canvas2.translate(R1, f7);
                        canvas2.scale(R13, R13);
                        canvas2.translate(-((titleTextView.getTextWidth() / f3) + titleTextView.getPaddingLeft()), (-rectF.height()) / f3);
                        titleTextView.draw(canvas2);
                        canvas2.restore();
                        f11 = 1.0f;
                    } else {
                        f6 = f5;
                        f7 = R12;
                        f8 = f;
                        canvas2 = canvas;
                    }
                    this.s = gm.R1(f11 / f6, f11, f2);
                    centerX = R1 - (this.n / f3);
                    centerY = f7 - (this.f.getHeight() / f3);
                    textPaint.setAlpha((int) (min2 * 255.0f));
                    textPaint2.setAlpha((int) (Math.max(0.0f, (f8 - 0.25f) / 0.75f) * 255.0f));
                } else {
                    f3 = 2.0f;
                    textPaint3.setAlpha(255);
                    textPaint2.setAlpha(255);
                }
                canvas2.save();
                canvas2.translate(centerX, centerY);
                float f12 = this.s;
                canvas2.scale(f12, f12, this.n / f3, this.f.getHeight() / f3);
                this.f.draw(canvas2);
                canvas2.restore();
                this.s = 1.0f;
                canvas2.save();
                canvas2.translate(centerX2, centerY + this.f.getHeight());
                this.h.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            c();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.e.contains(motionEvent.getX(), motionEvent.getY()) && motionEvent.getAction() == 0) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }
}
