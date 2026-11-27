package defpackage;

import android.app.Activity;
import android.view.KeyEvent;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class si1 implements RequestDelegate {
    public final byte a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public si1(fw3 fw3Var, boolean z, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.a = (byte) 4;
        this.c = fw3Var;
        this.b = z;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                hl.c3(new y6a((KeyEvent.Callback) ((ij1) obj3), tL_error, (Object) ((TwoStepVerificationActivity) obj), (Object) ((Activity) obj2), this.b, tLObject, (byte) 2));
                return;
            case 1:
                hl.c3(new va7((Object) ((zu1) obj3), (Object) ((cq1) obj), (Object) tLObject, (Object) ((pm1) obj2), this.b, (byte) 7));
                return;
            case 2:
                hl.c3(new y6a((s92) obj3, (TLRPC.TL_channels_toggleUsername) obj, tLObject, (TLRPC.TL_username) obj2, this.b, tL_error));
                return;
            case 3:
                hl.c3(new y6a((j13) obj3, tLObject, (c51) obj, this.b, (HashSet) obj2, tL_error));
                return;
            case 4:
                hl.c3(new va7((fw3) obj3, tLObject, this.b, (TLRPC.TL_messages_getInlineBotResults) obj, (String) obj2, (byte) 11));
                return;
            case 5:
                hl.c3(new va7((w14) obj3, (String) obj, this.b, (String) obj2, tLObject, (byte) 12));
                return;
            case 6:
                hl.c3(new va7((q84) obj3, tLObject, (TLRPC.TL_textWithEntities) obj, this.b, (id) obj2, (byte) 13));
                return;
            default:
                hl.c3(new y6a((KeyEvent.Callback) ((wua) obj3), tL_error, (Object) ((s45) obj2), (Object) ((TwoStepVerificationActivity) obj), this.b, tLObject, (byte) 12));
                return;
        }
    }

    public si1(wua wuaVar, s45 s45Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z) {
        this.a = (byte) 7;
        this.c = wuaVar;
        this.e = s45Var;
        this.d = twoStepVerificationActivity;
        this.b = z;
    }

    public si1(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public si1(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }
}
