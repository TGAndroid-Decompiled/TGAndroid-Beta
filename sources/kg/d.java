package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.i2;
import org.telegram.ui.ActionBar.j6;
public class d extends FrameLayout {
    public final f6 f10415a;
    public final ImageView f10416b;
    public final TextView f10417c;
    public Runnable d;
    public final i2 e;
    public final Paint f10418f;

    public d(Context context, f6 f6Var) {
        super(context);
        int i10;
        float f10;
        float f11;
        this.f10418f = new Paint(1);
        this.f10415a = f6Var;
        TextView textView = new TextView(context);
        this.f10417c = textView;
        org.telegram.ui.b.g(20.0f, 1, textView);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        int i11 = j6.f20012j5;
        textView.setTextColor(j6.v0(i11, f6Var));
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
        addView(textView, b6.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f10416b = imageView;
        i2 i2Var = new i2(false);
        this.e = i2Var;
        imageView.setImageDrawable(i2Var);
        i2Var.a(j6.v0(i11, f6Var));
        i2Var.b(j6.v0(i11, f6Var));
        i2Var.f19795k = 220.0f;
        addView(imageView, b6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new androidx.mediarouter.app.c(this, 10));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int v02 = j6.v0(j6.f19907d7, this.f10415a);
        Paint paint = this.f10418f;
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
        this.f10416b.setImageResource(i10);
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
        this.f10416b.setVisibility(i10);
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
        this.f10417c.setLayoutParams(b6.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.d = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.f10417c.setText(charSequence);
    }
}
