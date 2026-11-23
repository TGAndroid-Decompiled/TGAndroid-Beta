package ah;

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
import c8.ma;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.a8;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p20;
public abstract class o extends ScrollView implements b6 {
    public final d6 E;
    public final LinearGradient F;
    public final Paint G;
    public final Matrix H;
    public boolean I;
    public int J;
    public float K;
    public final h6 f1093a;
    public final i f1094b;
    public final int f1095c;
    public final n d;
    public final ArrayList f1096e;
    public p20 f1097f;
    public boolean h;
    public y10 f1098n;
    public int f1099r;
    public final d6 f1100s;
    public final LinearGradient f1101w;
    public final Paint f1102x;
    public final Matrix f1103y;

    public o(Context context, h6 h6Var) {
        super(context);
        int i7;
        this.f1096e = new ArrayList();
        nr nrVar = nr.h;
        this.f1100s = new d6(this, 0L, 300L, nrVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, g0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f1101w = linearGradient;
        Paint paint = new Paint(1);
        this.f1102x = paint;
        this.f1103y = new Matrix();
        this.E = new d6(this, 0L, 300L, nrVar);
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
        this.f1093a = h6Var;
        setVerticalScrollBarEnabled(false);
        int x02 = m6.x0(null, m6.f29381d6, false);
        this.f1099r = x02;
        g0.x3(this, x02);
        n nVar = new n(this, context);
        this.d = nVar;
        addView(nVar, ma.c(-2.0f, -1));
        i iVar = new i(0, context, this);
        this.f1094b = iVar;
        if (Build.VERSION.SDK_INT >= 25) {
            iVar.setRevealOnFocusHint(false);
        }
        iVar.setTextSize(1, 16.0f);
        t6.l(iVar, 34, m6.Oi, h6Var);
        t6.U(iVar, m6.G6, h6Var);
        int i10 = m6.Pi;
        t6.l(iVar, 30, i10, h6Var);
        t6.l(iVar, 36, i10, h6Var);
        iVar.setCursorWidth(1.5f);
        iVar.setInputType(iVar.getInputType() | 176);
        iVar.setSingleLine(true);
        iVar.setBackgroundDrawable(null);
        iVar.setVerticalScrollBarEnabled(false);
        iVar.setHorizontalScrollBarEnabled(false);
        iVar.setTextIsSelectable(false);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setImeOptions(268435462);
        if (hd.f24444a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        iVar.setGravity(i7 | 16);
        nVar.addView(iVar);
        iVar.setHintText(hd.N0(2131745640, null));
        this.f1095c = (int) iVar.getPaint().measureText(hd.N0(2131745640, null));
        iVar.addTextChangedListener(new j(this, 0));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (!this.f1096e.contains(view)) {
            return;
        }
        p20 p20Var = (p20) view;
        if (p20Var.E) {
            this.f1097f = null;
            n nVar = this.d;
            o oVar = (o) nVar.f1092n;
            oVar.I = true;
            oVar.f1096e.remove(p20Var);
            p20Var.setOnClickListener(null);
            nVar.c();
            nVar.f1089c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            nVar.f1088b = animatorSet;
            animatorSet.addListener(new l(0, nVar, p20Var));
            ArrayList arrayList = nVar.h;
            arrayList.clear();
            arrayList.add(p20Var);
            ArrayList arrayList2 = nVar.d;
            arrayList2.clear();
            nVar.f1090e.clear();
            arrayList2.add(p20Var);
            ArrayList arrayList3 = nVar.f1091f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(p20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(p20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(p20Var, View.ALPHA, 1.0f, 0.0f));
            nVar.requestLayout();
            hashSet.remove(Long.valueOf(p20Var.getUid()));
            runnable.run();
            return;
        }
        p20 p20Var2 = this.f1097f;
        if (p20Var2 != null) {
            p20Var2.a();
            this.f1097f = null;
        }
        this.f1097f = p20Var;
        p20Var.b();
    }

    public final void b(boolean z10, HashSet hashSet, Runnable runnable, ArrayList arrayList) {
        ArrayList arrayList2;
        int i7;
        Property property;
        Property property2;
        Property property3;
        Object O0;
        np npVar;
        TLRPC.TL_help_country tL_help_country;
        ArrayList arrayList3 = arrayList;
        np u12 = np.u1(k10.f24968t0);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList2 = this.f1096e;
            if (i10 >= arrayList2.size()) {
                break;
            }
            p20 p20Var = (p20) arrayList2.get(i10);
            if (!hashSet.contains(Long.valueOf(p20Var.getUid()))) {
                arrayList4.add(p20Var);
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
                    if (((p20) arrayList2.get(i11)).getUid() == longValue) {
                        npVar = u12;
                        break;
                    }
                    i11++;
                } else {
                    if (longValue >= 0) {
                        O0 = u12.c2(l10);
                    } else {
                        O0 = u12.O0(Long.valueOf(-longValue));
                    }
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList3.get(i12);
                            i12++;
                            TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj;
                            npVar = u12;
                            if (tL_help_country2.default_name.hashCode() == longValue) {
                                tL_help_country = tL_help_country2;
                                break;
                            } else {
                                arrayList3 = arrayList;
                                u12 = npVar;
                            }
                        }
                    }
                    npVar = u12;
                    tL_help_country = O0;
                    if (tL_help_country != null) {
                        p20 p20Var2 = new p20(getContext(), tL_help_country, null, true, this.f1093a);
                        p20Var2.setOnClickListener(new h(this, hashSet, runnable, 0));
                        arrayList5.add(p20Var2);
                    }
                }
            }
            arrayList3 = arrayList;
            u12 = npVar;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            n nVar = this.d;
            ArrayList arrayList6 = nVar.f1090e;
            ArrayList arrayList7 = nVar.d;
            ArrayList arrayList8 = nVar.f1091f;
            o oVar = (o) nVar.f1092n;
            oVar.I = true;
            ArrayList arrayList9 = oVar.f1096e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = nVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                ((p20) arrayList4.get(i13)).setOnClickListener(null);
            }
            nVar.c();
            if (z10) {
                nVar.f1089c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                nVar.f1088b = animatorSet;
                animatorSet.addListener(new m(nVar, arrayList4, 0));
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
                    p20 p20Var3 = (p20) arrayList4.get(i14);
                    arrayList6.add(p20Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(p20Var3, property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(p20Var3, property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(p20Var3, property, 1.0f, 0.0f));
                    i14++;
                }
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    p20 p20Var4 = (p20) arrayList5.get(i15);
                    arrayList7.add(p20Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(p20Var4, property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(p20Var4, property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(p20Var4, property, 0.0f, 1.0f));
                }
                i7 = 0;
            } else {
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    nVar.removeView((View) arrayList4.get(i16));
                }
                arrayList10.clear();
                nVar.f1088b = null;
                i7 = 0;
                nVar.f1089c = false;
                oVar.f1094b.setAllowDrawCursor(true);
            }
            for (int i17 = i7; i17 < arrayList5.size(); i17++) {
                nVar.addView((View) arrayList5.get(i17));
            }
            nVar.requestLayout();
        }
        this.f1094b.setOnKeyListener(new k(this, hashSet, runnable));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float d = this.f1100s.d(canScrollVertically(-1));
        Matrix matrix = this.f1103y;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f1101w.setLocalMatrix(matrix);
        Paint paint = this.f1102x;
        paint.setAlpha((int) (d * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), g0.L(8.0f) + scrollY, paint);
        float d2 = this.E.d(canScrollVertically(1));
        Matrix matrix2 = this.H;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - g0.L(8.0f));
        this.F.setLocalMatrix(matrix2);
        Paint paint2 = this.G;
        paint2.setAlpha((int) (d2 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - g0.L(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.f1094b;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(150.0f), Integer.MIN_VALUE));
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.I) {
            this.I = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = f3.C(20.0f, this.J, rect.top);
        rect.bottom = f3.C(50.0f, this.J, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f10) {
        this.K = f10;
        n nVar = this.d;
        if (nVar != null) {
            nVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(y10 y10Var) {
        this.f1098n = y10Var;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f1094b.setText(charSequence);
        this.h = false;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = m6.x0(null, m6.f29381d6, false);
            int i7 = this.f1099r;
            if (i7 != 0 && x02 != i7) {
                this.f1099r = x02;
                g0.x3(this, x02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
