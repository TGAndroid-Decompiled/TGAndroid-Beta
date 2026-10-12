package di;

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
public final class o2 extends l2 {
    public ah.y0 f7500i;
    public ah.y0 f7501j;
    public int f7502k;
    public final org.telegram.ui.Components.g6 f7503l;
    public Timer f7504m;
    public final bi.ya f7505n;
    public final ArrayList f7506o;
    public final p2 f7507p;

    public o2(p2 p2Var) {
        super(p2Var);
        int i10;
        this.f7507p = p2Var;
        this.f7500i = new ah.y0(p2Var);
        this.f7501j = new ah.y0(p2Var);
        this.f7503l = new org.telegram.ui.Components.g6(p2Var);
        this.f7505n = new bi.ya(p2Var);
        this.f7506o = new ArrayList();
        this.f7343a = 3;
        this.f7344b = AndroidUtilities.dp(44.0f);
        this.f7345c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.e3) p2Var.f7580f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.f7506o.add(ah.i1.c(reactionsList.get(i11)));
        }
        Collections.sort(this.f7506o, new a4.d(13));
        if (!this.f7506o.isEmpty()) {
            this.f7500i.e((ah.i1) this.f7506o.get(this.f7502k));
        }
        this.f7503l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        float dp = f10 - AndroidUtilities.dp(4.0f);
        float f11 = this.f7344b;
        RectF rectF = this.f7346f;
        rectF.set((int) f7, (int) dp, (int) (f7 + f11), (int) (dp + f11));
        float a2 = this.f7347g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        bi.ya yaVar = this.f7505n;
        yaVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        yaVar.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f7503l.d(1.0f, false);
        this.f7501j.c(rect);
        this.f7500i.c(rect);
        if (d == 1.0f) {
            this.f7500i.a(canvas);
        } else {
            canvas.save();
            float f12 = 1.0f - d;
            canvas.scale(f12, f12, rectF.centerX(), rectF.top);
            ah.y0 y0Var = this.f7501j;
            y0Var.h = f12;
            y0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            ah.y0 y0Var2 = this.f7500i;
            y0Var2.h = d;
            y0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f7500i.b(z10);
        this.f7501j.b(z10);
        Timer timer = this.f7504m;
        if (timer != null) {
            timer.cancel();
            this.f7504m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f7504m = timer2;
            timer2.schedule(new n2(this, 0), 2000L, 2000L);
        }
    }
}
