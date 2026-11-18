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
    public final sh.g f24733a;
    public final ArrayList f24734b;
    public final long f24735c;
    public final c d;
    public final CharSequence f24736e;
    public final boolean f24737f;
    public final ArrayList h;
    public final fj f24738n;
    public final fj f24739r;
    public final fj f24740s;
    public final boolean f24741w;
    public final int f24742x;
    public final int f24743y;

    public iw(sh.g gVar, ArrayList arrayList, long j3, c cVar, CharSequence charSequence, boolean z10, ArrayList arrayList2, fj fjVar, fj fjVar2, fj fjVar3, boolean z11, int i7, int i10, TL_stories.StoryItem storyItem, bw bwVar, long j10, boolean z12, long j11, Runnable runnable) {
        this.f24733a = gVar;
        this.f24734b = arrayList;
        this.f24735c = j3;
        this.d = cVar;
        this.f24736e = charSequence;
        this.f24737f = z10;
        this.h = arrayList2;
        this.f24738n = fjVar;
        this.f24739r = fjVar2;
        this.f24740s = fjVar3;
        this.f24741w = z11;
        this.f24742x = i7;
        this.f24743y = i10;
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
