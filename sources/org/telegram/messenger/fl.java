package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class fl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f18707a;
    public final MessageObject f18708b;
    public final long f18709c;
    public final int d;

    public fl(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f18707a = translateController;
        this.f18708b = messageObject;
        this.f18709c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f18707a.lambda$checkLanguage$15(this.f18708b, this.f18709c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f18709c;
        int i10 = this.d;
        this.f18707a.lambda$checkLanguage$13(this.f18708b, j10, i10, str);
    }
}
