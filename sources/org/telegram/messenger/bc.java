package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc extends TLRPC.PhotoSize {
    public final TLRPC.Photo f23080a;
    public final TLRPC.TL_inputPhoto f23081b;

    public bc(TLRPC.Photo photo) {
        this.f23080a = photo;
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.f28450id = photo.f28455id;
        tL_inputPhoto.file_reference = photo.file_reference;
        tL_inputPhoto.access_hash = photo.access_hash;
        this.f23081b = tL_inputPhoto;
    }
}
