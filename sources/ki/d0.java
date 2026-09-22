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
    public final int f13665a = 2;
    public final boolean f13666b;
    public final boolean f13667c;
    public final int d;
    public final Object e;
    public final Object f13668f;
    public final Object h;
    public final Object f13669n;

    public d0(int i10, ci.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, f3[] f3VarArr) {
        this.e = dVar;
        this.f13668f = f3VarArr;
        this.d = i10;
        this.f13666b = z10;
        this.h = starsSubscription;
        this.f13667c = z11;
        this.f13669n = tLObject;
    }

    @Override
    public final void run() {
        File file;
        String formatString;
        switch (this.f13665a) {
            case 0:
                q0 q0Var = (q0) this.e;
                q qVar = (q) this.f13668f;
                boolean z10 = this.f13666b;
                File file2 = (File) this.h;
                boolean z11 = this.f13667c;
                int i10 = this.d;
                m0 m0Var = (m0) this.f13669n;
                q0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    qVar.c();
                    k kVar = q0Var.f13836l;
                    kVar.b("preview output finalized: size=" + qVar.f13816a.length() + ", replace=" + z10 + ", elapsedMs=" + q0.e(nanoTime));
                    q0Var.f();
                    if (z10) {
                        q0Var.r(file2, q0Var.F, q0Var.G, z11, i10);
                        file = file2;
                        w7.k.c(qVar.f13816a);
                    } else {
                        file = file2;
                        q0Var.b(m0Var, qVar.f13816a, q0Var.D, true);
                    }
                    w7.k.c(file);
                    q0Var.P = null;
                    return;
                } catch (Exception e) {
                    q0Var.h.post(new z(q0Var, e, 0));
                    return;
                }
            case 1:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$95(this.f13666b, (TLRPC.Message) this.f13668f, (ArrayList) this.h, this.f13667c, (ArrayList) this.f13669n, this.d);
                return;
            default:
                int i11 = this.d;
                boolean z12 = this.f13666b;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                boolean z13 = this.f13667c;
                TLObject tLObject = (TLObject) this.f13669n;
                ((ci.d) this.e).setLoading(false);
                f3 f3Var = ((f3[]) this.f13668f)[0];
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

    public d0(q0 q0Var, q qVar, boolean z10, File file, boolean z11, int i10, m0 m0Var) {
        this.e = q0Var;
        this.f13668f = qVar;
        this.f13666b = z10;
        this.h = file;
        this.f13667c = z11;
        this.d = i10;
        this.f13669n = m0Var;
    }

    public d0(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.f13666b = z10;
        this.f13668f = message;
        this.h = arrayList;
        this.f13667c = z11;
        this.f13669n = arrayList2;
        this.d = i10;
    }
}
