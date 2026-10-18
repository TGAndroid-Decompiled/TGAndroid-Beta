package ci;

import org.telegram.tgnet.tl.TL_stories;
public final class j5 {
    public final int f5468a;
    public final TL_stories.StoryView f5469b;
    public final TL_stories.StoryReaction f5470c;

    public j5(int i10) {
        this.f5468a = i10;
        this.f5469b = null;
        this.f5470c = null;
    }

    public j5(TL_stories.StoryView storyView) {
        this.f5468a = 1;
        this.f5469b = storyView;
        this.f5470c = null;
    }

    public j5(TL_stories.StoryReaction storyReaction) {
        this.f5468a = 1;
        this.f5469b = null;
        this.f5470c = storyReaction;
    }
}
