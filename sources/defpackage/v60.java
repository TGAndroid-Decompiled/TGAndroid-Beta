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
public final class v60 extends d implements gk7 {
    public u60 a;
    public u60 b;
    public u60 c;
    public u60 d;
    public u60 e;
    public LinearLayout f;
    public final ArrayList h;
    public int n;
    public tu9 r;

    public v60() {
        super(null);
        this.h = new ArrayList();
        this.n = 0;
    }

    public final int Y() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i < arrayList.size()) {
                if (((u60) arrayList.get(i)).b.f) {
                    return ((u60) arrayList.get(i)).e;
                }
                i++;
            } else {
                return this.n;
            }
        }
    }

    public final void Z(int i, boolean z) {
        TransitionSet transitionSet = new TransitionSet();
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setDuration(150L);
        Fade fade = new Fade(1);
        fade.setDuration(150L);
        transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(changeBounds).addTransition(fade);
        transitionSet.setOrdering(0);
        transitionSet.setInterpolator((TimeInterpolator) s33.f);
        TransitionManager.beginDelayedTransition(this.f, transitionSet);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i2 < arrayList.size()) {
                if (((u60) arrayList.get(i2)).e == i) {
                    a0((View) arrayList.get(i2), z);
                    return;
                }
                i2++;
            } else {
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    if (((u60) arrayList.get(i3)).d) {
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
                    } else if (i < ((u60) arrayList.get(i4)).e) {
                        size = i4 + 1;
                        break;
                    } else {
                        i4++;
                    }
                }
                ?? vy8Var = new vy8(getParentActivity(), null);
                vy8Var.d = true;
                vy8Var.e = i;
                vy8Var.c(k96.a0("AutoDeleteAfterShort", null, 2131753869, k96.c0(i * 60)), false, true);
                arrayList.add(size, vy8Var);
                this.f.addView((View) vy8Var, size);
                b0();
                a0(vy8Var, z);
                return;
            }
        }
    }

    public final void a0(View view, boolean z) {
        int i;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i2 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i2) == view) {
                ((u60) arrayList.get(i2)).a(true, this.fragmentBeginToShow);
            } else {
                ((u60) arrayList.get(i2)).a(false, this.fragmentBeginToShow);
            }
            i2++;
        }
        if (z && (i = ((u60) view).e) > 0) {
            b00.u(k96.a0("AutoDeleteGlobalTimerEnabled", null, 2131753854, k96.c0(i * 60)), u21.b0(this), 2131624021, 36);
        }
    }

    public final void b0() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i < arrayList.size()) {
                int i2 = bkb.c6;
                int w0 = bkb.w0(null, i2, false);
                int i3 = bkb.h6;
                zkb.R((View) arrayList.get(i), bkb.g0(w0, bkb.w0(null, i3, false)), zkb.M(i2), zkb.M(i3), null);
                ((u60) arrayList.get(i)).setOnClickListener(new j1(this, (byte) 13));
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131753847, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 5));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        t1 t1Var = new t1(getParentActivity(), (byte) 9);
        tu9 tu9Var = new tu9(getParentActivity(), t1Var, this.resourceProvider, true);
        this.r = tu9Var;
        tu9Var.setDrawBackground(true);
        this.r.setOverScrollMode(0);
        t1Var.setOrientation(1);
        this.r.addView(t1Var);
        frameLayout.addView(this.r);
        FrameLayout frameLayout2 = new FrameLayout(context);
        aza azaVar = new aza(context, this.currentAccount);
        azaVar.setStickerNum(10);
        frameLayout2.addView(azaVar, nme.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        t1Var.addView(frameLayout2, nme.o(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        zkb.h(bkb.c6, null, this.f);
        t1Var.addView(this.f, nme.o(-1, -2));
        ld5 ld5Var = new ld5(getParentActivity());
        ld5Var.setText(k96.M0(2131748395, null));
        this.f.addView(ld5Var);
        ?? vy8Var = new vy8(getParentActivity(), null);
        this.a = vy8Var;
        vy8Var.c(k96.M0(2131745169, null), false, true);
        u60 u60Var = this.a;
        u60Var.e = 0;
        this.f.addView(u60Var);
        ?? vy8Var2 = new vy8(getParentActivity(), null);
        this.b = vy8Var2;
        vy8Var2.c(k96.M0(2131753872, null), false, true);
        u60 u60Var2 = this.b;
        u60Var2.e = 1440;
        this.f.addView(u60Var2);
        ?? vy8Var3 = new vy8(getParentActivity(), null);
        this.c = vy8Var3;
        vy8Var3.c(k96.M0(2131753870, null), false, true);
        u60 u60Var3 = this.c;
        u60Var3.e = 10080;
        this.f.addView(u60Var3);
        ?? vy8Var4 = new vy8(getParentActivity(), null);
        this.d = vy8Var4;
        vy8Var4.c(k96.M0(2131753871, null), false, true);
        u60 u60Var4 = this.d;
        u60Var4.e = 44640;
        this.f.addView(u60Var4);
        ?? vy8Var5 = new vy8(getParentActivity(), null);
        this.e = vy8Var5;
        vy8Var5.c(k96.M0(2131745342, null), false, false);
        this.e.b.setVisibility(8);
        this.f.addView(this.e);
        u60 u60Var5 = this.a;
        ArrayList arrayList = this.h;
        arrayList.add(u60Var5);
        arrayList.add(this.b);
        arrayList.add(this.c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        b0();
        mhb mhbVar = new mhb(12, this.resourceProvider, context);
        mhbVar.setText(gl.O2(k96.M0(2131749361, null), -1, 0, new o1(this, (byte) 5), null));
        t1Var.addView(mhbVar, nme.o(-1, -2));
        Z(this.n, false);
        return this.fragmentView;
    }

    @Override
    public final tu9 getScrollViewForSimpleGlass() {
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
        getNotificationCenter().b(this, kk7.u5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, kk7.u5);
    }

    @Override
    public final void onPause() {
        super.onPause();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i < arrayList.size()) {
                if (((u60) arrayList.get(i)).b.f) {
                    if (((u60) arrayList.get(i)).e != this.n) {
                        this.n = ((u60) arrayList.get(i)).e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((u60) arrayList.get(i)).e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().q0 = this.n;
                        kk7.f(this.currentAccount).k(kk7.u5, new Object[0]);
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
