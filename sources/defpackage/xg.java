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
public final class xg implements View.OnClickListener {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public xg(int i, fx0 fx0Var, wjb wjbVar, LinearLayout linearLayout, long[] jArr, i57 i57Var) {
        this.a = (byte) 1;
        this.b = i;
        this.c = fx0Var;
        this.d = wjbVar;
        this.e = linearLayout;
        this.f = jArr;
        this.h = i57Var;
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
                hn7 hn7Var = (hn7) obj3;
                i4d i4dVar = (i4d) obj2;
                p8c p8cVar = (p8c) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((hn7) obj5).getValue();
                tL_birthday.month = ((hn7) obj4).getValue() + 1;
                if (hn7Var.getValue() != i) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = hn7Var.getValue();
                }
                ((fx0) i4dVar.a).y0.run();
                p8cVar.a(tL_birthday);
                return;
            case 1:
                fx0 fx0Var = (fx0) obj5;
                wjb wjbVar = (wjb) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                i57 i57Var = (i57) obj;
                ct0 g = ct0.g(i);
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
                arrayList.add(0, y6c.h(i).f());
                cs5 cs5Var = new cs5(fx0Var.b, wjbVar, linearLayout, false, false, true);
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
                        if (hc2.V(chat)) {
                            j = -chat.id;
                        }
                    }
                    long j2 = j;
                    if (j2 == jArr[0]) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cs5Var.f(tLObject, z, new de2(jArr, j2, i57Var, (byte) 13));
                }
                cs5Var.t = false;
                cs5Var.s = (short) 0;
                cs5Var.W(5);
                cs5Var.b0(gl.L(24.0f), 0.0f);
                cs5Var.a0();
                return;
            case 2:
                gec gecVar = (gec) obj5;
                LinearLayout linearLayout2 = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                c09 c09Var = (c09) obj;
                int currentItem = gecVar.getCurrentItem();
                if (i != currentItem) {
                    c09 c09Var2 = (c09) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    gecVar.x(i, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x = c09Var.getX() - ((horizontalScrollView.getWidth() - c09Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(s33.f);
                    duration.addUpdateListener(new k1(horizontalScrollView, scrollX, x, c09Var2, c09Var));
                    duration.start();
                    return;
                }
                return;
            case 3:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (f53) obj3, (Context) obj4);
                String M0 = k96.M0(2131748606, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131748607, null);
                alertDialog$Builder.j(k96.M0(2131745831, null), new zm((f13) obj5, (u41) obj2, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.b, (byte) 3));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                return;
            case 4:
                u41 u41Var = (u41) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                fx0[] fx0VarArr = (fx0[]) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str = (String) obj;
                if (!u41Var.R) {
                    u41Var.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.id;
                    int i3 = this.b;
                    ConnectionsManager.getInstance(i3).sendRequest(tL_changeStarsSubscription, new vt0(u41Var, fx0VarArr, i3, tLObject2, str));
                    return;
                }
                return;
            default:
                wjb wjbVar2 = (wjb) obj4;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                cs5 G = cs5.G(((cj7[]) obj5)[0].c, wjbVar2, (ImageView) obj3);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    G.b(2131232359, k96.M0(2131742700, null), new clc(context, i, wallettransactionArr, (byte) 0), false);
                }
                G.b(2131232825, k96.M0(2131742698, null), new fe0(context, wjbVar2, (byte) 2), false);
                G.b0(0.0f, -gl.L(48.0f));
                G.a0();
                return;
        }
    }

    public xg(u41 u41Var, TL_stars.StarsSubscription starsSubscription, int i, fx0[] fx0VarArr, TLObject tLObject, String str) {
        this.a = (byte) 4;
        this.c = u41Var;
        this.d = starsSubscription;
        this.b = i;
        this.e = fx0VarArr;
        this.f = tLObject;
        this.h = str;
    }

    public xg(hn7 hn7Var, hn7 hn7Var2, hn7 hn7Var3, int i, i4d i4dVar, p8c p8cVar) {
        this.a = (byte) 0;
        this.c = hn7Var;
        this.d = hn7Var2;
        this.e = hn7Var3;
        this.b = i;
        this.f = i4dVar;
        this.h = p8cVar;
    }

    public xg(gec gecVar, int i, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, c09 c09Var) {
        this.a = (byte) 2;
        this.c = gecVar;
        this.b = i;
        this.d = linearLayout;
        this.e = atomicBoolean;
        this.f = horizontalScrollView;
        this.h = c09Var;
    }

    public xg(Object obj, Object obj2, Object obj3, int i, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.b = i;
    }
}
