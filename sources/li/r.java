package li;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.x4;
import bi.z4;
import c8.ja;
import di.sb;
import hi.q4;
import java.util.WeakHashMap;
import kg.t1;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.u41;
import org.telegram.ui.an;
public final class r extends e2 implements te.b {
    public final te.a f19624a;
    public long f19625b;
    public FrameLayout f19626c;
    public u41 d;
    public lh.f f19627e;
    public LinearLayout f19628f;
    public hi.d h;
    public hi.d f19629n;
    public cv0 f19630r;
    public TLRPC.ChatFull f19631s;
    public k0 f19632w;
    public int f19633x;

    public r(Bundle bundle) {
        super(bundle);
        this.f19624a = new te.a(0, this, er.h, 320L, false);
    }

    public static void Z(r rVar, b41 b41Var) {
        Object obj = b41Var.G;
        if (obj instanceof mi.f) {
            mi.f fVar = (mi.f) obj;
            long j3 = fVar.f20657a;
            TLRPC.Chat M0 = np.s1(rVar.currentAccount).M0(Long.valueOf(-j3));
            TLRPC.User a22 = np.s1(rVar.currentAccount).a2(Long.valueOf(j3));
            if (a22 != null) {
                rVar.presentFragment(an.ua(a22.f28200id));
            } else if (!t3.t0(M0) && !t3.j0(M0)) {
                new ni.b(rVar.getParentActivity(), M0, new t1(13, rVar, fVar)).show();
            } else {
                rVar.presentFragment(an.ua(-M0.f28051id));
            }
        }
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        int i10;
        float f12 = 1.0f - f10;
        this.f19628f.setAlpha(f12);
        LinearLayout linearLayout = this.f19628f;
        int i11 = 8;
        if (f12 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        this.f19630r.setAlpha(f10);
        cv0 cv0Var = this.f19630r;
        if (f10 > 0.0f) {
            i11 = 0;
        }
        cv0Var.setVisibility(i11);
    }

    public final void a0(int i7) {
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + i7);
        this.f19628f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f) + i7);
        this.f19630r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.f19627e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f) + i7);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        k0 k0Var = new k0(getParentActivity(), this.resourceProvider, cc.a0(this), this.currentAccount, this.f19625b);
        this.f19632w = k0Var;
        k0Var.h = new hi.l0(this, 9);
        k0Var.d();
        this.f19632w.e();
        this.actionBar.setBackButtonDrawable(new x1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new x4(this, 17));
        this.actionBar.setTitle(hd.M0(2131751895, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f19626c = frameLayout;
        int i7 = j6.f28792a7;
        q6.h(i7, frameLayout, null);
        u41 u41Var = new u41(this, new q4(this, 23), new o(this), new p(this, 0));
        this.d = u41Var;
        u41Var.setClipToPadding(false);
        u41 u41Var2 = this.d;
        u41Var2.f39895g3.f38201r = false;
        u41Var2.r1();
        this.d.j(new z4(this, 22));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f19626c.addView(this.d, ja.c(-1.0f, -1));
        lh.f fVar = new lh.f(context);
        this.f19627e = fVar;
        fVar.setupColorKey(i7);
        this.f19627e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f));
        this.f19627e.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        this.f19626c.addView(this.f19627e, ja.g());
        this.f19626c.addView(this.actionBar, ja.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f19628f = linearLayout;
        linearLayout.setOrientation(0);
        this.f19628f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
        hi.d dVar = new hi.d(context, this.resourceProvider, true);
        this.f19629n = dVar;
        dVar.e();
        hi.d dVar2 = this.f19629n;
        int f10 = i0.a.f(0.125f, getThemedColor(j6.f28849d6), getThemedColor(j6.G6));
        this.f19633x = f10;
        dVar2.setColor(f10);
        this.f19629n.setText(hd.M0(2131751900, null));
        this.f19629n.f();
        this.f19629n.setOnClickListener(new View.OnClickListener(this) {
            public final r f19623b;

            {
                this.f19623b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f19623b.f19632w.f(false, true);
                        return;
                    default:
                        this.f19623b.f19632w.f(true, true);
                        return;
                }
            }
        });
        this.f19628f.addView(this.f19629n, ja.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        hi.d dVar3 = new hi.d(context, this.resourceProvider, true);
        this.h = dVar3;
        dVar3.setText(hd.M0(2131751902, null));
        this.h.f();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final r f19623b;

            {
                this.f19623b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f19623b.f19632w.f(false, true);
                        return;
                    default:
                        this.f19623b.f19632w.f(true, true);
                        return;
                }
            }
        });
        this.f19628f.addView(this.h, ja.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f19626c.addView(this.f19628f, ja.e(-1, -2, 80));
        cv0 cv0Var = new cv0(getParentActivity(), null, 16, this.resourceProvider);
        this.f19630r = cv0Var;
        cv0Var.d.setText(hd.M0(2131748225, null));
        this.f19630r.f33707e.setText(hd.M0(2131748224, null));
        this.f19630r.setAnimateLayoutChange(true);
        this.f19630r.setVisibility(8);
        this.f19626c.addView(this.f19630r, ja.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f19631s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f19624a.a(z10, false);
        a0(0);
        FrameLayout frameLayout2 = this.f19626c;
        o oVar = new o(this);
        WeakHashMap weakHashMap = r0.i0.f55671a;
        r0.a0.i(frameLayout2, oVar);
        setBulletinDelegate(new bi.t(5));
        FrameLayout frameLayout3 = this.f19626c;
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
        this.f19625b = this.arguments.getLong("community_id", 0L);
        getMessagesController().M0(Long.valueOf(this.f19625b));
        this.f19631s = getMessagesController().N0(this.f19625b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        k0 k0Var = this.f19632w;
        sb sbVar = k0Var.f19597i;
        if (sbVar != null) {
            sbVar.run();
        }
        k0Var.f19597i = null;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f10 = i0.a.f(0.125f, getThemedColor(j6.f28849d6), getThemedColor(j6.G6));
            hi.d dVar = this.f19629n;
            if (dVar != null && f10 != this.f19633x) {
                this.f19633x = f10;
                dVar.setColor(f10);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
