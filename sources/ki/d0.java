package ki;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import yh.u5;
public final class d0 implements Runnable {
    public final int f13667a = 2;
    public final boolean f13668b;
    public final boolean f13669c;
    public final int d;
    public final Object e;
    public final Object f13670f;
    public final Object h;
    public final Object f13671n;

    public d0(int i10, ci.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, f3[] f3VarArr) {
        this.e = dVar;
        this.f13670f = f3VarArr;
        this.d = i10;
        this.f13668b = z10;
        this.h = starsSubscription;
        this.f13669c = z11;
        this.f13671n = tLObject;
    }

    @Override
    public final void run() {
        File file;
        String formatString;
        switch (this.f13667a) {
            case 0:
                o0 o0Var = (o0) this.e;
                q qVar = (q) this.f13670f;
                boolean z10 = this.f13668b;
                File file2 = (File) this.h;
                boolean z11 = this.f13669c;
                int i10 = this.d;
                k0 k0Var = (k0) this.f13671n;
                o0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    qVar.c();
                    k kVar = o0Var.f13808l;
                    kVar.b("preview output finalized: size=" + qVar.f13825a.length() + ", replace=" + z10 + ", elapsedMs=" + o0.e(nanoTime));
                    o0Var.f();
                    if (z10) {
                        o0Var.r(file2, o0Var.F, o0Var.G, z11, i10);
                        file = file2;
                        w7.k.c(qVar.f13825a);
                    } else {
                        file = file2;
                        o0Var.b(k0Var, qVar.f13825a, o0Var.D, true);
                    }
                    w7.k.c(file);
                    o0Var.P = null;
                    return;
                } catch (Exception e) {
                    o0Var.h.post(new z(o0Var, e, 0));
                    return;
                }
            case 1:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$95(this.f13668b, (TLRPC.Message) this.f13670f, (ArrayList) this.h, this.f13669c, (ArrayList) this.f13671n, this.d);
                return;
            default:
                int i11 = this.d;
                boolean z12 = this.f13668b;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                boolean z13 = this.f13669c;
                TLObject tLObject = (TLObject) this.f13671n;
                ((ci.d) this.e).setLoading(false);
                f3 f3Var = ((f3[]) this.f13670f)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                u5.y(i11, false).S();
                n2 U = LaunchActivity.U();
                if (U != null) {
                    if (z12 && !TextUtils.isEmpty(starsSubscription.title)) {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                    } else if (z13 && !TextUtils.isEmpty(starsSubscription.title)) {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                    } else {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date));
                    }
                    xc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags(formatString), null).k(false);
                    return;
                }
                return;
        }
    }

    public d0(o0 o0Var, q qVar, boolean z10, File file, boolean z11, int i10, k0 k0Var) {
        this.e = o0Var;
        this.f13670f = qVar;
        this.f13668b = z10;
        this.h = file;
        this.f13669c = z11;
        this.d = i10;
        this.f13671n = k0Var;
    }

    public d0(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.f13668b = z10;
        this.f13670f = message;
        this.h = arrayList;
        this.f13669c = z11;
        this.f13671n = arrayList2;
        this.d = i10;
    }
}
