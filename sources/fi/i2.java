package fi;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class i2 extends g2 {
    public bh.n0 f10984i;
    public bh.n0 f10985j;
    public int f10986k;
    public final org.telegram.ui.Components.h6 f10987l;
    public Timer f10988m;
    public final di.e9 f10989n;
    public final ArrayList f10990o;
    public final j2 f10991p;

    public i2(j2 j2Var) {
        super(j2Var);
        int i10;
        this.f10991p = j2Var;
        this.f10984i = new bh.n0(j2Var);
        this.f10985j = new bh.n0(j2Var);
        this.f10987l = new org.telegram.ui.Components.h6(j2Var);
        this.f10989n = new di.e9(j2Var);
        this.f10990o = new ArrayList();
        this.f10891a = 3;
        this.f10892b = AndroidUtilities.dp(44.0f);
        this.f10893c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.k3) j2Var.f11043f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.f10990o.add(bh.x0.c(reactionsList.get(i11)));
        }
        Collections.sort(this.f10990o, new a4.d(16));
        if (!this.f10990o.isEmpty()) {
            this.f10984i.e((bh.x0) this.f10990o.get(this.f10986k));
        }
        this.f10987l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        float dp = f10 - AndroidUtilities.dp(4.0f);
        float f11 = this.f10892b;
        RectF rectF = this.f10894f;
        rectF.set((int) f7, (int) dp, (int) (f7 + f11), (int) (dp + f11));
        float a2 = this.f10895g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        di.e9 e9Var = this.f10989n;
        e9Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        e9Var.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f10987l.d(1.0f, false);
        this.f10985j.c(rect);
        this.f10984i.c(rect);
        if (d == 1.0f) {
            this.f10984i.a(canvas);
        } else {
            canvas.save();
            float f12 = 1.0f - d;
            canvas.scale(f12, f12, rectF.centerX(), rectF.top);
            bh.n0 n0Var = this.f10985j;
            n0Var.h = f12;
            n0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            bh.n0 n0Var2 = this.f10984i;
            n0Var2.h = d;
            n0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f10984i.b(z10);
        this.f10985j.b(z10);
        Timer timer = this.f10988m;
        if (timer != null) {
            timer.cancel();
            this.f10988m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f10988m = timer2;
            timer2.schedule(new f6.r(this, 1), 2000L, 2000L);
        }
    }
}
