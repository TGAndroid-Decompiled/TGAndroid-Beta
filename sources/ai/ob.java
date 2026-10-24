package ai;

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
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.zr;
public final class ob implements View.OnClickListener {
    public final int f1958a = 1;
    public final int f1959b;
    public final Object f1960c;
    public final Object d;
    public final Object e;
    public final Object f1961f;
    public final Object h;

    public ob(int i10, org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.g6 g6Var, LinearLayout linearLayout, long[] jArr, vb vbVar) {
        this.f1959b = i10;
        this.f1960c = h3Var;
        this.d = g6Var;
        this.e = linearLayout;
        this.f1961f = jArr;
        this.h = vbVar;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        boolean z10;
        Runnable runnable;
        int i10 = this.f1958a;
        int i11 = this.f1959b;
        Object obj = this.h;
        Object obj2 = this.f1961f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f1960c;
        switch (i10) {
            case 0:
                ei.d dVar = (ei.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.f20569id;
                    int i12 = this.f1959b;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_changeStarsSubscription, new tb(dVar, h3VarArr, i12, tLObject, str, 0));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj5;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                vb vbVar = (vb) obj;
                k0 g10 = k0.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f1604j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f1606l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                h80 F = h80.F(h3Var.getContainerView(), g6Var, linearLayout);
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj6 = arrayList.get(i13);
                    i13++;
                    TLObject tLObject2 = (TLObject) obj6;
                    if (tLObject2 instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject2).f20491id;
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            j10 = -chat.f20344id;
                        }
                    }
                    long j11 = j10;
                    if (j11 == jArr[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject2, z10, new a3.i0(jArr, j11, vbVar, 11));
                }
                F.f26930t = false;
                F.f26929s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
            case 2:
                z4.h hVar = (z4.h) obj5;
                LinearLayout linearLayout2 = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                qk0 qk0Var = (qk0) obj;
                int currentItem = hVar.getCurrentItem();
                if (i11 != currentItem) {
                    qk0 qk0Var2 = (qk0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    hVar.x(i11, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = qk0Var.getX() - ((horizontalScrollView.getWidth() - qk0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(zr.f33337f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, qk0Var2, qk0Var));
                    duration.start();
                    return;
                }
                return;
            case 3:
                od0 od0Var = (od0) obj3;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((od0) obj5).getValue();
                tL_birthday.month = ((od0) obj4).getValue() + 1;
                if (od0Var.getValue() != i11) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = od0Var.getValue();
                }
                runnable = b3Var.f20729a.dismissRunnable;
                runnable.run();
                callback.run(tL_birthday);
                return;
            case 4:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj3, 0, (ci.b) obj2);
                String string = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                c2Var.R = string;
                c2Var.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.fa((vr) obj4, (ei.d) obj5, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f1959b, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) obj4;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                h80 F2 = h80.F(((org.telegram.ui.Wallet.j2[]) obj5)[0].getContainer(), g6Var2, (ImageView) obj3);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    F2.c(R.drawable.msg_search, LocaleController.getString(R.string.WalletViewInExplorer), new b41(context, i11, wallettransactionArr, 18), false);
                }
                F2.c(R.drawable.wallet_help, LocaleController.getString(R.string.WalletWhatIsGram), new b(context, 2, g6Var2), false);
                F2.a0(0.0f, -AndroidUtilities.dp(48.0f));
                F2.Z();
                return;
        }
    }

    public ob(ei.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.h3[] h3VarArr, TLObject tLObject, String str) {
        this.f1960c = dVar;
        this.d = starsSubscription;
        this.f1959b = i10;
        this.e = h3VarArr;
        this.f1961f = tLObject;
        this.h = str;
    }

    public ob(vr vrVar, Context context, ci.b bVar, ei.d dVar, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i10) {
        this.d = vrVar;
        this.e = context;
        this.f1961f = bVar;
        this.f1960c = dVar;
        this.h = getgroupcallstreamrtmpurl;
        this.f1959b = i10;
    }

    public ob(od0 od0Var, od0 od0Var2, od0 od0Var3, int i10, org.telegram.ui.ActionBar.b3 b3Var, Utilities.Callback callback) {
        this.f1960c = od0Var;
        this.d = od0Var2;
        this.e = od0Var3;
        this.f1959b = i10;
        this.f1961f = b3Var;
        this.h = callback;
    }

    public ob(z4.h hVar, int i10, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, qk0 qk0Var) {
        this.f1960c = hVar;
        this.f1959b = i10;
        this.d = linearLayout;
        this.e = atomicBoolean;
        this.f1961f = horizontalScrollView;
        this.h = qk0Var;
    }

    public ob(org.telegram.ui.Wallet.j2[] j2VarArr, org.telegram.ui.ActionBar.g6 g6Var, ImageView imageView, TL_wallet.walletTransaction[] wallettransactionArr, Context context, int i10) {
        this.f1960c = j2VarArr;
        this.d = g6Var;
        this.e = imageView;
        this.f1961f = wallettransactionArr;
        this.h = context;
        this.f1959b = i10;
    }
}
