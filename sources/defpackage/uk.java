package defpackage;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.a;
public final class uk extends ClickableSpan {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public uk(id[] idVarArr, Context context, String str) {
        this.a = (byte) 2;
        this.b = idVarArr;
        this.d = context;
        this.c = str;
    }

    @Override
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                xh0 xh0Var = (xh0) this.b;
                if (xh0Var != null) {
                    xh0Var.run();
                }
                m01.u(a.b, (String) this.c);
                return;
            case 1:
                ((xi5) this.b).a((ex) this.c, (plb) this.d);
                return;
            default:
                id idVar = ((id[]) this.b)[0];
                if (idVar != null) {
                    idVar.dismiss();
                }
                m01.u((Context) this.d, "https://t.me/" + ((String) this.c));
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setColor(aob.v0(aob.Xc, (vnb) this.d));
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

    public uk(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
