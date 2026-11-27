package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ThemeEditorView;
public final class xu1 implements vnb, o57 {
    public Bitmap A;
    public int B;
    public boolean C;
    public boolean D;
    public final zu1 G;
    public SparseIntArray e;
    public ez3 f;
    public TLRPC.WallPaper g;
    public Drawable h;
    public ValueAnimator i;
    public Bitmap j;
    public Bitmap k;
    public Canvas m;
    public BitmapShader n;
    public BitmapShader o;
    public boolean p;
    public AnimatorSet r;
    public boolean s;
    public t37 t;
    public t37 u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final Matrix c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint l = new Paint();
    public final Rect E = new Rect();
    public final Rect F = new Rect();
    public boolean q = aob.I.o();

    public xu1(zu1 zu1Var) {
        int i;
        int i2;
        dpb dpbVar;
        this.G = zu1Var;
        if (p(false)) {
            i = ((e) zu1Var).currentAccount;
            af2 e = af2.e(i);
            long j = zu1Var.l6;
            LongSparseArray longSparseArray = e.h;
            dpb dpbVar2 = (dpb) longSparseArray.get(j);
            if (dpbVar2 == null) {
                String string = a.b.getSharedPreferences("chatthemeconfig_emoji", 0).getString("chatTheme_" + e.currentAccount + "_" + j, null);
                if (string != null) {
                    if (string.startsWith("gift_")) {
                        dpbVar = new dpb(null, string.substring(5));
                    } else if (string.startsWith("emoticon_")) {
                        dpbVar = new dpb(string.substring(9), null);
                    } else if (!TextUtils.isEmpty(string)) {
                        dpbVar = new dpb(string, null);
                    }
                    dpbVar2 = dpbVar;
                    longSparseArray.put(j, dpbVar2);
                }
                dpbVar2 = null;
                longSparseArray.put(j, dpbVar2);
            }
            this.f = e.g(dpbVar2);
            i2 = ((e) zu1Var).currentAccount;
            TLRPC.WallPaper c = af2.e(i2).c(zu1Var.l6);
            this.g = c;
            ez3 ez3Var = this.f;
            if (ez3Var != null || c != null) {
                r(ez3Var, c, false);
                hl.c3(new kc((byte) 18));
            }
        }
        s();
        if (ThemeEditorView.p == null) {
            aob.r1(true, true);
            return;
        }
        hl.c3(new kc((byte) 18));
    }

    @Override
    public final boolean a() {
        SparseIntArray sparseIntArray = this.d;
        if (sparseIntArray != null && sparseIntArray.size() > 0) {
            return this.q;
        }
        return aob.I.o();
    }

    @Override
    public final void b(float f, float f2, int i, int i2) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.h != null && (bitmap = this.j) != null && (bitmapShader = this.n) != null) {
            boolean z = this.p;
            Matrix matrix = this.c;
            if (z) {
                aob.r(this.k, this.o, matrix, i, i2, f, f2);
                return;
            } else {
                aob.r(bitmap, bitmapShader, matrix, i, i2, f, f2);
                return;
            }
        }
        aob.q(f, f2, i, i2);
    }

    @Override
    public final ColorFilter c() {
        return aob.v3;
    }

    @Override
    public final Paint d(String str) {
        if (this.f == null && this.h == null && !this.s) {
            return null;
        }
        return (Paint) this.b.get(str);
    }

    @Override
    public final boolean e() {
        return this.G.U7();
    }

    @Override
    public final int f(int i) {
        return h(i);
    }

    @Override
    public final boolean g() {
        if (this.h == null && !this.s) {
            return aob.b1();
        }
        if (this.n != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.a;
        if (!hashMap.isEmpty()) {
            return (Drawable) hashMap.get(str);
        }
        return null;
    }

    @Override
    public final int h(int i) {
        int indexOfKey;
        Integer y0;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.s && (y0 = aob.y0(i, this)) != null) {
            return y0.intValue();
        }
        if (this.f == null) {
            return aob.w0(null, i, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i2 = aob.im.get(i);
        if (i2 >= 0 && (indexOfKey = this.d.indexOfKey(i2)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return aob.w0(null, i, false);
    }

    @Override
    public final void i(int i, int i2) {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i, i2);
        }
    }

    @Override
    public final int j(int i) {
        return k(i, false);
    }

    public final int k(int i, boolean z) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f == null && this.h == null) {
            return aob.w0(null, i, false);
        }
        if (!z && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return aob.w0(null, i, false);
    }

    public final Drawable l() {
        Drawable drawable = this.h;
        if (drawable != null) {
            return drawable;
        }
        return aob.s0();
    }

    public final void m() {
        Drawable t37Var;
        for (Map.Entry entry : aob.dm.entrySet()) {
            String str = (String) entry.getKey();
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -2061232504:
                    if (str.equals("drawableMsgIn")) {
                        c = 0;
                        break;
                    }
                    break;
                case -2005320132:
                    if (str.equals("drawableMsgInMedia")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1656383241:
                    if (str.equals("drawableMsgInMediaSelected")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1451465639:
                    if (str.equals("drawableMsgOutMedia")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1084641786:
                    if (str.equals("drawableMsgOutSelected")) {
                        c = 4;
                        break;
                    }
                    break;
                case -8170988:
                    if (str.equals("drawableMsgOutMediaSelected")) {
                        c = 5;
                        break;
                    }
                    break;
                case 300508483:
                    if (str.equals("drawableMsgInSelected")) {
                        c = 6;
                        break;
                    }
                    break;
                case 526307915:
                    if (str.equals("drawableMsgOut")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    t37Var = new t37(0, false, false, this);
                    break;
                case 1:
                    t37Var = new t37(1, false, false, this);
                    break;
                case 2:
                    t37Var = new t37(1, false, true, this);
                    break;
                case 3:
                    t37Var = new t37(1, true, false, this);
                    break;
                case 4:
                    t37Var = new t37(0, true, true, this);
                    break;
                case 5:
                    t37Var = new t37(1, true, true, this);
                    break;
                case 6:
                    t37Var = new t37(0, false, true, this);
                    break;
                case 7:
                    t37Var = new t37(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    if (constantState != null) {
                        t37Var = constantState.newDrawable().mutate();
                    } else {
                        t37Var = null;
                    }
                    if (t37Var != null) {
                        int intValue = ((Integer) aob.em.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            aob.A1(h(intValue), t37Var);
                            break;
                        }
                    }
                    break;
            }
            if (t37Var != null) {
                this.a.put((String) entry.getKey(), t37Var);
            }
        }
    }

    public final void n() {
        Paint paint;
        for (Map.Entry entry : aob.fm.entrySet()) {
            Paint paint2 = (Paint) entry.getValue();
            if (paint2 instanceof TextPaint) {
                paint = new TextPaint();
                paint.setTextSize(paint2.getTextSize());
                paint.setTypeface(paint2.getTypeface());
            } else {
                paint = new Paint();
            }
            if ((paint2.getFlags() & 1) != 0) {
                paint.setFlags(1);
            }
            int intValue = ((Integer) aob.gm.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(h(intValue));
            }
            this.b.put((String) entry.getKey(), paint);
        }
    }

    public final void o(android.graphics.drawable.Drawable r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xu1.o(android.graphics.drawable.Drawable):void");
    }

    public final boolean p(boolean z) {
        TLRPC.User user;
        zu1 zu1Var = this.G;
        if (zu1Var.h == null) {
            if (z) {
                if (zu1Var.e == null && (user = zu1Var.f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void q(defpackage.ez3 r14, org.telegram.tgnet.TLRPC.WallPaper r15, boolean r16, java.lang.Boolean r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xu1.q(ez3, org.telegram.tgnet.TLRPC$WallPaper, boolean, java.lang.Boolean, boolean):void");
    }

    public final void r(ez3 ez3Var, TLRPC.WallPaper wallPaper, boolean z) {
        Drawable drawable;
        ih7 ih7Var;
        int i;
        int indexOfKey;
        int i2;
        int i3;
        ArrayList arrayList;
        ynb ynbVar;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        znb znbVar;
        boolean z2;
        Drawable drawable2;
        int i4;
        char c;
        znb O0;
        int i5;
        znb O02;
        ez3 ez3Var2 = ez3Var;
        zu1 zu1Var = this.G;
        if (zu1Var.za != null) {
            return;
        }
        this.f = ez3Var2;
        this.g = wallPaper;
        if (zu1Var.fragmentView != null) {
            drawable = zu1Var.m1.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof ih7) {
            ih7Var = (ih7) drawable;
        } else {
            ih7Var = null;
        }
        if (ih7Var != null) {
            i = ih7Var.i;
        } else {
            i = 0;
        }
        if ((ez3Var2 == null || ez3Var2.a) && wallPaper == null && (indexOfKey = aob.lm.indexOfKey(aob.cd)) >= 0) {
            aob.lm.valueAt(indexOfKey);
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (ez3Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.b.clear();
            this.a.clear();
            Drawable s0 = aob.s0();
            if (s0 instanceof ih7) {
                ((ih7) s0).t(i);
            }
            this.h = null;
            if (aob.I.o() == this.q) {
                O02 = aob.I;
            } else {
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (aob.O0(string) != null && !aob.O0(string).o()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (aob.O0(string2) != null && aob.O0(string2).o()) {
                    str = string2;
                }
                if (this.q) {
                    O02 = aob.O0(str);
                } else {
                    O02 = aob.O0(str2);
                }
            }
            aob.t(O02, false, this.q);
            o(this.h);
            this.s = false;
            s();
            return;
        }
        this.s = false;
        if (a.b != null) {
            aob.J(a.b, false);
        }
        if (ez3Var2 != null) {
            i2 = ((e) this.G).currentAccount;
            boolean z3 = this.q;
            ArrayList arrayList2 = ez3Var2.f;
            znb i6 = ez3Var2.i(z3 ? 1 : 0);
            if (i6 == null) {
                int i7 = ((dz3) ez3Var2.f.get(z3 ? 1 : 0)).d;
                i3 = 0;
                dz3 dz3Var = (dz3) ((hl5) ez3Var2.f.get(z3 ? 1 : 0));
                TLRPC.ThemeSettings b = dz3Var.b(i7);
                TLRPC.TL_theme tL_theme = ((dz3) ez3Var2.f.get(z3 ? 1 : 0)).b;
                znb znbVar2 = new znb(aob.O0(aob.q0(b)));
                arrayList = arrayList2;
                ynbVar = znbVar2.c(dz3Var.a(), b, tL_theme, i2, true);
                znbVar2.u(ynbVar.a);
                i6 = znbVar2;
            } else {
                i3 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i6.b0;
                if (sparseArray != null) {
                    ynbVar = (ynb) sparseArray.get(((dz3) arrayList.get(z3 ? 1 : 0)).e);
                } else {
                    ynbVar = null;
                }
            }
            String[] strArr = new String[1];
            if (i6.b != null) {
                sparseIntArray = aob.R0(new File(i6.b), null, strArr);
            } else {
                String str3 = i6.d;
                if (str3 != null) {
                    sparseIntArray = aob.R0(null, str3, strArr);
                } else {
                    sparseIntArray = new SparseIntArray();
                }
            }
            ((dz3) arrayList.get(z3 ? 1 : 0)).g = strArr[i3];
            if (ynbVar != null) {
                SparseIntArray clone = sparseIntArray.clone();
                ynbVar.d(sparseIntArray, clone);
                dpb dpbVar = ez3Var2.c;
                if (dpbVar != null && !TextUtils.isEmpty(dpbVar.b) && (znbVar = ynbVar.b) != null && znbVar.b == null && !znbVar.o()) {
                    ynb.g(clone);
                }
                sparseIntArray = clone;
            }
            SparseIntArray sparseIntArray2 = aob.im;
            for (int i8 = i3; i8 < sparseIntArray2.size(); i8++) {
                int keyAt = sparseIntArray2.keyAt(i8);
                int valueAt = sparseIntArray2.valueAt(i8);
                if (sparseIntArray.indexOfKey(keyAt) < 0 && (indexOfKey2 = sparseIntArray.indexOfKey(valueAt)) >= 0) {
                    sparseIntArray.put(keyAt, sparseIntArray.valueAt(indexOfKey2));
                }
            }
            int[] iArr = aob.hm;
            for (int i9 = i3; i9 < iArr.length; i9++) {
                if (sparseIntArray.indexOfKey(i9) < 0) {
                    sparseIntArray.put(i9, iArr[i9]);
                }
            }
            this.d = sparseIntArray;
        } else {
            this.d = new SparseIntArray();
            i3 = 0;
        }
        if (!TextUtils.isEmpty(af2.h(this.g))) {
            Drawable drawable3 = this.h;
            i5 = ((e) this.G).currentAccount;
            this.h = mm8.e(drawable3, i5, this.g, this.q);
        } else if (wallPaper != null) {
            this.h = g82.d(this.h, wallPaper, this.q);
        } else {
            if (ez3Var2.a) {
                znb d = ez3.d(this.q);
                i4 = ((e) this.G).currentAccount;
                aob.I(d, ez3Var2.g(i4, this.q ? 1 : 0), ((dz3) ez3Var2.f.get(this.q ? 1 : 0)).g, i, i3);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int h = h(aob.Ee);
                int h2 = h(aob.Fe);
                int h3 = h(aob.Ge);
                int h4 = h(aob.He);
                ih7 ih7Var2 = new ih7();
                ih7Var2.r(ez3Var2.j(this.q ? 1 : 0).settings.intensity, ih7Var2.u);
                TLRPC.Document e = ez3Var2.e();
                if (ih7Var2.y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    ih7Var2.y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = ih7Var2.c;
                    if (weakReference != null) {
                        ih7Var2.y.p0((View) weakReference.get());
                    }
                    if (ih7Var2.T) {
                        ih7Var2.y.I();
                    }
                }
                ih7Var2.y.d0(jn5.b(e), "80_80", null, null, null, 0);
                ih7Var2.y.N(1);
                ih7Var2.y.M(1);
                ih7Var2.n(true, h, h2, h3, h4);
                ih7Var2.t(i);
                int f = ih7Var2.f();
                boolean z4 = this.q;
                h01 h01Var = new h01(this, ih7Var2, (byte) 19);
                dz3 dz3Var2 = (dz3) ez3Var2.f.get(z4 ? 1 : 0);
                if (dz3Var2 != null && dz3Var2.c != null) {
                    long h5 = ez3Var2.h(z4 ? 1 : 0);
                    TL_stars.StarGift starGift = dz3Var2.c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList3 = starGift.attributes;
                    if (arrayList3 != null && document == null) {
                        int size = arrayList3.size();
                        z2 = z4 ? 1 : 0;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size) {
                                break;
                            }
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList3.get(i10);
                            int i11 = i10 + 1;
                            int i12 = size;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                size = i12;
                                i10 = i11;
                            }
                        }
                    } else {
                        z2 = z4 ? 1 : 0;
                    }
                    TLRPC.Document document2 = document;
                    jn5 b2 = jn5.b(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver(null);
                    imageReceiver2.A1 = false;
                    imageReceiver2.d0(b2, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.h1 = new i02(h01Var, h5, (byte) 4);
                    in5.z().I(imageReceiver2, null);
                } else {
                    z2 = z4 ? 1 : 0;
                }
                ez3Var2 = ez3Var;
                ez3Var2.n(this.q ? 1 : 0, new tu1(this, ez3Var2, z2, ih7Var2, f));
                drawable2 = ih7Var2;
            }
            this.h = drawable2;
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z) {
            this.r = new AnimatorSet();
            if (ih7Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new su1(ih7Var, (byte) 0));
                ofFloat.addListener(new vu1(ih7Var));
                ofFloat.setDuration(200L);
                this.r.playTogether(ofFloat);
            }
            Drawable drawable4 = this.h;
            if (drawable4 instanceof ih7) {
                ih7 ih7Var3 = (ih7) drawable4;
                ih7Var3.q(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new su1(ih7Var3, (byte) 1));
                ofFloat2.addListener(new wu1(ih7Var3));
                ofFloat2.setDuration(250L);
                this.r.playTogether(ofFloat2);
            }
            this.r.start();
        }
        if (ez3Var2 == null && this.G.l6 >= 0) {
            if (aob.I.o() == this.q) {
                O0 = aob.I;
            } else {
                SharedPreferences sharedPreferences2 = a.b.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (aob.O0(string3) != null && !aob.O0(string3).o()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (aob.O0(string4) != null && aob.O0(string4).o()) {
                    str = string4;
                }
                if (this.q) {
                    O0 = aob.O0(str);
                } else {
                    O0 = aob.O0(str2);
                }
            }
            c = 0;
            aob.t(O0, false, this.q);
        } else {
            c = 0;
        }
        int i13 = hl.q(this.h)[c];
        m();
        n();
        o(this.h);
        t(1.0f);
    }

    public final void s() {
        boolean z;
        zu1 zu1Var = this.G;
        if (zu1Var.za == null && this.f == null && this.g == null) {
            if (zu1Var.U7() && !xea.D0) {
                z = true;
            } else {
                z = false;
            }
            if (z || this.s) {
                this.s = z;
                this.b.clear();
                this.a.clear();
                if (z) {
                    if (a.b != null) {
                        aob.J(a.b, false);
                    }
                    m();
                    n();
                }
                o(aob.s0());
                t(1.0f);
            }
        }
    }

    public final void t(float f) {
        int i;
        int k;
        int i2;
        int k2;
        int i3;
        int k3;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i4;
        if (!this.b.isEmpty()) {
            Paint d = d("paintChatActionBackground");
            Paint d2 = d("paintChatActionBackgroundSelected");
            Paint d3 = d("paintChatMessageBackgroundSelected");
            int i5 = this.B;
            boolean U7 = this.G.U7();
            int i6 = -1;
            if (this.C) {
                k = -1;
            } else {
                if (U7) {
                    i = aob.Fa;
                } else {
                    i = aob.Zc;
                }
                k = k(i, true);
            }
            if (this.C) {
                k2 = -1;
            } else {
                if (U7) {
                    i2 = aob.Fa;
                } else {
                    i2 = aob.ad;
                }
                k2 = k(i2, true);
            }
            if (this.C) {
                k3 = -1;
            } else {
                if (U7) {
                    i3 = aob.Ha;
                } else {
                    i3 = aob.ad;
                }
                k3 = k(i3, true);
            }
            if (!this.C) {
                if (U7) {
                    i4 = aob.Ga;
                } else {
                    i4 = aob.bd;
                }
                i6 = k(i4, true);
            }
            int i7 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            if (i7 != 0) {
                i5 = vm2.f(f, this.z, i5);
                k = vm2.f(f, this.v, k);
                k2 = vm2.f(f, this.w, k2);
                k3 = vm2.f(f, this.x, k3);
                i6 = vm2.f(f, this.y, i6);
            }
            if (d != null && !this.C) {
                d.setColor(i5);
                d2.setColor(i5);
            }
            Paint d4 = d("paintChatActionText");
            if (d4 != null) {
                ((TextPaint) d4).linkColor = k2;
                d("paintChatActionText").setColor(k);
                d("paintChatBotButton").setColor(k3);
            }
            aob.A1(k, getDrawable("drawableMsgStickerCheck"));
            aob.A1(k, getDrawable("drawableMsgStickerClock"));
            aob.A1(k, getDrawable("drawableMsgStickerHalfCheck"));
            aob.A1(k, getDrawable("drawableMsgStickerPinned"));
            aob.A1(k, getDrawable("drawableMsgStickerReplies"));
            aob.A1(k, getDrawable("drawableMsgStickerViews"));
            aob.A1(i6, getDrawable("drawableBotInline"));
            aob.A1(i6, getDrawable("drawableBotLink"));
            aob.A1(i6, getDrawable("drawableBotLock"));
            aob.A1(i6, getDrawable("drawable_botInvite"));
            aob.A1(i6, getDrawable("drawableCommentSticker"));
            aob.A1(i6, getDrawable("drawableGoIcon"));
            aob.A1(i6, getDrawable("drawableReplyIcon"));
            aob.A1(i6, getDrawable("drawableShareIcon"));
            if (this.m != null && (bitmap = this.k) != null) {
                Rect rect = this.F;
                Rect rect2 = this.E;
                if (i7 != 0 && (bitmap2 = this.A) != null) {
                    this.p = false;
                    rect2.set(0, 0, bitmap2.getWidth(), this.A.getHeight());
                    rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
                    this.m.drawBitmap(this.A, rect2, rect, (Paint) null);
                    Paint paint = this.l;
                    paint.setAlpha((int) (f * 255.0f));
                    rect2.set(0, 0, this.k.getWidth(), this.k.getHeight());
                    rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
                    this.m.drawBitmap(this.k, rect2, rect, paint);
                    if (d != null) {
                        d.setShader(this.n);
                        d2.setShader(this.n);
                    }
                    if (d3 != null) {
                        d3.setShader(this.n);
                        return;
                    }
                    return;
                }
                this.p = true;
                rect2.set(0, 0, bitmap.getWidth(), this.k.getHeight());
                rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
                this.m.drawBitmap(this.k, rect2, rect, (Paint) null);
                if (d != null) {
                    d.setShader(this.o);
                    d2.setShader(this.o);
                }
                if (d3 != null) {
                    d3.setShader(this.o);
                }
            }
        }
    }
}
