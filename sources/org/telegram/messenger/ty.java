package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ty {
    public String f27128a;
    public String f27129b;
    public boolean f27130c;
    public String d;
    public boolean f27131e;
    public TLRPC.TL_inputStickerSetItem f27132f;
    public f20 f27133g;

    public final void a(int i7, TLRPC.InputFile inputFile, Runnable runnable) {
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = this.d;
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_uploadMedia, new sy(this, runnable), 2);
    }
}
