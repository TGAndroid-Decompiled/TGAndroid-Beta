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
    public final sh.f f24930a;
    public final ArrayList f24931b;
    public final long f24932c;
    public final c d;
    public final CharSequence f24933e;
    public final boolean f24934f;
    public final ArrayList h;
    public final gj f24935n;
    public final gj f24936r;
    public final gj f24937s;
    public final boolean f24938w;
    public final int f24939x;
    public final int f24940y;

    public jw(sh.f fVar, ArrayList arrayList, long j3, c cVar, CharSequence charSequence, boolean z10, ArrayList arrayList2, gj gjVar, gj gjVar2, gj gjVar3, boolean z11, int i7, int i10, TL_stories.StoryItem storyItem, cw cwVar, long j10, boolean z12, long j11, Runnable runnable) {
        this.f24930a = fVar;
        this.f24931b = arrayList;
        this.f24932c = j3;
        this.d = cVar;
        this.f24933e = charSequence;
        this.f24934f = z10;
        this.h = arrayList2;
        this.f24935n = gjVar;
        this.f24936r = gjVar2;
        this.f24937s = gjVar3;
        this.f24938w = z11;
        this.f24939x = i7;
        this.f24940y = i10;
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
