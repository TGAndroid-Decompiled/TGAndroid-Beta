package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.MediaController;
public final class MediaController$$ExternalSyntheticLambda41 implements Comparator {
    public static final MediaController$$ExternalSyntheticLambda41 INSTANCE = new MediaController$$ExternalSyntheticLambda41();

    private MediaController$$ExternalSyntheticLambda41() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$loadGalleryPhotosAlbums$40;
        lambda$loadGalleryPhotosAlbums$40 = MediaController.lambda$loadGalleryPhotosAlbums$40((MediaController.PhotoEntry) obj, (MediaController.PhotoEntry) obj2);
        return lambda$loadGalleryPhotosAlbums$40;
    }
}
