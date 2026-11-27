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
public class uy3 extends ViewGroup implements snb {
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
    public final xy3 O;
    public Long a;
    public boolean b;
    public final boolean c;
    public final de0 d;
    public final b29 e;
    public final cl8 f;
    public final boolean h;
    public final boolean n;
    public Long r;
    public TLRPC.Document s;
    public c14 w;
    public wl x;
    public boolean y;

    public uy3(xy3 xy3Var, Context context, int i) {
        super(context);
        this.O = xy3Var;
        setFocusable(true);
        this.N = -1.0f;
        this.h = true;
        this.n = false;
        setBackground(aob.N(xy3Var.k(), 0, 0));
        b29 b29Var = new b29(i, hl.L(24.0f), hl.L(24.0f), false, null);
        this.e = b29Var;
        b29Var.setBounds(hl.L(3.0f), hl.L(3.0f), hl.L(27.0f), hl.L(27.0f));
        b29Var.M(this);
        b29Var.E(true);
        b29Var.start();
        d();
    }

    private void setColor(int i) {
        xy3 xy3Var = this.O;
        int i2 = xy3Var.T;
        if (i2 == 5 || i2 == 7) {
            i = xy3Var.Q;
        }
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        de0 de0Var = this.d;
        if (de0Var != null && !this.c) {
            de0Var.setColorFilter(porterDuffColorFilter);
            de0Var.invalidate();
        }
        b29 b29Var = this.e;
        if (b29Var != null) {
            b29Var.setColorFilter(porterDuffColorFilter);
            invalidate();
        }
    }

    public final void a(Boolean bool) {
        cl8 cl8Var = this.f;
        if (cl8Var == null) {
            return;
        }
        this.F = bool;
        if (bool == null) {
            e(false);
            return;
        }
        e(true);
        if (bool.booleanValue()) {
            cl8Var.setImageResource(2131232249);
            return;
        }
        Drawable mutate = getResources().getDrawable(2131232231).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        cl8Var.setImageDrawable(mutate);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Ef));
        hashSet.add(Integer.valueOf(aob.Gf));
        hashSet.add(Integer.valueOf(aob.Nl));
    }

    public final void b() {
        nl nlVar;
        wl wlVar = this.x;
        if (wlVar != null && (nlVar = wlVar.k) != null) {
            if (nlVar.y() != null) {
                nlVar.y().H(0);
                nlVar.y().stop();
            } else if (nlVar.m() != null) {
                nlVar.m().stop();
            }
        }
    }

    public final void c() {
        jn5 jn5Var;
        TLRPC.PhotoSize w;
        TLRPC.InputStickerSet tL_inputStickerSetShortName;
        wl m;
        de0 de0Var = this.d;
        if (de0Var == null) {
            return;
        }
        if (this.y && this.E) {
            wl wlVar = this.x;
            if (wlVar == null) {
                if (this.s != null || this.r != null) {
                    de0Var.b();
                    TLRPC.Document document = this.s;
                    int i = yac.t0;
                    xy3 xy3Var = this.O;
                    if (document != null) {
                        m = wl.l(i, xy3Var.S, document);
                        this.x = m;
                    } else {
                        m = wl.m(i, this.r.longValue(), null, xy3Var.S);
                        this.x = m;
                    }
                    m.b(de0Var);
                    de0Var.setImageDrawable(this.x);
                }
            } else {
                wlVar.o(de0Var);
                this.x = null;
            }
            de0Var.b();
            c14 c14Var = this.w;
            if (c14Var != null) {
                TLRPC.StickerSet stickerSet = c14Var.b;
                if (stickerSet == null || (w = xb4.w(stickerSet.thumbs, 90, false, null, false)) == null) {
                    jn5Var = null;
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
                    jn5Var = jn5.h(fileLocation, w.size, null, null, null, 1, fileLocation.dc_id, inputStickerSet, w.type);
                }
                this.d.n(jn5Var, "24_24", null, null, this.w);
                if (this.w.d != null) {
                    ls6.d0(yac.t0).n0(this.w.d, false);
                    this.w.d = null;
                }
            }
        } else {
            wl wlVar2 = this.x;
            if (wlVar2 != null) {
                wlVar2.o(de0Var);
                this.x = null;
            }
            de0Var.b();
        }
        if (this.y && this.E) {
            de0Var.onAttachedToWindow();
        } else {
            de0Var.onDetachedFromWindow();
        }
        f();
    }

    public final void d() {
        Drawable background = getBackground();
        xy3 xy3Var = this.O;
        int k = xy3Var.k();
        vnb vnbVar = xy3Var.s;
        aob.F1(background, k, false);
        if (xy3Var.P) {
            setColor(vm2.o(aob.v0(aob.Nl, vnbVar), (int) (hl.R1(0.4f, 0.8f, this.H) * 255.0f)));
            return;
        }
        setColor(vm2.f(this.H, aob.v0(aob.Ef, vnbVar), aob.v0(aob.Gf, vnbVar)));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        b29 b29Var = this.e;
        if (b29Var != null && this.E) {
            b29Var.draw(canvas);
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
        cl8 cl8Var = this.f;
        cl8Var.setScaleX(f3);
        cl8Var.setScaleY(this.G);
        cl8Var.setAlpha(this.G);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        cl8Var.setVisibility(i);
    }

    public final void f() {
        cl8 cl8Var = this.f;
        if (cl8Var != null && !cl8Var.h && (getDrawable() instanceof wl)) {
            if (((wl) getDrawable()).c()) {
                cl8Var.setImageReceiver(null);
                cl8Var.setColor(this.O.Q);
                return;
            }
            nl nlVar = ((wl) getDrawable()).k;
            if (nlVar != null) {
                cl8Var.setImageReceiver(nlVar);
                cl8Var.invalidate();
            }
        }
    }

    public final void g(boolean z, boolean z2) {
        long j;
        de0 de0Var = this.d;
        if ((de0Var != null && de0Var.getImageReceiver().T == null && !this.O.P) || this.I == z) {
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
            ofFloat.addUpdateListener(new az1(this, (byte) 22));
            this.J.addListener(new z7((byte) 29, this, z));
            ValueAnimator valueAnimator2 = this.J;
            if (ri5.d()) {
                j = 0;
            } else {
                j = 350;
            }
            valueAnimator2.setDuration(j);
            this.J.setInterpolator(k43.h);
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
        de0 de0Var = this.d;
        if (de0Var != null) {
            return de0Var.getImageReceiver().T;
        }
        return null;
    }

    @Override
    public final void invalidate() {
        if (ri5.b(this)) {
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
            c14 c14Var = this.w;
            if (c14Var != null && (stickerSet = c14Var.b) != null && (str = stickerSet.title) != null) {
                contentDescription = str;
            } else {
                TLRPC.Document document = this.s;
                if (document != null) {
                    contentDescription = r47.V(document, null, null);
                } else {
                    Long l = this.r;
                    if (l != null && (e = wl.e(yac.t0, l.longValue())) != null) {
                        contentDescription = r47.V(e, null, null);
                    }
                }
            }
        }
        Boolean bool = this.F;
        if (bool != null && !bool.booleanValue()) {
            String M0 = ob6.M0(2131750796, null);
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
        de0 de0Var = this.d;
        if (de0Var != null) {
            int i5 = (i3 - i) / 2;
            int i6 = (i4 - i2) / 2;
            de0Var.layout(i5 - (de0Var.getMeasuredWidth() / 2), i6 - (de0Var.getMeasuredHeight() / 2), (de0Var.getMeasuredWidth() / 2) + i5, (de0Var.getMeasuredHeight() / 2) + i6);
        }
        cl8 cl8Var = this.f;
        if (cl8Var != null) {
            int i7 = i3 - i;
            int i8 = i4 - i2;
            cl8Var.layout(i7 - cl8Var.getMeasuredWidth(), i8 - cl8Var.getMeasuredHeight(), i7, i8);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(hl.L(30.0f), hl.L(30.0f));
        de0 de0Var = this.d;
        if (de0Var != null) {
            de0Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(24.0f), 1073741824));
        }
        cl8 cl8Var = this.f;
        if (cl8Var != null) {
            cl8Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(12.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(12.0f), 1073741824));
        }
    }

    @Override
    public final boolean performClick() {
        nl nlVar;
        wl wlVar = this.x;
        if (wlVar != null && (nlVar = wlVar.k) != null) {
            if (nlVar.m() != null) {
                nlVar.m().y(0L, true, false);
            }
            nlVar.w0(false);
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
        wl wlVar = this.x;
        de0 de0Var = this.d;
        if (wlVar != null) {
            wlVar.o(de0Var);
            this.x = null;
        }
        de0Var.b();
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
        wl wlVar = this.x;
        de0 de0Var = this.d;
        Long l2 = null;
        if (wlVar != null) {
            wlVar.o(de0Var);
            this.x = null;
        }
        de0Var.b();
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

    public void setStickerThumb(c14 c14Var) {
        if (c14Var != null && c14Var.b == null) {
            c14Var = null;
        }
        c14 c14Var2 = this.w;
        if (c14Var2 != null && c14Var != null && c14Var2.b.id == c14Var.b.id) {
            return;
        }
        wl wlVar = this.x;
        de0 de0Var = this.d;
        if (wlVar != null && this.s == null && this.r == null) {
            wlVar.o(de0Var);
            this.x = null;
        }
        de0Var.b();
        this.w = c14Var;
        c();
    }

    @Override
    public final void updateColors() {
        xy3 xy3Var = this.O;
        try {
            int v0 = aob.v0(aob.Ef, xy3Var.s);
            int v02 = aob.v0(aob.Gf, xy3Var.s);
            int k = xy3Var.k();
            if (v0 == this.K && v02 == this.L && k == this.M && this.N == this.H) {
                return;
            }
            this.K = v0;
            this.L = v02;
            this.M = k;
            this.N = this.H;
            d();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void invalidate(int i, int i2, int i3, int i4) {
        if (ri5.b(this)) {
            return;
        }
        super.invalidate(i, i2, i3, i4);
    }

    public uy3(xy3 xy3Var, Context context, int i, boolean z) {
        super(context);
        this.O = xy3Var;
        setFocusable(true);
        this.N = -1.0f;
        this.h = false;
        this.n = z;
        if (z) {
            setBackground(aob.Y(xy3Var.k(), 8, 8));
        }
        de0 de0Var = new de0(context);
        this.d = de0Var;
        de0Var.x = false;
        de0Var.setImageDrawable(context.getResources().getDrawable(i).mutate());
        d();
        addView(de0Var);
    }

    public uy3(xy3 xy3Var, Context context, TLRPC.Document document) {
        super(context);
        this.O = xy3Var;
        setFocusable(true);
        this.N = -1.0f;
        this.b = true;
        this.h = false;
        this.n = false;
        ry3 ry3Var = new ry3(this, context);
        this.d = ry3Var;
        ry3Var.x = false;
        this.s = document;
        this.c = true;
        ry3Var.setColorFilter(xy3Var.getEmojiColorFilter());
        addView(ry3Var);
        int i = cl8.M;
        cl8 cl8Var = new cl8(1, xy3Var.s, context);
        this.f = cl8Var;
        cl8Var.setAlpha(0.0f);
        cl8Var.setScaleX(0.0f);
        cl8Var.setScaleY(0.0f);
        f();
        addView(cl8Var);
        d();
    }

    public uy3(xy3 xy3Var, Context context, long j) {
        super(context);
        this.O = xy3Var;
        setFocusable(true);
        this.N = -1.0f;
        this.b = true;
        this.h = false;
        this.n = false;
        mb0 mb0Var = new mb0((byte) 4, context, this);
        this.d = mb0Var;
        mb0Var.x = false;
        this.r = Long.valueOf(j);
        this.c = true;
        mb0Var.setColorFilter(xy3Var.getEmojiColorFilter());
        addView(mb0Var);
        int i = cl8.M;
        cl8 cl8Var = new cl8(1, xy3Var.s, context);
        this.f = cl8Var;
        cl8Var.setAlpha(0.0f);
        cl8Var.setScaleX(0.0f);
        cl8Var.setScaleY(0.0f);
        f();
        addView(cl8Var);
        d();
    }
}
