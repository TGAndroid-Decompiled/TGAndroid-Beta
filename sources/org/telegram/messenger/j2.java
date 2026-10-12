package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j2 implements Utilities.Callback {
    public final int f17915a;
    public final long f17916b;
    public final Object f17917c;
    public final Object d;
    public final Object f17918e;

    public j2(Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f17915a = i10;
        this.f17917c = obj;
        this.f17916b = j3;
        this.d = obj2;
        this.f17918e = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f17915a) {
            case 0:
                ((FactCheckController) this.f17917c).lambda$loadMissing$3(this.f17916b, (ArrayList) this.d, (HashMap) this.f17918e, (ArrayList) obj);
                return;
            case 1:
                ((MessagesController) this.f17917c).lambda$checkSensitive$451(this.f17916b, (boolean[]) this.d, (Runnable) this.f17918e, (Boolean) obj);
                return;
            default:
                ((TranslateController) this.f17917c).lambda$checkTranslation$6((MessageObject) this.d, (String) this.f17918e, this.f17916b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public j2(TranslateController translateController, MessageObject messageObject, String str, long j3) {
        this.f17915a = 2;
        this.f17917c = translateController;
        this.d = messageObject;
        this.f17918e = str;
        this.f17916b = j3;
    }
}
