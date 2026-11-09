package org.telegram.messenger;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.q50;
public final class v extends ClickableSpan {
    public final int f25924a;
    public final Object f25925b;
    public final Object f25926c;
    public final Object d;

    public v(Object obj, Object obj2, Object obj3, int i7) {
        this.f25924a = i7;
        this.f25925b = obj;
        this.f25926c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25924a) {
            case 0:
                Runnable runnable = (Runnable) this.f25925b;
                if (runnable != null) {
                    runnable.run();
                }
                vf.c.t(t0.f25566b, (String) this.f25926c);
                return;
            case 1:
                ((q50) this.f25925b).a((org.telegram.ui.e4) this.f25926c, (ry0) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.u1 u1Var = ((org.telegram.ui.ActionBar.u1[]) this.f25925b)[0];
                if (u1Var != null) {
                    u1Var.dismiss();
                }
                vf.c.t((Context) this.d, "https://t.me/" + ((String) this.f25926c));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f25924a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Uc, (org.telegram.ui.ActionBar.g6) this.d));
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
        this.f25924a = 2;
        this.f25925b = u1VarArr;
        this.d = context;
        this.f25926c = str;
    }
}
