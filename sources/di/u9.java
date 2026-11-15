package di;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.an;
public final class u9 implements View.OnClickListener {
    public final int f9552a = 1;
    public final int f9553b;
    public final boolean f9554c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final long f9555e;
    public final KeyEvent.Callback f9556f;
    public final Object h;
    public final Object f9557n;
    public final Context f9558r;
    public final Object f9559s;

    public u9(ic icVar, gj gjVar, an anVar, int i7, boolean z10, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, TLRPC.Chat chat) {
        this.f9556f = icVar;
        this.h = gjVar;
        this.f9557n = anVar;
        this.f9553b = i7;
        this.f9554c = z10;
        this.f9558r = context;
        this.d = e6Var;
        this.f9555e = j3;
        this.f9559s = chat;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        String str;
        switch (this.f9552a) {
            case 0:
                hi.d dVar = (hi.d) this.f9556f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) this.f9557n;
                Activity activity = (Activity) this.f9558r;
                String str2 = (String) this.f9559s;
                if (!dVar.R) {
                    int i10 = this.f9553b;
                    u8 y10 = u8.y(i10, false);
                    long j3 = this.f9555e;
                    bi.e0 e0Var = new bi.e0(dVar, starsSubscription, i10, u2VarArr, j3, 2);
                    if (y10.f9533f.amount < starsSubscription.pricing.amount) {
                        long j10 = starsSubscription.pricing.amount;
                        if (this.f9554c) {
                            i7 = 8;
                        } else if (j3 < 0) {
                            i7 = 2;
                        } else {
                            i7 = 7;
                        }
                        new bb(activity, this.d, j10, i7, str2, e0Var, j3).show();
                        return;
                    }
                    e0Var.run();
                    return;
                }
                return;
            default:
                ic icVar = (ic) this.f9556f;
                gj gjVar = (gj) this.h;
                an anVar = (an) this.f9557n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f9559s;
                if (!icVar.O1) {
                    long value = icVar.f8827t1.getValue();
                    if ((icVar.M1 != null || (gjVar != null && anVar != null)) && icVar.S1 == null) {
                        int i11 = this.f9553b;
                        if (np.s1(i11).v2()) {
                            org.telegram.ui.b.b(i11);
                            return;
                        }
                        u8 y11 = u8.y(i11, false);
                        bi.r1 r1Var = new bi.r1(icVar, value, y11, gjVar, anVar, 8);
                        if (y11.f9532e && y11.p().amount < value) {
                            boolean z10 = this.f9554c;
                            Context context = this.f9558r;
                            org.telegram.ui.ActionBar.e6 e6Var = this.d;
                            long j11 = this.f9555e;
                            if (z10) {
                                new bb(context, e6Var, value, 17, org.telegram.messenger.m5.s(i11, j11), r1Var, j11).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new bb(context, e6Var, value, 5, str, r1Var, j11).show();
                            return;
                        }
                        r1Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public u9(hi.d dVar, int i7, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.u2[] u2VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str) {
        this.f9556f = dVar;
        this.f9553b = i7;
        this.h = starsSubscription;
        this.f9557n = u2VarArr;
        this.f9555e = j3;
        this.f9558r = activity;
        this.d = e6Var;
        this.f9554c = z10;
        this.f9559s = str;
    }
}
