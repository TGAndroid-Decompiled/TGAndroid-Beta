package di;

import org.telegram.tgnet.tl.TL_stories;
public final class j5 {
    public final int f8694a;
    public final TL_stories.StoryView f8695b;
    public final TL_stories.StoryReaction f8696c;

    public j5(int i10) {
        this.f8694a = i10;
        this.f8695b = null;
        this.f8696c = null;
    }

    public j5(TL_stories.StoryView storyView) {
        this.f8694a = 1;
        this.f8695b = storyView;
        this.f8696c = null;
    }

    public j5(TL_stories.StoryReaction storyReaction) {
        this.f8694a = 1;
        this.f8695b = null;
        this.f8696c = storyReaction;
    }
}
