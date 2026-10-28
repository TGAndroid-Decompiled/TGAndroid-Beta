package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class gl implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f20202a;
    public final MessageObject f20203b;
    public final long f20204c;
    public final int d;

    public gl(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f20202a = translateController;
        this.f20203b = messageObject;
        this.f20204c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f20202a.lambda$checkLanguage$15(this.f20203b, this.f20204c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f20204c;
        int i10 = this.d;
        this.f20202a.lambda$checkLanguage$13(this.f20203b, j10, i10, str);
    }
}
