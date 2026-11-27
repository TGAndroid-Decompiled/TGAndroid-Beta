package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;
public abstract class nw5 extends LinearLayout {
    public final mf5 a;
    public final wkb b;
    public final wkb c;
    public final ilb d;
    public final ilb e;
    public boolean f;
    public boolean h;
    public TLRPC.Chat n;
    public ValueAnimator r;
    public float s;
    public final int w;

    public nw5(Context context, TLRPC.Chat chat) {
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
        mf5 mf5Var = new mf5(context, 20);
        this.a = mf5Var;
        mf5Var.setText(ob6.M0(2131752266, null));
        yob.h(aob.d6, null, mf5Var);
        addView(mf5Var);
        wkb wkbVar = new wkb(context, 20);
        this.b = wkbVar;
        String M0 = ob6.M0(2131752265, null);
        boolean z3 = this.f;
        wkbVar.f(M0, z3, z3);
        if (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.ban_users)) {
            z = false;
        } else {
            z = true;
        }
        wkbVar.setEnabled(z);
        wkbVar.setOnClickListener(new View.OnClickListener(this) {
            public final nw5 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                nw5 nw5Var = this.b;
                switch (b) {
                    case 0:
                        boolean z4 = nw5Var.f;
                        boolean z5 = !z4;
                        if (nw5Var.b(z5, new mw5(nw5Var, nw5Var.h, z4, (byte) 0))) {
                            nw5Var.setJoinRequest(false);
                            nw5Var.setJoinToSend(z5);
                            return;
                        }
                        return;
                    default:
                        boolean z6 = nw5Var.h;
                        boolean z7 = !z6;
                        if (nw5Var.a(z7, new lw5(nw5Var, z6, (byte) 0))) {
                            nw5Var.setJoinRequest(z7);
                            return;
                        }
                        return;
                }
            }
        });
        addView(wkbVar);
        wkb wkbVar2 = new wkb(context, 20);
        this.c = wkbVar2;
        wkbVar2.f(ob6.M0(2131752270, null), this.h, false);
        wkbVar2.setPivotY(0.0f);
        if (!chat.creator && ((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.ban_users)) {
            z2 = false;
        } else {
            z2 = true;
        }
        wkbVar2.setEnabled(z2);
        wkbVar2.setOnClickListener(new View.OnClickListener(this) {
            public final nw5 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                nw5 nw5Var = this.b;
                switch (b) {
                    case 0:
                        boolean z4 = nw5Var.f;
                        boolean z5 = !z4;
                        if (nw5Var.b(z5, new mw5(nw5Var, nw5Var.h, z4, (byte) 0))) {
                            nw5Var.setJoinRequest(false);
                            nw5Var.setJoinToSend(z5);
                            return;
                        }
                        return;
                    default:
                        boolean z6 = nw5Var.h;
                        boolean z7 = !z6;
                        if (nw5Var.a(z7, new lw5(nw5Var, z6, (byte) 0))) {
                            nw5Var.setJoinRequest(z7);
                            return;
                        }
                        return;
                }
            }
        });
        addView(wkbVar2);
        ilb ilbVar = new ilb(12, null, context);
        this.d = ilbVar;
        ilbVar.setText(ob6.M0(2131752264, null));
        addView(ilbVar);
        ilb ilbVar2 = new ilb(12, null, context);
        this.e = ilbVar2;
        ilbVar2.setText(ob6.M0(2131752269, null));
        addView(ilbVar2);
        boolean z4 = this.f;
        this.s = z4 ? 1.0f : 0.0f;
        wkbVar2.setVisibility(z4 ? 0 : 8);
        d(this.s);
    }

    public abstract boolean a(boolean z, lw5 lw5Var);

    public boolean b(boolean z, mw5 mw5Var) {
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
        wkb wkbVar = this.c;
        wkbVar.setAlpha(f);
        float f2 = 1.0f - f;
        wkbVar.setTranslationY((-hl.L(16.0f)) * f2);
        wkbVar.setScaleY(1.0f - (0.1f * f2));
        if (wkbVar.getMeasuredHeight() <= 0) {
            measuredHeight = hl.L(50.0f);
        } else {
            measuredHeight = wkbVar.getMeasuredHeight();
        }
        ilb ilbVar = this.d;
        ilbVar.setAlpha(f2);
        float f3 = (-measuredHeight) * f2;
        ilbVar.setTranslationY(((-hl.L(4.0f)) * f) + f3);
        ilb ilbVar2 = this.e;
        ilbVar2.setAlpha(f);
        ilbVar2.setTranslationY((hl.L(4.0f) * f2) + f3);
        requestLayout();
    }

    public float getBottomInfoMargin() {
        ilb ilbVar = this.d;
        float alpha = ilbVar.getAlpha() * ilbVar.getHeight();
        ilb ilbVar2 = this.e;
        return (ilbVar2.getAlpha() * ilbVar2.getHeight()) + alpha;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        wkb wkbVar = this.b;
        if (wkbVar.getVisibility() == 0) {
            int i6 = i3 - i;
            mf5 mf5Var = this.a;
            int measuredHeight = mf5Var.getMeasuredHeight();
            mf5Var.layout(0, 0, i6, measuredHeight);
            i5 = wkbVar.getMeasuredHeight() + measuredHeight;
            wkbVar.layout(0, measuredHeight, i6, i5);
        } else {
            i5 = 0;
        }
        int i7 = i3 - i;
        wkb wkbVar2 = this.c;
        int measuredHeight2 = wkbVar2.getMeasuredHeight() + i5;
        wkbVar2.layout(0, i5, i7, measuredHeight2);
        ilb ilbVar = this.d;
        ilbVar.layout(0, measuredHeight2, i7, ilbVar.getMeasuredHeight() + measuredHeight2);
        ilb ilbVar2 = this.e;
        ilbVar2.layout(0, measuredHeight2, i7, ilbVar2.getMeasuredHeight() + measuredHeight2);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ilb ilbVar;
        ilb ilbVar2;
        float measuredHeight;
        mf5 mf5Var = this.a;
        int i3 = this.w;
        mf5Var.measure(i, i3);
        wkb wkbVar = this.b;
        wkbVar.measure(i, i3);
        wkb wkbVar2 = this.c;
        wkbVar2.measure(i, i3);
        this.d.measure(i, i3);
        this.e.measure(i, i3);
        if (wkbVar.getVisibility() == 0) {
            measuredHeight = (wkbVar2.getMeasuredHeight() * this.s) + wkbVar.getMeasuredHeight() + mf5Var.getMeasuredHeight();
        } else {
            measuredHeight = wkbVar2.getMeasuredHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (measuredHeight + hl.U1(this.s, ilbVar.getMeasuredHeight(), ilbVar2.getMeasuredHeight())), 1073741824));
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
        wkb wkbVar = this.b;
        wkbVar.setChecked(z);
        wkbVar.setDivider(this.f);
        boolean z2 = this.h;
        wkb wkbVar2 = this.c;
        wkbVar2.setChecked(z2);
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
        this.r.setInterpolator(k43.f);
        this.r.addUpdateListener(new ch4(this, (byte) 17));
        this.r.addListener(new ad5(this, (byte) 7));
        wkbVar2.setVisibility(0);
        this.r.start();
    }
}
