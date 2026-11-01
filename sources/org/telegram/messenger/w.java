package org.telegram.messenger;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.Components.vz0;
import org.telegram.ui.l60;
public final class w extends ClickableSpan {
    public final int f18941a;
    public final Object f18942b;
    public final Object f18943c;
    public final Object d;

    public w(Object obj, Object obj2, Object obj3, int i10) {
        this.f18941a = i10;
        this.f18942b = obj;
        this.f18943c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f18941a) {
            case 0:
                Runnable runnable = (Runnable) this.f18942b;
                if (runnable != null) {
                    runnable.run();
                }
                gf.f.r(w0.f18945b, (String) this.f18943c);
                return;
            case 1:
                ((l60) this.f18942b).a((org.telegram.ui.f4) this.f18943c, (vz0) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.x1 x1Var = ((org.telegram.ui.ActionBar.x1[]) this.f18942b)[0];
                if (x1Var != null) {
                    x1Var.dismiss();
                }
                gf.f.r((Context) this.d, "https://t.me/" + ((String) this.f18943c));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f18941a) {
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
        this.f18941a = 2;
        this.f18942b = x1VarArr;
        this.d = context;
        this.f18943c = str;
    }
}
