package bh;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t5;
public final class x0 {
    public boolean f4205a;
    public boolean f4206b;
    public long f4207c;
    public boolean d;
    public boolean e;
    public String f4208f;
    public long f4209g;
    public long h;

    public static x0 b(String str) {
        if (str == null) {
            str = "";
        }
        ?? obj = new Object();
        if (str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                obj.f4209g = parseLong;
                obj.h = parseLong;
                return obj;
            } catch (Exception unused) {
                obj.f4208f = str;
                obj.h = str.hashCode();
                return obj;
            }
        }
        obj.f4208f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static x0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        ?? obj = new Object();
        String str = tL_availableReaction.reaction;
        obj.f4208f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static x0 d(TLRPC.Reaction reaction) {
        ?? obj = new Object();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            obj.f4205a = true;
            return obj;
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            obj.f4208f = str;
            obj.h = str.hashCode();
            return obj;
        } else {
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j10 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                obj.f4209g = j10;
                obj.h = j10;
            }
            return obj;
        }
    }

    public static x0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        ?? obj = new Object();
        boolean z10 = true;
        obj.f4206b = true;
        long j10 = tL_availableEffect.f22059id;
        obj.f4207c = j10;
        if (tL_availableEffect.effect_animation_id != 0) {
            z10 = false;
        }
        obj.e = z10;
        obj.f4209g = tL_availableEffect.effect_sticker_id;
        obj.h = j10;
        obj.d = tL_availableEffect.premium_required;
        obj.f4208f = tL_availableEffect.emoticon;
        return obj;
    }

    public final x0 a() {
        String findAnimatedEmojiEmoticon;
        long j10 = this.f4209g;
        if (j10 != 0 && (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(t5.f(UserConfig.selectedAccount, j10), null)) != null) {
            return b(findAnimatedEmojiEmoticon);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x0.class == obj.getClass()) {
            x0 x0Var = (x0) obj;
            if (this.f4209g == x0Var.f4209g && Objects.equals(this.f4208f, x0Var.f4208f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f4208f);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != this.f4209g) {
            return false;
        }
        return true;
    }

    public final TLRPC.Reaction g() {
        if (this.f4205a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f4208f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f4208f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.f4209g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f4208f, Long.valueOf(this.f4209g));
    }

    public final String toString() {
        TLRPC.Document f7;
        if (!TextUtils.isEmpty(this.f4208f)) {
            return this.f4208f;
        }
        long j10 = this.f4209g;
        if (j10 != 0 && (f7 = t5.f(UserConfig.selectedAccount, j10)) != null) {
            return MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.f4209g);
        sb2.append(", ");
        return a1.g.s(sb2, this.f4208f, "}");
    }
}
