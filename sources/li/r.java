package li;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.v1;
import bi.w1;
import c8.na;
import di.vb;
import hi.y7;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.bn;
public final class r extends g2 implements te.b {
    public final te.a f20085a;
    public long f20086b;
    public FrameLayout f20087c;
    public g51 d;
    public lh.f f20088e;
    public LinearLayout f20089f;
    public hi.e h;
    public hi.e f20090n;
    public mv0 f20091r;
    public TLRPC.ChatFull f20092s;
    public j0 f20093w;
    public int f20094x;

    public r(Bundle bundle) {
        super(bundle);
        this.f20085a = new te.a(0, this, kr.h, 320L, false);
    }

    public static void Z(r rVar, n41 n41Var) {
        Object obj = n41Var.H;
        if (obj instanceof mi.f) {
            mi.f fVar = (mi.f) obj;
            long j3 = fVar.f21111a;
            TLRPC.Chat O0 = mp.u1(rVar.currentAccount).O0(Long.valueOf(-j3));
            TLRPC.User c22 = mp.u1(rVar.currentAccount).c2(Long.valueOf(j3));
            if (c22 != null) {
                rVar.presentFragment(bn.ua(c22.f28641id));
            } else if (!v3.t0(O0) && !v3.j0(O0)) {
                new ni.b(rVar.getParentActivity(), O0, new ji.f(20, rVar, fVar)).show();
            } else {
                rVar.presentFragment(bn.ua(-O0.f28492id));
            }
        }
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        int i10;
        float f12 = 1.0f - f10;
        this.f20089f.setAlpha(f12);
        LinearLayout linearLayout = this.f20089f;
        int i11 = 8;
        if (f12 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        this.f20091r.setAlpha(f10);
        mv0 mv0Var = this.f20091r;
        if (f10 > 0.0f) {
            i11 = 0;
        }
        mv0Var.setVisibility(i11);
    }

    public final void a0(int i7) {
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + i7);
        this.f20089f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f) + i7);
        this.f20091r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.f20088e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f) + i7);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        j0 j0Var = new j0(getParentActivity(), this.resourceProvider, kc.b0(this), this.currentAccount, this.f20086b);
        this.f20093w = j0Var;
        j0Var.h = new j6.r(this, 5);
        j0Var.d();
        this.f20093w.e();
        this.actionBar.setBackButtonDrawable(new x1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new w1(this, 19));
        this.actionBar.setTitle(gd.N0(2131751883, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f20087c = frameLayout;
        int i7 = n6.f29394a7;
        u6.h(i7, frameLayout, null);
        g51 g51Var = new g51(this, new y7(this, 23), new p(this), new c(this, 1));
        this.d = g51Var;
        g51Var.setClipToPadding(false);
        g51 g51Var2 = this.d;
        g51Var2.f35323g3.f33631r = false;
        g51Var2.r1();
        this.d.j(new v1(this, 23));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f20087c.addView(this.d, na.c(-1.0f, -1));
        lh.f fVar = new lh.f(context);
        this.f20088e = fVar;
        fVar.setupColorKey(i7);
        this.f20088e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f));
        this.f20088e.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        this.f20087c.addView(this.f20088e, na.g());
        this.f20087c.addView(this.actionBar, na.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f20089f = linearLayout;
        linearLayout.setOrientation(0);
        this.f20089f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
        hi.e eVar = new hi.e(context, this.resourceProvider, true);
        this.f20090n = eVar;
        eVar.e();
        hi.e eVar2 = this.f20090n;
        int f10 = i0.a.f(0.125f, getThemedColor(n6.f29451d6), getThemedColor(n6.G6));
        this.f20094x = f10;
        eVar2.setColor(f10);
        this.f20090n.setText(gd.N0(2131751888, null));
        this.f20090n.f();
        this.f20090n.setOnClickListener(new View.OnClickListener(this) {
            public final r f20084b;

            {
                this.f20084b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f20084b.f20093w.f(false, true);
                        return;
                    default:
                        this.f20084b.f20093w.f(true, true);
                        return;
                }
            }
        });
        this.f20089f.addView(this.f20090n, na.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        hi.e eVar3 = new hi.e(context, this.resourceProvider, true);
        this.h = eVar3;
        eVar3.setText(gd.N0(2131751890, null));
        this.h.f();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final r f20084b;

            {
                this.f20084b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f20084b.f20093w.f(false, true);
                        return;
                    default:
                        this.f20084b.f20093w.f(true, true);
                        return;
                }
            }
        });
        this.f20089f.addView(this.h, na.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f20087c.addView(this.f20089f, na.e(-1, -2, 80));
        mv0 mv0Var = new mv0(getParentActivity(), null, 16, this.resourceProvider);
        this.f20091r = mv0Var;
        mv0Var.d.setText(gd.N0(2131748032, null));
        this.f20091r.f37553e.setText(gd.N0(2131748031, null));
        this.f20091r.setAnimateLayoutChange(true);
        this.f20091r.setVisibility(8);
        this.f20087c.addView(this.f20091r, na.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f20092s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f20085a.a(z10, false);
        a0(0);
        FrameLayout frameLayout2 = this.f20087c;
        p pVar = new p(this);
        WeakHashMap weakHashMap = r0.i0.f56367a;
        r0.a0.i(frameLayout2, pVar);
        setBulletinDelegate(new bi.t(5));
        FrameLayout frameLayout3 = this.f20087c;
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
        this.f20086b = this.arguments.getLong("community_id", 0L);
        getMessagesController().O0(Long.valueOf(this.f20086b));
        this.f20092s = getMessagesController().P0(this.f20086b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        j0 j0Var = this.f20093w;
        vb vbVar = j0Var.f20048i;
        if (vbVar != null) {
            vbVar.run();
        }
        j0Var.f20048i = null;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f10 = i0.a.f(0.125f, getThemedColor(n6.f29451d6), getThemedColor(n6.G6));
            hi.e eVar = this.f20090n;
            if (eVar != null && f10 != this.f20094x) {
                this.f20094x = f10;
                eVar.setColor(f10);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void G(float f10, int i7) {
    }
}
