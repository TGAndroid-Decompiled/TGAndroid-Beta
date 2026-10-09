package ei;

import ai.za;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.bi0;
import org.telegram.ui.ea;
public final class m3 implements View.OnClickListener {
    public final int f9218a;
    public final int f9219b;
    public final Object f9220c;
    public final Object d;
    public final Object f9221e;
    public final Object f9222f;
    public final Object h;

    public m3(int i10, org.telegram.ui.ActionBar.f3 f3Var, e6 e6Var, LinearLayout linearLayout, long[] jArr, l3 l3Var) {
        this.f9218a = 0;
        this.f9219b = i10;
        this.d = f3Var;
        this.f9221e = e6Var;
        this.f9220c = linearLayout;
        this.f9222f = jArr;
        this.h = l3Var;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        Runnable runnable;
        int i10 = this.f9218a;
        int i11 = this.f9219b;
        Object obj = this.h;
        Object obj2 = this.f9222f;
        Object obj3 = this.f9220c;
        Object obj4 = this.f9221e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj5;
                e6 e6Var = (e6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                l3 l3Var = (l3) obj;
                yh.o g10 = yh.o.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f52950j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f52952l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                p80 F = p80.F(f3Var.getContainerView(), e6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj6 = arrayList.get(i12);
                    i12++;
                    TLObject tLObject = (TLObject) obj6;
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f20185id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            j3 = -chat.f20038id;
                        }
                    }
                    long j10 = j3;
                    if (j10 == jArr[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new a3.h0(jArr, j10, l3Var, 8));
                }
                F.f29790t = false;
                F.f29789s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
            case 1:
                z4.g gVar = (z4.g) obj5;
                LinearLayout linearLayout2 = (LinearLayout) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj4;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                vk0 vk0Var = (vk0) obj;
                int currentItem = gVar.getCurrentItem();
                if (i11 != currentItem) {
                    vk0 vk0Var2 = (vk0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    gVar.x(i11, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = vk0Var.getX() - ((horizontalScrollView.getWidth() - vk0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(hs.f27118f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, vk0Var2, vk0Var));
                    duration.start();
                    return;
                }
                return;
            case 2:
                ud0 ud0Var = (ud0) obj3;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((ud0) obj5).getValue();
                tL_birthday.month = ((ud0) obj4).getValue() + 1;
                if (ud0Var.getValue() != i11) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = ud0Var.getValue();
                }
                runnable = a3Var.f20380a.dismissRunnable;
                runnable.run();
                callback.run(tL_birthday);
                return;
            case 3:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj4, 0, (ai.d) obj3);
                String string = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20374a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ea((ds) obj5, (ci.d) obj2, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f9219b, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            case 4:
                e6 e6Var2 = (e6) obj4;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                p80 F2 = p80.F(((org.telegram.ui.Wallet.i2[]) obj5)[0].getContainer(), e6Var2, (ImageView) obj3);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    F2.c(R.drawable.msg_search, LocaleController.getString(R.string.WalletViewInExplorer), new bi0(context, i11, wallettransactionArr, 13), false);
                }
                F2.c(R.drawable.wallet_help, LocaleController.getString(R.string.WalletWhatIsGram), new dt(context, 1, e6Var2), false);
                F2.a0(0.0f, -AndroidUtilities.dp(48.0f));
                F2.Z();
                return;
            default:
                ci.d dVar = (ci.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.f20266id;
                    int i13 = this.f9219b;
                    ConnectionsManager.getInstance(i13).sendRequest(tL_changeStarsSubscription, new za(dVar, f3VarArr, i13, tLObject2, str, 13));
                    return;
                }
                return;
        }
    }

    public m3(ci.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr, TLObject tLObject, String str) {
        this.f9218a = 5;
        this.d = dVar;
        this.f9221e = starsSubscription;
        this.f9219b = i10;
        this.f9220c = f3VarArr;
        this.f9222f = tLObject;
        this.h = str;
    }

    public m3(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f9218a = i11;
        this.d = obj;
        this.f9221e = obj2;
        this.f9220c = obj3;
        this.f9222f = obj4;
        this.h = obj5;
        this.f9219b = i10;
    }

    public m3(ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3, int i10, org.telegram.ui.ActionBar.a3 a3Var, Utilities.Callback callback) {
        this.f9218a = 2;
        this.d = ud0Var;
        this.f9221e = ud0Var2;
        this.f9220c = ud0Var3;
        this.f9219b = i10;
        this.f9222f = a3Var;
        this.h = callback;
    }

    public m3(z4.g gVar, int i10, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, vk0 vk0Var) {
        this.f9218a = 1;
        this.d = gVar;
        this.f9219b = i10;
        this.f9220c = linearLayout;
        this.f9221e = atomicBoolean;
        this.f9222f = horizontalScrollView;
        this.h = vk0Var;
    }
}
