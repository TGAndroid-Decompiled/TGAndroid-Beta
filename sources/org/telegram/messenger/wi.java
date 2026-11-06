package org.telegram.messenger;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class wi extends TLObject {
    public final TLRPC.Message f26319a;
    public int f26320b;

    public wi(TLRPC.Message message) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        this.f26320b = 0;
        this.f26319a = message;
        if (message.voiceTranscription != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        this.f26320b = i7;
        if (message.voiceTranscriptionForce) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i18 = i7 | i10;
        this.f26320b = i18;
        if (message.originalLanguage != null) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        int i19 = i18 | i11;
        this.f26320b = i19;
        if (message.translatedToLanguage != null) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        int i20 = i19 | i12;
        this.f26320b = i20;
        if (message.translatedText != null) {
            i13 = 16;
        } else {
            i13 = 0;
        }
        int i21 = i20 | i13;
        this.f26320b = i21;
        if (message.translatedPoll != null) {
            i14 = 32;
        } else {
            i14 = 0;
        }
        int i22 = i21 | i14;
        this.f26320b = i22;
        if (message.errorAllowedPriceStars != 0) {
            i15 = 64;
        } else {
            i15 = 0;
        }
        int i23 = i22 | i15;
        this.f26320b = i23;
        if (message.errorNewPriceStars != 0) {
            i16 = 128;
        } else {
            i16 = 0;
        }
        int i24 = i23 | i16;
        this.f26320b = i24;
        if (message.translatedVoiceTranscription != null) {
            i17 = 256;
        } else {
            i17 = 0;
        }
        int i25 = i24 | i17;
        this.f26320b = i25;
        if (message.summaryText != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        int flag = TLObject.setFlag(i25, 1024, z9);
        this.f26320b = flag;
        if (message.translatedSummaryText != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int flag2 = TLObject.setFlag(flag, 2048, z10);
        this.f26320b = flag2;
        if (message.translatedSummaryLanguage != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        int flag3 = TLObject.setFlag(flag2, 4096, z11);
        this.f26320b = flag3;
        if (message.translatedRichMessage != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int flag4 = TLObject.setFlag(flag3, 8192, z12);
        this.f26320b = flag4;
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction instanceof TLRPC.TL_messageActionGramTransfer) && ((TLRPC.TL_messageActionGramTransfer) messageAction).comment_encrypted_preparing) {
            z13 = true;
        }
        this.f26320b = TLObject.setFlag(flag4, 16384, z13);
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z9) {
        boolean z10;
        c10 c10Var;
        boolean z11;
        boolean z12 = true;
        int readInt32 = inputSerializedData.readInt32(true);
        this.f26320b = readInt32;
        TLRPC.Message message = this.f26319a;
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
            if (!tL_messageActionGramTransfer.comment_encrypted && TLObject.hasFlag(readInt32, 16384)) {
                z11 = true;
            } else {
                z11 = false;
            }
            tL_messageActionGramTransfer.comment_encrypted_preparing = z11;
        }
        if ((this.f26320b & 1) != 0) {
            message.voiceTranscription = inputSerializedData.readString(z9);
        }
        int i7 = this.f26320b;
        if ((i7 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        message.voiceTranscriptionForce = z10;
        if ((i7 & 512) == 0) {
            z12 = false;
        }
        message.summarizedOpen = z12;
        message.voiceTranscriptionOpen = inputSerializedData.readBool(z9);
        message.voiceTranscriptionFinal = inputSerializedData.readBool(z9);
        message.voiceTranscriptionRated = inputSerializedData.readBool(z9);
        message.voiceTranscriptionId = inputSerializedData.readInt64(z9);
        message.premiumEffectWasPlayed = inputSerializedData.readBool(z9);
        if ((this.f26320b & 4) != 0) {
            message.originalLanguage = inputSerializedData.readString(z9);
        }
        if ((this.f26320b & 8) != 0) {
            message.translatedToLanguage = inputSerializedData.readString(z9);
        }
        if ((this.f26320b & 16) != 0) {
            message.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        }
        if ((this.f26320b & 32) != 0) {
            int readInt322 = inputSerializedData.readInt32(z9);
            if (613759672 != readInt322) {
                c10Var = null;
            } else {
                c10Var = new c10();
            }
            message.translatedPoll = (c10) TLObject.TLdeserialize(c10.class, c10Var, inputSerializedData, readInt322, z9);
        }
        if ((this.f26320b & 64) != 0) {
            message.errorAllowedPriceStars = inputSerializedData.readInt64(z9);
        }
        if ((this.f26320b & 128) != 0) {
            message.errorNewPriceStars = inputSerializedData.readInt64(z9);
        }
        if ((this.f26320b & 256) != 0) {
            message.translatedVoiceTranscription = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        }
        if (TLObject.hasFlag(this.f26320b, 1024)) {
            message.summaryText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        }
        if (TLObject.hasFlag(this.f26320b, 2048)) {
            message.translatedSummaryText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        }
        if (TLObject.hasFlag(this.f26320b, 4096)) {
            message.translatedSummaryLanguage = inputSerializedData.readString(z9);
        }
        if (TLObject.hasFlag(this.f26320b, 8192)) {
            message.translatedRichMessage = TL_iv.RichMessage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z9), z9);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i7;
        int i10;
        outputSerializedData.writeInt32(1);
        TLRPC.Message message = this.f26319a;
        if (message.voiceTranscriptionForce) {
            i7 = this.f26320b | 2;
        } else {
            i7 = this.f26320b & (-3);
        }
        this.f26320b = i7;
        if (message.summarizedOpen) {
            i10 = i7 | 512;
        } else {
            i10 = i7 & (-513);
        }
        this.f26320b = i10;
        outputSerializedData.writeInt32(i10);
        if ((1 & this.f26320b) != 0) {
            outputSerializedData.writeString(message.voiceTranscription);
        }
        outputSerializedData.writeBool(message.voiceTranscriptionOpen);
        outputSerializedData.writeBool(message.voiceTranscriptionFinal);
        outputSerializedData.writeBool(message.voiceTranscriptionRated);
        outputSerializedData.writeInt64(message.voiceTranscriptionId);
        outputSerializedData.writeBool(message.premiumEffectWasPlayed);
        if ((this.f26320b & 4) != 0) {
            outputSerializedData.writeString(message.originalLanguage);
        }
        if ((this.f26320b & 8) != 0) {
            outputSerializedData.writeString(message.translatedToLanguage);
        }
        if ((this.f26320b & 16) != 0) {
            message.translatedText.serializeToStream(outputSerializedData);
        }
        if ((this.f26320b & 32) != 0) {
            message.translatedPoll.serializeToStream(outputSerializedData);
        }
        if ((this.f26320b & 64) != 0) {
            outputSerializedData.writeInt64(message.errorAllowedPriceStars);
        }
        if ((this.f26320b & 128) != 0) {
            outputSerializedData.writeInt64(message.errorNewPriceStars);
        }
        if ((this.f26320b & 256) != 0) {
            message.translatedVoiceTranscription.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.f26320b, 1024)) {
            message.summaryText.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.f26320b, 2048)) {
            message.translatedSummaryText.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.f26320b, 4096)) {
            outputSerializedData.writeString(message.translatedSummaryLanguage);
        }
        if (TLObject.hasFlag(this.f26320b, 8192)) {
            message.translatedRichMessage.serializeToStream(outputSerializedData);
        }
    }
}
