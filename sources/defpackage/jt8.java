package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class jt8 extends LinearLayout implements vlb {
    public final ylb a;
    public final qa6 b;
    public final ImageReceiver c;
    public final TextView d;
    public boolean e;

    public jt8(Context context, ylb ylbVar) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        this.a = ylbVar;
        setOrientation(1);
        qa6 qa6Var = new qa6();
        this.b = qa6Var;
        int i6 = cmb.F6;
        int v0 = cmb.v0(i6, ylbVar);
        qa6Var.g(cmb.p1(0.05f, v0), cmb.p1(0.15f, v0), cmb.p1(0.1f, v0), cmb.p1(0.3f, v0));
        qa6Var.j(4.0f);
        qa6Var.x.setStrokeWidth(gm.L(1.0f));
        imageReceiver.q0(gm.L(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i);
        anb.X(textView, i6, ylbVar);
        textView.setTextSize(1, 16.0f);
        boolean z = jb6.a0;
        if (z) {
            i2 = 70;
        } else {
            i2 = 18;
        }
        if (z) {
            i3 = 18;
        } else {
            i3 = 70;
        }
        addView(textView, qoe.t(-1, -2, 55, i2, 10, i3, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(jb6.a0 ? 5 : 3);
        wi8.x(textView2, cmb.y6, ylbVar, null, 2131752642);
        textView2.setTextSize(1, 13.0f);
        boolean z2 = jb6.a0;
        if (z2) {
            i4 = 70;
        } else {
            i4 = 18;
        }
        if (z2) {
            i5 = 18;
        } else {
            i5 = 70;
        }
        addView(textView2, qoe.t(-1, -2, 55, i4, 0, i5, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            TLRPC.GeoPoint geoPoint = tL_businessLocation.geo_point;
            ImageReceiver imageReceiver = this.c;
            if (geoPoint != null) {
                imageReceiver.c0(gn5.p(vuc.b(tL_businessLocation.geo_point, gm.L(44.0f), gm.L(44.0f), 15, Math.min(2, (int) Math.ceil(gm.p)))), "44_44", this.b, 0L, null, null, 0);
            } else {
                imageReceiver.g0(null);
            }
        }
        this.e = z;
        setPadding(0, 0, 0, z ? 1 : 0);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width;
        float f;
        if (jb6.a0) {
            width = gm.L(16.0f);
        } else {
            width = getWidth() - gm.L(60.0f);
        }
        float f2 = width;
        ImageReceiver imageReceiver = this.c;
        imageReceiver.i0(f2, gm.L(8.0f), gm.L(44.0f), gm.L(44.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.e) {
            Paint U0 = cmb.U0("paintDivider", this.a);
            if (U0 == null) {
                U0 = cmb.j0;
            }
            Paint paint = U0;
            float f3 = 21.33f;
            if (jb6.a0) {
                f = 0.0f;
            } else {
                f = 21.33f;
            }
            float L = gm.L(f);
            float measuredHeight = getMeasuredHeight() - 1;
            int width2 = getWidth();
            if (!jb6.a0) {
                f3 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width2 - gm.L(f3), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void updateColors() {
        qa6 qa6Var = this.b;
        if (qa6Var != null) {
            try {
                int v0 = cmb.v0(cmb.F6, this.a);
                qa6Var.g(cmb.p1(0.05f, v0), cmb.p1(0.15f, v0), cmb.p1(0.1f, v0), cmb.p1(0.3f, v0));
                invalidate();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
