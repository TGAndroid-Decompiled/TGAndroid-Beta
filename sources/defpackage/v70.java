package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class v70 extends d implements jm7 {
    public u70 a;
    public u70 b;
    public u70 c;
    public u70 d;
    public u70 e;
    public LinearLayout f;
    public final ArrayList h;
    public int n;
    public ww9 r;

    public v70() {
        super(null);
        this.h = new ArrayList();
        this.n = 0;
    }

    public final int Z() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i < arrayList.size()) {
                if (((u70) arrayList.get(i)).b.f) {
                    return ((u70) arrayList.get(i)).e;
                }
                i++;
            } else {
                return this.n;
            }
        }
    }

    public final void a0(int i, boolean z) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) d53.f);
        TransitionManager.beginDelayedTransition(this.f, transitionSet);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i2 < arrayList.size()) {
                if (((u70) arrayList.get(i2)).e == i) {
                    b0((View) arrayList.get(i2), z);
                    return;
                }
                i2++;
            } else {
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    if (((u70) arrayList.get(i3)).d) {
                        this.f.removeView((View) arrayList.get(i3));
                        arrayList.remove(i3);
                        i3--;
                    }
                    i3++;
                }
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    } else if (i < ((u70) arrayList.get(i4)).e) {
                        size = i4 + 1;
                        break;
                    } else {
                        i4++;
                    }
                }
                ?? w09Var = new w09(getParentActivity(), null);
                w09Var.d = true;
                w09Var.e = i;
                w09Var.c(jb6.a0("AutoDeleteAfterShort", null, 2131753837, jb6.c0(i * 60)), false, true);
                arrayList.add(size, w09Var);
                this.f.addView((View) w09Var, size);
                c0();
                b0(w09Var, z);
                return;
            }
        }
    }

    public final void b0(View view, boolean z) {
        int i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i2) == view) {
                ((u70) arrayList.get(i2)).a(true, this.fragmentBeginToShow);
            } else {
                ((u70) arrayList.get(i2)).a(false, this.fragmentBeginToShow);
            }
            i2++;
        }
        if (z && (i = ((u70) view).e) > 0) {
            b10.u(jb6.a0("AutoDeleteGlobalTimerEnabled", null, 2131753822, jb6.c0(i * 60)), c41.b0(this), 2131624021, 36);
        }
    }

    public final void c0() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i < arrayList.size()) {
                int i2 = cmb.c6;
                int w0 = cmb.w0(null, i2, false);
                int i3 = cmb.h6;
                anb.R((View) arrayList.get(i), cmb.g0(w0, cmb.w0(null, i3, false)), anb.M(i2), anb.M(i3), null);
                ((u70) arrayList.get(i)).setOnClickListener(new j1(this, (byte) 14));
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setTitle(jb6.M0(2131753815, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 5));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        t1 t1Var = new t1(getParentActivity(), (byte) 9);
        ww9 ww9Var = new ww9(getParentActivity(), t1Var, this.resourceProvider, true);
        this.r = ww9Var;
        ww9Var.setDrawBackground(true);
        this.r.setOverScrollMode(0);
        t1Var.setOrientation(1);
        this.r.addView(t1Var);
        frameLayout.addView(this.r);
        FrameLayout frameLayout2 = new FrameLayout(context);
        b1b b1bVar = new b1b(context, this.currentAccount);
        b1bVar.setStickerNum(10);
        frameLayout2.addView(b1bVar, qoe.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        t1Var.addView(frameLayout2, qoe.o(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        anb.h(cmb.c6, null, this.f);
        t1Var.addView(this.f, qoe.o(-1, -2));
        jf5 jf5Var = new jf5(getParentActivity());
        jf5Var.setText(jb6.M0(2131748344, null));
        this.f.addView(jf5Var);
        ?? w09Var = new w09(getParentActivity(), null);
        this.a = w09Var;
        w09Var.c(jb6.M0(2131745095, null), false, true);
        u70 u70Var = this.a;
        u70Var.e = 0;
        this.f.addView(u70Var);
        ?? w09Var2 = new w09(getParentActivity(), null);
        this.b = w09Var2;
        w09Var2.c(jb6.M0(2131753840, null), false, true);
        u70 u70Var2 = this.b;
        u70Var2.e = 1440;
        this.f.addView(u70Var2);
        ?? w09Var3 = new w09(getParentActivity(), null);
        this.c = w09Var3;
        w09Var3.c(jb6.M0(2131753838, null), false, true);
        u70 u70Var3 = this.c;
        u70Var3.e = 10080;
        this.f.addView(u70Var3);
        ?? w09Var4 = new w09(getParentActivity(), null);
        this.d = w09Var4;
        w09Var4.c(jb6.M0(2131753839, null), false, true);
        u70 u70Var4 = this.d;
        u70Var4.e = 44640;
        this.f.addView(u70Var4);
        ?? w09Var5 = new w09(getParentActivity(), null);
        this.e = w09Var5;
        w09Var5.c(jb6.M0(2131745268, null), false, false);
        this.e.b.setVisibility(8);
        this.f.addView(this.e);
        u70 u70Var5 = this.a;
        ArrayList arrayList = this.h;
        arrayList.add(u70Var5);
        arrayList.add(this.b);
        arrayList.add(this.c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        c0();
        njb njbVar = new njb(12, this.resourceProvider, context);
        njbVar.setText(gm.N2(jb6.M0(2131749310, null), -1, 0, new o1(this, (byte) 5), null));
        t1Var.addView(njbVar, qoe.o(-1, -2));
        a0(this.n, false);
        return this.fragmentView;
    }

    @Override
    public final ww9 getScrollViewForSimpleGlass() {
        return this.r;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        int i = getUserConfig().q0;
        this.n = i;
        if (i < 0) {
            this.n = 0;
        }
        getUserConfig().s();
        getNotificationCenter().b(this, nm7.w5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, nm7.w5);
    }

    @Override
    public final void onPause() {
        super.onPause();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i < arrayList.size()) {
                if (((u70) arrayList.get(i)).b.f) {
                    if (((u70) arrayList.get(i)).e != this.n) {
                        this.n = ((u70) arrayList.get(i)).e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((u70) arrayList.get(i)).e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().q0 = this.n;
                        nm7.f(this.currentAccount).k(nm7.w5, new Object[0]);
                        return;
                    }
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
    }
}
