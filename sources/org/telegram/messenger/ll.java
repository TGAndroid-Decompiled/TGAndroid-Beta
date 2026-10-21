package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class ll implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18909a;
    public final MessageObject f18910b;
    public final TranslateController.MessageKey f18911c;
    public final Utilities.Callback d;

    public ll(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18909a = translateController;
        this.f18910b = messageObject;
        this.f18911c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18909a.lambda$detectPhotoLanguage$42(this.f18910b, this.f18911c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18911c;
        Utilities.Callback callback = this.d;
        this.f18909a.lambda$detectPhotoLanguage$40(this.f18910b, messageKey, callback, str);
    }
}
