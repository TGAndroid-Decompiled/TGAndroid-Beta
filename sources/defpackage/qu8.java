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
public final class qu8 extends LinearLayout implements snb {
    public final vnb a;
    public final va6 b;
    public final ImageReceiver c;
    public final TextView d;
    public boolean e;

    public qu8(Context context, vnb vnbVar) {
        super(context);
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.c = imageReceiver;
        this.a = vnbVar;
        setOrientation(1);
        va6 va6Var = new va6();
        this.b = va6Var;
        int i6 = aob.G6;
        int v0 = aob.v0(i6, vnbVar);
        va6Var.g(aob.p1(0.05f, v0), aob.p1(0.15f, v0), aob.p1(0.1f, v0), aob.p1(0.3f, v0));
        va6Var.j(4.0f);
        va6Var.x.setStrokeWidth(hl.L(1.0f));
        imageReceiver.q0(hl.L(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i);
        yob.X(textView, i6, vnbVar);
        textView.setTextSize(1, 16.0f);
        boolean z = ob6.a0;
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
        addView(textView, tre.t(-1, -2, 55, i2, 10, i3, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(ob6.a0 ? 5 : 3);
        ik8.x(textView2, aob.z6, vnbVar, null, 2131752670);
        textView2.setTextSize(1, 13.0f);
        boolean z2 = ob6.a0;
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
        addView(textView2, tre.t(-1, -2, 55, i4, 0, i5, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            TLRPC.GeoPoint geoPoint = tL_businessLocation.geo_point;
            ImageReceiver imageReceiver = this.c;
            if (geoPoint != null) {
                imageReceiver.c0(jn5.p(jxc.b(tL_businessLocation.geo_point, hl.L(44.0f), hl.L(44.0f), 15, Math.min(2, (int) Math.ceil(hl.p)))), "44_44", this.b, 0L, null, null, 0);
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
        if (ob6.a0) {
            width = hl.L(16.0f);
        } else {
            width = getWidth() - hl.L(60.0f);
        }
        float f2 = width;
        ImageReceiver imageReceiver = this.c;
        imageReceiver.i0(f2, hl.L(8.0f), hl.L(44.0f), hl.L(44.0f));
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.e) {
            Paint U0 = aob.U0("paintDivider", this.a);
            if (U0 == null) {
                U0 = aob.j0;
            }
            Paint paint = U0;
            float f3 = 21.33f;
            if (ob6.a0) {
                f = 0.0f;
            } else {
                f = 21.33f;
            }
            float L = hl.L(f);
            float measuredHeight = getMeasuredHeight() - 1;
            int width2 = getWidth();
            if (!ob6.a0) {
                f3 = 0.0f;
            }
            canvas.drawRect(L, measuredHeight, width2 - hl.L(f3), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    @Override
    public final void updateColors() {
        va6 va6Var = this.b;
        if (va6Var != null) {
            try {
                int v0 = aob.v0(aob.G6, this.a);
                va6Var.g(aob.p1(0.05f, v0), aob.p1(0.15f, v0), aob.p1(0.1f, v0), aob.p1(0.3f, v0));
                invalidate();
            } catch (Exception e) {
                cc4.g(e, true);
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
