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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class gw8 extends d {
    public float E;
    public float[] F;
    public boolean G;
    public ValueAnimator H;
    public ClipboardManager I;
    public final boolean J;
    public fda K;
    public boolean L;
    public ClipboardManager.OnPrimaryClipChangedListener M;
    public int N;
    public EditTextBoldCursor[] a;
    public ew8 b;
    public m56 c;
    public LinearLayout d;
    public bba[] e;
    public njb[] f;
    public vkb h;
    public vkb n;
    public uja r;
    public w09[] s;
    public int w;
    public bw8 x;
    public String y;

    public gw8() {
        super(null);
        this.e = new bba[3];
        this.f = new njb[2];
        this.s = new w09[3];
        this.E = 1.0f;
        this.F = new float[2];
        this.G = true;
        this.M = new cw8(this, (byte) 0);
        this.K = new fda(bw8.i);
        this.J = true;
    }

    public final void Z(boolean z) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z2;
        int i;
        if (this.h != null && this.r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.w != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.z(this.a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(bwc.l(editTextBoldCursor.getText().toString())) || bwc.f(this.a[4].getText().toString()) == null)) {
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
                    this.H.addUpdateListener(new fx7(this, (byte) 22));
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
                        i = cmb.p6;
                    } else {
                        i = cmb.y6;
                    }
                    anb.X(textView, i, null);
                }
                this.h.setEnabled(z2);
                this.r.a(z2, z);
                this.G = z2;
            }
        }
    }

    public final void a0(int i, boolean z, ge7 ge7Var) {
        boolean z2;
        boolean z3;
        w09[] w09VarArr = this.s;
        njb[] njbVarArr = this.f;
        if (this.w != i) {
            this.w = i;
            TransitionManager.endTransitions(this.c);
            boolean z4 = true;
            if (z) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) d53.f).setDuration(250L);
                if (ge7Var != null) {
                    duration.addListener((Transition.TransitionListener) new i7(ge7Var, (byte) 2));
                }
                TransitionManager.beginDelayedTransition(this.c, duration);
            }
            int i2 = this.w;
            if (i2 == 1) {
                njbVarArr[0].setVisibility(0);
                njbVarArr[1].setVisibility(8);
                ((View) this.a[4].getParent()).setVisibility(8);
                ((View) this.a[3].getParent()).setVisibility(0);
                ((View) this.a[2].getParent()).setVisibility(0);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i2 == 2) {
                njbVarArr[0].setVisibility(8);
                njbVarArr[1].setVisibility(0);
                njbVarArr[1].setText(jb6.M0(2131743464, null) + "\n\n" + jb6.M0(2131743463, null));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i2 == 3) {
                njbVarArr[0].setVisibility(8);
                njbVarArr[1].setVisibility(0);
                njbVarArr[1].setText(jb6.M0(2131743459, null));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(8);
                this.a[1].setText("443");
            }
            w09 w09Var = w09VarArr[0];
            if (this.w == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            w09Var.a(z2, z);
            w09 w09Var2 = w09VarArr[1];
            if (this.w == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            w09Var2.a(z3, z);
            w09 w09Var3 = w09VarArr[2];
            if (this.w != 3) {
                z4 = false;
            }
            w09Var3.a(z4, z);
            Z(z);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.I6));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.g7));
        hashSet.add(Integer.valueOf(cmb.f7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    public final void b0(Context context, String str) {
        ax8 ax8Var = new ax8(context, jb6.M0(2131745182, null), str, jb6.M0(2131746237, null), true);
        ax8Var.q1.setImageBitmap(neb.e(gm.L(60.0f), gm.L(60.0f), gm.v2(null, 2131624168)));
        showDialog(ax8Var);
    }

    public final void c0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw8.c0():void");
    }

    @Override
    public final View createView(Context context) {
        int i;
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        njb[] njbVarArr = this.f;
        fda fdaVar = this.K;
        bba[] bbaVarArr = this.e;
        w09[] w09VarArr = this.s;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(jb6.M0(2131746337, null));
        this.simpleActionBar.setBackButtonImage(2131231244);
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 5));
        this.r = this.simpleActionBar.s(jb6.M0(2131745680, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.c = new m56(context);
        ?? ww9Var = new ww9(context, this.c, this.resourceProvider, true);
        this.b = ww9Var;
        ww9Var.setDrawBackground(true);
        this.b.setFillViewport(true);
        this.b.setOverScrollMode(0);
        gm.u3(this.b, cmb.w0(null, cmb.r8, false));
        int i2 = -1;
        frameLayout.addView(this.b, qoe.c(-1.0f, -1));
        this.c.setOrientation(1);
        this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final gw8 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                byte b = r2;
                gw8 gw8Var = this.b;
                switch (b) {
                    case 0:
                        gw8Var.a0(bw8.f(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        bw8 bw8Var = gw8Var.x;
                        if (bw8Var != null) {
                            int i3 = bw8Var.a;
                            int i4 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = gw8Var.a;
                                if (i4 < editTextBoldCursorArr.length) {
                                    if ((i3 != 1 || i4 != 4) && (i3 != 2 || (i4 != 2 && i4 != 3))) {
                                        if (i4 == 0) {
                                            str = gw8Var.x.b;
                                        } else if (i4 == 1) {
                                            int i5 = gw8Var.x.c;
                                            if (i5 != 0) {
                                                str = Integer.toString(i5);
                                            }
                                            str = null;
                                        } else if (i4 == 2) {
                                            str = gw8Var.x.d;
                                        } else if (i4 == 3) {
                                            str = gw8Var.x.e;
                                        } else {
                                            if (i4 == 4) {
                                                str = gw8Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                gw8Var.a[i4].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                gw8Var.a[i4].setText(str);
                                            }
                                        } else {
                                            gw8Var.a[i4].setText((CharSequence) null);
                                        }
                                    }
                                    i4++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    gw8Var.a0(i3, true, new ge7(gw8Var, i3, (byte) 9));
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
            int f2 = bw8.f(i3);
            w09 w09Var = new w09(context, null);
            w09VarArr[i3] = w09Var;
            anb.R(w09Var, cmb.L0(true), anb.M(cmb.c6), anb.M(cmb.h6), null);
            w09VarArr[i3].setTag(Integer.valueOf(i3));
            if (i3 == 0) {
                w09 w09Var2 = w09VarArr[i3];
                String M0 = jb6.M0(2131743469, null);
                if (f2 == this.w) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                w09Var2.c(M0, z3, true);
            } else if (i3 == 1) {
                w09 w09Var3 = w09VarArr[i3];
                String M02 = jb6.M0(2131743466, null);
                if (f2 == this.w) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                w09Var3.c(M02, z2, true);
            } else {
                w09 w09Var4 = w09VarArr[i3];
                String M03 = jb6.M0(2131743460, null);
                if (f2 == this.w) {
                    z = true;
                } else {
                    z = false;
                }
                w09Var4.c(M03, z, false);
            }
            this.c.addView(w09VarArr[i3], qoe.o(-1, 50));
            w09VarArr[i3].setOnClickListener(onClickListener);
            i3++;
            i2 = -1;
        }
        bba bbaVar = new bba(context, (hg9) null);
        bbaVarArr[0] = bbaVar;
        this.c.addView(bbaVar, qoe.o(i2, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(gm.L(1.0f));
        this.d.setOutlineProvider(null);
        int i4 = -1;
        this.c.addView(this.d, qoe.o(-1, -2));
        int i5 = 5;
        this.a = new EditTextBoldCursor[5];
        int i6 = 0;
        while (i6 < i5) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, qoe.o(i4, 64));
            this.a[i6] = new EditTextBoldCursor(context);
            this.a[i6].setTag(Integer.valueOf(i6));
            this.a[i6].setTextSize(1, 16.0f);
            anb.A(this.a[i6], cmb.G6, null);
            EditTextBoldCursor editTextBoldCursor = this.a[i6];
            int i7 = cmb.F6;
            anb.X(editTextBoldCursor, i7, null);
            this.a[i6].setBackground(null);
            anb.v(this.a[i6], i7, null);
            this.a[i6].setCursorSize(gm.L(20.0f));
            this.a[i6].setCursorWidth(1.5f);
            this.a[i6].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.a[i6];
            if (jb6.a0) {
                i = 5;
            } else {
                i = 3;
            }
            editTextBoldCursor2.setGravity(i | 16);
            anb.z(this.a[i6], cmb.K6, null);
            this.a[i6].setTransformHintToHeader(true);
            anb.F(this.a[i6], cmb.j6, cmb.k6, cmb.o7, null);
            if (i6 == 0) {
                this.a[i6].setInputType(524305);
                this.a[i6].addTextChangedListener(new fw8(this, (byte) 0));
            } else {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i6 == 1) {
                    editTextBoldCursorArr[i6].setInputType(2);
                    this.a[i6].addTextChangedListener(new fw8(this, (byte) 1));
                } else if (i6 == 3) {
                    editTextBoldCursorArr[i6].setInputType(129);
                    this.a[i6].setTypeface(Typeface.DEFAULT);
                    this.a[i6].setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    editTextBoldCursorArr[i6].setInputType(524289);
                }
            }
            if (i6 == 4) {
                this.a[i6].addTextChangedListener(new fw8(this, (byte) 2));
            }
            this.a[i6].setImeOptions(268435461);
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 4) {
                                this.a[i6].setHintText(jb6.M0(2131743471, null));
                                this.a[i6].setText(fdaVar.a.f);
                            }
                        } else {
                            this.a[i6].setHintText(jb6.M0(2131743474, null));
                            this.a[i6].setText(fdaVar.a.e);
                        }
                    } else {
                        this.a[i6].setHintText(jb6.M0(2131743461, null));
                        this.a[i6].setText(fdaVar.a.d);
                    }
                } else {
                    this.a[i6].setHintText(jb6.M0(2131743473, null));
                    this.a[i6].setText(Integer.toString(fdaVar.a.c));
                }
            } else {
                this.a[i6].setHintText(jb6.M0(2131743478, null));
                this.a[i6].setText(fdaVar.a.b);
            }
            EditTextBoldCursor editTextBoldCursor3 = this.a[i6];
            editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
            this.a[i6].setPadding(0, 0, 0, 0);
            EditTextBoldCursor editTextBoldCursor4 = this.a[i6];
            if (i6 == 0) {
                f = 12.0f;
            } else {
                f = 0.0f;
            }
            frameLayout2.addView(editTextBoldCursor4, qoe.d(-1, -1.0f, 51, 17.0f, f, 17.0f, 0.0f));
            this.a[i6].setOnEditorActionListener(new j(this, (byte) 20));
            i6++;
            i5 = 5;
            i4 = -1;
        }
        for (int i8 = 0; i8 < 2; i8++) {
            njb njbVar = new njb(context);
            njbVarArr[i8] = njbVar;
            if (i8 == 0) {
                njbVar.setText(jb6.M0(2131743475, null));
            } else {
                njbVar.setText(jb6.M0(2131743464, null) + "\n\n" + jb6.M0(2131743463, null));
                njbVarArr[i8].setVisibility(8);
            }
            this.c.addView(njbVarArr[i8], qoe.o(-1, -2));
        }
        vkb vkbVar = new vkb(this.fragmentView.getContext());
        this.n = vkbVar;
        fg0 L0 = cmb.L0(true);
        int i9 = cmb.c6;
        wmb M = anb.M(i9);
        int i10 = cmb.h6;
        wmb M2 = anb.M(i10);
        vkbVar.setBackground(L0);
        anb.j(vkbVar, L0, M, M2, null);
        this.n.b(jb6.M0(2131747167, null), false);
        TextView textView = this.n.getTextView();
        int i11 = cmb.p6;
        anb.X(textView, i11, null);
        this.n.setOnClickListener(new View.OnClickListener(this) {
            public final gw8 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                byte b = r2;
                gw8 gw8Var = this.b;
                switch (b) {
                    case 0:
                        gw8Var.a0(bw8.f(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        bw8 bw8Var = gw8Var.x;
                        if (bw8Var != null) {
                            int i32 = bw8Var.a;
                            int i42 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr2 = gw8Var.a;
                                if (i42 < editTextBoldCursorArr2.length) {
                                    if ((i32 != 1 || i42 != 4) && (i32 != 2 || (i42 != 2 && i42 != 3))) {
                                        if (i42 == 0) {
                                            str = gw8Var.x.b;
                                        } else if (i42 == 1) {
                                            int i52 = gw8Var.x.c;
                                            if (i52 != 0) {
                                                str = Integer.toString(i52);
                                            }
                                            str = null;
                                        } else if (i42 == 2) {
                                            str = gw8Var.x.d;
                                        } else if (i42 == 3) {
                                            str = gw8Var.x.e;
                                        } else {
                                            if (i42 == 4) {
                                                str = gw8Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                gw8Var.a[i42].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                gw8Var.a[i42].setText(str);
                                            }
                                        } else {
                                            gw8Var.a[i42].setText((CharSequence) null);
                                        }
                                    }
                                    i42++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr2[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    gw8Var.a0(i32, true, new ge7(gw8Var, i32, (byte) 9));
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
        this.c.addView(this.n, 0, qoe.o(-1, -2));
        this.n.setVisibility(8);
        bba bbaVar2 = new bba(this.fragmentView.getContext(), (hg9) null);
        bbaVarArr[2] = bbaVar2;
        this.c.addView(bbaVar2, 1, qoe.o(-1, -2));
        bbaVarArr[2].setVisibility(8);
        vkb vkbVar2 = new vkb(context);
        this.h = vkbVar2;
        fg0 L02 = cmb.L0(true);
        wmb M3 = anb.M(i9);
        wmb M4 = anb.M(i10);
        vkbVar2.setBackground(L02);
        anb.j(vkbVar2, L02, M3, M4, null);
        this.h.b(jb6.M0(2131745193, null), false);
        anb.X(this.h.getTextView(), i11, null);
        this.c.addView(this.h, qoe.o(-1, -2));
        this.h.setOnClickListener(new n06(this, context, (byte) 27));
        bba bbaVar3 = new bba(context, (hg9) null);
        bbaVarArr[1] = bbaVar3;
        this.c.addView(bbaVar3, qoe.o(-1, -2));
        this.I = (ClipboardManager) context.getSystemService("clipboard");
        this.G = true;
        this.E = 1.0f;
        Z(false);
        this.w = 0;
        a0(fdaVar.a.a, false, null);
        this.x = null;
        this.y = null;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        int w0;
        try {
            int i = 0;
            if (this.b != null && (w0 = cmb.w0(null, cmb.r8, false)) != this.N) {
                this.N = w0;
                gm.u3(this.b, w0);
            }
            if (this.a != null) {
                cmb.u0(cmb.G6);
                cmb.u0(cmb.F6);
                cmb.u0(cmb.K6);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                    if (i < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i];
                        if (editTextBoldCursor != null) {
                            anb.l(editTextBoldCursor, 34, cmb.G6, null);
                            anb.v(this.a[i], cmb.F6, null);
                            anb.z(this.a[i], cmb.K6, null);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final ww9 getScrollViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.r8));
        arrayList.add(new cnb(this.d, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        for (int i = 0; i < this.s.length; i++) {
        }
        if (this.a != null) {
            int i2 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i2 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new cnb(editTextBoldCursorArr[i2], 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.G6));
                arrayList.add(new cnb(this.a[i2], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.K6));
                i2++;
            }
        } else {
            arrayList.add(new cnb((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F6));
            arrayList.add(new cnb((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.G6));
        }
        arrayList.add(new cnb((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        int i3 = 0;
        while (true) {
            bba[] bbaVarArr = this.e;
            if (i3 >= bbaVarArr.length) {
                break;
            }
            bba bbaVar = bbaVarArr[i3];
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
        gm.V2(getParentActivity(), this.classGuid);
        this.I.addPrimaryClipChangedListener(this.M);
        c0();
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
                    i = cmb.p6;
                } else {
                    i = cmb.y6;
                }
                anb.X(textView, i, null);
            }
            d0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && !z2 && this.J) {
            this.a[0].requestFocus();
            gm.E3(this.a[0]);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
