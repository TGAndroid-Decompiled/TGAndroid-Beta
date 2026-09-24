package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class cl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16146a;
    public final MessageObject f16147b;
    public final long f16148c;
    public final int d;

    public cl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f16146a = translateController;
        this.f16147b = messageObject;
        this.f16148c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f16146a.lambda$checkLanguage$15(this.f16147b, this.f16148c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f16148c;
        int i10 = this.d;
        this.f16146a.lambda$checkLanguage$13(this.f16147b, j3, i10, str);
    }
}
