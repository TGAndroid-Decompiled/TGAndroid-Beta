package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17156a;
    public final MessageObject f17157b;
    public final TranslateController.MessageKey f17158c;
    public final Utilities.Callback d;

    public nl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f17156a = translateController;
        this.f17157b = messageObject;
        this.f17158c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f17156a.lambda$detectPhotoLanguage$42(this.f17157b, this.f17158c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f17158c;
        Utilities.Callback callback = this.d;
        this.f17156a.lambda$detectPhotoLanguage$40(this.f17157b, messageKey, callback, str);
    }
}
