package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
public final class bj implements Runnable {
    public final int f16590a = 2;
    public final boolean f16591b;
    public final boolean f16592c;
    public final int d;
    public final Object e;
    public final Object f16593f;
    public final Object h;
    public final Object f16594n;

    public bj(int i10, di.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.e = dVar;
        this.f16593f = e3VarArr;
        this.d = i10;
        this.f16591b = z10;
        this.h = starsSubscription;
        this.f16592c = z11;
        this.f16594n = tLObject;
    }

    @Override
    public final void run() {
        File file;
        File file2;
        String formatString;
        switch (this.f16590a) {
            case 0:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$98(this.f16591b, (TLRPC.Message) this.f16593f, (ArrayList) this.h, this.f16592c, (ArrayList) this.f16594n, this.d);
                return;
            case 1:
                ri.r0 r0Var = (ri.r0) this.e;
                ri.v vVar = (ri.v) this.f16593f;
                boolean z10 = this.f16591b;
                File file3 = (File) this.h;
                boolean z11 = this.f16592c;
                int i10 = this.d;
                ri.n0 n0Var = (ri.n0) this.f16594n;
                r0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    vVar.g();
                    ri.n nVar = r0Var.f44684m;
                    nVar.b("preview output finalized: size=" + vVar.f44751a.length() + ", replace=" + z10 + ", elapsedMs=" + ri.r0.f(nanoTime));
                    r0Var.g();
                    if (z10) {
                        r0Var.s(file3, r0Var.G, r0Var.H, z11, i10);
                        file = file3;
                    } else {
                        file = file3;
                        try {
                            try {
                                File file4 = vVar.f44751a;
                                long j10 = r0Var.K;
                                if (j10 <= 0) {
                                    j10 = r0Var.E;
                                }
                                ExecutorService executorService = r0Var.f44682k;
                                try {
                                    ri.e0 e0Var = new ri.e0(r0Var, n0Var, file4, j10, true);
                                    r0Var = r0Var;
                                    executorService.execute(e0Var);
                                } catch (Exception e) {
                                    e = e;
                                    r0Var = r0Var;
                                    r0Var.f44680i.post(new ri.c0(r0Var, e, 0));
                                    if (file != null) {
                                        w7.m7.c(file);
                                    }
                                    if (z10) {
                                        file2 = vVar.f44751a;
                                        w7.m7.c(file2);
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (file != null) {
                                    w7.m7.c(file);
                                }
                                if (z10) {
                                    w7.m7.c(vVar.f44751a);
                                }
                                throw th;
                            }
                        } catch (Exception e7) {
                            e = e7;
                        }
                    }
                    r0Var.R = null;
                    if (file != null) {
                        w7.m7.c(file);
                    }
                } catch (Exception e10) {
                    e = e10;
                    file = file3;
                } catch (Throwable th3) {
                    th = th3;
                    file = file3;
                }
                if (z10) {
                    file2 = vVar.f44751a;
                    w7.m7.c(file2);
                    return;
                }
                return;
            default:
                int i11 = this.d;
                boolean z12 = this.f16591b;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                boolean z13 = this.f16592c;
                TLObject tLObject = (TLObject) this.f16594n;
                ((di.d) this.e).setLoading(false);
                org.telegram.ui.ActionBar.e3 e3Var = ((org.telegram.ui.ActionBar.e3[]) this.f16593f)[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                zh.n5.y(i11, false).S();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    if (z12 && !TextUtils.isEmpty(starsSubscription.title)) {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                    } else if (z13 && !TextUtils.isEmpty(starsSubscription.title)) {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title);
                    } else {
                        formatString = LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date));
                    }
                    org.telegram.ui.Components.zc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags(formatString), null).k(false);
                    return;
                }
                return;
        }
    }

    public bj(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.f16591b = z10;
        this.f16593f = message;
        this.h = arrayList;
        this.f16592c = z11;
        this.f16594n = arrayList2;
        this.d = i10;
    }

    public bj(ri.r0 r0Var, ri.v vVar, boolean z10, File file, boolean z11, int i10, ri.n0 n0Var) {
        this.e = r0Var;
        this.f16593f = vVar;
        this.f16591b = z10;
        this.h = file;
        this.f16592c = z11;
        this.d = i10;
        this.f16594n = n0Var;
    }
}
