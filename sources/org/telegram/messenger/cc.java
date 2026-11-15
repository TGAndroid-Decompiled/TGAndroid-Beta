package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class cc extends TLRPC.PhotoSize {
    public final TLRPC.Photo f22856a;
    public final TLRPC.TL_inputPhoto f22857b;

    public cc(TLRPC.Photo photo) {
        this.f22856a = photo;
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.f28070id = photo.f28075id;
        tL_inputPhoto.file_reference = photo.file_reference;
        tL_inputPhoto.access_hash = photo.access_hash;
        this.f22857b = tL_inputPhoto;
    }
}
