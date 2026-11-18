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
    public final sh.g f24730a;
    public final ArrayList f24731b;
    public final long f24732c;
    public final c d;
    public final CharSequence f24733e;
    public final boolean f24734f;
    public final ArrayList h;
    public final fj f24735n;
    public final fj f24736r;
    public final fj f24737s;
    public final boolean f24738w;
    public final int f24739x;
    public final int f24740y;

    public iw(sh.g gVar, ArrayList arrayList, long j3, c cVar, CharSequence charSequence, boolean z10, ArrayList arrayList2, fj fjVar, fj fjVar2, fj fjVar3, boolean z11, int i7, int i10, TL_stories.StoryItem storyItem, bw bwVar, long j10, boolean z12, long j11, Runnable runnable) {
        this.f24730a = gVar;
        this.f24731b = arrayList;
        this.f24732c = j3;
        this.d = cVar;
        this.f24733e = charSequence;
        this.f24734f = z10;
        this.h = arrayList2;
        this.f24735n = fjVar;
        this.f24736r = fjVar2;
        this.f24737s = fjVar3;
        this.f24738w = z11;
        this.f24739x = i7;
        this.f24740y = i10;
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
