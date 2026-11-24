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
public abstract class wv4 extends fx0 {
    public static final int l1 = 0;

    public wv4(Activity activity, d dVar) {
        super(activity, true);
        int i;
        this.w0 = false;
        this.v0 = false;
        LinearLayout m = ir2.m(activity, 1);
        this.O = m;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(true);
        imageView.f(2131624318, 120, 120, null);
        imageView.d();
        m.addView((View) imageView, nme.t(160, 160, 49, 17, 30, 17, 0));
        TextView textView = new TextView(activity);
        ug8.v(textView, 1, 24.0f);
        ug8.x(textView, bkb.i5, null, null, 2131749379);
        m.addView(textView, nme.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        m.addView(linearLayout, nme.t(-2, -2, 1, 0, 12, 0, 0));
        int i2 = 0;
        while (true) {
            if (i2 < 3) {
                LinearLayout m2 = ir2.m(activity, 0);
                if (k96.a0) {
                    i = 5;
                } else {
                    i = 3;
                }
                linearLayout.addView(m2, nme.t(-2, -2, i, 0, 8, 0, 0));
                ImageView imageView2 = new ImageView(activity);
                int i3 = bkb.q5;
                zkb.s(imageView2, i3, null, PorterDuff.Mode.MULTIPLY);
                imageView2.setImageResource(2131231627);
                TextView textView2 = new TextView(activity);
                textView2.setTextSize(1, 15.0f);
                zkb.X(textView2, i3, null);
                textView2.setGravity((k96.a0 ? 5 : 3) | 16);
                textView2.setMaxWidth(gl.L(260.0f));
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            textView2.setText(k96.M0(2131749381, null));
                        }
                    } else {
                        textView2.setText(k96.M0(2131749382, null));
                    }
                } else {
                    textView2.setText(k96.M0(2131749383, null));
                }
                if (k96.a0) {
                    m2.addView(textView2, nme.o(-2, -2));
                    m2.addView(imageView2, nme.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    m2.addView(imageView2, nme.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                    m2.addView(textView2, nme.o(-2, -2));
                }
                i2++;
            } else {
                ?? frameLayout = new FrameLayout(activity);
                View view = new View(activity);
                frameLayout.a = view;
                view.setBackground(sjb.f(bkb.Ei, 4.0f));
                frameLayout.addView(view, nme.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                TextView textView3 = new TextView(activity);
                frameLayout.b = textView3;
                textView3.setLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity(1);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                textView3.setGravity(17);
                tb4.w(textView3, bkb.Ii, null, 1, 14.0f);
                frameLayout.addView(textView3, nme.e(-2, -2, 17));
                frameLayout.setBackground(null);
                frameLayout.setText(k96.M0(2131749380, null));
                view.setOnClickListener(new hu4(this, activity, dVar, (byte) 1));
                m.addView((View) frameLayout, nme.t(-1, 50, 51, 0, 29, 0, 0));
                TextView textView4 = new TextView(activity);
                textView4.setTextSize(1, 14.0f);
                ug8.x(textView4, bkb.m5, null, null, 2131749385);
                textView4.setGravity(17);
                m.addView(textView4, nme.t(-2, 48, 49, 17, 0, 17, 16));
                textView4.setOnClickListener(new yj3(this, (byte) 25));
                return;
            }
        }
    }

    public abstract void E0();

    public void D0() {
    }
}
