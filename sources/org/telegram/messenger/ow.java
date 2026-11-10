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
    public final sh.g f24406a;
    public final ArrayList f24407b;
    public final long f24408c;
    public final c d;
    public final CharSequence f24409e;
    public final boolean f24410f;
    public final ArrayList h;
    public final ij f24411n;
    public final ij f24412r;
    public final ij f24413s;
    public final boolean f24414w;
    public final int f24415x;
    public final int f24416y;

    public ow(sh.g gVar, ArrayList arrayList, long j3, c cVar, CharSequence charSequence, boolean z9, ArrayList arrayList2, ij ijVar, ij ijVar2, ij ijVar3, boolean z10, int i7, int i10, TL_stories.StoryItem storyItem, hw hwVar, long j10, boolean z11, long j11, Runnable runnable) {
        this.f24406a = gVar;
        this.f24407b = arrayList;
        this.f24408c = j3;
        this.d = cVar;
        this.f24409e = charSequence;
        this.f24410f = z9;
        this.h = arrayList2;
        this.f24411n = ijVar;
        this.f24412r = ijVar2;
        this.f24413s = ijVar3;
        this.f24414w = z10;
        this.f24415x = i7;
        this.f24416y = i10;
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
