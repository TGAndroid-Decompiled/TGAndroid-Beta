package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public class ijb extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public boolean d;
    public boolean e;

    public ijb(Context context) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        TextView textView = new TextView(context);
        this.a = textView;
        anb.X(textView, cmb.F6, null);
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 16);
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        addView(textView, qoe.d(-2, -2.0f, i2 | 48, 21.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        anb.X(textView2, cmb.y6, null);
        textView2.setTextSize(1, 13.0f);
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView2.setGravity(i3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        if (jb6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        addView(textView2, qoe.d(-2, -2.0f, i4 | 48, 21.0f, 35.0f, 21.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(imageView, cmb.l6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        addView(imageView, qoe.d(52, 52.0f, (jb6.a0 ? 5 : 3) | 48, 8.0f, 6.0f, 8.0f, 0.0f));
    }

    public final void a(String str, String str2, boolean z) {
        this.a.setText(str);
        this.b.setText(str2);
        this.d = z;
        this.c.setVisibility(8);
        setWillNotDraw(!z);
    }

    public final void b(int i, String str, String str2, boolean z) {
        int L;
        int i2;
        int L2;
        int i3;
        int i4;
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        textView2.setText(str2);
        ImageView imageView = this.c;
        imageView.setImageResource(i);
        imageView.setVisibility(0);
        if (jb6.a0) {
            L = 0;
        } else {
            L = gm.L(50.0f);
        }
        if (jb6.a0) {
            i2 = gm.L(50.0f);
        } else {
            i2 = 0;
        }
        textView.setPadding(L, 0, i2, 0);
        if (jb6.a0) {
            L2 = 0;
        } else {
            L2 = gm.L(50.0f);
        }
        if (jb6.a0) {
            i3 = gm.L(50.0f);
        } else {
            i3 = 0;
        }
        if (this.e) {
            i4 = gm.L(12.0f);
        } else {
            i4 = 0;
        }
        textView2.setPadding(L2, 0, i3, i4);
        this.d = z;
        setWillNotDraw(!z);
    }

    public TextView getTextView() {
        return this.a;
    }

    public TextView getValueTextView() {
        return this.b;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        float L;
        int i;
        if (this.d && cmb.j0 != null) {
            boolean z = jb6.a0;
            float f2 = 20.0f;
            ImageView imageView = this.c;
            if (z) {
                L = 0.0f;
            } else {
                if (imageView.getVisibility() == 0) {
                    f = 71.0f;
                } else {
                    f = 20.0f;
                }
                L = gm.L(f);
            }
            float f3 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                if (imageView.getVisibility() == 0) {
                    f2 = 71.0f;
                }
                i = gm.L(f2);
            } else {
                i = 0;
            }
            canvas.drawLine(f3, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (!this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(64.0f) + (this.d ? 1 : 0), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), 0);
        }
    }

    public void setMultilineDetail(boolean z) {
        this.e = z;
        TextView textView = this.b;
        if (z) {
            textView.setLines(0);
            textView.setMaxLines(0);
            textView.setSingleLine(false);
            textView.setPadding(0, 0, 0, gm.L(12.0f));
            return;
        }
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
