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
public final class j68 extends d implements jm7 {
    public final boolean E;
    public final boolean F;
    public final yv1 G;
    public byte H;
    public boolean I;
    public m8 J;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K;
    public a8[] L;
    public FrameLayout M;
    public cv3 N;
    public ne6 O;
    public ImageView P;
    public g68 Q;
    public sb R;
    public View S;
    public final TextPaint T;
    public final RectF U;
    public final Paint V;
    public i68 W;
    public Editable a;
    public final HashMap b;
    public final ArrayList c;
    public ArrayList d;
    public boolean e;
    public byte f;
    public r59 h;
    public s30 n;
    public FrameLayout r;
    public TextView s;
    public boolean w;
    public final byte x;
    public boolean y;

    public j68(int i, boolean z, boolean z2, yv1 yv1Var) {
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
        this.G = yv1Var;
        this.x = i;
        this.E = z;
        this.F = z2;
    }

    public final void Z(yn6 yn6Var) {
        if (yn6Var != null) {
            w78 w78Var = new w78(0, yn6Var, this.b, this.c, this.x, this.F, this.G, false);
            Editable text = this.N.getText();
            this.a = text;
            w78Var.d = text;
            cv3 cv3Var = w78Var.e0;
            if (cv3Var != null) {
                cv3Var.setText(text);
            }
            w78Var.t0 = new ai4(this, (byte) 20);
            w78Var.k0(this.H, this.I);
            presentFragment(w78Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        boolean z = this.E;
        byte b = this.x;
        boolean z2 = this.F;
        if (z) {
            d88 d88Var = new d88(hashMap, arrayList, b, z2, this.G);
            Editable text2 = this.N.getText();
            this.a = text2;
            w78 w78Var2 = d88Var.a;
            if (w78Var2 != null) {
                w78Var2.d = text2;
                cv3 cv3Var2 = w78Var2.e0;
                if (cv3Var2 != null) {
                    cv3Var2.setText(text2);
                }
            }
            f68 f68Var = new f68(this, hashMap, arrayList, (byte) 1);
            w78Var2.t0 = f68Var;
            w78 w78Var3 = d88Var.b;
            w78Var3.t0 = f68Var;
            w78Var2.u0 = new fk3(d88Var);
            w78Var3.u0 = new k44(d88Var, (byte) 25);
            byte b2 = this.H;
            boolean z3 = this.I;
            w78Var2.k0(b2, z3);
            w78Var3.k0(b2, z3);
            presentFragment(d88Var);
            return;
        }
        w78 w78Var4 = new w78(0, yn6Var, hashMap, arrayList, b, z2, this.G, false);
        Editable text3 = this.N.getText();
        this.a = text3;
        w78Var4.d = text3;
        cv3 cv3Var3 = w78Var4.e0;
        if (cv3Var3 != null) {
            cv3Var3.setText(text3);
        }
        w78Var4.t0 = new f68(this, hashMap, arrayList, (byte) 0);
        w78Var4.k0(this.H, this.I);
        presentFragment(w78Var4);
    }

    public final void a0(HashMap hashMap, ArrayList arrayList, boolean z, int i) {
        if (!hashMap.isEmpty() && this.W != null && !this.w) {
            this.w = true;
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Object obj = hashMap.get(arrayList.get(i2));
                ?? obj2 = new Object();
                arrayList2.add(obj2);
                String str = null;
                if (obj instanceof jo6) {
                    jo6 jo6Var = (jo6) obj;
                    String str2 = jo6Var.h;
                    if (str2 != null) {
                        obj2.c = str2;
                    } else {
                        obj2.c = jo6Var.I;
                    }
                    obj2.e = jo6Var.c;
                    obj2.f = jo6Var.g;
                    obj2.k = jo6Var.s;
                    obj2.o = jo6Var.b;
                    CharSequence charSequence = jo6Var.a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.i = jo6Var.n;
                    obj2.j = jo6Var.r;
                    obj2.h = jo6Var.x;
                } else if (obj instanceof no6) {
                    no6 no6Var = (no6) obj;
                    String str3 = no6Var.h;
                    if (str3 != null) {
                        obj2.c = str3;
                    } else {
                        obj2.l = no6Var;
                    }
                    obj2.e = no6Var.c;
                    obj2.f = no6Var.g;
                    obj2.k = no6Var.s;
                    CharSequence charSequence2 = no6Var.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.i = no6Var.n;
                    obj2.j = no6Var.r;
                    obj2.h = no6Var.x;
                    TLRPC.BotInlineResult botInlineResult = no6Var.N;
                    if (botInlineResult != null && no6Var.H) {
                        obj2.m = botInlineResult;
                        obj2.n = no6Var.O;
                    }
                    System.currentTimeMillis();
                }
            }
            this.W.m(arrayList2);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.ca));
    }

    public final void b0(boolean z) {
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
            gm.t1(this.N.getEditText());
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
        ne6 ne6Var = this.O;
        float f5 = 0.2f;
        float f6 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.2f;
        }
        ne6Var.setScaleX(f);
        ne6 ne6Var2 = this.O;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.2f;
        }
        ne6Var2.setScaleY(f2);
        ne6 ne6Var3 = this.O;
        float f7 = 0.0f;
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        ne6Var3.setAlpha(f3);
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
            L = gm.L(48.0f);
        }
        frameLayout3.setTranslationY(L);
        View view = this.S;
        if (!z) {
            f7 = gm.L(48.0f);
        }
        view.setTranslationY(f7);
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        a aVar = this.actionBar;
        int i = cmb.g5;
        anb.h(i, null, aVar);
        a aVar2 = this.actionBar;
        int i2 = cmb.i5;
        anb.l(aVar2, 5, i2, null);
        anb.l(this.actionBar, 1, i2, null);
        anb.l(this.actionBar, 3, cmb.H5, null);
        this.actionBar.setBackButtonImage(2131231244);
        this.actionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 18));
        r6 t = this.actionBar.t();
        if (this.y) {
            t.a(2, 2131232503).setContentDescription(jb6.M0(2131745570, null));
        }
        r7 a = t.a(0, 2131231248);
        a.setContentDescription(jb6.M0(2131754838, null));
        a.e(1, 2131232271, jb6.M0(2131747529, null));
        g68 g68Var = new g68(this, context);
        this.Q = g68Var;
        anb.h(i, null, g68Var);
        this.fragmentView = this.Q;
        this.actionBar.setTitle(jb6.M0(2131750417, null));
        r59 r59Var = new r59(context, null);
        this.h = r59Var;
        r59Var.setPadding(gm.L(6.0f), gm.L(4.0f), gm.L(6.0f), gm.L(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new u46(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.Q.addView(this.h, qoe.e(-1, -1, 51));
        r59 r59Var2 = this.h;
        s30 s30Var = new s30(this, context, (byte) 10);
        this.n = s30Var;
        r59Var2.setAdapter(s30Var);
        anb.H(this.h, i, null);
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextColor(-8355712);
        this.s.setTextSize(1, 20.0f);
        this.s.setGravity(17);
        this.s.setVisibility(8);
        this.s.setText(jb6.M0(2131747914, null));
        this.Q.addView(this.s, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.s.setOnTouchListener(new w02((byte) 18));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(8);
        this.Q.addView(this.r, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.r.addView(radialProgressView, qoe.e(-2, -2, 17));
        View view = new View(context);
        this.S = view;
        view.setBackgroundResource(2131231242);
        this.S.setTranslationY(gm.L(48.0f));
        this.Q.addView(this.S, qoe.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        anb.h(i, null, frameLayout2);
        this.M.setVisibility(4);
        this.M.setTranslationY(gm.L(48.0f));
        this.Q.addView(this.M, qoe.e(-1, 48, 83));
        this.M.setOnTouchListener(new w02((byte) 19));
        cv3 cv3Var = this.N;
        if (cv3Var != null) {
            cv3Var.o();
        }
        this.N = new cv3(context, this.Q, null, 1, false, null);
        this.N.setFilters(new InputFilter[]{new InputFilter.LengthFilter(oc7.r1(z8c.t0).G0())});
        this.N.setHint(jb6.M0(2131754451, null));
        qu3 editText = this.N.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.M.addView(this.N, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        Editable editable = this.a;
        if (editable != null) {
            this.N.setText(editable);
        }
        ne6 ne6Var = new ne6((byte) 5, context, this);
        this.O = ne6Var;
        ne6Var.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        this.O.setVisibility(4);
        this.O.setScaleX(0.2f);
        this.O.setScaleY(0.2f);
        this.O.setAlpha(0.0f);
        this.Q.addView(this.O, qoe.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.P = new ImageView(context);
        this.P.setBackgroundDrawable(cmb.h0(gm.L(56.0f), cmb.w0(null, cmb.R5, false), cmb.w0(null, cmb.S5, false)));
        this.P.setImageResource(2131230877);
        this.P.setImportantForAccessibility(2);
        anb.s(this.P, cmb.T5, null, PorterDuff.Mode.MULTIPLY);
        this.P.setScaleType(ImageView.ScaleType.CENTER);
        this.P.setOutlineProvider(new xj((byte) 8));
        this.O.addView(this.P, qoe.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.P.setOnClickListener(new m67(this, (byte) 12));
        this.P.setOnLongClickListener(new au(this, (byte) 8));
        TextPaint textPaint = this.T;
        textPaint.setTextSize(gm.L(12.0f));
        textPaint.setTypeface(gm.o());
        sb sbVar = new sb((byte) 24, context, this);
        this.R = sbVar;
        sbVar.setAlpha(0.0f);
        this.R.setScaleX(0.2f);
        this.R.setScaleY(0.2f);
        this.Q.addView(this.R, qoe.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
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
        if (i == nm7.r2) {
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
                r59 r59Var = this.h;
                if (r59Var != null && r59Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.s);
                }
                s30 s30Var = this.n;
                if (s30Var != null) {
                    s30Var.f();
                }
                this.e = false;
            }
        } else if (i == nm7.s) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.h, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.W9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        cv3 cv3Var = this.N;
        if (cv3Var != null && cv3Var.e) {
            if (z) {
                cv3Var.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r59 r59Var = this.h;
        if (r59Var != null) {
            r59Var.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 7));
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
        nm7.e().b(this, nm7.r2);
        nm7.f(this.currentAccount).b(this, nm7.s);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        cv3 cv3Var = this.N;
        if (cv3Var != null) {
            cv3Var.o();
        }
        nm7.e().n(this, nm7.r2);
        nm7.f(this.currentAccount).n(this, nm7.s);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        s30 s30Var = this.n;
        if (s30Var != null) {
            s30Var.f();
        }
        cv3 cv3Var = this.N;
        if (cv3Var != null) {
            cv3Var.s();
        }
        r59 r59Var = this.h;
        if (r59Var != null) {
            r59Var.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 7));
        }
    }
}
