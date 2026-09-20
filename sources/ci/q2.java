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
    public zg.f0 f5335i;
    public zg.f0 f5336j;
    public int f5337k;
    public final org.telegram.ui.Components.d6 f5338l;
    public Timer f5339m;
    public final ai.ob f5340n;
    public final ArrayList f5341o;
    public final r2 f5342p;

    public q2(r2 r2Var) {
        super(r2Var);
        int i10;
        this.f5342p = r2Var;
        this.f5335i = new zg.f0(r2Var);
        this.f5336j = new zg.f0(r2Var);
        this.f5338l = new org.telegram.ui.Components.d6(r2Var);
        this.f5340n = new ai.ob(r2Var);
        this.f5341o = new ArrayList();
        this.f5064a = 3;
        this.f5065b = AndroidUtilities.dp(44.0f);
        this.f5066c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) r2Var.f5404f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.f5341o.add(zg.o0.c(reactionsList.get(i11)));
        }
        Collections.sort(this.f5341o, new a4.e(10));
        if (!this.f5341o.isEmpty()) {
            this.f5335i.e((zg.o0) this.f5341o.get(this.f5337k));
        }
        this.f5338l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        float dp = f10 - AndroidUtilities.dp(4.0f);
        float f11 = this.f5065b;
        RectF rectF = this.f5067f;
        rectF.set((int) f7, (int) dp, (int) (f7 + f11), (int) (dp + f11));
        float a2 = this.f5068g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        ai.ob obVar = this.f5340n;
        obVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        obVar.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f5338l.d(1.0f, false);
        this.f5336j.c(rect);
        this.f5335i.c(rect);
        if (d == 1.0f) {
            this.f5335i.a(canvas);
        } else {
            canvas.save();
            float f12 = 1.0f - d;
            canvas.scale(f12, f12, rectF.centerX(), rectF.top);
            zg.f0 f0Var = this.f5336j;
            f0Var.h = f12;
            f0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            zg.f0 f0Var2 = this.f5335i;
            f0Var2.h = d;
            f0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f5335i.b(z10);
        this.f5336j.b(z10);
        Timer timer = this.f5339m;
        if (timer != null) {
            timer.cancel();
            this.f5339m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f5339m = timer2;
            timer2.schedule(new p2(this, 0), 2000L, 2000L);
        }
    }
}
