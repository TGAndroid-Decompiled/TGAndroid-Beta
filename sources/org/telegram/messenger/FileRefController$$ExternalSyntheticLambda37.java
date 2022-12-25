package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class FileRefController$$ExternalSyntheticLambda37 implements RequestDelegate {
    public static final FileRefController$$ExternalSyntheticLambda37 INSTANCE = new FileRefController$$ExternalSyntheticLambda37();

    private FileRefController$$ExternalSyntheticLambda37() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        FileRefController.lambda$onUpdateObjectReference$29(tLObject, tLRPC$TL_error);
    }
}
