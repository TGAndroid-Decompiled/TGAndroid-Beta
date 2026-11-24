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
public final class du4 extends fx0 {
    public boolean A1;
    public final bu4 B1;
    public final TL_stars.TL_starGiftUnique C1;
    public final long D1;
    public cu4 E1;
    public boolean F1;
    public final yqa l1;
    public final nqc m1;
    public final mx4 n1;
    public final kl0 o1;
    public final j92 p1;
    public final fyc q1;
    public final zt4 r1;
    public final FrameLayout s1;
    public final wf2 t1;
    public final TextView u1;
    public final hn v1;
    public final ImageView w1;
    public final Drawable x1;
    public final int y1;
    public int z1;

    public du4(Context context, wjb wjbVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j) {
        super((wjb) null, context, true, true);
        boolean z;
        mu1 mu1Var;
        this.m1 = new nqc();
        fyc fycVar = new fyc(new wt4(this, (byte) 0));
        this.q1 = fycVar;
        gl.S(getWindow());
        this.C1 = tL_starGiftUnique;
        this.D1 = j;
        this.y1 = na7.q1(this.a).k4.E1.f();
        ?? obj = new Object();
        this.n1 = obj;
        kl0 kl0Var = new kl0(obj, obj, obj);
        this.o1 = kl0Var;
        yt4 yt4Var = new yt4(this, context);
        this.b = yt4Var;
        int i = this.u0;
        yt4Var.setPadding(i, 0, i, 0);
        zec zecVar = new zec(this.b);
        ViewGroup viewGroup = this.b;
        kl0Var.h = zecVar;
        kl0Var.i = viewGroup;
        twc twcVar = new twc(this.c);
        ViewGroup viewGroup2 = this.b;
        fycVar.E = twcVar;
        fycVar.F = viewGroup2;
        twcVar.d.add(fycVar);
        Drawable d = zi8.d(null, this.a, j, bkb.I.o());
        this.x1 = d;
        yt4Var.U(d);
        yqa yqaVar = new yqa(this.a, wjbVar, context);
        this.l1 = yqaVar;
        yqaVar.a(tL_starGiftUnique, y6c.h(this.a).e(), null, k96.M0(2131749728, null), false);
        yqaVar.setPadding(0, gl.L(4.0f), 0, gl.L(4.0f));
        yqaVar.setLayoutBackground(new qjb(yqaVar, this.b, gl.L(18.0f), E0("paintChatActionBackground")));
        yt4Var.addView(yqaVar, nme.e(-2, -2, 48));
        j92 j92Var = new j92(context);
        this.p1 = j92Var;
        j92Var.setClipChildren(false);
        j92Var.setWindowInsetsProvider(fycVar);
        j92Var.setInputIslandBubbleDrawable(kl0Var.c(j92Var, nod.b(wjbVar), false));
        j92Var.setUnderKeyboardBackgroundDrawable(kl0Var.c(j92Var, nod.b(wjbVar), false));
        FrameLayout inputIslandBubbleContainer = j92Var.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = j92Var.getInAppKeyboardBubbleContainer();
        zt4 zt4Var = new zt4(this, gl.u0(), yt4Var);
        this.r1 = zt4Var;
        zt4Var.setInAppInsetsController(fycVar);
        zt4Var.setOverrideHint(k96.M0(2131749733, null));
        zt4Var.X5 = false;
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        zt4Var.W5 = false;
        if (!gl.E && ((mu1Var = zt4Var.F3) == null || !mu1Var.isInBubbleMode())) {
            z = true;
        } else {
            z = false;
        }
        zt4Var.Y2 = z;
        zt4Var.w1(false, false, false);
        zt4Var.H1(true, false);
        zt4Var.p2.setPadding(0, gl.L(1.0f), gl.L(20.0f), 0);
        zt4Var.getSendButton().setAlpha(0.0f);
        zt4Var.getEditField().setMaxLines(3);
        zt4Var.setCustomWindowView(this.c);
        zt4Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(zt4Var, nme.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.b.addView(j92Var.getFadeView(), nme.c(-1.0f, -1));
        this.b.addView(j92Var, nme.c(-1.0f, -1));
        zt4Var.setDelegate(new au4(this, tL_starGiftUnique));
        ex1 ex1Var = zt4Var.F0;
        Object obj2 = new Object();
        InputFilter[] filters = ex1Var.getFilters();
        if (filters == null) {
            ex1Var.setFilters(new InputFilter[]{obj2});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = obj2;
            ex1Var.setFilters(inputFilterArr);
        }
        hn hnVar = new hn(context, false, false, false);
        this.v1 = hnVar;
        hnVar.setAllowCancel(true);
        hnVar.setScaleProperty(0.6f);
        hnVar.setVisibility(8);
        hnVar.setTextSize(gl.L(15.0f));
        zkb.U(hnVar, bkb.x6, wjbVar);
        hnVar.setTypeface(gl.o());
        hnVar.setGravity(17);
        this.b.addView(hnVar, nme.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        ?? ky1Var = new ky1(2131232699, wjbVar, context, false);
        this.B1 = ky1Var;
        int L = gl.L(38.0f);
        int L2 = gl.L(38.0f);
        ky1Var.L = L;
        ky1Var.M = L2;
        ky1Var.P = gl.L(6.0f);
        ky1Var.Q = gl.L(8.0f);
        ky1Var.s0 = true;
        this.b.addView((View) ky1Var, nme.e(110, 50, 85));
        ky1Var.setScrimViewBackgroundColor(bkb.v0(bkb.c6, this.J0));
        ky1Var.setOnClickListener(new View.OnClickListener(this) {
            public final du4 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                du4 du4Var = this.b;
                switch (b) {
                    case 0:
                        if (du4Var.y1 - du4Var.z1 < 0) {
                            gl.z3(du4Var.v1);
                            return;
                        }
                        cu4 cu4Var = du4Var.E1;
                        if (cu4Var != null) {
                            cu4Var.b(du4Var.r1.getTextWithEntities(), du4Var.A1);
                            return;
                        }
                        return;
                    case 1:
                        boolean z2 = du4Var.A1;
                        du4Var.A1 = !z2;
                        du4Var.t1.a(z2, true);
                        return;
                    default:
                        du4Var.dismiss();
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.u1 = textView;
        int i2 = bkb.Yc;
        tb4.w(textView, i2, wjbVar, 1, 14.0f);
        textView.setText(k96.M0(2131749729, null));
        textView.setGravity(17);
        textView.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
        textView.setBackground(new qjb(textView, this.b, gl.L(23.0f) / 2, E0("paintChatActionBackground")));
        this.b.addView(textView, nme.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s1 = frameLayout;
        TextView textView2 = new TextView(context);
        zkb.X(textView2, i2, wjbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gl.o());
        textView2.setText(k96.M0(2131749730, null));
        frameLayout.addView(textView2, nme.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        wf2 wf2Var = new wf2(18, wjbVar, context);
        this.t1 = wf2Var;
        wf2Var.getCheckBoxBase().j(true);
        wf2Var.getCheckBoxBase().e = 0.9f;
        wf2Var.b(i2, i2, bkb.j7);
        wf2Var.setDrawUnchecked(true);
        wf2Var.a(!this.A1, false);
        yqaVar.getLayout().V = new wt4(this, (byte) 1);
        yqaVar.getLayout().U = new wt4(this, (byte) 2);
        wf2Var.setDrawBackgroundAsArc(10);
        frameLayout.addView(wf2Var, nme.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new qjb(frameLayout, this.b, gl.L(16.0f), E0("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) {
            public final du4 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                du4 du4Var = this.b;
                switch (b) {
                    case 0:
                        if (du4Var.y1 - du4Var.z1 < 0) {
                            gl.z3(du4Var.v1);
                            return;
                        }
                        cu4 cu4Var = du4Var.E1;
                        if (cu4Var != null) {
                            cu4Var.b(du4Var.r1.getTextWithEntities(), du4Var.A1);
                            return;
                        }
                        return;
                    case 1:
                        boolean z2 = du4Var.A1;
                        du4Var.A1 = !z2;
                        du4Var.t1.a(z2, true);
                        return;
                    default:
                        du4Var.dismiss();
                        return;
                }
            }
        });
        this.b.addView(frameLayout, nme.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.w1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231272);
        qjb qjbVar = new qjb(imageView, this.b, gl.L(16.0f), E0("paintChatActionBackground"));
        int L3 = gl.L(32.0f);
        int L4 = gl.L(32.0f);
        Matrix matrix = tk0.a;
        imageView.setBackground(new sk0(L3, L4, qjbVar));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final du4 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                du4 du4Var = this.b;
                switch (b) {
                    case 0:
                        if (du4Var.y1 - du4Var.z1 < 0) {
                            gl.z3(du4Var.v1);
                            return;
                        }
                        cu4 cu4Var = du4Var.E1;
                        if (cu4Var != null) {
                            cu4Var.b(du4Var.r1.getTextWithEntities(), du4Var.A1);
                            return;
                        }
                        return;
                    case 1:
                        boolean z2 = du4Var.A1;
                        du4Var.A1 = !z2;
                        du4Var.t1.a(z2, true);
                        return;
                    default:
                        du4Var.dismiss();
                        return;
                }
            }
        });
        this.b.addView(imageView, nme.e(56, 56, 53));
        ote.b(frameLayout, 0.05f, 1.2f);
        ote.a(imageView);
        ViewGroup viewGroup3 = this.b;
        kx3 kx3Var = new kx3(this, (byte) 24);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(viewGroup3, kx3Var);
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final void D0() {
        fyc fycVar = this.q1;
        int i = fycVar.f(647).b;
        float inputBubbleHeight = this.p1.getInputBubbleHeight() + fycVar.d() + gl.L(9.0f);
        int height = this.b.getHeight();
        yqa yqaVar = this.l1;
        float L = (((gl.L(36.0f) + i) - (gl.L(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - yqaVar.getHeight()) / 2.0f);
        float height2 = (this.b.getHeight() - inputBubbleHeight) - gl.L(14.0f);
        FrameLayout frameLayout = this.s1;
        yqaVar.setTranslationY(Math.min(L, ((height2 - frameLayout.getHeight()) - gl.L(10.0f)) - yqaVar.getHeight()));
        yqaVar.invalidate();
        float y = yqaVar.getY() - gl.L(33.0f);
        TextView textView = this.u1;
        textView.setTranslationY(y);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + gl.L(14.0f)));
        frameLayout.invalidate();
        ImageView imageView = this.w1;
        imageView.setTranslationY(i);
        imageView.invalidate();
    }

    public final Paint E0(String str) {
        Paint paint;
        wjb wjbVar = this.J0;
        if (wjbVar != null) {
            paint = wjbVar.d("paintChatActionBackground");
        } else {
            paint = null;
        }
        if (paint != null) {
            return paint;
        }
        return bkb.T0("paintChatActionBackground");
    }

    @Override
    public final void I() {
        super.I();
        this.r1.b1();
    }

    @Override
    public final void onBackPressed() {
        zt4 zt4Var = this.r1;
        if (zt4Var != null && zt4Var.Q0()) {
            zt4Var.J0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            bu4 bu4Var = this.B1;
            if (bu4Var != null) {
                bu4Var.setScrimViewBackgroundColor(bkb.v0(bkb.c6, this.J0));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void x() {
        r0(false);
        s10 s10Var = new s10(this, (byte) 10);
        ww0 ww0Var = this.c;
        m21.a(ww0Var, s10Var);
        le5 le5Var = le5.s;
        if (le5Var.c()) {
            le5Var.b();
            TLObject Z1 = na7.q1(this.a).Z1(this.D1);
            StringBuilder sb = new StringBuilder();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C1;
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            new u21(ww0Var, this.J0).V(Arrays.asList(Z1), k96.M0(2131749732, null), gl.S2(k96.a0(null, null, 2131749734, cf3.t(Z1), ls6.m(tL_starGiftUnique.num, ',', sb))), null).k(true);
        }
    }
}
