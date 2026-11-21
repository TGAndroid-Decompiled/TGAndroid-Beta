package org.telegram.messenger;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.Components.bz0;
import org.telegram.ui.p50;
public final class v extends ClickableSpan {
    public final int f27330a;
    public final Object f27331b;
    public final Object f27332c;
    public final Object d;

    public v(Object obj, Object obj2, Object obj3, int i7) {
        this.f27330a = i7;
        this.f27331b = obj;
        this.f27332c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27330a) {
            case 0:
                Runnable runnable = (Runnable) this.f27331b;
                if (runnable != null) {
                    runnable.run();
                }
                vf.c.t(t0.f26941b, (String) this.f27332c);
                return;
            case 1:
                ((p50) this.f27331b).a((org.telegram.ui.e4) this.f27332c, (bz0) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.t1 t1Var = ((org.telegram.ui.ActionBar.t1[]) this.f27331b)[0];
                if (t1Var != null) {
                    t1Var.dismiss();
                }
                vf.c.t((Context) this.d, "https://t.me/" + ((String) this.f27332c));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f27330a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Xc, (org.telegram.ui.ActionBar.h6) this.d));
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
        this.f27330a = 2;
        this.f27331b = t1VarArr;
        this.d = context;
        this.f27332c = str;
    }
}
