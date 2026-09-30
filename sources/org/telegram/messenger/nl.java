package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17173a;
    public final MessageObject f17174b;
    public final TranslateController.MessageKey f17175c;
    public final Utilities.Callback d;

    public nl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f17173a = translateController;
        this.f17174b = messageObject;
        this.f17175c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f17173a.lambda$detectPhotoLanguage$42(this.f17174b, this.f17175c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f17175c;
        Utilities.Callback callback = this.d;
        this.f17173a.lambda$detectPhotoLanguage$40(this.f17174b, messageKey, callback, str);
    }
}
