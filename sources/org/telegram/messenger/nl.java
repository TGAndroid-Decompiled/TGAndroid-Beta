package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17150a;
    public final MessageObject f17151b;
    public final TranslateController.MessageKey f17152c;
    public final Utilities.Callback d;

    public nl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f17150a = translateController;
        this.f17151b = messageObject;
        this.f17152c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f17150a.lambda$detectPhotoLanguage$42(this.f17151b, this.f17152c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f17152c;
        Utilities.Callback callback = this.d;
        this.f17150a.lambda$detectPhotoLanguage$40(this.f17151b, messageKey, callback, str);
    }
}
