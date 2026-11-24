package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public class h1a extends fy0 implements gk7, jt4 {
    public final boolean S1;
    public final int T1;
    public final long U1;
    public final boolean V1;
    public final boolean W1;
    public final TL_stars.StarGift X1;
    public gt4 Y1;
    public final mu4 Z1;
    public final String a2;
    public final Runnable b2;
    public final b1a c2;
    public final LinearLayout d2;
    public final long e2;
    public final uk1 f2;
    public final TLRPC.MessageAction g2;
    public final k27 h2;
    public final LinearLayout i2;
    public final u41 j2;
    public final FrameLayout k2;
    public boolean l2;
    public boolean m2;
    public boolean n2;
    public final c1a o2;
    public l5c p2;
    public int q2;
    public final cm2[] r2;
    public boolean s2;
    public final ix4 t2;

    public h1a(android.content.Context r37, int r38, final org.telegram.tgnet.tl.TL_stars.StarGift r39, final defpackage.mu4 r40, long r41, java.lang.Runnable r43, final boolean r44, final boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h1a.<init>(android.content.Context, int, org.telegram.tgnet.tl.TL_stars$StarGift, mu4, long, java.lang.Runnable, boolean, boolean):void");
    }

    @Override
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(this.n1, getContext(), this.T1, 0, true, new w0a(this, (byte) 0), this.J0);
        this.p2 = l5cVar;
        l5cVar.r = false;
        return l5cVar;
    }

    @Override
    public final CharSequence J0() {
        int i;
        if (this.S1) {
            i = 2131749922;
        } else {
            i = 2131749928;
        }
        return k96.M0(i, null);
    }

    public final TLRPC.TL_textWithEntities Y0() {
        if (na7.q1(this.T1).K1(this.U1) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.g2;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            return ((TLRPC.TL_messageActionStarGift) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            return ((TLRPC.TL_messageActionGiftCode) messageAction).message;
        }
        if (!(messageAction instanceof TLRPC.TL_messageActionGiftPremium)) {
            return null;
        }
        return ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
    }

    public u21 Z0() {
        d S = LaunchActivity.S();
        if (S == null) {
            return null;
        }
        return u21.b0(S);
    }

    public final void a1(boolean z) {
        int i = this.T1;
        na7 q1 = na7.q1(i);
        long j = this.U1;
        TLRPC.UserFull W1 = q1.W1(j);
        TLObject Z1 = na7.q1(i).Z1(j);
        int i2 = 0;
        if (W1 != null && (Z1 instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) Z1;
            user.premium = true;
            na7.q1(i).a4(user, true, false);
            kk7.f(i).k(kk7.D0, Long.valueOf(user.id), W1);
        }
        d dVar = this.r1;
        if (dVar != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) dVar.getParentActivity()).N().getFragmentStack());
            ui5 parentLayout = dVar.getParentLayout();
            int size = arrayList.size();
            mu1 mu1Var = null;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                d dVar2 = (d) obj;
                if (dVar2 instanceof mu1) {
                    mu1Var = (mu1) dVar2;
                    if (mu1Var.a() != j) {
                        dVar2.removeSelfFromStack();
                    }
                } else if (dVar2 instanceof ProfileActivity) {
                    if (z && parentLayout.getLastFragment() == dVar2) {
                        dVar2.finishFragment();
                    } else {
                        dVar2.removeSelfFromStack();
                    }
                }
            }
            if (mu1Var == null || mu1Var.a() != j) {
                ((ActionBarLayout) parentLayout).T(new mu1(ls6.k(j, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void b1(boolean z) {
        CharSequence charSequence;
        long j;
        String str;
        gt4 gt4Var = this.Y1;
        int i = this.T1;
        u41 u41Var = this.j2;
        if (gt4Var != null) {
            int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
            boolean g = this.Y1.g(currentTime);
            gt4 gt4Var2 = this.Y1;
            if (g) {
                int i2 = gt4Var2.d.auction_start_date - currentTime;
                u41Var.i(k96.M0(2131750324, null), z, true);
                u41Var.g(k96.a0(null, null, 2131750319, k96.c0(i2)), z);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = gt4Var2.f;
            if (tL_starGiftAuctionState != null) {
                int i3 = tL_starGiftAuctionState.end_date - currentTime;
                u41Var.i(k96.M0(2131750329, null), z, true);
                u41Var.g(k96.a0(null, null, 2131750305, k96.c0(i3)), z);
                return;
            }
            u41Var.i(k96.M0(2131750329, null), z, true);
            u41Var.g(null, z);
            return;
        }
        TL_stars.StarGift starGift = this.X1;
        cm2[] cm2VarArr = this.r2;
        if (starGift != null) {
            long j2 = gta.v(i, false).m().amount;
            long j3 = starGift.stars;
            long j4 = 0;
            if (this.m2) {
                j = starGift.upgrade_stars;
            } else {
                j = 0;
            }
            long j5 = j3 + j;
            if (!TextUtils.isEmpty(this.o2.getText())) {
                j4 = this.e2;
            }
            long j6 = j5 + j4;
            if (this.S1) {
                str = "Gift2SendSelf";
            } else {
                str = "Gift2Send";
            }
            u41Var.i(jva.Y0(false, k96.H(',', str, (int) j6), cm2VarArr), z, true);
            if (gta.v(i, false).e && j6 > j2) {
                u41Var.g(k96.H(',', "Gift2SendYourBalance", (int) j2), z);
                return;
            } else {
                u41Var.g(null, z);
                return;
            }
        }
        mu4 mu4Var = this.Z1;
        if (mu4Var != null) {
            if (this.n2) {
                u41Var.i(jva.T0(k96.a0(null, null, 2131749978, k96.E(mu4Var.g(), ',')), 1.0f, cm2VarArr), z, true);
                cm2VarArr[0].H = 0.85f;
                charSequence = null;
            } else {
                charSequence = null;
                u41Var.i(new SpannableStringBuilder(k96.a0(null, null, 2131749979, mu4Var.c())), z, true);
            }
            u41Var.g(charSequence, z);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.z3) {
            b1(true);
            l5c l5cVar = this.p2;
            if (l5cVar != null && this.Z1 != null) {
                l5cVar.O(true);
            }
        }
    }

    @Override
    public final void dismiss() {
        c1a c1aVar = this.o2;
        int emojiPadding = c1aVar.b.getEmojiPadding();
        ts3 ts3Var = c1aVar.b;
        if (emojiPadding > 0) {
            ts3Var.k(true);
        } else if (ts3Var.w) {
            ts3Var.d();
        } else {
            ts3Var.r();
            if (this.Y1 != null) {
                kt4.c(this.T1).n(this.Y1.b, this);
            }
            this.s2 = true;
            super.dismiss();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.T1).b(this, kk7.z3);
    }

    @Override
    public final void onBackPressed() {
        c1a c1aVar = this.o2;
        int emojiPadding = c1aVar.b.getEmojiPadding();
        ts3 ts3Var = c1aVar.b;
        if (emojiPadding > 0) {
            ts3Var.k(true);
        } else if (ts3Var.w) {
            ts3Var.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.T1).n(this, kk7.z3);
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            LinearLayout linearLayout = this.i2;
            if (linearLayout != null) {
                int v0 = bkb.v0(bkb.g5, this.J0);
                Drawable background = linearLayout.getBackground();
                if ((background instanceof InsetDrawable) && (((InsetDrawable) background).getDrawable() instanceof ColorDrawable)) {
                    ColorDrawable colorDrawable = (ColorDrawable) ((InsetDrawable) background).getDrawable();
                    if (colorDrawable.getColor() != v0) {
                        colorDrawable.setColor(v0);
                        linearLayout.invalidate();
                    }
                } else {
                    ColorDrawable colorDrawable2 = new ColorDrawable(v0);
                    int i = this.u0;
                    linearLayout.setBackground(new InsetDrawable((Drawable) colorDrawable2, i, 0, i, 0));
                }
            }
            ix4 ix4Var = this.t2;
            if (ix4Var != null) {
                ix4Var.a(bkb.v0(bkb.g5, this.J0));
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void r(gt4 gt4Var) {
        this.Y1 = gt4Var;
    }

    @Override
    public final void show() {
        c1a c1aVar = this.o2;
        if (c1aVar != null) {
            c1aVar.b.s();
        }
        super.show();
    }

    @Override
    public final void x() {
        this.n1.b0();
    }
}
