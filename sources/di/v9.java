package di;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.kc;
import org.telegram.tgnet.tl.TL_stories;
public final class v9 extends kc {
    public final ArrayList f9881a;
    public float f9882b;
    public float f9883c;
    public float d;
    public float f9884e;

    public v9(TL_stories.StoryItem storyItem) {
        for (int i7 = 0; i7 < storyItem.media_areas.size(); i7++) {
            if (storyItem.media_areas.get(i7) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.f9881a == null) {
                    this.f9881a = new ArrayList();
                }
                this.f9881a.add(new s9(this, (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i7)));
            } else if (storyItem.media_areas.get(i7) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.f9881a == null) {
                    this.f9881a = new ArrayList();
                }
                this.f9881a.add(new u9(this, (TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i7)));
            }
        }
    }

    @Override
    public final void a(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.f9881a;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((r9) arrayList.get(i7)).c(imageReceiver.f21188e);
                ((r9) arrayList.get(i7)).b(true);
            }
        }
    }
}
