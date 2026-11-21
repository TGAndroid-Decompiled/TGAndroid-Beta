package org.telegram.messenger;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ti extends TLObject {
    public final TLRPC.Message f27028a;
    public int f27029b;

    public ti(TLRPC.Message message) {
        int i7;
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
        boolean z14;
        this.f27029b = 0;
        this.f27028a = message;
        if (message.voiceTranscription != null) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        this.f27029b = i7;
        if (message.voiceTranscriptionForce) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i18 = i7 | i10;
        this.f27029b = i18;
        if (message.originalLanguage != null) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        int i19 = i18 | i11;
        this.f27029b = i19;
        if (message.translatedToLanguage != null) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        int i20 = i19 | i12;
        this.f27029b = i20;
        if (message.translatedText != null) {
            i13 = 16;
        } else {
            i13 = 0;
        }
        int i21 = i20 | i13;
        this.f27029b = i21;
        if (message.translatedPoll != null) {
            i14 = 32;
        } else {
            i14 = 0;
        }
        int i22 = i21 | i14;
        this.f27029b = i22;
        if (message.errorAllowedPriceStars != 0) {
            i15 = 64;
        } else {
            i15 = 0;
        }
        int i23 = i22 | i15;
        this.f27029b = i23;
        if (message.errorNewPriceStars != 0) {
            i16 = 128;
        } else {
            i16 = 0;
        }
        int i24 = i23 | i16;
        this.f27029b = i24;
        if (message.translatedVoiceTranscription != null) {
            i17 = 256;
        } else {
            i17 = 0;
        }
        int i25 = i24 | i17;
        this.f27029b = i25;
        if (message.summaryText != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        int flag = TLObject.setFlag(i25, 1024, z10);
        this.f27029b = flag;
        if (message.translatedSummaryText != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        int flag2 = TLObject.setFlag(flag, 2048, z11);
        this.f27029b = flag2;
        if (message.translatedSummaryLanguage != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        int flag3 = TLObject.setFlag(flag2, 4096, z12);
        this.f27029b = flag3;
        if (message.translatedRichMessage != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int flag4 = TLObject.setFlag(flag3, 8192, z13);
        this.f27029b = flag4;
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction instanceof TLRPC.TL_messageActionGramTransfer) && ((TLRPC.TL_messageActionGramTransfer) messageAction).comment_encrypted_preparing) {
            z14 = true;
        } else {
            z14 = false;
        }
        int flag5 = TLObject.setFlag(flag4, 16384, z14);
        this.f27029b = flag5;
        int flag6 = TLObject.setFlag(flag5, 32768, message.voiceTranscriptionLocal);
        this.f27029b = flag6;
        this.f27029b = TLObject.setFlag(flag6, 65536, message.voiceTranscriptionWords != null);
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        boolean z11;
        w00 w00Var;
        boolean z12;
        boolean z13 = true;
        int readInt32 = inputSerializedData.readInt32(true);
        this.f27029b = readInt32;
        TLRPC.Message message = this.f27028a;
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
        if ((this.f27029b & 1) != 0) {
            message.voiceTranscription = inputSerializedData.readString(z10);
        }
        int i7 = this.f27029b;
        if ((i7 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        message.voiceTranscriptionForce = z11;
        if ((i7 & 512) == 0) {
            z13 = false;
        }
        message.summarizedOpen = z13;
        message.voiceTranscriptionOpen = inputSerializedData.readBool(z10);
        message.voiceTranscriptionFinal = inputSerializedData.readBool(z10);
        message.voiceTranscriptionRated = inputSerializedData.readBool(z10);
        message.voiceTranscriptionId = inputSerializedData.readInt64(z10);
        message.premiumEffectWasPlayed = inputSerializedData.readBool(z10);
        if ((this.f27029b & 4) != 0) {
            message.originalLanguage = inputSerializedData.readString(z10);
        }
        if ((this.f27029b & 8) != 0) {
            message.translatedToLanguage = inputSerializedData.readString(z10);
        }
        if ((this.f27029b & 16) != 0) {
            message.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if ((this.f27029b & 32) != 0) {
            int readInt322 = inputSerializedData.readInt32(z10);
            if (613759672 != readInt322) {
                w00Var = null;
            } else {
                w00Var = new w00();
            }
            message.translatedPoll = (w00) TLObject.TLdeserialize(w00.class, w00Var, inputSerializedData, readInt322, z10);
        }
        if ((this.f27029b & 64) != 0) {
            message.errorAllowedPriceStars = inputSerializedData.readInt64(z10);
        }
        if ((this.f27029b & 128) != 0) {
            message.errorNewPriceStars = inputSerializedData.readInt64(z10);
        }
        if ((this.f27029b & 256) != 0) {
            message.translatedVoiceTranscription = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if (TLObject.hasFlag(this.f27029b, 1024)) {
            message.summaryText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if (TLObject.hasFlag(this.f27029b, 2048)) {
            message.translatedSummaryText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        if (TLObject.hasFlag(this.f27029b, 4096)) {
            message.translatedSummaryLanguage = inputSerializedData.readString(z10);
        }
        if (TLObject.hasFlag(this.f27029b, 8192)) {
            message.translatedRichMessage = TL_iv.RichMessage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }
        message.voiceTranscriptionLocal = TLObject.hasFlag(this.f27029b, 32768);
        if (TLObject.hasFlag(this.f27029b, 65536)) {
            int readInt323 = inputSerializedData.readInt32(z10);
            message.voiceTranscriptionWords = new int[readInt323];
            for (int i10 = 0; i10 < readInt323; i10++) {
                message.voiceTranscriptionWords[i10] = inputSerializedData.readInt32(z10);
            }
            return;
        }
        message.voiceTranscriptionWords = null;
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i7;
        int i10;
        outputSerializedData.writeInt32(1);
        TLRPC.Message message = this.f27028a;
        if (message.voiceTranscriptionForce) {
            i7 = this.f27029b | 2;
        } else {
            i7 = this.f27029b & (-3);
        }
        this.f27029b = i7;
        if (message.summarizedOpen) {
            i10 = i7 | 512;
        } else {
            i10 = i7 & (-513);
        }
        this.f27029b = i10;
        outputSerializedData.writeInt32(i10);
        if ((1 & this.f27029b) != 0) {
            outputSerializedData.writeString(message.voiceTranscription);
        }
        outputSerializedData.writeBool(message.voiceTranscriptionOpen);
        outputSerializedData.writeBool(message.voiceTranscriptionFinal);
        outputSerializedData.writeBool(message.voiceTranscriptionRated);
        outputSerializedData.writeInt64(message.voiceTranscriptionId);
        outputSerializedData.writeBool(message.premiumEffectWasPlayed);
        if ((this.f27029b & 4) != 0) {
            outputSerializedData.writeString(message.originalLanguage);
        }
        if ((this.f27029b & 8) != 0) {
            outputSerializedData.writeString(message.translatedToLanguage);
        }
        if ((this.f27029b & 16) != 0) {
            message.translatedText.serializeToStream(outputSerializedData);
        }
        if ((this.f27029b & 32) != 0) {
            message.translatedPoll.serializeToStream(outputSerializedData);
        }
        if ((this.f27029b & 64) != 0) {
            outputSerializedData.writeInt64(message.errorAllowedPriceStars);
        }
        if ((this.f27029b & 128) != 0) {
            outputSerializedData.writeInt64(message.errorNewPriceStars);
        }
        if ((this.f27029b & 256) != 0) {
            message.translatedVoiceTranscription.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.f27029b, 1024)) {
            message.summaryText.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.f27029b, 2048)) {
            message.translatedSummaryText.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.f27029b, 4096)) {
            outputSerializedData.writeString(message.translatedSummaryLanguage);
        }
        if (TLObject.hasFlag(this.f27029b, 8192)) {
            message.translatedRichMessage.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.f27029b, 65536)) {
            outputSerializedData.writeInt32(message.voiceTranscriptionWords.length);
            for (int i11 : message.voiceTranscriptionWords) {
                outputSerializedData.writeInt32(i11);
            }
        }
    }
}
