package ig;

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
import bg.c3;
import bg.q;
import i7.f6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.jr;
public abstract class k extends ScrollView {
    public final Paint A;
    public final Matrix B;
    public boolean C;
    public int D;
    public float E;
    public final c6 f8993a;
    public final f f8994b;
    public final int f8995c;
    public final j d;
    public final ArrayList f8996e;
    public j30 f8997f;
    public boolean h;
    public Utilities.Callback f8998n;
    public final d6 f8999r;
    public final LinearGradient f9000s;
    public final Paint v;
    public final Matrix f9001w;
    public final d6 f9002x;
    public final LinearGradient f9003y;

    public k(Context context, c6 c6Var) {
        super(context);
        int i10;
        this.f8996e = new ArrayList();
        jr jrVar = jr.h;
        this.f8999r = new d6(this, 0L, 300L, jrVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f9000s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.f9001w = new Matrix();
        this.f9002x = new d6(this, 0L, 300L, jrVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.f9003y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.A = paint2;
        this.B = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f8993a = c6Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, g6.w0(null, g6.f23062d6, false));
        j jVar = new j(this, context);
        this.d = jVar;
        addView(jVar, f6.c(-2.0f, -1));
        f fVar = new f(this, context, 0);
        this.f8994b = fVar;
        if (Build.VERSION.SDK_INT >= 25) {
            fVar.setRevealOnFocusHint(false);
        }
        fVar.setTextSize(1, 16.0f);
        fVar.setHintColor(g6.v0(g6.Xh, c6Var));
        fVar.setTextColor(g6.v0(g6.G6, c6Var));
        int i11 = g6.Yh;
        fVar.setCursorColor(g6.v0(i11, c6Var));
        fVar.setHandlesColor(g6.v0(i11, c6Var));
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
        this.f8995c = (int) fVar.getPaint().measureText(LocaleController.getString(R.string.Search));
        fVar.addTextChangedListener(new g(this));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (!this.f8996e.contains(view)) {
            return;
        }
        j30 j30Var = (j30) view;
        if (j30Var.f29540y) {
            this.f8997f = null;
            j jVar = this.d;
            k kVar = (k) jVar.f8992n;
            kVar.C = true;
            kVar.f8996e.remove(j30Var);
            j30Var.setOnClickListener(null);
            jVar.c();
            jVar.f8989c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            jVar.f8988b = animatorSet;
            animatorSet.addListener(new c3(3, jVar, j30Var));
            ArrayList arrayList = jVar.h;
            arrayList.clear();
            arrayList.add(j30Var);
            ArrayList arrayList2 = jVar.d;
            arrayList2.clear();
            jVar.f8990e.clear();
            arrayList2.add(j30Var);
            ArrayList arrayList3 = jVar.f8991f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(j30Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(j30Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(j30Var, View.ALPHA, 1.0f, 0.0f));
            jVar.requestLayout();
            hashSet.remove(Long.valueOf(j30Var.getUid()));
            runnable.run();
            return;
        }
        j30 j30Var2 = this.f8997f;
        if (j30Var2 != null) {
            j30Var2.a();
            this.f8997f = null;
        }
        this.f8997f = j30Var;
        j30Var.b();
    }

    public final void b(boolean z10, HashSet hashSet, Runnable runnable, ArrayList arrayList) {
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
            arrayList2 = this.f8996e;
            if (i10 >= arrayList2.size()) {
                break;
            }
            j30 j30Var = (j30) arrayList2.get(i10);
            if (!hashSet.contains(Long.valueOf(j30Var.getUid()))) {
                arrayList4.add(j30Var);
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
                    if (((j30) arrayList2.get(i11)).getUid() == longValue) {
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
                        j30 j30Var2 = new j30(getContext(), tL_help_country, null, true, this.f8993a);
                        j30Var2.setOnClickListener(new q(this, hashSet, runnable, 1));
                        arrayList5.add(j30Var2);
                    }
                }
            }
            arrayList3 = arrayList;
            messagesController2 = messagesController;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            j jVar = this.d;
            ArrayList arrayList6 = jVar.f8990e;
            ArrayList arrayList7 = jVar.d;
            ArrayList arrayList8 = jVar.f8991f;
            k kVar = (k) jVar.f8992n;
            kVar.C = true;
            ArrayList arrayList9 = kVar.f8996e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = jVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                ((j30) arrayList4.get(i13)).setOnClickListener(null);
            }
            jVar.c();
            if (z10) {
                jVar.f8989c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                jVar.f8988b = animatorSet;
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
                    j30 j30Var3 = (j30) arrayList4.get(i14);
                    arrayList6.add(j30Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(j30Var3, property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(j30Var3, property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(j30Var3, property, 1.0f, 0.0f));
                    i14++;
                }
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    j30 j30Var4 = (j30) arrayList5.get(i15);
                    arrayList7.add(j30Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(j30Var4, property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(j30Var4, property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(j30Var4, property, 0.0f, 1.0f));
                }
            } else {
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    jVar.removeView((View) arrayList4.get(i16));
                }
                arrayList10.clear();
                jVar.f8988b = null;
                jVar.f8989c = false;
                kVar.f8994b.setAllowDrawCursor(true);
            }
            for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                jVar.addView((View) arrayList5.get(i17));
            }
            jVar.requestLayout();
        }
        this.f8994b.setOnKeyListener(new h(this, hashSet, runnable));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e10 = this.f8999r.e(canScrollVertically(-1));
        Matrix matrix = this.f9001w;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f9000s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (e10 * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e11 = this.f9002x.e(canScrollVertically(1));
        Matrix matrix2 = this.B;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.f9003y.setLocalMatrix(matrix2);
        Paint paint2 = this.A;
        paint2.setAlpha((int) (e11 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.f8994b;
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
        rect.top = x3.C(20.0f, this.D, rect.top);
        rect.bottom = x3.C(50.0f, this.D, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f9) {
        this.E = f9;
        j jVar = this.d;
        if (jVar != null) {
            jVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f8998n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f8994b.setText(charSequence);
        this.h = false;
    }
}
