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
import c8.ja;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.u5;
public abstract class o extends ScrollView implements z5 {
    public final u5 E;
    public final LinearGradient F;
    public final Paint G;
    public final Matrix H;
    public boolean I;
    public int J;
    public float K;
    public final e6 f1094a;
    public final i f1095b;
    public final int f1096c;
    public final n d;
    public final ArrayList f1097e;
    public f20 f1098f;
    public boolean h;
    public z10 f1099n;
    public int f1100r;
    public final u5 f1101s;
    public final LinearGradient f1102w;
    public final Paint f1103x;
    public final Matrix f1104y;

    public o(Context context, e6 e6Var) {
        super(context);
        int i7;
        this.f1097e = new ArrayList();
        er erVar = er.h;
        this.f1101s = new u5(this, 0L, 300L, erVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, g0.L(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f1102w = linearGradient;
        Paint paint = new Paint(1);
        this.f1103x = paint;
        this.f1104y = new Matrix();
        this.E = new u5(this, 0L, 300L, erVar);
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
        this.f1094a = e6Var;
        setVerticalScrollBarEnabled(false);
        int x02 = j6.x0(null, j6.f28849d6, false);
        this.f1100r = x02;
        g0.y3(this, x02);
        n nVar = new n(this, context);
        this.d = nVar;
        addView(nVar, ja.c(-2.0f, -1));
        i iVar = new i(0, context, this);
        this.f1095b = iVar;
        if (Build.VERSION.SDK_INT >= 25) {
            iVar.setRevealOnFocusHint(false);
        }
        iVar.setTextSize(1, 16.0f);
        q6.l(iVar, 34, j6.Oi, e6Var);
        q6.U(iVar, j6.G6, e6Var);
        int i10 = j6.Pi;
        q6.l(iVar, 30, i10, e6Var);
        q6.l(iVar, 36, i10, e6Var);
        iVar.setCursorWidth(1.5f);
        iVar.setInputType(iVar.getInputType() | 176);
        iVar.setSingleLine(true);
        iVar.setBackgroundDrawable(null);
        iVar.setVerticalScrollBarEnabled(false);
        iVar.setHorizontalScrollBarEnabled(false);
        iVar.setTextIsSelectable(false);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setImeOptions(268435462);
        if (hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        iVar.setGravity(i7 | 16);
        nVar.addView(iVar);
        iVar.setHintText(hd.M0(2131745836, null));
        this.f1096c = (int) iVar.getPaint().measureText(hd.M0(2131745836, null));
        iVar.addTextChangedListener(new j(this, 0));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (!this.f1097e.contains(view)) {
            return;
        }
        f20 f20Var = (f20) view;
        if (f20Var.E) {
            this.f1098f = null;
            n nVar = this.d;
            o oVar = (o) nVar.f1093n;
            oVar.I = true;
            oVar.f1097e.remove(f20Var);
            f20Var.setOnClickListener(null);
            nVar.c();
            nVar.f1090c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            nVar.f1089b = animatorSet;
            animatorSet.addListener(new l(0, nVar, f20Var));
            ArrayList arrayList = nVar.h;
            arrayList.clear();
            arrayList.add(f20Var);
            ArrayList arrayList2 = nVar.d;
            arrayList2.clear();
            nVar.f1091e.clear();
            arrayList2.add(f20Var);
            ArrayList arrayList3 = nVar.f1092f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(f20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(f20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(f20Var, View.ALPHA, 1.0f, 0.0f));
            nVar.requestLayout();
            hashSet.remove(Long.valueOf(f20Var.getUid()));
            runnable.run();
            return;
        }
        f20 f20Var2 = this.f1098f;
        if (f20Var2 != null) {
            f20Var2.a();
            this.f1098f = null;
        }
        this.f1098f = f20Var;
        f20Var.b();
    }

    public final void b(boolean z10, HashSet hashSet, Runnable runnable, ArrayList arrayList) {
        ArrayList arrayList2;
        int i7;
        Property property;
        Property property2;
        Property property3;
        Object M0;
        np npVar;
        TLRPC.TL_help_country tL_help_country;
        ArrayList arrayList3 = arrayList;
        np s12 = np.s1(m10.f24940t0);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList2 = this.f1097e;
            if (i10 >= arrayList2.size()) {
                break;
            }
            f20 f20Var = (f20) arrayList2.get(i10);
            if (!hashSet.contains(Long.valueOf(f20Var.getUid()))) {
                arrayList4.add(f20Var);
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
                    if (((f20) arrayList2.get(i11)).getUid() == longValue) {
                        npVar = s12;
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
                            npVar = s12;
                            if (tL_help_country2.default_name.hashCode() == longValue) {
                                tL_help_country = tL_help_country2;
                                break;
                            } else {
                                arrayList3 = arrayList;
                                s12 = npVar;
                            }
                        }
                    }
                    npVar = s12;
                    tL_help_country = M0;
                    if (tL_help_country != null) {
                        f20 f20Var2 = new f20(getContext(), tL_help_country, null, true, this.f1094a);
                        f20Var2.setOnClickListener(new g(this, hashSet, runnable, 0));
                        arrayList5.add(f20Var2);
                    }
                }
            }
            arrayList3 = arrayList;
            s12 = npVar;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            n nVar = this.d;
            ArrayList arrayList6 = nVar.f1091e;
            ArrayList arrayList7 = nVar.d;
            ArrayList arrayList8 = nVar.f1092f;
            o oVar = (o) nVar.f1093n;
            oVar.I = true;
            ArrayList arrayList9 = oVar.f1097e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = nVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                ((f20) arrayList4.get(i13)).setOnClickListener(null);
            }
            nVar.c();
            if (z10) {
                nVar.f1090c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                nVar.f1089b = animatorSet;
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
                    f20 f20Var3 = (f20) arrayList4.get(i14);
                    arrayList6.add(f20Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(f20Var3, property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(f20Var3, property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(f20Var3, property, 1.0f, 0.0f));
                    i14++;
                }
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    f20 f20Var4 = (f20) arrayList5.get(i15);
                    arrayList7.add(f20Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(f20Var4, property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(f20Var4, property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(f20Var4, property, 0.0f, 1.0f));
                }
                i7 = 0;
            } else {
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    nVar.removeView((View) arrayList4.get(i16));
                }
                arrayList10.clear();
                nVar.f1089b = null;
                i7 = 0;
                nVar.f1090c = false;
                oVar.f1095b.setAllowDrawCursor(true);
            }
            for (int i17 = i7; i17 < arrayList5.size(); i17++) {
                nVar.addView((View) arrayList5.get(i17));
            }
            nVar.requestLayout();
        }
        this.f1095b.setOnKeyListener(new k(this, hashSet, runnable));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float d = this.f1101s.d(canScrollVertically(-1));
        Matrix matrix = this.f1104y;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f1102w.setLocalMatrix(matrix);
        Paint paint = this.f1103x;
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
        return this.f1095b;
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
        rect.top = k5.C(20.0f, this.J, rect.top);
        rect.bottom = k5.C(50.0f, this.J, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f10) {
        this.K = f10;
        n nVar = this.d;
        if (nVar != null) {
            nVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(z10 z10Var) {
        this.f1099n = z10Var;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f1095b.setText(charSequence);
        this.h = false;
    }

    @Override
    public final void updateColors() {
        try {
            int x02 = j6.x0(null, j6.f28849d6, false);
            int i7 = this.f1100r;
            if (i7 != 0 && x02 != i7) {
                this.f1100r = x02;
                g0.y3(this, x02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
