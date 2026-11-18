package di;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.bn;
public final class x9 implements View.OnClickListener {
    public final int f10041a = 1;
    public final int f10042b;
    public final boolean f10043c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final long f10044e;
    public final KeyEvent.Callback f10045f;
    public final Object h;
    public final Object f10046n;
    public final Context f10047r;
    public final Object f10048s;

    public x9(mc mcVar, fj fjVar, bn bnVar, int i7, boolean z10, Context context, org.telegram.ui.ActionBar.i6 i6Var, long j3, TLRPC.Chat chat) {
        this.f10045f = mcVar;
        this.h = fjVar;
        this.f10046n = bnVar;
        this.f10042b = i7;
        this.f10043c = z10;
        this.f10047r = context;
        this.d = i6Var;
        this.f10044e = j3;
        this.f10048s = chat;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        String str;
        switch (this.f10041a) {
            case 0:
                hi.d dVar = (hi.d) this.f10045f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) this.f10046n;
                Activity activity = (Activity) this.f10047r;
                String str2 = (String) this.f10048s;
                if (!dVar.R) {
                    int i10 = this.f10042b;
                    x8 y10 = x8.y(i10, false);
                    long j3 = this.f10044e;
                    bi.e0 e0Var = new bi.e0(dVar, starsSubscription, i10, x2VarArr, j3, 4);
                    if (y10.f10022f.amount < starsSubscription.pricing.amount) {
                        long j10 = starsSubscription.pricing.amount;
                        if (this.f10043c) {
                            i7 = 8;
                        } else if (j3 < 0) {
                            i7 = 2;
                        } else {
                            i7 = 7;
                        }
                        new fb(activity, this.d, j10, i7, str2, e0Var, j3).show();
                        return;
                    }
                    e0Var.run();
                    return;
                }
                return;
            default:
                mc mcVar = (mc) this.f10045f;
                fj fjVar = (fj) this.h;
                bn bnVar = (bn) this.f10046n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f10048s;
                if (!mcVar.O1) {
                    long value = mcVar.f9350t1.getValue();
                    if ((mcVar.M1 != null || (fjVar != null && bnVar != null)) && mcVar.S1 == null) {
                        int i11 = this.f10042b;
                        if (mp.u1(i11).A2()) {
                            org.telegram.ui.b.b(i11);
                            return;
                        }
                        x8 y11 = x8.y(i11, false);
                        bi.k2 k2Var = new bi.k2(mcVar, value, y11, fjVar, bnVar, 7);
                        if (y11.f10021e && y11.p().amount < value) {
                            boolean z10 = this.f10043c;
                            Context context = this.f10047r;
                            org.telegram.ui.ActionBar.i6 i6Var = this.d;
                            long j11 = this.f10044e;
                            if (z10) {
                                new fb(context, i6Var, value, 17, org.telegram.messenger.n5.s(i11, j11), k2Var, j11).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new fb(context, i6Var, value, 5, str, k2Var, j11).show();
                            return;
                        }
                        k2Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public x9(hi.d dVar, int i7, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.x2[] x2VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, String str) {
        this.f10045f = dVar;
        this.f10042b = i7;
        this.h = starsSubscription;
        this.f10046n = x2VarArr;
        this.f10044e = j3;
        this.f10047r = activity;
        this.d = i6Var;
        this.f10043c = z10;
        this.f10048s = str;
    }
}
