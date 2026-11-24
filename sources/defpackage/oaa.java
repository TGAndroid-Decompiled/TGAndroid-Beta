package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class oaa extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public boolean d;
    public byte e;

    public oaa(Context context) {
        super(context);
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        float f3;
        float f4;
        int i5;
        TextView textView = new TextView(context);
        this.a = textView;
        anb.X(textView, cmb.F6, null);
        textView.setTextSize(1, 16.0f);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z = jb6.a0;
        if (z) {
            f = 16.0f;
            i2 = 5;
        } else {
            i2 = 3;
            f = 71.0f;
        }
        if (z) {
            f2 = 71.0f;
        } else {
            f2 = 16.0f;
        }
        addView(textView, qoe.d(-2, -2.0f, i2, f, 10.0f, f2, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        anb.X(textView2, cmb.y6, null);
        wi8.w(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView2.setGravity(i3);
        boolean z2 = jb6.a0;
        if (z2) {
            f3 = 16.0f;
            i4 = 5;
        } else {
            i4 = 3;
            f3 = 71.0f;
        }
        if (z2) {
            f4 = 71.0f;
        } else {
            f4 = 16.0f;
        }
        addView(textView2, qoe.d(-2, -2.0f, i4, f3, 33.0f, f4, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(imageView, cmb.l6, null, PorterDuff.Mode.MULTIPLY);
        if (jb6.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        addView(imageView, qoe.d(48, 48.0f, i5, 10.0f, 8.0f, 10.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, String[] strArr, boolean z, boolean z2) {
        TextView textView = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        TextView textView2 = this.b;
        if (z) {
            textView2.setText(charSequence);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < strArr.length; i++) {
                if (i != 0) {
                    spannableStringBuilder.append((CharSequence) " > ");
                    Drawable mutate = getContext().getResources().getDrawable(2131232714).mutate();
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    anb.x(this, mutate, cmb.F6, null, PorterDuff.Mode.MULTIPLY);
                    spannableStringBuilder.setSpan(new naa(mutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                }
                spannableStringBuilder.append((CharSequence) strArr[i]);
            }
            textView.setText(spannableStringBuilder);
            textView2.setVisibility(0);
            layoutParams.topMargin = gm.L(10.0f);
        } else {
            textView.setText(charSequence);
            if (strArr != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (i2 != 0) {
                        spannableStringBuilder2.append((CharSequence) " > ");
                        Drawable mutate2 = getContext().getResources().getDrawable(2131232714).mutate();
                        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                        anb.x(this, mutate2, cmb.y6, null, PorterDuff.Mode.MULTIPLY);
                        spannableStringBuilder2.setSpan(new naa(mutate2), spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 33);
                    }
                    spannableStringBuilder2.append((CharSequence) strArr[i2]);
                }
                textView2.setText(spannableStringBuilder2);
                textView2.setVisibility(0);
                layoutParams.topMargin = gm.L(10.0f);
            } else {
                layoutParams.topMargin = gm.L(21.0f);
                textView2.setVisibility(8);
            }
        }
        int L = gm.L(16.0f);
        layoutParams.rightMargin = L;
        layoutParams.leftMargin = L;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        int L2 = gm.L(16.0f);
        layoutParams2.rightMargin = L2;
        layoutParams2.leftMargin = L2;
        this.c.setVisibility(8);
        this.d = z2;
        setWillNotDraw(!z2);
        this.e = (byte) 16;
    }

    public final void b(CharSequence charSequence, String[] strArr, int i, boolean z) {
        float f;
        float f2;
        float f3;
        TextView textView = this.a;
        textView.setText(charSequence);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        float f4 = 71.0f;
        if (jb6.a0) {
            f = 16.0f;
        } else {
            f = 71.0f;
        }
        layoutParams.leftMargin = gm.L(f);
        if (jb6.a0) {
            f2 = 71.0f;
        } else {
            f2 = 16.0f;
        }
        layoutParams.rightMargin = gm.L(f2);
        TextView textView2 = this.b;
        if (strArr != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (i2 != 0) {
                    spannableStringBuilder.append((CharSequence) " > ");
                    Drawable mutate = getContext().getResources().getDrawable(2131232714).mutate();
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    anb.x(this, mutate, cmb.y6, null, PorterDuff.Mode.MULTIPLY);
                    spannableStringBuilder.setSpan(new naa(mutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                }
                spannableStringBuilder.append((CharSequence) strArr[i2]);
            }
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
            layoutParams.topMargin = gm.L(10.0f);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            if (jb6.a0) {
                f3 = 16.0f;
            } else {
                f3 = 71.0f;
            }
            layoutParams2.leftMargin = gm.L(f3);
            if (!jb6.a0) {
                f4 = 16.0f;
            }
            layoutParams2.rightMargin = gm.L(f4);
        } else {
            layoutParams.topMargin = gm.L(21.0f);
            textView2.setVisibility(8);
        }
        ImageView imageView = this.c;
        if (i != 0) {
            imageView.setImageResource(i);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.e = (byte) 69;
        this.d = z;
        setWillNotDraw(!z);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.d) {
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(this.e);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(this.e);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(64.0f) + (this.d ? 1 : 0), 1073741824));
    }
}
