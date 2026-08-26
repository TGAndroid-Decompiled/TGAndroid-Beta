package org.telegram.messenger;

public final class TranslateController$$ExternalSyntheticLambda27 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f$0;
    public final MessageObject f$1;
    public final long f$2;
    public final int f$3;

    public TranslateController$$ExternalSyntheticLambda27(TranslateController translateController, MessageObject messageObject, long j, int i) {
        this.f$0 = translateController;
        this.f$1 = messageObject;
        this.f$2 = j;
        this.f$3 = i;
    }

    @Override
    public void run(Exception exc) {
        this.f$0.lambda$checkLanguage$15(this.f$1, this.f$2, this.f$3, exc);
    }

    @Override
    public void run(String str) {
        this.f$0.lambda$checkLanguage$13(this.f$1, this.f$2, this.f$3, str);
    }
}
