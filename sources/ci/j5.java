package ci;

import org.telegram.tgnet.tl.TL_stories;
public final class j5 {
    public final int f5469a;
    public final TL_stories.StoryView f5470b;
    public final TL_stories.StoryReaction f5471c;

    public j5(int i10) {
        this.f5469a = i10;
        this.f5470b = null;
        this.f5471c = null;
    }

    public j5(TL_stories.StoryView storyView) {
        this.f5469a = 1;
        this.f5470b = storyView;
        this.f5471c = null;
    }

    public j5(TL_stories.StoryReaction storyReaction) {
        this.f5469a = 1;
        this.f5470b = null;
        this.f5471c = storyReaction;
    }
}
