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
import c8.na;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.r9;
import org.telegram.messenger.u9;
import org.telegram.messenger.v9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.fs0;
public final class t0 extends ja implements u9 {
    public static final int f3873c2 = 0;
    public final long T1;
    public final n0 U1;
    public final LinearLayout V1;
    public final o0 W1;
    public final TextView X1;
    public final q0 Y1;
    public r9 Z1;
    public p41 f3874a2;
    public int f3875b2;

    public t0(Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable, boolean z10) {
        super(context, null, false, false, 1, e6Var);
        t8 t8Var;
        TLRPC.User user;
        ?? r12;
        Context context2;
        org.telegram.ui.ActionBar.e6 e6Var2;
        z70 z70Var;
        long j10 = starGift.f28280id;
        this.T1 = j10;
        this.F1 = org.telegram.messenger.g0.L(6.0f);
        this.f35938v1 = 0.2f;
        v0(i0.a.f(0.1f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28940i5, this.J0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0)));
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
        hi.d dVar = new hi.d(context, e6Var, true);
        dVar.f();
        FrameLayout.LayoutParams d = c8.ja.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i7 = d.leftMargin;
        int i10 = this.f29717u0;
        d.leftMargin = i7 + i10;
        d.rightMargin += i10;
        this.f29682b.addView(dVar, d);
        uj0 uj0Var = this.f35931o1;
        int i11 = this.f29717u0;
        uj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(64.0f));
        this.f3874a2.O(false);
        int i12 = z10 ? 220 : 208;
        this.Z1 = v9.c(this.f29679a).l(j10, this);
        o0 o0Var = new o0(this, context, e6Var, new a3.f(this, 18), new o(2), new o(2), new o(2), new o(2), new o(2), new o(2), i12);
        this.W1 = o0Var;
        o0Var.d(new di.b5(1, 1));
        o0Var.setPreviewingAttributes(arrayList);
        o0Var.removeView(o0Var.Q);
        n0Var.addView(o0Var, 0, c8.ja.e(-1, i12, 48));
        i9 i9Var = new i9(context);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(45.0f));
        n0Var.addView(i9Var, c8.ja.d(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i13 == 0) {
            TLRPC.User a22 = np.s1(this.f29679a).a2(Long.valueOf(m10.i(this.f29679a).e()));
            t8Var = new t8(0, a22);
            user = a22;
        } else if (i13 > 0) {
            TLRPC.User a23 = np.s1(this.f29679a).a2(Long.valueOf(j3));
            t8Var = new t8(0, a23);
            user = a23;
        } else {
            TLRPC.Chat M0 = np.s1(this.f29679a).M0(Long.valueOf(-j3));
            t8Var = new t8(M0);
            user = M0;
        }
        i9Var.f(user, t8Var);
        TextView textView = new TextView(context);
        this.X1 = textView;
        i20.o(textView, 1, 21.0f);
        textView.setText(org.telegram.messenger.m5.t(i13 != 0 ? j3 : m10.i(this.f29679a).e()));
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setPadding(0, 0, org.telegram.messenger.g0.L(36.0f), 0);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        n0Var.addView(textView, c8.ja.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        textView2.setGravity(17);
        textView2.setTextColor(-1342177281);
        if (z10) {
            textView2.setText(hd.M0(2131749808, null));
            context2 = context;
            r12 = 0;
            e6Var2 = e6Var;
        } else {
            textView2.setText(org.telegram.messenger.g0.I2(hd.M0(2131750349, null), false, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)));
            r12 = 0;
            context2 = context;
            e6Var2 = e6Var;
            textView2.setOnClickListener(new a0(context, e6Var, j3, starGift, arrayList));
            na.b(textView2, 0.02f, 1.5f);
        }
        n0Var.addView(textView2, c8.ja.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        i2 i2Var = new i2(this.f29679a, context2, e6Var2);
        i2Var.f3584d0 = true;
        org.telegram.ui.ActionBar.e6 e6Var3 = e6Var2;
        i2Var.h(starGift, true, false, false, false, false);
        i2Var.setImageSize(org.telegram.messenger.g0.L(84.0f));
        i2Var.setImageLayer(7);
        i2Var.K.setVisibility(8);
        i2Var.f3585e.g(r12);
        i2Var.setRibbonTextOneOf(this.Z1.d.availability_total);
        linearLayout2.addView(i2Var, c8.ja.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231240);
        imageView.setScaleX(-1.0f);
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.f29014m6, e6Var3, PorterDuff.Mode.SRC_IN);
        linearLayout2.addView(imageView, c8.ja.q(24, 24, 0.0f, 16, 12, 0, 12, 0));
        q0 q0Var = new q0(this, context, this.f29679a, e6Var3);
        this.Y1 = q0Var;
        q0Var.d.removeView(q0Var.E);
        q0Var.f3584d0 = true;
        q0Var.h(starGift, true, false, false, false, false);
        q0Var.setImageSize(org.telegram.messenger.g0.L(100.0f));
        q0Var.setImageLayer(7);
        q0Var.K.setVisibility(8);
        q0Var.f3585e.g(r12);
        q0Var.setRibbonTextOneOf(this.Z1.d.availability_total);
        q0Var.setRibbonText(hd.M0(2131750319, r12));
        linearLayout2.addView(q0Var, c8.ja.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(hd.M0(2131749831, r12));
        int i14 = org.telegram.ui.ActionBar.j6.f29241y6;
        org.telegram.ui.ActionBar.q6.U(textView3, i14, e6Var3);
        float i15 = Utilities.i(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = org.telegram.messenger.g0.L(14.0f);
        int i16 = org.telegram.ui.ActionBar.j6.f28849d6;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i16, e6Var3);
        int i17 = org.telegram.ui.ActionBar.j6.G6;
        Drawable d02 = org.telegram.ui.ActionBar.j6.d0(L, i0.a.f(0.2f, w02, org.telegram.ui.ActionBar.j6.w0(i17, e6Var3)));
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.l6 o4 = org.telegram.ui.ActionBar.q6.o(frameLayout, true);
        o4.d = d02;
        o4.f29373e = r12;
        o4.f29374f = r12;
        org.telegram.ui.ActionBar.k6 k6Var = new org.telegram.ui.ActionBar.k6();
        o4.f29373e = k6Var;
        k6Var.c(i16, i17, 3, 0.2f, e6Var3);
        k6Var.f29348g = org.telegram.ui.ActionBar.q6.t(d02);
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.U(textView4, i17, e6Var3);
        textView4.setText(hd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        TextView k10 = org.telegram.ui.Cells.y0.k(frameLayout, textView4, c8.ja.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        k10.setTextSize(1, 13.0f);
        k10.setGravity(21);
        k10.setTypeface(org.telegram.messenger.g0.o());
        org.telegram.ui.ActionBar.q6.U(k10, i17, e6Var3);
        k10.setText(hd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(k10, c8.ja.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View r0Var = new r0(context, i15);
        int L2 = org.telegram.messenger.g0.L(14.0f);
        int i18 = org.telegram.ui.ActionBar.j6.Fi;
        Drawable d03 = org.telegram.ui.ActionBar.j6.d0(L2, org.telegram.ui.ActionBar.j6.w0(i18, e6Var3));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i18);
        r0Var.setBackground(d03);
        org.telegram.ui.ActionBar.q6.j(r0Var, d03, M, null, e6Var3);
        frameLayout.addView(r0Var, c8.ja.e(-1, -1, 119));
        s0 s0Var = new s0(context, i15);
        s0Var.setWillNotDraw(false);
        frameLayout.addView(s0Var, c8.ja.e(-1, -1, 119));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(org.telegram.messenger.g0.o());
        textView5.setTextColor(-1);
        textView5.setText(hd.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        s0Var.addView(textView5, c8.ja.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(org.telegram.messenger.g0.o());
        textView6.setTextColor(-1);
        textView6.setText(hd.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        s0Var.addView(textView6, c8.ja.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        r9 r9Var = this.Z1;
        if (r9Var == null || r9Var.f26270f == null) {
            z70Var = null;
        } else {
            z70Var = new z70(context, null);
            z70Var.setTextSize(1, 13.0f);
            z70Var.setGravity(17);
            org.telegram.ui.ActionBar.q6.U(z70Var, i14, e6Var3);
            z70Var.setText(org.telegram.messenger.g0.W2(hd.V(null, null, 2131750358, hd.E(starGift.availability_total, ','), Integer.valueOf(this.Z1.f26270f.total_rounds), Integer.valueOf(starGift.gifts_per_round), org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(hd.M0(2131750357, null), new f0(context, e6Var3, starGift, 1)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(1.0f)))));
            org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.J6, e6Var3);
        }
        if (z10) {
            if (context != null) {
                TextView textView7 = new TextView(context);
                textView7.setTypeface(org.telegram.messenger.g0.o());
                textView7.setGravity(17);
                textView7.setText(hd.a0(null, null, 2131749809, starGift.title));
                textView7.setTextSize(1, 20.0f);
                org.telegram.ui.ActionBar.q6.U(textView7, i17, e6Var3);
                linearLayout.addView(textView7, c8.ja.t(-1, -2, 17, 20, 14, 20, 6));
                TextView textView8 = new TextView(context);
                textView8.setGravity(17);
                textView8.setText(hd.M0(2131749807, null));
                textView8.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.q6.U(textView8, i17, e6Var3);
                linearLayout.addView(textView8, c8.ja.t(-1, -2, 17, 20, 0, 20, 16));
                fs0 fs0Var = new fs0(context, e6Var3);
                fs0Var.f47176a.l(hd.M0(2131749815, null), false);
                fs0Var.f47177b.setText(hd.M0(2131749814, null));
                fs0Var.d.setVisibility(8);
                ImageView imageView2 = fs0Var.f47178c;
                imageView2.setImageResource(2131232122);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                org.telegram.ui.ActionBar.q6.s(imageView2, i17, e6Var3, mode);
                linearLayout.addView(fs0Var, c8.ja.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                fs0 fs0Var2 = new fs0(context, e6Var3);
                fs0Var2.f47176a.l(hd.M0(2131749813, null), false);
                fs0Var2.f47177b.setText(hd.M0(2131749812, null));
                fs0Var2.d.setVisibility(8);
                ImageView imageView3 = fs0Var2.f47178c;
                imageView3.setImageResource(2131231800);
                org.telegram.ui.ActionBar.q6.s(imageView3, i17, e6Var3, mode);
                linearLayout.addView(fs0Var2, c8.ja.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                fs0 fs0Var3 = new fs0(context, e6Var3);
                fs0Var3.f47176a.l(hd.M0(2131749811, null), false);
                fs0Var3.f47177b.setText(hd.M0(2131749810, null));
                fs0Var3.d.setVisibility(8);
                ImageView imageView4 = fs0Var3.f47178c;
                imageView4.setImageResource(2131231911);
                org.telegram.ui.ActionBar.q6.s(imageView4, i17, e6Var3, mode);
                linearLayout.addView(fs0Var3, c8.ja.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
            }
            dVar.i(di.c6.h2(hd.M0(2131743888, null)), false, true);
            dVar.setOnClickListener(new ah.d(this, 4));
            return;
        }
        linearLayout.addView(linearLayout2, c8.ja.k(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
        linearLayout.addView(textView3, c8.ja.k(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
        linearLayout.addView(frameLayout, c8.ja.k(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
        if (z70Var != null) {
            linearLayout.addView(z70Var, c8.ja.k(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
        }
        int currentTime = ConnectionsManager.getInstance(this.f29679a).getCurrentTime();
        r9 r9Var2 = this.Z1;
        if (r9Var2 != null && r9Var2.g(currentTime)) {
            dVar.i(hd.M0(2131750340, null), false, true);
        } else {
            dVar.i(hd.M0(2131750345, null), false, true);
        }
        r9 r9Var3 = this.Z1;
        if (r9Var3 != null && r9Var3.f26270f != null) {
            if (r9Var3.g(currentTime)) {
                dVar.g(hd.a0(null, null, 2131750335, hd.c0(this.Z1.f26270f.start_date - currentTime)), false);
            } else {
                dVar.g(hd.a0(null, null, 2131750321, hd.c0(this.Z1.f26270f.end_date - currentTime)), false);
            }
        }
        dVar.setOnClickListener(new a0(this, j3, context, e6Var3, runnable, 1));
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(this.f35931o1, getContext(), this.f29679a, 0, true, new b(this, 4), this.J0);
        this.f3874a2 = p41Var;
        p41Var.f38199r = false;
        return p41Var;
    }

    @Override
    public final CharSequence O0() {
        return "";
    }

    @Override
    public final void c(r9 r9Var) {
        this.Z1 = r9Var;
    }

    @Override
    public final void dismiss() {
        v9.c(this.f29679a).n(this.T1, this);
        super.dismiss();
    }

    @Override
    public final void s0() {
        super.s0();
        try {
            int f10 = i0.a.f(0.1f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28940i5, this.J0), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0));
            if (f10 != this.f3875b2) {
                this.f3875b2 = f10;
                v0(f10);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
