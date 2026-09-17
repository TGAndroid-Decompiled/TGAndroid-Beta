package bi;

import org.telegram.tgnet.tl.TL_stories;
public final class i6 {
    public final int f3096a;
    public final TL_stories.StoryView f3097b;
    public final TL_stories.StoryReaction f3098c;

    public i6(int i10) {
        this.f3096a = i10;
        this.f3097b = null;
        this.f3098c = null;
    }

    public i6(TL_stories.StoryView storyView) {
        this.f3096a = 1;
        this.f3097b = storyView;
        this.f3098c = null;
    }

    public i6(TL_stories.StoryReaction storyReaction) {
        this.f3096a = 1;
        this.f3097b = null;
        this.f3098c = storyReaction;
    }
}
