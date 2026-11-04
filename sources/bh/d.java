package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.w1;
import org.telegram.ui.ActionBar.z5;
public class d extends FrameLayout implements z5 {
    public int f3307a;
    public final e6 f3308b;
    public final ImageView f3309c;
    public final TextView d;
    public Runnable f3310e;
    public final w1 f3311f;
    public final Paint h;

    public d(Context context, e6 e6Var) {
        super(context);
        int i3;
        float f10;
        float f11;
        this.h = new Paint(1);
        this.f3308b = e6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        q.m(textView, 1, 20.0f);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3);
        int i10 = k6.f27988j5;
        r6.V(textView, i10, e6Var);
        boolean z10 = bd.f21784a0;
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
        addView(textView, mf.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f3309c = imageView;
        w1 w1Var = new w1(false);
        this.f3311f = w1Var;
        imageView.setImageDrawable(w1Var);
        int w02 = k6.w0(i10, e6Var);
        this.f3307a = w02;
        w1Var.a(w02);
        w1Var.b(k6.w0(i10, e6Var));
        w1Var.f28772k = 220.0f;
        addView(imageView, mf.d(24, 24.0f, (bd.f21784a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new ai.b(this, 4));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int w02 = k6.w0(k6.f27879d7, this.f3308b);
        Paint paint = this.h;
        paint.setColor(w02);
        canvas.drawRect(0.0f, getHeight() - g0.f1(), getWidth(), getHeight(), paint);
    }

    public int getHeaderHeight() {
        return g0.L(56.0f);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeaderHeight(), 1073741824));
    }

    public void setBackImage(int i3) {
        this.f3309c.setImageResource(i3);
    }

    public void setCloseImageVisible(boolean z10) {
        int i3;
        float f10;
        float f11;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        this.f3309c.setVisibility(i3);
        boolean z11 = bd.f21784a0;
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
        this.d.setLayoutParams(mf.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.f3310e = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        w1 w1Var = this.f3311f;
        if (w1Var != null) {
            try {
                int w02 = k6.w0(k6.f27988j5, this.f3308b);
                if (w02 != this.f3307a) {
                    this.f3307a = w02;
                    w1Var.a(w02);
                    w1Var.b(w02);
                    ImageView imageView = this.f3309c;
                    if (imageView != null) {
                        imageView.invalidate();
                    }
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
