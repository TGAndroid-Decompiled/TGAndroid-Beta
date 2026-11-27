package defpackage;

import android.view.View;
import android.webkit.WebView;
public final class yu0 implements View.OnLongClickListener {
    public final nv0 a;

    public yu0(nv0 nv0Var) {
        this.a = nv0Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        WebView.HitTestResult hitTestResult = this.a.getHitTestResult();
        if (hitTestResult.getType() == 7) {
            final String extra = hitTestResult.getExtra();
            hl.c3(new Runnable(this) {
                public final yu0 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.wu0.run():void");
                }
            });
            return true;
        } else if (hitTestResult.getType() != 5) {
            return false;
        } else {
            final String extra2 = hitTestResult.getExtra();
            hl.c3(new Runnable(this) {
                public final yu0 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.wu0.run():void");
                }
            });
            return true;
        }
    }
}
