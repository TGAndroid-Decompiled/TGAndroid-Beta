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
public final class ej implements Runnable {
    public final int f17536a = 2;
    public final boolean f17537b;
    public final boolean f17538c;
    public final int d;
    public final Object f17539e;
    public final Object f17540f;
    public final Object h;
    public final Object f17541n;

    public ej(int i10, ci.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.e3[] e3VarArr) {
        this.f17539e = dVar;
        this.f17540f = e3VarArr;
        this.d = i10;
        this.f17537b = z10;
        this.h = starsSubscription;
        this.f17538c = z11;
        this.f17541n = tLObject;
    }

    @Override
    public final void run() {
        String formatString;
        switch (this.f17536a) {
            case 0:
                ((SendMessagesHelper) this.f17539e).lambda$performSendMessageRequest$98(this.f17537b, (TLRPC.Message) this.f17540f, (ArrayList) this.h, this.f17538c, (ArrayList) this.f17541n, this.d);
                return;
            case 1:
                qi.p0 p0Var = (qi.p0) this.f17539e;
                qi.s sVar = (qi.s) this.f17540f;
                boolean z10 = this.f17537b;
                File file = (File) this.h;
                boolean z11 = this.f17538c;
                int i10 = this.d;
                qi.l0 l0Var = (qi.l0) this.f17541n;
                p0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    sVar.g();
                    qi.l lVar = p0Var.f46863n;
                    lVar.b("preview output finalized: size=" + sVar.f46885a.length() + ", replace=" + z10 + ", elapsedMs=" + qi.p0.f(nanoTime));
                    p0Var.g();
                    if (z10) {
                        p0Var.u(file, p0Var.H, p0Var.I, z11, i10);
                    } else {
                        File file2 = sVar.f46885a;
                        long j3 = p0Var.L;
                        if (j3 <= 0) {
                            j3 = p0Var.F;
                        }
                        long j10 = j3;
                        ExecutorService executorService = p0Var.f46861l;
                        try {
                            qi.c0 c0Var = new qi.c0(p0Var, l0Var, file2, j10, true);
                            p0Var = p0Var;
                            executorService.execute(c0Var);
                        } catch (Exception e7) {
                            e = e7;
                            p0Var = p0Var;
                            p0Var.f46859j.post(new qi.z(p0Var, e, 0));
                            return;
                        }
                    }
                    p0Var.S = null;
                    return;
                } catch (Exception e10) {
                    e = e10;
                }
            default:
                int i11 = this.d;
                boolean z12 = this.f17537b;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                boolean z13 = this.f17538c;
                TLObject tLObject = (TLObject) this.f17541n;
                ((ci.d) this.f17539e).setLoading(false);
                org.telegram.ui.ActionBar.e3 e3Var = ((org.telegram.ui.ActionBar.e3[]) this.f17540f)[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                yh.n5.y(i11, false).S();
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

    public ej(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.f17539e = sendMessagesHelper;
        this.f17537b = z10;
        this.f17540f = message;
        this.h = arrayList;
        this.f17538c = z11;
        this.f17541n = arrayList2;
        this.d = i10;
    }

    public ej(qi.p0 p0Var, qi.s sVar, boolean z10, File file, boolean z11, int i10, qi.l0 l0Var) {
        this.f17539e = p0Var;
        this.f17540f = sVar;
        this.f17537b = z10;
        this.h = file;
        this.f17538c = z11;
        this.d = i10;
        this.f17541n = l0Var;
    }
}
