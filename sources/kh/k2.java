package kh;

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
public final class k2 extends h2 {
    public hg.i0 f15507i;
    public hg.i0 f15508j;
    public int f15509k;
    public final org.telegram.ui.Components.y5 f15510l;
    public Timer f15511m;
    public final ih.s8 f15512n;
    public final ArrayList f15513o;
    public final l2 f15514p;

    public k2(l2 l2Var) {
        super(l2Var);
        int i9;
        this.f15514p = l2Var;
        this.f15507i = new hg.i0(l2Var);
        this.f15508j = new hg.i0(l2Var);
        this.f15510l = new org.telegram.ui.Components.y5(l2Var);
        this.f15512n = new ih.s8(l2Var);
        this.f15513o = new ArrayList();
        this.f15386a = 3;
        this.f15387b = AndroidUtilities.dp(44.0f);
        this.f15388c = AndroidUtilities.dp(36.0f);
        i9 = ((org.telegram.ui.ActionBar.f3) l2Var.f15586f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i9).getReactionsList();
        for (int i10 = 0; i10 < Math.min(reactionsList.size(), 8); i10++) {
            this.f15513o.add(hg.r0.c(reactionsList.get(i10)));
        }
        Collections.sort(this.f15513o, new j9.a(1));
        if (!this.f15513o.isEmpty()) {
            this.f15507i.e((hg.r0) this.f15513o.get(this.f15509k));
        }
        this.f15510l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        float dp = f11 - AndroidUtilities.dp(4.0f);
        float f12 = this.f15387b;
        RectF rectF = this.f15390f;
        rectF.set((int) f10, (int) dp, (int) (f10 + f12), (int) (dp + f12));
        float a2 = this.f15391g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        ih.s8 s8Var = this.f15512n;
        s8Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        s8Var.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f15510l.d(1.0f, false);
        this.f15508j.c(rect);
        this.f15507i.c(rect);
        if (d == 1.0f) {
            this.f15507i.a(canvas);
        } else {
            canvas.save();
            float f13 = 1.0f - d;
            canvas.scale(f13, f13, rectF.centerX(), rectF.top);
            hg.i0 i0Var = this.f15508j;
            i0Var.h = f13;
            i0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            hg.i0 i0Var2 = this.f15507i;
            i0Var2.h = d;
            i0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f15507i.b(z10);
        this.f15508j.b(z10);
        Timer timer = this.f15511m;
        if (timer != null) {
            timer.cancel();
            this.f15511m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f15511m = timer2;
            timer2.schedule(new j2(this, 0), 2000L, 2000L);
        }
    }
}
