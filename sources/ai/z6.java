package ai;

import org.telegram.tgnet.tl.TL_stories;
public final class z6 {
    public final int f1782a;
    public final TL_stories.StoryView f1783b;
    public final TL_stories.StoryReaction f1784c;

    public z6(int i10) {
        this.f1782a = i10;
        this.f1783b = null;
        this.f1784c = null;
    }

    public z6(TL_stories.StoryView storyView) {
        this.f1782a = 1;
        this.f1783b = storyView;
        this.f1784c = null;
    }

    public z6(TL_stories.StoryReaction storyReaction) {
        this.f1782a = 1;
        this.f1783b = null;
        this.f1784c = storyReaction;
    }
}
