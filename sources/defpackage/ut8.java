package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ut8 extends hg0 implements jm7, vlb {
    public final RectF A0;
    public final jh2 B0;
    public boolean C0;
    public qac D0;
    public TLRPC.User E;
    public jac E0;
    public TLRPC.Chat F;
    public boolean F0;
    public TLRPC.EncryptedChat G;
    public TextPaint G0;
    public yv2 H;
    public TextPaint H0;
    public long I;
    public boolean I0;
    public String J;
    public final u51 J0;
    public int K;
    public final Paint K0;
    public TLRPC.FileLocation L;
    public final RectF L0;
    public boolean M;
    public uib M0;
    public boolean N;
    public boolean N0;
    public final int O;
    public boolean O0;
    public int P;
    public nj8 P0;
    public int Q;
    public Drawable Q0;
    public StaticLayout R;
    public int R0;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public zb1 W;
    public StaticLayout a0;
    public int b0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f;
    public int f0;
    public final int g0;
    public r68 h;
    public int h0;
    public int i0;
    public StaticLayout j0;
    public boolean[] k0;
    public boolean l0;
    public boolean m0;
    public CharSequence n;
    public final ln n0;
    public boolean o0;
    public long p0;
    public boolean q0;
    public final ImageReceiver r;
    public int r0;
    public final pc0 s;
    public StaticLayout s0;
    public final tm t0;
    public final tm u0;
    public final v4b v0;
    public CharSequence w;
    public final RectF w0;
    public final ylb x;
    public uib x0;
    public TLRPC.TL_sponsoredPeer y;
    public Paint y0;
    public final u51 z0;

    public ut8(Context context, ylb ylbVar) {
        super(context);
        this.O = z8c.t0;
        this.g0 = gm.L(19.0f);
        this.n0 = new ln(this, 0L, 350L, d53.h);
        this.v0 = new v4b(null, false);
        this.w0 = new RectF();
        this.z0 = new u51(this);
        this.A0 = new RectF();
        this.I0 = true;
        this.J0 = new u51(this);
        this.K0 = new Paint(1);
        this.L0 = new RectF();
        this.R0 = anb.b;
        this.x = ylbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.q0(gm.L(23.0f));
        this.s = new pc0((ylb) null);
        jh2 jh2Var = new jh2(21, ylbVar, context);
        this.B0 = jh2Var;
        jh2Var.b(-1, cmb.c6, cmb.j7);
        jh2Var.setDrawUnchecked(false);
        jh2Var.setDrawBackgroundAsArc(3);
        addView(jh2Var);
        tm tmVar = new tm(gm.L(20.0f), this);
        this.t0 = tmVar;
        tmVar.setCallback(this);
        tm tmVar2 = new tm(gm.L(20.0f), this);
        this.u0 = tmVar2;
        tmVar2.setCallback(this);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.y9));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.Y8));
        hashSet.add(Integer.valueOf(cmb.W8));
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.o6));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.m4) {
            invalidate();
        } else if (i == nm7.k3) {
            TLRPC.User user = this.E;
            TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            int i3 = this.O;
            if (user != null) {
                if (this.m0) {
                    requirementtocontactpaidmessages = oc7.r1(i3).L2(this.E.id);
                }
            } else {
                TLRPC.Chat chat = this.F;
                if (chat != null) {
                    if (chat.send_paid_messages_stars != 0) {
                        TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages2 = new TL_account.requirementToContactPaidMessages();
                        requirementtocontactpaidmessages2.stars_amount = chat.send_paid_messages_stars;
                        requirementtocontactpaidmessages = requirementtocontactpaidmessages2;
                    }
                } else {
                    yv2 yv2Var = this.H;
                    if (yv2Var != null) {
                        if (this.m0 && yv2Var.m != null) {
                            requirementtocontactpaidmessages = oc7.r1(i3).L2(this.H.m.id);
                        }
                    } else {
                        return;
                    }
                }
            }
            boolean z = requirementtocontactpaidmessages instanceof TL_account.requirementToContactPremium;
            if (this.o0 != z || this.p0 != pg3.j(requirementtocontactpaidmessages)) {
                this.o0 = z;
                this.p0 = pg3.j(requirementtocontactpaidmessages);
                invalidate();
            }
        }
    }

    public TLRPC.Chat getChat() {
        return this.F;
    }

    public long getDialogId() {
        return this.I;
    }

    public TLRPC.User getUser() {
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.I();
        nm7.e().b(this, nm7.m4);
        if (this.m0) {
            nm7.e().b(this, nm7.k3);
        }
        this.u0.a();
        this.t0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.K();
        nm7.e().n(this, nm7.m4);
        if (this.m0) {
            nm7.e().n(this, nm7.k3);
        }
        this.u0.b();
        this.t0.b();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut8.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        StaticLayout staticLayout = this.R;
        if (staticLayout != null) {
            sb.append(staticLayout.getText());
        }
        if (this.l0) {
            sb.append(", ");
            sb.append(jb6.M0(2131754738, null));
            sb.append("\n");
        }
        if (this.s0 != null) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(this.s0.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
        jh2 jh2Var = this.B0;
        if (jh2Var.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(jh2Var.a.q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        if (this.E != null || this.F != null || this.G != null || this.H != null) {
            jh2 jh2Var = this.B0;
            if (jh2Var != null) {
                if (jb6.a0) {
                    L = (i3 - i) - gm.L(42.0f);
                } else {
                    L = gm.L(42.0f);
                }
                int L2 = gm.L(36.0f);
                jh2Var.layout(L, L2, jh2Var.getMeasuredWidth() + L, jh2Var.getMeasuredHeight() + L2);
            }
            if (z) {
                v();
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        jh2 jh2Var = this.B0;
        if (jh2Var != null) {
            jh2Var.measure(View.MeasureSpec.makeMeasureSpec(gm.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(24.0f), 1073741824));
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.N0) {
            L = gm.L(56.0f);
        } else {
            L = gm.L(60.0f) + (this.N ? 1 : 0);
        }
        setMeasuredDimension(size, L);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.y = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z) {
        this.I0 = z;
    }

    public void setOnSponsoredOptionsClick(jac jacVar) {
        this.E0 = jacVar;
    }

    public void setOpenBotButton(boolean z) {
        int i;
        int i2;
        if (this.q0 == z) {
            return;
        }
        uib uibVar = this.M0;
        if (uibVar == null) {
            uibVar = new uib(jb6.M0(2131752976, null), 14.0f, gm.o());
            this.M0 = uibVar;
        }
        if (z) {
            i = gm.L(30.0f) + ((int) uibVar.c);
        } else {
            i = 0;
        }
        if (jb6.a0) {
            i2 = i;
            i = 0;
        } else {
            i2 = 0;
        }
        setPadding(i2, 0, i, 0);
        this.q0 = z;
        this.J0.c(false);
    }

    public void setRectangularAvatar(boolean z) {
        this.O0 = z;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.w = charSequence;
        y(0);
    }

    @Override
    public final void updateColors() {
        int i = this.R0;
        int i2 = anb.b;
        if (i != i2) {
            this.R0 = i2;
            try {
                y(0);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        } else if (this.R != null && getMeasuredWidth() > 0) {
            v();
        }
    }

    public final void v() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut8.v():void");
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.u0 != drawable && this.t0 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void w(boolean z, boolean z2) {
        jh2 jh2Var = this.B0;
        if (jh2Var == null) {
            return;
        }
        jh2Var.a(z, z2);
    }

    public final void x(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        boolean z3;
        this.n = charSequence;
        boolean z4 = obj instanceof TLRPC.User;
        int i = this.O;
        TL_account.RequirementToContact requirementToContact = null;
        TL_account.RequirementToContact requirementToContact2 = null;
        TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
        requirementToContact = null;
        if (z4) {
            this.E = (TLRPC.User) obj;
            this.F = null;
            this.H = null;
            if (this.m0) {
                requirementToContact2 = oc7.r1(i).L2(this.E.id);
            }
            this.o0 = requirementToContact2 instanceof TL_account.requirementToContactPremium;
            this.p0 = pg3.j(requirementToContact2);
            if (this.C0 && this.E.bot_has_main_app) {
                z3 = true;
            } else {
                z3 = false;
            }
            setOpenBotButton(z3);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.F = chat;
            this.E = null;
            this.H = null;
            if (chat.send_paid_messages_stars != 0) {
                requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
                requirementtocontactpaidmessages.stars_amount = chat.send_paid_messages_stars;
            }
            this.o0 = false;
            this.p0 = pg3.j(requirementtocontactpaidmessages);
            setOpenBotButton(false);
        } else if (obj instanceof yv2) {
            yv2 yv2Var = (yv2) obj;
            this.H = yv2Var;
            this.F = null;
            this.E = null;
            if (this.m0 && yv2Var.m != null) {
                requirementToContact = oc7.r1(i).L2(this.H.m.id);
            }
            this.o0 = requirementToContact instanceof TL_account.requirementToContactPremium;
            this.p0 = pg3.j(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.G = encryptedChat;
        this.w = charSequence2;
        this.e0 = z;
        this.M = z2;
        y(0);
    }

    public final void y(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut8.y(int):void");
    }

    public final void z(boolean r9, org.telegram.tgnet.TLRPC.User r10, org.telegram.tgnet.TLRPC.Chat r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut8.z(boolean, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean):void");
    }
}
