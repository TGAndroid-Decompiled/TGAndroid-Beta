package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class cl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16156a;
    public final MessageObject f16157b;
    public final long f16158c;
    public final int d;

    public cl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f16156a = translateController;
        this.f16157b = messageObject;
        this.f16158c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f16156a.lambda$checkLanguage$15(this.f16157b, this.f16158c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f16158c;
        int i10 = this.d;
        this.f16156a.lambda$checkLanguage$13(this.f16157b, j3, i10, str);
    }
}
