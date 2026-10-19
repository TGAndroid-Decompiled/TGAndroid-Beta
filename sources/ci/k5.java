package ci;

import org.telegram.tgnet.tl.TL_stories;
public final class k5 {
    public final int f5563a;
    public final TL_stories.StoryView f5564b;
    public final TL_stories.StoryReaction f5565c;

    public k5(int i10) {
        this.f5563a = i10;
        this.f5564b = null;
        this.f5565c = null;
    }

    public k5(TL_stories.StoryView storyView) {
        this.f5563a = 1;
        this.f5564b = storyView;
        this.f5565c = null;
    }

    public k5(TL_stories.StoryReaction storyReaction) {
        this.f5563a = 1;
        this.f5564b = null;
        this.f5565c = storyReaction;
    }
}
