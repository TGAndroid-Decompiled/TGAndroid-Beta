package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class pl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f20988a;
    public final MessageObject f20989b;
    public final TranslateController.MessageKey f20990c;
    public final Utilities.Callback d;

    public pl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f20988a = translateController;
        this.f20989b = messageObject;
        this.f20990c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f20988a.lambda$detectPhotoLanguage$42(this.f20989b, this.f20990c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f20990c;
        Utilities.Callback callback = this.d;
        this.f20988a.lambda$detectPhotoLanguage$40(this.f20989b, messageKey, callback, str);
    }
}
