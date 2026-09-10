package di;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.uw0;
public final class f0 extends View {
    public boolean E;
    public int F;
    public final RectF f6611a;
    public final Paint f6612b;
    public final TextPaint f6613c;
    public final c0 d;
    public final hj0 e;
    public boolean f6614f;
    public float h;
    public String f6615n;
    public StaticLayout f6616r;
    public float f6617s;
    public boolean v;
    public boolean f6618w;
    public boolean f6619x;
    public final org.telegram.ui.Cells.z f6620y;

    public f0(Context context) {
        super(context);
        this.f6611a = new RectF();
        Paint paint = new Paint(1);
        this.f6612b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f6613c = textPaint;
        c0 c0Var = new c0(this);
        this.d = c0Var;
        hj0 hj0Var = new hj0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.e = hj0Var;
        this.f6615n = LocaleController.getString(R.string.BotsMenuTitle);
        this.E = true;
        paint.setColor(j6.w0(null, j6.f17918cf, false));
        int w02 = j6.w0(null, j6.f17953ef, false);
        c0Var.f17744k = w02;
        c0Var.f17743j = w02;
        hj0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(w02);
        c0Var.f17747n = true;
        c0Var.h = false;
        c0Var.a(0.0f, false);
        c0Var.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        c0Var.f17737a.setStrokeCap(Paint.Cap.ROUND);
        c0Var.f17745l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int w03 = j6.w0(null, j6.Qh, false);
        org.telegram.ui.Cells.z i02 = j6.i0(dp, dp, dp, dp, 0, w03, w03);
        this.f6620y = i02;
        i02.setCallback(this);
        hj0Var.setCallback(this);
        hj0Var.f23672v0 = this;
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: di.f0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f6620y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f6620y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.F != size || this.f6616r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f6613c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.F = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f6615n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c10 = uw0.c(replaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, i12, 1, true);
            this.f6616r = c10;
            if (c10.getLineCount() > 0) {
                f7 = this.f6616r.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f6617s = f7;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f6614f) {
            dp = org.telegram.messenger.a2.C(4.0f, (int) this.f6617s, dp);
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
        if (this.f6618w) {
            if (this.f6619x != z10) {
                hj0 hj0Var = this.e;
                hj0Var.stop();
                hj0Var.h = true;
                if (z10) {
                    i10 = hj0Var.e[0];
                }
                hj0Var.P(i10);
                hj0Var.start();
                this.f6619x = z10;
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
        this.f6618w = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f6620y != drawable) {
            return false;
        }
        return true;
    }
}
