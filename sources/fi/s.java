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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yc;
import org.telegram.ui.wn;
import w7.y5;
public final class s extends m2 implements le.e {
    public final le.c f9164a;
    public long f9165b;
    public FrameLayout f9166c;
    public u61 d;
    public jh.f e;
    public LinearLayout f9167f;
    public ci.d h;
    public ci.d f9168n;
    public lx0 f9169r;
    public TLRPC.ChatFull f9170s;
    public t0 v;

    public s(Bundle bundle) {
        super(bundle);
        this.f9164a = new le.c(0, this, tr.h, 320L, false);
    }

    public static void U(s sVar, y51 y51Var) {
        Object obj = y51Var.G;
        if (obj instanceof gi.f) {
            gi.f fVar = (gi.f) obj;
            long j3 = fVar.f10022a;
            TLRPC.Chat chat = MessagesController.getInstance(sVar.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(sVar.currentAccount).getUser(Long.valueOf(j3));
            if (user != null) {
                sVar.presentFragment(wn.R9(user.f18499id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new hi.c(sVar.getParentActivity(), chat, new y8(23, sVar, fVar)).show();
            } else {
                sVar.presentFragment(wn.R9(-chat.f18352id));
            }
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        int i11;
        float f11 = 1.0f - f7;
        this.f9167f.setAlpha(f11);
        LinearLayout linearLayout = this.f9167f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f9169r.setAlpha(f7);
        lx0 lx0Var = this.f9169r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        lx0Var.setVisibility(i12);
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f9167f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f9169r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        t0 t0Var = new t0(getParentActivity(), this.resourceProvider, yc.a0(this), this.currentAccount, this.f9165b);
        this.v = t0Var;
        t0Var.h = new xa.c(this, 20);
        t0Var.d();
        this.v.e();
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 5));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9166c = frameLayout;
        int i10 = h6.f19020a7;
        frameLayout.setBackgroundColor(h6.w0(null, i10, false));
        u61 u61Var = new u61(this, new bi.v(this, 19), new q(this), new q(this));
        this.d = u61Var;
        u61Var.setClipToPadding(false);
        u61 u61Var2 = this.d;
        u61Var2.f28778f3.f26223r = false;
        u61Var2.s1();
        this.d.j(new ai.r(this, 5));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f9166c.addView(this.d, y5.c(-1.0f, -1));
        ?? view = new View(context);
        this.e = view;
        view.setupColorKey(i10);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f9166c.addView(this.e, y5.g());
        this.f9166c.addView(this.actionBar, y5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f9167f = linearLayout;
        linearLayout.setOrientation(0);
        this.f9167f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.f9168n = dVar;
        dVar.d();
        this.f9168n.setColor(i0.a.d(0.125f, getThemedColor(h6.f19076d6), getThemedColor(h6.G6)));
        this.f9168n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f9168n.e();
        this.f9168n.setOnClickListener(new View.OnClickListener(this) {
            public final s f9161b;

            {
                this.f9161b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f9161b.v.f(false, true);
                        return;
                    default:
                        this.f9161b.v.f(true, true);
                        return;
                }
            }
        });
        this.f9167f.addView(this.f9168n, y5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f9161b;

            {
                this.f9161b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f9161b.v.f(false, true);
                        return;
                    default:
                        this.f9161b.v.f(true, true);
                        return;
                }
            }
        });
        this.f9167f.addView(this.h, y5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f9166c.addView(this.f9167f, y5.e(-1, -2, 80));
        lx0 lx0Var = new lx0(getParentActivity(), null, 16, this.resourceProvider);
        this.f9169r = lx0Var;
        lx0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f9169r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f9169r.setAnimateLayoutChange(true);
        this.f9169r.setVisibility(8);
        this.f9166c.addView(this.f9169r, y5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f9170s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f9164a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.f9166c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.f42233a;
        r0.a0.j(frameLayout2, qVar);
        setBulletinDelegate(new a9(4));
        FrameLayout frameLayout3 = this.f9166c;
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
        this.f9165b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f9165b));
        this.f9170s = getMessagesController().getChatFull(this.f9165b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        t0 t0Var = this.v;
        o9 o9Var = t0Var.f9178i;
        if (o9Var != null) {
            o9Var.run();
        }
        t0Var.f9178i = null;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
