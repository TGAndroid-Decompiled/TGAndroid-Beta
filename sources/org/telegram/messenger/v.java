package org.telegram.messenger;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.Components.sy0;
import org.telegram.ui.n50;
public final class v extends ClickableSpan {
    public final int f26914a;
    public final Object f26915b;
    public final Object f26916c;
    public final Object d;

    public v(Object obj, Object obj2, Object obj3, int i7) {
        this.f26914a = i7;
        this.f26915b = obj;
        this.f26916c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f26914a) {
            case 0:
                Runnable runnable = (Runnable) this.f26915b;
                if (runnable != null) {
                    runnable.run();
                }
                vf.c.t(t0.f26609b, (String) this.f26916c);
                return;
            case 1:
                ((n50) this.f26915b).a((org.telegram.ui.e4) this.f26916c, (sy0) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.t1 t1Var = ((org.telegram.ui.ActionBar.t1[]) this.f26915b)[0];
                if (t1Var != null) {
                    t1Var.dismiss();
                }
                vf.c.t((Context) this.d, "https://t.me/" + ((String) this.f26916c));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f26914a) {
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
        this.f26914a = 2;
        this.f26915b = t1VarArr;
        this.d = context;
        this.f26916c = str;
    }
}
