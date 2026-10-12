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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.sx0;
public final class c0 extends View {
    public boolean E;
    public int F;
    public final RectF f8973a;
    public final Paint f8974b;
    public final TextPaint f8975c;
    public final z d;
    public final fk0 f8976e;
    public boolean f8977f;
    public float h;
    public String f8978n;
    public StaticLayout f8979r;
    public float f8980s;
    public boolean v;
    public boolean f8981w;
    public boolean f8982x;
    public final org.telegram.ui.Cells.z f8983y;

    public c0(Context context) {
        super(context);
        this.f8973a = new RectF();
        Paint paint = new Paint(1);
        this.f8974b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f8975c = textPaint;
        z zVar = new z(this);
        this.d = zVar;
        fk0 fk0Var = new fk0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.f8976e = fk0Var;
        this.f8978n = LocaleController.getString(R.string.BotsMenuTitle);
        this.E = true;
        paint.setColor(h6.x0(null, h6.f20550cf, false));
        int x02 = h6.x0(null, h6.f20587ef, false);
        zVar.f20279k = x02;
        zVar.f20278j = x02;
        fk0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(x02);
        zVar.f20282n = true;
        zVar.h = false;
        zVar.a(0.0f, false);
        zVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        zVar.f20271a.setStrokeCap(Paint.Cap.ROUND);
        zVar.f20280l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int x03 = h6.x0(null, h6.Qh, false);
        org.telegram.ui.Cells.z j02 = h6.j0(dp, dp, dp, dp, 0, x03, x03);
        this.f8983y = j02;
        j02.setCallback(this);
        fk0Var.setCallback(this);
        fk0Var.R(this);
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ei.c0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f8983y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f8983y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.F != size || this.f8979r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f8975c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.F = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f8978n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c10 = sx0.c(replaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i12, 1, true);
            this.f8979r = c10;
            if (c10.getLineCount() > 0) {
                f7 = this.f8979r.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f8980s = f7;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f8977f) {
            dp = org.telegram.messenger.v0.C(4.0f, (int) this.f8980s, dp);
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
        if (this.f8981w) {
            if (this.f8982x != z10) {
                fk0 fk0Var = this.f8976e;
                fk0Var.stop();
                fk0Var.h = true;
                if (z10) {
                    i10 = fk0Var.f26109e[0];
                }
                fk0Var.P(i10);
                fk0Var.start();
                this.f8982x = z10;
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
        this.f8981w = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f8983y != drawable) {
            return false;
        }
        return true;
    }
}
