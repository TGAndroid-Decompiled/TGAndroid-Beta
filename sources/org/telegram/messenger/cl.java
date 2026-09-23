package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class cl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f15900a;
    public final MessageObject f15901b;
    public final long f15902c;
    public final int d;

    public cl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f15900a = translateController;
        this.f15901b = messageObject;
        this.f15902c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f15900a.lambda$checkLanguage$15(this.f15901b, this.f15902c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f15902c;
        int i10 = this.d;
        this.f15900a.lambda$checkLanguage$13(this.f15901b, j3, i10, str);
    }
}
