package fi;

import org.telegram.tgnet.tl.TL_stories;
public final class s4 {
    public final int f12561a;
    public final TL_stories.StoryView f12562b;
    public final TL_stories.StoryReaction f12563c;

    public s4(int i7) {
        this.f12561a = i7;
        this.f12562b = null;
        this.f12563c = null;
    }

    public s4(TL_stories.StoryView storyView) {
        this.f12561a = 1;
        this.f12562b = storyView;
        this.f12563c = null;
    }

    public s4(TL_stories.StoryReaction storyReaction) {
        this.f12561a = 1;
        this.f12562b = null;
        this.f12563c = storyReaction;
    }
}
