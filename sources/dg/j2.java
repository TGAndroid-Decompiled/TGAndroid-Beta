package dg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.z5;
public final class j2 extends TextView {
    public boolean f4612a;
    public Drawable f4613b;

    public j2(Context context) {
        super(context);
        setTextColor(-1);
        setTextSize(1, 14.0f);
        setCurrent(false);
        setEllipsize(TextUtils.TruncateAt.END);
        setSingleLine();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(-1.0f));
        super.onDraw(canvas);
        canvas.restore();
        if (this.f4612a) {
            int x10 = org.telegram.ui.b.x(16.0f, getHeight(), 2);
            if (LocaleController.isRTL) {
                this.f4613b.setBounds(AndroidUtilities.dp(7.0f), x10, AndroidUtilities.dp(23.0f), AndroidUtilities.dp(16.0f) + x10);
            } else {
                this.f4613b.setBounds(getWidth() - AndroidUtilities.dp(23.0f), x10, getWidth() - AndroidUtilities.dp(7.0f), AndroidUtilities.dp(16.0f) + x10);
            }
            this.f4613b.draw(canvas);
        }
    }

    public void setCurrent(boolean z4) {
        float f10;
        this.f4612a = z4;
        if (z4) {
            float f11 = 12.0f;
            if (LocaleController.isRTL) {
                f10 = 27.0f;
            } else {
                f10 = 12.0f;
            }
            int dp = AndroidUtilities.dp(f10);
            int dp2 = AndroidUtilities.dp(6.0f);
            if (!LocaleController.isRTL) {
                f11 = 27.0f;
            }
            setPadding(dp, dp2, AndroidUtilities.dp(f11), AndroidUtilities.dp(6.0f));
            setBackground(z5.d(new float[]{AndroidUtilities.dp(32.0f)}, 0, z5.b(1090519039)));
        } else {
            setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f));
            setBackground(z5.d(new float[]{0.0f}, 0, z5.b(-14145495)));
        }
        if (this.f4612a && this.f4613b == null) {
            Drawable drawable = getContext().getDrawable(R.drawable.photo_expand);
            this.f4613b = drawable;
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }
}
