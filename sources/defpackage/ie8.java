package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ie8 extends d implements gk7, bja {
    public TLRPC.MessageMedia A0;
    public boolean B0;
    public boolean C0;
    public int E;
    public CharSequence F;
    public Editable G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final byte O;
    public int P;
    public boolean Q;
    public dbb R;
    public t14 S;
    public mv5 T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public int Y;
    public boolean Z;
    public r7 a;
    public int a0;
    public ge8 b;
    public boolean b0;
    public rkb c;
    public le8 c0;
    public t26 d;
    public final boolean d0;
    public ay0 e;
    public final boolean e0;
    public final mu1 f;
    public he8 f0;
    public boolean g0;
    public ke5 h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public final int n;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int[] r;
    public int r0;
    public int s;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public final CharSequence[] w;
    public int w0;
    public final boolean[] x;
    public int x0;
    public int y;
    public int y0;
    public final bg7 z0;

    public ie8(mu1 mu1Var) {
        super(null);
        this.E = 1;
        this.H = true;
        this.I = false;
        this.K = true;
        this.P = gl.L(3.0f);
        this.h0 = -1;
        this.z0 = new bg7(this, (byte) 8);
        this.e0 = true;
        int f = getMessagesController().k4.x3.f();
        this.n = f;
        this.w = new CharSequence[f];
        this.x = new boolean[f];
        this.f = mu1Var;
        this.d0 = y6c.h(j5.a(this.currentAccount).a).p();
        this.M = false;
        this.O = (byte) 2;
    }

    public static a d0(ie8 ie8Var) {
        return ie8Var.actionBar;
    }

    public static a e0(ie8 ie8Var) {
        return ie8Var.actionBar;
    }

    @Override
    public final void L(int i, boolean z) {
        boolean z2;
        boolean z3;
        int i2;
        int L;
        if (this.d0) {
            if (i > gl.L(50.0f) && this.Z && !gl.E && !gl.O1()) {
                if (z) {
                    this.Y = i;
                    na7.b1().edit().putInt("kbd_height_land3", this.Y).commit();
                } else {
                    this.X = i;
                    na7.b1().edit().putInt("kbd_height", this.X).commit();
                }
            }
            if (this.Q) {
                if (z) {
                    i2 = this.Y;
                } else {
                    i2 = this.X;
                }
                if (this.C0) {
                    i2 += gl.L(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.S.getLayoutParams();
                int i3 = layoutParams.width;
                int i4 = gl.q.x;
                if (i3 != i4 || layoutParams.height != i2 || this.B0 != this.C0) {
                    layoutParams.width = i4;
                    layoutParams.height = i2;
                    this.S.setLayoutParams(layoutParams);
                    this.W = layoutParams.height;
                    this.T.a();
                    this.e.requestLayout();
                    boolean z4 = this.B0;
                    if (z4 != this.C0) {
                        if (z4) {
                            L = -gl.L(120.0f);
                        } else {
                            L = gl.L(120.0f);
                        }
                        h0(L);
                    }
                    this.B0 = this.C0;
                }
            }
            if (this.a0 != i || this.b0 != z) {
                this.a0 = i;
                this.b0 = z;
                boolean z5 = this.Z;
                le8 le8Var = this.c0;
                if (le8Var != null) {
                    if (le8Var.getEditField().isFocused() && this.T.c() && i > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.Z = z2;
                } else {
                    this.Z = false;
                    z2 = false;
                }
                if (z2 && this.Q) {
                    t0(0);
                }
                if (this.W != 0 && !(z3 = this.Z) && z3 != z5 && !this.Q) {
                    this.W = 0;
                    this.T.a();
                    this.e.requestLayout();
                }
                if (this.Z && this.U) {
                    this.U = false;
                    gl.r(this.z0);
                }
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.Li));
        hashSet.add(Integer.valueOf(bkb.G6));
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override
    public final View createView(Context context) {
        String upperCase;
        int i;
        int i2;
        zkb.h(bkb.c6, getResourceProvider(), this.actionBar);
        a aVar = this.actionBar;
        int i3 = bkb.F6;
        zkb.l(aVar, 1, i3, getResourceProvider());
        zkb.b(this.actionBar, i3, getResourceProvider(), true);
        zkb.l(this.actionBar, 3, bkb.y8, getResourceProvider());
        zkb.l(this.actionBar, 5, i3, getResourceProvider());
        this.actionBar.setBackButtonImage(2131231243);
        boolean z = this.e0;
        if (z) {
            a aVar2 = this.actionBar;
            if (this.J) {
                i2 = 2131743865;
            } else {
                i2 = 2131743833;
            }
            aVar2.setTitle(k96.M0(i2, null));
        } else {
            a aVar3 = this.actionBar;
            if (this.O == 1) {
                aVar3.setTitle(k96.M0(2131748072, null));
            } else {
                aVar3.setTitle(k96.M0(2131748073, null));
            }
        }
        ui5 ui5Var = this.parentLayout;
        if (ui5Var != null && ((ActionBarLayout) ui5Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ae8(this));
        r6 t = this.actionBar.t();
        if (z) {
            if (this.J) {
                i = 2131743866;
            } else {
                i = 2131743834;
            }
            upperCase = k96.M0(i, null);
        } else {
            upperCase = k96.M0(2131751741, null).toUpperCase();
        }
        this.a = t.e(1, upperCase);
        this.b = new ge8(this, context);
        ay0 ay0Var = new ay0(this, context, (byte) 4);
        this.e = ay0Var;
        ay0Var.setDelegate(this);
        ay0 ay0Var2 = this.e;
        this.fragmentView = ay0Var2;
        zkb.h(bkb.Z6, null, ay0Var2);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.c = new rkb(context, null, (byte) 10);
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33.h);
        gb3Var.n(350L);
        this.c.setItemAnimator(gb3Var);
        this.c.setVerticalScrollBarEnabled(false);
        ((gb3) this.c.getItemAnimator()).C = false;
        t26 t26Var = new t26(1, false);
        this.d = t26Var;
        this.c.setLayoutManager(t26Var);
        new is5(new r10(this, (byte) 5)).h(this.c);
        frameLayout.addView(this.c, nme.e(-1, -1, 51));
        this.c.setAdapter(this.b);
        this.c.setOnItemClickListener(new bf4(this, (byte) 20));
        this.c.setOnScrollListener(new n58(this, (byte) 1));
        ke5 ke5Var = new ke5(context, 4);
        this.h = ke5Var;
        ke5Var.setText(k96.M0(2131746962, null));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, nme.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.d0) {
            kk7.e().b(this, kk7.k4);
            dbb dbbVar = new dbb(context, this.currentAccount, null, this.resourceProvider);
            this.R = dbbVar;
            dbbVar.E = true;
            dbbVar.F = true;
            dbbVar.setHorizontalPadding(gl.L(24.0f));
            frameLayout.addView(this.R, nme.e(-2, 160, 51));
        }
        this.T = new mv5(this.e, false, null);
        j0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k4) {
            t14 t14Var = this.S;
            if (t14Var != null) {
                t14Var.Q.h1();
            }
            le8 le8Var = this.c0;
            if (le8Var != null) {
                int currentTextColor = le8Var.getEditField().getCurrentTextColor();
                this.c0.getEditField().setTextColor(-1);
                this.c0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void g0() {
        int i;
        dbb dbbVar = this.R;
        if (dbbVar != null) {
            dbbVar.setDelegate(null);
            this.R.e();
        }
        int i2 = this.E;
        this.x[i2] = false;
        int i3 = i2 + 1;
        this.E = i3;
        if (this.r != null) {
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                int[] iArr2 = this.r;
                if (i4 < iArr2.length) {
                    i = iArr2[i4];
                } else {
                    i = this.s + 1;
                    this.s = i;
                }
                iArr[i4] = i;
            }
            this.r = iArr;
        }
        if (this.E == this.w.length) {
            this.b.r(this.p0);
        }
        this.b.i(this.p0);
        u0();
        this.g0 = false;
        this.h0 = (this.o0 + this.E) - 1;
        this.b.g(this.q0);
    }

    public final void h0(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new rm1(this, f, (byte) 5));
        ofFloat.addListener(new be8(this, (byte) 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(gb.w);
        ofFloat.start();
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        if (this.h0 < 0) {
            return true;
        }
        return false;
    }

    public final boolean i0(boolean z) {
        int i;
        int i2;
        boolean z2;
        TLRPC.MessageMedia messageMedia = this.A0;
        boolean z3 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.w;
        boolean z4 = false;
        if (z3) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i3 = 0;
            for (int i4 = 0; i4 < Math.min(this.E, charSequenceArr.length); i4++) {
                if (!TextUtils.isEmpty(charSequenceArr[i4])) {
                    i3++;
                }
            }
            if ((!this.J && !TextUtils.equals(todoList.title.text, k62.Y(this.F))) || i3 != todoList.list.size()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                for (int i5 = 0; i5 < i3; i5++) {
                    if (!TextUtils.equals(charSequenceArr[i5].toString(), todoList.list.get(i5).title.text)) {
                        break;
                    }
                }
            }
            z4 = z2;
        } else {
            boolean isEmpty = TextUtils.isEmpty(k62.Y(this.F));
            if (isEmpty) {
                for (int i6 = 0; i6 < this.E && (isEmpty = TextUtils.isEmpty(k62.Y(charSequenceArr[i6]))); i6++) {
                }
            }
            z4 = isEmpty;
        }
        if (z && !z4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z5 = this.e0;
            if (z5) {
                i = 2131752555;
            } else {
                i = 2131752561;
            }
            String M0 = k96.M0(i, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            if (z5) {
                i2 = 2131752556;
            } else {
                i2 = 2131752562;
            }
            hdVar.U = k96.M0(i2, null);
            alertDialog$Builder.j(k96.M0(2131747387, null), new k88(this, (byte) 2));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            showDialog(hdVar);
        }
        return z4;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w0 = bkb.w0(null, bkb.c6, false);
            if (this.actionBar.y()) {
                w0 = bkb.w0(null, bkb.v8, false);
            }
            if (bm2.h(w0) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie8.j0():void");
    }

    public final void k0() {
        if (this.C0) {
            this.S.s(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.S.getLayoutParams();
            layoutParams.height -= gl.L(120.0f);
            this.S.setLayoutParams(layoutParams);
            this.W = layoutParams.height;
            this.B0 = this.C0;
            this.C0 = false;
            h0(-gl.L(120.0f));
        }
    }

    public final void l0(boolean z) {
        if (this.d0) {
            if (this.Q) {
                t14 t14Var = this.S;
                t14Var.Q.D0();
                t14Var.J.scrollTo(0, 0);
                t14Var.E(1);
                t14Var.R.g1(0, 0);
                this.S.s(false);
                if (z) {
                    this.S.z();
                }
                this.C0 = false;
                t0(0);
            }
            if (z) {
                t14 t14Var2 = this.S;
                if (t14Var2 != null && t14Var2.getVisibility() == 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.S.getMeasuredHeight());
                    ofFloat.addUpdateListener(new zd8(this, (byte) 1));
                    ofFloat.addListener(new be8(this, (byte) 2));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(gb.w);
                    ofFloat.start();
                    return;
                }
                m0();
            }
        }
    }

    public final void m0() {
        t14 t14Var;
        qy1 emojiButton;
        if (!this.Q && (t14Var = this.S) != null && t14Var.getVisibility() != 8) {
            le8 le8Var = this.c0;
            if (le8Var != null && (emojiButton = le8Var.getEmojiButton()) != null) {
                emojiButton.j(oy1.e, false);
            }
            this.S.setVisibility(8);
        }
        int i = this.W;
        this.W = 0;
        if (i != 0) {
            this.T.a();
        }
    }

    public final void n0(le8 le8Var, boolean z) {
        s49 T;
        if (this.d0 && z) {
            if (this.c0 == le8Var && this.Q && this.C0) {
                k0();
                this.Q = false;
            }
            le8 le8Var2 = this.c0;
            this.c0 = le8Var;
            le8Var.setEmojiButtonVisibility(true);
            qy1 emojiButton = le8Var.getEmojiButton();
            oy1 oy1Var = oy1.e;
            emojiButton.j(oy1Var, false);
            rkb rkbVar = this.c;
            View F = rkbVar.F(le8Var);
            if (F == null) {
                T = null;
            } else {
                T = rkbVar.T(F);
            }
            dbb dbbVar = this.R;
            if (dbbVar != null) {
                dbbVar.e();
                dbb dbbVar2 = this.R;
                if (dbbVar2 != null && T != null) {
                    View view = T.a;
                    if ((view instanceof le8) && dbbVar2.getDelegate() != view) {
                        this.R.setDelegate((le8) view);
                    }
                }
            }
            if (le8Var2 != null && le8Var2 != le8Var) {
                if (this.Q) {
                    k0();
                    l0(false);
                    p0();
                }
                le8Var2.setEmojiButtonVisibility(false);
                le8Var2.getEmojiButton().j(oy1Var, false);
            }
        }
    }

    public final void o0(le8 le8Var) {
        this.c0 = le8Var;
        if (this.Q) {
            k0();
            p0();
            return;
        }
        t0(1);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.Q) {
            if (z) {
                l0(true);
                return false;
            }
            return false;
        }
        return i0(z);
    }

    @Override
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (this.g0 && this.h0 >= 0) {
            int i = 0;
            while (true) {
                if (i < this.c.getChildCount()) {
                    view = this.c.getChildAt(i);
                    this.c.getClass();
                    if (RecyclerView.R(view) == this.h0) {
                        break;
                    }
                    i++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view instanceof le8) {
                gl.e3(new l(((le8) view).getTextView(), (byte) 8), 300L);
                this.h0 = -1;
            }
            this.g0 = false;
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        u0();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.V = true;
        if (this.d0) {
            kk7.e().n(this, kk7.k4);
            t14 t14Var = this.S;
            if (t14Var != null) {
                this.e.removeView(t14Var);
            }
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        if (this.d0) {
            l0(false);
            dbb dbbVar = this.R;
            if (dbbVar != null) {
                dbbVar.e();
            }
            le8 le8Var = this.c0;
            if (le8Var != null) {
                le8Var.setEmojiButtonVisibility(false);
                this.c0.getTextView().clearFocus();
                gl.t1(this.c0.getEditField());
            }
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ge8 ge8Var = this.b;
        if (ge8Var != null) {
            ge8Var.f();
        }
        gl.W2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        int i;
        py pyVar;
        float f;
        super.onThemeColorsChanged();
        try {
            rkb rkbVar = this.c;
            if (rkbVar != null) {
                for (int i2 = 0; i2 < rkbVar.getChildCount(); i2++) {
                    View childAt = rkbVar.getChildAt(i2);
                    s49 T = rkbVar.T(childAt);
                    if (T != null && (((i = T.f) == 4 || i == 5) && (childAt instanceof le8) && (pyVar = ((le8) childAt).d) != null)) {
                        int themedColor = getThemedColor(bkb.F6);
                        if (pyVar.isEnabled()) {
                            f = 1.0f;
                        } else {
                            f = 0.6f;
                        }
                        pyVar.setTextColor(bkb.p1(f, themedColor));
                    }
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void p0() {
        int i;
        this.T.e = true;
        EditTextBoldCursor editField = this.c0.getEditField();
        editField.requestFocus();
        gl.F3(editField);
        if (gl.D) {
            i = 0;
        } else {
            i = 2;
        }
        t0(i);
        if (!gl.D && !this.Z && !gl.E && !gl.O1()) {
            this.U = true;
            bg7 bg7Var = this.z0;
            gl.r(bg7Var);
            gl.e3(bg7Var, 100L);
        }
    }

    public final void q0(TLRPC.MessageMedia messageMedia, boolean z) {
        r0(messageMedia, z, -1);
    }

    public final void r0(TLRPC.MessageMedia messageMedia, boolean z, int i) {
        int i2;
        TLRPC.TodoList todoList;
        int i3;
        this.A0 = messageMedia;
        this.J = z;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(gl.L(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.F = spannableStringBuilder;
            CharSequence m = vu3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
            this.F = m;
            Spannable A5 = k27.A5(m, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt(), false);
            this.F = A5;
            k27.b(A5, tL_messageMediaToDo.todo.title.entities, false, false, false, false, 0);
            int size = tL_messageMediaToDo.todo.list.size();
            this.E = size;
            this.y = size;
            this.s = 0;
            this.r = new int[size];
            int i4 = 0;
            while (true) {
                i2 = this.E;
                todoList = tL_messageMediaToDo.todo;
                if (i4 >= i2) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = todoList.list.get(i4).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.w;
                charSequenceArr[i4] = spannableStringBuilder2;
                CharSequence m2 = vu3.m(spannableStringBuilder2, textPaint.getFontMetricsInt(), false, null, 0);
                charSequenceArr[i4] = m2;
                Spannable A52 = k27.A5(m2, tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
                charSequenceArr[i4] = A52;
                k27.b(A52, tL_textWithEntities.entities, false, false, false, false, 0);
                this.r[i4] = tL_messageMediaToDo.todo.list.get(i4).id;
                this.s = Math.max(this.s, this.r[i4]);
                i4++;
            }
            this.K = todoList.others_can_complete;
            this.I = todoList.others_can_append;
            if (this.J) {
                this.E = i2 + 1;
                u0();
                this.g0 = true;
                int i5 = this.o0;
                if (i < 0) {
                    i3 = this.E - 1;
                } else {
                    i3 = i;
                }
                this.h0 = i5 + i3;
            }
        }
    }

    public final void s0(int i, View view) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (view instanceof le8) {
            le8 le8Var = (le8) view;
            int i9 = this.j0;
            boolean z = this.e0;
            if (i == i9) {
                if (z) {
                    i5 = getMessagesController().k4.H2.f();
                } else {
                    i5 = 255;
                }
                CharSequence charSequence = this.F;
                if (charSequence != null) {
                    i8 = charSequence.length();
                } else {
                    i8 = 0;
                }
                i4 = i5 - i8;
            } else if (i == this.k0) {
                Editable editable = this.G;
                if (editable != null) {
                    i6 = editable.length();
                } else {
                    i6 = 0;
                }
                i5 = 200;
                i4 = 200 - i6;
            } else {
                int i10 = this.o0;
                if (i >= i10 && i < this.E + i10) {
                    int i11 = i - i10;
                    if (z) {
                        i2 = getMessagesController().k4.I2.f();
                    } else {
                        i2 = 100;
                    }
                    CharSequence charSequence2 = this.w[i11];
                    if (charSequence2 != null) {
                        i3 = charSequence2.length();
                    } else {
                        i3 = 0;
                    }
                    i4 = i2 - i3;
                    i5 = i2;
                } else {
                    return;
                }
            }
            float f = i5;
            if (i4 <= f - (0.7f * f)) {
                le8Var.setText2(String.format("%d", Integer.valueOf(i4)));
                jia textView2 = le8Var.getTextView2();
                if (i4 < 0) {
                    i7 = bkb.o7;
                } else {
                    i7 = bkb.z6;
                }
                zkb.W(textView2, i7, null);
                textView2.setTag(Integer.valueOf(i7));
                return;
            }
            le8Var.setText2("");
        }
    }

    public final void t0(int i) {
        boolean z;
        le8 le8Var;
        if (this.d0) {
            if (i == 1) {
                t14 t14Var = this.S;
                if (t14Var != null && t14Var.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                t14 t14Var2 = this.S;
                if (t14Var2 != null && t14Var2.d1 != y6c.t0) {
                    this.e.removeView(t14Var2);
                    t14Var2 = null;
                    this.S = null;
                }
                if (t14Var2 == null) {
                    t14 t14Var3 = new t14(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                    this.S = t14Var3;
                    t14Var3.x2 = false;
                    t14Var3.V0 = false;
                    t14Var3.setVisibility(8);
                    if (gl.O1()) {
                        this.S.setForseMultiwindowLayout(true);
                    }
                    this.S.setDelegate(new ce8(this));
                    this.e.addView(this.S);
                }
                this.S.setVisibility(0);
                this.Q = true;
                t14 t14Var4 = this.S;
                if (this.X <= 0) {
                    if (gl.O1()) {
                        this.X = gl.L(150.0f);
                    } else {
                        this.X = na7.b1().getInt("kbd_height", gl.L(200.0f));
                    }
                }
                int i2 = this.Y;
                if (i2 <= 0) {
                    if (gl.O1()) {
                        i2 = gl.L(150.0f);
                        this.Y = i2;
                    } else {
                        i2 = na7.b1().getInt("kbd_height_land3", gl.L(200.0f));
                        this.Y = i2;
                    }
                }
                Point point = gl.q;
                if (point.x <= point.y) {
                    i2 = this.X;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t14Var4.getLayoutParams();
                layoutParams.height = i2;
                t14Var4.setLayoutParams(layoutParams);
                if (!gl.E && !gl.O1() && (le8Var = this.c0) != null) {
                    gl.t1(le8Var.getEditField());
                }
                this.W = i2;
                this.T.a();
                this.e.requestLayout();
                qy1 emojiButton = this.c0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(oy1.d, true);
                }
                if (!z && !this.Z) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, 0.0f);
                    ofFloat.addUpdateListener(new zd8(this, (byte) 0));
                    ofFloat.addListener(new be8(this, (byte) 1));
                    ofFloat.setDuration(250L);
                    ofFloat.setInterpolator(gb.w);
                    ofFloat.start();
                    return;
                }
                return;
            }
            qy1 emojiButton2 = this.c0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(oy1.e, true);
            }
            t14 t14Var5 = this.S;
            if (t14Var5 != null) {
                this.Q = false;
                this.C0 = false;
                if (gl.D || gl.E) {
                    t14Var5.setVisibility(8);
                }
            }
            if (i == 0) {
                this.W = 0;
            }
            this.T.a();
            this.e.requestLayout();
        }
    }

    public final void u0() {
        this.i0 = -1;
        this.j0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.s0 = -1;
        this.t0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.u0 = -1;
        this.x0 = -1;
        this.r0 = -1;
        int i = 0;
        this.y0 = 0;
        boolean z = this.e0;
        if (!z || !this.J) {
            this.i0 = 0;
            this.j0 = 1;
            this.m0 = 2;
            this.y0 = 4;
            this.n0 = 3;
            i = 4;
        }
        int i2 = this.E;
        if (i2 != 0) {
            this.o0 = i;
            i += i2;
            this.y0 = i;
        }
        if (i2 != this.w.length) {
            int i3 = i + 1;
            this.y0 = i3;
            this.p0 = i;
            i = i3;
        }
        int i4 = i + 1;
        this.y0 = i4;
        this.q0 = i;
        if (!z || !this.J) {
            int i5 = i + 2;
            this.y0 = i5;
            this.r0 = i4;
            if (z) {
                int i6 = i + 3;
                this.y0 = i6;
                this.w0 = i5;
                if (this.K) {
                    this.y0 = i + 4;
                    this.v0 = i6;
                    return;
                }
                return;
            }
            TLRPC.Chat chat = this.f.e;
            if (!hc2.T(chat) || chat.megagroup) {
                int i7 = this.y0;
                this.y0 = i7 + 1;
                this.s0 = i7;
            }
            byte b = this.O;
            if (b != 1) {
                int i8 = this.y0;
                this.y0 = i8 + 1;
                this.t0 = i8;
            }
            if (b == 0) {
                int i9 = this.y0;
                this.y0 = i9 + 1;
                this.u0 = i9;
            }
            int i10 = this.y0;
            int i11 = i10 + 1;
            this.y0 = i11;
            this.x0 = i10;
            if (this.M) {
                this.k0 = i11;
                this.y0 = i10 + 3;
                this.l0 = i10 + 2;
            }
        }
    }
}
