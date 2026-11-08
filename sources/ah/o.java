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
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
public abstract class o extends ScrollView implements a6 {
    public final w5 D;
    public final LinearGradient E;
    public final Paint F;
    public final Matrix G;
    public boolean H;
    public int I;
    public float J;
    public final f6 f1096a;
    public final i f1097b;
    public final int f1098c;
    public final n d;
    public final ArrayList f1099e;
    public c20 f1100f;
    public boolean h;
    public org.telegram.messenger.c20 f1101n;
    public int f1102r;
    public final w5 f1103s;
    public final LinearGradient f1104w;
    public final Paint f1105x;
    public final Matrix f1106y;

    public o(Context context, f6 f6Var) {
        super(context);
        int i7;
        this.f1099e = new ArrayList();
        xq xqVar = xq.h;
        this.f1103s = new w5(this, 0L, 300L, xqVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, g0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f1104w = linearGradient;
        Paint paint = new Paint(1);
        this.f1105x = paint;
        this.f1106y = new Matrix();
        this.D = new w5(this, 0L, 300L, xqVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, g0.L(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.E = linearGradient2;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f1096a = f6Var;
        setVerticalScrollBarEnabled(false);
        int x02 = k6.x0(null, k6.f27852d6, false);
        this.f1102r = x02;
        g0.z3(this, x02);
        n nVar = new n(this, context);
        this.d = nVar;
        addView(nVar, ha.c(-2.0f, -1));
        i iVar = new i(0, context, this);
        this.f1097b = iVar;
        if (Build.VERSION.SDK_INT >= 25) {
            iVar.setRevealOnFocusHint(false);
        }
        iVar.setTextSize(1, 16.0f);
        r6.m(iVar, 34, k6.Li, f6Var);
        r6.V(iVar, k6.G6, f6Var);
        int i10 = k6.Mi;
        r6.m(iVar, 30, i10, f6Var);
        r6.m(iVar, 36, i10, f6Var);
        iVar.setCursorWidth(1.5f);
        iVar.setInputType(iVar.getInputType() | 176);
        iVar.setSingleLine(true);
        iVar.setBackgroundDrawable(null);
        iVar.setVerticalScrollBarEnabled(false);
        iVar.setHorizontalScrollBarEnabled(false);
        iVar.setTextIsSelectable(false);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setImeOptions(268435462);
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        iVar.setGravity(i7 | 16);
        nVar.addView(iVar);
        iVar.setHintText(id.M0(2131745839, null));
        this.f1098c = (int) iVar.getPaint().measureText(id.M0(2131745839, null));
        iVar.addTextChangedListener(new j(this, 0));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (!this.f1099e.contains(view)) {
            return;
        }
        c20 c20Var = (c20) view;
        if (c20Var.D) {
            this.f1100f = null;
            n nVar = this.d;
            o oVar = (o) nVar.f1095n;
            oVar.H = true;
            oVar.f1099e.remove(c20Var);
            c20Var.setOnClickListener(null);
            nVar.c();
            nVar.f1092c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            nVar.f1091b = animatorSet;
            animatorSet.addListener(new l(0, nVar, c20Var));
            ArrayList arrayList = nVar.h;
            arrayList.clear();
            arrayList.add(c20Var);
            ArrayList arrayList2 = nVar.d;
            arrayList2.clear();
            nVar.f1093e.clear();
            arrayList2.add(c20Var);
            ArrayList arrayList3 = nVar.f1094f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(c20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(c20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(c20Var, View.ALPHA, 1.0f, 0.0f));
            nVar.requestLayout();
            hashSet.remove(Long.valueOf(c20Var.getUid()));
            runnable.run();
            return;
        }
        c20 c20Var2 = this.f1100f;
        if (c20Var2 != null) {
            c20Var2.a();
            this.f1100f = null;
        }
        this.f1100f = c20Var;
        c20Var.b();
    }

    public final void b(boolean z9, HashSet hashSet, Runnable runnable, ArrayList arrayList) {
        ArrayList arrayList2;
        int i7;
        Property property;
        Property property2;
        Property property3;
        Object M0;
        qp qpVar;
        TLRPC.TL_help_country tL_help_country;
        ArrayList arrayList3 = arrayList;
        qp s12 = qp.s1(p10.f24470s0);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList2 = this.f1099e;
            if (i10 >= arrayList2.size()) {
                break;
            }
            c20 c20Var = (c20) arrayList2.get(i10);
            if (!hashSet.contains(Long.valueOf(c20Var.getUid()))) {
                arrayList4.add(c20Var);
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
                    if (((c20) arrayList2.get(i11)).getUid() == longValue) {
                        qpVar = s12;
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
                            qpVar = s12;
                            if (tL_help_country2.default_name.hashCode() == longValue) {
                                tL_help_country = tL_help_country2;
                                break;
                            } else {
                                arrayList3 = arrayList;
                                s12 = qpVar;
                            }
                        }
                    }
                    qpVar = s12;
                    tL_help_country = M0;
                    if (tL_help_country != null) {
                        c20 c20Var2 = new c20(getContext(), tL_help_country, null, true, this.f1096a);
                        c20Var2.setOnClickListener(new g(this, hashSet, runnable, 0));
                        arrayList5.add(c20Var2);
                    }
                }
            }
            arrayList3 = arrayList;
            s12 = qpVar;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            n nVar = this.d;
            ArrayList arrayList6 = nVar.f1093e;
            ArrayList arrayList7 = nVar.d;
            ArrayList arrayList8 = nVar.f1094f;
            o oVar = (o) nVar.f1095n;
            oVar.H = true;
            ArrayList arrayList9 = oVar.f1099e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = nVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                ((c20) arrayList4.get(i13)).setOnClickListener(null);
            }
            nVar.c();
            if (z9) {
                nVar.f1092c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                nVar.f1091b = animatorSet;
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
                    c20 c20Var3 = (c20) arrayList4.get(i14);
                    arrayList6.add(c20Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(c20Var3, property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(c20Var3, property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(c20Var3, property, 1.0f, 0.0f));
                    i14++;
                }
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    c20 c20Var4 = (c20) arrayList5.get(i15);
                    arrayList7.add(c20Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(c20Var4, property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(c20Var4, property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(c20Var4, property, 0.0f, 1.0f));
                }
                i7 = 0;
            } else {
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    nVar.removeView((View) arrayList4.get(i16));
                }
                arrayList10.clear();
                nVar.f1091b = null;
                i7 = 0;
                nVar.f1092c = false;
                oVar.f1097b.setAllowDrawCursor(true);
            }
            for (int i17 = i7; i17 < arrayList5.size(); i17++) {
                nVar.addView((View) arrayList5.get(i17));
            }
            nVar.requestLayout();
        }
        this.f1097b.setOnKeyListener(new k(this, hashSet, runnable));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float d = this.f1103s.d(canScrollVertically(-1));
        Matrix matrix = this.f1106y;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f1104w.setLocalMatrix(matrix);
        Paint paint = this.f1105x;
        paint.setAlpha((int) (d * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), g0.L(8.0f) + scrollY, paint);
        float d2 = this.D.d(canScrollVertically(1));
        Matrix matrix2 = this.G;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - g0.L(8.0f));
        this.E.setLocalMatrix(matrix2);
        Paint paint2 = this.F;
        paint2.setAlpha((int) (d2 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - g0.L(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.f1097b;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(150.0f), Integer.MIN_VALUE));
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        if (this.H) {
            this.H = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = k5.C(20.0f, this.I, rect.top);
        rect.bottom = k5.C(50.0f, this.I, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z9);
    }

    public void setContainerHeight(float f10) {
        this.J = f10;
        n nVar = this.d;
        if (nVar != null) {
            nVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(org.telegram.messenger.c20 c20Var) {
        this.f1101n = c20Var;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f1097b.setText(charSequence);
        this.h = false;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = k6.x0(null, k6.f27852d6, false);
            int i7 = this.f1102r;
            if (i7 != 0 && x02 != i7) {
                this.f1102r = x02;
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
