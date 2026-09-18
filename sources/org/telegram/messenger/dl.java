package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class dl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f16001a;
    public final MessageObject f16002b;
    public final long f16003c;
    public final int d;

    public dl(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f16001a = translateController;
        this.f16002b = messageObject;
        this.f16003c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f16001a.lambda$checkLanguage$15(this.f16002b, this.f16003c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f16003c;
        int i10 = this.d;
        this.f16001a.lambda$checkLanguage$13(this.f16002b, j3, i10, str);
    }
}
