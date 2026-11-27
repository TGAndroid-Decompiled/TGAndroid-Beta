package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class xuc extends FrameLayout {
    public final TextView a;
    public final ImageView b;
    public yrc c;
    public float d;
    public float e;
    public boolean f;

    public xuc(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setSingleLine(true);
        textView.setIncludeFontPadding(false);
        textView.setGravity(21);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(hl.n1("fonts/rmedium.ttf"));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImportantForAccessibility(2);
        addView(imageView, tre.c(16.0f, 16));
    }

    public final void a() {
        float f;
        float height = (((getHeight() * 0.5f) - hl.L(19.0f)) * this.d) + hl.L(19.0f);
        float width = getWidth() - (c() * 0.5f);
        TextView textView = this.a;
        textView.setPivotX(textView.getWidth());
        textView.setPivotY(textView.getHeight() * 0.5f);
        textView.setScaleX((this.d * 0.42857146f) + 1.0f);
        textView.setScaleY((this.d * 0.42857146f) + 1.0f);
        textView.setTranslationX(((getWidth() - c()) - b()) - textView.getWidth());
        textView.setTranslationY(height - (textView.getHeight() * 0.5f));
        ImageView imageView = this.b;
        imageView.setTranslationX(width - hl.L(8.0f));
        imageView.setTranslationY(height - hl.L(8.0f));
        imageView.setAlpha(1.0f - this.d);
        yrc yrcVar = this.c;
        if (yrcVar != null) {
            yrcVar.setTranslationX(width - hl.L(20.0f));
            this.c.setTranslationY(height - hl.L(20.0f));
            this.c.setPivotX(hl.L(20.0f));
            this.c.setPivotY(hl.L(20.0f));
            this.c.setScaleX(((this.d * 0.4f) + 0.6f) * ((this.e * 0.12f) + 1.0f));
            this.c.setScaleY(((this.d * 0.4f) + 0.6f) * (1.0f - (this.e * 0.18f)));
            yrc yrcVar2 = this.c;
            if (this.f) {
                f = 0.0f;
            } else {
                f = this.d;
            }
            yrcVar2.setAlpha(f);
        }
    }

    public final float b() {
        return ((hl.L(7.0f) - hl.L(2.0f)) * this.d) + hl.L(2.0f);
    }

    public final float c() {
        return ((hl.L(23.0f) - hl.L(16.0f)) * this.d) + hl.L(16.0f);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView = this.a;
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        this.b.layout(0, 0, hl.L(16.0f), hl.L(16.0f));
        yrc yrcVar = this.c;
        if (yrcVar != null) {
            yrcVar.layout(0, 0, hl.L(40.0f), hl.L(40.0f));
        }
        a();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (Math.max(0, View.MeasureSpec.getSize(i) - Math.round(b() + c())) / ((this.d * 0.42857146f) + 1.0f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(hl.L(16.0f), 1073741824);
        TextView textView = this.a;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(hl.L(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(16.0f), 1073741824));
        yrc yrcVar = this.c;
        if (yrcVar != null) {
            yrcVar.measure(View.MeasureSpec.makeMeasureSpec(hl.L(40.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(40.0f), 1073741824));
        }
        setMeasuredDimension(View.resolveSize((int) Math.ceil(c() + b() + xnb.z(this.d, 0.42857146f, 1.0f, textView.getMeasuredWidth())), i), View.resolveSize(hl.L(40.0f), i2));
    }
}
