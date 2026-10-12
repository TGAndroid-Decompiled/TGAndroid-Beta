package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h2 implements Utilities.Callback {
    public final int f17364a;
    public final long f17365b;
    public final Object f17366c;
    public final Object d;
    public final Object e;

    public h2(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f17364a = i10;
        this.f17366c = obj;
        this.f17365b = j10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17364a) {
            case 0:
                ((FactCheckController) this.f17366c).lambda$loadMissing$3(this.f17365b, (ArrayList) this.d, (HashMap) this.e, (ArrayList) obj);
                return;
            case 1:
                ((MessagesController) this.f17366c).lambda$checkSensitive$451(this.f17365b, (boolean[]) this.d, (Runnable) this.e, (Boolean) obj);
                return;
            default:
                ((TranslateController) this.f17366c).lambda$checkTranslation$6((MessageObject) this.d, (String) this.e, this.f17365b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public h2(TranslateController translateController, MessageObject messageObject, String str, long j10) {
        this.f17364a = 2;
        this.f17366c = translateController;
        this.d = messageObject;
        this.e = str;
        this.f17365b = j10;
    }
}
