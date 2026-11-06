package org.telegram.messenger;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public abstract class xi {
    public static void a(TLRPC.Message message, TLRPC.TL_message tL_message) {
        tL_message.voiceTranscription = message.voiceTranscription;
        tL_message.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
        tL_message.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
        tL_message.voiceTranscriptionForce = message.voiceTranscriptionForce;
        tL_message.voiceTranscriptionRated = message.voiceTranscriptionRated;
        tL_message.voiceTranscriptionId = message.voiceTranscriptionId;
        tL_message.premiumEffectWasPlayed = message.premiumEffectWasPlayed;
        tL_message.originalLanguage = message.originalLanguage;
        tL_message.translatedToLanguage = message.translatedToLanguage;
        tL_message.translatedPoll = message.translatedPoll;
        tL_message.translatedText = message.translatedText;
        tL_message.translatedRichMessage = message.translatedRichMessage;
        tL_message.errorAllowedPriceStars = message.errorAllowedPriceStars;
        tL_message.errorNewPriceStars = message.errorNewPriceStars;
        tL_message.translatedVoiceTranscription = message.translatedVoiceTranscription;
        tL_message.summarizedOpen = message.summarizedOpen;
        tL_message.summaryText = message.summaryText;
        tL_message.translatedSummaryText = message.translatedSummaryText;
        tL_message.translatedSummaryLanguage = message.translatedSummaryLanguage;
    }

    public static void b(TLRPC.Message message, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return;
        }
        int readInt32 = nativeByteBuffer.readInt32(true);
        if (readInt32 == 1) {
            new wi(message).readParams(nativeByteBuffer, true);
            return;
        }
        throw new RuntimeException(jg.g.j(readInt32, "can't read params version = "));
    }

    public static NativeByteBuffer c(TLRPC.Message message) {
        TLRPC.MessageAction messageAction = message.action;
        if ((!(messageAction instanceof TLRPC.TL_messageActionGramTransfer) || !((TLRPC.TL_messageActionGramTransfer) messageAction).comment_encrypted_preparing) && message.voiceTranscription == null && message.translatedVoiceTranscription == null && !message.voiceTranscriptionOpen && !message.summarizedOpen && message.summaryText == null && message.translatedSummaryLanguage == null && message.translatedSummaryText == null && !message.voiceTranscriptionFinal && !message.voiceTranscriptionRated && !message.voiceTranscriptionForce && message.voiceTranscriptionId == 0 && !message.premiumEffectWasPlayed && message.originalLanguage == null && message.translatedToLanguage == null && message.translatedPoll == null && message.translatedText == null && message.translatedRichMessage == null && message.errorAllowedPriceStars == 0 && message.errorNewPriceStars == 0) {
            return null;
        }
        wi wiVar = new wi(message);
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(wiVar.getObjectSize());
            wiVar.serializeToStream(nativeByteBuffer);
            return nativeByteBuffer;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
