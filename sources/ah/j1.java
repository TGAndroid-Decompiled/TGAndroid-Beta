package ah;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q5;
public final class j1 {
    public boolean f593a;
    public boolean f594b;
    public long f595c;
    public boolean d;
    public boolean f596e;
    public String f597f;
    public long f598g;
    public long h;

    public static j1 b(String str) {
        if (str == null) {
            str = "";
        }
        ?? obj = new Object();
        if (str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                obj.f598g = parseLong;
                obj.h = parseLong;
                return obj;
            } catch (Exception unused) {
                obj.f597f = str;
                obj.h = str.hashCode();
                return obj;
            }
        }
        obj.f597f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static j1 c(TLRPC.TL_availableReaction tL_availableReaction) {
        ?? obj = new Object();
        String str = tL_availableReaction.reaction;
        obj.f597f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static j1 d(TLRPC.Reaction reaction) {
        ?? obj = new Object();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            obj.f593a = true;
            return obj;
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            obj.f597f = str;
            obj.h = str.hashCode();
            return obj;
        } else {
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j3 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                obj.f598g = j3;
                obj.h = j3;
            }
            return obj;
        }
    }

    public static j1 e(TLRPC.TL_availableEffect tL_availableEffect) {
        ?? obj = new Object();
        boolean z10 = true;
        obj.f594b = true;
        long j3 = tL_availableEffect.f19900id;
        obj.f595c = j3;
        if (tL_availableEffect.effect_animation_id != 0) {
            z10 = false;
        }
        obj.f596e = z10;
        obj.f598g = tL_availableEffect.effect_sticker_id;
        obj.h = j3;
        obj.d = tL_availableEffect.premium_required;
        obj.f597f = tL_availableEffect.emoticon;
        return obj;
    }

    public final j1 a() {
        String findAnimatedEmojiEmoticon;
        long j3 = this.f598g;
        if (j3 != 0 && (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(q5.f(UserConfig.selectedAccount, j3), null)) != null) {
            return b(findAnimatedEmojiEmoticon);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j1.class == obj.getClass()) {
            j1 j1Var = (j1) obj;
            if (this.f598g == j1Var.f598g && Objects.equals(this.f597f, j1Var.f597f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f597f);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != this.f598g) {
            return false;
        }
        return true;
    }

    public final TLRPC.Reaction g() {
        if (this.f593a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f597f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f597f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.f598g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f597f, Long.valueOf(this.f598g));
    }

    public final String toString() {
        TLRPC.Document f7;
        if (!TextUtils.isEmpty(this.f597f)) {
            return this.f597f;
        }
        long j3 = this.f598g;
        if (j3 != 0 && (f7 = q5.f(UserConfig.selectedAccount, j3)) != null) {
            return MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.f598g);
        sb2.append(", ");
        return a4.a.s(sb2, this.f597f, "}");
    }
}
