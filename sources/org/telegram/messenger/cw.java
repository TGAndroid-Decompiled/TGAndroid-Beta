package org.telegram.messenger;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cw extends TLObject {
    public int f21939a;
    public TLRPC.TL_decryptedMessageLayer f21940b;
    public TLRPC.EncryptedFile f21941c;
    public boolean d;
    public int f21942e;

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        inputSerializedData.readInt64(z9);
        this.f21939a = inputSerializedData.readInt32(z9);
        this.f21940b = TLRPC.TL_decryptedMessageLayer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        if (inputSerializedData.readBool(z9)) {
            this.f21941c = TLRPC.EncryptedFile.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        }
        this.d = inputSerializedData.readBool(z9);
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        boolean z9;
        outputSerializedData.writeInt32(1431655929);
        outputSerializedData.writeInt64(0L);
        outputSerializedData.writeInt32(this.f21939a);
        this.f21940b.serializeToStream(outputSerializedData);
        if (this.f21941c != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        outputSerializedData.writeBool(z9);
        TLRPC.EncryptedFile encryptedFile = this.f21941c;
        if (encryptedFile != null) {
            encryptedFile.serializeToStream(outputSerializedData);
        }
        outputSerializedData.writeBool(this.d);
    }
}
