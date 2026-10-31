package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class ec extends TLRPC.PhotoSize {
    public final TLRPC.Photo f15375a;
    public final TLRPC.TL_inputPhoto f15376b;

    public ec(TLRPC.Photo photo) {
        this.f15375a = photo;
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.f19812id = photo.f19817id;
        tL_inputPhoto.file_reference = photo.file_reference;
        tL_inputPhoto.access_hash = photo.access_hash;
        this.f15376b = tL_inputPhoto;
    }
}
