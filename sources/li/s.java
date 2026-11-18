package li;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.q1;
import bi.r1;
import c8.ma;
import di.vb;
import h9.g1;
import hi.e7;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.bn;
public final class s extends h2 implements te.b {
    public final te.a f19991a;
    public long f19992b;
    public FrameLayout f19993c;
    public e51 d;
    public lh.f f19994e;
    public LinearLayout f19995f;
    public hi.d h;
    public hi.d f19996n;
    public kv0 f19997r;
    public TLRPC.ChatFull f19998s;
    public k0 f19999w;
    public int f20000x;

    public s(Bundle bundle) {
        super(bundle);
        this.f19991a = new te.a(0, this, lr.h, 320L, false);
    }

    public static void Z(s sVar, l41 l41Var) {
        Object obj = l41Var.H;
        if (obj instanceof mi.f) {
            mi.f fVar = (mi.f) obj;
            long j3 = fVar.f21018a;
            TLRPC.Chat O0 = mp.u1(sVar.currentAccount).O0(Long.valueOf(-j3));
            TLRPC.User c22 = mp.u1(sVar.currentAccount).c2(Long.valueOf(j3));
            if (c22 != null) {
                sVar.presentFragment(bn.ua(c22.f28552id));
            } else if (!v3.t0(O0) && !v3.j0(O0)) {
                new ni.c(sVar.getParentActivity(), O0, new kg.h0(16, sVar, fVar)).show();
            } else {
                sVar.presentFragment(bn.ua(-O0.f28403id));
            }
        }
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        int i10;
        float f12 = 1.0f - f10;
        this.f19995f.setAlpha(f12);
        LinearLayout linearLayout = this.f19995f;
        int i11 = 8;
        if (f12 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        this.f19997r.setAlpha(f10);
        kv0 kv0Var = this.f19997r;
        if (f10 > 0.0f) {
            i11 = 0;
        }
        kv0Var.setVisibility(i11);
    }

    public final void a0(int i7) {
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + i7);
        this.f19995f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f) + i7);
        this.f19997r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.f19994e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f) + i7);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        k0 k0Var = new k0(getParentActivity(), this.resourceProvider, lc.b0(this), this.currentAccount, this.f19992b);
        this.f19999w = k0Var;
        k0Var.h = new g1(this, 9);
        k0Var.d();
        this.f19999w.e();
        this.actionBar.setBackButtonDrawable(new y1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new r1(this, 19));
        this.actionBar.setTitle(gd.M0(2131751884, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f19993c = frameLayout;
        int i7 = n6.f29337a7;
        u6.h(i7, frameLayout, null);
        e51 e51Var = new e51(this, new e7(this, 23), new q(this), new c(this, 1));
        this.d = e51Var;
        e51Var.setClipToPadding(false);
        e51 e51Var2 = this.d;
        e51Var2.f34607g3.f42809r = false;
        e51Var2.r1();
        this.d.j(new q1(this, 23));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f19993c.addView(this.d, ma.c(-1.0f, -1));
        lh.f fVar = new lh.f(context);
        this.f19994e = fVar;
        fVar.setupColorKey(i7);
        this.f19994e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f));
        this.f19994e.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        this.f19993c.addView(this.f19994e, ma.g());
        this.f19993c.addView(this.actionBar, ma.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f19995f = linearLayout;
        linearLayout.setOrientation(0);
        this.f19995f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
        hi.d dVar = new hi.d(context, this.resourceProvider, true);
        this.f19996n = dVar;
        dVar.e();
        hi.d dVar2 = this.f19996n;
        int f10 = i0.a.f(0.125f, getThemedColor(n6.f29394d6), getThemedColor(n6.G6));
        this.f20000x = f10;
        dVar2.setColor(f10);
        this.f19996n.setText(gd.M0(2131751889, null));
        this.f19996n.f();
        this.f19996n.setOnClickListener(new View.OnClickListener(this) {
            public final s f19990b;

            {
                this.f19990b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f19990b.f19999w.f(false, true);
                        return;
                    default:
                        this.f19990b.f19999w.f(true, true);
                        return;
                }
            }
        });
        this.f19995f.addView(this.f19996n, ma.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        hi.d dVar3 = new hi.d(context, this.resourceProvider, true);
        this.h = dVar3;
        dVar3.setText(gd.M0(2131751891, null));
        this.h.f();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f19990b;

            {
                this.f19990b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f19990b.f19999w.f(false, true);
                        return;
                    default:
                        this.f19990b.f19999w.f(true, true);
                        return;
                }
            }
        });
        this.f19995f.addView(this.h, ma.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f19993c.addView(this.f19995f, ma.e(-1, -2, 80));
        kv0 kv0Var = new kv0(getParentActivity(), null, 16, this.resourceProvider);
        this.f19997r = kv0Var;
        kv0Var.d.setText(gd.M0(2131748033, null));
        this.f19997r.f36896e.setText(gd.M0(2131748032, null));
        this.f19997r.setAnimateLayoutChange(true);
        this.f19997r.setVisibility(8);
        this.f19993c.addView(this.f19997r, ma.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f19998s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f19991a.a(z10, false);
        a0(0);
        FrameLayout frameLayout2 = this.f19993c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.f56244a;
        r0.a0.i(frameLayout2, qVar);
        setBulletinDelegate(new bi.t(5));
        FrameLayout frameLayout3 = this.f19993c;
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
        this.f19992b = this.arguments.getLong("community_id", 0L);
        getMessagesController().O0(Long.valueOf(this.f19992b));
        this.f19998s = getMessagesController().P0(this.f19992b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        k0 k0Var = this.f19999w;
        vb vbVar = k0Var.f19954i;
        if (vbVar != null) {
            vbVar.run();
        }
        k0Var.f19954i = null;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f10 = i0.a.f(0.125f, getThemedColor(n6.f29394d6), getThemedColor(n6.G6));
            hi.d dVar = this.f19996n;
            if (dVar != null && f10 != this.f20000x) {
                this.f20000x = f10;
                dVar.setColor(f10);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
