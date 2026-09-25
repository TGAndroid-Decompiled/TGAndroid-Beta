package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class cl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16161a;
    public final MessageObject f16162b;
    public final long f16163c;
    public final int d;

    public cl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f16161a = translateController;
        this.f16162b = messageObject;
        this.f16163c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f16161a.lambda$checkLanguage$15(this.f16162b, this.f16163c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f16163c;
        int i10 = this.d;
        this.f16161a.lambda$checkLanguage$13(this.f16162b, j3, i10, str);
    }
}
