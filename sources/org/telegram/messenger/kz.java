package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class kz {
    public String f16846a;
    public String f16847b;
    public boolean f16848c;
    public String d;
    public boolean e;
    public TLRPC.TL_inputStickerSetItem f16849f;
    public y20 f16850g;

    public final void a(int i10, TLRPC.InputFile inputFile, Runnable runnable) {
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = this.d;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_uploadMedia, new jz(this, runnable), 2);
    }
}
