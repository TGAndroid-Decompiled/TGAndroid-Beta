package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dc extends TLRPC.PhotoSize {
    public final TLRPC.Photo f22014a;
    public final TLRPC.TL_inputPhoto f22015b;

    public dc(TLRPC.Photo photo) {
        this.f22014a = photo;
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.f26979id = photo.f26984id;
        tL_inputPhoto.file_reference = photo.file_reference;
        tL_inputPhoto.access_hash = photo.access_hash;
        this.f22015b = tL_inputPhoto;
    }
}
