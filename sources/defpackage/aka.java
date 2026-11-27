package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class aka extends FrameLayout implements snb {
    public final vnb E;
    public int F;
    public final li7 G;
    public boolean H;
    public double I;
    public double J;
    public SpannableString K;
    public CharSequence L;
    public Drawable M;
    public int N;
    public hf0 a;
    public int b;
    public final de0 c;
    public final ema d;
    public int e;
    public final TextView f;
    public boolean h;
    public rb0 n;
    public final byte r;
    public final RectF s;
    public hd6 w;
    public pc6 x;
    public final Location y;

    public aka(int i, vnb vnbVar, Context context, boolean z) {
        super(context);
        int i2;
        int i3;
        float f;
        float f2;
        float f3;
        int i4;
        float f4;
        float f5;
        int i5;
        float f6;
        float f7;
        int i6;
        float f8;
        this.s = new RectF();
        this.y = new Location("network");
        this.F = yac.t0;
        this.G = new li7(this, (byte) 28);
        this.L = "";
        this.E = vnbVar;
        this.r = i;
        de0 de0Var = new de0(context);
        this.c = de0Var;
        de0Var.setRoundRadius(hl.L(21.0f));
        this.n = new rb0((vnb) null);
        ema emaVar = new ema(context);
        this.d = emaVar;
        jn7.i(emaVar);
        emaVar.setTextSize(16);
        yob.W(emaVar, aob.G6, vnbVar);
        emaVar.setTypeface(hl.o());
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        emaVar.setGravity(i2);
        emaVar.setScrollNonFitText(true);
        boolean z2 = ob6.a0;
        if (z) {
            if (z2) {
                i4 = 5;
            } else {
                i4 = 3;
            }
            int i7 = i4 | 48;
            if (z2) {
                f4 = 0.0f;
            } else {
                f4 = 15.0f;
            }
            if (z2) {
                f5 = 15.0f;
            } else {
                f5 = 0.0f;
            }
            addView(de0Var, tre.d(42, 42.0f, i7, f4, 12.0f, f5, 0.0f));
            boolean z3 = ob6.a0;
            if (z3) {
                i5 = 5;
            } else {
                i5 = 3;
            }
            int i8 = i5 | 48;
            if (z3) {
                f6 = i;
            } else {
                f6 = 73.0f;
            }
            if (z3) {
                f7 = 73.0f;
            } else {
                f7 = 16.0f;
            }
            addView(emaVar, tre.d(-1, 20.0f, i8, f6, 12.0f, f7, 0.0f));
            TextView textView = new TextView(context);
            this.f = textView;
            textView.setSingleLine();
            this.h = true;
            textView.setTextSize(1, 14.0f);
            yob.X(textView, aob.A6, vnbVar);
            if (ob6.a0) {
                i6 = 5;
            } else {
                i6 = 3;
            }
            textView.setGravity(i6);
            boolean z4 = ob6.a0;
            int i9 = (z4 ? 5 : 3) | 48;
            if (z4) {
                f8 = i;
            } else {
                f8 = 73.0f;
            }
            addView(textView, tre.d(-1, -2.0f, i9, f8, 33.0f, z4 ? 73.0f : i, 0.0f));
        } else {
            if (z2) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            int i10 = i3 | 48;
            if (z2) {
                f = 0.0f;
            } else {
                f = 15.0f;
            }
            if (z2) {
                f2 = 15.0f;
            } else {
                f2 = 0.0f;
            }
            addView(de0Var, tre.d(42, 42.0f, i10, f, 6.0f, f2, 0.0f));
            boolean z5 = ob6.a0;
            int i11 = (z5 ? 5 : 3) | 48;
            if (z5) {
                f3 = i;
            } else {
                f3 = 74.0f;
            }
            addView(emaVar, tre.d(-2, -2.0f, i11, f3, 17.0f, z5 ? 74.0f : i, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d2) {
        aka akaVar;
        if (this.H) {
            return this.L;
        }
        if (Math.abs(this.I - d) <= 1.0E-6d && Math.abs(this.J - d2) <= 1.0E-6d && !TextUtils.isEmpty(this.L)) {
            akaVar = this;
        } else {
            this.H = true;
            akaVar = this;
            Utilities.e.c(new zja(akaVar, d, d2, (byte) 0));
        }
        return akaVar.L;
    }

    public final void b(r47 r47Var, Location location, boolean z) {
        String str;
        float f;
        CharSequence charSequence;
        TLRPC.Message message;
        ema emaVar = this.d;
        de0 de0Var = this.c;
        vnb vnbVar = this.E;
        TextView textView = this.f;
        if (r47Var != null && (message = r47Var.k) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(2131232555);
            yob.x(this, drawable, aob.ej, vnbVar, PorterDuff.Mode.MULTIPLY);
            int v0 = aob.v0(aob.kj, vnbVar);
            hf0 h0 = aob.h0(hl.L(42.0f), v0, v0);
            this.a = h0;
            this.b = v0;
            zm2 zm2Var = new zm2(h0, drawable);
            int L = hl.L(42.0f);
            int L2 = hl.L(42.0f);
            zm2Var.h = L;
            zm2Var.n = L2;
            int L3 = hl.L(24.0f);
            int L4 = hl.L(24.0f);
            zm2Var.e = L3;
            zm2Var.f = L4;
            de0Var.setImageDrawable(zm2Var);
            emaVar.l(c00.f(emaVar, uc7.s1(this.F).A1(wf3.n(r47Var.k.peer_id), false), false, null, 0), false);
            this.h = false;
            textView.setSingleLine(false);
            String str2 = r47Var.k.media.address;
            this.e = new StaticLayout(str2, textView.getPaint(), hl.q.x - hl.L(this.r + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str2);
            requestLayout();
            return;
        }
        this.h = true;
        textView.setSingleLine(true);
        long Z0 = r47Var.Z0();
        if (r47.l3(r47Var.k)) {
            Z0 = r47.B1(r47Var.k.fwd_from.from_id);
        }
        this.F = r47Var.K1;
        if (!TextUtils.isEmpty(r47Var.k.media.address)) {
            str = r47Var.k.media.address;
        } else {
            str = null;
        }
        boolean isEmpty = TextUtils.isEmpty(r47Var.k.media.title);
        if (isEmpty) {
            this.n = null;
            int i = (Z0 > 0L ? 1 : (Z0 == 0L ? 0 : -1));
            f = 42.0f;
            int i2 = this.F;
            if (i > 0) {
                TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(Z0));
                if (X1 != null) {
                    this.n = new rb0(0, X1);
                    charSequence = lbc.r(X1);
                    de0Var.f(X1, this.n);
                } else {
                    TLRPC.GeoPoint geoPoint = r47Var.k.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-Z0));
                if (M0 != null) {
                    rb0 rb0Var = new rb0(M0);
                    this.n = rb0Var;
                    charSequence = M0.title;
                    de0Var.f(M0, rb0Var);
                } else {
                    TLRPC.GeoPoint geoPoint2 = r47Var.k.media.geo;
                    charSequence = a(geoPoint2.lat, geoPoint2._long);
                    isEmpty = false;
                }
            }
        } else {
            f = 42.0f;
            charSequence = "";
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (this.K == null) {
                SpannableString spannableString = new SpannableString("dkaraush has been here");
                this.K = spannableString;
                spannableString.setSpan(new ya6(emaVar, hl.L(100.0f), 0, vnbVar), 0, this.K.length(), 33);
            }
            charSequence = this.K;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(r47Var.k.media.title)) {
                charSequence = r47Var.k.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(2131232555);
            yob.x(this, drawable2, aob.ej, vnbVar, PorterDuff.Mode.MULTIPLY);
            int v02 = aob.v0(aob.kj, vnbVar);
            hf0 h02 = aob.h0(hl.L(f), v02, v02);
            this.a = h02;
            this.b = v02;
            zm2 zm2Var2 = new zm2(h02, drawable2);
            int L5 = hl.L(f);
            int L6 = hl.L(f);
            zm2Var2.h = L5;
            zm2Var2.n = L6;
            int L7 = hl.L(24.0f);
            int L8 = hl.L(24.0f);
            zm2Var2.e = L7;
            zm2Var2.f = L8;
            de0Var.setImageDrawable(zm2Var2);
        }
        emaVar.l(charSequence, false);
        double d = r47Var.k.media.geo.lat;
        Location location2 = this.y;
        location2.setLatitude(d);
        location2.setLongitude(r47Var.k.media.geo._long);
        if (location != null) {
            float distanceTo = location2.distanceTo(location);
            if (str != null) {
                textView.setText(str + " - " + ob6.y(distanceTo, 0, null));
                return;
            }
            textView.setText(ob6.y(distanceTo, 0, null));
        } else if (str != null) {
            textView.setText(str);
        } else if (!z) {
            textView.setText(ob6.M0(2131748533, null));
        } else {
            textView.setText("");
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hl.c3(this.G);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hl.r(this.G);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        boolean z;
        float abs;
        int v0;
        float f;
        hd6 hd6Var = this.w;
        if (hd6Var == null) {
            pc6 pc6Var = this.x;
            if (pc6Var != null) {
                TLRPC.Message message = pc6Var.b;
                int i3 = message.date;
                i2 = message.media.period;
                i = i3 + i2;
            } else {
                return;
            }
        } else {
            i = hd6Var.c;
            i2 = hd6Var.d;
        }
        int i4 = i;
        if (i2 == Integer.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        int currentTime = ConnectionsManager.getInstance(this.F).getCurrentTime();
        if (i4 < currentTime && !z2) {
            return;
        }
        if (z2) {
            abs = 1.0f;
        } else {
            abs = Math.abs(i4 - currentTime) / i2;
        }
        float f2 = abs;
        boolean z3 = ob6.a0;
        float f3 = 48.0f;
        float f4 = 12.0f;
        TextView textView = this.f;
        RectF rectF = this.s;
        if (z3) {
            float L = hl.L(13.0f);
            if (textView != null) {
                f4 = 18.0f;
            }
            float L2 = hl.L(f4);
            float L3 = hl.L(43.0f);
            if (textView == null) {
                f3 = 42.0f;
            }
            rectF.set(L, L2, L3, hl.L(f3));
        } else {
            float measuredWidth = getMeasuredWidth() - hl.L(43.0f);
            if (textView != null) {
                f4 = 18.0f;
            }
            float L4 = hl.L(f4);
            float measuredWidth2 = getMeasuredWidth() - hl.L(13.0f);
            if (textView == null) {
                f3 = 42.0f;
            }
            rectF.set(measuredWidth, L4, measuredWidth2, hl.L(f3));
        }
        vnb vnbVar = this.E;
        if (textView == null) {
            v0 = aob.v0(aob.pj, vnbVar);
        } else {
            v0 = aob.v0(aob.jj, vnbVar);
        }
        aob.l2.setColor(v0);
        aob.F2.setColor(v0);
        int alpha = aob.l2.getAlpha();
        aob.l2.setAlpha((int) (alpha * 0.2f));
        canvas.drawArc(rectF, -90.0f, 360.0f, false, aob.l2);
        aob.l2.setAlpha(alpha);
        canvas.drawArc(rectF, -90.0f, f2 * (-360.0f), false, aob.l2);
        aob.l2.setAlpha(alpha);
        if (z2) {
            if (this.M == null) {
                this.M = getContext().getResources().getDrawable(2131231132).mutate();
            }
            if (aob.F2.getColor() != this.N) {
                Drawable drawable = this.M;
                int color = aob.F2.getColor();
                this.N = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            this.M.setBounds(bp1.A(2, (int) rectF.centerX(), this.M), bp1.y(2, (int) rectF.centerY(), this.M), bp1.w(2, (int) rectF.centerX(), this.M), bp1.i(2, (int) rectF.centerY(), this.M));
            this.M.draw(canvas);
            return;
        }
        String C = ob6.C(i4 - currentTime);
        float centerX = rectF.centerX() - (aob.F2.measureText(C) / 2.0f);
        if (textView != null) {
            f = 37.0f;
        } else {
            f = 31.0f;
        }
        canvas.drawText(C, centerX, hl.L(f), aob.F2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        TextView textView = this.f;
        if (textView != null) {
            f = 66.0f;
        } else {
            f = 54.0f;
        }
        int L = hl.L(f);
        if (textView != null && !this.h) {
            i3 = (-hl.L(20.0f)) + this.e;
        } else {
            i3 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(L + i3, 1073741824));
    }

    public void setDialog(hd6 hd6Var) {
        this.w = hd6Var;
        this.F = hd6Var.e;
        de0 de0Var = this.c;
        de0Var.getImageReceiver().d = this.F;
        boolean D = wf3.D(hd6Var.a);
        int i = this.F;
        ema emaVar = this.d;
        if (D) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(hd6Var.a));
            if (X1 != null) {
                this.n.q(X1);
                emaVar.l(lv2.m(0, X1.first_name, X1.last_name), false);
                de0Var.f(X1, this.n);
                return;
            }
            return;
        }
        TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-hd6Var.a));
        if (M0 != null) {
            this.n.p(M0);
            emaVar.l(M0.title, false);
            de0Var.f(M0, this.n);
        }
    }

    @Override
    public final void updateColors() {
        int v0;
        try {
            if (this.a != null && (v0 = aob.v0(aob.kj, this.E)) != this.b) {
                this.b = v0;
                aob.F1(this.a, v0, false);
                aob.F1(this.a, v0, true);
                this.a.invalidateSelf();
                de0 de0Var = this.c;
                if (de0Var != null) {
                    de0Var.invalidate();
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
