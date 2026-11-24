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
public final class ls7 extends my0 {
    public static final int[] z1 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final TL_stars.TL_starGiftUnique l1;
    public final long m1;
    public final npa n1;
    public final String o1;
    public final long p1;
    public final long q1;
    public final EditTextBoldCursor r1;
    public final TextView s1;
    public final l66 t1;
    public final TextView u1;
    public final b61 v1;
    public long w1;
    public int x1;
    public int y1;

    public ls7(int i, long j, npa npaVar, ylb ylbVar, Context context, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        super(1, ylbVar, context, true);
        this.x1 = 172800;
        this.a = i;
        this.l1 = tL_starGiftUnique;
        this.m1 = j;
        this.n1 = npaVar;
        this.o1 = fs7.h(tL_starGiftUnique);
        HashMap hashMap = yr7.a;
        long j2 = tL_starGiftUnique.offer_min_amount;
        this.p1 = j2 <= 0 ? 1000000000L : j2;
        this.q1 = 1000000000000000L;
        this.Q0 = true;
        this.E = true;
        int i2 = cmb.Z6;
        t0(i2);
        L(i2);
        this.b0 = i2;
        LinearLayout i3 = hg9.i(context, 1);
        TextView textView = new TextView(context);
        textView.setText(jb6.M0(2131749618, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(8388627);
        int i4 = cmb.F6;
        anb.X(textView, i4, ylbVar);
        i3.addView(textView, qoe.k(22.0f, 0.0f, 22.0f, 4.0f, -1, 52));
        LinearLayout D0 = D0(context, this.J0);
        i3.addView(D0, qoe.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(context);
        textView2.setText(jb6.M0(2131749541, null));
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
        this.r1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(gm.L(22.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 20.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
        int i5 = cmb.n6;
        editTextBoldCursor.setCursorColor(cmb.v0(i5, ylbVar));
        editTextBoldCursor.setHintText("0");
        editTextBoldCursor.setHintColor(cmb.v0(cmb.G6, ylbVar));
        frameLayout.addView(editTextBoldCursor, qoe.d(-1, -1.0f, 119, 50.0f, 0.0f, 120.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.s1 = textView3;
        textView3.setTextSize(1, 17.0f);
        textView3.setGravity(21);
        textView3.setSingleLine(true);
        int i6 = cmb.x6;
        anb.X(textView3, i6, ylbVar);
        frameLayout.addView(textView3, qoe.d(-2, -1.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        l66 l66Var = new l66(context, ylbVar);
        this.t1 = l66Var;
        l66Var.setTextSize(1, 14.0f);
        l66Var.setLinkTextColor(cmb.v0(i5, ylbVar));
        i3.addView(l66Var, qoe.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        LinearLayout D02 = D0(context, this.J0);
        D02.setOrientation(0);
        D02.setGravity(16);
        i3.addView(D02, qoe.k(12.0f, 20.0f, 12.0f, 0.0f, -1, 50));
        TextView textView4 = new TextView(context);
        td4.v(16.0f, 2131749662, 1, textView4, null);
        anb.X(textView4, i4, ylbVar);
        TextView m = wi8.m(D02, textView4, qoe.q(0, -2, 1.0f, 16, 18, 0, 8, 0), context);
        this.u1 = m;
        m.setTextSize(1, 16.0f);
        m.setGravity(16);
        m.setCompoundDrawablePadding(gm.L(4.0f));
        anb.X(m, i5, ylbVar);
        D02.addView(m, qoe.t(-2, -1, 16, 0, 0, 14, 0));
        D02.setOnClickListener(new hs7(this, (byte) 0));
        TextView textView5 = new TextView(context);
        td4.v(14.0f, 2131749550, 1, textView5, null);
        anb.X(textView5, i6, ylbVar);
        i3.addView(textView5, qoe.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        b61 i7 = mlb.i(24, ylbVar, context, true);
        this.v1 = i7;
        i7.setOnClickListener(new hs7(this, (byte) 1));
        i3.addView(i7, qoe.k(12.0f, 22.0f, 12.0f, 12.0f, -1, 48));
        this.O = i3;
        gf0 gf0Var = new gf0(context, i, ok.b, ylbVar);
        gf0Var.a();
        rve.a(gf0Var);
        gf0Var.setOnClickListener(new x10((byte) 10));
        this.c.addView(gf0Var, qoe.d(-2, -2.0f, 49, 0.0f, (gm.m / gm.p) + 8.0f, 0.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new ks7(this));
        F0(172800);
        E0(0L);
    }

    public static LinearLayout D0(Context context, ylb ylbVar) {
        LinearLayout i = hg9.i(context, 1);
        int L = gm.L(16.0f);
        int i2 = cmb.c6;
        ShapeDrawable b0 = cmb.b0(L, cmb.v0(i2, ylbVar));
        wmb M = anb.M(i2);
        i.setBackground(b0);
        anb.j(i, b0, M, null, ylbVar);
        return i;
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
            i2 = cmb.F6;
        } else {
            i2 = cmb.p7;
        }
        anb.X(editTextBoldCursor, i2, this.J0);
        TextView textView = this.s1;
        cj0.h();
        textView.setText(cj0.f("USD", 2, (long) ((j / 1.0E9d) * oc7.r1(this.a).l4.k.i * 100.0d), false));
        ok okVar = ok.b;
        String str = this.o1;
        l66 l66Var = this.t1;
        l66Var.setOnClickListener(null);
        int i6 = this.y1;
        float f = 1.0f;
        if ((i6 & 2) != 0) {
            l66Var.setText(gm.S2(jb6.a0(null, null, 2131749544, nk.j(this.q1, okVar).o(2).d(), str)));
        } else if ((i6 & 1) != 0) {
            l66Var.setText(gm.S2(jb6.a0(null, null, 2131749542, nk.j(this.p1, okVar).p().d(), str)));
        } else if ((i6 & 4) != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gm.E2(jb6.M0(2131749538, null), true, gm.L(2.6666667f), gm.L(1.0f)));
            int indexOf = spannableStringBuilder.toString().indexOf(46) + 1;
            if (indexOf > 0 && indexOf < spannableStringBuilder.length()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(cmb.v0(cmb.n6, this.J0)), indexOf, spannableStringBuilder.length(), 33);
            }
            l66Var.setText(spannableStringBuilder);
            l66Var.setOnClickListener(new hs7(this, (byte) 2));
        } else {
            l66Var.setText(gm.S2(jb6.a0(null, null, 2131749543, str)));
        }
        if (this.y1 == 0) {
            i3 = cmb.x6;
        } else {
            i3 = cmb.p7;
        }
        anb.X(l66Var, i3, this.J0);
        this.v1.i(jb6.a0(null, null, 2131749558, nk.j(j, okVar).b()), true, true);
        if (i5 > 0 && this.y1 == 0) {
            z = true;
        }
        this.v1.setEnabled(z);
        this.v1.setClickable(z);
        ViewPropertyAnimator animate = this.v1.animate();
        if (!z) {
            f = 0.6f;
        }
        wi8.s(animate, f, 180L);
    }

    public final void F0(int i) {
        this.x1 = i;
        String G = jb6.G(i / 3600, "GiftOfferHours", new Object[0]);
        TextView textView = this.u1;
        textView.setText(G);
        Drawable mutate = getContext().getResources().getDrawable(2131230874).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.n6, this.J0), PorterDuff.Mode.SRC_IN));
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
    }

    @Override
    public final void show() {
        super.show();
        gm.d3(new is7(this, (byte) 0), 50L);
    }
}
