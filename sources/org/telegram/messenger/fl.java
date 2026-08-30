package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class fl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17253a;
    public final MessageObject f17254b;
    public final long f17255c;
    public final int d;

    public fl(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f17253a = translateController;
        this.f17254b = messageObject;
        this.f17255c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f17253a.lambda$checkLanguage$15(this.f17254b, this.f17255c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f17255c;
        int i10 = this.d;
        this.f17253a.lambda$checkLanguage$13(this.f17254b, j10, i10, str);
    }
}
