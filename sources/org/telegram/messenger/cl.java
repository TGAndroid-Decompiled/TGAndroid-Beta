package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class cl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f17614a;
    public final MessageObject f17615b;
    public final long f17616c;
    public final int d;

    public cl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f17614a = translateController;
        this.f17615b = messageObject;
        this.f17616c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f17614a.lambda$checkLanguage$15(this.f17615b, this.f17616c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f17616c;
        int i10 = this.d;
        this.f17614a.lambda$checkLanguage$13(this.f17615b, j3, i10, str);
    }
}
