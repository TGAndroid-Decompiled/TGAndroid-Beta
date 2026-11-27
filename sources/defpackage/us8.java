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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public abstract class us8 extends FrameLayout implements snb {
    public final vnb a;
    public final TextView b;
    public final ej2 c;
    public final of3 d;
    public boolean e;
    public final mm f;
    public final va6 h;
    public boolean n;

    public us8(e eVar) {
        super(eVar.getContext());
        k43 k43Var = k43.h;
        this.f = new mm(320L, k43Var);
        this.n = false;
        Context context = eVar.getContext();
        vnb resourceProvider = eVar.getResourceProvider();
        this.a = resourceProvider;
        LinearLayout j = uh9.j(context, 0);
        addView(j, tre.d(-1, -2.0f, 55, 16.66f, 11.6f, 16.66f, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTypeface(hl.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(ob6.M0(2131746412, null));
        j.addView(textView, tre.r(-2, -2, 51));
        ej2 ej2Var = new ej2(context);
        this.c = ej2Var;
        ej2Var.getDrawable().r(true, true);
        ej2Var.b(0.3f, 165L, k43Var);
        ej2Var.setTypeface(hl.o());
        ej2Var.setTextSize(hl.L(11.0f));
        ej2Var.setPadding(hl.L(4.33f), 0, hl.L(4.33f), 0);
        ej2Var.setGravity(3);
        j.addView(ej2Var, tre.t(-1, 17, 51, 4, 1, 4, 0));
        of3 of3Var = new of3(null, context, true, yac.t0, resourceProvider);
        this.d = of3Var;
        of3Var.setBackgroundColor(0);
        of3Var.setDialogCellDelegate(new rs8((mr8) this, eVar, context));
        of3Var.I = (byte) 15;
        of3Var.J = (byte) 83;
        addView(of3Var, tre.e(-1, -2, 87));
        updateColors();
        setWillNotDraw(false);
        va6 va6Var = new va6();
        this.h = va6Var;
        int i = aob.i6;
        va6Var.f(aob.p1(1.25f, aob.v0(i, resourceProvider)), aob.p1(0.8f, aob.v0(i, resourceProvider)));
        va6Var.j(8.0f);
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
        ej2 ej2Var = this.c;
        ej2Var.a();
        float f4 = 0.0f;
        ej2Var.setPivotX(0.0f);
        float f5 = 1.0f;
        if (z3) {
            ViewPropertyAnimator animate = ej2Var.animate();
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
            scaleX.scaleY(f5).setDuration(420L).setInterpolator(k43.h).start();
        } else {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ej2Var.setAlpha(f);
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            ej2Var.setScaleX(f2);
            if (z) {
                f4 = 1.0f;
            }
            ej2Var.setScaleY(f4);
        }
        if (chat != null) {
            int[] iArr = new int[1];
            boolean A1 = hl.A1();
            int i = chat.participants_count;
            if (A1) {
                iArr[0] = i;
                S = String.valueOf(i);
            } else {
                S = ob6.S(iArr, i);
            }
            ej2Var.c(ob6.G(iArr[0], "Subscribers", new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), S), true, true);
            if (arrayList != null && !arrayList.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.e = z2;
            of3 of3Var = this.d;
            if (z2) {
                of3Var.e0(-chat.id, null, 0, false, z3);
            } else {
                r47 r47Var = (r47) c00.g(1, arrayList);
                long j = -chat.id;
                int i2 = r47Var.k.date;
                if (of3Var.I0 != j) {
                    of3Var.y4 = -1;
                }
                of3Var.I0 = j;
                of3Var.C4 = System.currentTimeMillis();
                of3Var.g1 = r47Var;
                of3Var.v2 = false;
                of3Var.O0 = false;
                of3Var.S0 = i2;
                int i3 = r47Var.k.edit_date;
                of3Var.T0 = 0;
                of3Var.U0 = false;
                of3Var.m1 = r47Var.e1();
                of3Var.V0 = 0;
                of3Var.W0 = 0;
                of3Var.X0 = 0;
                of3Var.Y0 = r47Var.E4();
                of3Var.h1 = arrayList;
                r47 r47Var2 = of3Var.g1;
                if (r47Var2 != null) {
                    of3Var.Z0 = r47Var2.k.send_state;
                }
                of3Var.j0(0, z3);
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
        hashSet.add(Integer.valueOf(aob.L6));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float d = this.f.d(this.e);
        if (d > 0.0f) {
            va6 va6Var = this.h;
            va6Var.setAlpha((int) (d * 255.0f));
            RectF rectF = hl.P;
            of3 of3Var = this.d;
            rectF.set(of3Var.getX() + hl.L(of3Var.J + 6), of3Var.getY() + hl.L(38.0f), (getWidth() * 0.5f) + of3Var.getX() + hl.L(of3Var.J + 6), of3Var.getY() + hl.L(46.33f));
            va6Var.e(rectF);
            va6Var.draw(canvas);
            rectF.set(of3Var.getX() + hl.L(of3Var.J + 6), of3Var.getY() + hl.L(56.0f), (getWidth() * 0.36f) + of3Var.getX() + hl.L(of3Var.J + 6), of3Var.getY() + hl.L(64.33f));
            va6Var.e(rectF);
            va6Var.draw(canvas);
            rectF.set(((of3Var.getX() + of3Var.getWidth()) - hl.L(16.0f)) - hl.L(43.0f), of3Var.getY() + hl.L(12.0f), (of3Var.getX() + of3Var.getWidth()) - hl.L(16.0f), of3Var.getY() + hl.L(20.33f));
            va6Var.e(rectF);
            va6Var.draw(canvas);
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(102.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        int v0 = aob.v0(aob.L6, this.a);
        RectF rectF = ProfileActivity.Z6;
        ej2 ej2Var = this.c;
        ej2Var.setTextColor(v0);
        ej2Var.setBackground(aob.c0(hl.L(9.0f), hl.L(9.0f), aob.p1(0.1f, v0)));
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
