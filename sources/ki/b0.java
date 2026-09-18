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
import yh.t5;
public final class b0 implements Runnable {
    public final int f13656a = 2;
    public final boolean f13657b;
    public final boolean f13658c;
    public final int d;
    public final Object e;
    public final Object f13659f;
    public final Object h;
    public final Object f13660n;

    public b0(int i10, ci.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, f3[] f3VarArr) {
        this.e = dVar;
        this.f13659f = f3VarArr;
        this.d = i10;
        this.f13657b = z10;
        this.h = starsSubscription;
        this.f13658c = z11;
        this.f13660n = tLObject;
    }

    @Override
    public final void run() {
        File file;
        String formatString;
        switch (this.f13656a) {
            case 0:
                h0 h0Var = (h0) this.e;
                o oVar = (o) this.f13659f;
                boolean z10 = this.f13657b;
                File file2 = (File) this.h;
                boolean z11 = this.f13658c;
                int i10 = this.d;
                e0 e0Var = (e0) this.f13660n;
                h0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    oVar.c();
                    j jVar = h0Var.f13713l;
                    jVar.b("preview output finalized: size=" + oVar.f13780a.length() + ", replace=" + z10 + ", elapsedMs=" + h0.e(nanoTime));
                    h0Var.f();
                    if (z10) {
                        h0Var.q(file2, h0Var.A, h0Var.B, z11, i10);
                        file = file2;
                        w7.k.c(oVar.f13780a);
                    } else {
                        file = file2;
                        h0Var.b(e0Var, oVar.f13780a, h0Var.f13725y, true);
                    }
                    w7.k.c(file);
                    h0Var.K = null;
                    return;
                } catch (Exception e) {
                    h0Var.h.post(new x(h0Var, e, 0));
                    return;
                }
            case 1:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$95(this.f13657b, (TLRPC.Message) this.f13659f, (ArrayList) this.h, this.f13658c, (ArrayList) this.f13660n, this.d);
                return;
            default:
                int i11 = this.d;
                boolean z12 = this.f13657b;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                boolean z13 = this.f13658c;
                TLObject tLObject = (TLObject) this.f13660n;
                ((ci.d) this.e).setLoading(false);
                f3 f3Var = ((f3[]) this.f13659f)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                t5.y(i11, false).S();
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

    public b0(h0 h0Var, o oVar, boolean z10, File file, boolean z11, int i10, e0 e0Var) {
        this.e = h0Var;
        this.f13659f = oVar;
        this.f13657b = z10;
        this.h = file;
        this.f13658c = z11;
        this.d = i10;
        this.f13660n = e0Var;
    }

    public b0(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.f13657b = z10;
        this.f13659f = message;
        this.h = arrayList;
        this.f13658c = z11;
        this.f13660n = arrayList2;
        this.d = i10;
    }
}
