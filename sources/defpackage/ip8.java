package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public abstract class ip8 extends FrameLayout implements tjb {
    public final wjb a;
    public final TextView b;
    public final ii2 c;
    public final ue3 d;
    public boolean e;
    public final lm f;
    public final r86 h;
    public boolean n;

    public ip8(d dVar) {
        super(dVar.getContext());
        s33 s33Var = s33.h;
        this.f = new lm(320L, s33Var);
        this.n = false;
        Context context = dVar.getContext();
        wjb resourceProvider = dVar.getResourceProvider();
        this.a = resourceProvider;
        LinearLayout j = de9.j(context, 0);
        addView(j, nme.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(k96.M0(2131746492, null));
        j.addView(textView, nme.r(-2, -2, 51));
        ii2 ii2Var = new ii2(context);
        this.c = ii2Var;
        ii2Var.getDrawable().r(true, true);
        ii2Var.b(0.3f, 165L, s33Var);
        ii2Var.setTypeface(gl.o());
        ii2Var.setTextSize(gl.L(11.0f));
        ii2Var.setPadding(gl.L(4.33f), 0, gl.L(4.33f), 0);
        ii2Var.setGravity(3);
        j.addView(ii2Var, nme.t(-1, 17, 51, 4, 1, 4, 0));
        ue3 ue3Var = new ue3(null, context, true, y6c.t0, resourceProvider);
        this.d = ue3Var;
        ue3Var.setBackgroundColor(0);
        ue3Var.setDialogCellDelegate(new fp8((ao8) this, dVar, context));
        ue3Var.I = (byte) 15;
        ue3Var.J = (byte) 83;
        addView(ue3Var, nme.e(-1, -2, 87));
        updateColors();
        setWillNotDraw(false);
        r86 r86Var = new r86();
        this.h = r86Var;
        int i = bkb.h6;
        r86Var.f(bkb.p1(1.25f, bkb.v0(i, resourceProvider)), bkb.p1(0.8f, bkb.v0(i, resourceProvider)));
        r86Var.j(8.0f);
    }

    public final void a(ArrayList arrayList, TLRPC.Chat chat) {
        boolean z;
        float f;
        float f2;
        String S;
        boolean z2;
        float f3;
        boolean z3 = this.n;
        if (chat != null && chat.participants_count <= 0) {
            z = false;
        } else {
            z = true;
        }
        ii2 ii2Var = this.c;
        ii2Var.a();
        float f4 = 0.0f;
        ii2Var.setPivotX(0.0f);
        float f5 = 1.0f;
        if (z3) {
            ViewPropertyAnimator animate = ii2Var.animate();
            if (z) {
                f4 = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f4);
            if (z) {
                f3 = 1.0f;
            } else {
                f3 = 0.8f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f3);
            if (!z) {
                f5 = 0.8f;
            }
            scaleX.scaleY(f5).setDuration(420L).setInterpolator(s33.h).start();
        } else {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ii2Var.setAlpha(f);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            ii2Var.setScaleX(f2);
            if (z) {
                f4 = 1.0f;
            }
            ii2Var.setScaleY(f4);
        }
        if (chat != null) {
            int[] iArr = new int[1];
            boolean A1 = gl.A1();
            int i = chat.participants_count;
            if (A1) {
                iArr[0] = i;
                S = String.valueOf(i);
            } else {
                S = k96.S(iArr, i);
            }
            ii2Var.c(k96.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S), true, true);
            if (arrayList != null && !arrayList.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.e = z2;
            ue3 ue3Var = this.d;
            if (z2) {
                ue3Var.f0(-chat.id, null, 0, false, z3);
            } else {
                k27 k27Var = (k27) b00.f(1, arrayList);
                long j = -chat.id;
                int i2 = k27Var.k.date;
                if (ue3Var.I0 != j) {
                    ue3Var.y4 = -1;
                }
                ue3Var.I0 = j;
                ue3Var.C4 = System.currentTimeMillis();
                ue3Var.g1 = k27Var;
                ue3Var.v2 = false;
                ue3Var.O0 = false;
                ue3Var.S0 = i2;
                int i3 = k27Var.k.edit_date;
                ue3Var.T0 = 0;
                ue3Var.U0 = false;
                ue3Var.m1 = k27Var.e1();
                ue3Var.V0 = 0;
                ue3Var.W0 = 0;
                ue3Var.X0 = 0;
                ue3Var.Y0 = k27Var.E4();
                ue3Var.h1 = arrayList;
                k27 k27Var2 = ue3Var.g1;
                if (k27Var2 != null) {
                    ue3Var.Z0 = k27Var2.k.send_state;
                }
                ue3Var.k0(0, z3);
            }
        }
        if (!z3) {
            this.f.f(this.e, true);
        }
        invalidate();
        this.n = true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.K6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float d = this.f.d(this.e);
        if (d > 0.0f) {
            r86 r86Var = this.h;
            r86Var.setAlpha((int) (d * 255.0f));
            RectF rectF = gl.P;
            ue3 ue3Var = this.d;
            rectF.set(ue3Var.getX() + gl.L(ue3Var.J + 6), ue3Var.getY() + gl.L(38.0f), (getWidth() * 0.5f) + ue3Var.getX() + gl.L(ue3Var.J + 6), ue3Var.getY() + gl.L(46.33f));
            r86Var.e(rectF);
            r86Var.draw(canvas);
            rectF.set(ue3Var.getX() + gl.L(ue3Var.J + 6), ue3Var.getY() + gl.L(56.0f), (getWidth() * 0.36f) + ue3Var.getX() + gl.L(ue3Var.J + 6), ue3Var.getY() + gl.L(64.33f));
            r86Var.e(rectF);
            r86Var.draw(canvas);
            rectF.set(((ue3Var.getX() + ue3Var.getWidth()) - gl.L(16.0f)) - gl.L(43.0f), ue3Var.getY() + gl.L(12.0f), (ue3Var.getX() + ue3Var.getWidth()) - gl.L(16.0f), ue3Var.getY() + gl.L(20.33f));
            r86Var.e(rectF);
            r86Var.draw(canvas);
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(102.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int v0 = bkb.v0(bkb.K6, this.a);
        RectF rectF = ProfileActivity.Z6;
        ii2 ii2Var = this.c;
        ii2Var.setTextColor(v0);
        ii2Var.setBackground(bkb.c0(gl.L(9.0f), gl.L(9.0f), bkb.p1(0.1f, v0)));
        this.b.setTextColor(v0);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
