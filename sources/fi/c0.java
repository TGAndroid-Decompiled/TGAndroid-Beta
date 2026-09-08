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
    public final RectF f9603a;
    public final Paint f9604b;
    public final TextPaint f9605c;
    public final z d;
    public final xi0 f9606e;
    public boolean f9607f;
    public float h;
    public String f9608n;
    public StaticLayout f9609r;
    public float f9610s;
    public boolean v;
    public boolean f9611w;
    public boolean f9612x;
    public final org.telegram.ui.Cells.z f9613y;

    public c0(Context context) {
        super(context);
        this.f9603a = new RectF();
        Paint paint = new Paint(1);
        this.f9604b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f9605c = textPaint;
        z zVar = new z(this);
        this.d = zVar;
        xi0 xi0Var = new xi0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.f9606e = xi0Var;
        this.f9608n = LocaleController.getString(R.string.BotsMenuTitle);
        this.E = true;
        paint.setColor(j6.w0(null, j6.f20680cf, false));
        int w02 = j6.w0(null, j6.f20717ef, false);
        zVar.f20415k = w02;
        zVar.f20414j = w02;
        xi0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(w02);
        zVar.f20418n = true;
        zVar.h = false;
        zVar.a(0.0f, false);
        zVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        zVar.f20407a.setStrokeCap(Paint.Cap.ROUND);
        zVar.f20416l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int w03 = j6.w0(null, j6.Qh, false);
        org.telegram.ui.Cells.z i02 = j6.i0(dp, dp, dp, dp, 0, w03, w03);
        this.f9613y = i02;
        i02.setCallback(this);
        xi0Var.setCallback(this);
        xi0Var.f32605v0 = this;
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: fi.c0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f9613y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f9613y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.F != size || this.f9609r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f9605c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.F = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f9608n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c10 = iw0.c(replaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, i12, 1, true);
            this.f9609r = c10;
            if (c10.getLineCount() > 0) {
                f7 = this.f9609r.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f9610s = f7;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f9607f) {
            dp = org.telegram.messenger.w1.C(4.0f, (int) this.f9610s, dp);
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
        if (this.f9611w) {
            if (this.f9612x != z10) {
                xi0 xi0Var = this.f9606e;
                xi0Var.stop();
                xi0Var.h = true;
                if (z10) {
                    i10 = xi0Var.f32584e[0];
                }
                xi0Var.N(i10);
                xi0Var.start();
                this.f9612x = z10;
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
        this.f9611w = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f9613y != drawable) {
            return false;
        }
        return true;
    }
}
