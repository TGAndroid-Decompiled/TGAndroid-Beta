package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;
public final class g48 extends d implements gk7 {
    public final boolean E;
    public final boolean F;
    public final mu1 G;
    public byte H;
    public boolean I;
    public m8 J;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K;
    public a8[] L;
    public FrameLayout M;
    public rt3 N;
    public oc6 O;
    public ImageView P;
    public e48 Q;
    public sb R;
    public View S;
    public final TextPaint T;
    public final RectF U;
    public final Paint V;
    public f48 W;
    public Editable a;
    public final HashMap b;
    public final ArrayList c;
    public ArrayList d;
    public boolean e;
    public byte f;
    public o39 h;
    public s20 n;
    public FrameLayout r;
    public TextView s;
    public boolean w;
    public final byte x;
    public boolean y;

    public g48(int i, boolean z, boolean z2, mu1 mu1Var) {
        super(null);
        this.b = new HashMap();
        this.c = new ArrayList();
        this.d = null;
        this.e = false;
        this.f = (byte) 2;
        this.y = true;
        this.I = true;
        this.T = new TextPaint(1);
        this.U = new RectF();
        this.V = new Paint(1);
        this.G = mu1Var;
        this.x = i;
        this.E = z;
        this.F = z2;
    }

    public final void Y(xl6 xl6Var) {
        if (xl6Var != null) {
            u58 u58Var = new u58(0, xl6Var, this.b, this.c, this.x, this.F, this.G, false);
            Editable text = this.N.getText();
            this.a = text;
            u58Var.d = text;
            rt3 rt3Var = u58Var.e0;
            if (rt3Var != null) {
                rt3Var.setText(text);
            }
            u58Var.t0 = new z24(this, (byte) 23);
            u58Var.j0(this.H, this.I);
            presentFragment(u58Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        boolean z = this.E;
        byte b = this.x;
        boolean z2 = this.F;
        if (z) {
            b68 b68Var = new b68(hashMap, arrayList, b, z2, this.G);
            Editable text2 = this.N.getText();
            this.a = text2;
            u58 u58Var2 = b68Var.a;
            if (u58Var2 != null) {
                u58Var2.d = text2;
                rt3 rt3Var2 = u58Var2.e0;
                if (rt3Var2 != null) {
                    rt3Var2.setText(text2);
                }
            }
            d48 d48Var = new d48(this, hashMap, arrayList, (byte) 1);
            u58Var2.t0 = d48Var;
            u58 u58Var3 = b68Var.b;
            u58Var3.t0 = d48Var;
            u58Var2.u0 = new s34(b68Var, (byte) 23);
            u58Var3.u0 = new pj4(b68Var, (byte) 24);
            byte b2 = this.H;
            boolean z3 = this.I;
            u58Var2.j0(b2, z3);
            u58Var3.j0(b2, z3);
            presentFragment(b68Var);
            return;
        }
        u58 u58Var4 = new u58(0, xl6Var, hashMap, arrayList, b, z2, this.G, false);
        Editable text3 = this.N.getText();
        this.a = text3;
        u58Var4.d = text3;
        rt3 rt3Var3 = u58Var4.e0;
        if (rt3Var3 != null) {
            rt3Var3.setText(text3);
        }
        u58Var4.t0 = new d48(this, hashMap, arrayList, (byte) 0);
        u58Var4.j0(this.H, this.I);
        presentFragment(u58Var4);
    }

    public final void Z(HashMap hashMap, ArrayList arrayList, boolean z, int i) {
        if (!hashMap.isEmpty() && this.W != null && !this.w) {
            this.w = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Object obj = hashMap.get(arrayList.get(i2));
                ?? obj2 = new Object();
                arrayList2.add(obj2);
                String str = null;
                if (obj instanceof jm6) {
                    jm6 jm6Var = (jm6) obj;
                    String str2 = jm6Var.h;
                    if (str2 != null) {
                        obj2.c = str2;
                    } else {
                        obj2.c = jm6Var.I;
                    }
                    obj2.e = jm6Var.c;
                    obj2.f = jm6Var.g;
                    obj2.k = jm6Var.s;
                    obj2.o = jm6Var.b;
                    CharSequence charSequence = jm6Var.a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.i = jm6Var.n;
                    obj2.j = jm6Var.r;
                    obj2.h = jm6Var.x;
                } else if (obj instanceof nm6) {
                    nm6 nm6Var = (nm6) obj;
                    String str3 = nm6Var.h;
                    if (str3 != null) {
                        obj2.c = str3;
                    } else {
                        obj2.l = nm6Var;
                    }
                    obj2.e = nm6Var.c;
                    obj2.f = nm6Var.g;
                    obj2.k = nm6Var.s;
                    CharSequence charSequence2 = nm6Var.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.i = nm6Var.n;
                    obj2.j = nm6Var.r;
                    obj2.h = nm6Var.x;
                    TLRPC.BotInlineResult botInlineResult = nm6Var.N;
                    if (botInlineResult != null && nm6Var.H) {
                        obj2.m = botInlineResult;
                        obj2.n = nm6Var.O;
                    }
                    System.currentTimeMillis();
                }
            }
            this.W.e(arrayList2);
        }
    }

    public final void a0(boolean z) {
        boolean z2;
        Integer num;
        float f;
        float f2;
        float f3;
        float f4;
        float L;
        if (this.M.getTag() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            return;
        }
        FrameLayout frameLayout = this.M;
        if (z) {
            num = 1;
        } else {
            num = null;
        }
        frameLayout.setTag(num);
        if (this.N.getEditText().isFocused()) {
            gl.t1(this.N.getEditText());
        }
        this.N.k(true);
        FrameLayout frameLayout2 = this.M;
        if (z) {
            frameLayout2.setVisibility(0);
            this.O.setVisibility(0);
        } else {
            frameLayout2.setVisibility(4);
            this.O.setVisibility(4);
        }
        oc6 oc6Var = this.O;
        float f5 = 0.2f;
        float f6 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.2f;
        }
        oc6Var.setScaleX(f);
        oc6 oc6Var2 = this.O;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.2f;
        }
        oc6Var2.setScaleY(f2);
        oc6 oc6Var3 = this.O;
        float f7 = 0.0f;
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        oc6Var3.setAlpha(f3);
        sb sbVar = this.R;
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = 0.2f;
        }
        sbVar.setScaleX(f4);
        sb sbVar2 = this.R;
        if (z) {
            f5 = 1.0f;
        }
        sbVar2.setScaleY(f5);
        sb sbVar3 = this.R;
        if (!z) {
            f6 = 0.0f;
        }
        sbVar3.setAlpha(f6);
        FrameLayout frameLayout3 = this.M;
        if (z) {
            L = 0.0f;
        } else {
            L = gl.L(48.0f);
        }
        frameLayout3.setTranslationY(L);
        View view = this.S;
        if (!z) {
            f7 = gl.L(48.0f);
        }
        view.setTranslationY(f7);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.ca));
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        a aVar = this.actionBar;
        int i = bkb.g5;
        zkb.h(i, null, aVar);
        a aVar2 = this.actionBar;
        int i2 = bkb.i5;
        zkb.l(aVar2, 5, i2, null);
        zkb.l(this.actionBar, 1, i2, null);
        zkb.l(this.actionBar, 3, bkb.H5, null);
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 17));
        r6 t = this.actionBar.t();
        if (this.y) {
            t.a(2, 2131232491).setContentDescription(k96.M0(2131745644, null));
        }
        r7 a = t.a(0, 2131231247);
        a.setContentDescription(k96.M0(2131754838, null));
        a.e(1, 2131232270, k96.M0(2131747603, null));
        e48 e48Var = new e48(this, context);
        this.Q = e48Var;
        zkb.h(i, null, e48Var);
        this.fragmentView = this.Q;
        this.actionBar.setTitle(k96.M0(2131750468, null));
        o39 o39Var = new o39(context, null);
        this.h = o39Var;
        o39Var.setPadding(gl.L(6.0f), gl.L(4.0f), gl.L(6.0f), gl.L(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new t26(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.Q.addView(this.h, nme.e(-1, -1, 51));
        o39 o39Var2 = this.h;
        s20 s20Var = new s20(this, context, (byte) 10);
        this.n = s20Var;
        o39Var2.setAdapter(s20Var);
        zkb.H(this.h, i, null);
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextColor(-8355712);
        this.s.setTextSize(1, 20.0f);
        this.s.setGravity(17);
        this.s.setVisibility(8);
        this.s.setText(k96.M0(2131747988, null));
        this.Q.addView(this.s, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.s.setOnTouchListener(new jz1((byte) 18));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(8);
        this.Q.addView(this.r, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.r.addView(radialProgressView, nme.e(-2, -2, 17));
        View view = new View(context);
        this.S = view;
        view.setBackgroundResource(2131231241);
        this.S.setTranslationY(gl.L(48.0f));
        this.Q.addView(this.S, nme.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        zkb.h(i, null, frameLayout2);
        this.M.setVisibility(4);
        this.M.setTranslationY(gl.L(48.0f));
        this.Q.addView(this.M, nme.e(-1, 48, 83));
        this.M.setOnTouchListener(new jz1((byte) 19));
        rt3 rt3Var = this.N;
        if (rt3Var != null) {
            rt3Var.o();
        }
        this.N = new rt3(context, this.Q, null, 1, false, null);
        this.N.setFilters(new InputFilter[]{new InputFilter.LengthFilter(na7.q1(y6c.t0).F0())});
        this.N.setHint(k96.M0(2131754451, null));
        gt3 editText = this.N.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.M.addView(this.N, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        Editable editable = this.a;
        if (editable != null) {
            this.N.setText(editable);
        }
        oc6 oc6Var = new oc6((byte) 5, context, this);
        this.O = oc6Var;
        oc6Var.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        this.O.setVisibility(4);
        this.O.setScaleX(0.2f);
        this.O.setScaleY(0.2f);
        this.O.setAlpha(0.0f);
        this.Q.addView(this.O, nme.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.P = new ImageView(context);
        this.P.setBackgroundDrawable(bkb.h0(gl.L(56.0f), bkb.w0(null, bkb.R5, false), bkb.w0(null, bkb.S5, false)));
        this.P.setImageResource(2131230876);
        this.P.setImportantForAccessibility(2);
        zkb.s(this.P, bkb.T5, null, PorterDuff.Mode.MULTIPLY);
        this.P.setScaleType(ImageView.ScaleType.CENTER);
        this.P.setOutlineProvider(new xi((byte) 8));
        this.O.addView(this.P, nme.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.P.setOnClickListener(new fr7(this, (byte) 9));
        this.P.setOnLongClickListener(new zs(this, (byte) 8));
        TextPaint textPaint = this.T;
        textPaint.setTextSize(gl.L(12.0f));
        textPaint.setTypeface(gl.o());
        sb sbVar = new sb((byte) 23, context, this);
        this.R = sbVar;
        sbVar.setAlpha(0.0f);
        this.R.setScaleX(0.2f);
        this.R.setScaleY(0.2f);
        this.Q.addView(this.R, nme.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.x != 0) {
            this.N.setVisibility(8);
        }
        if (this.e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.r.setVisibility(8);
            this.h.setEmptyView(this.s);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.q2) {
            if (this.classGuid == ((Integer) objArr[0]).intValue()) {
                byte b = this.x;
                if (b != 1 && b != 2 && b != 10 && this.y) {
                    this.d = (ArrayList) objArr[1];
                } else {
                    this.d = (ArrayList) objArr[2];
                }
                FrameLayout frameLayout = this.r;
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
                o39 o39Var = this.h;
                if (o39Var != null && o39Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.s);
                }
                s20 s20Var = this.n;
                if (s20Var != null) {
                    s20Var.f();
                }
                this.e = false;
            }
        } else if (i == kk7.s) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.h, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.W9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        rt3 rt3Var = this.N;
        if (rt3Var != null && rt3Var.e) {
            if (z) {
                rt3Var.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        o39 o39Var = this.h;
        if (o39Var != null) {
            o39Var.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 7));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        ArrayList arrayList;
        byte b = this.x;
        boolean z = true;
        if (b != 1 && b != 2 && b != 10 && this.y) {
            arrayList = MediaController.c2;
            this.d = arrayList;
        } else {
            arrayList = MediaController.d2;
            this.d = arrayList;
        }
        if (arrayList != null) {
            z = false;
        }
        this.e = z;
        MediaController.N(this.classGuid);
        kk7.e().b(this, kk7.q2);
        kk7.f(this.currentAccount).b(this, kk7.s);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        rt3 rt3Var = this.N;
        if (rt3Var != null) {
            rt3Var.o();
        }
        kk7.e().n(this, kk7.q2);
        kk7.f(this.currentAccount).n(this, kk7.s);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        s20 s20Var = this.n;
        if (s20Var != null) {
            s20Var.f();
        }
        rt3 rt3Var = this.N;
        if (rt3Var != null) {
            rt3Var.s();
        }
        o39 o39Var = this.h;
        if (o39Var != null) {
            o39Var.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 7));
        }
    }
}
