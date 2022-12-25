package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;

public final class FileRefController$$ExternalSyntheticLambda36 implements RequestDelegate {
    public static final FileRefController$$ExternalSyntheticLambda36 INSTANCE = new FileRefController$$ExternalSyntheticLambda36();

    private FileRefController$$ExternalSyntheticLambda36() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        FileRefController.lambda$onUpdateObjectReference$28(tLObject, tLRPC$TL_error);
    }
}
