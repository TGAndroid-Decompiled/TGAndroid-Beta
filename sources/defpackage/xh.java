package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xh implements View.OnClickListener {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public xh(int i, my0 my0Var, ylb ylbVar, LinearLayout linearLayout, long[] jArr, i77 i77Var) {
        this.a = (byte) 1;
        this.b = i;
        this.c = my0Var;
        this.d = ylbVar;
        this.e = linearLayout;
        this.f = jArr;
        this.h = i77Var;
    }

    @Override
    public final void onClick(View view) {
        long j;
        boolean z;
        byte b = this.a;
        int i = this.b;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                lp7 lp7Var = (lp7) obj3;
                k6d k6dVar = (k6d) obj2;
                qac qacVar = (qac) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((lp7) obj5).getValue();
                tL_birthday.month = ((lp7) obj4).getValue() + 1;
                if (lp7Var.getValue() != i) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = lp7Var.getValue();
                }
                ((my0) k6dVar.b).y0.run();
                qacVar.a(tL_birthday);
                return;
            case 1:
                my0 my0Var = (my0) obj5;
                ylb ylbVar = (ylb) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                i77 i77Var = (i77) obj;
                ku0 g = ku0.g(i);
                g.n();
                g.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g.j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g.l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, z8c.h(i).f());
                bu5 bu5Var = new bu5(my0Var.b, ylbVar, linearLayout, false, false, true);
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj6 = arrayList.get(i2);
                    i2++;
                    TLObject tLObject = (TLObject) obj6;
                    if (tLObject instanceof TLRPC.User) {
                        j = ((TLRPC.User) tLObject).id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (sd2.V(chat)) {
                            j = -chat.id;
                        }
                    }
                    long j2 = j;
                    if (j2 == jArr[0]) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bu5Var.f(tLObject, z, new of2(jArr, j2, i77Var, (byte) 13));
                }
                bu5Var.t = false;
                bu5Var.s = (short) 0;
                bu5Var.W(5);
                bu5Var.b0(gm.L(24.0f), 0.0f);
                bu5Var.a0();
                return;
            case 2:
                ggc ggcVar = (ggc) obj5;
                LinearLayout linearLayout2 = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                e29 e29Var = (e29) obj;
                int currentItem = ggcVar.getCurrentItem();
                if (i != currentItem) {
                    e29 e29Var2 = (e29) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    ggcVar.x(i, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x = e29Var.getX() - ((horizontalScrollView.getWidth() - e29Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(d53.f);
                    duration.addUpdateListener(new k1(horizontalScrollView, scrollX, x, e29Var2, e29Var));
                    duration.start();
                    return;
                }
                return;
            case 3:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (r63) obj3, (Context) obj4);
                String M0 = jb6.M0(2131748555, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131748556, null);
                alertDialog$Builder.j(jb6.M0(2131745757, null), new zn((r23) obj5, (b61) obj2, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.b, (byte) 3));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                return;
            case 4:
                b61 b61Var = (b61) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                my0[] my0VarArr = (my0[]) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str = (String) obj;
                if (!b61Var.R) {
                    b61Var.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.id;
                    int i3 = this.b;
                    ConnectionsManager.getInstance(i3).sendRequest(tL_changeStarsSubscription, new ev0(b61Var, my0VarArr, i3, tLObject2, str));
                    return;
                }
                return;
            default:
                ylb ylbVar2 = (ylb) obj4;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                bu5 G = bu5.G(((el7[]) obj5)[0].c, ylbVar2, (ImageView) obj3);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    G.b(2131232360, jb6.M0(2131742626, null), new bnc(context, i, wallettransactionArr, (byte) 0), false);
                }
                G.b(2131232838, jb6.M0(2131742624, null), new ff0(context, ylbVar2, (byte) 2), false);
                G.b0(0.0f, -gm.L(48.0f));
                G.a0();
                return;
        }
    }

    public xh(b61 b61Var, TL_stars.StarsSubscription starsSubscription, int i, my0[] my0VarArr, TLObject tLObject, String str) {
        this.a = (byte) 4;
        this.c = b61Var;
        this.d = starsSubscription;
        this.b = i;
        this.e = my0VarArr;
        this.f = tLObject;
        this.h = str;
    }

    public xh(lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3, int i, k6d k6dVar, qac qacVar) {
        this.a = (byte) 0;
        this.c = lp7Var;
        this.d = lp7Var2;
        this.e = lp7Var3;
        this.b = i;
        this.f = k6dVar;
        this.h = qacVar;
    }

    public xh(ggc ggcVar, int i, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, e29 e29Var) {
        this.a = (byte) 2;
        this.c = ggcVar;
        this.b = i;
        this.d = linearLayout;
        this.e = atomicBoolean;
        this.f = horizontalScrollView;
        this.h = e29Var;
    }

    public xh(Object obj, Object obj2, Object obj3, int i, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.b = i;
    }
}
