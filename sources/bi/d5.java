package bi;

import android.content.Context;
import android.text.InputFilter;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import c8.ra;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class d5 extends org.telegram.ui.ActionBar.w2 {
    public final long f3546m1;
    public final long n1;
    public final EditTextBoldCursor f3547o1;
    public final TextView f3548p1;
    public final TextView f3549q1;
    public final hi.e f3550r1;
    public final TextView f3551s1;
    public long f3552t1;
    public int f3553u1;
    public boolean f3554v1;
    public long f3555w1;
    public boolean f3556x1;
    public boolean f3557y1;

    public d5(int i7, Context context, y10 y10Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(1, context, h6Var, true);
        this.f30173a = i7;
        org.telegram.messenger.p0 p0Var = np.u1(i7).A7;
        this.f3546m1 = Math.max(((org.telegram.messenger.l0) p0Var.f26242r.f14030b).f25176c, 10000000L);
        long j3 = ((org.telegram.messenger.l0) p0Var.f26244s.f14030b).f25176c;
        this.n1 = j3;
        this.Q0 = true;
        this.E = true;
        int i10 = org.telegram.ui.ActionBar.m6.f29324a7;
        w0(i10);
        Q(i10);
        this.f30177b0 = i10;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        TextView textView = new TextView(context);
        this.f3551s1 = textView;
        textView.setText(hd.N0(2131749515, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(8388627);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
        g10.addView(textView, ma.k(22.0f, 0.0f, 22.0f, 4.0f, -1, 52));
        LinearLayout J0 = c5.J0(context, h6Var);
        g10.addView(J0, ma.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(context);
        textView2.setText(hd.N0(2131749521, null));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.L6, h6Var);
        J0.addView(textView2, ma.k(18.0f, 15.0f, 18.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        J0.addView(frameLayout, ma.k(0.0f, 2.0f, 0.0f, 4.0f, -1, 52));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231958);
        frameLayout.addView(imageView, ma.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f3547o1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(22.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 20.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(j3 / 1000000000).length() + 3)});
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29581o6, h6Var));
        editTextBoldCursor.setHintText("0");
        editTextBoldCursor.setHintColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.H6, h6Var));
        frameLayout.addView(editTextBoldCursor, ma.d(-1, -1.0f, 119, 50.0f, 0.0f, 120.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f3548p1 = textView3;
        textView3.setTextSize(1, 17.0f);
        textView3.setGravity(21);
        textView3.setSingleLine(true);
        org.telegram.ui.ActionBar.t6.U(textView3, org.telegram.ui.ActionBar.m6.f29773y6, h6Var);
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView3, ma.d(-2, -1.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f), context);
        this.f3549q1 = m10;
        m10.setTextSize(1, 14.0f);
        g10.addView(m10, ma.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        hi.e g11 = o10.g(24, context, h6Var, true);
        this.f3550r1 = g11;
        g11.setOnClickListener(new ai.y2(4, this, y10Var));
        g10.addView(g11, ma.k(12.0f, 22.0f, 12.0f, 12.0f, -1, 48));
        this.O = g10;
        di.b bVar = new di.b(context, i7, cg.b.f5306b, h6Var);
        bVar.a();
        ra.a(bVar);
        bVar.setOnClickListener(new o(4));
        this.f30179c.addView(bVar, ma.d(-2, -2.0f, 49, 0.0f, (org.telegram.messenger.g0.f24040m / org.telegram.messenger.g0.f24045p) + 8.0f, 0.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new ah.j(this, 2));
        J0(0L);
    }

    public final void J0(long j3) {
        int i7;
        int i10;
        int i11;
        int i12;
        float f10;
        this.f3552t1 = j3;
        boolean z10 = false;
        this.f3553u1 = 0;
        long j10 = this.n1;
        if (j3 > j10) {
            this.f3553u1 = 2;
        }
        int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        long j11 = this.f3546m1;
        if (i13 > 0 && j3 < j11) {
            this.f3553u1 |= 1;
        }
        if (this.f3553u1 == 0) {
            i7 = org.telegram.ui.ActionBar.m6.G6;
        } else {
            i7 = org.telegram.ui.ActionBar.m6.f29622q7;
        }
        org.telegram.ui.ActionBar.t6.U(this.f3547o1, i7, this.J0);
        double d = (j3 / 1.0E9d) * ((org.telegram.messenger.i0) np.u1(this.f30173a).A7.f26231l.f15708b).f24565a;
        org.telegram.messenger.r1.i().getClass();
        this.f3548p1.setText(org.telegram.messenger.r1.g("USD", 2, (long) (d * 100.0d), false));
        int i14 = this.f3553u1;
        int i15 = i14 & 2;
        cg.b bVar = cg.b.f5306b;
        TextView textView = this.f3549q1;
        if (i15 != 0) {
            org.telegram.messenger.f3.q(null, null, 2131749520, new Object[]{cg.a.j(j10, bVar).d()}, textView);
        } else if ((i14 & 1) != 0) {
            org.telegram.messenger.f3.q(null, null, 2131749519, new Object[]{cg.a.j(j11, bVar).d()}, textView);
        } else {
            if (!this.f3554v1 && !this.f3557y1) {
                i10 = 2131749526;
            } else {
                i10 = 2131749525;
            }
            textView.setText(hd.N0(i10, null));
        }
        if (this.f3553u1 == 0) {
            i11 = org.telegram.ui.ActionBar.m6.f29773y6;
        } else {
            i11 = org.telegram.ui.ActionBar.m6.f29622q7;
        }
        org.telegram.ui.ActionBar.t6.U(textView, i11, this.J0);
        if (this.f3554v1) {
            i12 = 2131749652;
        } else {
            i12 = 2131749522;
        }
        String a02 = hd.a0(null, null, i12, cg.a.j(j3, bVar).b());
        hi.e eVar = this.f3550r1;
        eVar.i(a02, true, true);
        if (i13 > 0 && this.f3553u1 == 0 && (!this.f3554v1 || j3 != this.f3555w1)) {
            z10 = true;
        }
        eVar.setEnabled(z10);
        eVar.setClickable(z10);
        ViewPropertyAnimator animate = eVar.animate();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        o10.n(animate, f10, 180L);
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.h3(new a3.f(this, 26), 50L);
    }
}
