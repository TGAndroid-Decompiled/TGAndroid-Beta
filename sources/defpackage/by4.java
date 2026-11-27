package defpackage;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.e;
public abstract class by4 extends nx0 {
    public static final int l1 = 0;

    public by4(Activity activity, e eVar) {
        super(activity, true);
        int i;
        int i2 = 0;
        this.w0 = false;
        this.v0 = false;
        LinearLayout m = bs2.m(activity, 1);
        this.O = m;
        ?? imageView = new ImageView(activity);
        imageView.setAutoRepeat(true);
        imageView.f(2131624318, 120, 120, null);
        imageView.d();
        m.addView((View) imageView, tre.t(160, 160, 49, 17, 30, 17, 0));
        TextView textView = new TextView(activity);
        ik8.v(textView, 1, 24.0f);
        ik8.x(textView, aob.j5, null, null, 2131749325);
        m.addView(textView, tre.t(-2, -2, 49, 17, 18, 17, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        m.addView(linearLayout, tre.t(-2, -2, 1, 0, 12, 0, 0));
        int i3 = 0;
        while (true) {
            if (i3 < 3) {
                LinearLayout m2 = bs2.m(activity, i2);
                if (ob6.a0) {
                    i = 5;
                } else {
                    i = 3;
                }
                linearLayout.addView(m2, tre.t(-2, -2, i, 0, 8, 0, 0));
                ImageView imageView2 = new ImageView(activity);
                int i4 = aob.r5;
                yob.s(imageView2, i4, null, PorterDuff.Mode.MULTIPLY);
                imageView2.setImageResource(2131231627);
                TextView textView2 = new TextView(activity);
                int i5 = i2;
                textView2.setTextSize(1, 15.0f);
                yob.X(textView2, i4, null);
                textView2.setGravity((ob6.a0 ? 5 : 3) | 16);
                textView2.setMaxWidth(hl.L(260.0f));
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            textView2.setText(ob6.M0(2131749327, null));
                        }
                    } else {
                        textView2.setText(ob6.M0(2131749328, null));
                    }
                } else {
                    textView2.setText(ob6.M0(2131749329, null));
                }
                if (ob6.a0) {
                    m2.addView(textView2, tre.o(-2, -2));
                    m2.addView(imageView2, tre.k(8.0f, 7.0f, 0.0f, 0.0f, -2, -2));
                } else {
                    m2.addView(imageView2, tre.k(0.0f, 8.0f, 8.0f, 0.0f, -2, -2));
                    m2.addView(textView2, tre.o(-2, -2));
                }
                i3++;
                i2 = i5;
            } else {
                int i6 = i2;
                ?? frameLayout = new FrameLayout(activity);
                View view = new View(activity);
                frameLayout.a = view;
                int i7 = aob.Fi;
                float[] fArr = new float[1];
                fArr[i6] = 4.0f;
                view.setBackground(rnb.f(i7, fArr));
                frameLayout.addView(view, tre.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
                TextView textView3 = new TextView(activity);
                frameLayout.b = textView3;
                textView3.setLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity(1);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                textView3.setGravity(17);
                qd4.w(textView3, aob.Ji, null, 1, 14.0f);
                frameLayout.addView(textView3, tre.e(-2, -2, 17));
                frameLayout.setBackground(null);
                frameLayout.setText(ob6.M0(2131749326, null));
                view.setOnClickListener(new lw4(this, activity, eVar, (byte) 2));
                m.addView((View) frameLayout, tre.t(-1, 50, 51, 0, 29, 0, 0));
                TextView textView4 = new TextView(activity);
                textView4.setTextSize(1, 14.0f);
                ik8.x(textView4, aob.n5, null, null, 2131749331);
                textView4.setGravity(17);
                m.addView(textView4, tre.t(-2, 48, 49, 17, 0, 17, 16));
                textView4.setOnClickListener(new mh3(this, (byte) 26));
                return;
            }
        }
    }

    public abstract void F0();

    public void E0() {
    }
}
