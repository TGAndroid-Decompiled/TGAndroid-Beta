package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class mw implements Runnable {
    public final TL_stories.StoryItem E;
    public final fw F;
    public final long G;
    public final boolean H;
    public final long I;
    public final Runnable J;
    public final sh.f f25101a;
    public final ArrayList f25102b;
    public final long f25103c;
    public final c d;
    public final CharSequence f25104e;
    public final boolean f25105f;
    public final ArrayList h;
    public final gj f25106n;
    public final gj f25107r;
    public final gj f25108s;
    public final boolean f25109w;
    public final int f25110x;
    public final int f25111y;

    public mw(sh.f fVar, ArrayList arrayList, long j3, c cVar, CharSequence charSequence, boolean z10, ArrayList arrayList2, gj gjVar, gj gjVar2, gj gjVar3, boolean z11, int i7, int i10, TL_stories.StoryItem storyItem, fw fwVar, long j10, boolean z12, long j11, Runnable runnable) {
        this.f25101a = fVar;
        this.f25102b = arrayList;
        this.f25103c = j3;
        this.d = cVar;
        this.f25104e = charSequence;
        this.f25105f = z10;
        this.h = arrayList2;
        this.f25106n = gjVar;
        this.f25107r = gjVar2;
        this.f25108s = gjVar3;
        this.f25109w = z11;
        this.f25110x = i7;
        this.f25111y = i10;
        this.E = storyItem;
        this.F = fwVar;
        this.G = j10;
        this.H = z12;
        this.I = j11;
        this.J = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.mw.run():void");
    }
}
