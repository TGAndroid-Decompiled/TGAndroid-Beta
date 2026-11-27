package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
public final class hw4 extends nx0 {
    public boolean A1;
    public final fw4 B1;
    public final TL_stars.TL_starGiftUnique C1;
    public final long D1;
    public gw4 E1;
    public boolean F1;
    public final zua l1;
    public final bvc m1;
    public final sz4 n1;
    public final ll0 o1;
    public final z92 p1;
    public final v2d q1;
    public final dw4 r1;
    public final FrameLayout s1;
    public final og2 t1;
    public final TextView u1;
    public final in v1;
    public final ImageView w1;
    public final Drawable x1;
    public final int y1;
    public int z1;

    public hw4(Context context, vnb vnbVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j) {
        super((vnb) null, context, true, true);
        boolean z;
        zu1 zu1Var;
        this.m1 = new bvc();
        v2d v2dVar = new v2d(new aw4(this, (byte) 0));
        this.q1 = v2dVar;
        hl.S(getWindow());
        this.C1 = tL_starGiftUnique;
        this.D1 = j;
        this.y1 = uc7.s1(this.a).k4.M1.f();
        ?? obj = new Object();
        this.n1 = obj;
        ll0 ll0Var = new ll0(obj, obj, obj);
        this.o1 = ll0Var;
        cw4 cw4Var = new cw4(this, context);
        this.b = cw4Var;
        int i = this.u0;
        cw4Var.setPadding(i, 0, i, 0);
        yic yicVar = new yic(this.b);
        ViewGroup viewGroup = this.b;
        ll0Var.h = yicVar;
        ll0Var.i = viewGroup;
        j1d j1dVar = new j1d(this.c);
        ViewGroup viewGroup2 = this.b;
        v2dVar.E = j1dVar;
        v2dVar.F = viewGroup2;
        j1dVar.d.add(v2dVar);
        Drawable d = mm8.d(null, this.a, j, aob.I.o());
        this.x1 = d;
        cw4Var.U(d);
        zua zuaVar = new zua(this.a, vnbVar, context);
        this.l1 = zuaVar;
        zuaVar.a(tL_starGiftUnique, yac.h(this.a).e(), null, ob6.M0(2131749690, null), false);
        zuaVar.setPadding(0, hl.L(4.0f), 0, hl.L(4.0f));
        zuaVar.setLayoutBackground(new pnb(zuaVar, this.b, hl.L(18.0f), F0("paintChatActionBackground")));
        cw4Var.addView(zuaVar, tre.e(-2, -2, 48));
        z92 z92Var = new z92(context);
        this.p1 = z92Var;
        z92Var.setClipChildren(false);
        z92Var.setWindowInsetsProvider(v2dVar);
        z92Var.setInputIslandBubbleDrawable(ll0Var.c(z92Var, dtd.b(vnbVar), false));
        z92Var.setUnderKeyboardBackgroundDrawable(ll0Var.c(z92Var, dtd.b(vnbVar), false));
        FrameLayout inputIslandBubbleContainer = z92Var.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = z92Var.getInAppKeyboardBubbleContainer();
        dw4 dw4Var = new dw4(this, hl.u0(), cw4Var);
        this.r1 = dw4Var;
        dw4Var.setInAppInsetsController(v2dVar);
        dw4Var.setOverrideHint(ob6.M0(2131749695, null));
        dw4Var.i6 = false;
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        dw4Var.h6 = false;
        if (!hl.E && ((zu1Var = dw4Var.E3) == null || !zu1Var.isInBubbleMode())) {
            z = true;
        } else {
            z = false;
        }
        dw4Var.X2 = z;
        dw4Var.G1(false, false, false);
        dw4Var.R1(true, false);
        dw4Var.o2.setPadding(0, hl.L(1.0f), hl.L(20.0f), 0);
        dw4Var.getSendButton().setAlpha(0.0f);
        dw4Var.getEditField().setMaxLines(3);
        dw4Var.setCustomWindowView(this.c);
        dw4Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(dw4Var, tre.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.b.addView(z92Var.getFadeView(), tre.c(-1.0f, -1));
        this.b.addView(z92Var, tre.c(-1.0f, -1));
        dw4Var.setDelegate(new ew4(this, tL_starGiftUnique));
        tx1 tx1Var = dw4Var.F0;
        Object obj2 = new Object();
        InputFilter[] filters = tx1Var.getFilters();
        if (filters == null) {
            tx1Var.setFilters(new InputFilter[]{obj2});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = obj2;
            tx1Var.setFilters(inputFilterArr);
        }
        in inVar = new in(context, false, false, false);
        this.v1 = inVar;
        inVar.setAllowCancel(true);
        inVar.setScaleProperty(0.6f);
        inVar.setVisibility(8);
        inVar.setTextSize(hl.L(15.0f));
        yob.U(inVar, aob.y6, vnbVar);
        inVar.setTypeface(hl.o());
        inVar.setGravity(17);
        this.b.addView(inVar, tre.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        ?? bz1Var = new bz1(2131232710, vnbVar, context, false);
        this.B1 = bz1Var;
        int L = hl.L(38.0f);
        int L2 = hl.L(38.0f);
        bz1Var.L = L;
        bz1Var.M = L2;
        bz1Var.P = hl.L(6.0f);
        bz1Var.Q = hl.L(8.0f);
        bz1Var.t0 = true;
        this.b.addView((View) bz1Var, tre.e(110, 50, 85));
        bz1Var.setScrimViewBackgroundColor(aob.v0(aob.d6, this.J0));
        bz1Var.setOnClickListener(new View.OnClickListener(this) {
            public final hw4 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                hw4 hw4Var = this.b;
                switch (b) {
                    case 0:
                        if (hw4Var.y1 - hw4Var.z1 < 0) {
                            hl.z3(hw4Var.v1);
                            return;
                        }
                        gw4 gw4Var = hw4Var.E1;
                        if (gw4Var != null) {
                            gw4Var.b(hw4Var.r1.getTextWithEntities(), hw4Var.A1);
                            return;
                        }
                        return;
                    case 1:
                        boolean z2 = hw4Var.A1;
                        hw4Var.A1 = !z2;
                        hw4Var.t1.a(z2, true);
                        return;
                    default:
                        hw4Var.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.u1 = textView;
        int i2 = aob.Zc;
        qd4.w(textView, i2, vnbVar, 1, 14.0f);
        textView.setText(ob6.M0(2131749691, null));
        textView.setGravity(17);
        textView.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
        textView.setBackground(new pnb(textView, this.b, hl.L(23.0f) / 2, F0("paintChatActionBackground")));
        this.b.addView(textView, tre.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s1 = frameLayout;
        TextView textView2 = new TextView(context);
        yob.X(textView2, i2, vnbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(hl.o());
        textView2.setText(ob6.M0(2131749692, null));
        frameLayout.addView(textView2, tre.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        og2 og2Var = new og2(18, vnbVar, context);
        this.t1 = og2Var;
        og2Var.getCheckBoxBase().j(true);
        og2Var.getCheckBoxBase().e = 0.9f;
        og2Var.b(i2, i2, aob.k7);
        og2Var.setDrawUnchecked(true);
        og2Var.a(!this.A1, false);
        zuaVar.getLayout().V = new aw4(this, (byte) 1);
        zuaVar.getLayout().U = new aw4(this, (byte) 2);
        og2Var.setDrawBackgroundAsArc(10);
        frameLayout.addView(og2Var, tre.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new pnb(frameLayout, this.b, hl.L(16.0f), F0("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final hw4 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                hw4 hw4Var = this.b;
                switch (b) {
                    case 0:
                        if (hw4Var.y1 - hw4Var.z1 < 0) {
                            hl.z3(hw4Var.v1);
                            return;
                        }
                        gw4 gw4Var = hw4Var.E1;
                        if (gw4Var != null) {
                            gw4Var.b(hw4Var.r1.getTextWithEntities(), hw4Var.A1);
                            return;
                        }
                        return;
                    case 1:
                        boolean z2 = hw4Var.A1;
                        hw4Var.A1 = !z2;
                        hw4Var.t1.a(z2, true);
                        return;
                    default:
                        hw4Var.dismiss();
                        return;
                }
            }
        });
        this.b.addView(frameLayout, tre.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.w1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231272);
        pnb pnbVar = new pnb(imageView, this.b, hl.L(16.0f), F0("paintChatActionBackground"));
        int L3 = hl.L(32.0f);
        int L4 = hl.L(32.0f);
        Matrix matrix = uk0.a;
        imageView.setBackground(new tk0(L3, L4, pnbVar));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final hw4 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                hw4 hw4Var = this.b;
                switch (b) {
                    case 0:
                        if (hw4Var.y1 - hw4Var.z1 < 0) {
                            hl.z3(hw4Var.v1);
                            return;
                        }
                        gw4 gw4Var = hw4Var.E1;
                        if (gw4Var != null) {
                            gw4Var.b(hw4Var.r1.getTextWithEntities(), hw4Var.A1);
                            return;
                        }
                        return;
                    case 1:
                        boolean z2 = hw4Var.A1;
                        hw4Var.A1 = !z2;
                        hw4Var.t1.a(z2, true);
                        return;
                    default:
                        hw4Var.dismiss();
                        return;
                }
            }
        });
        this.b.addView(imageView, tre.e(56, 56, 53));
        iye.b(frameLayout, 0.05f, 1.2f);
        iye.a(imageView);
        ViewGroup viewGroup3 = this.b;
        lu3 lu3Var = new lu3(this, (byte) 27);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(viewGroup3, lu3Var);
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final void E0() {
        v2d v2dVar = this.q1;
        int i = v2dVar.f(647).b;
        float inputBubbleHeight = this.p1.getInputBubbleHeight() + v2dVar.d() + hl.L(9.0f);
        int height = this.b.getHeight();
        zua zuaVar = this.l1;
        float L = (((hl.L(36.0f) + i) - (hl.L(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - zuaVar.getHeight()) / 2.0f);
        float height2 = (this.b.getHeight() - inputBubbleHeight) - hl.L(14.0f);
        FrameLayout frameLayout = this.s1;
        zuaVar.setTranslationY(Math.min(L, ((height2 - frameLayout.getHeight()) - hl.L(10.0f)) - zuaVar.getHeight()));
        zuaVar.invalidate();
        float y = zuaVar.getY() - hl.L(33.0f);
        TextView textView = this.u1;
        textView.setTranslationY(y);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + hl.L(14.0f)));
        frameLayout.invalidate();
        ImageView imageView = this.w1;
        imageView.setTranslationY(i);
        imageView.invalidate();
    }

    public final Paint F0(String str) {
        Paint paint;
        vnb vnbVar = this.J0;
        if (vnbVar != null) {
            paint = vnbVar.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return aob.T0("paintChatActionBackground");
    }

    public final void G0(boolean z) {
        if (this.F1 != z) {
            this.F1 = z;
            this.B1.h(z);
        }
    }

    @Override
    public final void H() {
        super.H();
        this.r1.g1();
    }

    @Override
    public final void onBackPressed() {
        dw4 dw4Var = this.r1;
        if (dw4Var != null && dw4Var.U0()) {
            dw4Var.N0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            fw4 fw4Var = this.B1;
            if (fw4Var != null) {
                fw4Var.setScrimViewBackgroundColor(aob.v0(aob.d6, this.J0));
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void x() {
        r0(false);
        t10 t10Var = new t10(this, (byte) 10);
        ex0 ex0Var = this.c;
        v21.a(ex0Var, t10Var);
        mg5 mg5Var = mg5.s;
        if (mg5Var.c()) {
            mg5Var.b();
            TLObject b2 = uc7.s1(this.a).b2(this.D1);
            StringBuilder sb = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C1;
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            new d31(ex0Var, this.J0).V(Arrays.asList(b2), ob6.M0(2131749694, null), hl.S2(ob6.a0(null, null, 2131749696, wf3.t(b2), qu6.m(tL_starGiftUnique.num, ',', sb))), null).k(true);
        }
    }
}
