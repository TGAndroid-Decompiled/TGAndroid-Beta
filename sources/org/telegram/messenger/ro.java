package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ro implements RequestDelegate {
    public final int f17759a;
    public final a3 f17760b;

    public ro(a3 a3Var, int i10) {
        this.f17759a = i10;
        this.f17760b = a3Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        boolean z10;
        int i10;
        TLRPC.TL_help_appConfig tL_help_appConfig;
        String str2;
        boolean z11;
        int i11;
        TLRPC.TL_messages_availableEffects tL_messages_availableEffects;
        switch (this.f17759a) {
            case 0:
                boolean z12 = tLObject instanceof TLRPC.TL_help_appConfigNotModified;
                a3 a3Var = this.f17760b;
                if (z12) {
                    Boolean bool = Boolean.TRUE;
                    a3Var.a(bool, null, 0L, bool);
                    return;
                } else if (tLObject instanceof TLRPC.TL_help_appConfig) {
                    a3Var.a(Boolean.FALSE, (TLRPC.TL_help_appConfig) tLObject, Long.valueOf(tL_help_appConfig.hash), Boolean.TRUE);
                    return;
                } else {
                    StringBuilder sb2 = new StringBuilder("getting appconfig error ");
                    if (tL_error != null) {
                        str = tL_error.code + " " + tL_error.text;
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    f8.d(sb2.toString());
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error != null && ((i10 = tL_error.code) == -2000 || i10 == -2001)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    a3Var.a(bool2, null, 0L, Boolean.valueOf(z10));
                    return;
                }
            default:
                boolean z13 = tLObject instanceof TLRPC.TL_messages_availableEffectsNotModified;
                a3 a3Var2 = this.f17760b;
                if (z13) {
                    Boolean bool3 = Boolean.TRUE;
                    a3Var2.a(bool3, null, 0L, bool3);
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_availableEffects) {
                    a3Var2.a(Boolean.FALSE, (TLRPC.TL_messages_availableEffects) tLObject, Long.valueOf(tL_messages_availableEffects.hash), Boolean.TRUE);
                    return;
                } else {
                    StringBuilder sb3 = new StringBuilder("getting available effects error ");
                    if (tL_error != null) {
                        str2 = tL_error.code + " " + tL_error.text;
                    } else {
                        str2 = "";
                    }
                    sb3.append(str2);
                    f8.d(sb3.toString());
                    Boolean bool4 = Boolean.FALSE;
                    if (tL_error != null && ((i11 = tL_error.code) == -2000 || i11 == -2001)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    a3Var2.a(bool4, null, 0L, Boolean.valueOf(z11));
                    return;
                }
        }
    }
}
