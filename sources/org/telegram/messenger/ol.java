package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class ol implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17170a;
    public final MessageObject f17171b;
    public final TranslateController.MessageKey f17172c;
    public final Utilities.Callback d;

    public ol(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f17170a = translateController;
        this.f17171b = messageObject;
        this.f17172c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f17170a.lambda$detectPhotoLanguage$42(this.f17171b, this.f17172c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f17172c;
        Utilities.Callback callback = this.d;
        this.f17170a.lambda$detectPhotoLanguage$40(this.f17171b, messageKey, callback, str);
    }
}
