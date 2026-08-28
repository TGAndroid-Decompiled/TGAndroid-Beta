package nf;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class b {
    public final String f18592a;
    public final String f18593b;

    public b(String str, String str2) {
        this.f18592a = str;
        this.f18593b = str2;
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
        if (TextUtils.isEmpty(this.f18592a) && TextUtils.isEmpty(this.f18593b)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.equals(this.f18592a, bVar.f18592a) && TextUtils.equals(this.f18593b, bVar.f18593b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10 = 0;
        String str = this.f18592a;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        String str2 = this.f18593b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i10 ^ i9;
    }
}
