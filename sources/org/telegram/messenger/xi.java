package org.telegram.messenger;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class xi extends TLObject {
    public final TLRPC.Message f19442a;
    public int f19443b;

    public xi(TLRPC.Message message) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        this.f19443b = 0;
        this.f19442a = message;
        if (message.voiceTranscription != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.f19443b = i10;
        if (message.voiceTranscriptionForce) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        int i19 = i10 | i11;
        this.f19443b = i19;
        if (message.originalLanguage != null) {
            i12 = 4;
        } else {
            i12 = 0;
        }
        int i20 = i19 | i12;
        this.f19443b = i20;
        if (message.translatedToLanguage != null) {
            i13 = 8;
        } else {
            i13 = 0;
        }
        int i21 = i20 | i13;
        this.f19443b = i21;
        if (message.translatedText != null) {
            i14 = 16;
        } else {
            i14 = 0;
        }
        int i22 = i21 | i14;
        this.f19443b = i22;
        if (message.translatedPoll != null) {
            i15 = 32;
        } else {
            i15 = 0;
        }
        int i23 = i22 | i15;
        this.f19443b = i23;
        if (message.errorAllowedPriceStars != 0) {
            i16 = 64;
        } else {
            i16 = 0;
        }
        int i24 = i23 | i16;
        this.f19443b = i24;
        if (message.errorNewPriceStars != 0) {
            i17 = 128;
        } else {
            i17 = 0;
        }
        int i25 = i24 | i17;
        this.f19443b = i25;
        if (message.translatedVoiceTranscription != null) {
            i18 = 256;
        } else {
            i18 = 0;
        }
        int i26 = i25 | i18;
        this.f19443b = i26;
        if (message.summaryText != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int flag = TLObject.setFlag(i26, 1024, z10);
        this.f19443b = flag;
        if (message.translatedSummaryText != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        int flag2 = TLObject.setFlag(flag, 2048, z11);
        this.f19443b = flag2;
        if (message.translatedSummaryLanguage != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int flag3 = TLObject.setFlag(flag2, 4096, z12);
        this.f19443b = flag3;
        if (message.translatedRichMessage != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int flag4 = TLObject.setFlag(flag3, 8192, z13);
        this.f19443b = flag4;
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction instanceof TLRPC.TL_messageActionGramTransfer) && ((TLRPC.TL_messageActionGramTransfer) messageAction).comment_encrypted_preparing) {
            z14 = true;
        }
        this.f19443b = TLObject.setFlag(flag4, 16384, z14);
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11;
        r10 r10Var;
        boolean z12;
        boolean z13 = true;
        int readInt32 = inputSerializedData.readInt32(true);
        this.f19443b = readInt32;
        TLRPC.Message message = this.f19442a;
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
            if (!tL_messageActionGramTransfer.comment_encrypted && TLObject.hasFlag(readInt32, 16384)) {
                z12 = true;
            } else {
                z12 = false;
            }
            tL_messageActionGramTransfer.comment_encrypted_preparing = z12;
        }
        if ((this.f19443b & 1) != 0) {
            message.voiceTranscription = inputSerializedData.readString(z10);
        }
        int i10 = this.f19443b;
        if ((i10 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        message.voiceTranscriptionForce = z11;
        if ((i10 & 512) == 0) {
            z13 = false;
        }
        message.summarizedOpen = z13;
        message.voiceTranscriptionOpen = inputSerializedData.readBool(z10);
        message.voiceTranscriptionFinal = inputSerializedData.readBool(z10);
        message.voiceTranscriptionRated = inputSerializedData.readBool(z10);
        message.voiceTranscriptionId = inputSerializedData.readInt64(z10);
        message.premiumEffectWasPlayed = inputSerializedData.readBool(z10);
        if ((this.f19443b & 4) != 0) {
            message.originalLanguage = inputSerializedData.readString(z10);
        }
        if ((this.f19443b & 8) != 0) {
            message.translatedToLanguage = inputSerializedData.readString(z10);
        }
        if ((this.f19443b & 16) != 0) {
            message.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f19443b & 32) != 0) {
            int readInt322 = inputSerializedData.readInt32(z10);
            if (613759672 != readInt322) {
                r10Var = null;
            } else {
                r10Var = new r10();
            }
            message.translatedPoll = (r10) TLObject.TLdeserialize(r10.class, r10Var, inputSerializedData, readInt322, z10);
        }
        if ((this.f19443b & 64) != 0) {
            message.errorAllowedPriceStars = inputSerializedData.readInt64(z10);
        }
        if ((this.f19443b & 128) != 0) {
            message.errorNewPriceStars = inputSerializedData.readInt64(z10);
        }
        if ((this.f19443b & 256) != 0) {
            message.translatedVoiceTranscription = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if (TLObject.hasFlag(this.f19443b, 1024)) {
            message.summaryText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if (TLObject.hasFlag(this.f19443b, 2048)) {
            message.translatedSummaryText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if (TLObject.hasFlag(this.f19443b, 4096)) {
            message.translatedSummaryLanguage = inputSerializedData.readString(z10);
        }
        if (TLObject.hasFlag(this.f19443b, 8192)) {
            message.translatedRichMessage = TL_iv.RichMessage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i10;
        int i11;
        outputSerializedData.writeInt32(1);
        TLRPC.Message message = this.f19442a;
        if (message.voiceTranscriptionForce) {
            i10 = this.f19443b | 2;
        } else {
            i10 = this.f19443b & (-3);
        }
        this.f19443b = i10;
        if (message.summarizedOpen) {
            i11 = i10 | 512;
        } else {
            i11 = i10 & (-513);
        }
        this.f19443b = i11;
        outputSerializedData.writeInt32(i11);
        if ((1 & this.f19443b) != 0) {
            outputSerializedData.writeString(message.voiceTranscription);
        }
        outputSerializedData.writeBool(message.voiceTranscriptionOpen);
        outputSerializedData.writeBool(message.voiceTranscriptionFinal);
        outputSerializedData.writeBool(message.voiceTranscriptionRated);
        outputSerializedData.writeInt64(message.voiceTranscriptionId);
        outputSerializedData.writeBool(message.premiumEffectWasPlayed);
        if ((this.f19443b & 4) != 0) {
            outputSerializedData.writeString(message.originalLanguage);
        }
        if ((this.f19443b & 8) != 0) {
            outputSerializedData.writeString(message.translatedToLanguage);
        }
        if ((this.f19443b & 16) != 0) {
            message.translatedText.serializeToStream(outputSerializedData);
        }
        if ((this.f19443b & 32) != 0) {
            message.translatedPoll.serializeToStream(outputSerializedData);
        }
        if ((this.f19443b & 64) != 0) {
            outputSerializedData.writeInt64(message.errorAllowedPriceStars);
        }
        if ((this.f19443b & 128) != 0) {
            outputSerializedData.writeInt64(message.errorNewPriceStars);
        }
        if ((this.f19443b & 256) != 0) {
            message.translatedVoiceTranscription.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.f19443b, 1024)) {
            message.summaryText.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.f19443b, 2048)) {
            message.translatedSummaryText.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.f19443b, 4096)) {
            outputSerializedData.writeString(message.translatedSummaryLanguage);
        }
        if (TLObject.hasFlag(this.f19443b, 8192)) {
            message.translatedRichMessage.serializeToStream(outputSerializedData);
        }
    }
}
