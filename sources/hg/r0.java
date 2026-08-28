package hg;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k5;
public final class r0 {
    public boolean f10713a;
    public boolean f10714b;
    public long f10715c;
    public boolean d;
    public boolean f10716e;
    public String f10717f;
    public long f10718g;
    public long h;

    public static r0 b(String str) {
        if (str == null) {
            str = "";
        }
        ?? obj = new Object();
        if (str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                obj.f10718g = parseLong;
                obj.h = parseLong;
                return obj;
            } catch (Exception unused) {
                obj.f10717f = str;
                obj.h = str.hashCode();
                return obj;
            }
        }
        obj.f10717f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static r0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        ?? obj = new Object();
        String str = tL_availableReaction.reaction;
        obj.f10717f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static r0 d(TLRPC.Reaction reaction) {
        ?? obj = new Object();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            obj.f10713a = true;
            return obj;
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            obj.f10717f = str;
            obj.h = str.hashCode();
            return obj;
        } else {
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j10 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                obj.f10718g = j10;
                obj.h = j10;
            }
            return obj;
        }
    }

    public static r0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        ?? obj = new Object();
        boolean z10 = true;
        obj.f10714b = true;
        long j10 = tL_availableEffect.f22411id;
        obj.f10715c = j10;
        if (tL_availableEffect.effect_animation_id != 0) {
            z10 = false;
        }
        obj.f10716e = z10;
        obj.f10718g = tL_availableEffect.effect_sticker_id;
        obj.h = j10;
        obj.d = tL_availableEffect.premium_required;
        obj.f10717f = tL_availableEffect.emoticon;
        return obj;
    }

    public final r0 a() {
        String findAnimatedEmojiEmoticon;
        long j10 = this.f10718g;
        if (j10 != 0 && (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(k5.f(UserConfig.selectedAccount, j10), null)) != null) {
            return b(findAnimatedEmojiEmoticon);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r0.class == obj.getClass()) {
            r0 r0Var = (r0) obj;
            if (this.f10718g == r0Var.f10718g && Objects.equals(this.f10717f, r0Var.f10717f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f10717f);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != this.f10718g) {
            return false;
        }
        return true;
    }

    public final TLRPC.Reaction g() {
        if (this.f10713a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f10717f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f10717f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.f10718g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f10717f, Long.valueOf(this.f10718g));
    }

    public final String toString() {
        TLRPC.Document f10;
        if (!TextUtils.isEmpty(this.f10717f)) {
            return this.f10717f;
        }
        long j10 = this.f10718g;
        if (j10 != 0 && (f10 = k5.f(UserConfig.selectedAccount, j10)) != null) {
            return MessageObject.findAnimatedEmojiEmoticon(f10, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.f10718g);
        sb2.append(", ");
        return aa.d.r(sb2, this.f10717f, "}");
    }
}
