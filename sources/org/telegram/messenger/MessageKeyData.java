package org.telegram.messenger;

import org.telegram.tgnet.SerializedData;

public class MessageKeyData {
    public byte[] aesIv;
    public byte[] aesKey;

    public static MessageKeyData generateMessageKeyData(byte[] bArr, byte[] bArr2, boolean z, int i) {
        MessageKeyData messageKeyData = new MessageKeyData();
        if (bArr == null || bArr.length == 0) {
            messageKeyData.aesIv = null;
            messageKeyData.aesKey = null;
            return messageKeyData;
        }
        int i2 = z ? 8 : 0;
        if (i == 1) {
            SerializedData serializedData = new SerializedData();
            serializedData.writeBytes(bArr2);
            serializedData.writeBytes(bArr, i2, 32);
            byte[] computeSHA1 = Utilities.computeSHA1(serializedData.toByteArray());
            serializedData.cleanup();
            SerializedData serializedData2 = new SerializedData();
            serializedData2.writeBytes(bArr, i2 + 32, 16);
            serializedData2.writeBytes(bArr2);
            serializedData2.writeBytes(bArr, i2 + 48, 16);
            byte[] computeSHA12 = Utilities.computeSHA1(serializedData2.toByteArray());
            serializedData2.cleanup();
            SerializedData serializedData3 = new SerializedData();
            serializedData3.writeBytes(bArr, i2 + 64, 32);
            serializedData3.writeBytes(bArr2);
            byte[] computeSHA13 = Utilities.computeSHA1(serializedData3.toByteArray());
            serializedData3.cleanup();
            SerializedData serializedData4 = new SerializedData();
            serializedData4.writeBytes(bArr2);
            serializedData4.writeBytes(bArr, i2 + 96, 32);
            byte[] computeSHA14 = Utilities.computeSHA1(serializedData4.toByteArray());
            serializedData4.cleanup();
            SerializedData serializedData5 = new SerializedData();
            serializedData5.writeBytes(computeSHA1, 0, 8);
            serializedData5.writeBytes(computeSHA12, 8, 12);
            serializedData5.writeBytes(computeSHA13, 4, 12);
            messageKeyData.aesKey = serializedData5.toByteArray();
            serializedData5.cleanup();
            SerializedData serializedData6 = new SerializedData();
            serializedData6.writeBytes(computeSHA1, 8, 12);
            serializedData6.writeBytes(computeSHA12, 0, 8);
            serializedData6.writeBytes(computeSHA13, 16, 4);
            serializedData6.writeBytes(computeSHA14, 0, 8);
            messageKeyData.aesIv = serializedData6.toByteArray();
            serializedData6.cleanup();
        } else if (i == 2) {
            SerializedData serializedData7 = new SerializedData();
            serializedData7.writeBytes(bArr2, 0, 16);
            serializedData7.writeBytes(bArr, i2, 36);
            byte[] computeSHA256 = Utilities.computeSHA256(serializedData7.toByteArray());
            serializedData7.cleanup();
            SerializedData serializedData8 = new SerializedData();
            serializedData8.writeBytes(bArr, i2 + 40, 36);
            serializedData8.writeBytes(bArr2, 0, 16);
            byte[] computeSHA2562 = Utilities.computeSHA256(serializedData8.toByteArray());
            serializedData8.cleanup();
            SerializedData serializedData9 = new SerializedData();
            serializedData9.writeBytes(computeSHA256, 0, 8);
            serializedData9.writeBytes(computeSHA2562, 8, 16);
            serializedData9.writeBytes(computeSHA256, 24, 8);
            messageKeyData.aesKey = serializedData9.toByteArray();
            serializedData9.cleanup();
            SerializedData serializedData10 = new SerializedData();
            serializedData10.writeBytes(computeSHA2562, 0, 8);
            serializedData10.writeBytes(computeSHA256, 8, 16);
            serializedData10.writeBytes(computeSHA2562, 24, 8);
            messageKeyData.aesIv = serializedData10.toByteArray();
            serializedData10.cleanup();
        }
        return messageKeyData;
    }
}
