package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public abstract class ju5 extends LinearLayout {
    public final ld5 a;
    public final ahb b;
    public final ahb c;
    public final mhb d;
    public final mhb e;
    public boolean f;
    public boolean h;
    public TLRPC.Chat n;
    public ValueAnimator r;
    public float s;
    public final int w;

    public ju5(Context context, TLRPC.Chat chat) {
        super(context);
        boolean z;
        boolean z2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.w = -2146483649;
        this.n = chat;
        this.f = chat.join_to_send;
        this.h = chat.join_request;
        setOrientation(1);
        ld5 ld5Var = new ld5(context, 20);
        this.a = ld5Var;
        ld5Var.setText(k96.M0(2131752288, null));
        zkb.h(bkb.c6, null, ld5Var);
        addView(ld5Var);
        ahb ahbVar = new ahb(context, 20);
        this.b = ahbVar;
        String M0 = k96.M0(2131752287, null);
        boolean z3 = this.f;
        ahbVar.f(M0, z3, z3);
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z = false;
        } else {
            z = true;
        }
        ahbVar.setEnabled(z);
        ahbVar.setOnClickListener(new View.OnClickListener(this) {
            public final ju5 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                ju5 ju5Var = this.b;
                switch (b) {
                    case 0:
                        boolean z4 = ju5Var.f;
                        boolean z5 = !z4;
                        if (ju5Var.b(z5, new iu5(ju5Var, ju5Var.h, z4, (byte) 0))) {
                            ju5Var.setJoinRequest(false);
                            ju5Var.setJoinToSend(z5);
                            return;
                        }
                        return;
                    default:
                        boolean z6 = ju5Var.h;
                        boolean z7 = !z6;
                        if (ju5Var.a(z7, new hu5(ju5Var, z6, (byte) 0))) {
                            ju5Var.setJoinRequest(z7);
                            return;
                        }
                        return;
                }
            }
        });
        addView(ahbVar);
        ahb ahbVar2 = new ahb(context, 20);
        this.c = ahbVar2;
        ahbVar2.f(k96.M0(2131752292, null), this.h, false);
        ahbVar2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z2 = false;
        } else {
            z2 = true;
        }
        ahbVar2.setEnabled(z2);
        ahbVar2.setOnClickListener(new View.OnClickListener(this) {
            public final ju5 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                ju5 ju5Var = this.b;
                switch (b) {
                    case 0:
                        boolean z4 = ju5Var.f;
                        boolean z5 = !z4;
                        if (ju5Var.b(z5, new iu5(ju5Var, ju5Var.h, z4, (byte) 0))) {
                            ju5Var.setJoinRequest(false);
                            ju5Var.setJoinToSend(z5);
                            return;
                        }
                        return;
                    default:
                        boolean z6 = ju5Var.h;
                        boolean z7 = !z6;
                        if (ju5Var.a(z7, new hu5(ju5Var, z6, (byte) 0))) {
                            ju5Var.setJoinRequest(z7);
                            return;
                        }
                        return;
                }
            }
        });
        addView(ahbVar2);
        mhb mhbVar = new mhb(12, null, context);
        this.d = mhbVar;
        mhbVar.setText(k96.M0(2131752286, null));
        addView(mhbVar);
        mhb mhbVar2 = new mhb(12, null, context);
        this.e = mhbVar2;
        mhbVar2.setText(k96.M0(2131752291, null));
        addView(mhbVar2);
        boolean z4 = this.f;
        this.s = z4 ? 1.0f : 0.0f;
        ahbVar2.setVisibility(z4 ? 0 : 8);
        d(this.s);
    }

    public abstract boolean a(boolean z, hu5 hu5Var);

    public boolean b(boolean z, iu5 iu5Var) {
        return true;
    }

    public final void c(boolean z) {
        int i;
        int i2 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.a.setVisibility(i);
        if (z) {
            i2 = 0;
        }
        this.b.setVisibility(i2);
        if (!z) {
            this.f = true;
            this.c.setVisibility(0);
            d(1.0f);
        }
        requestLayout();
    }

    public final void d(float f) {
        int measuredHeight;
        this.s = f;
        ahb ahbVar = this.c;
        ahbVar.setAlpha(f);
        float f2 = 1.0f - f;
        ahbVar.setTranslationY((-gl.L(16.0f)) * f2);
        ahbVar.setScaleY(1.0f - (0.1f * f2));
        if (ahbVar.getMeasuredHeight() <= 0) {
            measuredHeight = gl.L(50.0f);
        } else {
            measuredHeight = ahbVar.getMeasuredHeight();
        }
        mhb mhbVar = this.d;
        mhbVar.setAlpha(f2);
        float f3 = (-measuredHeight) * f2;
        mhbVar.setTranslationY(((-gl.L(4.0f)) * f) + f3);
        mhb mhbVar2 = this.e;
        mhbVar2.setAlpha(f);
        mhbVar2.setTranslationY((gl.L(4.0f) * f2) + f3);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        mhb mhbVar = this.d;
        float alpha = mhbVar.getAlpha() * mhbVar.getHeight();
        mhb mhbVar2 = this.e;
        return (mhbVar2.getAlpha() * mhbVar2.getHeight()) + alpha;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        ahb ahbVar = this.b;
        if (ahbVar.getVisibility() == 0) {
            int i6 = i3 - i;
            ld5 ld5Var = this.a;
            int measuredHeight = ld5Var.getMeasuredHeight();
            ld5Var.layout(0, 0, i6, measuredHeight);
            i5 = ahbVar.getMeasuredHeight() + measuredHeight;
            ahbVar.layout(0, measuredHeight, i6, i5);
        } else {
            i5 = 0;
        }
        int i7 = i3 - i;
        ahb ahbVar2 = this.c;
        int measuredHeight2 = ahbVar2.getMeasuredHeight() + i5;
        ahbVar2.layout(0, i5, i7, measuredHeight2);
        mhb mhbVar = this.d;
        mhbVar.layout(0, measuredHeight2, i7, mhbVar.getMeasuredHeight() + measuredHeight2);
        mhb mhbVar2 = this.e;
        mhbVar2.layout(0, measuredHeight2, i7, mhbVar2.getMeasuredHeight() + measuredHeight2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        mhb mhbVar;
        mhb mhbVar2;
        float measuredHeight;
        ld5 ld5Var = this.a;
        int i3 = this.w;
        ld5Var.measure(i, i3);
        ahb ahbVar = this.b;
        ahbVar.measure(i, i3);
        ahb ahbVar2 = this.c;
        ahbVar2.measure(i, i3);
        this.d.measure(i, i3);
        this.e.measure(i, i3);
        if (ahbVar.getVisibility() == 0) {
            measuredHeight = (ahbVar2.getMeasuredHeight() * this.s) + ahbVar.getMeasuredHeight() + ld5Var.getMeasuredHeight();
        } else {
            measuredHeight = ahbVar2.getMeasuredHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + gl.U1(this.s, mhbVar.getMeasuredHeight(), mhbVar2.getMeasuredHeight())), 1073741824));
    }

    public void setChat(TLRPC.Chat chat) {
        boolean z;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        this.n = chat;
        boolean z2 = true;
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z = false;
        } else {
            z = true;
        }
        this.b.setEnabled(z);
        TLRPC.Chat chat2 = this.n;
        if (!chat2.creator && ((tL_chatAdminRights = chat2.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z2 = false;
        }
        this.c.setEnabled(z2);
    }

    public void setJoinRequest(boolean z) {
        this.h = z;
        this.c.setChecked(z);
    }

    public void setJoinToSend(boolean z) {
        float f;
        this.f = z;
        ahb ahbVar = this.b;
        ahbVar.setChecked(z);
        ahbVar.setDivider(this.f);
        boolean z2 = this.h;
        ahb ahbVar2 = this.c;
        ahbVar2.setChecked(z2);
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = this.s;
        if (this.f) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.r = ofFloat;
        ofFloat.setDuration(200L);
        this.r.setInterpolator(s33.f);
        this.r.addUpdateListener(new ni4(this, (byte) 15));
        this.r.addListener(new v85(this, (byte) 8));
        ahbVar2.setVisibility(0);
        this.r.start();
    }
}
