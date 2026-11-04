package dh;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.h10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g5;
public final class n0 {
    public boolean f9093a;
    public boolean f9094b;
    public long f9095c;
    public boolean d;
    public boolean f9096e;
    public String f9097f;
    public long f9098g;
    public long h;

    public static n0 b(String str) {
        if (str == null) {
            str = "";
        }
        ?? obj = new Object();
        if (str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                obj.f9098g = parseLong;
                obj.h = parseLong;
                return obj;
            } catch (Exception unused) {
                obj.f9097f = str;
                obj.h = str.hashCode();
                return obj;
            }
        }
        obj.f9097f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static n0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        ?? obj = new Object();
        String str = tL_availableReaction.reaction;
        obj.f9097f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static n0 d(TLRPC.Reaction reaction) {
        ?? obj = new Object();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            obj.f9093a = true;
            return obj;
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            obj.f9097f = str;
            obj.h = str.hashCode();
            return obj;
        } else {
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j10 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                obj.f9098g = j10;
                obj.h = j10;
            }
            return obj;
        }
    }

    public static n0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        ?? obj = new Object();
        boolean z10 = true;
        obj.f9094b = true;
        long j10 = tL_availableEffect.f27032id;
        obj.f9095c = j10;
        if (tL_availableEffect.effect_animation_id != 0) {
            z10 = false;
        }
        obj.f9096e = z10;
        obj.f9098g = tL_availableEffect.effect_sticker_id;
        obj.h = j10;
        obj.d = tL_availableEffect.premium_required;
        obj.f9097f = tL_availableEffect.emoticon;
        return obj;
    }

    public final n0 a() {
        String V;
        long j10 = this.f9098g;
        if (j10 != 0 && (V = zi.V(g5.e(h10.f22829t0, j10), null, null)) != null) {
            return b(V);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n0.class == obj.getClass()) {
            n0 n0Var = (n0) obj;
            if (this.f9098g == n0Var.f9098g && Objects.equals(this.f9097f, n0Var.f9097f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f9097f);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != this.f9098g) {
            return false;
        }
        return true;
    }

    public final TLRPC.Reaction g() {
        if (this.f9093a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f9097f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f9097f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.f9098g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f9097f, Long.valueOf(this.f9098g));
    }

    public final String toString() {
        TLRPC.Document e10;
        if (!TextUtils.isEmpty(this.f9097f)) {
            return this.f9097f;
        }
        long j10 = this.f9098g;
        if (j10 != 0 && (e10 = g5.e(h10.f22829t0, j10)) != null) {
            return zi.V(e10, null, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.f9098g);
        sb2.append(", ");
        return a1.g.s(sb2, this.f9097f, "}");
    }
}
