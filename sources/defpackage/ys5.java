package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class ys5 extends FrameLayout implements snb {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public int d;
    public int e;
    public final bt5 f;

    public ys5(bt5 bt5Var, Context context) {
        super(context);
        this.f = bt5Var;
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setBackground(aob.L(46, aob.w0(null, aob.R7, false), aob.w0(null, aob.Y7, false)));
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(2131231613);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        addView(imageView, tre.d(46, 46.0f, 19, 13.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        bs2.t(textView, 1, 16.0f);
        yob.X(textView, aob.G6, null);
        addView(textView, tre.d(-1, -2.0f, 51, 72.0f, 9.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextSize(1, 14.0f);
        yob.X(textView2, aob.y6, null);
        addView(textView2, tre.d(-1, -2.0f, 51, 72.0f, 32.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(58.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int w0 = aob.w0(null, aob.R7, false);
        int w02 = aob.w0(null, aob.Y7, false);
        ImageView imageView = this.a;
        if (imageView != null) {
            if (w0 != this.d || w02 != this.e) {
                this.d = w0;
                this.e = w02;
                imageView.setBackground(aob.L(46, w0, w02));
                invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
