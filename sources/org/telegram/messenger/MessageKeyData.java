package org.telegram.messenger;

import org.telegram.tgnet.SerializedData;

public class MessageKeyData {
    public byte[] aesIv;
    public byte[] aesKey;

    public static MessageKeyData generateMessageKeyData(byte[] bArr, byte[] bArr2, boolean z10, int i10) {
        MessageKeyData messageKeyData = new MessageKeyData();
        if (bArr == null || bArr.length == 0) {
            messageKeyData.aesIv = null;
            messageKeyData.aesKey = null;
            return messageKeyData;
        }
        int i11 = z10 ? 8 : 0;
        if (i10 != 1) {
            if (i10 != 2) {
                return messageKeyData;
            }
            SerializedData serializedData = new SerializedData();
            serializedData.writeBytes(bArr2, 0, 16);
            serializedData.writeBytes(bArr, i11, 36);
            byte[] bArrComputeSHA256 = Utilities.computeSHA256(serializedData.toByteArray());
            serializedData.cleanup();
            SerializedData serializedData2 = new SerializedData();
            serializedData2.writeBytes(bArr, i11 + 40, 36);
            serializedData2.writeBytes(bArr2, 0, 16);
            byte[] bArrComputeSHA257 = Utilities.computeSHA256(serializedData2.toByteArray());
            serializedData2.cleanup();
            SerializedData serializedData3 = new SerializedData();
            serializedData3.writeBytes(bArrComputeSHA256, 0, 8);
            serializedData3.writeBytes(bArrComputeSHA257, 8, 16);
            serializedData3.writeBytes(bArrComputeSHA256, 24, 8);
            messageKeyData.aesKey = serializedData3.toByteArray();
            serializedData3.cleanup();
            SerializedData serializedData4 = new SerializedData();
            serializedData4.writeBytes(bArrComputeSHA257, 0, 8);
            serializedData4.writeBytes(bArrComputeSHA256, 8, 16);
            serializedData4.writeBytes(bArrComputeSHA257, 24, 8);
            messageKeyData.aesIv = serializedData4.toByteArray();
            serializedData4.cleanup();
            return messageKeyData;
        }
        SerializedData serializedData5 = new SerializedData();
        serializedData5.writeBytes(bArr2);
        serializedData5.writeBytes(bArr, i11, 32);
        byte[] bArrComputeSHA1 = Utilities.computeSHA1(serializedData5.toByteArray());
        serializedData5.cleanup();
        SerializedData serializedData6 = new SerializedData();
        serializedData6.writeBytes(bArr, i11 + 32, 16);
        serializedData6.writeBytes(bArr2);
        serializedData6.writeBytes(bArr, i11 + 48, 16);
        byte[] bArrComputeSHA2 = Utilities.computeSHA1(serializedData6.toByteArray());
        serializedData6.cleanup();
        SerializedData serializedData7 = new SerializedData();
        serializedData7.writeBytes(bArr, i11 + 64, 32);
        serializedData7.writeBytes(bArr2);
        byte[] bArrComputeSHA3 = Utilities.computeSHA1(serializedData7.toByteArray());
        serializedData7.cleanup();
        SerializedData serializedData8 = new SerializedData();
        serializedData8.writeBytes(bArr2);
        serializedData8.writeBytes(bArr, i11 + 96, 32);
        byte[] bArrComputeSHA4 = Utilities.computeSHA1(serializedData8.toByteArray());
        serializedData8.cleanup();
        SerializedData serializedData9 = new SerializedData();
        serializedData9.writeBytes(bArrComputeSHA1, 0, 8);
        serializedData9.writeBytes(bArrComputeSHA2, 8, 12);
        serializedData9.writeBytes(bArrComputeSHA3, 4, 12);
        messageKeyData.aesKey = serializedData9.toByteArray();
        serializedData9.cleanup();
        SerializedData serializedData10 = new SerializedData();
        serializedData10.writeBytes(bArrComputeSHA1, 8, 12);
        serializedData10.writeBytes(bArrComputeSHA2, 0, 8);
        serializedData10.writeBytes(bArrComputeSHA3, 16, 4);
        serializedData10.writeBytes(bArrComputeSHA4, 0, 8);
        messageKeyData.aesIv = serializedData10.toByteArray();
        serializedData10.cleanup();
        return messageKeyData;
    }
}
