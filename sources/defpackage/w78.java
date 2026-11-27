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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgressView;
public final class w78 extends e implements fn7 {
    public final boolean E;
    public final boolean F;
    public final zu1 G;
    public byte H;
    public boolean I;
    public n8 J;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout K;
    public b8[] L;
    public FrameLayout M;
    public iu3 N;
    public d26 O;
    public ImageView P;
    public u78 Q;
    public tb R;
    public View S;
    public final TextPaint T;
    public final RectF U;
    public final Paint V;
    public v78 W;
    public Editable a;
    public final HashMap b;
    public final ArrayList c;
    public ArrayList d;
    public boolean e;
    public byte f;
    public d79 h;
    public t20 n;
    public FrameLayout r;
    public TextView s;
    public boolean w;
    public final byte x;
    public boolean y;

    public w78(int i, boolean z, boolean z2, zu1 zu1Var) {
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
        this.G = zu1Var;
        this.x = i;
        this.E = z;
        this.F = z2;
    }

    public final void Y(do6 do6Var) {
        if (do6Var != null) {
            l98 l98Var = new l98(0, do6Var, this.b, this.c, this.x, this.F, this.G, false);
            Editable text = this.N.getText();
            this.a = text;
            l98Var.d = text;
            iu3 iu3Var = l98Var.e0;
            if (iu3Var != null) {
                iu3Var.setText(text);
            }
            l98Var.t0 = new aj3(this, (byte) 25);
            l98Var.j0(this.H, this.I);
            presentFragment(l98Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        boolean z = this.E;
        byte b = this.x;
        boolean z2 = this.F;
        if (z) {
            s98 s98Var = new s98(hashMap, arrayList, b, z2, this.G);
            Editable text2 = this.N.getText();
            this.a = text2;
            l98 l98Var2 = s98Var.a;
            if (l98Var2 != null) {
                l98Var2.d = text2;
                iu3 iu3Var2 = l98Var2.e0;
                if (iu3Var2 != null) {
                    iu3Var2.setText(text2);
                }
            }
            t78 t78Var = new t78(this, hashMap, arrayList, (byte) 1);
            l98Var2.t0 = t78Var;
            l98 l98Var3 = s98Var.b;
            l98Var3.t0 = t78Var;
            l98Var2.u0 = new v34(s98Var, (byte) 23);
            l98Var3.u0 = new kj4(s98Var, (byte) 26);
            byte b2 = this.H;
            boolean z3 = this.I;
            l98Var2.j0(b2, z3);
            l98Var3.j0(b2, z3);
            presentFragment(s98Var);
            return;
        }
        l98 l98Var4 = new l98(0, do6Var, hashMap, arrayList, b, z2, this.G, false);
        Editable text3 = this.N.getText();
        this.a = text3;
        l98Var4.d = text3;
        iu3 iu3Var3 = l98Var4.e0;
        if (iu3Var3 != null) {
            iu3Var3.setText(text3);
        }
        l98Var4.t0 = new t78(this, hashMap, arrayList, (byte) 0);
        l98Var4.j0(this.H, this.I);
        presentFragment(l98Var4);
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
                if (obj instanceof no6) {
                    no6 no6Var = (no6) obj;
                    String str2 = no6Var.h;
                    if (str2 != null) {
                        obj2.c = str2;
                    } else {
                        obj2.c = no6Var.I;
                    }
                    obj2.e = no6Var.c;
                    obj2.f = no6Var.g;
                    obj2.k = no6Var.s;
                    obj2.o = no6Var.b;
                    CharSequence charSequence = no6Var.a;
                    if (charSequence != null) {
                        str = charSequence.toString();
                    }
                    obj2.d = str;
                    obj2.i = no6Var.n;
                    obj2.j = no6Var.r;
                    obj2.h = no6Var.x;
                } else if (obj instanceof ro6) {
                    ro6 ro6Var = (ro6) obj;
                    String str3 = ro6Var.h;
                    if (str3 != null) {
                        obj2.c = str3;
                    } else {
                        obj2.l = ro6Var;
                    }
                    obj2.e = ro6Var.c;
                    obj2.f = ro6Var.g;
                    obj2.k = ro6Var.s;
                    CharSequence charSequence2 = ro6Var.I;
                    if (charSequence2 != null) {
                        str = charSequence2.toString();
                    }
                    obj2.d = str;
                    obj2.i = ro6Var.n;
                    obj2.j = ro6Var.r;
                    obj2.h = ro6Var.x;
                    TLRPC.BotInlineResult botInlineResult = ro6Var.N;
                    if (botInlineResult != null && ro6Var.H) {
                        obj2.m = botInlineResult;
                        obj2.n = ro6Var.O;
                    }
                    System.currentTimeMillis();
                }
            }
            this.W.m(arrayList2);
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
            hl.t1(this.N.getEditText());
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
        d26 d26Var = this.O;
        float f5 = 0.2f;
        float f6 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.2f;
        }
        d26Var.setScaleX(f);
        d26 d26Var2 = this.O;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.2f;
        }
        d26Var2.setScaleY(f2);
        d26 d26Var3 = this.O;
        float f7 = 0.0f;
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        d26Var3.setAlpha(f3);
        tb tbVar = this.R;
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = 0.2f;
        }
        tbVar.setScaleX(f4);
        tb tbVar2 = this.R;
        if (z) {
            f5 = 1.0f;
        }
        tbVar2.setScaleY(f5);
        tb tbVar3 = this.R;
        if (!z) {
            f6 = 0.0f;
        }
        tbVar3.setAlpha(f6);
        FrameLayout frameLayout3 = this.M;
        if (z) {
            L = 0.0f;
        } else {
            L = hl.L(48.0f);
        }
        frameLayout3.setTranslationY(L);
        View view = this.S;
        if (!z) {
            f7 = hl.L(48.0f);
        }
        view.setTranslationY(f7);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.da));
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        a aVar = this.actionBar;
        int i = aob.h5;
        yob.h(i, null, aVar);
        a aVar2 = this.actionBar;
        int i2 = aob.j5;
        yob.l(aVar2, 5, i2, null);
        yob.l(this.actionBar, 1, i2, null);
        yob.l(this.actionBar, 3, aob.I5, null);
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 19));
        s6 u = this.actionBar.u();
        if (this.y) {
            u.a(2, 2131232502).setContentDescription(ob6.M0(2131745564, null));
        }
        s7 a = u.a(0, 2131231247);
        a.setContentDescription(ob6.M0(2131754834, null));
        a.e(1, 2131232270, ob6.M0(2131747523, null));
        u78 u78Var = new u78(this, context);
        this.Q = u78Var;
        yob.h(i, null, u78Var);
        this.fragmentView = this.Q;
        this.actionBar.setTitle(ob6.M0(2131750445, null));
        d79 d79Var = new d79(context, null);
        this.h = d79Var;
        d79Var.setPadding(hl.L(6.0f), hl.L(4.0f), hl.L(6.0f), hl.L(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new x46(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.Q.addView(this.h, tre.e(-1, -1, 51));
        d79 d79Var2 = this.h;
        t20 t20Var = new t20(this, context, (byte) 10);
        this.n = t20Var;
        d79Var2.setAdapter(t20Var);
        yob.H(this.h, i, null);
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextColor(-8355712);
        this.s.setTextSize(1, 20.0f);
        this.s.setGravity(17);
        this.s.setVisibility(8);
        this.s.setText(ob6.M0(2131747911, null));
        this.Q.addView(this.s, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.s.setOnTouchListener(new b02((byte) 18));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(8);
        this.Q.addView(this.r, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.r.addView(radialProgressView, tre.e(-2, -2, 17));
        View view = new View(context);
        this.S = view;
        view.setBackgroundResource(2131231241);
        this.S.setTranslationY(hl.L(48.0f));
        this.Q.addView(this.S, tre.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.M = frameLayout2;
        yob.h(i, null, frameLayout2);
        this.M.setVisibility(4);
        this.M.setTranslationY(hl.L(48.0f));
        this.Q.addView(this.M, tre.e(-1, 48, 83));
        this.M.setOnTouchListener(new b02((byte) 19));
        iu3 iu3Var = this.N;
        if (iu3Var != null) {
            iu3Var.o();
        }
        this.N = new iu3(context, this.Q, null, 1, false, null);
        this.N.setFilters(new InputFilter[]{new InputFilter.LengthFilter(uc7.s1(yac.t0).H0())});
        this.N.setHint(ob6.M0(2131754447, null));
        xt3 editText = this.N.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.M.addView(this.N, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        Editable editable = this.a;
        if (editable != null) {
            this.N.setText(editable);
        }
        d26 d26Var = new d26((byte) 7, context, this);
        this.O = d26Var;
        d26Var.setFocusable(true);
        this.O.setFocusableInTouchMode(true);
        this.O.setVisibility(4);
        this.O.setScaleX(0.2f);
        this.O.setScaleY(0.2f);
        this.O.setAlpha(0.0f);
        this.Q.addView(this.O, tre.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.P = new ImageView(context);
        this.P.setBackgroundDrawable(aob.h0(hl.L(56.0f), aob.w0(null, aob.S5, false), aob.w0(null, aob.T5, false)));
        this.P.setImageResource(2131230876);
        this.P.setImportantForAccessibility(2);
        yob.s(this.P, aob.U5, null, PorterDuff.Mode.MULTIPLY);
        this.P.setScaleType(ImageView.ScaleType.CENTER);
        this.P.setOutlineProvider(new yi((byte) 8));
        this.O.addView(this.P, tre.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.P.setOnClickListener(new am7(this, (byte) 11));
        this.P.setOnLongClickListener(new zs(this, (byte) 8));
        TextPaint textPaint = this.T;
        textPaint.setTextSize(hl.L(12.0f));
        textPaint.setTypeface(hl.o());
        tb tbVar = new tb((byte) 24, context, this);
        this.R = tbVar;
        tbVar.setAlpha(0.0f);
        this.R.setScaleX(0.2f);
        this.R.setScaleY(0.2f);
        this.Q.addView(this.R, tre.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
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
        if (i == jn7.r2) {
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
                d79 d79Var = this.h;
                if (d79Var != null && d79Var.getEmptyView() == null) {
                    this.h.setEmptyView(this.s);
                }
                t20 t20Var = this.n;
                if (t20Var != null) {
                    t20Var.f();
                }
                this.e = false;
            }
        } else if (i == jn7.s) {
            removeSelfFromStack(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.h, 0, new Class[]{View.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.X9));
        return arrayList;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        iu3 iu3Var = this.N;
        if (iu3Var != null && iu3Var.e) {
            if (z) {
                iu3Var.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d79 d79Var = this.h;
        if (d79Var != null) {
            d79Var.getViewTreeObserver().addOnPreDrawListener(new gb(this, (byte) 8));
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
        MediaController.R(this.classGuid);
        jn7.e().b(this, jn7.r2);
        jn7.f(this.currentAccount).b(this, jn7.s);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        iu3 iu3Var = this.N;
        if (iu3Var != null) {
            iu3Var.o();
        }
        jn7.e().n(this, jn7.r2);
        jn7.f(this.currentAccount).n(this, jn7.s);
        super.onFragmentDestroy();
    }

    @Override
    public final void onResume() {
        super.onResume();
        t20 t20Var = this.n;
        if (t20Var != null) {
            t20Var.f();
        }
        iu3 iu3Var = this.N;
        if (iu3Var != null) {
            iu3Var.s();
        }
        d79 d79Var = this.h;
        if (d79Var != null) {
            d79Var.getViewTreeObserver().addOnPreDrawListener(new gb(this, (byte) 8));
        }
    }
}
