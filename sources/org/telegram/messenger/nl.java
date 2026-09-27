package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17144a;
    public final MessageObject f17145b;
    public final TranslateController.MessageKey f17146c;
    public final Utilities.Callback d;

    public nl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f17144a = translateController;
        this.f17145b = messageObject;
        this.f17146c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f17144a.lambda$detectPhotoLanguage$42(this.f17145b, this.f17146c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f17146c;
        Utilities.Callback callback = this.d;
        this.f17144a.lambda$detectPhotoLanguage$40(this.f17145b, messageKey, callback, str);
    }
}
