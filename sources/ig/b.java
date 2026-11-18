package ig;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class b {
    public final String f16249a;
    public final String f16250b;

    public b(String str, String str2) {
        this.f16249a = str;
        this.f16250b = str2;
    }

    public static boolean a(b bVar, b bVar2) {
        if (bVar == bVar2) {
            return true;
        }
        if (bVar != null && bVar2 != null) {
            return bVar.equals(bVar2);
        }
        return false;
    }

    public static b c(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return new b(((TLRPC.TL_chatTheme) chatTheme).emoticon, null);
        }
        if (!(chatTheme instanceof TLRPC.TL_chatThemeUniqueGift)) {
            return null;
        }
        return new b(null, ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift.slug);
    }

    public static b d(String str) {
        return new b(str, null);
    }

    public final boolean b() {
        if (TextUtils.isEmpty(this.f16249a) && TextUtils.isEmpty(this.f16250b)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.equals(this.f16249a, bVar.f16249a) && TextUtils.equals(this.f16250b, bVar.f16250b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = 0;
        String str = this.f16249a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        String str2 = this.f16250b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i10 ^ i7;
    }
}
