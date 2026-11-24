package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class fnb {
    public final String a;
    public final String b;

    public fnb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static boolean a(fnb fnbVar, fnb fnbVar2) {
        if (fnbVar == fnbVar2) {
            return true;
        }
        if (fnbVar != null && fnbVar2 != null) {
            return fnbVar.equals(fnbVar2);
        }
        return false;
    }

    public static fnb c(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return new fnb(((TLRPC.TL_chatTheme) chatTheme).emoticon, null);
        }
        if (!(chatTheme instanceof TLRPC.TL_chatThemeUniqueGift)) {
            return null;
        }
        return new fnb(null, ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift.slug);
    }

    public static fnb d(String str) {
        return new fnb(str, null);
    }

    public final boolean b() {
        if (TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.b)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fnb) {
            fnb fnbVar = (fnb) obj;
            if (TextUtils.equals(this.a, fnbVar.a) && TextUtils.equals(this.b, fnbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i ^ i2;
    }
}
