package di;

import org.telegram.tgnet.tl.TL_stories;
public final class j5 {
    public final int f8695a;
    public final TL_stories.StoryView f8696b;
    public final TL_stories.StoryReaction f8697c;

    public j5(int i10) {
        this.f8695a = i10;
        this.f8696b = null;
        this.f8697c = null;
    }

    public j5(TL_stories.StoryView storyView) {
        this.f8695a = 1;
        this.f8696b = storyView;
        this.f8697c = null;
    }

    public j5(TL_stories.StoryReaction storyReaction) {
        this.f8695a = 1;
        this.f8696b = null;
        this.f8697c = storyReaction;
    }
}
