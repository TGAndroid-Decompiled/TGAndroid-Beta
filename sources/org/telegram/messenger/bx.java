package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class bx implements Runnable {
    public final TL_stories.StoryItem D;
    public final tw E;
    public final long F;
    public final boolean G;
    public final long H;
    public final Runnable I;
    public final ih.i f15028a;
    public final ArrayList f15029b;
    public final long f15030c;
    public final c d;
    public final CharSequence e;
    public final boolean f15031f;
    public final ArrayList h;
    public final kj f15032n;
    public final kj f15033r;
    public final kj f15034s;
    public final boolean f15035w;
    public final int f15036x;
    public final int f15037y;

    public bx(ih.i iVar, ArrayList arrayList, long j10, c cVar, CharSequence charSequence, boolean z10, ArrayList arrayList2, kj kjVar, kj kjVar2, kj kjVar3, boolean z11, int i10, int i11, TL_stories.StoryItem storyItem, tw twVar, long j11, boolean z12, long j12, Runnable runnable) {
        this.f15028a = iVar;
        this.f15029b = arrayList;
        this.f15030c = j10;
        this.d = cVar;
        this.e = charSequence;
        this.f15031f = z10;
        this.h = arrayList2;
        this.f15032n = kjVar;
        this.f15033r = kjVar2;
        this.f15034s = kjVar3;
        this.f15035w = z11;
        this.f15036x = i10;
        this.f15037y = i11;
        this.D = storyItem;
        this.E = twVar;
        this.F = j11;
        this.G = z12;
        this.H = j12;
        this.I = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bx.run():void");
    }
}
