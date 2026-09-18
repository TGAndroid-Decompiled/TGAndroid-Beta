package fi;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ci.b9;
import ci.d9;
import ci.r9;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xc;
import org.telegram.ui.zn;
import w7.y5;
public final class s extends n2 implements le.d {
    public final le.b f9169a;
    public long f9170b;
    public FrameLayout f9171c;
    public t61 d;
    public jh.f e;
    public LinearLayout f9172f;
    public ci.d h;
    public ci.d f9173n;
    public kx0 f9174r;
    public TLRPC.ChatFull f9175s;
    public t0 v;

    public s(Bundle bundle) {
        super(bundle);
        this.f9169a = new le.b(0, this, qr.h, 320L, false);
    }

    public static void U(s sVar, x51 x51Var) {
        Object obj = x51Var.G;
        if (obj instanceof gi.f) {
            gi.f fVar = (gi.f) obj;
            long j3 = fVar.f10026a;
            TLRPC.Chat chat = MessagesController.getInstance(sVar.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(sVar.currentAccount).getUser(Long.valueOf(j3));
            if (user != null) {
                sVar.presentFragment(zn.R9(user.f18443id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new hi.c(sVar.getParentActivity(), chat, new b9(23, sVar, fVar)).show();
            } else {
                sVar.presentFragment(zn.R9(-chat.f18296id));
            }
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        int i11;
        float f11 = 1.0f - f7;
        this.f9172f.setAlpha(f11);
        LinearLayout linearLayout = this.f9172f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f9174r.setAlpha(f7);
        kx0 kx0Var = this.f9174r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        kx0Var.setVisibility(i12);
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f9172f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f9174r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        t0 t0Var = new t0(getParentActivity(), this.resourceProvider, xc.a0(this), this.currentAccount, this.f9170b);
        this.v = t0Var;
        t0Var.h = new xa.c(this, 20);
        t0Var.d();
        this.v.e();
        hg.k0.t(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 5));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9171c = frameLayout;
        int i10 = j6.f19006a7;
        frameLayout.setBackgroundColor(j6.w0(null, i10, false));
        t61 t61Var = new t61(this, new bi.v(this, 19), new q(this), new q(this));
        this.d = t61Var;
        t61Var.setClipToPadding(false);
        t61 t61Var2 = this.d;
        t61Var2.Y2.f26042r = false;
        t61Var2.q1();
        this.d.j(new ai.r(this, 6));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f9171c.addView(this.d, y5.c(-1.0f, -1));
        ?? view = new View(context);
        this.e = view;
        view.setupColorKey(i10);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f9171c.addView(this.e, y5.g());
        this.f9171c.addView(this.actionBar, y5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f9172f = linearLayout;
        linearLayout.setOrientation(0);
        this.f9172f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.f9173n = dVar;
        dVar.d();
        this.f9173n.setColor(i0.a.d(0.125f, getThemedColor(j6.f19062d6), getThemedColor(j6.G6)));
        this.f9173n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f9173n.e();
        this.f9173n.setOnClickListener(new View.OnClickListener(this) {
            public final s f9166b;

            {
                this.f9166b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f9166b.v.f(false, true);
                        return;
                    default:
                        this.f9166b.v.f(true, true);
                        return;
                }
            }
        });
        this.f9172f.addView(this.f9173n, y5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f9166b;

            {
                this.f9166b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f9166b.v.f(false, true);
                        return;
                    default:
                        this.f9166b.v.f(true, true);
                        return;
                }
            }
        });
        this.f9172f.addView(this.h, y5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f9171c.addView(this.f9172f, y5.e(-1, -2, 80));
        kx0 kx0Var = new kx0(getParentActivity(), null, 16, this.resourceProvider);
        this.f9174r = kx0Var;
        kx0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f9174r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f9174r.setAnimateLayoutChange(true);
        this.f9174r.setVisibility(8);
        this.f9171c.addView(this.f9174r, y5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f9175s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f9169a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.f9171c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.f42096a;
        r0.a0.j(frameLayout2, qVar);
        setBulletinDelegate(new d9(4));
        FrameLayout frameLayout3 = this.f9171c;
        this.fragmentView = frameLayout3;
        return frameLayout3;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f9170b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f9170b));
        this.f9175s = getMessagesController().getChatFull(this.f9170b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        t0 t0Var = this.v;
        r9 r9Var = t0Var.f9183i;
        if (r9Var != null) {
            r9Var.run();
        }
        t0Var.f9183i = null;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
