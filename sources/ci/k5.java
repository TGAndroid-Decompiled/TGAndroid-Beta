package ci;

import org.telegram.tgnet.tl.TL_stories;
public final class k5 {
    public final int f5564a;
    public final TL_stories.StoryView f5565b;
    public final TL_stories.StoryReaction f5566c;

    public k5(int i10) {
        this.f5564a = i10;
        this.f5565b = null;
        this.f5566c = null;
    }

    public k5(TL_stories.StoryView storyView) {
        this.f5564a = 1;
        this.f5565b = storyView;
        this.f5566c = null;
    }

    public k5(TL_stories.StoryReaction storyReaction) {
        this.f5564a = 1;
        this.f5565b = null;
        this.f5566c = storyReaction;
    }
}
