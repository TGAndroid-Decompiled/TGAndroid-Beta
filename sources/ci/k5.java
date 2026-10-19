package ci;

import org.telegram.tgnet.tl.TL_stories;
public final class k5 {
    public final int f5561a;
    public final TL_stories.StoryView f5562b;
    public final TL_stories.StoryReaction f5563c;

    public k5(int i10) {
        this.f5561a = i10;
        this.f5562b = null;
        this.f5563c = null;
    }

    public k5(TL_stories.StoryView storyView) {
        this.f5561a = 1;
        this.f5562b = storyView;
        this.f5563c = null;
    }

    public k5(TL_stories.StoryReaction storyReaction) {
        this.f5561a = 1;
        this.f5562b = null;
        this.f5563c = storyReaction;
    }
}
