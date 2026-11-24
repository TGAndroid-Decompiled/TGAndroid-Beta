package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.UndoView;
public final class x62 extends a22 {
    public static final HashMap V = new HashMap();
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public u62 K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public Drawable O;
    public ViewPropertyAnimator P;
    public ChatAttachAlertPhotoLayout Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public ylb n;
    public fv r;
    public u46 s;
    public w62 w;
    public UndoView x;
    public TextView y;

    @Override
    public final void B(int r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x62.B(int, int):void");
    }

    @Override
    public final void E(int i) {
        i22 i22Var = this.b;
        if (i > 1) {
            i22Var.X2.S(0);
        } else {
            i22Var.X2.u(0);
        }
    }

    @Override
    public final void H(a22 a22Var) {
        w62 w62Var = this.w;
        this.R = true;
        if (a22Var instanceof ChatAttachAlertPhotoLayout) {
            this.Q = (ChatAttachAlertPhotoLayout) a22Var;
            w62Var.c.clear();
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.Q;
            w62Var.h = chatAttachAlertPhotoLayout.getSelectedPhotosOrder();
            w62Var.d = chatAttachAlertPhotoLayout.getSelectedPhotos();
            w62Var.c();
            w62Var.requestLayout();
            this.s.g1(0, 0);
            this.r.post(new lx1(this, a22Var, (byte) 22));
            postDelayed(new fo1(this, (byte) 23), 250L);
            w62Var.i(this.Q, false);
        } else {
            J();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(1.0f).setDuration(150L).setInterpolator(d53.f);
        this.P = interpolator;
        interpolator.start();
    }

    @Override
    public final void J() {
        this.r.z0(0);
    }

    @Override
    public final boolean M() {
        return true;
    }

    public final void O() {
        ArrayList arrayList = this.w.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((v62) obj).h;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                u62 u62Var = (u62) obj2;
                RectF b = u62Var.b();
                Bitmap createBitmap = Bitmap.createBitmap(Math.max(1, Math.round(b.width())), Math.max(1, Math.round(b.height())), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.save();
                canvas.translate(-b.left, -b.top);
                u62Var.a(canvas, false);
                canvas.restore();
                Bitmap bitmap = u62Var.v;
                if (bitmap != null && !bitmap.isRecycled()) {
                    u62Var.v.recycle();
                }
                u62Var.v = createBitmap;
                u62Var.w = 0.0f;
                u62Var.O.z.invalidate();
            }
        }
    }

    @Override
    public final void a(Editable editable) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.Q;
        if (chatAttachAlertPhotoLayout != null) {
            chatAttachAlertPhotoLayout.a(editable);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Drawable l;
        int i;
        wv1 wv1Var = this.b.s1;
        boolean z = false;
        if (wv1Var != null && (l = wv1Var.l()) != null) {
            int currentItemTop = getCurrentItemTop();
            if (gm.O1()) {
                i = 16;
            } else {
                Point point = gm.q;
                if (point.x > point.y) {
                    i = 6;
                } else {
                    i = 12;
                }
            }
            if (currentItemTop < a.getCurrentActionBarHeight()) {
                currentItemTop -= gm.L((1.0f - (currentItemTop / a.getCurrentActionBarHeight())) * i);
            }
            int max = Math.max(0, currentItemTop);
            canvas.save();
            canvas.clipRect(0, max, getWidth(), getHeight());
            l.setBounds(0, max, getWidth(), gm.q.y + max);
            l.draw(canvas);
            z = true;
        }
        super.dispatchDraw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    @Override
    public int getCurrentItemTop() {
        fv fvVar = this.r;
        if (fvVar.getChildCount() <= 0) {
            fvVar.setTopGlowOffset(fvVar.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = fvVar.getChildAt(0);
        b59 b59Var = (b59) fvVar.G(childAt);
        int top = childAt.getTop();
        int L = gm.L(8.0f);
        if (top < gm.L(8.0f) || b59Var == null || b59Var.b() != 0) {
            top = L;
        }
        fvVar.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return gm.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    public float getPreviewScale() {
        Point point = gm.q;
        if (point.y > point.x) {
            return 0.8f;
        }
        return 0.45f;
    }

    @Override
    public int getSelectedItemsCount() {
        r62 r62Var;
        ArrayList arrayList;
        ArrayList arrayList2 = this.w.b;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            v62 v62Var = (v62) arrayList2.get(i2);
            if (v62Var != null && (r62Var = v62Var.k) != null && (arrayList = (ArrayList) r62Var.f) != null) {
                i = arrayList.size() + i;
            }
        }
        return i;
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final boolean k() {
        this.b.J1(false);
        return true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        w62 w62Var = this.w;
        super.onLayout(z, i, i2, i3, i4);
        Point point = gm.q;
        if (point.y > point.x) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.U != z2) {
            this.U = z2;
            int size = w62Var.b.size();
            for (int i5 = 0; i5 < size; i5++) {
                v62 v62Var = (v62) w62Var.b.get(i5);
                if (((ArrayList) v62Var.k.f).size() == 1) {
                    v62Var.b(v62Var.k, true);
                }
            }
        }
    }

    @Override
    public final void requestLayout() {
        if (this.T) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void t() {
        jo6 jo6Var;
        this.K = null;
        UndoView undoView = this.x;
        if (undoView != null) {
            undoView.d(0, false);
        }
        ArrayList arrayList = this.w.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((v62) obj).h;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                u62 u62Var = (u62) obj2;
                if (u62Var.e && (jo6Var = u62Var.b) != null) {
                    jo6Var.R = false;
                }
            }
        }
    }

    @Override
    public final void u() {
        i22 i22Var;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        this.R = false;
        ViewPropertyAnimator viewPropertyAnimator = this.P;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator interpolator = this.y.animate().alpha(0.0f).setDuration(150L).setInterpolator(d53.j);
        this.P = interpolator;
        interpolator.start();
        if (getSelectedItemsCount() > 1 && (chatAttachAlertPhotoLayout = (i22Var = this.b).d2) != null) {
            chatAttachAlertPhotoLayout.d1.setIcon(2131232426);
            i22Var.d2.d1.setText(jb6.M0(2131753922, null));
            i22Var.d2.d1.setRightIcon(2131232065);
        }
        this.w.i(this.Q, true);
    }

    @Override
    public final void w(int i) {
        try {
            this.b.d2.w(i);
        } catch (Exception unused) {
        }
    }
}
