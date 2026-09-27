package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class cl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16155a;
    public final MessageObject f16156b;
    public final long f16157c;
    public final int d;

    public cl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f16155a = translateController;
        this.f16156b = messageObject;
        this.f16157c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f16155a.lambda$checkLanguage$15(this.f16156b, this.f16157c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f16157c;
        int i10 = this.d;
        this.f16155a.lambda$checkLanguage$13(this.f16156b, j3, i10, str);
    }
}
