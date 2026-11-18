package fi;

import org.telegram.tgnet.tl.TL_stories;
public final class r4 {
    public final int f12502a;
    public final TL_stories.StoryView f12503b;
    public final TL_stories.StoryReaction f12504c;

    public r4(int i7) {
        this.f12502a = i7;
        this.f12503b = null;
        this.f12504c = null;
    }

    public r4(TL_stories.StoryView storyView) {
        this.f12502a = 1;
        this.f12503b = storyView;
        this.f12504c = null;
    }

    public r4(TL_stories.StoryReaction storyReaction) {
        this.f12502a = 1;
        this.f12503b = null;
        this.f12504c = storyReaction;
    }
}
