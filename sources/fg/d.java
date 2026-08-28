package fg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h2;
public class d extends FrameLayout {
    public final b6 f6281a;
    public final ImageView f6282b;
    public final TextView f6283c;
    public Runnable d;
    public final h2 f6284e;
    public final Paint f6285f;

    public d(Context context, b6 b6Var) {
        super(context);
        int i9;
        float f10;
        float f11;
        this.f6285f = new Paint(1);
        this.f6281a = b6Var;
        TextView textView = new TextView(context);
        this.f6283c = textView;
        ll.k(20.0f, 1, textView);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView.setGravity(i9);
        int i10 = f6.f23108j5;
        textView.setTextColor(f6.v0(i10, b6Var));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            f10 = 16.0f;
        } else {
            f10 = 53.0f;
        }
        if (z10) {
            f11 = 53.0f;
        } else {
            f11 = 16.0f;
        }
        addView(textView, e6.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f6282b = imageView;
        h2 h2Var = new h2(false);
        this.f6284e = h2Var;
        imageView.setImageDrawable(h2Var);
        h2Var.a(f6.v0(i10, b6Var));
        h2Var.b(f6.v0(i10, b6Var));
        h2Var.f23455k = 220.0f;
        addView(imageView, e6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new androidx.mediarouter.app.c(this, 4));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int v02 = f6.v0(f6.f23002d7, this.f6281a);
        Paint paint = this.f6285f;
        paint.setColor(v02);
        canvas.drawRect(0.0f, getHeight() - AndroidUtilities.getShadowHeight(), getWidth(), getHeight(), paint);
    }

    public int getHeaderHeight() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeaderHeight(), 1073741824));
    }

    public void setBackImage(int i9) {
        this.f6282b.setImageResource(i9);
    }

    public void setCloseImageVisible(boolean z10) {
        int i9;
        float f10;
        float f11;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        this.f6282b.setVisibility(i9);
        boolean z11 = LocaleController.isRTL;
        if (!z11 && z10) {
            f10 = 53.0f;
        } else {
            f10 = 22.0f;
        }
        if (z11 && z10) {
            f11 = 53.0f;
        } else {
            f11 = 22.0f;
        }
        this.f6283c.setLayoutParams(e6.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.d = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.f6283c.setText(charSequence);
    }
}
