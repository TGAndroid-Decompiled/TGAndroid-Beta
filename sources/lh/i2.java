package lh;

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

public final class i2 extends f2 {

    public ig.h0 f16098i;

    public ig.h0 f16099j;

    public int f16100k;

    public final org.telegram.ui.Components.y5 f16101l;

    public Timer f16102m;

    public final jh.o8 f16103n;

    public final ArrayList f16104o;

    public final j2 f16105p;

    public i2(j2 j2Var) {
        super(j2Var);
        this.f16105p = j2Var;
        this.f16098i = new ig.h0(j2Var);
        this.f16099j = new ig.h0(j2Var);
        this.f16101l = new org.telegram.ui.Components.y5(j2Var);
        this.f16103n = new jh.o8(j2Var);
        this.f16104o = new ArrayList();
        this.f15949a = 3;
        this.f15950b = AndroidUtilities.dp(44.0f);
        this.f15951c = AndroidUtilities.dp(36.0f);
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(((org.telegram.ui.ActionBar.e3) j2Var.f16172f).currentAccount).getReactionsList();
        for (int i10 = 0; i10 < Math.min(reactionsList.size(), 8); i10++) {
            this.f16104o.add(ig.q0.c(reactionsList.get(i10)));
        }
        Collections.sort(this.f16104o, new k9.a(2));
        if (!this.f16104o.isEmpty()) {
            this.f16098i.e((ig.q0) this.f16104o.get(this.f16100k));
        }
        this.f16101l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        float fDp = f11 - AndroidUtilities.dp(4.0f);
        float f12 = (int) f10;
        float f13 = (int) fDp;
        float f14 = this.f15950b;
        float f15 = (int) (f10 + f14);
        float f16 = (int) (fDp + f14);
        RectF rectF = this.f15953f;
        rectF.set(f12, f13, f15, f16);
        float fA = this.f15954g.a(0.05f);
        canvas.save();
        canvas.scale(fA, fA, rectF.centerX(), rectF.centerY());
        int i10 = (int) rectF.left;
        int i11 = (int) rectF.top;
        int i12 = (int) rectF.right;
        int i13 = (int) rectF.bottom;
        jh.o8 o8Var = this.f16103n;
        o8Var.setBounds(i10, i11, i12, i13);
        o8Var.draw(canvas);
        float fDp2 = AndroidUtilities.dp(30.0f);
        Rect rect = AndroidUtilities.rectTmp2;
        float f17 = fDp2 / 2.0f;
        rect.set((int) (rectF.centerX() - f17), (int) (rectF.centerY() - f17), (int) (rectF.centerX() + f17), (int) (rectF.centerY() + f17));
        float fD = this.f16101l.d(1.0f, false);
        this.f16099j.c(rect);
        this.f16098i.c(rect);
        if (fD == 1.0f) {
            this.f16098i.a(canvas);
        } else {
            canvas.save();
            float f18 = 1.0f - fD;
            canvas.scale(f18, f18, rectF.centerX(), rectF.top);
            ig.h0 h0Var = this.f16099j;
            h0Var.h = f18;
            h0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(fD, fD, rectF.centerX(), rectF.bottom);
            ig.h0 h0Var2 = this.f16098i;
            h0Var2.h = fD;
            h0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f16098i.b(z10);
        this.f16099j.b(z10);
        Timer timer = this.f16102m;
        if (timer != null) {
            timer.cancel();
            this.f16102m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f16102m = timer2;
            timer2.schedule(new h2(this, 0), 2000L, 2000L);
        }
    }
}
