package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class mz extends ny0 implements nv4 {
    public final long S1;
    public final gz T1;
    public final LinearLayout U1;
    public final hz V1;
    public final TextView W1;
    public final jz X1;
    public kv4 Y1;
    public l9c Z1;
    public int a2;

    public mz(Context context, vnb vnbVar, long j, TL_stars.StarGift starGift, ArrayList arrayList, ex4 ex4Var, boolean z) {
        super(context, null, false, false, 1, vnbVar);
        rb0 rb0Var;
        TLRPC.User user;
        ?? r12;
        Context context2;
        vnb vnbVar2;
        p66 p66Var;
        long j2 = starGift.id;
        this.S1 = j2;
        this.E1 = hl.L(6.0f);
        this.u1 = 0.2f;
        s0(vm2.f(0.1f, aob.v0(aob.i5, this.J0), aob.v0(aob.h5, this.J0)));
        J();
        LinearLayout linearLayout = new LinearLayout(context);
        this.U1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        gz gzVar = new gz(this, context);
        this.T1 = gzVar;
        linearLayout.addView(gzVar);
        c51 c51Var = new c51(vnbVar, context, true);
        c51Var.f();
        FrameLayout.LayoutParams d = tre.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i = d.leftMargin;
        int i2 = this.u0;
        d.leftMargin = i + i2;
        d.rightMargin += i2;
        this.b.addView(c51Var, d);
        d79 d79Var = this.n1;
        int i3 = this.u0;
        d79Var.setPadding(i3, 0, i3, hl.L(64.0f));
        this.Z1.O(false);
        int i4 = z ? 220 : 208;
        this.Y1 = ov4.c(this.a).l(j2, this);
        hz hzVar = new hz(this, context, vnbVar, new c1(this, (byte) 28), new y00((byte) 1), new y00((byte) 1), new y00((byte) 1), new y00((byte) 1), new y00((byte) 1), new y00((byte) 1), i4);
        this.V1 = hzVar;
        hzVar.d(new yta(1, 1));
        hzVar.setPreviewingAttributes(arrayList);
        hzVar.removeView(hzVar.Q);
        gzVar.addView(hzVar, 0, tre.e(-1, i4, 48));
        de0 de0Var = new de0(context);
        de0Var.setRoundRadius(hl.L(45.0f));
        gzVar.addView(de0Var, tre.d(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        int i5 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i6 = this.a;
        if (i5 == 0) {
            TLRPC.User X1 = uc7.s1(i6).X1(Long.valueOf(yac.h(this.a).e()));
            rb0Var = new rb0(0, X1);
            user = X1;
        } else if (i5 > 0) {
            TLRPC.User X12 = uc7.s1(i6).X1(Long.valueOf(j));
            rb0Var = new rb0(0, X12);
            user = X12;
        } else {
            TLRPC.Chat M0 = uc7.s1(i6).M0(Long.valueOf(-j));
            rb0Var = new rb0(M0);
            user = M0;
        }
        de0Var.f(user, rb0Var);
        TextView textView = new TextView(context);
        this.W1 = textView;
        ik8.v(textView, 1, 21.0f);
        textView.setText(wf3.s(i5 != 0 ? j : yac.h(this.a).e()));
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setPadding(0, 0, hl.L(36.0f), 0);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        gzVar.addView(textView, tre.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        textView2.setGravity(17);
        textView2.setTextColor(-1342177281);
        if (z) {
            textView2.setText(ob6.M0(2131749754, null));
            context2 = context;
            r12 = 0;
            vnbVar2 = vnbVar;
        } else {
            textView2.setText(hl.E2(ob6.M0(2131750310, null), false, hl.L(2.6666667f), hl.L(1.0f)));
            r12 = 0;
            context2 = context;
            vnbVar2 = vnbVar;
            textView2.setOnClickListener(new az(context, vnbVar, j, starGift, arrayList));
            iye.b(textView2, 0.02f, 1.5f);
        }
        gzVar.addView(textView2, tre.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        sx4 sx4Var = new sx4(this.a, vnbVar2, context2);
        sx4Var.d0 = true;
        vnb vnbVar3 = vnbVar2;
        sx4Var.h(starGift, true, false, false, false, false);
        sx4Var.setImageSize(hl.L(84.0f));
        sx4Var.setImageLayer(7);
        sx4Var.K.setVisibility(8);
        sx4Var.e.g(r12);
        sx4Var.setRibbonTextOneOf(this.Y1.d.availability_total);
        linearLayout2.addView(sx4Var, tre.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231243);
        imageView.setScaleX(-1.0f);
        yob.s(imageView, aob.m6, vnbVar3, PorterDuff.Mode.SRC_IN);
        linearLayout2.addView(imageView, tre.q(24, 24, 0.0f, 16, 12, 0, 12, 0));
        jz jzVar = new jz(this, context, this.a, vnbVar3);
        this.X1 = jzVar;
        jzVar.d.removeView(jzVar.E);
        jzVar.d0 = true;
        jzVar.h(starGift, true, false, false, false, false);
        jzVar.setImageSize(hl.L(100.0f));
        jzVar.setImageLayer(7);
        jzVar.K.setVisibility(8);
        jzVar.e.g(r12);
        jzVar.setRibbonTextOneOf(this.Y1.d.availability_total);
        jzVar.setRibbonText(ob6.M0(2131750280, r12));
        linearLayout2.addView(jzVar, tre.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(ob6.M0(2131749777, r12));
        int i7 = aob.y6;
        yob.X(textView3, i7, vnbVar3);
        float i8 = Utilities.i(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = hl.L(14.0f);
        int i9 = aob.d6;
        int v0 = aob.v0(i9, vnbVar3);
        int i10 = aob.G6;
        Drawable b0 = aob.b0(L, vm2.f(0.2f, v0, aob.v0(i10, vnbVar3)));
        frameLayout.setBackground(b0);
        tob o = yob.o(frameLayout, true);
        o.d = b0;
        o.e = r12;
        o.f = r12;
        sob sobVar = new sob();
        o.e = sobVar;
        sobVar.c(i9, i10, 3, 0.2f, vnbVar3);
        sobVar.g = yob.t(b0);
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(hl.o());
        yob.X(textView4, i10, vnbVar3);
        textView4.setText(ob6.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        TextView l = ik8.l(frameLayout, textView4, tre.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        l.setTextSize(1, 13.0f);
        l.setGravity(21);
        l.setTypeface(hl.o());
        yob.X(l, i10, vnbVar3);
        l.setText(ob6.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(l, tre.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View kzVar = new kz(context, i8);
        int L2 = hl.L(14.0f);
        int i11 = aob.Fi;
        Drawable b02 = aob.b0(L2, aob.v0(i11, vnbVar3));
        uob M = yob.M(i11);
        kzVar.setBackground(b02);
        yob.j(kzVar, b02, M, null, vnbVar3);
        frameLayout.addView(kzVar, tre.e(-1, -1, 119));
        lz lzVar = new lz(context, i8);
        lzVar.setWillNotDraw(false);
        frameLayout.addView(lzVar, tre.e(-1, -1, 119));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(hl.o());
        textView5.setTextColor(-1);
        textView5.setText(ob6.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        lzVar.addView(textView5, tre.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(hl.o());
        textView6.setTextColor(-1);
        textView6.setText(ob6.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        lzVar.addView(textView6, tre.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        kv4 kv4Var = this.Y1;
        if (kv4Var == null || kv4Var.f == null) {
            p66Var = null;
        } else {
            p66Var = new p66(context, null);
            p66Var.setTextSize(1, 13.0f);
            p66Var.setGravity(17);
            yob.X(p66Var, i7, vnbVar3);
            p66Var.setText(hl.R2(ob6.V(null, null, 2131750319, ob6.E(starGift.availability_total, ','), Integer.valueOf(this.Y1.f.total_rounds), Integer.valueOf(starGift.gifts_per_round), hl.E2(hl.N2(ob6.M0(2131750318, null), -1, 0, new yy(context, vnbVar3, starGift, (byte) 1), null), true, hl.L(2.6666667f), hl.L(1.0f)))));
            yob.G(p66Var, aob.J6, vnbVar3);
        }
        if (z) {
            if (context != null) {
                TextView textView7 = new TextView(context);
                textView7.setTypeface(hl.o());
                textView7.setGravity(17);
                textView7.setText(ob6.a0(null, null, 2131749755, starGift.title));
                textView7.setTextSize(1, 20.0f);
                yob.X(textView7, i10, vnbVar3);
                linearLayout.addView(textView7, tre.t(-1, -2, 17, 20, 14, 20, 6));
                TextView textView8 = new TextView(context);
                textView8.setGravity(17);
                qd4.u(14.0f, 2131749753, 1, textView8, null);
                yob.X(textView8, i10, vnbVar3);
                linearLayout.addView(textView8, tre.t(-1, -2, 17, 20, 0, 20, 16));
                yk8 yk8Var = new yk8(context, vnbVar3);
                yk8Var.a.l(ob6.M0(2131749761, null), false);
                yk8Var.b.setText(ob6.M0(2131749760, null));
                yk8Var.d.setVisibility(8);
                ImageView imageView2 = yk8Var.c;
                imageView2.setImageResource(2131232126);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                yob.s(imageView2, i10, vnbVar3, mode);
                linearLayout.addView(yk8Var, tre.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                yk8 yk8Var2 = new yk8(context, vnbVar3);
                yk8Var2.a.l(ob6.M0(2131749759, null), false);
                yk8Var2.b.setText(ob6.M0(2131749758, null));
                yk8Var2.d.setVisibility(8);
                ImageView imageView3 = yk8Var2.c;
                imageView3.setImageResource(2131231804);
                yob.s(imageView3, i10, vnbVar3, mode);
                linearLayout.addView(yk8Var2, tre.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                yk8 yk8Var3 = new yk8(context, vnbVar3);
                yk8Var3.a.l(ob6.M0(2131749757, null), false);
                yk8Var3.b.setText(ob6.M0(2131749756, null));
                yk8Var3.d.setVisibility(8);
                ImageView imageView4 = yk8Var3.c;
                imageView4.setImageResource(2131231915);
                yob.s(imageView4, i10, vnbVar3, mode);
                linearLayout.addView(yk8Var3, tre.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
            }
            c51Var.i(wua.l2(ob6.M0(2131743543, null)), false, true);
            c51Var.setOnClickListener(new k1(this, (byte) 12));
            return;
        }
        linearLayout.addView(linearLayout2, tre.k(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
        linearLayout.addView(textView3, tre.k(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
        linearLayout.addView(frameLayout, tre.k(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
        if (p66Var != null) {
            linearLayout.addView(p66Var, tre.k(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
        }
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        kv4 kv4Var2 = this.Y1;
        if (kv4Var2 != null && kv4Var2.g(currentTime)) {
            c51Var.i(ob6.M0(2131750301, null), false, true);
        } else {
            c51Var.i(ob6.M0(2131750306, null), false, true);
        }
        kv4 kv4Var3 = this.Y1;
        if (kv4Var3 != null && kv4Var3.f != null) {
            boolean g = kv4Var3.g(currentTime);
            kv4 kv4Var4 = this.Y1;
            if (g) {
                c51Var.g(ob6.a0(null, null, 2131750296, ob6.c0(kv4Var4.f.start_date - currentTime)), false);
            } else {
                c51Var.g(ob6.a0(null, null, 2131750282, ob6.c0(kv4Var4.f.end_date - currentTime)), false);
            }
        }
        c51Var.setOnClickListener(new az(this, j, context, vnbVar3, ex4Var, (byte) 1));
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(this.n1, getContext(), this.a, 0, true, new c(this, (byte) 12), this.J0);
        this.Z1 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        return "";
    }

    @Override
    public final void dismiss() {
        ov4.c(this.a).n(this.S1, this);
        super.dismiss();
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            int f = vm2.f(0.1f, aob.v0(aob.i5, this.J0), aob.v0(aob.h5, this.J0));
            if (f != this.a2) {
                this.a2 = f;
                s0(f);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void q(kv4 kv4Var) {
        this.Y1 = kv4Var;
    }
}
