package defpackage;

import android.content.SharedPreferences;
import org.telegram.messenger.Utilities;
public final class jg5 {
    public static final jg5 d;
    public static final jg5 e;
    public static final jg5 f;
    public static final jg5 h;
    public static final jg5 n;
    public static final jg5 r;
    public static final jg5 s;
    public static final jg5 w;
    public static final jg5 x;
    public static final jg5[] y;
    public final String a;
    public final byte b;
    public final float c;

    static {
        jg5 jg5Var = new jg5("RoundHint2", 0, "needShowRoundHint2", 3, 0.2f);
        d = jg5Var;
        jg5 jg5Var2 = new jg5("RoundHintChannel2", 1, "needShowRoundHintChannel2", 3, 0.2f);
        e = jg5Var2;
        jg5 jg5Var3 = new jg5("ChannelSuggestHint", 2, "channelsuggesthint", 3, 0.2f);
        f = jg5Var3;
        jg5 jg5Var4 = new jg5("ChannelGiftHint", 3, "channelgifthint", 3, 0.2f);
        h = jg5Var4;
        jg5 jg5Var5 = new jg5("GroupEmojiPackHintShown", 4, "groupEmojiPackShownHint", 1, 1.0f);
        n = jg5Var5;
        jg5 jg5Var6 = new jg5("AccountSwitchHint", 5, "accountswitchhint", 3, 1.0f);
        r = jg5Var6;
        jg5 jg5Var7 = new jg5("GiftMessageHint", 6, "giftMessaheHint", 3, 1.0f);
        s = jg5Var7;
        jg5 jg5Var8 = new jg5("PlaybackSpeedHint", 7, "playbackspeedhint", 3, 0.2f);
        w = jg5Var8;
        jg5 jg5Var9 = new jg5();
        x = jg5Var9;
        y = new jg5[]{jg5Var, jg5Var2, jg5Var3, jg5Var4, jg5Var5, jg5Var6, jg5Var7, jg5Var8, jg5Var9};
    }

    public jg5() {
        this.a = "hints_controller_" + this;
        this.b = (byte) 3;
        this.c = 1.0f;
    }

    public static jg5 valueOf(String str) {
        return (jg5) Enum.valueOf(jg5.class, str);
    }

    public static jg5[] values() {
        return (jg5[]) y.clone();
    }

    public final void a() {
        oc7.d1().edit().putInt(this.a, this.b).apply();
    }

    public final void b() {
        SharedPreferences d1 = oc7.d1();
        String str = this.a;
        oc7.d1().edit().putInt(str, d1.getInt(str, 0) + 1).apply();
    }

    public final boolean c() {
        if (oc7.d1().getInt(this.a, 0) < this.b) {
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

    public jg5(String str, int i, String str2, int i2, float f2) {
        this.a = str2;
        this.b = i2;
        this.c = f2;
    }
}
