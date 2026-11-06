package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dc extends TLRPC.PhotoSize {
    public final TLRPC.Photo f21987a;
    public final TLRPC.TL_inputPhoto f21988b;

    public dc(TLRPC.Photo photo) {
        this.f21987a = photo;
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.f26972id = photo.f26977id;
        tL_inputPhoto.file_reference = photo.file_reference;
        tL_inputPhoto.access_hash = photo.access_hash;
        this.f21988b = tL_inputPhoto;
    }
}
