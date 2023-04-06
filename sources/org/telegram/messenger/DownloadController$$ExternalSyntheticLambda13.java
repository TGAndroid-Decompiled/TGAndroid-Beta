package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class DownloadController$$ExternalSyntheticLambda13 implements RequestDelegate {
    public static final DownloadController$$ExternalSyntheticLambda13 INSTANCE = new DownloadController$$ExternalSyntheticLambda13();

    private DownloadController$$ExternalSyntheticLambda13() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        DownloadController.lambda$savePresetToServer$3(tLObject, tLRPC$TL_error);
    }
}
