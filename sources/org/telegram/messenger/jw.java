package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class jw implements Runnable {
    public final TL_stories.StoryItem E;
    public final cw F;
    public final long G;
    public final boolean H;
    public final long I;
    public final Runnable J;
    public final sh.f f24894a;
    public final ArrayList f24895b;
    public final long f24896c;
    public final c d;
    public final CharSequence f24897e;
    public final boolean f24898f;
    public final ArrayList h;
    public final gj f24899n;
    public final gj f24900r;
    public final gj f24901s;
    public final boolean f24902w;
    public final int f24903x;
    public final int f24904y;

    public jw(sh.f fVar, ArrayList arrayList, long j3, c cVar, CharSequence charSequence, boolean z10, ArrayList arrayList2, gj gjVar, gj gjVar2, gj gjVar3, boolean z11, int i7, int i10, TL_stories.StoryItem storyItem, cw cwVar, long j10, boolean z12, long j11, Runnable runnable) {
        this.f24894a = fVar;
        this.f24895b = arrayList;
        this.f24896c = j3;
        this.d = cVar;
        this.f24897e = charSequence;
        this.f24898f = z10;
        this.h = arrayList2;
        this.f24899n = gjVar;
        this.f24900r = gjVar2;
        this.f24901s = gjVar3;
        this.f24902w = z11;
        this.f24903x = i7;
        this.f24904y = i10;
        this.E = storyItem;
        this.F = cwVar;
        this.G = j10;
        this.H = z12;
        this.I = j11;
        this.J = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jw.run():void");
    }
}
