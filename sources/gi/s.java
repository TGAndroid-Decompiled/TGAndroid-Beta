package gi;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import di.n9;
import di.z8;
import fi.q3;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
import w7.a6;
public final class s extends m2 implements ne.d {
    public final ne.b f10245a;
    public long f10246b;
    public FrameLayout f10247c;
    public h71 d;
    public kh.f e;
    public LinearLayout f10248f;
    public di.d h;
    public di.d f10249n;
    public wx0 f10250r;
    public TLRPC.ChatFull f10251s;
    public t0 v;

    public s(Bundle bundle) {
        super(bundle);
        this.f10245a = new ne.b(0, this, es.h, 320L, false);
    }

    public static void U(s sVar, l61 l61Var) {
        Object obj = l61Var.G;
        if (obj instanceof hi.f) {
            hi.f fVar = (hi.f) obj;
            long j10 = fVar.f10828a;
            TLRPC.Chat chat = MessagesController.getInstance(sVar.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(sVar.currentAccount).getUser(Long.valueOf(j10));
            if (user != null) {
                sVar.presentFragment(fo.W9(user.f19363id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new ii.c(sVar.getParentActivity(), chat, new q3(3, sVar, fVar)).show();
            } else {
                sVar.presentFragment(fo.W9(-chat.f19216id));
            }
        }
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f10248f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f10250r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        t0 t0Var = new t0(getParentActivity(), this.resourceProvider, zc.a0(this), this.currentAccount, this.f10246b);
        this.v = t0Var;
        t0Var.h = new k6.h(this, 25);
        t0Var.d();
        this.v.e();
        i2.d.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 6));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10247c = frameLayout;
        int i10 = g6.f19843a7;
        frameLayout.setBackgroundColor(g6.x0(null, i10, false));
        h71 h71Var = new h71(this, new ci.u(this, 19), new q(this), new q(this));
        this.d = h71Var;
        h71Var.setClipToPadding(false);
        h71 h71Var2 = this.d;
        h71Var2.W2.f31780r = false;
        h71Var2.p1();
        this.d.j(new ah.d0(this, 6));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f10247c.addView(this.d, a6.d(-1.0f, -1));
        ?? view = new View(context);
        this.e = view;
        view.setupColorKey(i10);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f10247c.addView(this.e, a6.g());
        this.f10247c.addView(this.actionBar, a6.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10248f = linearLayout;
        linearLayout.setOrientation(0);
        this.f10248f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        di.d dVar = new di.d(context, this.resourceProvider, true);
        this.f10249n = dVar;
        dVar.d();
        this.f10249n.setColor(i0.a.d(0.125f, getThemedColor(g6.f19901d6), getThemedColor(g6.G6)));
        this.f10249n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f10249n.e();
        this.f10249n.setOnClickListener(new View.OnClickListener(this) {
            public final s f10242b;

            {
                this.f10242b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10242b.v.f(false, true);
                        return;
                    default:
                        this.f10242b.v.f(true, true);
                        return;
                }
            }
        });
        this.f10248f.addView(this.f10249n, a6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        di.d dVar2 = new di.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f10242b;

            {
                this.f10242b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10242b.v.f(false, true);
                        return;
                    default:
                        this.f10242b.v.f(true, true);
                        return;
                }
            }
        });
        this.f10248f.addView(this.h, a6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f10247c.addView(this.f10248f, a6.e(-1, -2, 80));
        wx0 wx0Var = new wx0(getParentActivity(), null, 16, this.resourceProvider);
        this.f10250r = wx0Var;
        wx0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f10250r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f10250r.setAnimateLayoutChange(true);
        this.f10250r.setVisibility(8);
        this.f10247c.addView(this.f10250r, a6.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f10251s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f10245a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.f10247c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.j0.f43732a;
        r0.b0.i(frameLayout2, qVar);
        setBulletinDelegate(new z8(4));
        FrameLayout frameLayout3 = this.f10247c;
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
        this.f10246b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f10246b));
        this.f10251s = getMessagesController().getChatFull(this.f10246b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        t0 t0Var = this.v;
        n9 n9Var = t0Var.f10259i;
        if (n9Var != null) {
            n9Var.run();
        }
        t0Var.f10259i = null;
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        int i11;
        float f11 = 1.0f - f7;
        this.f10248f.setAlpha(f11);
        LinearLayout linearLayout = this.f10248f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f10250r.setAlpha(f7);
        wx0 wx0Var = this.f10250r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        wx0Var.setVisibility(i12);
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
