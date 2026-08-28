package ih;

import org.telegram.tgnet.tl.TL_stories;
public final class x4 {
    public final int f12319a;
    public final TL_stories.StoryView f12320b;
    public final TL_stories.StoryReaction f12321c;

    public x4(int i9) {
        this.f12319a = i9;
        this.f12320b = null;
        this.f12321c = null;
    }

    public x4(TL_stories.StoryView storyView) {
        this.f12319a = 1;
        this.f12320b = storyView;
        this.f12321c = null;
    }

    public x4(TL_stories.StoryReaction storyReaction) {
        this.f12319a = 1;
        this.f12320b = null;
        this.f12321c = storyReaction;
    }
}
