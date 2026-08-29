package ig;

import ag.o;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h2;
public class d extends FrameLayout {
    public final c6 f8971a;
    public final ImageView f8972b;
    public final TextView f8973c;
    public Runnable d;
    public final h2 f8974e;
    public final Paint f8975f;

    public d(Context context, c6 c6Var) {
        super(context);
        int i10;
        float f9;
        float f10;
        this.f8975f = new Paint(1);
        this.f8971a = c6Var;
        TextView textView = new TextView(context);
        this.f8973c = textView;
        org.telegram.ui.b.g(20.0f, 1, textView);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        int i11 = g6.f23169j5;
        textView.setTextColor(g6.v0(i11, c6Var));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            f9 = 16.0f;
        } else {
            f9 = 53.0f;
        }
        if (z10) {
            f10 = 53.0f;
        } else {
            f10 = 16.0f;
        }
        addView(textView, f6.d(-1, -2.0f, 23, f9, 0.0f, f10, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f8972b = imageView;
        h2 h2Var = new h2(false);
        this.f8974e = h2Var;
        imageView.setImageDrawable(h2Var);
        h2Var.a(g6.v0(i11, c6Var));
        h2Var.b(g6.v0(i11, c6Var));
        h2Var.f23476k = 220.0f;
        addView(imageView, f6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new o(this, 10));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int v02 = g6.v0(g6.f23063d7, this.f8971a);
        Paint paint = this.f8975f;
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
        this.f8972b.setImageResource(i10);
    }

    public void setCloseImageVisible(boolean z10) {
        int i10;
        float f9;
        float f10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f8972b.setVisibility(i10);
        boolean z11 = LocaleController.isRTL;
        if (!z11 && z10) {
            f9 = 53.0f;
        } else {
            f9 = 22.0f;
        }
        if (z11 && z10) {
            f10 = 53.0f;
        } else {
            f10 = 22.0f;
        }
        this.f8973c.setLayoutParams(f6.d(-1, -2.0f, 23, f9, 0.0f, f10, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.d = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.f8973c.setText(charSequence);
    }
}
