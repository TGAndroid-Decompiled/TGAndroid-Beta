package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;
public final class m00 implements nc, mc {
    public final z00 f25506a;
    public final TL_stories.StoryItem f25507b;
    public final x00 f25508c;

    public m00(z00 z00Var, TL_stories.StoryItem storyItem, x00 x00Var) {
        this.f25506a = z00Var;
        this.f25507b = storyItem;
        this.f25508c = x00Var;
    }

    @Override
    public void a(String str) {
        g0.g3(new tl(this.f25506a, this.f25507b, str, this.f25508c, 28));
    }

    @Override
    public void q(Exception exc) {
        g0.g3(new oz(this.f25506a, this.f25507b, this.f25508c, 1));
    }
}
