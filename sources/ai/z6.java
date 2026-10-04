package ai;

import org.telegram.tgnet.tl.TL_stories;
public final class z6 {
    public final int f1934a;
    public final TL_stories.StoryView f1935b;
    public final TL_stories.StoryReaction f1936c;

    public z6(int i10) {
        this.f1934a = i10;
        this.f1935b = null;
        this.f1936c = null;
    }

    public z6(TL_stories.StoryView storyView) {
        this.f1934a = 1;
        this.f1935b = storyView;
        this.f1936c = null;
    }

    public z6(TL_stories.StoryReaction storyReaction) {
        this.f1934a = 1;
        this.f1935b = null;
        this.f1936c = storyReaction;
    }
}
