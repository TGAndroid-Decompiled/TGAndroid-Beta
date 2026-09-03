package kg;

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
import dg.p;
import dg.y2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.z5;
public abstract class k extends ScrollView {
    public final Paint B;
    public final Matrix C;
    public boolean D;
    public int E;
    public float F;
    public final f6 f10545a;
    public final f f10546b;
    public final int f10547c;
    public final j d;
    public final ArrayList e;
    public o30 f10548f;
    public boolean h;
    public Utilities.Callback f10549n;
    public final z5 f10550r;
    public final LinearGradient f10551s;
    public final Paint v;
    public final Matrix f10552w;
    public final z5 f10553x;
    public final LinearGradient f10554y;

    public k(Context context, f6 f6Var) {
        super(context);
        int i10;
        this.e = new ArrayList();
        mr mrVar = mr.h;
        this.f10550r = new z5(this, 0L, 300L, mrVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f10551s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.f10552w = new Matrix();
        this.f10553x = new z5(this, 0L, 300L, mrVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.f10554y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.B = paint2;
        this.C = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f10545a = f6Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, j6.w0(null, j6.f19881d6, false));
        j jVar = new j(this, context);
        this.d = jVar;
        addView(jVar, b6.c(-2.0f, -1));
        f fVar = new f(this, context, 0);
        this.f10546b = fVar;
        if (Build.VERSION.SDK_INT >= 25) {
            fVar.setRevealOnFocusHint(false);
        }
        fVar.setTextSize(1, 16.0f);
        fVar.setHintColor(j6.v0(j6.Xh, f6Var));
        fVar.setTextColor(j6.v0(j6.G6, f6Var));
        int i11 = j6.Yh;
        fVar.setCursorColor(j6.v0(i11, f6Var));
        fVar.setHandlesColor(j6.v0(i11, f6Var));
        fVar.setCursorWidth(1.5f);
        fVar.setInputType(fVar.getInputType() | 176);
        fVar.setSingleLine(true);
        fVar.setBackgroundDrawable(null);
        fVar.setVerticalScrollBarEnabled(false);
        fVar.setHorizontalScrollBarEnabled(false);
        fVar.setTextIsSelectable(false);
        fVar.setPadding(0, 0, 0, 0);
        fVar.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        fVar.setGravity(i10 | 16);
        jVar.addView(fVar);
        fVar.setHintText(LocaleController.getString(R.string.Search));
        this.f10547c = (int) fVar.getPaint().measureText(LocaleController.getString(R.string.Search));
        fVar.addTextChangedListener(new g(this));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (!this.e.contains(view)) {
            return;
        }
        o30 o30Var = (o30) view;
        if (o30Var.f27451y) {
            this.f10548f = null;
            j jVar = this.d;
            k kVar = (k) jVar.f10544n;
            kVar.D = true;
            kVar.e.remove(o30Var);
            o30Var.setOnClickListener(null);
            jVar.c();
            jVar.f10542c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            jVar.f10541b = animatorSet;
            animatorSet.addListener(new y2(3, jVar, o30Var));
            ArrayList arrayList = jVar.h;
            arrayList.clear();
            arrayList.add(o30Var);
            ArrayList arrayList2 = jVar.d;
            arrayList2.clear();
            jVar.e.clear();
            arrayList2.add(o30Var);
            ArrayList arrayList3 = jVar.f10543f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(o30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(o30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(o30Var, View.ALPHA, 1.0f, 0.0f));
            jVar.requestLayout();
            hashSet.remove(Long.valueOf(o30Var.getUid()));
            runnable.run();
            return;
        }
        o30 o30Var2 = this.f10548f;
        if (o30Var2 != null) {
            o30Var2.a();
            this.f10548f = null;
        }
        this.f10548f = o30Var;
        o30Var.b();
    }

    public final void b(boolean z4, HashSet hashSet, Runnable runnable, ArrayList arrayList) {
        ArrayList arrayList2;
        Property property;
        Property property2;
        Property property3;
        Object chat;
        MessagesController messagesController;
        TLRPC.TL_help_country tL_help_country;
        ArrayList arrayList3 = arrayList;
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                break;
            }
            o30 o30Var = (o30) arrayList2.get(i10);
            if (!hashSet.contains(Long.valueOf(o30Var.getUid()))) {
                arrayList4.add(o30Var);
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
                    if (((o30) arrayList2.get(i11)).getUid() == longValue) {
                        messagesController = messagesController2;
                        break;
                    }
                    i11++;
                } else {
                    if (longValue >= 0) {
                        chat = messagesController2.getUser(l10);
                    } else {
                        chat = messagesController2.getChat(Long.valueOf(-longValue));
                    }
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList3.get(i12);
                            i12++;
                            TLRPC.TL_help_country tL_help_country2 = (TLRPC.TL_help_country) obj;
                            messagesController = messagesController2;
                            if (tL_help_country2.default_name.hashCode() == longValue) {
                                tL_help_country = tL_help_country2;
                                break;
                            } else {
                                arrayList3 = arrayList;
                                messagesController2 = messagesController;
                            }
                        }
                    }
                    messagesController = messagesController2;
                    tL_help_country = chat;
                    if (tL_help_country != null) {
                        o30 o30Var2 = new o30(getContext(), tL_help_country, null, true, this.f10545a);
                        o30Var2.setOnClickListener(new p(this, hashSet, runnable, 1));
                        arrayList5.add(o30Var2);
                    }
                }
            }
            arrayList3 = arrayList;
            messagesController2 = messagesController;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            j jVar = this.d;
            ArrayList arrayList6 = jVar.e;
            ArrayList arrayList7 = jVar.d;
            ArrayList arrayList8 = jVar.f10543f;
            k kVar = (k) jVar.f10544n;
            kVar.D = true;
            ArrayList arrayList9 = kVar.e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = jVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                ((o30) arrayList4.get(i13)).setOnClickListener(null);
            }
            jVar.c();
            if (z4) {
                jVar.f10542c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                jVar.f10541b = animatorSet;
                animatorSet.addListener(new i(jVar, arrayList4, 0));
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
                    o30 o30Var3 = (o30) arrayList4.get(i14);
                    arrayList6.add(o30Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(o30Var3, property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(o30Var3, property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(o30Var3, property, 1.0f, 0.0f));
                    i14++;
                }
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    o30 o30Var4 = (o30) arrayList5.get(i15);
                    arrayList7.add(o30Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(o30Var4, property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(o30Var4, property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(o30Var4, property, 0.0f, 1.0f));
                }
            } else {
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    jVar.removeView((View) arrayList4.get(i16));
                }
                arrayList10.clear();
                jVar.f10541b = null;
                jVar.f10542c = false;
                kVar.f10546b.setAllowDrawCursor(true);
            }
            for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                jVar.addView((View) arrayList5.get(i17));
            }
            jVar.requestLayout();
        }
        this.f10546b.setOnKeyListener(new h(this, hashSet, runnable));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e = this.f10550r.e(canScrollVertically(-1));
        Matrix matrix = this.f10552w;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f10551s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (e * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e6 = this.f10553x.e(canScrollVertically(1));
        Matrix matrix2 = this.C;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.f10554y.setLocalMatrix(matrix2);
        Paint paint2 = this.B;
        paint2.setAlpha((int) (e6 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.f10546b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), Integer.MIN_VALUE));
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        if (this.D) {
            this.D = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = y3.C(20.0f, this.E, rect.top);
        rect.bottom = y3.C(50.0f, this.E, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z4);
    }

    public void setContainerHeight(float f10) {
        this.F = f10;
        j jVar = this.d;
        if (jVar != null) {
            jVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f10549n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f10546b.setText(charSequence);
        this.h = false;
    }
}
