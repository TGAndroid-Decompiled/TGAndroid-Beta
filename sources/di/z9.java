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
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.tb0;
public final class z9 implements View.OnClickListener {
    public final int f10196a = 1;
    public final int f10197b;
    public final Object f10198c;
    public final Object d;
    public final Object f10199e;
    public final Object f10200f;
    public final Object h;

    public z9(int i7, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var, LinearLayout linearLayout, long[] jArr, ai.i1 i1Var) {
        this.f10197b = i7;
        this.f10198c = w2Var;
        this.d = h6Var;
        this.f10199e = linearLayout;
        this.f10200f = jArr;
        this.h = i1Var;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        int i7 = this.f10196a;
        int i10 = this.f10197b;
        Object obj = this.h;
        Object obj2 = this.f10200f;
        Object obj3 = this.f10199e;
        Object obj4 = this.d;
        Object obj5 = this.f10198c;
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
                    tL_changeStarsSubscription.subscription_id = starsSubscription.f28661id;
                    int i11 = this.f10197b;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_changeStarsSubscription, new bg.l0(eVar, w2VarArr, i11, tLObject, str, 2));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj5;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                ai.i1 i1Var = (ai.i1) obj;
                e0 g10 = e0.g(i10);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f8723j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f8725l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, j10.i(i10).f());
                a70 a70Var = new a70(w2Var.f30173b, h6Var, linearLayout, false, false, true);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj6 = arrayList.get(i12);
                    i12++;
                    TLObject tLObject2 = (TLObject) obj6;
                    if (tLObject2 instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject2).f28580id;
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (org.telegram.messenger.v3.V(chat)) {
                            j3 = -chat.f28431id;
                        }
                    }
                    long j10 = j3;
                    if (j10 == jArr[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    long[] jArr2 = jArr;
                    a70Var.g(tLObject2, z10, new bi.q2(jArr2, j10, i1Var, 12));
                    jArr = jArr2;
                }
                a70Var.f33386t = false;
                a70Var.f33384s = 0;
                a70Var.W(5);
                a70Var.b0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                a70Var.a0();
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
                    duration.setInterpolator(nr.f37956f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, hi0Var2, hi0Var));
                    duration.start();
                    return;
                }
                return;
            case 3:
                tb0 tb0Var = (tb0) obj3;
                hi.w4 w4Var = (hi.w4) obj2;
                x10 x10Var = (x10) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((tb0) obj5).getValue();
                tL_birthday.month = ((tb0) obj4).getValue() + 1;
                if (tb0Var.getValue() != i10) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = tb0Var.getValue();
                }
                ((org.telegram.ui.ActionBar.w2) w4Var.f15705b).f30215y0.run();
                x10Var.a(tL_birthday);
                return;
            case 4:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, (fi.b) obj2);
                String N0 = gd.N0(2131748605, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                t1Var.S = N0;
                t1Var.U = gd.N0(2131748606, null);
                alertDialog$Builder.k(gd.N0(2131745828, null), new bg.g0((jr) obj4, (hi.e) obj5, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f10197b, 3));
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj4;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                a70 G = a70.G(((org.telegram.ui.Wallet.e3[]) obj5)[0].f30176c, h6Var2, (ImageView) obj3);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    G.c(2131232356, gd.N0(2131742699, null), new j01(context, i10, wallettransactionArr, 19), false);
                }
                G.c(2131232822, gd.N0(2131742697, null), new a(2, context, h6Var2), false);
                G.b0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                G.a0();
                return;
        }
    }

    public z9(c5.l lVar, int i7, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, hi0 hi0Var) {
        this.f10198c = lVar;
        this.f10197b = i7;
        this.d = linearLayout;
        this.f10199e = atomicBoolean;
        this.f10200f = horizontalScrollView;
        this.h = hi0Var;
    }

    public z9(hi.e eVar, TL_stars.StarsSubscription starsSubscription, int i7, org.telegram.ui.ActionBar.w2[] w2VarArr, TLObject tLObject, String str) {
        this.f10198c = eVar;
        this.d = starsSubscription;
        this.f10197b = i7;
        this.f10199e = w2VarArr;
        this.f10200f = tLObject;
        this.h = str;
    }

    public z9(jr jrVar, Context context, fi.b bVar, hi.e eVar, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i7) {
        this.d = jrVar;
        this.f10199e = context;
        this.f10200f = bVar;
        this.f10198c = eVar;
        this.h = getgroupcallstreamrtmpurl;
        this.f10197b = i7;
    }

    public z9(tb0 tb0Var, tb0 tb0Var2, tb0 tb0Var3, int i7, hi.w4 w4Var, x10 x10Var) {
        this.f10198c = tb0Var;
        this.d = tb0Var2;
        this.f10199e = tb0Var3;
        this.f10197b = i7;
        this.f10200f = w4Var;
        this.h = x10Var;
    }

    public z9(org.telegram.ui.Wallet.e3[] e3VarArr, org.telegram.ui.ActionBar.h6 h6Var, ImageView imageView, TL_wallet.walletTransaction[] wallettransactionArr, Context context, int i7) {
        this.f10198c = e3VarArr;
        this.d = h6Var;
        this.f10199e = imageView;
        this.f10200f = wallettransactionArr;
        this.h = context;
        this.f10197b = i7;
    }
}
