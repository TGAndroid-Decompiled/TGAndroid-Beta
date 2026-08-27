package org.telegram.messenger;

public final class jl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {

    public final TranslateController f20719a;

    public final MessageObject f20720b;

    public final TranslateController.MessageKey f20721c;
    public final Utilities.Callback d;

    public jl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f20719a = translateController;
        this.f20720b = messageObject;
        this.f20721c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f20719a.lambda$detectPhotoLanguage$42(this.f20720b, this.f20721c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f20721c;
        Utilities.Callback callback = this.d;
        this.f20719a.lambda$detectPhotoLanguage$40(this.f20720b, messageKey, callback, str);
    }
}
