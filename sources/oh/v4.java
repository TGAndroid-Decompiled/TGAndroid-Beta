package oh;

import org.telegram.tgnet.tl.TL_stories;
public final class v4 {
    public final int f17847a;
    public final TL_stories.StoryView f17848b;
    public final TL_stories.StoryReaction f17849c;

    public v4(int i10) {
        this.f17847a = i10;
        this.f17848b = null;
        this.f17849c = null;
    }

    public v4(TL_stories.StoryView storyView) {
        this.f17847a = 1;
        this.f17848b = storyView;
        this.f17849c = null;
    }

    public v4(TL_stories.StoryReaction storyReaction) {
        this.f17847a = 1;
        this.f17848b = null;
        this.f17849c = storyReaction;
    }
}
