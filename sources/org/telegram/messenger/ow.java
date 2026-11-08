package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class ow implements Runnable {
    public final TL_stories.StoryItem D;
    public final hw E;
    public final long F;
    public final boolean G;
    public final long H;
    public final Runnable I;
    public final sh.f f24402a;
    public final ArrayList f24403b;
    public final long f24404c;
    public final c d;
    public final CharSequence f24405e;
    public final boolean f24406f;
    public final ArrayList h;
    public final ij f24407n;
    public final ij f24408r;
    public final ij f24409s;
    public final boolean f24410w;
    public final int f24411x;
    public final int f24412y;

    public ow(sh.f fVar, ArrayList arrayList, long j3, c cVar, CharSequence charSequence, boolean z9, ArrayList arrayList2, ij ijVar, ij ijVar2, ij ijVar3, boolean z10, int i7, int i10, TL_stories.StoryItem storyItem, hw hwVar, long j10, boolean z11, long j11, Runnable runnable) {
        this.f24402a = fVar;
        this.f24403b = arrayList;
        this.f24404c = j3;
        this.d = cVar;
        this.f24405e = charSequence;
        this.f24406f = z9;
        this.h = arrayList2;
        this.f24407n = ijVar;
        this.f24408r = ijVar2;
        this.f24409s = ijVar3;
        this.f24410w = z10;
        this.f24411x = i7;
        this.f24412y = i10;
        this.D = storyItem;
        this.E = hwVar;
        this.F = j10;
        this.G = z11;
        this.H = j11;
        this.I = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ow.run():void");
    }
}
