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
    public final sh.f f24856a;
    public final ArrayList f24857b;
    public final long f24858c;
    public final c d;
    public final CharSequence f24859e;
    public final boolean f24860f;
    public final ArrayList h;
    public final fj f24861n;
    public final fj f24862r;
    public final fj f24863s;
    public final boolean f24864w;
    public final int f24865x;
    public final int f24866y;

    public iw(sh.f fVar, ArrayList arrayList, long j3, c cVar, CharSequence charSequence, boolean z10, ArrayList arrayList2, fj fjVar, fj fjVar2, fj fjVar3, boolean z11, int i7, int i10, TL_stories.StoryItem storyItem, bw bwVar, long j10, boolean z12, long j11, Runnable runnable) {
        this.f24856a = fVar;
        this.f24857b = arrayList;
        this.f24858c = j3;
        this.d = cVar;
        this.f24859e = charSequence;
        this.f24860f = z10;
        this.h = arrayList2;
        this.f24861n = fjVar;
        this.f24862r = fjVar2;
        this.f24863s = fjVar3;
        this.f24864w = z11;
        this.f24865x = i7;
        this.f24866y = i10;
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
