package org.telegram.messenger;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ow extends TLObject {
    public int f17516a;
    public TLRPC.TL_decryptedMessageLayer f17517b;
    public TLRPC.EncryptedFile f17518c;
    public boolean d;
    public int e;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        inputSerializedData.readInt64(z10);
        this.f17516a = inputSerializedData.readInt32(z10);
        this.f17517b = TLRPC.TL_decryptedMessageLayer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        if (inputSerializedData.readBool(z10)) {
            this.f17518c = TLRPC.EncryptedFile.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        this.d = inputSerializedData.readBool(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        boolean z10;
        outputSerializedData.writeInt32(1431655929);
        outputSerializedData.writeInt64(0L);
        outputSerializedData.writeInt32(this.f17516a);
        this.f17517b.serializeToStream(outputSerializedData);
        if (this.f17518c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        outputSerializedData.writeBool(z10);
        TLRPC.EncryptedFile encryptedFile = this.f17518c;
        if (encryptedFile != null) {
            encryptedFile.serializeToStream(outputSerializedData);
        }
        outputSerializedData.writeBool(this.d);
    }
}
