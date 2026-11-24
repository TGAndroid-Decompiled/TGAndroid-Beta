package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.tgnet.TLRPC;
public final class wkb {
    public int a;
    public int b;
    public int c;
    public TLRPC.MessageEntity d;
    public boolean e;

    public wkb(wkb wkbVar) {
        this.a = wkbVar.a;
        this.b = wkbVar.b;
        this.c = wkbVar.c;
        this.d = wkbVar.d;
        this.e = wkbVar.e;
    }

    public final void a(TextPaint textPaint) {
        Typeface typeface;
        boolean z = this.e;
        int i = this.a;
        if (z) {
            if ((i & 2) != 0) {
                typeface = gm.n1("fonts/mw_bolditalic.ttf");
            } else {
                typeface = gm.n1("fonts/mw_bold.ttf");
            }
        } else if ((i & 4) == 0 && (i & 2048) == 0) {
            int i2 = i & 1;
            int i3 = i & 2;
            if (i2 != 0) {
                if (i3 != 0) {
                    typeface = gm.n1("fonts/rmediumitalic.ttf");
                } else {
                    typeface = gm.o();
                }
            } else if (i3 != 0) {
                typeface = gm.n1("fonts/ritalic.ttf");
            } else {
                typeface = null;
            }
        } else {
            typeface = Typeface.MONOSPACE;
        }
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        if ((this.a & 16) != 0) {
            textPaint.setFlags(textPaint.getFlags() | 8);
        } else {
            textPaint.setFlags(textPaint.getFlags() & (-9));
        }
        int i4 = this.a;
        if ((i4 & 8) == 0 && (i4 & 8192) == 0) {
            textPaint.setFlags(textPaint.getFlags() & (-17));
        } else {
            textPaint.setFlags(textPaint.getFlags() | 16);
        }
        if ((this.a & 512) != 0) {
            textPaint.bgColor = cmb.w0(null, cmb.Q9, false);
        }
        int i5 = this.a;
        if ((i5 & 8192) != 0) {
            textPaint.setColor(cmb.w0(null, cmb.p7, false));
        } else if ((i5 & 4096) != 0) {
            textPaint.setColor(cmb.w0(null, cmb.Ei, false));
        }
    }

    public final void b(wkb wkbVar) {
        TLRPC.MessageEntity messageEntity;
        this.a |= wkbVar.a;
        if (this.d == null && (messageEntity = wkbVar.d) != null) {
            this.d = messageEntity;
        }
    }
}
