package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
public final class uy5 implements Runnable {
    public final byte a = 2;
    public final int b;
    public final boolean c;
    public final long d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;
    public final Object s;
    public final Object w;
    public final Object x;

    public uy5(hq6 hq6Var, pob pobVar, vf6 vf6Var, AtomicInteger atomicInteger, Runnable runnable, int i, qob qobVar, vf6 vf6Var2, vf6 vf6Var3, boolean z, long j) {
        this.e = hq6Var;
        this.f = pobVar;
        this.h = vf6Var;
        this.n = atomicInteger;
        this.r = runnable;
        this.b = i;
        this.s = qobVar;
        this.w = vf6Var2;
        this.x = vf6Var3;
        this.c = z;
        this.d = j;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy5.run():void");
    }

    public uy5(Context context, int i, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, wjb wjbVar, nu9 nu9Var, u21 u21Var, t7a t7aVar, t7a t7aVar2) {
        this.e = context;
        this.b = i;
        this.f = tL_starGiftUnique;
        this.d = j;
        this.h = tL_textWithEntities;
        this.c = z;
        this.n = wjbVar;
        this.r = nu9Var;
        this.s = u21Var;
        this.w = t7aVar;
        this.x = t7aVar2;
    }

    public uy5(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z, String str2, int i, TLRPC.Chat chat, cj3 cj3Var, TLRPC.User user, long j, String str3) {
        this.e = launchActivity;
        this.f = str;
        this.r = tL_chatAdminRights;
        this.c = z;
        this.h = str2;
        this.b = i;
        this.s = chat;
        this.w = cj3Var;
        this.x = user;
        this.d = j;
        this.n = str3;
    }
}
