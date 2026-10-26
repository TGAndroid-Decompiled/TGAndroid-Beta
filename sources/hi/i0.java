package hi;

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
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.px0;
import org.telegram.ui.Components.xj0;
public final class i0 extends View implements p6 {
    public boolean E;
    public int F;
    public xj0 G;
    public int H;
    public int I;
    public final RectF f13015a;
    public final Paint f13016b;
    public final TextPaint f13017c;
    public final f0 d;
    public final xj0 e;
    public boolean f13018f;
    public float h;
    public String f13019n;
    public StaticLayout f13020r;
    public float f13021s;
    public boolean v;
    public boolean f13022w;
    public boolean f13023x;
    public final org.telegram.ui.Cells.y f13024y;

    public i0(Context context) {
        super(context);
        this.f13015a = new RectF();
        this.f13016b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f13017c = textPaint;
        f0 f0Var = new f0(this);
        this.d = f0Var;
        xj0 xj0Var = new xj0(R.raw.bot_webview_sheet_to_cross, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f));
        this.e = xj0Var;
        this.f13019n = LocaleController.getString(R.string.BotsMenuTitle);
        this.E = true;
        updateColors();
        f0Var.f22819n = true;
        f0Var.h = false;
        f0Var.a(0.0f, false);
        f0Var.setCallback(this);
        textPaint.setTypeface(AndroidUtilities.bold());
        f0Var.f22809a.setStrokeCap(Paint.Cap.ROUND);
        f0Var.f22817l = true;
        int dp = AndroidUtilities.dp(16.0f);
        int x02 = y6.x0(null, y6.Qh, false);
        this.F = x02;
        org.telegram.ui.Cells.y j02 = y6.j0(dp, dp, dp, dp, 0, x02, x02);
        this.f13024y = j02;
        j02.setCallback(this);
        xj0Var.setCallback(this);
        xj0Var.R(this);
        setContentDescription(LocaleController.getString("AccDescrBotMenu", R.string.AccDescrBotMenu));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.f23346cf));
        hashSet.add(Integer.valueOf(y6.f23382ef));
        hashSet.add(Integer.valueOf(y6.Qh));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: hi.i0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f13024y.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f13024y.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.I != size || this.f13020r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f13017c;
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            this.I = size;
            CharSequence replaceEmoji = Emoji.replaceEmoji(this.f13019n, textPaint.getFontMetricsInt(), false);
            int i12 = (int) (AndroidUtilities.displaySize.x * 0.6f);
            StaticLayout c10 = px0.c(replaceEmoji, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i12, 1, true);
            this.f13020r = c10;
            if (c10.getLineCount() > 0) {
                f7 = this.f13020r.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f13021s = f7;
        }
        AndroidUtilities.dp(4.0f);
        int dp = AndroidUtilities.dp(40.0f);
        if (this.f13018f) {
            dp = org.telegram.messenger.t.D(4.0f, (int) this.f13021s, dp);
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
        if (this.f13022w) {
            if (this.f13023x != z10) {
                xj0 xj0Var = this.e;
                xj0Var.stop();
                xj0Var.h = true;
                if (z10) {
                    i10 = xj0Var.e[0];
                }
                xj0Var.P(i10);
                xj0Var.start();
                this.f13023x = z10;
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
        this.f13022w = z10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.f13017c;
        try {
            this.f13016b.setColor(y6.x0(null, y6.f23346cf, false));
            int x02 = y6.x0(null, y6.f23382ef, false);
            f0 f0Var = this.d;
            f0Var.f22816k = x02;
            f0Var.f22815j = x02;
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
        if (!super.verifyDrawable(drawable) && this.f13024y != drawable) {
            return false;
        }
        return true;
    }
}
