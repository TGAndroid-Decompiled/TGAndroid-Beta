package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class fl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18705a;
    public final MessageObject f18706b;
    public final long f18707c;
    public final int d;

    public fl(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f18705a = translateController;
        this.f18706b = messageObject;
        this.f18707c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f18705a.lambda$checkLanguage$15(this.f18706b, this.f18707c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f18707c;
        int i10 = this.d;
        this.f18705a.lambda$checkLanguage$13(this.f18706b, j10, i10, str);
    }
}
