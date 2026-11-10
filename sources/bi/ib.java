package bi;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.cn;
public final class ib implements View.OnClickListener {
    public final int f4057a = 1;
    public final int f4058b;
    public final boolean f4059c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final long f4060e;
    public final KeyEvent.Callback f4061f;
    public final Object h;
    public final Object f4062n;
    public final Context f4063r;
    public final Object f4064s;

    public ib(ce ceVar, ij ijVar, cn cnVar, int i7, boolean z9, Context context, org.telegram.ui.ActionBar.h6 h6Var, long j3, TLRPC.Chat chat) {
        this.f4061f = ceVar;
        this.h = ijVar;
        this.f4062n = cnVar;
        this.f4058b = i7;
        this.f4059c = z9;
        this.f4063r = context;
        this.d = h6Var;
        this.f4060e = j3;
        this.f4064s = chat;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        String str;
        switch (this.f4057a) {
            case 0:
                fi.d dVar = (fi.d) this.f4061f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) this.f4062n;
                Activity activity = (Activity) this.f4063r;
                String str2 = (String) this.f4064s;
                if (!dVar.Q) {
                    int i10 = this.f4058b;
                    ea y10 = ea.y(i10, false);
                    long j3 = this.f4060e;
                    d0 d0Var = new d0(dVar, starsSubscription, i10, w2VarArr, j3, 1);
                    if (y10.f3808f.amount < starsSubscription.pricing.amount) {
                        long j10 = starsSubscription.pricing.amount;
                        if (this.f4059c) {
                            i7 = 8;
                        } else if (j3 < 0) {
                            i7 = 2;
                        } else {
                            i7 = 7;
                        }
                        new tc(activity, this.d, j10, i7, str2, d0Var, j3).show();
                        return;
                    }
                    d0Var.run();
                    return;
                }
                return;
            default:
                ce ceVar = (ce) this.f4061f;
                ij ijVar = (ij) this.h;
                cn cnVar = (cn) this.f4062n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f4064s;
                if (!ceVar.N1) {
                    long value = ceVar.f3622s1.getValue();
                    if ((ceVar.L1 != null || (ijVar != null && cnVar != null)) && ceVar.R1 == null) {
                        int i11 = this.f4058b;
                        if (qp.s1(i11).v2()) {
                            org.telegram.ui.b.b(i11);
                            return;
                        }
                        ea y11 = ea.y(i11, false);
                        i0 i0Var = new i0(ceVar, value, y11, ijVar, cnVar);
                        if (y11.f3807e && y11.p().amount < value) {
                            boolean z9 = this.f4059c;
                            Context context = this.f4063r;
                            org.telegram.ui.ActionBar.h6 h6Var = this.d;
                            long j11 = this.f4060e;
                            if (z9) {
                                new tc(context, h6Var, value, 17, org.telegram.messenger.m5.s(i11, j11), i0Var, j11).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new tc(context, h6Var, value, 5, str, i0Var, j11).show();
                            return;
                        }
                        i0Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public ib(fi.d dVar, int i7, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.w2[] w2VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, String str) {
        this.f4061f = dVar;
        this.f4058b = i7;
        this.h = starsSubscription;
        this.f4062n = w2VarArr;
        this.f4060e = j3;
        this.f4063r = activity;
        this.d = h6Var;
        this.f4059c = z9;
        this.f4064s = str;
    }
}
