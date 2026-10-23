package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class i2 implements Utilities.Callback {
    public final int f18644a;
    public final long f18645b;
    public final Object f18646c;
    public final Object d;
    public final Object e;

    public i2(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f18644a = i10;
        this.f18646c = obj;
        this.f18645b = j10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18644a) {
            case 0:
                ((FactCheckController) this.f18646c).lambda$loadMissing$3(this.f18645b, (ArrayList) this.d, (HashMap) this.e, (ArrayList) obj);
                return;
            case 1:
                ((MessagesController) this.f18646c).lambda$checkSensitive$451(this.f18645b, (boolean[]) this.d, (Runnable) this.e, (Boolean) obj);
                return;
            default:
                ((TranslateController) this.f18646c).lambda$checkTranslation$6((MessageObject) this.d, (String) this.e, this.f18645b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public i2(TranslateController translateController, MessageObject messageObject, String str, long j10) {
        this.f18644a = 2;
        this.f18646c = translateController;
        this.d = messageObject;
        this.e = str;
        this.f18645b = j10;
    }
}
