package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class ei implements Runnable {
    public final int f23297a = 0;
    public final boolean f23298b;
    public final int f23299c;
    public final long d;
    public final Object f23300e;
    public final Object f23301f;
    public final Object h;
    public final Object f23302n;
    public final Object f23303r;
    public final Object f23304s;
    public final Object f23305w;
    public final Object f23306x;

    public ei(si siVar, wz wzVar, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i7, xz xzVar, a0.h hVar2, a0.h hVar3, boolean z10, long j3) {
        this.f23300e = siVar;
        this.f23301f = wzVar;
        this.h = hVar;
        this.f23304s = atomicInteger;
        this.f23305w = runnable;
        this.f23299c = i7;
        this.f23306x = xzVar;
        this.f23302n = hVar2;
        this.f23303r = hVar3;
        this.f23298b = z10;
        this.d = j3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ei.run():void");
    }

    public ei(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z10, String str2, int i7, TLRPC.Chat chat, org.telegram.ui.yw ywVar, TLRPC.User user, long j3, String str3) {
        this.f23300e = launchActivity;
        this.f23301f = str;
        this.h = tL_chatAdminRights;
        this.f23298b = z10;
        this.f23302n = str2;
        this.f23299c = i7;
        this.f23303r = chat;
        this.f23304s = ywVar;
        this.f23305w = user;
        this.d = j3;
        this.f23306x = str3;
    }
}
