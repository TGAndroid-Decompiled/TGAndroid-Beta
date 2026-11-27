package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class dpb {
    public final String a;
    public final String b;

    public dpb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static boolean a(dpb dpbVar, dpb dpbVar2) {
        if (dpbVar == dpbVar2) {
            return true;
        }
        if (dpbVar != null && dpbVar2 != null) {
            return dpbVar.equals(dpbVar2);
        }
        return false;
    }

    public static dpb c(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return new dpb(((TLRPC.TL_chatTheme) chatTheme).emoticon, null);
        }
        if (!(chatTheme instanceof TLRPC.TL_chatThemeUniqueGift)) {
            return null;
        }
        return new dpb(null, ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift.slug);
    }

    public static dpb d(String str) {
        return new dpb(str, null);
    }

    public final boolean b() {
        if (TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.b)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        String replace;
        if (obj instanceof dpb) {
            dpb dpbVar = (dpb) obj;
            String str = null;
            String str2 = this.a;
            if (str2 == null) {
                replace = null;
            } else {
                replace = str2.replace("️", "");
            }
            String str3 = dpbVar.a;
            if (str3 != null) {
                str = str3.replace("️", "");
            }
            if (TextUtils.equals(replace, str) && TextUtils.equals(this.b, dpbVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        String str = this.a;
        if (str != null) {
            i = str.replace("️", "").hashCode();
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
