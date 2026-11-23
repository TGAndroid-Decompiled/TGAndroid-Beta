package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cc extends TLRPC.PhotoSize {
    public final TLRPC.Photo f23257a;
    public final TLRPC.TL_inputPhoto f23258b;

    public cc(TLRPC.Photo photo) {
        this.f23257a = photo;
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.f28417id = photo.f28422id;
        tL_inputPhoto.file_reference = photo.file_reference;
        tL_inputPhoto.access_hash = photo.access_hash;
        this.f23258b = tL_inputPhoto;
    }
}
