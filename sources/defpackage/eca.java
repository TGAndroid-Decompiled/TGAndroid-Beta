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
public final class eca extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public boolean d;
    public byte e;

    public eca(Context context) {
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
        yob.X(textView, aob.G6, null);
        textView.setTextSize(1, 16.0f);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z = ob6.a0;
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
        addView(textView, tre.d(-2, -2.0f, i2, f, 10.0f, f2, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        yob.X(textView2, aob.z6, null);
        ik8.w(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView2.setGravity(i3);
        boolean z2 = ob6.a0;
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
        addView(textView2, tre.d(-2, -2.0f, i4, f3, 33.0f, f4, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        yob.s(imageView, aob.m6, null, PorterDuff.Mode.MULTIPLY);
        if (ob6.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        addView(imageView, tre.d(48, 48.0f, i5, 10.0f, 8.0f, 10.0f, 0.0f));
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
                    Drawable mutate = getContext().getResources().getDrawable(2131232713).mutate();
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    yob.x(this, mutate, aob.G6, null, PorterDuff.Mode.MULTIPLY);
                    spannableStringBuilder.setSpan(new dca(mutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                }
                spannableStringBuilder.append((CharSequence) strArr[i]);
            }
            textView.setText(spannableStringBuilder);
            textView2.setVisibility(0);
            layoutParams.topMargin = hl.L(10.0f);
        } else {
            textView.setText(charSequence);
            if (strArr != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (i2 != 0) {
                        spannableStringBuilder2.append((CharSequence) " > ");
                        Drawable mutate2 = getContext().getResources().getDrawable(2131232713).mutate();
                        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                        yob.x(this, mutate2, aob.z6, null, PorterDuff.Mode.MULTIPLY);
                        spannableStringBuilder2.setSpan(new dca(mutate2), spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 33);
                    }
                    spannableStringBuilder2.append((CharSequence) strArr[i2]);
                }
                textView2.setText(spannableStringBuilder2);
                textView2.setVisibility(0);
                layoutParams.topMargin = hl.L(10.0f);
            } else {
                layoutParams.topMargin = hl.L(21.0f);
                textView2.setVisibility(8);
            }
        }
        int L = hl.L(16.0f);
        layoutParams.rightMargin = L;
        layoutParams.leftMargin = L;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        int L2 = hl.L(16.0f);
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
        if (ob6.a0) {
            f = 16.0f;
        } else {
            f = 71.0f;
        }
        layoutParams.leftMargin = hl.L(f);
        if (ob6.a0) {
            f2 = 71.0f;
        } else {
            f2 = 16.0f;
        }
        layoutParams.rightMargin = hl.L(f2);
        TextView textView2 = this.b;
        if (strArr != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (i2 != 0) {
                    spannableStringBuilder.append((CharSequence) " > ");
                    Drawable mutate = getContext().getResources().getDrawable(2131232713).mutate();
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    yob.x(this, mutate, aob.z6, null, PorterDuff.Mode.MULTIPLY);
                    spannableStringBuilder.setSpan(new dca(mutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                }
                spannableStringBuilder.append((CharSequence) strArr[i2]);
            }
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
            layoutParams.topMargin = hl.L(10.0f);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            if (ob6.a0) {
                f3 = 16.0f;
            } else {
                f3 = 71.0f;
            }
            layoutParams2.leftMargin = hl.L(f3);
            if (!ob6.a0) {
                f4 = 16.0f;
            }
            layoutParams2.rightMargin = hl.L(f4);
        } else {
            layoutParams.topMargin = hl.L(21.0f);
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
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(this.e);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(this.e);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(64.0f) + (this.d ? 1 : 0), 1073741824));
    }
}
