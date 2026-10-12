package ah;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s5;
public final class i1 {
    public boolean f776a;
    public boolean f777b;
    public long f778c;
    public boolean d;
    public boolean e;
    public String f779f;
    public long f780g;
    public long h;

    public static i1 b(String str) {
        if (str == null) {
            str = "";
        }
        ?? obj = new Object();
        if (str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                obj.f780g = parseLong;
                obj.h = parseLong;
                return obj;
            } catch (Exception unused) {
                obj.f779f = str;
                obj.h = str.hashCode();
                return obj;
            }
        }
        obj.f779f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static i1 c(TLRPC.TL_availableReaction tL_availableReaction) {
        ?? obj = new Object();
        String str = tL_availableReaction.reaction;
        obj.f779f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static i1 d(TLRPC.Reaction reaction) {
        ?? obj = new Object();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            obj.f776a = true;
            return obj;
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            obj.f779f = str;
            obj.h = str.hashCode();
            return obj;
        } else {
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j10 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                obj.f780g = j10;
                obj.h = j10;
            }
            return obj;
        }
    }

    public static i1 e(TLRPC.TL_availableEffect tL_availableEffect) {
        ?? obj = new Object();
        boolean z10 = true;
        obj.f777b = true;
        long j10 = tL_availableEffect.f19247id;
        obj.f778c = j10;
        if (tL_availableEffect.effect_animation_id != 0) {
            z10 = false;
        }
        obj.e = z10;
        obj.f780g = tL_availableEffect.effect_sticker_id;
        obj.h = j10;
        obj.d = tL_availableEffect.premium_required;
        obj.f779f = tL_availableEffect.emoticon;
        return obj;
    }

    public final i1 a() {
        String findAnimatedEmojiEmoticon;
        long j10 = this.f780g;
        if (j10 != 0 && (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(s5.f(UserConfig.selectedAccount, j10), null)) != null) {
            return b(findAnimatedEmojiEmoticon);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i1.class == obj.getClass()) {
            i1 i1Var = (i1) obj;
            if (this.f780g == i1Var.f780g && Objects.equals(this.f779f, i1Var.f779f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f779f);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != this.f780g) {
            return false;
        }
        return true;
    }

    public final TLRPC.Reaction g() {
        if (this.f776a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f779f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f779f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.f780g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f779f, Long.valueOf(this.f780g));
    }

    public final String toString() {
        TLRPC.Document f7;
        if (!TextUtils.isEmpty(this.f779f)) {
            return this.f779f;
        }
        long j10 = this.f780g;
        if (j10 != 0 && (f7 = s5.f(UserConfig.selectedAccount, j10)) != null) {
            return MessageObject.findAnimatedEmojiEmoticon(f7, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.f780g);
        sb2.append(", ");
        return a1.g.s(sb2, this.f779f, "}");
    }
}
