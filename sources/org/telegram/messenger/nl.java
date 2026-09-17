package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18579a;
    public final MessageObject f18580b;
    public final TranslateController.MessageKey f18581c;
    public final Utilities.Callback d;

    public nl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18579a = translateController;
        this.f18580b = messageObject;
        this.f18581c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18579a.lambda$detectPhotoLanguage$42(this.f18580b, this.f18581c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18581c;
        Utilities.Callback callback = this.d;
        this.f18579a.lambda$detectPhotoLanguage$40(this.f18580b, messageKey, callback, str);
    }
}
