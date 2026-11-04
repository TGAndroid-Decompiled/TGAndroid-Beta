package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.rw;
public final class ga implements View.OnClickListener {
    public final int f5192a = 1;
    public final int f5193b;
    public final Object f5194c;
    public final Object d;
    public final Object f5195e;
    public final Object f5196f;
    public final Object h;

    public ga(int i3, org.telegram.ui.ActionBar.t2 t2Var, org.telegram.ui.ActionBar.e6 e6Var, LinearLayout linearLayout, long[] jArr, ai.p1 p1Var) {
        this.f5193b = i3;
        this.f5194c = t2Var;
        this.d = e6Var;
        this.f5195e = linearLayout;
        this.f5196f = jArr;
        this.h = p1Var;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        boolean z10;
        int i3 = this.f5192a;
        int i10 = this.f5193b;
        Object obj = this.h;
        Object obj2 = this.f5196f;
        Object obj3 = this.f5195e;
        Object obj4 = this.d;
        Object obj5 = this.f5194c;
        switch (i3) {
            case 0:
                gi.d dVar = (gi.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.f27231id;
                    int i11 = this.f5193b;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_changeStarsSubscription, new cg.j0(dVar, t2VarArr, i11, tLObject, str, 2));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                ai.p1 p1Var = (ai.p1) obj;
                i0 g7 = i0.g(i10);
                g7.n();
                g7.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g7.f5275j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g7.f5277l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, h10.i(i10).f());
                f60 f60Var = new f60(t2Var.f28586b, e6Var, linearLayout, false, false, true);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj6 = arrayList.get(i12);
                    i12++;
                    TLObject tLObject2 = (TLObject) obj6;
                    if (tLObject2 instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject2).f27150id;
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (org.telegram.messenger.t3.V(chat)) {
                            j10 = -chat.f27001id;
                        }
                    }
                    long j11 = j10;
                    if (j11 == jArr[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long[] jArr2 = jArr;
                    f60Var.g(tLObject2, z10, new ai.r1(jArr2, j11, p1Var, 12));
                    jArr = jArr2;
                }
                f60Var.f33748t = false;
                f60Var.f33747s = 0;
                f60Var.V(5);
                f60Var.a0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                f60Var.Z();
                return;
            case 2:
                b5.l lVar = (b5.l) obj5;
                LinearLayout linearLayout2 = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                vh0 vh0Var = (vh0) obj;
                int currentItem = lVar.getCurrentItem();
                if (i10 != currentItem) {
                    vh0 vh0Var2 = (vh0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    lVar.x(i10, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = vh0Var.getX() - ((horizontalScrollView.getWidth() - vh0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(xq.f40452f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, vh0Var2, vh0Var));
                    duration.start();
                    return;
                }
                return;
            case 3:
                cb0 cb0Var = (cb0) obj3;
                hi.d dVar2 = (hi.d) obj2;
                u10 u10Var = (u10) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((cb0) obj5).getValue();
                tL_birthday.month = ((cb0) obj4).getValue() + 1;
                if (cb0Var.getValue() != i10) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = cb0Var.getValue();
                }
                ((org.telegram.ui.ActionBar.t2) dVar2.f14429b).f28625y0.run();
                u10Var.a(tL_birthday);
                return;
            case 4:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, (ei.b) obj2);
                String M0 = bd.M0(2131748806, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = bd.M0(2131748807, null);
                alertDialog$Builder.k(bd.M0(2131746034, null), new cg.e0((tq) obj4, (gi.d) obj5, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f5193b, 3));
                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj4;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                f60 F = f60.F(((org.telegram.ui.Wallet.y2[]) obj5)[0].f28589c, e6Var2, (ImageView) obj3);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    F.c(2131232354, bd.M0(2131742973, null), new rw(context, i10, wallettransactionArr, 16), false);
                }
                F.c(2131232817, bd.M0(2131742971, null), new b(2, context, e6Var2), false);
                F.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                F.Z();
                return;
        }
    }

    public ga(b5.l lVar, int i3, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, vh0 vh0Var) {
        this.f5194c = lVar;
        this.f5193b = i3;
        this.d = linearLayout;
        this.f5195e = atomicBoolean;
        this.f5196f = horizontalScrollView;
        this.h = vh0Var;
    }

    public ga(gi.d dVar, TL_stars.StarsSubscription starsSubscription, int i3, org.telegram.ui.ActionBar.t2[] t2VarArr, TLObject tLObject, String str) {
        this.f5194c = dVar;
        this.d = starsSubscription;
        this.f5193b = i3;
        this.f5195e = t2VarArr;
        this.f5196f = tLObject;
        this.h = str;
    }

    public ga(tq tqVar, Context context, ei.b bVar, gi.d dVar, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i3) {
        this.d = tqVar;
        this.f5195e = context;
        this.f5196f = bVar;
        this.f5194c = dVar;
        this.h = getgroupcallstreamrtmpurl;
        this.f5193b = i3;
    }

    public ga(cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3, int i3, hi.d dVar, u10 u10Var) {
        this.f5194c = cb0Var;
        this.d = cb0Var2;
        this.f5195e = cb0Var3;
        this.f5193b = i3;
        this.f5196f = dVar;
        this.h = u10Var;
    }

    public ga(org.telegram.ui.Wallet.y2[] y2VarArr, org.telegram.ui.ActionBar.e6 e6Var, ImageView imageView, TL_wallet.walletTransaction[] wallettransactionArr, Context context, int i3) {
        this.f5194c = y2VarArr;
        this.d = e6Var;
        this.f5195e = imageView;
        this.f5196f = wallettransactionArr;
        this.h = context;
        this.f5193b = i3;
    }
}
