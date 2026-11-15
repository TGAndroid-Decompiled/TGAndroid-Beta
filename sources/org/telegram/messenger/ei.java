package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class ei implements Runnable {
    public final int f23304a = 0;
    public final boolean f23305b;
    public final int f23306c;
    public final long d;
    public final Object f23307e;
    public final Object f23308f;
    public final Object h;
    public final Object f23309n;
    public final Object f23310r;
    public final Object f23311s;
    public final Object f23312w;
    public final Object f23313x;

    public ei(si siVar, wz wzVar, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i7, xz xzVar, a0.h hVar2, a0.h hVar3, boolean z10, long j3) {
        this.f23307e = siVar;
        this.f23308f = wzVar;
        this.h = hVar;
        this.f23311s = atomicInteger;
        this.f23312w = runnable;
        this.f23306c = i7;
        this.f23313x = xzVar;
        this.f23309n = hVar2;
        this.f23310r = hVar3;
        this.f23305b = z10;
        this.d = j3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ei.run():void");
    }

    public ei(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z10, String str2, int i7, TLRPC.Chat chat, org.telegram.ui.yw ywVar, TLRPC.User user, long j3, String str3) {
        this.f23307e = launchActivity;
        this.f23308f = str;
        this.h = tL_chatAdminRights;
        this.f23305b = z10;
        this.f23309n = str2;
        this.f23306c = i7;
        this.f23310r = chat;
        this.f23311s = ywVar;
        this.f23312w = user;
        this.d = j3;
        this.f23313x = str3;
    }
}
