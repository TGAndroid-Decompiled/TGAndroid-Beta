package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class el implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f20225a;
    public final MessageObject f20226b;
    public final TranslateController.MessageKey f20227c;
    public final Utilities.Callback d;

    public el(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f20225a = translateController;
        this.f20226b = messageObject;
        this.f20227c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f20225a.lambda$detectPhotoLanguage$42(this.f20226b, this.f20227c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f20227c;
        Utilities.Callback callback = this.d;
        this.f20225a.lambda$detectPhotoLanguage$40(this.f20226b, messageKey, callback, str);
    }
}
