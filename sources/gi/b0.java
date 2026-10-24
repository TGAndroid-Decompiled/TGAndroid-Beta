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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.hx0;
import org.telegram.ui.Components.xj0;
public final class b0 extends View implements b6 {
    public boolean E;
    public int F;
    public xj0 G;
    public int H;
    public int I;
    public final RectF f11098a;
    public final Paint f11099b;
    public final TextPaint f11100c;
    public final y d;
    public final xj0 e;
    public boolean f11101f;
    public float h;
    public String f11102n;
    public StaticLayout f11103r;
    public float f11104s;
    public boolean v;
    public boolean f11105w;
    public boolean f11106x;
    public final org.telegram.ui.Cells.y f11107y;

    public b0(Context context) {
        super(context);
        this.f11098a = new RectF();
        this.f11099b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f11100c = textPaint;
        y yVar = new y(this);
        this.d = yVar;
        xj0 xj0Var = new xj0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.e = xj0Var;
        this.f11102n = LocaleController.getString(R.string.BotsMenuTitle);
        this.E = true;
        updateColors();
        yVar.f20963n = true;
        yVar.h = false;
        yVar.a(0.0f, false);
        yVar.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        yVar.f20953a.setStrokeCap(Paint.Cap.ROUND);
        yVar.f20961l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int x02 = k6.x0(null, k6.Qh, false);
        this.F = x02;
        org.telegram.ui.Cells.y j02 = k6.j0(dp, dp, dp, dp, 0, x02, x02);
        this.f11107y = j02;
        j02.setCallback(this);
        xj0Var.setCallback(this);
        xj0Var.R(this);
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f21174cf));
        hashSet.add(Integer.valueOf(k6.f21209ef));
        hashSet.add(Integer.valueOf(k6.Qh));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: gi.b0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f11107y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f11107y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.I != size || this.f11103r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f11100c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.I = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f11102n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c10 = hx0.c(replaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i12, 1, true);
            this.f11103r = c10;
            if (c10.getLineCount() > 0) {
                f7 = this.f11103r.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f11104s = f7;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f11101f) {
            dp = org.telegram.messenger.v0.C(4.0f, (int) this.f11104s, dp);
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
        if (this.f11105w) {
            if (this.f11106x != z10) {
                xj0 xj0Var = this.e;
                xj0Var.stop();
                xj0Var.h = true;
                if (z10) {
                    i10 = xj0Var.e[0];
                }
                xj0Var.P(i10);
                xj0Var.start();
                this.f11106x = z10;
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
        this.f11105w = z10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.f11100c;
        try {
            this.f11099b.setColor(k6.x0(null, k6.f21174cf, false));
            int x02 = k6.x0(null, k6.f21209ef, false);
            y yVar = this.d;
            yVar.f20960k = x02;
            yVar.f20959j = x02;
            xj0 xj0Var = this.e;
            if (xj0Var != null) {
                if (xj0Var == this.G) {
                    if (x02 != this.H) {
                    }
                }
                this.G = xj0Var;
                this.H = x02;
                xj0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            int alpha = textPaint.getAlpha();
            textPaint.setColor(x02);
            if (alpha != 255) {
                textPaint.setAlpha(alpha);
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f11107y != drawable) {
            return false;
        }
        return true;
    }
}
