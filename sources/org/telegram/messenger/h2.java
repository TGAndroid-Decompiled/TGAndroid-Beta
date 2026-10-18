package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h2 implements Utilities.Callback {
    public final int f18486a;
    public final long f18487b;
    public final Object f18488c;
    public final Object d;
    public final Object e;

    public h2(Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f18486a = i10;
        this.f18488c = obj;
        this.f18487b = j10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18486a) {
            case 0:
                ((FactCheckController) this.f18488c).lambda$loadMissing$3(this.f18487b, (ArrayList) this.d, (HashMap) this.e, (ArrayList) obj);
                return;
            case 1:
                ((MessagesController) this.f18488c).lambda$checkSensitive$451(this.f18487b, (boolean[]) this.d, (Runnable) this.e, (Boolean) obj);
                return;
            default:
                ((TranslateController) this.f18488c).lambda$checkTranslation$6((MessageObject) this.d, (String) this.e, this.f18487b, (TLRPC.TL_textWithEntities) obj);
                return;
        }
    }

    public h2(TranslateController translateController, MessageObject messageObject, String str, long j10) {
        this.f18486a = 2;
        this.f18488c = translateController;
        this.d = messageObject;
        this.e = str;
        this.f18487b = j10;
    }
}
