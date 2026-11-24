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
public final class fu8 extends d {
    public float E;
    public float[] F;
    public boolean G;
    public ValueAnimator H;
    public ClipboardManager I;
    public final boolean J;
    public fba K;
    public boolean L;
    public ClipboardManager.OnPrimaryClipChangedListener M;
    public int N;
    public EditTextBoldCursor[] a;
    public du8 b;
    public m36 c;
    public LinearLayout d;
    public b9a[] e;
    public mhb[] f;
    public uib h;
    public uib n;
    public sha r;
    public vy8[] s;
    public int w;
    public au8 x;
    public String y;

    public fu8() {
        super(null);
        this.e = new b9a[3];
        this.f = new mhb[2];
        this.s = new vy8[3];
        this.E = 1.0f;
        this.F = new float[2];
        this.G = true;
        this.M = new bu8(this, (byte) 0);
        this.K = new fba(au8.i);
        this.J = true;
    }

    public final void Y(boolean z) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        boolean z2;
        int i;
        if (this.h != null && this.r != null && (editTextBoldCursor = (editTextBoldCursorArr = this.a)[0]) != null && editTextBoldCursorArr[1] != null) {
            if (this.w != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.z(this.a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(auc.l(editTextBoldCursor.getText().toString())) || auc.f(this.a[4].getText().toString()) == null)) {
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
                    this.H.addUpdateListener(new u28(this, (byte) 20));
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
                        i = bkb.p6;
                    } else {
                        i = bkb.y6;
                    }
                    zkb.X(textView, i, null);
                }
                this.h.setEnabled(z2);
                this.r.a(z2, z);
                this.G = z2;
            }
        }
    }

    public final void Z(int i, boolean z, on7 on7Var) {
        boolean z2;
        boolean z3;
        vy8[] vy8VarArr = this.s;
        mhb[] mhbVarArr = this.f;
        if (this.w != i) {
            this.w = i;
            TransitionManager.endTransitions(this.c);
            boolean z4 = true;
            if (z) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) s33.f).setDuration(250L);
                if (on7Var != null) {
                    duration.addListener((Transition.TransitionListener) new i7(on7Var, (byte) 2));
                }
                TransitionManager.beginDelayedTransition(this.c, duration);
            }
            int i2 = this.w;
            if (i2 == 1) {
                mhbVarArr[0].setVisibility(0);
                mhbVarArr[1].setVisibility(8);
                ((View) this.a[4].getParent()).setVisibility(8);
                ((View) this.a[3].getParent()).setVisibility(0);
                ((View) this.a[2].getParent()).setVisibility(0);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i2 == 2) {
                mhbVarArr[0].setVisibility(8);
                mhbVarArr[1].setVisibility(0);
                mhbVarArr[1].setText(k96.M0(2131743538, null) + "\n\n" + k96.M0(2131743537, null));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i2 == 3) {
                mhbVarArr[0].setVisibility(8);
                mhbVarArr[1].setVisibility(0);
                mhbVarArr[1].setText(k96.M0(2131743533, null));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(8);
                this.a[1].setText("443");
            }
            vy8 vy8Var = vy8VarArr[0];
            if (this.w == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            vy8Var.a(z2, z);
            vy8 vy8Var2 = vy8VarArr[1];
            if (this.w == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            vy8Var2.a(z3, z);
            vy8 vy8Var3 = vy8VarArr[2];
            if (this.w != 3) {
                z4 = false;
            }
            vy8Var3.a(z4, z);
            Y(z);
        }
    }

    public final void a0(Context context, String str) {
        zu8 zu8Var = new zu8(context, k96.M0(2131745256, null), str, k96.M0(2131746311, null), true);
        zu8Var.q1.setImageBitmap(lcb.e(gl.L(60.0f), gl.L(60.0f), gl.v2(null, 2131624169)));
        showDialog(zu8Var);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.I6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.g7));
        hashSet.add(Integer.valueOf(bkb.f7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    public final void b0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu8.b0():void");
    }

    public final void c0() {
        int w0;
        try {
            int i = 0;
            if (this.b != null && (w0 = bkb.w0(null, bkb.r8, false)) != this.N) {
                this.N = w0;
                gl.v3(this.b, w0);
            }
            if (this.a != null) {
                bkb.u0(bkb.G6);
                bkb.u0(bkb.F6);
                bkb.u0(bkb.K6);
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                    if (i < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i];
                        if (editTextBoldCursor != null) {
                            zkb.l(editTextBoldCursor, 34, bkb.G6, null);
                            zkb.v(this.a[i], bkb.F6, null);
                            zkb.z(this.a[i], bkb.K6, null);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final View createView(Context context) {
        int i;
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        mhb[] mhbVarArr = this.f;
        fba fbaVar = this.K;
        b9a[] b9aVarArr = this.e;
        vy8[] vy8VarArr = this.s;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(k96.M0(2131746411, null));
        this.simpleActionBar.setBackButtonImage(2131231243);
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 4));
        this.r = this.simpleActionBar.s(k96.M0(2131745754, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.c = new m36(context);
        ?? tu9Var = new tu9(context, this.c, this.resourceProvider, true);
        this.b = tu9Var;
        tu9Var.setDrawBackground(true);
        this.b.setFillViewport(true);
        this.b.setOverScrollMode(0);
        gl.v3(this.b, bkb.w0(null, bkb.r8, false));
        int i2 = -1;
        frameLayout.addView(this.b, nme.c(-1.0f, -1));
        this.c.setOrientation(1);
        this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final fu8 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                byte b = r2;
                fu8 fu8Var = this.b;
                switch (b) {
                    case 0:
                        fu8Var.Z(au8.f(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        au8 au8Var = fu8Var.x;
                        if (au8Var != null) {
                            int i3 = au8Var.a;
                            int i4 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = fu8Var.a;
                                if (i4 < editTextBoldCursorArr.length) {
                                    if ((i3 != 1 || i4 != 4) && (i3 != 2 || (i4 != 2 && i4 != 3))) {
                                        if (i4 == 0) {
                                            str = fu8Var.x.b;
                                        } else if (i4 == 1) {
                                            int i5 = fu8Var.x.c;
                                            if (i5 != 0) {
                                                str = Integer.toString(i5);
                                            }
                                            str = null;
                                        } else if (i4 == 2) {
                                            str = fu8Var.x.d;
                                        } else if (i4 == 3) {
                                            str = fu8Var.x.e;
                                        } else {
                                            if (i4 == 4) {
                                                str = fu8Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                fu8Var.a[i4].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                fu8Var.a[i4].setText(str);
                                            }
                                        } else {
                                            fu8Var.a[i4].setText((CharSequence) null);
                                        }
                                    }
                                    i4++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    fu8Var.Z(i3, true, new on7(fu8Var, i3, (byte) 7));
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
            int f2 = au8.f(i3);
            vy8 vy8Var = new vy8(context, null);
            vy8VarArr[i3] = vy8Var;
            zkb.R(vy8Var, bkb.L0(true), zkb.M(bkb.c6), zkb.M(bkb.h6), null);
            vy8VarArr[i3].setTag(Integer.valueOf(i3));
            if (i3 == 0) {
                vy8 vy8Var2 = vy8VarArr[i3];
                String M0 = k96.M0(2131743543, null);
                if (f2 == this.w) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                vy8Var2.c(M0, z3, true);
            } else if (i3 == 1) {
                vy8 vy8Var3 = vy8VarArr[i3];
                String M02 = k96.M0(2131743540, null);
                if (f2 == this.w) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                vy8Var3.c(M02, z2, true);
            } else {
                vy8 vy8Var4 = vy8VarArr[i3];
                String M03 = k96.M0(2131743534, null);
                if (f2 == this.w) {
                    z = true;
                } else {
                    z = false;
                }
                vy8Var4.c(M03, z, false);
            }
            this.c.addView(vy8VarArr[i3], nme.o(-1, 50));
            vy8VarArr[i3].setOnClickListener(onClickListener);
            i3++;
            i2 = -1;
        }
        b9a b9aVar = new b9a(context, (de9) null);
        b9aVarArr[0] = b9aVar;
        this.c.addView(b9aVar, nme.o(i2, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(gl.L(1.0f));
        this.d.setOutlineProvider(null);
        this.c.addView(this.d, nme.o(-1, -2));
        this.a = new EditTextBoldCursor[5];
        int i4 = 0;
        for (int i5 = 5; i4 < i5; i5 = 5) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, nme.o(-1, 64));
            this.a[i4] = new EditTextBoldCursor(context);
            this.a[i4].setTag(Integer.valueOf(i4));
            this.a[i4].setTextSize(1, 16.0f);
            zkb.A(this.a[i4], bkb.G6, null);
            EditTextBoldCursor editTextBoldCursor = this.a[i4];
            int i6 = bkb.F6;
            zkb.X(editTextBoldCursor, i6, null);
            this.a[i4].setBackground(null);
            zkb.v(this.a[i4], i6, null);
            this.a[i4].setCursorSize(gl.L(20.0f));
            this.a[i4].setCursorWidth(1.5f);
            this.a[i4].setSingleLine(true);
            EditTextBoldCursor editTextBoldCursor2 = this.a[i4];
            if (k96.a0) {
                i = 5;
            } else {
                i = 3;
            }
            editTextBoldCursor2.setGravity(i | 16);
            zkb.z(this.a[i4], bkb.K6, null);
            this.a[i4].setTransformHintToHeader(true);
            zkb.F(this.a[i4], bkb.j6, bkb.k6, bkb.o7, null);
            if (i4 == 0) {
                this.a[i4].setInputType(524305);
                this.a[i4].addTextChangedListener(new eu8(this, (byte) 0));
            } else {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i4 == 1) {
                    editTextBoldCursorArr[i4].setInputType(2);
                    this.a[i4].addTextChangedListener(new eu8(this, (byte) 1));
                } else if (i4 == 3) {
                    editTextBoldCursorArr[i4].setInputType(129);
                    this.a[i4].setTypeface(Typeface.DEFAULT);
                    this.a[i4].setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    editTextBoldCursorArr[i4].setInputType(524289);
                }
            }
            if (i4 == 4) {
                this.a[i4].addTextChangedListener(new eu8(this, (byte) 2));
            }
            this.a[i4].setImeOptions(268435461);
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 4) {
                                this.a[i4].setHintText(k96.M0(2131743545, null));
                                this.a[i4].setText(fbaVar.a.f);
                            }
                        } else {
                            this.a[i4].setHintText(k96.M0(2131743548, null));
                            this.a[i4].setText(fbaVar.a.e);
                        }
                    } else {
                        this.a[i4].setHintText(k96.M0(2131743535, null));
                        this.a[i4].setText(fbaVar.a.d);
                    }
                } else {
                    this.a[i4].setHintText(k96.M0(2131743547, null));
                    this.a[i4].setText(Integer.toString(fbaVar.a.c));
                }
            } else {
                this.a[i4].setHintText(k96.M0(2131743552, null));
                this.a[i4].setText(fbaVar.a.b);
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
            frameLayout2.addView(editTextBoldCursor4, nme.d(-1, -1.0f, 51, 17.0f, f, 17.0f, 0.0f));
            this.a[i4].setOnEditorActionListener(new j(this, (byte) 19));
            i4++;
        }
        for (int i7 = 0; i7 < 2; i7++) {
            mhb mhbVar = new mhb(context);
            mhbVarArr[i7] = mhbVar;
            if (i7 == 0) {
                mhbVar.setText(k96.M0(2131743549, null));
            } else {
                mhbVar.setText(k96.M0(2131743538, null) + "\n\n" + k96.M0(2131743537, null));
                mhbVarArr[i7].setVisibility(8);
            }
            this.c.addView(mhbVarArr[i7], nme.o(-1, -2));
        }
        uib uibVar = new uib(this.fragmentView.getContext());
        this.n = uibVar;
        ff0 L0 = bkb.L0(true);
        int i8 = bkb.c6;
        vkb M = zkb.M(i8);
        int i9 = bkb.h6;
        vkb M2 = zkb.M(i9);
        uibVar.setBackground(L0);
        zkb.j(uibVar, L0, M, M2, null);
        this.n.b(k96.M0(2131747241, null), false);
        TextView textView = this.n.getTextView();
        int i10 = bkb.p6;
        zkb.X(textView, i10, null);
        this.n.setOnClickListener(new View.OnClickListener(this) {
            public final fu8 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                String str;
                byte b = r2;
                fu8 fu8Var = this.b;
                switch (b) {
                    case 0:
                        fu8Var.Z(au8.f(((Integer) view.getTag()).intValue()), true, null);
                        return;
                    default:
                        au8 au8Var = fu8Var.x;
                        if (au8Var != null) {
                            int i32 = au8Var.a;
                            int i42 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr2 = fu8Var.a;
                                if (i42 < editTextBoldCursorArr2.length) {
                                    if ((i32 != 1 || i42 != 4) && (i32 != 2 || (i42 != 2 && i42 != 3))) {
                                        if (i42 == 0) {
                                            str = fu8Var.x.b;
                                        } else if (i42 == 1) {
                                            int i52 = fu8Var.x.c;
                                            if (i52 != 0) {
                                                str = Integer.toString(i52);
                                            }
                                            str = null;
                                        } else if (i42 == 2) {
                                            str = fu8Var.x.d;
                                        } else if (i42 == 3) {
                                            str = fu8Var.x.e;
                                        } else {
                                            if (i42 == 4) {
                                                str = fu8Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            try {
                                                fu8Var.a[i42].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                fu8Var.a[i42].setText(str);
                                            }
                                        } else {
                                            fu8Var.a[i42].setText((CharSequence) null);
                                        }
                                    }
                                    i42++;
                                } else {
                                    EditTextBoldCursor editTextBoldCursor5 = editTextBoldCursorArr2[0];
                                    editTextBoldCursor5.setSelection(editTextBoldCursor5.length());
                                    fu8Var.Z(i32, true, new on7(fu8Var, i32, (byte) 7));
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
        this.c.addView(this.n, 0, nme.o(-1, -2));
        this.n.setVisibility(8);
        b9a b9aVar2 = new b9a(this.fragmentView.getContext(), (de9) null);
        b9aVarArr[2] = b9aVar2;
        this.c.addView(b9aVar2, 1, nme.o(-1, -2));
        b9aVarArr[2].setVisibility(8);
        uib uibVar2 = new uib(context);
        this.h = uibVar2;
        ff0 L02 = bkb.L0(true);
        vkb M3 = zkb.M(i8);
        vkb M4 = zkb.M(i9);
        uibVar2.setBackground(L02);
        zkb.j(uibVar2, L02, M3, M4, null);
        this.h.b(k96.M0(2131745267, null), false);
        zkb.X(this.h.getTextView(), i10, null);
        this.c.addView(this.h, nme.o(-1, -2));
        this.h.setOnClickListener(new v16(this, context, (byte) 26));
        b9a b9aVar3 = new b9a(context, (de9) null);
        b9aVarArr[1] = b9aVar3;
        this.c.addView(b9aVar3, nme.o(-1, -2));
        this.I = (ClipboardManager) context.getSystemService("clipboard");
        this.G = true;
        this.E = 1.0f;
        Y(false);
        this.w = 0;
        Z(fbaVar.a.a, false, null);
        this.x = null;
        this.y = null;
        b0();
        return this.fragmentView;
    }

    @Override
    public final tu9 getScrollViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.r8));
        arrayList.add(new blb(this.d, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        for (int i = 0; i < this.s.length; i++) {
        }
        if (this.a != null) {
            int i2 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i2 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new blb(editTextBoldCursorArr[i2], 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.G6));
                arrayList.add(new blb(this.a[i2], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.K6));
                i2++;
            }
        } else {
            arrayList.add(new blb((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.F6));
            arrayList.add(new blb((View) null, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.G6));
        }
        arrayList.add(new blb((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        int i3 = 0;
        while (true) {
            b9a[] b9aVarArr = this.e;
            if (i3 >= b9aVarArr.length) {
                break;
            }
            b9a b9aVar = b9aVarArr[i3];
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
        gl.W2(getParentActivity(), this.classGuid);
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
                    i = bkb.p6;
                } else {
                    i = bkb.y6;
                }
                zkb.X(textView, i, null);
            }
            c0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && !z2 && this.J) {
            this.a[0].requestFocus();
            gl.F3(this.a[0]);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
