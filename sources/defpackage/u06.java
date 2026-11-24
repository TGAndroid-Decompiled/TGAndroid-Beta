package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
public final class u06 implements Runnable {
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

    public u06(hs6 hs6Var, qqb qqbVar, vh6 vh6Var, AtomicInteger atomicInteger, Runnable runnable, int i, rqb rqbVar, vh6 vh6Var2, vh6 vh6Var3, boolean z, long j) {
        this.e = hs6Var;
        this.f = qqbVar;
        this.h = vh6Var;
        this.n = atomicInteger;
        this.r = runnable;
        this.b = i;
        this.s = rqbVar;
        this.w = vh6Var2;
        this.x = vh6Var3;
        this.c = z;
        this.d = j;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u06.run():void");
    }

    public u06(Context context, int i, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, ylb ylbVar, ts9 ts9Var, c41 c41Var, e6a e6aVar, e6a e6aVar2) {
        this.e = context;
        this.b = i;
        this.f = tL_starGiftUnique;
        this.d = j;
        this.h = tL_textWithEntities;
        this.c = z;
        this.n = ylbVar;
        this.r = ts9Var;
        this.s = c41Var;
        this.w = e6aVar;
        this.x = e6aVar2;
    }

    public u06(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z, String str2, int i, TLRPC.Chat chat, nk3 nk3Var, TLRPC.User user, long j, String str3) {
        this.e = launchActivity;
        this.f = str;
        this.r = tL_chatAdminRights;
        this.c = z;
        this.h = str2;
        this.b = i;
        this.s = chat;
        this.w = nk3Var;
        this.x = user;
        this.d = j;
        this.n = str3;
    }
}
