package fg;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class b {
    public final String f9051a;
    public final String f9052b;

    public b(String str, String str2) {
        this.f9051a = str;
        this.f9052b = str2;
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
        if (TextUtils.isEmpty(this.f9051a) && TextUtils.isEmpty(this.f9052b)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.equals(this.f9051a, bVar.f9051a) && TextUtils.equals(this.f9052b, bVar.f9052b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f9051a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        String str2 = this.f9052b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i11 ^ i10;
    }
}
