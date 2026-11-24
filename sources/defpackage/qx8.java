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
public final class qx8 extends LinearLayout implements tjb {
    public final byte a = 0;
    public final wjb b;
    public final TextView c;
    public final View d;
    public final TextView e;

    public qx8(Activity activity, int i, long j, String str, wjb wjbVar) {
        super(activity);
        String str2;
        setOrientation(1);
        this.b = wjbVar;
        TextView textView = new TextView(activity);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        textView.setTextAlignment(4);
        textView.setLineSpacing(gl.L(1.66f), 1.0f);
        textView.setGravity(17);
        px8 px8Var = new px8(activity, (byte) 0);
        this.d = px8Var;
        px8Var.setTextAlignment(4);
        px8Var.setGravity(17);
        px8Var.setTextSize(1, 12.0f);
        px8Var.setLineSpacing(gl.L(2.0f), 1.0f);
        px8Var.setGravity(1);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        px8Var.setMaxWidth(gl.L(160.0f));
        int i2 = 22;
        if (i == 9) {
            imageView.setImageResource(2131231610);
            textView.setText(k96.M0(2131742633, null));
            px8Var.setText(k96.M0(2131742634, null));
            px8Var.setMaxWidth(Math.min(gl.L(160.0f), je5.a(px8Var.getText(), px8Var.getPaint())));
        } else if ("hello".equalsIgnoreCase(str)) {
            imageView.setImageResource(2131231610);
            textView.setText(k96.M0(2131752753, null));
            px8Var.setText(k96.M0(2131752754, null));
            px8Var.setMaxWidth(Math.min(gl.L(160.0f), je5.a(px8Var.getText(), px8Var.getPaint())));
        } else if ("away".equalsIgnoreCase(str)) {
            imageView.setImageResource(2131231607);
            textView.setText(k96.M0(2131752821, null));
            px8Var.setText(k96.M0(2131752822, null));
            px8Var.setMaxWidth(Math.min(gl.L(160.0f), je5.a(px8Var.getText(), px8Var.getPaint())));
        } else {
            if (i == 5) {
                imageView.setImageResource(2131231618);
                nx8 c = ox8.f(y6c.t0).c(j);
                if (c == null) {
                    str2 = str;
                } else {
                    str2 = c.b;
                }
                textView.setText(k96.M0(2131752655, null));
                px8Var.setMaxWidth(gl.L(208.0f));
                px8Var.setTextAlignment(2);
                px8Var.setGravity(3);
                px8Var.setText(gl.S2(k96.a0(null, null, 2131752657, str2)));
                px8Var.setPadding(gl.L(28.0f), 0, 0, 0);
                px8 px8Var2 = new px8(activity, (byte) 0);
                this.e = px8Var2;
                px8Var2.setMaxWidth(gl.L(208.0f));
                px8Var2.setTextAlignment(2);
                px8Var2.setGravity(3);
                px8Var2.setTextSize(1, 13.0f);
                px8Var2.setText(gl.S2(k96.M0(2131752656, null)));
                px8Var2.setPadding(gl.L(28.0f), 0, 0, 0);
            }
            i2 = 12;
        }
        int i3 = i2;
        addView(imageView, nme.t(78, 78, 49, 20, 17, 20, 9));
        addView(textView, nme.t(-2, -2, 49, 20, 0, 20, 6));
        addView(px8Var, nme.t(-2, -2, 49, i3, 0, i3, ((px8) this.e) == null ? 19 : 9));
        View view = (px8) this.e;
        if (view != null) {
            addView(view, nme.t(-2, -2, 49, 12, 0, 12, 19));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        switch (this.a) {
            case 0:
                return;
            default:
                hashSet.add(Integer.valueOf(bkb.F6));
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), 1073741824));
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
        wjb wjbVar = this.b;
        View view = this.d;
        switch (b) {
            case 0:
                px8 px8Var = (px8) view;
                if (textView2 != null && px8Var != null) {
                    int i = bkb.Yc;
                    textView2.setTextColor(bkb.v0(i, wjbVar));
                    px8Var.setTextColor(bkb.v0(i, wjbVar));
                    px8 px8Var2 = (px8) textView;
                    if (px8Var2 != null) {
                        px8Var2.setTextColor(bkb.v0(i, wjbVar));
                        return;
                    }
                    return;
                }
                return;
            default:
                int i2 = bkb.F6;
                ((ImageView) view).setColorFilter(new PorterDuffColorFilter(bkb.v0(i2, wjbVar), PorterDuff.Mode.SRC_IN));
                textView2.setTextColor(bkb.v0(i2, wjbVar));
                textView.setTextColor(bkb.p1(0.75f, bkb.v0(i2, wjbVar)));
                return;
        }
    }

    private final void a(HashSet hashSet) {
    }

    public qx8(Context context, ub9 ub9Var, wjb wjbVar) {
        super(context);
        this.b = wjbVar;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, nme.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, nme.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), nme.p(0, -2, 1.0f, 119));
        addView(textView2, nme.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(ub9Var.a);
        textView.setText(ub9Var.b);
        textView2.setText((CharSequence) ub9Var.c.get(0));
        updateColors();
    }
}
