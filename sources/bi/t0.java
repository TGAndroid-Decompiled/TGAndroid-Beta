package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import c8.ra;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.q9;
import org.telegram.messenger.t9;
import org.telegram.messenger.u9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.z41;
import org.telegram.ui.js0;
public final class t0 extends sa implements t9 {
    public static final int f4069c2 = 0;
    public final long T1;
    public final n0 U1;
    public final LinearLayout V1;
    public final o0 W1;
    public final TextView X1;
    public final q0 Y1;
    public q9 Z1;
    public z41 f4070a2;
    public int f4071b2;

    public t0(Context context, org.telegram.ui.ActionBar.i6 i6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable, boolean z10) {
        super(context, null, false, false, 1, i6Var);
        org.telegram.ui.Components.b9 b9Var;
        TLRPC.User user;
        ?? r12;
        Context context2;
        org.telegram.ui.ActionBar.i6 i6Var2;
        k80 k80Var;
        long j10 = starGift.f28634id;
        this.T1 = j10;
        this.F1 = org.telegram.messenger.g0.L(6.0f);
        this.f39541v1 = 0.2f;
        v0(i0.a.f(0.1f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29487i5, this.J0), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, this.J0)));
        O();
        LinearLayout linearLayout = new LinearLayout(context);
        this.V1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        n0 n0Var = new n0(this, context);
        this.U1 = n0Var;
        linearLayout.addView(n0Var);
        hi.d dVar = new hi.d(context, i6Var, true);
        dVar.f();
        FrameLayout.LayoutParams d = ma.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i7 = d.leftMargin;
        int i10 = this.f30227u0;
        d.leftMargin = i7 + i10;
        d.rightMargin += i10;
        this.f30192b.addView(dVar, d);
        ck0 ck0Var = this.f39534o1;
        int i11 = this.f30227u0;
        ck0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(64.0f));
        this.f4070a2.O(false);
        int i12 = z10 ? 220 : 208;
        this.Z1 = u9.c(this.f30189a).l(j10, this);
        o0 o0Var = new o0(this, context, i6Var, new a3.f(this, 19), new o(2), new o(2), new o(2), new o(2), new o(2), new o(2), i12);
        this.W1 = o0Var;
        o0Var.d(new di.e5(1, 1));
        o0Var.setPreviewingAttributes(arrayList);
        o0Var.removeView(o0Var.Q);
        n0Var.addView(o0Var, 0, ma.e(-1, i12, 48));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(45.0f));
        n0Var.addView(q9Var, ma.d(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i13 == 0) {
            TLRPC.User c22 = mp.u1(this.f30189a).c2(Long.valueOf(j10.i(this.f30189a).e()));
            b9Var = new org.telegram.ui.Components.b9(0, c22);
            user = c22;
        } else if (i13 > 0) {
            TLRPC.User c23 = mp.u1(this.f30189a).c2(Long.valueOf(j3));
            b9Var = new org.telegram.ui.Components.b9(0, c23);
            user = c23;
        } else {
            TLRPC.Chat O0 = mp.u1(this.f30189a).O0(Long.valueOf(-j3));
            b9Var = new org.telegram.ui.Components.b9(O0);
            user = O0;
        }
        q9Var.f(user, b9Var);
        TextView textView = new TextView(context);
        this.X1 = textView;
        n10.p(textView, 1, 21.0f);
        textView.setText(org.telegram.messenger.n5.t(i13 != 0 ? j3 : j10.i(this.f30189a).e()));
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setPadding(0, 0, org.telegram.messenger.g0.L(36.0f), 0);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        n0Var.addView(textView, ma.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        textView2.setGravity(17);
        textView2.setTextColor(-1342177281);
        if (z10) {
            textView2.setText(gd.M0(2131749792, null));
            context2 = context;
            r12 = 0;
            i6Var2 = i6Var;
        } else {
            textView2.setText(org.telegram.messenger.g0.I2(gd.M0(2131750333, null), false, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            r12 = 0;
            context2 = context;
            i6Var2 = i6Var;
            textView2.setOnClickListener(new a0(context, i6Var, j3, starGift, arrayList));
            ra.b(textView2, 0.02f, 1.5f);
        }
        n0Var.addView(textView2, ma.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        c3 c3Var = new c3(this.f30189a, context2, i6Var2);
        c3Var.f3493d0 = true;
        org.telegram.ui.ActionBar.i6 i6Var3 = i6Var2;
        c3Var.h(starGift, true, false, false, false, false);
        c3Var.setImageSize(org.telegram.messenger.g0.L(84.0f));
        c3Var.setImageLayer(7);
        c3Var.K.setVisibility(8);
        c3Var.f3494e.g(r12);
        c3Var.setRibbonTextOneOf(this.Z1.d.availability_total);
        linearLayout2.addView(c3Var, ma.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231240);
        imageView.setScaleX(-1.0f);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.f29561m6, i6Var3, PorterDuff.Mode.SRC_IN);
        linearLayout2.addView(imageView, ma.q(24, 24, 0.0f, 16, 12, 0, 12, 0));
        q0 q0Var = new q0(this, context, this.f30189a, i6Var3);
        this.Y1 = q0Var;
        q0Var.d.removeView(q0Var.E);
        q0Var.f3493d0 = true;
        q0Var.h(starGift, true, false, false, false, false);
        q0Var.setImageSize(org.telegram.messenger.g0.L(100.0f));
        q0Var.setImageLayer(7);
        q0Var.K.setVisibility(8);
        q0Var.f3494e.g(r12);
        q0Var.setRibbonTextOneOf(this.Z1.d.availability_total);
        q0Var.setRibbonText(gd.M0(2131750303, r12));
        linearLayout2.addView(q0Var, ma.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(gd.M0(2131749815, r12));
        int i14 = org.telegram.ui.ActionBar.n6.f29788y6;
        org.telegram.ui.ActionBar.u6.U(textView3, i14, i6Var3);
        float i15 = Utilities.i(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(14.0f);
        int i16 = org.telegram.ui.ActionBar.n6.f29396d6;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i16, i6Var3);
        int i17 = org.telegram.ui.ActionBar.n6.G6;
        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, i0.a.f(0.2f, w02, org.telegram.ui.ActionBar.n6.w0(i17, i6Var3)));
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.p6 o4 = org.telegram.ui.ActionBar.u6.o(frameLayout, true);
        o4.d = d02;
        o4.f29874e = r12;
        o4.f29875f = r12;
        org.telegram.ui.ActionBar.o6 o6Var = new org.telegram.ui.ActionBar.o6();
        o4.f29874e = o6Var;
        o6Var.c(i16, i17, 3, 0.2f, i6Var3);
        o6Var.f29837g = org.telegram.ui.ActionBar.u6.t(d02);
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.U(textView4, i17, i6Var3);
        textView4.setText(gd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView4, ma.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        m10.setTextSize(1, 13.0f);
        m10.setGravity(21);
        m10.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.u6.U(m10, i17, i6Var3);
        m10.setText(gd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(m10, ma.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View r0Var = new r0(context, i15);
        int L2 = org.telegram.messenger.g0.L(14.0f);
        int i18 = org.telegram.ui.ActionBar.n6.Fi;
        Drawable d03 = org.telegram.ui.ActionBar.n6.d0(L2, org.telegram.ui.ActionBar.n6.w0(i18, i6Var3));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i18);
        r0Var.setBackground(d03);
        org.telegram.ui.ActionBar.u6.j(r0Var, d03, M, null, i6Var3);
        frameLayout.addView(r0Var, ma.e(-1, -1, 119));
        s0 s0Var = new s0(context, i15);
        s0Var.setWillNotDraw(false);
        frameLayout.addView(s0Var, ma.e(-1, -1, 119));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(org.telegram.messenger.g0.o());
        textView5.setTextColor(-1);
        textView5.setText(gd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        s0Var.addView(textView5, ma.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(org.telegram.messenger.g0.o());
        textView6.setTextColor(-1);
        textView6.setText(gd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        s0Var.addView(textView6, ma.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        q9 q9Var2 = this.Z1;
        if (q9Var2 == null || q9Var2.f26374f == null) {
            k80Var = null;
        } else {
            k80Var = new k80(context, null);
            k80Var.setTextSize(1, 13.0f);
            k80Var.setGravity(17);
            org.telegram.ui.ActionBar.u6.U(k80Var, i14, i6Var3);
            k80Var.setText(org.telegram.messenger.g0.V2(gd.V(null, null, 2131750342, gd.E(starGift.availability_total, ','), Integer.valueOf(this.Z1.f26374f.total_rounds), Integer.valueOf(starGift.gifts_per_round), org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.M0(2131750341, null), new f0(1, context, starGift, i6Var3)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)))));
            org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.J6, i6Var3);
        }
        if (z10) {
            if (context != null) {
                TextView textView7 = new TextView(context);
                textView7.setTypeface(org.telegram.messenger.g0.o());
                textView7.setGravity(17);
                textView7.setText(gd.a0(null, null, 2131749793, starGift.title));
                textView7.setTextSize(1, 20.0f);
                org.telegram.ui.ActionBar.u6.U(textView7, i17, i6Var3);
                linearLayout.addView(textView7, ma.t(-1, -2, 17, 20, 14, 20, 6));
                TextView textView8 = new TextView(context);
                textView8.setGravity(17);
                n10.l(14.0f, 2131749791, 1, textView8, null);
                org.telegram.ui.ActionBar.u6.U(textView8, i17, i6Var3);
                linearLayout.addView(textView8, ma.t(-1, -2, 17, 20, 0, 20, 16));
                js0 js0Var = new js0(context, i6Var3);
                js0Var.f49074a.l(gd.M0(2131749799, null), false);
                js0Var.f49075b.setText(gd.M0(2131749798, null));
                js0Var.d.setVisibility(8);
                ImageView imageView2 = js0Var.f49076c;
                imageView2.setImageResource(2131232123);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                org.telegram.ui.ActionBar.u6.s(imageView2, i17, i6Var3, mode);
                linearLayout.addView(js0Var, ma.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                js0 js0Var2 = new js0(context, i6Var3);
                js0Var2.f49074a.l(gd.M0(2131749797, null), false);
                js0Var2.f49075b.setText(gd.M0(2131749796, null));
                js0Var2.d.setVisibility(8);
                ImageView imageView3 = js0Var2.f49076c;
                imageView3.setImageResource(2131231801);
                org.telegram.ui.ActionBar.u6.s(imageView3, i17, i6Var3, mode);
                linearLayout.addView(js0Var2, ma.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                js0 js0Var3 = new js0(context, i6Var3);
                js0Var3.f49074a.l(gd.M0(2131749795, null), false);
                js0Var3.f49075b.setText(gd.M0(2131749794, null));
                js0Var3.d.setVisibility(8);
                ImageView imageView4 = js0Var3.f49076c;
                imageView4.setImageResource(2131231912);
                org.telegram.ui.ActionBar.u6.s(imageView4, i17, i6Var3, mode);
                linearLayout.addView(js0Var3, ma.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
            }
            dVar.i(di.f6.t2(gd.M0(2131743651, null)), false, true);
            dVar.setOnClickListener(new ah.d(this, 4));
            return;
        }
        linearLayout.addView(linearLayout2, ma.k(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
        linearLayout.addView(textView3, ma.k(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
        linearLayout.addView(frameLayout, ma.k(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
        if (k80Var != null) {
            linearLayout.addView(k80Var, ma.k(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
        }
        int currentTime = ConnectionsManager.getInstance(this.f30189a).getCurrentTime();
        q9 q9Var3 = this.Z1;
        if (q9Var3 != null && q9Var3.g(currentTime)) {
            dVar.i(gd.M0(2131750324, null), false, true);
        } else {
            dVar.i(gd.M0(2131750329, null), false, true);
        }
        q9 q9Var4 = this.Z1;
        if (q9Var4 != null && q9Var4.f26374f != null) {
            if (q9Var4.g(currentTime)) {
                dVar.g(gd.a0(null, null, 2131750319, gd.c0(this.Z1.f26374f.start_date - currentTime)), false);
            } else {
                dVar.g(gd.a0(null, null, 2131750305, gd.c0(this.Z1.f26374f.end_date - currentTime)), false);
            }
        }
        dVar.setOnClickListener(new a0(this, j3, context, i6Var3, runnable, 1));
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        z41 z41Var = new z41(this.f39534o1, getContext(), this.f30189a, 0, true, new b(this, 4), this.J0);
        this.f4070a2 = z41Var;
        z41Var.f42809r = false;
        return z41Var;
    }

    @Override
    public final CharSequence P0() {
        return "";
    }

    @Override
    public final void c(q9 q9Var) {
        this.Z1 = q9Var;
    }

    @Override
    public final void dismiss() {
        u9.c(this.f30189a).n(this.T1, this);
        super.dismiss();
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int f10 = i0.a.f(0.1f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29487i5, this.J0), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, this.J0));
            if (f10 != this.f4071b2) {
                this.f4071b2 = f10;
                v0(f10);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
