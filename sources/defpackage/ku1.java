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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ThemeEditorView;
public final class ku1 implements wjb, h37 {
    public Bitmap A;
    public int B;
    public boolean C;
    public boolean D;
    public final mu1 G;
    public SparseIntArray e;
    public jy3 f;
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
    public m17 t;
    public m17 u;
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
    public boolean q = bkb.I.o();

    public ku1(mu1 mu1Var) {
        int i;
        int i2;
        elb elbVar;
        this.G = mu1Var;
        if (p(false)) {
            i = ((d) mu1Var).currentAccount;
            je2 e = je2.e(i);
            long j = mu1Var.l6;
            LongSparseArray longSparseArray = e.h;
            elb elbVar2 = (elb) longSparseArray.get(j);
            if (elbVar2 == null) {
                String string = a.b.getSharedPreferences("chatthemeconfig_emoji", 0).getString("chatTheme_" + e.currentAccount + "_" + j, null);
                if (string != null) {
                    if (string.startsWith("gift_")) {
                        elbVar = new elb(null, string.substring(5));
                    } else if (string.startsWith("emoticon_")) {
                        elbVar = new elb(string.substring(9), null);
                    } else if (!TextUtils.isEmpty(string)) {
                        elbVar = new elb(string, null);
                    }
                    elbVar2 = elbVar;
                    longSparseArray.put(j, elbVar2);
                }
                elbVar2 = null;
                longSparseArray.put(j, elbVar2);
            }
            this.f = e.g(elbVar2);
            i2 = ((d) mu1Var).currentAccount;
            TLRPC.WallPaper c = je2.e(i2).c(mu1Var.l6);
            this.g = c;
            jy3 jy3Var = this.f;
            if (jy3Var != null || c != null) {
                r(jy3Var, c, false);
                gl.d3(new jc((byte) 18));
            }
        }
        s();
        if (ThemeEditorView.p == null) {
            bkb.r1(true, true);
            return;
        }
        gl.d3(new jc((byte) 18));
    }

    @Override
    public final boolean a() {
        SparseIntArray sparseIntArray = this.d;
        if (sparseIntArray != null && sparseIntArray.size() > 0) {
            return this.q;
        }
        return bkb.I.o();
    }

    @Override
    public final void b(float f, float f2, int i, int i2) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.h != null && (bitmap = this.j) != null && (bitmapShader = this.n) != null) {
            boolean z = this.p;
            Matrix matrix = this.c;
            if (z) {
                bkb.r(this.k, this.o, matrix, i, i2, f, f2);
                return;
            } else {
                bkb.r(bitmap, bitmapShader, matrix, i, i2, f, f2);
                return;
            }
        }
        bkb.q(f, f2, i, i2);
    }

    @Override
    public final ColorFilter c() {
        return bkb.u3;
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
        return this.G.K7();
    }

    @Override
    public final int f(int i) {
        return h(i);
    }

    @Override
    public final boolean g() {
        if (this.h == null && !this.s) {
            return bkb.b1();
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
        if (this.s && (y0 = bkb.y0(i, this)) != null) {
            return y0.intValue();
        }
        if (this.f == null) {
            return bkb.w0(null, i, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i2 = bkb.hm.get(i);
        if (i2 >= 0 && (indexOfKey = this.d.indexOfKey(i2)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return bkb.w0(null, i, false);
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
            return bkb.w0(null, i, false);
        }
        if (!z && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return bkb.w0(null, i, false);
    }

    public final Drawable l() {
        Drawable drawable = this.h;
        if (drawable != null) {
            return drawable;
        }
        return bkb.s0();
    }

    public final void m() {
        Drawable m17Var;
        for (Map.Entry entry : bkb.cm.entrySet()) {
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
                    m17Var = new m17(0, false, false, this);
                    break;
                case 1:
                    m17Var = new m17(1, false, false, this);
                    break;
                case 2:
                    m17Var = new m17(1, false, true, this);
                    break;
                case 3:
                    m17Var = new m17(1, true, false, this);
                    break;
                case 4:
                    m17Var = new m17(0, true, true, this);
                    break;
                case 5:
                    m17Var = new m17(1, true, true, this);
                    break;
                case 6:
                    m17Var = new m17(0, false, true, this);
                    break;
                case 7:
                    m17Var = new m17(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    if (constantState != null) {
                        m17Var = constantState.newDrawable().mutate();
                    } else {
                        m17Var = null;
                    }
                    if (m17Var != null) {
                        int intValue = ((Integer) bkb.dm.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            bkb.A1(h(intValue), m17Var);
                            break;
                        }
                    }
                    break;
            }
            if (m17Var != null) {
                this.a.put((String) entry.getKey(), m17Var);
            }
        }
    }

    public final void n() {
        Paint paint;
        for (Map.Entry entry : bkb.em.entrySet()) {
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
            int intValue = ((Integer) bkb.fm.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(h(intValue));
            }
            this.b.put((String) entry.getKey(), paint);
        }
    }

    public final void o(android.graphics.drawable.Drawable r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku1.o(android.graphics.drawable.Drawable):void");
    }

    public final boolean p(boolean z) {
        TLRPC.User user;
        mu1 mu1Var = this.G;
        if (mu1Var.h == null) {
            if (z) {
                if (mu1Var.e == null && (user = mu1Var.f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void q(defpackage.jy3 r14, org.telegram.tgnet.TLRPC.WallPaper r15, boolean r16, java.lang.Boolean r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku1.q(jy3, org.telegram.tgnet.TLRPC$WallPaper, boolean, java.lang.Boolean, boolean):void");
    }

    public final void r(jy3 jy3Var, TLRPC.WallPaper wallPaper, boolean z) {
        Drawable drawable;
        ye7 ye7Var;
        int i;
        int indexOfKey;
        int i2;
        int i3;
        ArrayList arrayList;
        zjb zjbVar;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        akb akbVar;
        boolean z2;
        Drawable drawable2;
        int i4;
        char c;
        akb O0;
        int i5;
        akb O02;
        jy3 jy3Var2 = jy3Var;
        mu1 mu1Var = this.G;
        if (mu1Var.za != null) {
            return;
        }
        this.f = jy3Var2;
        this.g = wallPaper;
        if (mu1Var.fragmentView != null) {
            drawable = mu1Var.m1.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof ye7) {
            ye7Var = (ye7) drawable;
        } else {
            ye7Var = null;
        }
        if (ye7Var != null) {
            i = ye7Var.i;
        } else {
            i = 0;
        }
        if ((jy3Var2 == null || jy3Var2.a) && wallPaper == null && (indexOfKey = bkb.km.indexOfKey(bkb.bd)) >= 0) {
            bkb.km.valueAt(indexOfKey);
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (jy3Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.b.clear();
            this.a.clear();
            Drawable s0 = bkb.s0();
            if (s0 instanceof ye7) {
                ((ye7) s0).t(i);
            }
            this.h = null;
            if (bkb.I.o() == this.q) {
                O02 = bkb.I;
            } else {
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (bkb.O0(string) != null && !bkb.O0(string).o()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (bkb.O0(string2) != null && bkb.O0(string2).o()) {
                    str = string2;
                }
                if (this.q) {
                    O02 = bkb.O0(str);
                } else {
                    O02 = bkb.O0(str2);
                }
            }
            bkb.t(O02, false, this.q);
            o(this.h);
            this.s = false;
            s();
            return;
        }
        this.s = false;
        if (a.b != null) {
            bkb.J(a.b, false);
        }
        if (jy3Var2 != null) {
            i2 = ((d) this.G).currentAccount;
            boolean z3 = this.q;
            ArrayList arrayList2 = jy3Var2.f;
            akb i6 = jy3Var2.i(z3 ? 1 : 0);
            if (i6 == null) {
                int i7 = ((iy3) jy3Var2.f.get(z3 ? 1 : 0)).d;
                i3 = 0;
                iy3 iy3Var = (iy3) ((fj5) jy3Var2.f.get(z3 ? 1 : 0));
                TLRPC.ThemeSettings b = iy3Var.b(i7);
                TLRPC.TL_theme tL_theme = ((iy3) jy3Var2.f.get(z3 ? 1 : 0)).b;
                akb akbVar2 = new akb(bkb.O0(bkb.q0(b)));
                arrayList = arrayList2;
                zjbVar = akbVar2.c(iy3Var.a(), b, tL_theme, i2, true);
                akbVar2.u(zjbVar.a);
                i6 = akbVar2;
            } else {
                i3 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i6.b0;
                if (sparseArray != null) {
                    zjbVar = (zjb) sparseArray.get(((iy3) arrayList.get(z3 ? 1 : 0)).e);
                } else {
                    zjbVar = null;
                }
            }
            String[] strArr = new String[1];
            if (i6.b != null) {
                sparseIntArray = bkb.R0(new File(i6.b), null, strArr);
            } else {
                String str3 = i6.d;
                if (str3 != null) {
                    sparseIntArray = bkb.R0(null, str3, strArr);
                } else {
                    sparseIntArray = new SparseIntArray();
                }
            }
            ((iy3) arrayList.get(z3 ? 1 : 0)).g = strArr[i3];
            if (zjbVar != null) {
                SparseIntArray clone = sparseIntArray.clone();
                zjbVar.d(sparseIntArray, clone);
                elb elbVar = jy3Var2.c;
                if (elbVar != null && !TextUtils.isEmpty(elbVar.b) && (akbVar = zjbVar.b) != null && akbVar.b == null && !akbVar.o()) {
                    zjb.g(clone);
                }
                sparseIntArray = clone;
            }
            SparseIntArray sparseIntArray2 = bkb.hm;
            for (int i8 = i3; i8 < sparseIntArray2.size(); i8++) {
                int keyAt = sparseIntArray2.keyAt(i8);
                int valueAt = sparseIntArray2.valueAt(i8);
                if (sparseIntArray.indexOfKey(keyAt) < 0 && (indexOfKey2 = sparseIntArray.indexOfKey(valueAt)) >= 0) {
                    sparseIntArray.put(keyAt, sparseIntArray.valueAt(indexOfKey2));
                }
            }
            int[] iArr = bkb.gm;
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
        if (!TextUtils.isEmpty(je2.h(this.g))) {
            Drawable drawable3 = this.h;
            i5 = ((d) this.G).currentAccount;
            this.h = zi8.e(drawable3, i5, this.g, this.q);
        } else if (wallPaper != null) {
            this.h = p72.d(this.h, wallPaper, this.q);
        } else {
            if (jy3Var2.a) {
                akb d = jy3.d(this.q);
                i4 = ((d) this.G).currentAccount;
                bkb.I(d, jy3Var2.g(i4, this.q ? 1 : 0), ((iy3) jy3Var2.f.get(this.q ? 1 : 0)).g, i, i3);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int h = h(bkb.De);
                int h2 = h(bkb.Ee);
                int h3 = h(bkb.Fe);
                int h4 = h(bkb.Ge);
                ye7 ye7Var2 = new ye7();
                ye7Var2.r(jy3Var2.j(this.q ? 1 : 0).settings.intensity, ye7Var2.u);
                TLRPC.Document e = jy3Var2.e();
                if (ye7Var2.y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    ye7Var2.y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = ye7Var2.c;
                    if (weakReference != null) {
                        ye7Var2.y.p0((View) weakReference.get());
                    }
                    if (ye7Var2.T) {
                        ye7Var2.y.I();
                    }
                }
                ye7Var2.y.d0(gl5.b(e), "80_80", null, null, null, 0);
                ye7Var2.y.N(1);
                ye7Var2.y.M(1);
                ye7Var2.n(true, h, h2, h3, h4);
                ye7Var2.t(i);
                int f = ye7Var2.f();
                boolean z4 = this.q;
                q31 q31Var = new q31(this, ye7Var2, (byte) 18);
                iy3 iy3Var2 = (iy3) jy3Var2.f.get(z4 ? 1 : 0);
                if (iy3Var2 != null && iy3Var2.c != null) {
                    long h5 = jy3Var2.h(z4 ? 1 : 0);
                    TL_stars.StarGift starGift = iy3Var2.c.gift;
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
                    gl5 b2 = gl5.b(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver(null);
                    imageReceiver2.A1 = false;
                    imageReceiver2.d0(b2, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.h1 = new rz1(q31Var, h5, (byte) 4);
                    fl5.z().I(imageReceiver2, null);
                } else {
                    z2 = z4 ? 1 : 0;
                }
                jy3Var2 = jy3Var;
                jy3Var2.n(this.q ? 1 : 0, new gu1(this, jy3Var2, z2, ye7Var2, f));
                drawable2 = ye7Var2;
            }
            this.h = drawable2;
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z) {
            this.r = new AnimatorSet();
            if (ye7Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new fu1(ye7Var, (byte) 0));
                ofFloat.addListener(new iu1(ye7Var));
                ofFloat.setDuration(200L);
                this.r.playTogether(ofFloat);
            }
            Drawable drawable4 = this.h;
            if (drawable4 instanceof ye7) {
                ye7 ye7Var3 = (ye7) drawable4;
                ye7Var3.q(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new fu1(ye7Var3, (byte) 1));
                ofFloat2.addListener(new ju1(ye7Var3));
                ofFloat2.setDuration(250L);
                this.r.playTogether(ofFloat2);
            }
            this.r.start();
        }
        if (jy3Var2 == null && this.G.l6 >= 0) {
            if (bkb.I.o() == this.q) {
                O0 = bkb.I;
            } else {
                SharedPreferences sharedPreferences2 = a.b.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (bkb.O0(string3) != null && !bkb.O0(string3).o()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (bkb.O0(string4) != null && bkb.O0(string4).o()) {
                    str = string4;
                }
                if (this.q) {
                    O0 = bkb.O0(str);
                } else {
                    O0 = bkb.O0(str2);
                }
            }
            c = 0;
            bkb.t(O0, false, this.q);
        } else {
            c = 0;
        }
        int i13 = gl.q(this.h)[c];
        m();
        n();
        o(this.h);
        t(1.0f);
    }

    public final void s() {
        boolean z;
        mu1 mu1Var = this.G;
        if (mu1Var.za == null && this.f == null && this.g == null) {
            if (mu1Var.K7() && !gba.D0) {
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
                        bkb.J(a.b, false);
                    }
                    m();
                    n();
                }
                o(bkb.s0());
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
            boolean K7 = this.G.K7();
            int i6 = -1;
            if (this.C) {
                k = -1;
            } else {
                if (K7) {
                    i = bkb.Ea;
                } else {
                    i = bkb.Yc;
                }
                k = k(i, true);
            }
            if (this.C) {
                k2 = -1;
            } else {
                if (K7) {
                    i2 = bkb.Ea;
                } else {
                    i2 = bkb.Zc;
                }
                k2 = k(i2, true);
            }
            if (this.C) {
                k3 = -1;
            } else {
                if (K7) {
                    i3 = bkb.Ga;
                } else {
                    i3 = bkb.Zc;
                }
                k3 = k(i3, true);
            }
            if (!this.C) {
                if (K7) {
                    i4 = bkb.Fa;
                } else {
                    i4 = bkb.ad;
                }
                i6 = k(i4, true);
            }
            int i7 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            if (i7 != 0) {
                i5 = bm2.f(f, this.z, i5);
                k = bm2.f(f, this.v, k);
                k2 = bm2.f(f, this.w, k2);
                k3 = bm2.f(f, this.x, k3);
                i6 = bm2.f(f, this.y, i6);
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
            bkb.A1(k, getDrawable("drawableMsgStickerCheck"));
            bkb.A1(k, getDrawable("drawableMsgStickerClock"));
            bkb.A1(k, getDrawable("drawableMsgStickerHalfCheck"));
            bkb.A1(k, getDrawable("drawableMsgStickerPinned"));
            bkb.A1(k, getDrawable("drawableMsgStickerReplies"));
            bkb.A1(k, getDrawable("drawableMsgStickerViews"));
            bkb.A1(i6, getDrawable("drawableBotInline"));
            bkb.A1(i6, getDrawable("drawableBotLink"));
            bkb.A1(i6, getDrawable("drawableBotLock"));
            bkb.A1(i6, getDrawable("drawable_botInvite"));
            bkb.A1(i6, getDrawable("drawableCommentSticker"));
            bkb.A1(i6, getDrawable("drawableGoIcon"));
            bkb.A1(i6, getDrawable("drawableReplyIcon"));
            bkb.A1(i6, getDrawable("drawableShareIcon"));
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
