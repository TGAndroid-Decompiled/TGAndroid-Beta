package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.security.KeyStoreException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import org.telegram.messenger.a;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public class by7 extends FrameLayout implements jm7 {
    public static final int[] j0 = {2131296594, 2131296595, 2131296596, 2131296597, 2131296598, 2131296599, 2131296600, 2131296601, 2131296602, 2131296603, 2131296604, 2131296606};
    public final ImageView E;
    public final ImageView F;
    public final View G;
    public int H;
    public final jz4 I;
    public final km0 J;
    public Bitmap K;
    public Canvas L;
    public int M;
    public final s09 N;
    public final Rect O;
    public zx7 P;
    public boolean Q;
    public AnimatorSet R;
    public AnimatorSet S;
    public ValueAnimator T;
    public zna U;
    public final LinkedList V;
    public final LinkedList W;
    public Drawable a;
    public final ArrayList a0;
    public final FrameLayout b;
    public float b0;
    public final TextView c;
    public int c0;
    public final FrameLayout d;
    public final ei7 d0;
    public final a6 e;
    public int e0;
    public final ArrayList f;
    public mx5 f0;
    public boolean g0;
    public final FrameLayout h;
    public ValueAnimator h0;
    public final int[] i0;
    public final yx7 n;
    public final EditTextBoldCursor r;
    public final wx7 s;
    public final su w;
    public final TextView x;
    public final TextView y;

    public by7(Context context) {
        super(context);
        int i;
        String M0 = jb6.M0(2131743537, null);
        int i2 = 0;
        this.H = 0;
        jz4 jz4Var = new jz4();
        this.I = jz4Var;
        km0 km0Var = new km0(jz4Var, jz4Var, jz4Var);
        this.J = km0Var;
        g79 g79Var = new g79(0, false);
        this.O = new Rect();
        this.V = new LinkedList();
        this.W = new LinkedList();
        this.a0 = new ArrayList();
        this.c0 = -12;
        this.d0 = new ei7(this, (byte) 5);
        this.g0 = true;
        this.i0 = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        su suVar = new su(this, context);
        this.w = suVar;
        suVar.setWillNotDraw(false);
        addView(suVar, qoe.c(-1.0f, -1));
        km0Var.h = new zgc(suVar);
        km0Var.i = suVar;
        km0Var.g = g79Var;
        ?? imageView = new ImageView(context);
        this.N = imageView;
        imageView.f(2131624112, 58, 58, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, qoe.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        suVar.addView(frameLayout, qoe.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(gm.o());
        textView.setAlpha(0.0f);
        TextView l = wi8.l(frameLayout, textView, qoe.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.y = l;
        l.setTextColor(-1);
        l.setTextSize(1, 15.0f);
        l.setGravity(1);
        l.setVisibility(4);
        suVar.addView(l, qoe.e(-2, -2, 17));
        wx7 wx7Var = new wx7(this, context);
        this.s = wx7Var;
        frameLayout.addView(wx7Var, qoe.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.r = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 36.0f);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setGravity(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setCursorColor(-1);
        editTextBoldCursor.setCursorSize(gm.L(32.0f));
        frameLayout.addView(editTextBoldCursor, qoe.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 18));
        editTextBoldCursor.addTextChangedListener(new og6(this, (byte) 5));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new mx7((byte) 1));
        ImageView imageView2 = new ImageView(context);
        this.E = imageView2;
        imageView2.setImageResource(2131232529);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundResource(2131230882);
        frameLayout.addView(imageView2, qoe.d(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        imageView2.setContentDescription(jb6.M0(2131751291, null));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final by7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                LinkedList linkedList;
                by7 by7Var;
                LinkedList linkedList2;
                byte b;
                byte b2;
                LinkedList linkedList3;
                int i3;
                int i4;
                by7 by7Var2;
                boolean z;
                byte b3;
                byte b4 = r2;
                by7 by7Var3 = this.b;
                switch (b4) {
                    case 0:
                        by7Var3.n(false);
                        return;
                    case 1:
                        by7Var3.b();
                        return;
                    default:
                        LinkedList linkedList4 = by7Var3.W;
                        LinkedList linkedList5 = by7Var3.V;
                        wx7 wx7Var2 = by7Var3.s;
                        if (by7Var3.g0 && !by7Var3.Q) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            int i5 = 4;
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("0");
                                    b2 = b;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("1");
                                    b2 = b;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("2");
                                    b2 = b;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("3");
                                    b2 = b;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("4");
                                    b2 = b;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("5");
                                    b2 = b;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("6");
                                    b2 = b;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("7");
                                    b2 = b;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("8");
                                    b2 = b;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("9");
                                    b2 = b;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    by7Var.b();
                                    b2 = b;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) wx7Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    ArrayList arrayList2 = (ArrayList) wx7Var2.b;
                                    b = 0;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb = (StringBuilder) wx7Var2.d;
                                    if (sb.length() == 0) {
                                        b2 = 0;
                                        linkedList = linkedList4;
                                        by7Var = by7Var3;
                                        linkedList2 = linkedList5;
                                        break;
                                    } else {
                                        try {
                                            wx7Var2.performHapticFeedback(3);
                                        } catch (Exception e) {
                                            fc4.g(e, true);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int i6 = 1;
                                        int length = sb.length() - 1;
                                        if (length != 0) {
                                            sb.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i7 = length;
                                        while (i7 < i5) {
                                            TextView textView2 = (TextView) arrayList2.get(i7);
                                            by7 by7Var4 = by7Var3;
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i3 = i6;
                                                float[] fArr = new float[i3];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, fArr));
                                                float[] fArr2 = new float[i3];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, fArr2));
                                                float[] fArr3 = new float[i3];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, fArr3));
                                                float[] fArr4 = new float[i3];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property, fArr4));
                                                float[] fArr5 = new float[i3];
                                                fArr5[0] = wx7Var2.c(i7);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, fArr5));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i3 = i6;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i7);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr6 = new float[i3];
                                                fArr6[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property4, fArr6));
                                                float[] fArr7 = new float[i3];
                                                fArr7[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, fArr7));
                                                float[] fArr8 = new float[i3];
                                                fArr8[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, fArr8));
                                                float[] fArr9 = new float[i3];
                                                fArr9[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property, fArr9));
                                                i4 = i7;
                                                float[] fArr10 = new float[i3];
                                                fArr10[0] = wx7Var2.c(i7);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                            } else {
                                                i4 = i7;
                                            }
                                            i7 = i4 + 1;
                                            linkedList5 = linkedList3;
                                            by7Var3 = by7Var4;
                                            i5 = 4;
                                            i6 = 1;
                                        }
                                        by7Var = by7Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb.deleteCharAt(length);
                                        }
                                        for (int i8 = 0; i8 < length; i8++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i8), property5, wx7Var2.c(i8)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i8), property5, wx7Var2.c(i8)));
                                        }
                                        eg0 eg0Var = (eg0) wx7Var2.f;
                                        if (eg0Var != null) {
                                            gm.r(eg0Var);
                                            wx7Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) wx7Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        wx7Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) wx7Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) wx7Var2.e).addListener(new vx7(wx7Var2, (byte) 1));
                                        ((AnimatorSet) wx7Var2.e).start();
                                        ((by7) wx7Var2.h).e();
                                        b2 = 1;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    b2 = b;
                                    break;
                            }
                            if (intValue == 11) {
                                by7Var2 = by7Var;
                            } else {
                                by7Var2 = by7Var;
                                Drawable drawable = by7Var2.a;
                                if (drawable instanceof ah7) {
                                    ah7 ah7Var = (ah7) drawable;
                                    ah7Var.C = null;
                                    ah7Var.x();
                                    float f = ah7Var.h;
                                    if (intValue == 10) {
                                        if (b2 != 0) {
                                            ah7Var.w();
                                            b3 = 1;
                                        } else {
                                            b3 = b;
                                        }
                                        z = b;
                                    } else {
                                        z = true;
                                        ah7Var.v(true);
                                        b3 = 1;
                                    }
                                    if (b3 != 0) {
                                        if (f >= 1.0f) {
                                            by7Var2.a(ah7Var);
                                        } else {
                                            yl6 yl6Var = new yl6(by7Var2, z, ah7Var, (byte) 7);
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(yl6Var);
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i9 = b; i9 < linkedList6.size(); i9++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i9);
                                                Boolean bool = (Boolean) linkedList7.get(i9);
                                                if (bool != null && bool.booleanValue() != z) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf(i9));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            int i10 = b;
                                            while (i10 < size) {
                                                Object obj = arrayList4.get(i10);
                                                i10++;
                                                linkedList6.remove((Runnable) obj);
                                            }
                                            Collections.sort(arrayList5, new qx7(b));
                                            int size2 = arrayList5.size();
                                            int i11 = 0;
                                            while (i11 < size2) {
                                                Object obj2 = arrayList5.get(i11);
                                                i11++;
                                                linkedList7.remove(((Integer) obj2).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) wx7Var2.d).length() == 4) {
                                by7Var2.n(false);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.F = imageView3;
        imageView3.setImageResource(2131231193);
        imageView3.setScaleType(scaleType);
        imageView3.setBackgroundResource(2131230882);
        frameLayout.addView(imageView3, qoe.d(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        imageView3.setContentDescription(jb6.M0(2131754881, null));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final by7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                LinkedList linkedList;
                by7 by7Var;
                LinkedList linkedList2;
                byte b;
                byte b2;
                LinkedList linkedList3;
                int i3;
                int i4;
                by7 by7Var2;
                boolean z;
                byte b3;
                byte b4 = r2;
                by7 by7Var3 = this.b;
                switch (b4) {
                    case 0:
                        by7Var3.n(false);
                        return;
                    case 1:
                        by7Var3.b();
                        return;
                    default:
                        LinkedList linkedList4 = by7Var3.W;
                        LinkedList linkedList5 = by7Var3.V;
                        wx7 wx7Var2 = by7Var3.s;
                        if (by7Var3.g0 && !by7Var3.Q) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            int i5 = 4;
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("0");
                                    b2 = b;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("1");
                                    b2 = b;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("2");
                                    b2 = b;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("3");
                                    b2 = b;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("4");
                                    b2 = b;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("5");
                                    b2 = b;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("6");
                                    b2 = b;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("7");
                                    b2 = b;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("8");
                                    b2 = b;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    wx7Var2.a("9");
                                    b2 = b;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    by7Var.b();
                                    b2 = b;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) wx7Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    ArrayList arrayList2 = (ArrayList) wx7Var2.b;
                                    b = 0;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb = (StringBuilder) wx7Var2.d;
                                    if (sb.length() == 0) {
                                        b2 = 0;
                                        linkedList = linkedList4;
                                        by7Var = by7Var3;
                                        linkedList2 = linkedList5;
                                        break;
                                    } else {
                                        try {
                                            wx7Var2.performHapticFeedback(3);
                                        } catch (Exception e) {
                                            fc4.g(e, true);
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        int i6 = 1;
                                        int length = sb.length() - 1;
                                        if (length != 0) {
                                            sb.deleteCharAt(length);
                                        }
                                        linkedList = linkedList4;
                                        int i7 = length;
                                        while (i7 < i5) {
                                            TextView textView2 = (TextView) arrayList2.get(i7);
                                            by7 by7Var4 = by7Var3;
                                            if (textView2.getAlpha() != 0.0f) {
                                                linkedList3 = linkedList5;
                                                i3 = i6;
                                                float[] fArr = new float[i3];
                                                fArr[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property4, fArr));
                                                float[] fArr2 = new float[i3];
                                                fArr2[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property3, fArr2));
                                                float[] fArr3 = new float[i3];
                                                fArr3[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property2, fArr3));
                                                float[] fArr4 = new float[i3];
                                                fArr4[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property, fArr4));
                                                float[] fArr5 = new float[i3];
                                                fArr5[0] = wx7Var2.c(i7);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView2, property5, fArr5));
                                            } else {
                                                linkedList3 = linkedList5;
                                                i3 = i6;
                                            }
                                            TextView textView3 = (TextView) arrayList.get(i7);
                                            if (textView3.getAlpha() != 0.0f) {
                                                float[] fArr6 = new float[i3];
                                                fArr6[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property4, fArr6));
                                                float[] fArr7 = new float[i3];
                                                fArr7[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, fArr7));
                                                float[] fArr8 = new float[i3];
                                                fArr8[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, fArr8));
                                                float[] fArr9 = new float[i3];
                                                fArr9[0] = 0.0f;
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property, fArr9));
                                                i4 = i7;
                                                float[] fArr10 = new float[i3];
                                                fArr10[0] = wx7Var2.c(i7);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                            } else {
                                                i4 = i7;
                                            }
                                            i7 = i4 + 1;
                                            linkedList5 = linkedList3;
                                            by7Var3 = by7Var4;
                                            i5 = 4;
                                            i6 = 1;
                                        }
                                        by7Var = by7Var3;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb.deleteCharAt(length);
                                        }
                                        for (int i8 = 0; i8 < length; i8++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i8), property5, wx7Var2.c(i8)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i8), property5, wx7Var2.c(i8)));
                                        }
                                        eg0 eg0Var = (eg0) wx7Var2.f;
                                        if (eg0Var != null) {
                                            gm.r(eg0Var);
                                            wx7Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) wx7Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        wx7Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) wx7Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) wx7Var2.e).addListener(new vx7(wx7Var2, (byte) 1));
                                        ((AnimatorSet) wx7Var2.e).start();
                                        ((by7) wx7Var2.h).e();
                                        b2 = 1;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    by7Var = by7Var3;
                                    linkedList2 = linkedList5;
                                    b = 0;
                                    b2 = b;
                                    break;
                            }
                            if (intValue == 11) {
                                by7Var2 = by7Var;
                            } else {
                                by7Var2 = by7Var;
                                Drawable drawable = by7Var2.a;
                                if (drawable instanceof ah7) {
                                    ah7 ah7Var = (ah7) drawable;
                                    ah7Var.C = null;
                                    ah7Var.x();
                                    float f = ah7Var.h;
                                    if (intValue == 10) {
                                        if (b2 != 0) {
                                            ah7Var.w();
                                            b3 = 1;
                                        } else {
                                            b3 = b;
                                        }
                                        z = b;
                                    } else {
                                        z = true;
                                        ah7Var.v(true);
                                        b3 = 1;
                                    }
                                    if (b3 != 0) {
                                        if (f >= 1.0f) {
                                            by7Var2.a(ah7Var);
                                        } else {
                                            yl6 yl6Var = new yl6(by7Var2, z, ah7Var, (byte) 7);
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(yl6Var);
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i9 = b; i9 < linkedList6.size(); i9++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i9);
                                                Boolean bool = (Boolean) linkedList7.get(i9);
                                                if (bool != null && bool.booleanValue() != z) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf(i9));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            int i10 = b;
                                            while (i10 < size) {
                                                Object obj = arrayList4.get(i10);
                                                i10++;
                                                linkedList6.remove((Runnable) obj);
                                            }
                                            Collections.sort(arrayList5, new qx7(b));
                                            int size2 = arrayList5.size();
                                            int i11 = 0;
                                            while (i11 < size2) {
                                                Object obj2 = arrayList5.get(i11);
                                                i11++;
                                                linkedList7.remove(((Integer) obj2).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) wx7Var2.d).length() == 4) {
                                by7Var2.n(false);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        View view = new View(context);
        this.G = view;
        view.setBackgroundColor(822083583);
        frameLayout.addView(view, qoe.a(-1.0f, 1.0f / gm.p, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        suVar.addView(frameLayout2, qoe.e(-1, -1, 51));
        a6 a6Var = new a6(context, (byte) 21);
        this.e = a6Var;
        a6Var.setClipChildren(false);
        frameLayout2.addView(a6Var, qoe.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b = frameLayout3;
        a6Var.addView(frameLayout3, qoe.e(-2, -2, 49));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(gm.o());
        textView2.setTextColor(-1);
        textView2.setText(M0);
        TextView l2 = wi8.l(frameLayout3, textView2, qoe.d(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.c = l2;
        l2.setTextSize(1, 14.0f);
        l2.setTextColor(-1);
        l2.setText((CharSequence) null);
        frameLayout3.addView(l2, qoe.d(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.f = new ArrayList(10);
        while (true) {
            if (i2 >= 12) {
                break;
            }
            yx7 yx7Var = new yx7(context);
            rve.b(yx7Var, 0.15f, 1.5f);
            yx7Var.setTag(Integer.valueOf(i2));
            int[] iArr = j0;
            if (i2 == 11) {
                yx7Var.setBackground(f(yx7Var));
                int L = gm.L(30.0f);
                yx7Var.setForeground(cmb.i0(L, L, L, L, 0, 654311423, 654311423));
                yx7Var.setImage(2131231104);
                yx7Var.setOnLongClickListener(new au(this, (byte) 7));
                yx7Var.setContentDescription(jb6.M0(2131754920, null));
                yx7Var.setNextFocusForwardId(2131296594);
                yx7Var.setAccessibilityTraversalBefore(2131296594);
            } else if (i2 == 10) {
                this.n = yx7Var;
                yx7Var.setBackground(f(yx7Var));
                int L2 = gm.L(30.0f);
                yx7Var.setForeground(cmb.i0(L2, L2, L2, L2, 0, 654311423, 654311423));
                yx7Var.setContentDescription(jb6.M0(2131754881, null));
                yx7Var.setImage(2131231193);
                yx7Var.setNextFocusForwardId(2131296595);
                yx7Var.setAccessibilityTraversalBefore(2131296595);
            } else {
                yx7Var.setBackground(f(yx7Var));
                int L3 = gm.L(30.0f);
                yx7Var.setForeground(cmb.i0(L3, L3, L3, L3, 0, 654311423, 654311423));
                yx7Var.setContentDescription(i2 + "");
                yx7Var.setNum(i2);
                if (i2 == 0) {
                    yx7Var.setNextFocusForwardId(2131296604);
                    yx7Var.setAccessibilityTraversalBefore(2131296604);
                } else if (i2 == 9) {
                    if (g()) {
                        yx7Var.setNextFocusForwardId(2131296606);
                        yx7Var.setAccessibilityTraversalBefore(2131296606);
                    } else {
                        yx7Var.setNextFocusForwardId(2131296594);
                        yx7Var.setAccessibilityTraversalBefore(2131296594);
                    }
                } else {
                    int i3 = iArr[i2 + 1];
                    yx7Var.setNextFocusForwardId(i3);
                    yx7Var.setAccessibilityTraversalBefore(i3);
                }
            }
            yx7Var.setId(iArr[i2]);
            yx7Var.setOnClickListener(new View.OnClickListener(this) {
                public final by7 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    LinkedList linkedList;
                    by7 by7Var;
                    LinkedList linkedList2;
                    byte b;
                    byte b2;
                    LinkedList linkedList3;
                    int i32;
                    int i4;
                    by7 by7Var2;
                    boolean z;
                    byte b3;
                    byte b4 = r2;
                    by7 by7Var3 = this.b;
                    switch (b4) {
                        case 0:
                            by7Var3.n(false);
                            return;
                        case 1:
                            by7Var3.b();
                            return;
                        default:
                            LinkedList linkedList4 = by7Var3.W;
                            LinkedList linkedList5 = by7Var3.V;
                            wx7 wx7Var2 = by7Var3.s;
                            if (by7Var3.g0 && !by7Var3.Q) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                int i5 = 4;
                                switch (intValue) {
                                    case 0:
                                        linkedList = linkedList4;
                                        by7Var = by7Var3;
                                        linkedList2 = linkedList5;
                                        b = 0;
                                        wx7Var2.a("0");
                                        b2 = b;
                                        break;
                                    case 1:
                                        linkedList = linkedList4;
                                        by7Var = by7Var3;
                                        linkedList2 = linkedList5;
                                        b = 0;
                                        wx7Var2.a("1");
                                        b2 = b;
                                        break;
                                    case 2:
                                        linkedList = linkedList4;
                                        by7Var = by7Var3;
                                        linkedList2 = linkedList5;
                                        b = 0;
                                        wx7Var2.a("2");
                                        b2 = b;
                                        break;
                                    case 3:
                                        linkedList = linkedList4;
                                        by7Var = by7Var3;
                                        linkedList2 = linkedList5;
                                        b = 0;
                                        wx7Var2.a("3");
                                        b2 = b;
                                        break;
                                    case 4:
                                        linkedList = linkedList4;
                                        by7Var = by7Var3;
                                        linkedList2 = linkedList5;
                                        b = 0;
                                        wx7Var2.a("4");
                                        b2 = b;
                                        break;
                                    case 5:
                                        linkedList = linkedList4;
                                        by7Var = by7Var3;
                                        linkedList2 = linkedList5;
                                        b = 0;
                                        wx7Var2.a("5");
                                        b2 = b;
                                        break;
                                    case 6:
                                        linkedList = linkedList4;
                                        by7Var = by7Var3;
                                        linkedList2 = linkedList5;
                                        b = 0;
                                        wx7Var2.a("6");
                                        b2 = b;
                                        break;
                                    case 7:
                                        linkedList = linkedList4;
                                        by7Var = by7Var3;
                                        linkedList2 = linkedList5;
                                        b = 0;
                                        wx7Var2.a("7");
                                        b2 = b;
                                        break;
                                    case 8:
                                        linkedList = linkedList4;
                                        by7Var = by7Var3;
                                        linkedList2 = linkedList5;
                                        b = 0;
                                        wx7Var2.a("8");
                                        b2 = b;
                                        break;
                                    case 9:
                                        linkedList = linkedList4;
                                        by7Var = by7Var3;
                                        linkedList2 = linkedList5;
                                        b = 0;
                                        wx7Var2.a("9");
                                        b2 = b;
                                        break;
                                    case 10:
                                        linkedList = linkedList4;
                                        by7Var = by7Var3;
                                        linkedList2 = linkedList5;
                                        b = 0;
                                        by7Var.b();
                                        b2 = b;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) wx7Var2.c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        ArrayList arrayList2 = (ArrayList) wx7Var2.b;
                                        b = 0;
                                        Property property5 = View.TRANSLATION_X;
                                        StringBuilder sb = (StringBuilder) wx7Var2.d;
                                        if (sb.length() == 0) {
                                            b2 = 0;
                                            linkedList = linkedList4;
                                            by7Var = by7Var3;
                                            linkedList2 = linkedList5;
                                            break;
                                        } else {
                                            try {
                                                wx7Var2.performHapticFeedback(3);
                                            } catch (Exception e) {
                                                fc4.g(e, true);
                                            }
                                            ArrayList arrayList3 = new ArrayList();
                                            int i6 = 1;
                                            int length = sb.length() - 1;
                                            if (length != 0) {
                                                sb.deleteCharAt(length);
                                            }
                                            linkedList = linkedList4;
                                            int i7 = length;
                                            while (i7 < i5) {
                                                TextView textView22 = (TextView) arrayList2.get(i7);
                                                by7 by7Var4 = by7Var3;
                                                if (textView22.getAlpha() != 0.0f) {
                                                    linkedList3 = linkedList5;
                                                    i32 = i6;
                                                    float[] fArr = new float[i32];
                                                    fArr[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, property4, fArr));
                                                    float[] fArr2 = new float[i32];
                                                    fArr2[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, property3, fArr2));
                                                    float[] fArr3 = new float[i32];
                                                    fArr3[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, property2, fArr3));
                                                    float[] fArr4 = new float[i32];
                                                    fArr4[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, property, fArr4));
                                                    float[] fArr5 = new float[i32];
                                                    fArr5[0] = wx7Var2.c(i7);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView22, property5, fArr5));
                                                } else {
                                                    linkedList3 = linkedList5;
                                                    i32 = i6;
                                                }
                                                TextView textView3 = (TextView) arrayList.get(i7);
                                                if (textView3.getAlpha() != 0.0f) {
                                                    float[] fArr6 = new float[i32];
                                                    fArr6[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property4, fArr6));
                                                    float[] fArr7 = new float[i32];
                                                    fArr7[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property3, fArr7));
                                                    float[] fArr8 = new float[i32];
                                                    fArr8[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property2, fArr8));
                                                    float[] fArr9 = new float[i32];
                                                    fArr9[0] = 0.0f;
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property, fArr9));
                                                    i4 = i7;
                                                    float[] fArr10 = new float[i32];
                                                    fArr10[0] = wx7Var2.c(i7);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                                } else {
                                                    i4 = i7;
                                                }
                                                i7 = i4 + 1;
                                                linkedList5 = linkedList3;
                                                by7Var3 = by7Var4;
                                                i5 = 4;
                                                i6 = 1;
                                            }
                                            by7Var = by7Var3;
                                            linkedList2 = linkedList5;
                                            if (length == 0) {
                                                sb.deleteCharAt(length);
                                            }
                                            for (int i8 = 0; i8 < length; i8++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i8), property5, wx7Var2.c(i8)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i8), property5, wx7Var2.c(i8)));
                                            }
                                            eg0 eg0Var = (eg0) wx7Var2.f;
                                            if (eg0Var != null) {
                                                gm.r(eg0Var);
                                                wx7Var2.f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) wx7Var2.e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            wx7Var2.e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) wx7Var2.e).playTogether(arrayList3);
                                            ((AnimatorSet) wx7Var2.e).addListener(new vx7(wx7Var2, (byte) 1));
                                            ((AnimatorSet) wx7Var2.e).start();
                                            ((by7) wx7Var2.h).e();
                                            b2 = 1;
                                            break;
                                        }
                                    default:
                                        linkedList = linkedList4;
                                        by7Var = by7Var3;
                                        linkedList2 = linkedList5;
                                        b = 0;
                                        b2 = b;
                                        break;
                                }
                                if (intValue == 11) {
                                    by7Var2 = by7Var;
                                } else {
                                    by7Var2 = by7Var;
                                    Drawable drawable = by7Var2.a;
                                    if (drawable instanceof ah7) {
                                        ah7 ah7Var = (ah7) drawable;
                                        ah7Var.C = null;
                                        ah7Var.x();
                                        float f = ah7Var.h;
                                        if (intValue == 10) {
                                            if (b2 != 0) {
                                                ah7Var.w();
                                                b3 = 1;
                                            } else {
                                                b3 = b;
                                            }
                                            z = b;
                                        } else {
                                            z = true;
                                            ah7Var.v(true);
                                            b3 = 1;
                                        }
                                        if (b3 != 0) {
                                            if (f >= 1.0f) {
                                                by7Var2.a(ah7Var);
                                            } else {
                                                yl6 yl6Var = new yl6(by7Var2, z, ah7Var, (byte) 7);
                                                LinkedList linkedList6 = linkedList2;
                                                linkedList6.offer(yl6Var);
                                                LinkedList linkedList7 = linkedList;
                                                linkedList7.offer(Boolean.valueOf(z));
                                                ArrayList arrayList4 = new ArrayList();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (int i9 = b; i9 < linkedList6.size(); i9++) {
                                                    Runnable runnable = (Runnable) linkedList6.get(i9);
                                                    Boolean bool = (Boolean) linkedList7.get(i9);
                                                    if (bool != null && bool.booleanValue() != z) {
                                                        arrayList4.add(runnable);
                                                        arrayList5.add(Integer.valueOf(i9));
                                                    }
                                                }
                                                int size = arrayList4.size();
                                                int i10 = b;
                                                while (i10 < size) {
                                                    Object obj = arrayList4.get(i10);
                                                    i10++;
                                                    linkedList6.remove((Runnable) obj);
                                                }
                                                Collections.sort(arrayList5, new qx7(b));
                                                int size2 = arrayList5.size();
                                                int i11 = 0;
                                                while (i11 < size2) {
                                                    Object obj2 = arrayList5.get(i11);
                                                    i11++;
                                                    linkedList7.remove(((Integer) obj2).intValue());
                                                }
                                            }
                                        }
                                    }
                                }
                                if (((StringBuilder) wx7Var2.d).length() == 4) {
                                    by7Var2.n(false);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            });
            this.f.add(yx7Var);
            i2++;
        }
        for (i = 11; i >= 0; i--) {
            this.e.addView((FrameLayout) this.f.get(i), qoe.e(60, 60, 51));
        }
        c();
    }

    public final void a(ah7 ah7Var) {
        zna znaVar = this.U;
        if (znaVar != null && znaVar.f) {
            znaVar.d();
        }
        xk4 xk4Var = new xk4(0.0f);
        ah7Var.C = new cj6(xk4Var, (byte) 27);
        ah7Var.x();
        zna znaVar2 = new zna(xk4Var);
        znaVar2.m = aq1.j(100.0f, 300.0f, 1.0f);
        this.U = znaVar2;
        znaVar2.a(new w21(this, ah7Var, (byte) 5));
        this.U.b(new h20(ah7Var, (byte) 9));
        this.U.h();
    }

    public final void b() {
        Activity W;
        dy7 dy7Var;
        if (!this.Q && (W = gm.W(getContext())) != null && this.n.getVisibility() == 0 && !a.x) {
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                ArrayList arrayList = launchActivity.A0;
                if (arrayList.isEmpty() && (dy7Var = launchActivity.z0) != null) {
                    if (this != dy7Var.b) {
                        return;
                    }
                } else if (b10.f(1, arrayList) != this) {
                    return;
                }
            }
            try {
                if (new ek0(new dk0(getContext(), (byte) 0)).a(15) == 0 && jie.d() && !jie.a()) {
                    k6d k6dVar = new k6d(LaunchActivity.H1, rs.g(getContext()), new sp0(this, (byte) 1));
                    hk0 hk0Var = new hk0();
                    hk0Var.a = jb6.M0(2131743537, null);
                    hk0Var.c = jb6.M0(2131743479, null);
                    hk0Var.d = (byte) 15;
                    k6dVar.n(hk0Var.a(), null);
                    o(false);
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public final void c() {
        int i;
        int i2;
        boolean g = g();
        if (g) {
            i = 0;
        } else {
            i = 8;
        }
        yx7 yx7Var = this.n;
        yx7Var.setVisibility(i);
        if (gda.q == 1) {
            this.F.setVisibility(yx7Var.getVisibility());
        }
        if (gda.q == 1) {
            i2 = 2131751053;
        } else if (g) {
            i2 = 2131751054;
        } else {
            i2 = 2131751055;
        }
        this.c.setText(jb6.M0(i2, null));
    }

    public final void d() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > gda.t) {
            long j = gda.s - (elapsedRealtime - gda.t);
            gda.s = j;
            if (j < 0) {
                gda.s = 0L;
            }
        }
        gda.t = elapsedRealtime;
        gda.x();
        long j2 = gda.s;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        EditTextBoldCursor editTextBoldCursor = this.r;
        FrameLayout frameLayout = this.h;
        ei7 ei7Var = this.d0;
        TextView textView = this.y;
        if (i > 0) {
            int max = Math.max(1, (int) Math.ceil(j2 / 1000.0d));
            if (max != this.e0) {
                textView.setText(jb6.a0(null, null, 2131743722, jb6.G(max, "Seconds", new Object[0])));
                this.e0 = max;
            }
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                frameLayout.setVisibility(4);
                o(false);
                gm.t1(editTextBoldCursor);
            }
            gm.r(ei7Var);
            gm.d3(ei7Var, 100L);
            return;
        }
        gm.r(ei7Var);
        if (textView.getVisibility() == 0) {
            textView.setVisibility(4);
            frameLayout.setVisibility(0);
            o(true);
            if (gda.q == 1) {
                gm.E3(editTextBoldCursor);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.Q1) {
            c();
            if (((Boolean) objArr[0]).booleanValue() && gda.w) {
                b();
            }
        } else if (i == nm7.o0 && objArr[0] != this) {
            setVisibility(8);
            j();
        }
    }

    public final void e() {
        boolean z;
        float f;
        float f2;
        wx7 wx7Var = this.s;
        if (wx7Var != null && ((StringBuilder) wx7Var.d).length() <= 0) {
            z = false;
        } else {
            z = true;
        }
        FrameLayout frameLayout = this.b;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            ViewPropertyAnimator animate = frameLayout.animate();
            float f3 = 1.0f;
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f);
            if (z) {
                f2 = 0.8f;
            } else {
                f2 = 1.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f2);
            if (z) {
                f3 = 0.8f;
            }
            wi8.t(scaleX.scaleY(f3), d53.h, 320L);
        }
    }

    public final ay7 f(yx7 yx7Var) {
        nm0 nm0Var = new nm0(null);
        nm0Var.e = new bh7((byte) 24);
        if (Build.VERSION.SDK_INT < 29) {
            nm0Var.f(1308622847, 1308622847);
            nm0Var.e(452984831, 452984831);
            float N = gm.N(1.0f);
            float N2 = gm.N(0.6666667f);
            nm0Var.f = N;
            nm0Var.h = N2;
        }
        im0 c = this.J.c(yx7Var, nm0Var, true);
        c.r(gm.L(30.0f));
        return new ay7(c);
    }

    public final boolean g() {
        if (gm.W(getContext()) != null && gda.C) {
            try {
                Context context = a.b;
                if (gi4.b(context) && gi4.a(context) && jie.d()) {
                    if (!jie.a()) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                fc4.g(th, true);
            }
        }
        return false;
    }

    public final boolean i() {
        mx5 mx5Var = this.f0;
        if (mx5Var != null && mx5Var.c()) {
            gm.t1(this.r);
            return false;
        }
        return true;
    }

    public final void k() {
        gm.r(this.d0);
    }

    public final void l() {
        if (!this.Q) {
            d();
            if (this.y.getVisibility() != 0) {
                if (gda.q == 1) {
                    EditTextBoldCursor editTextBoldCursor = this.r;
                    if (editTextBoldCursor != null) {
                        editTextBoldCursor.requestFocus();
                        gm.E3(editTextBoldCursor);
                    }
                    gm.d3(new ox7(this, (byte) 0), 200L);
                }
                b();
            }
        }
    }

    public final void m(boolean z, int i, int i2, fd5 fd5Var) {
        View currentFocus;
        boolean z2;
        we0 we0Var;
        int i3;
        int i4;
        if (getVisibility() != 0) {
            this.Q = false;
        }
        c();
        d();
        Activity W = gm.W(getContext());
        int i5 = gda.q;
        TextView textView = this.y;
        EditTextBoldCursor editTextBoldCursor = this.r;
        if (i5 == 1) {
            if (!z && textView.getVisibility() != 0 && editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                gm.E3(editTextBoldCursor);
            }
        } else if (W != null && (currentFocus = W.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            gm.t1(W.getCurrentFocus());
        }
        if (getVisibility() == 0) {
            return;
        }
        setTranslationY(0.0f);
        this.a = null;
        boolean z3 = cmb.r0() instanceof ah7;
        su suVar = this.w;
        if (z3) {
            z2 = !cmb.I.o();
            this.a = cmb.r0();
            suVar.setBackgroundColor(-1090519040);
        } else {
            if (cmb.V && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(cmb.I0()) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(cmb.I0())) {
                xlb xlbVar = cmb.I.j0;
                if (xlbVar != null && (i3 = xlbVar.d) != 0 && (i4 = xlbVar.e) != 0) {
                    we0Var = new we0(we0.c(xlbVar.h), new int[]{i3, i4});
                } else {
                    we0Var = null;
                }
                this.a = we0Var;
                if (we0Var == null) {
                    this.a = cmb.r0();
                }
                if (this.a instanceof we0) {
                    suVar.setBackgroundColor(570425344);
                } else {
                    suVar.setBackgroundColor(-1090519040);
                }
            } else {
                if (!"d".equals(cmb.I0())) {
                    String I0 = cmb.I0();
                    if (!cmb.i0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(I0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(I0)) {
                        Drawable r0 = cmb.r0();
                        this.a = r0;
                        if (r0 instanceof we0) {
                            suVar.setBackgroundColor(570425344);
                        } else if (r0 != null) {
                            suVar.setBackgroundColor(-1090519040);
                        } else {
                            suVar.setBackgroundColor(-11436898);
                        }
                    }
                }
                suVar.setBackgroundColor(-11436898);
            }
            z2 = false;
        }
        Drawable drawable = this.a;
        if (drawable instanceof ah7) {
            ah7 ah7Var = (ah7) drawable;
            int[] iArr = ah7Var.a;
            if (z2) {
                int[] iArr2 = new int[iArr.length];
                for (int i6 = 0; i6 < iArr.length; i6++) {
                    iArr2[i6] = cmb.a(0.14f, 0.0f, iArr[i6]);
                }
                iArr = iArr2;
            }
            this.a = new ah7(iArr[0], iArr[1], iArr[2], iArr[3], false, false);
            if (ah7Var.u != null && ah7Var.q < 0) {
                suVar.setBackgroundColor(2130706432);
            } else {
                suVar.setBackgroundColor(570425344);
            }
            ((ah7) this.a).p(suVar);
        }
        this.x.setText(jb6.M0(2131754197, null));
        int i7 = gda.q;
        ImageView imageView = this.F;
        ImageView imageView2 = this.E;
        a6 a6Var = this.e;
        wx7 wx7Var = this.s;
        if (i7 == 0) {
            if (textView.getVisibility() != 0) {
                a6Var.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            wx7Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i7 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(129);
            a6Var.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            wx7Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        wx7Var.b(false);
        if (z) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new ux7(this, i, i2, fd5Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.b0 = 1.0f;
            h(1.0f);
            s09 s09Var = this.N;
            s09Var.setScaleX(1.0f);
            s09Var.setScaleY(1.0f);
            s09Var.i();
            s09Var.getAnimatedDrawable().I(38, false, false);
            if (fd5Var != null) {
                fd5Var.run();
            }
        }
        setOnTouchListener(new w02((byte) 15));
    }

    public final void n(boolean z) {
        String str;
        if (!this.Q && getVisibility() == 0) {
            EditTextBoldCursor editTextBoldCursor = this.r;
            if (!z) {
                if (gda.s <= 0) {
                    int i = gda.q;
                    wx7 wx7Var = this.s;
                    if (i == 0) {
                        str = ((StringBuilder) wx7Var.d).toString();
                    } else if (i != 1) {
                        str = "";
                    } else {
                        str = editTextBoldCursor.getText().toString();
                    }
                    int length = str.length();
                    FrameLayout frameLayout = this.b;
                    xx0 xx0Var = xx0.NOTIFICATION_ERROR;
                    if (length == 0) {
                        xx0Var.a();
                        int i2 = -this.c0;
                        this.c0 = i2;
                        gm.A3(i2, frameLayout, null);
                        return;
                    } else if (!gda.g(str)) {
                        gda.r();
                        if (gda.s > 0) {
                            d();
                        }
                        editTextBoldCursor.setText("");
                        wx7Var.b(true);
                        xx0Var.a();
                        int i3 = -this.c0;
                        this.c0 = i3;
                        gm.A3(i3, frameLayout, null);
                        Drawable drawable = this.a;
                        if (drawable instanceof ah7) {
                            ah7 ah7Var = (ah7) drawable;
                            LinkedList linkedList = this.V;
                            linkedList.clear();
                            LinkedList linkedList2 = this.W;
                            linkedList2.clear();
                            zna znaVar = this.U;
                            if (znaVar != null && znaVar.f) {
                                linkedList.offer(new zg7(ah7Var, (byte) 1));
                                linkedList2.offer(Boolean.FALSE);
                                return;
                            }
                            ah7Var.m(true);
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            this.Q = true;
            k();
            gda.u = 0;
            editTextBoldCursor.clearFocus();
            gm.t1(editTextBoldCursor);
            if (jie.d() && jie.a()) {
                try {
                    jie.c().deleteEntry("tmessages_passcode");
                } catch (KeyStoreException e) {
                    fc4.g(e, true);
                }
                jie.c = null;
                jie.b(false);
            }
            gda.w = false;
            gda.x();
            nm7.e().k(nm7.n0, new Object[0]);
            setOnTouchListener(null);
            zx7 zx7Var = this.P;
            if (zx7Var != null) {
                zx7Var.a(this);
            }
            AnimatorSet animatorSet = this.R;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.R = null;
            }
            AnimatorSet animatorSet2 = this.S;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
                this.S = null;
            }
            s09 s09Var = this.N;
            s09Var.getAnimatedDrawable().K(71);
            s09Var.getAnimatedDrawable().I(37, false, false);
            s09Var.d();
            gm.c3(new ox7(this, (byte) 1));
        }
    }

    public final void o(boolean z) {
        float f;
        ValueAnimator valueAnimator = this.h0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.g0 = z;
        float alpha = this.e.getAlpha();
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f);
        this.h0 = ofFloat;
        ofFloat.addUpdateListener(new px7(this, (byte) 0));
        this.h0.addListener(new jf4((byte) 19, this, z));
        this.h0.setInterpolator(d53.h);
        this.h0.setDuration(320L);
        this.h0.start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.e().b(this, nm7.Q1);
        nm7.e().b(this, nm7.o0);
        if (this.f0 == null && (getParent() instanceof View)) {
            this.f0 = new mx5((View) getParent(), false, new ci7(this, (byte) 8));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.Q = true;
        AnimatorSet animatorSet = this.R;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.S;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.T.cancel();
            this.T = null;
        }
        nm7.e().n(this, nm7.Q1);
        nm7.e().n(this, nm7.o0);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        View rootView = getRootView();
        int height = (rootView.getHeight() - gm.m) - gm.o1(rootView);
        Rect rect = this.O;
        getWindowVisibleDisplayFrame(rect);
        this.H = height - (rect.bottom - rect.top);
        if (gda.q == 1 && (gm.O1() || getContext().getResources().getConfiguration().orientation != 2)) {
            FrameLayout frameLayout = this.h;
            if (frameLayout.getTag() != null) {
                i5 = ((Integer) frameLayout.getTag()).intValue();
            } else {
                i5 = 0;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = ((i5 + layoutParams.height) - (this.H / 2)) - gm.m;
            frameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z, i, i2, i3, i4);
        TextView textView = this.x;
        int[] iArr = this.i0;
        textView.getLocationInWindow(iArr);
        boolean O1 = gm.O1();
        s09 s09Var = this.N;
        if (!O1 && getContext().getResources().getConfiguration().orientation == 2) {
            int L = iArr[1] - gm.L(100.0f);
            this.M = L;
            s09Var.setTranslationY(L);
            return;
        }
        int L2 = iArr[1] - gm.L(100.0f);
        this.M = L2;
        s09Var.setTranslationY(L2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        float f;
        int i3;
        int i4;
        float f2;
        float f3;
        float f4;
        int i5;
        int i6;
        int i7;
        int size = View.MeasureSpec.getSize(i);
        int i8 = gm.q.y;
        int L = gm.L(28.0f);
        int L2 = gm.L(16.0f);
        int L3 = gm.L(60.0f);
        if (!gm.O1() && getContext().getResources().getConfiguration().orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        View view = this.G;
        if (view != null) {
            if (gda.q == 1) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            view.setVisibility(i7);
        }
        a6 a6Var = this.e;
        FrameLayout frameLayout = this.d;
        FrameLayout frameLayout2 = this.h;
        s09 s09Var = this.N;
        if (z) {
            if (gda.q == 0) {
                f3 = 29.0f;
                f4 = size / 2.0f;
            } else {
                f3 = 29.0f;
                f4 = size;
            }
            s09Var.setTranslationX((f4 / 2.0f) - gm.L(f3));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            if (gda.q == 0) {
                i5 = size / 2;
            } else {
                i5 = size;
            }
            layoutParams.width = i5;
            layoutParams.height = gm.L(180.0f);
            int D = wi8.D(140.0f, i8, 2);
            if (gda.q == 0) {
                i6 = gm.L(40.0f);
            } else {
                i6 = 0;
            }
            layoutParams.topMargin = D + i6;
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = i8;
            int i9 = size / 2;
            layoutParams2.leftMargin = i9;
            layoutParams2.topMargin = gm.m;
            layoutParams2.width = i9;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) a6Var.getLayoutParams();
            layoutParams3.height = (L2 * 3) + gm.L(82.0f) + (L3 << 2);
            layoutParams3.width = (L3 * 3) + (L << 1);
            layoutParams3.gravity = 17;
            a6Var.setLayoutParams(layoutParams3);
            f = 82.0f;
        } else {
            s09Var.setTranslationX((size / 2.0f) - gm.L(29.0f));
            int i10 = gm.m;
            if (gm.O1()) {
                if (size > gm.L(498.0f)) {
                    i3 = wi8.D(498.0f, size, 2);
                    size = gm.L(498.0f);
                } else {
                    i3 = 0;
                }
                f = 82.0f;
                if (i8 > gm.L(528.0f)) {
                    i10 = wi8.D(528.0f, i8, 2);
                    i8 = gm.L(528.0f);
                }
            } else {
                f = 82.0f;
                i3 = 0;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            int i11 = i8 / 3;
            if (gda.q == 0) {
                i4 = gm.L(40.0f);
            } else {
                i4 = 0;
            }
            layoutParams4.height = i11 + i4;
            layoutParams4.width = size;
            layoutParams4.topMargin = i10;
            layoutParams4.leftMargin = i3;
            frameLayout2.setTag(Integer.valueOf(i10));
            frameLayout2.setLayoutParams(layoutParams4);
            int i12 = layoutParams4.topMargin + layoutParams4.height;
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) a6Var.getLayoutParams();
            layoutParams5.height = (L2 * 3) + gm.L(f) + (L3 << 2);
            layoutParams5.width = (L3 * 3) + (L << 1);
            if (gm.O1()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            a6Var.setLayoutParams(layoutParams5);
            int i13 = i8 - layoutParams5.height;
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams6.leftMargin = i3;
            if (gm.O1()) {
                layoutParams6.topMargin = (i8 - i13) / 2;
            } else {
                layoutParams6.topMargin = i12;
            }
            layoutParams6.width = size;
            layoutParams6.height = -1;
            frameLayout.setLayoutParams(layoutParams6);
        }
        if (z) {
            f2 = 52.0f;
        } else {
            f2 = f;
        }
        int L4 = gm.L(f2);
        for (int i14 = 0; i14 < 12; i14++) {
            int i15 = 10;
            if (i14 != 0) {
                if (i14 == 10) {
                    i15 = 11;
                } else if (i14 == 11) {
                    i15 = 9;
                } else {
                    i15 = i14 - 1;
                }
            }
            FrameLayout frameLayout3 = (FrameLayout) this.f.get(i14);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams7.topMargin = ((L3 + L2) * (i15 / 3)) + L4;
            layoutParams7.leftMargin = (L3 + L) * (i15 % 3);
            frameLayout3.setLayoutParams(layoutParams7);
        }
        super.onMeasure(i, i2);
    }

    public void setDelegate(zx7 zx7Var) {
        this.P = zx7Var;
    }

    public void h(float f) {
    }

    public void j() {
    }
}
