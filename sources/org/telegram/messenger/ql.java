package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class ql implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f19819a;
    public final MessageObject f19820b;
    public final TranslateController.MessageKey f19821c;
    public final Utilities.Callback d;

    public ql(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f19819a = translateController;
        this.f19820b = messageObject;
        this.f19821c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f19819a.lambda$detectPhotoLanguage$42(this.f19820b, this.f19821c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f19821c;
        Utilities.Callback callback = this.d;
        this.f19819a.lambda$detectPhotoLanguage$40(this.f19820b, messageKey, callback, str);
    }
}
