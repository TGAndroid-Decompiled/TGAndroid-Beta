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
public final class tg1 extends FrameLayout {
    public int E;
    public final rg1 F;
    public final d79 G;
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
    public final w1b c;
    public TL_stories.TL_premium_boostsStatus d;
    public final vnb e;
    public ScrollSlidingTextTabStrip f;
    public final ArrayList h;
    public final ArrayList n;
    public boolean r;
    public int s;
    public boolean w;
    public int x;
    public final ArrayList y;

    public tg1(w1b w1bVar, long j, vnb vnbVar) {
        super(w1bVar.getParentActivity());
        int i = yac.t0;
        this.b = i;
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.y = new ArrayList();
        this.E = 0;
        rg1 rg1Var = new rg1(this);
        this.F = rg1Var;
        this.K = "";
        this.L = "";
        this.M = (byte) 5;
        this.N = (byte) 5;
        this.c = w1bVar;
        Activity parentActivity = w1bVar.getParentActivity();
        this.e = vnbVar;
        this.a = j;
        this.J = uc7.s1(i).M0(Long.valueOf(-j));
        d79 d79Var = new d79(parentActivity, null);
        this.G = d79Var;
        d79Var.setSections(true);
        d79Var.setCaptureSectionsDecoratorAllowed(true);
        d79Var.setLayoutManager(new x46());
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        d79Var.setItemAnimator(zb3Var);
        d79Var.setClipToPadding(false);
        d79Var.setOnItemClickListener(new pg1(this, parentActivity, j, vnbVar, w1bVar));
        addView(d79Var);
        uc7.s1(i).G0().a(j, new te2(this, (byte) 14));
        d79Var.setAdapter(rg1Var);
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
        textView.setTypeface(hl.o());
        int i2 = aob.Fj;
        yob.X(textView, i2, null);
        textView.setTag(Integer.valueOf(i2));
        textView.setText(ob6.M0(2131748531, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i3 = aob.Gj;
        yob.X(textView2, i3, null);
        textView2.setTag(Integer.valueOf(i3));
        textView2.setText(ob6.M0(2131748530, null));
        textView2.setGravity(1);
        this.I.addView((View) imageView, tre.t(120, 120, 1, 0, 0, 0, 20));
        this.I.addView(textView, tre.t(-2, -2, 1, 0, 0, 0, 10));
        this.I.addView(textView2, tre.r(-2, -2, 1));
        addView(this.I, tre.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        this.I.setAlpha(0.0f);
        this.I.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
        jxa.v(i, false).s();
    }

    public final void a(CountDownLatch countDownLatch, qg1 qg1Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.N;
        tL_premium_getBoostsList.offset = this.K;
        int i = this.b;
        tL_premium_getBoostsList.peer = uc7.s1(i).j1(this.a);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new fn0(this, countDownLatch, qg1Var, (byte) 13), 2);
    }

    public final void b(CountDownLatch countDownLatch, qg1 qg1Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.M;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.L;
        int i = this.b;
        tL_premium_getBoostsList.peer = uc7.s1(i).j1(this.a);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new fn0(this, countDownLatch, qg1Var, (byte) 12), 2);
    }

    public final void c(Boolean bool) {
        if (this.H) {
            return;
        }
        this.H = true;
        if (bool == null) {
            Utilities.e.c(new qg1(this, (byte) 0));
        } else if (bool.booleanValue()) {
            b(null, new qg1(this, (byte) 1));
        } else {
            a(null, new qg1(this, (byte) 2));
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
            this.y.add(new ka(4, false));
            this.y.add(new sg1(1, ob6.M0(2131744552, null)));
            this.y.add(new ka(0, false));
            this.y.add(new ka(2, false));
            if (this.d.prepaid_giveaways.size() > 0) {
                this.y.add(new sg1(12, ob6.M0(2131753317, null)));
                for (int i3 = 0; i3 < this.d.prepaid_giveaways.size(); i3++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.d.prepaid_giveaways.get(i3);
                    ArrayList arrayList2 = this.y;
                    if (i3 == this.d.prepaid_giveaways.size() - 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    ?? kaVar = new ka(11, true);
                    kaVar.e = prepaidGiveaway;
                    kaVar.f = z4;
                    arrayList2.add(kaVar);
                }
                this.y.add(new sg1(6, ob6.M0(2131753279, null)));
            }
            this.y.add(new sg1(13, ob6.M0(2131753599, null)));
            int i4 = 2131753597;
            if (this.E == 0) {
                if (this.h.isEmpty()) {
                    this.y.add(new ka(8, false));
                    this.y.add(new ka(2, false));
                } else {
                    for (int i5 = 0; i5 < this.h.size(); i5++) {
                        ArrayList arrayList3 = this.y;
                        TL_stories.Boost boost = (TL_stories.Boost) this.h.get(i5);
                        if (i5 == this.h.size() - 1 && !this.r) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        arrayList3.add(new sg1(boost, z3, this.E));
                    }
                    boolean z5 = this.r;
                    ArrayList arrayList4 = this.y;
                    if (z5) {
                        arrayList4.add(new ka(9, true));
                    } else {
                        arrayList4.add(new ka(7, false));
                    }
                    ArrayList arrayList5 = this.y;
                    if (xc2.V(this.J)) {
                        i4 = 2131753598;
                    }
                    arrayList5.add(new sg1(6, ob6.M0(i4, null)));
                }
            } else if (this.n.isEmpty()) {
                this.y.add(new ka(8, false));
                this.y.add(new ka(2, false));
            } else {
                for (int i6 = 0; i6 < this.n.size(); i6++) {
                    ArrayList arrayList6 = this.y;
                    TL_stories.Boost boost2 = (TL_stories.Boost) this.n.get(i6);
                    if (i6 == this.n.size() - 1 && !this.w) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    arrayList6.add(new sg1(boost2, z2, this.E));
                }
                boolean z6 = this.w;
                ArrayList arrayList7 = this.y;
                if (z6) {
                    arrayList7.add(new ka(9, true));
                } else {
                    arrayList7.add(new ka(7, false));
                }
                ArrayList arrayList8 = this.y;
                if (xc2.V(this.J)) {
                    i4 = 2131753598;
                }
                arrayList8.add(new sg1(6, ob6.M0(i4, null)));
            }
            this.y.add(new sg1(1, ob6.M0(2131748668, null)));
            this.y.add(new sg1(3, this.d.boost_url));
            if (uc7.s1(this.b).k4.W1.f && xc2.N(this.J)) {
                ArrayList arrayList9 = this.y;
                if (xc2.V(this.J)) {
                    i = 2131753262;
                } else {
                    i = 2131753261;
                }
                arrayList9.add(new sg1(6, ob6.M0(i, null)));
                this.y.add(new ka(10, true));
                ArrayList arrayList10 = this.y;
                if (xc2.V(this.J)) {
                    i2 = 2131753496;
                } else {
                    i2 = 2131753495;
                }
                arrayList10.add(new sg1(6, ob6.M0(i2, null)));
            }
        }
        rg1 rg1Var = this.F;
        if (z) {
            rg1Var.E(arrayList, this.y);
        } else {
            rg1Var.f();
        }
    }
}
