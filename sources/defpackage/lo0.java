package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.ProfileActivity;
public final class lo0 extends m15 implements fn7 {
    public final long S;
    public final int T;
    public TL_stories.TL_premium_boostsStatus U;
    public wg1 V;
    public ScrollSlidingTextTabStrip W;
    public final ArrayList X;
    public final ArrayList Y;
    public boolean Z;
    public int a0;
    public boolean b0;
    public int c0;
    public final ArrayList d0;
    public int e0;
    public LimitPreviewView f0;
    public final eo0 g0;
    public boolean h0;
    public LinearLayout i0;
    public final TLRPC.Chat j0;
    public String k0;
    public String l0;
    public byte m0;
    public byte n0;
    public int o0;
    public int p0;

    public lo0(long j) {
        int i = yac.t0;
        this.T = i;
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = 0;
        this.g0 = new eo0(this);
        this.k0 = "";
        this.l0 = "";
        this.m0 = (byte) 5;
        this.n0 = (byte) 5;
        this.S = j;
        this.j0 = uc7.s1(i).M0(Long.valueOf(-j));
    }

    public final void E0(Context context, View view, int i) {
        boolean z = false;
        if (view instanceof zx4) {
            zx4 zx4Var = (zx4) view;
            TL_stories.Boost boost = zx4Var.getBoost();
            boolean z2 = boost.giveaway;
            if (z2 && boost.stars > 0) {
                nza.i1(context, this.T, this.S, boost, getResourceProvider());
            } else {
                boolean z3 = boost.gift;
                if (((!z3 && !z2) || boost.user_id < 0) && !boost.unclaimed) {
                    if (z2 && boost.user_id == -1) {
                        c21 c21Var = new c21(getParentActivity(), getResourceProvider());
                        c21Var.g(2131623982, 36, 36, new String[0]);
                        c21Var.b.setText(ob6.M0(2131753296, null));
                        c21Var.b.setSingleLine(false);
                        c21Var.b.setMaxLines(2);
                        v21.g(this, c21Var, 2750).j();
                    } else if (!z3 && !z2) {
                        presentFragment(ProfileActivity.Q2(zx4Var.getDialogId()));
                    }
                } else {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = uc7.s1(yac.t0).y1(-this.j0.id);
                    int i2 = boost.date;
                    tL_payments_checkedGiftCode.date = i2;
                    tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                    int i3 = boost.expires - i2;
                    tL_payments_checkedGiftCode.days = i3 / 86400;
                    tL_payments_checkedGiftCode.months = (i3 / 30) / 86400;
                    if (boost.unclaimed) {
                        tL_payments_checkedGiftCode.to_id = -1L;
                        tL_payments_checkedGiftCode.flags = -1;
                    } else {
                        tL_payments_checkedGiftCode.boost = boost;
                    }
                    new tv4(this, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                }
            }
        }
        boolean z4 = view instanceof skb;
        long j = this.S;
        if (z4) {
            dn0.E0(this, this.resourceProvider, j, null);
        }
        if (view instanceof cy4) {
            dn0.E0(this, this.resourceProvider, j, ((cy4) view).getPrepaidGiveaway());
        }
        if (((ko0) this.d0.get(i)).a == 9) {
            if (this.e0 == 1) {
                z = true;
            }
            H0(Boolean.valueOf(z));
        }
    }

    public final void F0(CountDownLatch countDownLatch, bo0 bo0Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.n0;
        tL_premium_getBoostsList.offset = this.k0;
        int i = this.T;
        tL_premium_getBoostsList.peer = uc7.s1(i).j1(this.S);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new fn0(this, countDownLatch, bo0Var, (byte) 4), 2);
    }

    public final void G0(CountDownLatch countDownLatch, bo0 bo0Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.m0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.l0;
        int i = this.T;
        tL_premium_getBoostsList.peer = uc7.s1(i).j1(this.S);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new fn0(this, countDownLatch, bo0Var, (byte) 5), 2);
    }

    public final void H0(Boolean bool) {
        if (this.h0) {
            return;
        }
        this.h0 = true;
        if (bool == null) {
            Utilities.e.c(new bo0(this, (byte) 1));
        } else if (bool.booleanValue()) {
            G0(null, new bo0(this, (byte) 2));
        } else {
            F0(null, new bo0(this, (byte) 3));
        }
    }

    public final void I0(boolean z) {
        int i;
        int i2;
        View view;
        float f;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f0 == null) {
            LimitPreviewView limitPreviewView = new LimitPreviewView(getParentActivity(), 2131231129, 0, 0, this.resourceProvider);
            this.f0 = limitPreviewView;
            limitPreviewView.d0 = true;
            limitPreviewView.setDarkGradientProvider(new tg0(this, (byte) 7));
        }
        if (this.f0.getParent() != null) {
            ((ViewGroup) this.f0.getParent()).removeView(this.f0);
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U;
        if (tL_premium_boostsStatus != null) {
            this.f0.h(tL_premium_boostsStatus, false);
            if (z) {
                this.f0.setAlpha(0.0f);
                this.f0.animate().alpha(1.0f).start();
            }
        }
        TLRPC.Chat chat = this.j0;
        if (xc2.V(chat)) {
            i = 2131753582;
        } else {
            i = 2131753580;
        }
        String M0 = ob6.M0(i, null);
        if (xc2.V(chat)) {
            i2 = 2131753581;
        } else {
            i2 = 2131753579;
        }
        SpannableStringBuilder S2 = hl.S2(ob6.M0(i2, null));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        if (this.U != null) {
            view = this.f0;
        } else {
            view = new View(frameLayout.getContext());
        }
        if (this.U != null) {
            f = -2.0f;
        } else {
            f = 110.0f;
        }
        frameLayout.addView(view, tre.d(-1, f, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        i0(M0, S2, frameLayout, new io0(this, getParentActivity()));
    }

    public final void J0(boolean z) {
        boolean z2;
        int i;
        int i2;
        boolean z3;
        boolean z4;
        ArrayList arrayList = new ArrayList(this.d0);
        this.d0.clear();
        this.d0.add(new ka(14, false));
        if (this.U != null) {
            this.d0.add(new ko0(16, ob6.M0(2131744552, null)));
            this.d0.add(new ka(0, false));
            this.d0.add(new ka(2, false));
            if (this.U.prepaid_giveaways.size() > 0) {
                this.d0.add(new ko0(12, ob6.M0(2131753317, null)));
                for (int i3 = 0; i3 < this.U.prepaid_giveaways.size(); i3++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.U.prepaid_giveaways.get(i3);
                    ArrayList arrayList2 = this.d0;
                    if (i3 == this.U.prepaid_giveaways.size() - 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    ?? kaVar = new ka(11, true);
                    kaVar.e = prepaidGiveaway;
                    kaVar.f = z4;
                    arrayList2.add(kaVar);
                }
                this.d0.add(new ko0(6, ob6.M0(2131753279, null)));
            }
            this.d0.add(new ko0(13, ob6.M0(2131753599, null)));
            int i4 = 2131753597;
            if (this.e0 == 0) {
                if (this.X.isEmpty()) {
                    this.d0.add(new ka(8, false));
                    this.d0.add(new ka(2, false));
                } else {
                    for (int i5 = 0; i5 < this.X.size(); i5++) {
                        ArrayList arrayList3 = this.d0;
                        TL_stories.Boost boost = (TL_stories.Boost) this.X.get(i5);
                        if (i5 == this.X.size() - 1 && !this.Z) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        arrayList3.add(new ko0(boost, z3, this.e0));
                    }
                    boolean z5 = this.Z;
                    ArrayList arrayList4 = this.d0;
                    if (z5) {
                        arrayList4.add(new ka(9, true));
                    } else {
                        arrayList4.add(new ka(7, false));
                    }
                    ArrayList arrayList5 = this.d0;
                    if (xc2.V(this.j0)) {
                        i4 = 2131753598;
                    }
                    arrayList5.add(new ko0(6, ob6.M0(i4, null)));
                }
            } else if (this.Y.isEmpty()) {
                this.d0.add(new ka(8, false));
                this.d0.add(new ka(2, false));
            } else {
                for (int i6 = 0; i6 < this.Y.size(); i6++) {
                    ArrayList arrayList6 = this.d0;
                    TL_stories.Boost boost2 = (TL_stories.Boost) this.Y.get(i6);
                    if (i6 == this.Y.size() - 1 && !this.b0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    arrayList6.add(new ko0(boost2, z2, this.e0));
                }
                boolean z6 = this.b0;
                ArrayList arrayList7 = this.d0;
                if (z6) {
                    arrayList7.add(new ka(9, true));
                } else {
                    arrayList7.add(new ka(7, false));
                }
                ArrayList arrayList8 = this.d0;
                if (xc2.V(this.j0)) {
                    i4 = 2131753598;
                }
                arrayList8.add(new ko0(6, ob6.M0(i4, null)));
            }
            this.d0.add(new ko0(1, ob6.M0(2131748668, null)));
            this.d0.add(new ko0(3, this.U.boost_url));
            if (uc7.s1(this.T).k4.W1.f && xc2.N(this.j0)) {
                ArrayList arrayList9 = this.d0;
                if (xc2.V(this.j0)) {
                    i = 2131753262;
                } else {
                    i = 2131753261;
                }
                arrayList9.add(new ko0(6, ob6.M0(i, null)));
                this.d0.add(new ka(10, true));
                ArrayList arrayList10 = this.d0;
                if (xc2.V(this.j0)) {
                    i2 = 2131753496;
                } else {
                    i2 = 2131753495;
                }
                arrayList10.add(new ko0(6, ob6.M0(i2, null)));
            } else {
                this.d0.add(new ko0(6, ""));
            }
            this.d0.add(new ka(15, false));
        }
        eo0 eo0Var = this.g0;
        if (z) {
            eo0Var.E(arrayList, this.d0);
        } else {
            eo0Var.f();
        }
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        I0(false);
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        this.c.setItemAnimator(zb3Var);
        this.c.setOnItemClickListener(new l0(this, context, (byte) 2));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.i0 = linearLayout;
        linearLayout.setOrientation(1);
        this.i0.addView(new fo0(parentActivity), tre.t(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.i0, tre.e(-1, -2, 17));
        this.i0.setAlpha(0.0f);
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U;
        LinearLayout linearLayout2 = this.i0;
        if (tL_premium_boostsStatus == null) {
            linearLayout2.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().G0().a(this.S, new co0(this, (byte) 1));
        } else {
            linearLayout2.setVisibility(8);
            H0(null);
        }
        J0(false);
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        e eVar;
        e eVar2;
        if (i == jn7.X2) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            e eVar3 = null;
            if (fragmentStack.size() >= 2) {
                eVar = (e) bp1.m(2, fragmentStack);
            } else {
                eVar = null;
            }
            if (eVar instanceof g92) {
                ((ActionBarLayout) getParentLayout()).c0(eVar, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            if (fragmentStack2.size() >= 2) {
                eVar2 = (e) bp1.m(2, fragmentStack2);
            } else {
                eVar2 = null;
            }
            if (booleanValue) {
                if (fragmentStack2.size() >= 3) {
                    eVar3 = (e) bp1.m(3, fragmentStack2);
                }
                if (eVar2 instanceof ProfileActivity) {
                    ((ActionBarLayout) getParentLayout()).c0(eVar2, false);
                }
                finishFragment();
                if (eVar3 instanceof zu1) {
                    ym0.f(eVar3, chat, true);
                }
                if (eVar2 instanceof zu1) {
                    ym0.f(eVar2, chat, true);
                    return;
                }
                return;
            }
            finishFragment();
            if ((eVar2 instanceof ProfileActivity) || (eVar2 instanceof zu1)) {
                ym0.f(eVar2, chat, false);
            }
        } else if (i == jn7.r3) {
            if (this.S == ((Long) objArr[2]).longValue()) {
                this.U = (TL_stories.TL_premium_boostsStatus) objArr[0];
                this.V = (wg1) objArr[1];
            }
        }
    }

    @Override
    public final j79 j0() {
        return this.g0;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.X2);
        getNotificationCenter().b(this, jn7.r3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.X2);
        getNotificationCenter().n(this, jn7.r3);
        super.onFragmentDestroy();
    }
}
