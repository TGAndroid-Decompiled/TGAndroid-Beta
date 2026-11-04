package ci;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.wm;
public final class fa implements View.OnClickListener {
    public final int f5130a = 1;
    public final int f5131b;
    public final boolean f5132c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final long f5133e;
    public final KeyEvent.Callback f5134f;
    public final Object h;
    public final Object f5135n;
    public final Context f5136r;
    public final Object f5137s;

    public fa(tc tcVar, zi ziVar, wm wmVar, int i3, boolean z10, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, TLRPC.Chat chat) {
        this.f5134f = tcVar;
        this.h = ziVar;
        this.f5135n = wmVar;
        this.f5131b = i3;
        this.f5132c = z10;
        this.f5136r = context;
        this.d = e6Var;
        this.f5133e = j10;
        this.f5137s = chat;
    }

    @Override
    public final void onClick(View view) {
        int i3;
        String str;
        switch (this.f5130a) {
            case 0:
                gi.d dVar = (gi.d) this.f5134f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) this.f5135n;
                Activity activity = (Activity) this.f5136r;
                String str2 = (String) this.f5137s;
                if (!dVar.R) {
                    int i10 = this.f5131b;
                    e9 y9 = e9.y(i10, false);
                    long j10 = this.f5133e;
                    ai.k0 k0Var = new ai.k0(dVar, starsSubscription, i10, t2VarArr, j10, 2);
                    if (y9.f5033f.amount < starsSubscription.pricing.amount) {
                        long j11 = starsSubscription.pricing.amount;
                        if (this.f5132c) {
                            i3 = 8;
                        } else if (j10 < 0) {
                            i3 = 2;
                        } else {
                            i3 = 7;
                        }
                        new mb(activity, this.d, j11, i3, str2, k0Var, j10).show();
                        return;
                    }
                    k0Var.run();
                    return;
                }
                return;
            default:
                tc tcVar = (tc) this.f5134f;
                zi ziVar = (zi) this.h;
                wm wmVar = (wm) this.f5135n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f5137s;
                if (!tcVar.L1) {
                    long value = tcVar.f6059q1.getValue();
                    if ((tcVar.J1 != null || (ziVar != null && wmVar != null)) && tcVar.P1 == null) {
                        int i11 = this.f5131b;
                        if (hp.s1(i11).v2()) {
                            org.telegram.ui.b.b(i11);
                            return;
                        }
                        e9 y10 = e9.y(i11, false);
                        ai.z1 z1Var = new ai.z1(tcVar, value, y10, ziVar, wmVar, 8);
                        if (y10.f5032e && y10.p().amount < value) {
                            boolean z10 = this.f5132c;
                            Context context = this.f5136r;
                            org.telegram.ui.ActionBar.e6 e6Var = this.d;
                            long j12 = this.f5133e;
                            if (z10) {
                                new mb(context, e6Var, value, 17, org.telegram.messenger.m5.s(i11, j12), z1Var, j12).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new mb(context, e6Var, value, 5, str, z1Var, j12).show();
                            return;
                        }
                        z1Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public fa(gi.d dVar, int i3, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.t2[] t2VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str) {
        this.f5134f = dVar;
        this.f5131b = i3;
        this.h = starsSubscription;
        this.f5135n = t2VarArr;
        this.f5133e = j10;
        this.f5136r = activity;
        this.d = e6Var;
        this.f5132c = z10;
        this.f5137s = str;
    }
}
