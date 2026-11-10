package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.wq;
import org.telegram.ui.h10;
public final class jb implements View.OnClickListener {
    public final int f4110a = 1;
    public final int f4111b;
    public final Object f4112c;
    public final Object d;
    public final Object f4113e;
    public final Object f4114f;
    public final Object h;

    public jb(int i7, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var, LinearLayout linearLayout, long[] jArr, ub ubVar) {
        this.f4111b = i7;
        this.f4112c = w2Var;
        this.d = h6Var;
        this.f4113e = linearLayout;
        this.f4114f = jArr;
        this.h = ubVar;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z9;
        int i7 = this.f4110a;
        int i10 = this.f4111b;
        Object obj = this.h;
        Object obj2 = this.f4114f;
        Object obj3 = this.f4113e;
        Object obj4 = this.d;
        Object obj5 = this.f4112c;
        switch (i7) {
            case 0:
                fi.d dVar = (fi.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.f27190id;
                    int i11 = this.f4111b;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_changeStarsSubscription, new bg.k0(dVar, w2VarArr, i11, tLObject, str, 2));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj5;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                ub ubVar = (ub) obj;
                n0 g10 = n0.g(i10);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f4391j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f4393l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, p10.i(i10).f());
                k60 k60Var = new k60(w2Var.f28672b, h6Var, linearLayout, false, false, true);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj6 = arrayList.get(i12);
                    i12++;
                    TLObject tLObject2 = (TLObject) obj6;
                    if (tLObject2 instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject2).f27109id;
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (org.telegram.messenger.t3.V(chat)) {
                            j3 = -chat.f26960id;
                        }
                    }
                    long j10 = j3;
                    if (j10 == jArr[0]) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    long[] jArr2 = jArr;
                    k60Var.g(tLObject2, z9, new d3(jArr2, j10, ubVar, 11));
                    jArr = jArr2;
                }
                k60Var.f35220t = false;
                k60Var.f35219s = 0;
                k60Var.V(5);
                k60Var.a0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                k60Var.Z();
                return;
            case 2:
                c5.k kVar = (c5.k) obj5;
                LinearLayout linearLayout2 = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                sh0 sh0Var = (sh0) obj;
                int currentItem = kVar.getCurrentItem();
                if (i10 != currentItem) {
                    sh0 sh0Var2 = (sh0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    kVar.x(i10, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = sh0Var.getX() - ((horizontalScrollView.getWidth() - sh0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(wq.f40046f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, sh0Var2, sh0Var));
                    duration.start();
                    return;
                }
                return;
            case 3:
                hb0 hb0Var = (hb0) obj3;
                h9.f1 f1Var = (h9.f1) obj2;
                c20 c20Var = (c20) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((hb0) obj5).getValue();
                tL_birthday.month = ((hb0) obj4).getValue() + 1;
                if (hb0Var.getValue() != i10) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = hb0Var.getValue();
                }
                ((org.telegram.ui.ActionBar.w2) f1Var.f14325b).f28711x0.run();
                c20Var.a(tL_birthday);
                return;
            case 4:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, (di.b) obj2);
                String M0 = org.telegram.messenger.id.M0(2131748798, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131748799, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746024, null), new bg.f0((sq) obj4, (fi.d) obj5, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f4111b, 3));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj4;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                k60 F = k60.F(((org.telegram.ui.Wallet.y2[]) obj5)[0].f28675c, h6Var2, (ImageView) obj3);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    F.c(2131232354, org.telegram.messenger.id.M0(2131742963, null), new h10(context, i10, wallettransactionArr, 15), false);
                }
                F.c(2131232819, org.telegram.messenger.id.M0(2131742961, null), new b(2, context, h6Var2), false);
                F.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                F.Z();
                return;
        }
    }

    public jb(c5.k kVar, int i7, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, sh0 sh0Var) {
        this.f4112c = kVar;
        this.f4111b = i7;
        this.d = linearLayout;
        this.f4113e = atomicBoolean;
        this.f4114f = horizontalScrollView;
        this.h = sh0Var;
    }

    public jb(fi.d dVar, TL_stars.StarsSubscription starsSubscription, int i7, org.telegram.ui.ActionBar.w2[] w2VarArr, TLObject tLObject, String str) {
        this.f4112c = dVar;
        this.d = starsSubscription;
        this.f4111b = i7;
        this.f4113e = w2VarArr;
        this.f4114f = tLObject;
        this.h = str;
    }

    public jb(sq sqVar, Context context, di.b bVar, fi.d dVar, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i7) {
        this.d = sqVar;
        this.f4113e = context;
        this.f4114f = bVar;
        this.f4112c = dVar;
        this.h = getgroupcallstreamrtmpurl;
        this.f4111b = i7;
    }

    public jb(hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3, int i7, h9.f1 f1Var, c20 c20Var) {
        this.f4112c = hb0Var;
        this.d = hb0Var2;
        this.f4113e = hb0Var3;
        this.f4111b = i7;
        this.f4114f = f1Var;
        this.h = c20Var;
    }

    public jb(org.telegram.ui.Wallet.y2[] y2VarArr, org.telegram.ui.ActionBar.h6 h6Var, ImageView imageView, TL_wallet.walletTransaction[] wallettransactionArr, Context context, int i7) {
        this.f4112c = y2VarArr;
        this.d = h6Var;
        this.f4113e = imageView;
        this.f4114f = wallettransactionArr;
        this.h = context;
        this.f4111b = i7;
    }
}
