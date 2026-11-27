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
public final class hxc extends FrameLayout implements snb {
    public final ImageView a;
    public final TextView b;
    public final fx0 c;
    public wl d;
    public String e;
    public boolean f;
    public ShapeDrawable h;

    public hxc(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        addView(imageView, tre.d(32, 32.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        yob.X(textView, aob.G6, null);
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, tre.d(-1, -2.0f, 55, 68.0f, 7.0f, 54.0f, 0.0f));
        fx0 fx0Var = new fx0((byte) 11, context, this);
        this.c = fx0Var;
        yob.X(fx0Var, aob.y6, null);
        fx0Var.setTextSize(1, 13.0f);
        fx0Var.setMaxLines(1);
        fx0Var.setEllipsize(truncateAt);
        fx0Var.setPivotX(0.0f);
        addView(fx0Var, tre.d(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(2131231247);
        yob.s(imageView2, aob.A6, null, PorterDuff.Mode.SRC_IN);
        addView(imageView2, tre.d(32, 32.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            canvas.drawRect(hl.L(64.0f), getHeight() - 1, getWidth(), getHeight(), aob.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.h;
            if (shapeDrawable != null) {
                aob.A1(aob.p1(0.1f, aob.w0(null, aob.G6, false)), shapeDrawable);
                ImageView imageView = this.a;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
