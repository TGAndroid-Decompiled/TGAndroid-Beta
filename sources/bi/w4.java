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
public final class w4 implements Runnable {
    public final int f4212a = 0;
    public final int f4213b;
    public final boolean f4214c;
    public final long d;
    public final Object f4215e;
    public final Object f4216f;
    public final Object h;
    public final Object f4217n;
    public final Object f4218r;
    public final Object f4219s;
    public final Object f4220w;
    public final Object f4221x;

    public w4(Context context, int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, org.telegram.ui.ActionBar.h6 h6Var, ai.y1 y1Var, lc lcVar, c1.a aVar, di.f2 f2Var) {
        this.f4215e = context;
        this.f4213b = i7;
        this.f4216f = tL_starGiftUnique;
        this.d = j3;
        this.h = tL_textWithEntities;
        this.f4214c = z10;
        this.f4217n = h6Var;
        this.f4218r = y1Var;
        this.f4219s = lcVar;
        this.f4220w = aVar;
        this.f4221x = f2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.w4.run():void");
    }

    public w4(si siVar, tz tzVar, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i7, uz uzVar, a0.h hVar2, a0.h hVar3, boolean z10, long j3) {
        this.f4215e = siVar;
        this.f4216f = tzVar;
        this.h = hVar;
        this.f4217n = atomicInteger;
        this.f4218r = runnable;
        this.f4213b = i7;
        this.f4219s = uzVar;
        this.f4220w = hVar2;
        this.f4221x = hVar3;
        this.f4214c = z10;
        this.d = j3;
    }

    public w4(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z10, String str2, int i7, TLRPC.Chat chat, cx cxVar, TLRPC.User user, long j3, String str3) {
        this.f4215e = launchActivity;
        this.f4216f = str;
        this.h = tL_chatAdminRights;
        this.f4214c = z10;
        this.f4217n = str2;
        this.f4213b = i7;
        this.f4218r = chat;
        this.f4219s = cxVar;
        this.f4220w = user;
        this.d = j3;
        this.f4221x = str3;
    }
}
