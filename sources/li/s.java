package li;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.u1;
import bi.v1;
import c8.ma;
import di.vb;
import h9.g1;
import hi.d7;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.bn;
public final class s extends g2 implements te.b {
    public final te.a f20022a;
    public long f20023b;
    public FrameLayout f20024c;
    public h51 d;
    public lh.f f20025e;
    public LinearLayout f20026f;
    public hi.e h;
    public hi.e f20027n;
    public nv0 f20028r;
    public TLRPC.ChatFull f20029s;
    public k0 f20030w;
    public int f20031x;

    public s(Bundle bundle) {
        super(bundle);
        this.f20022a = new te.a(0, this, nr.h, 320L, false);
    }

    public static void Z(s sVar, o41 o41Var) {
        Object obj = o41Var.H;
        if (obj instanceof mi.f) {
            mi.f fVar = (mi.f) obj;
            long j3 = fVar.f21049a;
            TLRPC.Chat O0 = np.u1(sVar.currentAccount).O0(Long.valueOf(-j3));
            TLRPC.User c22 = np.u1(sVar.currentAccount).c2(Long.valueOf(j3));
            if (c22 != null) {
                sVar.presentFragment(bn.ua(c22.f28583id));
            } else if (!v3.t0(O0) && !v3.j0(O0)) {
                new ni.b(sVar.getParentActivity(), O0, new ji.i(18, sVar, fVar)).show();
            } else {
                sVar.presentFragment(bn.ua(-O0.f28434id));
            }
        }
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        int i10;
        float f12 = 1.0f - f10;
        this.f20026f.setAlpha(f12);
        LinearLayout linearLayout = this.f20026f;
        int i11 = 8;
        if (f12 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        this.f20028r.setAlpha(f10);
        nv0 nv0Var = this.f20028r;
        if (f10 > 0.0f) {
            i11 = 0;
        }
        nv0Var.setVisibility(i11);
    }

    public final void a0(int i7) {
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + i7);
        this.f20026f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f) + i7);
        this.f20028r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.f20025e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f) + i7);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        k0 k0Var = new k0(getParentActivity(), this.resourceProvider, lc.b0(this), this.currentAccount, this.f20023b);
        this.f20030w = k0Var;
        k0Var.h = new g1(this, 9);
        k0Var.d();
        this.f20030w.e();
        this.actionBar.setBackButtonDrawable(new x1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new v1(this, 19));
        this.actionBar.setTitle(hd.N0(2131751883, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f20024c = frameLayout;
        int i7 = m6.f29324a7;
        t6.h(i7, frameLayout, null);
        h51 h51Var = new h51(this, new d7(this, 23), new q(this), new c(this, 1));
        this.d = h51Var;
        h51Var.setClipToPadding(false);
        h51 h51Var2 = this.d;
        h51Var2.f35789g3.f34062r = false;
        h51Var2.r1();
        this.d.j(new u1(this, 23));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f20024c.addView(this.d, ma.c(-1.0f, -1));
        lh.f fVar = new lh.f(context);
        this.f20025e = fVar;
        fVar.setupColorKey(i7);
        this.f20025e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f));
        this.f20025e.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        this.f20024c.addView(this.f20025e, ma.g());
        this.f20024c.addView(this.actionBar, ma.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f20026f = linearLayout;
        linearLayout.setOrientation(0);
        this.f20026f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
        hi.e eVar = new hi.e(context, this.resourceProvider, true);
        this.f20027n = eVar;
        eVar.e();
        hi.e eVar2 = this.f20027n;
        int f10 = i0.a.f(0.125f, getThemedColor(m6.f29381d6), getThemedColor(m6.G6));
        this.f20031x = f10;
        eVar2.setColor(f10);
        this.f20027n.setText(hd.N0(2131751888, null));
        this.f20027n.f();
        this.f20027n.setOnClickListener(new View.OnClickListener(this) {
            public final s f20021b;

            {
                this.f20021b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f20021b.f20030w.f(false, true);
                        return;
                    default:
                        this.f20021b.f20030w.f(true, true);
                        return;
                }
            }
        });
        this.f20026f.addView(this.f20027n, ma.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        hi.e eVar3 = new hi.e(context, this.resourceProvider, true);
        this.h = eVar3;
        eVar3.setText(hd.N0(2131751890, null));
        this.h.f();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f20021b;

            {
                this.f20021b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f20021b.f20030w.f(false, true);
                        return;
                    default:
                        this.f20021b.f20030w.f(true, true);
                        return;
                }
            }
        });
        this.f20026f.addView(this.h, ma.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f20024c.addView(this.f20026f, ma.e(-1, -2, 80));
        nv0 nv0Var = new nv0(getParentActivity(), null, 16, this.resourceProvider);
        this.f20028r = nv0Var;
        nv0Var.d.setText(hd.N0(2131748032, null));
        this.f20028r.f37995e.setText(hd.N0(2131748031, null));
        this.f20028r.setAnimateLayoutChange(true);
        this.f20028r.setVisibility(8);
        this.f20024c.addView(this.f20028r, ma.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f20029s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f20022a.a(z10, false);
        a0(0);
        FrameLayout frameLayout2 = this.f20024c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.f56289a;
        r0.a0.i(frameLayout2, qVar);
        setBulletinDelegate(new bi.t(5));
        FrameLayout frameLayout3 = this.f20024c;
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
        this.f20023b = this.arguments.getLong("community_id", 0L);
        getMessagesController().O0(Long.valueOf(this.f20023b));
        this.f20029s = getMessagesController().P0(this.f20023b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        k0 k0Var = this.f20030w;
        vb vbVar = k0Var.f19985i;
        if (vbVar != null) {
            vbVar.run();
        }
        k0Var.f19985i = null;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f10 = i0.a.f(0.125f, getThemedColor(m6.f29381d6), getThemedColor(m6.G6));
            hi.e eVar = this.f20027n;
            if (eVar != null && f10 != this.f20031x) {
                this.f20031x = f10;
                eVar.setColor(f10);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
