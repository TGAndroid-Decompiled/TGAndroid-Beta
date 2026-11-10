package org.telegram.messenger;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.r50;
public final class v extends ClickableSpan {
    public final int f25928a;
    public final Object f25929b;
    public final Object f25930c;
    public final Object d;

    public v(Object obj, Object obj2, Object obj3, int i7) {
        this.f25928a = i7;
        this.f25929b = obj;
        this.f25930c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f25928a) {
            case 0:
                Runnable runnable = (Runnable) this.f25929b;
                if (runnable != null) {
                    runnable.run();
                }
                vf.c.t(t0.f25570b, (String) this.f25930c);
                return;
            case 1:
                ((r50) this.f25929b).a((org.telegram.ui.e4) this.f25930c, (qy0) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.u1 u1Var = ((org.telegram.ui.ActionBar.u1[]) this.f25929b)[0];
                if (u1Var != null) {
                    u1Var.dismiss();
                }
                vf.c.t((Context) this.d, "https://t.me/" + ((String) this.f25930c));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f25928a) {
            case 0:
                textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Uc, (org.telegram.ui.ActionBar.h6) this.d));
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
        this.f25928a = 2;
        this.f25929b = u1VarArr;
        this.d = context;
        this.f25930c = str;
    }
}
