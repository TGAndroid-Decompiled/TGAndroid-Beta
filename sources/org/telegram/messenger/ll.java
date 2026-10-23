package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class ll implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18988a;
    public final MessageObject f18989b;
    public final TranslateController.MessageKey f18990c;
    public final Utilities.Callback d;

    public ll(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18988a = translateController;
        this.f18989b = messageObject;
        this.f18990c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18988a.lambda$detectPhotoLanguage$42(this.f18989b, this.f18990c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18990c;
        Utilities.Callback callback = this.d;
        this.f18988a.lambda$detectPhotoLanguage$40(this.f18989b, messageKey, callback, str);
    }
}
