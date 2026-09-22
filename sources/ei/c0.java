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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.ww0;
public final class c0 extends View {
    public boolean E;
    public int F;
    public final RectF f8267a;
    public final Paint f8268b;
    public final TextPaint f8269c;
    public final z d;
    public final kj0 e;
    public boolean f8270f;
    public float h;
    public String f8271n;
    public StaticLayout f8272r;
    public float f8273s;
    public boolean v;
    public boolean f8274w;
    public boolean f8275x;
    public final org.telegram.ui.Cells.z f8276y;

    public c0(Context context) {
        super(context);
        this.f8267a = new RectF();
        Paint paint = new Paint(1);
        this.f8268b = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f8269c = textPaint;
        z zVar = new z(this);
        this.d = zVar;
        kj0 kj0Var = new kj0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.e = kj0Var;
        this.f8271n = LocaleController.getString(R.string.BotsMenuTitle);
        this.E = true;
        paint.setColor(j6.w0(null, j6.f19099cf, false));
        int w02 = j6.w0(null, j6.f19135ef, false);
        zVar.f18846k = w02;
        zVar.f18845j = w02;
        kj0Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        textPaint.setColor(w02);
        zVar.f18849n = true;
        zVar.h = false;
        zVar.a(0.0f, false);
        zVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        zVar.f18839a.setStrokeCap(Paint.Cap.ROUND);
        zVar.f18847l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int w03 = j6.w0(null, j6.Qh, false);
        org.telegram.ui.Cells.z i02 = j6.i0(dp, dp, dp, dp, 0, w03, w03);
        this.f8276y = i02;
        i02.setCallback(this);
        kj0Var.setCallback(this);
        kj0Var.R(this);
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: ei.c0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f8276y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f8276y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.F != size || this.f8272r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f8269c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.F = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f8271n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c10 = ww0.c(replaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, false, TextUtils.TruncateAt.END, i12, 1, true);
            this.f8272r = c10;
            if (c10.getLineCount() > 0) {
                f7 = this.f8272r.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f8273s = f7;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f8270f) {
            dp = org.telegram.messenger.l0.C(4.0f, (int) this.f8273s, dp);
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
        if (this.f8274w) {
            if (this.f8275x != z10) {
                kj0 kj0Var = this.e;
                kj0Var.stop();
                kj0Var.h = true;
                if (z10) {
                    i10 = kj0Var.e[0];
                }
                kj0Var.P(i10);
                kj0Var.start();
                this.f8275x = z10;
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
        this.f8274w = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f8276y != drawable) {
            return false;
        }
        return true;
    }
}
