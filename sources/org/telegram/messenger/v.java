package org.telegram.messenger;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.Components.py0;
import org.telegram.ui.o50;
public final class v extends ClickableSpan {
    public final int f25915a;
    public final Object f25916b;
    public final Object f25917c;
    public final Object d;

    public v(Object obj, Object obj2, Object obj3, int i7) {
        this.f25915a = i7;
        this.f25916b = obj;
        this.f25917c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25915a) {
            case 0:
                Runnable runnable = (Runnable) this.f25916b;
                if (runnable != null) {
                    runnable.run();
                }
                vf.c.t(t0.f25555b, (String) this.f25917c);
                return;
            case 1:
                ((o50) this.f25916b).a((org.telegram.ui.e4) this.f25917c, (py0) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.u1 u1Var = ((org.telegram.ui.ActionBar.u1[]) this.f25916b)[0];
                if (u1Var != null) {
                    u1Var.dismiss();
                }
                vf.c.t((Context) this.d, "https://t.me/" + ((String) this.f25917c));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f25915a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, (org.telegram.ui.ActionBar.f6) this.d));
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

    public v(org.telegram.ui.ActionBar.u1[] u1VarArr, Context context, String str) {
        this.f25915a = 2;
        this.f25916b = u1VarArr;
        this.d = context;
        this.f25917c = str;
    }
}
