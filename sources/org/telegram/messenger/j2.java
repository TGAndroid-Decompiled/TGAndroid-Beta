package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class j2 implements Utilities.Callback {
    public final int f20385a;
    public final long f20386b;
    public final Object f20387c;
    public final Object d;
    public final Object e;

    public j2(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f20385a = i10;
        this.f20387c = obj;
        this.f20386b = j10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20385a) {
            case 0:
                ((FactCheckController) this.f20387c).lambda$loadMissing$3(this.f20386b, (ArrayList) this.d, (HashMap) this.e, (ArrayList) obj);
                return;
            case 1:
                ((MessagesController) this.f20387c).lambda$checkSensitive$453(this.f20386b, (boolean[]) this.d, (Runnable) this.e, (Boolean) obj);
                return;
            default:
                ((TranslateController) this.f20387c).lambda$checkTranslation$6((MessageObject) this.d, (String) this.e, this.f20386b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public j2(TranslateController translateController, MessageObject messageObject, String str, long j10) {
        this.f20385a = 2;
        this.f20387c = translateController;
        this.d = messageObject;
        this.e = str;
        this.f20386b = j10;
    }
}
