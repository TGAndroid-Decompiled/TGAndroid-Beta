package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class gi implements Runnable {
    public final int f22667a = 0;
    public final boolean f22668b;
    public final int f22669c;
    public final long d;
    public final Object f22670e;
    public final Object f22671f;
    public final Object h;
    public final Object f22672n;
    public final Object f22673r;
    public final Object f22674s;
    public final Object f22675w;
    public final Object f22676x;

    public gi(ui uiVar, zz zzVar, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i7, a00 a00Var, a0.h hVar2, a0.h hVar3, boolean z9, long j3) {
        this.f22670e = uiVar;
        this.f22671f = zzVar;
        this.h = hVar;
        this.f22674s = atomicInteger;
        this.f22675w = runnable;
        this.f22669c = i7;
        this.f22676x = a00Var;
        this.f22672n = hVar2;
        this.f22673r = hVar3;
        this.f22668b = z9;
        this.d = j3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gi.run():void");
    }

    public gi(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z9, String str2, int i7, TLRPC.Chat chat, org.telegram.ui.yw ywVar, TLRPC.User user, long j3, String str3) {
        this.f22670e = launchActivity;
        this.f22671f = str;
        this.h = tL_chatAdminRights;
        this.f22668b = z9;
        this.f22672n = str2;
        this.f22669c = i7;
        this.f22673r = chat;
        this.f22674s = ywVar;
        this.f22675w = user;
        this.d = j3;
        this.f22676x = str3;
    }
}
