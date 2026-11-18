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
public final class s4 implements Runnable {
    public final int f4023a = 0;
    public final int f4024b;
    public final boolean f4025c;
    public final long d;
    public final Object f4026e;
    public final Object f4027f;
    public final Object h;
    public final Object f4028n;
    public final Object f4029r;
    public final Object f4030s;
    public final Object f4031w;
    public final Object f4032x;

    public s4(Context context, int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, org.telegram.ui.ActionBar.i6 i6Var, ai.v1 v1Var, lc lcVar, c1.c cVar, c1.c cVar2) {
        this.f4026e = context;
        this.f4024b = i7;
        this.f4027f = tL_starGiftUnique;
        this.d = j3;
        this.h = tL_textWithEntities;
        this.f4025c = z10;
        this.f4028n = i6Var;
        this.f4029r = v1Var;
        this.f4030s = lcVar;
        this.f4031w = cVar;
        this.f4032x = cVar2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.s4.run():void");
    }

    public s4(ri riVar, sz szVar, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i7, tz tzVar, a0.h hVar2, a0.h hVar3, boolean z10, long j3) {
        this.f4026e = riVar;
        this.f4027f = szVar;
        this.h = hVar;
        this.f4028n = atomicInteger;
        this.f4029r = runnable;
        this.f4024b = i7;
        this.f4030s = tzVar;
        this.f4031w = hVar2;
        this.f4032x = hVar3;
        this.f4025c = z10;
        this.d = j3;
    }

    public s4(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z10, String str2, int i7, TLRPC.Chat chat, cx cxVar, TLRPC.User user, long j3, String str3) {
        this.f4026e = launchActivity;
        this.f4027f = str;
        this.h = tL_chatAdminRights;
        this.f4025c = z10;
        this.f4028n = str2;
        this.f4024b = i7;
        this.f4029r = chat;
        this.f4030s = cxVar;
        this.f4031w = user;
        this.d = j3;
        this.f4032x = str3;
    }
}
