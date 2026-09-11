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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.xi0;
public final class c0 extends View {
    public boolean E;
    public int F;
    public final RectF f9575a;
    public final Paint f9576b;
    public final TextPaint f9577c;
    public final z d;
    public final xi0 f9578e;
    public boolean f9579f;
    public float h;
    public String f9580n;
    public StaticLayout f9581r;
    public float f9582s;
    public boolean v;
    public boolean f9583w;
    public boolean f9584x;
    public final org.telegram.ui.Cells.z f9585y;

    public c0(Context context) {
        super(context);
        this.f9575a = new RectF();
        Paint paint = new Paint(1);
        this.f9576b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f9577c = textPaint;
        z zVar = new z(this);
        this.d = zVar;
        xi0 xi0Var = new xi0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.f9578e = xi0Var;
        this.f9580n = LocaleController.getString(R.string.BotsMenuTitle);
        this.E = true;
        paint.setColor(j6.w0(null, j6.f20653cf, false));
        int w02 = j6.w0(null, j6.f20690ef, false);
        zVar.f20388k = w02;
        zVar.f20387j = w02;
        xi0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(w02);
        zVar.f20391n = true;
        zVar.h = false;
        zVar.a(0.0f, false);
        zVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        zVar.f20380a.setStrokeCap(Paint.Cap.ROUND);
        zVar.f20389l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int w03 = j6.w0(null, j6.Qh, false);
        org.telegram.ui.Cells.z i02 = j6.i0(dp, dp, dp, dp, 0, w03, w03);
        this.f9585y = i02;
        i02.setCallback(this);
        xi0Var.setCallback(this);
        xi0Var.f32578v0 = this;
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: fi.c0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f9585y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f9585y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.F != size || this.f9581r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f9577c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.F = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f9580n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c10 = iw0.c(replaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, i12, 1, true);
            this.f9581r = c10;
            if (c10.getLineCount() > 0) {
                f7 = this.f9581r.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f9582s = f7;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f9579f) {
            dp = org.telegram.messenger.w1.C(4.0f, (int) this.f9582s, dp);
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
        if (this.f9583w) {
            if (this.f9584x != z10) {
                xi0 xi0Var = this.f9578e;
                xi0Var.stop();
                xi0Var.h = true;
                if (z10) {
                    i10 = xi0Var.f32557e[0];
                }
                xi0Var.N(i10);
                xi0Var.start();
                this.f9584x = z10;
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
        this.f9583w = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f9585y != drawable) {
            return false;
        }
        return true;
    }
}
