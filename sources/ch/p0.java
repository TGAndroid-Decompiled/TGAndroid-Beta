package ch;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g5;
public final class p0 {
    public boolean f5187a;
    public boolean f5188b;
    public long f5189c;
    public boolean d;
    public boolean f5190e;
    public String f5191f;
    public long f5192g;
    public long h;

    public static p0 b(String str) {
        if (str == null) {
            str = "";
        }
        ?? obj = new Object();
        if (str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                obj.f5192g = parseLong;
                obj.h = parseLong;
                return obj;
            } catch (Exception unused) {
                obj.f5191f = str;
                obj.h = str.hashCode();
                return obj;
            }
        }
        obj.f5191f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static p0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        ?? obj = new Object();
        String str = tL_availableReaction.reaction;
        obj.f5191f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static p0 d(TLRPC.Reaction reaction) {
        ?? obj = new Object();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            obj.f5187a = true;
            return obj;
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            obj.f5191f = str;
            obj.h = str.hashCode();
            return obj;
        } else {
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j3 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                obj.f5192g = j3;
                obj.h = j3;
            }
            return obj;
        }
    }

    public static p0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        ?? obj = new Object();
        boolean z10 = true;
        obj.f5188b = true;
        long j3 = tL_availableEffect.f28082id;
        obj.f5189c = j3;
        if (tL_availableEffect.effect_animation_id != 0) {
            z10 = false;
        }
        obj.f5190e = z10;
        obj.f5192g = tL_availableEffect.effect_sticker_id;
        obj.h = j3;
        obj.d = tL_availableEffect.premium_required;
        obj.f5191f = tL_availableEffect.emoticon;
        return obj;
    }

    public final p0 a() {
        String V;
        long j3 = this.f5192g;
        if (j3 != 0 && (V = gj.V(g5.e(m10.f24940t0, j3), null, null)) != null) {
            return b(V);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p0.class == obj.getClass()) {
            p0 p0Var = (p0) obj;
            if (this.f5192g == p0Var.f5192g && Objects.equals(this.f5191f, p0Var.f5191f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f5191f);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != this.f5192g) {
            return false;
        }
        return true;
    }

    public final TLRPC.Reaction g() {
        if (this.f5187a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f5191f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f5191f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.f5192g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f5191f, Long.valueOf(this.f5192g));
    }

    public final String toString() {
        TLRPC.Document e10;
        if (!TextUtils.isEmpty(this.f5191f)) {
            return this.f5191f;
        }
        long j3 = this.f5192g;
        if (j3 != 0 && (e10 = g5.e(m10.f24940t0, j3)) != null) {
            return gj.V(e10, null, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.f5192g);
        sb2.append(", ");
        return a8.p0.s(sb2, this.f5191f, "}");
    }
}
