package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class rl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18043a;
    public final MessageObject f18044b;
    public final TranslateController.MessageKey f18045c;
    public final Utilities.Callback d;

    public rl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18043a = translateController;
        this.f18044b = messageObject;
        this.f18045c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18043a.lambda$detectPhotoLanguage$42(this.f18044b, this.f18045c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18045c;
        Utilities.Callback callback = this.d;
        this.f18043a.lambda$detectPhotoLanguage$40(this.f18044b, messageKey, callback, str);
    }
}
