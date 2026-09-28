package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17157a;
    public final MessageObject f17158b;
    public final TranslateController.MessageKey f17159c;
    public final Utilities.Callback d;

    public nl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f17157a = translateController;
        this.f17158b = messageObject;
        this.f17159c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f17157a.lambda$detectPhotoLanguage$42(this.f17158b, this.f17159c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f17159c;
        Utilities.Callback callback = this.d;
        this.f17157a.lambda$detectPhotoLanguage$40(this.f17158b, messageKey, callback, str);
    }
}
