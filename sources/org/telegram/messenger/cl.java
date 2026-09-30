package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class cl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16172a;
    public final MessageObject f16173b;
    public final long f16174c;
    public final int d;

    public cl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f16172a = translateController;
        this.f16173b = messageObject;
        this.f16174c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f16172a.lambda$checkLanguage$15(this.f16173b, this.f16174c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f16174c;
        int i10 = this.d;
        this.f16172a.lambda$checkLanguage$13(this.f16173b, j3, i10, str);
    }
}
