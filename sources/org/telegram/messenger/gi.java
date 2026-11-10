package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class gi implements Runnable {
    public final int f22671a = 0;
    public final boolean f22672b;
    public final int f22673c;
    public final long d;
    public final Object f22674e;
    public final Object f22675f;
    public final Object h;
    public final Object f22676n;
    public final Object f22677r;
    public final Object f22678s;
    public final Object f22679w;
    public final Object f22680x;

    public gi(ui uiVar, zz zzVar, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i7, a00 a00Var, a0.h hVar2, a0.h hVar3, boolean z9, long j3) {
        this.f22674e = uiVar;
        this.f22675f = zzVar;
        this.h = hVar;
        this.f22678s = atomicInteger;
        this.f22679w = runnable;
        this.f22673c = i7;
        this.f22680x = a00Var;
        this.f22676n = hVar2;
        this.f22677r = hVar3;
        this.f22672b = z9;
        this.d = j3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gi.run():void");
    }

    public gi(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z9, String str2, int i7, TLRPC.Chat chat, org.telegram.ui.zw zwVar, TLRPC.User user, long j3, String str3) {
        this.f22674e = launchActivity;
        this.f22675f = str;
        this.h = tL_chatAdminRights;
        this.f22672b = z9;
        this.f22676n = str2;
        this.f22673c = i7;
        this.f22677r = chat;
        this.f22678s = zwVar;
        this.f22679w = user;
        this.d = j3;
        this.f22680x = str3;
    }
}
