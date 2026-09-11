package org.telegram.messenger;

import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public class MessageCustomParamsHelper {

    public static class Params_v1 extends TLObject {
        private static final int VERSION = 1;
        int flags;
        final TLRPC.Message message;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            boolean z11;
            boolean z12 = true;
            int readInt32 = inputSerializedData.readInt32(true);
            this.flags = readInt32;
            if ((readInt32 & 1) != 0) {
                this.message.voiceTranscription = inputSerializedData.readString(z10);
            }
            TLRPC.Message message = this.message;
            int i10 = this.flags;
            if ((i10 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            message.voiceTranscriptionForce = z11;
            if ((i10 & 512) == 0) {
                z12 = false;
            }
            message.summarizedOpen = z12;
            message.voiceTranscriptionOpen = inputSerializedData.readBool(z10);
            this.message.voiceTranscriptionFinal = inputSerializedData.readBool(z10);
            this.message.voiceTranscriptionRated = inputSerializedData.readBool(z10);
            this.message.voiceTranscriptionId = inputSerializedData.readInt64(z10);
            this.message.premiumEffectWasPlayed = inputSerializedData.readBool(z10);
            if ((this.flags & 4) != 0) {
                this.message.originalLanguage = inputSerializedData.readString(z10);
            }
            if ((this.flags & 8) != 0) {
                this.message.translatedToLanguage = inputSerializedData.readString(z10);
            }
            if ((this.flags & 16) != 0) {
                this.message.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if ((this.flags & 32) != 0) {
                this.message.translatedPoll = TranslateController.PollText.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if ((this.flags & 64) != 0) {
                this.message.errorAllowedPriceStars = inputSerializedData.readInt64(z10);
            }
            if ((this.flags & 128) != 0) {
                this.message.errorNewPriceStars = inputSerializedData.readInt64(z10);
            }
            if ((this.flags & 256) != 0) {
                this.message.translatedVoiceTranscription = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.message.summaryText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.message.translatedSummaryText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 4096)) {
                this.message.translatedSummaryLanguage = inputSerializedData.readString(z10);
            }
            if (TLObject.hasFlag(this.flags, 8192)) {
                this.message.translatedRichMessage = TL_iv.RichMessage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            int i10;
            int i11;
            outputSerializedData.writeInt32(1);
            TLRPC.Message message = this.message;
            if (message.voiceTranscriptionForce) {
                i10 = this.flags | 2;
            } else {
                i10 = this.flags & (-3);
            }
            this.flags = i10;
            if (message.summarizedOpen) {
                i11 = i10 | 512;
            } else {
                i11 = i10 & (-513);
            }
            this.flags = i11;
            outputSerializedData.writeInt32(i11);
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

        private Params_v1(TLRPC.Message message) {
            this.flags = 0;
            this.message = message;
            int i10 = message.voiceTranscription != null ? 1 : 0;
            this.flags = i10;
            int i11 = i10 | (message.voiceTranscriptionForce ? 2 : 0);
            this.flags = i11;
            int i12 = i11 | (message.originalLanguage != null ? 4 : 0);
            this.flags = i12;
            int i13 = i12 | (message.translatedToLanguage != null ? 8 : 0);
            this.flags = i13;
            int i14 = i13 | (message.translatedText != null ? 16 : 0);
            this.flags = i14;
            int i15 = i14 | (message.translatedPoll != null ? 32 : 0);
            this.flags = i15;
            int i16 = i15 | (message.errorAllowedPriceStars != 0 ? 64 : 0);
            this.flags = i16;
            int i17 = i16 | (message.errorNewPriceStars != 0 ? 128 : 0);
            this.flags = i17;
            int i18 = i17 | (message.translatedVoiceTranscription != null ? 256 : 0);
            this.flags = i18;
            int flag = TLObject.setFlag(i18, 1024, message.summaryText != null);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2048, message.translatedSummaryText != null);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4096, message.translatedSummaryLanguage != null);
            this.flags = flag3;
            this.flags = TLObject.setFlag(flag3, 8192, message.translatedRichMessage != null);
        }
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

    public static boolean isEmpty(TLRPC.Message message) {
        if (message.voiceTranscription == null && message.translatedVoiceTranscription == null && !message.voiceTranscriptionOpen && !message.summarizedOpen && message.summaryText == null && message.translatedSummaryLanguage == null && message.translatedSummaryText == null && !message.voiceTranscriptionFinal && !message.voiceTranscriptionRated && !message.voiceTranscriptionForce && message.voiceTranscriptionId == 0 && !message.premiumEffectWasPlayed && message.originalLanguage == null && message.translatedToLanguage == null && message.translatedPoll == null && message.translatedText == null && message.translatedRichMessage == null && message.errorAllowedPriceStars == 0 && message.errorNewPriceStars == 0) {
            return true;
        }
        return false;
    }

    public static void readLocalParams(TLRPC.Message message, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return;
        }
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 1) {
            new Params_v1(message).readParams(nativeByteBuffer, true);
            return;
        }
        throw new RuntimeException(i2.g.i(readInt32, "can't read params version = "));
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
        } catch (Exception e7) {
            e7.printStackTrace();
            return null;
        }
    }
}
