package defpackage;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.a;
public final class tl extends ClickableSpan {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public tl(he[] heVarArr, Context context, String str) {
        this.a = (byte) 2;
        this.b = heVarArr;
        this.d = context;
        this.c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wi0 wi0Var = (wi0) this.b;
                if (wi0Var != null) {
                    wi0Var.run();
                }
                l11.u(a.b, (String) this.c);
                return;
            case 1:
                ((ui5) this.b).a((ey) this.c, (vjb) this.d);
                return;
            default:
                he heVar = ((he[]) this.b)[0];
                if (heVar != null) {
                    heVar.dismiss();
                }
                l11.u((Context) this.d, "https://t.me/" + ((String) this.c));
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(cmb.v0(cmb.Wc, (ylb) this.d));
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

    public tl(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
