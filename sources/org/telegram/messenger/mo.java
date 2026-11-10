package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mo implements RequestDelegate {
    public final int f24072a;
    public final w2 f24073b;

    public mo(w2 w2Var, int i7) {
        this.f24072a = i7;
        this.f24073b = w2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        boolean z9;
        int i7;
        TLRPC.TL_help_appConfig tL_help_appConfig;
        String str2;
        boolean z10;
        int i10;
        TLRPC.TL_messages_availableEffects tL_messages_availableEffects;
        switch (this.f24072a) {
            case 0:
                boolean z11 = tLObject instanceof TLRPC.TL_help_appConfigNotModified;
                w2 w2Var = this.f24073b;
                if (z11) {
                    Boolean bool = Boolean.TRUE;
                    w2Var.a(bool, null, 0L, bool);
                    return;
                } else if (tLObject instanceof TLRPC.TL_help_appConfig) {
                    w2Var.a(Boolean.FALSE, (TLRPC.TL_help_appConfig) tLObject, Long.valueOf(tL_help_appConfig.hash), Boolean.TRUE);
                    return;
                } else {
                    StringBuilder sb2 = new StringBuilder("getting appconfig error ");
                    if (tL_error != null) {
                        str = tL_error.code + " " + tL_error.text;
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    a8.d(sb2.toString());
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error != null && ((i7 = tL_error.code) == -2000 || i7 == -2001)) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    w2Var.a(bool2, null, 0L, Boolean.valueOf(z9));
                    return;
                }
            default:
                boolean z12 = tLObject instanceof TLRPC.TL_messages_availableEffectsNotModified;
                w2 w2Var2 = this.f24073b;
                if (z12) {
                    Boolean bool3 = Boolean.TRUE;
                    w2Var2.a(bool3, null, 0L, bool3);
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_availableEffects) {
                    w2Var2.a(Boolean.FALSE, (TLRPC.TL_messages_availableEffects) tLObject, Long.valueOf(tL_messages_availableEffects.hash), Boolean.TRUE);
                    return;
                } else {
                    StringBuilder sb3 = new StringBuilder("getting available effects error ");
                    if (tL_error != null) {
                        str2 = tL_error.code + " " + tL_error.text;
                    } else {
                        str2 = "";
                    }
                    sb3.append(str2);
                    a8.d(sb3.toString());
                    Boolean bool4 = Boolean.FALSE;
                    if (tL_error != null && ((i10 = tL_error.code) == -2000 || i10 == -2001)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    w2Var2.a(bool4, null, 0L, Boolean.valueOf(z10));
                    return;
                }
        }
    }
}
