package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class tuc extends FrameLayout implements vlb {
    public final ImageView a;
    public final TextView b;
    public final ey0 c;
    public vm d;
    public String e;
    public boolean f;
    public ShapeDrawable h;

    public tuc(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        addView(imageView, qoe.d(32, 32.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        anb.X(textView, cmb.F6, null);
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, qoe.d(-1, -2.0f, 55, 68.0f, 7.0f, 54.0f, 0.0f));
        ey0 ey0Var = new ey0((byte) 11, context, this);
        this.c = ey0Var;
        anb.X(ey0Var, cmb.x6, null);
        ey0Var.setTextSize(1, 13.0f);
        ey0Var.setMaxLines(1);
        ey0Var.setEllipsize(truncateAt);
        ey0Var.setPivotX(0.0f);
        addView(ey0Var, qoe.d(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131231248);
        anb.s(imageView2, cmb.z6, null, PorterDuff.Mode.SRC_IN);
        addView(imageView2, qoe.d(32, 32.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            canvas.drawRect(gm.L(64.0f), getHeight() - 1, getWidth(), getHeight(), cmb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.h;
            if (shapeDrawable != null) {
                cmb.A1(cmb.p1(0.1f, cmb.w0(null, cmb.F6, false)), shapeDrawable);
                ImageView imageView = this.a;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
