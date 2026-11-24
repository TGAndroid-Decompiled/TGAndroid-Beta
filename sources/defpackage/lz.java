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
public final class lz extends fy0 implements jt4 {
    public final long S1;
    public final fz T1;
    public final LinearLayout U1;
    public final gz V1;
    public final TextView W1;
    public final iz X1;
    public gt4 Y1;
    public l5c Z1;
    public int a2;

    public lz(Context context, wjb wjbVar, long j, TL_stars.StarGift starGift, ArrayList arrayList, av4 av4Var, boolean z) {
        super(context, null, false, false, 1, wjbVar);
        int i;
        pb0 pb0Var;
        TLRPC.User user;
        long e;
        ?? r12;
        Context context2;
        wjb wjbVar2;
        l46 l46Var;
        long j2 = starGift.id;
        this.S1 = j2;
        this.E1 = gl.L(6.0f);
        this.u1 = 0.2f;
        s0(bm2.f(0.1f, bkb.v0(bkb.h5, this.J0), bkb.v0(bkb.g5, this.J0)));
        K();
        LinearLayout linearLayout = new LinearLayout(context);
        this.U1 = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        fz fzVar = new fz(this, context);
        this.T1 = fzVar;
        linearLayout.addView(fzVar);
        u41 u41Var = new u41(wjbVar, context, true);
        u41Var.f();
        FrameLayout.LayoutParams d = nme.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i2 = d.leftMargin;
        int i3 = this.u0;
        d.leftMargin = i2 + i3;
        d.rightMargin += i3;
        this.b.addView(u41Var, d);
        o39 o39Var = this.n1;
        int i4 = this.u0;
        o39Var.setPadding(i4, 0, i4, gl.L(64.0f));
        this.Z1.O(false);
        if (z) {
            i = 220;
        } else {
            i = 208;
        }
        int i5 = i;
        this.Y1 = kt4.c(this.a).l(j2, this);
        gz gzVar = new gz(this, context, wjbVar, new b1(this, (byte) 28), new x00((byte) 1), new x00((byte) 1), new x00((byte) 1), new x00((byte) 1), new x00((byte) 1), new x00((byte) 1), i5);
        this.V1 = gzVar;
        gzVar.d(new xpa(1, 1));
        gzVar.setPreviewingAttributes(arrayList);
        gzVar.removeView(gzVar.Q);
        fzVar.addView(gzVar, 0, nme.e(-1, i5, 48));
        be0 be0Var = new be0(context);
        be0Var.setRoundRadius(gl.L(45.0f));
        fzVar.addView(be0Var, nme.d(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        int i6 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i7 = this.a;
        if (i6 == 0) {
            TLRPC.User V1 = na7.q1(i7).V1(Long.valueOf(y6c.h(this.a).e()));
            pb0Var = new pb0(0, V1);
            user = V1;
        } else if (i6 > 0) {
            TLRPC.User V12 = na7.q1(i7).V1(Long.valueOf(j));
            pb0Var = new pb0(0, V12);
            user = V12;
        } else {
            TLRPC.Chat K0 = na7.q1(i7).K0(Long.valueOf(-j));
            pb0Var = new pb0(K0);
            user = K0;
        }
        be0Var.f(user, pb0Var);
        TextView textView = new TextView(context);
        this.W1 = textView;
        ug8.v(textView, 1, 21.0f);
        if (i6 != 0) {
            e = j;
        } else {
            e = y6c.h(this.a).e();
        }
        textView.setText(cf3.s(e));
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setPadding(0, 0, gl.L(36.0f), 0);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        fzVar.addView(textView, nme.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        textView2.setGravity(17);
        textView2.setTextColor(-1342177281);
        if (z) {
            textView2.setText(k96.M0(2131749792, null));
            context2 = context;
            r12 = 0;
            wjbVar2 = wjbVar;
        } else {
            textView2.setText(gl.E2(k96.M0(2131750333, null), false, gl.L(2.6666667f), gl.L(1.0f)));
            r12 = 0;
            context2 = context;
            wjbVar2 = wjbVar;
            textView2.setOnClickListener(new zy(context, wjbVar, j, starGift, arrayList));
            ote.b(textView2, 0.02f, 1.5f);
        }
        fzVar.addView(textView2, nme.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        nv4 nv4Var = new nv4(this.a, wjbVar2, context2);
        nv4Var.d0 = true;
        wjb wjbVar3 = wjbVar2;
        nv4Var.h(starGift, true, false, false, false, false);
        nv4Var.setImageSize(gl.L(84.0f));
        nv4Var.setImageLayer(7);
        nv4Var.K.setVisibility(8);
        nv4Var.e.g(r12);
        nv4Var.setRibbonTextOneOf(this.Y1.d.availability_total);
        linearLayout2.addView(nv4Var, nme.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131231243);
        imageView.setScaleX(-1.0f);
        zkb.s(imageView, bkb.l6, wjbVar3, PorterDuff.Mode.SRC_IN);
        linearLayout2.addView(imageView, nme.q(24, 24, 0.0f, 16, 12, 0, 12, 0));
        iz izVar = new iz(this, context, this.a, wjbVar3);
        this.X1 = izVar;
        izVar.d.removeView(izVar.E);
        izVar.d0 = true;
        izVar.h(starGift, true, false, false, false, false);
        izVar.setImageSize(gl.L(100.0f));
        izVar.setImageLayer(7);
        izVar.K.setVisibility(8);
        izVar.e.g(r12);
        izVar.setRibbonTextOneOf(this.Y1.d.availability_total);
        izVar.setRibbonText(k96.M0(2131750303, r12));
        linearLayout2.addView(izVar, nme.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(k96.M0(2131749815, r12));
        int i8 = bkb.x6;
        zkb.X(textView3, i8, wjbVar3);
        float i9 = Utilities.i(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int L = gl.L(14.0f);
        int i10 = bkb.c6;
        int v0 = bkb.v0(i10, wjbVar3);
        int i11 = bkb.F6;
        Drawable b0 = bkb.b0(L, bm2.f(0.2f, v0, bkb.v0(i11, wjbVar3)));
        frameLayout.setBackground(b0);
        ukb o = zkb.o(frameLayout, true);
        o.d = b0;
        o.e = r12;
        o.f = r12;
        tkb tkbVar = new tkb();
        o.e = tkbVar;
        tkbVar.c(i10, i11, 3, 0.2f, wjbVar3);
        tkbVar.g = zkb.t(b0);
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(gl.o());
        zkb.X(textView4, i11, wjbVar3);
        textView4.setText(k96.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        TextView l = ug8.l(frameLayout, textView4, nme.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        l.setTextSize(1, 13.0f);
        l.setGravity(21);
        l.setTypeface(gl.o());
        zkb.X(l, i11, wjbVar3);
        l.setText(k96.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(l, nme.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View jzVar = new jz(context, i9);
        int L2 = gl.L(14.0f);
        int i12 = bkb.Ei;
        Drawable b02 = bkb.b0(L2, bkb.v0(i12, wjbVar3));
        vkb M = zkb.M(i12);
        jzVar.setBackground(b02);
        zkb.j(jzVar, b02, M, null, wjbVar3);
        frameLayout.addView(jzVar, nme.e(-1, -1, 119));
        kz kzVar = new kz(context, i9);
        kzVar.setWillNotDraw(false);
        frameLayout.addView(kzVar, nme.e(-1, -1, 119));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(gl.o());
        textView5.setTextColor(-1);
        textView5.setText(k96.H(',', "Gift2AvailabilityLeft", starGift.availability_remains));
        kzVar.addView(textView5, nme.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(gl.o());
        textView6.setTextColor(-1);
        textView6.setText(k96.H(',', "Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        kzVar.addView(textView6, nme.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        gt4 gt4Var = this.Y1;
        if (gt4Var != null && gt4Var.f != null) {
            l46Var = new l46(context, null);
            l46Var.setTextSize(1, 13.0f);
            l46Var.setGravity(17);
            zkb.X(l46Var, i8, wjbVar3);
            l46Var.setText(gl.R2(k96.V(null, null, 2131750342, k96.E(starGift.availability_total, ','), Integer.valueOf(this.Y1.f.total_rounds), Integer.valueOf(starGift.gifts_per_round), gl.E2(gl.N2(k96.M0(2131750341, null), -1, 0, new xy(context, wjbVar3, starGift, (byte) 1), null), true, gl.L(2.6666667f), gl.L(1.0f)))));
            zkb.G(l46Var, bkb.I6, wjbVar3);
        } else {
            l46Var = null;
        }
        if (z) {
            if (context != null) {
                TextView textView7 = new TextView(context);
                textView7.setTypeface(gl.o());
                textView7.setGravity(17);
                textView7.setText(k96.a0(null, null, 2131749793, starGift.title));
                textView7.setTextSize(1, 20.0f);
                zkb.X(textView7, i11, wjbVar3);
                linearLayout.addView(textView7, nme.t(-1, -2, 17, 20, 14, 20, 6));
                TextView textView8 = new TextView(context);
                textView8.setGravity(17);
                tb4.u(14.0f, 2131749791, 1, textView8, null);
                zkb.X(textView8, i11, wjbVar3);
                linearLayout.addView(textView8, nme.t(-1, -2, 17, 20, 0, 20, 16));
                kh8 kh8Var = new kh8(context, wjbVar3);
                kh8Var.a.l(k96.M0(2131749799, null), false);
                kh8Var.b.setText(k96.M0(2131749798, null));
                kh8Var.d.setVisibility(8);
                ImageView imageView2 = kh8Var.c;
                imageView2.setImageResource(2131232126);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                zkb.s(imageView2, i11, wjbVar3, mode);
                linearLayout.addView(kh8Var, nme.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                kh8 kh8Var2 = new kh8(context, wjbVar3);
                kh8Var2.a.l(k96.M0(2131749797, null), false);
                kh8Var2.b.setText(k96.M0(2131749796, null));
                kh8Var2.d.setVisibility(8);
                ImageView imageView3 = kh8Var2.c;
                imageView3.setImageResource(2131231804);
                zkb.s(imageView3, i11, wjbVar3, mode);
                linearLayout.addView(kh8Var2, nme.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                kh8 kh8Var3 = new kh8(context, wjbVar3);
                kh8Var3.a.l(k96.M0(2131749795, null), false);
                kh8Var3.b.setText(k96.M0(2131749794, null));
                kh8Var3.d.setVisibility(8);
                ImageView imageView4 = kh8Var3.c;
                imageView4.setImageResource(2131231915);
                zkb.s(imageView4, i11, wjbVar3, mode);
                linearLayout.addView(kh8Var3, nme.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
            }
            u41Var.i(vqa.k2(k96.M0(2131743649, null)), false, true);
            u41Var.setOnClickListener(new j1(this, (byte) 12));
            return;
        }
        linearLayout.addView(linearLayout2, nme.k(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
        linearLayout.addView(textView3, nme.k(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
        linearLayout.addView(frameLayout, nme.k(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
        if (l46Var != null) {
            linearLayout.addView(l46Var, nme.k(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
        }
        int currentTime = ConnectionsManager.getInstance(this.a).getCurrentTime();
        gt4 gt4Var2 = this.Y1;
        if (gt4Var2 != null && gt4Var2.g(currentTime)) {
            u41Var.i(k96.M0(2131750324, null), false, true);
        } else {
            u41Var.i(k96.M0(2131750329, null), false, true);
        }
        gt4 gt4Var3 = this.Y1;
        if (gt4Var3 != null && gt4Var3.f != null) {
            boolean g = gt4Var3.g(currentTime);
            gt4 gt4Var4 = this.Y1;
            if (g) {
                u41Var.g(k96.a0(null, null, 2131750319, k96.c0(gt4Var4.f.start_date - currentTime)), false);
            } else {
                u41Var.g(k96.a0(null, null, 2131750305, k96.c0(gt4Var4.f.end_date - currentTime)), false);
            }
        }
        u41Var.setOnClickListener(new zy(this, j, context, wjbVar3, av4Var, (byte) 1));
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(this.n1, getContext(), this.a, 0, true, new f(this, (byte) 12), this.J0);
        this.Z1 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        return "";
    }

    @Override
    public final void dismiss() {
        kt4.c(this.a).n(this.S1, this);
        super.dismiss();
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            int f = bm2.f(0.1f, bkb.v0(bkb.h5, this.J0), bkb.v0(bkb.g5, this.J0));
            if (f != this.a2) {
                this.a2 = f;
                s0(f);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void r(gt4 gt4Var) {
        this.Y1 = gt4Var;
    }
}
