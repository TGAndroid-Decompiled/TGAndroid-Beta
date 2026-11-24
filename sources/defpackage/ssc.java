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
public final class ssc extends FrameLayout implements tjb {
    public final ImageView a;
    public final TextView b;
    public final xw0 c;
    public vl d;
    public String e;
    public boolean f;
    public ShapeDrawable h;

    public ssc(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        addView(imageView, nme.d(32, 32.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        zkb.X(textView, bkb.F6, null);
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, nme.d(-1, -2.0f, 55, 68.0f, 7.0f, 54.0f, 0.0f));
        xw0 xw0Var = new xw0((byte) 11, context, this);
        this.c = xw0Var;
        zkb.X(xw0Var, bkb.x6, null);
        xw0Var.setTextSize(1, 13.0f);
        xw0Var.setMaxLines(1);
        xw0Var.setEllipsize(truncateAt);
        xw0Var.setPivotX(0.0f);
        addView(xw0Var, nme.d(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131231247);
        zkb.s(imageView2, bkb.z6, null, PorterDuff.Mode.SRC_IN);
        addView(imageView2, nme.d(32, 32.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            canvas.drawRect(gl.L(64.0f), getHeight() - 1, getWidth(), getHeight(), bkb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.h;
            if (shapeDrawable != null) {
                bkb.A1(bkb.p1(0.1f, bkb.w0(null, bkb.F6, false)), shapeDrawable);
                ImageView imageView = this.a;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
