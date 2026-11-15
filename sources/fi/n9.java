package fi;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.jc;
import org.telegram.tgnet.tl.TL_stories;
public final class n9 extends jc {
    public final ArrayList f12092a;
    public float f12093b;
    public float f12094c;
    public float d;
    public float f12095e;

    public n9(TL_stories.StoryItem storyItem) {
        for (int i7 = 0; i7 < storyItem.media_areas.size(); i7++) {
            if (storyItem.media_areas.get(i7) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.f12092a == null) {
                    this.f12092a = new ArrayList();
                }
                this.f12092a.add(new k9(this, (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i7)));
            } else if (storyItem.media_areas.get(i7) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.f12092a == null) {
                    this.f12092a = new ArrayList();
                }
                this.f12092a.add(new m9(this, (TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i7)));
            }
        }
    }

    @Override
    public final void a(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.f12092a;
        if (arrayList != null) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                ((j9) arrayList.get(i7)).c(imageReceiver.f22267e);
                ((j9) arrayList.get(i7)).b(true);
            }
        }
    }
}
