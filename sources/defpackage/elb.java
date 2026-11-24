package defpackage;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class elb {
    public final String a;
    public final String b;

    public elb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static boolean a(elb elbVar, elb elbVar2) {
        if (elbVar == elbVar2) {
            return true;
        }
        if (elbVar != null && elbVar2 != null) {
            return elbVar.equals(elbVar2);
        }
        return false;
    }

    public static elb c(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return new elb(((TLRPC.TL_chatTheme) chatTheme).emoticon, null);
        }
        if (!(chatTheme instanceof TLRPC.TL_chatThemeUniqueGift)) {
            return null;
        }
        return new elb(null, ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift.slug);
    }

    public static elb d(String str) {
        return new elb(str, null);
    }

    public final boolean b() {
        if (TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.b)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof elb) {
            elb elbVar = (elb) obj;
            if (TextUtils.equals(this.a, elbVar.a) && TextUtils.equals(this.b, elbVar.b)) {
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
