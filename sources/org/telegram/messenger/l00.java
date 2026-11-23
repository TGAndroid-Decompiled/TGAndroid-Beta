package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;
public final class l00 implements nc, mc {
    public final y00 f25430a;
    public final TL_stories.StoryItem f25431b;
    public final w00 f25432c;

    public l00(y00 y00Var, TL_stories.StoryItem storyItem, w00 w00Var) {
        this.f25430a = y00Var;
        this.f25431b = storyItem;
        this.f25432c = w00Var;
    }

    @Override
    public void a(String str) {
        g0.g3(new tl(this.f25430a, this.f25431b, str, this.f25432c, 28));
    }

    @Override
    public void s(Exception exc) {
        g0.g3(new nz(this.f25430a, this.f25431b, this.f25432c, 1));
    }
}
