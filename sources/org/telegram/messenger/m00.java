package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;
public final class m00 implements nc, mc {
    public final z00 f25508a;
    public final TL_stories.StoryItem f25509b;
    public final x00 f25510c;

    public m00(z00 z00Var, TL_stories.StoryItem storyItem, x00 x00Var) {
        this.f25508a = z00Var;
        this.f25509b = storyItem;
        this.f25510c = x00Var;
    }

    @Override
    public void a(String str) {
        g0.g3(new tl(this.f25508a, this.f25509b, str, this.f25510c, 28));
    }

    @Override
    public void q(Exception exc) {
        g0.g3(new oz(this.f25508a, this.f25509b, this.f25510c, 1));
    }
}
