package defpackage;

import org.telegram.tgnet.TLRPC;
public final class cn5 extends TLRPC.PhotoSize {
    public final TLRPC.Photo a;
    public final TLRPC.TL_inputPhoto b;

    public cn5(TLRPC.Photo photo) {
        this.a = photo;
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_inputPhoto.id = photo.id;
        tL_inputPhoto.file_reference = photo.file_reference;
        tL_inputPhoto.access_hash = photo.access_hash;
        this.b = tL_inputPhoto;
    }
}
