package org.telegram.messenger;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.p50;
public final class v extends ClickableSpan {
    public final int f27302a;
    public final Object f27303b;
    public final Object f27304c;
    public final Object d;

    public v(Object obj, Object obj2, Object obj3, int i7) {
        this.f27302a = i7;
        this.f27303b = obj;
        this.f27304c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f27302a) {
            case 0:
                Runnable runnable = (Runnable) this.f27303b;
                if (runnable != null) {
                    runnable.run();
                }
                vf.c.t(t0.f26913b, (String) this.f27304c);
                return;
            case 1:
                ((p50) this.f27303b).a((org.telegram.ui.e4) this.f27304c, (zy0) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.u1 u1Var = ((org.telegram.ui.ActionBar.u1[]) this.f27303b)[0];
                if (u1Var != null) {
                    u1Var.dismiss();
                }
                vf.c.t((Context) this.d, "https://t.me/" + ((String) this.f27304c));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f27302a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Xc, (org.telegram.ui.ActionBar.i6) this.d));
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
        this.f27302a = 2;
        this.f27303b = u1VarArr;
        this.d = context;
        this.f27304c = str;
    }
}
