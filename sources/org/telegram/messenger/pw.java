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
    public final sh.f f24618a;
    public final ArrayList f24619b;
    public final long f24620c;
    public final c d;
    public final CharSequence f24621e;
    public final boolean f24622f;
    public final ArrayList h;
    public final ij f24623n;
    public final ij f24624r;
    public final ij f24625s;
    public final boolean f24626w;
    public final int f24627x;
    public final int f24628y;

    public pw(sh.f fVar, ArrayList arrayList, long j3, c cVar, CharSequence charSequence, boolean z9, ArrayList arrayList2, ij ijVar, ij ijVar2, ij ijVar3, boolean z10, int i7, int i10, TL_stories.StoryItem storyItem, hw hwVar, long j10, boolean z11, long j11, Runnable runnable) {
        this.f24618a = fVar;
        this.f24619b = arrayList;
        this.f24620c = j3;
        this.d = cVar;
        this.f24621e = charSequence;
        this.f24622f = z9;
        this.h = arrayList2;
        this.f24623n = ijVar;
        this.f24624r = ijVar2;
        this.f24625s = ijVar3;
        this.f24626w = z10;
        this.f24627x = i7;
        this.f24628y = i10;
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
