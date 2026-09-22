package ci;

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
public final class q2 extends n2 {
    public zg.g0 f5331i;
    public zg.g0 f5332j;
    public int f5333k;
    public final org.telegram.ui.Components.c6 f5334l;
    public Timer f5335m;
    public final ai.ob f5336n;
    public final ArrayList f5337o;
    public final r2 f5338p;

    public q2(r2 r2Var) {
        super(r2Var);
        int i10;
        this.f5338p = r2Var;
        this.f5331i = new zg.g0(r2Var);
        this.f5332j = new zg.g0(r2Var);
        this.f5334l = new org.telegram.ui.Components.c6(r2Var);
        this.f5336n = new ai.ob(r2Var);
        this.f5337o = new ArrayList();
        this.f5060a = 3;
        this.f5061b = AndroidUtilities.dp(44.0f);
        this.f5062c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) r2Var.f5400f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.f5337o.add(zg.p0.c(reactionsList.get(i11)));
        }
        Collections.sort(this.f5337o, new a4.e(10));
        if (!this.f5337o.isEmpty()) {
            this.f5331i.e((zg.p0) this.f5337o.get(this.f5333k));
        }
        this.f5334l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        float dp = f10 - AndroidUtilities.dp(4.0f);
        float f11 = this.f5061b;
        RectF rectF = this.f5063f;
        rectF.set((int) f7, (int) dp, (int) (f7 + f11), (int) (dp + f11));
        float a2 = this.f5064g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        ai.ob obVar = this.f5336n;
        obVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        obVar.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f5334l.d(1.0f, false);
        this.f5332j.c(rect);
        this.f5331i.c(rect);
        if (d == 1.0f) {
            this.f5331i.a(canvas);
        } else {
            canvas.save();
            float f12 = 1.0f - d;
            canvas.scale(f12, f12, rectF.centerX(), rectF.top);
            zg.g0 g0Var = this.f5332j;
            g0Var.h = f12;
            g0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            zg.g0 g0Var2 = this.f5331i;
            g0Var2.h = d;
            g0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f5331i.b(z10);
        this.f5332j.b(z10);
        Timer timer = this.f5335m;
        if (timer != null) {
            timer.cancel();
            this.f5335m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f5335m = timer2;
            timer2.schedule(new p2(this, 0), 2000L, 2000L);
        }
    }
}
