package defpackage;

import org.telegram.tgnet.tl.TL_stories;
public final class s3a {
    public final byte a;
    public final TL_stories.StoryView b;
    public final TL_stories.StoryReaction c;

    public s3a(TL_stories.StoryView storyView) {
        this.a = (byte) 1;
        this.b = storyView;
        this.c = null;
    }

    public s3a(int i) {
        this.a = i;
        this.b = null;
        this.c = null;
    }

    public s3a(TL_stories.StoryReaction storyReaction) {
        this.a = (byte) 1;
        this.b = null;
        this.c = storyReaction;
    }
}
