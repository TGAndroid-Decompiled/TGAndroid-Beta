package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class wb extends TLRPC.PhotoSize {
    public final TLRPC.Photo f26181a;
    public final TLRPC.TL_inputPhoto f26182b;

    public wb(TLRPC.Photo photo) {
        this.f26181a = photo;
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.f27020id = photo.f27025id;
        tL_inputPhoto.file_reference = photo.file_reference;
        tL_inputPhoto.access_hash = photo.access_hash;
        this.f26182b = tL_inputPhoto;
    }
}
