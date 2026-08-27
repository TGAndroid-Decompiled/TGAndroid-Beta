package gg;

import ag.w0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.g6;

public class d extends FrameLayout {

    public final c6 f7081a;

    public final ImageView f7082b;

    public final TextView f7083c;
    public Runnable d;

    public final g2 f7084e;

    public final Paint f7085f;

    public d(Context context, c6 c6Var) {
        super(context);
        this.f7085f = new Paint(1);
        this.f7081a = c6Var;
        TextView textView = new TextView(context);
        this.f7083c = textView;
        rl.h(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        int i10 = g6.f23161j5;
        textView.setTextColor(g6.v0(i10, c6Var));
        boolean z10 = LocaleController.isRTL;
        addView(textView, z5.d(-1, -2.0f, 23, z10 ? 16.0f : 53.0f, 0.0f, z10 ? 53.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f7082b = imageView;
        g2 g2Var = new g2(false);
        this.f7084e = g2Var;
        imageView.setImageDrawable(g2Var);
        g2Var.a(g6.v0(i10, c6Var));
        g2Var.b(g6.v0(i10, c6Var));
        g2Var.f22973k = 220.0f;
        addView(imageView, z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new w0(this, 6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int iV0 = g6.v0(g6.f23054d7, this.f7081a);
        Paint paint = this.f7085f;
        paint.setColor(iV0);
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
        this.f7082b.setImageResource(i10);
    }

    public void setCloseImageVisible(boolean z10) {
        this.f7082b.setVisibility(z10 ? 0 : 8);
        boolean z11 = LocaleController.isRTL;
        this.f7083c.setLayoutParams(z5.d(-1, -2.0f, 23, (z11 || !z10) ? 22.0f : 53.0f, 0.0f, (z11 && z10) ? 53.0f : 22.0f, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.d = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.f7083c.setText(charSequence);
    }
}
