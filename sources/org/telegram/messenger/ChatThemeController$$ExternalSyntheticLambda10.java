package org.telegram.messenger;

import android.util.Pair;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC$TL_error;
public final class ChatThemeController$$ExternalSyntheticLambda10 implements ResultCallback {
    public static final ChatThemeController$$ExternalSyntheticLambda10 INSTANCE = new ChatThemeController$$ExternalSyntheticLambda10();

    private ChatThemeController$$ExternalSyntheticLambda10() {
    }

    @Override
    public final void onComplete(Object obj) {
        ChatThemeController.lambda$preloadAllWallpaperThumbs$4((Pair) obj);
    }

    @Override
    public void onError(TLRPC$TL_error tLRPC$TL_error) {
        ResultCallback.CC.$default$onError(this, tLRPC$TL_error);
    }
}
