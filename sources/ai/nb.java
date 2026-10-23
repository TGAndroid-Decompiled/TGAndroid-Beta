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
import org.telegram.ui.sn;
public final class nb implements View.OnClickListener {
    public final int f1903a = 1;
    public final int f1904b;
    public final boolean f1905c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final long e;
    public final KeyEvent.Callback f1906f;
    public final Object h;
    public final Object f1907n;
    public final Context f1908r;
    public final Object f1909s;

    public nb(me meVar, MessageObject messageObject, sn snVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, TLRPC.Chat chat) {
        this.f1906f = meVar;
        this.h = messageObject;
        this.f1907n = snVar;
        this.f1904b = i10;
        this.f1905c = z10;
        this.f1908r = context;
        this.d = g6Var;
        this.e = j10;
        this.f1909s = chat;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f1903a) {
            case 0:
                ei.d dVar = (ei.d) this.f1906f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.f1907n;
                Activity activity = (Activity) this.f1908r;
                String str2 = (String) this.f1909s;
                if (!dVar.Q) {
                    int i11 = this.f1904b;
                    ha y3 = ha.y(i11, false);
                    long j10 = this.e;
                    g0 g0Var = new g0((Object) dVar, (Object) starsSubscription, i11, (Object) h3VarArr, j10, 1);
                    if (y3.f1416f.amount < starsSubscription.pricing.amount) {
                        long j11 = starsSubscription.pricing.amount;
                        if (this.f1905c) {
                            i10 = 8;
                        } else if (j10 < 0) {
                            i10 = 2;
                        } else {
                            i10 = 7;
                        }
                        new dd(activity, this.d, j11, i10, str2, g0Var, j10).show();
                        return;
                    }
                    g0Var.run();
                    return;
                }
                return;
            default:
                me meVar = (me) this.f1906f;
                MessageObject messageObject = (MessageObject) this.h;
                sn snVar = (sn) this.f1907n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f1909s;
                if (!meVar.T) {
                    long value = meVar.f1844r.getValue();
                    if ((meVar.R != null || (messageObject != null && snVar != null)) && meVar.X == null) {
                        int i12 = this.f1904b;
                        if (MessagesController.getInstance(i12).isFrozen()) {
                            org.telegram.ui.b.b(i12);
                            return;
                        }
                        ha y10 = ha.y(i12, false);
                        z zVar = new z(meVar, value, y10, messageObject, snVar);
                        if (y10.e && y10.p().amount < value) {
                            boolean z10 = this.f1905c;
                            Context context = this.f1908r;
                            org.telegram.ui.ActionBar.g6 g6Var = this.d;
                            long j12 = this.e;
                            if (z10) {
                                new dd(context, g6Var, value, 17, DialogObject.getShortName(i12, j12), zVar, j12).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new dd(context, g6Var, value, 5, str, zVar, j12).show();
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

    public nb(ei.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.h3[] h3VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, String str) {
        this.f1906f = dVar;
        this.f1904b = i10;
        this.h = starsSubscription;
        this.f1907n = h3VarArr;
        this.e = j10;
        this.f1908r = activity;
        this.d = g6Var;
        this.f1905c = z10;
        this.f1909s = str;
    }
}
