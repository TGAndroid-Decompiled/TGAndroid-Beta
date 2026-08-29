package jh;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.tn;
public final class q8 implements View.OnClickListener {
    public final int f12669a = 1;
    public final int f12670b;
    public final boolean f12671c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final long f12672e;
    public final KeyEvent.Callback f12673f;
    public final Object h;
    public final Object f12674n;
    public final Context f12675r;
    public final Object f12676s;

    public q8(db dbVar, MessageObject messageObject, tn tnVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, TLRPC.Chat chat) {
        this.f12673f = dbVar;
        this.h = messageObject;
        this.f12674n = tnVar;
        this.f12670b = i10;
        this.f12671c = z10;
        this.f12675r = context;
        this.d = c6Var;
        this.f12672e = j10;
        this.f12676s = chat;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f12669a) {
            case 0:
                nh.d dVar = (nh.d) this.f12673f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f12674n;
                Activity activity = (Activity) this.f12675r;
                String str2 = (String) this.f12676s;
                if (!dVar.J) {
                    int i11 = this.f12670b;
                    s7 y8 = s7.y(i11, false);
                    long j10 = this.f12672e;
                    ih.y yVar = new ih.y(dVar, starsSubscription, i11, f3VarArr, j10, 2);
                    if (y8.f12791f.amount < starsSubscription.pricing.amount) {
                        long j11 = starsSubscription.pricing.amount;
                        if (this.f12671c) {
                            i10 = 8;
                        } else if (j10 < 0) {
                            i10 = 2;
                        } else {
                            i10 = 7;
                        }
                        new y9(activity, this.d, j11, i10, str2, yVar, j10).show();
                        return;
                    }
                    yVar.run();
                    return;
                }
                return;
            default:
                db dbVar = (db) this.f12673f;
                MessageObject messageObject = (MessageObject) this.h;
                tn tnVar = (tn) this.f12674n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f12676s;
                if (!dbVar.N) {
                    long value = dbVar.f11978r.getValue();
                    if ((dbVar.L != null || (messageObject != null && tnVar != null)) && dbVar.R == null) {
                        int i12 = this.f12670b;
                        if (MessagesController.getInstance(i12).isFrozen()) {
                            org.telegram.ui.c.b(i12);
                            return;
                        }
                        s7 y10 = s7.y(i12, false);
                        ih.h1 h1Var = new ih.h1(dbVar, value, y10, messageObject, tnVar, 7);
                        if (y10.f12790e && y10.p().amount < value) {
                            boolean z10 = this.f12671c;
                            Context context = this.f12675r;
                            org.telegram.ui.ActionBar.c6 c6Var = this.d;
                            long j12 = this.f12672e;
                            if (z10) {
                                new y9(context, c6Var, value, 17, DialogObject.getShortName(i12, j12), h1Var, j12).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new y9(context, c6Var, value, 5, str, h1Var, j12).show();
                            return;
                        }
                        h1Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public q8(nh.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.f3[] f3VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, String str) {
        this.f12673f = dVar;
        this.f12670b = i10;
        this.h = starsSubscription;
        this.f12674n = f3VarArr;
        this.f12672e = j10;
        this.f12675r = activity;
        this.d = c6Var;
        this.f12671c = z10;
        this.f12676s = str;
    }
}
