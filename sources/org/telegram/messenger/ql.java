package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class ql implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18227a;
    public final MessageObject f18228b;
    public final TranslateController.MessageKey f18229c;
    public final Utilities.Callback d;

    public ql(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f18227a = translateController;
        this.f18228b = messageObject;
        this.f18229c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f18227a.lambda$detectPhotoLanguage$42(this.f18228b, this.f18229c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f18229c;
        Utilities.Callback callback = this.d;
        this.f18227a.lambda$detectPhotoLanguage$40(this.f18228b, messageKey, callback, str);
    }
}
