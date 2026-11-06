package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class pw implements Runnable {
    public final TL_stories.StoryItem D;
    public final hw E;
    public final long F;
    public final boolean G;
    public final long H;
    public final Runnable I;
    public final sh.f f24610a;
    public final ArrayList f24611b;
    public final long f24612c;
    public final c d;
    public final CharSequence f24613e;
    public final boolean f24614f;
    public final ArrayList h;
    public final ij f24615n;
    public final ij f24616r;
    public final ij f24617s;
    public final boolean f24618w;
    public final int f24619x;
    public final int f24620y;

    public pw(sh.f fVar, ArrayList arrayList, long j3, c cVar, CharSequence charSequence, boolean z9, ArrayList arrayList2, ij ijVar, ij ijVar2, ij ijVar3, boolean z10, int i7, int i10, TL_stories.StoryItem storyItem, hw hwVar, long j10, boolean z11, long j11, Runnable runnable) {
        this.f24610a = fVar;
        this.f24611b = arrayList;
        this.f24612c = j3;
        this.d = cVar;
        this.f24613e = charSequence;
        this.f24614f = z9;
        this.h = arrayList2;
        this.f24615n = ijVar;
        this.f24616r = ijVar2;
        this.f24617s = ijVar3;
        this.f24618w = z10;
        this.f24619x = i7;
        this.f24620y = i10;
        this.D = storyItem;
        this.E = hwVar;
        this.F = j10;
        this.G = z11;
        this.H = j11;
        this.I = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.pw.run():void");
    }
}
