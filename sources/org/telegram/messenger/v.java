package org.telegram.messenger;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.Components.py0;
import org.telegram.ui.i50;
public final class v extends ClickableSpan {
    public final int f25809a;
    public final Object f25810b;
    public final Object f25811c;
    public final Object d;

    public v(Object obj, Object obj2, Object obj3, int i3) {
        this.f25809a = i3;
        this.f25810b = obj;
        this.f25811c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25809a) {
            case 0:
                Runnable runnable = (Runnable) this.f25810b;
                if (runnable != null) {
                    runnable.run();
                }
                sf.c.t(t0.f25457b, (String) this.f25811c);
                return;
            case 1:
                ((i50) this.f25810b).a((org.telegram.ui.g4) this.f25811c, (py0) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.s1 s1Var = ((org.telegram.ui.ActionBar.s1[]) this.f25810b)[0];
                if (s1Var != null) {
                    s1Var.dismiss();
                }
                sf.c.t((Context) this.d, "https://t.me/" + ((String) this.f25811c));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f25809a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, (org.telegram.ui.ActionBar.e6) this.d));
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

    public v(org.telegram.ui.ActionBar.s1[] s1VarArr, Context context, String str) {
        this.f25809a = 2;
        this.f25810b = s1VarArr;
        this.d = context;
        this.f25811c = str;
    }
}
