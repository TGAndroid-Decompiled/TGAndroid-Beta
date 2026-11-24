package defpackage;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
public abstract class l37 {
    public static void a(TLRPC.Message message, TLRPC.TL_message tL_message) {
        tL_message.voiceTranscription = message.voiceTranscription;
        tL_message.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
        tL_message.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
        tL_message.voiceTranscriptionForce = message.voiceTranscriptionForce;
        tL_message.voiceTranscriptionRated = message.voiceTranscriptionRated;
        tL_message.voiceTranscriptionId = message.voiceTranscriptionId;
        tL_message.voiceTranscriptionLocal = message.voiceTranscriptionLocal;
        tL_message.voiceTranscriptionWords = message.voiceTranscriptionWords;
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
            new k37(message).readParams(nativeByteBuffer, true);
        } else {
            zo4.k(hg9.j(readInt32, "can't read params version = "));
        }
    }

    public static NativeByteBuffer c(TLRPC.Message message) {
        TLRPC.MessageAction messageAction = message.action;
        if ((!(messageAction instanceof TLRPC.TL_messageActionGramTransfer) || !((TLRPC.TL_messageActionGramTransfer) messageAction).comment_encrypted_preparing) && message.voiceTranscription == null && message.translatedVoiceTranscription == null && !message.voiceTranscriptionOpen && !message.summarizedOpen && message.summaryText == null && message.translatedSummaryLanguage == null && message.translatedSummaryText == null && !message.voiceTranscriptionFinal && !message.voiceTranscriptionRated && !message.voiceTranscriptionForce && message.voiceTranscriptionId == 0 && !message.voiceTranscriptionLocal && message.voiceTranscriptionWords == null && !message.premiumEffectWasPlayed && message.originalLanguage == null && message.translatedToLanguage == null && message.translatedPoll == null && message.translatedText == null && message.translatedRichMessage == null && message.errorAllowedPriceStars == 0 && message.errorNewPriceStars == 0) {
            return null;
        }
        k37 k37Var = new k37(message);
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(k37Var.getObjectSize());
            k37Var.serializeToStream(nativeByteBuffer);
            return nativeByteBuffer;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
