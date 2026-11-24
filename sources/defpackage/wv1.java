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
public final class wv1 implements ylb, h57 {
    public Bitmap A;
    public int B;
    public boolean C;
    public boolean D;
    public final yv1 G;
    public SparseIntArray e;
    public tz3 f;
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
    public m37 t;
    public m37 u;
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
    public boolean q = cmb.I.o();

    public wv1(yv1 yv1Var) {
        int i;
        int i2;
        fnb fnbVar;
        this.G = yv1Var;
        if (p(false)) {
            i = ((d) yv1Var).currentAccount;
            uf2 e = uf2.e(i);
            long j = yv1Var.l6;
            LongSparseArray longSparseArray = e.h;
            fnb fnbVar2 = (fnb) longSparseArray.get(j);
            if (fnbVar2 == null) {
                String string = a.b.getSharedPreferences("chatthemeconfig_emoji", 0).getString("chatTheme_" + e.currentAccount + "_" + j, null);
                if (string != null) {
                    if (string.startsWith("gift_")) {
                        fnbVar = new fnb(null, string.substring(5));
                    } else if (string.startsWith("emoticon_")) {
                        fnbVar = new fnb(string.substring(9), null);
                    } else if (!TextUtils.isEmpty(string)) {
                        fnbVar = new fnb(string, null);
                    }
                    fnbVar2 = fnbVar;
                    longSparseArray.put(j, fnbVar2);
                }
                fnbVar2 = null;
                longSparseArray.put(j, fnbVar2);
            }
            this.f = e.g(fnbVar2);
            i2 = ((d) yv1Var).currentAccount;
            TLRPC.WallPaper c = uf2.e(i2).c(yv1Var.l6);
            this.g = c;
            tz3 tz3Var = this.f;
            if (tz3Var != null || c != null) {
                r(tz3Var, c, false);
                gm.c3(new jd((byte) 18));
            }
        }
        s();
        if (ThemeEditorView.p == null) {
            cmb.r1(true, true);
            return;
        }
        gm.c3(new jd((byte) 18));
    }

    @Override
    public final boolean a() {
        SparseIntArray sparseIntArray = this.d;
        if (sparseIntArray != null && sparseIntArray.size() > 0) {
            return this.q;
        }
        return cmb.I.o();
    }

    @Override
    public final void b(float f, float f2, int i, int i2) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.h != null && (bitmap = this.j) != null && (bitmapShader = this.n) != null) {
            boolean z = this.p;
            Matrix matrix = this.c;
            if (z) {
                cmb.r(this.k, this.o, matrix, i, i2, f, f2);
                return;
            } else {
                cmb.r(bitmap, bitmapShader, matrix, i, i2, f, f2);
                return;
            }
        }
        cmb.q(f, f2, i, i2);
    }

    @Override
    public final ColorFilter c() {
        return cmb.u3;
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
            return cmb.b1();
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
        if (this.s && (y0 = cmb.y0(i, this)) != null) {
            return y0.intValue();
        }
        if (this.f == null) {
            return cmb.w0(null, i, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i2 = cmb.hm.get(i);
        if (i2 >= 0 && (indexOfKey = this.d.indexOfKey(i2)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return cmb.w0(null, i, false);
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
            return cmb.w0(null, i, false);
        }
        if (!z && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        if (sparseIntArray2 != null && (indexOfKey = sparseIntArray2.indexOfKey(i)) >= 0) {
            return this.d.valueAt(indexOfKey);
        }
        return cmb.w0(null, i, false);
    }

    public final Drawable l() {
        Drawable drawable = this.h;
        if (drawable != null) {
            return drawable;
        }
        return cmb.s0();
    }

    public final void m() {
        Drawable m37Var;
        for (Map.Entry entry : cmb.cm.entrySet()) {
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
                    m37Var = new m37(0, false, false, this);
                    break;
                case 1:
                    m37Var = new m37(1, false, false, this);
                    break;
                case 2:
                    m37Var = new m37(1, false, true, this);
                    break;
                case 3:
                    m37Var = new m37(1, true, false, this);
                    break;
                case 4:
                    m37Var = new m37(0, true, true, this);
                    break;
                case 5:
                    m37Var = new m37(1, true, true, this);
                    break;
                case 6:
                    m37Var = new m37(0, false, true, this);
                    break;
                case 7:
                    m37Var = new m37(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    if (constantState != null) {
                        m37Var = constantState.newDrawable().mutate();
                    } else {
                        m37Var = null;
                    }
                    if (m37Var != null) {
                        int intValue = ((Integer) cmb.dm.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            cmb.A1(h(intValue), m37Var);
                            break;
                        }
                    }
                    break;
            }
            if (m37Var != null) {
                this.a.put((String) entry.getKey(), m37Var);
            }
        }
    }

    public final void n() {
        Paint paint;
        for (Map.Entry entry : cmb.em.entrySet()) {
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
            int intValue = ((Integer) cmb.fm.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(h(intValue));
            }
            this.b.put((String) entry.getKey(), paint);
        }
    }

    public final void o(android.graphics.drawable.Drawable r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv1.o(android.graphics.drawable.Drawable):void");
    }

    public final boolean p(boolean z) {
        TLRPC.User user;
        yv1 yv1Var = this.G;
        if (yv1Var.h == null) {
            if (z) {
                if (yv1Var.e == null && (user = yv1Var.f) != null && !user.bot) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void q(defpackage.tz3 r14, org.telegram.tgnet.TLRPC.WallPaper r15, boolean r16, java.lang.Boolean r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv1.q(tz3, org.telegram.tgnet.TLRPC$WallPaper, boolean, java.lang.Boolean, boolean):void");
    }

    public final void r(tz3 tz3Var, TLRPC.WallPaper wallPaper, boolean z) {
        Drawable drawable;
        ah7 ah7Var;
        int i;
        int indexOfKey;
        int i2;
        int i3;
        ArrayList arrayList;
        amb ambVar;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        bmb bmbVar;
        boolean z2;
        Drawable drawable2;
        int i4;
        char c;
        bmb O0;
        int i5;
        bmb O02;
        tz3 tz3Var2 = tz3Var;
        yv1 yv1Var = this.G;
        if (yv1Var.za != null) {
            return;
        }
        this.f = tz3Var2;
        this.g = wallPaper;
        if (yv1Var.fragmentView != null) {
            drawable = yv1Var.m1.getBackgroundImage();
        } else {
            drawable = null;
        }
        if (drawable instanceof ah7) {
            ah7Var = (ah7) drawable;
        } else {
            ah7Var = null;
        }
        if (ah7Var != null) {
            i = ah7Var.i;
        } else {
            i = 0;
        }
        if ((tz3Var2 == null || tz3Var2.a) && wallPaper == null && (indexOfKey = cmb.km.indexOfKey(cmb.bd)) >= 0) {
            cmb.km.valueAt(indexOfKey);
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (tz3Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.b.clear();
            this.a.clear();
            Drawable s0 = cmb.s0();
            if (s0 instanceof ah7) {
                ((ah7) s0).t(i);
            }
            this.h = null;
            if (cmb.I.o() == this.q) {
                O02 = cmb.I;
            } else {
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (cmb.O0(string) != null && !cmb.O0(string).o()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (cmb.O0(string2) != null && cmb.O0(string2).o()) {
                    str = string2;
                }
                if (this.q) {
                    O02 = cmb.O0(str);
                } else {
                    O02 = cmb.O0(str2);
                }
            }
            cmb.t(O02, false, this.q);
            o(this.h);
            this.s = false;
            s();
            return;
        }
        this.s = false;
        if (a.b != null) {
            cmb.J(a.b, false);
        }
        if (tz3Var2 != null) {
            i2 = ((d) this.G).currentAccount;
            boolean z3 = this.q;
            ArrayList arrayList2 = tz3Var2.f;
            bmb i6 = tz3Var2.i(z3 ? 1 : 0);
            if (i6 == null) {
                int i7 = ((sz3) tz3Var2.f.get(z3 ? 1 : 0)).d;
                i3 = 0;
                sz3 sz3Var = (sz3) ((el5) tz3Var2.f.get(z3 ? 1 : 0));
                TLRPC.ThemeSettings b = sz3Var.b(i7);
                TLRPC.TL_theme tL_theme = ((sz3) tz3Var2.f.get(z3 ? 1 : 0)).b;
                bmb bmbVar2 = new bmb(cmb.O0(cmb.q0(b)));
                arrayList = arrayList2;
                ambVar = bmbVar2.c(sz3Var.a(), b, tL_theme, i2, true);
                bmbVar2.u(ambVar.a);
                i6 = bmbVar2;
            } else {
                i3 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i6.b0;
                if (sparseArray != null) {
                    ambVar = (amb) sparseArray.get(((sz3) arrayList.get(z3 ? 1 : 0)).e);
                } else {
                    ambVar = null;
                }
            }
            String[] strArr = new String[1];
            if (i6.b != null) {
                sparseIntArray = cmb.R0(new File(i6.b), null, strArr);
            } else {
                String str3 = i6.d;
                if (str3 != null) {
                    sparseIntArray = cmb.R0(null, str3, strArr);
                } else {
                    sparseIntArray = new SparseIntArray();
                }
            }
            ((sz3) arrayList.get(z3 ? 1 : 0)).g = strArr[i3];
            if (ambVar != null) {
                SparseIntArray clone = sparseIntArray.clone();
                ambVar.d(sparseIntArray, clone);
                fnb fnbVar = tz3Var2.c;
                if (fnbVar != null && !TextUtils.isEmpty(fnbVar.b) && (bmbVar = ambVar.b) != null && bmbVar.b == null && !bmbVar.o()) {
                    amb.g(clone);
                }
                sparseIntArray = clone;
            }
            SparseIntArray sparseIntArray2 = cmb.hm;
            for (int i8 = i3; i8 < sparseIntArray2.size(); i8++) {
                int keyAt = sparseIntArray2.keyAt(i8);
                int valueAt = sparseIntArray2.valueAt(i8);
                if (sparseIntArray.indexOfKey(keyAt) < 0 && (indexOfKey2 = sparseIntArray.indexOfKey(valueAt)) >= 0) {
                    sparseIntArray.put(keyAt, sparseIntArray.valueAt(indexOfKey2));
                }
            }
            int[] iArr = cmb.gm;
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
        if (!TextUtils.isEmpty(uf2.h(this.g))) {
            Drawable drawable3 = this.h;
            i5 = ((d) this.G).currentAccount;
            this.h = cl8.e(drawable3, i5, this.g, this.q);
        } else if (wallPaper != null) {
            this.h = a92.d(this.h, wallPaper, this.q);
        } else {
            if (tz3Var2.a) {
                bmb d = tz3.d(this.q);
                i4 = ((d) this.G).currentAccount;
                cmb.I(d, tz3Var2.g(i4, this.q ? 1 : 0), ((sz3) tz3Var2.f.get(this.q ? 1 : 0)).g, i, i3);
                drawable2 = new ColorDrawable(-16777216);
            } else {
                int h = h(cmb.De);
                int h2 = h(cmb.Ee);
                int h3 = h(cmb.Fe);
                int h4 = h(cmb.Ge);
                ah7 ah7Var2 = new ah7();
                ah7Var2.r(tz3Var2.j(this.q ? 1 : 0).settings.intensity, ah7Var2.u);
                TLRPC.Document e = tz3Var2.e();
                if (ah7Var2.y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    ah7Var2.y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = ah7Var2.c;
                    if (weakReference != null) {
                        ah7Var2.y.p0((View) weakReference.get());
                    }
                    if (ah7Var2.T) {
                        ah7Var2.y.I();
                    }
                }
                ah7Var2.y.d0(gn5.b(e), "80_80", null, null, null, 0);
                ah7Var2.y.N(1);
                ah7Var2.y.M(1);
                ah7Var2.n(true, h, h2, h3, h4);
                ah7Var2.t(i);
                int f = ah7Var2.f();
                boolean z4 = this.q;
                g11 g11Var = new g11(this, ah7Var2, (byte) 19);
                sz3 sz3Var2 = (sz3) tz3Var2.f.get(z4 ? 1 : 0);
                if (sz3Var2 != null && sz3Var2.c != null) {
                    long h5 = tz3Var2.h(z4 ? 1 : 0);
                    TL_stars.StarGift starGift = sz3Var2.c.gift;
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
                    gn5 b2 = gn5.b(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver(null);
                    imageReceiver2.A1 = false;
                    imageReceiver2.d0(b2, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.h1 = new d12(g11Var, h5, (byte) 4);
                    fn5.z().I(imageReceiver2, null);
                } else {
                    z2 = z4 ? 1 : 0;
                }
                tz3Var2 = tz3Var;
                tz3Var2.n(this.q ? 1 : 0, new sv1(this, tz3Var2, z2, ah7Var2, f));
                drawable2 = ah7Var2;
            }
            this.h = drawable2;
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z) {
            this.r = new AnimatorSet();
            if (ah7Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new rv1(ah7Var, (byte) 0));
                ofFloat.addListener(new uv1(ah7Var));
                ofFloat.setDuration(200L);
                this.r.playTogether(ofFloat);
            }
            Drawable drawable4 = this.h;
            if (drawable4 instanceof ah7) {
                ah7 ah7Var3 = (ah7) drawable4;
                ah7Var3.q(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new rv1(ah7Var3, (byte) 1));
                ofFloat2.addListener(new vv1(ah7Var3));
                ofFloat2.setDuration(250L);
                this.r.playTogether(ofFloat2);
            }
            this.r.start();
        }
        if (tz3Var2 == null && this.G.l6 >= 0) {
            if (cmb.I.o() == this.q) {
                O0 = cmb.I;
            } else {
                SharedPreferences sharedPreferences2 = a.b.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (cmb.O0(string3) != null && !cmb.O0(string3).o()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (cmb.O0(string4) != null && cmb.O0(string4).o()) {
                    str = string4;
                }
                if (this.q) {
                    O0 = cmb.O0(str);
                } else {
                    O0 = cmb.O0(str2);
                }
            }
            c = 0;
            cmb.t(O0, false, this.q);
        } else {
            c = 0;
        }
        int i13 = gm.q(this.h)[c];
        m();
        n();
        o(this.h);
        t(1.0f);
    }

    public final void s() {
        boolean z;
        yv1 yv1Var = this.G;
        if (yv1Var.za == null && this.f == null && this.g == null) {
            if (yv1Var.U7() && !gda.D0) {
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
                        cmb.J(a.b, false);
                    }
                    m();
                    n();
                }
                o(cmb.s0());
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
                    i = cmb.Ea;
                } else {
                    i = cmb.Yc;
                }
                k = k(i, true);
            }
            if (this.C) {
                k2 = -1;
            } else {
                if (U7) {
                    i2 = cmb.Ea;
                } else {
                    i2 = cmb.Zc;
                }
                k2 = k(i2, true);
            }
            if (this.C) {
                k3 = -1;
            } else {
                if (U7) {
                    i3 = cmb.Ga;
                } else {
                    i3 = cmb.Zc;
                }
                k3 = k(i3, true);
            }
            if (!this.C) {
                if (U7) {
                    i4 = cmb.Fa;
                } else {
                    i4 = cmb.ad;
                }
                i6 = k(i4, true);
            }
            int i7 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            if (i7 != 0) {
                i5 = on2.f(f, this.z, i5);
                k = on2.f(f, this.v, k);
                k2 = on2.f(f, this.w, k2);
                k3 = on2.f(f, this.x, k3);
                i6 = on2.f(f, this.y, i6);
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
            cmb.A1(k, getDrawable("drawableMsgStickerCheck"));
            cmb.A1(k, getDrawable("drawableMsgStickerClock"));
            cmb.A1(k, getDrawable("drawableMsgStickerHalfCheck"));
            cmb.A1(k, getDrawable("drawableMsgStickerPinned"));
            cmb.A1(k, getDrawable("drawableMsgStickerReplies"));
            cmb.A1(k, getDrawable("drawableMsgStickerViews"));
            cmb.A1(i6, getDrawable("drawableBotInline"));
            cmb.A1(i6, getDrawable("drawableBotLink"));
            cmb.A1(i6, getDrawable("drawableBotLock"));
            cmb.A1(i6, getDrawable("drawable_botInvite"));
            cmb.A1(i6, getDrawable("drawableCommentSticker"));
            cmb.A1(i6, getDrawable("drawableGoIcon"));
            cmb.A1(i6, getDrawable("drawableReplyIcon"));
            cmb.A1(i6, getDrawable("drawableShareIcon"));
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
