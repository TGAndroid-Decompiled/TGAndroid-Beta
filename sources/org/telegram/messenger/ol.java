package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class ol implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16994a;
    public final MessageObject f16995b;
    public final TranslateController.MessageKey f16996c;
    public final Utilities.Callback d;

    public ol(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f16994a = translateController;
        this.f16995b = messageObject;
        this.f16996c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f16994a.lambda$detectPhotoLanguage$42(this.f16995b, this.f16996c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f16996c;
        Utilities.Callback callback = this.d;
        this.f16994a.lambda$detectPhotoLanguage$40(this.f16995b, messageKey, callback, str);
    }
}
