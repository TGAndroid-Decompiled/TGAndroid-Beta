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
public final class rz8 extends LinearLayout implements vlb {
    public final byte a = 0;
    public final ylb b;
    public final TextView c;
    public final View d;
    public final TextView e;

    public rz8(Activity activity, int i, long j, String str, ylb ylbVar) {
        super(activity);
        String str2;
        setOrientation(1);
        this.b = ylbVar;
        TextView textView = new TextView(activity);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gm.o());
        textView.setTextAlignment(4);
        textView.setLineSpacing(gm.L(1.66f), 1.0f);
        textView.setGravity(17);
        qz8 qz8Var = new qz8(activity, (byte) 0);
        this.d = qz8Var;
        qz8Var.setTextAlignment(4);
        qz8Var.setGravity(17);
        qz8Var.setTextSize(1, 12.0f);
        qz8Var.setLineSpacing(gm.L(2.0f), 1.0f);
        qz8Var.setGravity(1);
        ImageView imageView = new ImageView(activity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        qz8Var.setMaxWidth(gm.L(160.0f));
        int i2 = 22;
        if (i == 9) {
            imageView.setImageResource(2131231611);
            textView.setText(jb6.M0(2131742559, null));
            qz8Var.setText(jb6.M0(2131742560, null));
            qz8Var.setMaxWidth(Math.min(gm.L(160.0f), hg5.a(qz8Var.getText(), qz8Var.getPaint())));
        } else if ("hello".equalsIgnoreCase(str)) {
            imageView.setImageResource(2131231611);
            textView.setText(jb6.M0(2131752718, null));
            qz8Var.setText(jb6.M0(2131752719, null));
            qz8Var.setMaxWidth(Math.min(gm.L(160.0f), hg5.a(qz8Var.getText(), qz8Var.getPaint())));
        } else if ("away".equalsIgnoreCase(str)) {
            imageView.setImageResource(2131231608);
            textView.setText(jb6.M0(2131752786, null));
            qz8Var.setText(jb6.M0(2131752787, null));
            qz8Var.setMaxWidth(Math.min(gm.L(160.0f), hg5.a(qz8Var.getText(), qz8Var.getPaint())));
        } else {
            if (i == 5) {
                imageView.setImageResource(2131231619);
                oz8 c = pz8.f(z8c.t0).c(j);
                if (c == null) {
                    str2 = str;
                } else {
                    str2 = c.b;
                }
                textView.setText(jb6.M0(2131752620, null));
                qz8Var.setMaxWidth(gm.L(208.0f));
                qz8Var.setTextAlignment(2);
                qz8Var.setGravity(3);
                qz8Var.setText(gm.S2(jb6.a0(null, null, 2131752622, str2)));
                qz8Var.setPadding(gm.L(28.0f), 0, 0, 0);
                qz8 qz8Var2 = new qz8(activity, (byte) 0);
                this.e = qz8Var2;
                qz8Var2.setMaxWidth(gm.L(208.0f));
                qz8Var2.setTextAlignment(2);
                qz8Var2.setGravity(3);
                qz8Var2.setTextSize(1, 13.0f);
                qz8Var2.setText(gm.S2(jb6.M0(2131752621, null)));
                qz8Var2.setPadding(gm.L(28.0f), 0, 0, 0);
            }
            i2 = 12;
        }
        int i3 = i2;
        addView(imageView, qoe.t(78, 78, 49, 20, 17, 20, 9));
        addView(textView, qoe.t(-2, -2, 49, 20, 0, 20, 6));
        addView(qz8Var, qoe.t(-2, -2, 49, i3, 0, i3, ((qz8) this.e) == null ? 19 : 9));
        View view = (qz8) this.e;
        if (view != null) {
            addView(view, qoe.t(-2, -2, 49, 12, 0, 12, 19));
        }
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        switch (this.a) {
            case 0:
                return;
            default:
                hashSet.add(Integer.valueOf(cmb.F6));
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), 1073741824));
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
        ylb ylbVar = this.b;
        View view = this.d;
        switch (b) {
            case 0:
                qz8 qz8Var = (qz8) view;
                if (textView2 != null && qz8Var != null) {
                    int i = cmb.Yc;
                    textView2.setTextColor(cmb.v0(i, ylbVar));
                    qz8Var.setTextColor(cmb.v0(i, ylbVar));
                    qz8 qz8Var2 = (qz8) textView;
                    if (qz8Var2 != null) {
                        qz8Var2.setTextColor(cmb.v0(i, ylbVar));
                        return;
                    }
                    return;
                }
                return;
            default:
                int i2 = cmb.F6;
                ((ImageView) view).setColorFilter(new PorterDuffColorFilter(cmb.v0(i2, ylbVar), PorterDuff.Mode.SRC_IN));
                textView2.setTextColor(cmb.v0(i2, ylbVar));
                textView.setTextColor(cmb.p1(0.75f, cmb.v0(i2, ylbVar)));
                return;
        }
    }

    private final void a(HashSet hashSet) {
    }

    public rz8(Context context, ud9 ud9Var, ylb ylbVar) {
        super(context);
        this.b = ylbVar;
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, qoe.t(42, 42, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(5);
        addView(textView, qoe.t(-2, -2, 19, 8, 0, 0, 0));
        addView(new Space(context), qoe.p(0, -2, 1.0f, 119));
        addView(textView2, qoe.t(-2, -2, 21, 8, 0, 0, 0));
        imageView.setImageResource(ud9Var.a);
        textView.setText(ud9Var.b);
        textView2.setText((CharSequence) ud9Var.c.get(0));
        updateColors();
    }
}
