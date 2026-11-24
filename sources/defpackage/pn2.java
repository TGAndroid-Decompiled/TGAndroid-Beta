package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class pn2 extends d implements x74 {
    public final fm0 a;
    public long b;
    public FrameLayout c;
    public q5c d;
    public ry1 e;
    public LinearLayout f;
    public u41 h;
    public u41 n;
    public zya r;
    public TLRPC.ChatFull s;
    public mo2 w;
    public int x;

    public pn2(Bundle bundle) {
        super(bundle);
        this.a = new fm0(0, this, s33.h, 320L, false);
    }

    public final void Y(int i) {
        this.d.setPadding(0, 0, 0, gl.L(60.0f) + i);
        this.f.setPadding(gl.L(7.0f), 0, gl.L(7.0f), gl.L(12.0f) + i);
        this.r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(gl.L(72.0f) + i);
    }

    public final void Z(c4c c4cVar) {
        Object obj = c4cVar.H;
        if (obj instanceof kn2) {
            kn2 kn2Var = (kn2) obj;
            long j = kn2Var.a;
            TLRPC.Chat K0 = na7.q1(this.currentAccount).K0(Long.valueOf(-j));
            TLRPC.User V1 = na7.q1(this.currentAccount).V1(Long.valueOf(j));
            if (V1 != null) {
                presentFragment(mu1.U9(V1.id));
            } else if (!hc2.t0(K0) && !hc2.j0(K0)) {
                new fn2(getParentActivity(), K0, new n92(this, kn2Var, (byte) 22)).show();
            } else {
                presentFragment(mu1.U9(-K0.id));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        boolean z = true;
        setHasOwnBackground(true);
        mo2 mo2Var = new mo2(getParentActivity(), this.resourceProvider, u21.b0(this), this.currentAccount, this.b);
        this.w = mo2Var;
        mo2Var.h = new i4d(this);
        mo2Var.d();
        this.w.e();
        this.actionBar.setBackButtonDrawable(new ed0(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 2));
        this.actionBar.setTitle(k96.M0(2131751883, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i = bkb.Z6;
        zkb.h(i, null, frameLayout);
        q5c q5cVar = new q5c(this, new w72(this, (byte) 9), new nn2(this), new k32(this, (byte) 21));
        this.d = q5cVar;
        q5cVar.setClipToPadding(false);
        q5c q5cVar2 = this.d;
        q5cVar2.g3.r = false;
        q5cVar2.r1();
        this.d.j(new y(this, (byte) 28));
        this.actionBar.setAdaptiveBackground(this.d);
        this.c.addView(this.d, nme.c(-1.0f, -1));
        ry1 ry1Var = new ry1(context);
        this.e = ry1Var;
        ry1Var.setupColorKey(i);
        this.e.setFadeZoneBottom(gl.L(72.0f));
        this.e.setFadeHeightBottom(gl.L(24.0f));
        this.c.addView(this.e, nme.g());
        this.c.addView(this.actionBar, nme.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(0);
        this.f.setPadding(gl.L(7.0f), 0, gl.L(7.0f), gl.L(12.0f));
        u41 u41Var = new u41(this.resourceProvider, context, true);
        this.n = u41Var;
        u41Var.e();
        u41 u41Var2 = this.n;
        int f = bm2.f(0.125f, getThemedColor(bkb.c6), getThemedColor(bkb.F6));
        this.x = f;
        u41Var2.setColor(f);
        this.n.setText(k96.M0(2131751888, null));
        this.n.f();
        this.n.setOnClickListener(new View.OnClickListener(this) {
            public final pn2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                pn2 pn2Var = this.b;
                switch (b) {
                    case 0:
                        pn2Var.w.f(false, true);
                        return;
                    default:
                        pn2Var.w.f(true, true);
                        return;
                }
            }
        });
        this.f.addView(this.n, nme.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        u41 u41Var3 = new u41(this.resourceProvider, context, true);
        this.h = u41Var3;
        u41Var3.setText(k96.M0(2131751890, null));
        this.h.f();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final pn2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                pn2 pn2Var = this.b;
                switch (b) {
                    case 0:
                        pn2Var.w.f(false, true);
                        return;
                    default:
                        pn2Var.w.f(true, true);
                        return;
                }
            }
        });
        this.f.addView(this.h, nme.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(this.f, nme.e(-1, -2, 80));
        zya zyaVar = new zya(getParentActivity(), null, 16, this.resourceProvider);
        this.r = zyaVar;
        zyaVar.d.setText(k96.M0(2131748033, null));
        this.r.e.setText(k96.M0(2131748032, null));
        this.r.setAnimateLayoutChange(true);
        this.r.setVisibility(8);
        this.c.addView(this.r, nme.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z = false;
        }
        this.a.a(z, false);
        Y(0);
        FrameLayout frameLayout2 = this.c;
        nn2 nn2Var = new nn2(this);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(frameLayout2, nn2Var);
        setBulletinDelegate(new oy((byte) 5));
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
        getMessagesController().K0(Long.valueOf(this.b));
        this.s = getMessagesController().L0(this.b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        mo2 mo2Var = this.w;
        ko2 ko2Var = mo2Var.i;
        if (ko2Var != null) {
            ko2Var.run();
        }
        mo2Var.i = null;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f = bm2.f(0.125f, getThemedColor(bkb.c6), getThemedColor(bkb.F6));
            u41 u41Var = this.n;
            if (u41Var != null && f != this.x) {
                this.x = f;
                u41Var.setColor(f);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
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
        zya zyaVar = this.r;
        if (f > 0.0f) {
            i3 = 0;
        }
        zyaVar.setVisibility(i3);
    }

    @Override
    public final void D(float f, int i) {
    }
}
