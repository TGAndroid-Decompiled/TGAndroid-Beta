package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Wallet.c;
public final class ot7 extends nx0 {
    public static final int[] z1 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final TL_stars.TL_starGiftUnique l1;
    public final long m1;
    public final jra n1;
    public final String o1;
    public final long p1;
    public final long q1;
    public final EditTextBoldCursor r1;
    public final TextView s1;
    public final p66 t1;
    public final TextView u1;
    public final c51 v1;
    public long w1;
    public int x1;
    public int y1;

    public ot7(int i, long j, jra jraVar, vnb vnbVar, Context context, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(1, vnbVar, context, true);
        this.x1 = 172800;
        this.a = i;
        this.l1 = tL_starGiftUnique;
        this.m1 = j;
        this.n1 = jraVar;
        this.o1 = it7.i(tL_starGiftUnique);
        HashMap hashMap = vs7.a;
        long j2 = tL_starGiftUnique.offer_min_amount;
        this.p1 = j2 <= 0 ? 1000000000L : j2;
        this.q1 = 1000000000000000L;
        this.Q0 = true;
        this.E = true;
        int i2 = aob.a7;
        t0(i2);
        L(i2);
        this.b0 = i2;
        LinearLayout j3 = uh9.j(context, 1);
        TextView textView = new TextView(context);
        textView.setText(ob6.M0(2131749631, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(8388627);
        int i3 = aob.G6;
        yob.X(textView, i3, vnbVar);
        j3.addView(textView, tre.k(22.0f, 0.0f, 22.0f, 4.0f, -1, 52));
        LinearLayout E0 = E0(context, this.J0);
        j3.addView(E0, tre.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(context);
        textView2.setText(ob6.M0(2131749553, null));
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
        this.r1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(hl.L(22.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 20.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
        int i4 = aob.o6;
        editTextBoldCursor.setCursorColor(aob.v0(i4, vnbVar));
        editTextBoldCursor.setHintText("0");
        editTextBoldCursor.setHintColor(aob.v0(aob.H6, vnbVar));
        frameLayout.addView(editTextBoldCursor, tre.d(-1, -1.0f, 119, 50.0f, 0.0f, 120.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.s1 = textView3;
        textView3.setTextSize(1, 17.0f);
        textView3.setGravity(21);
        textView3.setSingleLine(true);
        int i5 = aob.y6;
        yob.X(textView3, i5, vnbVar);
        frameLayout.addView(textView3, tre.d(-2, -1.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        p66 p66Var = new p66(context, vnbVar);
        this.t1 = p66Var;
        p66Var.setTextSize(1, 14.0f);
        p66Var.setLinkTextColor(aob.v0(i4, vnbVar));
        j3.addView(p66Var, tre.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        LinearLayout E02 = E0(context, this.J0);
        E02.setOrientation(0);
        E02.setGravity(16);
        j3.addView(E02, tre.k(12.0f, 20.0f, 12.0f, 0.0f, -1, 50));
        TextView textView4 = new TextView(context);
        qd4.u(16.0f, 2131749675, 1, textView4, null);
        yob.X(textView4, i3, vnbVar);
        TextView m = ik8.m(E02, textView4, tre.q(0, -2, 1.0f, 16, 18, 0, 8, 0), context);
        this.u1 = m;
        m.setTextSize(1, 16.0f);
        m.setGravity(16);
        m.setCompoundDrawablePadding(hl.L(4.0f));
        yob.X(m, i4, vnbVar);
        E02.addView(m, tre.t(-2, -1, 16, 0, 0, 14, 0));
        E02.setOnClickListener(new kt7(this, (byte) 0));
        TextView textView5 = new TextView(context);
        qd4.u(14.0f, 2131749562, 1, textView5, null);
        yob.X(textView5, i5, vnbVar);
        j3.addView(textView5, tre.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        c51 i6 = xnb.i(24, vnbVar, context, true);
        this.v1 = i6;
        i6.setOnClickListener(new kt7(this, (byte) 1));
        j3.addView(i6, tre.k(12.0f, 22.0f, 12.0f, 12.0f, -1, 48));
        this.O = j3;
        ie0 ie0Var = new ie0(context, i, pj.b, vnbVar);
        ie0Var.a();
        iye.a(ie0Var);
        ie0Var.setOnClickListener(new y00((byte) 10));
        this.c.addView(ie0Var, tre.d(-2, -2.0f, 49, 0.0f, (hl.m / hl.p) + 8.0f, 0.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new nt7(this));
        G0(172800);
        F0(0L);
    }

    public static LinearLayout E0(Context context, vnb vnbVar) {
        LinearLayout j = uh9.j(context, 1);
        int L = hl.L(16.0f);
        int i = aob.d6;
        ShapeDrawable b0 = aob.b0(L, aob.v0(i, vnbVar));
        uob M = yob.M(i);
        j.setBackground(b0);
        yob.j(j, b0, M, null, vnbVar);
        return j;
    }

    public final void F0(long j) {
        int i;
        int i2;
        int i3;
        this.w1 = j;
        boolean z = false;
        this.y1 = 0;
        int i4 = (j > this.q1 ? 1 : (j == this.q1 ? 0 : -1));
        if (i4 > 0) {
            this.y1 = 2;
            i = 2;
        } else {
            i = 0;
        }
        int i5 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i5 > 0 && j < this.p1) {
            this.y1 = i | 1;
        }
        if (i5 > 0 && i4 <= 0 && c.C(this.a).z() < j) {
            this.y1 |= 4;
        }
        EditTextBoldCursor editTextBoldCursor = this.r1;
        if (this.y1 == 0) {
            i2 = aob.G6;
        } else {
            i2 = aob.q7;
        }
        yob.X(editTextBoldCursor, i2, this.J0);
        TextView textView = this.s1;
        di0.h();
        textView.setText(di0.f("USD", 2, (long) ((j / 1.0E9d) * uc7.s1(this.a).l4.k.i * 100.0d), false));
        pj pjVar = pj.b;
        String str = this.o1;
        p66 p66Var = this.t1;
        p66Var.setOnClickListener(null);
        int i6 = this.y1;
        float f = 1.0f;
        if ((i6 & 2) != 0) {
            p66Var.setText(hl.S2(ob6.a0(null, null, 2131749556, oj.j(this.q1, pjVar).o(2).d(), str)));
        } else if ((i6 & 1) != 0) {
            p66Var.setText(hl.S2(ob6.a0(null, null, 2131749554, oj.j(this.p1, pjVar).p().d(), str)));
        } else if ((i6 & 4) != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hl.E2(ob6.M0(2131749550, null), true, hl.L(2.6666667f), hl.L(1.0f)));
            int indexOf = spannableStringBuilder.toString().indexOf(46) + 1;
            if (indexOf > 0 && indexOf < spannableStringBuilder.length()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(aob.v0(aob.o6, this.J0)), indexOf, spannableStringBuilder.length(), 33);
            }
            p66Var.setText(spannableStringBuilder);
            p66Var.setOnClickListener(new kt7(this, (byte) 2));
        } else {
            p66Var.setText(hl.S2(ob6.a0(null, null, 2131749555, str)));
        }
        if (this.y1 == 0) {
            i3 = aob.y6;
        } else {
            i3 = aob.q7;
        }
        yob.X(p66Var, i3, this.J0);
        this.v1.i(ob6.a0(null, null, 2131749570, oj.j(j, pjVar).b()), true, true);
        if (i5 > 0 && this.y1 == 0) {
            z = true;
        }
        this.v1.setEnabled(z);
        this.v1.setClickable(z);
        ViewPropertyAnimator animate = this.v1.animate();
        if (!z) {
            f = 0.6f;
        }
        ik8.s(animate, f, 180L);
    }

    public final void G0(int i) {
        this.x1 = i;
        String G = ob6.G(i / 3600, "GiftOfferHours", new Object[0]);
        TextView textView = this.u1;
        textView.setText(G);
        Drawable mutate = getContext().getResources().getDrawable(2131230873).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(aob.v0(aob.o6, this.J0), PorterDuff.Mode.SRC_IN));
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
    }

    @Override
    public final void show() {
        super.show();
        hl.d3(new lt7(this, (byte) 0), 50L);
    }
}
