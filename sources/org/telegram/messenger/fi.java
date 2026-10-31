package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class fi implements Runnable {
    public final int f15568a = 0;
    public final boolean f15569b;
    public final int f15570c;
    public final long d;
    public final Object e;
    public final Object f15571f;
    public final Object h;
    public final Object f15572n;
    public final Object f15573r;
    public final Object f15574s;
    public final Object f15575w;
    public final Object f15576x;

    public fi(ui uiVar, k00 k00Var, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i10, l00 l00Var, a0.h hVar2, a0.h hVar3, boolean z10, long j10) {
        this.e = uiVar;
        this.f15571f = k00Var;
        this.h = hVar;
        this.f15574s = atomicInteger;
        this.f15575w = runnable;
        this.f15570c = i10;
        this.f15576x = l00Var;
        this.f15572n = hVar2;
        this.f15573r = hVar3;
        this.f15569b = z10;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fi.run():void");
    }

    public fi(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z10, String str2, int i10, TLRPC.Chat chat, org.telegram.ui.ay ayVar, TLRPC.User user, long j10, String str3) {
        this.e = launchActivity;
        this.f15571f = str;
        this.h = tL_chatAdminRights;
        this.f15569b = z10;
        this.f15572n = str2;
        this.f15570c = i10;
        this.f15573r = chat;
        this.f15574s = ayVar;
        this.f15575w = user;
        this.d = j10;
        this.f15576x = str3;
    }
}
