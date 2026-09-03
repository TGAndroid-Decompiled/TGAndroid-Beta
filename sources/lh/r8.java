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
import org.telegram.ui.zn;
public final class r8 implements View.OnClickListener {
    public final int f13018a = 1;
    public final int f13019b;
    public final boolean f13020c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final long e;
    public final KeyEvent.Callback f13021f;
    public final Object h;
    public final Object f13022n;
    public final Context f13023r;
    public final Object f13024s;

    public r8(eb ebVar, MessageObject messageObject, zn znVar, int i10, boolean z4, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10, TLRPC.Chat chat) {
        this.f13021f = ebVar;
        this.h = messageObject;
        this.f13022n = znVar;
        this.f13019b = i10;
        this.f13020c = z4;
        this.f13023r = context;
        this.d = f6Var;
        this.e = j10;
        this.f13024s = chat;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f13018a) {
            case 0:
                ph.d dVar = (ph.d) this.f13021f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) this.f13022n;
                Activity activity = (Activity) this.f13023r;
                String str2 = (String) this.f13024s;
                if (!dVar.K) {
                    int i11 = this.f13019b;
                    t7 y10 = t7.y(i11, false);
                    long j10 = this.e;
                    kh.x xVar = new kh.x(dVar, starsSubscription, i11, g3VarArr, j10, 2);
                    if (y10.f13136f.amount < starsSubscription.pricing.amount) {
                        long j11 = starsSubscription.pricing.amount;
                        if (this.f13020c) {
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
                eb ebVar = (eb) this.f13021f;
                MessageObject messageObject = (MessageObject) this.h;
                zn znVar = (zn) this.f13022n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f13024s;
                if (!ebVar.O) {
                    long value = ebVar.f12368r.getValue();
                    if ((ebVar.M != null || (messageObject != null && znVar != null)) && ebVar.S == null) {
                        int i12 = this.f13019b;
                        if (MessagesController.getInstance(i12).isFrozen()) {
                            org.telegram.ui.c.b(i12);
                            return;
                        }
                        t7 y11 = t7.y(i12, false);
                        kh.g1 g1Var = new kh.g1(ebVar, value, y11, messageObject, znVar, 7);
                        if (y11.e && y11.p().amount < value) {
                            boolean z4 = this.f13020c;
                            Context context = this.f13023r;
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
        this.f13021f = dVar;
        this.f13019b = i10;
        this.h = starsSubscription;
        this.f13022n = g3VarArr;
        this.e = j10;
        this.f13023r = activity;
        this.d = f6Var;
        this.f13020c = z4;
        this.f13024s = str;
    }
}
