package kg;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p5;
public final class q0 {
    public boolean f13821a;
    public boolean f13822b;
    public long f13823c;
    public boolean d;
    public boolean f13824e;
    public String f13825f;
    public long f13826g;
    public long h;

    public static q0 b(String str) {
        if (str == null) {
            str = "";
        }
        ?? obj = new Object();
        if (str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                obj.f13826g = parseLong;
                obj.h = parseLong;
                return obj;
            } catch (Exception unused) {
                obj.f13825f = str;
                obj.h = str.hashCode();
                return obj;
            }
        }
        obj.f13825f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static q0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        ?? obj = new Object();
        String str = tL_availableReaction.reaction;
        obj.f13825f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static q0 d(TLRPC.Reaction reaction) {
        ?? obj = new Object();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            obj.f13821a = true;
            return obj;
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            obj.f13825f = str;
            obj.h = str.hashCode();
            return obj;
        } else {
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j10 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                obj.f13826g = j10;
                obj.h = j10;
            }
            return obj;
        }
    }

    public static q0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        ?? obj = new Object();
        boolean z10 = true;
        obj.f13822b = true;
        long j10 = tL_availableEffect.f22423id;
        obj.f13823c = j10;
        if (tL_availableEffect.effect_animation_id != 0) {
            z10 = false;
        }
        obj.f13824e = z10;
        obj.f13826g = tL_availableEffect.effect_sticker_id;
        obj.h = j10;
        obj.d = tL_availableEffect.premium_required;
        obj.f13825f = tL_availableEffect.emoticon;
        return obj;
    }

    public final q0 a() {
        String findAnimatedEmojiEmoticon;
        long j10 = this.f13826g;
        if (j10 != 0 && (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(p5.f(UserConfig.selectedAccount, j10), null)) != null) {
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
            if (this.f13826g == q0Var.f13826g && Objects.equals(this.f13825f, q0Var.f13825f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f13825f);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != this.f13826g) {
            return false;
        }
        return true;
    }

    public final TLRPC.Reaction g() {
        if (this.f13821a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f13825f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f13825f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.f13826g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f13825f, Long.valueOf(this.f13826g));
    }

    public final String toString() {
        TLRPC.Document f9;
        if (!TextUtils.isEmpty(this.f13825f)) {
            return this.f13825f;
        }
        long j10 = this.f13826g;
        if (j10 != 0 && (f9 = p5.f(UserConfig.selectedAccount, j10)) != null) {
            return MessageObject.findAnimatedEmojiEmoticon(f9, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.f13826g);
        sb2.append(", ");
        return a4.w.q(sb2, this.f13825f, "}");
    }
}
