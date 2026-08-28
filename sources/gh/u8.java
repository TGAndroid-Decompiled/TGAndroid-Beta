package gh;

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
public final class u8 implements View.OnClickListener {
    public final int f8978a = 1;
    public final int f8979b;
    public final boolean f8980c;
    public final org.telegram.ui.ActionBar.b6 d;
    public final long f8981e;
    public final KeyEvent.Callback f8982f;
    public final Object h;
    public final Object f8983n;
    public final Context f8984r;
    public final Object f8985s;

    public u8(jb jbVar, MessageObject messageObject, qn qnVar, int i9, boolean z10, Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10, TLRPC.Chat chat) {
        this.f8982f = jbVar;
        this.h = messageObject;
        this.f8983n = qnVar;
        this.f8979b = i9;
        this.f8980c = z10;
        this.f8984r = context;
        this.d = b6Var;
        this.f8981e = j10;
        this.f8985s = chat;
    }

    @Override
    public final void onClick(View view) {
        int i9;
        String str;
        switch (this.f8978a) {
            case 0:
                kh.d dVar = (kh.d) this.f8982f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.f8983n;
                Activity activity = (Activity) this.f8984r;
                String str2 = (String) this.f8985s;
                if (!dVar.J) {
                    int i10 = this.f8979b;
                    v7 y10 = v7.y(i10, false);
                    long j10 = this.f8981e;
                    fh.c0 c0Var = new fh.c0(dVar, starsSubscription, i10, f3VarArr, j10, 2);
                    if (y10.f9049f.amount < starsSubscription.pricing.amount) {
                        long j11 = starsSubscription.pricing.amount;
                        if (this.f8980c) {
                            i9 = 8;
                        } else if (j10 < 0) {
                            i9 = 2;
                        } else {
                            i9 = 7;
                        }
                        new ea(activity, this.d, j11, i9, str2, c0Var, j10).show();
                        return;
                    }
                    c0Var.run();
                    return;
                }
                return;
            default:
                jb jbVar = (jb) this.f8982f;
                MessageObject messageObject = (MessageObject) this.h;
                qn qnVar = (qn) this.f8983n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f8985s;
                if (!jbVar.N) {
                    long value = jbVar.f8373r.getValue();
                    if ((jbVar.L != null || (messageObject != null && qnVar != null)) && jbVar.R == null) {
                        int i11 = this.f8979b;
                        if (MessagesController.getInstance(i11).isFrozen()) {
                            org.telegram.ui.b.b(i11);
                            return;
                        }
                        v7 y11 = v7.y(i11, false);
                        fh.m1 m1Var = new fh.m1(jbVar, value, y11, messageObject, qnVar, 7);
                        if (y11.f9048e && y11.p().amount < value) {
                            boolean z10 = this.f8980c;
                            Context context = this.f8984r;
                            org.telegram.ui.ActionBar.b6 b6Var = this.d;
                            long j12 = this.f8981e;
                            if (z10) {
                                new ea(context, b6Var, value, 17, DialogObject.getShortName(i11, j12), m1Var, j12).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new ea(context, b6Var, value, 5, str, m1Var, j12).show();
                            return;
                        }
                        m1Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public u8(kh.d dVar, int i9, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.f3[] f3VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, String str) {
        this.f8982f = dVar;
        this.f8979b = i9;
        this.h = starsSubscription;
        this.f8983n = f3VarArr;
        this.f8981e = j10;
        this.f8984r = activity;
        this.d = b6Var;
        this.f8980c = z10;
        this.f8985s = str;
    }
}
