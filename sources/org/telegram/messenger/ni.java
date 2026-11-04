package org.telegram.messenger;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ni extends TLObject {
    public final TLRPC.Message f24384a;
    public int f24385b;

    public ni(TLRPC.Message message) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        this.f24385b = 0;
        this.f24384a = message;
        if (message.voiceTranscription != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        this.f24385b = i3;
        if (message.voiceTranscriptionForce) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i18 = i3 | i10;
        this.f24385b = i18;
        if (message.originalLanguage != null) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        int i19 = i18 | i11;
        this.f24385b = i19;
        if (message.translatedToLanguage != null) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        int i20 = i19 | i12;
        this.f24385b = i20;
        if (message.translatedText != null) {
            i13 = 16;
        } else {
            i13 = 0;
        }
        int i21 = i20 | i13;
        this.f24385b = i21;
        if (message.translatedPoll != null) {
            i14 = 32;
        } else {
            i14 = 0;
        }
        int i22 = i21 | i14;
        this.f24385b = i22;
        if (message.errorAllowedPriceStars != 0) {
            i15 = 64;
        } else {
            i15 = 0;
        }
        int i23 = i22 | i15;
        this.f24385b = i23;
        if (message.errorNewPriceStars != 0) {
            i16 = 128;
        } else {
            i16 = 0;
        }
        int i24 = i23 | i16;
        this.f24385b = i24;
        if (message.translatedVoiceTranscription != null) {
            i17 = 256;
        } else {
            i17 = 0;
        }
        int i25 = i24 | i17;
        this.f24385b = i25;
        if (message.summaryText != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int flag = TLObject.setFlag(i25, 1024, z10);
        this.f24385b = flag;
        if (message.translatedSummaryText != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        int flag2 = TLObject.setFlag(flag, 2048, z11);
        this.f24385b = flag2;
        if (message.translatedSummaryLanguage != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int flag3 = TLObject.setFlag(flag2, 4096, z12);
        this.f24385b = flag3;
        if (message.translatedRichMessage != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int flag4 = TLObject.setFlag(flag3, 8192, z13);
        this.f24385b = flag4;
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction instanceof TLRPC.TL_messageActionGramTransfer) && ((TLRPC.TL_messageActionGramTransfer) messageAction).comment_encrypted_preparing) {
            z14 = true;
        }
        this.f24385b = TLObject.setFlag(flag4, 16384, z14);
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11;
        u00 u00Var;
        boolean z12;
        boolean z13 = true;
        int readInt32 = inputSerializedData.readInt32(true);
        this.f24385b = readInt32;
        TLRPC.Message message = this.f24384a;
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
        if ((this.f24385b & 1) != 0) {
            message.voiceTranscription = inputSerializedData.readString(z10);
        }
        int i3 = this.f24385b;
        if ((i3 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        message.voiceTranscriptionForce = z11;
        if ((i3 & 512) == 0) {
            z13 = false;
        }
        message.summarizedOpen = z13;
        message.voiceTranscriptionOpen = inputSerializedData.readBool(z10);
        message.voiceTranscriptionFinal = inputSerializedData.readBool(z10);
        message.voiceTranscriptionRated = inputSerializedData.readBool(z10);
        message.voiceTranscriptionId = inputSerializedData.readInt64(z10);
        message.premiumEffectWasPlayed = inputSerializedData.readBool(z10);
        if ((this.f24385b & 4) != 0) {
            message.originalLanguage = inputSerializedData.readString(z10);
        }
        if ((this.f24385b & 8) != 0) {
            message.translatedToLanguage = inputSerializedData.readString(z10);
        }
        if ((this.f24385b & 16) != 0) {
            message.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f24385b & 32) != 0) {
            int readInt322 = inputSerializedData.readInt32(z10);
            if (613759672 != readInt322) {
                u00Var = null;
            } else {
                u00Var = new u00();
            }
            message.translatedPoll = (u00) TLObject.TLdeserialize(u00.class, u00Var, inputSerializedData, readInt322, z10);
        }
        if ((this.f24385b & 64) != 0) {
            message.errorAllowedPriceStars = inputSerializedData.readInt64(z10);
        }
        if ((this.f24385b & 128) != 0) {
            message.errorNewPriceStars = inputSerializedData.readInt64(z10);
        }
        if ((this.f24385b & 256) != 0) {
            message.translatedVoiceTranscription = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if (TLObject.hasFlag(this.f24385b, 1024)) {
            message.summaryText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if (TLObject.hasFlag(this.f24385b, 2048)) {
            message.translatedSummaryText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if (TLObject.hasFlag(this.f24385b, 4096)) {
            message.translatedSummaryLanguage = inputSerializedData.readString(z10);
        }
        if (TLObject.hasFlag(this.f24385b, 8192)) {
            message.translatedRichMessage = TL_iv.RichMessage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i3;
        int i10;
        outputSerializedData.writeInt32(1);
        TLRPC.Message message = this.f24384a;
        if (message.voiceTranscriptionForce) {
            i3 = this.f24385b | 2;
        } else {
            i3 = this.f24385b & (-3);
        }
        this.f24385b = i3;
        if (message.summarizedOpen) {
            i10 = i3 | 512;
        } else {
            i10 = i3 & (-513);
        }
        this.f24385b = i10;
        outputSerializedData.writeInt32(i10);
        if ((1 & this.f24385b) != 0) {
            outputSerializedData.writeString(message.voiceTranscription);
        }
        outputSerializedData.writeBool(message.voiceTranscriptionOpen);
        outputSerializedData.writeBool(message.voiceTranscriptionFinal);
        outputSerializedData.writeBool(message.voiceTranscriptionRated);
        outputSerializedData.writeInt64(message.voiceTranscriptionId);
        outputSerializedData.writeBool(message.premiumEffectWasPlayed);
        if ((this.f24385b & 4) != 0) {
            outputSerializedData.writeString(message.originalLanguage);
        }
        if ((this.f24385b & 8) != 0) {
            outputSerializedData.writeString(message.translatedToLanguage);
        }
        if ((this.f24385b & 16) != 0) {
            message.translatedText.serializeToStream(outputSerializedData);
        }
        if ((this.f24385b & 32) != 0) {
            message.translatedPoll.serializeToStream(outputSerializedData);
        }
        if ((this.f24385b & 64) != 0) {
            outputSerializedData.writeInt64(message.errorAllowedPriceStars);
        }
        if ((this.f24385b & 128) != 0) {
            outputSerializedData.writeInt64(message.errorNewPriceStars);
        }
        if ((this.f24385b & 256) != 0) {
            message.translatedVoiceTranscription.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.f24385b, 1024)) {
            message.summaryText.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.f24385b, 2048)) {
            message.translatedSummaryText.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.f24385b, 4096)) {
            outputSerializedData.writeString(message.translatedSummaryLanguage);
        }
        if (TLObject.hasFlag(this.f24385b, 8192)) {
            message.translatedRichMessage.serializeToStream(outputSerializedData);
        }
    }
}
