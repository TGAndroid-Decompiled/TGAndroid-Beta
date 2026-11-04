package ei;

import org.telegram.tgnet.tl.TL_stories;
public final class b5 {
    public final int f10127a;
    public final TL_stories.StoryView f10128b;
    public final TL_stories.StoryReaction f10129c;

    public b5(int i3) {
        this.f10127a = i3;
        this.f10128b = null;
        this.f10129c = null;
    }

    public b5(TL_stories.StoryView storyView) {
        this.f10127a = 1;
        this.f10128b = storyView;
        this.f10129c = null;
    }

    public b5(TL_stories.StoryReaction storyReaction) {
        this.f10127a = 1;
        this.f10128b = null;
        this.f10129c = storyReaction;
    }
}
