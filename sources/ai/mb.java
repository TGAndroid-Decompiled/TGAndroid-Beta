package ai;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.qn;
public final class mb implements View.OnClickListener {
    public final int f1840a = 1;
    public final int f1841b;
    public final boolean f1842c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final long e;
    public final KeyEvent.Callback f1843f;
    public final Object h;
    public final Object f1844n;
    public final Context f1845r;
    public final Object f1846s;

    public mb(le leVar, MessageObject messageObject, qn qnVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, TLRPC.Chat chat) {
        this.f1843f = leVar;
        this.h = messageObject;
        this.f1844n = qnVar;
        this.f1841b = i10;
        this.f1842c = z10;
        this.f1845r = context;
        this.d = d6Var;
        this.e = j10;
        this.f1846s = chat;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f1840a) {
            case 0:
                ei.d dVar = (ei.d) this.f1843f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f1844n;
                Activity activity = (Activity) this.f1845r;
                String str2 = (String) this.f1846s;
                if (!dVar.N) {
                    int i11 = this.f1841b;
                    ga y3 = ga.y(i11, false);
                    long j10 = this.e;
                    g0 g0Var = new g0((Object) dVar, (Object) starsSubscription, i11, (Object) f3VarArr, j10, 1);
                    if (y3.f1366f.amount < starsSubscription.pricing.amount) {
                        long j11 = starsSubscription.pricing.amount;
                        if (this.f1842c) {
                            i10 = 8;
                        } else if (j10 < 0) {
                            i10 = 2;
                        } else {
                            i10 = 7;
                        }
                        new cd(activity, this.d, j11, i10, str2, g0Var, j10).show();
                        return;
                    }
                    g0Var.run();
                    return;
                }
                return;
            default:
                le leVar = (le) this.f1843f;
                MessageObject messageObject = (MessageObject) this.h;
                qn qnVar = (qn) this.f1844n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f1846s;
                if (!leVar.S) {
                    long value = leVar.f1794r.getValue();
                    if ((leVar.Q != null || (messageObject != null && qnVar != null)) && leVar.W == null) {
                        int i12 = this.f1841b;
                        if (MessagesController.getInstance(i12).isFrozen()) {
                            org.telegram.ui.b.b(i12);
                            return;
                        }
                        ga y10 = ga.y(i12, false);
                        z zVar = new z(leVar, value, y10, messageObject, qnVar);
                        if (y10.e && y10.p().amount < value) {
                            boolean z10 = this.f1842c;
                            Context context = this.f1845r;
                            org.telegram.ui.ActionBar.d6 d6Var = this.d;
                            long j12 = this.e;
                            if (z10) {
                                new cd(context, d6Var, value, 17, DialogObject.getShortName(i12, j12), zVar, j12).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new cd(context, d6Var, value, 5, str, zVar, j12).show();
                            return;
                        }
                        zVar.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public mb(ei.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.f3[] f3VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str) {
        this.f1843f = dVar;
        this.f1841b = i10;
        this.h = starsSubscription;
        this.f1844n = f3VarArr;
        this.e = j10;
        this.f1845r = activity;
        this.d = d6Var;
        this.f1842c = z10;
        this.f1846s = str;
    }
}
