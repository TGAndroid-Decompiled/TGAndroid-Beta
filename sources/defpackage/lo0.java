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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.ProfileActivity;
public final class lo0 extends iz4 implements gk7 {
    public final long S;
    public final int T;
    public TL_stories.TL_premium_boostsStatus U;
    public ng1 V;
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
        int i = y6c.t0;
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
        this.j0 = na7.q1(i).K0(Long.valueOf(-j));
    }

    public final void D0(Context context, View view, int i) {
        boolean z = false;
        if (view instanceof uv4) {
            uv4 uv4Var = (uv4) view;
            TL_stories.Boost boost = uv4Var.getBoost();
            boolean z2 = boost.giveaway;
            if (z2 && boost.stars > 0) {
                jva.h1(context, this.T, this.S, boost, getResourceProvider());
            } else {
                boolean z3 = boost.gift;
                if (((!z3 && !z2) || boost.user_id < 0) && !boost.unclaimed) {
                    if (z2 && boost.user_id == -1) {
                        t11 t11Var = new t11(getParentActivity(), getResourceProvider());
                        t11Var.c(2131623982, 36, 36, new String[0]);
                        t11Var.b.setText(k96.M0(2131753300, null));
                        t11Var.b.setSingleLine(false);
                        t11Var.b.setMaxLines(2);
                        m21.g(this, t11Var, 2750).j();
                    } else if (!z3 && !z2) {
                        presentFragment(ProfileActivity.P2(uv4Var.getDialogId()));
                    }
                } else {
                    TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                    tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                    tL_payments_checkedGiftCode.to_id = boost.user_id;
                    tL_payments_checkedGiftCode.from_id = na7.q1(y6c.t0).w1(-this.j0.id);
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
                    new pt4(this, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                }
            }
        }
        boolean z4 = view instanceof wgb;
        long j = this.S;
        if (z4) {
            dn0.D0(this, this.resourceProvider, j, null);
        }
        if (view instanceof xv4) {
            dn0.D0(this, this.resourceProvider, j, ((xv4) view).getPrepaidGiveaway());
        }
        if (((ko0) this.d0.get(i)).a == 9) {
            if (this.e0 == 1) {
                z = true;
            }
            G0(Boolean.valueOf(z));
        }
    }

    public final void E0(CountDownLatch countDownLatch, bo0 bo0Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.n0;
        tL_premium_getBoostsList.offset = this.k0;
        int i = this.T;
        tL_premium_getBoostsList.peer = na7.q1(i).h1(this.S);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new en0(this, countDownLatch, bo0Var, (byte) 4), 2);
    }

    public final void F0(CountDownLatch countDownLatch, bo0 bo0Var) {
        TL_stories.TL_premium_getBoostsList tL_premium_getBoostsList = new TL_stories.TL_premium_getBoostsList();
        tL_premium_getBoostsList.limit = this.m0;
        tL_premium_getBoostsList.gifts = true;
        tL_premium_getBoostsList.offset = this.l0;
        int i = this.T;
        tL_premium_getBoostsList.peer = na7.q1(i).h1(this.S);
        ConnectionsManager.getInstance(i).sendRequest(tL_premium_getBoostsList, new en0(this, countDownLatch, bo0Var, (byte) 5), 2);
    }

    public final void G0(Boolean bool) {
        if (this.h0) {
            return;
        }
        this.h0 = true;
        if (bool == null) {
            Utilities.e.c(new bo0(this, (byte) 1));
        } else if (bool.booleanValue()) {
            F0(null, new bo0(this, (byte) 2));
        } else {
            E0(null, new bo0(this, (byte) 3));
        }
    }

    public final void H0(boolean z) {
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
            limitPreviewView.setDarkGradientProvider(new sg0(this, (byte) 7));
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
        if (hc2.V(chat)) {
            i = 2131753586;
        } else {
            i = 2131753584;
        }
        String M0 = k96.M0(i, null);
        if (hc2.V(chat)) {
            i2 = 2131753585;
        } else {
            i2 = 2131753583;
        }
        SpannableStringBuilder T2 = gl.T2(k96.M0(i2, null));
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
        frameLayout.addView(view, nme.d(-1, f, 0, 8.0f, 46.0f, 8.0f, 33.0f));
        i0(M0, T2, frameLayout, new io0(this, getParentActivity()));
    }

    public final void I0(boolean z) {
        boolean z2;
        int i;
        int i2;
        boolean z3;
        boolean z4;
        ArrayList arrayList = new ArrayList(this.d0);
        this.d0.clear();
        this.d0.add(new ja(14, false));
        if (this.U != null) {
            this.d0.add(new ko0(16, k96.M0(2131744658, null)));
            this.d0.add(new ja(0, false));
            this.d0.add(new ja(2, false));
            if (this.U.prepaid_giveaways.size() > 0) {
                this.d0.add(new ko0(12, k96.M0(2131753321, null)));
                for (int i3 = 0; i3 < this.U.prepaid_giveaways.size(); i3++) {
                    TL_stories.PrepaidGiveaway prepaidGiveaway = this.U.prepaid_giveaways.get(i3);
                    ArrayList arrayList2 = this.d0;
                    if (i3 == this.U.prepaid_giveaways.size() - 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    ?? jaVar = new ja(11, true);
                    jaVar.e = prepaidGiveaway;
                    jaVar.f = z4;
                    arrayList2.add(jaVar);
                }
                this.d0.add(new ko0(6, k96.M0(2131753283, null)));
            }
            this.d0.add(new ko0(13, k96.M0(2131753603, null)));
            int i4 = 2131753601;
            if (this.e0 == 0) {
                if (this.X.isEmpty()) {
                    this.d0.add(new ja(8, false));
                    this.d0.add(new ja(2, false));
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
                        arrayList4.add(new ja(9, true));
                    } else {
                        arrayList4.add(new ja(7, false));
                    }
                    ArrayList arrayList5 = this.d0;
                    if (hc2.V(this.j0)) {
                        i4 = 2131753602;
                    }
                    arrayList5.add(new ko0(6, k96.M0(i4, null)));
                }
            } else if (this.Y.isEmpty()) {
                this.d0.add(new ja(8, false));
                this.d0.add(new ja(2, false));
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
                    arrayList7.add(new ja(9, true));
                } else {
                    arrayList7.add(new ja(7, false));
                }
                ArrayList arrayList8 = this.d0;
                if (hc2.V(this.j0)) {
                    i4 = 2131753602;
                }
                arrayList8.add(new ko0(6, k96.M0(i4, null)));
            }
            this.d0.add(new ko0(1, k96.M0(2131748722, null)));
            this.d0.add(new ko0(3, this.U.boost_url));
            if (na7.q1(this.T).k4.O1.f && hc2.N(this.j0)) {
                ArrayList arrayList9 = this.d0;
                if (hc2.V(this.j0)) {
                    i = 2131753266;
                } else {
                    i = 2131753265;
                }
                arrayList9.add(new ko0(6, k96.M0(i, null)));
                this.d0.add(new ja(10, true));
                ArrayList arrayList10 = this.d0;
                if (hc2.V(this.j0)) {
                    i2 = 2131753500;
                } else {
                    i2 = 2131753499;
                }
                arrayList10.add(new ko0(6, k96.M0(i2, null)));
            } else {
                this.d0.add(new ko0(6, ""));
            }
            this.d0.add(new ja(15, false));
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
        H0(false);
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        this.c.setItemAnimator(gb3Var);
        this.c.setOnItemClickListener(new k0(this, context, (byte) 2));
        Activity parentActivity = getParentActivity();
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        this.i0 = linearLayout;
        linearLayout.setOrientation(1);
        this.i0.addView(new fo0(parentActivity), nme.t(100, 100, 17, 0, 120, 0, 0));
        ((ViewGroup) this.fragmentView).addView(this.i0, nme.e(-1, -2, 17));
        this.i0.setAlpha(0.0f);
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U;
        LinearLayout linearLayout2 = this.i0;
        if (tL_premium_boostsStatus == null) {
            linearLayout2.animate().alpha(1.0f).setDuration(200L).setStartDelay(500L).start();
            getMessagesController().E0().a(this.S, new co0(this, (byte) 1));
        } else {
            linearLayout2.setVisibility(8);
            G0(null);
        }
        I0(false);
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        d dVar;
        d dVar2;
        if (i == kk7.W2) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            List fragmentStack = getParentLayout().getFragmentStack();
            d dVar3 = null;
            if (fragmentStack.size() >= 2) {
                dVar = (d) oo1.m(2, fragmentStack);
            } else {
                dVar = null;
            }
            if (dVar instanceof p82) {
                ((ActionBarLayout) getParentLayout()).c0(dVar, false);
            }
            List fragmentStack2 = getParentLayout().getFragmentStack();
            if (fragmentStack2.size() >= 2) {
                dVar2 = (d) oo1.m(2, fragmentStack2);
            } else {
                dVar2 = null;
            }
            if (booleanValue) {
                if (fragmentStack2.size() >= 3) {
                    dVar3 = (d) oo1.m(3, fragmentStack2);
                }
                if (dVar2 instanceof ProfileActivity) {
                    ((ActionBarLayout) getParentLayout()).c0(dVar2, false);
                }
                finishFragment();
                if (dVar3 instanceof mu1) {
                    ym0.f(dVar3, chat, true);
                }
                if (dVar2 instanceof mu1) {
                    ym0.f(dVar2, chat, true);
                    return;
                }
                return;
            }
            finishFragment();
            if ((dVar2 instanceof ProfileActivity) || (dVar2 instanceof mu1)) {
                ym0.f(dVar2, chat, false);
            }
        } else if (i == kk7.q3) {
            if (this.S == ((Long) objArr[2]).longValue()) {
                this.U = (TL_stories.TL_premium_boostsStatus) objArr[0];
                this.V = (ng1) objArr[1];
            }
        }
    }

    @Override
    public final w39 j0() {
        return this.g0;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, kk7.W2);
        getNotificationCenter().b(this, kk7.q3);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, kk7.W2);
        getNotificationCenter().n(this, kk7.q3);
        super.onFragmentDestroy();
    }
}
