package org.telegram.messenger;

public final class TranslateController$$ExternalSyntheticLambda10 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f$0;
    public final MessageObject f$1;
    public final TranslateController.MessageKey f$2;
    public final Utilities.Callback f$3;

    public TranslateController$$ExternalSyntheticLambda10(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f$0 = translateController;
        this.f$1 = messageObject;
        this.f$2 = messageKey;
        this.f$3 = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f$0.lambda$detectPhotoLanguage$42(this.f$1, this.f$2, this.f$3, exc);
    }

    @Override
    public void run(String str) {
        this.f$0.lambda$detectPhotoLanguage$40(this.f$1, this.f$2, this.f$3, str);
    }
}
