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
public final class t4 implements Runnable {
    public final int f4080a = 0;
    public final int f4081b;
    public final boolean f4082c;
    public final long d;
    public final Object f4083e;
    public final Object f4084f;
    public final Object h;
    public final Object f4085n;
    public final Object f4086r;
    public final Object f4087s;
    public final Object f4088w;
    public final Object f4089x;

    public t4(Context context, int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, org.telegram.ui.ActionBar.i6 i6Var, ai.v1 v1Var, lc lcVar, c1.c cVar, c1.c cVar2) {
        this.f4083e = context;
        this.f4081b = i7;
        this.f4084f = tL_starGiftUnique;
        this.d = j3;
        this.h = tL_textWithEntities;
        this.f4082c = z10;
        this.f4085n = i6Var;
        this.f4086r = v1Var;
        this.f4087s = lcVar;
        this.f4088w = cVar;
        this.f4089x = cVar2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.t4.run():void");
    }

    public t4(ri riVar, sz szVar, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i7, tz tzVar, a0.h hVar2, a0.h hVar3, boolean z10, long j3) {
        this.f4083e = riVar;
        this.f4084f = szVar;
        this.h = hVar;
        this.f4085n = atomicInteger;
        this.f4086r = runnable;
        this.f4081b = i7;
        this.f4087s = tzVar;
        this.f4088w = hVar2;
        this.f4089x = hVar3;
        this.f4082c = z10;
        this.d = j3;
    }

    public t4(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z10, String str2, int i7, TLRPC.Chat chat, cx cxVar, TLRPC.User user, long j3, String str3) {
        this.f4083e = launchActivity;
        this.f4084f = str;
        this.h = tL_chatAdminRights;
        this.f4082c = z10;
        this.f4085n = str2;
        this.f4081b = i7;
        this.f4086r = chat;
        this.f4087s = cxVar;
        this.f4088w = user;
        this.d = j3;
        this.f4089x = str3;
    }
}
