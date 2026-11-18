package fi;

import org.telegram.tgnet.tl.TL_stories;
public final class r4 {
    public final int f12499a;
    public final TL_stories.StoryView f12500b;
    public final TL_stories.StoryReaction f12501c;

    public r4(int i7) {
        this.f12499a = i7;
        this.f12500b = null;
        this.f12501c = null;
    }

    public r4(TL_stories.StoryView storyView) {
        this.f12499a = 1;
        this.f12500b = storyView;
        this.f12501c = null;
    }

    public r4(TL_stories.StoryReaction storyReaction) {
        this.f12499a = 1;
        this.f12500b = null;
        this.f12501c = storyReaction;
    }
}
