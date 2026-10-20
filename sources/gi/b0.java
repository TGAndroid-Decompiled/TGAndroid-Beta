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
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.vj0;
public final class b0 extends View {
    public boolean E;
    public int F;
    public final RectF f11079a;
    public final Paint f11080b;
    public final TextPaint f11081c;
    public final y d;
    public final vj0 e;
    public boolean f11082f;
    public float h;
    public String f11083n;
    public StaticLayout f11084r;
    public float f11085s;
    public boolean v;
    public boolean f11086w;
    public boolean f11087x;
    public final org.telegram.ui.Cells.z f11088y;

    public b0(Context context) {
        super(context);
        this.f11079a = new RectF();
        Paint paint = new Paint(1);
        this.f11080b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f11081c = textPaint;
        y yVar = new y(this);
        this.d = yVar;
        vj0 vj0Var = new vj0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.e = vj0Var;
        this.f11083n = LocaleController.getString(R.string.BotsMenuTitle);
        this.E = true;
        paint.setColor(h6.x0(null, h6.f20980cf, false));
        int x02 = h6.x0(null, h6.f21015ef, false);
        yVar.f20782k = x02;
        yVar.f20781j = x02;
        vj0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(x02);
        yVar.f20785n = true;
        yVar.h = false;
        yVar.a(0.0f, false);
        yVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        yVar.f20775a.setStrokeCap(Paint.Cap.ROUND);
        yVar.f20783l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int x03 = h6.x0(null, h6.Qh, false);
        org.telegram.ui.Cells.z j02 = h6.j0(dp, dp, dp, dp, 0, x03, x03);
        this.f11088y = j02;
        j02.setCallback(this);
        vj0Var.setCallback(this);
        vj0Var.R(this);
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: gi.b0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f11088y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f11088y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.F != size || this.f11084r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f11081c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.F = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f11083n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c10 = fx0.c(replaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i12, 1, true);
            this.f11084r = c10;
            if (c10.getLineCount() > 0) {
                f7 = this.f11084r.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f11085s = f7;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f11082f) {
            dp = org.telegram.messenger.g0.C(4.0f, (int) this.f11085s, dp);
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
        if (this.f11086w) {
            if (this.f11087x != z10) {
                vj0 vj0Var = this.e;
                vj0Var.stop();
                vj0Var.h = true;
                if (z10) {
                    i10 = vj0Var.e[0];
                }
                vj0Var.P(i10);
                vj0Var.start();
                this.f11087x = z10;
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
        this.f11086w = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f11088y != drawable) {
            return false;
        }
        return true;
    }
}
