package bi;

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
import c8.ma;
import c8.ra;
import java.util.HashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.k80;
public final class a5 extends org.telegram.ui.ActionBar.x2 {
    public static final int[] A1 = {21600, 43200, 86400, 129600, 172800, 259200};
    public final TL_stars.TL_starGiftUnique f3402m1;
    public final long n1;
    public final di.k1 f3403o1;
    public final String f3404p1;
    public final long f3405q1;
    public final long f3406r1;
    public final EditTextBoldCursor f3407s1;
    public final TextView f3408t1;
    public final k80 f3409u1;
    public final TextView f3410v1;
    public final hi.d f3411w1;
    public long f3412x1;
    public int f3413y1;
    public int f3414z1;

    public a5(int i7, long j3, Context context, di.k1 k1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, org.telegram.ui.ActionBar.i6 i6Var) {
        super(1, context, i6Var, true);
        this.f3413y1 = 172800;
        this.f30189a = i7;
        this.f3402m1 = tL_starGiftUnique;
        this.n1 = j3;
        this.f3403o1 = k1Var;
        this.f3404p1 = v4.h(tL_starGiftUnique);
        HashMap hashMap = f4.f3607a;
        long j10 = tL_starGiftUnique.offer_min_amount;
        this.f3405q1 = j10 <= 0 ? 1000000000L : j10;
        this.f3406r1 = 1000000000000000L;
        this.Q0 = true;
        this.E = true;
        int i10 = org.telegram.ui.ActionBar.n6.f29339a7;
        w0(i10);
        Q(i10);
        this.f30193b0 = i10;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        TextView textView = new TextView(context);
        textView.setText(gd.M0(2131749669, null));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(8388627);
        int i11 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(textView, i11, i6Var);
        g10.addView(textView, ma.k(22.0f, 0.0f, 22.0f, 4.0f, -1, 52));
        LinearLayout J0 = J0(context, this.J0);
        g10.addView(J0, ma.k(12.0f, 0.0f, 12.0f, 0.0f, -1, -2));
        TextView textView2 = new TextView(context);
        textView2.setText(gd.M0(2131749592, null));
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.L6, i6Var);
        J0.addView(textView2, ma.k(18.0f, 15.0f, 18.0f, 0.0f, -1, -2));
        FrameLayout frameLayout = new FrameLayout(context);
        J0.addView(frameLayout, ma.k(0.0f, 2.0f, 0.0f, 4.0f, -1, 52));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231958);
        frameLayout.addView(imageView, ma.d(22, 22.0f, 19, 18.0f, 0.0f, 0.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f3407s1 = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(org.telegram.messenger.g0.L(22.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435462);
        editTextBoldCursor.setTextSize(1, 20.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setInputType(8194);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(Long.toString(1000000L).length() + 3)});
        int i12 = org.telegram.ui.ActionBar.n6.f29596o6;
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.n6.w0(i12, i6Var));
        editTextBoldCursor.setHintText("0");
        editTextBoldCursor.setHintColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.H6, i6Var));
        frameLayout.addView(editTextBoldCursor, ma.d(-1, -1.0f, 119, 50.0f, 0.0f, 120.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.f3408t1 = textView3;
        textView3.setTextSize(1, 17.0f);
        textView3.setGravity(21);
        textView3.setSingleLine(true);
        int i13 = org.telegram.ui.ActionBar.n6.f29788y6;
        org.telegram.ui.ActionBar.u6.U(textView3, i13, i6Var);
        frameLayout.addView(textView3, ma.d(-2, -1.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        k80 k80Var = new k80(context, i6Var);
        this.f3409u1 = k80Var;
        k80Var.setTextSize(1, 14.0f);
        k80Var.setLinkTextColor(org.telegram.ui.ActionBar.n6.w0(i12, i6Var));
        g10.addView(k80Var, ma.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        LinearLayout J02 = J0(context, this.J0);
        J02.setOrientation(0);
        J02.setGravity(16);
        g10.addView(J02, ma.k(12.0f, 20.0f, 12.0f, 0.0f, -1, 50));
        TextView textView4 = new TextView(context);
        n10.l(16.0f, 2131749713, 1, textView4, null);
        org.telegram.ui.ActionBar.u6.U(textView4, i11, i6Var);
        TextView f10 = n10.f(J02, textView4, ma.q(0, -2, 1.0f, 16, 18, 0, 8, 0), context);
        this.f3410v1 = f10;
        f10.setTextSize(1, 16.0f);
        f10.setGravity(16);
        f10.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        org.telegram.ui.ActionBar.u6.U(f10, i12, i6Var);
        J02.addView(f10, ma.t(-2, -1, 16, 0, 0, 14, 0));
        J02.setOnClickListener(new w4(this, 0));
        TextView textView5 = new TextView(context);
        n10.l(14.0f, 2131749601, 1, textView5, null);
        org.telegram.ui.ActionBar.u6.U(textView5, i13, i6Var);
        g10.addView(textView5, ma.k(24.0f, 9.0f, 24.0f, 0.0f, -1, -2));
        hi.d g11 = n10.g(24, context, i6Var, true);
        this.f3411w1 = g11;
        g11.setOnClickListener(new w4(this, 1));
        g10.addView(g11, ma.k(12.0f, 22.0f, 12.0f, 12.0f, -1, 48));
        this.O = g10;
        di.b bVar = new di.b(context, i7, cg.b.f5277b, i6Var);
        bVar.a();
        ra.a(bVar);
        bVar.setOnClickListener(new o(3));
        this.f30195c.addView(bVar, ma.d(-2, -2.0f, 49, 0.0f, (org.telegram.messenger.g0.f24115m / org.telegram.messenger.g0.f24120p) + 8.0f, 0.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new z4(this));
        L0(172800);
        K0(0L);
    }

    public static LinearLayout J0(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        int L = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.n6.f29396d6;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        g10.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(g10, d02, M, null, i6Var);
        return g10;
    }

    public final void K0(long j3) {
        int i7;
        int i10;
        boolean z10;
        float f10;
        this.f3412x1 = j3;
        this.f3414z1 = 0;
        long j10 = this.f3406r1;
        int i11 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        if (i11 > 0) {
            this.f3414z1 = 2;
        }
        int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        long j11 = this.f3405q1;
        if (i12 > 0 && j3 < j11) {
            this.f3414z1 |= 1;
        }
        if (i12 > 0 && i11 <= 0 && org.telegram.ui.Wallet.u0.D(this.f30189a).A() < j3) {
            this.f3414z1 |= 4;
        }
        if (this.f3414z1 == 0) {
            i7 = org.telegram.ui.ActionBar.n6.G6;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.f29637q7;
        }
        org.telegram.ui.ActionBar.u6.U(this.f3407s1, i7, this.J0);
        org.telegram.messenger.r1.i().getClass();
        this.f3408t1.setText(org.telegram.messenger.r1.g("USD", 2, (long) ((j3 / 1.0E9d) * ((org.telegram.messenger.i0) mp.u1(this.f30189a).A7.f26153l.f15645b).f24535a * 100.0d), false));
        k80 k80Var = this.f3409u1;
        k80Var.setOnClickListener(null);
        int i13 = this.f3414z1;
        int i14 = i13 & 2;
        cg.b bVar = cg.b.f5277b;
        String str = this.f3404p1;
        if (i14 != 0) {
            k80Var.setText(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749595, cg.a.j(j10, bVar).o(2).d(), str)));
        } else if ((i13 & 1) != 0) {
            k80Var.setText(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749593, cg.a.j(j11, bVar).p().d(), str)));
        } else if ((i13 & 4) != 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.I2(gd.M0(2131749589, null), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            int indexOf = spannableStringBuilder.toString().indexOf(46) + 1;
            if (indexOf > 0 && indexOf < spannableStringBuilder.length()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29596o6, this.J0)), indexOf, spannableStringBuilder.length(), 33);
            }
            k80Var.setText(spannableStringBuilder);
            k80Var.setOnClickListener(new w4(this, 2));
        } else {
            k80Var.setText(org.telegram.messenger.g0.W2(gd.a0(null, null, 2131749594, str)));
        }
        if (this.f3414z1 == 0) {
            i10 = org.telegram.ui.ActionBar.n6.f29788y6;
        } else {
            i10 = org.telegram.ui.ActionBar.n6.f29637q7;
        }
        org.telegram.ui.ActionBar.u6.U(k80Var, i10, this.J0);
        String a02 = gd.a0(null, null, 2131749609, cg.a.j(j3, bVar).b());
        hi.d dVar = this.f3411w1;
        dVar.i(a02, true, true);
        if (i12 > 0 && this.f3414z1 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        dVar.setEnabled(z10);
        dVar.setClickable(z10);
        ViewPropertyAnimator animate = dVar.animate();
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        n10.n(animate, f10, 180L);
    }

    public final void L0(int i7) {
        this.f3413y1 = i7;
        String G = gd.G(i7 / 3600, "GiftOfferHours", new Object[0]);
        TextView textView = this.f3410v1;
        textView.setText(G);
        Drawable mutate = getContext().getResources().getDrawable(2131230873).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29596o6, this.J0), PorterDuff.Mode.SRC_IN));
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, mutate, (Drawable) null);
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.g0.h3(new x4(this, 0), 50L);
    }
}
