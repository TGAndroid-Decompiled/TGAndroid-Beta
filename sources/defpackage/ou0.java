package defpackage;

import android.view.View;
import android.webkit.WebView;
public final class ou0 implements View.OnLongClickListener {
    public final cv0 a;

    public ou0(cv0 cv0Var) {
        this.a = cv0Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            gl.d3(new Runnable(this) {
                public final ou0 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mu0.run():void");
                }
            });
            return true;
        } else if (hitTestResult.getType() != 5) {
            return false;
        } else {
            final String extra2 = hitTestResult.getExtra();
            gl.d3(new Runnable(this) {
                public final ou0 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mu0.run():void");
                }
            });
            return true;
        }
    }
}
