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
public final class m00 extends mz0 implements kv4 {
    public final long S1;
    public final g00 T1;
    public final LinearLayout U1;
    public final h00 V1;
    public final TextView W1;
    public final j00 X1;
    public hv4 Y1;
    public l7c Z1;
    public int a2;

    public m00(Context context, ylb ylbVar, long j, TL_stars.StarGift starGift, ArrayList arrayList, bx4 bx4Var, boolean z) {
        super(context, null, false, false, 1, ylbVar);
        pc0 pc0Var;
        TLRPC.User user;
        ?? r12;
        Context context2;
        ylb ylbVar2;
        l66 l66Var;
        long j2 = starGift.id;
        this.S1 = j2;
        this.E1 = gm.L(6.0f);
        this.u1 = 0.2f;
        s0(on2.f(0.1f, cmb.v0(cmb.h5, this.J0), cmb.v0(cmb.g5, this.J0)));
        J();
        LinearLayout linearLayout = new LinearLayout(context);
        this.U1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        g00 g00Var = new g00(this, context);
        this.T1 = g00Var;
        linearLayout.addView(g00Var);
        b61 b61Var = new b61(ylbVar, context, true);
        b61Var.f();
        FrameLayout.LayoutParams d = qoe.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i = d.leftMargin;
        int i2 = this.u0;
        d.leftMargin = i + i2;
        d.rightMargin += i2;
        this.b.addView(b61Var, d);
        r59 r59Var = this.n1;
        int i3 = this.u0;
        r59Var.setPadding(i3, 0, i3, gm.L(64.0f));
        this.Z1.O(false);
        int i4 = z ? 220 : 208;
        this.Y1 = lv4.c(this.a).l(j2, this);
        h00 h00Var = new h00(this, context, ylbVar, new f00(this, (byte) 0), new x10((byte) 1), new x10((byte) 1), new x10((byte) 1), new x10((byte) 1), new x10((byte) 1), new x10((byte) 1), i4);
        this.V1 = h00Var;
        h00Var.d(new xra(1, 1));
        h00Var.setPreviewingAttributes(arrayList);
        h00Var.removeView(h00Var.Q);
        g00Var.addView(h00Var, 0, qoe.e(-1, i4, 48));
        bf0 bf0Var = new bf0(context);
        bf0Var.setRoundRadius(gm.L(45.0f));
        g00Var.addView(bf0Var, qoe.d(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        int i5 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i6 = this.a;
        if (i5 == 0) {
            TLRPC.User W1 = oc7.r1(i6).W1(Long.valueOf(z8c.h(this.a).e()));
            pc0Var = new pc0(0, W1);
            user = W1;
        } else if (i5 > 0) {
            TLRPC.User W12 = oc7.r1(i6).W1(Long.valueOf(j));
            pc0Var = new pc0(0, W12);
            user = W12;
        } else {
            TLRPC.Chat L0 = oc7.r1(i6).L0(Long.valueOf(-j));
            pc0Var = new pc0(L0);
            user = L0;
        }
        bf0Var.f(user, pc0Var);
        TextView textView = new TextView(context);
        this.W1 = textView;
        wi8.v(textView, 1, 21.0f);
        textView.setText(pg3.s(i5 != 0 ? j : z8c.h(this.a).e()));
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setPadding(0, 0, gm.L(36.0f), 0);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        g00Var.addView(textView, qoe.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setPadding(gm.L(8.0f), gm.L(8.0f), gm.L(8.0f), gm.L(8.0f));
        textView2.setGravity(17);
        textView2.setTextColor(-1342177281);
        if (z) {
            textView2.setText(jb6.M0(2131749741, null));
            context2 = context;
            r12 = 0;
            ylbVar2 = ylbVar;
        } else {
            textView2.setText(gm.E2(jb6.M0(2131750282, null), false, gm.L(2.6666667f), gm.L(1.0f)));
            r12 = 0;
            context2 = context;
            ylbVar2 = ylbVar;
            textView2.setOnClickListener(new zz(context, ylbVar, j, starGift, arrayList));
            rve.b(textView2, 0.02f, 1.5f);
        }
        g00Var.addView(textView2, qoe.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        ox4 ox4Var = new ox4(this.a, ylbVar2, context2);
        ox4Var.d0 = true;
        ylb ylbVar3 = ylbVar2;
        ox4Var.h(starGift, true, false, false, false, false);
        ox4Var.setImageSize(gm.L(84.0f));
        ox4Var.setImageLayer(7);
        ox4Var.K.setVisibility(8);
        ox4Var.e.g(r12);
        ox4Var.setRibbonTextOneOf(this.Y1.d.availability_total);
        linearLayout2.addView(ox4Var, qoe.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231244);
        imageView.setScaleX(-1.0f);
        anb.s(imageView, cmb.l6, ylbVar3, PorterDuff.Mode.SRC_IN);
        linearLayout2.addView(imageView, qoe.q(24, 24, 0.0f, 16, 12, 0, 12, 0));
        j00 j00Var = new j00(this, context, this.a, ylbVar3);
        this.X1 = j00Var;
        j00Var.d.removeView(j00Var.E);
        j00Var.d0 = true;
        j00Var.h(starGift, true, false, false, false, false);
        j00Var.setImageSize(gm.L(100.0f));
        j00Var.setImageLayer(7);
        j00Var.K.setVisibility(8);
        j00Var.e.g(r12);
        j00Var.setRibbonTextOneOf(this.Y1.d.availability_total);
        j00Var.setRibbonText(jb6.M0(2131750252, r12));
        linearLayout2.addView(j00Var, qoe.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(jb6.M0(2131749764, r12));
        int i7 = cmb.x6;
        anb.X(textView3, i7, ylbVar3);
        float i8 = Utilities.i(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = gm.L(14.0f);
        int i9 = cmb.c6;
        int v0 = cmb.v0(i9, ylbVar3);
        int i10 = cmb.F6;
        Drawable b0 = cmb.b0(L, on2.f(0.2f, v0, cmb.v0(i10, ylbVar3)));
        frameLayout.setBackground(b0);
        vmb o = anb.o(frameLayout, true);
        o.d = b0;
        o.e = r12;
        o.f = r12;
        umb umbVar = new umb();
        o.e = umbVar;
        umbVar.c(i9, i10, 3, 0.2f, ylbVar3);
        umbVar.g = anb.t(b0);
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(gm.o());
        anb.X(textView4, i10, ylbVar3);
        textView4.setText(jb6.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        TextView l = wi8.l(frameLayout, textView4, qoe.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        l.setTextSize(1, 13.0f);
        l.setGravity(21);
        l.setTypeface(gm.o());
        anb.X(l, i10, ylbVar3);
        l.setText(jb6.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(l, qoe.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View k00Var = new k00(context, i8);
        int L2 = gm.L(14.0f);
        int i11 = cmb.Ei;
        Drawable b02 = cmb.b0(L2, cmb.v0(i11, ylbVar3));
        wmb M = anb.M(i11);
        k00Var.setBackground(b02);
        anb.j(k00Var, b02, M, null, ylbVar3);
        frameLayout.addView(k00Var, qoe.e(-1, -1, 119));
        l00 l00Var = new l00(context, i8);
        l00Var.setWillNotDraw(false);
        frameLayout.addView(l00Var, qoe.e(-1, -1, 119));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(gm.o());
        textView5.setTextColor(-1);
        textView5.setText(jb6.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        l00Var.addView(textView5, qoe.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(gm.o());
        textView6.setTextColor(-1);
        textView6.setText(jb6.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        l00Var.addView(textView6, qoe.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        hv4 hv4Var = this.Y1;
        if (hv4Var == null || hv4Var.f == null) {
            l66Var = null;
        } else {
            l66Var = new l66(context, null);
            l66Var.setTextSize(1, 13.0f);
            l66Var.setGravity(17);
            anb.X(l66Var, i7, ylbVar3);
            l66Var.setText(gm.R2(jb6.V(null, null, 2131750291, jb6.E(starGift.availability_total, ','), Integer.valueOf(this.Y1.f.total_rounds), Integer.valueOf(starGift.gifts_per_round), gm.E2(gm.N2(jb6.M0(2131750290, null), -1, 0, new xz(context, ylbVar3, starGift, (byte) 1), null), true, gm.L(2.6666667f), gm.L(1.0f)))));
            anb.G(l66Var, cmb.I6, ylbVar3);
        }
        if (z) {
            if (context != null) {
                TextView textView7 = new TextView(context);
                textView7.setTypeface(gm.o());
                textView7.setGravity(17);
                textView7.setText(jb6.a0(null, null, 2131749742, starGift.title));
                textView7.setTextSize(1, 20.0f);
                anb.X(textView7, i10, ylbVar3);
                linearLayout.addView(textView7, qoe.t(-1, -2, 17, 20, 14, 20, 6));
                TextView textView8 = new TextView(context);
                textView8.setGravity(17);
                td4.v(14.0f, 2131749740, 1, textView8, null);
                anb.X(textView8, i10, ylbVar3);
                linearLayout.addView(textView8, qoe.t(-1, -2, 17, 20, 0, 20, 16));
                lj8 lj8Var = new lj8(context, ylbVar3);
                lj8Var.a.l(jb6.M0(2131749748, null), false);
                lj8Var.b.setText(jb6.M0(2131749747, null));
                lj8Var.d.setVisibility(8);
                ImageView imageView2 = lj8Var.c;
                imageView2.setImageResource(2131232127);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                anb.s(imageView2, i10, ylbVar3, mode);
                linearLayout.addView(lj8Var, qoe.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                lj8 lj8Var2 = new lj8(context, ylbVar3);
                lj8Var2.a.l(jb6.M0(2131749746, null), false);
                lj8Var2.b.setText(jb6.M0(2131749745, null));
                lj8Var2.d.setVisibility(8);
                ImageView imageView3 = lj8Var2.c;
                imageView3.setImageResource(2131231805);
                anb.s(imageView3, i10, ylbVar3, mode);
                linearLayout.addView(lj8Var2, qoe.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                lj8 lj8Var3 = new lj8(context, ylbVar3);
                lj8Var3.a.l(jb6.M0(2131749744, null), false);
                lj8Var3.b.setText(jb6.M0(2131749743, null));
                lj8Var3.d.setVisibility(8);
                ImageView imageView4 = lj8Var3.c;
                imageView4.setImageResource(2131231916);
                anb.s(imageView4, i10, ylbVar3, mode);
                linearLayout.addView(lj8Var3, qoe.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
            }
            b61Var.i(wsa.k2(jb6.M0(2131743575, null)), false, true);
            b61Var.setOnClickListener(new j1(this, (byte) 13));
            return;
        }
        linearLayout.addView(linearLayout2, qoe.k(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
        linearLayout.addView(textView3, qoe.k(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
        linearLayout.addView(frameLayout, qoe.k(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
        if (l66Var != null) {
            linearLayout.addView(l66Var, qoe.k(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
        }
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        hv4 hv4Var2 = this.Y1;
        if (hv4Var2 != null && hv4Var2.g(currentTime)) {
            b61Var.i(jb6.M0(2131750273, null), false, true);
        } else {
            b61Var.i(jb6.M0(2131750278, null), false, true);
        }
        hv4 hv4Var3 = this.Y1;
        if (hv4Var3 != null && hv4Var3.f != null) {
            boolean g = hv4Var3.g(currentTime);
            hv4 hv4Var4 = this.Y1;
            if (g) {
                b61Var.g(jb6.a0(null, null, 2131750268, jb6.c0(hv4Var4.f.start_date - currentTime)), false);
            } else {
                b61Var.g(jb6.a0(null, null, 2131750254, jb6.c0(hv4Var4.f.end_date - currentTime)), false);
            }
        }
        b61Var.setOnClickListener(new zz(this, j, context, ylbVar3, bx4Var, (byte) 1));
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(this.n1, getContext(), this.a, 0, true, new f(this, (byte) 12), this.J0);
        this.Z1 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        return "";
    }

    @Override
    public final void dismiss() {
        lv4.c(this.a).n(this.S1, this);
        super.dismiss();
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            int f = on2.f(0.1f, cmb.v0(cmb.h5, this.J0), cmb.v0(cmb.g5, this.J0));
            if (f != this.a2) {
                this.a2 = f;
                s0(f);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void q(hv4 hv4Var) {
        this.Y1 = hv4Var;
    }
}
