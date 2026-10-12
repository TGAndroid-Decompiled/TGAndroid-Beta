package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
public final class tl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f19040a;
    public final MessageObject f19041b;
    public final TranslateController.MessageKey f19042c;
    public final Utilities.Callback d;

    public tl(TranslateController translateController, MessageObject messageObject, TranslateController.MessageKey messageKey, Utilities.Callback callback) {
        this.f19040a = translateController;
        this.f19041b = messageObject;
        this.f19042c = messageKey;
        this.d = callback;
    }

    @Override
    public void run(Exception exc) {
        this.f19040a.lambda$detectPhotoLanguage$42(this.f19041b, this.f19042c, this.d, exc);
    }

    @Override
    public void run(String str) {
        TranslateController.MessageKey messageKey = this.f19042c;
        Utilities.Callback callback = this.d;
        this.f19040a.lambda$detectPhotoLanguage$40(this.f19041b, messageKey, callback, str);
    }
}
