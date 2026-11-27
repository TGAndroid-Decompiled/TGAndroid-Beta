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
public final class be implements View.OnClickListener {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public be(int i, nx0 nx0Var, vnb vnbVar, LinearLayout linearLayout, long[] jArr, l77 l77Var) {
        this.a = (byte) 1;
        this.b = i;
        this.c = nx0Var;
        this.d = vnbVar;
        this.e = linearLayout;
        this.f = jArr;
        this.h = l77Var;
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
                hq7 hq7Var = (hq7) obj3;
                z8d z8dVar = (z8d) obj2;
                pcc pccVar = (pcc) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((hq7) obj5).getValue();
                tL_birthday.month = ((hq7) obj4).getValue() + 1;
                if (hq7Var.getValue() != i) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = hq7Var.getValue();
                }
                ((nx0) z8dVar.b).y0.run();
                pccVar.a(tL_birthday);
                return;
            case 1:
                nx0 nx0Var = (nx0) obj5;
                vnb vnbVar = (vnb) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                l77 l77Var = (l77) obj;
                kt0 g = kt0.g(i);
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
                arrayList.add(0, yac.h(i).f());
                fu5 fu5Var = new fu5(nx0Var.b, vnbVar, linearLayout, false, false, true);
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
                        if (xc2.V(chat)) {
                            j = -chat.id;
                        }
                    }
                    long j2 = j;
                    if (j2 == jArr[0]) {
                        z = true;
                    } else {
                        z = false;
                    }
                    fu5Var.f(tLObject, z, new ue2(jArr, j2, l77Var, (byte) 13));
                }
                fu5Var.t = false;
                fu5Var.s = (short) 0;
                fu5Var.W(5);
                fu5Var.b0(hl.L(24.0f), 0.0f);
                fu5Var.a0();
                return;
            case 2:
                fic ficVar = (fic) obj5;
                LinearLayout linearLayout2 = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                q39 q39Var = (q39) obj;
                int currentItem = ficVar.getCurrentItem();
                if (i != currentItem) {
                    q39 q39Var2 = (q39) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    ficVar.x(i, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x = q39Var.getX() - ((horizontalScrollView.getWidth() - q39Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(k43.f);
                    duration.addUpdateListener(new l1(horizontalScrollView, scrollX, x, q39Var2, q39Var));
                    duration.start();
                    return;
                }
                return;
            case 3:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (x53) obj3, (Context) obj4);
                String M0 = ob6.M0(2131748552, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131748553, null);
                alertDialog$Builder.j(ob6.M0(2131745751, null), new an((y13) obj5, (c51) obj2, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.b, (byte) 3));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                return;
            case 4:
                c51 c51Var = (c51) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                nx0[] nx0VarArr = (nx0[]) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str = (String) obj;
                if (!c51Var.R) {
                    c51Var.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.id;
                    int i3 = this.b;
                    ConnectionsManager.getInstance(i3).sendRequest(tL_changeStarsSubscription, new eu0(c51Var, nx0VarArr, i3, tLObject2, str));
                    return;
                }
                return;
            default:
                vnb vnbVar2 = (vnb) obj4;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                fu5 G = fu5.G(((jl7[]) obj5)[0].c, vnbVar2, (ImageView) obj3);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    G.b(2131232359, ob6.M0(2131742594, null), new mpc(context, i, wallettransactionArr, (byte) 1), false);
                }
                G.b(2131232844, ob6.M0(2131742592, null), new he0(context, vnbVar2, (byte) 2), false);
                G.b0(0.0f, -hl.L(48.0f));
                G.a0();
                return;
        }
    }

    public be(c51 c51Var, TL_stars.StarsSubscription starsSubscription, int i, nx0[] nx0VarArr, TLObject tLObject, String str) {
        this.a = (byte) 4;
        this.c = c51Var;
        this.d = starsSubscription;
        this.b = i;
        this.e = nx0VarArr;
        this.f = tLObject;
        this.h = str;
    }

    public be(hq7 hq7Var, hq7 hq7Var2, hq7 hq7Var3, int i, z8d z8dVar, pcc pccVar) {
        this.a = (byte) 0;
        this.c = hq7Var;
        this.d = hq7Var2;
        this.e = hq7Var3;
        this.b = i;
        this.f = z8dVar;
        this.h = pccVar;
    }

    public be(fic ficVar, int i, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, q39 q39Var) {
        this.a = (byte) 2;
        this.c = ficVar;
        this.b = i;
        this.d = linearLayout;
        this.e = atomicBoolean;
        this.f = horizontalScrollView;
        this.h = q39Var;
    }

    public be(Object obj, Object obj2, Object obj3, int i, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.b = i;
    }
}
