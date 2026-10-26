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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.zr;
import org.telegram.ui.yx;
public final class mb implements View.OnClickListener {
    public final int f5106a = 1;
    public final int f5107b;
    public final Object f5108c;
    public final Object d;
    public final Object e;
    public final Object f5109f;
    public final Object h;

    public mb(int i10, org.telegram.ui.ActionBar.k3 k3Var, org.telegram.ui.ActionBar.u6 u6Var, LinearLayout linearLayout, long[] jArr, sb sbVar) {
        this.f5107b = i10;
        this.f5108c = k3Var;
        this.d = u6Var;
        this.e = linearLayout;
        this.f5109f = jArr;
        this.h = sbVar;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        boolean z10;
        Runnable runnable;
        int i10 = this.f5106a;
        int i11 = this.f5107b;
        Object obj = this.h;
        Object obj2 = this.f5109f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f5108c;
        switch (i10) {
            case 0:
                fi.d dVar = (fi.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.f22257id;
                    int i12 = this.f5107b;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_changeStarsSubscription, new ag.p0(dVar, k3VarArr, i12, tLObject, str, 2));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj5;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                sb sbVar = (sb) obj;
                m0 g7 = m0.g(i11);
                g7.n();
                g7.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g7.f5068j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g7.f5070l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                k80 F = k80.F(k3Var.getContainerView(), u6Var, linearLayout);
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj6 = arrayList.get(i13);
                    i13++;
                    TLObject tLObject2 = (TLObject) obj6;
                    if (tLObject2 instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject2).f22176id;
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            j10 = -chat.f22027id;
                        }
                    }
                    long j11 = j10;
                    if (j11 == jArr[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject2, z10, new a3.i0(jArr, j11, sbVar, 11));
                }
                F.f29869t = false;
                F.f29868s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
            case 2:
                a5.m mVar = (a5.m) obj5;
                LinearLayout linearLayout2 = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                qk0 qk0Var = (qk0) obj;
                int currentItem = mVar.getCurrentItem();
                if (i11 != currentItem) {
                    qk0 qk0Var2 = (qk0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    mVar.x(i11, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x9 = qk0Var.getX() - ((horizontalScrollView.getWidth() - qk0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(ds.f27586f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x9, qk0Var2, qk0Var));
                    duration.start();
                    return;
                }
                return;
            case 3:
                md0 md0Var = (md0) obj3;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((md0) obj5).getValue();
                tL_birthday.month = ((md0) obj4).getValue() + 1;
                if (md0Var.getValue() != i11) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = md0Var.getValue();
                }
                runnable = e3Var.f22601a.dismissRunnable;
                runnable.run();
                callback.run(tL_birthday);
                return;
            case 4:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj3, 0, (di.b) obj2);
                String string = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                e2Var.R = string;
                e2Var.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ag.k0((zr) obj4, (fi.d) obj5, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f5107b, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            default:
                org.telegram.ui.ActionBar.u6 u6Var2 = (org.telegram.ui.ActionBar.u6) obj4;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                k80 F2 = k80.F(((org.telegram.ui.Wallet.j2[]) obj5)[0].getContainer(), u6Var2, (ImageView) obj3);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    F2.c(R.drawable.msg_search, LocaleController.getString(R.string.WalletViewInExplorer), new yx(context, i11, wallettransactionArr, 16), false);
                }
                F2.c(R.drawable.wallet_help, LocaleController.getString(R.string.WalletWhatIsGram), new b(context, 2, u6Var2), false);
                F2.a0(0.0f, -AndroidUtilities.dp(48.0f));
                F2.Z();
                return;
        }
    }

    public mb(a5.m mVar, int i10, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, qk0 qk0Var) {
        this.f5108c = mVar;
        this.f5107b = i10;
        this.d = linearLayout;
        this.e = atomicBoolean;
        this.f5109f = horizontalScrollView;
        this.h = qk0Var;
    }

    public mb(fi.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.k3[] k3VarArr, TLObject tLObject, String str) {
        this.f5108c = dVar;
        this.d = starsSubscription;
        this.f5107b = i10;
        this.e = k3VarArr;
        this.f5109f = tLObject;
        this.h = str;
    }

    public mb(zr zrVar, Context context, di.b bVar, fi.d dVar, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i10) {
        this.d = zrVar;
        this.e = context;
        this.f5109f = bVar;
        this.f5108c = dVar;
        this.h = getgroupcallstreamrtmpurl;
        this.f5107b = i10;
    }

    public mb(md0 md0Var, md0 md0Var2, md0 md0Var3, int i10, org.telegram.ui.ActionBar.e3 e3Var, Utilities.Callback callback) {
        this.f5108c = md0Var;
        this.d = md0Var2;
        this.e = md0Var3;
        this.f5107b = i10;
        this.f5109f = e3Var;
        this.h = callback;
    }

    public mb(org.telegram.ui.Wallet.j2[] j2VarArr, org.telegram.ui.ActionBar.u6 u6Var, ImageView imageView, TL_wallet.walletTransaction[] wallettransactionArr, Context context, int i10) {
        this.f5108c = j2VarArr;
        this.d = u6Var;
        this.e = imageView;
        this.f5109f = wallettransactionArr;
        this.h = context;
        this.f5107b = i10;
    }
}
