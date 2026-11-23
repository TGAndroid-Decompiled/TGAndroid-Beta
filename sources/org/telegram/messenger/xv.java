package org.telegram.messenger;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xv extends TLObject {
    public int f27965a;
    public TLRPC.TL_decryptedMessageLayer f27966b;
    public TLRPC.EncryptedFile f27967c;
    public boolean d;
    public int f27968e;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        inputSerializedData.readInt64(z10);
        this.f27965a = inputSerializedData.readInt32(z10);
        this.f27966b = TLRPC.TL_decryptedMessageLayer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        if (inputSerializedData.readBool(z10)) {
            this.f27967c = TLRPC.EncryptedFile.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        this.d = inputSerializedData.readBool(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        boolean z10;
        outputSerializedData.writeInt32(1431655929);
        outputSerializedData.writeInt64(0L);
        outputSerializedData.writeInt32(this.f27965a);
        this.f27966b.serializeToStream(outputSerializedData);
        if (this.f27967c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        outputSerializedData.writeBool(z10);
        TLRPC.EncryptedFile encryptedFile = this.f27967c;
        if (encryptedFile != null) {
            encryptedFile.serializeToStream(outputSerializedData);
        }
        outputSerializedData.writeBool(this.d);
    }
}
