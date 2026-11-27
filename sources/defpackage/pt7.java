package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class pt7 extends nx0 {
    public final long l1;
    public final long m1;
    public final EditTextBoldCursor n1;
    public final TextView o1;
    public final TextView p1;
    public final c51 q1;
    public final TextView r1;
    public long s1;
    public int t1;
    public boolean u1;
    public long v1;
    public boolean w1;
    public boolean x1;

    public pt7(int i, vnb vnbVar, pcc pccVar, Context context) {
        super(1, vnbVar, context, true);
        this.a = i;
        hr hrVar = uc7.s1(i).k4;
        this.l1 = Math.max(hrVar.q.f(), 10000000L);
        long f = hrVar.r.f();
        this.m1 = f;
        this.Q0 = true;
        this.E = true;
        int i2 = aob.a7;
        t0(i2);
        L(i2);
        this.b0 = i2;
        LinearLayout j = uh9.j(context, 1);
        TextView textView = new TextView(context);
        this.r1 = textView;
        textView.setText(ob6.M0(2131749477, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(8388627);
        yob.X(textView, aob.G6, vnbVar);
        j.addView(textView, tre.k(22.0f, 0.0f, 22.0f, 4.0f, -1, 52));
        LinearLayout E0 = ot7.E0(context, vnbVar);
        j.addView(E0, tre.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(context);
        textView2.setText(ob6.M0(2131749483, null));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(hl.o());
        yob.X(textView2, aob.L6, vnbVar);
        E0.addView(textView2, tre.k(18.0f, 15.0f, 18.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        E0.addView(frameLayout, tre.k(0.0f, 2.0f, 0.0f, 4.0f, -1, 52));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231961);
        frameLayout.addView(imageView, tre.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.n1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(hl.L(22.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 20.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(f / 1000000000).length() + 3)});
        editTextBoldCursor.setCursorColor(aob.v0(aob.o6, vnbVar));
        editTextBoldCursor.setHintText("0");
        editTextBoldCursor.setHintColor(aob.v0(aob.H6, vnbVar));
        frameLayout.addView(editTextBoldCursor, tre.d(-1, -1.0f, 119, 50.0f, 0.0f, 120.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.o1 = textView3;
        textView3.setTextSize(1, 17.0f);
        textView3.setGravity(21);
        textView3.setSingleLine(true);
        yob.X(textView3, aob.y6, vnbVar);
        TextView l = ik8.l(frameLayout, textView3, tre.d(-2, -1.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f), context);
        this.p1 = l;
        l.setTextSize(1, 14.0f);
        j.addView(l, tre.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        c51 i3 = xnb.i(24, vnbVar, context, true);
        this.q1 = i3;
        i3.setOnClickListener(new uv5(this, pccVar, (byte) 13));
        j.addView(i3, tre.k(12.0f, 22.0f, 12.0f, 12.0f, -1, 48));
        this.O = j;
        ie0 ie0Var = new ie0(context, i, pj.b, vnbVar);
        ie0Var.a();
        iye.a(ie0Var);
        ie0Var.setOnClickListener(new y00((byte) 11));
        this.c.addView(ie0Var, tre.d(-2, -2.0f, 49, 0.0f, (hl.m / hl.p) + 8.0f, 0.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new nh6(this, (byte) 4));
        E0(0L);
    }

    public final void E0(long j) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        pj pjVar = pj.b;
        this.s1 = j;
        boolean z = false;
        this.t1 = 0;
        if (j > this.m1) {
            this.t1 = 2;
            i = 2;
        } else {
            i = 0;
        }
        int i6 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i6 > 0 && j < this.l1) {
            i |= 1;
            this.t1 = i;
        }
        EditTextBoldCursor editTextBoldCursor = this.n1;
        if (i == 0) {
            i2 = aob.G6;
        } else {
            i2 = aob.q7;
        }
        yob.X(editTextBoldCursor, i2, this.J0);
        TextView textView = this.o1;
        di0.h();
        textView.setText(di0.f("USD", 2, (long) ((j / 1.0E9d) * uc7.s1(this.a).k4.k.i * 100.0d), false));
        int i7 = this.t1;
        int i8 = i7 & 2;
        TextView textView2 = this.p1;
        if (i8 != 0) {
            uh9.r(null, null, 2131749482, new Object[]{oj.j(this.m1, pjVar).d()}, textView2);
        } else if ((i7 & 1) != 0) {
            uh9.r(null, null, 2131749481, new Object[]{oj.j(this.l1, pjVar).d()}, textView2);
        } else {
            if (!this.u1 && !this.x1) {
                i3 = 2131749488;
            } else {
                i3 = 2131749487;
            }
            textView2.setText(ob6.M0(i3, null));
        }
        TextView textView3 = this.p1;
        if (this.t1 == 0) {
            i4 = aob.y6;
        } else {
            i4 = aob.q7;
        }
        yob.X(textView3, i4, this.J0);
        c51 c51Var = this.q1;
        if (this.u1) {
            i5 = 2131749615;
        } else {
            i5 = 2131749484;
        }
        c51Var.i(ob6.a0(null, null, i5, oj.j(j, pjVar).b()), true, true);
        if (i6 > 0 && this.t1 == 0 && (!this.u1 || j != this.v1)) {
            z = true;
        }
        this.q1.setEnabled(z);
        this.q1.setClickable(z);
        ViewPropertyAnimator animate = this.q1.animate();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.6f;
        }
        ik8.s(animate, f, 180L);
    }

    @Override
    public final void show() {
        super.show();
        hl.d3(new fe7(this, (byte) 14), 50L);
    }
}
