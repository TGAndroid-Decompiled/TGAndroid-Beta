package gi;

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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.uj0;
public final class b0 extends View {
    public boolean E;
    public int F;
    public final RectF f11080a;
    public final Paint f11081b;
    public final TextPaint f11082c;
    public final y d;
    public final uj0 e;
    public boolean f11083f;
    public float h;
    public String f11084n;
    public StaticLayout f11085r;
    public float f11086s;
    public boolean v;
    public boolean f11087w;
    public boolean f11088x;
    public final org.telegram.ui.Cells.z f11089y;

    public b0(Context context) {
        super(context);
        this.f11080a = new RectF();
        Paint paint = new Paint(1);
        this.f11081b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f11082c = textPaint;
        y yVar = new y(this);
        this.d = yVar;
        uj0 uj0Var = new uj0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.e = uj0Var;
        this.f11084n = LocaleController.getString(R.string.BotsMenuTitle);
        this.E = true;
        paint.setColor(h6.x0(null, h6.f20976cf, false));
        int x02 = h6.x0(null, h6.f21011ef, false);
        yVar.f20778k = x02;
        yVar.f20777j = x02;
        uj0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(x02);
        yVar.f20781n = true;
        yVar.h = false;
        yVar.a(0.0f, false);
        yVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        yVar.f20771a.setStrokeCap(Paint.Cap.ROUND);
        yVar.f20779l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int x03 = h6.x0(null, h6.Qh, false);
        org.telegram.ui.Cells.z j02 = h6.j0(dp, dp, dp, dp, 0, x03, x03);
        this.f11089y = j02;
        j02.setCallback(this);
        uj0Var.setCallback(this);
        uj0Var.R(this);
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: gi.b0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f11089y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f11089y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.F != size || this.f11085r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f11082c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.F = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f11084n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c10 = dx0.c(replaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i12, 1, true);
            this.f11085r = c10;
            if (c10.getLineCount() > 0) {
                f7 = this.f11085r.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f11086s = f7;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f11083f) {
            dp = org.telegram.messenger.q.C(4.0f, (int) this.f11086s, dp);
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
        if (this.f11087w) {
            if (this.f11088x != z10) {
                uj0 uj0Var = this.e;
                uj0Var.stop();
                uj0Var.h = true;
                if (z10) {
                    i10 = uj0Var.e[0];
                }
                uj0Var.P(i10);
                uj0Var.start();
                this.f11088x = z10;
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
        this.f11087w = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f11089y != drawable) {
            return false;
        }
        return true;
    }
}
