package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cc extends TLRPC.PhotoSize {
    public final TLRPC.Photo f23293a;
    public final TLRPC.TL_inputPhoto f23294b;

    public cc(TLRPC.Photo photo) {
        this.f23293a = photo;
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.f28453id = photo.f28458id;
        tL_inputPhoto.file_reference = photo.file_reference;
        tL_inputPhoto.access_hash = photo.access_hash;
        this.f23294b = tL_inputPhoto;
    }
}
