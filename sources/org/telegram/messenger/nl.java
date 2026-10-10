package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18693a;
    public final MessageObject f18694b;
    public final TranslateController.MessageKey f18695c;
    public final Utilities.Callback d;

    public nl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18693a = translateController;
        this.f18694b = messageObject;
        this.f18695c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18693a.lambda$detectPhotoLanguage$42(this.f18694b, this.f18695c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18695c;
        Utilities.Callback callback = this.d;
        this.f18693a.lambda$detectPhotoLanguage$40(this.f18694b, messageKey, callback, str);
    }
}
