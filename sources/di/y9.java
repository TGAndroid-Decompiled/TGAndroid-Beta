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
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.y60;
public final class y9 implements View.OnClickListener {
    public final int f10090a = 1;
    public final int f10091b;
    public final Object f10092c;
    public final Object d;
    public final Object f10093e;
    public final Object f10094f;
    public final Object h;

    public y9(int i7, org.telegram.ui.ActionBar.x2 x2Var, org.telegram.ui.ActionBar.i6 i6Var, LinearLayout linearLayout, long[] jArr, ai.g1 g1Var) {
        this.f10091b = i7;
        this.f10092c = x2Var;
        this.d = i6Var;
        this.f10093e = linearLayout;
        this.f10094f = jArr;
        this.h = g1Var;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        int i7 = this.f10090a;
        int i10 = this.f10091b;
        Object obj = this.h;
        Object obj2 = this.f10094f;
        Object obj3 = this.f10093e;
        Object obj4 = this.d;
        Object obj5 = this.f10092c;
        switch (i7) {
            case 0:
                hi.d dVar = (hi.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.f28635id;
                    int i11 = this.f10091b;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_changeStarsSubscription, new bg.l0(dVar, x2VarArr, i11, tLObject, str, 2));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                ai.g1 g1Var = (ai.g1) obj;
                e0 g10 = e0.g(i10);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f8692j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f8694l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, j10.i(i10).f());
                y60 y60Var = new y60(x2Var.f30192b, i6Var, linearLayout, false, false, true);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj6 = arrayList.get(i12);
                    i12++;
                    TLObject tLObject2 = (TLObject) obj6;
                    if (tLObject2 instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject2).f28554id;
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (org.telegram.messenger.v3.V(chat)) {
                            j3 = -chat.f28405id;
                        }
                    }
                    long j10 = j3;
                    if (j10 == jArr[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long[] jArr2 = jArr;
                    y60Var.g(tLObject2, z10, new bi.m2(jArr2, j10, g1Var, 12));
                    jArr = jArr2;
                }
                y60Var.f42377t = false;
                y60Var.f42375s = 0;
                y60Var.W(5);
                y60Var.b0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                y60Var.a0();
                return;
            case 2:
                c5.l lVar = (c5.l) obj5;
                LinearLayout linearLayout2 = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                fi0 fi0Var = (fi0) obj;
                int currentItem = lVar.getCurrentItem();
                if (i10 != currentItem) {
                    fi0 fi0Var2 = (fi0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    lVar.x(i10, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = fi0Var.getX() - ((horizontalScrollView.getWidth() - fi0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(lr.f37208f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, fi0Var2, fi0Var));
                    duration.start();
                    return;
                }
                return;
            case 3:
                sb0 sb0Var = (sb0) obj3;
                hi.w4 w4Var = (hi.w4) obj2;
                x10 x10Var = (x10) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((sb0) obj5).getValue();
                tL_birthday.month = ((sb0) obj4).getValue() + 1;
                if (sb0Var.getValue() != i10) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = sb0Var.getValue();
                }
                ((org.telegram.ui.ActionBar.x2) w4Var.f15645b).f30234y0.run();
                x10Var.a(tL_birthday);
                return;
            case 4:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, (fi.b) obj2);
                String M0 = gd.M0(2131748606, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.S = M0;
                u1Var.U = gd.M0(2131748607, null);
                alertDialog$Builder.k(gd.M0(2131745829, null), new bg.g0((hr) obj4, (hi.d) obj5, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f10091b, 3));
                alertDialog$Builder.h(gd.M0(2131752578, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj4;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                y60 G = y60.G(((org.telegram.ui.Wallet.e3[]) obj5)[0].f30195c, i6Var2, (ImageView) obj3);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    G.c(2131232356, gd.M0(2131742705, null), new h01(context, i10, wallettransactionArr, 19), false);
                }
                G.c(2131232822, gd.M0(2131742703, null), new a(2, context, i6Var2), false);
                G.b0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                G.a0();
                return;
        }
    }

    public y9(c5.l lVar, int i7, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, fi0 fi0Var) {
        this.f10092c = lVar;
        this.f10091b = i7;
        this.d = linearLayout;
        this.f10093e = atomicBoolean;
        this.f10094f = horizontalScrollView;
        this.h = fi0Var;
    }

    public y9(hi.d dVar, TL_stars.StarsSubscription starsSubscription, int i7, org.telegram.ui.ActionBar.x2[] x2VarArr, TLObject tLObject, String str) {
        this.f10092c = dVar;
        this.d = starsSubscription;
        this.f10091b = i7;
        this.f10093e = x2VarArr;
        this.f10094f = tLObject;
        this.h = str;
    }

    public y9(hr hrVar, Context context, fi.b bVar, hi.d dVar, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i7) {
        this.d = hrVar;
        this.f10093e = context;
        this.f10094f = bVar;
        this.f10092c = dVar;
        this.h = getgroupcallstreamrtmpurl;
        this.f10091b = i7;
    }

    public y9(sb0 sb0Var, sb0 sb0Var2, sb0 sb0Var3, int i7, hi.w4 w4Var, x10 x10Var) {
        this.f10092c = sb0Var;
        this.d = sb0Var2;
        this.f10093e = sb0Var3;
        this.f10091b = i7;
        this.f10094f = w4Var;
        this.h = x10Var;
    }

    public y9(org.telegram.ui.Wallet.e3[] e3VarArr, org.telegram.ui.ActionBar.i6 i6Var, ImageView imageView, TL_wallet.walletTransaction[] wallettransactionArr, Context context, int i7) {
        this.f10092c = e3VarArr;
        this.d = i6Var;
        this.f10093e = imageView;
        this.f10094f = wallettransactionArr;
        this.h = context;
        this.f10091b = i7;
    }
}
