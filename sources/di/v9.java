package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.ou;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.wh0;
public final class v9 implements View.OnClickListener {
    public final int f9616a = 1;
    public final int f9617b;
    public final Object f9618c;
    public final Object d;
    public final Object f9619e;
    public final Object f9620f;
    public final Object h;

    public v9(int i7, org.telegram.ui.ActionBar.u2 u2Var, org.telegram.ui.ActionBar.e6 e6Var, LinearLayout linearLayout, long[] jArr, ai.g1 g1Var) {
        this.f9617b = i7;
        this.f9618c = u2Var;
        this.d = e6Var;
        this.f9619e = linearLayout;
        this.f9620f = jArr;
        this.h = g1Var;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        int i7 = this.f9616a;
        int i10 = this.f9617b;
        Object obj = this.h;
        Object obj2 = this.f9620f;
        Object obj3 = this.f9619e;
        Object obj4 = this.d;
        Object obj5 = this.f9618c;
        switch (i7) {
            case 0:
                hi.d dVar = (hi.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.f28281id;
                    int i11 = this.f9617b;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_changeStarsSubscription, new bg.k0(dVar, u2VarArr, i11, tLObject, str, 2));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                ai.g1 g1Var = (ai.g1) obj;
                e0 g10 = e0.g(i10);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f8437j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f8439l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, m10.i(i10).f());
                m60 m60Var = new m60(u2Var.f29682b, e6Var, linearLayout, false, false, true);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj6 = arrayList.get(i12);
                    i12++;
                    TLObject tLObject2 = (TLObject) obj6;
                    if (tLObject2 instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject2).f28200id;
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (org.telegram.messenger.t3.V(chat)) {
                            j3 = -chat.f28051id;
                        }
                    }
                    long j10 = j3;
                    if (j10 == jArr[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long[] jArr2 = jArr;
                    m60Var.g(tLObject2, z10, new bi.m1(jArr2, j10, g1Var, 12));
                    jArr = jArr2;
                }
                m60Var.f37112t = false;
                m60Var.f37111s = 0;
                m60Var.V(5);
                m60Var.a0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                m60Var.Z();
                return;
            case 2:
                c5.l lVar = (c5.l) obj5;
                LinearLayout linearLayout2 = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                wh0 wh0Var = (wh0) obj;
                int currentItem = lVar.getCurrentItem();
                if (i10 != currentItem) {
                    wh0 wh0Var2 = (wh0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    lVar.x(i10, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = wh0Var.getX() - ((horizontalScrollView.getWidth() - wh0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(er.f34419f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, wh0Var2, wh0Var));
                    duration.start();
                    return;
                }
                return;
            case 3:
                ib0 ib0Var = (ib0) obj3;
                ou ouVar = (ou) obj2;
                z10 z10Var = (z10) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((ib0) obj5).getValue();
                tL_birthday.month = ((ib0) obj4).getValue() + 1;
                if (ib0Var.getValue() != i10) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = ib0Var.getValue();
                }
                ((org.telegram.ui.ActionBar.u2) ouVar.f25806b).f29724y0.run();
                z10Var.a(tL_birthday);
                return;
            case 4:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, (fi.b) obj2);
                String M0 = hd.M0(2131748798, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = hd.M0(2131748799, null);
                alertDialog$Builder.k(hd.M0(2131746024, null), new bg.f0((ar) obj4, (hi.d) obj5, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f9617b, 3));
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj4;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                m60 F = m60.F(((org.telegram.ui.Wallet.x2[]) obj5)[0].f29685c, e6Var2, (ImageView) obj3);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    F.c(2131232355, hd.M0(2131742963, null), new u11(context, i10, wallettransactionArr, 18), false);
                }
                F.c(2131232820, hd.M0(2131742961, null), new a(2, context, e6Var2), false);
                F.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                F.Z();
                return;
        }
    }

    public v9(c5.l lVar, int i7, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, wh0 wh0Var) {
        this.f9618c = lVar;
        this.f9617b = i7;
        this.d = linearLayout;
        this.f9619e = atomicBoolean;
        this.f9620f = horizontalScrollView;
        this.h = wh0Var;
    }

    public v9(hi.d dVar, TL_stars.StarsSubscription starsSubscription, int i7, org.telegram.ui.ActionBar.u2[] u2VarArr, TLObject tLObject, String str) {
        this.f9618c = dVar;
        this.d = starsSubscription;
        this.f9617b = i7;
        this.f9619e = u2VarArr;
        this.f9620f = tLObject;
        this.h = str;
    }

    public v9(ar arVar, Context context, fi.b bVar, hi.d dVar, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i7) {
        this.d = arVar;
        this.f9619e = context;
        this.f9620f = bVar;
        this.f9618c = dVar;
        this.h = getgroupcallstreamrtmpurl;
        this.f9617b = i7;
    }

    public v9(ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3, int i7, ou ouVar, z10 z10Var) {
        this.f9618c = ib0Var;
        this.d = ib0Var2;
        this.f9619e = ib0Var3;
        this.f9617b = i7;
        this.f9620f = ouVar;
        this.h = z10Var;
    }

    public v9(org.telegram.ui.Wallet.x2[] x2VarArr, org.telegram.ui.ActionBar.e6 e6Var, ImageView imageView, TL_wallet.walletTransaction[] wallettransactionArr, Context context, int i7) {
        this.f9618c = x2VarArr;
        this.d = e6Var;
        this.f9619e = imageView;
        this.f9620f = wallettransactionArr;
        this.h = context;
        this.f9617b = i7;
    }
}
