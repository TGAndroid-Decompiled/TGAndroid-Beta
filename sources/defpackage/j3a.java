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
public class j3a extends mz0 implements jm7, kv4 {
    public final boolean S1;
    public final int T1;
    public final long U1;
    public final boolean V1;
    public final boolean W1;
    public final TL_stars.StarGift X1;
    public hv4 Y1;
    public final nw4 Z1;
    public final String a2;
    public final Runnable b2;
    public final d3a c2;
    public final LinearLayout d2;
    public final long e2;
    public final cm1 f2;
    public final TLRPC.MessageAction g2;
    public final k47 h2;
    public final LinearLayout i2;
    public final b61 j2;
    public final FrameLayout k2;
    public boolean l2;
    public boolean m2;
    public boolean n2;
    public final e3a o2;
    public l7c p2;
    public int q2;
    public final pn2[] r2;
    public boolean s2;
    public final kz4 t2;

    public j3a(android.content.Context r37, int r38, final org.telegram.tgnet.tl.TL_stars.StarGift r39, final defpackage.nw4 r40, long r41, java.lang.Runnable r43, final boolean r44, final boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j3a.<init>(android.content.Context, int, org.telegram.tgnet.tl.TL_stars$StarGift, nw4, long, java.lang.Runnable, boolean, boolean):void");
    }

    @Override
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(this.n1, getContext(), this.T1, 0, true, new y2a(this, (byte) 0), this.J0);
        this.p2 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override
    public final CharSequence J0() {
        int i;
        if (this.S1) {
            i = 2131749871;
        } else {
            i = 2131749877;
        }
        return jb6.M0(i, null);
    }

    public final TLRPC.TL_textWithEntities Y0() {
        if (oc7.r1(this.T1).L1(this.U1) > 0) {
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

    public c41 Z0() {
        d S = LaunchActivity.S();
        if (S == null) {
            return null;
        }
        return c41.b0(S);
    }

    public final void a1(boolean z) {
        int i = this.T1;
        oc7 r1 = oc7.r1(i);
        long j = this.U1;
        TLRPC.UserFull X1 = r1.X1(j);
        TLObject a2 = oc7.r1(i).a2(j);
        int i2 = 0;
        if (X1 != null && (a2 instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) a2;
            user.premium = true;
            oc7.r1(i).c4(user, true, false);
            nm7.f(i).k(nm7.E0, Long.valueOf(user.id), X1);
        }
        d dVar = this.r1;
        if (dVar != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) dVar.getParentActivity()).N().getFragmentStack());
            tk5 parentLayout = dVar.getParentLayout();
            int size = arrayList.size();
            yv1 yv1Var = null;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                d dVar2 = (d) obj;
                if (dVar2 instanceof yv1) {
                    yv1Var = (yv1) dVar2;
                    if (yv1Var.a() != j) {
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
            if (yv1Var == null || yv1Var.a() != j) {
                ((ActionBarLayout) parentLayout).T(new yv1(kt6.k(j, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void b1(boolean z) {
        CharSequence charSequence;
        long j;
        String str;
        hv4 hv4Var = this.Y1;
        int i = this.T1;
        b61 b61Var = this.j2;
        if (hv4Var != null) {
            int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
            boolean g = this.Y1.g(currentTime);
            hv4 hv4Var2 = this.Y1;
            if (g) {
                int i2 = hv4Var2.d.auction_start_date - currentTime;
                b61Var.i(jb6.M0(2131750273, null), z, true);
                b61Var.g(jb6.a0(null, null, 2131750268, jb6.c0(i2)), z);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = hv4Var2.f;
            if (tL_starGiftAuctionState != null) {
                int i3 = tL_starGiftAuctionState.end_date - currentTime;
                b61Var.i(jb6.M0(2131750278, null), z, true);
                b61Var.g(jb6.a0(null, null, 2131750254, jb6.c0(i3)), z);
                return;
            }
            b61Var.i(jb6.M0(2131750278, null), z, true);
            b61Var.g(null, z);
            return;
        }
        TL_stars.StarGift starGift = this.X1;
        pn2[] pn2VarArr = this.r2;
        if (starGift != null) {
            long j2 = jva.v(i, false).m().amount;
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
            b61Var.i(nxa.Z0(false, jb6.H(',', str, (int) j6), pn2VarArr), z, true);
            if (jva.v(i, false).e && j6 > j2) {
                b61Var.g(jb6.H(',', "Gift2SendYourBalance", (int) j2), z);
                return;
            } else {
                b61Var.g(null, z);
                return;
            }
        }
        nw4 nw4Var = this.Z1;
        if (nw4Var != null) {
            if (this.n2) {
                b61Var.i(nxa.U0(jb6.a0(null, null, 2131749927, jb6.E(nw4Var.g(), ',')), 1.0f, pn2VarArr), z, true);
                pn2VarArr[0].H = 0.85f;
                charSequence = null;
            } else {
                charSequence = null;
                b61Var.i(new SpannableStringBuilder(jb6.a0(null, null, 2131749928, nw4Var.c())), z, true);
            }
            b61Var.g(charSequence, z);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.A3) {
            b1(true);
            l7c l7cVar = this.p2;
            if (l7cVar != null && this.Z1 != null) {
                l7cVar.O(true);
            }
        }
    }

    @Override
    public final void dismiss() {
        e3a e3aVar = this.o2;
        int emojiPadding = e3aVar.b.getEmojiPadding();
        du3 du3Var = e3aVar.b;
        if (emojiPadding > 0) {
            du3Var.k(true);
        } else if (du3Var.w) {
            du3Var.d();
        } else {
            du3Var.r();
            if (this.Y1 != null) {
                lv4.c(this.T1).n(this.Y1.b, this);
            }
            this.s2 = true;
            super.dismiss();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.T1).b(this, nm7.A3);
    }

    @Override
    public final void onBackPressed() {
        e3a e3aVar = this.o2;
        int emojiPadding = e3aVar.b.getEmojiPadding();
        du3 du3Var = e3aVar.b;
        if (emojiPadding > 0) {
            du3Var.k(true);
        } else if (du3Var.w) {
            du3Var.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.T1).n(this, nm7.A3);
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            LinearLayout linearLayout = this.i2;
            if (linearLayout != null) {
                int v0 = cmb.v0(cmb.g5, this.J0);
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
            kz4 kz4Var = this.t2;
            if (kz4Var != null) {
                kz4Var.a(cmb.v0(cmb.g5, this.J0));
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void q(hv4 hv4Var) {
        this.Y1 = hv4Var;
    }

    @Override
    public final void show() {
        e3a e3aVar = this.o2;
        if (e3aVar != null) {
            e3aVar.b.s();
        }
        super.show();
    }

    @Override
    public final void w() {
        this.n1.b0();
    }
}
