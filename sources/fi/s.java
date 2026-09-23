package fi;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ci.a9;
import ci.o9;
import ci.y8;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.xn;
import w7.x5;
public final class s extends n2 implements le.e {
    public final le.c f9153a;
    public long f9154b;
    public FrameLayout f9155c;
    public d61 d;
    public jh.f e;
    public LinearLayout f9156f;
    public ci.d h;
    public ci.d f9157n;
    public xw0 f9158r;
    public TLRPC.ChatFull f9159s;
    public t0 v;

    public s(Bundle bundle) {
        super(bundle);
        this.f9153a = new le.c(0, this, rr.h, 320L, false);
    }

    public static void U(s sVar, h51 h51Var) {
        Object obj = h51Var.G;
        if (obj instanceof gi.f) {
            gi.f fVar = (gi.f) obj;
            long j3 = fVar.f10009a;
            TLRPC.Chat chat = MessagesController.getInstance(sVar.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(sVar.currentAccount).getUser(Long.valueOf(j3));
            if (user != null) {
                sVar.presentFragment(xn.R9(user.f18230id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new hi.c(sVar.getParentActivity(), chat, new y8(23, sVar, fVar)).show();
            } else {
                sVar.presentFragment(xn.R9(-chat.f18083id));
            }
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        int i11;
        float f11 = 1.0f - f7;
        this.f9156f.setAlpha(f11);
        LinearLayout linearLayout = this.f9156f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f9158r.setAlpha(f7);
        xw0 xw0Var = this.f9158r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        xw0Var.setVisibility(i12);
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f9156f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f9158r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        t0 t0Var = new t0(getParentActivity(), this.resourceProvider, xc.a0(this), this.currentAccount, this.f9154b);
        this.v = t0Var;
        t0Var.h = new xa.c(this, 20);
        t0Var.d();
        this.v.e();
        hg.c.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 5));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9155c = frameLayout;
        int i10 = h6.f18733a7;
        frameLayout.setBackgroundColor(h6.w0(null, i10, false));
        d61 d61Var = new d61(this, new bi.v(this, 19), new q(this), new q(this));
        this.d = d61Var;
        d61Var.setClipToPadding(false);
        d61 d61Var2 = this.d;
        d61Var2.Y2.f28662r = false;
        d61Var2.p1();
        this.d.j(new ai.r(this, 5));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f9155c.addView(this.d, x5.c(-1.0f, -1));
        ?? view = new View(context);
        this.e = view;
        view.setupColorKey(i10);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f9155c.addView(this.e, x5.g());
        this.f9155c.addView(this.actionBar, x5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f9156f = linearLayout;
        linearLayout.setOrientation(0);
        this.f9156f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.f9157n = dVar;
        dVar.d();
        this.f9157n.setColor(i0.a.d(0.125f, getThemedColor(h6.f18789d6), getThemedColor(h6.G6)));
        this.f9157n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f9157n.e();
        this.f9157n.setOnClickListener(new View.OnClickListener(this) {
            public final s f9150b;

            {
                this.f9150b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f9150b.v.f(false, true);
                        return;
                    default:
                        this.f9150b.v.f(true, true);
                        return;
                }
            }
        });
        this.f9156f.addView(this.f9157n, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f9150b;

            {
                this.f9150b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f9150b.v.f(false, true);
                        return;
                    default:
                        this.f9150b.v.f(true, true);
                        return;
                }
            }
        });
        this.f9156f.addView(this.h, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f9155c.addView(this.f9156f, x5.e(-1, -2, 80));
        xw0 xw0Var = new xw0(getParentActivity(), null, 16, this.resourceProvider);
        this.f9158r = xw0Var;
        xw0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f9158r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f9158r.setAnimateLayoutChange(true);
        this.f9158r.setVisibility(8);
        this.f9155c.addView(this.f9158r, x5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f9159s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f9153a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.f9155c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.f41795a;
        r0.a0.j(frameLayout2, qVar);
        setBulletinDelegate(new a9(4));
        FrameLayout frameLayout3 = this.f9155c;
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
        this.f9154b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f9154b));
        this.f9159s = getMessagesController().getChatFull(this.f9154b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        t0 t0Var = this.v;
        o9 o9Var = t0Var.f9167i;
        if (o9Var != null) {
            o9Var.run();
        }
        t0Var.f9167i = null;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
