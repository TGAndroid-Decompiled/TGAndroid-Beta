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
public final class o2 extends l2 {
    public zg.e0 f5666i;
    public zg.e0 f5667j;
    public int f5668k;
    public final org.telegram.ui.Components.g6 f5669l;
    public Timer f5670m;
    public final ai.pb f5671n;
    public final ArrayList f5672o;
    public final p2 f5673p;

    public o2(p2 p2Var) {
        super(p2Var);
        int i10;
        this.f5673p = p2Var;
        this.f5666i = new zg.e0(p2Var);
        this.f5667j = new zg.e0(p2Var);
        this.f5669l = new org.telegram.ui.Components.g6(p2Var);
        this.f5671n = new ai.pb(p2Var);
        this.f5672o = new ArrayList();
        this.f5378a = 3;
        this.f5379b = AndroidUtilities.dp(44.0f);
        this.f5380c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.e3) p2Var.f5721f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.f5672o.add(zg.n0.c(reactionsList.get(i11)));
        }
        Collections.sort(this.f5672o, new a4.d(10));
        if (!this.f5672o.isEmpty()) {
            this.f5666i.e((zg.n0) this.f5672o.get(this.f5668k));
        }
        this.f5669l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        float dp = f10 - AndroidUtilities.dp(4.0f);
        float f11 = this.f5379b;
        RectF rectF = this.f5382f;
        rectF.set((int) f7, (int) dp, (int) (f7 + f11), (int) (dp + f11));
        float a2 = this.f5383g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        ai.pb pbVar = this.f5671n;
        pbVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        pbVar.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f5669l.d(1.0f, false);
        this.f5667j.c(rect);
        this.f5666i.c(rect);
        if (d == 1.0f) {
            this.f5666i.a(canvas);
        } else {
            canvas.save();
            float f12 = 1.0f - d;
            canvas.scale(f12, f12, rectF.centerX(), rectF.top);
            zg.e0 e0Var = this.f5667j;
            e0Var.h = f12;
            e0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            zg.e0 e0Var2 = this.f5666i;
            e0Var2.h = d;
            e0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f5666i.b(z10);
        this.f5667j.b(z10);
        Timer timer = this.f5670m;
        if (timer != null) {
            timer.cancel();
            this.f5670m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f5670m = timer2;
            timer2.schedule(new n2(this, 0), 2000L, 2000L);
        }
    }
}
