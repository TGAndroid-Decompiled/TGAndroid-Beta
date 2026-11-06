package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class gi implements Runnable {
    public final int f22647a = 0;
    public final boolean f22648b;
    public final int f22649c;
    public final long d;
    public final Object f22650e;
    public final Object f22651f;
    public final Object h;
    public final Object f22652n;
    public final Object f22653r;
    public final Object f22654s;
    public final Object f22655w;
    public final Object f22656x;

    public gi(ui uiVar, zz zzVar, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i7, a00 a00Var, a0.h hVar2, a0.h hVar3, boolean z9, long j3) {
        this.f22650e = uiVar;
        this.f22651f = zzVar;
        this.h = hVar;
        this.f22654s = atomicInteger;
        this.f22655w = runnable;
        this.f22649c = i7;
        this.f22656x = a00Var;
        this.f22652n = hVar2;
        this.f22653r = hVar3;
        this.f22648b = z9;
        this.d = j3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gi.run():void");
    }

    public gi(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z9, String str2, int i7, TLRPC.Chat chat, org.telegram.ui.ww wwVar, TLRPC.User user, long j3, String str3) {
        this.f22650e = launchActivity;
        this.f22651f = str;
        this.h = tL_chatAdminRights;
        this.f22648b = z9;
        this.f22652n = str2;
        this.f22649c = i7;
        this.f22653r = chat;
        this.f22654s = wwVar;
        this.f22655w = user;
        this.d = j3;
        this.f22656x = str3;
    }
}
