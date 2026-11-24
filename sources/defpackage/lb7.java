package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lb7 implements RequestDelegate {
    public final byte a;
    public final z71 b;

    public lb7(z71 z71Var, byte b) {
        this.a = b;
        this.b = z71Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i;
        TLRPC.TL_help_appConfig tL_help_appConfig;
        int i2;
        TLRPC.TL_messages_availableEffects tL_messages_availableEffects;
        TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups;
        byte b = this.a;
        boolean z = true;
        String str = "";
        z71 z71Var = this.b;
        switch (b) {
            case 0:
                if (tLObject instanceof TLRPC.TL_help_appConfigNotModified) {
                    Boolean bool = Boolean.TRUE;
                    z71Var.a(bool, null, 0L, bool);
                    return;
                } else if (tLObject instanceof TLRPC.TL_help_appConfig) {
                    z71Var.a(Boolean.FALSE, (TLRPC.TL_help_appConfig) tLObject, Long.valueOf(tL_help_appConfig.hash), Boolean.TRUE);
                    return;
                } else {
                    if (tL_error != null) {
                        str = tL_error.code + " " + tL_error.text;
                    }
                    fc4.d("getting appconfig error ".concat(str));
                    Boolean bool2 = Boolean.FALSE;
                    if (tL_error != null && ((i = tL_error.code) == -2000 || i == -2001)) {
                        z = false;
                    }
                    z71Var.a(bool2, null, 0L, Boolean.valueOf(z));
                    return;
                }
            case 1:
                if (tLObject instanceof TLRPC.TL_messages_availableEffectsNotModified) {
                    Boolean bool3 = Boolean.TRUE;
                    z71Var.a(bool3, null, 0L, bool3);
                    return;
                } else if (tLObject instanceof TLRPC.TL_messages_availableEffects) {
                    z71Var.a(Boolean.FALSE, (TLRPC.TL_messages_availableEffects) tLObject, Long.valueOf(tL_messages_availableEffects.hash), Boolean.TRUE);
                    return;
                } else {
                    if (tL_error != null) {
                        str = tL_error.code + " " + tL_error.text;
                    }
                    fc4.d("getting available effects error ".concat(str));
                    Boolean bool4 = Boolean.FALSE;
                    if (tL_error != null && ((i2 = tL_error.code) == -2000 || i2 == -2001)) {
                        z = false;
                    }
                    z71Var.a(bool4, null, 0L, Boolean.valueOf(z));
                    return;
                }
            case 2:
                if (tLObject instanceof TLRPC.TL_messages_emojiGroupsNotModified) {
                    Boolean bool5 = Boolean.TRUE;
                    z71Var.a(bool5, null, 0L, bool5);
                    return;
                }
                boolean z2 = tLObject instanceof TLRPC.TL_messages_emojiGroups;
                Boolean bool6 = Boolean.FALSE;
                if (z2) {
                    z71Var.a(bool6, (TLRPC.TL_messages_emojiGroups) tLObject, Long.valueOf(tL_messages_emojiGroups.hash), Boolean.TRUE);
                    return;
                }
                z71Var.a(bool6, null, 0L, Boolean.TRUE);
                return;
            default:
                if (tLObject instanceof TLRPC.TL_emojiListNotModified) {
                    Boolean bool7 = Boolean.TRUE;
                    z71Var.a(bool7, null, 0L, bool7);
                    return;
                }
                boolean z3 = tLObject instanceof TLRPC.TL_emojiList;
                Boolean bool8 = Boolean.FALSE;
                if (z3) {
                    TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) tLObject;
                    z71Var.a(bool8, tL_emojiList, Long.valueOf(tL_emojiList.hash), Boolean.TRUE);
                    return;
                }
                z71Var.a(bool8, null, 0L, Boolean.TRUE);
                return;
        }
    }
}
