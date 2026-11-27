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
public final class gv extends View {
    public final xi5 a;
    public final ex b;
    public final hv c;

    public gv(hv hvVar, Activity activity, xi5 xi5Var, ex exVar) {
        super(activity);
        this.c = hvVar;
        this.a = xi5Var;
        this.b = exVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        hv hvVar = this.c;
        if (hvVar.c != null) {
            canvas.save();
            o.s(this.a, canvas, hvVar, 0);
            hvVar.c.d(canvas, this);
            canvas.restore();
            hvVar.c.s = (int) getX();
            hvVar.c.w = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        hv hvVar = this.c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = hvVar.f;
        int i4 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = hvVar.h;
            ex exVar = this.b;
            xi5 xi5Var = this.a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int L = hl.L(5000.0f);
                HashSet hashSet = o.d1;
                CharSequence z = o.z(xi5Var, exVar.F, this, richText, richText, pageblockpreformatted, L);
                hvVar.h = z;
                TL_iv.pageBlockPreformatted pageblockpreformatted2 = hvVar.f;
                boolean z2 = pageblockpreformatted2.diff;
                String str = pageblockpreformatted2.language;
                if (z2) {
                    hvVar.h = hvVar.a(z, str);
                } else if (!TextUtils.isEmpty(str)) {
                    hvVar.h = mk2.b(hvVar.h, hvVar.f.language);
                }
            }
            cw m = o.m(xi5Var, this, hvVar.h, null, hl.L(5000.0f), 0, hvVar.f, exVar);
            hvVar.c = m;
            if (m != null) {
                i3 = m.d.getHeight();
                int lineCount = hvVar.c.d.getLineCount();
                int i5 = 1;
                for (int i6 = 0; i6 < lineCount; i6++) {
                    i5 = Math.max((int) Math.ceil(hvVar.c.d.getLineWidth(i6)), i5);
                }
                if (hvVar.f.diff && (staticLayout2 = hvVar.c.d) != null) {
                    i5 = Math.max((int) Math.ceil(staticLayout2.getPaint().measureText("m") * hvVar.f.diffColumns), i5);
                }
                hvVar.r = 0;
                if (hvVar.f.continuesNext && (staticLayout = hvVar.c.d) != null && staticLayout.getLineCount() > 1) {
                    StaticLayout staticLayout3 = hvVar.c.d;
                    int lineCount2 = staticLayout3.getLineCount() - 1;
                    int max = Math.max(0, (staticLayout3.getLineBottom(0) - staticLayout3.getLineTop(0)) - (staticLayout3.getLineBottom(lineCount2) - staticLayout3.getLineTop(lineCount2)));
                    hvVar.r = max;
                    i3 += max;
                }
                i4 = i5;
            } else {
                i3 = 0;
            }
        } else {
            i3 = 1;
        }
        setMeasuredDimension(hl.L(32.0f) + i4, i3);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hv hvVar = this.c;
        if (!o.i(this.a, this.b, motionEvent, hvVar, hvVar.c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
