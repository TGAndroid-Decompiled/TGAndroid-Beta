package ii;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bi.kd;
import c8.ha;
import fi.r7;
import hi.u1;
import hi.x3;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.x31;
import org.telegram.ui.cn;
public final class s extends f2 implements te.b {
    public final te.a f15596a;
    public long f15597b;
    public FrameLayout f15598c;
    public r41 d;
    public lh.f f15599e;
    public LinearLayout f15600f;
    public fi.d h;
    public fi.d f15601n;
    public bv0 f15602r;
    public TLRPC.ChatFull f15603s;
    public l0 f15604w;
    public int f15605x;

    public s(Bundle bundle) {
        super(bundle);
        this.f15596a = new te.a(0, this, wq.h, 320L, false);
    }

    public static void Z(s sVar, x31 x31Var) {
        Object obj = x31Var.G;
        if (obj instanceof ji.f) {
            ji.f fVar = (ji.f) obj;
            long j3 = fVar.f17083a;
            TLRPC.Chat M0 = qp.s1(sVar.currentAccount).M0(Long.valueOf(-j3));
            TLRPC.User a22 = qp.s1(sVar.currentAccount).a2(Long.valueOf(j3));
            if (a22 != null) {
                sVar.presentFragment(cn.ta(a22.f27109id));
            } else if (!t3.t0(M0) && !t3.j0(M0)) {
                new ki.b(sVar.getParentActivity(), M0, new ha.b(9, sVar, fVar)).show();
            } else {
                sVar.presentFragment(cn.ta(-M0.f26960id));
            }
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        int i10;
        float f12 = 1.0f - f10;
        this.f15600f.setAlpha(f12);
        LinearLayout linearLayout = this.f15600f;
        int i11 = 8;
        if (f12 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        this.f15602r.setAlpha(f10);
        bv0 bv0Var = this.f15602r;
        if (f10 > 0.0f) {
            i11 = 0;
        }
        bv0Var.setVisibility(i11);
    }

    public final void a0(int i7) {
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + i7);
        this.f15600f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f) + i7);
        this.f15602r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.f15599e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f) + i7);
    }

    @Override
    public final View createView(Context context) {
        boolean z9 = true;
        setHasOwnBackground(true);
        l0 l0Var = new l0(getParentActivity(), this.resourceProvider, gc.a0(this), this.currentAccount, this.f15597b);
        this.f15604w = l0Var;
        l0Var.h = new g6.d0(this, 6);
        l0Var.d();
        this.f15604w.e();
        this.actionBar.setBackButtonDrawable(new y1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new bi.s(this, 7));
        this.actionBar.setTitle(id.M0(2131751895, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15598c = frameLayout;
        int i7 = m6.f27834a7;
        t6.h(i7, frameLayout, null);
        r41 r41Var = new r41(this, new u1(this, 3), new q(this), new x3(this, 7));
        this.d = r41Var;
        r41Var.setClipToPadding(false);
        r41 r41Var2 = this.d;
        r41Var2.f37496f3.f35845r = false;
        r41Var2.r1();
        this.d.j(new ai.b(this, 16));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f15598c.addView(this.d, ha.c(-1.0f, -1));
        lh.f fVar = new lh.f(context);
        this.f15599e = fVar;
        fVar.setupColorKey(i7);
        this.f15599e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f));
        this.f15599e.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        this.f15598c.addView(this.f15599e, ha.g());
        this.f15598c.addView(this.actionBar, ha.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f15600f = linearLayout;
        linearLayout.setOrientation(0);
        this.f15600f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.f15601n = dVar;
        dVar.e();
        fi.d dVar2 = this.f15601n;
        int f10 = i0.a.f(0.125f, getThemedColor(m6.f27890d6), getThemedColor(m6.G6));
        this.f15605x = f10;
        dVar2.setColor(f10);
        this.f15601n.setText(id.M0(2131751900, null));
        this.f15601n.f();
        this.f15601n.setOnClickListener(new View.OnClickListener(this) {
            public final s f15595b;

            {
                this.f15595b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15595b.f15604w.f(false, true);
                        return;
                    default:
                        this.f15595b.f15604w.f(true, true);
                        return;
                }
            }
        });
        this.f15600f.addView(this.f15601n, ha.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        fi.d dVar3 = new fi.d(context, this.resourceProvider, true);
        this.h = dVar3;
        dVar3.setText(id.M0(2131751902, null));
        this.h.f();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f15595b;

            {
                this.f15595b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15595b.f15604w.f(false, true);
                        return;
                    default:
                        this.f15595b.f15604w.f(true, true);
                        return;
                }
            }
        });
        this.f15600f.addView(this.h, ha.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f15598c.addView(this.f15600f, ha.e(-1, -2, 80));
        bv0 bv0Var = new bv0(getParentActivity(), null, 16, this.resourceProvider);
        this.f15602r = bv0Var;
        bv0Var.d.setText(id.M0(2131748225, null));
        this.f15602r.f32368e.setText(id.M0(2131748224, null));
        this.f15602r.setAnimateLayoutChange(true);
        this.f15602r.setVisibility(8);
        this.f15598c.addView(this.f15602r, ha.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f15603s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z9 = false;
        }
        this.f15596a.a(z9, false);
        a0(0);
        FrameLayout frameLayout2 = this.f15598c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.f54202a;
        r0.a0.i(frameLayout2, qVar);
        setBulletinDelegate(new r7(4));
        FrameLayout frameLayout3 = this.f15598c;
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
        this.f15597b = this.arguments.getLong("community_id", 0L);
        getMessagesController().M0(Long.valueOf(this.f15597b));
        this.f15603s = getMessagesController().N0(this.f15597b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        l0 l0Var = this.f15604w;
        kd kdVar = l0Var.f15566i;
        if (kdVar != null) {
            kdVar.run();
        }
        l0Var.f15566i = null;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f10 = i0.a.f(0.125f, getThemedColor(m6.f27890d6), getThemedColor(m6.G6));
            fi.d dVar = this.f15601n;
            if (dVar != null && f10 != this.f15605x) {
                this.f15605x = f10;
                dVar.setColor(f10);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
