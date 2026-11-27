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
public class fz7 extends FrameLayout implements fn7 {
    public static final int[] j0 = {2131296594, 2131296595, 2131296596, 2131296597, 2131296598, 2131296599, 2131296600, 2131296601, 2131296602, 2131296603, 2131296604, 2131296606};
    public final ImageView E;
    public final ImageView F;
    public final View G;
    public int H;
    public final nz4 I;
    public final ll0 J;
    public Bitmap K;
    public Canvas L;
    public int M;
    public final e29 N;
    public final Rect O;
    public dz7 P;
    public boolean Q;
    public AnimatorSet R;
    public AnimatorSet S;
    public ValueAnimator T;
    public vpa U;
    public final LinkedList V;
    public final LinkedList W;
    public Drawable a;
    public final ArrayList a0;
    public final FrameLayout b;
    public float b0;
    public final TextView c;
    public int c0;
    public final FrameLayout d;
    public final li7 d0;
    public final b6 e;
    public int e0;
    public final ArrayList f;
    public rx5 f0;
    public boolean g0;
    public final FrameLayout h;
    public ValueAnimator h0;
    public final int[] i0;
    public final cz7 n;
    public final EditTextBoldCursor r;
    public final az7 s;
    public final tt w;
    public final TextView x;
    public final TextView y;

    public fz7(Context context) {
        super(context);
        int i;
        String M0 = ob6.M0(2131743505, null);
        int i2 = 0;
        this.H = 0;
        nz4 nz4Var = new nz4();
        this.I = nz4Var;
        ll0 ll0Var = new ll0(nz4Var, nz4Var, nz4Var);
        this.J = ll0Var;
        r89 r89Var = new r89(0, false);
        this.O = new Rect();
        this.V = new LinkedList();
        this.W = new LinkedList();
        this.a0 = new ArrayList();
        this.c0 = -12;
        this.d0 = new li7(this, (byte) 5);
        this.g0 = true;
        this.i0 = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        tt ttVar = new tt(this, context);
        this.w = ttVar;
        ttVar.setWillNotDraw(false);
        addView(ttVar, tre.c(-1.0f, -1));
        ll0Var.h = new yic(ttVar);
        ll0Var.i = ttVar;
        ll0Var.g = r89Var;
        ?? imageView = new ImageView(context);
        this.N = imageView;
        imageView.f(2131624112, 58, 58, null);
        imageView.setAutoRepeat(false);
        addView((View) imageView, tre.e(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        ttVar.addView(frameLayout, tre.c(-1.0f, -1));
        TextView textView = new TextView(context);
        this.x = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(hl.o());
        textView.setAlpha(0.0f);
        TextView l = ik8.l(frameLayout, textView, tre.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.y = l;
        l.setTextColor(-1);
        l.setTextSize(1, 15.0f);
        l.setGravity(1);
        l.setVisibility(4);
        ttVar.addView(l, tre.e(-2, -2, 17));
        az7 az7Var = new az7(this, context);
        this.s = az7Var;
        frameLayout.addView(az7Var, tre.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
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
        editTextBoldCursor.setCursorSize(hl.L(32.0f));
        frameLayout.addView(editTextBoldCursor, tre.d(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        editTextBoldCursor.setOnEditorActionListener(new j(this, (byte) 17));
        editTextBoldCursor.addTextChangedListener(new nh6(this, (byte) 5));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new ry7((byte) 1));
        ImageView imageView2 = new ImageView(context);
        this.E = imageView2;
        imageView2.setImageResource(2131232528);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundResource(2131230881);
        frameLayout.addView(imageView2, tre.d(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        imageView2.setContentDescription(ob6.M0(2131751319, null));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final fz7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                LinkedList linkedList;
                fz7 fz7Var;
                LinkedList linkedList2;
                boolean z;
                boolean z2;
                LinkedList linkedList3;
                int i3;
                int i4;
                boolean z3;
                boolean z4;
                byte b = r2;
                fz7 fz7Var2 = this.b;
                switch (b) {
                    case 0:
                        fz7Var2.n(false);
                        return;
                    case 1:
                        fz7Var2.b();
                        return;
                    default:
                        LinkedList linkedList4 = fz7Var2.W;
                        LinkedList linkedList5 = fz7Var2.V;
                        az7 az7Var2 = fz7Var2.s;
                        if (fz7Var2.g0 && !fz7Var2.Q) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            int i5 = 4;
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("0");
                                    z2 = z;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("1");
                                    z2 = z;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("2");
                                    z2 = z;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("3");
                                    z2 = z;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("4");
                                    z2 = z;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("5");
                                    z2 = z;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("6");
                                    z2 = z;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("7");
                                    z2 = z;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("8");
                                    z2 = z;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("9");
                                    z2 = z;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    fz7Var.b();
                                    z2 = z;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) az7Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    ArrayList arrayList2 = (ArrayList) az7Var2.b;
                                    z = false;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb = (StringBuilder) az7Var2.d;
                                    if (sb.length() == 0) {
                                        linkedList = linkedList4;
                                        fz7Var = fz7Var2;
                                        linkedList2 = linkedList5;
                                        z2 = z;
                                        break;
                                    } else {
                                        try {
                                            az7Var2.performHapticFeedback(3);
                                        } catch (Exception e) {
                                            cc4.g(e, true);
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
                                            fz7 fz7Var3 = fz7Var2;
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
                                                fArr5[0] = az7Var2.c(i7);
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
                                                fArr10[0] = az7Var2.c(i7);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                            } else {
                                                i4 = i7;
                                            }
                                            i7 = i4 + 1;
                                            linkedList5 = linkedList3;
                                            fz7Var2 = fz7Var3;
                                            i5 = 4;
                                            i6 = 1;
                                        }
                                        fz7Var = fz7Var2;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb.deleteCharAt(length);
                                        }
                                        for (int i8 = 0; i8 < length; i8++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i8), property5, az7Var2.c(i8)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i8), property5, az7Var2.c(i8)));
                                        }
                                        gf0 gf0Var = (gf0) az7Var2.f;
                                        if (gf0Var != null) {
                                            hl.r(gf0Var);
                                            az7Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) az7Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        az7Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) az7Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) az7Var2.e).addListener(new zy7(az7Var2, (byte) 1));
                                        ((AnimatorSet) az7Var2.e).start();
                                        ((fz7) az7Var2.h).e();
                                        z2 = true;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    z2 = z;
                                    break;
                            }
                            fz7 fz7Var4 = fz7Var;
                            if (intValue != 11) {
                                Drawable drawable = fz7Var4.a;
                                if (drawable instanceof ih7) {
                                    ih7 ih7Var = (ih7) drawable;
                                    ih7Var.C = null;
                                    ih7Var.x();
                                    float f = ih7Var.h;
                                    if (intValue == 10) {
                                        if (z2) {
                                            ih7Var.w();
                                            z4 = true;
                                        } else {
                                            z4 = z;
                                        }
                                        z3 = z;
                                    } else {
                                        z3 = true;
                                        ih7Var.v(true);
                                        z4 = true;
                                    }
                                    if (z4) {
                                        if (f >= 1.0f) {
                                            fz7Var4.a(ih7Var);
                                        } else {
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(new yn6(fz7Var4, z3, ih7Var, (byte) 6));
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z3));
                                            ?? arrayList4 = new ArrayList();
                                            ?? arrayList5 = new ArrayList();
                                            for (int i9 = z; i9 < linkedList6.size(); i9++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i9);
                                                Boolean bool = (Boolean) linkedList7.get(i9);
                                                if (bool != null && bool.booleanValue() != z3) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf((int) i9));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            for (int i10 = z; i10 < size; i10++) {
                                                linkedList6.remove((Runnable) arrayList4.get(i10));
                                            }
                                            Collections.sort(arrayList5, new qq7((byte) 2));
                                            int size2 = arrayList5.size();
                                            for (int i11 = z; i11 < size2; i11++) {
                                                linkedList7.remove(((Integer) arrayList5.get(i11)).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) az7Var2.d).length() == 4) {
                                fz7Var4.n(z);
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
        imageView3.setImageResource(2131231192);
        imageView3.setScaleType(scaleType);
        imageView3.setBackgroundResource(2131230881);
        frameLayout.addView(imageView3, tre.d(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        imageView3.setContentDescription(ob6.M0(2131754877, null));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final fz7 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                LinkedList linkedList;
                fz7 fz7Var;
                LinkedList linkedList2;
                boolean z;
                boolean z2;
                LinkedList linkedList3;
                int i3;
                int i4;
                boolean z3;
                boolean z4;
                byte b = r2;
                fz7 fz7Var2 = this.b;
                switch (b) {
                    case 0:
                        fz7Var2.n(false);
                        return;
                    case 1:
                        fz7Var2.b();
                        return;
                    default:
                        LinkedList linkedList4 = fz7Var2.W;
                        LinkedList linkedList5 = fz7Var2.V;
                        az7 az7Var2 = fz7Var2.s;
                        if (fz7Var2.g0 && !fz7Var2.Q) {
                            int intValue = ((Integer) view.getTag()).intValue();
                            int i5 = 4;
                            switch (intValue) {
                                case 0:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("0");
                                    z2 = z;
                                    break;
                                case 1:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("1");
                                    z2 = z;
                                    break;
                                case 2:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("2");
                                    z2 = z;
                                    break;
                                case 3:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("3");
                                    z2 = z;
                                    break;
                                case 4:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("4");
                                    z2 = z;
                                    break;
                                case 5:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("5");
                                    z2 = z;
                                    break;
                                case 6:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("6");
                                    z2 = z;
                                    break;
                                case 7:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("7");
                                    z2 = z;
                                    break;
                                case 8:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("8");
                                    z2 = z;
                                    break;
                                case 9:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    az7Var2.a("9");
                                    z2 = z;
                                    break;
                                case 10:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    fz7Var.b();
                                    z2 = z;
                                    break;
                                case 11:
                                    ArrayList arrayList = (ArrayList) az7Var2.c;
                                    Property property = View.TRANSLATION_Y;
                                    Property property2 = View.ALPHA;
                                    Property property3 = View.SCALE_Y;
                                    Property property4 = View.SCALE_X;
                                    ArrayList arrayList2 = (ArrayList) az7Var2.b;
                                    z = false;
                                    Property property5 = View.TRANSLATION_X;
                                    StringBuilder sb = (StringBuilder) az7Var2.d;
                                    if (sb.length() == 0) {
                                        linkedList = linkedList4;
                                        fz7Var = fz7Var2;
                                        linkedList2 = linkedList5;
                                        z2 = z;
                                        break;
                                    } else {
                                        try {
                                            az7Var2.performHapticFeedback(3);
                                        } catch (Exception e) {
                                            cc4.g(e, true);
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
                                            fz7 fz7Var3 = fz7Var2;
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
                                                fArr5[0] = az7Var2.c(i7);
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
                                                fArr10[0] = az7Var2.c(i7);
                                                arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                            } else {
                                                i4 = i7;
                                            }
                                            i7 = i4 + 1;
                                            linkedList5 = linkedList3;
                                            fz7Var2 = fz7Var3;
                                            i5 = 4;
                                            i6 = 1;
                                        }
                                        fz7Var = fz7Var2;
                                        linkedList2 = linkedList5;
                                        if (length == 0) {
                                            sb.deleteCharAt(length);
                                        }
                                        for (int i8 = 0; i8 < length; i8++) {
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i8), property5, az7Var2.c(i8)));
                                            arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i8), property5, az7Var2.c(i8)));
                                        }
                                        gf0 gf0Var = (gf0) az7Var2.f;
                                        if (gf0Var != null) {
                                            hl.r(gf0Var);
                                            az7Var2.f = null;
                                        }
                                        AnimatorSet animatorSet = (AnimatorSet) az7Var2.e;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                        }
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        az7Var2.e = animatorSet2;
                                        animatorSet2.setDuration(150L);
                                        ((AnimatorSet) az7Var2.e).playTogether(arrayList3);
                                        ((AnimatorSet) az7Var2.e).addListener(new zy7(az7Var2, (byte) 1));
                                        ((AnimatorSet) az7Var2.e).start();
                                        ((fz7) az7Var2.h).e();
                                        z2 = true;
                                        break;
                                    }
                                default:
                                    linkedList = linkedList4;
                                    fz7Var = fz7Var2;
                                    linkedList2 = linkedList5;
                                    z = false;
                                    z2 = z;
                                    break;
                            }
                            fz7 fz7Var4 = fz7Var;
                            if (intValue != 11) {
                                Drawable drawable = fz7Var4.a;
                                if (drawable instanceof ih7) {
                                    ih7 ih7Var = (ih7) drawable;
                                    ih7Var.C = null;
                                    ih7Var.x();
                                    float f = ih7Var.h;
                                    if (intValue == 10) {
                                        if (z2) {
                                            ih7Var.w();
                                            z4 = true;
                                        } else {
                                            z4 = z;
                                        }
                                        z3 = z;
                                    } else {
                                        z3 = true;
                                        ih7Var.v(true);
                                        z4 = true;
                                    }
                                    if (z4) {
                                        if (f >= 1.0f) {
                                            fz7Var4.a(ih7Var);
                                        } else {
                                            LinkedList linkedList6 = linkedList2;
                                            linkedList6.offer(new yn6(fz7Var4, z3, ih7Var, (byte) 6));
                                            LinkedList linkedList7 = linkedList;
                                            linkedList7.offer(Boolean.valueOf(z3));
                                            ?? arrayList4 = new ArrayList();
                                            ?? arrayList5 = new ArrayList();
                                            for (int i9 = z; i9 < linkedList6.size(); i9++) {
                                                Runnable runnable = (Runnable) linkedList6.get(i9);
                                                Boolean bool = (Boolean) linkedList7.get(i9);
                                                if (bool != null && bool.booleanValue() != z3) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf((int) i9));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            for (int i10 = z; i10 < size; i10++) {
                                                linkedList6.remove((Runnable) arrayList4.get(i10));
                                            }
                                            Collections.sort(arrayList5, new qq7((byte) 2));
                                            int size2 = arrayList5.size();
                                            for (int i11 = z; i11 < size2; i11++) {
                                                linkedList7.remove(((Integer) arrayList5.get(i11)).intValue());
                                            }
                                        }
                                    }
                                }
                            }
                            if (((StringBuilder) az7Var2.d).length() == 4) {
                                fz7Var4.n(z);
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
        frameLayout.addView(view, tre.a(-1.0f, 1.0f / hl.p, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        frameLayout2.setClipChildren(false);
        ttVar.addView(frameLayout2, tre.e(-1, -1, 51));
        b6 b6Var = new b6(context, (byte) 22);
        this.e = b6Var;
        b6Var.setClipChildren(false);
        frameLayout2.addView(b6Var, tre.e(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b = frameLayout3;
        b6Var.addView(frameLayout3, tre.e(-2, -2, 49));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(hl.o());
        textView2.setTextColor(-1);
        textView2.setText(M0);
        TextView l2 = ik8.l(frameLayout3, textView2, tre.d(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.c = l2;
        l2.setTextSize(1, 14.0f);
        l2.setTextColor(-1);
        l2.setText((CharSequence) null);
        frameLayout3.addView(l2, tre.d(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.f = new ArrayList(10);
        while (true) {
            if (i2 >= 12) {
                break;
            }
            cz7 cz7Var = new cz7(context);
            iye.b(cz7Var, 0.15f, 1.5f);
            cz7Var.setTag(Integer.valueOf(i2));
            int[] iArr = j0;
            if (i2 == 11) {
                cz7Var.setBackground(f(cz7Var));
                int L = hl.L(30.0f);
                cz7Var.setForeground(aob.i0(L, L, L, L, 0, 654311423, 654311423));
                cz7Var.setImage(2131231103);
                cz7Var.setOnLongClickListener(new zs(this, (byte) 7));
                cz7Var.setContentDescription(ob6.M0(2131754916, null));
                cz7Var.setNextFocusForwardId(2131296594);
                cz7Var.setAccessibilityTraversalBefore(2131296594);
            } else if (i2 == 10) {
                this.n = cz7Var;
                cz7Var.setBackground(f(cz7Var));
                int L2 = hl.L(30.0f);
                cz7Var.setForeground(aob.i0(L2, L2, L2, L2, 0, 654311423, 654311423));
                cz7Var.setContentDescription(ob6.M0(2131754877, null));
                cz7Var.setImage(2131231192);
                cz7Var.setNextFocusForwardId(2131296595);
                cz7Var.setAccessibilityTraversalBefore(2131296595);
            } else {
                cz7Var.setBackground(f(cz7Var));
                int L3 = hl.L(30.0f);
                cz7Var.setForeground(aob.i0(L3, L3, L3, L3, 0, 654311423, 654311423));
                cz7Var.setContentDescription(i2 + "");
                cz7Var.setNum(i2);
                if (i2 == 0) {
                    cz7Var.setNextFocusForwardId(2131296604);
                    cz7Var.setAccessibilityTraversalBefore(2131296604);
                } else if (i2 == 9) {
                    if (g()) {
                        cz7Var.setNextFocusForwardId(2131296606);
                        cz7Var.setAccessibilityTraversalBefore(2131296606);
                    } else {
                        cz7Var.setNextFocusForwardId(2131296594);
                        cz7Var.setAccessibilityTraversalBefore(2131296594);
                    }
                } else {
                    int i3 = iArr[i2 + 1];
                    cz7Var.setNextFocusForwardId(i3);
                    cz7Var.setAccessibilityTraversalBefore(i3);
                }
            }
            cz7Var.setId(iArr[i2]);
            cz7Var.setOnClickListener(new View.OnClickListener(this) {
                public final fz7 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    LinkedList linkedList;
                    fz7 fz7Var;
                    LinkedList linkedList2;
                    boolean z;
                    boolean z2;
                    LinkedList linkedList3;
                    int i32;
                    int i4;
                    boolean z3;
                    boolean z4;
                    byte b = r2;
                    fz7 fz7Var2 = this.b;
                    switch (b) {
                        case 0:
                            fz7Var2.n(false);
                            return;
                        case 1:
                            fz7Var2.b();
                            return;
                        default:
                            LinkedList linkedList4 = fz7Var2.W;
                            LinkedList linkedList5 = fz7Var2.V;
                            az7 az7Var2 = fz7Var2.s;
                            if (fz7Var2.g0 && !fz7Var2.Q) {
                                int intValue = ((Integer) view2.getTag()).intValue();
                                int i5 = 4;
                                switch (intValue) {
                                    case 0:
                                        linkedList = linkedList4;
                                        fz7Var = fz7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        az7Var2.a("0");
                                        z2 = z;
                                        break;
                                    case 1:
                                        linkedList = linkedList4;
                                        fz7Var = fz7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        az7Var2.a("1");
                                        z2 = z;
                                        break;
                                    case 2:
                                        linkedList = linkedList4;
                                        fz7Var = fz7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        az7Var2.a("2");
                                        z2 = z;
                                        break;
                                    case 3:
                                        linkedList = linkedList4;
                                        fz7Var = fz7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        az7Var2.a("3");
                                        z2 = z;
                                        break;
                                    case 4:
                                        linkedList = linkedList4;
                                        fz7Var = fz7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        az7Var2.a("4");
                                        z2 = z;
                                        break;
                                    case 5:
                                        linkedList = linkedList4;
                                        fz7Var = fz7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        az7Var2.a("5");
                                        z2 = z;
                                        break;
                                    case 6:
                                        linkedList = linkedList4;
                                        fz7Var = fz7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        az7Var2.a("6");
                                        z2 = z;
                                        break;
                                    case 7:
                                        linkedList = linkedList4;
                                        fz7Var = fz7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        az7Var2.a("7");
                                        z2 = z;
                                        break;
                                    case 8:
                                        linkedList = linkedList4;
                                        fz7Var = fz7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        az7Var2.a("8");
                                        z2 = z;
                                        break;
                                    case 9:
                                        linkedList = linkedList4;
                                        fz7Var = fz7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        az7Var2.a("9");
                                        z2 = z;
                                        break;
                                    case 10:
                                        linkedList = linkedList4;
                                        fz7Var = fz7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        fz7Var.b();
                                        z2 = z;
                                        break;
                                    case 11:
                                        ArrayList arrayList = (ArrayList) az7Var2.c;
                                        Property property = View.TRANSLATION_Y;
                                        Property property2 = View.ALPHA;
                                        Property property3 = View.SCALE_Y;
                                        Property property4 = View.SCALE_X;
                                        ArrayList arrayList2 = (ArrayList) az7Var2.b;
                                        z = false;
                                        Property property5 = View.TRANSLATION_X;
                                        StringBuilder sb = (StringBuilder) az7Var2.d;
                                        if (sb.length() == 0) {
                                            linkedList = linkedList4;
                                            fz7Var = fz7Var2;
                                            linkedList2 = linkedList5;
                                            z2 = z;
                                            break;
                                        } else {
                                            try {
                                                az7Var2.performHapticFeedback(3);
                                            } catch (Exception e) {
                                                cc4.g(e, true);
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
                                                fz7 fz7Var3 = fz7Var2;
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
                                                    fArr5[0] = az7Var2.c(i7);
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
                                                    fArr10[0] = az7Var2.c(i7);
                                                    arrayList3.add(ObjectAnimator.ofFloat(textView3, property5, fArr10));
                                                } else {
                                                    i4 = i7;
                                                }
                                                i7 = i4 + 1;
                                                linkedList5 = linkedList3;
                                                fz7Var2 = fz7Var3;
                                                i5 = 4;
                                                i6 = 1;
                                            }
                                            fz7Var = fz7Var2;
                                            linkedList2 = linkedList5;
                                            if (length == 0) {
                                                sb.deleteCharAt(length);
                                            }
                                            for (int i8 = 0; i8 < length; i8++) {
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i8), property5, az7Var2.c(i8)));
                                                arrayList3.add(ObjectAnimator.ofFloat((TextView) arrayList.get(i8), property5, az7Var2.c(i8)));
                                            }
                                            gf0 gf0Var = (gf0) az7Var2.f;
                                            if (gf0Var != null) {
                                                hl.r(gf0Var);
                                                az7Var2.f = null;
                                            }
                                            AnimatorSet animatorSet = (AnimatorSet) az7Var2.e;
                                            if (animatorSet != null) {
                                                animatorSet.cancel();
                                            }
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            az7Var2.e = animatorSet2;
                                            animatorSet2.setDuration(150L);
                                            ((AnimatorSet) az7Var2.e).playTogether(arrayList3);
                                            ((AnimatorSet) az7Var2.e).addListener(new zy7(az7Var2, (byte) 1));
                                            ((AnimatorSet) az7Var2.e).start();
                                            ((fz7) az7Var2.h).e();
                                            z2 = true;
                                            break;
                                        }
                                    default:
                                        linkedList = linkedList4;
                                        fz7Var = fz7Var2;
                                        linkedList2 = linkedList5;
                                        z = false;
                                        z2 = z;
                                        break;
                                }
                                fz7 fz7Var4 = fz7Var;
                                if (intValue != 11) {
                                    Drawable drawable = fz7Var4.a;
                                    if (drawable instanceof ih7) {
                                        ih7 ih7Var = (ih7) drawable;
                                        ih7Var.C = null;
                                        ih7Var.x();
                                        float f = ih7Var.h;
                                        if (intValue == 10) {
                                            if (z2) {
                                                ih7Var.w();
                                                z4 = true;
                                            } else {
                                                z4 = z;
                                            }
                                            z3 = z;
                                        } else {
                                            z3 = true;
                                            ih7Var.v(true);
                                            z4 = true;
                                        }
                                        if (z4) {
                                            if (f >= 1.0f) {
                                                fz7Var4.a(ih7Var);
                                            } else {
                                                LinkedList linkedList6 = linkedList2;
                                                linkedList6.offer(new yn6(fz7Var4, z3, ih7Var, (byte) 6));
                                                LinkedList linkedList7 = linkedList;
                                                linkedList7.offer(Boolean.valueOf(z3));
                                                ?? arrayList4 = new ArrayList();
                                                ?? arrayList5 = new ArrayList();
                                                for (int i9 = z; i9 < linkedList6.size(); i9++) {
                                                    Runnable runnable = (Runnable) linkedList6.get(i9);
                                                    Boolean bool = (Boolean) linkedList7.get(i9);
                                                    if (bool != null && bool.booleanValue() != z3) {
                                                        arrayList4.add(runnable);
                                                        arrayList5.add(Integer.valueOf((int) i9));
                                                    }
                                                }
                                                int size = arrayList4.size();
                                                for (int i10 = z; i10 < size; i10++) {
                                                    linkedList6.remove((Runnable) arrayList4.get(i10));
                                                }
                                                Collections.sort(arrayList5, new qq7((byte) 2));
                                                int size2 = arrayList5.size();
                                                for (int i11 = z; i11 < size2; i11++) {
                                                    linkedList7.remove(((Integer) arrayList5.get(i11)).intValue());
                                                }
                                            }
                                        }
                                    }
                                }
                                if (((StringBuilder) az7Var2.d).length() == 4) {
                                    fz7Var4.n(z);
                                    return;
                                }
                                return;
                            }
                            return;
                    }
                }
            });
            this.f.add(cz7Var);
            i2++;
        }
        for (i = 11; i >= 0; i--) {
            this.e.addView((FrameLayout) this.f.get(i), tre.e(60, 60, 51));
        }
        c();
    }

    public final void a(ih7 ih7Var) {
        vpa vpaVar = this.U;
        if (vpaVar != null && vpaVar.f) {
            vpaVar.d();
        }
        xk4 xk4Var = new xk4(0.0f);
        ih7Var.C = new bm6(xk4Var, (byte) 29);
        ih7Var.x();
        vpa vpaVar2 = new vpa(xk4Var);
        vpaVar2.m = bp1.j(100.0f, 300.0f, 1.0f);
        this.U = vpaVar2;
        vpaVar2.a(new x11(this, ih7Var, (byte) 5));
        this.U.b(new i10(ih7Var, (byte) 10));
        this.U.h();
    }

    public final void b() {
        Activity W;
        hz7 hz7Var;
        if (!this.Q && (W = hl.W(getContext())) != null && this.n.getVisibility() == 0 && !a.x) {
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                ArrayList arrayList = launchActivity.A0;
                if (arrayList.isEmpty() && (hz7Var = launchActivity.z0) != null) {
                    if (this != hz7Var.b) {
                        return;
                    }
                } else if (c00.g(1, arrayList) != this) {
                    return;
                }
            }
            try {
                if (new fj0(new ej0(getContext(), (byte) 0)).a(15) == 0 && ele.d() && !ele.a()) {
                    z8d z8dVar = new z8d(LaunchActivity.H1, sr.g(getContext()), new so0(this, (byte) 1));
                    ij0 ij0Var = new ij0();
                    ij0Var.a = ob6.M0(2131743505, null);
                    ij0Var.c = ob6.M0(2131743447, null);
                    ij0Var.d = (byte) 15;
                    z8dVar.R0(ij0Var.a(), null);
                    o(false);
                }
            } catch (Exception e) {
                cc4.g(e, true);
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
        cz7 cz7Var = this.n;
        cz7Var.setVisibility(i);
        if (xea.q == 1) {
            this.F.setVisibility(cz7Var.getVisibility());
        }
        if (xea.q == 1) {
            i2 = 2131751081;
        } else if (g) {
            i2 = 2131751082;
        } else {
            i2 = 2131751083;
        }
        this.c.setText(ob6.M0(i2, null));
    }

    public final void d() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > xea.t) {
            long j = xea.s - (elapsedRealtime - xea.t);
            xea.s = j;
            if (j < 0) {
                xea.s = 0L;
            }
        }
        xea.t = elapsedRealtime;
        xea.x();
        long j2 = xea.s;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        EditTextBoldCursor editTextBoldCursor = this.r;
        FrameLayout frameLayout = this.h;
        li7 li7Var = this.d0;
        TextView textView = this.y;
        if (i > 0) {
            int max = Math.max(1, (int) Math.ceil(j2 / 1000.0d));
            if (max != this.e0) {
                textView.setText(ob6.a0(null, null, 2131743690, ob6.G(max, "Seconds", new Object[0])));
                this.e0 = max;
            }
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                frameLayout.setVisibility(4);
                o(false);
                hl.t1(editTextBoldCursor);
            }
            hl.r(li7Var);
            hl.d3(li7Var, 100L);
            return;
        }
        hl.r(li7Var);
        if (textView.getVisibility() == 0) {
            textView.setVisibility(4);
            frameLayout.setVisibility(0);
            o(true);
            if (xea.q == 1) {
                hl.E3(editTextBoldCursor);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.Q1) {
            c();
            if (((Boolean) objArr[0]).booleanValue() && xea.w) {
                b();
            }
        } else if (i == jn7.o0 && objArr[0] != this) {
            setVisibility(8);
            j();
        }
    }

    public final void e() {
        boolean z;
        float f;
        float f2;
        az7 az7Var = this.s;
        if (az7Var != null && ((StringBuilder) az7Var.d).length() <= 0) {
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
            ik8.t(scaleX.scaleY(f3), k43.h, 320L);
        }
    }

    public final ez7 f(cz7 cz7Var) {
        ol0 ol0Var = new ol0(null);
        ol0Var.e = new ku7((byte) 10);
        if (Build.VERSION.SDK_INT < 29) {
            ol0Var.f(1308622847, 1308622847);
            ol0Var.e(452984831, 452984831);
            float N = hl.N(1.0f);
            float N2 = hl.N(0.6666667f);
            ol0Var.f = N;
            ol0Var.h = N2;
        }
        jl0 c = this.J.c(cz7Var, ol0Var, true);
        c.r(hl.L(30.0f));
        return new ez7(c);
    }

    public final boolean g() {
        if (hl.W(getContext()) != null && xea.C) {
            try {
                Context context = a.b;
                if (ei4.b(context) && ei4.a(context) && ele.d()) {
                    if (!ele.a()) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        return false;
    }

    public final boolean i() {
        rx5 rx5Var = this.f0;
        if (rx5Var != null && rx5Var.c()) {
            hl.t1(this.r);
            return false;
        }
        return true;
    }

    public final void k() {
        hl.r(this.d0);
    }

    public final void l() {
        if (!this.Q) {
            d();
            if (this.y.getVisibility() != 0) {
                if (xea.q == 1) {
                    EditTextBoldCursor editTextBoldCursor = this.r;
                    if (editTextBoldCursor != null) {
                        editTextBoldCursor.requestFocus();
                        hl.E3(editTextBoldCursor);
                    }
                    hl.d3(new ty7(this, (byte) 0), 200L);
                }
                b();
            }
        }
    }

    public final void m(boolean z, int i, int i2, tg5 tg5Var) {
        View currentFocus;
        boolean z2;
        yd0 yd0Var;
        int i3;
        int i4;
        if (getVisibility() != 0) {
            this.Q = false;
        }
        c();
        d();
        Activity W = hl.W(getContext());
        int i5 = xea.q;
        TextView textView = this.y;
        EditTextBoldCursor editTextBoldCursor = this.r;
        if (i5 == 1) {
            if (!z && textView.getVisibility() != 0 && editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                hl.E3(editTextBoldCursor);
            }
        } else if (W != null && (currentFocus = W.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            hl.t1(W.getCurrentFocus());
        }
        if (getVisibility() == 0) {
            return;
        }
        setTranslationY(0.0f);
        this.a = null;
        boolean z3 = aob.r0() instanceof ih7;
        tt ttVar = this.w;
        if (z3) {
            z2 = !aob.I.o();
            this.a = aob.r0();
            ttVar.setBackgroundColor(-1090519040);
        } else {
            if (aob.V && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(aob.I0()) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(aob.I0())) {
                unb unbVar = aob.I.j0;
                if (unbVar != null && (i3 = unbVar.d) != 0 && (i4 = unbVar.e) != 0) {
                    yd0Var = new yd0(yd0.c(unbVar.h), new int[]{i3, i4});
                } else {
                    yd0Var = null;
                }
                this.a = yd0Var;
                if (yd0Var == null) {
                    this.a = aob.r0();
                }
                if (this.a instanceof yd0) {
                    ttVar.setBackgroundColor(570425344);
                } else {
                    ttVar.setBackgroundColor(-1090519040);
                }
            } else {
                if (!"d".equals(aob.I0())) {
                    String I0 = aob.I0();
                    if (!aob.i0 && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(I0) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(I0)) {
                        Drawable r0 = aob.r0();
                        this.a = r0;
                        if (r0 instanceof yd0) {
                            ttVar.setBackgroundColor(570425344);
                        } else if (r0 != null) {
                            ttVar.setBackgroundColor(-1090519040);
                        } else {
                            ttVar.setBackgroundColor(-11436898);
                        }
                    }
                }
                ttVar.setBackgroundColor(-11436898);
            }
            z2 = false;
        }
        Drawable drawable = this.a;
        if (drawable instanceof ih7) {
            ih7 ih7Var = (ih7) drawable;
            int[] iArr = ih7Var.a;
            if (z2) {
                int[] iArr2 = new int[iArr.length];
                for (int i6 = 0; i6 < iArr.length; i6++) {
                    iArr2[i6] = aob.a(0.14f, 0.0f, iArr[i6]);
                }
                iArr = iArr2;
            }
            this.a = new ih7(iArr[0], iArr[1], iArr[2], iArr[3], false, false);
            if (ih7Var.u != null && ih7Var.q < 0) {
                ttVar.setBackgroundColor(2130706432);
            } else {
                ttVar.setBackgroundColor(570425344);
            }
            ((ih7) this.a).p(ttVar);
        }
        this.x.setText(ob6.M0(2131754225, null));
        int i7 = xea.q;
        ImageView imageView = this.F;
        ImageView imageView2 = this.E;
        b6 b6Var = this.e;
        az7 az7Var = this.s;
        if (i7 == 0) {
            if (textView.getVisibility() != 0) {
                b6Var.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            az7Var.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i7 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(129);
            b6Var.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            az7Var.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.n.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        az7Var.b(false);
        if (z) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new yy7(this, i, i2, tg5Var));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.b0 = 1.0f;
            h(1.0f);
            e29 e29Var = this.N;
            e29Var.setScaleX(1.0f);
            e29Var.setScaleY(1.0f);
            e29Var.i();
            e29Var.getAnimatedDrawable().I(38, false, false);
            if (tg5Var != null) {
                tg5Var.run();
            }
        }
        setOnTouchListener(new b02((byte) 15));
    }

    public final void n(boolean z) {
        String str;
        if (!this.Q && getVisibility() == 0) {
            EditTextBoldCursor editTextBoldCursor = this.r;
            if (!z) {
                if (xea.s <= 0) {
                    int i = xea.q;
                    az7 az7Var = this.s;
                    if (i == 0) {
                        str = ((StringBuilder) az7Var.d).toString();
                    } else if (i != 1) {
                        str = "";
                    } else {
                        str = editTextBoldCursor.getText().toString();
                    }
                    int length = str.length();
                    FrameLayout frameLayout = this.b;
                    yw0 yw0Var = yw0.NOTIFICATION_ERROR;
                    if (length == 0) {
                        yw0Var.a();
                        int i2 = -this.c0;
                        this.c0 = i2;
                        hl.A3(i2, frameLayout, null);
                        return;
                    } else if (!xea.g(str)) {
                        xea.r();
                        if (xea.s > 0) {
                            d();
                        }
                        editTextBoldCursor.setText("");
                        az7Var.b(true);
                        yw0Var.a();
                        int i3 = -this.c0;
                        this.c0 = i3;
                        hl.A3(i3, frameLayout, null);
                        Drawable drawable = this.a;
                        if (drawable instanceof ih7) {
                            ih7 ih7Var = (ih7) drawable;
                            LinkedList linkedList = this.V;
                            linkedList.clear();
                            LinkedList linkedList2 = this.W;
                            linkedList2.clear();
                            vpa vpaVar = this.U;
                            if (vpaVar != null && vpaVar.f) {
                                linkedList.offer(new hh7(ih7Var, (byte) 1));
                                linkedList2.offer(Boolean.FALSE);
                                return;
                            }
                            ih7Var.m(true);
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
            xea.u = 0;
            editTextBoldCursor.clearFocus();
            hl.t1(editTextBoldCursor);
            if (ele.d() && ele.a()) {
                try {
                    ele.c().deleteEntry("tmessages_passcode");
                } catch (KeyStoreException e) {
                    cc4.g(e, true);
                }
                ele.c = null;
                ele.b(false);
            }
            xea.w = false;
            xea.x();
            jn7.e().k(jn7.n0, new Object[0]);
            setOnTouchListener(null);
            dz7 dz7Var = this.P;
            if (dz7Var != null) {
                dz7Var.a(this);
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
            e29 e29Var = this.N;
            e29Var.getAnimatedDrawable().K(71);
            e29Var.getAnimatedDrawable().I(37, false, false);
            e29Var.d();
            hl.c3(new ty7(this, (byte) 1));
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
        ofFloat.addUpdateListener(new uy7(this, (byte) 1));
        this.h0.addListener(new gf4((byte) 19, this, z));
        this.h0.setInterpolator(k43.h);
        this.h0.setDuration(320L);
        this.h0.start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.e().b(this, jn7.Q1);
        jn7.e().b(this, jn7.o0);
        if (this.f0 == null && (getParent() instanceof View)) {
            this.f0 = new rx5((View) getParent(), false, new ji7(this, (byte) 9));
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
        jn7.e().n(this, jn7.Q1);
        jn7.e().n(this, jn7.o0);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        View rootView = getRootView();
        int height = (rootView.getHeight() - hl.m) - hl.o1(rootView);
        Rect rect = this.O;
        getWindowVisibleDisplayFrame(rect);
        this.H = height - (rect.bottom - rect.top);
        if (xea.q == 1 && (hl.O1() || getContext().getResources().getConfiguration().orientation != 2)) {
            FrameLayout frameLayout = this.h;
            if (frameLayout.getTag() != null) {
                i5 = ((Integer) frameLayout.getTag()).intValue();
            } else {
                i5 = 0;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = ((i5 + layoutParams.height) - (this.H / 2)) - hl.m;
            frameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z, i, i2, i3, i4);
        TextView textView = this.x;
        int[] iArr = this.i0;
        textView.getLocationInWindow(iArr);
        boolean O1 = hl.O1();
        e29 e29Var = this.N;
        if (!O1 && getContext().getResources().getConfiguration().orientation == 2) {
            int L = iArr[1] - hl.L(100.0f);
            this.M = L;
            e29Var.setTranslationY(L);
            return;
        }
        int L2 = iArr[1] - hl.L(100.0f);
        this.M = L2;
        e29Var.setTranslationY(L2);
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
        int i8 = hl.q.y;
        int L = hl.L(28.0f);
        int L2 = hl.L(16.0f);
        int L3 = hl.L(60.0f);
        if (!hl.O1() && getContext().getResources().getConfiguration().orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        View view = this.G;
        if (view != null) {
            if (xea.q == 1) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            view.setVisibility(i7);
        }
        b6 b6Var = this.e;
        FrameLayout frameLayout = this.d;
        FrameLayout frameLayout2 = this.h;
        e29 e29Var = this.N;
        if (z) {
            if (xea.q == 0) {
                f3 = 29.0f;
                f4 = size / 2.0f;
            } else {
                f3 = 29.0f;
                f4 = size;
            }
            e29Var.setTranslationX((f4 / 2.0f) - hl.L(f3));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            if (xea.q == 0) {
                i5 = size / 2;
            } else {
                i5 = size;
            }
            layoutParams.width = i5;
            layoutParams.height = hl.L(180.0f);
            int D = ik8.D(140.0f, i8, 2);
            if (xea.q == 0) {
                i6 = hl.L(40.0f);
            } else {
                i6 = 0;
            }
            layoutParams.topMargin = D + i6;
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = i8;
            int i9 = size / 2;
            layoutParams2.leftMargin = i9;
            layoutParams2.topMargin = hl.m;
            layoutParams2.width = i9;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) b6Var.getLayoutParams();
            layoutParams3.height = (L2 * 3) + hl.L(82.0f) + (L3 << 2);
            layoutParams3.width = (L3 * 3) + (L << 1);
            layoutParams3.gravity = 17;
            b6Var.setLayoutParams(layoutParams3);
            f = 82.0f;
        } else {
            e29Var.setTranslationX((size / 2.0f) - hl.L(29.0f));
            int i10 = hl.m;
            if (hl.O1()) {
                if (size > hl.L(498.0f)) {
                    i3 = ik8.D(498.0f, size, 2);
                    size = hl.L(498.0f);
                } else {
                    i3 = 0;
                }
                f = 82.0f;
                if (i8 > hl.L(528.0f)) {
                    i10 = ik8.D(528.0f, i8, 2);
                    i8 = hl.L(528.0f);
                }
            } else {
                f = 82.0f;
                i3 = 0;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            int i11 = i8 / 3;
            if (xea.q == 0) {
                i4 = hl.L(40.0f);
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
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) b6Var.getLayoutParams();
            layoutParams5.height = (L2 * 3) + hl.L(f) + (L3 << 2);
            layoutParams5.width = (L3 * 3) + (L << 1);
            if (hl.O1()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            b6Var.setLayoutParams(layoutParams5);
            int i13 = i8 - layoutParams5.height;
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams6.leftMargin = i3;
            if (hl.O1()) {
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
        int L4 = hl.L(f2);
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

    public void setDelegate(dz7 dz7Var) {
        this.P = dz7Var;
    }

    public void j() {
    }

    public void h(float f) {
    }
}
