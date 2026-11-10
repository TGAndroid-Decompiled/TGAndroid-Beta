package ah;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.y1;
public class e extends FrameLayout implements c6 {
    public int f1067a;
    public final h6 f1068b;
    public final ImageView f1069c;
    public final TextView d;
    public Runnable f1070e;
    public final y1 f1071f;
    public final Paint h;

    public e(Context context, h6 h6Var) {
        super(context);
        int i7;
        float f10;
        float f11;
        this.h = new Paint(1);
        this.f1068b = h6Var;
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.camera.q.m(textView, 1, 20.0f);
        if (id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7);
        int i10 = m6.f27998j5;
        t6.U(textView, i10, h6Var);
        boolean z9 = id.f23161a0;
        if (z9) {
            f10 = 16.0f;
        } else {
            f10 = 53.0f;
        }
        if (z9) {
            f11 = 53.0f;
        } else {
            f11 = 16.0f;
        }
        addView(textView, ha.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f1069c = imageView;
        y1 y1Var = new y1(false);
        this.f1071f = y1Var;
        imageView.setImageDrawable(y1Var);
        int w02 = m6.w0(i10, h6Var);
        this.f1067a = w02;
        y1Var.a(w02);
        y1Var.b(m6.w0(i10, h6Var));
        y1Var.f28787k = 220.0f;
        addView(imageView, ha.d(24, 24.0f, (id.f23161a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new d(this, 0));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int w02 = m6.w0(m6.f27891d7, this.f1068b);
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
        this.f1069c.setImageResource(i7);
    }

    public void setCloseImageVisible(boolean z9) {
        int i7;
        float f10;
        float f11;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        this.f1069c.setVisibility(i7);
        boolean z10 = id.f23161a0;
        if (!z10 && z9) {
            f10 = 53.0f;
        } else {
            f10 = 22.0f;
        }
        if (z10 && z9) {
            f11 = 53.0f;
        } else {
            f11 = 22.0f;
        }
        this.d.setLayoutParams(ha.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.f1070e = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        y1 y1Var = this.f1071f;
        if (y1Var != null) {
            try {
                int w02 = m6.w0(m6.f27998j5, this.f1068b);
                if (w02 != this.f1067a) {
                    this.f1067a = w02;
                    y1Var.a(w02);
                    y1Var.b(w02);
                    ImageView imageView = this.f1069c;
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
