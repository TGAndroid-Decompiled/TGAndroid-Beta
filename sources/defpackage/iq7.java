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
public final class iq7 extends fx0 {
    public static final int[] z1 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final TL_stars.TL_starGiftUnique l1;
    public final long m1;
    public final nna n1;
    public final String o1;
    public final long p1;
    public final long q1;
    public final EditTextBoldCursor r1;
    public final TextView s1;
    public final l46 t1;
    public final TextView u1;
    public final u41 v1;
    public long w1;
    public int x1;
    public int y1;

    public iq7(int i, long j, nna nnaVar, wjb wjbVar, Context context, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(1, wjbVar, context, true);
        this.x1 = 172800;
        this.a = i;
        this.l1 = tL_starGiftUnique;
        this.m1 = j;
        this.n1 = nnaVar;
        this.o1 = cq7.h(tL_starGiftUnique);
        HashMap hashMap = vp7.a;
        long j2 = tL_starGiftUnique.offer_min_amount;
        this.p1 = j2 <= 0 ? 1000000000L : j2;
        this.q1 = 1000000000000000L;
        this.Q0 = true;
        this.E = true;
        int i2 = bkb.Z6;
        t0(i2);
        M(i2);
        this.b0 = i2;
        LinearLayout j3 = de9.j(context, 1);
        TextView textView = new TextView(context);
        textView.setText(k96.M0(2131749669, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        textView.setGravity(8388627);
        int i3 = bkb.F6;
        zkb.X(textView, i3, wjbVar);
        j3.addView(textView, nme.k(22.0f, 0.0f, 22.0f, 4.0f, -1, 52));
        LinearLayout D0 = D0(context, this.J0);
        j3.addView(D0, nme.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(context);
        textView2.setText(k96.M0(2131749592, null));
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
        this.r1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(gl.L(22.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 20.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
        int i4 = bkb.n6;
        editTextBoldCursor.setCursorColor(bkb.v0(i4, wjbVar));
        editTextBoldCursor.setHintText("0");
        editTextBoldCursor.setHintColor(bkb.v0(bkb.G6, wjbVar));
        frameLayout.addView(editTextBoldCursor, nme.d(-1, -1.0f, 119, 50.0f, 0.0f, 120.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.s1 = textView3;
        textView3.setTextSize(1, 17.0f);
        textView3.setGravity(21);
        textView3.setSingleLine(true);
        int i5 = bkb.x6;
        zkb.X(textView3, i5, wjbVar);
        frameLayout.addView(textView3, nme.d(-2, -1.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        l46 l46Var = new l46(context, wjbVar);
        this.t1 = l46Var;
        l46Var.setTextSize(1, 14.0f);
        l46Var.setLinkTextColor(bkb.v0(i4, wjbVar));
        j3.addView(l46Var, nme.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        LinearLayout D02 = D0(context, this.J0);
        D02.setOrientation(0);
        D02.setGravity(16);
        j3.addView(D02, nme.k(12.0f, 20.0f, 12.0f, 0.0f, -1, 50));
        TextView textView4 = new TextView(context);
        tb4.u(16.0f, 2131749713, 1, textView4, null);
        zkb.X(textView4, i3, wjbVar);
        TextView m = ug8.m(D02, textView4, nme.q(0, -2, 1.0f, 16, 18, 0, 8, 0), context);
        this.u1 = m;
        m.setTextSize(1, 16.0f);
        m.setGravity(16);
        m.setCompoundDrawablePadding(gl.L(4.0f));
        zkb.X(m, i4, wjbVar);
        D02.addView(m, nme.t(-2, -1, 16, 0, 0, 14, 0));
        D02.setOnClickListener(new eq7(this, (byte) 0));
        TextView textView5 = new TextView(context);
        tb4.u(14.0f, 2131749601, 1, textView5, null);
        zkb.X(textView5, i5, wjbVar);
        j3.addView(textView5, nme.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        u41 i6 = yjb.i(24, wjbVar, context, true);
        this.v1 = i6;
        i6.setOnClickListener(new eq7(this, (byte) 1));
        j3.addView(i6, nme.k(12.0f, 22.0f, 12.0f, 12.0f, -1, 48));
        this.O = j3;
        ge0 ge0Var = new ge0(context, i, oj.b, wjbVar);
        ge0Var.a();
        ote.a(ge0Var);
        ge0Var.setOnClickListener(new x00((byte) 10));
        this.c.addView(ge0Var, nme.d(-2, -2.0f, 49, 0.0f, (gl.m / gl.p) + 8.0f, 0.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new hq7(this));
        F0(172800);
        E0(0L);
    }

    public static LinearLayout D0(Context context, wjb wjbVar) {
        LinearLayout j = de9.j(context, 1);
        int L = gl.L(16.0f);
        int i = bkb.c6;
        ShapeDrawable b0 = bkb.b0(L, bkb.v0(i, wjbVar));
        vkb M = zkb.M(i);
        j.setBackground(b0);
        zkb.j(j, b0, M, null, wjbVar);
        return j;
    }

    public final void E0(long j) {
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
            i2 = bkb.F6;
        } else {
            i2 = bkb.p7;
        }
        zkb.X(editTextBoldCursor, i2, this.J0);
        TextView textView = this.s1;
        ci0.h();
        textView.setText(ci0.f("USD", 2, (long) ((j / 1.0E9d) * na7.q1(this.a).k4.k.i * 100.0d), false));
        oj ojVar = oj.b;
        String str = this.o1;
        l46 l46Var = this.t1;
        l46Var.setOnClickListener(null);
        int i6 = this.y1;
        float f = 1.0f;
        if ((i6 & 2) != 0) {
            l46Var.setText(gl.T2(k96.a0(null, null, 2131749595, nj.j(this.q1, ojVar).o(2).d(), str)));
        } else if ((i6 & 1) != 0) {
            l46Var.setText(gl.T2(k96.a0(null, null, 2131749593, nj.j(this.p1, ojVar).p().d(), str)));
        } else if ((i6 & 4) != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gl.F2(k96.M0(2131749589, null), true, gl.L(2.6666667f), gl.L(1.0f)));
            int indexOf = spannableStringBuilder.toString().indexOf(46) + 1;
            if (indexOf > 0 && indexOf < spannableStringBuilder.length()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(bkb.v0(bkb.n6, this.J0)), indexOf, spannableStringBuilder.length(), 33);
            }
            l46Var.setText(spannableStringBuilder);
            l46Var.setOnClickListener(new eq7(this, (byte) 2));
        } else {
            l46Var.setText(gl.T2(k96.a0(null, null, 2131749594, str)));
        }
        if (this.y1 == 0) {
            i3 = bkb.x6;
        } else {
            i3 = bkb.p7;
        }
        zkb.X(l46Var, i3, this.J0);
        this.v1.i(k96.a0(null, null, 2131749609, nj.j(j, ojVar).b()), true, true);
        if (i5 > 0 && this.y1 == 0) {
            z = true;
        }
        this.v1.setEnabled(z);
        this.v1.setClickable(z);
        ViewPropertyAnimator animate = this.v1.animate();
        if (!z) {
            f = 0.6f;
        }
        ug8.s(animate, f, 180L);
    }

    public final void F0(int i) {
        this.x1 = i;
        String G = k96.G(i / 3600, "GiftOfferHours", new Object[0]);
        TextView textView = this.u1;
        textView.setText(G);
        Drawable mutate = getContext().getResources().getDrawable(2131230873).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.n6, this.J0), PorterDuff.Mode.SRC_IN));
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
    }

    @Override
    public final void show() {
        super.show();
        gl.e3(new fq7(this, (byte) 0), 50L);
    }
}
