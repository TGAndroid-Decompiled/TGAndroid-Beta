package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17135a;
    public final MessageObject f17136b;
    public final TranslateController.MessageKey f17137c;
    public final Utilities.Callback d;

    public nl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f17135a = translateController;
        this.f17136b = messageObject;
        this.f17137c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f17135a.lambda$detectPhotoLanguage$42(this.f17136b, this.f17137c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f17137c;
        Utilities.Callback callback = this.d;
        this.f17135a.lambda$detectPhotoLanguage$40(this.f17136b, messageKey, callback, str);
    }
}
