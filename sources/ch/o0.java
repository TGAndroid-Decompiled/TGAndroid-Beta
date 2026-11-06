package ch;

import android.text.TextUtils;
import j$.util.Objects;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i5;
public final class o0 {
    public boolean f6352a;
    public boolean f6353b;
    public long f6354c;
    public boolean d;
    public boolean f6355e;
    public String f6356f;
    public long f6357g;
    public long h;

    public static o0 b(String str) {
        if (str == null) {
            str = "";
        }
        ?? obj = new Object();
        if (str.startsWith("animated_")) {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                obj.f6357g = parseLong;
                obj.h = parseLong;
                return obj;
            } catch (Exception unused) {
                obj.f6356f = str;
                obj.h = str.hashCode();
                return obj;
            }
        }
        obj.f6356f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static o0 c(TLRPC.TL_availableReaction tL_availableReaction) {
        ?? obj = new Object();
        String str = tL_availableReaction.reaction;
        obj.f6356f = str;
        obj.h = str.hashCode();
        return obj;
    }

    public static o0 d(TLRPC.Reaction reaction) {
        ?? obj = new Object();
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            obj.f6352a = true;
            return obj;
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            String str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            obj.f6356f = str;
            obj.h = str.hashCode();
            return obj;
        } else {
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j3 = ((TLRPC.TL_reactionCustomEmoji) reaction).document_id;
                obj.f6357g = j3;
                obj.h = j3;
            }
            return obj;
        }
    }

    public static o0 e(TLRPC.TL_availableEffect tL_availableEffect) {
        ?? obj = new Object();
        boolean z9 = true;
        obj.f6353b = true;
        long j3 = tL_availableEffect.f26984id;
        obj.f6354c = j3;
        if (tL_availableEffect.effect_animation_id != 0) {
            z9 = false;
        }
        obj.f6355e = z9;
        obj.f6357g = tL_availableEffect.effect_sticker_id;
        obj.h = j3;
        obj.d = tL_availableEffect.premium_required;
        obj.f6356f = tL_availableEffect.emoticon;
        return obj;
    }

    public final o0 a() {
        String V;
        long j3 = this.f6357g;
        if (j3 != 0 && (V = ij.V(i5.e(p10.f24467s0, j3), null, null)) != null) {
            return b(V);
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o0.class == obj.getClass()) {
            o0 o0Var = (o0) obj;
            if (this.f6357g == o0Var.f6357g && Objects.equals(this.f6356f, o0Var.f6356f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(TLRPC.Reaction reaction) {
        if (reaction instanceof TLRPC.TL_reactionEmoji) {
            return TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, this.f6356f);
        }
        if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji) || ((TLRPC.TL_reactionCustomEmoji) reaction).document_id != this.f6357g) {
            return false;
        }
        return true;
    }

    public final TLRPC.Reaction g() {
        if (this.f6352a) {
            return new TLRPC.TL_reactionPaid();
        }
        if (this.f6356f != null) {
            TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
            tL_reactionEmoji.emoticon = this.f6356f;
            return tL_reactionEmoji;
        }
        TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
        tL_reactionCustomEmoji.document_id = this.f6357g;
        return tL_reactionCustomEmoji;
    }

    public final int hashCode() {
        return Objects.hash(this.f6356f, Long.valueOf(this.f6357g));
    }

    public final String toString() {
        TLRPC.Document e10;
        if (!TextUtils.isEmpty(this.f6356f)) {
            return this.f6356f;
        }
        long j3 = this.f6357g;
        if (j3 != 0 && (e10 = i5.e(p10.f24467s0, j3)) != null) {
            return ij.V(e10, null, null);
        }
        StringBuilder sb2 = new StringBuilder("VisibleReaction{");
        sb2.append(this.f6357g);
        sb2.append(", ");
        return a8.p0.s(sb2, this.f6356f, "}");
    }
}
