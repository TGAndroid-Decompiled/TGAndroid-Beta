package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kc6 implements RequestDelegate {
    public final byte a;
    public final mf6 b;
    public final TLRPC.auth_SentCode c;
    public final Bundle d;
    public final boolean e;

    public kc6(byte b, mf6 mf6Var, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, boolean z) {
        this.a = b;
        this.b = mf6Var;
        this.c = auth_sentcode;
        this.d = bundle;
        this.e = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                boolean z = tLObject instanceof TLRPC.TL_boolTrue;
                final mf6 mf6Var = this.b;
                final TLRPC.auth_SentCode auth_sentcode = this.c;
                final Bundle bundle = this.d;
                if (z) {
                    mf6Var.x1(false, true);
                    mf6Var.r0 = false;
                    auth_sentcode.type.verifiedFirebase = true;
                    final boolean z2 = this.e;
                    gl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    mf6Var.p1(bundle, auth_sentcode, z2);
                                    return;
                                default:
                                    mf6Var.p1(bundle, auth_sentcode, z2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                mf6Var.getClass();
                fa4.b("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                mf6Var.G1(bundle, auth_sentcode, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
                return;
            default:
                boolean z3 = tLObject instanceof TLRPC.TL_boolTrue;
                final mf6 mf6Var2 = this.b;
                final TLRPC.auth_SentCode auth_sentcode2 = this.c;
                final Bundle bundle2 = this.d;
                if (z3) {
                    mf6Var2.x1(false, true);
                    mf6Var2.r0 = false;
                    auth_sentcode2.type.verifiedFirebase = true;
                    final boolean z4 = this.e;
                    gl.c3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r1) {
                                case 0:
                                    mf6Var2.p1(bundle2, auth_sentcode2, z4);
                                    return;
                                default:
                                    mf6Var2.p1(bundle2, auth_sentcode2, z4);
                                    return;
                            }
                        }
                    });
                    return;
                }
                mf6Var2.getClass();
                fa4.b("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
                mf6Var2.G1(bundle2, auth_sentcode2, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
                return;
        }
    }
}
