package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

public class MessageCustomParamsHelper {
    public static boolean isEmpty(TLRPC.Message message) {
        return message.voiceTranscription == null && message.translatedVoiceTranscription == null && !message.voiceTranscriptionOpen && !message.summarizedOpen && message.summaryText == null && message.translatedSummaryLanguage == null && message.translatedSummaryText == null && !message.voiceTranscriptionFinal && !message.voiceTranscriptionRated && !message.voiceTranscriptionForce && message.voiceTranscriptionId == 0 && !message.premiumEffectWasPlayed && message.originalLanguage == null && message.translatedToLanguage == null && message.translatedPoll == null && message.translatedText == null && message.translatedRichMessage == null && message.errorAllowedPriceStars == 0 && message.errorNewPriceStars == 0;
    }

    public static void copyParams(TLRPC.Message message, TLRPC.Message message2) {
        message2.voiceTranscription = message.voiceTranscription;
        message2.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
        message2.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
        message2.voiceTranscriptionForce = message.voiceTranscriptionForce;
        message2.voiceTranscriptionRated = message.voiceTranscriptionRated;
        message2.voiceTranscriptionId = message.voiceTranscriptionId;
        message2.premiumEffectWasPlayed = message.premiumEffectWasPlayed;
        message2.originalLanguage = message.originalLanguage;
        message2.translatedToLanguage = message.translatedToLanguage;
        message2.translatedPoll = message.translatedPoll;
        message2.translatedText = message.translatedText;
        message2.translatedRichMessage = message.translatedRichMessage;
        message2.errorAllowedPriceStars = message.errorAllowedPriceStars;
        message2.errorNewPriceStars = message.errorNewPriceStars;
        message2.translatedVoiceTranscription = message.translatedVoiceTranscription;
        message2.summarizedOpen = message.summarizedOpen;
        message2.summaryText = message.summaryText;
        message2.translatedSummaryText = message.translatedSummaryText;
        message2.translatedSummaryLanguage = message.translatedSummaryLanguage;
    }

    public static void readLocalParams(TLRPC.Message message, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return;
        }
        int int32 = nativeByteBuffer.readInt32(true);
        if (int32 != 1) {
            throw new RuntimeException("can't read params version = " + int32);
        }
        new Params_v1(message).readParams(nativeByteBuffer, true);
    }

    public static NativeByteBuffer writeLocalParams(TLRPC.Message message) {
        if (isEmpty(message)) {
            return null;
        }
        Params_v1 params_v1 = new Params_v1(message);
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(params_v1.getObjectSize());
            params_v1.serializeToStream(nativeByteBuffer);
            return nativeByteBuffer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static class Params_v1 extends TLObject {
        private static final int VERSION = 1;
        int flags;
        final TLRPC.Message message;

        private Params_v1(TLRPC.Message message) {
            this.flags = 0;
            this.message = message;
            int i = message.voiceTranscription != null ? 1 : 0;
            this.flags = i;
            int i2 = i | (message.voiceTranscriptionForce ? 2 : 0);
            this.flags = i2;
            int i3 = i2 | (message.originalLanguage != null ? 4 : 0);
            this.flags = i3;
            int i4 = i3 | (message.translatedToLanguage != null ? 8 : 0);
            this.flags = i4;
            int i5 = i4 | (message.translatedText != null ? 16 : 0);
            this.flags = i5;
            int i6 = i5 | (message.translatedPoll != null ? 32 : 0);
            this.flags = i6;
            int i7 = i6 | (message.errorAllowedPriceStars != 0 ? 64 : 0);
            this.flags = i7;
            int i8 = i7 | (message.errorNewPriceStars != 0 ? 128 : 0);
            this.flags = i8;
            int i9 = i8 | (message.translatedVoiceTranscription != null ? 256 : 0);
            this.flags = i9;
            int flag = TLObject.setFlag(i9, 1024, message.summaryText != null);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2048, message.translatedSummaryText != null);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4096, message.translatedSummaryLanguage != null);
            this.flags = flag3;
            this.flags = TLObject.setFlag(flag3, 8192, message.translatedRichMessage != null);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1);
            TLRPC.Message message = this.message;
            int i = message.voiceTranscriptionForce ? this.flags | 2 : this.flags & (-3);
            this.flags = i;
            int i2 = message.summarizedOpen ? i | 512 : i & (-513);
            this.flags = i2;
            outputSerializedData.writeInt32(i2);
            if ((1 & this.flags) != 0) {
                outputSerializedData.writeString(this.message.voiceTranscription);
            }
            outputSerializedData.writeBool(this.message.voiceTranscriptionOpen);
            outputSerializedData.writeBool(this.message.voiceTranscriptionFinal);
            outputSerializedData.writeBool(this.message.voiceTranscriptionRated);
            outputSerializedData.writeInt64(this.message.voiceTranscriptionId);
            outputSerializedData.writeBool(this.message.premiumEffectWasPlayed);
            if ((this.flags & 4) != 0) {
                outputSerializedData.writeString(this.message.originalLanguage);
            }
            if ((this.flags & 8) != 0) {
                outputSerializedData.writeString(this.message.translatedToLanguage);
            }
            if ((this.flags & 16) != 0) {
                this.message.translatedText.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 32) != 0) {
                this.message.translatedPoll.serializeToStream(outputSerializedData);
            }
            if ((this.flags & 64) != 0) {
                outputSerializedData.writeInt64(this.message.errorAllowedPriceStars);
            }
            if ((this.flags & 128) != 0) {
                outputSerializedData.writeInt64(this.message.errorNewPriceStars);
            }
            if ((this.flags & 256) != 0) {
                this.message.translatedVoiceTranscription.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.message.summaryText.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.message.translatedSummaryText.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                outputSerializedData.writeString(this.message.translatedSummaryLanguage);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.message.translatedRichMessage.serializeToStream(outputSerializedData);
            }
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(true);
            this.flags = int32;
            if ((int32 & 1) != 0) {
                this.message.voiceTranscription = inputSerializedData.readString(z);
            }
            TLRPC.Message message = this.message;
            int i = this.flags;
            message.voiceTranscriptionForce = (i & 2) != 0;
            message.summarizedOpen = (i & 512) != 0;
            message.voiceTranscriptionOpen = inputSerializedData.readBool(z);
            this.message.voiceTranscriptionFinal = inputSerializedData.readBool(z);
            this.message.voiceTranscriptionRated = inputSerializedData.readBool(z);
            this.message.voiceTranscriptionId = inputSerializedData.readInt64(z);
            this.message.premiumEffectWasPlayed = inputSerializedData.readBool(z);
            if ((this.flags & 4) != 0) {
                this.message.originalLanguage = inputSerializedData.readString(z);
            }
            if ((this.flags & 8) != 0) {
                this.message.translatedToLanguage = inputSerializedData.readString(z);
            }
            if ((this.flags & 16) != 0) {
                this.message.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 32) != 0) {
                this.message.translatedPoll = TranslateController.PollText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if ((this.flags & 64) != 0) {
                this.message.errorAllowedPriceStars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 128) != 0) {
                this.message.errorNewPriceStars = inputSerializedData.readInt64(z);
            }
            if ((this.flags & 256) != 0) {
                this.message.translatedVoiceTranscription = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.message.summaryText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.message.translatedSummaryText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.message.translatedSummaryLanguage = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.message.translatedRichMessage = TL_iv.RichMessage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }
    }
}
