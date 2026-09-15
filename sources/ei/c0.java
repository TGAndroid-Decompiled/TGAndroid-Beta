package ei;

import android.content.Context;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.xi0;
public final class c0 extends View {
    public boolean E;
    public int F;
    public final RectF f8263a;
    public final Paint f8264b;
    public final TextPaint f8265c;
    public final z d;
    public final xi0 e;
    public boolean f8266f;
    public float h;
    public String f8267n;
    public StaticLayout f8268r;
    public float f8269s;
    public boolean v;
    public boolean f8270w;
    public boolean f8271x;
    public final org.telegram.ui.Cells.z f8272y;

    public c0(Context context) {
        super(context);
        this.f8263a = new RectF();
        Paint paint = new Paint(1);
        this.f8264b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f8265c = textPaint;
        z zVar = new z(this);
        this.d = zVar;
        xi0 xi0Var = new xi0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.e = xi0Var;
        this.f8267n = LocaleController.getString(R.string.BotsMenuTitle);
        this.E = true;
        paint.setColor(i6.w0(null, i6.f18826cf, false));
        int w02 = i6.w0(null, i6.f18862ef, false);
        zVar.f18614k = w02;
        zVar.f18613j = w02;
        xi0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(w02);
        zVar.f18617n = true;
        zVar.h = false;
        zVar.a(0.0f, false);
        zVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        zVar.f18607a.setStrokeCap(Paint.Cap.ROUND);
        zVar.f18615l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int w03 = i6.w0(null, i6.Qh, false);
        org.telegram.ui.Cells.z i02 = i6.i0(dp, dp, dp, dp, 0, w03, w03);
        this.f8272y = i02;
        i02.setCallback(this);
        xi0Var.setCallback(this);
        xi0Var.f29972v0 = this;
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ei.c0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f8272y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f8272y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.F != size || this.f8268r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f8265c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.F = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f8267n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c10 = jw0.c(replaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, i12, 1, true);
            this.f8268r = c10;
            if (c10.getLineCount() > 0) {
                f7 = this.f8268r.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f8269s = f7;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f8266f) {
            dp = org.telegram.messenger.w1.C(4.0f, (int) this.f8269s, dp);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setDrawBackgroundDrawable(boolean z10) {
        this.E = z10;
        invalidate();
    }

    public void setOpened(boolean z10) {
        float f7;
        if (this.v != z10) {
            this.v = z10;
        }
        int i10 = 1;
        if (this.f8270w) {
            if (this.f8271x != z10) {
                xi0 xi0Var = this.e;
                xi0Var.stop();
                xi0Var.h = true;
                if (z10) {
                    i10 = xi0Var.e[0];
                }
                xi0Var.P(i10);
                xi0Var.start();
                this.f8271x = z10;
                return;
            }
            return;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d.a(f7, true);
    }

    public void setWebView(boolean z10) {
        this.f8270w = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f8272y != drawable) {
            return false;
        }
        return true;
    }
}
