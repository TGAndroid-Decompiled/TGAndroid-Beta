package org.telegram.messenger;

import java.util.List;

public final class GoogleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda1 implements TelegramMediaSession.BrowseChildrenCallback {
    public final Runnable f$0;

    public GoogleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda1(Runnable runnable) {
        this.f$0 = runnable;
    }

    @Override
    public void onResult(List list) {
        TelegramMediaSession.lambda$ensureLoaded$2(this.f$0, list);
    }
}
