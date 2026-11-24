package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class jq7 extends fx0 {
    public final long l1;
    public final long m1;
    public final EditTextBoldCursor n1;
    public final TextView o1;
    public final TextView p1;
    public final u41 q1;
    public final TextView r1;
    public long s1;
    public int t1;
    public boolean u1;
    public long v1;
    public boolean w1;
    public boolean x1;

    public jq7(int i, wjb wjbVar, p8c p8cVar, Context context) {
        super(1, wjbVar, context, true);
        this.a = i;
        gr grVar = na7.q1(i).k4;
        this.l1 = Math.max(grVar.q.f(), 10000000L);
        long f = grVar.r.f();
        this.m1 = f;
        this.Q0 = true;
        this.E = true;
        int i2 = bkb.Z6;
        t0(i2);
        M(i2);
        this.b0 = i2;
        LinearLayout j = de9.j(context, 1);
        TextView textView = new TextView(context);
        this.r1 = textView;
        textView.setText(k96.M0(2131749516, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(8388627);
        zkb.X(textView, bkb.F6, wjbVar);
        j.addView(textView, nme.k(22.0f, 0.0f, 22.0f, 4.0f, -1, 52));
        LinearLayout D0 = iq7.D0(context, wjbVar);
        j.addView(D0, nme.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(context);
        textView2.setText(k96.M0(2131749522, null));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(gl.o());
        zkb.X(textView2, bkb.K6, wjbVar);
        D0.addView(textView2, nme.k(18.0f, 15.0f, 18.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        D0.addView(frameLayout, nme.k(0.0f, 2.0f, 0.0f, 4.0f, -1, 52));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231961);
        frameLayout.addView(imageView, nme.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.n1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(gl.L(22.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 20.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(f / 1000000000).length() + 3)});
        editTextBoldCursor.setCursorColor(bkb.v0(bkb.n6, wjbVar));
        editTextBoldCursor.setHintText("0");
        editTextBoldCursor.setHintColor(bkb.v0(bkb.G6, wjbVar));
        frameLayout.addView(editTextBoldCursor, nme.d(-1, -1.0f, 119, 50.0f, 0.0f, 120.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.o1 = textView3;
        textView3.setTextSize(1, 17.0f);
        textView3.setGravity(21);
        textView3.setSingleLine(true);
        zkb.X(textView3, bkb.x6, wjbVar);
        TextView l = ug8.l(frameLayout, textView3, nme.d(-2, -1.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f), context);
        this.p1 = l;
        l.setTextSize(1, 14.0f);
        j.addView(l, nme.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        u41 i3 = yjb.i(24, wjbVar, context, true);
        this.q1 = i3;
        i3.setOnClickListener(new v16(this, p8cVar, (byte) 10));
        j.addView(i3, nme.k(12.0f, 22.0f, 12.0f, 12.0f, -1, 48));
        this.O = j;
        ge0 ge0Var = new ge0(context, i, oj.b, wjbVar);
        ge0Var.a();
        ote.a(ge0Var);
        ge0Var.setOnClickListener(new x00((byte) 11));
        this.c.addView(ge0Var, nme.d(-2, -2.0f, 49, 0.0f, (gl.m / gl.p) + 8.0f, 0.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new jf6(this, (byte) 3));
        D0(0L);
    }

    public final void D0(long j) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        oj ojVar = oj.b;
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
            i2 = bkb.F6;
        } else {
            i2 = bkb.p7;
        }
        zkb.X(editTextBoldCursor, i2, this.J0);
        TextView textView = this.o1;
        ci0.h();
        textView.setText(ci0.f("USD", 2, (long) ((j / 1.0E9d) * na7.q1(this.a).k4.k.i * 100.0d), false));
        int i7 = this.t1;
        int i8 = i7 & 2;
        TextView textView2 = this.p1;
        if (i8 != 0) {
            de9.r(null, null, 2131749521, new Object[]{nj.j(this.m1, ojVar).d()}, textView2);
        } else if ((i7 & 1) != 0) {
            de9.r(null, null, 2131749520, new Object[]{nj.j(this.l1, ojVar).d()}, textView2);
        } else {
            if (!this.u1 && !this.x1) {
                i3 = 2131749527;
            } else {
                i3 = 2131749526;
            }
            textView2.setText(k96.M0(i3, null));
        }
        TextView textView3 = this.p1;
        if (this.t1 == 0) {
            i4 = bkb.x6;
        } else {
            i4 = bkb.p7;
        }
        zkb.X(textView3, i4, this.J0);
        u41 u41Var = this.q1;
        if (this.u1) {
            i5 = 2131749653;
        } else {
            i5 = 2131749523;
        }
        u41Var.i(k96.a0(null, null, i5, nj.j(j, ojVar).b()), true, true);
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
        ug8.s(animate, f, 180L);
    }

    @Override
    public final void show() {
        super.show();
        gl.d3(new vl6(this, (byte) 29), 50L);
    }
}
