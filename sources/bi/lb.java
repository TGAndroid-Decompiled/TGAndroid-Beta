package bi;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.wn;
public final class lb implements View.OnClickListener {
    public final int f5045a = 1;
    public final int f5046b;
    public final boolean f5047c;
    public final org.telegram.ui.ActionBar.u6 d;
    public final long e;
    public final KeyEvent.Callback f5048f;
    public final Object h;
    public final Object f5049n;
    public final Context f5050r;
    public final Object f5051s;

    public lb(be beVar, MessageObject messageObject, wn wnVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.u6 u6Var, long j10, TLRPC.Chat chat) {
        this.f5048f = beVar;
        this.h = messageObject;
        this.f5049n = wnVar;
        this.f5046b = i10;
        this.f5047c = z10;
        this.f5050r = context;
        this.d = u6Var;
        this.e = j10;
        this.f5051s = chat;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        String str;
        switch (this.f5045a) {
            case 0:
                fi.d dVar = (fi.d) this.f5048f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) this.f5049n;
                Activity activity = (Activity) this.f5050r;
                String str2 = (String) this.f5051s;
                if (!dVar.Q) {
                    int i11 = this.f5046b;
                    ca y3 = ca.y(i11, false);
                    long j10 = this.e;
                    h0 h0Var = new h0((Object) dVar, (Object) starsSubscription, i11, (Object) k3VarArr, j10, 1);
                    if (y3.f4444f.amount < starsSubscription.pricing.amount) {
                        long j11 = starsSubscription.pricing.amount;
                        if (this.f5047c) {
                            i10 = 8;
                        } else if (j10 < 0) {
                            i10 = 2;
                        } else {
                            i10 = 7;
                        }
                        new tc(activity, this.d, j11, i10, str2, h0Var, j10).show();
                        return;
                    }
                    h0Var.run();
                    return;
                }
                return;
            default:
                be beVar = (be) this.f5048f;
                MessageObject messageObject = (MessageObject) this.h;
                wn wnVar = (wn) this.f5049n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f5051s;
                if (!beVar.T) {
                    long value = beVar.f4403r.getValue();
                    if ((beVar.R != null || (messageObject != null && wnVar != null)) && beVar.X == null) {
                        int i12 = this.f5046b;
                        if (MessagesController.getInstance(i12).isFrozen()) {
                            org.telegram.ui.b.b(i12);
                            return;
                        }
                        ca y10 = ca.y(i12, false);
                        a0 a0Var = new a0(beVar, value, y10, messageObject, wnVar);
                        if (y10.e && y10.p().amount < value) {
                            boolean z10 = this.f5047c;
                            Context context = this.f5050r;
                            org.telegram.ui.ActionBar.u6 u6Var = this.d;
                            long j12 = this.e;
                            if (z10) {
                                new tc(context, u6Var, value, 17, DialogObject.getShortName(i12, j12), a0Var, j12).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new tc(context, u6Var, value, 5, str, a0Var, j12).show();
                            return;
                        }
                        a0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public lb(fi.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.k3[] k3VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, String str) {
        this.f5048f = dVar;
        this.f5046b = i10;
        this.h = starsSubscription;
        this.f5049n = k3VarArr;
        this.e = j10;
        this.f5050r = activity;
        this.d = u6Var;
        this.f5047c = z10;
        this.f5051s = str;
    }
}
