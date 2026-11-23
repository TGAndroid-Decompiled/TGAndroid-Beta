package ah;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.na;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
public class e extends FrameLayout implements b6 {
    public int f1064a;
    public final h6 f1065b;
    public final ImageView f1066c;
    public final TextView d;
    public Runnable f1067e;
    public final x1 f1068f;
    public final Paint h;

    public e(Context context, h6 h6Var) {
        super(context);
        int i7;
        float f10;
        float f11;
        this.h = new Paint(1);
        this.f1065b = h6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        o10.p(textView, 1, 20.0f);
        if (hd.f24408a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7);
        int i10 = m6.f29455j5;
        t6.U(textView, i10, h6Var);
        boolean z10 = hd.f24408a0;
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
        addView(textView, na.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f1066c = imageView;
        x1 x1Var = new x1(false);
        this.f1068f = x1Var;
        imageView.setImageDrawable(x1Var);
        int w02 = m6.w0(i10, h6Var);
        this.f1064a = w02;
        x1Var.a(w02);
        x1Var.b(m6.w0(i10, h6Var));
        x1Var.f30221k = 220.0f;
        addView(imageView, na.d(24, 24.0f, (hd.f24408a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new d(this, 0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int w02 = m6.w0(m6.f29348d7, this.f1065b);
        Paint paint = this.h;
        paint.setColor(w02);
        canvas.drawRect(0.0f, getHeight() - g0.f1(), getWidth(), getHeight(), paint);
    }

    public int getHeaderHeight() {
        return g0.L(56.0f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeaderHeight(), 1073741824));
    }

    public void setBackImage(int i7) {
        this.f1066c.setImageResource(i7);
    }

    public void setCloseImageVisible(boolean z10) {
        int i7;
        float f10;
        float f11;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f1066c.setVisibility(i7);
        boolean z11 = hd.f24408a0;
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
        this.d.setLayoutParams(na.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.f1067e = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        x1 x1Var = this.f1068f;
        if (x1Var != null) {
            try {
                int w02 = m6.w0(m6.f29455j5, this.f1065b);
                if (w02 != this.f1064a) {
                    this.f1064a = w02;
                    x1Var.a(w02);
                    x1Var.b(w02);
                    ImageView imageView = this.f1066c;
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
