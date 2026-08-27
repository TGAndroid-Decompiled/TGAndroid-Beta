package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.tv0;

public final class a0 extends View {
    public boolean A;
    public int B;

    public final RectF f18526a;

    public final Paint f18527b;

    public final TextPaint f18528c;
    public final x d;

    public final oi0 f18529e;

    public boolean f18530f;
    public float h;

    public String f18531n;

    public StaticLayout f18532r;

    public float f18533s;
    public boolean v;

    public boolean f18534w;

    public boolean f18535x;

    public final org.telegram.ui.Cells.z f18536y;

    public a0(Context context) {
        super(context);
        this.f18526a = new RectF();
        Paint paint = new Paint(1);
        this.f18527b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f18528c = textPaint;
        x xVar = new x(this);
        this.d = xVar;
        oi0 oi0Var = new oi0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), String.valueOf(R.raw.bot_webview_sheet_to_cross) + hashCode(), AndroidUtilities.dp(20.0f));
        this.f18529e = oi0Var;
        this.f18531n = LocaleController.getString(R.string.BotsMenuTitle);
        this.A = true;
        paint.setColor(g6.w0(null, g6.f23044cf, false));
        int iW0 = g6.w0(null, g6.f23080ef, false);
        xVar.f22827k = iW0;
        xVar.f22826j = iW0;
        oi0Var.setColorFilter(new PorterDuffColorFilter(iW0, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(iW0);
        xVar.f22830n = true;
        xVar.h = false;
        xVar.a(0.0f, false);
        xVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        xVar.f22819a.setStrokeCap(Paint.Cap.ROUND);
        xVar.f22828l = true;
        int iDp = AndroidUtilities.dp(16.0f);
        int iW1 = g6.w0(null, g6.Qh, false);
        org.telegram.ui.Cells.z zVarI0 = g6.i0(iDp, iDp, iDp, iDp, 0, iW1, iW1);
        this.f18536y = zVarI0;
        zVarI0.setCallback(this);
        oi0Var.setCallback(this);
        oi0Var.f31328r0 = this;
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        if (this.f18532r != null) {
            boolean z10 = this.f18530f;
            boolean z11 = true;
            if (z10) {
                float f12 = this.h;
                if (f12 != 1.0f) {
                    float f13 = f12 + 0.10666667f;
                    this.h = f13;
                    if (f13 > 1.0f) {
                        this.h = 1.0f;
                    } else {
                        invalidate();
                    }
                } else if (z10) {
                    z11 = false;
                } else {
                    f10 = this.h;
                    if (f10 != 0.0f) {
                        f11 = f10 - 0.10666667f;
                        this.h = f11;
                        if (f11 < 0.0f) {
                            this.h = 0.0f;
                        } else {
                            invalidate();
                        }
                    } else {
                        z11 = false;
                    }
                }
            } else if (z10) {
                f10 = this.h;
                if (f10 != 0.0f) {
                    f11 = f10 - 0.10666667f;
                    this.h = f11;
                    if (f11 < 0.0f) {
                        this.h = 0.0f;
                    } else {
                        invalidate();
                    }
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            float interpolation = er.f28122f.getInterpolation(this.h);
            if (z11 && interpolation > 0.0f) {
                this.f18528c.setAlpha((int) (255.0f * interpolation));
            }
            if (this.A) {
                this.f18526a.set(0.0f, 0.0f, ((this.f18533s + AndroidUtilities.dp(4.0f)) * interpolation) + AndroidUtilities.dp(40.0f), getMeasuredHeight());
                canvas.drawRoundRect(this.f18526a, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.f18527b);
                org.telegram.ui.Cells.z zVar = this.f18536y;
                RectF rectF = this.f18526a;
                zVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.f18536y.draw(canvas);
            }
            if (this.f18534w) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(9.5f), AndroidUtilities.dp(6.0f));
                oi0 oi0Var = this.f18529e;
                oi0Var.setBounds(0, 0, oi0Var.f31307b, oi0Var.f31309c);
                oi0Var.draw(canvas);
                canvas.restore();
                if (oi0Var.f31317h0) {
                    invalidate();
                }
            } else {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f));
                this.d.draw(canvas);
                canvas.restore();
            }
            if (interpolation > 0.0f) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp(34.0f), (getMeasuredHeight() - this.f18532r.getHeight()) / 2.0f);
                this.f18532r.draw(canvas);
                canvas.restore();
            }
            if (z11) {
                AndroidUtilities.dp(4.0f);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f18536y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f18536y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.B != size || this.f18532r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            float fDp = AndroidUtilities.dp(15.0f);
            TextPaint textPaint = this.f18528c;
            textPaint.setTextSize(fDp);
            this.B = size;
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(this.f18531n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout staticLayoutC = tv0.c(charSequenceReplaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, i12, 1, true);
            this.f18532r = staticLayoutC;
            this.f18533s = staticLayoutC.getLineCount() > 0 ? this.f18532r.getLineWidth(0) : 0.0f;
        }
        AndroidUtilities.dp(4.0f);
        int iDp = AndroidUtilities.dp(40.0f);
        if (this.f18530f) {
            iDp = org.telegram.messenger.y1.C(4.0f, (int) this.f18533s, iDp);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iDp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setDrawBackgroundDrawable(boolean z10) {
        this.A = z10;
        invalidate();
    }

    public void setOpened(boolean z10) {
        if (this.v != z10) {
            this.v = z10;
        }
        if (!this.f18534w) {
            this.d.a(z10 ? 1.0f : 0.0f, true);
            return;
        }
        if (this.f18535x != z10) {
            oi0 oi0Var = this.f18529e;
            oi0Var.stop();
            oi0Var.h = true;
            oi0Var.N(z10 ? oi0Var.f31312e[0] : 1);
            oi0Var.start();
            this.f18535x = z10;
        }
    }

    public void setWebView(boolean z10) {
        this.f18534w = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.f18536y == drawable;
    }
}
