package defpackage;

import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class k37 extends TLObject {
    public final TLRPC.Message a;
    public int b;

    public k37(TLRPC.Message message) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.b = 0;
        this.a = message;
        if (message.voiceTranscription != null) {
            i = 1;
        } else {
            i = 0;
        }
        this.b = i;
        if (message.voiceTranscriptionForce) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        int i10 = i | i2;
        this.b = i10;
        if (message.originalLanguage != null) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        int i11 = i10 | i3;
        this.b = i11;
        if (message.translatedToLanguage != null) {
            i4 = 8;
        } else {
            i4 = 0;
        }
        int i12 = i11 | i4;
        this.b = i12;
        if (message.translatedText != null) {
            i5 = 16;
        } else {
            i5 = 0;
        }
        int i13 = i12 | i5;
        this.b = i13;
        if (message.translatedPoll != null) {
            i6 = 32;
        } else {
            i6 = 0;
        }
        int i14 = i13 | i6;
        this.b = i14;
        if (message.errorAllowedPriceStars != 0) {
            i7 = 64;
        } else {
            i7 = 0;
        }
        int i15 = i14 | i7;
        this.b = i15;
        if (message.errorNewPriceStars != 0) {
            i8 = 128;
        } else {
            i8 = 0;
        }
        int i16 = i15 | i8;
        this.b = i16;
        if (message.translatedVoiceTranscription != null) {
            i9 = 256;
        } else {
            i9 = 0;
        }
        int i17 = i16 | i9;
        this.b = i17;
        if (message.summaryText != null) {
            z = true;
        } else {
            z = false;
        }
        int flag = TLObject.setFlag(i17, 1024, z);
        this.b = flag;
        if (message.translatedSummaryText != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        int flag2 = TLObject.setFlag(flag, 2048, z2);
        this.b = flag2;
        if (message.translatedSummaryLanguage != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        int flag3 = TLObject.setFlag(flag2, 4096, z3);
        this.b = flag3;
        if (message.translatedRichMessage != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        int flag4 = TLObject.setFlag(flag3, 8192, z4);
        this.b = flag4;
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction instanceof TLRPC.TL_messageActionGramTransfer) && ((TLRPC.TL_messageActionGramTransfer) messageAction).comment_encrypted_preparing) {
            z5 = true;
        } else {
            z5 = false;
        }
        int flag5 = TLObject.setFlag(flag4, 16384, z5);
        this.b = flag5;
        int flag6 = TLObject.setFlag(flag5, 32768, message.voiceTranscriptionLocal);
        this.b = flag6;
        this.b = TLObject.setFlag(flag6, 65536, message.voiceTranscriptionWords != null);
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z) {
        boolean z2;
        y2c y2cVar;
        boolean z3;
        boolean z4 = true;
        int readInt32 = inputSerializedData.readInt32(true);
        this.b = readInt32;
        TLRPC.Message message = this.a;
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
            TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction;
            if (!tL_messageActionGramTransfer.comment_encrypted && TLObject.hasFlag(readInt32, 16384)) {
                z3 = true;
            } else {
                z3 = false;
            }
            tL_messageActionGramTransfer.comment_encrypted_preparing = z3;
        }
        if ((this.b & 1) != 0) {
            message.voiceTranscription = inputSerializedData.readString(z);
        }
        int i = this.b;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        message.voiceTranscriptionForce = z2;
        if ((i & 512) == 0) {
            z4 = false;
        }
        message.summarizedOpen = z4;
        message.voiceTranscriptionOpen = inputSerializedData.readBool(z);
        message.voiceTranscriptionFinal = inputSerializedData.readBool(z);
        message.voiceTranscriptionRated = inputSerializedData.readBool(z);
        message.voiceTranscriptionId = inputSerializedData.readInt64(z);
        message.premiumEffectWasPlayed = inputSerializedData.readBool(z);
        if ((this.b & 4) != 0) {
            message.originalLanguage = inputSerializedData.readString(z);
        }
        if ((this.b & 8) != 0) {
            message.translatedToLanguage = inputSerializedData.readString(z);
        }
        if ((this.b & 16) != 0) {
            message.translatedText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }
        if ((this.b & 32) != 0) {
            int readInt322 = inputSerializedData.readInt32(z);
            if (613759672 != readInt322) {
                y2cVar = null;
            } else {
                y2cVar = new y2c();
            }
            message.translatedPoll = (y2c) TLObject.TLdeserialize(y2c.class, y2cVar, inputSerializedData, readInt322, z);
        }
        if ((this.b & 64) != 0) {
            message.errorAllowedPriceStars = inputSerializedData.readInt64(z);
        }
        if ((this.b & 128) != 0) {
            message.errorNewPriceStars = inputSerializedData.readInt64(z);
        }
        if ((this.b & 256) != 0) {
            message.translatedVoiceTranscription = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }
        if (TLObject.hasFlag(this.b, 1024)) {
            message.summaryText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }
        if (TLObject.hasFlag(this.b, 2048)) {
            message.translatedSummaryText = TLRPC.TL_textWithEntities.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }
        if (TLObject.hasFlag(this.b, 4096)) {
            message.translatedSummaryLanguage = inputSerializedData.readString(z);
        }
        if (TLObject.hasFlag(this.b, 8192)) {
            message.translatedRichMessage = TL_iv.RichMessage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }
        message.voiceTranscriptionLocal = TLObject.hasFlag(this.b, 32768);
        if (TLObject.hasFlag(this.b, 65536)) {
            int readInt323 = inputSerializedData.readInt32(z);
            message.voiceTranscriptionWords = new int[readInt323];
            for (int i2 = 0; i2 < readInt323; i2++) {
                message.voiceTranscriptionWords[i2] = inputSerializedData.readInt32(z);
            }
            return;
        }
        message.voiceTranscriptionWords = null;
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        int i;
        int i2;
        outputSerializedData.writeInt32(1);
        TLRPC.Message message = this.a;
        boolean z = message.voiceTranscriptionForce;
        int i3 = this.b;
        if (z) {
            i = i3 | 2;
        } else {
            i = i3 & (-3);
        }
        this.b = i;
        if (message.summarizedOpen) {
            i2 = i | 512;
        } else {
            i2 = i & (-513);
        }
        this.b = i2;
        outputSerializedData.writeInt32(i2);
        if ((this.b & 1) != 0) {
            outputSerializedData.writeString(message.voiceTranscription);
        }
        outputSerializedData.writeBool(message.voiceTranscriptionOpen);
        outputSerializedData.writeBool(message.voiceTranscriptionFinal);
        outputSerializedData.writeBool(message.voiceTranscriptionRated);
        outputSerializedData.writeInt64(message.voiceTranscriptionId);
        outputSerializedData.writeBool(message.premiumEffectWasPlayed);
        if ((this.b & 4) != 0) {
            outputSerializedData.writeString(message.originalLanguage);
        }
        if ((this.b & 8) != 0) {
            outputSerializedData.writeString(message.translatedToLanguage);
        }
        if ((this.b & 16) != 0) {
            message.translatedText.serializeToStream(outputSerializedData);
        }
        if ((this.b & 32) != 0) {
            message.translatedPoll.serializeToStream(outputSerializedData);
        }
        if ((this.b & 64) != 0) {
            outputSerializedData.writeInt64(message.errorAllowedPriceStars);
        }
        if ((this.b & 128) != 0) {
            outputSerializedData.writeInt64(message.errorNewPriceStars);
        }
        if ((this.b & 256) != 0) {
            message.translatedVoiceTranscription.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.b, 1024)) {
            message.summaryText.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.b, 2048)) {
            message.translatedSummaryText.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.b, 4096)) {
            outputSerializedData.writeString(message.translatedSummaryLanguage);
        }
        if (TLObject.hasFlag(this.b, 8192)) {
            message.translatedRichMessage.serializeToStream(outputSerializedData);
        }
        if (TLObject.hasFlag(this.b, 65536)) {
            outputSerializedData.writeInt32(message.voiceTranscriptionWords.length);
            int[] iArr = message.voiceTranscriptionWords;
            for (int i4 : iArr) {
                outputSerializedData.writeInt32(i4);
            }
        }
    }
}
