package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class ax implements Runnable {
    public final TL_stories.StoryItem D;
    public final sw E;
    public final long F;
    public final boolean G;
    public final long H;
    public final Runnable I;
    public final ih.i f14673a;
    public final ArrayList f14674b;
    public final long f14675c;
    public final c d;
    public final CharSequence e;
    public final boolean f14676f;
    public final ArrayList h;
    public final jj f14677n;
    public final jj f14678r;
    public final jj f14679s;
    public final boolean f14680w;
    public final int f14681x;
    public final int f14682y;

    public ax(ih.i iVar, ArrayList arrayList, long j10, c cVar, CharSequence charSequence, boolean z10, ArrayList arrayList2, jj jjVar, jj jjVar2, jj jjVar3, boolean z11, int i10, int i11, TL_stories.StoryItem storyItem, sw swVar, long j11, boolean z12, long j12, Runnable runnable) {
        this.f14673a = iVar;
        this.f14674b = arrayList;
        this.f14675c = j10;
        this.d = cVar;
        this.e = charSequence;
        this.f14676f = z10;
        this.h = arrayList2;
        this.f14677n = jjVar;
        this.f14678r = jjVar2;
        this.f14679s = jjVar3;
        this.f14680w = z11;
        this.f14681x = i10;
        this.f14682y = i11;
        this.D = storyItem;
        this.E = swVar;
        this.F = j11;
        this.G = z12;
        this.H = j12;
        this.I = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ax.run():void");
    }
}
