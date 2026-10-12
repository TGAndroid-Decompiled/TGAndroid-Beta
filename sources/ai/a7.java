package ai;

import org.telegram.tgnet.tl.TL_stories;
public final class a7 {
    public final int f645a;
    public final TL_stories.StoryView f646b;
    public final TL_stories.StoryReaction f647c;

    public a7(int i10) {
        this.f645a = i10;
        this.f646b = null;
        this.f647c = null;
    }

    public a7(TL_stories.StoryView storyView) {
        this.f645a = 1;
        this.f646b = storyView;
        this.f647c = null;
    }

    public a7(TL_stories.StoryReaction storyReaction) {
        this.f645a = 1;
        this.f646b = null;
        this.f647c = storyReaction;
    }
}
