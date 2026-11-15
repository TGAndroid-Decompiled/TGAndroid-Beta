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
    public final sh.f f25104a;
    public final ArrayList f25105b;
    public final long f25106c;
    public final c d;
    public final CharSequence f25107e;
    public final boolean f25108f;
    public final ArrayList h;
    public final gj f25109n;
    public final gj f25110r;
    public final gj f25111s;
    public final boolean f25112w;
    public final int f25113x;
    public final int f25114y;

    public mw(sh.f fVar, ArrayList arrayList, long j3, c cVar, CharSequence charSequence, boolean z10, ArrayList arrayList2, gj gjVar, gj gjVar2, gj gjVar3, boolean z11, int i7, int i10, TL_stories.StoryItem storyItem, fw fwVar, long j10, boolean z12, long j11, Runnable runnable) {
        this.f25104a = fVar;
        this.f25105b = arrayList;
        this.f25106c = j3;
        this.d = cVar;
        this.f25107e = charSequence;
        this.f25108f = z10;
        this.h = arrayList2;
        this.f25109n = gjVar;
        this.f25110r = gjVar2;
        this.f25111s = gjVar3;
        this.f25112w = z11;
        this.f25113x = i7;
        this.f25114y = i10;
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
