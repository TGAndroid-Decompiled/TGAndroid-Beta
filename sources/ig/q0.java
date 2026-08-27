package ig;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k5;

public final class q0 {

    public boolean f11408a;

    public boolean f11409b;

    public long f11410c;
    public boolean d;

    public boolean f11411e;

    public String f11412f;

    public long f11413g;
    public long h;

    public static q0 b(String str) {
        if (str == null) {
            str = "";
        }
        q0 q0Var = new q0();
        if (!str.startsWith("animated_")) {
            q0Var.f11412f = str;
            q0Var.h = str.hashCode();
            return q0Var;
        }
        try {
            long j10 = Long.parseLong(str.substring(9));
            q0Var.f11413g = j10;
            q0Var.h = j10;
            return q0Var;
        } catch (Exception unused) {
            q0Var.f11412f = str;
            q0Var.h = str.hashCode();
            return q0Var;
        }
    }

    public static q0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        q0 q0Var = new q0();
        String str = tL_availableReaction.reaction;
        q0Var.f11412f = str;
        q0Var.h = str.hashCode();
        return q0Var;
    }

    public static q0 d(TLRPC.Reaction reaction) {
        q0 q0Var = new q0();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            q0Var.f11408a = true;
            return q0Var;
        }
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            q0Var.f11412f = str;
            q0Var.h = str.hashCode();
            return q0Var;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j10 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
            q0Var.f11413g = j10;
            q0Var.h = j10;
        }
        return q0Var;
    }

    public static q0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        q0 q0Var = new q0();
        q0Var.f11409b = true;
        long j10 = tL_availableEffect.f22411id;
        q0Var.f11410c = j10;
        q0Var.f11411e = tL_availableEffect.effect_animation_id == 0;
        q0Var.f11413g = tL_availableEffect.effect_sticker_id;
        q0Var.h = j10;
        q0Var.d = tL_availableEffect.premium_required;
        q0Var.f11412f = tL_availableEffect.emoticon;
        return q0Var;
    }

    public final q0 a() {
        String strFindAnimatedEmojiEmoticon;
        long j10 = this.f11413g;
        return (j10 == 0 || (strFindAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(k5.f(UserConfig.selectedAccount, j10), null)) == null) ? this : b(strFindAnimatedEmojiEmoticon);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q0.class == obj.getClass()) {
            q0 q0Var = (q0) obj;
            if (this.f11413g == q0Var.f11413g && Objects.equals(this.f11412f, q0Var.f11412f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f11412f);
        }
        return (reaction instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == this.f11413g;
    }

    public final TLRPC.Reaction g() {
        if (this.f11408a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f11412f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f11412f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.f11413g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f11412f, Long.valueOf(this.f11413g));
    }

    public final String toString() {
        TLRPC.Document documentF;
        if (!TextUtils.isEmpty(this.f11412f)) {
            return this.f11412f;
        }
        long j10 = this.f11413g;
        if (j10 != 0 && (documentF = k5.f(UserConfig.selectedAccount, j10)) != null) {
            return MessageObject.findAnimatedEmojiEmoticon(documentF, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.f11413g);
        sb2.append(", ");
        return a9.p.p(sb2, this.f11412f, "}");
    }
}
