package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc extends TLRPC.PhotoSize {
    public final TLRPC.Photo f23055a;
    public final TLRPC.TL_inputPhoto f23056b;

    public bc(TLRPC.Photo photo) {
        this.f23055a = photo;
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.f28424id = photo.f28429id;
        tL_inputPhoto.file_reference = photo.file_reference;
        tL_inputPhoto.access_hash = photo.access_hash;
        this.f23056b = tL_inputPhoto;
    }
}
