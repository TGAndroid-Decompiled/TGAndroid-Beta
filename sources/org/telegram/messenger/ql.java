package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class ql implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f21073a;
    public final MessageObject f21074b;
    public final TranslateController.MessageKey f21075c;
    public final Utilities.Callback d;

    public ql(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f21073a = translateController;
        this.f21074b = messageObject;
        this.f21075c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f21073a.lambda$detectPhotoLanguage$42(this.f21074b, this.f21075c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f21075c;
        Utilities.Callback callback = this.d;
        this.f21073a.lambda$detectPhotoLanguage$40(this.f21074b, messageKey, callback, str);
    }
}
