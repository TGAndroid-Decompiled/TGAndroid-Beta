package ch;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.gj;
import org.telegram.messenger.k10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p5;
public final class p0 {
    public boolean f5503a;
    public boolean f5504b;
    public long f5505c;
    public boolean d;
    public boolean f5506e;
    public String f5507f;
    public long f5508g;
    public long h;

    public static p0 b(String str) {
        if (str == null) {
            str = "";
        }
        ?? obj = new Object();
        if (str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                obj.f5508g = parseLong;
                obj.h = parseLong;
                return obj;
            } catch (Exception unused) {
                obj.f5507f = str;
                obj.h = str.hashCode();
                return obj;
            }
        }
        obj.f5507f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static p0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        ?? obj = new Object();
        String str = tL_availableReaction.reaction;
        obj.f5507f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static p0 d(TLRPC.Reaction reaction) {
        ?? obj = new Object();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            obj.f5503a = true;
            return obj;
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            obj.f5507f = str;
            obj.h = str.hashCode();
            return obj;
        } else {
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j3 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                obj.f5508g = j3;
                obj.h = j3;
            }
            return obj;
        }
    }

    public static p0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        ?? obj = new Object();
        boolean z10 = true;
        obj.f5504b = true;
        long j3 = tL_availableEffect.f28465id;
        obj.f5505c = j3;
        if (tL_availableEffect.effect_animation_id != 0) {
            z10 = false;
        }
        obj.f5506e = z10;
        obj.f5508g = tL_availableEffect.effect_sticker_id;
        obj.h = j3;
        obj.d = tL_availableEffect.premium_required;
        obj.f5507f = tL_availableEffect.emoticon;
        return obj;
    }

    public final p0 a() {
        String V;
        long j3 = this.f5508g;
        if (j3 != 0 && (V = gj.V(p5.e(k10.f24968t0, j3), null, null)) != null) {
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
            if (this.f5508g == p0Var.f5508g && Objects.equals(this.f5507f, p0Var.f5507f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f5507f);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != this.f5508g) {
            return false;
        }
        return true;
    }

    public final TLRPC.Reaction g() {
        if (this.f5503a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f5507f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f5507f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.f5508g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f5507f, Long.valueOf(this.f5508g));
    }

    public final String toString() {
        TLRPC.Document e10;
        if (!TextUtils.isEmpty(this.f5507f)) {
            return this.f5507f;
        }
        long j3 = this.f5508g;
        if (j3 != 0 && (e10 = p5.e(k10.f24968t0, j3)) != null) {
            return gj.V(e10, null, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.f5508g);
        sb2.append(", ");
        return a8.p0.s(sb2, this.f5507f, "}");
    }
}
