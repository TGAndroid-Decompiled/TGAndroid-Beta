package org.telegram.messenger;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wv extends TLObject {
    public int f27767a;
    public TLRPC.TL_decryptedMessageLayer f27768b;
    public TLRPC.EncryptedFile f27769c;
    public boolean d;
    public int f27770e;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        inputSerializedData.readInt64(z10);
        this.f27767a = inputSerializedData.readInt32(z10);
        this.f27768b = TLRPC.TL_decryptedMessageLayer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        if (inputSerializedData.readBool(z10)) {
            this.f27769c = TLRPC.EncryptedFile.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        this.d = inputSerializedData.readBool(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        boolean z10;
        outputSerializedData.writeInt32(1431655929);
        outputSerializedData.writeInt64(0L);
        outputSerializedData.writeInt32(this.f27767a);
        this.f27768b.serializeToStream(outputSerializedData);
        if (this.f27769c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        outputSerializedData.writeBool(z10);
        TLRPC.EncryptedFile encryptedFile = this.f27769c;
        if (encryptedFile != null) {
            encryptedFile.serializeToStream(outputSerializedData);
        }
        outputSerializedData.writeBool(this.d);
    }
}
