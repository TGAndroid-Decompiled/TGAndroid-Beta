package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.tgnet.TLRPC;
public final class w49 {
    public boolean a;
    public boolean b;
    public long c;
    public boolean d;
    public boolean e;
    public String f;
    public long g;
    public long h;

    public static w49 b(String str) {
        if (str == null) {
            str = "";
        }
        ?? obj = new Object();
        if (str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                obj.g = parseLong;
                obj.h = parseLong;
                return obj;
            } catch (Exception unused) {
                obj.f = str;
                obj.h = str.hashCode();
                return obj;
            }
        }
        obj.f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static w49 c(TLRPC.TL_availableReaction tL_availableReaction) {
        ?? obj = new Object();
        String str = tL_availableReaction.reaction;
        obj.f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static w49 d(TLRPC.Reaction reaction) {
        ?? obj = new Object();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            obj.a = true;
            return obj;
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            obj.f = str;
            obj.h = str.hashCode();
            return obj;
        } else {
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                obj.g = j;
                obj.h = j;
            }
            return obj;
        }
    }

    public static w49 e(TLRPC.TL_availableEffect tL_availableEffect) {
        ?? obj = new Object();
        boolean z = true;
        obj.b = true;
        long j = tL_availableEffect.id;
        obj.c = j;
        if (tL_availableEffect.effect_animation_id != 0) {
            z = false;
        }
        obj.e = z;
        obj.g = tL_availableEffect.effect_sticker_id;
        obj.h = j;
        obj.d = tL_availableEffect.premium_required;
        obj.f = tL_availableEffect.emoticon;
        return obj;
    }

    public final w49 a() {
        String V;
        long j = this.g;
        if (j != 0 && (V = r47.V(wl.e(yac.t0, j), null, null)) != null) {
            return b(V);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w49.class == obj.getClass()) {
            w49 w49Var = (w49) obj;
            if (this.g == w49Var.g && Objects.equals(this.f, w49Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != this.g) {
            return false;
        }
        return true;
    }

    public final TLRPC.Reaction g() {
        if (this.a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f, Long.valueOf(this.g));
    }

    public final String toString() {
        TLRPC.Document e;
        if (!TextUtils.isEmpty(this.f)) {
            return this.f;
        }
        long j = this.g;
        if (j != 0 && (e = wl.e(yac.t0, j)) != null) {
            return r47.V(e, null, null);
        }
        StringBuilder sb = new StringBuilder("VisibleReaction{");
        sb.append(this.g);
        sb.append(", ");
        return c00.k(sb, this.f, "}");
    }
}
