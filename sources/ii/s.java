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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.y1;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.an;
public final class s extends f2 implements te.b {
    public final te.a f15597a;
    public long f15598b;
    public FrameLayout f15599c;
    public q41 d;
    public lh.f f15600e;
    public LinearLayout f15601f;
    public fi.d h;
    public fi.d f15602n;
    public av0 f15603r;
    public TLRPC.ChatFull f15604s;
    public l0 f15605w;
    public int f15606x;

    public s(Bundle bundle) {
        super(bundle);
        this.f15597a = new te.a(0, this, xq.h, 320L, false);
    }

    public static void Z(s sVar, x31 x31Var) {
        Object obj = x31Var.G;
        if (obj instanceof ji.f) {
            ji.f fVar = (ji.f) obj;
            long j3 = fVar.f17083a;
            TLRPC.Chat M0 = qp.s1(sVar.currentAccount).M0(Long.valueOf(-j3));
            TLRPC.User a22 = qp.s1(sVar.currentAccount).a2(Long.valueOf(j3));
            if (a22 != null) {
                sVar.presentFragment(an.ra(a22.f27105id));
            } else if (!t3.t0(M0) && !t3.j0(M0)) {
                new ki.b(sVar.getParentActivity(), M0, new ha.b(9, sVar, fVar)).show();
            } else {
                sVar.presentFragment(an.ra(-M0.f26956id));
            }
        }
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        int i10;
        float f12 = 1.0f - f10;
        this.f15601f.setAlpha(f12);
        LinearLayout linearLayout = this.f15601f;
        int i11 = 8;
        if (f12 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        this.f15603r.setAlpha(f10);
        av0 av0Var = this.f15603r;
        if (f10 > 0.0f) {
            i11 = 0;
        }
        av0Var.setVisibility(i11);
    }

    public final void a0(int i7) {
        this.d.setPadding(0, 0, 0, org.telegram.messenger.g0.L(60.0f) + i7);
        this.f15601f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f) + i7);
        this.f15603r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.f15600e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f) + i7);
    }

    @Override
    public final View createView(Context context) {
        boolean z9 = true;
        setHasOwnBackground(true);
        l0 l0Var = new l0(getParentActivity(), this.resourceProvider, hc.a0(this), this.currentAccount, this.f15598b);
        this.f15605w = l0Var;
        l0Var.h = new g6.d0(this, 6);
        l0Var.d();
        this.f15605w.e();
        this.actionBar.setBackButtonDrawable(new y1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new bi.s(this, 7));
        this.actionBar.setTitle(id.M0(2131751895, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15599c = frameLayout;
        int i7 = k6.f27796a7;
        r6.i(i7, frameLayout, null);
        q41 q41Var = new q41(this, new u1(this, 3), new q(this), new x3(this, 7));
        this.d = q41Var;
        q41Var.setClipToPadding(false);
        q41 q41Var2 = this.d;
        q41Var2.f37190f3.f35528r = false;
        q41Var2.r1();
        this.d.j(new ai.b(this, 16));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f15599c.addView(this.d, ha.c(-1.0f, -1));
        lh.f fVar = new lh.f(context);
        this.f15600e = fVar;
        fVar.setupColorKey(i7);
        this.f15600e.setFadeZoneBottom(org.telegram.messenger.g0.L(72.0f));
        this.f15600e.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
        this.f15599c.addView(this.f15600e, ha.g());
        this.f15599c.addView(this.actionBar, ha.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f15601f = linearLayout;
        linearLayout.setOrientation(0);
        this.f15601f.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(12.0f));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.f15602n = dVar;
        dVar.e();
        fi.d dVar2 = this.f15602n;
        int f10 = i0.a.f(0.125f, getThemedColor(k6.f27852d6), getThemedColor(k6.G6));
        this.f15606x = f10;
        dVar2.setColor(f10);
        this.f15602n.setText(id.M0(2131751900, null));
        this.f15602n.f();
        this.f15602n.setOnClickListener(new View.OnClickListener(this) {
            public final s f15596b;

            {
                this.f15596b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15596b.f15605w.f(false, true);
                        return;
                    default:
                        this.f15596b.f15605w.f(true, true);
                        return;
                }
            }
        });
        this.f15601f.addView(this.f15602n, ha.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        fi.d dVar3 = new fi.d(context, this.resourceProvider, true);
        this.h = dVar3;
        dVar3.setText(id.M0(2131751902, null));
        this.h.f();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f15596b;

            {
                this.f15596b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15596b.f15605w.f(false, true);
                        return;
                    default:
                        this.f15596b.f15605w.f(true, true);
                        return;
                }
            }
        });
        this.f15601f.addView(this.h, ha.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f15599c.addView(this.f15601f, ha.e(-1, -2, 80));
        av0 av0Var = new av0(getParentActivity(), null, 16, this.resourceProvider);
        this.f15603r = av0Var;
        av0Var.d.setText(id.M0(2131748226, null));
        this.f15603r.f31927e.setText(id.M0(2131748225, null));
        this.f15603r.setAnimateLayoutChange(true);
        this.f15603r.setVisibility(8);
        this.f15599c.addView(this.f15603r, ha.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f15604s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z9 = false;
        }
        this.f15597a.a(z9, false);
        a0(0);
        FrameLayout frameLayout2 = this.f15599c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.f54191a;
        r0.a0.i(frameLayout2, qVar);
        setBulletinDelegate(new r7(4));
        FrameLayout frameLayout3 = this.f15599c;
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
        this.f15598b = this.arguments.getLong("community_id", 0L);
        getMessagesController().M0(Long.valueOf(this.f15598b));
        this.f15604s = getMessagesController().N0(this.f15598b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        l0 l0Var = this.f15605w;
        kd kdVar = l0Var.f15567i;
        if (kdVar != null) {
            kdVar.run();
        }
        l0Var.f15567i = null;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f10 = i0.a.f(0.125f, getThemedColor(k6.f27852d6), getThemedColor(k6.G6));
            fi.d dVar = this.f15602n;
            if (dVar != null && f10 != this.f15606x) {
                this.f15606x = f10;
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
