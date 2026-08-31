package lg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i2;
import org.telegram.ui.ActionBar.k6;
public class d extends FrameLayout {
    public final g6 f12536a;
    public final ImageView f12537b;
    public final TextView f12538c;
    public Runnable d;
    public final i2 f12539e;
    public final Paint f12540f;

    public d(Context context, g6 g6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        this.f12540f = new Paint(1);
        this.f12536a = g6Var;
        TextView textView = new TextView(context);
        this.f12538c = textView;
        org.telegram.ui.b.g(20.0f, 1, textView);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        int i11 = k6.f21766j5;
        textView.setTextColor(k6.v0(i11, g6Var));
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            f10 = 16.0f;
        } else {
            f10 = 53.0f;
        }
        if (z4) {
            f11 = 53.0f;
        } else {
            f11 = 16.0f;
        }
        addView(textView, c6.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f12537b = imageView;
        i2 i2Var = new i2(false);
        this.f12539e = i2Var;
        imageView.setImageDrawable(i2Var);
        i2Var.a(k6.v0(i11, g6Var));
        i2Var.b(k6.v0(i11, g6Var));
        i2Var.f21458k = 220.0f;
        addView(imageView, c6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new androidx.mediarouter.app.c(this, 10));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int v02 = k6.v0(k6.f21660d7, this.f12536a);
        Paint paint = this.f12540f;
        paint.setColor(v02);
        canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), paint);
    }

    public int getHeaderHeight() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeaderHeight(), 1073741824));
    }

    public void setBackImage(int i10) {
        this.f12537b.setImageResource(i10);
    }

    public void setCloseImageVisible(boolean z4) {
        int i10;
        float f10;
        float f11;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f12537b.setVisibility(i10);
        boolean z10 = LocaleController.isRTL;
        if (!z10 && z4) {
            f10 = 53.0f;
        } else {
            f10 = 22.0f;
        }
        if (z10 && z4) {
            f11 = 53.0f;
        } else {
            f11 = 22.0f;
        }
        this.f12538c.setLayoutParams(c6.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.d = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.f12538c.setText(charSequence);
    }
}
