package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
public final class r8b extends kl5 {
    public final ArrayList a;
    public float b;
    public float c;
    public float d;
    public float e;

    public r8b(TL_stories.StoryItem storyItem) {
        for (int i = 0; i < storyItem.media_areas.size(); i++) {
            if (storyItem.media_areas.get(i) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.a == null) {
                    this.a = new ArrayList();
                }
                this.a.add(new o8b(this, (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i)));
            } else if (storyItem.media_areas.get(i) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.a == null) {
                    this.a = new ArrayList();
                }
                this.a.add(new q8b(this, (TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i)));
            }
        }
    }

    @Override
    public final void a(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                ((n8b) arrayList.get(i)).c(imageReceiver.e);
                ((n8b) arrayList.get(i)).b(true);
            }
        }
    }
}
