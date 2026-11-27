package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class cya implements View.OnClickListener {
    public final byte a = 0;
    public final int b;
    public final boolean c;
    public final vnb d;
    public final long e;
    public final KeyEvent.Callback f;
    public final Object h;
    public final Object n;
    public final Context r;
    public final Object s;

    public cya(c51 c51Var, int i, TL_stars.StarsSubscription starsSubscription, nx0[] nx0VarArr, long j, Activity activity, vnb vnbVar, boolean z, String str) {
        this.f = c51Var;
        this.b = i;
        this.h = starsSubscription;
        this.n = nx0VarArr;
        this.e = j;
        this.r = activity;
        this.d = vnbVar;
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
                c51 c51Var = (c51) callback;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                nx0[] nx0VarArr = (nx0[]) obj2;
                Activity activity = (Activity) this.r;
                String str2 = (String) obj;
                if (!c51Var.R) {
                    int i2 = this.b;
                    jxa v = jxa.v(i2, false);
                    long j = this.e;
                    wy wyVar = new wy(c51Var, starsSubscription, i2, nx0VarArr, j, (byte) 12);
                    if (v.f.amount < starsSubscription.pricing.amount) {
                        long j2 = starsSubscription.pricing.amount;
                        if (z) {
                            i = 8;
                        } else if (j < 0) {
                            i = 2;
                        } else {
                            i = 7;
                        }
                        new dza(activity, this.d, j2, i, str2, wyVar, j).show();
                        return;
                    }
                    wyVar.run();
                    return;
                }
                return;
            default:
                e0b e0bVar = (e0b) callback;
                r47 r47Var = (r47) obj3;
                zu1 zu1Var = (zu1) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (!e0bVar.N1) {
                    long value = e0bVar.s1.getValue();
                    if ((e0bVar.L1 != null || (r47Var != null && zu1Var != null)) && e0bVar.R1 == null) {
                        int i3 = this.b;
                        if (uc7.s1(i3).x2()) {
                            i5.b(i3);
                            return;
                        }
                        jxa v2 = jxa.v(i3, false);
                        da7 da7Var = new da7(e0bVar, value, v2, r47Var, zu1Var, (byte) 21);
                        if (v2.e && v2.m().amount < value) {
                            Context context = this.r;
                            vnb vnbVar = this.d;
                            long j3 = this.e;
                            if (z) {
                                new dza(context, vnbVar, value, 17, wf3.r(i3, j3), da7Var, j3).show();
                                return;
                            }
                            if (chat == null) {
                                str = "";
                            } else {
                                str = chat.title;
                            }
                            new dza(context, vnbVar, value, 5, str, da7Var, j3).show();
                            return;
                        }
                        da7Var.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public cya(e0b e0bVar, r47 r47Var, zu1 zu1Var, int i, boolean z, Context context, vnb vnbVar, long j, TLRPC.Chat chat) {
        this.f = e0bVar;
        this.h = r47Var;
        this.n = zu1Var;
        this.b = i;
        this.c = z;
        this.r = context;
        this.d = vnbVar;
        this.e = j;
        this.s = chat;
    }
}
