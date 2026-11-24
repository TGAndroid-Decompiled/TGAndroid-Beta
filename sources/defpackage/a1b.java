package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;
public class a1b extends FrameLayout implements jm7 {
    public final zka E;
    public boolean F;
    public int G;
    public int H;
    public ValueAnimator I;
    public float J;
    public boolean K;
    public final qmb a;
    public final bf0 b;
    public final RadialProgressView c;
    public final xna d;
    public final l66 e;
    public final b61 f;
    public boolean h;
    public final ylb n;
    public int r;
    public final View s;
    public int w;
    public final int x;
    public boolean y;

    public a1b(Context context, View view, int i, ylb ylbVar) {
        super(context);
        this.x = z8c.t0;
        this.E = new zka(this, (byte) 4);
        this.H = cmb.b7;
        this.n = ylbVar;
        this.s = view;
        this.r = i;
        qmb qmbVar = new qmb((byte) 20, context, this);
        this.a = qmbVar;
        qmbVar.setOrientation(1);
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        bf0Var.setOnClickListener(new oha(this, (byte) 11));
        xna xnaVar = new xna(context);
        this.d = xnaVar;
        xnaVar.setTypeface(gm.o());
        int i2 = cmb.F6;
        xnaVar.setTag(Integer.valueOf(i2));
        anb.X(xnaVar, i2, ylbVar);
        xnaVar.setTextSize(1, 20.0f);
        xnaVar.setGravity(17);
        l66 l66Var = new l66(context, null);
        this.e = l66Var;
        int i3 = cmb.x6;
        l66Var.setTag(Integer.valueOf(i3));
        anb.X(l66Var, i3, ylbVar);
        anb.G(l66Var, cmb.I6, ylbVar);
        l66Var.setTextSize(1, 14.0f);
        l66Var.setGravity(17);
        b61 i4 = mlb.i(24, ylbVar, context, true);
        this.f = i4;
        i4.setVisibility(8);
        qmbVar.addView(bf0Var, qoe.r(117, 117, 1));
        qmbVar.addView(xnaVar, qoe.t(-2, -2, 1, 0, 12, 0, 0));
        qmbVar.addView(l66Var, qoe.t(-2, -2, 1, 0, 8, 0, 0));
        qmbVar.addView(i4, qoe.t(-1, 48, 1, 28, 16, 28, 0));
        addView(qmbVar, qoe.d(-2, -2.0f, 17, 46.0f, 0.0f, 46.0f, 30.0f));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, ylbVar);
            this.c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, qoe.e(-2, -2, 17));
        }
    }

    public void a() {
        invalidate();
    }

    public final void b(int i, boolean z) {
        if (this.w != i) {
            int i2 = 0;
            if (getVisibility() != 0) {
                z = false;
            }
            this.w = i;
            int i3 = -(i >> 1);
            if (i > 0) {
                i2 = gm.L(20.0f);
            }
            float f = i3 + i2;
            RadialProgressView radialProgressView = this.c;
            qmb qmbVar = this.a;
            if (z) {
                ViewPropertyAnimator translationY = qmbVar.animate().translationY(f);
                d53 d53Var = d53.f;
                translationY.setInterpolator(d53Var).setDuration(250L);
                if (radialProgressView != null) {
                    radialProgressView.animate().translationY(f).setInterpolator(d53Var).setDuration(250L);
                    return;
                }
                return;
            }
            qmbVar.setTranslationY(f);
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(f);
            }
        }
    }

    public final void c() {
        Object obj;
        TLRPC.Document document;
        int i;
        int i2 = this.r;
        bf0 bf0Var = this.b;
        if (i2 != 0) {
            boolean z = true;
            if (i2 != 1) {
                int i3 = this.x;
                TLRPC.Document document2 = null;
                String str = null;
                document2 = null;
                document2 = null;
                if (i2 == 16) {
                    document = hs6.d0(i3).V("👍");
                    obj = null;
                } else {
                    TLRPC.TL_messages_stickerSet q0 = hs6.d0(i3).q0("tg_placeholders_android");
                    if (q0 == null) {
                        q0 = hs6.d0(i3).o0("tg_placeholders_android");
                    }
                    if (q0 != null && (i = this.r) >= 0 && i < q0.documents.size()) {
                        document2 = q0.documents.get(this.r);
                    }
                    obj = q0;
                    document = document2;
                    str = "130_130";
                }
                if (!e86.e(3)) {
                    str = td4.p(str, "_firstframe");
                }
                if (document != null) {
                    meb d = eq3.d(document.thumbs, this.H, 0.2f, false);
                    if (d != null) {
                        d.e = 512;
                        d.f = 512;
                    }
                    bf0Var.n(gn5.b(document), str, "tgs", d, obj);
                    int i4 = this.r;
                    if (i4 != 9 && i4 != 0) {
                        bf0Var.getImageReceiver().M(2);
                        return;
                    } else {
                        bf0Var.getImageReceiver().M(1);
                        return;
                    }
                }
                hs6 d0 = hs6.d0(i3);
                if (obj != null) {
                    z = false;
                }
                d0.d1("tg_placeholders_android", false, z);
                bf0Var.getImageReceiver().f();
                return;
            }
        }
        bf0Var.setImageDrawable(new p09(2131624315, gm.L(130.0f), gm.L(130.0f)));
    }

    public final void d(int i, boolean z) {
        boolean z2;
        float f;
        float f2;
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.K != z2) {
            this.K = z2;
            setEnabled(z2);
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.I = null;
            }
            if (!z) {
                if (z2) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                this.J = f2;
                a();
            } else {
                float f3 = this.J;
                if (z2) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f3, f);
                this.I = ofFloat;
                ofFloat.setDuration(480L);
                this.I.setInterpolator(d53.h);
                this.I.addUpdateListener(new rha(this, (byte) 12));
                this.I.start();
            }
        }
        int visibility = getVisibility();
        bf0 bf0Var = this.b;
        RadialProgressView radialProgressView = this.c;
        qmb qmbVar = this.a;
        View view = this.s;
        if (visibility != i && i == 0) {
            if (this.h) {
                qmbVar.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                qmbVar.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new z0b(this, (byte) 0)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                bf0Var.getImageReceiver().w0(false);
            }
        }
        super.setVisibility(i);
        if (getVisibility() == 0) {
            c();
            return;
        }
        this.G = 0;
        qmbVar.setAlpha(0.0f);
        qmbVar.setScaleX(0.8f);
        qmbVar.setScaleY(0.8f);
        if (view != null) {
            view.animate().setListener(null).cancel();
            view.animate().setListener(new z0b(this, (byte) 1)).alpha(0.0f).setDuration(150L).start();
        } else {
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.5f);
            radialProgressView.setScaleY(0.5f);
        }
        bf0Var.getImageReceiver().x0();
        bf0Var.getImageReceiver().f();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            c();
        }
    }

    public void e(boolean z, boolean z2) {
        if (this.h != z) {
            this.h = z;
            if (getVisibility() == 0) {
                RadialProgressView radialProgressView = this.c;
                View view = this.s;
                qmb qmbVar = this.a;
                if (z2) {
                    if (z) {
                        qmbVar.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                        this.E.run();
                        return;
                    }
                    qmbVar.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.animate().setListener(new z0b(this, (byte) 2)).alpha(0.0f).setDuration(150L).start();
                    } else {
                        radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                    }
                    this.b.getImageReceiver().w0(false);
                } else if (z) {
                    qmbVar.animate().cancel();
                    qmbVar.setAlpha(0.0f);
                    qmbVar.setScaleX(0.8f);
                    qmbVar.setScaleY(0.8f);
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.setAlpha(1.0f);
                        view.setVisibility(0);
                        return;
                    }
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setScaleX(1.0f);
                    radialProgressView.setScaleY(1.0f);
                } else {
                    qmbVar.animate().cancel();
                    qmbVar.setAlpha(1.0f);
                    qmbVar.setScaleX(1.0f);
                    qmbVar.setScaleY(1.0f);
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.setVisibility(8);
                        return;
                    }
                    radialProgressView.setAlpha(0.0f);
                    radialProgressView.setScaleX(0.5f);
                    radialProgressView.setScaleY(0.5f);
                }
            }
        }
    }

    public float getVisibilityFactor() {
        return this.J;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            c();
        }
        nm7.f(this.x).b(this, nm7.y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.x).n(this, nm7.y0);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if ((this.F || this.y) && (i5 = this.G) > 0 && i5 != getMeasuredHeight()) {
            float measuredHeight = (this.G - getMeasuredHeight()) / 2.0f;
            qmb qmbVar = this.a;
            qmbVar.setTranslationY(qmbVar.getTranslationY() + measuredHeight);
            if (!this.y) {
                qmbVar.animate().translationY(0.0f).setInterpolator(d53.f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.y) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(d53.f).setDuration(250L);
                }
            }
        }
        this.G = getMeasuredHeight();
    }

    public void setAnimateLayoutChange(boolean z) {
        this.F = z;
    }

    public void setPreventMoving(boolean z) {
        this.y = z;
        if (!z) {
            this.a.setTranslationY(0.0f);
            RadialProgressView radialProgressView = this.c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(0.0f);
            }
        }
    }

    public void setStickerType(int i) {
        if (this.r != i) {
            this.r = i;
            c();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (Character.isWhitespace(charSequence.charAt(i2))) {
                i++;
            }
        }
        if (i > 4 && charSequence.length() > 20) {
            int length = charSequence.length() >> 1;
            int i3 = 0;
            int i4 = -1;
            for (int i5 = 0; i5 < charSequence.length(); i5++) {
                if (Character.isWhitespace(charSequence.charAt(i5))) {
                    int abs = Math.abs(length - i5);
                    if (i4 == -1 || abs < i3) {
                        i4 = i5;
                        i3 = abs;
                    }
                }
            }
            if (i4 > 0) {
                charSequence = ((Object) charSequence.subSequence(0, i4)) + "\n" + ((Object) charSequence.subSequence(i4 + 1, charSequence.length()));
            }
        }
        this.e.setText(charSequence);
    }

    @Override
    public void setVisibility(int i) {
        d(i, true);
    }

    public a1b(Context context) {
        this(context, null, 1, null);
    }
}
