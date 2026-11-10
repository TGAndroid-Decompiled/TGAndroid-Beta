package ig;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
public final class b {
    public final String f15478a;
    public final String f15479b;

    public b(String str, String str2) {
        this.f15478a = str;
        this.f15479b = str2;
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
        if (TextUtils.isEmpty(this.f15478a) && TextUtils.isEmpty(this.f15479b)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.equals(this.f15478a, bVar.f15478a) && TextUtils.equals(this.f15479b, bVar.f15479b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int i10 = 0;
        String str = this.f15478a;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        String str2 = this.f15479b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i10 ^ i7;
    }
}
