package defpackage;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Wallet.c;
public final class ku8 extends Dialog {
    public final RectF E;
    public final jz4 F;
    public final km0 G;
    public Bitmap H;
    public iq5 I;
    public float J;
    public float K;
    public boolean L;
    public final in3 M;
    public final RectF N;
    public final RectF O;
    public ValueAnimator P;
    public ValueAnimator Q;
    public float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public Runnable V;
    public final int[] W;
    public final d a;
    public final yq8 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final RectF f;
    public final iu8 h;
    public final ju8 n;
    public final soc r;
    public final mqc s;
    public final a6 w;
    public final TextView x;
    public final Paint y;

    public ku8(final d dVar, yq8 yq8Var, TLRPC.User user, final TL_wallet.card cardVar) {
        super(dVar.getParentActivity(), 2131755352);
        String a0;
        RectF rectF = new RectF();
        this.f = rectF;
        this.y = new Paint(3);
        this.E = new RectF();
        jz4 jz4Var = new jz4();
        this.F = jz4Var;
        this.I = iq5.e;
        this.M = new in3((byte) 7);
        this.N = new RectF();
        this.O = new RectF();
        this.W = new int[2];
        this.a = dVar;
        this.b = yq8Var;
        boolean z = user != null && user.id == z8c.h(dVar.getCurrentAccount()).e();
        this.e = z;
        boolean z2 = (user == null || z || !oc7.r1(dVar.getCurrentAccount()).l4.n0.f) ? false : true;
        this.c = z2;
        this.d = (user == null || z || z2) ? false : true;
        int[] iArr = new int[2];
        yq8Var.getLocationOnScreen(iArr);
        rectF.set(yq8Var.w);
        rectF.offset(iArr[0], iArr[1]);
        gm.S(getWindow());
        iu8 iu8Var = new iu8(this, getContext());
        this.h = iu8Var;
        ju8 ju8Var = new ju8(this, getContext());
        this.n = ju8Var;
        ju8Var.setAlpha(0.0f);
        iu8Var.addView(ju8Var, qoe.c(-1.0f, -1));
        iu8Var.setClipChildren(false);
        iu8Var.setClipToPadding(false);
        iu8Var.setOnClickListener(new wk8(this, (byte) 5));
        h68 h68Var = new h68(this, (byte) 17);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(iu8Var, h68Var);
        soc socVar = new soc(getContext());
        this.r = socVar;
        socVar.setDiamondOnCard(true);
        int currentAccount = dVar.getCurrentAccount();
        String r = m9c.r(user);
        Locale locale = Locale.ROOT;
        socVar.setCardHolder(r.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            socVar.setCardNumber(soc.d(cardVar.address.toUpperCase(locale)));
        }
        socVar.j(currentAccount, cardVar.balance);
        CharSequence q = c.C(currentAccount).q(cardVar.balance, false);
        if (!TextUtils.isEmpty(q)) {
            socVar.P.c(q, false, true);
        }
        socVar.setCardOnClickListener(new View.OnClickListener(this) {
            public final ku8 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                ak8 ak8Var;
                byte b = r4;
                TL_wallet.card cardVar2 = cardVar;
                d dVar2 = dVar;
                ku8 ku8Var = this.b;
                switch (b) {
                    case 0:
                        if (!ku8Var.S) {
                            if (ku8Var.e) {
                                goc.M0(dVar2.getCurrentAccount(), dVar2.getResourceProvider(), ku8Var.getContext());
                                return;
                            } else if (!TextUtils.isEmpty(cardVar2.address)) {
                                Context context = ku8Var.getContext();
                                int currentAccount2 = dVar2.getCurrentAccount();
                                String str = cardVar2.address;
                                if (!ku8Var.c) {
                                    ak8Var = null;
                                } else {
                                    ak8Var = new ak8(ku8Var, dVar2, cardVar2, (byte) 8);
                                }
                                goc.N0(context, currentAccount2, str, false, ak8Var, dVar2.getResourceProvider());
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    default:
                        if (!ku8Var.S) {
                            if (ku8Var.e) {
                                ku8Var.V = new sq8(dVar2, (byte) 22);
                            } else if (ku8Var.d) {
                                ku8Var.V = new sq8(dVar2, (byte) 23);
                            } else if (ku8Var.c && !TextUtils.isEmpty(cardVar2.address)) {
                                ku8Var.V = new fu8(dVar2, cardVar2, (byte) 1);
                            } else {
                                return;
                            }
                            ku8Var.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        socVar.setOnClickListener(new x10((byte) 1));
        socVar.setAlpha(0.0f);
        iu8Var.addView(socVar, qoe.c(-2.0f, -2));
        mqc mqcVar = new mqc(dVar, socVar, null, cardVar);
        this.s = mqcVar;
        iu8Var.addView(mqcVar, qoe.c(-1.0f, -1));
        km0 km0Var = new km0(jz4Var, jz4Var, jz4Var);
        this.G = km0Var;
        km0Var.h = new zgc(iu8Var);
        km0Var.i = iu8Var;
        a6 a6Var = new a6(getContext());
        this.w = a6Var;
        im0 c = km0Var.c(a6Var, new bm0(cmb.c6, dVar.getResourceProvider()), false);
        c.q(gm.L(8.0f));
        c.r(gm.L(22.0f));
        a6Var.setBackground(c);
        rve.b(a6Var, 0.02f, 1.2f);
        b61 b61Var = new b61(dVar.getResourceProvider(), getContext(), true);
        b61Var.setUseWrapContent(true);
        b61Var.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        b61Var.setRoundRadius(19);
        CharSequence M0 = jb6.M0(z ? 2131742724 : z2 ? 2131742680 : 2131749033, null);
        if (!z2) {
            b61Var.i(M0, false, true);
        } else {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(M0);
            pn2 pn2Var = new pn2(2131231961, 0);
            pn2Var.c(gm.L(20.0f));
            pn2Var.y = -1;
            append.setSpan(pn2Var, 0, 1, 33);
            b61Var.i(append, false, true);
        }
        b61Var.setStateListAnimator(null);
        a6Var.addView(b61Var, qoe.e(-2, -1, 17));
        a6Var.setContentDescription(M0);
        a6Var.setOnClickListener(new View.OnClickListener(this) {
            public final ku8 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                ak8 ak8Var;
                byte b = r4;
                TL_wallet.card cardVar2 = cardVar;
                d dVar2 = dVar;
                ku8 ku8Var = this.b;
                switch (b) {
                    case 0:
                        if (!ku8Var.S) {
                            if (ku8Var.e) {
                                goc.M0(dVar2.getCurrentAccount(), dVar2.getResourceProvider(), ku8Var.getContext());
                                return;
                            } else if (!TextUtils.isEmpty(cardVar2.address)) {
                                Context context = ku8Var.getContext();
                                int currentAccount2 = dVar2.getCurrentAccount();
                                String str = cardVar2.address;
                                if (!ku8Var.c) {
                                    ak8Var = null;
                                } else {
                                    ak8Var = new ak8(ku8Var, dVar2, cardVar2, (byte) 8);
                                }
                                goc.N0(context, currentAccount2, str, false, ak8Var, dVar2.getResourceProvider());
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    default:
                        if (!ku8Var.S) {
                            if (ku8Var.e) {
                                ku8Var.V = new sq8(dVar2, (byte) 22);
                            } else if (ku8Var.d) {
                                ku8Var.V = new sq8(dVar2, (byte) 23);
                            } else if (ku8Var.c && !TextUtils.isEmpty(cardVar2.address)) {
                                ku8Var.V = new fu8(dVar2, cardVar2, (byte) 1);
                            } else {
                                return;
                            }
                            ku8Var.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        a6Var.setAlpha(0.0f);
        a6Var.setVisibility(c() ? 0 : 8);
        iu8Var.addView(a6Var, qoe.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.x = textView;
        textView.setTextSize(14.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        textView.setLineSpacing(gm.L(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        d();
        textView.setAlpha(0.0f);
        if (z) {
            textView.setText(jb6.M0(2131742706, null));
        } else if (user != null) {
            String k = m9c.k(user, true);
            if (new BigDecimal(c.t(cardVar.balance, false)).signum() == 0) {
                a0 = jb6.a0(null, null, 2131742708, k);
            } else {
                a0 = jb6.a0(null, null, 2131742709, k, c.p("Grams", soc.e(cardVar.balance).toString(), 2131749264).toString().replace(' ', (char) 160));
            }
            textView.setText(hg5.b(a0, textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        iu8Var.addView(textView, qoe.e(-2, -2, 49));
    }

    public final void a(float f) {
        boolean z;
        long j;
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        if (i == 0) {
            if (this.U) {
                return;
            }
            this.U = true;
            z = true;
        } else {
            z = false;
        }
        this.L = z;
        soc socVar = this.r;
        socVar.getClass();
        socVar.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f);
        this.P = ofFloat;
        if (i == 0) {
            j = 650;
        } else {
            j = 380;
        }
        ofFloat.setDuration(j);
        this.P.setInterpolator(new LinearInterpolator());
        this.P.addUpdateListener(new hu8(this, (byte) 0));
        this.P.addListener(new t7(this, f, (byte) 5));
        this.P.start();
    }

    public final void b() {
        if (!this.T) {
            this.T = true;
            this.r.setLayerType(0, null);
            this.b.setEjectProgress(0.0f);
            super.dismiss();
            this.s.p();
            this.F.a(null);
            this.H = null;
            if (this.V != null && this.a.getParentActivity() != null) {
                Runnable runnable = this.V;
                this.V = null;
                gm.c3(runnable);
            }
        }
    }

    public final boolean c() {
        if (!this.c && !this.d && !this.e) {
            return false;
        }
        return true;
    }

    public final void d() {
        int i;
        boolean o = cmb.I.o();
        Bitmap bitmap = this.H;
        TextView textView = this.x;
        if (bitmap != null && !bitmap.isRecycled()) {
            iu8 iu8Var = this.h;
            if (iu8Var.getWidth() > 0 && iu8Var.getHeight() > 0) {
                o = gm.B(this.H.getPixel(Utilities.j((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) iu8Var.getWidth())) * ((float) this.H.getWidth())), this.H.getWidth() - 1, 0), Utilities.j((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) iu8Var.getHeight())) * ((float) this.H.getHeight())), this.H.getHeight() - 1, 0))) < 0.5f;
            }
        }
        if (o) {
            i = -1;
        } else {
            i = -16777216;
        }
        textView.setTextColor(cmb.p1(0.41f, i));
    }

    @Override
    public final void dismiss() {
        if (!this.T && !this.S) {
            this.S = true;
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.w.setEnabled(false);
            if (this.h.isAttachedToWindow() && this.J != 0.0f) {
                a(0.0f);
            } else {
                b();
            }
        }
    }

    public final void e() {
        float f;
        float f2;
        float interpolation = d53.g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.J / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.J - 0.3f) / 0.7f));
        float interpolation2 = d53.h.getInterpolation(max);
        if (this.L) {
            double d = 6.614378f * max;
            f = 1.0f - (((1.1338935f * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f = interpolation2;
        }
        soc socVar = this.r;
        float width = socVar.getWidth();
        float height = socVar.getHeight();
        RectF rectF = this.f;
        float max2 = Math.max(0.2f, Math.min(1.0f, rectF.width() / Math.max(1.0f, height)));
        float R1 = gm.R1(max2, 1.0f, f);
        float centerY = rectF.centerY();
        int[] iArr = this.W;
        float f3 = centerY - iArr[1];
        float f4 = max2 * width;
        float centerX = rectF.centerX() - iArr[0];
        float f5 = width / 2.0f;
        float f6 = height / 2.0f;
        float R12 = gm.R1(centerX, socVar.getLeft() + f5, f);
        float R13 = gm.R1((f4 * interpolation) + (f3 - (f4 / 2.0f)), socVar.getTop() + f6, f);
        float f7 = 1.0f - f;
        float f8 = (-90.0f) * f7;
        double d2 = f8;
        float cos = (float) Math.cos(Math.toRadians(d2));
        float sin = (float) Math.sin(Math.toRadians(d2));
        float f9 = centerX - R12;
        float f10 = f3 - R13;
        float R14 = gm.R1((((sin * f10) + (cos * f9)) / R1) + f5, f5, interpolation2);
        float R15 = gm.R1((((cos * f10) + ((-sin) * f9)) / R1) + f6, f6, interpolation2);
        float f11 = R14 - f5;
        float f12 = R15 - f6;
        socVar.setPivotX(R14);
        socVar.setPivotY(R15);
        socVar.setScaleX(R1);
        socVar.setScaleY(R1);
        socVar.setRotation(f8);
        socVar.setRotationX(35.0f * f7);
        socVar.setTranslationX((((cos * f11) - (sin * f12)) * R1) + ((R12 - socVar.getLeft()) - R14));
        socVar.setTranslationY(aq1.g(cos, f12, sin * f11, R1, (R13 - socVar.getTop()) - R15));
        if (this.J > 0.0f) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        socVar.setAlpha(f2);
        socVar.setUseGyroscope(this.R * interpolation2);
        float f13 = 1.0f - interpolation2;
        this.K = Math.max(0.0f, f3 * f13);
        this.b.setEjectProgress(interpolation);
        this.n.setAlpha(this.J);
        this.s.setAlpha(interpolation2);
        a6 a6Var = this.w;
        a6Var.setAlpha(interpolation2);
        TextView textView = this.x;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-gm.L(8.0f)) * f13);
        a6Var.setTranslationY(gm.L(16.0f) * f13);
        a6Var.setScaleX(gm.R1(0.8f, 1.0f, interpolation2));
        a6Var.setScaleY(gm.R1(0.8f, 1.0f, interpolation2));
        this.h.invalidate();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        iu8 iu8Var = this.h;
        setContentView(iu8Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = -1;
        attributes.width = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        iu8Var.setSystemUiVisibility(1792);
        gm.j3(iu8Var, !cmb.I.o());
        gm.n3(window, !cmb.I.o());
    }

    @Override
    public final void show() {
        if (!gm.K1(getContext())) {
            return;
        }
        vs9.d(new vh8(this, (byte) 5));
        super.show();
        WeakHashMap weakHashMap = kfc.a;
        afc.c(this.h);
    }
}
