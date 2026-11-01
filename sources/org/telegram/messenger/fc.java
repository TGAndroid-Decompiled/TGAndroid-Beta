package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class fc extends TLRPC.PhotoSize {
    public final TLRPC.Photo f15716a;
    public final TLRPC.TL_inputPhoto f15717b;

    public fc(TLRPC.Photo photo) {
        this.f15716a = photo;
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.f19813id = photo.f19818id;
        tL_inputPhoto.file_reference = photo.file_reference;
        tL_inputPhoto.access_hash = photo.access_hash;
        this.f15717b = tL_inputPhoto;
    }
}
