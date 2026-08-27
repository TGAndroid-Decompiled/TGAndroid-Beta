package gg;

import ag.x1;
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
import h7.z5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.y5;

public abstract class l extends ScrollView {
    public final Paint A;
    public final Matrix B;
    public boolean C;
    public int D;
    public float E;

    public final c6 f7106a;

    public final g f7107b;

    public final int f7108c;
    public final k d;

    public final ArrayList f7109e;

    public a30 f7110f;
    public boolean h;

    public Utilities.Callback f7111n;

    public final y5 f7112r;

    public final LinearGradient f7113s;
    public final Paint v;

    public final Matrix f7114w;

    public final y5 f7115x;

    public final LinearGradient f7116y;

    public l(Context context, c6 c6Var) {
        super(context);
        this.f7109e = new ArrayList();
        er erVar = er.h;
        this.f7112r = new y5(this, 0L, 300L, erVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f7113s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.f7114w = new Matrix();
        this.f7115x = new y5(this, 0L, 300L, erVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.f7116y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.A = paint2;
        this.B = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f7106a = c6Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, g6.w0(null, g6.f23053d6, false));
        k kVar = new k(this, context);
        this.d = kVar;
        addView(kVar, z5.c(-2.0f, -1));
        g gVar = new g(this, context, 0);
        this.f7107b = gVar;
        if (Build.VERSION.SDK_INT >= 25) {
            gVar.setRevealOnFocusHint(false);
        }
        gVar.setTextSize(1, 16.0f);
        gVar.setHintColor(g6.v0(g6.Xh, c6Var));
        gVar.setTextColor(g6.v0(g6.G6, c6Var));
        int i10 = g6.Yh;
        gVar.setCursorColor(g6.v0(i10, c6Var));
        gVar.setHandlesColor(g6.v0(i10, c6Var));
        gVar.setCursorWidth(1.5f);
        gVar.setInputType(gVar.getInputType() | 176);
        gVar.setSingleLine(true);
        gVar.setBackgroundDrawable(null);
        gVar.setVerticalScrollBarEnabled(false);
        gVar.setHorizontalScrollBarEnabled(false);
        gVar.setTextIsSelectable(false);
        gVar.setPadding(0, 0, 0, 0);
        gVar.setImeOptions(268435462);
        gVar.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        kVar.addView(gVar);
        gVar.setHintText(LocaleController.getString(R.string.Search));
        this.f7108c = (int) gVar.getPaint().measureText(LocaleController.getString(R.string.Search));
        gVar.addTextChangedListener(new h(this));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (this.f7109e.contains(view)) {
            a30 a30Var = (a30) view;
            if (!a30Var.f26618y) {
                a30 a30Var2 = this.f7110f;
                if (a30Var2 != null) {
                    a30Var2.a();
                    this.f7110f = null;
                }
                this.f7110f = a30Var;
                a30Var.b();
                return;
            }
            this.f7110f = null;
            k kVar = this.d;
            l lVar = (l) kVar.f7105n;
            lVar.C = true;
            lVar.f7109e.remove(a30Var);
            a30Var.setOnClickListener(null);
            kVar.c();
            kVar.f7102c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            kVar.f7101b = animatorSet;
            animatorSet.addListener(new x1(2, kVar, a30Var));
            ArrayList arrayList = kVar.h;
            arrayList.clear();
            arrayList.add(a30Var);
            ArrayList arrayList2 = kVar.d;
            arrayList2.clear();
            kVar.f7103e.clear();
            arrayList2.add(a30Var);
            ArrayList arrayList3 = kVar.f7104f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(a30Var, (Property<a30, Float>) View.ALPHA, 1.0f, 0.0f));
            kVar.requestLayout();
            hashSet.remove(Long.valueOf(a30Var.getUid()));
            runnable.run();
        }
    }

    public final void b(boolean z10, HashSet hashSet, Runnable runnable, ArrayList arrayList) {
        ArrayList arrayList2;
        Property property;
        Property property2;
        Property property3;
        MessagesController messagesController;
        Object obj;
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList2 = this.f7109e;
            if (i10 >= arrayList2.size()) {
                break;
            }
            a30 a30Var = (a30) arrayList2.get(i10);
            if (!hashSet.contains(Long.valueOf(a30Var.getUid()))) {
                arrayList3.add(a30Var);
            }
            i10++;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long jLongValue = l10.longValue();
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList2.size()) {
                    Object user = jLongValue >= 0 ? messagesController2.getUser(l10) : messagesController2.getChat(Long.valueOf(-jLongValue));
                    if (arrayList == 0) {
                        messagesController = messagesController2;
                        obj = user;
                        break;
                    }
                    int size = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            messagesController = messagesController2;
                            obj = user;
                            break;
                        }
                        Object obj2 = arrayList.get(i12);
                        i12++;
                        TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) obj2;
                        messagesController = messagesController2;
                        if (tL_help_country.default_name.hashCode() == jLongValue) {
                            obj = tL_help_country;
                            break;
                        } else {
                            arrayList = arrayList;
                            messagesController2 = messagesController;
                        }
                    }
                    if (obj != null) {
                        a30 a30Var2 = new a30(getContext(), obj, null, true, this.f7106a);
                        a30Var2.setOnClickListener(new f(this, hashSet, runnable, 0));
                        arrayList4.add(a30Var2);
                        break;
                    }
                    break;
                }
                if (((a30) arrayList2.get(i11)).getUid() == jLongValue) {
                    messagesController = messagesController2;
                    break;
                }
                i11++;
            }
            messagesController2 = messagesController;
        }
        if (!arrayList3.isEmpty() || !arrayList4.isEmpty()) {
            k kVar = this.d;
            ArrayList arrayList5 = kVar.f7103e;
            ArrayList arrayList6 = kVar.d;
            ArrayList arrayList7 = kVar.f7104f;
            l lVar = (l) kVar.f7105n;
            lVar.C = true;
            ArrayList arrayList8 = lVar.f7109e;
            arrayList8.removeAll(arrayList3);
            arrayList8.addAll(arrayList4);
            ArrayList arrayList9 = kVar.h;
            arrayList9.clear();
            arrayList9.addAll(arrayList3);
            for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                ((a30) arrayList3.get(i13)).setOnClickListener(null);
            }
            kVar.c();
            if (z10) {
                kVar.f7102c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                kVar.f7101b = animatorSet;
                animatorSet.addListener(new j(kVar, arrayList3, 0));
                arrayList7.clear();
                arrayList6.clear();
                arrayList5.clear();
                int i14 = 0;
                while (true) {
                    int size2 = arrayList3.size();
                    property = View.ALPHA;
                    property2 = View.SCALE_Y;
                    property3 = View.SCALE_X;
                    if (i14 >= size2) {
                        break;
                    }
                    a30 a30Var3 = (a30) arrayList3.get(i14);
                    arrayList5.add(a30Var3);
                    arrayList7.add(ObjectAnimator.ofFloat(a30Var3, (Property<a30, Float>) property3, 1.0f, 0.01f));
                    arrayList7.add(ObjectAnimator.ofFloat(a30Var3, (Property<a30, Float>) property2, 1.0f, 0.01f));
                    arrayList7.add(ObjectAnimator.ofFloat(a30Var3, (Property<a30, Float>) property, 1.0f, 0.0f));
                    i14++;
                }
                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                    a30 a30Var4 = (a30) arrayList4.get(i15);
                    arrayList6.add(a30Var4);
                    arrayList7.add(ObjectAnimator.ofFloat(a30Var4, (Property<a30, Float>) property3, 0.01f, 1.0f));
                    arrayList7.add(ObjectAnimator.ofFloat(a30Var4, (Property<a30, Float>) property2, 0.01f, 1.0f));
                    arrayList7.add(ObjectAnimator.ofFloat(a30Var4, (Property<a30, Float>) property, 0.0f, 1.0f));
                }
            } else {
                for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                    kVar.removeView((View) arrayList3.get(i16));
                }
                arrayList9.clear();
                kVar.f7101b = null;
                kVar.f7102c = false;
                lVar.f7107b.setAllowDrawCursor(true);
            }
            for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                kVar.addView((View) arrayList4.get(i17));
            }
            kVar.requestLayout();
        }
        this.f7107b.setOnKeyListener(new i(this, hashSet, runnable));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY = getScrollY();
        float f10 = scrollY;
        canvas.saveLayerAlpha(0.0f, f10, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float fE = this.f7112r.e(canScrollVertically(-1));
        Matrix matrix = this.f7114w;
        matrix.reset();
        matrix.postTranslate(0.0f, f10);
        this.f7113s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (fE * 255.0f));
        canvas.drawRect(0.0f, f10, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float fE2 = this.f7115x.e(canScrollVertically(1));
        Matrix matrix2 = this.B;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.f7116y.setLocalMatrix(matrix2);
        Paint paint2 = this.A;
        paint2.setAlpha((int) (fE2 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.f7107b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), Integer.MIN_VALUE));
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.C) {
            this.C = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = y1.C(20.0f, this.D, rect.top);
        rect.bottom = y1.C(50.0f, this.D, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f10) {
        this.E = f10;
        k kVar = this.d;
        if (kVar != null) {
            kVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f7111n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f7107b.setText(charSequence);
        this.h = false;
    }
}
