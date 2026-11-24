package defpackage;

import android.view.View;
import android.webkit.WebView;
public final class yv0 implements View.OnLongClickListener {
    public final mw0 a;

    public yv0(mw0 mw0Var) {
        this.a = mw0Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            gm.c3(new Runnable(this) {
                public final yv0 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.wv0.run():void");
                }
            });
            return true;
        } else if (hitTestResult.getType() != 5) {
            return false;
        } else {
            final String extra2 = hitTestResult.getExtra();
            gm.c3(new Runnable(this) {
                public final yv0 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.wv0.run():void");
                }
            });
            return true;
        }
    }
}
