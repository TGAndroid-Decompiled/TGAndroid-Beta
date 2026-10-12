package fi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.c90;
import org.telegram.ui.ia;
public final class m3 implements View.OnClickListener {
    public final int f9413a;
    public final int f9414b;
    public final Object f9415c;
    public final Object d;
    public final Object e;
    public final Object f9416f;
    public final Object h;

    public m3(int i10, org.telegram.ui.ActionBar.e3 e3Var, c6 c6Var, LinearLayout linearLayout, long[] jArr, l3 l3Var) {
        this.f9413a = 0;
        this.f9414b = i10;
        this.d = e3Var;
        this.e = c6Var;
        this.f9415c = linearLayout;
        this.f9416f = jArr;
        this.h = l3Var;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        boolean z10;
        Runnable runnable;
        int i10 = this.f9413a;
        int i11 = this.f9414b;
        Object obj = this.h;
        Object obj2 = this.f9416f;
        Object obj3 = this.f9415c;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj5;
                c6 c6Var = (c6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                l3 l3Var = (l3) obj;
                zh.p g10 = zh.p.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f50964j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f50966l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                m80 F = m80.F(e3Var.getContainerView(), c6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj6 = arrayList.get(i12);
                    i12++;
                    TLObject tLObject = (TLObject) obj6;
                    if (tLObject instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject).f19363id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            j10 = -chat.f19216id;
                        }
                    }
                    long j11 = j10;
                    if (j11 == jArr[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new a3.i0(jArr, j11, l3Var, 8));
                }
                F.f27299t = false;
                F.f27298s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
            case 1:
                z4.g gVar = (z4.g) obj5;
                LinearLayout linearLayout2 = (LinearLayout) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj4;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                rk0 rk0Var = (rk0) obj;
                int currentItem = gVar.getCurrentItem();
                if (i11 != currentItem) {
                    rk0 rk0Var2 = (rk0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    gVar.x(i11, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = rk0Var.getX() - ((horizontalScrollView.getWidth() - rk0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(es.f24771f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, rk0Var2, rk0Var));
                    duration.start();
                    return;
                }
                return;
            case 2:
                ud0 ud0Var = (ud0) obj3;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((ud0) obj5).getValue();
                tL_birthday.month = ((ud0) obj4).getValue() + 1;
                if (ud0Var.getValue() != i11) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = ud0Var.getValue();
                }
                runnable = z2Var.f20838a.dismissRunnable;
                runnable.run();
                callback.run(tL_birthday);
                return;
            case 3:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj4, 0, (bi.b) obj3);
                String string = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ia((as) obj5, (di.d) obj2, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f9414b, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 4:
                c6 c6Var2 = (c6) obj4;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                m80 F2 = m80.F(((org.telegram.ui.Wallet.i2[]) obj5)[0].getContainer(), c6Var2, (ImageView) obj3);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    F2.c(R.drawable.msg_search, LocaleController.getString(R.string.WalletViewInExplorer), new c90(context, i11, wallettransactionArr, 14), false);
                }
                F2.c(R.drawable.wallet_help, LocaleController.getString(R.string.WalletWhatIsGram), new at(context, 1, c6Var2), false);
                F2.a0(0.0f, -AndroidUtilities.dp(48.0f));
                F2.Z();
                return;
            default:
                di.d dVar = (di.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.f19442id;
                    int i13 = this.f9414b;
                    ConnectionsManager.getInstance(i13).sendRequest(tL_changeStarsSubscription, new bi.ia(dVar, e3VarArr, i13, tLObject2, str, 13));
                    return;
                }
                return;
        }
    }

    public m3(di.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.e3[] e3VarArr, TLObject tLObject, String str) {
        this.f9413a = 5;
        this.d = dVar;
        this.e = starsSubscription;
        this.f9414b = i10;
        this.f9415c = e3VarArr;
        this.f9416f = tLObject;
        this.h = str;
    }

    public m3(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f9413a = i11;
        this.d = obj;
        this.e = obj2;
        this.f9415c = obj3;
        this.f9416f = obj4;
        this.h = obj5;
        this.f9414b = i10;
    }

    public m3(ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3, int i10, org.telegram.ui.ActionBar.z2 z2Var, Utilities.Callback callback) {
        this.f9413a = 2;
        this.d = ud0Var;
        this.e = ud0Var2;
        this.f9415c = ud0Var3;
        this.f9414b = i10;
        this.f9416f = z2Var;
        this.h = callback;
    }

    public m3(z4.g gVar, int i10, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, rk0 rk0Var) {
        this.f9413a = 1;
        this.d = gVar;
        this.f9414b = i10;
        this.f9415c = linearLayout;
        this.e = atomicBoolean;
        this.f9416f = horizontalScrollView;
        this.h = rk0Var;
    }
}
