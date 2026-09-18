package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class ol implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17003a;
    public final MessageObject f17004b;
    public final TranslateController.MessageKey f17005c;
    public final Utilities.Callback d;

    public ol(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f17003a = translateController;
        this.f17004b = messageObject;
        this.f17005c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f17003a.lambda$detectPhotoLanguage$42(this.f17004b, this.f17005c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f17005c;
        Utilities.Callback callback = this.d;
        this.f17003a.lambda$detectPhotoLanguage$40(this.f17004b, messageKey, callback, str);
    }
}
