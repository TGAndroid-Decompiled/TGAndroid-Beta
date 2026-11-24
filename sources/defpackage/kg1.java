package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class kg1 extends FrameLayout {
    public int E;
    public final ig1 F;
    public final o39 G;
    public boolean H;
    public final LinearLayout I;
    public final TLRPC.Chat J;
    public String K;
    public String L;
    public byte M;
    public byte N;
    public int O;
    public int P;
    public final long a;
    public final int b;
    public final uxa c;
    public TL_stories.TL_premium_boostsStatus d;
    public final wjb e;
    public ScrollSlidingTextTabStrip f;
    public final ArrayList h;
    public final ArrayList n;
    public boolean r;
    public int s;
    public boolean w;
    public int x;
    public final ArrayList y;

    public kg1(uxa uxaVar, long j, wjb wjbVar) {
        super(uxaVar.getParentActivity());
        int i = y6c.t0;
        this.b = i;
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.y = new ArrayList();
        this.E = 0;
        ig1 ig1Var = new ig1(this);
        this.F = ig1Var;
        this.K = "";
        this.L = "";
        this.M = (byte) 5;
        this.N = (byte) 5;
        this.c = uxaVar;
        Activity parentActivity = uxaVar.getParentActivity();
        this.e = wjbVar;
        this.a = j;
        this.J = na7.q1(i).K0(Long.valueOf(-j));
        o39 o39Var = new o39(parentActivity, null);
        this.G = o39Var;
        o39Var.setSections(true);
        o39Var.setCaptureSectionsDecoratorAllowed(true);
        o39Var.setLayoutManager(new t26());
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        o39Var.setItemAnimator(gb3Var);
        o39Var.setClipToPadding(false);
        o39Var.setOnItemClickListener(new gg1(this, parentActivity, j, wjbVar, uxaVar));
        addView(o39Var);
        na7.q1(i).E0().a(j, new be2(this, (byte) 14));
        o39Var.setAdapter(ig1Var);
        d(false);
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        this.I = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        imageView.setAutoRepeat(true);
        imageView.f(2131624223, 120, 120, null);
        imageView.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        int i2 = bkb.Ej;
        zkb.X(textView, i2, null);
        textView.setTag(Integer.valueOf(i2));
        textView.setText(k96.M0(2131748585, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i3 = bkb.Fj;
        zkb.X(textView2, i3, null);
        textView2.setTag(Integer.valueOf(i3));
        textView2.setText(k96.M0(2131748584, null));
        textView2.setGravity(1);
        this.I.addView((View) imageView, nme.t(120, 120, 1, 0, 0, 0, 20));
        this.I.addView(textView, nme.t(-2, -2, 1, 0, 0, 0, 10));
        this.I.addView(textView2, nme.r(-2, -2, 1));
        addView(this.I, nme.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.I.setAlpha(0.0f);
        this.I.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        gta.v(i, false).s();
    }

    public final void a(CountDownLatch countDownLatch, hg1 hg1Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.N;
        tL_premium_getBoostsList.offset = this.K;
        int i = this.b;
        tL_premium_getBoostsList.peer = na7.q1(i).h1(this.a);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new en0(this, countDownLatch, hg1Var, (byte) 13), 2);
    }

    public final void b(CountDownLatch countDownLatch, hg1 hg1Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.L;
        int i = this.b;
        tL_premium_getBoostsList.peer = na7.q1(i).h1(this.a);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new en0(this, countDownLatch, hg1Var, (byte) 12), 2);
    }

    public final void c(Boolean bool) {
        if (this.H) {
            return;
        }
        this.H = true;
        if (bool == null) {
            Utilities.e.c(new hg1(this, (byte) 0));
        } else if (bool.booleanValue()) {
            b(null, new hg1(this, (byte) 1));
        } else {
            a(null, new hg1(this, (byte) 2));
        }
    }

    public final void d(boolean z) {
        boolean z2;
        int i;
        int i2;
        boolean z3;
        boolean z4;
        ArrayList arrayList = new ArrayList(this.y);
        this.y.clear();
        if (this.d != null) {
            this.y.add(new ja(4, false));
            this.y.add(new jg1(1, k96.M0(2131744658, null)));
            this.y.add(new ja(0, false));
            this.y.add(new ja(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                this.y.add(new jg1(12, k96.M0(2131753321, null)));
                for (int i3 = 0; i3 < this.d.prepaid_giveaways.size(); i3++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i3);
                    ArrayList arrayList2 = this.y;
                    if (i3 == this.d.prepaid_giveaways.size() - 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    ?? jaVar = new ja(11, true);
                    jaVar.e = prepaidGiveaway;
                    jaVar.f = z4;
                    arrayList2.add(jaVar);
                }
                this.y.add(new jg1(6, k96.M0(2131753283, null)));
            }
            this.y.add(new jg1(13, k96.M0(2131753603, null)));
            int i4 = 2131753601;
            if (this.E == 0) {
                if (this.h.isEmpty()) {
                    this.y.add(new ja(8, false));
                    this.y.add(new ja(2, false));
                } else {
                    for (int i5 = 0; i5 < this.h.size(); i5++) {
                        ArrayList arrayList3 = this.y;
                        TL_stories.Boost boost = (TL_stories.Boost) this.h.get(i5);
                        if (i5 == this.h.size() - 1 && !this.r) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        arrayList3.add(new jg1(boost, z3, this.E));
                    }
                    boolean z5 = this.r;
                    ArrayList arrayList4 = this.y;
                    if (z5) {
                        arrayList4.add(new ja(9, true));
                    } else {
                        arrayList4.add(new ja(7, false));
                    }
                    ArrayList arrayList5 = this.y;
                    if (hc2.V(this.J)) {
                        i4 = 2131753602;
                    }
                    arrayList5.add(new jg1(6, k96.M0(i4, null)));
                }
            } else if (this.n.isEmpty()) {
                this.y.add(new ja(8, false));
                this.y.add(new ja(2, false));
            } else {
                for (int i6 = 0; i6 < this.n.size(); i6++) {
                    ArrayList arrayList6 = this.y;
                    TL_stories.Boost boost2 = (TL_stories.Boost) this.n.get(i6);
                    if (i6 == this.n.size() - 1 && !this.w) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    arrayList6.add(new jg1(boost2, z2, this.E));
                }
                boolean z6 = this.w;
                ArrayList arrayList7 = this.y;
                if (z6) {
                    arrayList7.add(new ja(9, true));
                } else {
                    arrayList7.add(new ja(7, false));
                }
                ArrayList arrayList8 = this.y;
                if (hc2.V(this.J)) {
                    i4 = 2131753602;
                }
                arrayList8.add(new jg1(6, k96.M0(i4, null)));
            }
            this.y.add(new jg1(1, k96.M0(2131748722, null)));
            this.y.add(new jg1(3, this.d.boost_url));
            if (na7.q1(this.b).k4.O1.f && hc2.N(this.J)) {
                ArrayList arrayList9 = this.y;
                if (hc2.V(this.J)) {
                    i = 2131753266;
                } else {
                    i = 2131753265;
                }
                arrayList9.add(new jg1(6, k96.M0(i, null)));
                this.y.add(new ja(10, true));
                ArrayList arrayList10 = this.y;
                if (hc2.V(this.J)) {
                    i2 = 2131753500;
                } else {
                    i2 = 2131753499;
                }
                arrayList10.add(new jg1(6, k96.M0(i2, null)));
            }
        }
        ig1 ig1Var = this.F;
        if (z) {
            ig1Var.E(arrayList, this.y);
        } else {
            ig1Var.f();
        }
    }
}
