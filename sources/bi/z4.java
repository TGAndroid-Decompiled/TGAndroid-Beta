package bi;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.si;
import org.telegram.messenger.tz;
import org.telegram.messenger.uz;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;
public final class z4 implements Runnable {
    public final int f4290a = 0;
    public final int f4291b;
    public final boolean f4292c;
    public final long d;
    public final Object f4293e;
    public final Object f4294f;
    public final Object h;
    public final Object f4295n;
    public final Object f4296r;
    public final Object f4297s;
    public final Object f4298w;
    public final Object f4299x;

    public z4(Context context, int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, org.telegram.ui.ActionBar.h6 h6Var, ai.r1 r1Var, lc lcVar, c1.c cVar, c1.c cVar2) {
        this.f4293e = context;
        this.f4291b = i7;
        this.f4294f = tL_starGiftUnique;
        this.d = j3;
        this.h = tL_textWithEntities;
        this.f4292c = z10;
        this.f4295n = h6Var;
        this.f4296r = r1Var;
        this.f4297s = lcVar;
        this.f4298w = cVar;
        this.f4299x = cVar2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.z4.run():void");
    }

    public z4(si siVar, tz tzVar, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i7, uz uzVar, a0.h hVar2, a0.h hVar3, boolean z10, long j3) {
        this.f4293e = siVar;
        this.f4294f = tzVar;
        this.h = hVar;
        this.f4295n = atomicInteger;
        this.f4296r = runnable;
        this.f4291b = i7;
        this.f4297s = uzVar;
        this.f4298w = hVar2;
        this.f4299x = hVar3;
        this.f4292c = z10;
        this.d = j3;
    }

    public z4(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z10, String str2, int i7, TLRPC.Chat chat, cx cxVar, TLRPC.User user, long j3, String str3) {
        this.f4293e = launchActivity;
        this.f4294f = str;
        this.h = tL_chatAdminRights;
        this.f4292c = z10;
        this.f4295n = str2;
        this.f4291b = i7;
        this.f4296r = chat;
        this.f4297s = cxVar;
        this.f4298w = user;
        this.d = j3;
        this.f4299x = str3;
    }
}
