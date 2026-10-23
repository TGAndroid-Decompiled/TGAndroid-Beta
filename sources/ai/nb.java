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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.xr;
import org.telegram.ui.Components.y31;
public final class nb implements View.OnClickListener {
    public final int f1913a = 1;
    public final int f1914b;
    public final Object f1915c;
    public final Object d;
    public final Object e;
    public final Object f1916f;
    public final Object h;

    public nb(int i10, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var, LinearLayout linearLayout, long[] jArr, ub ubVar) {
        this.f1914b = i10;
        this.f1915c = f3Var;
        this.d = d6Var;
        this.e = linearLayout;
        this.f1916f = jArr;
        this.h = ubVar;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        boolean z10;
        Runnable runnable;
        int i10 = this.f1913a;
        int i11 = this.f1914b;
        Object obj = this.h;
        Object obj2 = this.f1916f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f1915c;
        switch (i10) {
            case 0:
                ei.d dVar = (ei.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.f20505id;
                    int i12 = this.f1914b;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_changeStarsSubscription, new sb(dVar, f3VarArr, i12, tLObject, str, 0));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj5;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                ub ubVar = (ub) obj;
                k0 g10 = k0.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f1625j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f1627l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i11).getCurrentUser());
                i80 F = i80.F(f3Var.getContainerView(), d6Var, linearLayout);
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj6 = arrayList.get(i13);
                    i13++;
                    TLObject tLObject2 = (TLObject) obj6;
                    if (tLObject2 instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject2).f20427id;
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            j10 = -chat.f20280id;
                        }
                    }
                    long j11 = j10;
                    if (j11 == jArr[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject2, z10, new a3.i0(jArr, j11, ubVar, 11));
                }
                F.f27190t = false;
                F.f27189s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                return;
            case 2:
                z4.g gVar = (z4.g) obj5;
                LinearLayout linearLayout2 = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                ok0 ok0Var = (ok0) obj;
                int currentItem = gVar.getCurrentItem();
                if (i11 != currentItem) {
                    ok0 ok0Var2 = (ok0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    gVar.x(i11, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = ok0Var.getX() - ((horizontalScrollView.getWidth() - ok0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(bs.f25025f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, ok0Var2, ok0Var));
                    duration.start();
                    return;
                }
                return;
            case 3:
                od0 od0Var = (od0) obj3;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((od0) obj5).getValue();
                tL_birthday.month = ((od0) obj4).getValue() + 1;
                if (od0Var.getValue() != i11) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = od0Var.getValue();
                }
                runnable = a3Var.f20617a.dismissRunnable;
                runnable.run();
                callback.run(tL_birthday);
                return;
            case 4:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj3, 0, (ci.b) obj2);
                String string = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.fa((xr) obj4, (ei.d) obj5, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f1914b, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            default:
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) obj4;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                i80 F2 = i80.F(((org.telegram.ui.Wallet.k2[]) obj5)[0].getContainer(), d6Var2, (ImageView) obj3);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    F2.c(R.drawable.msg_search, LocaleController.getString(R.string.WalletViewInExplorer), new y31(context, i11, wallettransactionArr, 18), false);
                }
                F2.c(R.drawable.wallet_help, LocaleController.getString(R.string.WalletWhatIsGram), new b(context, 2, d6Var2), false);
                F2.a0(0.0f, -AndroidUtilities.dp(48.0f));
                F2.Z();
                return;
        }
    }

    public nb(ei.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr, TLObject tLObject, String str) {
        this.f1915c = dVar;
        this.d = starsSubscription;
        this.f1914b = i10;
        this.e = f3VarArr;
        this.f1916f = tLObject;
        this.h = str;
    }

    public nb(xr xrVar, Context context, ci.b bVar, ei.d dVar, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i10) {
        this.d = xrVar;
        this.e = context;
        this.f1916f = bVar;
        this.f1915c = dVar;
        this.h = getgroupcallstreamrtmpurl;
        this.f1914b = i10;
    }

    public nb(od0 od0Var, od0 od0Var2, od0 od0Var3, int i10, org.telegram.ui.ActionBar.a3 a3Var, Utilities.Callback callback) {
        this.f1915c = od0Var;
        this.d = od0Var2;
        this.e = od0Var3;
        this.f1914b = i10;
        this.f1916f = a3Var;
        this.h = callback;
    }

    public nb(z4.g gVar, int i10, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, ok0 ok0Var) {
        this.f1915c = gVar;
        this.f1914b = i10;
        this.d = linearLayout;
        this.e = atomicBoolean;
        this.f1916f = horizontalScrollView;
        this.h = ok0Var;
    }

    public nb(org.telegram.ui.Wallet.k2[] k2VarArr, org.telegram.ui.ActionBar.d6 d6Var, ImageView imageView, TL_wallet.walletTransaction[] wallettransactionArr, Context context, int i10) {
        this.f1915c = k2VarArr;
        this.d = d6Var;
        this.e = imageView;
        this.f1916f = wallettransactionArr;
        this.h = context;
        this.f1914b = i10;
    }
}
