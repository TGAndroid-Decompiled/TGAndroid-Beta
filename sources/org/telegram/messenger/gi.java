package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class gi implements Runnable {
    public final int f22640a = 0;
    public final boolean f22641b;
    public final int f22642c;
    public final long d;
    public final Object f22643e;
    public final Object f22644f;
    public final Object h;
    public final Object f22645n;
    public final Object f22646r;
    public final Object f22647s;
    public final Object f22648w;
    public final Object f22649x;

    public gi(ui uiVar, zz zzVar, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i7, a00 a00Var, a0.h hVar2, a0.h hVar3, boolean z9, long j3) {
        this.f22643e = uiVar;
        this.f22644f = zzVar;
        this.h = hVar;
        this.f22647s = atomicInteger;
        this.f22648w = runnable;
        this.f22642c = i7;
        this.f22649x = a00Var;
        this.f22645n = hVar2;
        this.f22646r = hVar3;
        this.f22641b = z9;
        this.d = j3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gi.run():void");
    }

    public gi(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z9, String str2, int i7, TLRPC.Chat chat, org.telegram.ui.ww wwVar, TLRPC.User user, long j3, String str3) {
        this.f22643e = launchActivity;
        this.f22644f = str;
        this.h = tL_chatAdminRights;
        this.f22641b = z9;
        this.f22645n = str2;
        this.f22642c = i7;
        this.f22646r = chat;
        this.f22647s = wwVar;
        this.f22648w = user;
        this.d = j3;
        this.f22649x = str3;
    }
}
