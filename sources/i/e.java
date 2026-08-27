package i;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import g7.v7;
import k2.p;
import m.n2;
import org.xmlpull.v1.XmlPullParserException;

public final class e extends f implements j0.b {
    public boolean A;
    public b B;
    public v7 C;
    public int D;
    public int E;
    public boolean F;

    public b f10476y;

    public e(b bVar, Resources resources) {
        this.f10481e = 255;
        this.h = -1;
        this.D = -1;
        this.E = -1;
        d(new b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static e e(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        e eVar = new e(null, null);
        TypedArray typedArrayF = h0.b.f(resources2, theme, attributeSet, j.c.f12269a);
        int i10 = 1;
        eVar.setVisible(typedArrayF.getBoolean(1, true), true);
        b bVar = eVar.B;
        bVar.d |= j.b.b(typedArrayF);
        int i11 = 2;
        bVar.f10454i = typedArrayF.getBoolean(2, bVar.f10454i);
        int i12 = 3;
        bVar.f10457l = typedArrayF.getBoolean(3, bVar.f10457l);
        bVar.f10469y = typedArrayF.getInt(4, bVar.f10469y);
        bVar.f10470z = typedArrayF.getInt(5, bVar.f10470z);
        boolean z10 = false;
        eVar.setDither(typedArrayF.getBoolean(0, bVar.f10467w));
        b bVar2 = eVar.f10478a;
        if (resources2 != null) {
            bVar2.f10449b = resources2;
            int i13 = resources2.getDisplayMetrics().densityDpi;
            if (i13 == 0) {
                i13 = 160;
            }
            int i14 = bVar2.f10450c;
            bVar2.f10450c = i13;
            if (i14 != i13) {
                bVar2.f10458m = false;
                bVar2.f10455j = false;
            }
        } else {
            bVar2.getClass();
        }
        typedArrayF.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i10 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i12)) {
                break;
            }
            if (next3 == i11 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray typedArrayF2 = h0.b.f(resources2, theme, attributeSet, j.c.f12270b);
                    int resourceId = typedArrayF2.getResourceId(z10 ? 1 : 0, z10 ? 1 : 0);
                    int resourceId2 = typedArrayF2.getResourceId(i10, -1);
                    Drawable drawableG = resourceId2 > 0 ? n2.d().g(context2, resourceId2) : null;
                    typedArrayF2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i15 = 0;
                    for (int i16 = 0; i16 < attributeCount; i16++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i16);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i17 = i15 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i16, z10)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i15] = attributeNameResource;
                            i15 = i17;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i15);
                    if (drawableG == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            drawableG = new p();
                            drawableG.inflate(resources2, xmlResourceParser, attributeSet, theme);
                        } else {
                            drawableG = j.b.a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (drawableG == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    b bVar3 = eVar.B;
                    int iA = bVar3.a(drawableG);
                    bVar3.H[iA] = iArrTrimStateSet;
                    bVar3.J.d(iA, Integer.valueOf(resourceId));
                } else {
                    if (xmlResourceParser.getName().equals("transition")) {
                        TypedArray typedArrayF3 = h0.b.f(resources2, theme, attributeSet, j.c.f12271c);
                        int resourceId3 = typedArrayF3.getResourceId(2, -1);
                        int resourceId4 = typedArrayF3.getResourceId(1, -1);
                        int resourceId5 = typedArrayF3.getResourceId(z10 ? 1 : 0, -1);
                        Drawable drawableG2 = resourceId5 > 0 ? n2.d().g(context2, resourceId5) : null;
                        boolean z11 = typedArrayF3.getBoolean(3, z10);
                        typedArrayF3.recycle();
                        if (drawableG2 == null) {
                            do {
                                next = xmlResourceParser.next();
                            } while (next == 4);
                            if (next != 2) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (xmlResourceParser.getName().equals("animated-vector")) {
                                drawableG2 = new k2.d(context2);
                                drawableG2.inflate(resources2, xmlResourceParser, attributeSet, theme);
                            } else {
                                drawableG2 = j.b.a(resources, xmlResourceParser, attributeSet, theme);
                            }
                        }
                        if (drawableG2 == null) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (resourceId3 == -1 || resourceId4 == -1) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                        }
                        b bVar4 = eVar.B;
                        int iA2 = bVar4.a(drawableG2);
                        long j10 = resourceId3;
                        long j11 = resourceId4;
                        long j12 = (j10 << 32) | j11;
                        long j13 = z11 ? 8589934592L : 0L;
                        long j14 = iA2;
                        bVar4.I.a(Long.valueOf(j14 | j13), j12);
                        if (z11) {
                            bVar4.I.a(Long.valueOf(j14 | 4294967296L | j13), (j11 << 32) | j10);
                        }
                        context2 = context;
                        resources2 = resources;
                        i10 = 1;
                        z10 = false;
                    } else {
                        context2 = context;
                        resources2 = resources;
                    }
                    i11 = 2;
                    i12 = 3;
                }
                i10 = 1;
                i11 = 2;
                i12 = 3;
            }
        }
        eVar.onStateChange(eVar.getState());
        return eVar;
    }

    @Override
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override
    public final void d(b bVar) {
        this.f10478a = bVar;
        int i10 = this.h;
        if (i10 >= 0) {
            Drawable drawableD = bVar.d(i10);
            this.f10480c = drawableD;
            if (drawableD != null) {
                b(drawableD);
            }
        }
        this.d = null;
        this.f10476y = bVar;
        this.B = bVar;
    }

    public final Drawable f() {
        if (!this.A) {
            super.mutate();
            b bVar = this.f10476y;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.A = true;
        }
        return this;
    }

    @Override
    public final boolean isStateful() {
        return true;
    }

    @Override
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        v7 v7Var = this.C;
        if (v7Var != null) {
            v7Var.d();
            this.C = null;
            c(this.D);
            this.D = -1;
            this.E = -1;
        }
    }

    @Override
    public final Drawable mutate() {
        if (!this.F) {
            f();
            b bVar = this.B;
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            this.F = true;
        }
        return this;
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        int i10;
        v7 aVar;
        b bVar = this.B;
        int iF = bVar.f(iArr);
        if (iF < 0) {
            iF = bVar.f(StateSet.WILD_CARD);
        }
        boolean z10 = false;
        if (iF != this.h) {
            v7 v7Var = this.C;
            if (v7Var != null) {
                if (iF != this.D) {
                    if (iF == this.E && v7Var.a()) {
                        v7Var.b();
                        this.D = this.E;
                        this.E = iF;
                    } else {
                        i10 = this.D;
                        v7Var.d();
                    }
                }
                z10 = true;
            } else {
                i10 = this.h;
            }
            this.C = null;
            this.E = -1;
            this.D = -1;
            b bVar2 = this.B;
            int iE = bVar2.e(i10);
            int iE2 = bVar2.e(iF);
            if (iE2 != 0 && iE != 0) {
                long j10 = ((long) iE2) | (((long) iE) << 32);
                int iLongValue = (int) ((Long) bVar2.I.g(-1L, j10)).longValue();
                if (iLongValue >= 0) {
                    boolean z11 = (((Long) bVar2.I.g(-1L, j10)).longValue() & 8589934592L) != 0;
                    c(iLongValue);
                    Object obj = this.f10480c;
                    if (obj instanceof AnimationDrawable) {
                        aVar = new c((AnimationDrawable) obj, (((Long) bVar2.I.g(-1L, j10)).longValue() & 4294967296L) != 0, z11);
                    } else if (obj instanceof k2.d) {
                        aVar = new a((k2.d) obj, 1);
                    } else if (obj instanceof Animatable) {
                        aVar = new a((Animatable) obj, 0);
                    } else if (c(iF)) {
                        z10 = true;
                    }
                    aVar.c();
                    this.C = aVar;
                    this.E = i10;
                    this.D = iF;
                    z10 = true;
                } else if (c(iF)) {
                    z10 = true;
                }
            } else if (c(iF)) {
                z10 = true;
            }
        }
        Drawable drawable = this.f10480c;
        return drawable != null ? drawable.setState(iArr) | z10 : z10;
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        v7 v7Var = this.C;
        if (v7Var != null && (visible || z11)) {
            if (z10) {
                v7Var.c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }
}
