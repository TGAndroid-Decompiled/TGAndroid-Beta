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
public final class fv extends View {
    public final vg5 a;
    public final dx b;
    public final gv c;

    public fv(gv gvVar, Activity activity, vg5 vg5Var, dx dxVar) {
        super(activity);
        this.c = gvVar;
        this.a = vg5Var;
        this.b = dxVar;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        gv gvVar = this.c;
        if (gvVar.c != null) {
            canvas.save();
            o.s(this.a, canvas, gvVar, 0);
            gvVar.c.d(canvas, this);
            canvas.restore();
            gvVar.c.s = (int) getX();
            gvVar.c.w = (int) getY();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        gv gvVar = this.c;
        TL_iv.pageBlockPreformatted pageblockpreformatted = gvVar.f;
        int i4 = 1;
        if (pageblockpreformatted != null) {
            CharSequence charSequence = gvVar.h;
            dx dxVar = this.b;
            vg5 vg5Var = this.a;
            if (charSequence == null) {
                TL_iv.RichText richText = pageblockpreformatted.text;
                int L = gl.L(5000.0f);
                HashSet hashSet = o.d1;
                CharSequence z = o.z(vg5Var, dxVar.F, this, richText, richText, pageblockpreformatted, L);
                gvVar.h = z;
                TL_iv.pageBlockPreformatted pageblockpreformatted2 = gvVar.f;
                boolean z2 = pageblockpreformatted2.diff;
                String str = pageblockpreformatted2.language;
                if (z2) {
                    gvVar.h = gvVar.a(z, str);
                } else if (!TextUtils.isEmpty(str)) {
                    gvVar.h = qj2.b(gvVar.h, gvVar.f.language);
                }
            }
            bw m = o.m(vg5Var, this, gvVar.h, null, gl.L(5000.0f), 0, gvVar.f, dxVar);
            gvVar.c = m;
            if (m != null) {
                i3 = m.d.getHeight();
                int lineCount = gvVar.c.d.getLineCount();
                int i5 = 1;
                for (int i6 = 0; i6 < lineCount; i6++) {
                    i5 = Math.max((int) Math.ceil(gvVar.c.d.getLineWidth(i6)), i5);
                }
                if (gvVar.f.diff && (staticLayout2 = gvVar.c.d) != null) {
                    i5 = Math.max((int) Math.ceil(staticLayout2.getPaint().measureText("m") * gvVar.f.diffColumns), i5);
                }
                gvVar.r = 0;
                if (gvVar.f.continuesNext && (staticLayout = gvVar.c.d) != null && staticLayout.getLineCount() > 1) {
                    StaticLayout staticLayout3 = gvVar.c.d;
                    int lineCount2 = staticLayout3.getLineCount() - 1;
                    int max = Math.max(0, (staticLayout3.getLineBottom(0) - staticLayout3.getLineTop(0)) - (staticLayout3.getLineBottom(lineCount2) - staticLayout3.getLineTop(lineCount2)));
                    gvVar.r = max;
                    i3 += max;
                }
                i4 = i5;
            } else {
                i3 = 0;
            }
        } else {
            i3 = 1;
        }
        setMeasuredDimension(gl.L(32.0f) + i4, i3);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gv gvVar = this.c;
        if (!o.i(this.a, this.b, motionEvent, gvVar, gvVar.c, 0, 0) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
