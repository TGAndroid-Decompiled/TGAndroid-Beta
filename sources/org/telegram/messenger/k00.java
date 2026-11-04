package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;
public final class k00 implements jc, ic {
    public final x00 f23780a;
    public final TL_stories.StoryItem f23781b;
    public final v00 f23782c;

    public k00(x00 x00Var, TL_stories.StoryItem storyItem, v00 v00Var) {
        this.f23780a = x00Var;
        this.f23781b = storyItem;
        this.f23782c = v00Var;
    }

    @Override
    public void a(String str) {
        g0.h3(new ul(this.f23780a, this.f23781b, str, this.f23782c, 28));
    }

    @Override
    public void s(Exception exc) {
        g0.h3(new mz(this.f23780a, this.f23781b, this.f23782c, 1));
    }
}
