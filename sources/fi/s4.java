package fi;

import org.telegram.tgnet.tl.TL_stories;
public final class s4 {
    public final int f12523a;
    public final TL_stories.StoryView f12524b;
    public final TL_stories.StoryReaction f12525c;

    public s4(int i7) {
        this.f12523a = i7;
        this.f12524b = null;
        this.f12525c = null;
    }

    public s4(TL_stories.StoryView storyView) {
        this.f12523a = 1;
        this.f12524b = storyView;
        this.f12525c = null;
    }

    public s4(TL_stories.StoryReaction storyReaction) {
        this.f12523a = 1;
        this.f12524b = null;
        this.f12525c = storyReaction;
    }
}
