package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class ol implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16990a;
    public final MessageObject f16991b;
    public final TranslateController.MessageKey f16992c;
    public final Utilities.Callback d;

    public ol(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f16990a = translateController;
        this.f16991b = messageObject;
        this.f16992c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f16990a.lambda$detectPhotoLanguage$42(this.f16991b, this.f16992c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f16992c;
        Utilities.Callback callback = this.d;
        this.f16990a.lambda$detectPhotoLanguage$40(this.f16991b, messageKey, callback, str);
    }
}
