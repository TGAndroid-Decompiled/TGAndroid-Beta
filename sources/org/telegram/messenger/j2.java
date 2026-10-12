package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j2 implements Utilities.Callback {
    public final int f17916a;
    public final long f17917b;
    public final Object f17918c;
    public final Object d;
    public final Object f17919e;

    public j2(Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f17916a = i10;
        this.f17918c = obj;
        this.f17917b = j3;
        this.d = obj2;
        this.f17919e = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17916a) {
            case 0:
                ((FactCheckController) this.f17918c).lambda$loadMissing$3(this.f17917b, (ArrayList) this.d, (HashMap) this.f17919e, (ArrayList) obj);
                return;
            case 1:
                ((MessagesController) this.f17918c).lambda$checkSensitive$451(this.f17917b, (boolean[]) this.d, (Runnable) this.f17919e, (Boolean) obj);
                return;
            default:
                ((TranslateController) this.f17918c).lambda$checkTranslation$6((MessageObject) this.d, (String) this.f17919e, this.f17917b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public j2(TranslateController translateController, MessageObject messageObject, String str, long j3) {
        this.f17916a = 2;
        this.f17918c = translateController;
        this.d = messageObject;
        this.f17919e = str;
        this.f17917b = j3;
    }
}
