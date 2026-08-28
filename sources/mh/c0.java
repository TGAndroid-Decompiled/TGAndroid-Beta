package mh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.rv0;
public final class c0 extends View {
    public boolean A;
    public int B;
    public final RectF f17727a;
    public final Paint f17728b;
    public final TextPaint f17729c;
    public final z d;
    public final mi0 f17730e;
    public boolean f17731f;
    public float h;
    public String f17732n;
    public StaticLayout f17733r;
    public float f17734s;
    public boolean v;
    public boolean f17735w;
    public boolean f17736x;
    public final org.telegram.ui.Cells.z f17737y;

    public c0(Context context) {
        super(context);
        this.f17727a = new RectF();
        Paint paint = new Paint(1);
        this.f17728b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f17729c = textPaint;
        z zVar = new z(this);
        this.d = zVar;
        int i9 = R.raw.bot_webview_sheet_to_cross;
        mi0 mi0Var = new mi0(i9, AndroidUtilities.dp(20.0f), String.valueOf(R.raw.bot_webview_sheet_to_cross) + hashCode(), AndroidUtilities.dp(20.0f));
        this.f17730e = mi0Var;
        this.f17732n = LocaleController.getString(R.string.BotsMenuTitle);
        this.A = true;
        paint.setColor(f6.w0(null, f6.f22992cf, false));
        int w02 = f6.w0(null, f6.f23027ef, false);
        zVar.f22808k = w02;
        zVar.f22807j = w02;
        mi0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(w02);
        zVar.f22811n = true;
        zVar.h = false;
        zVar.a(0.0f, false);
        zVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        zVar.f22800a.setStrokeCap(Paint.Cap.ROUND);
        zVar.f22809l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int w03 = f6.w0(null, f6.Qh, false);
        org.telegram.ui.Cells.z i02 = f6.i0(dp, dp, dp, dp, 0, w03, w03);
        this.f17737y = i02;
        i02.setCallback(this);
        mi0Var.setCallback(this);
        mi0Var.f30863r0 = this;
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: mh.c0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f17737y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f17737y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        int size = (View.MeasureSpec.getSize(i10) + View.MeasureSpec.getSize(i9)) << 16;
        if (this.B != size || this.f17733r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f17729c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.B = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f17732n, textPaint.getFontMetricsInt(), false);
            int i11 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c10 = rv0.c(replaceEmoji, textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, i11, 1, true);
            this.f17733r = c10;
            if (c10.getLineCount() > 0) {
                f10 = this.f17733r.getLineWidth(0);
            } else {
                f10 = 0.0f;
            }
            this.f17734s = f10;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f17731f) {
            dp = org.telegram.messenger.l0.C(4.0f, (int) this.f17734s, dp);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dp, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
    }

    public void setDrawBackgroundDrawable(boolean z10) {
        this.A = z10;
        invalidate();
    }

    public void setOpened(boolean z10) {
        float f10;
        if (this.v != z10) {
            this.v = z10;
        }
        int i9 = 1;
        if (this.f17735w) {
            if (this.f17736x != z10) {
                mi0 mi0Var = this.f17730e;
                mi0Var.stop();
                mi0Var.h = true;
                if (z10) {
                    i9 = mi0Var.f30847e[0];
                }
                mi0Var.N(i9);
                mi0Var.start();
                this.f17736x = z10;
                return;
            }
            return;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d.a(f10, true);
    }

    public void setWebView(boolean z10) {
        this.f17735w = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f17737y != drawable) {
            return false;
        }
        return true;
    }
}
