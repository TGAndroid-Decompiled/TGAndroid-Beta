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
public final class bv8 extends jf0 implements fn7, snb {
    public final v41 A0;
    public final RectF B0;
    public final og2 C0;
    public boolean D0;
    public TLRPC.User E;
    public pcc E0;
    public TLRPC.Chat F;
    public icc F0;
    public TLRPC.EncryptedChat G;
    public boolean G0;
    public iv2 H;
    public TextPaint H0;
    public long I;
    public TextPaint I0;
    public String J;
    public boolean J0;
    public int K;
    public final v41 K0;
    public TLRPC.FileLocation L;
    public final Paint L0;
    public boolean M;
    public final RectF M0;
    public boolean N;
    public pkb N0;
    public final int O;
    public boolean O0;
    public int P;
    public boolean P0;
    public int Q;
    public al8 Q0;
    public StaticLayout R;
    public Drawable R0;
    public boolean S;
    public int S0;
    public int T;
    public int U;
    public int V;
    public za1 W;
    public StaticLayout a0;
    public int b0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f;
    public int f0;
    public final int g0;
    public e88 h;
    public int h0;
    public int i0;
    public StaticLayout j0;
    public boolean[] k0;
    public boolean l0;
    public boolean m0;
    public CharSequence n;
    public boolean n0;
    public final mm o0;
    public boolean p0;
    public long q0;
    public final ImageReceiver r;
    public boolean r0;
    public final rb0 s;
    public int s0;
    public StaticLayout t0;
    public final ul u0;
    public final ul v0;
    public CharSequence w;
    public final q6b w0;
    public final vnb x;
    public final RectF x0;
    public TLRPC.TL_sponsoredPeer y;
    public pkb y0;
    public Paint z0;

    public bv8(Context context, vnb vnbVar) {
        super(context);
        this.O = yac.t0;
        this.g0 = hl.L(19.0f);
        this.o0 = new mm(this, 0L, 350L, k43.h);
        this.w0 = new q6b(null, false);
        this.x0 = new RectF();
        this.A0 = new v41(this);
        this.B0 = new RectF();
        this.J0 = true;
        this.K0 = new v41(this);
        this.L0 = new Paint(1);
        this.M0 = new RectF();
        this.S0 = yob.b;
        this.x = vnbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.q0(hl.L(23.0f));
        this.s = new rb0((vnb) null);
        og2 og2Var = new og2(21, vnbVar, context);
        this.C0 = og2Var;
        og2Var.b(-1, aob.d6, aob.k7);
        og2Var.setDrawUnchecked(false);
        og2Var.setDrawBackgroundAsArc(3);
        addView(og2Var);
        ul ulVar = new ul(hl.L(20.0f), this);
        this.u0 = ulVar;
        ulVar.setCallback(this);
        ul ulVar2 = new ul(hl.L(20.0f), this);
        this.v0 = ulVar2;
        ulVar2.setCallback(this);
    }

    public final void A(boolean z, boolean z2) {
        og2 og2Var = this.C0;
        if (og2Var == null) {
            return;
        }
        og2Var.a(z, z2);
    }

    public final void C(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
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
            if (this.n0) {
                requirementToContact2 = uc7.s1(i).P2(this.E.id);
            }
            this.p0 = requirementToContact2 instanceof TL_account.requirementToContactPremium;
            this.q0 = wf3.j(requirementToContact2);
            if (this.D0 && this.E.bot_has_main_app) {
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
            this.p0 = false;
            this.q0 = wf3.j(requirementtocontactpaidmessages);
            setOpenBotButton(false);
        } else if (obj instanceof iv2) {
            iv2 iv2Var = (iv2) obj;
            this.H = iv2Var;
            this.F = null;
            this.E = null;
            if (this.n0 && iv2Var.m != null) {
                requirementToContact = uc7.s1(i).P2(this.H.m.id);
            }
            this.p0 = requirementToContact instanceof TL_account.requirementToContactPremium;
            this.q0 = wf3.j(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.G = encryptedChat;
        this.w = charSequence2;
        this.e0 = z;
        this.M = z2;
        D(0);
    }

    public final void D(int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv8.D(int):void");
    }

    public final void E(boolean z, TLRPC.User user, TLRPC.Chat chat, boolean z2) {
        long j;
        boolean z3 = ob6.a0;
        ul ulVar = this.v0;
        ulVar.a = z3;
        int i = this.O;
        vnb vnbVar = this.x;
        if (user != null && this.G == null && !this.M && uc7.s1(i).r2(user.id)) {
            ulVar.g(null, z2);
            ulVar.k(Integer.valueOf(aob.v0(aob.z9, vnbVar)));
        } else {
            if (this.J0) {
                if (z) {
                    ulVar.g(new zm2(aob.e1, aob.i1, 0, 0), z2);
                    ulVar.k(null);
                } else if (user != null && !this.M && wf3.f(user.emoji_status) != 0) {
                    ulVar.j(wf3.f(user.emoji_status), z2);
                    ulVar.k(Integer.valueOf(aob.v0(aob.z9, vnbVar)));
                }
            }
            if (this.J0 && chat != null && !this.M && wf3.f(chat.emoji_status) != 0) {
                ulVar.j(wf3.f(chat.emoji_status), z2);
                ulVar.k(Integer.valueOf(aob.v0(aob.z9, vnbVar)));
            } else {
                if (this.J0 && user != null && !this.M) {
                    uc7.s1(i);
                    if (uc7.F2(user)) {
                        ulVar.g(bl8.d().e, z2);
                        ulVar.k(Integer.valueOf(aob.v0(aob.z9, vnbVar)));
                    }
                }
                ulVar.g(null, z2);
                ulVar.k(Integer.valueOf(aob.v0(aob.z9, vnbVar)));
            }
        }
        if (user != null) {
            j = wf3.c(user);
        } else if (chat != null) {
            j = wf3.c(chat);
        } else {
            j = 0;
        }
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        ul ulVar2 = this.u0;
        if (i2 != 0 && !this.M) {
            ulVar2.j(j, z2);
        } else {
            ulVar2.g(null, z2);
        }
        ulVar2.k(Integer.valueOf(aob.v0(aob.z9, vnbVar)));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.z9));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.Z8));
        hashSet.add(Integer.valueOf(aob.X8));
        hashSet.add(Integer.valueOf(aob.A6));
        hashSet.add(Integer.valueOf(aob.p6));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            invalidate();
        } else if (i == jn7.k3) {
            TLRPC.User user = this.E;
            TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            requirementtocontactpaidmessages = null;
            int i3 = this.O;
            if (user != null) {
                if (this.n0) {
                    requirementtocontactpaidmessages = uc7.s1(i3).P2(this.E.id);
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
                    iv2 iv2Var = this.H;
                    if (iv2Var != null) {
                        if (this.n0 && iv2Var.m != null) {
                            requirementtocontactpaidmessages = uc7.s1(i3).P2(this.H.m.id);
                        }
                    } else {
                        return;
                    }
                }
            }
            boolean z = requirementtocontactpaidmessages instanceof TL_account.requirementToContactPremium;
            if (this.p0 != z || this.q0 != wf3.j(requirementtocontactpaidmessages)) {
                this.p0 = z;
                this.q0 = wf3.j(requirementtocontactpaidmessages);
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
        jn7.e().b(this, jn7.l4);
        if (this.n0) {
            jn7.e().b(this, jn7.k3);
        }
        this.v0.a();
        this.u0.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.K();
        jn7.e().n(this, jn7.l4);
        if (this.n0) {
            jn7.e().n(this, jn7.k3);
        }
        this.v0.b();
        this.u0.b();
    }

    @Override
    public final void onDraw(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv8.onDraw(android.graphics.Canvas):void");
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
            sb.append(ob6.M0(2131754734, null));
            sb.append("\n");
        }
        if (this.t0 != null) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(this.t0.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
        og2 og2Var = this.C0;
        if (og2Var.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(og2Var.a.q);
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
            og2 og2Var = this.C0;
            if (og2Var != null) {
                if (ob6.a0) {
                    L = (i3 - i) - hl.L(42.0f);
                } else {
                    L = hl.L(42.0f);
                }
                int L2 = hl.L(36.0f);
                og2Var.layout(L, L2, og2Var.getMeasuredWidth() + L, og2Var.getMeasuredHeight() + L2);
            }
            if (z) {
                y();
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        og2 og2Var = this.C0;
        if (og2Var != null) {
            og2Var.measure(View.MeasureSpec.makeMeasureSpec(hl.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(24.0f), 1073741824));
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.O0) {
            L = hl.L(56.0f);
        } else {
            L = hl.L(60.0f) + (this.N ? 1 : 0);
        }
        setMeasuredDimension(size, L);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.y = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z) {
        this.J0 = z;
    }

    public void setOnSponsoredOptionsClick(icc iccVar) {
        this.F0 = iccVar;
    }

    public void setOpenBotButton(boolean z) {
        int i;
        int i2;
        if (this.r0 == z) {
            return;
        }
        pkb pkbVar = this.N0;
        if (pkbVar == null) {
            pkbVar = new pkb(ob6.M0(2131753004, null), 14.0f, hl.o());
            this.N0 = pkbVar;
        }
        if (z) {
            i = hl.L(30.0f) + ((int) pkbVar.c);
        } else {
            i = 0;
        }
        if (ob6.a0) {
            i2 = i;
            i = 0;
        } else {
            i2 = 0;
        }
        setPadding(i2, 0, i, 0);
        this.r0 = z;
        this.K0.c(false);
    }

    public void setRectangularAvatar(boolean z) {
        this.P0 = z;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.w = charSequence;
        D(0);
    }

    @Override
    public final void updateColors() {
        int i = this.S0;
        int i2 = yob.b;
        if (i != i2) {
            this.S0 = i2;
            try {
                D(0);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        } else if (this.R != null && getMeasuredWidth() > 0) {
            y();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.v0 != drawable && this.u0 != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void y() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv8.y():void");
    }
}
