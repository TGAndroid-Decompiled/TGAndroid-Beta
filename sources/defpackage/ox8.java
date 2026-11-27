package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ox8 extends e {
    public float E;
    public float[] F;
    public boolean G;
    public ValueAnimator H;
    public ClipboardManager I;
    public final boolean J;
    public wea K;
    public boolean L;
    public ClipboardManager.OnPrimaryClipChangedListener M;
    public int N;
    public EditTextBoldCursor[] a;
    public mx8 b;
    public p56 c;
    public LinearLayout d;
    public rca[] e;
    public ilb[] f;
    public qmb h;
    public qmb n;
    public nla r;
    public i29[] s;
    public int w;
    public jx8 x;
    public String y;

    public ox8() {
        super(null);
        this.e = new rca[3];
        this.f = new ilb[2];
        this.s = new i29[3];
        this.E = 1.0f;
        this.F = new float[2];
        this.G = true;
        this.M = new kx8(this, (byte) 0);
        this.K = new wea(jx8.i);
        this.J = true;
    }

    public final void Y(boolean z) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z2;
        int i;
        if (this.h != null && this.r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.w != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.z(this.a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(pyc.l(editTextBoldCursor.getText().toString())) || pyc.f(this.a[4].getText().toString()) == null)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.G != z2) {
                ValueAnimator valueAnimator = this.H;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                } else if (z) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.H = ofFloat;
                    ofFloat.setDuration(200L);
                    this.H.addUpdateListener(new pv7(this, (byte) 23));
                }
                float f = 1.0f;
                if (z) {
                    float[] fArr = this.F;
                    fArr[0] = this.E;
                    if (!z2) {
                        f = 0.0f;
                    }
                    fArr[1] = f;
                    this.H.start();
                } else {
                    if (!z2) {
                        f = 0.0f;
                    }
                    this.E = f;
                    TextView textView = this.h.getTextView();
                    if (z2) {
                        i = aob.q6;
                    } else {
                        i = aob.z6;
                    }
                    yob.X(textView, i, null);
                }
                this.h.setEnabled(z2);
                this.r.a(z2, z);
                this.G = z2;
            }
        }
    }

    public final void Z(int i, boolean z, me7 me7Var) {
        boolean z2;
        boolean z3;
        i29[] i29VarArr = this.s;
        ilb[] ilbVarArr = this.f;
        if (this.w != i) {
            this.w = i;
            TransitionManager.endTransitions(this.c);
            boolean z4 = true;
            if (z) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) k43.f).setDuration(250L);
                if (me7Var != null) {
                    duration.addListener((Transition.TransitionListener) new j7(me7Var, (byte) 2));
                }
                TransitionManager.beginDelayedTransition(this.c, duration);
            }
            int i2 = this.w;
            if (i2 == 1) {
                ilbVarArr[0].setVisibility(0);
                ilbVarArr[1].setVisibility(8);
                ((View) this.a[4].getParent()).setVisibility(8);
                ((View) this.a[3].getParent()).setVisibility(0);
                ((View) this.a[2].getParent()).setVisibility(0);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i2 == 2) {
                ilbVarArr[0].setVisibility(8);
                ilbVarArr[1].setVisibility(0);
                ilbVarArr[1].setText(ob6.M0(2131743432, null) + "\n\n" + ob6.M0(2131743431, null));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i2 == 3) {
                ilbVarArr[0].setVisibility(8);
                ilbVarArr[1].setVisibility(0);
                ilbVarArr[1].setText(ob6.M0(2131743427, null));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(8);
                this.a[1].setText("443");
            }
            i29 i29Var = i29VarArr[0];
            if (this.w == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            i29Var.a(z2, z);
            i29 i29Var2 = i29VarArr[1];
            if (this.w == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            i29Var2.a(z3, z);
            i29 i29Var3 = i29VarArr[2];
            if (this.w != 3) {
                z4 = false;
            }
            i29Var3.a(z4, z);
            Y(z);
        }
    }

    public final void a0(Context context, String str) {
        ky8 ky8Var = new ky8(context, ob6.M0(2131745176, null), str, ob6.M0(2131746231, null), true);
        ky8Var.q1.setImageBitmap(hgb.e(hl.L(60.0f), hl.L(60.0f), hl.v2(null, 2131624168)));
        showDialog(ky8Var);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.J6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.h7));
        hashSet.add(Integer.valueOf(aob.g7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    public final void b0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox8.b0():void");
    }

    public final void c0() {
        int w0;
        try {
            int i = 0;
            if (this.b != null && (w0 = aob.w0(null, aob.s8, false)) != this.N) {
                this.N = w0;
                hl.u3(this.b, w0);
            }
            if (this.a != null) {
                aob.u0(aob.H6);
                aob.u0(aob.G6);
                aob.u0(aob.L6);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                    if (i < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i];
                        if (editTextBoldCursor != null) {
                            yob.l(editTextBoldCursor, 34, aob.H6, null);
                            yob.v(this.a[i], aob.G6, null);
                            yob.z(this.a[i], aob.L6, null);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final View createView(Context context) {
        int i;
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        ilb[] ilbVarArr = this.f;
        wea weaVar = this.K;
        rca[] rcaVarArr = this.e;
        i29[] i29VarArr = this.s;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(ob6.M0(2131746331, null));
        this.simpleActionBar.setBackButtonImage(2131231243);
        wk5 wk5Var = this.parentLayout;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 6));
        this.r = this.simpleActionBar.u(ob6.M0(2131745674, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.c = new p56(context);
        ?? ny9Var = new ny9(context, this.c, this.resourceProvider, true);
        this.b = ny9Var;
        ny9Var.setDrawBackground(true);
        this.b.setFillViewport(true);
        this.b.setOverScrollMode(0);
        hl.u3(this.b, aob.w0(null, aob.s8, false));
        int i2 = -1;
        frameLayout.addView(this.b, tre.c(-1.0f, -1));
        this.c.setOrientation(1);
        this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final ox8 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                byte b = r2;
                ox8 ox8Var = this.b;
                switch (b) {
                    case 0:
                        ox8Var.Z(jx8.f(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        jx8 jx8Var = ox8Var.x;
                        if (jx8Var != null) {
                            int i3 = jx8Var.a;
                            int i4 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = ox8Var.a;
                                if (i4 < editTextBoldCursorArr.length) {
                                    if ((i3 != 1 || i4 != 4) && (i3 != 2 || (i4 != 2 && i4 != 3))) {
                                        if (i4 == 0) {
                                            str = ox8Var.x.b;
                                        } else if (i4 == 1) {
                                            int i5 = ox8Var.x.c;
                                            if (i5 != 0) {
                                                str = Integer.toString(i5);
                                            }
                                            str = null;
                                        } else if (i4 == 2) {
                                            str = ox8Var.x.d;
                                        } else if (i4 == 3) {
                                            str = ox8Var.x.e;
                                        } else {
                                            if (i4 == 4) {
                                                str = ox8Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                ox8Var.a[i4].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                ox8Var.a[i4].setText(str);
                                            }
                                        } else {
                                            ox8Var.a[i4].setText((CharSequence) null);
                                        }
                                    }
                                    i4++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    ox8Var.Z(i3, true, new me7(ox8Var, i3, (byte) 10));
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                        break;
                }
            }
        };
        int i3 = 0;
        while (i3 < 3) {
            int f2 = jx8.f(i3);
            i29 i29Var = new i29(context, null);
            i29VarArr[i3] = i29Var;
            yob.R(i29Var, aob.L0(true), yob.M(aob.d6), yob.M(aob.i6), null);
            i29VarArr[i3].setTag(Integer.valueOf(i3));
            if (i3 == 0) {
                i29 i29Var2 = i29VarArr[i3];
                String M0 = ob6.M0(2131743437, null);
                if (f2 == this.w) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i29Var2.c(M0, z3, true);
            } else if (i3 == 1) {
                i29 i29Var3 = i29VarArr[i3];
                String M02 = ob6.M0(2131743434, null);
                if (f2 == this.w) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i29Var3.c(M02, z2, true);
            } else {
                i29 i29Var4 = i29VarArr[i3];
                String M03 = ob6.M0(2131743428, null);
                if (f2 == this.w) {
                    z = true;
                } else {
                    z = false;
                }
                i29Var4.c(M03, z, false);
            }
            this.c.addView(i29VarArr[i3], tre.o(-1, 50));
            i29VarArr[i3].setOnClickListener(onClickListener);
            i3++;
            i2 = -1;
        }
        rca rcaVar = new rca(context, (uh9) null);
        rcaVarArr[0] = rcaVar;
        this.c.addView(rcaVar, tre.o(i2, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(hl.L(1.0f));
        this.d.setOutlineProvider(null);
        this.c.addView(this.d, tre.o(-1, -2));
        this.a = new EditTextBoldCursor[5];
        int i4 = 0;
        for (int i5 = 5; i4 < i5; i5 = 5) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, tre.o(-1, 64));
            this.a[i4] = new EditTextBoldCursor(context);
            this.a[i4].setTag(Integer.valueOf(i4));
            this.a[i4].setTextSize(1, 16.0f);
            yob.A(this.a[i4], aob.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.a[i4];
            int i6 = aob.G6;
            yob.X(editTextBoldCursor, i6, null);
            this.a[i4].setBackground(null);
            yob.v(this.a[i4], i6, null);
            this.a[i4].setCursorSize(hl.L(20.0f));
            this.a[i4].setCursorWidth(1.5f);
            this.a[i4].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.a[i4];
            if (ob6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            editTextBoldCursor2.setGravity(i | 16);
            yob.z(this.a[i4], aob.L6, null);
            this.a[i4].setTransformHintToHeader(true);
            yob.F(this.a[i4], aob.k6, aob.l6, aob.p7, null);
            if (i4 == 0) {
                this.a[i4].setInputType(524305);
                this.a[i4].addTextChangedListener(new nx8(this, (byte) 0));
            } else {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i4 == 1) {
                    editTextBoldCursorArr[i4].setInputType(2);
                    this.a[i4].addTextChangedListener(new nx8(this, (byte) 1));
                } else if (i4 == 3) {
                    editTextBoldCursorArr[i4].setInputType(129);
                    this.a[i4].setTypeface(Typeface.DEFAULT);
                    this.a[i4].setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    editTextBoldCursorArr[i4].setInputType(524289);
                }
            }
            if (i4 == 4) {
                this.a[i4].addTextChangedListener(new nx8(this, (byte) 2));
            }
            this.a[i4].setImeOptions(268435461);
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 4) {
                                this.a[i4].setHintText(ob6.M0(2131743439, null));
                                this.a[i4].setText(weaVar.a.f);
                            }
                        } else {
                            this.a[i4].setHintText(ob6.M0(2131743442, null));
                            this.a[i4].setText(weaVar.a.e);
                        }
                    } else {
                        this.a[i4].setHintText(ob6.M0(2131743429, null));
                        this.a[i4].setText(weaVar.a.d);
                    }
                } else {
                    this.a[i4].setHintText(ob6.M0(2131743441, null));
                    this.a[i4].setText(Integer.toString(weaVar.a.c));
                }
            } else {
                this.a[i4].setHintText(ob6.M0(2131743446, null));
                this.a[i4].setText(weaVar.a.b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.a[i4];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.a[i4].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.a[i4];
            if (i4 == 0) {
                f = 12.0f;
            } else {
                f = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, tre.d(-1, -1.0f, 51, 17.0f, f, 17.0f, 0.0f));
            this.a[i4].setOnEditorActionListener(new j(this, (byte) 19));
            i4++;
        }
        for (int i7 = 0; i7 < 2; i7++) {
            ilb ilbVar = new ilb(context);
            ilbVarArr[i7] = ilbVar;
            if (i7 == 0) {
                ilbVar.setText(ob6.M0(2131743443, null));
            } else {
                ilbVar.setText(ob6.M0(2131743432, null) + "\n\n" + ob6.M0(2131743431, null));
                ilbVarArr[i7].setVisibility(8);
            }
            this.c.addView(ilbVarArr[i7], tre.o(-1, -2));
        }
        qmb qmbVar = new qmb(this.fragmentView.getContext());
        this.n = qmbVar;
        hf0 L0 = aob.L0(true);
        int i8 = aob.d6;
        uob M = yob.M(i8);
        int i9 = aob.i6;
        uob M2 = yob.M(i9);
        qmbVar.setBackground(L0);
        yob.j(qmbVar, L0, M, M2, null);
        this.n.b(ob6.M0(2131747161, null), false);
        TextView textView = this.n.getTextView();
        int i10 = aob.q6;
        yob.X(textView, i10, null);
        this.n.setOnClickListener(new View.OnClickListener(this) {
            public final ox8 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                byte b = r2;
                ox8 ox8Var = this.b;
                switch (b) {
                    case 0:
                        ox8Var.Z(jx8.f(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        jx8 jx8Var = ox8Var.x;
                        if (jx8Var != null) {
                            int i32 = jx8Var.a;
                            int i42 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr2 = ox8Var.a;
                                if (i42 < editTextBoldCursorArr2.length) {
                                    if ((i32 != 1 || i42 != 4) && (i32 != 2 || (i42 != 2 && i42 != 3))) {
                                        if (i42 == 0) {
                                            str = ox8Var.x.b;
                                        } else if (i42 == 1) {
                                            int i52 = ox8Var.x.c;
                                            if (i52 != 0) {
                                                str = Integer.toString(i52);
                                            }
                                            str = null;
                                        } else if (i42 == 2) {
                                            str = ox8Var.x.d;
                                        } else if (i42 == 3) {
                                            str = ox8Var.x.e;
                                        } else {
                                            if (i42 == 4) {
                                                str = ox8Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                ox8Var.a[i42].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                ox8Var.a[i42].setText(str);
                                            }
                                        } else {
                                            ox8Var.a[i42].setText((CharSequence) null);
                                        }
                                    }
                                    i42++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr2[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    ox8Var.Z(i32, true, new me7(ox8Var, i32, (byte) 10));
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                        break;
                }
            }
        });
        this.c.addView(this.n, 0, tre.o(-1, -2));
        this.n.setVisibility(8);
        rca rcaVar2 = new rca(this.fragmentView.getContext(), (uh9) null);
        rcaVarArr[2] = rcaVar2;
        this.c.addView(rcaVar2, 1, tre.o(-1, -2));
        rcaVarArr[2].setVisibility(8);
        qmb qmbVar2 = new qmb(context);
        this.h = qmbVar2;
        hf0 L02 = aob.L0(true);
        uob M3 = yob.M(i8);
        uob M4 = yob.M(i9);
        qmbVar2.setBackground(L02);
        yob.j(qmbVar2, L02, M3, M4, null);
        this.h.b(ob6.M0(2131745187, null), false);
        yob.X(this.h.getTextView(), i10, null);
        this.c.addView(this.h, tre.o(-1, -2));
        this.h.setOnClickListener(new uv5(this, context, (byte) 29));
        rca rcaVar3 = new rca(context, (uh9) null);
        rcaVarArr[1] = rcaVar3;
        this.c.addView(rcaVar3, tre.o(-1, -2));
        this.I = (ClipboardManager) context.getSystemService("clipboard");
        this.G = true;
        this.E = 1.0f;
        Y(false);
        this.w = 0;
        Z(weaVar.a.a, false, null);
        this.x = null;
        this.y = null;
        b0();
        return this.fragmentView;
    }

    @Override
    public final ny9 getScrollViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.s8));
        arrayList.add(new apb(this.d, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        for (int i = 0; i < this.s.length; i++) {
        }
        if (this.a != null) {
            int i2 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i2 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new apb(editTextBoldCursorArr[i2], 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.H6));
                arrayList.add(new apb(this.a[i2], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.L6));
                i2++;
            }
        } else {
            arrayList.add(new apb((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G6));
            arrayList.add(new apb((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.H6));
        }
        arrayList.add(new apb((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        int i3 = 0;
        while (true) {
            rca[] rcaVarArr = this.e;
            if (i3 >= rcaVarArr.length) {
                break;
            }
            rca rcaVar = rcaVarArr[i3];
            i3++;
        }
        for (int i4 = 0; i4 < this.f.length; i4++) {
        }
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.I.removePrimaryClipChangedListener(this.M);
    }

    @Override
    public final void onResume() {
        super.onResume();
        hl.V2(getParentActivity(), this.classGuid);
        this.I.addPrimaryClipChangedListener(this.M);
        b0();
    }

    @Override
    public final void onThemeColorsChanged() {
        ValueAnimator valueAnimator;
        int i;
        try {
            super.onThemeColorsChanged();
            if (this.h != null && ((valueAnimator = this.H) == null || !valueAnimator.isRunning())) {
                TextView textView = this.h.getTextView();
                if (this.G) {
                    i = aob.q6;
                } else {
                    i = aob.z6;
                }
                yob.X(textView, i, null);
            }
            c0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && !z2 && this.J) {
            this.a[0].requestFocus();
            hl.E3(this.a[0]);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
