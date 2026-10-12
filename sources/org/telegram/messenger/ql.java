package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class ql implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18253a;
    public final MessageObject f18254b;
    public final TranslateController.MessageKey f18255c;
    public final Utilities.Callback d;

    public ql(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18253a = translateController;
        this.f18254b = messageObject;
        this.f18255c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18253a.lambda$detectPhotoLanguage$42(this.f18254b, this.f18255c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18255c;
        Utilities.Callback callback = this.d;
        this.f18253a.lambda$detectPhotoLanguage$40(this.f18254b, messageKey, callback, str);
    }
}
