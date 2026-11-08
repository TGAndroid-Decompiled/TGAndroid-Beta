package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dc extends TLRPC.PhotoSize {
    public final TLRPC.Photo f22010a;
    public final TLRPC.TL_inputPhoto f22011b;

    public dc(TLRPC.Photo photo) {
        this.f22010a = photo;
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.f26975id = photo.f26980id;
        tL_inputPhoto.file_reference = photo.file_reference;
        tL_inputPhoto.access_hash = photo.access_hash;
        this.f22011b = tL_inputPhoto;
    }
}
