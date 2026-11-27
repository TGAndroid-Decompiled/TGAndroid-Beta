package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.tgnet.TLRPC;
public final class rmb {
    public int a;
    public int b;
    public int c;
    public TLRPC.MessageEntity d;
    public boolean e;

    public rmb(rmb rmbVar) {
        this.a = rmbVar.a;
        this.b = rmbVar.b;
        this.c = rmbVar.c;
        this.d = rmbVar.d;
        this.e = rmbVar.e;
    }

    public final void a(TextPaint textPaint) {
        Typeface b = b();
        if (b != null) {
            textPaint.setTypeface(b);
        }
        if ((this.a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i = this.a;
        if ((i & 8) == 0 && (i & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.a & 512) != 0) {
            textPaint.bgColor = aob.w0(null, aob.R9, false);
        }
        int i2 = this.a;
        if ((i2 & 8192) != 0) {
            textPaint.setColor(aob.w0(null, aob.q7, false));
        } else if ((i2 & 4096) != 0) {
            textPaint.setColor(aob.w0(null, aob.Fi, false));
        }
    }

    public final Typeface b() {
        boolean z = this.e;
        int i = this.a;
        if (z) {
            if ((i & 2) != 0) {
                return hl.n1("fonts/mw_bolditalic.ttf");
            }
            return hl.n1("fonts/mw_bold.ttf");
        } else if ((i & 4) == 0 && (i & 2048) == 0) {
            int i2 = i & 1;
            int i3 = i & 2;
            if (i2 != 0) {
                if (i3 != 0) {
                    return hl.n1("fonts/rmediumitalic.ttf");
                }
                return hl.o();
            } else if (i3 != 0) {
                return hl.n1("fonts/ritalic.ttf");
            } else {
                return null;
            }
        } else {
            return Typeface.MONOSPACE;
        }
    }

    public final void c(rmb rmbVar) {
        TLRPC.MessageEntity messageEntity;
        this.a |= rmbVar.a;
        if (this.d == null && (messageEntity = rmbVar.d) != null) {
            this.d = messageEntity;
        }
    }
}
