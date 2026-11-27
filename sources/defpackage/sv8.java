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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Wallet.c;
public final class sv8 extends Dialog {
    public final RectF E;
    public final nz4 F;
    public final ll0 G;
    public Bitmap H;
    public mq5 I;
    public float J;
    public float K;
    public boolean L;
    public final pm3 M;
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
    public final e a;
    public final js8 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final RectF f;
    public final qv8 h;
    public final rv8 n;
    public final frc r;
    public final wsc s;
    public final ir8 w;
    public final TextView x;
    public final Paint y;

    public sv8(final e eVar, js8 js8Var, TLRPC.User user, final TL_wallet.card cardVar) {
        super(eVar.getParentActivity(), 2131755352);
        String a0;
        RectF rectF = new RectF();
        this.f = rectF;
        this.y = new Paint(3);
        this.E = new RectF();
        nz4 nz4Var = new nz4();
        this.F = nz4Var;
        this.I = mq5.e;
        this.M = new pm3((byte) 7);
        this.N = new RectF();
        this.O = new RectF();
        this.W = new int[2];
        this.a = eVar;
        this.b = js8Var;
        boolean z = user != null && user.id == yac.h(eVar.getCurrentAccount()).e();
        this.e = z;
        boolean z2 = (user == null || z || !uc7.s1(eVar.getCurrentAccount()).l4.v0.f) ? false : true;
        this.c = z2;
        this.d = (user == null || z || z2) ? false : true;
        int[] iArr = new int[2];
        js8Var.getLocationOnScreen(iArr);
        rectF.set(js8Var.w);
        rectF.offset(iArr[0], iArr[1]);
        hl.S(getWindow());
        qv8 qv8Var = new qv8(this, getContext());
        this.h = qv8Var;
        rv8 rv8Var = new rv8(this, getContext());
        this.n = rv8Var;
        rv8Var.setAlpha(0.0f);
        qv8Var.addView(rv8Var, tre.c(-1.0f, -1));
        qv8Var.setClipChildren(false);
        qv8Var.setClipToPadding(false);
        qv8Var.setOnClickListener(new jn8(this, (byte) 4));
        jz7 jz7Var = new jz7(this, (byte) 20);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(qv8Var, jz7Var);
        frc frcVar = new frc(getContext());
        this.r = frcVar;
        frcVar.setDiamondOnCard(true);
        int currentAccount = eVar.getCurrentAccount();
        String r = lbc.r(user);
        Locale locale = Locale.ROOT;
        frcVar.setCardHolder(r.toUpperCase(locale));
        if (!TextUtils.isEmpty(cardVar.address)) {
            frcVar.setCardNumber(frc.d(cardVar.address.toUpperCase(locale)));
        }
        frcVar.j(currentAccount, cardVar.balance);
        CharSequence q = c.C(currentAccount).q(cardVar.balance, false);
        if (!TextUtils.isEmpty(q)) {
            frcVar.P.c(q, false, true);
        }
        frcVar.setCardOnClickListener(new View.OnClickListener(this) {
            public final sv8 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                sa8 sa8Var;
                byte b = r4;
                TL_wallet.card cardVar2 = cardVar;
                e eVar2 = eVar;
                sv8 sv8Var = this.b;
                switch (b) {
                    case 0:
                        if (!sv8Var.S) {
                            if (sv8Var.e) {
                                uqc.L0(eVar2.getCurrentAccount(), eVar2.getResourceProvider(), sv8Var.getContext());
                                return;
                            } else if (!TextUtils.isEmpty(cardVar2.address)) {
                                Context context = sv8Var.getContext();
                                int currentAccount2 = eVar2.getCurrentAccount();
                                String str = cardVar2.address;
                                if (!sv8Var.c) {
                                    sa8Var = null;
                                } else {
                                    sa8Var = new sa8(sv8Var, eVar2, cardVar2, (byte) 13);
                                }
                                uqc.M0(context, currentAccount2, str, false, sa8Var, eVar2.getResourceProvider());
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    default:
                        if (!sv8Var.S) {
                            if (sv8Var.e) {
                                sv8Var.V = new ds8(eVar2, (byte) 22);
                            } else if (sv8Var.d) {
                                sv8Var.V = new ds8(eVar2, (byte) 23);
                            } else if (sv8Var.c && !TextUtils.isEmpty(cardVar2.address)) {
                                sv8Var.V = new mv8(eVar2, cardVar2, (byte) 1);
                            } else {
                                return;
                            }
                            sv8Var.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        frcVar.setOnClickListener(new y00((byte) 1));
        frcVar.setAlpha(0.0f);
        qv8Var.addView(frcVar, tre.c(-2.0f, -2));
        wsc wscVar = new wsc(eVar, frcVar, null, cardVar);
        this.s = wscVar;
        qv8Var.addView(wscVar, tre.c(-1.0f, -1));
        ll0 ll0Var = new ll0(nz4Var, nz4Var, nz4Var);
        this.G = ll0Var;
        ll0Var.h = new yic(qv8Var);
        ll0Var.i = qv8Var;
        ir8 ir8Var = new ir8(getContext());
        this.w = ir8Var;
        jl0 c = ll0Var.c(ir8Var, new cl0(aob.d6, eVar.getResourceProvider()), false);
        c.q(hl.L(8.0f));
        c.r(hl.L(22.0f));
        ir8Var.setBackground(c);
        iye.b(ir8Var, 0.02f, 1.2f);
        c51 c51Var = new c51(eVar.getResourceProvider(), getContext(), true);
        c51Var.setUseWrapContent(true);
        c51Var.setPadding(hl.L(16.0f), 0, hl.L(16.0f), 0);
        c51Var.setRoundRadius(19);
        CharSequence M0 = ob6.M0(z ? 2131742692 : z2 ? 2131742648 : 2131749030, null);
        if (!z2) {
            c51Var.i(M0, false, true);
        } else {
            SpannableStringBuilder append = new SpannableStringBuilder("G  ").append(M0);
            wm2 wm2Var = new wm2(2131231960, 0);
            wm2Var.c(hl.L(20.0f));
            wm2Var.y = -1;
            append.setSpan(wm2Var, 0, 1, 33);
            c51Var.i(append, false, true);
        }
        c51Var.setStateListAnimator(null);
        ir8Var.addView(c51Var, tre.e(-2, -1, 17));
        ir8Var.setContentDescription(M0);
        ir8Var.setOnClickListener(new View.OnClickListener(this) {
            public final sv8 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                sa8 sa8Var;
                byte b = r4;
                TL_wallet.card cardVar2 = cardVar;
                e eVar2 = eVar;
                sv8 sv8Var = this.b;
                switch (b) {
                    case 0:
                        if (!sv8Var.S) {
                            if (sv8Var.e) {
                                uqc.L0(eVar2.getCurrentAccount(), eVar2.getResourceProvider(), sv8Var.getContext());
                                return;
                            } else if (!TextUtils.isEmpty(cardVar2.address)) {
                                Context context = sv8Var.getContext();
                                int currentAccount2 = eVar2.getCurrentAccount();
                                String str = cardVar2.address;
                                if (!sv8Var.c) {
                                    sa8Var = null;
                                } else {
                                    sa8Var = new sa8(sv8Var, eVar2, cardVar2, (byte) 13);
                                }
                                uqc.M0(context, currentAccount2, str, false, sa8Var, eVar2.getResourceProvider());
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    default:
                        if (!sv8Var.S) {
                            if (sv8Var.e) {
                                sv8Var.V = new ds8(eVar2, (byte) 22);
                            } else if (sv8Var.d) {
                                sv8Var.V = new ds8(eVar2, (byte) 23);
                            } else if (sv8Var.c && !TextUtils.isEmpty(cardVar2.address)) {
                                sv8Var.V = new mv8(eVar2, cardVar2, (byte) 1);
                            } else {
                                return;
                            }
                            sv8Var.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        ir8Var.setAlpha(0.0f);
        ir8Var.setVisibility(c() ? 0 : 8);
        qv8Var.addView(ir8Var, tre.e(-2, 60, 81));
        TextView textView = new TextView(getContext());
        this.x = textView;
        textView.setTextSize(14.0f);
        textView.setTypeface(hl.o());
        textView.setGravity(17);
        textView.setLineSpacing(hl.L(18.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
        d();
        textView.setAlpha(0.0f);
        if (z) {
            textView.setText(ob6.M0(2131742674, null));
        } else if (user != null) {
            String k = lbc.k(user, true);
            if (new BigDecimal(c.t(cardVar.balance, false)).signum() == 0) {
                a0 = ob6.a0(null, null, 2131742676, k);
            } else {
                a0 = ob6.a0(null, null, 2131742677, k, c.p("Grams", frc.e(cardVar.balance).toString(), 2131749261).toString().replace(' ', (char) 160));
            }
            textView.setText(kg5.b(a0, textView.getPaint()));
        }
        textView.setVisibility(user == null ? 8 : 0);
        qv8Var.addView(textView, tre.e(-2, -2, 49));
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
        frc frcVar = this.r;
        frcVar.getClass();
        frcVar.setLayerType(2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, f);
        this.P = ofFloat;
        if (i == 0) {
            j = 650;
        } else {
            j = 380;
        }
        ofFloat.setDuration(j);
        this.P.setInterpolator(new LinearInterpolator());
        this.P.addUpdateListener(new nv8(this, (byte) 1));
        this.P.addListener(new u7(this, f, (byte) 5));
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
                hl.c3(runnable);
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
        boolean o = aob.I.o();
        Bitmap bitmap = this.H;
        TextView textView = this.x;
        if (bitmap != null && !bitmap.isRecycled()) {
            qv8 qv8Var = this.h;
            if (qv8Var.getWidth() > 0 && qv8Var.getHeight() > 0) {
                o = hl.B(this.H.getPixel(Utilities.j((int) (((((float) (textView.getRight() + textView.getLeft())) / 2.0f) / ((float) qv8Var.getWidth())) * ((float) this.H.getWidth())), this.H.getWidth() - 1, 0), Utilities.j((int) (((((float) (textView.getBottom() + textView.getTop())) / 2.0f) / ((float) qv8Var.getHeight())) * ((float) this.H.getHeight())), this.H.getHeight() - 1, 0))) < 0.5f;
            }
        }
        if (o) {
            i = -1;
        } else {
            i = -16777216;
        }
        textView.setTextColor(aob.p1(0.41f, i));
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
        float interpolation = k43.g.getInterpolation(Math.max(0.0f, Math.min(1.0f, this.J / 0.4f)));
        float max = Math.max(0.0f, Math.min(1.0f, (this.J - 0.3f) / 0.7f));
        float interpolation2 = k43.h.getInterpolation(max);
        if (this.L) {
            double d = 6.614378f * max;
            f = 1.0f - (((1.1338935f * ((float) Math.sin(d))) + ((float) Math.cos(d))) * ((float) Math.exp((-7.5f) * max)));
        } else {
            f = interpolation2;
        }
        frc frcVar = this.r;
        float width = frcVar.getWidth();
        float height = frcVar.getHeight();
        RectF rectF = this.f;
        float max2 = Math.max(0.2f, Math.min(1.0f, rectF.width() / Math.max(1.0f, height)));
        float R1 = hl.R1(max2, 1.0f, f);
        float centerY = rectF.centerY();
        int[] iArr = this.W;
        float f3 = centerY - iArr[1];
        float f4 = max2 * width;
        float centerX = rectF.centerX() - iArr[0];
        float f5 = width / 2.0f;
        float f6 = height / 2.0f;
        float R12 = hl.R1(centerX, frcVar.getLeft() + f5, f);
        float R13 = hl.R1((f4 * interpolation) + (f3 - (f4 / 2.0f)), frcVar.getTop() + f6, f);
        float f7 = 1.0f - f;
        float f8 = (-90.0f) * f7;
        double d2 = f8;
        float cos = (float) Math.cos(Math.toRadians(d2));
        float sin = (float) Math.sin(Math.toRadians(d2));
        float f9 = centerX - R12;
        float f10 = f3 - R13;
        float R14 = hl.R1((((sin * f10) + (cos * f9)) / R1) + f5, f5, interpolation2);
        float R15 = hl.R1((((cos * f10) + ((-sin) * f9)) / R1) + f6, f6, interpolation2);
        float f11 = R14 - f5;
        float f12 = R15 - f6;
        frcVar.setPivotX(R14);
        frcVar.setPivotY(R15);
        frcVar.setScaleX(R1);
        frcVar.setScaleY(R1);
        frcVar.setRotation(f8);
        frcVar.setRotationX(35.0f * f7);
        frcVar.setTranslationX((((cos * f11) - (sin * f12)) * R1) + ((R12 - frcVar.getLeft()) - R14));
        frcVar.setTranslationY(bp1.g(cos, f12, sin * f11, R1, (R13 - frcVar.getTop()) - R15));
        if (this.J > 0.0f) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        frcVar.setAlpha(f2);
        frcVar.setUseGyroscope(this.R * interpolation2);
        float f13 = 1.0f - interpolation2;
        this.K = Math.max(0.0f, f3 * f13);
        this.b.setEjectProgress(interpolation);
        this.n.setAlpha(this.J);
        this.s.setAlpha(interpolation2);
        ir8 ir8Var = this.w;
        ir8Var.setAlpha(interpolation2);
        TextView textView = this.x;
        textView.setAlpha(interpolation2);
        textView.setTranslationY((-hl.L(8.0f)) * f13);
        ir8Var.setTranslationY(hl.L(16.0f) * f13);
        ir8Var.setScaleX(hl.R1(0.8f, 1.0f, interpolation2));
        ir8Var.setScaleY(hl.R1(0.8f, 1.0f, interpolation2));
        this.h.invalidate();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        qv8 qv8Var = this.h;
        setContentView(qv8Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = -1;
        attributes.width = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.flags = (attributes.flags & (-3)) | (-2147286784);
        window.setAttributes(attributes);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        qv8Var.setSystemUiVisibility(1792);
        hl.j3(qv8Var, !aob.I.o());
        hl.n3(window, !aob.I.o());
    }

    @Override
    public final void show() {
        if (!hl.K1(getContext())) {
            return;
        }
        mu9.d(new hj8(this, (byte) 5));
        super.show();
        WeakHashMap weakHashMap = ihc.a;
        ygc.c(this.h);
    }
}
