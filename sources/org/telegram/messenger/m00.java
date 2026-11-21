package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;
public final class m00 implements nc, mc {
    public final z00 f25534a;
    public final TL_stories.StoryItem f25535b;
    public final x00 f25536c;

    public m00(z00 z00Var, TL_stories.StoryItem storyItem, x00 x00Var) {
        this.f25534a = z00Var;
        this.f25535b = storyItem;
        this.f25536c = x00Var;
    }

    @Override
    public void a(String str) {
        g0.g3(new tl(this.f25534a, this.f25535b, str, this.f25536c, 28));
    }

    @Override
    public void q(Exception exc) {
        g0.g3(new oz(this.f25534a, this.f25535b, this.f25536c, 1));
    }
}
