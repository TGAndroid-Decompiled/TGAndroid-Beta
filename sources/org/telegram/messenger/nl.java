package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class nl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f19081a;
    public final MessageObject f19082b;
    public final TranslateController.MessageKey f19083c;
    public final Utilities.Callback d;

    public nl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f19081a = translateController;
        this.f19082b = messageObject;
        this.f19083c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f19081a.lambda$detectPhotoLanguage$42(this.f19082b, this.f19083c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f19083c;
        Utilities.Callback callback = this.d;
        this.f19081a.lambda$detectPhotoLanguage$40(this.f19082b, messageKey, callback, str);
    }
}
