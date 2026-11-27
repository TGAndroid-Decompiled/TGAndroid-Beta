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
import org.telegram.ui.ActionBar.e;
public final class x60 extends e implements fn7 {
    public w60 a;
    public w60 b;
    public w60 c;
    public w60 d;
    public w60 e;
    public LinearLayout f;
    public final ArrayList h;
    public int n;
    public ny9 r;

    public x60() {
        super(null);
        this.h = new ArrayList();
        this.n = 0;
    }

    public final int Y() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i < arrayList.size()) {
                if (((w60) arrayList.get(i)).b.f) {
                    return ((w60) arrayList.get(i)).e;
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
        transitionSet.setInterpolator((TimeInterpolator) k43.f);
        TransitionManager.beginDelayedTransition(this.f, transitionSet);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i2 < arrayList.size()) {
                if (((w60) arrayList.get(i2)).e == i) {
                    a0((View) arrayList.get(i2), z);
                    return;
                }
                i2++;
            } else {
                int i3 = 0;
                while (i3 < arrayList.size()) {
                    if (((w60) arrayList.get(i3)).d) {
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
                    } else if (i < ((w60) arrayList.get(i4)).e) {
                        size = i4 + 1;
                        break;
                    } else {
                        i4++;
                    }
                }
                ?? i29Var = new i29(getParentActivity(), null);
                i29Var.d = true;
                i29Var.e = i;
                i29Var.c(ob6.a0("AutoDeleteAfterShort", null, 2131753865, ob6.c0(i * 60)), false, true);
                arrayList.add(size, i29Var);
                this.f.addView((View) i29Var, size);
                b0();
                a0(i29Var, z);
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
                ((w60) arrayList.get(i2)).a(true, this.fragmentBeginToShow);
            } else {
                ((w60) arrayList.get(i2)).a(false, this.fragmentBeginToShow);
            }
            i2++;
        }
        if (z && (i = ((w60) view).e) > 0) {
            c00.v(ob6.a0("AutoDeleteGlobalTimerEnabled", null, 2131753850, ob6.c0(i * 60)), d31.b0(this), 2131624021, 36);
        }
    }

    public final void b0() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i < arrayList.size()) {
                int i2 = aob.d6;
                int w0 = aob.w0(null, i2, false);
                int i3 = aob.i6;
                yob.R((View) arrayList.get(i), aob.g0(w0, aob.w0(null, i3, false)), yob.M(i2), yob.M(i3), null);
                ((w60) arrayList.get(i)).setOnClickListener(new k1(this, (byte) 13));
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
        this.simpleActionBar.setTitle(ob6.M0(2131753843, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 5));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        u1 u1Var = new u1(getParentActivity(), (byte) 9);
        ny9 ny9Var = new ny9(getParentActivity(), u1Var, this.resourceProvider, true);
        this.r = ny9Var;
        ny9Var.setDrawBackground(true);
        this.r.setOverScrollMode(0);
        u1Var.setOrientation(1);
        this.r.addView(u1Var);
        frameLayout.addView(this.r);
        FrameLayout frameLayout2 = new FrameLayout(context);
        a3b a3bVar = new a3b(context, this.currentAccount);
        a3bVar.setStickerNum(10);
        frameLayout2.addView(a3bVar, tre.e(130, 130, 17));
        frameLayout2.setTag(-33024);
        u1Var.addView(frameLayout2, tre.o(-1, 170));
        LinearLayout linearLayout = new LinearLayout(getParentActivity());
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        yob.h(aob.d6, null, this.f);
        u1Var.addView(this.f, tre.o(-1, -2));
        mf5 mf5Var = new mf5(getParentActivity());
        mf5Var.setText(ob6.M0(2131748341, null));
        this.f.addView(mf5Var);
        ?? i29Var = new i29(getParentActivity(), null);
        this.a = i29Var;
        i29Var.c(ob6.M0(2131745089, null), false, true);
        w60 w60Var = this.a;
        w60Var.e = 0;
        this.f.addView(w60Var);
        ?? i29Var2 = new i29(getParentActivity(), null);
        this.b = i29Var2;
        i29Var2.c(ob6.M0(2131753868, null), false, true);
        w60 w60Var2 = this.b;
        w60Var2.e = 1440;
        this.f.addView(w60Var2);
        ?? i29Var3 = new i29(getParentActivity(), null);
        this.c = i29Var3;
        i29Var3.c(ob6.M0(2131753866, null), false, true);
        w60 w60Var3 = this.c;
        w60Var3.e = 10080;
        this.f.addView(w60Var3);
        ?? i29Var4 = new i29(getParentActivity(), null);
        this.d = i29Var4;
        i29Var4.c(ob6.M0(2131753867, null), false, true);
        w60 w60Var4 = this.d;
        w60Var4.e = 44640;
        this.f.addView(w60Var4);
        ?? i29Var5 = new i29(getParentActivity(), null);
        this.e = i29Var5;
        i29Var5.c(ob6.M0(2131745262, null), false, false);
        this.e.b.setVisibility(8);
        this.f.addView(this.e);
        w60 w60Var5 = this.a;
        ArrayList arrayList = this.h;
        arrayList.add(w60Var5);
        arrayList.add(this.b);
        arrayList.add(this.c);
        arrayList.add(this.d);
        arrayList.add(this.e);
        b0();
        ilb ilbVar = new ilb(12, this.resourceProvider, context);
        ilbVar.setText(hl.N2(ob6.M0(2131749307, null), -1, 0, new p1(this, (byte) 5), null));
        u1Var.addView(ilbVar, tre.o(-1, -2));
        Z(this.n, false);
        return this.fragmentView;
    }

    @Override
    public final ny9 getScrollViewForSimpleGlass() {
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
        getNotificationCenter().b(this, jn7.v5);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.v5);
    }

    @Override
    public final void onPause() {
        super.onPause();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i < arrayList.size()) {
                if (((w60) arrayList.get(i)).b.f) {
                    if (((w60) arrayList.get(i)).e != this.n) {
                        this.n = ((w60) arrayList.get(i)).e;
                        TLRPC.TL_messages_setDefaultHistoryTTL tL_messages_setDefaultHistoryTTL = new TLRPC.TL_messages_setDefaultHistoryTTL();
                        tL_messages_setDefaultHistoryTTL.period = ((w60) arrayList.get(i)).e * 60;
                        getConnectionsManager().sendRequest(tL_messages_setDefaultHistoryTTL, new Object());
                        getUserConfig().q0 = this.n;
                        jn7.f(this.currentAccount).k(jn7.v5, new Object[0]);
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
