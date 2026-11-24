package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class ap2 extends d implements g94 {
    public final fn0 a;
    public long b;
    public FrameLayout c;
    public q7c d;
    public e02 e;
    public LinearLayout f;
    public b61 h;
    public b61 n;
    public a1b r;
    public TLRPC.ChatFull s;
    public xp2 w;
    public int x;

    public ap2(Bundle bundle) {
        super(bundle);
        this.a = new fn0(0, this, d53.h, 320L, false);
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        int i2;
        float f3 = 1.0f - f;
        this.f.setAlpha(f3);
        LinearLayout linearLayout = this.f;
        int i3 = 8;
        if (f3 > 0.0f) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
        this.r.setAlpha(f);
        a1b a1bVar = this.r;
        if (f > 0.0f) {
            i3 = 0;
        }
        a1bVar.setVisibility(i3);
    }

    public final void Z(int i) {
        this.d.setPadding(0, 0, 0, gm.L(60.0f) + i);
        this.f.setPadding(gm.L(7.0f), 0, gm.L(7.0f), gm.L(12.0f) + i);
        this.r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(gm.L(72.0f) + i);
    }

    public final void a0(c6c c6cVar) {
        Object obj = c6cVar.H;
        if (obj instanceof vo2) {
            vo2 vo2Var = (vo2) obj;
            long j = vo2Var.a;
            TLRPC.Chat L0 = oc7.r1(this.currentAccount).L0(Long.valueOf(-j));
            TLRPC.User W1 = oc7.r1(this.currentAccount).W1(Long.valueOf(j));
            if (W1 != null) {
                presentFragment(yv1.ga(W1.id));
            } else if (!sd2.t0(L0) && !sd2.j0(L0)) {
                new qo2(getParentActivity(), L0, new ra2(this, vo2Var, (byte) 23)).show();
            } else {
                presentFragment(yv1.ga(-L0.id));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        boolean z = true;
        setHasOwnBackground(true);
        xp2 xp2Var = new xp2(getParentActivity(), this.resourceProvider, c41.b0(this), this.currentAccount, this.b);
        this.w = xp2Var;
        xp2Var.h = new nl9(this, (byte) 21);
        xp2Var.d();
        this.w.e();
        this.actionBar.setBackButtonDrawable(new ee0(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 3));
        this.actionBar.setTitle(jb6.M0(2131751832, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i = cmb.Z6;
        anb.h(i, null, frameLayout);
        q7c q7cVar = new q7c(this, new h92(this, (byte) 9), new yo2(this), new a32(this, (byte) 22));
        this.d = q7cVar;
        q7cVar.setClipToPadding(false);
        q7c q7cVar2 = this.d;
        q7cVar2.g3.r = false;
        q7cVar2.r1();
        this.d.j(new y(this, (byte) 29));
        this.actionBar.setAdaptiveBackground(this.d);
        this.c.addView(this.d, qoe.c(-1.0f, -1));
        e02 e02Var = new e02(context);
        this.e = e02Var;
        e02Var.setupColorKey(i);
        this.e.setFadeZoneBottom(gm.L(72.0f));
        this.e.setFadeHeightBottom(gm.L(24.0f));
        this.c.addView(this.e, qoe.g());
        this.c.addView(this.actionBar, qoe.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(0);
        this.f.setPadding(gm.L(7.0f), 0, gm.L(7.0f), gm.L(12.0f));
        b61 b61Var = new b61(this.resourceProvider, context, true);
        this.n = b61Var;
        b61Var.e();
        b61 b61Var2 = this.n;
        int f = on2.f(0.125f, getThemedColor(cmb.c6), getThemedColor(cmb.F6));
        this.x = f;
        b61Var2.setColor(f);
        this.n.setText(jb6.M0(2131751837, null));
        this.n.f();
        this.n.setOnClickListener(new View.OnClickListener(this) {
            public final ap2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                ap2 ap2Var = this.b;
                switch (b) {
                    case 0:
                        ap2Var.w.f(false, true);
                        return;
                    default:
                        ap2Var.w.f(true, true);
                        return;
                }
            }
        });
        this.f.addView(this.n, qoe.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        b61 b61Var3 = new b61(this.resourceProvider, context, true);
        this.h = b61Var3;
        b61Var3.setText(jb6.M0(2131751839, null));
        this.h.f();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final ap2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                ap2 ap2Var = this.b;
                switch (b) {
                    case 0:
                        ap2Var.w.f(false, true);
                        return;
                    default:
                        ap2Var.w.f(true, true);
                        return;
                }
            }
        });
        this.f.addView(this.h, qoe.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(this.f, qoe.e(-1, -2, 80));
        a1b a1bVar = new a1b(getParentActivity(), null, 16, this.resourceProvider);
        this.r = a1bVar;
        a1bVar.d.setText(jb6.M0(2131747959, null));
        this.r.e.setText(jb6.M0(2131747958, null));
        this.r.setAnimateLayoutChange(true);
        this.r.setVisibility(8);
        this.c.addView(this.r, qoe.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z = false;
        }
        this.a.a(z, false);
        Z(0);
        FrameLayout frameLayout2 = this.c;
        yo2 yo2Var = new yo2(this);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(frameLayout2, yo2Var);
        setBulletinDelegate(new oz((byte) 5));
        FrameLayout frameLayout3 = this.c;
        this.fragmentView = frameLayout3;
        return frameLayout3;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.b = this.arguments.getLong("community_id", 0L);
        getMessagesController().L0(Long.valueOf(this.b));
        this.s = getMessagesController().M0(this.b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        xp2 xp2Var = this.w;
        vp2 vp2Var = xp2Var.i;
        if (vp2Var != null) {
            vp2Var.run();
        }
        xp2Var.i = null;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f = on2.f(0.125f, getThemedColor(cmb.c6), getThemedColor(cmb.F6));
            b61 b61Var = this.n;
            if (b61Var != null && f != this.x) {
                this.x = f;
                b61Var.setColor(f);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void V(float f, int i) {
    }
}
