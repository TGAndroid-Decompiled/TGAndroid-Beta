package defpackage;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.a;
public final class tk extends ClickableSpan {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public tk(hd[] hdVarArr, Context context, String str) {
        this.a = (byte) 2;
        this.b = hdVarArr;
        this.d = context;
        this.c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wh0 wh0Var = (wh0) this.b;
                if (wh0Var != null) {
                    wh0Var.run();
                }
                d01.t(a.b, (String) this.c);
                return;
            case 1:
                ((vg5) this.b).a((dx) this.c, (thb) this.d);
                return;
            default:
                hd hdVar = ((hd[]) this.b)[0];
                if (hdVar != null) {
                    hdVar.dismiss();
                }
                d01.t((Context) this.d, "https://t.me/" + ((String) this.c));
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(bkb.v0(bkb.Wc, (wjb) this.d));
                textPaint.setUnderlineText(false);
                return;
            case 1:
            default:
                super.updateDrawState(textPaint);
                return;
            case 2:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
        }
    }

    public tk(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
