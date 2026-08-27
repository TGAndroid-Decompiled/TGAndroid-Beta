package hh;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.rn;

public final class t8 implements View.OnClickListener {

    public final int f10101a = 1;

    public final int f10102b;

    public final boolean f10103c;
    public final org.telegram.ui.ActionBar.c6 d;

    public final long f10104e;

    public final KeyEvent.Callback f10105f;
    public final Object h;

    public final Object f10106n;

    public final Context f10107r;

    public final Object f10108s;

    public t8(jb jbVar, MessageObject messageObject, rn rnVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, TLRPC.Chat chat) {
        this.f10105f = jbVar;
        this.h = messageObject;
        this.f10106n = rnVar;
        this.f10102b = i10;
        this.f10103c = z10;
        this.f10107r = context;
        this.d = c6Var;
        this.f10104e = j10;
        this.f10108s = chat;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f10101a) {
            case 0:
                lh.d dVar = (lh.d) this.f10105f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.f10106n;
                Activity activity = (Activity) this.f10107r;
                String str = (String) this.f10108s;
                if (!dVar.J) {
                    int i10 = this.f10102b;
                    u7 u7VarY = u7.y(i10, false);
                    long j10 = this.f10104e;
                    gh.a0 a0Var = new gh.a0(dVar, starsSubscription, i10, e3VarArr, j10, 2);
                    if (u7VarY.f10155f.amount >= starsSubscription.pricing.amount) {
                        a0Var.run();
                    } else {
                        new ea(activity, this.d, starsSubscription.pricing.amount, this.f10103c ? 8 : j10 < 0 ? 2 : 7, str, a0Var, j10).show();
                    }
                    break;
                }
                break;
            default:
                jb jbVar = (jb) this.f10105f;
                MessageObject messageObject = (MessageObject) this.h;
                rn rnVar = (rn) this.f10106n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f10108s;
                if (!jbVar.N) {
                    long value = jbVar.f9561r.getValue();
                    if ((jbVar.L != null || (messageObject != null && rnVar != null)) && jbVar.R == null) {
                        int i11 = this.f10102b;
                        if (!MessagesController.getInstance(i11).isFrozen()) {
                            u7 u7VarY2 = u7.y(i11, false);
                            gh.k1 k1Var = new gh.k1(jbVar, value, u7VarY2, messageObject, rnVar, 7);
                            if (u7VarY2.f10154e && u7VarY2.p().amount < value) {
                                boolean z10 = this.f10103c;
                                Context context = this.f10107r;
                                org.telegram.ui.ActionBar.c6 c6Var = this.d;
                                long j11 = this.f10104e;
                                if (!z10) {
                                    new ea(context, c6Var, value, 5, chat == null ? "" : chat.title, k1Var, j11).show();
                                } else {
                                    new ea(context, c6Var, value, 17, DialogObject.getShortName(i11, j11), k1Var, j11).show();
                                }
                            } else {
                                k1Var.run();
                            }
                        } else {
                            org.telegram.ui.b.b(i11);
                        }
                    }
                    break;
                }
                break;
        }
    }

    public t8(lh.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.e3[] e3VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, String str) {
        this.f10105f = dVar;
        this.f10102b = i10;
        this.h = starsSubscription;
        this.f10106n = e3VarArr;
        this.f10104e = j10;
        this.f10107r = activity;
        this.d = c6Var;
        this.f10103c = z10;
        this.f10108s = str;
    }
}
