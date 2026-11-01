package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class gi implements Runnable {
    public final int f15909a = 0;
    public final boolean f15910b;
    public final int f15911c;
    public final long d;
    public final Object e;
    public final Object f15912f;
    public final Object h;
    public final Object f15913n;
    public final Object f15914r;
    public final Object f15915s;
    public final Object f15916w;
    public final Object f15917x;

    public gi(vi viVar, l00 l00Var, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i10, m00 m00Var, a0.h hVar2, a0.h hVar3, boolean z10, long j10) {
        this.e = viVar;
        this.f15912f = l00Var;
        this.h = hVar;
        this.f15915s = atomicInteger;
        this.f15916w = runnable;
        this.f15911c = i10;
        this.f15917x = m00Var;
        this.f15913n = hVar2;
        this.f15914r = hVar3;
        this.f15910b = z10;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gi.run():void");
    }

    public gi(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z10, String str2, int i10, TLRPC.Chat chat, org.telegram.ui.zx zxVar, TLRPC.User user, long j10, String str3) {
        this.e = launchActivity;
        this.f15912f = str;
        this.h = tL_chatAdminRights;
        this.f15910b = z10;
        this.f15913n = str2;
        this.f15911c = i10;
        this.f15914r = chat;
        this.f15915s = zxVar;
        this.f15916w = user;
        this.d = j10;
        this.f15917x = str3;
    }
}
