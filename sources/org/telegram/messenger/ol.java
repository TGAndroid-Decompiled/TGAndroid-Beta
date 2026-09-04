package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class ol implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18629a;
    public final MessageObject f18630b;
    public final TranslateController.MessageKey f18631c;
    public final Utilities.Callback d;

    public ol(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18629a = translateController;
        this.f18630b = messageObject;
        this.f18631c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18629a.lambda$detectPhotoLanguage$42(this.f18630b, this.f18631c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18631c;
        Utilities.Callback callback = this.d;
        this.f18629a.lambda$detectPhotoLanguage$40(this.f18630b, messageKey, callback, str);
    }
}
