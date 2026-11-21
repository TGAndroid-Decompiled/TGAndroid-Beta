package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class iw implements Runnable {
    public final TL_stories.StoryItem E;
    public final bw F;
    public final long G;
    public final boolean H;
    public final long I;
    public final Runnable J;
    public final sh.f f24758a;
    public final ArrayList f24759b;
    public final long f24760c;
    public final c d;
    public final CharSequence f24761e;
    public final boolean f24762f;
    public final ArrayList h;
    public final fj f24763n;
    public final fj f24764r;
    public final fj f24765s;
    public final boolean f24766w;
    public final int f24767x;
    public final int f24768y;

    public iw(sh.f fVar, ArrayList arrayList, long j3, c cVar, CharSequence charSequence, boolean z10, ArrayList arrayList2, fj fjVar, fj fjVar2, fj fjVar3, boolean z11, int i7, int i10, TL_stories.StoryItem storyItem, bw bwVar, long j10, boolean z12, long j11, Runnable runnable) {
        this.f24758a = fVar;
        this.f24759b = arrayList;
        this.f24760c = j3;
        this.d = cVar;
        this.f24761e = charSequence;
        this.f24762f = z10;
        this.h = arrayList2;
        this.f24763n = fjVar;
        this.f24764r = fjVar2;
        this.f24765s = fjVar3;
        this.f24766w = z11;
        this.f24767x = i7;
        this.f24768y = i10;
        this.E = storyItem;
        this.F = bwVar;
        this.G = j10;
        this.H = z12;
        this.I = j11;
        this.J = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.iw.run():void");
    }
}
