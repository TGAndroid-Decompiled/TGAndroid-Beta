package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class hw implements Runnable {
    public final TL_stories.StoryItem E;
    public final zv F;
    public final long G;
    public final boolean H;
    public final long I;
    public final Runnable J;
    public final th.f f23376a;
    public final ArrayList f23377b;
    public final long f23378c;
    public final c d;
    public final CharSequence f23379e;
    public final boolean f23380f;
    public final ArrayList h;
    public final zi f23381n;
    public final zi f23382r;
    public final zi f23383s;
    public final boolean f23384w;
    public final int f23385x;
    public final int f23386y;

    public hw(th.f fVar, ArrayList arrayList, long j10, c cVar, CharSequence charSequence, boolean z10, ArrayList arrayList2, zi ziVar, zi ziVar2, zi ziVar3, boolean z11, int i3, int i10, TL_stories.StoryItem storyItem, zv zvVar, long j11, boolean z12, long j12, Runnable runnable) {
        this.f23376a = fVar;
        this.f23377b = arrayList;
        this.f23378c = j10;
        this.d = cVar;
        this.f23379e = charSequence;
        this.f23380f = z10;
        this.h = arrayList2;
        this.f23381n = ziVar;
        this.f23382r = ziVar2;
        this.f23383s = ziVar3;
        this.f23384w = z11;
        this.f23385x = i3;
        this.f23386y = i10;
        this.E = storyItem;
        this.F = zvVar;
        this.G = j11;
        this.H = z12;
        this.I = j12;
        this.J = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hw.run():void");
    }
}
