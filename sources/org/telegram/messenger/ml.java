package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class ml implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f19009a;
    public final MessageObject f19010b;
    public final TranslateController.MessageKey f19011c;
    public final Utilities.Callback d;

    public ml(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f19009a = translateController;
        this.f19010b = messageObject;
        this.f19011c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f19009a.lambda$detectPhotoLanguage$42(this.f19010b, this.f19011c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f19011c;
        Utilities.Callback callback = this.d;
        this.f19009a.lambda$detectPhotoLanguage$40(this.f19010b, messageKey, callback, str);
    }
}
