package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class io2 extends e implements s84 {
    public final fm0 a;
    public long b;
    public FrameLayout c;
    public q9c d;
    public jz1 e;
    public LinearLayout f;
    public c51 h;
    public c51 n;
    public z2b r;
    public TLRPC.ChatFull s;
    public fp2 w;
    public int x;

    public io2(Bundle bundle) {
        super(bundle);
        this.a = new fm0(0, this, k43.h, 320L, false);
    }

    public final void Y(int i) {
        this.d.setPadding(0, 0, 0, hl.L(60.0f) + i);
        this.f.setPadding(hl.L(7.0f), 0, hl.L(7.0f), hl.L(12.0f) + i);
        this.r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(hl.L(72.0f) + i);
    }

    public final void Z(b8c b8cVar) {
        Object obj = b8cVar.H;
        if (obj instanceof do2) {
            do2 do2Var = (do2) obj;
            long j = do2Var.a;
            TLRPC.Chat M0 = uc7.s1(this.currentAccount).M0(Long.valueOf(-j));
            TLRPC.User X1 = uc7.s1(this.currentAccount).X1(Long.valueOf(j));
            if (X1 != null) {
                presentFragment(zu1.ha(X1.id));
            } else if (!xc2.t0(M0) && !xc2.j0(M0)) {
                new yn2(getParentActivity(), M0, new ea2(this, do2Var, (byte) 21)).show();
            } else {
                presentFragment(zu1.ha(-M0.id));
            }
        }
    }

    @Override
    public final View createView(Context context) {
        boolean z = true;
        setHasOwnBackground(true);
        fp2 fp2Var = new fp2(getParentActivity(), this.resourceProvider, d31.b0(this), this.currentAccount, this.b);
        this.w = fp2Var;
        fp2Var.h = new zm9(this, (byte) 21);
        fp2Var.d();
        this.w.e();
        this.actionBar.setBackButtonDrawable(new gd0(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 3));
        this.actionBar.setTitle(ob6.M0(2131751860, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        int i = aob.a7;
        yob.h(i, null, frameLayout);
        q9c q9cVar = new q9c(this, new n82(this, (byte) 9), new go2(this), new c22(this, (byte) 26));
        this.d = q9cVar;
        q9cVar.setClipToPadding(false);
        q9c q9cVar2 = this.d;
        q9cVar2.g3.r = false;
        q9cVar2.s1();
        this.d.j(new y(this, (byte) 28));
        this.actionBar.setAdaptiveBackground(this.d);
        this.c.addView(this.d, tre.c(-1.0f, -1));
        jz1 jz1Var = new jz1(context);
        this.e = jz1Var;
        jz1Var.setupColorKey(i);
        this.e.setFadeZoneBottom(hl.L(72.0f));
        this.e.setFadeHeightBottom(hl.L(24.0f));
        this.c.addView(this.e, tre.g());
        this.c.addView(this.actionBar, tre.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(0);
        this.f.setPadding(hl.L(7.0f), 0, hl.L(7.0f), hl.L(12.0f));
        c51 c51Var = new c51(this.resourceProvider, context, true);
        this.n = c51Var;
        c51Var.e();
        c51 c51Var2 = this.n;
        int f = vm2.f(0.125f, getThemedColor(aob.d6), getThemedColor(aob.G6));
        this.x = f;
        c51Var2.setColor(f);
        this.n.setText(ob6.M0(2131751865, null));
        this.n.f();
        this.n.setOnClickListener(new View.OnClickListener(this) {
            public final io2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                io2 io2Var = this.b;
                switch (b) {
                    case 0:
                        io2Var.w.f(false, true);
                        return;
                    default:
                        io2Var.w.f(true, true);
                        return;
                }
            }
        });
        this.f.addView(this.n, tre.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        c51 c51Var3 = new c51(this.resourceProvider, context, true);
        this.h = c51Var3;
        c51Var3.setText(ob6.M0(2131751867, null));
        this.h.f();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final io2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                io2 io2Var = this.b;
                switch (b) {
                    case 0:
                        io2Var.w.f(false, true);
                        return;
                    default:
                        io2Var.w.f(true, true);
                        return;
                }
            }
        });
        this.f.addView(this.h, tre.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.c.addView(this.f, tre.e(-1, -2, 80));
        z2b z2bVar = new z2b(getParentActivity(), null, 16, this.resourceProvider);
        this.r = z2bVar;
        z2bVar.d.setText(ob6.M0(2131747956, null));
        this.r.e.setText(ob6.M0(2131747955, null));
        this.r.setAnimateLayoutChange(true);
        this.r.setVisibility(8);
        this.c.addView(this.r, tre.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z = false;
        }
        this.a.a(z, false);
        Y(0);
        FrameLayout frameLayout2 = this.c;
        go2 go2Var = new go2(this);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(frameLayout2, go2Var);
        setBulletinDelegate(new py((byte) 5));
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
        getMessagesController().M0(Long.valueOf(this.b));
        this.s = getMessagesController().N0(this.b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        fp2 fp2Var = this.w;
        dp2 dp2Var = fp2Var.i;
        if (dp2Var != null) {
            dp2Var.run();
        }
        fp2Var.i = null;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f = vm2.f(0.125f, getThemedColor(aob.d6), getThemedColor(aob.G6));
            c51 c51Var = this.n;
            if (c51Var != null && f != this.x) {
                this.x = f;
                c51Var.setColor(f);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
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
        z2b z2bVar = this.r;
        if (f > 0.0f) {
            i3 = 0;
        }
        z2bVar.setVisibility(i3);
    }

    @Override
    public final void v0(float f, int i) {
    }
}
