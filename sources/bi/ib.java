package bi;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.an;
public final class ib implements View.OnClickListener {
    public final int f4060a = 1;
    public final int f4061b;
    public final boolean f4062c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final long f4063e;
    public final KeyEvent.Callback f4064f;
    public final Object h;
    public final Object f4065n;
    public final Context f4066r;
    public final Object f4067s;

    public ib(ce ceVar, ij ijVar, an anVar, int i7, boolean z9, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, TLRPC.Chat chat) {
        this.f4064f = ceVar;
        this.h = ijVar;
        this.f4065n = anVar;
        this.f4061b = i7;
        this.f4062c = z9;
        this.f4066r = context;
        this.d = f6Var;
        this.f4063e = j3;
        this.f4067s = chat;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        String str;
        switch (this.f4060a) {
            case 0:
                fi.d dVar = (fi.d) this.f4064f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) this.f4065n;
                Activity activity = (Activity) this.f4066r;
                String str2 = (String) this.f4067s;
                if (!dVar.Q) {
                    int i10 = this.f4061b;
                    ea y10 = ea.y(i10, false);
                    long j3 = this.f4063e;
                    d0 d0Var = new d0(dVar, starsSubscription, i10, v2VarArr, j3, 1);
                    if (y10.f3811f.amount < starsSubscription.pricing.amount) {
                        long j10 = starsSubscription.pricing.amount;
                        if (this.f4062c) {
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
                ce ceVar = (ce) this.f4064f;
                ij ijVar = (ij) this.h;
                an anVar = (an) this.f4065n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f4067s;
                if (!ceVar.K1) {
                    long value = ceVar.f3619p1.getValue();
                    if ((ceVar.I1 != null || (ijVar != null && anVar != null)) && ceVar.O1 == null) {
                        int i11 = this.f4061b;
                        if (qp.s1(i11).v2()) {
                            org.telegram.ui.b.b(i11);
                            return;
                        }
                        ea y11 = ea.y(i11, false);
                        i0 i0Var = new i0(ceVar, value, y11, ijVar, anVar);
                        if (y11.f3810e && y11.p().amount < value) {
                            boolean z9 = this.f4062c;
                            Context context = this.f4066r;
                            org.telegram.ui.ActionBar.f6 f6Var = this.d;
                            long j11 = this.f4063e;
                            if (z9) {
                                new tc(context, f6Var, value, 17, org.telegram.messenger.m5.s(i11, j11), i0Var, j11).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new tc(context, f6Var, value, 5, str, i0Var, j11).show();
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

    public ib(fi.d dVar, int i7, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.v2[] v2VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, String str) {
        this.f4064f = dVar;
        this.f4061b = i7;
        this.h = starsSubscription;
        this.f4065n = v2VarArr;
        this.f4063e = j3;
        this.f4066r = activity;
        this.d = f6Var;
        this.f4062c = z9;
        this.f4067s = str;
    }
}
