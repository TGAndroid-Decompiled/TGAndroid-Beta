package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class cwa implements View.OnClickListener {
    public final byte a = 0;
    public final int b;
    public final boolean c;
    public final ylb d;
    public final long e;
    public final KeyEvent.Callback f;
    public final Object h;
    public final Object n;
    public final Context r;
    public final Object s;

    public cwa(b61 b61Var, int i, TL_stars.StarsSubscription starsSubscription, my0[] my0VarArr, long j, Activity activity, ylb ylbVar, boolean z, String str) {
        this.f = b61Var;
        this.b = i;
        this.h = starsSubscription;
        this.n = my0VarArr;
        this.e = j;
        this.r = activity;
        this.d = ylbVar;
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
                b61 b61Var = (b61) callback;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                my0[] my0VarArr = (my0[]) obj2;
                Activity activity = (Activity) this.r;
                String str2 = (String) obj;
                if (!b61Var.R) {
                    int i2 = this.b;
                    jva v = jva.v(i2, false);
                    long j = this.e;
                    wz wzVar = new wz(b61Var, starsSubscription, i2, my0VarArr, j, (byte) 12);
                    if (v.f.amount < starsSubscription.pricing.amount) {
                        long j2 = starsSubscription.pricing.amount;
                        if (z) {
                            i = 8;
                        } else if (j < 0) {
                            i = 2;
                        } else {
                            i = 7;
                        }
                        new dxa(activity, this.d, j2, i, str2, wzVar, j).show();
                        return;
                    }
                    wzVar.run();
                    return;
                }
                return;
            default:
                eya eyaVar = (eya) callback;
                k47 k47Var = (k47) obj3;
                yv1 yv1Var = (yv1) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (!eyaVar.N1) {
                    long value = eyaVar.s1.getValue();
                    if ((eyaVar.L1 != null || (k47Var != null && yv1Var != null)) && eyaVar.R1 == null) {
                        int i3 = this.b;
                        if (oc7.r1(i3).u2()) {
                            h5.b(i3);
                            return;
                        }
                        jva v2 = jva.v(i3, false);
                        r97 r97Var = new r97(eyaVar, value, v2, k47Var, yv1Var, (byte) 20);
                        if (v2.e && v2.m().amount < value) {
                            Context context = this.r;
                            ylb ylbVar = this.d;
                            long j3 = this.e;
                            if (z) {
                                new dxa(context, ylbVar, value, 17, pg3.r(i3, j3), r97Var, j3).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new dxa(context, ylbVar, value, 5, str, r97Var, j3).show();
                            return;
                        }
                        r97Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public cwa(eya eyaVar, k47 k47Var, yv1 yv1Var, int i, boolean z, Context context, ylb ylbVar, long j, TLRPC.Chat chat) {
        this.f = eyaVar;
        this.h = k47Var;
        this.n = yv1Var;
        this.b = i;
        this.c = z;
        this.r = context;
        this.d = ylbVar;
        this.e = j;
        this.s = chat;
    }
}
