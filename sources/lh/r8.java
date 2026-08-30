package lh;

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
    public final int f13034a = 1;
    public final int f13035b;
    public final boolean f13036c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final long e;
    public final KeyEvent.Callback f13037f;
    public final Object h;
    public final Object f13038n;
    public final Context f13039r;
    public final Object f13040s;

    public r8(eb ebVar, MessageObject messageObject, xn xnVar, int i10, boolean z4, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10, TLRPC.Chat chat) {
        this.f13037f = ebVar;
        this.h = messageObject;
        this.f13038n = xnVar;
        this.f13035b = i10;
        this.f13036c = z4;
        this.f13039r = context;
        this.d = f6Var;
        this.e = j10;
        this.f13040s = chat;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f13034a) {
            case 0:
                ph.d dVar = (ph.d) this.f13037f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) this.f13038n;
                Activity activity = (Activity) this.f13039r;
                String str2 = (String) this.f13040s;
                if (!dVar.K) {
                    int i11 = this.f13035b;
                    t7 y10 = t7.y(i11, false);
                    long j10 = this.e;
                    kh.x xVar = new kh.x(dVar, starsSubscription, i11, g3VarArr, j10, 2);
                    if (y10.f13152f.amount < starsSubscription.pricing.amount) {
                        long j11 = starsSubscription.pricing.amount;
                        if (this.f13036c) {
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
                eb ebVar = (eb) this.f13037f;
                MessageObject messageObject = (MessageObject) this.h;
                xn xnVar = (xn) this.f13038n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f13040s;
                if (!ebVar.O) {
                    long value = ebVar.f12384r.getValue();
                    if ((ebVar.M != null || (messageObject != null && xnVar != null)) && ebVar.S == null) {
                        int i12 = this.f13035b;
                        if (MessagesController.getInstance(i12).isFrozen()) {
                            org.telegram.ui.c.b(i12);
                            return;
                        }
                        t7 y11 = t7.y(i12, false);
                        kh.g1 g1Var = new kh.g1(ebVar, value, y11, messageObject, xnVar, 7);
                        if (y11.e && y11.p().amount < value) {
                            boolean z4 = this.f13036c;
                            Context context = this.f13039r;
                            org.telegram.ui.ActionBar.f6 f6Var = this.d;
                            long j12 = this.e;
                            if (z4) {
                                new z9(context, f6Var, value, 17, DialogObject.getShortName(i12, j12), g1Var, j12).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new z9(context, f6Var, value, 5, str, g1Var, j12).show();
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

    public r8(ph.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.g3[] g3VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, String str) {
        this.f13037f = dVar;
        this.f13035b = i10;
        this.h = starsSubscription;
        this.f13038n = g3VarArr;
        this.e = j10;
        this.f13039r = activity;
        this.d = f6Var;
        this.f13036c = z4;
        this.f13040s = str;
    }
}
