package org.telegram.messenger;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.Components.uz0;
import org.telegram.ui.m60;
public final class w extends ClickableSpan {
    public final int f19021a;
    public final Object f19022b;
    public final Object f19023c;
    public final Object d;

    public w(Object obj, Object obj2, Object obj3, int i10) {
        this.f19021a = i10;
        this.f19022b = obj;
        this.f19023c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19021a) {
            case 0:
                Runnable runnable = (Runnable) this.f19022b;
                if (runnable != null) {
                    runnable.run();
                }
                gf.f.r(w0.f19025b, (String) this.f19023c);
                return;
            case 1:
                ((m60) this.f19022b).a((org.telegram.ui.f4) this.f19023c, (uz0) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.x1 x1Var = ((org.telegram.ui.ActionBar.x1[]) this.f19022b)[0];
                if (x1Var != null) {
                    x1Var.dismiss();
                }
                gf.f.r((Context) this.d, "https://t.me/" + ((String) this.f19023c));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f19021a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Uc, (org.telegram.ui.ActionBar.p6) this.d));
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

    public w(org.telegram.ui.ActionBar.x1[] x1VarArr, Context context, String str) {
        this.f19021a = 2;
        this.f19022b = x1VarArr;
        this.d = context;
        this.f19023c = str;
    }
}
