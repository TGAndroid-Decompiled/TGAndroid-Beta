package org.telegram.messenger;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uv extends TLObject {
    public int f25781a;
    public TLRPC.TL_decryptedMessageLayer f25782b;
    public TLRPC.EncryptedFile f25783c;
    public boolean d;
    public int f25784e;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        inputSerializedData.readInt64(z10);
        this.f25781a = inputSerializedData.readInt32(z10);
        this.f25782b = TLRPC.TL_decryptedMessageLayer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        if (inputSerializedData.readBool(z10)) {
            this.f25783c = TLRPC.EncryptedFile.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        this.d = inputSerializedData.readBool(z10);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        boolean z10;
        outputSerializedData.writeInt32(1431655929);
        outputSerializedData.writeInt64(0L);
        outputSerializedData.writeInt32(this.f25781a);
        this.f25782b.serializeToStream(outputSerializedData);
        if (this.f25783c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        outputSerializedData.writeBool(z10);
        TLRPC.EncryptedFile encryptedFile = this.f25783c;
        if (encryptedFile != null) {
            encryptedFile.serializeToStream(outputSerializedData);
        }
        outputSerializedData.writeBool(this.d);
    }
}
