package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.FragmentContextView;
public final class rp4 extends FrameLayout {
    public final RectF a;
    public final FragmentContextView b;

    public rp4(FragmentContextView fragmentContextView, Context context) {
        super(context);
        this.b = fragmentContextView;
        this.a = new RectF();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int L;
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.b;
        e eVar = fragmentContextView.h;
        hn hnVar = fragmentContextView.j0;
        if (fragmentContextView.U == 4 && fragmentContextView.h0) {
            int L2 = hl.L(24.0f) + ((int) Math.ceil(hnVar.c()));
            if (L2 != fragmentContextView.f0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L2, 0.0f, new int[]{-10121218, -6983683}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                fragmentContextView.d0 = linearGradient;
                fragmentContextView.c0.setShader(linearGradient);
                fragmentContextView.f0 = L2;
            }
            vc2 groupCall = fragmentContextView.n.getGroupCall();
            if (eVar != null && groupCall != null && groupCall.k()) {
                long currentTimeMillis = (groupCall.b.schedule_date * 1000) - eVar.getConnectionsManager().getCurrentTimeMillis();
                f = 1.0f;
                if (currentTimeMillis >= 0) {
                    if (currentTimeMillis < 5000) {
                        f = 1.0f - (((float) currentTimeMillis) / 5000.0f);
                    } else {
                        f = 0.0f;
                    }
                }
                if (currentTimeMillis < 6000) {
                    invalidate();
                }
            } else {
                f = 0.0f;
            }
            fragmentContextView.e0.reset();
            fragmentContextView.e0.postTranslate((-fragmentContextView.f0) * 0.7f * f, 0.0f);
            fragmentContextView.d0.setLocalMatrix(fragmentContextView.e0);
            int measuredWidth = (getMeasuredWidth() - L2) - hl.L(10.0f);
            float f2 = measuredWidth;
            float L3 = hl.L(10.0f);
            RectF rectF = this.a;
            rectF.set(f2, L3, measuredWidth + L2, hl.L(28.0f) + L);
            canvas.save();
            float a = fragmentContextView.k0.a(0.1f);
            canvas.scale(a, a, rectF.centerX(), rectF.centerY());
            canvas.translate(f2, L3);
            RectF rectF2 = hl.P;
            rectF2.set(0.0f, 0.0f, L2, hl.L(28.0f));
            canvas.drawRoundRect(rectF2, hl.L(16.0f), hl.L(16.0f), fragmentContextView.c0);
            canvas.translate(hl.L(12.0f), hl.L(6.0f));
            hnVar.setBounds(0, 0, hl.q.x, hl.L(16.0f));
            hnVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        kz1 kz1Var;
        vc2 groupCall;
        int i;
        int i2;
        FragmentContextView fragmentContextView = this.b;
        if (fragmentContextView.U == 4 && fragmentContextView.h0 && fragmentContextView.k0 != null) {
            boolean contains = this.a.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                fragmentContextView.k0.c(contains);
            } else if (motionEvent.getAction() == 2) {
                if (!contains) {
                    fragmentContextView.k0.c(false);
                }
            } else if (motionEvent.getAction() == 1) {
                if (contains) {
                    qp4 qp4Var = fragmentContextView.m0;
                    e eVar = fragmentContextView.h;
                    if (eVar != null && (kz1Var = fragmentContextView.n) != null && (groupCall = kz1Var.getGroupCall()) != null && groupCall.b != null) {
                        if (fragmentContextView.S0 != 0) {
                            eVar.getConnectionsManager().cancelRequest(fragmentContextView.S0, true);
                            fragmentContextView.S0 = 0;
                        }
                        TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                        togglegroupcallstartsubscription.call = groupCall.h(groupCall.a);
                        TLRPC.GroupCall groupCall2 = groupCall.b;
                        boolean z = !fragmentContextView.i0;
                        fragmentContextView.i0 = z;
                        groupCall2.schedule_start_subscribed = z;
                        togglegroupcallstartsubscription.subscribed = z;
                        fragmentContextView.S0 = eVar.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, null);
                        if (fragmentContextView.l0) {
                            hl.r(qp4Var);
                            fragmentContextView.l0 = false;
                        }
                        qp4Var.run();
                        d31 b0 = d31.b0(eVar);
                        if (fragmentContextView.i0) {
                            i = 2131624189;
                            i2 = 2131748534;
                        } else {
                            i = 2131624188;
                            i2 = 2131748535;
                        }
                        bs2.v(null, i2, b0, i, 36);
                    }
                }
                fragmentContextView.k0.c(false);
            } else if (motionEvent.getAction() == 3) {
                fragmentContextView.k0.c(false);
            }
        } else {
            v41 v41Var = fragmentContextView.k0;
            if (v41Var != null) {
                v41Var.c(false);
            }
        }
        v41 v41Var2 = fragmentContextView.k0;
        if ((v41Var2 != null && v41Var2.i) || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        FragmentContextView fragmentContextView = this.b;
        jc0 jc0Var = fragmentContextView.b0;
        if (jc0Var != null && jc0Var.getVisibility() == 0) {
            fragmentContextView.b0.invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.b.j0 && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
