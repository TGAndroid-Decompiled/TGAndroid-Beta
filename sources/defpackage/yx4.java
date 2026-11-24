package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;
public abstract class yx4 extends my0 {
    public static final int l1 = 0;

    public yx4(Activity activity, d dVar) {
        super(activity, true);
        int i;
        this.w0 = false;
        this.v0 = false;
        LinearLayout l = td4.l(activity, 1);
        this.O = l;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(true);
        imageView.f(2131624318, 120, 120, null);
        imageView.d();
        l.addView((View) imageView, qoe.t(160, 160, 49, 17, 30, 17, 0));
        TextView textView = new TextView(activity);
        wi8.v(textView, 1, 24.0f);
        wi8.x(textView, cmb.i5, null, null, 2131749328);
        l.addView(textView, qoe.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        l.addView(linearLayout, qoe.t(-2, -2, 1, 0, 12, 0, 0));
        int i2 = 0;
        while (true) {
            if (i2 < 3) {
                LinearLayout l2 = td4.l(activity, 0);
                if (jb6.a0) {
                    i = 5;
                } else {
                    i = 3;
                }
                linearLayout.addView(l2, qoe.t(-2, -2, i, 0, 8, 0, 0));
                ImageView imageView2 = new ImageView(activity);
                int i3 = cmb.q5;
                anb.s(imageView2, i3, null, PorterDuff.Mode.MULTIPLY);
                imageView2.setImageResource(2131231628);
                TextView textView2 = new TextView(activity);
                textView2.setTextSize(1, 15.0f);
                anb.X(textView2, i3, null);
                textView2.setGravity((jb6.a0 ? 5 : 3) | 16);
                textView2.setMaxWidth(gm.L(260.0f));
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            textView2.setText(jb6.M0(2131749330, null));
                        }
                    } else {
                        textView2.setText(jb6.M0(2131749331, null));
                    }
                } else {
                    textView2.setText(jb6.M0(2131749332, null));
                }
                if (jb6.a0) {
                    l2.addView(textView2, qoe.o(-2, -2));
                    l2.addView(imageView2, qoe.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    l2.addView(imageView2, qoe.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                    l2.addView(textView2, qoe.o(-2, -2));
                }
                i2++;
            } else {
                ?? frameLayout = new FrameLayout(activity);
                View view = new View(activity);
                frameLayout.a = view;
                view.setBackground(ulb.f(cmb.Ei, 4.0f));
                frameLayout.addView(view, qoe.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                TextView textView3 = new TextView(activity);
                frameLayout.b = textView3;
                textView3.setLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity(1);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                textView3.setGravity(17);
                td4.x(textView3, cmb.Ii, null, 1, 14.0f);
                frameLayout.addView(textView3, qoe.e(-2, -2, 17));
                frameLayout.setBackground(null);
                frameLayout.setText(jb6.M0(2131749329, null));
                view.setOnClickListener(new jw4(this, activity, dVar, (byte) 1));
                l.addView((View) frameLayout, qoe.t(-1, 50, 51, 0, 29, 0, 0));
                TextView textView4 = new TextView(activity);
                textView4.setTextSize(1, 14.0f);
                wi8.x(textView4, cmb.m5, null, null, 2131749334);
                textView4.setGravity(17);
                l.addView(textView4, qoe.t(-2, 48, 49, 17, 0, 17, 16));
                textView4.setOnClickListener(new sf3(this, (byte) 28));
                return;
            }
        }
    }

    public abstract void E0();

    public void D0() {
    }
}
