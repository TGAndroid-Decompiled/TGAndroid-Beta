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
    public final int f10069a = 1;
    public final int f10070b;
    public final boolean f10071c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final long f10072e;
    public final KeyEvent.Callback f10073f;
    public final Object h;
    public final Object f10074n;
    public final Context f10075r;
    public final Object f10076s;

    public y9(mc mcVar, fj fjVar, bn bnVar, int i7, boolean z10, Context context, org.telegram.ui.ActionBar.i6 i6Var, long j3, TLRPC.Chat chat) {
        this.f10073f = mcVar;
        this.h = fjVar;
        this.f10074n = bnVar;
        this.f10070b = i7;
        this.f10071c = z10;
        this.f10075r = context;
        this.d = i6Var;
        this.f10072e = j3;
        this.f10076s = chat;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        String str;
        switch (this.f10069a) {
            case 0:
                hi.e eVar = (hi.e) this.f10073f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) this.f10074n;
                Activity activity = (Activity) this.f10075r;
                String str2 = (String) this.f10076s;
                if (!eVar.R) {
                    int i10 = this.f10070b;
                    y8 y10 = y8.y(i10, false);
                    long j3 = this.f10072e;
                    bi.e0 e0Var = new bi.e0(eVar, starsSubscription, i10, w2VarArr, j3, 4);
                    if (y10.f10050f.amount < starsSubscription.pricing.amount) {
                        long j10 = starsSubscription.pricing.amount;
                        if (this.f10071c) {
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
                mc mcVar = (mc) this.f10073f;
                fj fjVar = (fj) this.h;
                bn bnVar = (bn) this.f10074n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f10076s;
                if (!mcVar.O1) {
                    long value = mcVar.f9335t1.getValue();
                    if ((mcVar.M1 != null || (fjVar != null && bnVar != null)) && mcVar.S1 == null) {
                        int i11 = this.f10070b;
                        if (mp.u1(i11).A2()) {
                            org.telegram.ui.b.b(i11);
                            return;
                        }
                        y8 y11 = y8.y(i11, false);
                        bi.q2 q2Var = new bi.q2(mcVar, value, y11, fjVar, bnVar, 7);
                        if (y11.f10049e && y11.p().amount < value) {
                            boolean z10 = this.f10071c;
                            Context context = this.f10075r;
                            org.telegram.ui.ActionBar.i6 i6Var = this.d;
                            long j11 = this.f10072e;
                            if (z10) {
                                new fb(context, i6Var, value, 17, org.telegram.messenger.n5.s(i11, j11), q2Var, j11).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new fb(context, i6Var, value, 5, str, q2Var, j11).show();
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

    public y9(hi.e eVar, int i7, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.w2[] w2VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, String str) {
        this.f10073f = eVar;
        this.f10070b = i7;
        this.h = starsSubscription;
        this.f10074n = w2VarArr;
        this.f10072e = j3;
        this.f10075r = activity;
        this.d = i6Var;
        this.f10071c = z10;
        this.f10076s = str;
    }
}
