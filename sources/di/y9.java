package di;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.bn;
public final class y9 implements View.OnClickListener {
    public final int f10071a = 1;
    public final int f10072b;
    public final boolean f10073c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final long f10074e;
    public final KeyEvent.Callback f10075f;
    public final Object h;
    public final Object f10076n;
    public final Context f10077r;
    public final Object f10078s;

    public y9(mc mcVar, gj gjVar, bn bnVar, int i7, boolean z10, Context context, org.telegram.ui.ActionBar.h6 h6Var, long j3, TLRPC.Chat chat) {
        this.f10075f = mcVar;
        this.h = gjVar;
        this.f10076n = bnVar;
        this.f10072b = i7;
        this.f10073c = z10;
        this.f10077r = context;
        this.d = h6Var;
        this.f10074e = j3;
        this.f10078s = chat;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        String str;
        switch (this.f10071a) {
            case 0:
                hi.d dVar = (hi.d) this.f10075f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) this.f10076n;
                Activity activity = (Activity) this.f10077r;
                String str2 = (String) this.f10078s;
                if (!dVar.R) {
                    int i10 = this.f10072b;
                    y8 y10 = y8.y(i10, false);
                    long j3 = this.f10074e;
                    bi.e0 e0Var = new bi.e0(dVar, starsSubscription, i10, w2VarArr, j3, 4);
                    if (y10.f10052f.amount < starsSubscription.pricing.amount) {
                        long j10 = starsSubscription.pricing.amount;
                        if (this.f10073c) {
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
                mc mcVar = (mc) this.f10075f;
                gj gjVar = (gj) this.h;
                bn bnVar = (bn) this.f10076n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f10078s;
                if (!mcVar.O1) {
                    long value = mcVar.f9339t1.getValue();
                    if ((mcVar.M1 != null || (gjVar != null && bnVar != null)) && mcVar.S1 == null) {
                        int i11 = this.f10072b;
                        if (np.u1(i11).A2()) {
                            org.telegram.ui.b.b(i11);
                            return;
                        }
                        y8 y11 = y8.y(i11, false);
                        bi.q2 q2Var = new bi.q2(mcVar, value, y11, gjVar, bnVar, 7);
                        if (y11.f10051e && y11.p().amount < value) {
                            boolean z10 = this.f10073c;
                            Context context = this.f10077r;
                            org.telegram.ui.ActionBar.h6 h6Var = this.d;
                            long j11 = this.f10074e;
                            if (z10) {
                                new fb(context, h6Var, value, 17, org.telegram.messenger.n5.s(i11, j11), q2Var, j11).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new fb(context, h6Var, value, 5, str, q2Var, j11).show();
                            return;
                        }
                        q2Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public y9(hi.d dVar, int i7, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.w2[] w2VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, String str) {
        this.f10075f = dVar;
        this.f10072b = i7;
        this.h = starsSubscription;
        this.f10076n = w2VarArr;
        this.f10074e = j3;
        this.f10077r = activity;
        this.d = h6Var;
        this.f10073c = z10;
        this.f10078s = str;
    }
}
