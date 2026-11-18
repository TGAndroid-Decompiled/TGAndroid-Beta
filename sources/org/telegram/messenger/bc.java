package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc extends TLRPC.PhotoSize {
    public final TLRPC.Photo f23052a;
    public final TLRPC.TL_inputPhoto f23053b;

    public bc(TLRPC.Photo photo) {
        this.f23052a = photo;
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.f28422id = photo.f28427id;
        tL_inputPhoto.file_reference = photo.file_reference;
        tL_inputPhoto.access_hash = photo.access_hash;
        this.f23053b = tL_inputPhoto;
    }
}
