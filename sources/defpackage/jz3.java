package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public class jz3 extends ViewGroup implements vlb {
    public boolean E;
    public Boolean F;
    public float G;
    public float H;
    public boolean I;
    public ValueAnimator J;
    public int K;
    public int L;
    public int M;
    public float N;
    public final mz3 O;
    public Long a;
    public boolean b;
    public final boolean c;
    public final bf0 d;
    public final p09 e;
    public final pj8 f;
    public final boolean h;
    public final boolean n;
    public Long r;
    public TLRPC.Document s;
    public s14 w;
    public vm x;
    public boolean y;

    public jz3(mz3 mz3Var, Context context, int i) {
        super(context);
        this.O = mz3Var;
        setFocusable(true);
        this.N = -1.0f;
        this.h = true;
        this.n = false;
        setBackground(cmb.N(mz3Var.k(), 0, 0));
        p09 p09Var = new p09(i, gm.L(24.0f), gm.L(24.0f), false, null);
        this.e = p09Var;
        p09Var.setBounds(gm.L(3.0f), gm.L(3.0f), gm.L(27.0f), gm.L(27.0f));
        p09Var.M(this);
        p09Var.E(true);
        p09Var.start();
        d();
    }

    private void setColor(int i) {
        mz3 mz3Var = this.O;
        int i2 = mz3Var.T;
        if (i2 == 5 || i2 == 7) {
            i = mz3Var.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        bf0 bf0Var = this.d;
        if (bf0Var != null && !this.c) {
            bf0Var.setColorFilter(porterDuffColorFilter);
            bf0Var.invalidate();
        }
        p09 p09Var = this.e;
        if (p09Var != null) {
            p09Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        pj8 pj8Var = this.f;
        if (pj8Var == null) {
            return;
        }
        this.F = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            pj8Var.setImageResource(2131232250);
            return;
        }
        Drawable mutate = getResources().getDrawable(2131232232).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        pj8Var.setImageDrawable(mutate);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Df));
        hashSet.add(Integer.valueOf(cmb.Ff));
        hashSet.add(Integer.valueOf(cmb.Ml));
    }

    public final void b() {
        mm mmVar;
        vm vmVar = this.x;
        if (vmVar != null && (mmVar = vmVar.k) != null) {
            if (mmVar.y() != null) {
                mmVar.y().H(0);
                mmVar.y().stop();
            } else if (mmVar.m() != null) {
                mmVar.m().stop();
            }
        }
    }

    public final void c() {
        gn5 gn5Var;
        TLRPC.PhotoSize w;
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        vm m;
        bf0 bf0Var = this.d;
        if (bf0Var == null) {
            return;
        }
        if (this.y && this.E) {
            vm vmVar = this.x;
            if (vmVar == null) {
                if (this.s != null || this.r != null) {
                    bf0Var.b();
                    TLRPC.Document document = this.s;
                    int i = z8c.t0;
                    mz3 mz3Var = this.O;
                    if (document != null) {
                        m = vm.l(i, mz3Var.S, document);
                        this.x = m;
                    } else {
                        m = vm.m(i, this.r.longValue(), null, mz3Var.S);
                        this.x = m;
                    }
                    m.b(bf0Var);
                    bf0Var.setImageDrawable(this.x);
                }
            } else {
                vmVar.o(bf0Var);
                this.x = null;
            }
            bf0Var.b();
            s14 s14Var = this.w;
            if (s14Var != null) {
                TLRPC.StickerSet stickerSet = s14Var.b;
                if (stickerSet == null || (w = bc4.w(stickerSet.thumbs, 90, false, null, false)) == null) {
                    gn5Var = null;
                } else {
                    if (stickerSet.access_hash != 0) {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetShortName.id = stickerSet.id;
                        tL_inputStickerSetShortName.access_hash = stickerSet.access_hash;
                    } else {
                        tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = stickerSet.short_name;
                    }
                    TLRPC.InputStickerSet inputStickerSet = tL_inputStickerSetShortName;
                    TLRPC.FileLocation fileLocation = w.location;
                    gn5Var = gn5.h(fileLocation, w.size, null, null, null, 1, fileLocation.dc_id, inputStickerSet, w.type);
                }
                this.d.n(gn5Var, "24_24", null, null, this.w);
                if (this.w.d != null) {
                    hs6.d0(z8c.t0).n0(this.w.d, false);
                    this.w.d = null;
                }
            }
        } else {
            vm vmVar2 = this.x;
            if (vmVar2 != null) {
                vmVar2.o(bf0Var);
                this.x = null;
            }
            bf0Var.b();
        }
        if (this.y && this.E) {
            bf0Var.onAttachedToWindow();
        } else {
            bf0Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        mz3 mz3Var = this.O;
        int k = mz3Var.k();
        ylb ylbVar = mz3Var.s;
        cmb.F1(background, k, false);
        if (mz3Var.P) {
            setColor(on2.p(cmb.v0(cmb.Ml, ylbVar), (int) (gm.R1(0.4f, 0.8f, this.H) * 255.0f)));
            return;
        }
        setColor(on2.f(this.H, cmb.v0(cmb.Df, ylbVar), cmb.v0(cmb.Ff, ylbVar)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        p09 p09Var = this.e;
        if (p09Var != null && this.E) {
            p09Var.draw(canvas);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.E) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public final void e(boolean z) {
        float f;
        int i;
        float f2 = this.G;
        float f3 = 0.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (Math.abs(f2 - f) < 0.01f) {
            return;
        }
        if (z) {
            f3 = 1.0f;
        }
        this.G = f3;
        pj8 pj8Var = this.f;
        pj8Var.setScaleX(f3);
        pj8Var.setScaleY(this.G);
        pj8Var.setAlpha(this.G);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        pj8Var.setVisibility(i);
    }

    public final void f() {
        pj8 pj8Var = this.f;
        if (pj8Var != null && !pj8Var.h && (getDrawable() instanceof vm)) {
            if (((vm) getDrawable()).c()) {
                pj8Var.setImageReceiver(null);
                pj8Var.setColor(this.O.Q);
                return;
            }
            mm mmVar = ((vm) getDrawable()).k;
            if (mmVar != null) {
                pj8Var.setImageReceiver(mmVar);
                pj8Var.invalidate();
            }
        }
    }

    public final void g(boolean z, boolean z2) {
        long j;
        bf0 bf0Var = this.d;
        if ((bf0Var != null && bf0Var.getImageReceiver().T == null && !this.O.P) || this.I == z) {
            return;
        }
        this.I = z;
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
        }
        if (!z) {
            b();
        }
        float f = 0.0f;
        if (z2) {
            float f2 = this.H;
            if (z) {
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new et1(this, (byte) 23));
            this.J.addListener(new y7((byte) 29, this, z));
            ValueAnimator valueAnimator2 = this.J;
            if (oi5.d()) {
                j = 0;
            } else {
                j = 350;
            }
            valueAnimator2.setDuration(j);
            this.J.setInterpolator(d53.h);
            this.J.start();
            return;
        }
        if (z) {
            f = 1.0f;
        }
        this.H = f;
        d();
    }

    public Drawable getDrawable() {
        bf0 bf0Var = this.d;
        if (bf0Var != null) {
            return bf0Var.getImageReceiver().T;
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (oi5.b(this)) {
            return;
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = true;
        c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = false;
        c();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (!this.E) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        TLRPC.Document e;
        TLRPC.StickerSet stickerSet;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String contentDescription = accessibilityNodeInfo.getContentDescription();
        if (contentDescription == null) {
            s14 s14Var = this.w;
            if (s14Var != null && (stickerSet = s14Var.b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.s;
                if (document != null) {
                    contentDescription = k47.V(document, null, null);
                } else {
                    Long l = this.r;
                    if (l != null && (e = vm.e(z8c.t0, l.longValue())) != null) {
                        contentDescription = k47.V(e, null, null);
                    }
                }
            }
        }
        Boolean bool = this.F;
        if (bool != null && !bool.booleanValue()) {
            String M0 = jb6.M0(2131750768, null);
            if (contentDescription == null) {
                contentDescription = M0;
            } else {
                contentDescription = ((Object) contentDescription) + ", " + M0;
            }
        }
        if (contentDescription != null) {
            accessibilityNodeInfo.setContentDescription(contentDescription);
        }
        accessibilityNodeInfo.setSelected(this.I);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        bf0 bf0Var = this.d;
        if (bf0Var != null) {
            int i5 = (i3 - i) / 2;
            int i6 = (i4 - i2) / 2;
            bf0Var.layout(i5 - (bf0Var.getMeasuredWidth() / 2), i6 - (bf0Var.getMeasuredHeight() / 2), (bf0Var.getMeasuredWidth() / 2) + i5, (bf0Var.getMeasuredHeight() / 2) + i6);
        }
        pj8 pj8Var = this.f;
        if (pj8Var != null) {
            int i7 = i3 - i;
            int i8 = i4 - i2;
            pj8Var.layout(i7 - pj8Var.getMeasuredWidth(), i8 - pj8Var.getMeasuredHeight(), i7, i8);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(gm.L(30.0f), gm.L(30.0f));
        bf0 bf0Var = this.d;
        if (bf0Var != null) {
            bf0Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(24.0f), 1073741824));
        }
        pj8 pj8Var = this.f;
        if (pj8Var != null) {
            pj8Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        mm mmVar;
        vm vmVar = this.x;
        if (vmVar != null && (mmVar = vmVar.k) != null) {
            if (mmVar.m() != null) {
                mmVar.m().y(0L, true, false);
            }
            mmVar.w0(false);
        }
        return super.performClick();
    }

    public void setAnimatedEmojiDocument(TLRPC.Document document) {
        long j;
        TLRPC.Document document2 = this.s;
        if ((document2 != null || this.r != null) && document != null) {
            Long l = this.r;
            if (l != null) {
                j = l.longValue();
            } else {
                j = document2.id;
            }
            if (j == document.id) {
                return;
            }
        }
        vm vmVar = this.x;
        bf0 bf0Var = this.d;
        if (vmVar != null) {
            vmVar.o(bf0Var);
            this.x = null;
        }
        bf0Var.b();
        this.s = document;
        this.r = null;
        c();
    }

    public void setAnimatedEmojiDocumentId(long j) {
        long j2;
        TLRPC.Document document = this.s;
        if ((document != null || this.r != null) && j != 0) {
            Long l = this.r;
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = document.id;
            }
            if (j2 == j) {
                return;
            }
        }
        vm vmVar = this.x;
        bf0 bf0Var = this.d;
        Long l2 = null;
        if (vmVar != null) {
            vmVar.o(bf0Var);
            this.x = null;
        }
        bf0Var.b();
        this.s = null;
        if (j != 0) {
            l2 = Long.valueOf(j);
        }
        this.r = l2;
        c();
    }

    public void setDrawable(Drawable drawable) {
        setAnimatedEmojiDocument(null);
        setStickerThumb(null);
        this.d.setImageDrawable(drawable);
    }

    public void setStickerThumb(s14 s14Var) {
        if (s14Var != null && s14Var.b == null) {
            s14Var = null;
        }
        s14 s14Var2 = this.w;
        if (s14Var2 != null && s14Var != null && s14Var2.b.id == s14Var.b.id) {
            return;
        }
        vm vmVar = this.x;
        bf0 bf0Var = this.d;
        if (vmVar != null && this.s == null && this.r == null) {
            vmVar.o(bf0Var);
            this.x = null;
        }
        bf0Var.b();
        this.w = s14Var;
        c();
    }

    @Override
    public final void updateColors() {
        mz3 mz3Var = this.O;
        try {
            int v0 = cmb.v0(cmb.Df, mz3Var.s);
            int v02 = cmb.v0(cmb.Ff, mz3Var.s);
            int k = mz3Var.k();
            if (v0 == this.K && v02 == this.L && k == this.M && this.N == this.H) {
                return;
            }
            this.K = v0;
            this.L = v02;
            this.M = k;
            this.N = this.H;
            d();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (oi5.b(this)) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }

    public jz3(mz3 mz3Var, Context context, int i, boolean z) {
        super(context);
        this.O = mz3Var;
        setFocusable(true);
        this.N = -1.0f;
        this.h = false;
        this.n = z;
        if (z) {
            setBackground(cmb.Y(mz3Var.k(), 8, 8));
        }
        bf0 bf0Var = new bf0(context);
        this.d = bf0Var;
        bf0Var.x = false;
        bf0Var.setImageDrawable(context.getResources().getDrawable(i).mutate());
        d();
        addView(bf0Var);
    }

    public jz3(mz3 mz3Var, Context context, TLRPC.Document document) {
        super(context);
        this.O = mz3Var;
        setFocusable(true);
        this.N = -1.0f;
        this.b = true;
        this.h = false;
        this.n = false;
        gz3 gz3Var = new gz3(this, context);
        this.d = gz3Var;
        gz3Var.x = false;
        this.s = document;
        this.c = true;
        gz3Var.setColorFilter(mz3Var.getEmojiColorFilter());
        addView(gz3Var);
        int i = pj8.M;
        pj8 pj8Var = new pj8(1, mz3Var.s, context);
        this.f = pj8Var;
        pj8Var.setAlpha(0.0f);
        pj8Var.setScaleX(0.0f);
        pj8Var.setScaleY(0.0f);
        f();
        addView(pj8Var);
        d();
    }

    public jz3(mz3 mz3Var, Context context, long j) {
        super(context);
        this.O = mz3Var;
        setFocusable(true);
        this.N = -1.0f;
        this.b = true;
        this.h = false;
        this.n = false;
        kc0 kc0Var = new kc0((byte) 4, context, this);
        this.d = kc0Var;
        kc0Var.x = false;
        this.r = Long.valueOf(j);
        this.c = true;
        kc0Var.setColorFilter(mz3Var.getEmojiColorFilter());
        addView(kc0Var);
        int i = pj8.M;
        pj8 pj8Var = new pj8(1, mz3Var.s, context);
        this.f = pj8Var;
        pj8Var.setAlpha(0.0f);
        pj8Var.setScaleX(0.0f);
        pj8Var.setScaleY(0.0f);
        f();
        addView(pj8Var);
        d();
    }
}
