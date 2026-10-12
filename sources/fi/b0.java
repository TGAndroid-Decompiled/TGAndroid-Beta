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
import org.telegram.messenger.yh;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.yj0;
public final class b0 extends View {
    public boolean E;
    public int F;
    public final RectF f9171a;
    public final Paint f9172b;
    public final TextPaint f9173c;
    public final y d;
    public final yj0 e;
    public boolean f9174f;
    public float h;
    public String f9175n;
    public StaticLayout f9176r;
    public float f9177s;
    public boolean v;
    public boolean f9178w;
    public boolean f9179x;
    public final org.telegram.ui.Cells.z f9180y;

    public b0(Context context) {
        super(context);
        this.f9171a = new RectF();
        Paint paint = new Paint(1);
        this.f9172b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f9173c = textPaint;
        y yVar = new y(this);
        this.d = yVar;
        yj0 yj0Var = new yj0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.e = yj0Var;
        this.f9175n = LocaleController.getString(R.string.BotsMenuTitle);
        this.E = true;
        paint.setColor(g6.x0(null, g6.f19891cf, false));
        int x02 = g6.x0(null, g6.f19926ef, false);
        yVar.f19678k = x02;
        yVar.f19677j = x02;
        yj0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(x02);
        yVar.f19681n = true;
        yVar.h = false;
        yVar.a(0.0f, false);
        yVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        yVar.f19671a.setStrokeCap(Paint.Cap.ROUND);
        yVar.f19679l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int x03 = g6.x0(null, g6.Qh, false);
        org.telegram.ui.Cells.z j02 = g6.j0(dp, dp, dp, dp, 0, x03, x03);
        this.f9180y = j02;
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
        this.f9180y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f9180y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.F != size || this.f9176r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f9173c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.F = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f9175n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c10 = ix0.c(replaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i12, 1, true);
            this.f9176r = c10;
            if (c10.getLineCount() > 0) {
                f7 = this.f9176r.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f9177s = f7;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f9174f) {
            dp = yh.c(4.0f, (int) this.f9177s, dp);
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
        if (this.f9178w) {
            if (this.f9179x != z10) {
                yj0 yj0Var = this.e;
                yj0Var.stop();
                yj0Var.h = true;
                if (z10) {
                    i10 = yj0Var.e[0];
                }
                yj0Var.P(i10);
                yj0Var.start();
                this.f9179x = z10;
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
        this.f9178w = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f9180y != drawable) {
            return false;
        }
        return true;
    }
}
