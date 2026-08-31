package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class ql implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f19817a;
    public final MessageObject f19818b;
    public final TranslateController.MessageKey f19819c;
    public final Utilities.Callback d;

    public ql(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f19817a = translateController;
        this.f19818b = messageObject;
        this.f19819c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f19817a.lambda$detectPhotoLanguage$42(this.f19818b, this.f19819c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f19819c;
        Utilities.Callback callback = this.d;
        this.f19817a.lambda$detectPhotoLanguage$40(this.f19818b, messageKey, callback, str);
    }
}
