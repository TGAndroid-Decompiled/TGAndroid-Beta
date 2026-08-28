package ih;

import android.graphics.Canvas;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
public final class r9 extends ImageReceiver.Decorator {
    public final ArrayList f12086a;
    public float f12087b;
    public float f12088c;
    public float d;
    public float f12089e;

    public r9(TL_stories.StoryItem storyItem) {
        for (int i9 = 0; i9 < storyItem.media_areas.size(); i9++) {
            if (storyItem.media_areas.get(i9) instanceof TL_stories.TL_mediaAreaSuggestedReaction) {
                if (this.f12086a == null) {
                    this.f12086a = new ArrayList();
                }
                this.f12086a.add(new o9(this, (TL_stories.TL_mediaAreaSuggestedReaction) storyItem.media_areas.get(i9)));
            } else if (storyItem.media_areas.get(i9) instanceof TL_stories.TL_mediaAreaWeather) {
                if (this.f12086a == null) {
                    this.f12086a = new ArrayList();
                }
                this.f12086a.add(new q9(this, (TL_stories.TL_mediaAreaWeather) storyItem.media_areas.get(i9)));
            }
        }
    }

    @Override
    public final void onAttachedToWindow(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.f12086a;
        if (arrayList != null) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                ((n9) arrayList.get(i9)).c(imageReceiver.getParentView());
                ((n9) arrayList.get(i9)).b(true);
            }
        }
    }

    @Override
    public final void onDetachedFromWidnow() {
        ArrayList arrayList = this.f12086a;
        if (arrayList != null) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                ((n9) arrayList.get(i9)).b(false);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas, ImageReceiver imageReceiver) {
        ArrayList arrayList = this.f12086a;
        if (arrayList == null) {
            return;
        }
        float alpha = imageReceiver.getAlpha();
        float centerX = imageReceiver.getCenterX();
        float centerY = imageReceiver.getCenterY();
        float imageWidth = imageReceiver.getImageWidth();
        this.d = imageWidth;
        float f10 = (16.0f * imageWidth) / 9.0f;
        this.f12089e = f10;
        this.f12087b = centerX - (imageWidth / 2.0f);
        this.f12088c = centerY - (f10 / 2.0f);
        canvas.save();
        canvas.clipRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            ((n9) arrayList.get(i9)).a(canvas, alpha);
        }
        canvas.restore();
    }
}
