package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ms7 extends my0 {
    public final long l1;
    public final long m1;
    public final EditTextBoldCursor n1;
    public final TextView o1;
    public final TextView p1;
    public final b61 q1;
    public final TextView r1;
    public long s1;
    public int t1;
    public boolean u1;
    public long v1;
    public boolean w1;
    public boolean x1;

    public ms7(int i, ylb ylbVar, qac qacVar, Context context) {
        super(1, ylbVar, context, true);
        this.a = i;
        gs gsVar = oc7.r1(i).l4;
        this.l1 = Math.max(gsVar.q.f(), 10000000L);
        long f = gsVar.r.f();
        this.m1 = f;
        this.Q0 = true;
        this.E = true;
        int i2 = cmb.Z6;
        t0(i2);
        L(i2);
        this.b0 = i2;
        LinearLayout i3 = hg9.i(context, 1);
        TextView textView = new TextView(context);
        this.r1 = textView;
        textView.setText(jb6.M0(2131749465, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(8388627);
        anb.X(textView, cmb.F6, ylbVar);
        i3.addView(textView, qoe.k(22.0f, 0.0f, 22.0f, 4.0f, -1, 52));
        LinearLayout D0 = ls7.D0(context, ylbVar);
        i3.addView(D0, qoe.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(context);
        textView2.setText(jb6.M0(2131749471, null));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(gm.o());
        anb.X(textView2, cmb.K6, ylbVar);
        D0.addView(textView2, qoe.k(18.0f, 15.0f, 18.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        D0.addView(frameLayout, qoe.k(0.0f, 2.0f, 0.0f, 4.0f, -1, 52));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231962);
        frameLayout.addView(imageView, qoe.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.n1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(gm.L(22.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 20.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(f / 1000000000).length() + 3)});
        editTextBoldCursor.setCursorColor(cmb.v0(cmb.n6, ylbVar));
        editTextBoldCursor.setHintText("0");
        editTextBoldCursor.setHintColor(cmb.v0(cmb.G6, ylbVar));
        frameLayout.addView(editTextBoldCursor, qoe.d(-1, -1.0f, 119, 50.0f, 0.0f, 120.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.o1 = textView3;
        textView3.setTextSize(1, 17.0f);
        textView3.setGravity(21);
        textView3.setSingleLine(true);
        anb.X(textView3, cmb.x6, ylbVar);
        TextView l = wi8.l(frameLayout, textView3, qoe.d(-2, -1.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f), context);
        this.p1 = l;
        l.setTextSize(1, 14.0f);
        i3.addView(l, qoe.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        b61 i4 = mlb.i(24, ylbVar, context, true);
        this.q1 = i4;
        i4.setOnClickListener(new n06(this, qacVar, (byte) 11));
        i3.addView(i4, qoe.k(12.0f, 22.0f, 12.0f, 12.0f, -1, 48));
        this.O = i3;
        gf0 gf0Var = new gf0(context, i, ok.b, ylbVar);
        gf0Var.a();
        rve.a(gf0Var);
        gf0Var.setOnClickListener(new x10((byte) 11));
        this.c.addView(gf0Var, qoe.d(-2, -2.0f, 49, 0.0f, (gm.m / gm.p) + 8.0f, 0.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new og6(this, (byte) 4));
        D0(0L);
    }

    public final void D0(long j) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        ok okVar = ok.b;
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
            i2 = cmb.F6;
        } else {
            i2 = cmb.p7;
        }
        anb.X(editTextBoldCursor, i2, this.J0);
        TextView textView = this.o1;
        cj0.h();
        textView.setText(cj0.f("USD", 2, (long) ((j / 1.0E9d) * oc7.r1(this.a).l4.k.i * 100.0d), false));
        int i7 = this.t1;
        int i8 = i7 & 2;
        TextView textView2 = this.p1;
        if (i8 != 0) {
            hg9.q(null, null, 2131749470, new Object[]{nk.j(this.m1, okVar).d()}, textView2);
        } else if ((i7 & 1) != 0) {
            hg9.q(null, null, 2131749469, new Object[]{nk.j(this.l1, okVar).d()}, textView2);
        } else {
            if (!this.u1 && !this.x1) {
                i3 = 2131749476;
            } else {
                i3 = 2131749475;
            }
            textView2.setText(jb6.M0(i3, null));
        }
        TextView textView3 = this.p1;
        if (this.t1 == 0) {
            i4 = cmb.x6;
        } else {
            i4 = cmb.p7;
        }
        anb.X(textView3, i4, this.J0);
        b61 b61Var = this.q1;
        if (this.u1) {
            i5 = 2131749602;
        } else {
            i5 = 2131749472;
        }
        b61Var.i(jb6.a0(null, null, i5, nk.j(j, okVar).b()), true, true);
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
        wi8.s(animate, f, 180L);
    }

    @Override
    public final void show() {
        super.show();
        gm.d3(new kl7(this, (byte) 6), 50L);
    }
}
