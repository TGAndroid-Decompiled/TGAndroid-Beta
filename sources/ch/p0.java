package ch;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.o5;
public final class p0 {
    public boolean f5474a;
    public boolean f5475b;
    public long f5476c;
    public boolean d;
    public boolean f5477e;
    public String f5478f;
    public long f5479g;
    public long h;

    public static p0 b(String str) {
        if (str == null) {
            str = "";
        }
        ?? obj = new Object();
        if (str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                obj.f5479g = parseLong;
                obj.h = parseLong;
                return obj;
            } catch (Exception unused) {
                obj.f5478f = str;
                obj.h = str.hashCode();
                return obj;
            }
        }
        obj.f5478f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static p0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        ?? obj = new Object();
        String str = tL_availableReaction.reaction;
        obj.f5478f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static p0 d(TLRPC.Reaction reaction) {
        ?? obj = new Object();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            obj.f5474a = true;
            return obj;
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            obj.f5478f = str;
            obj.h = str.hashCode();
            return obj;
        } else {
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j3 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                obj.f5479g = j3;
                obj.h = j3;
            }
            return obj;
        }
    }

    public static p0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        ?? obj = new Object();
        boolean z10 = true;
        obj.f5475b = true;
        long j3 = tL_availableEffect.f28436id;
        obj.f5476c = j3;
        if (tL_availableEffect.effect_animation_id != 0) {
            z10 = false;
        }
        obj.f5477e = z10;
        obj.f5479g = tL_availableEffect.effect_sticker_id;
        obj.h = j3;
        obj.d = tL_availableEffect.premium_required;
        obj.f5478f = tL_availableEffect.emoticon;
        return obj;
    }

    public final p0 a() {
        String V;
        long j3 = this.f5479g;
        if (j3 != 0 && (V = fj.V(o5.e(j10.f24773t0, j3), null, null)) != null) {
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
            if (this.f5479g == p0Var.f5479g && Objects.equals(this.f5478f, p0Var.f5478f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f5478f);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != this.f5479g) {
            return false;
        }
        return true;
    }

    public final TLRPC.Reaction g() {
        if (this.f5474a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f5478f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f5478f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.f5479g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f5478f, Long.valueOf(this.f5479g));
    }

    public final String toString() {
        TLRPC.Document e10;
        if (!TextUtils.isEmpty(this.f5478f)) {
            return this.f5478f;
        }
        long j3 = this.f5479g;
        if (j3 != 0 && (e10 = o5.e(j10.f24773t0, j3)) != null) {
            return fj.V(e10, null, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.f5479g);
        sb2.append(", ");
        return a8.p0.s(sb2, this.f5478f, "}");
    }
}
