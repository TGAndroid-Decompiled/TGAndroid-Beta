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
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.uw0;
public final class c0 extends View {
    public boolean E;
    public int F;
    public final RectF f8250a;
    public final Paint f8251b;
    public final TextPaint f8252c;
    public final z d;
    public final ij0 e;
    public boolean f8253f;
    public float h;
    public String f8254n;
    public StaticLayout f8255r;
    public float f8256s;
    public boolean v;
    public boolean f8257w;
    public boolean f8258x;
    public final org.telegram.ui.Cells.z f8259y;

    public c0(Context context) {
        super(context);
        this.f8250a = new RectF();
        Paint paint = new Paint(1);
        this.f8251b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f8252c = textPaint;
        z zVar = new z(this);
        this.d = zVar;
        ij0 ij0Var = new ij0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.e = ij0Var;
        this.f8254n = LocaleController.getString(R.string.BotsMenuTitle);
        this.E = true;
        paint.setColor(h6.w0(null, h6.f19050cf, false));
        int w02 = h6.w0(null, h6.f19086ef, false);
        zVar.f18792k = w02;
        zVar.f18791j = w02;
        ij0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(w02);
        zVar.f18795n = true;
        zVar.h = false;
        zVar.a(0.0f, false);
        zVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        zVar.f18785a.setStrokeCap(Paint.Cap.ROUND);
        zVar.f18793l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int w03 = h6.w0(null, h6.Qh, false);
        org.telegram.ui.Cells.z i02 = h6.i0(dp, dp, dp, dp, 0, w03, w03);
        this.f8259y = i02;
        i02.setCallback(this);
        ij0Var.setCallback(this);
        ij0Var.R(this);
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ei.c0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f8259y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f8259y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.F != size || this.f8255r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f8252c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.F = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f8254n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c10 = uw0.c(replaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, i12, 1, true);
            this.f8255r = c10;
            if (c10.getLineCount() > 0) {
                f7 = this.f8255r.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f8256s = f7;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f8253f) {
            dp = org.telegram.messenger.f0.C(4.0f, (int) this.f8256s, dp);
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
        if (this.f8257w) {
            if (this.f8258x != z10) {
                ij0 ij0Var = this.e;
                ij0Var.stop();
                ij0Var.h = true;
                if (z10) {
                    i10 = ij0Var.e[0];
                }
                ij0Var.P(i10);
                ij0Var.start();
                this.f8258x = z10;
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
        this.f8257w = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f8259y != drawable) {
            return false;
        }
        return true;
    }
}
