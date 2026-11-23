package bi;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.ri;
import org.telegram.messenger.rz;
import org.telegram.messenger.sz;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.kc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bx;
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

    public z4(Context context, int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, org.telegram.ui.ActionBar.i6 i6Var, ai.s1 s1Var, kc kcVar, c1.a aVar, di.f2 f2Var) {
        this.f4293e = context;
        this.f4291b = i7;
        this.f4294f = tL_starGiftUnique;
        this.d = j3;
        this.h = tL_textWithEntities;
        this.f4292c = z10;
        this.f4295n = i6Var;
        this.f4296r = s1Var;
        this.f4297s = kcVar;
        this.f4298w = aVar;
        this.f4299x = f2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.z4.run():void");
    }

    public z4(ri riVar, rz rzVar, a0.h hVar, AtomicInteger atomicInteger, Runnable runnable, int i7, sz szVar, a0.h hVar2, a0.h hVar3, boolean z10, long j3) {
        this.f4293e = riVar;
        this.f4294f = rzVar;
        this.h = hVar;
        this.f4295n = atomicInteger;
        this.f4296r = runnable;
        this.f4291b = i7;
        this.f4297s = szVar;
        this.f4298w = hVar2;
        this.f4299x = hVar3;
        this.f4292c = z10;
        this.d = j3;
    }

    public z4(LaunchActivity launchActivity, String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z10, String str2, int i7, TLRPC.Chat chat, bx bxVar, TLRPC.User user, long j3, String str3) {
        this.f4293e = launchActivity;
        this.f4294f = str;
        this.h = tL_chatAdminRights;
        this.f4292c = z10;
        this.f4295n = str2;
        this.f4291b = i7;
        this.f4296r = chat;
        this.f4297s = bxVar;
        this.f4298w = user;
        this.d = j3;
        this.f4299x = str3;
    }
}
