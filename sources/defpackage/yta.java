package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class yta implements View.OnClickListener {
    public final byte a = 1;
    public final int b;
    public final boolean c;
    public final wjb d;
    public final long e;
    public final KeyEvent.Callback f;
    public final Object h;
    public final Object n;
    public final Context r;
    public final Object s;

    public yta(u41 u41Var, int i, TL_stars.StarsSubscription starsSubscription, fx0[] fx0VarArr, long j, Activity activity, wjb wjbVar, boolean z, String str) {
        this.f = u41Var;
        this.b = i;
        this.h = starsSubscription;
        this.n = fx0VarArr;
        this.e = j;
        this.r = activity;
        this.d = wjbVar;
        this.c = z;
        this.s = str;
    }

    @Override
    public final void onClick(View view) {
        int i;
        String str;
        byte b = this.a;
        Object obj = this.s;
        boolean z = this.c;
        Object obj2 = this.n;
        Object obj3 = this.h;
        KeyEvent.Callback callback = this.f;
        switch (b) {
            case 0:
                u41 u41Var = (u41) callback;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                fx0[] fx0VarArr = (fx0[]) obj2;
                Activity activity = (Activity) this.r;
                String str2 = (String) obj;
                if (!u41Var.R) {
                    int i2 = this.b;
                    gta v = gta.v(i2, false);
                    long j = this.e;
                    wy wyVar = new wy(u41Var, starsSubscription, i2, fx0VarArr, j, (byte) 12);
                    if (v.f.amount < starsSubscription.pricing.amount) {
                        long j2 = starsSubscription.pricing.amount;
                        if (z) {
                            i = 8;
                        } else if (j < 0) {
                            i = 2;
                        } else {
                            i = 7;
                        }
                        new zua(activity, this.d, j2, i, str2, wyVar, j).show();
                        return;
                    }
                    wyVar.run();
                    return;
                }
                return;
            default:
                bwa bwaVar = (bwa) callback;
                k27 k27Var = (k27) obj3;
                mu1 mu1Var = (mu1) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (!bwaVar.N1) {
                    long value = bwaVar.s1.getValue();
                    if ((bwaVar.L1 != null || (k27Var != null && mu1Var != null)) && bwaVar.R1 == null) {
                        int i3 = this.b;
                        if (na7.q1(i3).t2()) {
                            h5.b(i3);
                            return;
                        }
                        gta v2 = gta.v(i3, false);
                        o77 o77Var = new o77(bwaVar, value, v2, k27Var, mu1Var, (byte) 20);
                        if (v2.e && v2.m().amount < value) {
                            Context context = this.r;
                            wjb wjbVar = this.d;
                            long j3 = this.e;
                            if (z) {
                                new zua(context, wjbVar, value, 17, cf3.r(i3, j3), o77Var, j3).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new zua(context, wjbVar, value, 5, str, o77Var, j3).show();
                            return;
                        }
                        o77Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public yta(bwa bwaVar, k27 k27Var, mu1 mu1Var, int i, boolean z, Context context, wjb wjbVar, long j, TLRPC.Chat chat) {
        this.f = bwaVar;
        this.h = k27Var;
        this.n = mu1Var;
        this.b = i;
        this.c = z;
        this.r = context;
        this.d = wjbVar;
        this.e = j;
        this.s = chat;
    }
}
