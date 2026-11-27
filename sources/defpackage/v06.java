package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
public final class v06 implements Runnable {
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

    public v06(ls6 ls6Var, psb psbVar, zh6 zh6Var, AtomicInteger atomicInteger, Runnable runnable, int i, qsb qsbVar, zh6 zh6Var2, zh6 zh6Var3, boolean z, long j) {
        this.e = ls6Var;
        this.f = psbVar;
        this.h = zh6Var;
        this.n = atomicInteger;
        this.r = runnable;
        this.b = i;
        this.s = qsbVar;
        this.w = zh6Var2;
        this.x = zh6Var3;
        this.c = z;
        this.d = j;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v06.run():void");
    }

    public v06(Context context, int i, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, vnb vnbVar, vra vraVar, d31 d31Var, wra wraVar, xra xraVar) {
        this.e = context;
        this.b = i;
        this.f = tL_starGiftUnique;
        this.d = j;
        this.h = tL_textWithEntities;
        this.c = z;
        this.n = vnbVar;
        this.r = vraVar;
        this.s = d31Var;
        this.w = wraVar;
        this.x = xraVar;
    }

    public v06(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z, String str2, int i, TLRPC.Chat chat, uj3 uj3Var, TLRPC.User user, long j, String str3) {
        this.e = launchActivity;
        this.f = str;
        this.r = tL_chatAdminRights;
        this.c = z;
        this.h = str2;
        this.b = i;
        this.s = chat;
        this.w = uj3Var;
        this.x = user;
        this.d = j;
        this.n = str3;
    }
}
