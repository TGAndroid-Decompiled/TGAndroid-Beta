package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public class e1a extends FrameLayout implements vlb {
    public int a;
    public final ylb b;
    public final ImageView c;
    public final TextView d;
    public Runnable e;
    public final ee0 f;
    public final Paint h;

    public e1a(Context context, ylb ylbVar) {
        super(context);
        int i;
        float f;
        float f2;
        this.h = new Paint(1);
        this.b = ylbVar;
        TextView textView = new TextView(context);
        this.d = textView;
        wi8.v(textView, 1, 20.0f);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i);
        int i2 = cmb.i5;
        anb.X(textView, i2, ylbVar);
        boolean z = jb6.a0;
        if (z) {
            f = 16.0f;
        } else {
            f = 53.0f;
        }
        if (z) {
            f2 = 53.0f;
        } else {
            f2 = 16.0f;
        }
        addView(textView, qoe.d(-1, -2.0f, 23, f, 0.0f, f2, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ee0 ee0Var = new ee0(false);
        this.f = ee0Var;
        imageView.setImageDrawable(ee0Var);
        int v0 = cmb.v0(i2, ylbVar);
        this.a = v0;
        ee0Var.a(v0);
        ee0Var.b(cmb.v0(i2, ylbVar));
        ee0Var.k = 220.0f;
        addView(imageView, qoe.d(24, 24.0f, (jb6.a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new wk8(this, (byte) 24));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int v0 = cmb.v0(cmb.c7, this.b);
        Paint paint = this.h;
        paint.setColor(v0);
        canvas.drawRect(0.0f, getHeight() - gm.e1(), getWidth(), getHeight(), paint);
    }

    public int getHeaderHeight() {
        return gm.L(56.0f);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeaderHeight(), 1073741824));
    }

    public void setBackImage(int i) {
        this.c.setImageResource(i);
    }

    public void setCloseImageVisible(boolean z) {
        int i;
        float f;
        float f2;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.c.setVisibility(i);
        boolean z2 = jb6.a0;
        if (!z2 && z) {
            f = 53.0f;
        } else {
            f = 22.0f;
        }
        if (z2 && z) {
            f2 = 53.0f;
        } else {
            f2 = 22.0f;
        }
        this.d.setLayoutParams(qoe.d(-1, -2.0f, 23, f, 0.0f, f2, 0.0f));
    }

    public void setOnCloseClickListener(Runnable runnable) {
        this.e = runnable;
    }

    public void setText(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        ee0 ee0Var = this.f;
        if (ee0Var != null) {
            try {
                int v0 = cmb.v0(cmb.i5, this.b);
                if (v0 != this.a) {
                    this.a = v0;
                    ee0Var.a(v0);
                    ee0Var.b(v0);
                    ImageView imageView = this.c;
                    if (imageView != null) {
                        imageView.invalidate();
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
