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
public final class rr8 extends hf0 implements gk7, tjb {
    public final RectF A0;
    public final wf2 B0;
    public boolean C0;
    public p8c D0;
    public TLRPC.User E;
    public i8c E0;
    public TLRPC.Chat F;
    public boolean F0;
    public TLRPC.EncryptedChat G;
    public TextPaint G0;
    public nu2 H;
    public TextPaint H0;
    public long I;
    public boolean I0;
    public String J;
    public final n41 J0;
    public int K;
    public final Paint K0;
    public TLRPC.FileLocation L;
    public final RectF L0;
    public boolean M;
    public tgb M0;
    public boolean N;
    public boolean N0;
    public final int O;
    public boolean O0;
    public int P;
    public mh8 P0;
    public int Q;
    public Drawable Q0;
    public StaticLayout R;
    public int R0;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public ra1 W;
    public StaticLayout a0;
    public int b0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f;
    public int f0;
    public final int g0;
    public p48 h;
    public int h0;
    public int i0;
    public StaticLayout j0;
    public boolean[] k0;
    public boolean l0;
    public boolean m0;
    public CharSequence n;
    public final lm n0;
    public boolean o0;
    public long p0;
    public boolean q0;
    public final ImageReceiver r;
    public int r0;
    public final pb0 s;
    public StaticLayout s0;
    public final tl t0;
    public final tl u0;
    public final u2b v0;
    public CharSequence w;
    public final RectF w0;
    public final wjb x;
    public tgb x0;
    public TLRPC.TL_sponsoredPeer y;
    public Paint y0;
    public final n41 z0;

    public rr8(Context context, wjb wjbVar) {
        super(context);
        this.O = y6c.t0;
        this.g0 = gl.L(19.0f);
        this.n0 = new lm(this, 0L, 350L, s33.h);
        this.v0 = new u2b(null, false);
        this.w0 = new RectF();
        this.z0 = new n41(this);
        this.A0 = new RectF();
        this.I0 = true;
        this.J0 = new n41(this);
        this.K0 = new Paint(1);
        this.L0 = new RectF();
        this.R0 = zkb.b;
        this.x = wjbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.q0(gl.L(23.0f));
        this.s = new pb0((wjb) null);
        wf2 wf2Var = new wf2(21, wjbVar, context);
        this.B0 = wf2Var;
        wf2Var.b(-1, bkb.c6, bkb.j7);
        wf2Var.setDrawUnchecked(false);
        wf2Var.setDrawBackgroundAsArc(3);
        addView(wf2Var);
        tl tlVar = new tl(gl.L(20.0f), this);
        this.t0 = tlVar;
        tlVar.setCallback(this);
        tl tlVar2 = new tl(gl.L(20.0f), this);
        this.u0 = tlVar2;
        tlVar2.setCallback(this);
    }

    public final void A(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr8.A(int):void");
    }

    public final void F(boolean r9, org.telegram.tgnet.TLRPC.User r10, org.telegram.tgnet.TLRPC.Chat r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr8.F(boolean, org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat, boolean):void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.y9));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.Y8));
        hashSet.add(Integer.valueOf(bkb.W8));
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.o6));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k4) {
            invalidate();
        } else if (i == kk7.j3) {
            TLRPC.User user = this.E;
            TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            int i3 = this.O;
            if (user != null) {
                if (this.m0) {
                    requirementtocontactpaidmessages = na7.q1(i3).I2(this.E.id);
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
                    nu2 nu2Var = this.H;
                    if (nu2Var != null) {
                        if (this.m0 && nu2Var.m != null) {
                            requirementtocontactpaidmessages = na7.q1(i3).I2(this.H.m.id);
                        }
                    } else {
                        return;
                    }
                }
            }
            boolean z = requirementtocontactpaidmessages instanceof TL_account.requirementToContactPremium;
            if (this.o0 != z || this.p0 != cf3.j(requirementtocontactpaidmessages)) {
                this.o0 = z;
                this.p0 = cf3.j(requirementtocontactpaidmessages);
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
        kk7.e().b(this, kk7.k4);
        if (this.m0) {
            kk7.e().b(this, kk7.j3);
        }
        this.u0.a();
        this.t0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.K();
        kk7.e().n(this, kk7.k4);
        if (this.m0) {
            kk7.e().n(this, kk7.j3);
        }
        this.u0.b();
        this.t0.b();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr8.onDraw(android.graphics.Canvas):void");
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
            sb.append(k96.M0(2131754738, null));
            sb.append("\n");
        }
        if (this.s0 != null) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(this.s0.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
        wf2 wf2Var = this.B0;
        if (wf2Var.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(wf2Var.a.q);
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
            wf2 wf2Var = this.B0;
            if (wf2Var != null) {
                if (k96.a0) {
                    L = (i3 - i) - gl.L(42.0f);
                } else {
                    L = gl.L(42.0f);
                }
                int L2 = gl.L(36.0f);
                wf2Var.layout(L, L2, wf2Var.getMeasuredWidth() + L, wf2Var.getMeasuredHeight() + L2);
            }
            if (z) {
                x();
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        wf2 wf2Var = this.B0;
        if (wf2Var != null) {
            wf2Var.measure(View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), 1073741824));
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.N0) {
            L = gl.L(56.0f);
        } else {
            L = gl.L(60.0f) + (this.N ? 1 : 0);
        }
        setMeasuredDimension(size, L);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.y = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z) {
        this.I0 = z;
    }

    public void setOnSponsoredOptionsClick(i8c i8cVar) {
        this.E0 = i8cVar;
    }

    public void setOpenBotButton(boolean z) {
        int i;
        int i2;
        if (this.q0 == z) {
            return;
        }
        tgb tgbVar = this.M0;
        if (tgbVar == null) {
            tgbVar = new tgb(k96.M0(2131753008, null), 14.0f, gl.o());
            this.M0 = tgbVar;
        }
        if (z) {
            i = gl.L(30.0f) + ((int) tgbVar.c);
        } else {
            i = 0;
        }
        if (k96.a0) {
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
        A(0);
    }

    @Override
    public final void updateColors() {
        int i = this.R0;
        int i2 = zkb.b;
        if (i != i2) {
            this.R0 = i2;
            try {
                A(0);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        } else if (this.R != null && getMeasuredWidth() > 0) {
            x();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.u0 != drawable && this.t0 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void x() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr8.x():void");
    }

    public final void y(boolean z, boolean z2) {
        wf2 wf2Var = this.B0;
        if (wf2Var == null) {
            return;
        }
        wf2Var.a(z, z2);
    }

    public final void z(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
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
                requirementToContact2 = na7.q1(i).I2(this.E.id);
            }
            this.o0 = requirementToContact2 instanceof TL_account.requirementToContactPremium;
            this.p0 = cf3.j(requirementToContact2);
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
            this.p0 = cf3.j(requirementtocontactpaidmessages);
            setOpenBotButton(false);
        } else if (obj instanceof nu2) {
            nu2 nu2Var = (nu2) obj;
            this.H = nu2Var;
            this.F = null;
            this.E = null;
            if (this.m0 && nu2Var.m != null) {
                requirementToContact = na7.q1(i).I2(this.H.m.id);
            }
            this.o0 = requirementToContact instanceof TL_account.requirementToContactPremium;
            this.p0 = cf3.j(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.G = encryptedChat;
        this.w = charSequence2;
        this.e0 = z;
        this.M = z2;
        A(0);
    }
}
