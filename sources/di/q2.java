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
public final class q2 extends n2 {
    public ah.z0 f7940i;
    public ah.z0 f7941j;
    public int f7942k;
    public final org.telegram.ui.Components.e6 f7943l;
    public Timer f7944m;
    public final bi.va f7945n;
    public final ArrayList f7946o;
    public final r2 f7947p;

    public q2(r2 r2Var) {
        super(r2Var);
        int i10;
        this.f7947p = r2Var;
        this.f7940i = new ah.z0(r2Var);
        this.f7941j = new ah.z0(r2Var);
        this.f7943l = new org.telegram.ui.Components.e6(r2Var);
        this.f7945n = new bi.va(r2Var);
        this.f7946o = new ArrayList();
        this.f7671a = 3;
        this.f7672b = AndroidUtilities.dp(44.0f);
        this.f7673c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) r2Var.f8061f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.f7946o.add(ah.j1.c(reactionsList.get(i11)));
        }
        Collections.sort(this.f7946o, new a4.e(12));
        if (!this.f7946o.isEmpty()) {
            this.f7940i.e((ah.j1) this.f7946o.get(this.f7942k));
        }
        this.f7943l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        float dp = f10 - AndroidUtilities.dp(4.0f);
        float f11 = this.f7672b;
        RectF rectF = this.f7675f;
        rectF.set((int) f7, (int) dp, (int) (f7 + f11), (int) (dp + f11));
        float a2 = this.f7676g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        bi.va vaVar = this.f7945n;
        vaVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        vaVar.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f7943l.d(1.0f, false);
        this.f7941j.c(rect);
        this.f7940i.c(rect);
        if (d == 1.0f) {
            this.f7940i.a(canvas);
        } else {
            canvas.save();
            float f12 = 1.0f - d;
            canvas.scale(f12, f12, rectF.centerX(), rectF.top);
            ah.z0 z0Var = this.f7941j;
            z0Var.h = f12;
            z0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            ah.z0 z0Var2 = this.f7940i;
            z0Var2.h = d;
            z0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f7940i.b(z10);
        this.f7941j.b(z10);
        Timer timer = this.f7944m;
        if (timer != null) {
            timer.cancel();
            this.f7944m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f7944m = timer2;
            timer2.schedule(new p2(this, 0), 2000L, 2000L);
        }
    }
}
