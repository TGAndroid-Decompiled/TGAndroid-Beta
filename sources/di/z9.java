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
import org.telegram.messenger.i10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.x60;
public final class z9 implements View.OnClickListener {
    public final int f10160a = 1;
    public final int f10161b;
    public final Object f10162c;
    public final Object d;
    public final Object f10163e;
    public final Object f10164f;
    public final Object h;

    public z9(int i7, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.i6 i6Var, LinearLayout linearLayout, long[] jArr, ai.d1 d1Var) {
        this.f10161b = i7;
        this.f10162c = w2Var;
        this.d = i6Var;
        this.f10163e = linearLayout;
        this.f10164f = jArr;
        this.h = d1Var;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        int i7 = this.f10160a;
        int i10 = this.f10161b;
        Object obj = this.h;
        Object obj2 = this.f10164f;
        Object obj3 = this.f10163e;
        Object obj4 = this.d;
        Object obj5 = this.f10162c;
        switch (i7) {
            case 0:
                hi.e eVar = (hi.e) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (!eVar.R) {
                    eVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.f28722id;
                    int i11 = this.f10161b;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_changeStarsSubscription, new bg.l0(eVar, w2VarArr, i11, tLObject, str, 2));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                ai.d1 d1Var = (ai.d1) obj;
                e0 g10 = e0.g(i10);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f8687j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f8689l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, i10.i(i10).f());
                x60 x60Var = new x60(w2Var.f30226b, i6Var, linearLayout, false, false, true);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj6 = arrayList.get(i12);
                    i12++;
                    TLObject tLObject2 = (TLObject) obj6;
                    if (tLObject2 instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject2).f28641id;
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (org.telegram.messenger.v3.V(chat)) {
                            j3 = -chat.f28492id;
                        }
                    }
                    long j10 = j3;
                    if (j10 == jArr[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long[] jArr2 = jArr;
                    x60Var.g(tLObject2, z10, new bi.s2(jArr2, j10, d1Var, 12));
                    jArr = jArr2;
                }
                x60Var.f41894t = false;
                x60Var.f41892s = 0;
                x60Var.W(5);
                x60Var.b0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                x60Var.a0();
                return;
            case 2:
                c5.l lVar = (c5.l) obj5;
                LinearLayout linearLayout2 = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                hi0 hi0Var = (hi0) obj;
                int currentItem = lVar.getCurrentItem();
                if (i10 != currentItem) {
                    hi0 hi0Var2 = (hi0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    lVar.x(i10, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = hi0Var.getX() - ((horizontalScrollView.getWidth() - hi0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(kr.f36858f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, hi0Var2, hi0Var));
                    duration.start();
                    return;
                }
                return;
            case 3:
                qb0 qb0Var = (qb0) obj3;
                h6.o oVar = (h6.o) obj2;
                w10 w10Var = (w10) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((qb0) obj5).getValue();
                tL_birthday.month = ((qb0) obj4).getValue() + 1;
                if (qb0Var.getValue() != i10) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = qb0Var.getValue();
                }
                ((org.telegram.ui.ActionBar.w2) oVar.f13936b).f30268y0.run();
                w10Var.a(tL_birthday);
                return;
            case 4:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, (fi.b) obj2);
                String N0 = gd.N0(2131748605, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = gd.N0(2131748606, null);
                alertDialog$Builder.k(gd.N0(2131745828, null), new bg.g0((gr) obj4, (hi.e) obj5, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f10161b, 3));
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj4;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                x60 G = x60.G(((org.telegram.ui.Wallet.f3[]) obj5)[0].f30229c, i6Var2, (ImageView) obj3);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    G.c(2131232359, gd.N0(2131742692, null), new e21(context, i10, wallettransactionArr, 18), false);
                }
                G.c(2131232825, gd.N0(2131742690, null), new a(2, context, i6Var2), false);
                G.b0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                G.a0();
                return;
        }
    }

    public z9(c5.l lVar, int i7, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, hi0 hi0Var) {
        this.f10162c = lVar;
        this.f10161b = i7;
        this.d = linearLayout;
        this.f10163e = atomicBoolean;
        this.f10164f = horizontalScrollView;
        this.h = hi0Var;
    }

    public z9(hi.e eVar, TL_stars.StarsSubscription starsSubscription, int i7, org.telegram.ui.ActionBar.w2[] w2VarArr, TLObject tLObject, String str) {
        this.f10162c = eVar;
        this.d = starsSubscription;
        this.f10161b = i7;
        this.f10163e = w2VarArr;
        this.f10164f = tLObject;
        this.h = str;
    }

    public z9(gr grVar, Context context, fi.b bVar, hi.e eVar, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i7) {
        this.d = grVar;
        this.f10163e = context;
        this.f10164f = bVar;
        this.f10162c = eVar;
        this.h = getgroupcallstreamrtmpurl;
        this.f10161b = i7;
    }

    public z9(qb0 qb0Var, qb0 qb0Var2, qb0 qb0Var3, int i7, h6.o oVar, w10 w10Var) {
        this.f10162c = qb0Var;
        this.d = qb0Var2;
        this.f10163e = qb0Var3;
        this.f10161b = i7;
        this.f10164f = oVar;
        this.h = w10Var;
    }

    public z9(org.telegram.ui.Wallet.f3[] f3VarArr, org.telegram.ui.ActionBar.i6 i6Var, ImageView imageView, TL_wallet.walletTransaction[] wallettransactionArr, Context context, int i7) {
        this.f10162c = f3VarArr;
        this.d = i6Var;
        this.f10163e = imageView;
        this.f10164f = wallettransactionArr;
        this.h = context;
        this.f10161b = i7;
    }
}
