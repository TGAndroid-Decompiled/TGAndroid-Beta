package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class jqc extends FrameLayout {
    public final TextView a;
    public final ImageView b;
    public lnc c;
    public float d;
    public float e;
    public boolean f;

    public jqc(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setSingleLine(true);
        textView.setIncludeFontPadding(false);
        textView.setGravity(21);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.n1("fonts/rmedium.ttf"));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImportantForAccessibility(2);
        addView(imageView, nme.c(16.0f, 16));
    }

    public final void a() {
        float f;
        float height = (((getHeight() * 0.5f) - gl.L(19.0f)) * this.d) + gl.L(19.0f);
        float width = getWidth() - (c() * 0.5f);
        TextView textView = this.a;
        textView.setPivotX(textView.getWidth());
        textView.setPivotY(textView.getHeight() * 0.5f);
        textView.setScaleX((this.d * 0.42857146f) + 1.0f);
        textView.setScaleY((this.d * 0.42857146f) + 1.0f);
        textView.setTranslationX(((getWidth() - c()) - b()) - textView.getWidth());
        textView.setTranslationY(height - (textView.getHeight() * 0.5f));
        ImageView imageView = this.b;
        imageView.setTranslationX(width - gl.L(8.0f));
        imageView.setTranslationY(height - gl.L(8.0f));
        imageView.setAlpha(1.0f - this.d);
        lnc lncVar = this.c;
        if (lncVar != null) {
            lncVar.setTranslationX(width - gl.L(20.0f));
            this.c.setTranslationY(height - gl.L(20.0f));
            this.c.setPivotX(gl.L(20.0f));
            this.c.setPivotY(gl.L(20.0f));
            this.c.setScaleX(((this.d * 0.4f) + 0.6f) * ((this.e * 0.12f) + 1.0f));
            this.c.setScaleY(((this.d * 0.4f) + 0.6f) * (1.0f - (this.e * 0.18f)));
            lnc lncVar2 = this.c;
            if (this.f) {
                f = 0.0f;
            } else {
                f = this.d;
            }
            lncVar2.setAlpha(f);
        }
    }

    public final float b() {
        return ((gl.L(7.0f) - gl.L(2.0f)) * this.d) + gl.L(2.0f);
    }

    public final float c() {
        return ((gl.L(23.0f) - gl.L(16.0f)) * this.d) + gl.L(16.0f);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView = this.a;
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        this.b.layout(0, 0, gl.L(16.0f), gl.L(16.0f));
        lnc lncVar = this.c;
        if (lncVar != null) {
            lncVar.layout(0, 0, gl.L(40.0f), gl.L(40.0f));
        }
        a();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (Math.max(0, View.MeasureSpec.getSize(i) - Math.round(b() + c())) / ((this.d * 0.42857146f) + 1.0f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(gl.L(16.0f), 1073741824);
        TextView textView = this.a;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.b.measure(View.MeasureSpec.makeMeasureSpec(gl.L(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(16.0f), 1073741824));
        lnc lncVar = this.c;
        if (lncVar != null) {
            lncVar.measure(View.MeasureSpec.makeMeasureSpec(gl.L(40.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(40.0f), 1073741824));
        }
        setMeasuredDimension(View.resolveSize((int) Math.ceil(c() + b() + yjb.z(this.d, 0.42857146f, 1.0f, textView.getMeasuredWidth())), i), View.resolveSize(gl.L(40.0f), i2));
    }
}
