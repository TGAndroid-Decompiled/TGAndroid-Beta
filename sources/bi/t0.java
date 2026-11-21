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
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.sa;
import org.telegram.ui.js0;
public final class t0 extends sa implements t9 {
    public static final int f4097c2 = 0;
    public final long T1;
    public final n0 U1;
    public final LinearLayout V1;
    public final o0 W1;
    public final TextView X1;
    public final q0 Y1;
    public q9 Z1;
    public c51 f4098a2;
    public int f4099b2;

    public t0(Context context, org.telegram.ui.ActionBar.h6 h6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable, boolean z10) {
        super(context, null, false, false, 1, h6Var);
        org.telegram.ui.Components.b9 b9Var;
        TLRPC.User user;
        ?? r12;
        Context context2;
        org.telegram.ui.ActionBar.h6 h6Var2;
        m80 m80Var;
        long j10 = starGift.f28660id;
        this.T1 = j10;
        this.F1 = org.telegram.messenger.g0.L(6.0f);
        this.f39546v1 = 0.2f;
        v0(i0.a.f(0.1f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29469i5, this.J0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29451h5, this.J0)));
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
        hi.e eVar = new hi.e(context, h6Var, true);
        eVar.f();
        FrameLayout.LayoutParams d = ma.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i7 = d.leftMargin;
        int i10 = this.f30208u0;
        d.leftMargin = i7 + i10;
        d.rightMargin += i10;
        this.f30173b.addView(eVar, d);
        ek0 ek0Var = this.f39539o1;
        int i11 = this.f30208u0;
        ek0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(64.0f));
        this.f4098a2.O(false);
        int i12 = z10 ? 220 : 208;
        this.Z1 = u9.c(this.f30170a).l(j10, this);
        o0 o0Var = new o0(this, context, h6Var, new a3.f(this, 19), new o(2), new o(2), new o(2), new o(2), new o(2), new o(2), i12);
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
            TLRPC.User c22 = mp.u1(this.f30170a).c2(Long.valueOf(j10.i(this.f30170a).e()));
            b9Var = new org.telegram.ui.Components.b9(0, c22);
            user = c22;
        } else if (i13 > 0) {
            TLRPC.User c23 = mp.u1(this.f30170a).c2(Long.valueOf(j3));
            b9Var = new org.telegram.ui.Components.b9(0, c23);
            user = c23;
        } else {
            TLRPC.Chat O0 = mp.u1(this.f30170a).O0(Long.valueOf(-j3));
            b9Var = new org.telegram.ui.Components.b9(O0);
            user = O0;
        }
        q9Var.f(user, b9Var);
        TextView textView = new TextView(context);
        this.X1 = textView;
        n10.p(textView, 1, 21.0f);
        textView.setText(org.telegram.messenger.n5.t(i13 != 0 ? j3 : j10.i(this.f30170a).e()));
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
            textView2.setText(gd.N0(2131749791, null));
            context2 = context;
            r12 = 0;
            h6Var2 = h6Var;
        } else {
            textView2.setText(org.telegram.messenger.g0.I2(gd.N0(2131750332, null), false, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            r12 = 0;
            context2 = context;
            h6Var2 = h6Var;
            textView2.setOnClickListener(new a0(context, h6Var, j3, starGift, arrayList));
            ra.b(textView2, 0.02f, 1.5f);
        }
        n0Var.addView(textView2, ma.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        g3 g3Var = new g3(this.f30170a, context2, h6Var2);
        g3Var.f3643d0 = true;
        org.telegram.ui.ActionBar.h6 h6Var3 = h6Var2;
        g3Var.h(starGift, true, false, false, false, false);
        g3Var.setImageSize(org.telegram.messenger.g0.L(84.0f));
        g3Var.setImageLayer(7);
        g3Var.K.setVisibility(8);
        g3Var.f3644e.g(r12);
        g3Var.setRibbonTextOneOf(this.Z1.d.availability_total);
        linearLayout2.addView(g3Var, ma.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231240);
        imageView.setScaleX(-1.0f);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.f29543m6, h6Var3, PorterDuff.Mode.SRC_IN);
        linearLayout2.addView(imageView, ma.q(24, 24, 0.0f, 16, 12, 0, 12, 0));
        q0 q0Var = new q0(this, context, this.f30170a, h6Var3);
        this.Y1 = q0Var;
        q0Var.d.removeView(q0Var.E);
        q0Var.f3643d0 = true;
        q0Var.h(starGift, true, false, false, false, false);
        q0Var.setImageSize(org.telegram.messenger.g0.L(100.0f));
        q0Var.setImageLayer(7);
        q0Var.K.setVisibility(8);
        q0Var.f3644e.g(r12);
        q0Var.setRibbonTextOneOf(this.Z1.d.availability_total);
        q0Var.setRibbonText(gd.N0(2131750302, r12));
        linearLayout2.addView(q0Var, ma.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(gd.N0(2131749814, r12));
        int i14 = org.telegram.ui.ActionBar.m6.f29770y6;
        org.telegram.ui.ActionBar.t6.U(textView3, i14, h6Var3);
        float i15 = Utilities.i(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(14.0f);
        int i16 = org.telegram.ui.ActionBar.m6.f29378d6;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i16, h6Var3);
        int i17 = org.telegram.ui.ActionBar.m6.G6;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, i0.a.f(0.2f, w02, org.telegram.ui.ActionBar.m6.w0(i17, h6Var3)));
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.o6 o4 = org.telegram.ui.ActionBar.t6.o(frameLayout, true);
        o4.d = d02;
        o4.f29855e = r12;
        o4.f29856f = r12;
        org.telegram.ui.ActionBar.n6 n6Var = new org.telegram.ui.ActionBar.n6();
        o4.f29855e = n6Var;
        n6Var.c(i16, i17, 3, 0.2f, h6Var3);
        n6Var.f29818g = org.telegram.ui.ActionBar.t6.t(d02);
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.U(textView4, i17, h6Var3);
        textView4.setText(gd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView4, ma.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        m10.setTextSize(1, 13.0f);
        m10.setGravity(21);
        m10.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.t6.U(m10, i17, h6Var3);
        m10.setText(gd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(m10, ma.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View r0Var = new r0(context, i15);
        int L2 = org.telegram.messenger.g0.L(14.0f);
        int i18 = org.telegram.ui.ActionBar.m6.Fi;
        Drawable d03 = org.telegram.ui.ActionBar.m6.d0(L2, org.telegram.ui.ActionBar.m6.w0(i18, h6Var3));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i18);
        r0Var.setBackground(d03);
        org.telegram.ui.ActionBar.t6.j(r0Var, d03, M, null, h6Var3);
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
        if (q9Var2 == null || q9Var2.f26400f == null) {
            m80Var = null;
        } else {
            m80Var = new m80(context, null);
            m80Var.setTextSize(1, 13.0f);
            m80Var.setGravity(17);
            org.telegram.ui.ActionBar.t6.U(m80Var, i14, h6Var3);
            m80Var.setText(org.telegram.messenger.g0.V2(gd.V(null, null, 2131750341, gd.E(starGift.availability_total, ','), Integer.valueOf(this.Z1.f26400f.total_rounds), Integer.valueOf(starGift.gifts_per_round), org.telegram.messenger.g0.I2(org.telegram.messenger.g0.T2(gd.N0(2131750340, null), new f0(1, context, starGift, h6Var3)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)))));
            org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.J6, h6Var3);
        }
        if (z10) {
            if (context != null) {
                TextView textView7 = new TextView(context);
                textView7.setTypeface(org.telegram.messenger.g0.o());
                textView7.setGravity(17);
                textView7.setText(gd.a0(null, null, 2131749792, starGift.title));
                textView7.setTextSize(1, 20.0f);
                org.telegram.ui.ActionBar.t6.U(textView7, i17, h6Var3);
                linearLayout.addView(textView7, ma.t(-1, -2, 17, 20, 14, 20, 6));
                TextView textView8 = new TextView(context);
                textView8.setGravity(17);
                n10.l(14.0f, 2131749790, 1, textView8, null);
                org.telegram.ui.ActionBar.t6.U(textView8, i17, h6Var3);
                linearLayout.addView(textView8, ma.t(-1, -2, 17, 20, 0, 20, 16));
                js0 js0Var = new js0(context, h6Var3);
                js0Var.f49084a.l(gd.N0(2131749798, null), false);
                js0Var.f49085b.setText(gd.N0(2131749797, null));
                js0Var.d.setVisibility(8);
                ImageView imageView2 = js0Var.f49086c;
                imageView2.setImageResource(2131232123);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                org.telegram.ui.ActionBar.t6.s(imageView2, i17, h6Var3, mode);
                linearLayout.addView(js0Var, ma.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                js0 js0Var2 = new js0(context, h6Var3);
                js0Var2.f49084a.l(gd.N0(2131749796, null), false);
                js0Var2.f49085b.setText(gd.N0(2131749795, null));
                js0Var2.d.setVisibility(8);
                ImageView imageView3 = js0Var2.f49086c;
                imageView3.setImageResource(2131231801);
                org.telegram.ui.ActionBar.t6.s(imageView3, i17, h6Var3, mode);
                linearLayout.addView(js0Var2, ma.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                js0 js0Var3 = new js0(context, h6Var3);
                js0Var3.f49084a.l(gd.N0(2131749794, null), false);
                js0Var3.f49085b.setText(gd.N0(2131749793, null));
                js0Var3.d.setVisibility(8);
                ImageView imageView4 = js0Var3.f49086c;
                imageView4.setImageResource(2131231912);
                org.telegram.ui.ActionBar.t6.s(imageView4, i17, h6Var3, mode);
                linearLayout.addView(js0Var3, ma.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
            }
            eVar.i(di.f6.t2(gd.N0(2131743645, null)), false, true);
            eVar.setOnClickListener(new ah.d(this, 4));
            return;
        }
        linearLayout.addView(linearLayout2, ma.k(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
        linearLayout.addView(textView3, ma.k(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
        linearLayout.addView(frameLayout, ma.k(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
        if (m80Var != null) {
            linearLayout.addView(m80Var, ma.k(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
        }
        int currentTime = ConnectionsManager.getInstance(this.f30170a).getCurrentTime();
        q9 q9Var3 = this.Z1;
        if (q9Var3 != null && q9Var3.g(currentTime)) {
            eVar.i(gd.N0(2131750323, null), false, true);
        } else {
            eVar.i(gd.N0(2131750328, null), false, true);
        }
        q9 q9Var4 = this.Z1;
        if (q9Var4 != null && q9Var4.f26400f != null) {
            if (q9Var4.g(currentTime)) {
                eVar.g(gd.a0(null, null, 2131750318, gd.c0(this.Z1.f26400f.start_date - currentTime)), false);
            } else {
                eVar.g(gd.a0(null, null, 2131750304, gd.c0(this.Z1.f26400f.end_date - currentTime)), false);
            }
        }
        eVar.setOnClickListener(new a0(this, j3, context, h6Var3, runnable, 1));
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(this.f39539o1, getContext(), this.f30170a, 0, true, new b(this, 4), this.J0);
        this.f4098a2 = c51Var;
        c51Var.f34068r = false;
        return c51Var;
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
        u9.c(this.f30170a).n(this.T1, this);
        super.dismiss();
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int f10 = i0.a.f(0.1f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29469i5, this.J0), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29451h5, this.J0));
            if (f10 != this.f4099b2) {
                this.f4099b2 = f10;
                v0(f10);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
