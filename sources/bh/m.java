package bh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.widget.ScrollView;
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.k5;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y10;
public abstract class m extends ScrollView implements z5 {
    public final u5 E;
    public final LinearGradient F;
    public final Paint G;
    public final Matrix H;
    public boolean I;
    public int J;
    public float K;
    public final e6 f3333a;
    public final g f3334b;
    public final int f3335c;
    public final l d;
    public final ArrayList f3336e;
    public y10 f3337f;
    public boolean h;
    public u10 f3338n;
    public int f3339r;
    public final u5 f3340s;
    public final LinearGradient f3341w;
    public final Paint f3342x;
    public final Matrix f3343y;

    public m(Context context, e6 e6Var) {
        super(context);
        int i3;
        this.f3336e = new ArrayList();
        xq xqVar = xq.h;
        this.f3340s = new u5(this, 0L, 300L, xqVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, g0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f3341w = linearGradient;
        Paint paint = new Paint(1);
        this.f3342x = paint;
        this.f3343y = new Matrix();
        this.E = new u5(this, 0L, 300L, xqVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, g0.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.F = linearGradient2;
        Paint paint2 = new Paint(1);
        this.G = paint2;
        this.H = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f3333a = e6Var;
        setVerticalScrollBarEnabled(false);
        int x02 = k6.x0(null, k6.f27878d6, false);
        this.f3339r = x02;
        g0.z3(this, x02);
        l lVar = new l(this, context);
        this.d = lVar;
        addView(lVar, mf.c(-2.0f, -1));
        g gVar = new g(0, context, this);
        this.f3334b = gVar;
        if (Build.VERSION.SDK_INT >= 25) {
            gVar.setRevealOnFocusHint(false);
        }
        gVar.setTextSize(1, 16.0f);
        r6.m(gVar, 34, k6.Li, e6Var);
        r6.V(gVar, k6.G6, e6Var);
        int i10 = k6.Mi;
        r6.m(gVar, 30, i10, e6Var);
        r6.m(gVar, 36, i10, e6Var);
        gVar.setCursorWidth(1.5f);
        gVar.setInputType(gVar.getInputType() | 176);
        gVar.setSingleLine(true);
        gVar.setBackgroundDrawable(null);
        gVar.setVerticalScrollBarEnabled(false);
        gVar.setHorizontalScrollBarEnabled(false);
        gVar.setTextIsSelectable(false);
        gVar.setPadding(0, 0, 0, 0);
        gVar.setImeOptions(268435462);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        gVar.setGravity(i3 | 16);
        lVar.addView(gVar);
        gVar.setHintText(bd.M0(2131745846, null));
        this.f3335c = (int) gVar.getPaint().measureText(bd.M0(2131745846, null));
        gVar.addTextChangedListener(new h(this, 0));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (!this.f3336e.contains(view)) {
            return;
        }
        y10 y10Var = (y10) view;
        if (y10Var.E) {
            this.f3337f = null;
            l lVar = this.d;
            m mVar = (m) lVar.f3332n;
            mVar.I = true;
            mVar.f3336e.remove(y10Var);
            y10Var.setOnClickListener(null);
            lVar.c();
            lVar.f3329c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            lVar.f3328b = animatorSet;
            animatorSet.addListener(new j(0, lVar, y10Var));
            ArrayList arrayList = lVar.h;
            arrayList.clear();
            arrayList.add(y10Var);
            ArrayList arrayList2 = lVar.d;
            arrayList2.clear();
            lVar.f3330e.clear();
            arrayList2.add(y10Var);
            ArrayList arrayList3 = lVar.f3331f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(y10Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(y10Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(y10Var, View.ALPHA, 1.0f, 0.0f));
            lVar.requestLayout();
            hashSet.remove(Long.valueOf(y10Var.getUid()));
            runnable.run();
            return;
        }
        y10 y10Var2 = this.f3337f;
        if (y10Var2 != null) {
            y10Var2.a();
            this.f3337f = null;
        }
        this.f3337f = y10Var;
        y10Var.b();
    }

    public final void b(boolean z10, HashSet hashSet, Runnable runnable, ArrayList arrayList) {
        ArrayList arrayList2;
        int i3;
        Property property;
        Property property2;
        Property property3;
        Object M0;
        hp hpVar;
        TLRPC.TL_help_country tL_help_country;
        ArrayList arrayList3 = arrayList;
        hp s12 = hp.s1(h10.f22829t0);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList2 = this.f3336e;
            if (i10 >= arrayList2.size()) {
                break;
            }
            y10 y10Var = (y10) arrayList2.get(i10);
            if (!hashSet.contains(Long.valueOf(y10Var.getUid()))) {
                arrayList4.add(y10Var);
            }
            i10++;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            int i11 = 0;
            while (true) {
                if (i11 < arrayList2.size()) {
                    if (((y10) arrayList2.get(i11)).getUid() == longValue) {
                        hpVar = s12;
                        break;
                    }
                    i11++;
                } else {
                    if (longValue >= 0) {
                        M0 = s12.a2(l10);
                    } else {
                        M0 = s12.M0(Long.valueOf(-longValue));
                    }
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList3.get(i12);
                            i12++;
                            TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj;
                            hpVar = s12;
                            if (tL_help_country2.default_name.hashCode() == longValue) {
                                tL_help_country = tL_help_country2;
                                break;
                            } else {
                                arrayList3 = arrayList;
                                s12 = hpVar;
                            }
                        }
                    }
                    hpVar = s12;
                    tL_help_country = M0;
                    if (tL_help_country != null) {
                        y10 y10Var2 = new y10(getContext(), tL_help_country, null, true, this.f3333a);
                        y10Var2.setOnClickListener(new ai.h(this, hashSet, runnable, 5));
                        arrayList5.add(y10Var2);
                    }
                }
            }
            arrayList3 = arrayList;
            s12 = hpVar;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            l lVar = this.d;
            ArrayList arrayList6 = lVar.f3330e;
            ArrayList arrayList7 = lVar.d;
            ArrayList arrayList8 = lVar.f3331f;
            m mVar = (m) lVar.f3332n;
            mVar.I = true;
            ArrayList arrayList9 = mVar.f3336e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = lVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                ((y10) arrayList4.get(i13)).setOnClickListener(null);
            }
            lVar.c();
            if (z10) {
                lVar.f3329c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                lVar.f3328b = animatorSet;
                animatorSet.addListener(new k(lVar, arrayList4, 0));
                arrayList8.clear();
                arrayList7.clear();
                arrayList6.clear();
                int i14 = 0;
                while (true) {
                    int size2 = arrayList4.size();
                    property = View.ALPHA;
                    property2 = View.SCALE_Y;
                    property3 = View.SCALE_X;
                    if (i14 >= size2) {
                        break;
                    }
                    y10 y10Var3 = (y10) arrayList4.get(i14);
                    arrayList6.add(y10Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(y10Var3, property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(y10Var3, property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(y10Var3, property, 1.0f, 0.0f));
                    i14++;
                }
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    y10 y10Var4 = (y10) arrayList5.get(i15);
                    arrayList7.add(y10Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(y10Var4, property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(y10Var4, property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(y10Var4, property, 0.0f, 1.0f));
                }
                i3 = 0;
            } else {
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    lVar.removeView((View) arrayList4.get(i16));
                }
                arrayList10.clear();
                lVar.f3328b = null;
                i3 = 0;
                lVar.f3329c = false;
                mVar.f3334b.setAllowDrawCursor(true);
            }
            for (int i17 = i3; i17 < arrayList5.size(); i17++) {
                lVar.addView((View) arrayList5.get(i17));
            }
            lVar.requestLayout();
        }
        this.f3334b.setOnKeyListener(new i(this, hashSet, runnable));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float d = this.f3340s.d(canScrollVertically(-1));
        Matrix matrix = this.f3343y;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f3341w.setLocalMatrix(matrix);
        Paint paint = this.f3342x;
        paint.setAlpha((int) (d * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), g0.L(8.0f) + scrollY, paint);
        float d10 = this.E.d(canScrollVertically(1));
        Matrix matrix2 = this.H;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - g0.L(8.0f));
        this.F.setLocalMatrix(matrix2);
        Paint paint2 = this.G;
        paint2.setAlpha((int) (d10 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - g0.L(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.f3334b;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(150.0f), Integer.MIN_VALUE));
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.I) {
            this.I = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = k5.C(20.0f, this.J, rect.top);
        rect.bottom = k5.C(50.0f, this.J, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f10) {
        this.K = f10;
        l lVar = this.d;
        if (lVar != null) {
            lVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(u10 u10Var) {
        this.f3338n = u10Var;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f3334b.setText(charSequence);
        this.h = false;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = k6.x0(null, k6.f27878d6, false);
            int i3 = this.f3339r;
            if (i3 != 0 && x02 != i3) {
                this.f3339r = x02;
                g0.z3(this, x02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
