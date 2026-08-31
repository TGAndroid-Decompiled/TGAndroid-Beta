package mh;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.xn;
public final class r8 implements View.OnClickListener {
    public final int f14697a = 1;
    public final int f14698b;
    public final boolean f14699c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final long f14700e;
    public final KeyEvent.Callback f14701f;
    public final Object h;
    public final Object f14702n;
    public final Context f14703r;
    public final Object f14704s;

    public r8(eb ebVar, MessageObject messageObject, xn xnVar, int i10, boolean z4, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, TLRPC.Chat chat) {
        this.f14701f = ebVar;
        this.h = messageObject;
        this.f14702n = xnVar;
        this.f14698b = i10;
        this.f14699c = z4;
        this.f14703r = context;
        this.d = g6Var;
        this.f14700e = j10;
        this.f14704s = chat;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f14697a) {
            case 0:
                qh.d dVar = (qh.d) this.f14701f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.f14702n;
                Activity activity = (Activity) this.f14703r;
                String str2 = (String) this.f14704s;
                if (!dVar.K) {
                    int i11 = this.f14698b;
                    t7 y10 = t7.y(i11, false);
                    long j10 = this.f14700e;
                    lh.x xVar = new lh.x(dVar, starsSubscription, i11, h3VarArr, j10, 2);
                    if (y10.f14832f.amount < starsSubscription.pricing.amount) {
                        long j11 = starsSubscription.pricing.amount;
                        if (this.f14699c) {
                            i10 = 8;
                        } else if (j10 < 0) {
                            i10 = 2;
                        } else {
                            i10 = 7;
                        }
                        new z9(activity, this.d, j11, i10, str2, xVar, j10).show();
                        return;
                    }
                    xVar.run();
                    return;
                }
                return;
            default:
                eb ebVar = (eb) this.f14701f;
                MessageObject messageObject = (MessageObject) this.h;
                xn xnVar = (xn) this.f14702n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f14704s;
                if (!ebVar.O) {
                    long value = ebVar.f13993r.getValue();
                    if ((ebVar.M != null || (messageObject != null && xnVar != null)) && ebVar.S == null) {
                        int i12 = this.f14698b;
                        if (MessagesController.getInstance(i12).isFrozen()) {
                            org.telegram.ui.c.b(i12);
                            return;
                        }
                        t7 y11 = t7.y(i12, false);
                        lh.g1 g1Var = new lh.g1(ebVar, value, y11, messageObject, xnVar, 7);
                        if (y11.f14831e && y11.p().amount < value) {
                            boolean z4 = this.f14699c;
                            Context context = this.f14703r;
                            org.telegram.ui.ActionBar.g6 g6Var = this.d;
                            long j12 = this.f14700e;
                            if (z4) {
                                new z9(context, g6Var, value, 17, DialogObject.getShortName(i12, j12), g1Var, j12).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new z9(context, g6Var, value, 5, str, g1Var, j12).show();
                            return;
                        }
                        g1Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public r8(qh.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.h3[] h3VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, String str) {
        this.f14701f = dVar;
        this.f14698b = i10;
        this.h = starsSubscription;
        this.f14702n = h3VarArr;
        this.f14700e = j10;
        this.f14703r = activity;
        this.d = g6Var;
        this.f14699c = z4;
        this.f14704s = str;
    }
}
