package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class tk implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f21608a;
    public final MessageObject f21609b;
    public final long f21610c;
    public final int d;

    public tk(TranslateController translateController, MessageObject messageObject, long j10, int i9) {
        this.f21608a = translateController;
        this.f21609b = messageObject;
        this.f21610c = j10;
        this.d = i9;
    }

    @Override
    public void run(Exception exc) {
        this.f21608a.lambda$checkLanguage$15(this.f21609b, this.f21610c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f21610c;
        int i9 = this.d;
        this.f21608a.lambda$checkLanguage$13(this.f21609b, j10, i9, str);
    }
}
