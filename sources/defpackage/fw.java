package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class fw extends View {
    public final ui5 a;
    public final ey b;
    public final gw c;

    public fw(gw gwVar, Activity activity, ui5 ui5Var, ey eyVar) {
        super(activity);
        this.c = gwVar;
        this.a = ui5Var;
        this.b = eyVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        gw gwVar = this.c;
        if (gwVar.c != null) {
            canvas.save();
            o.s(this.a, canvas, gwVar, 0);
            gwVar.c.d(canvas, this);
            canvas.restore();
            gwVar.c.s = (int) getX();
            gwVar.c.w = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        gw gwVar = this.c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = gwVar.f;
        int i4 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = gwVar.h;
            ey eyVar = this.b;
            ui5 ui5Var = this.a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int L = gm.L(5000.0f);
                HashSet hashSet = o.d1;
                CharSequence z = o.z(ui5Var, eyVar.F, this, richText, richText, pageblockpreformatted, L);
                gwVar.h = z;
                TL_iv.pageBlockPreformatted pageblockpreformatted2 = gwVar.f;
                boolean z2 = pageblockpreformatted2.diff;
                String str = pageblockpreformatted2.language;
                if (z2) {
                    gwVar.h = gwVar.a(z, str);
                } else if (!TextUtils.isEmpty(str)) {
                    gwVar.h = el2.b(gwVar.h, gwVar.f.language);
                }
            }
            bx m = o.m(ui5Var, this, gwVar.h, null, gm.L(5000.0f), 0, gwVar.f, eyVar);
            gwVar.c = m;
            if (m != null) {
                i3 = m.d.getHeight();
                int lineCount = gwVar.c.d.getLineCount();
                int i5 = 1;
                for (int i6 = 0; i6 < lineCount; i6++) {
                    i5 = Math.max((int) Math.ceil(gwVar.c.d.getLineWidth(i6)), i5);
                }
                if (gwVar.f.diff && (staticLayout2 = gwVar.c.d) != null) {
                    i5 = Math.max((int) Math.ceil(staticLayout2.getPaint().measureText("m") * gwVar.f.diffColumns), i5);
                }
                gwVar.r = 0;
                if (gwVar.f.continuesNext && (staticLayout = gwVar.c.d) != null && staticLayout.getLineCount() > 1) {
                    StaticLayout staticLayout3 = gwVar.c.d;
                    int lineCount2 = staticLayout3.getLineCount() - 1;
                    int max = Math.max(0, (staticLayout3.getLineBottom(0) - staticLayout3.getLineTop(0)) - (staticLayout3.getLineBottom(lineCount2) - staticLayout3.getLineTop(lineCount2)));
                    gwVar.r = max;
                    i3 += max;
                }
                i4 = i5;
            } else {
                i3 = 0;
            }
        } else {
            i3 = 1;
        }
        setMeasuredDimension(gm.L(32.0f) + i4, i3);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gw gwVar = this.c;
        if (!o.i(this.a, this.b, motionEvent, gwVar, gwVar.c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
