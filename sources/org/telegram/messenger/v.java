package org.telegram.messenger;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.Components.sy0;
import org.telegram.ui.n50;
public final class v extends ClickableSpan {
    public final int f26913a;
    public final Object f26914b;
    public final Object f26915c;
    public final Object d;

    public v(Object obj, Object obj2, Object obj3, int i7) {
        this.f26913a = i7;
        this.f26914b = obj;
        this.f26915c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26913a) {
            case 0:
                Runnable runnable = (Runnable) this.f26914b;
                if (runnable != null) {
                    runnable.run();
                }
                vf.c.t(t0.f26600b, (String) this.f26915c);
                return;
            case 1:
                ((n50) this.f26914b).a((org.telegram.ui.e4) this.f26915c, (sy0) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.t1 t1Var = ((org.telegram.ui.ActionBar.t1[]) this.f26914b)[0];
                if (t1Var != null) {
                    t1Var.dismiss();
                }
                vf.c.t((Context) this.d, "https://t.me/" + ((String) this.f26915c));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f26913a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Xc, (org.telegram.ui.ActionBar.e6) this.d));
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

    public v(org.telegram.ui.ActionBar.t1[] t1VarArr, Context context, String str) {
        this.f26913a = 2;
        this.f26914b = t1VarArr;
        this.d = context;
        this.f26915c = str;
    }
}
