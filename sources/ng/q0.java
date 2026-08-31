package ng;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l5;
public final class q0 {
    public boolean f16174a;
    public boolean f16175b;
    public long f16176c;
    public boolean d;
    public boolean f16177e;
    public String f16178f;
    public long f16179g;
    public long h;

    public static q0 b(String str) {
        if (str == null) {
            str = "";
        }
        ?? obj = new Object();
        if (str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                obj.f16179g = parseLong;
                obj.h = parseLong;
                return obj;
            } catch (Exception unused) {
                obj.f16178f = str;
                obj.h = str.hashCode();
                return obj;
            }
        }
        obj.f16178f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static q0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        ?? obj = new Object();
        String str = tL_availableReaction.reaction;
        obj.f16178f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static q0 d(TLRPC.Reaction reaction) {
        ?? obj = new Object();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            obj.f16174a = true;
            return obj;
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            obj.f16178f = str;
            obj.h = str.hashCode();
            return obj;
        } else {
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j10 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                obj.f16179g = j10;
                obj.h = j10;
            }
            return obj;
        }
    }

    public static q0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        ?? obj = new Object();
        boolean z4 = true;
        obj.f16175b = true;
        long j10 = tL_availableEffect.f20874id;
        obj.f16176c = j10;
        if (tL_availableEffect.effect_animation_id != 0) {
            z4 = false;
        }
        obj.f16177e = z4;
        obj.f16179g = tL_availableEffect.effect_sticker_id;
        obj.h = j10;
        obj.d = tL_availableEffect.premium_required;
        obj.f16178f = tL_availableEffect.emoticon;
        return obj;
    }

    public final q0 a() {
        String findAnimatedEmojiEmoticon;
        long j10 = this.f16179g;
        if (j10 != 0 && (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(l5.f(UserConfig.selectedAccount, j10), null)) != null) {
            return b(findAnimatedEmojiEmoticon);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q0.class == obj.getClass()) {
            q0 q0Var = (q0) obj;
            if (this.f16179g == q0Var.f16179g && Objects.equals(this.f16178f, q0Var.f16178f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f16178f);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != this.f16179g) {
            return false;
        }
        return true;
    }

    public final TLRPC.Reaction g() {
        if (this.f16174a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f16178f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f16178f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.f16179g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f16178f, Long.valueOf(this.f16179g));
    }

    public final String toString() {
        TLRPC.Document f10;
        if (!TextUtils.isEmpty(this.f16178f)) {
            return this.f16178f;
        }
        long j10 = this.f16179g;
        if (j10 != 0 && (f10 = l5.f(UserConfig.selectedAccount, j10)) != null) {
            return MessageObject.findAnimatedEmojiEmoticon(f10, null);
        }
        StringBuilder sb = new StringBuilder("VisibleReaction{");
        sb.append(this.f16179g);
        sb.append(", ");
        return android.support.v4.media.a.r(sb, this.f16178f, "}");
    }
}
