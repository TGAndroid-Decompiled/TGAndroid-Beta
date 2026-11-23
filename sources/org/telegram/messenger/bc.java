package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class bc extends TLRPC.PhotoSize {
    public final TLRPC.Photo f23177a;
    public final TLRPC.TL_inputPhoto f23178b;

    public bc(TLRPC.Photo photo) {
        this.f23177a = photo;
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.f28511id = photo.f28516id;
        tL_inputPhoto.file_reference = photo.file_reference;
        tL_inputPhoto.access_hash = photo.access_hash;
        this.f23178b = tL_inputPhoto;
    }
}
