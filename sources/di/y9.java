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
public final class y9 implements View.OnClickListener {
    public final int f10105a = 1;
    public final int f10106b;
    public final boolean f10107c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final long f10108e;
    public final KeyEvent.Callback f10109f;
    public final Object h;
    public final Object f10110n;
    public final Context f10111r;
    public final Object f10112s;

    public y9(mc mcVar, fj fjVar, bn bnVar, int i7, boolean z10, Context context, org.telegram.ui.ActionBar.h6 h6Var, long j3, TLRPC.Chat chat) {
        this.f10109f = mcVar;
        this.h = fjVar;
        this.f10110n = bnVar;
        this.f10106b = i7;
        this.f10107c = z10;
        this.f10111r = context;
        this.d = h6Var;
        this.f10108e = j3;
        this.f10112s = chat;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        String str;
        switch (this.f10105a) {
            case 0:
                hi.e eVar = (hi.e) this.f10109f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) this.f10110n;
                Activity activity = (Activity) this.f10111r;
                String str2 = (String) this.f10112s;
                if (!eVar.R) {
                    int i10 = this.f10106b;
                    y8 y10 = y8.y(i10, false);
                    long j3 = this.f10108e;
                    bi.e0 e0Var = new bi.e0(eVar, starsSubscription, i10, w2VarArr, j3, 4);
                    if (y10.f10086f.amount < starsSubscription.pricing.amount) {
                        long j10 = starsSubscription.pricing.amount;
                        if (this.f10107c) {
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
                mc mcVar = (mc) this.f10109f;
                fj fjVar = (fj) this.h;
                bn bnVar = (bn) this.f10110n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f10112s;
                if (!mcVar.O1) {
                    long value = mcVar.f9371t1.getValue();
                    if ((mcVar.M1 != null || (fjVar != null && bnVar != null)) && mcVar.S1 == null) {
                        int i11 = this.f10106b;
                        if (mp.u1(i11).A2()) {
                            org.telegram.ui.b.b(i11);
                            return;
                        }
                        y8 y11 = y8.y(i11, false);
                        bi.o2 o2Var = new bi.o2(mcVar, value, y11, fjVar, bnVar, 7);
                        if (y11.f10085e && y11.p().amount < value) {
                            boolean z10 = this.f10107c;
                            Context context = this.f10111r;
                            org.telegram.ui.ActionBar.h6 h6Var = this.d;
                            long j11 = this.f10108e;
                            if (z10) {
                                new fb(context, h6Var, value, 17, org.telegram.messenger.n5.s(i11, j11), o2Var, j11).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new fb(context, h6Var, value, 5, str, o2Var, j11).show();
                            return;
                        }
                        o2Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public y9(hi.e eVar, int i7, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.w2[] w2VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, String str) {
        this.f10109f = eVar;
        this.f10106b = i7;
        this.h = starsSubscription;
        this.f10110n = w2VarArr;
        this.f10108e = j3;
        this.f10111r = activity;
        this.d = h6Var;
        this.f10107c = z10;
        this.f10112s = str;
    }
}
