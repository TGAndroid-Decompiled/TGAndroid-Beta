package of;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

public final class b {

    public final String f19441a;

    public final String f19442b;

    public b(String str, String str2) {
        this.f19441a = str;
        this.f19442b = str2;
    }

    public static boolean a(b bVar, b bVar2) {
        if (bVar == bVar2) {
            return true;
        }
        if (bVar == null || bVar2 == null) {
            return false;
        }
        return bVar.equals(bVar2);
    }

    public static b c(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return new b(((TLRPC.TL_chatTheme) chatTheme).emoticon, null);
        }
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return new b(null, ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift.slug);
        }
        return null;
    }

    public static b d(String str) {
        return new b(str, null);
    }

    public final boolean b() {
        return TextUtils.isEmpty(this.f19441a) && TextUtils.isEmpty(this.f19442b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.equals(this.f19441a, bVar.f19441a) && TextUtils.equals(this.f19442b, bVar.f19442b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f19441a;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f19442b;
        return (str2 != null ? str2.hashCode() : 0) ^ iHashCode;
    }
}
