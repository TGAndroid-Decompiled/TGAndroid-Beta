package fi;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ci.n9;
import ci.x8;
import ci.z8;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.yn;
import w7.z5;
public final class s extends n2 implements le.d {
    public final le.b f9964a;
    public long f9965b;
    public FrameLayout f9966c;
    public c71 d;
    public jh.f f9967e;
    public LinearLayout f9968f;
    public ci.d h;
    public ci.d f9969n;
    public tx0 f9970r;
    public TLRPC.ChatFull f9971s;
    public t0 v;

    public s(Bundle bundle) {
        super(bundle);
        this.f9964a = new le.b(0, this, tr.h, 320L, false);
    }

    public static void S(s sVar, g61 g61Var) {
        Object obj = g61Var.G;
        if (obj instanceof gi.f) {
            gi.f fVar = (gi.f) obj;
            long j3 = fVar.f10901a;
            TLRPC.Chat chat = MessagesController.getInstance(sVar.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(sVar.currentAccount).getUser(Long.valueOf(j3));
            if (user != null) {
                sVar.presentFragment(yn.Q9(user.f20185id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new hi.c(sVar.getParentActivity(), chat, new x8(23, sVar, fVar)).show();
            } else {
                sVar.presentFragment(yn.Q9(-chat.f20038id));
            }
        }
    }

    public final void T(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f9968f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f9970r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.f9967e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        int i11;
        float f11 = 1.0f - f7;
        this.f9968f.setAlpha(f11);
        LinearLayout linearLayout = this.f9968f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f9970r.setAlpha(f7);
        tx0 tx0Var = this.f9970r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        tx0Var.setVisibility(i12);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        t0 t0Var = new t0(getParentActivity(), this.resourceProvider, yc.a0(this), this.currentAccount, this.f9965b);
        this.v = t0Var;
        t0Var.h = new a6.i(this, 22);
        t0Var.d();
        this.v.e();
        hg.k0.u(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 5));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9966c = frameLayout;
        int i10 = i6.f20762a7;
        frameLayout.setBackgroundColor(i6.w0(null, i10, false));
        c71 c71Var = new c71(this, new bi.v(this, 19), new q(this), new q(this));
        this.d = c71Var;
        c71Var.setClipToPadding(false);
        c71 c71Var2 = this.d;
        c71Var2.f25245f3.f31307r = false;
        c71Var2.s1();
        this.d.j(new ai.r(this, 6));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f9966c.addView(this.d, z5.c(-1.0f, -1));
        ?? view = new View(context);
        this.f9967e = view;
        view.setupColorKey(i10);
        this.f9967e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.f9967e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f9966c.addView(this.f9967e, z5.g());
        this.f9966c.addView(this.actionBar, z5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f9968f = linearLayout;
        linearLayout.setOrientation(0);
        this.f9968f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.f9969n = dVar;
        dVar.d();
        this.f9969n.setColor(i0.a.d(0.125f, getThemedColor(i6.f20818d6), getThemedColor(i6.G6)));
        this.f9969n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f9969n.e();
        this.f9969n.setOnClickListener(new View.OnClickListener(this) {
            public final s f9961b;

            {
                this.f9961b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f9961b.v.f(false, true);
                        return;
                    default:
                        this.f9961b.v.f(true, true);
                        return;
                }
            }
        });
        this.f9968f.addView(this.f9969n, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f9961b;

            {
                this.f9961b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f9961b.v.f(false, true);
                        return;
                    default:
                        this.f9961b.v.f(true, true);
                        return;
                }
            }
        });
        this.f9968f.addView(this.h, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f9966c.addView(this.f9968f, z5.e(-1, -2, 80));
        tx0 tx0Var = new tx0(getParentActivity(), null, 16, this.resourceProvider);
        this.f9970r = tx0Var;
        tx0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f9970r.f31195e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f9970r.setAnimateLayoutChange(true);
        this.f9970r.setVisibility(8);
        this.f9966c.addView(this.f9970r, z5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f9971s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f9964a.a(z10, false);
        T(0);
        FrameLayout frameLayout2 = this.f9966c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.f45596a;
        r0.a0.j(frameLayout2, qVar);
        setBulletinDelegate(new z8(4));
        FrameLayout frameLayout3 = this.f9966c;
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
        this.f9965b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f9965b));
        this.f9971s = getMessagesController().getChatFull(this.f9965b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        t0 t0Var = this.v;
        n9 n9Var = t0Var.f9980i;
        if (n9Var != null) {
            n9Var.run();
        }
        t0Var.f9980i = null;
    }

    @Override
    public final void V(float f7, int i10) {
    }
}
