package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class ChatThemeController$$ExternalSyntheticLambda9 implements RequestDelegate {
    public static final ChatThemeController$$ExternalSyntheticLambda9 INSTANCE = new ChatThemeController$$ExternalSyntheticLambda9();

    private ChatThemeController$$ExternalSyntheticLambda9() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ChatThemeController.lambda$clearWallpaper$8(tLObject, tLRPC$TL_error);
    }
}
