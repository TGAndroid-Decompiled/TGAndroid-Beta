package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bo implements RequestDelegate {
    public final int f21862a;
    public final w2 f21863b;

    public bo(w2 w2Var, int i3) {
        this.f21862a = i3;
        this.f21863b = w2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        boolean z10;
        int i3;
        TLRPC.TL_help_appConfig tL_help_appConfig;
        String str2;
        boolean z11;
        int i10;
        TLRPC.TL_messages_availableEffects tL_messages_availableEffects;
        switch (this.f21862a) {
            case 0:
                boolean z12 = tLObject instanceof TLRPC.TL_help_appConfigNotModified;
                w2 w2Var = this.f21863b;
                if (z12) {
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
                    if (tL_error != null && ((i3 = tL_error.code) == -2000 || i3 == -2001)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    w2Var.a(bool2, null, 0L, Boolean.valueOf(z10));
                    return;
                }
            default:
                boolean z13 = tLObject instanceof TLRPC.TL_messages_availableEffectsNotModified;
                w2 w2Var2 = this.f21863b;
                if (z13) {
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
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    w2Var2.a(bool4, null, 0L, Boolean.valueOf(z11));
                    return;
                }
        }
    }
}
