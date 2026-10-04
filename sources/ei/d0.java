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
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.kj0;
public final class d0 extends View {
    public boolean E;
    public int F;
    public final RectF f8981a;
    public final Paint f8982b;
    public final TextPaint f8983c;
    public final a0 d;
    public final kj0 f8984e;
    public boolean f8985f;
    public float h;
    public String f8986n;
    public StaticLayout f8987r;
    public float f8988s;
    public boolean v;
    public boolean f8989w;
    public boolean f8990x;
    public final org.telegram.ui.Cells.z f8991y;

    public d0(Context context) {
        super(context);
        this.f8981a = new RectF();
        Paint paint = new Paint(1);
        this.f8982b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f8983c = textPaint;
        a0 a0Var = new a0(this);
        this.d = a0Var;
        kj0 kj0Var = new kj0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.f8984e = kj0Var;
        this.f8986n = LocaleController.getString(R.string.BotsMenuTitle);
        this.E = true;
        paint.setColor(i6.w0(null, i6.f20812cf, false));
        int w02 = i6.w0(null, i6.f20849ef, false);
        a0Var.f20540k = w02;
        a0Var.f20539j = w02;
        kj0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(w02);
        a0Var.f20543n = true;
        a0Var.h = false;
        a0Var.a(0.0f, false);
        a0Var.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        a0Var.f20532a.setStrokeCap(Paint.Cap.ROUND);
        a0Var.f20541l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int w03 = i6.w0(null, i6.Qh, false);
        org.telegram.ui.Cells.z i02 = i6.i0(dp, dp, dp, dp, 0, w03, w03);
        this.f8991y = i02;
        i02.setCallback(this);
        kj0Var.setCallback(this);
        kj0Var.R(this);
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ei.d0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f8991y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f8991y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.F != size || this.f8987r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f8983c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.F = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f8986n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c10 = fx0.c(replaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, i12, 1, true);
            this.f8987r = c10;
            if (c10.getLineCount() > 0) {
                f7 = this.f8987r.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f8988s = f7;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f8985f) {
            dp = org.telegram.messenger.q.C(4.0f, (int) this.f8988s, dp);
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
        if (this.f8989w) {
            if (this.f8990x != z10) {
                kj0 kj0Var = this.f8984e;
                kj0Var.stop();
                kj0Var.h = true;
                if (z10) {
                    i10 = kj0Var.f28130e[0];
                }
                kj0Var.P(i10);
                kj0Var.start();
                this.f8990x = z10;
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
        this.f8989w = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f8991y != drawable) {
            return false;
        }
        return true;
    }
}
