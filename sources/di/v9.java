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
public final class v9 implements View.OnClickListener {
    public final int f9621a = 1;
    public final int f9622b;
    public final boolean f9623c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final long f9624e;
    public final KeyEvent.Callback f9625f;
    public final Object h;
    public final Object f9626n;
    public final Context f9627r;
    public final Object f9628s;

    public v9(jc jcVar, gj gjVar, an anVar, int i7, boolean z10, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, TLRPC.Chat chat) {
        this.f9625f = jcVar;
        this.h = gjVar;
        this.f9626n = anVar;
        this.f9622b = i7;
        this.f9623c = z10;
        this.f9627r = context;
        this.d = e6Var;
        this.f9624e = j3;
        this.f9628s = chat;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        String str;
        switch (this.f9621a) {
            case 0:
                hi.d dVar = (hi.d) this.f9625f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) this.f9626n;
                Activity activity = (Activity) this.f9627r;
                String str2 = (String) this.f9628s;
                if (!dVar.R) {
                    int i10 = this.f9622b;
                    v8 y10 = v8.y(i10, false);
                    long j3 = this.f9624e;
                    bi.e0 e0Var = new bi.e0(dVar, starsSubscription, i10, u2VarArr, j3, 2);
                    if (y10.f9602f.amount < starsSubscription.pricing.amount) {
                        long j10 = starsSubscription.pricing.amount;
                        if (this.f9623c) {
                            i7 = 8;
                        } else if (j3 < 0) {
                            i7 = 2;
                        } else {
                            i7 = 7;
                        }
                        new cb(activity, this.d, j10, i7, str2, e0Var, j3).show();
                        return;
                    }
                    e0Var.run();
                    return;
                }
                return;
            default:
                jc jcVar = (jc) this.f9625f;
                gj gjVar = (gj) this.h;
                an anVar = (an) this.f9626n;
                TLRPC.Chat chat = (TLRPC.Chat) this.f9628s;
                if (!jcVar.O1) {
                    long value = jcVar.f8880t1.getValue();
                    if ((jcVar.M1 != null || (gjVar != null && anVar != null)) && jcVar.S1 == null) {
                        int i11 = this.f9622b;
                        if (np.s1(i11).v2()) {
                            org.telegram.ui.b.b(i11);
                            return;
                        }
                        v8 y11 = v8.y(i11, false);
                        bi.r1 r1Var = new bi.r1(jcVar, value, y11, gjVar, anVar, 8);
                        if (y11.f9601e && y11.p().amount < value) {
                            boolean z10 = this.f9623c;
                            Context context = this.f9627r;
                            org.telegram.ui.ActionBar.e6 e6Var = this.d;
                            long j11 = this.f9624e;
                            if (z10) {
                                new cb(context, e6Var, value, 17, org.telegram.messenger.m5.s(i11, j11), r1Var, j11).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new cb(context, e6Var, value, 5, str, r1Var, j11).show();
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

    public v9(hi.d dVar, int i7, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.u2[] u2VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str) {
        this.f9625f = dVar;
        this.f9622b = i7;
        this.h = starsSubscription;
        this.f9626n = u2VarArr;
        this.f9624e = j3;
        this.f9627r = activity;
        this.d = e6Var;
        this.f9623c = z10;
        this.f9628s = str;
    }
}
