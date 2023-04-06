package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
public final class FileRefController$$ExternalSyntheticLambda35 implements RequestDelegate {
    public static final FileRefController$$ExternalSyntheticLambda35 INSTANCE = new FileRefController$$ExternalSyntheticLambda35();

    private FileRefController$$ExternalSyntheticLambda35() {
    }

    @Override
    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        FileRefController.lambda$onUpdateObjectReference$30(tLObject, tLRPC$TL_error);
    }
}
