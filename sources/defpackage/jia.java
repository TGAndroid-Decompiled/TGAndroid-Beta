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
public final class jia extends FrameLayout implements vlb {
    public final ylb E;
    public int F;
    public final ei7 G;
    public boolean H;
    public double I;
    public double J;
    public SpannableString K;
    public CharSequence L;
    public Drawable M;
    public int N;
    public fg0 a;
    public int b;
    public final bf0 c;
    public final lka d;
    public int e;
    public final TextView f;
    public boolean h;
    public pc0 n;
    public final byte r;
    public final RectF s;
    public cd6 w;
    public kc6 x;
    public final Location y;

    public jia(int i, ylb ylbVar, Context context, boolean z) {
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
        this.F = z8c.t0;
        this.G = new ei7(this, (byte) 28);
        this.L = "";
        this.E = ylbVar;
        this.r = i;
        bf0 bf0Var = new bf0(context);
        this.c = bf0Var;
        bf0Var.setRoundRadius(gm.L(21.0f));
        this.n = new pc0((ylb) null);
        lka lkaVar = new lka(context);
        this.d = lkaVar;
        nm7.i(lkaVar);
        lkaVar.setTextSize(16);
        anb.W(lkaVar, cmb.F6, ylbVar);
        lkaVar.setTypeface(gm.o());
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        lkaVar.setGravity(i2);
        lkaVar.setScrollNonFitText(true);
        boolean z2 = jb6.a0;
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
            addView(bf0Var, qoe.d(42, 42.0f, i7, f4, 12.0f, f5, 0.0f));
            boolean z3 = jb6.a0;
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
            addView(lkaVar, qoe.d(-1, 20.0f, i8, f6, 12.0f, f7, 0.0f));
            TextView textView = new TextView(context);
            this.f = textView;
            textView.setSingleLine();
            this.h = true;
            textView.setTextSize(1, 14.0f);
            anb.X(textView, cmb.z6, ylbVar);
            if (jb6.a0) {
                i6 = 5;
            } else {
                i6 = 3;
            }
            textView.setGravity(i6);
            boolean z4 = jb6.a0;
            int i9 = (z4 ? 5 : 3) | 48;
            if (z4) {
                f8 = i;
            } else {
                f8 = 73.0f;
            }
            addView(textView, qoe.d(-1, -2.0f, i9, f8, 33.0f, z4 ? 73.0f : i, 0.0f));
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
            addView(bf0Var, qoe.d(42, 42.0f, i10, f, 6.0f, f2, 0.0f));
            boolean z5 = jb6.a0;
            int i11 = (z5 ? 5 : 3) | 48;
            if (z5) {
                f3 = i;
            } else {
                f3 = 74.0f;
            }
            addView(lkaVar, qoe.d(-2, -2.0f, i11, f3, 17.0f, z5 ? 74.0f : i, 0.0f));
        }
        setWillNotDraw(false);
    }

    public final CharSequence a(double d, double d2) {
        jia jiaVar;
        if (this.H) {
            return this.L;
        }
        if (Math.abs(this.I - d) <= 1.0E-6d && Math.abs(this.J - d2) <= 1.0E-6d && !TextUtils.isEmpty(this.L)) {
            jiaVar = this;
        } else {
            this.H = true;
            jiaVar = this;
            Utilities.e.c(new iia(jiaVar, d, d2, (byte) 0));
        }
        return jiaVar.L;
    }

    public final void b(k47 k47Var, Location location, boolean z) {
        String str;
        float f;
        CharSequence charSequence;
        TLRPC.Message message;
        lka lkaVar = this.d;
        bf0 bf0Var = this.c;
        ylb ylbVar = this.E;
        TextView textView = this.f;
        if (k47Var != null && (message = k47Var.k) != null && message.local_id == -1) {
            Drawable drawable = getResources().getDrawable(2131232556);
            anb.x(this, drawable, cmb.dj, ylbVar, PorterDuff.Mode.MULTIPLY);
            int v0 = cmb.v0(cmb.jj, ylbVar);
            fg0 h0 = cmb.h0(gm.L(42.0f), v0, v0);
            this.a = h0;
            this.b = v0;
            sn2 sn2Var = new sn2(h0, drawable);
            int L = gm.L(42.0f);
            int L2 = gm.L(42.0f);
            sn2Var.h = L;
            sn2Var.n = L2;
            int L3 = gm.L(24.0f);
            int L4 = gm.L(24.0f);
            sn2Var.e = L3;
            sn2Var.f = L4;
            bf0Var.setImageDrawable(sn2Var);
            lkaVar.l(b10.e(lkaVar, oc7.r1(this.F).z1(pg3.n(k47Var.k.peer_id), false), false, null, 0), false);
            this.h = false;
            textView.setSingleLine(false);
            String str2 = k47Var.k.media.address;
            this.e = new StaticLayout(str2, textView.getPaint(), gm.q.x - gm.L(this.r + 73), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).getHeight();
            textView.setText(str2);
            requestLayout();
            return;
        }
        this.h = true;
        textView.setSingleLine(true);
        long Z0 = k47Var.Z0();
        if (k47.l3(k47Var.k)) {
            Z0 = k47.B1(k47Var.k.fwd_from.from_id);
        }
        this.F = k47Var.K1;
        if (!TextUtils.isEmpty(k47Var.k.media.address)) {
            str = k47Var.k.media.address;
        } else {
            str = null;
        }
        boolean isEmpty = TextUtils.isEmpty(k47Var.k.media.title);
        if (isEmpty) {
            this.n = null;
            int i = (Z0 > 0L ? 1 : (Z0 == 0L ? 0 : -1));
            f = 42.0f;
            int i2 = this.F;
            if (i > 0) {
                TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(Z0));
                if (W1 != null) {
                    this.n = new pc0(0, W1);
                    charSequence = m9c.r(W1);
                    bf0Var.f(W1, this.n);
                } else {
                    TLRPC.GeoPoint geoPoint = k47Var.k.media.geo;
                    charSequence = a(geoPoint.lat, geoPoint._long);
                    isEmpty = false;
                }
            } else {
                TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-Z0));
                if (L0 != null) {
                    pc0 pc0Var = new pc0(L0);
                    this.n = pc0Var;
                    charSequence = L0.title;
                    bf0Var.f(L0, pc0Var);
                } else {
                    TLRPC.GeoPoint geoPoint2 = k47Var.k.media.geo;
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
                spannableString.setSpan(new ta6(lkaVar, gm.L(100.0f), 0, ylbVar), 0, this.K.length(), 33);
            }
            charSequence = this.K;
        }
        if (!isEmpty) {
            if (!TextUtils.isEmpty(k47Var.k.media.title)) {
                charSequence = k47Var.k.media.title;
            }
            Drawable drawable2 = getResources().getDrawable(2131232556);
            anb.x(this, drawable2, cmb.dj, ylbVar, PorterDuff.Mode.MULTIPLY);
            int v02 = cmb.v0(cmb.jj, ylbVar);
            fg0 h02 = cmb.h0(gm.L(f), v02, v02);
            this.a = h02;
            this.b = v02;
            sn2 sn2Var2 = new sn2(h02, drawable2);
            int L5 = gm.L(f);
            int L6 = gm.L(f);
            sn2Var2.h = L5;
            sn2Var2.n = L6;
            int L7 = gm.L(24.0f);
            int L8 = gm.L(24.0f);
            sn2Var2.e = L7;
            sn2Var2.f = L8;
            bf0Var.setImageDrawable(sn2Var2);
        }
        lkaVar.l(charSequence, false);
        double d = k47Var.k.media.geo.lat;
        Location location2 = this.y;
        location2.setLatitude(d);
        location2.setLongitude(k47Var.k.media.geo._long);
        if (location != null) {
            float distanceTo = location2.distanceTo(location);
            if (str != null) {
                textView.setText(str + " - " + jb6.y(distanceTo, 0, null));
                return;
            }
            textView.setText(jb6.y(distanceTo, 0, null));
        } else if (str != null) {
            textView.setText(str);
        } else if (!z) {
            textView.setText(jb6.M0(2131748536, null));
        } else {
            textView.setText("");
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gm.c3(this.G);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gm.r(this.G);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        boolean z;
        float abs;
        int v0;
        float f;
        cd6 cd6Var = this.w;
        if (cd6Var == null) {
            kc6 kc6Var = this.x;
            if (kc6Var != null) {
                TLRPC.Message message = kc6Var.b;
                int i3 = message.date;
                i2 = message.media.period;
                i = i3 + i2;
            } else {
                return;
            }
        } else {
            i = cd6Var.c;
            i2 = cd6Var.d;
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
        boolean z3 = jb6.a0;
        float f3 = 48.0f;
        float f4 = 12.0f;
        TextView textView = this.f;
        RectF rectF = this.s;
        if (z3) {
            float L = gm.L(13.0f);
            if (textView != null) {
                f4 = 18.0f;
            }
            float L2 = gm.L(f4);
            float L3 = gm.L(43.0f);
            if (textView == null) {
                f3 = 42.0f;
            }
            rectF.set(L, L2, L3, gm.L(f3));
        } else {
            float measuredWidth = getMeasuredWidth() - gm.L(43.0f);
            if (textView != null) {
                f4 = 18.0f;
            }
            float L4 = gm.L(f4);
            float measuredWidth2 = getMeasuredWidth() - gm.L(13.0f);
            if (textView == null) {
                f3 = 42.0f;
            }
            rectF.set(measuredWidth, L4, measuredWidth2, gm.L(f3));
        }
        ylb ylbVar = this.E;
        if (textView == null) {
            v0 = cmb.v0(cmb.oj, ylbVar);
        } else {
            v0 = cmb.v0(cmb.ij, ylbVar);
        }
        cmb.k2.setColor(v0);
        cmb.E2.setColor(v0);
        int alpha = cmb.k2.getAlpha();
        cmb.k2.setAlpha((int) (alpha * 0.2f));
        canvas.drawArc(rectF, -90.0f, 360.0f, false, cmb.k2);
        cmb.k2.setAlpha(alpha);
        canvas.drawArc(rectF, -90.0f, f2 * (-360.0f), false, cmb.k2);
        cmb.k2.setAlpha(alpha);
        if (z2) {
            if (this.M == null) {
                this.M = getContext().getResources().getDrawable(2131231133).mutate();
            }
            if (cmb.E2.getColor() != this.N) {
                Drawable drawable = this.M;
                int color = cmb.E2.getColor();
                this.N = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            }
            this.M.setBounds(aq1.A(2, (int) rectF.centerX(), this.M), aq1.y(2, (int) rectF.centerY(), this.M), aq1.w(2, (int) rectF.centerX(), this.M), aq1.i(2, (int) rectF.centerY(), this.M));
            this.M.draw(canvas);
            return;
        }
        String C = jb6.C(i4 - currentTime);
        float centerX = rectF.centerX() - (cmb.E2.measureText(C) / 2.0f);
        if (textView != null) {
            f = 37.0f;
        } else {
            f = 31.0f;
        }
        canvas.drawText(C, centerX, gm.L(f), cmb.E2);
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
        int L = gm.L(f);
        if (textView != null && !this.h) {
            i3 = (-gm.L(20.0f)) + this.e;
        } else {
            i3 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(L + i3, 1073741824));
    }

    public void setDialog(cd6 cd6Var) {
        this.w = cd6Var;
        this.F = cd6Var.e;
        bf0 bf0Var = this.c;
        bf0Var.getImageReceiver().d = this.F;
        boolean D = pg3.D(cd6Var.a);
        int i = this.F;
        lka lkaVar = this.d;
        if (D) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(cd6Var.a));
            if (W1 != null) {
                this.n.q(W1);
                lkaVar.l(bw2.m(0, W1.first_name, W1.last_name), false);
                bf0Var.f(W1, this.n);
                return;
            }
            return;
        }
        TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-cd6Var.a));
        if (L0 != null) {
            this.n.p(L0);
            lkaVar.l(L0.title, false);
            bf0Var.f(L0, this.n);
        }
    }

    @Override
    public final void updateColors() {
        int v0;
        try {
            if (this.a != null && (v0 = cmb.v0(cmb.jj, this.E)) != this.b) {
                this.b = v0;
                cmb.F1(this.a, v0, false);
                cmb.F1(this.a, v0, true);
                this.a.invalidateSelf();
                bf0 bf0Var = this.c;
                if (bf0Var != null) {
                    bf0Var.invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
