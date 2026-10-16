package fi;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.yj0;
public final class b0 extends View {
    public boolean E;
    public int F;
    public final RectF f9174a;
    public final Paint f9175b;
    public final TextPaint f9176c;
    public final y d;
    public final yj0 e;
    public boolean f9177f;
    public float h;
    public String f9178n;
    public StaticLayout f9179r;
    public float f9180s;
    public boolean v;
    public boolean f9181w;
    public boolean f9182x;
    public final org.telegram.ui.Cells.z f9183y;

    public b0(Context context) {
        super(context);
        this.f9174a = new RectF();
        Paint paint = new Paint(1);
        this.f9175b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f9176c = textPaint;
        y yVar = new y(this);
        this.d = yVar;
        yj0 yj0Var = new yj0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.e = yj0Var;
        this.f9178n = LocaleController.getString(R.string.BotsMenuTitle);
        this.E = true;
        paint.setColor(g6.x0(null, g6.f19591cf, false));
        int x02 = g6.x0(null, g6.f19626ef, false);
        yVar.f19378k = x02;
        yVar.f19377j = x02;
        yj0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(x02);
        yVar.f19381n = true;
        yVar.h = false;
        yVar.a(0.0f, false);
        yVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        yVar.f19371a.setStrokeCap(Paint.Cap.ROUND);
        yVar.f19379l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int x03 = g6.x0(null, g6.Qh, false);
        org.telegram.ui.Cells.z j02 = g6.j0(dp, dp, dp, dp, 0, x03, x03);
        this.f9183y = j02;
        j02.setCallback(this);
        yj0Var.setCallback(this);
        yj0Var.R(this);
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: fi.b0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f9183y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f9183y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.F != size || this.f9179r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f9176c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.F = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f9178n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c10 = ix0.c(replaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i12, 1, true);
            this.f9179r = c10;
            if (c10.getLineCount() > 0) {
                f7 = this.f9179r.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f9180s = f7;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f9177f) {
            dp = org.telegram.messenger.g0.C(4.0f, (int) this.f9180s, dp);
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
        if (this.f9181w) {
            if (this.f9182x != z10) {
                yj0 yj0Var = this.e;
                yj0Var.stop();
                yj0Var.h = true;
                if (z10) {
                    i10 = yj0Var.e[0];
                }
                yj0Var.P(i10);
                yj0Var.start();
                this.f9182x = z10;
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
        this.f9181w = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f9183y != drawable) {
            return false;
        }
        return true;
    }
}
