package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class ry {
    public String f25249a;
    public String f25250b;
    public boolean f25251c;
    public String d;
    public boolean f25252e;
    public TLRPC.TL_inputStickerSetItem f25253f;
    public b20 f25254g;

    public final void a(int i3, TLRPC.InputFile inputFile, Runnable runnable) {
        TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
        tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
        TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
        tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
        tL_inputMediaUploadedDocument.file = inputFile;
        tL_inputMediaUploadedDocument.mime_type = this.d;
        ConnectionsManager.getInstance(i3).sendRequest(tL_messages_uploadMedia, new qy(this, runnable), 2);
    }
}
