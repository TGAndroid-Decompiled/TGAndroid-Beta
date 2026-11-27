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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public class a5a extends ny0 implements fn7, nv4 {
    public final boolean S1;
    public final int T1;
    public final long U1;
    public final boolean V1;
    public final boolean W1;
    public final TL_stars.StarGift X1;
    public kv4 Y1;
    public final pw4 Z1;
    public final String a2;
    public final Runnable b2;
    public final u4a c2;
    public final LinearLayout d2;
    public final long e2;
    public final dl1 f2;
    public final TLRPC.MessageAction g2;
    public final r47 h2;
    public final LinearLayout i2;
    public final c51 j2;
    public final FrameLayout k2;
    public boolean l2;
    public boolean m2;
    public boolean n2;
    public final v4a o2;
    public l9c p2;
    public int q2;
    public final wm2[] r2;
    public boolean s2;
    public final oz4 t2;

    public a5a(android.content.Context r37, int r38, final org.telegram.tgnet.tl.TL_stars.StarGift r39, final defpackage.pw4 r40, long r41, java.lang.Runnable r43, final boolean r44, final boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a5a.<init>(android.content.Context, int, org.telegram.tgnet.tl.TL_stars$StarGift, pw4, long, java.lang.Runnable, boolean, boolean):void");
    }

    @Override
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(this.n1, getContext(), this.T1, 0, true, new p4a(this, (byte) 0), this.J0);
        this.p2 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override
    public final CharSequence K0() {
        int i;
        if (this.S1) {
            i = 2131749884;
        } else {
            i = 2131749890;
        }
        return ob6.M0(i, null);
    }

    public final TLRPC.TL_textWithEntities Z0() {
        if (uc7.s1(this.T1).M1(this.U1) > 0) {
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

    public d31 a1() {
        e S = LaunchActivity.S();
        if (S == null) {
            return null;
        }
        return d31.b0(S);
    }

    public final void b1(boolean z) {
        int i = this.T1;
        uc7 s1 = uc7.s1(i);
        long j = this.U1;
        TLRPC.UserFull Y1 = s1.Y1(j);
        TLObject b2 = uc7.s1(i).b2(j);
        int i2 = 0;
        if (Y1 != null && (b2 instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) b2;
            user.premium = true;
            uc7.s1(i).i4(user, true, false);
            jn7.f(i).k(jn7.E0, Long.valueOf(user.id), Y1);
        }
        e eVar = this.r1;
        if (eVar != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) eVar.getParentActivity()).N().getFragmentStack());
            wk5 parentLayout = eVar.getParentLayout();
            int size = arrayList.size();
            zu1 zu1Var = null;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                e eVar2 = (e) obj;
                if (eVar2 instanceof zu1) {
                    zu1Var = (zu1) eVar2;
                    if (zu1Var.a() != j) {
                        eVar2.removeSelfFromStack();
                    }
                } else if (eVar2 instanceof ProfileActivity) {
                    if (z && parentLayout.getLastFragment() == eVar2) {
                        eVar2.finishFragment();
                    } else {
                        eVar2.removeSelfFromStack();
                    }
                }
            }
            if (zu1Var == null || zu1Var.a() != j) {
                ((ActionBarLayout) parentLayout).T(new zu1(qu6.k(j, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void c1(boolean z) {
        CharSequence charSequence;
        long j;
        String str;
        kv4 kv4Var = this.Y1;
        int i = this.T1;
        c51 c51Var = this.j2;
        if (kv4Var != null) {
            int currentTime = ConnectionsManager.getInstance(i).getCurrentTime();
            boolean g = this.Y1.g(currentTime);
            kv4 kv4Var2 = this.Y1;
            if (g) {
                int i2 = kv4Var2.d.auction_start_date - currentTime;
                c51Var.i(ob6.M0(2131750301, null), z, true);
                c51Var.g(ob6.a0(null, null, 2131750296, ob6.c0(i2)), z);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = kv4Var2.f;
            if (tL_starGiftAuctionState != null) {
                int i3 = tL_starGiftAuctionState.end_date - currentTime;
                c51Var.i(ob6.M0(2131750306, null), z, true);
                c51Var.g(ob6.a0(null, null, 2131750282, ob6.c0(i3)), z);
                return;
            }
            c51Var.i(ob6.M0(2131750306, null), z, true);
            c51Var.g(null, z);
            return;
        }
        TL_stars.StarGift starGift = this.X1;
        wm2[] wm2VarArr = this.r2;
        if (starGift != null) {
            long j2 = jxa.v(i, false).m().amount;
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
            c51Var.i(nza.Z0(false, ob6.H(',', str, (int) j6), wm2VarArr), z, true);
            if (jxa.v(i, false).e && j6 > j2) {
                c51Var.g(ob6.H(',', "Gift2SendYourBalance", (int) j2), z);
                return;
            } else {
                c51Var.g(null, z);
                return;
            }
        }
        pw4 pw4Var = this.Z1;
        if (pw4Var != null) {
            if (this.n2) {
                c51Var.i(nza.U0(ob6.a0(null, null, 2131749940, ob6.E(pw4Var.g(), ',')), 1.0f, wm2VarArr), z, true);
                wm2VarArr[0].H = 0.85f;
                charSequence = null;
            } else {
                charSequence = null;
                c51Var.i(new SpannableStringBuilder(ob6.a0(null, null, 2131749941, pw4Var.c())), z, true);
            }
            c51Var.g(charSequence, z);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.A3) {
            c1(true);
            l9c l9cVar = this.p2;
            if (l9cVar != null && this.Z1 != null) {
                l9cVar.O(true);
            }
        }
    }

    @Override
    public final void dismiss() {
        v4a v4aVar = this.o2;
        int emojiPadding = v4aVar.b.getEmojiPadding();
        lt3 lt3Var = v4aVar.b;
        if (emojiPadding > 0) {
            lt3Var.k(true);
        } else if (lt3Var.w) {
            lt3Var.d();
        } else {
            lt3Var.r();
            if (this.Y1 != null) {
                ov4.c(this.T1).n(this.Y1.b, this);
            }
            this.s2 = true;
            super.dismiss();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.T1).b(this, jn7.A3);
    }

    @Override
    public final void onBackPressed() {
        v4a v4aVar = this.o2;
        int emojiPadding = v4aVar.b.getEmojiPadding();
        lt3 lt3Var = v4aVar.b;
        if (emojiPadding > 0) {
            lt3Var.k(true);
        } else if (lt3Var.w) {
            lt3Var.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.T1).n(this, jn7.A3);
    }

    @Override
    public final void p0() {
        try {
            super.p0();
            LinearLayout linearLayout = this.i2;
            if (linearLayout != null) {
                int v0 = aob.v0(aob.h5, this.J0);
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
            oz4 oz4Var = this.t2;
            if (oz4Var != null) {
                oz4Var.a(aob.v0(aob.h5, this.J0));
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void q(kv4 kv4Var) {
        this.Y1 = kv4Var;
    }

    @Override
    public final void show() {
        v4a v4aVar = this.o2;
        if (v4aVar != null) {
            v4aVar.b.s();
        }
        super.show();
    }

    @Override
    public final void x() {
        this.n1.c0();
    }
}
