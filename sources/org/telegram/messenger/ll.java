package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class ll implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f15735a;
    public final MessageObject f15736b;
    public final long f15737c;
    public final int d;

    public ll(TranslateController translateController, MessageObject messageObject, long j3, int i10) {
        this.f15735a = translateController;
        this.f15736b = messageObject;
        this.f15737c = j3;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f15735a.lambda$checkLanguage$15(this.f15736b, this.f15737c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j3 = this.f15737c;
        int i10 = this.d;
        this.f15735a.lambda$checkLanguage$13(this.f15736b, j3, i10, str);
    }
}
