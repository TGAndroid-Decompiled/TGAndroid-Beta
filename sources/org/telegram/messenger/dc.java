package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class dc extends TLRPC.PhotoSize {
    public final TLRPC.Photo f21980a;
    public final TLRPC.TL_inputPhoto f21981b;

    public dc(TLRPC.Photo photo) {
        this.f21980a = photo;
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.f26971id = photo.f26976id;
        tL_inputPhoto.file_reference = photo.file_reference;
        tL_inputPhoto.access_hash = photo.access_hash;
        this.f21981b = tL_inputPhoto;
    }
}
