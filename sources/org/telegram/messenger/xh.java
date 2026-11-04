package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class xh implements Runnable {
    public final int f26374a = 0;
    public final boolean f26375b;
    public final int f26376c;
    public final long d;
    public final Object f26377e;
    public final Object f26378f;
    public final Object h;
    public final Object f26379n;
    public final Object f26380r;
    public final Object f26381s;
    public final Object f26382w;
    public final Object f26383x;

    public xh(li liVar, rz rzVar, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i3, sz szVar, a0.h hVar2, a0.h hVar3, boolean z10, long j10) {
        this.f26377e = liVar;
        this.f26378f = rzVar;
        this.h = hVar;
        this.f26381s = atomicInteger;
        this.f26382w = runnable;
        this.f26376c = i3;
        this.f26383x = szVar;
        this.f26379n = hVar2;
        this.f26380r = hVar3;
        this.f26375b = z10;
        this.d = j10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xh.run():void");
    }

    public xh(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z10, String str2, int i3, TLRPC.Chat chat, org.telegram.ui.uw uwVar, TLRPC.User user, long j10, String str3) {
        this.f26377e = launchActivity;
        this.f26378f = str;
        this.h = tL_chatAdminRights;
        this.f26375b = z10;
        this.f26379n = str2;
        this.f26376c = i3;
        this.f26380r = chat;
        this.f26381s = uwVar;
        this.f26382w = user;
        this.d = j10;
        this.f26383x = str3;
    }
}
