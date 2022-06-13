package org.telegram.messenger;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Message;

public class MessageCustomParamsHelper {
    public static boolean isEmpty(TLRPC$Message tLRPC$Message) {
        return tLRPC$Message.voiceTranscription == null && !tLRPC$Message.voiceTranscriptionOpen && !tLRPC$Message.voiceTranscriptionFinal && !tLRPC$Message.voiceTranscriptionRated && tLRPC$Message.voiceTranscriptionId == 0 && !tLRPC$Message.premiumEffectWasPlayed;
    }

    public static void copyParams(TLRPC$Message tLRPC$Message, TLRPC$Message tLRPC$Message2) {
        tLRPC$Message2.voiceTranscription = tLRPC$Message.voiceTranscription;
        tLRPC$Message2.voiceTranscriptionOpen = tLRPC$Message.voiceTranscriptionOpen;
        tLRPC$Message2.voiceTranscriptionFinal = tLRPC$Message.voiceTranscriptionFinal;
        tLRPC$Message2.voiceTranscriptionRated = tLRPC$Message.voiceTranscriptionRated;
        tLRPC$Message2.voiceTranscriptionId = tLRPC$Message.voiceTranscriptionId;
        tLRPC$Message2.premiumEffectWasPlayed = tLRPC$Message.premiumEffectWasPlayed;
    }

    public static void readLocalParams(TLRPC$Message tLRPC$Message, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer != null) {
            int readInt32 = nativeByteBuffer.readInt32(true);
            if (readInt32 == 1) {
                new Params_v1(tLRPC$Message).readParams(nativeByteBuffer, true);
                return;
            }
            throw new RuntimeException("can't read params version = " + readInt32);
        }
    }

    public static NativeByteBuffer writeLocalParams(TLRPC$Message tLRPC$Message) {
        if (isEmpty(tLRPC$Message)) {
            return null;
        }
        Params_v1 params_v1 = new Params_v1(tLRPC$Message);
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(params_v1.getObjectSize());
            params_v1.serializeToStream(nativeByteBuffer);
            return nativeByteBuffer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static class Params_v1 extends TLObject {
        private static final int VERSION = 1;
        int flags;
        final TLRPC$Message message;

        private Params_v1(TLRPC$Message tLRPC$Message) {
            this.flags = 0;
            this.message = tLRPC$Message;
            this.flags = 0 + (tLRPC$Message.voiceTranscription != null ? 1 : 0);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(1);
            abstractSerializedData.writeInt32(this.flags);
            if ((1 & this.flags) != 0) {
                abstractSerializedData.writeString(this.message.voiceTranscription);
            }
            abstractSerializedData.writeBool(this.message.voiceTranscriptionOpen);
            abstractSerializedData.writeBool(this.message.voiceTranscriptionFinal);
            abstractSerializedData.writeBool(this.message.voiceTranscriptionRated);
            abstractSerializedData.writeInt64(this.message.voiceTranscriptionId);
            abstractSerializedData.writeBool(this.message.premiumEffectWasPlayed);
        }

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            int readInt32 = abstractSerializedData.readInt32(true);
            this.flags = readInt32;
            if ((1 & readInt32) != 0) {
                this.message.voiceTranscription = abstractSerializedData.readString(z);
            }
            this.message.voiceTranscriptionOpen = abstractSerializedData.readBool(z);
            this.message.voiceTranscriptionFinal = abstractSerializedData.readBool(z);
            this.message.voiceTranscriptionRated = abstractSerializedData.readBool(z);
            this.message.voiceTranscriptionId = abstractSerializedData.readInt64(z);
            this.message.premiumEffectWasPlayed = abstractSerializedData.readBool(z);
        }
    }
}
