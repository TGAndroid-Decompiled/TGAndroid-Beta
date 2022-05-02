package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class ImageLoader$HttpImageTask$$ExternalSyntheticLambda8 implements RequestDelegate {
    public static final ImageLoader$HttpImageTask$$ExternalSyntheticLambda8 INSTANCE = new ImageLoader$HttpImageTask$$ExternalSyntheticLambda8();

    private ImageLoader$HttpImageTask$$ExternalSyntheticLambda8() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        ImageLoader.HttpImageTask.lambda$doInBackground$2(tLObject, tLRPC$TL_error);
    }
}
