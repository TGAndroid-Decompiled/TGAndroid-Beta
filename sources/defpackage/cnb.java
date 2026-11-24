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
public final class cnb {
    public final View a;
    public final Paint[] b;
    public final Drawable[] c;
    public final Class[] d;
    public final int e;
    public final String f;
    public bnb g;
    public int h;
    public final boolean[] i;
    public final int j;
    public final String[] k;
    public final HashMap l;
    public final HashMap m;
    public ylb n;

    public cnb(View view, int i, Class[] clsArr, String[] strArr, Drawable[] drawableArr, bnb bnbVar, int i2) {
        this.i = new boolean[1];
        this.e = i2;
        this.b = null;
        this.c = drawableArr;
        this.a = view;
        this.j = i;
        this.d = clsArr;
        this.k = strArr;
        this.g = bnbVar;
        this.l = new HashMap();
        this.m = new HashMap();
        if (view instanceof cv3) {
            this.a = ((cv3) view).getEditText();
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
        if (str != null && (obj instanceof s09)) {
            ((s09) obj).h(i, str);
        }
        int i2 = this.j;
        if ((131072 & i2) != 0 && z) {
            obj = ((View) obj).getBackground();
        }
        Drawable drawable4 = null;
        if ((i2 & 1) != 0 && (obj instanceof View)) {
            View view2 = (View) obj;
            Drawable background = view2.getBackground();
            if (background instanceof f37) {
                f37 f37Var = (f37) background;
                f37Var.a.setColor(i);
                f37Var.b = null;
                return;
            }
            view2.setBackgroundColor(i);
        } else if (obj instanceof qu3) {
            if ((8388608 & i2) != 0) {
                qu3 qu3Var = (qu3) obj;
                qu3Var.setHintColor(i);
                qu3Var.setHintTextColor(i);
            } else if ((i2 & 16777216) != 0) {
                ((qu3) obj).setCursorColor(i);
            } else {
                ((qu3) obj).setTextColor(i);
            }
        } else if (obj instanceof lka) {
            if ((i2 & 2) != 0) {
                ((lka) obj).setLinkTextColor(i);
            } else {
                ((lka) obj).setTextColor(i);
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
                        z5c[] z5cVarArr = (z5c[]) spannedString.getSpans(0, spannedString.length(), z5c.class);
                        if (z5cVarArr != null && z5cVarArr.length > 0) {
                            for (z5c z5cVar : z5cVarArr) {
                                z5cVar.b = i;
                            }
                        }
                    }
                } else {
                    textView.setTextColor(i);
                }
            } else if (obj instanceof ImageView) {
                ImageView imageView = (ImageView) obj;
                Drawable drawable6 = imageView.getDrawable();
                if (drawable6 instanceof sn2) {
                    if ((i2 & 32) != 0) {
                        drawable3 = ((sn2) drawable6).a;
                    } else {
                        drawable3 = ((sn2) drawable6).b;
                    }
                    if (drawable3 != null) {
                        drawable3.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        return;
                    }
                    return;
                }
                imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
            } else if (obj instanceof bf0) {
                bf0 bf0Var = (bf0) obj;
                if (bf0Var.getImageReceiver() != null) {
                    drawable4 = bf0Var.getImageReceiver().n0;
                }
                if (drawable4 instanceof sn2) {
                    if ((i2 & 32) != 0) {
                        drawable2 = ((sn2) drawable4).a;
                    } else {
                        drawable2 = ((sn2) drawable4).b;
                    }
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                    }
                } else if (drawable4 != null) {
                    drawable4.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                }
            } else if (obj instanceof Drawable) {
                if (obj instanceof o26) {
                    if ((i2 & 32) != 0) {
                        o26.k.setColor(i);
                    } else {
                        ((o26) obj).h.setColor(i);
                    }
                } else if (obj instanceof sn2) {
                    if ((i2 & 32) != 0) {
                        drawable = ((sn2) obj).a;
                    } else {
                        drawable = ((sn2) obj).b;
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
                    cmb.F1(drawable7, i, z2);
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
                } else if (obj instanceof k46) {
                    if ((i2 & 2048) != 0) {
                        ((k46) obj).setProgressColor(i);
                    } else {
                        ((k46) obj).setBackColor(i);
                    }
                } else if (obj instanceof RadialProgressView) {
                    ((RadialProgressView) obj).setProgressColor(i);
                } else if (obj instanceof Paint) {
                    ((Paint) obj).setColor(i);
                    view.invalidate();
                } else if (obj instanceof dx9) {
                    if ((i2 & 2048) != 0) {
                        ((dx9) obj).setOuterColor(i);
                    } else {
                        ((dx9) obj).setInnerColor(i);
                    }
                } else if (obj instanceof c30) {
                    if ((33554432 & i2) != 0) {
                        for (int i3 = 0; i3 < 2; i3++) {
                            c30 c30Var = (c30) obj;
                            if (i3 == 0) {
                                nextTextView2 = c30Var.getTextView();
                            } else {
                                nextTextView2 = c30Var.getNextTextView();
                            }
                            if (nextTextView2 != null) {
                                CharSequence text2 = nextTextView2.getText();
                                if (text2 instanceof SpannedString) {
                                    SpannedString spannedString2 = (SpannedString) text2;
                                    z5c[] z5cVarArr2 = (z5c[]) spannedString2.getSpans(0, spannedString2.length(), z5c.class);
                                    if (z5cVarArr2 != null && z5cVarArr2.length > 0) {
                                        for (z5c z5cVar2 : z5cVarArr2) {
                                            z5cVar2.b = i;
                                        }
                                    }
                                }
                            }
                        }
                    } else if ((i2 & 4) != 0) {
                        if ((i2 & 262144) == 0 || b(this.e, (View) obj)) {
                            for (int i4 = 0; i4 < 2; i4++) {
                                c30 c30Var2 = (c30) obj;
                                if (i4 == 0) {
                                    nextTextView = c30Var2.getTextView();
                                } else {
                                    nextTextView = c30Var2.getNextTextView();
                                }
                                if (nextTextView != null) {
                                    nextTextView.setTextColor(i);
                                    CharSequence text3 = nextTextView.getText();
                                    if (text3 instanceof SpannedString) {
                                        SpannedString spannedString3 = (SpannedString) text3;
                                        z5c[] z5cVarArr3 = (z5c[]) spannedString3.getSpans(0, spannedString3.length(), z5c.class);
                                        if (z5cVarArr3 != null && z5cVarArr3.length > 0) {
                                            for (z5c z5cVar3 : z5cVarArr3) {
                                                z5cVar3.b = i;
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
        ylb ylbVar = this.n;
        int i = this.e;
        if (ylbVar != null) {
            num = Integer.valueOf(ylbVar.h(i));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return cmb.w0(null, i, false);
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
                                    if (background instanceof sn2) {
                                        Drawable drawable = ((sn2) background).a;
                                        if (drawable instanceof ColorDrawable) {
                                            ((ColorDrawable) drawable).setColor(i);
                                        }
                                    }
                                } else {
                                    if (background instanceof sn2) {
                                        background = ((sn2) background).b;
                                    } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                        if ((i3 & 65536) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        cmb.F1(background, i, z2);
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
                            } else if (view instanceof c30) {
                                for (int i6 = 0; i6 < 2; i6++) {
                                    c30 c30Var = (c30) view;
                                    if (i6 == 0) {
                                        nextTextView = c30Var.getTextView();
                                    } else {
                                        nextTextView = c30Var.getNextTextView();
                                    }
                                    if (nextTextView != null) {
                                        nextTextView.setTextColor(i);
                                    }
                                }
                            }
                        } else if ((536870912 & i3) == 0) {
                            if ((i3 & 4096) != 0) {
                                view.setBackgroundDrawable(cmb.L0(false));
                            } else if ((i3 & 268435456) != 0) {
                                view.setBackgroundDrawable(cmb.L0(true));
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
                                        fc4.g(th, true);
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
                    } else if (view instanceof wc5) {
                        ((wc5) view).updateColors();
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
            cmb.y1(i2, i, z);
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
                    if (drawable instanceof ee0) {
                        ((ee0) drawable).a(i);
                    } else if (drawable instanceof hs9) {
                        ((hs9) drawable).b(i);
                    } else if (drawable instanceof p09) {
                        String str = this.f;
                        if (str != null) {
                            ((p09) drawable).L(i, str);
                        }
                    } else if (drawable instanceof sn2) {
                        if ((i3 & 32) != 0) {
                            ((sn2) drawable).a.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((sn2) drawable).b.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof pc0) {
                        ((pc0) drawable).g(i);
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
                if (background instanceof f37) {
                    f37 f37Var = (f37) background;
                    f37Var.a.setColor(i);
                    f37Var.b = null;
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
                    if (background2 instanceof sn2) {
                        if ((i3 & 65536) != 0) {
                            background2 = ((sn2) background2).a;
                        } else {
                            background2 = ((sn2) background2).b;
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
                            cmb.F1(background2, i, z5);
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
        if (view instanceof r34) {
            if ((i3 & 4) != 0) {
                ((r34) view).setTextColor(i);
            } else if ((i3 & 2048) != 0) {
                ((r34) view).setProgressBarColor(i);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i);
        } else if (view instanceof k46) {
            if ((i3 & 2048) != 0) {
                ((k46) view).setProgressColor(i);
            } else {
                ((k46) view).setBackColor(i);
            }
        } else if (view instanceof mx2) {
            ((mx2) view).updateColors();
        } else if ((view instanceof dx9) && (i3 & 2048) != 0) {
            ((dx9) view).setOuterColor(i);
        }
        if ((i3 & 4) != 0 && ((i3 & 262144) == 0 || b(i2, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i);
            } else if (view instanceof lka) {
                ((lka) view).setTextColor(i);
            } else if (view instanceof b92) {
                ((b92) view).setTextColor(i);
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
                        cmb.F1(drawable2, i, z3);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof bf0)) {
                if (view instanceof lka) {
                    ((lka) view).setSideDrawablesColor(i);
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
            gm.u3((ScrollView) view, i);
        }
        if ((view instanceof ggc) && (i3 & 32768) != 0) {
            gm.w3((ggc) view, i);
        }
        boolean z6 = view instanceof r59;
        if (z6) {
            r59 r59Var = (r59) view;
            if ((i3 & 4096) != 0) {
                r59Var.setListSelectorColor(Integer.valueOf(i));
            }
            if ((33554432 & i3) != 0) {
                r59Var.x1();
            }
            if ((i3 & 32768) != 0) {
                r59Var.setGlowColor(i);
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i3 & 4096) != 0) {
                view.setBackgroundDrawable(cmb.L0(false));
            } else if ((i3 & 268435456) != 0) {
                view.setBackgroundDrawable(cmb.L0(true));
            }
        }
        if (clsArr != null) {
            if (z6) {
                r59 r59Var2 = (r59) view;
                r59Var2.getRecycledViewPool().a();
                int hiddenChildCount = r59Var2.getHiddenChildCount();
                for (int i5 = 0; i5 < hiddenChildCount; i5++) {
                    d(i, r59Var2.W(i5));
                }
                int cachedChildCount = r59Var2.getCachedChildCount();
                for (int i6 = 0; i6 < cachedChildCount; i6++) {
                    d(i, r59Var2.P(i6));
                }
                int attachedScrapChildCount = r59Var2.getAttachedScrapChildCount();
                for (int i7 = 0; i7 < attachedScrapChildCount; i7++) {
                    d(i, r59Var2.O(i7));
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
        bnb bnbVar = this.g;
        if (bnbVar != null) {
            bnbVar.b();
        }
        if (view != null) {
            view.invalidate();
        }
    }

    public cnb(View view, int i, Class[] clsArr, Paint paint, Drawable[] drawableArr, bnb bnbVar, int i2) {
        this.i = new boolean[1];
        this.e = i2;
        if (paint != null) {
            this.b = new Paint[]{paint};
        }
        this.c = drawableArr;
        this.a = view;
        this.j = i;
        this.d = clsArr;
        this.g = bnbVar;
        if (view instanceof cv3) {
            this.a = ((cv3) view).getEditText();
        }
    }

    public cnb(s09 s09Var, p09[] p09VarArr, String str, int i) {
        this.i = new boolean[1];
        this.e = i;
        this.f = str;
        this.c = p09VarArr;
        this.a = s09Var;
        this.j = 0;
        this.d = null;
    }

    public cnb(int i, View view) {
        this.i = new boolean[1];
        this.e = i;
        this.b = null;
        this.c = null;
        this.a = view;
        this.j = 262148;
        this.d = null;
        this.g = null;
        if (view instanceof cv3) {
            this.a = ((cv3) view).getEditText();
        }
    }
}
