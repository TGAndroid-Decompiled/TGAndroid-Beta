package ji;

import ai.g5;
import ai.j5;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b8.mf;
import ci.cc;
import gi.q4;
import ii.y3;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.w1;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zu0;
import org.telegram.ui.wm;
public final class q extends d2 implements qe.b {
    public final qe.a f16356a;
    public long f16357b;
    public FrameLayout f16358c;
    public l41 d;
    public mh.f f16359e;
    public LinearLayout f16360f;
    public gi.d h;
    public gi.d f16361n;
    public zu0 f16362r;
    public TLRPC.ChatFull f16363s;
    public i0 f16364w;
    public int f16365x;

    public q(Bundle bundle) {
        super(bundle);
        this.f16356a = new qe.a(0, this, xq.h, 320L, false);
    }

    public static void Z(q qVar, r31 r31Var) {
        Object obj = r31Var.G;
        if (obj instanceof ki.f) {
            ki.f fVar = (ki.f) obj;
            long j10 = fVar.f17325a;
            TLRPC.Chat M0 = hp.s1(qVar.currentAccount).M0(Long.valueOf(-j10));
            TLRPC.User a22 = hp.s1(qVar.currentAccount).a2(Long.valueOf(j10));
            if (a22 != null) {
                qVar.presentFragment(wm.ra(a22.f27150id));
            } else if (!t3.t0(M0) && !t3.j0(M0)) {
                new li.b(qVar.getParentActivity(), M0, new ii.e(8, qVar, fVar)).show();
            } else {
                qVar.presentFragment(wm.ra(-M0.f27001id));
            }
        }
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        int i10;
        float f12 = 1.0f - f10;
        this.f16360f.setAlpha(f12);
        LinearLayout linearLayout = this.f16360f;
        int i11 = 8;
        if (f12 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        this.f16362r.setAlpha(f10);
        zu0 zu0Var = this.f16362r;
        if (f10 > 0.0f) {
            i11 = 0;
        }
        zu0Var.setVisibility(i11);
    }

    public final void a0(int i3) {
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + i3);
        this.f16360f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f) + i3);
        this.f16362r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.f16359e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f) + i3);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        i0 i0Var = new i0(getParentActivity(), this.resourceProvider, fc.a0(this), this.currentAccount, this.f16357b);
        this.f16364w = i0Var;
        i0Var.h = new hi.d(this, 3);
        i0Var.d();
        this.f16364w.e();
        this.actionBar.setBackButtonDrawable(new w1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new g5(this, 8));
        this.actionBar.setTitle(bd.M0(2131751895, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f16358c = frameLayout;
        int i3 = k6.f27824a7;
        r6.i(i3, frameLayout, null);
        l41 l41Var = new l41(this, new q4(this, 13), new o(this), new y3(this, 5));
        this.d = l41Var;
        l41Var.setClipToPadding(false);
        l41 l41Var2 = this.d;
        l41Var2.f35594g3.f33698r = false;
        l41Var2.r1();
        this.d.j(new j5(this, 19));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f16358c.addView(this.d, mf.c(-1.0f, -1));
        mh.f fVar = new mh.f(context);
        this.f16359e = fVar;
        fVar.setupColorKey(i3);
        this.f16359e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f));
        this.f16359e.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        this.f16358c.addView(this.f16359e, mf.g());
        this.f16358c.addView(this.actionBar, mf.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f16360f = linearLayout;
        linearLayout.setOrientation(0);
        this.f16360f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
        gi.d dVar = new gi.d(context, this.resourceProvider, true);
        this.f16361n = dVar;
        dVar.e();
        gi.d dVar2 = this.f16361n;
        int f10 = i0.a.f(0.125f, getThemedColor(k6.f27878d6), getThemedColor(k6.G6));
        this.f16365x = f10;
        dVar2.setColor(f10);
        this.f16361n.setText(bd.M0(2131751900, null));
        this.f16361n.f();
        this.f16361n.setOnClickListener(new View.OnClickListener(this) {
            public final q f16355b;

            {
                this.f16355b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f16355b.f16364w.f(false, true);
                        return;
                    default:
                        this.f16355b.f16364w.f(true, true);
                        return;
                }
            }
        });
        this.f16360f.addView(this.f16361n, mf.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        gi.d dVar3 = new gi.d(context, this.resourceProvider, true);
        this.h = dVar3;
        dVar3.setText(bd.M0(2131751902, null));
        this.h.f();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final q f16355b;

            {
                this.f16355b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f16355b.f16364w.f(false, true);
                        return;
                    default:
                        this.f16355b.f16364w.f(true, true);
                        return;
                }
            }
        });
        this.f16360f.addView(this.h, mf.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f16358c.addView(this.f16360f, mf.e(-1, -2, 80));
        zu0 zu0Var = new zu0(getParentActivity(), null, 16, this.resourceProvider);
        this.f16362r = zu0Var;
        zu0Var.d.setText(bd.M0(2131748233, null));
        this.f16362r.f41128e.setText(bd.M0(2131748232, null));
        this.f16362r.setAnimateLayoutChange(true);
        this.f16362r.setVisibility(8);
        this.f16358c.addView(this.f16362r, mf.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f16363s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f16356a.a(z10, false);
        a0(0);
        FrameLayout frameLayout2 = this.f16358c;
        o oVar = new o(this);
        WeakHashMap weakHashMap = r0.i0.f54015a;
        r0.a0.i(frameLayout2, oVar);
        setBulletinDelegate(new ai.y(5));
        FrameLayout frameLayout3 = this.f16358c;
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
        this.f16357b = this.arguments.getLong("community_id", 0L);
        getMessagesController().M0(Long.valueOf(this.f16357b));
        this.f16363s = getMessagesController().N0(this.f16357b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        i0 i0Var = this.f16364w;
        cc ccVar = i0Var.f16319i;
        if (ccVar != null) {
            ccVar.run();
        }
        i0Var.f16319i = null;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f10 = i0.a.f(0.125f, getThemedColor(k6.f27878d6), getThemedColor(k6.G6));
            gi.d dVar = this.f16361n;
            if (dVar != null && f10 != this.f16365x) {
                this.f16365x = f10;
                dVar.setColor(f10);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void F(float f10, int i3) {
    }
}
