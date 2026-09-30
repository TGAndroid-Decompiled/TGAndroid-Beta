package fg;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class b {
    public final String f9060a;
    public final String f9061b;

    public b(String str, String str2) {
        this.f9060a = str;
        this.f9061b = str2;
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
        if (TextUtils.isEmpty(this.f9060a) && TextUtils.isEmpty(this.f9061b)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.equals(this.f9060a, bVar.f9060a) && TextUtils.equals(this.f9061b, bVar.f9061b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f9060a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        String str2 = this.f9061b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i11 ^ i10;
    }
}
