package fg;

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
import g7.e6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.l0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.w20;
import org.telegram.ui.Components.y5;
public abstract class m extends ScrollView {
    public final Paint A;
    public final Matrix B;
    public boolean C;
    public int D;
    public float E;
    public final b6 f6309a;
    public final g f6310b;
    public final int f6311c;
    public final l d;
    public final ArrayList f6312e;
    public w20 f6313f;
    public boolean h;
    public Utilities.Callback f6314n;
    public final y5 f6315r;
    public final LinearGradient f6316s;
    public final Paint v;
    public final Matrix f6317w;
    public final y5 f6318x;
    public final LinearGradient f6319y;

    public m(Context context, b6 b6Var) {
        super(context);
        int i9;
        this.f6312e = new ArrayList();
        gr grVar = gr.h;
        this.f6315r = new y5(this, 0L, 300L, grVar);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode);
        this.f6316s = linearGradient;
        Paint paint = new Paint(1);
        this.v = paint;
        this.f6317w = new Matrix();
        this.f6318x = new y5(this, 0L, 300L, grVar);
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode);
        this.f6319y = linearGradient2;
        Paint paint2 = new Paint(1);
        this.A = paint2;
        this.B = new Matrix();
        paint.setShader(linearGradient);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setXfermode(new PorterDuffXfermode(mode));
        paint2.setShader(linearGradient2);
        paint2.setXfermode(new PorterDuffXfermode(mode));
        this.f6309a = b6Var;
        setVerticalScrollBarEnabled(false);
        AndroidUtilities.setScrollViewEdgeEffectColor(this, f6.w0(null, f6.f23001d6, false));
        l lVar = new l(this, context);
        this.d = lVar;
        addView(lVar, e6.c(-2.0f, -1));
        g gVar = new g(this, context, 0);
        this.f6310b = gVar;
        if (Build.VERSION.SDK_INT >= 25) {
            gVar.setRevealOnFocusHint(false);
        }
        gVar.setTextSize(1, 16.0f);
        gVar.setHintColor(f6.v0(f6.Xh, b6Var));
        gVar.setTextColor(f6.v0(f6.G6, b6Var));
        int i10 = f6.Yh;
        gVar.setCursorColor(f6.v0(i10, b6Var));
        gVar.setHandlesColor(f6.v0(i10, b6Var));
        gVar.setCursorWidth(1.5f);
        gVar.setInputType(gVar.getInputType() | 176);
        gVar.setSingleLine(true);
        gVar.setBackgroundDrawable(null);
        gVar.setVerticalScrollBarEnabled(false);
        gVar.setHorizontalScrollBarEnabled(false);
        gVar.setTextIsSelectable(false);
        gVar.setPadding(0, 0, 0, 0);
        gVar.setImeOptions(268435462);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        gVar.setGravity(i9 | 16);
        lVar.addView(gVar);
        gVar.setHintText(LocaleController.getString(R.string.Search));
        this.f6311c = (int) gVar.getPaint().measureText(LocaleController.getString(R.string.Search));
        gVar.addTextChangedListener(new h(this));
    }

    public final void a(View view, HashSet hashSet, Runnable runnable) {
        if (!this.f6312e.contains(view)) {
            return;
        }
        w20 w20Var = (w20) view;
        if (w20Var.f34088y) {
            this.f6313f = null;
            l lVar = this.d;
            m mVar = (m) lVar.f6308n;
            mVar.C = true;
            mVar.f6312e.remove(w20Var);
            w20Var.setOnClickListener(null);
            lVar.c();
            lVar.f6305c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            lVar.f6304b = animatorSet;
            animatorSet.addListener(new j(0, lVar, w20Var));
            ArrayList arrayList = lVar.h;
            arrayList.clear();
            arrayList.add(w20Var);
            ArrayList arrayList2 = lVar.d;
            arrayList2.clear();
            lVar.f6306e.clear();
            arrayList2.add(w20Var);
            ArrayList arrayList3 = lVar.f6307f;
            arrayList3.clear();
            arrayList3.add(ObjectAnimator.ofFloat(w20Var, View.SCALE_X, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(w20Var, View.SCALE_Y, 1.0f, 0.01f));
            arrayList3.add(ObjectAnimator.ofFloat(w20Var, View.ALPHA, 1.0f, 0.0f));
            lVar.requestLayout();
            hashSet.remove(Long.valueOf(w20Var.getUid()));
            runnable.run();
            return;
        }
        w20 w20Var2 = this.f6313f;
        if (w20Var2 != null) {
            w20Var2.a();
            this.f6313f = null;
        }
        this.f6313f = w20Var;
        w20Var.b();
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
        int i9 = 0;
        while (true) {
            arrayList2 = this.f6312e;
            if (i9 >= arrayList2.size()) {
                break;
            }
            w20 w20Var = (w20) arrayList2.get(i9);
            if (!hashSet.contains(Long.valueOf(w20Var.getUid()))) {
                arrayList4.add(w20Var);
            }
            i9++;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            int i10 = 0;
            while (true) {
                if (i10 < arrayList2.size()) {
                    if (((w20) arrayList2.get(i10)).getUid() == longValue) {
                        messagesController = messagesController2;
                        break;
                    }
                    i10++;
                } else {
                    if (longValue >= 0) {
                        chat = messagesController2.getUser(l10);
                    } else {
                        chat = messagesController2.getChat(Long.valueOf(-longValue));
                    }
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList3.get(i11);
                            i11++;
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
                        w20 w20Var2 = new w20(getContext(), tL_help_country, null, true, this.f6309a);
                        w20Var2.setOnClickListener(new f(this, hashSet, runnable, 0));
                        arrayList5.add(w20Var2);
                    }
                }
            }
            arrayList3 = arrayList;
            messagesController2 = messagesController;
        }
        if (!arrayList4.isEmpty() || !arrayList5.isEmpty()) {
            l lVar = this.d;
            ArrayList arrayList6 = lVar.f6306e;
            ArrayList arrayList7 = lVar.d;
            ArrayList arrayList8 = lVar.f6307f;
            m mVar = (m) lVar.f6308n;
            mVar.C = true;
            ArrayList arrayList9 = mVar.f6312e;
            arrayList9.removeAll(arrayList4);
            arrayList9.addAll(arrayList5);
            ArrayList arrayList10 = lVar.h;
            arrayList10.clear();
            arrayList10.addAll(arrayList4);
            for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                ((w20) arrayList4.get(i12)).setOnClickListener(null);
            }
            lVar.c();
            if (z10) {
                lVar.f6305c = false;
                AnimatorSet animatorSet = new AnimatorSet();
                lVar.f6304b = animatorSet;
                animatorSet.addListener(new k(lVar, arrayList4, 0));
                arrayList8.clear();
                arrayList7.clear();
                arrayList6.clear();
                int i13 = 0;
                while (true) {
                    int size2 = arrayList4.size();
                    property = View.ALPHA;
                    property2 = View.SCALE_Y;
                    property3 = View.SCALE_X;
                    if (i13 >= size2) {
                        break;
                    }
                    w20 w20Var3 = (w20) arrayList4.get(i13);
                    arrayList6.add(w20Var3);
                    arrayList8.add(ObjectAnimator.ofFloat(w20Var3, property3, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(w20Var3, property2, 1.0f, 0.01f));
                    arrayList8.add(ObjectAnimator.ofFloat(w20Var3, property, 1.0f, 0.0f));
                    i13++;
                }
                for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                    w20 w20Var4 = (w20) arrayList5.get(i14);
                    arrayList7.add(w20Var4);
                    arrayList8.add(ObjectAnimator.ofFloat(w20Var4, property3, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(w20Var4, property2, 0.01f, 1.0f));
                    arrayList8.add(ObjectAnimator.ofFloat(w20Var4, property, 0.0f, 1.0f));
                }
            } else {
                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                    lVar.removeView((View) arrayList4.get(i15));
                }
                arrayList10.clear();
                lVar.f6304b = null;
                lVar.f6305c = false;
                mVar.f6310b.setAllowDrawCursor(true);
            }
            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                lVar.addView((View) arrayList5.get(i16));
            }
            lVar.requestLayout();
        }
        this.f6310b.setOnKeyListener(new i(this, hashSet, runnable));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int scrollY;
        float scrollY2 = getScrollY();
        canvas.saveLayerAlpha(0.0f, scrollY2, getWidth(), getHeight() + scrollY, 255, 31);
        super.dispatchDraw(canvas);
        canvas.save();
        float e10 = this.f6315r.e(canScrollVertically(-1));
        Matrix matrix = this.f6317w;
        matrix.reset();
        matrix.postTranslate(0.0f, scrollY2);
        this.f6316s.setLocalMatrix(matrix);
        Paint paint = this.v;
        paint.setAlpha((int) (e10 * 255.0f));
        canvas.drawRect(0.0f, scrollY2, getWidth(), AndroidUtilities.dp(8.0f) + scrollY, paint);
        float e11 = this.f6318x.e(canScrollVertically(1));
        Matrix matrix2 = this.B;
        matrix2.reset();
        matrix2.postTranslate(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f));
        this.f6319y.setLocalMatrix(matrix2);
        Paint paint2 = this.A;
        paint2.setAlpha((int) (e11 * 255.0f));
        canvas.drawRect(0.0f, (getHeight() + scrollY) - AndroidUtilities.dp(8.0f), getWidth(), getHeight() + scrollY, paint2);
        canvas.restore();
        canvas.restore();
    }

    public EditTextBoldCursor getEditText() {
        return this.f6310b;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), Integer.MIN_VALUE));
    }

    @Override
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.C) {
            this.C = false;
            return false;
        }
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        rect.top = l0.C(20.0f, this.D, rect.top);
        rect.bottom = l0.C(50.0f, this.D, rect.bottom);
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void setContainerHeight(float f10) {
        this.E = f10;
        l lVar = this.d;
        if (lVar != null) {
            lVar.requestLayout();
        }
    }

    public void setOnSearchTextChange(Utilities.Callback<String> callback) {
        this.f6314n = callback;
    }

    public void setText(CharSequence charSequence) {
        this.h = true;
        this.f6310b.setText(charSequence);
        this.h = false;
    }
}
