package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import java.util.HashSet;
public final class d19 extends LinearLayout implements snb {
    public final byte a = 0;
    public final vnb b;
    public final TextView c;
    public final View d;
    public final TextView e;

    public d19(Activity activity, int i, long j, String str, vnb vnbVar) {
        super(activity);
        String str2;
        setOrientation(1);
        this.b = vnbVar;
        TextView textView = new TextView(activity);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(hl.o());
        textView.setTextAlignment(4);
        textView.setLineSpacing(hl.L(1.66f), 1.0f);
        textView.setGravity(17);
        c19 c19Var = new c19(activity, (byte) 0);
        this.d = c19Var;
        c19Var.setTextAlignment(4);
        c19Var.setGravity(17);
        c19Var.setTextSize(1, 12.0f);
        c19Var.setLineSpacing(hl.L(2.0f), 1.0f);
        c19Var.setGravity(1);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        c19Var.setMaxWidth(hl.L(160.0f));
        int i2 = 22;
        if (i == 9) {
            imageView.setImageResource(2131231610);
            textView.setText(ob6.M0(2131742527, null));
            c19Var.setText(ob6.M0(2131742528, null));
            c19Var.setMaxWidth(Math.min(hl.L(160.0f), kg5.a(c19Var.getText(), c19Var.getPaint())));
        } else if ("hello".equalsIgnoreCase(str)) {
            imageView.setImageResource(2131231610);
            textView.setText(ob6.M0(2131752746, null));
            c19Var.setText(ob6.M0(2131752747, null));
            c19Var.setMaxWidth(Math.min(hl.L(160.0f), kg5.a(c19Var.getText(), c19Var.getPaint())));
        } else if ("away".equalsIgnoreCase(str)) {
            imageView.setImageResource(2131231607);
            textView.setText(ob6.M0(2131752814, null));
            c19Var.setText(ob6.M0(2131752815, null));
            c19Var.setMaxWidth(Math.min(hl.L(160.0f), kg5.a(c19Var.getText(), c19Var.getPaint())));
        } else {
            if (i == 5) {
                imageView.setImageResource(2131231618);
                a19 c = b19.f(yac.t0).c(j);
                if (c == null) {
                    str2 = str;
                } else {
                    str2 = c.b;
                }
                textView.setText(ob6.M0(2131752648, null));
                c19Var.setMaxWidth(hl.L(208.0f));
                c19Var.setTextAlignment(2);
                c19Var.setGravity(3);
                c19Var.setText(hl.S2(ob6.a0(null, null, 2131752650, str2)));
                c19Var.setPadding(hl.L(28.0f), 0, 0, 0);
                c19 c19Var2 = new c19(activity, (byte) 0);
                this.e = c19Var2;
                c19Var2.setMaxWidth(hl.L(208.0f));
                c19Var2.setTextAlignment(2);
                c19Var2.setGravity(3);
                c19Var2.setTextSize(1, 13.0f);
                c19Var2.setText(hl.S2(ob6.M0(2131752649, null)));
                c19Var2.setPadding(hl.L(28.0f), 0, 0, 0);
            }
            i2 = 12;
        }
        int i3 = i2;
        addView(imageView, tre.t(78, 78, 49, 20, 17, 20, 9));
        addView(textView, tre.t(-2, -2, 49, 20, 0, 20, 6));
        addView(c19Var, tre.t(-2, -2, 49, i3, 0, i3, ((c19) this.e) == null ? 19 : 9));
        View view = (c19) this.e;
        if (view != null) {
            addView(view, tre.t(-2, -2, 49, 12, 0, 12, 19));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        switch (this.a) {
            case 0:
                return;
            default:
                hashSet.add(Integer.valueOf(aob.G6));
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void updateColors() {
        byte b = this.a;
        TextView textView = this.e;
        TextView textView2 = this.c;
        vnb vnbVar = this.b;
        View view = this.d;
        switch (b) {
            case 0:
                c19 c19Var = (c19) view;
                if (textView2 != null && c19Var != null) {
                    int i = aob.Zc;
                    textView2.setTextColor(aob.v0(i, vnbVar));
                    c19Var.setTextColor(aob.v0(i, vnbVar));
                    c19 c19Var2 = (c19) textView;
                    if (c19Var2 != null) {
                        c19Var2.setTextColor(aob.v0(i, vnbVar));
                        return;
                    }
                    return;
                }
                return;
            default:
                int i2 = aob.G6;
                ((ImageView) view).setColorFilter(new PorterDuffColorFilter(aob.v0(i2, vnbVar), PorterDuff.Mode.SRC_IN));
                textView2.setTextColor(aob.v0(i2, vnbVar));
                textView.setTextColor(aob.p1(0.75f, aob.v0(i2, vnbVar)));
                return;
        }
    }

    private final void a(HashSet hashSet) {
    }

    public d19(Context context, kf9 kf9Var, vnb vnbVar) {
        super(context);
        this.b = vnbVar;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, tre.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, tre.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), tre.p(0, -2, 1.0f, 119));
        addView(textView2, tre.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(kf9Var.a);
        textView.setText(kf9Var.b);
        textView2.setText((CharSequence) kf9Var.c.get(0));
        updateColors();
    }
}
