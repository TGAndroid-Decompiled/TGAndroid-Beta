package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class cl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17457a;
    public final MessageObject f17458b;
    public final long f17459c;
    public final int d;

    public cl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f17457a = translateController;
        this.f17458b = messageObject;
        this.f17459c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f17457a.lambda$checkLanguage$15(this.f17458b, this.f17459c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f17459c;
        int i10 = this.d;
        this.f17457a.lambda$checkLanguage$13(this.f17458b, j3, i10, str);
    }
}
