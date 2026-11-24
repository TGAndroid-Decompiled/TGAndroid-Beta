package defpackage;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
public final class le5 {
    public static final le5 d;
    public static final le5 e;
    public static final le5 f;
    public static final le5 h;
    public static final le5 n;
    public static final le5 r;
    public static final le5 s;
    public static final le5 w;
    public static final le5 x;
    public static final le5[] y;
    public final String a;
    public final byte b;
    public final float c;

    static {
        le5 le5Var = new le5("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = le5Var;
        le5 le5Var2 = new le5("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = le5Var2;
        le5 le5Var3 = new le5("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = le5Var3;
        le5 le5Var4 = new le5("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = le5Var4;
        le5 le5Var5 = new le5("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = le5Var5;
        le5 le5Var6 = new le5("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = le5Var6;
        le5 le5Var7 = new le5("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = le5Var7;
        le5 le5Var8 = new le5("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        w = le5Var8;
        le5 le5Var9 = new le5();
        x = le5Var9;
        y = new le5[]{le5Var, le5Var2, le5Var3, le5Var4, le5Var5, le5Var6, le5Var7, le5Var8, le5Var9};
    }

    public le5() {
        this.a = "hints_controller_" + this;
        this.b = (byte) 3;
        this.c = 1.0f;
    }

    public static le5 valueOf(String str) {
        return (le5) Enum.valueOf(le5.class, str);
    }

    public static le5[] values() {
        return (le5[]) y.clone();
    }

    public final void a() {
        na7.c1().edit().putInt(this.a, this.b).apply();
    }

    public final void b() {
        SharedPreferences c1 = na7.c1();
        String str = this.a;
        na7.c1().edit().putInt(str, c1.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (na7.c1().getInt(this.a, 0) < this.b) {
            float f2 = this.c;
            if (f2 < 1.0f) {
                if (f2 > 0.0f && Utilities.c.nextFloat() < f2) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public le5(String str, int i, String str2, int i2, float f2) {
        this.a = str2;
        this.b = i2;
        this.c = f2;
    }
}
