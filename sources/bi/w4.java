package bi;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.ri;
import org.telegram.messenger.sz;
import org.telegram.messenger.tz;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;
public final class w4 implements Runnable {
    public final int f4207a = 0;
    public final int f4208b;
    public final boolean f4209c;
    public final long d;
    public final Object f4210e;
    public final Object f4211f;
    public final Object h;
    public final Object f4212n;
    public final Object f4213r;
    public final Object f4214s;
    public final Object f4215w;
    public final Object f4216x;

    public w4(Context context, int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, org.telegram.ui.ActionBar.h6 h6Var, ai.x1 x1Var, lc lcVar, c1.a aVar, di.f2 f2Var) {
        this.f4210e = context;
        this.f4208b = i7;
        this.f4211f = tL_starGiftUnique;
        this.d = j3;
        this.h = tL_textWithEntities;
        this.f4209c = z10;
        this.f4212n = h6Var;
        this.f4213r = x1Var;
        this.f4214s = lcVar;
        this.f4215w = aVar;
        this.f4216x = f2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.w4.run():void");
    }

    public w4(ri riVar, sz szVar, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i7, tz tzVar, a0.h hVar2, a0.h hVar3, boolean z10, long j3) {
        this.f4210e = riVar;
        this.f4211f = szVar;
        this.h = hVar;
        this.f4212n = atomicInteger;
        this.f4213r = runnable;
        this.f4208b = i7;
        this.f4214s = tzVar;
        this.f4215w = hVar2;
        this.f4216x = hVar3;
        this.f4209c = z10;
        this.d = j3;
    }

    public w4(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z10, String str2, int i7, TLRPC.Chat chat, cx cxVar, TLRPC.User user, long j3, String str3) {
        this.f4210e = launchActivity;
        this.f4211f = str;
        this.h = tL_chatAdminRights;
        this.f4209c = z10;
        this.f4212n = str2;
        this.f4208b = i7;
        this.f4213r = chat;
        this.f4214s = cxVar;
        this.f4215w = user;
        this.d = j3;
        this.f4216x = str3;
    }
}
