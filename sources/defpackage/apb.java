package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.SpannedString;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.GroupCreateCheckBox;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RadioButton;
public final class apb {
    public final View a;
    public final Paint[] b;
    public final Drawable[] c;
    public final Class[] d;
    public final int e;
    public final String f;
    public zob g;
    public int h;
    public final boolean[] i;
    public final int j;
    public final String[] k;
    public final HashMap l;
    public final HashMap m;
    public vnb n;

    public apb(View view, int i, Class[] clsArr, String[] strArr, Drawable[] drawableArr, zob zobVar, int i2) {
        this.i = new boolean[1];
        this.e = i2;
        this.b = null;
        this.c = drawableArr;
        this.a = view;
        this.j = i;
        this.d = clsArr;
        this.k = strArr;
        this.g = zobVar;
        this.l = new HashMap();
        this.m = new HashMap();
        if (view instanceof iu3) {
            this.a = ((iu3) view).getEditText();
        }
    }

    public static boolean b(int i, View view) {
        if (i >= 0 && view != null) {
            Object tag = view.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(Object obj, View view, int i) {
        TextView nextTextView;
        TextView nextTextView2;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        boolean z = obj instanceof View;
        if (z) {
            ((View) obj).invalidate();
        }
        String str = this.f;
        if (str != null && (obj instanceof e29)) {
            ((e29) obj).h(i, str);
        }
        int i2 = this.j;
        if ((131072 & i2) != 0 && z) {
            obj = ((View) obj).getBackground();
        }
        Drawable drawable4 = null;
        if ((i2 & 1) != 0 && (obj instanceof View)) {
            View view2 = (View) obj;
            Drawable background = view2.getBackground();
            if (background instanceof m37) {
                m37 m37Var = (m37) background;
                m37Var.a.setColor(i);
                m37Var.b = null;
                return;
            }
            view2.setBackgroundColor(i);
        } else if (obj instanceof xt3) {
            if ((8388608 & i2) != 0) {
                xt3 xt3Var = (xt3) obj;
                xt3Var.setHintColor(i);
                xt3Var.setHintTextColor(i);
            } else if ((i2 & 16777216) != 0) {
                ((xt3) obj).setCursorColor(i);
            } else {
                ((xt3) obj).setTextColor(i);
            }
        } else if (obj instanceof ema) {
            if ((i2 & 2) != 0) {
                ((ema) obj).setLinkTextColor(i);
            } else {
                ((ema) obj).setTextColor(i);
            }
        } else {
            boolean z2 = false;
            if (obj instanceof TextView) {
                TextView textView = (TextView) obj;
                if ((i2 & 8) != 0) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (compoundDrawables != null) {
                        for (Drawable drawable5 : compoundDrawables) {
                            if (drawable5 != null) {
                                drawable5.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                            }
                        }
                    }
                } else if ((i2 & 2) != 0) {
                    textView.getPaint().linkColor = i;
                    textView.invalidate();
                } else if ((i2 & 33554432) != 0) {
                    CharSequence text = textView.getText();
                    if (text instanceof SpannedString) {
                        SpannedString spannedString = (SpannedString) text;
                        y7c[] y7cVarArr = (y7c[]) spannedString.getSpans(0, spannedString.length(), y7c.class);
                        if (y7cVarArr != null && y7cVarArr.length > 0) {
                            for (y7c y7cVar : y7cVarArr) {
                                y7cVar.b = i;
                            }
                        }
                    }
                } else {
                    textView.setTextColor(i);
                }
            } else if (obj instanceof ImageView) {
                ImageView imageView = (ImageView) obj;
                Drawable drawable6 = imageView.getDrawable();
                if (drawable6 instanceof zm2) {
                    if ((i2 & 32) != 0) {
                        drawable3 = ((zm2) drawable6).a;
                    } else {
                        drawable3 = ((zm2) drawable6).b;
                    }
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        return;
                    }
                    return;
                }
                imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
            } else if (obj instanceof de0) {
                de0 de0Var = (de0) obj;
                if (de0Var.getImageReceiver() != null) {
                    drawable4 = de0Var.getImageReceiver().n0;
                }
                if (drawable4 instanceof zm2) {
                    if ((i2 & 32) != 0) {
                        drawable2 = ((zm2) drawable4).a;
                    } else {
                        drawable2 = ((zm2) drawable4).b;
                    }
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                    }
                } else if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                }
            } else if (obj instanceof Drawable) {
                if (obj instanceof s26) {
                    if ((i2 & 32) != 0) {
                        s26.k.setColor(i);
                    } else {
                        ((s26) obj).h.setColor(i);
                    }
                } else if (obj instanceof zm2) {
                    if ((i2 & 32) != 0) {
                        drawable = ((zm2) obj).a;
                    } else {
                        drawable = ((zm2) obj).b;
                    }
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                    }
                } else if (!(obj instanceof StateListDrawable) && !(obj instanceof RippleDrawable)) {
                    if (obj instanceof GradientDrawable) {
                        ((GradientDrawable) obj).setColor(i);
                    } else {
                        ((Drawable) obj).setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                    }
                } else {
                    Drawable drawable7 = (Drawable) obj;
                    if ((i2 & 65536) != 0) {
                        z2 = true;
                    }
                    aob.F1(drawable7, i, z2);
                }
            } else if (obj instanceof CheckBox) {
                if ((i2 & 8192) != 0) {
                    ((CheckBox) obj).setBackgroundColor(i);
                } else if ((i2 & 16384) != 0) {
                    ((CheckBox) obj).setCheckColor(i);
                }
            } else if (!(obj instanceof GroupCreateCheckBox)) {
                if (obj instanceof RadioButton) {
                    if ((i2 & 8192) != 0) {
                        RadioButton radioButton = (RadioButton) obj;
                        radioButton.setBackgroundColor(i);
                        radioButton.invalidate();
                    } else if ((i2 & 16384) != 0) {
                        RadioButton radioButton2 = (RadioButton) obj;
                        radioButton2.setCheckedColor(i);
                        radioButton2.invalidate();
                    }
                } else if (obj instanceof TextPaint) {
                    if ((i2 & 2) != 0) {
                        ((TextPaint) obj).linkColor = i;
                    } else {
                        ((TextPaint) obj).setColor(i);
                    }
                } else if (obj instanceof n46) {
                    if ((i2 & 2048) != 0) {
                        ((n46) obj).setProgressColor(i);
                    } else {
                        ((n46) obj).setBackColor(i);
                    }
                } else if (obj instanceof RadialProgressView) {
                    ((RadialProgressView) obj).setProgressColor(i);
                } else if (obj instanceof Paint) {
                    ((Paint) obj).setColor(i);
                    view.invalidate();
                } else if (obj instanceof uy9) {
                    if ((i2 & 2048) != 0) {
                        ((uy9) obj).setOuterColor(i);
                    } else {
                        ((uy9) obj).setInnerColor(i);
                    }
                } else if (obj instanceof d20) {
                    if ((33554432 & i2) != 0) {
                        for (int i3 = 0; i3 < 2; i3++) {
                            d20 d20Var = (d20) obj;
                            if (i3 == 0) {
                                nextTextView2 = d20Var.getTextView();
                            } else {
                                nextTextView2 = d20Var.getNextTextView();
                            }
                            if (nextTextView2 != null) {
                                CharSequence text2 = nextTextView2.getText();
                                if (text2 instanceof SpannedString) {
                                    SpannedString spannedString2 = (SpannedString) text2;
                                    y7c[] y7cVarArr2 = (y7c[]) spannedString2.getSpans(0, spannedString2.length(), y7c.class);
                                    if (y7cVarArr2 != null && y7cVarArr2.length > 0) {
                                        for (y7c y7cVar2 : y7cVarArr2) {
                                            y7cVar2.b = i;
                                        }
                                    }
                                }
                            }
                        }
                    } else if ((i2 & 4) != 0) {
                        if ((i2 & 262144) == 0 || b(this.e, (View) obj)) {
                            for (int i4 = 0; i4 < 2; i4++) {
                                d20 d20Var2 = (d20) obj;
                                if (i4 == 0) {
                                    nextTextView = d20Var2.getTextView();
                                } else {
                                    nextTextView = d20Var2.getNextTextView();
                                }
                                if (nextTextView != null) {
                                    nextTextView.setTextColor(i);
                                    CharSequence text3 = nextTextView.getText();
                                    if (text3 instanceof SpannedString) {
                                        SpannedString spannedString3 = (SpannedString) text3;
                                        y7c[] y7cVarArr3 = (y7c[]) spannedString3.getSpans(0, spannedString3.length(), y7c.class);
                                        if (y7cVarArr3 != null && y7cVarArr3.length > 0) {
                                            for (y7c y7cVar3 : y7cVarArr3) {
                                                y7cVar3.b = i;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                ((GroupCreateCheckBox) obj).updateColors();
                throw null;
            }
        }
    }

    public final int c() {
        Integer num;
        vnb vnbVar = this.n;
        int i = this.e;
        if (vnbVar != null) {
            num = Integer.valueOf(vnbVar.h(i));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return aob.w0(null, i, false);
    }

    public final void d(int i, View view) {
        Class[] clsArr;
        TextView nextTextView;
        boolean z;
        boolean z2;
        String str;
        Field field;
        Object obj;
        if (view != null && (clsArr = this.d) != null) {
            for (int i2 = 0; i2 < clsArr.length; i2++) {
                Class cls = clsArr[i2];
                if (cls != null && cls.isInstance(view)) {
                    view.invalidate();
                    int i3 = this.j;
                    int i4 = 262144 & i3;
                    String[] strArr = this.k;
                    int i5 = this.e;
                    if (i4 != 0 && !b(i5, view)) {
                        z = false;
                    } else {
                        view.invalidate();
                        if (strArr == null && (i3 & 32) != 0) {
                            Drawable background = view.getBackground();
                            if (background != null) {
                                if ((i3 & 16) != 0) {
                                    if (background instanceof zm2) {
                                        Drawable drawable = ((zm2) background).a;
                                        if (drawable instanceof ColorDrawable) {
                                            ((ColorDrawable) drawable).setColor(i);
                                        }
                                    }
                                } else {
                                    if (background instanceof zm2) {
                                        background = ((zm2) background).b;
                                    } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                        if ((i3 & 65536) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        aob.F1(background, i, z2);
                                    }
                                    if (background != null) {
                                        background.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                    }
                                }
                            }
                        } else if ((i3 & 16) != 0) {
                            view.setBackgroundColor(i);
                        } else if ((i3 & 4) != 0) {
                            if (view instanceof TextView) {
                                ((TextView) view).setTextColor(i);
                            } else if (view instanceof d20) {
                                for (int i6 = 0; i6 < 2; i6++) {
                                    d20 d20Var = (d20) view;
                                    if (i6 == 0) {
                                        nextTextView = d20Var.getTextView();
                                    } else {
                                        nextTextView = d20Var.getNextTextView();
                                    }
                                    if (nextTextView != null) {
                                        nextTextView.setTextColor(i);
                                    }
                                }
                            }
                        } else if ((536870912 & i3) == 0) {
                            if ((i3 & 4096) != 0) {
                                view.setBackgroundDrawable(aob.L0(false));
                            } else if ((i3 & 268435456) != 0) {
                                view.setBackgroundDrawable(aob.L0(true));
                            }
                        }
                        z = true;
                    }
                    if (strArr != null) {
                        if (i2 < strArr.length && (str = strArr[i2]) != null) {
                            String str2 = cls + "_" + str;
                            HashMap hashMap = this.m;
                            if (hashMap == null || !hashMap.containsKey(str2)) {
                                HashMap hashMap2 = this.l;
                                if (hashMap2 != null) {
                                    try {
                                        field = (Field) hashMap2.get(str2);
                                    } catch (Throwable th) {
                                        cc4.g(th, true);
                                        if (hashMap != null) {
                                            hashMap.put(str2, Boolean.TRUE);
                                        }
                                    }
                                } else {
                                    field = null;
                                }
                                if (field == null && (field = cls.getDeclaredField(str)) != null) {
                                    field.setAccessible(true);
                                    if (hashMap2 != null) {
                                        hashMap2.put(str2, field);
                                    }
                                }
                                if (field != null && (obj = field.get(view)) != null && (z || !(obj instanceof View) || b(i5, (View) obj))) {
                                    if (obj instanceof Integer) {
                                        field.set(view, Integer.valueOf(i));
                                    } else {
                                        a(obj, view, i);
                                    }
                                }
                            }
                        }
                    } else if (view instanceof zc5) {
                        ((zc5) view).updateColors();
                    }
                }
            }
        }
    }

    public final void e(int i, boolean z, boolean z2) {
        Drawable[] compoundDrawables;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2 = this.e;
        if (z2) {
            aob.y1(i2, i, z);
        }
        Paint[] paintArr = this.b;
        int i3 = this.j;
        if (paintArr != null) {
            for (int i4 = 0; i4 < paintArr.length; i4++) {
                if ((i3 & 2) != 0) {
                    Paint paint = paintArr[i4];
                    if (paint instanceof TextPaint) {
                        ((TextPaint) paint).linkColor = i;
                    }
                }
                paintArr[i4].setColor(i);
            }
        }
        Drawable[] drawableArr = this.c;
        if (drawableArr != null) {
            for (Drawable drawable : drawableArr) {
                if (drawable != null) {
                    if (drawable instanceof gd0) {
                        ((gd0) drawable).a(i);
                    } else if (drawable instanceof yt9) {
                        ((yt9) drawable).b(i);
                    } else if (drawable instanceof b29) {
                        String str = this.f;
                        if (str != null) {
                            ((b29) drawable).L(i, str);
                        }
                    } else if (drawable instanceof zm2) {
                        if ((i3 & 32) != 0) {
                            ((zm2) drawable).a.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((zm2) drawable).b.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof rb0) {
                        ((rb0) drawable).g(i);
                    } else if (drawable instanceof AnimatedArrowDrawable) {
                        AnimatedArrowDrawable animatedArrowDrawable = (AnimatedArrowDrawable) drawable;
                        animatedArrowDrawable.a.setColor(i);
                        animatedArrowDrawable.invalidateSelf();
                    } else {
                        drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                    }
                }
            }
        }
        Class[] clsArr = this.d;
        View view = this.a;
        if (view != null && clsArr == null && this.k == null && ((i3 & 262144) == 0 || b(i2, view))) {
            if ((i3 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof m37) {
                    m37 m37Var = (m37) background;
                    m37Var.a.setColor(i);
                    m37Var.b = null;
                } else {
                    view.setBackgroundColor(i);
                }
            }
            if ((i3 & 32) != 0) {
                if ((i3 & 2048) != 0) {
                    if (view instanceof EditTextBoldCursor) {
                        ((EditTextBoldCursor) view).setErrorLineColor(i);
                    }
                } else {
                    Drawable background2 = view.getBackground();
                    if (background2 instanceof zm2) {
                        if ((i3 & 65536) != 0) {
                            background2 = ((zm2) background2).a;
                        } else {
                            background2 = ((zm2) background2).b;
                        }
                    }
                    if (background2 != null) {
                        if (!(background2 instanceof StateListDrawable) && !(background2 instanceof RippleDrawable)) {
                            if (background2 instanceof ShapeDrawable) {
                                ((ShapeDrawable) background2).getPaint().setColor(i);
                            } else {
                                background2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                            }
                        } else {
                            if ((i3 & 65536) != 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            aob.F1(background2, i, z5);
                        }
                    }
                }
            }
        }
        if (view instanceof a) {
            if ((i3 & 64) != 0) {
                ((a) view).H(i, false);
            }
            if ((i3 & 128) != 0) {
                ((a) view).setTitleColor(i);
            }
            if ((i3 & 256) != 0) {
                ((a) view).G(i, false);
            }
            if ((i3 & 1024) != 0) {
                ((a) view).setSubtitleColor(i);
            }
            if ((2097152 & i3) != 0) {
                ((a) view).setActionModeTopColor(i);
            }
            if ((67108864 & i3) != 0) {
                ((a) view).L(i, true);
            }
            if ((134217728 & i3) != 0) {
                ((a) view).L(i, false);
            }
            if ((1073741824 & i3) != 0) {
                a aVar = (a) view;
                if ((i3 & 8) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                aVar.J(i, z4, false);
            }
            if ((Integer.MIN_VALUE & i3) != 0) {
                ((a) view).I(i, false);
            }
        }
        if (view instanceof b34) {
            if ((i3 & 4) != 0) {
                ((b34) view).setTextColor(i);
            } else if ((i3 & 2048) != 0) {
                ((b34) view).setProgressBarColor(i);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i);
        } else if (view instanceof n46) {
            if ((i3 & 2048) != 0) {
                ((n46) view).setProgressColor(i);
            } else {
                ((n46) view).setBackColor(i);
            }
        } else if (view instanceof ww2) {
            ((ww2) view).updateColors();
        } else if ((view instanceof uy9) && (i3 & 2048) != 0) {
            ((uy9) view).setOuterColor(i);
        }
        if ((i3 & 4) != 0 && ((i3 & 262144) == 0 || b(i2, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i);
            } else if (view instanceof ema) {
                ((ema) view).setTextColor(i);
            } else if (view instanceof h82) {
                ((h82) view).setTextColor(i);
            }
        }
        if ((16777216 & i3) != 0 && (view instanceof EditTextBoldCursor)) {
            ((EditTextBoldCursor) view).setCursorColor(i);
        }
        if ((8388608 & i3) != 0) {
            if (view instanceof EditTextBoldCursor) {
                if ((i3 & 2048) != 0) {
                    ((EditTextBoldCursor) view).setHeaderHintColor(i);
                } else {
                    ((EditTextBoldCursor) view).setHintColor(i);
                }
            } else if (view instanceof EditText) {
                ((EditText) view).setHintTextColor(i);
            }
        }
        if ((i3 & 8) != 0 && ((262144 & i3) == 0 || b(i2, view))) {
            if (view instanceof ImageView) {
                if ((131072 & i3) != 0) {
                    Drawable drawable2 = ((ImageView) view).getDrawable();
                    if ((drawable2 instanceof StateListDrawable) || (drawable2 instanceof RippleDrawable)) {
                        if ((65536 & i3) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        aob.F1(drawable2, i, z3);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof de0)) {
                if (view instanceof ema) {
                    ((ema) view).setSideDrawablesColor(i);
                } else if ((view instanceof TextView) && (compoundDrawables = ((TextView) view).getCompoundDrawables()) != null) {
                    for (Drawable drawable3 : compoundDrawables) {
                        if (drawable3 != null) {
                            drawable3.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                }
            }
        }
        if ((view instanceof ScrollView) && (i3 & 32768) != 0) {
            hl.u3((ScrollView) view, i);
        }
        if ((view instanceof fic) && (i3 & 32768) != 0) {
            hl.w3((fic) view, i);
        }
        boolean z6 = view instanceof d79;
        if (z6) {
            d79 d79Var = (d79) view;
            if ((i3 & 4096) != 0) {
                d79Var.setListSelectorColor(Integer.valueOf(i));
            }
            if ((33554432 & i3) != 0) {
                d79Var.y1();
            }
            if ((i3 & 32768) != 0) {
                d79Var.setGlowColor(i);
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i3 & 4096) != 0) {
                view.setBackgroundDrawable(aob.L0(false));
            } else if ((i3 & 268435456) != 0) {
                view.setBackgroundDrawable(aob.L0(true));
            }
        }
        if (clsArr != null) {
            if (z6) {
                d79 d79Var2 = (d79) view;
                d79Var2.getRecycledViewPool().a();
                int hiddenChildCount = d79Var2.getHiddenChildCount();
                for (int i5 = 0; i5 < hiddenChildCount; i5++) {
                    d(i, d79Var2.X(i5));
                }
                int cachedChildCount = d79Var2.getCachedChildCount();
                for (int i6 = 0; i6 < cachedChildCount; i6++) {
                    d(i, d79Var2.Q(i6));
                }
                int attachedScrapChildCount = d79Var2.getAttachedScrapChildCount();
                for (int i7 = 0; i7 < attachedScrapChildCount; i7++) {
                    d(i, d79Var2.P(i7));
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    d(i, viewGroup.getChildAt(i8));
                }
            }
            d(i, view);
        }
        zob zobVar = this.g;
        if (zobVar != null) {
            zobVar.b();
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public apb(View view, int i, Class[] clsArr, Paint paint, Drawable[] drawableArr, zob zobVar, int i2) {
        this.i = new boolean[1];
        this.e = i2;
        if (paint != null) {
            this.b = new Paint[]{paint};
        }
        this.c = drawableArr;
        this.a = view;
        this.j = i;
        this.d = clsArr;
        this.g = zobVar;
        if (view instanceof iu3) {
            this.a = ((iu3) view).getEditText();
        }
    }

    public apb(e29 e29Var, b29[] b29VarArr, String str, int i) {
        this.i = new boolean[1];
        this.e = i;
        this.f = str;
        this.c = b29VarArr;
        this.a = e29Var;
        this.j = 0;
        this.d = null;
    }

    public apb(int i, View view) {
        this.i = new boolean[1];
        this.e = i;
        this.b = null;
        this.c = null;
        this.a = view;
        this.j = 262148;
        this.d = null;
        this.g = null;
        if (view instanceof iu3) {
            this.a = ((iu3) view).getEditText();
        }
    }
}
