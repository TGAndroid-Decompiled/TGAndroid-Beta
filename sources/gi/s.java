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
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.fo;
import w7.z5;
public final class s extends m2 implements ne.d {
    public final ne.b f10249a;
    public long f10250b;
    public FrameLayout f10251c;
    public i71 d;
    public kh.f e;
    public LinearLayout f10252f;
    public di.d h;
    public di.d f10253n;
    public wx0 f10254r;
    public TLRPC.ChatFull f10255s;
    public t0 v;

    public s(Bundle bundle) {
        super(bundle);
        this.f10249a = new ne.b(0, this, es.h, 320L, false);
    }

    public static void U(s sVar, m61 m61Var) {
        Object obj = m61Var.G;
        if (obj instanceof hi.f) {
            hi.f fVar = (hi.f) obj;
            long j10 = fVar.f10832a;
            TLRPC.Chat chat = MessagesController.getInstance(sVar.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(sVar.currentAccount).getUser(Long.valueOf(j10));
            if (user != null) {
                sVar.presentFragment(fo.W9(user.f19063id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new ii.c(sVar.getParentActivity(), chat, new q3(3, sVar, fVar)).show();
            } else {
                sVar.presentFragment(fo.W9(-chat.f18916id));
            }
        }
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f10252f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f10254r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        t0 t0Var = new t0(getParentActivity(), this.resourceProvider, zc.a0(this), this.currentAccount, this.f10250b);
        this.v = t0Var;
        t0Var.h = new a4.l(this, 23);
        t0Var.d();
        this.v.e();
        i2.d.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 6));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10251c = frameLayout;
        int i10 = g6.f19543a7;
        frameLayout.setBackgroundColor(g6.x0(null, i10, false));
        i71 i71Var = new i71(this, new ci.u(this, 19), new q(this), new q(this));
        this.d = i71Var;
        i71Var.setClipToPadding(false);
        i71 i71Var2 = this.d;
        i71Var2.W2.f23145r = false;
        i71Var2.p1();
        this.d.j(new ah.d0(this, 6));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f10251c.addView(this.d, z5.d(-1.0f, -1));
        ?? view = new View(context);
        this.e = view;
        view.setupColorKey(i10);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f10251c.addView(this.e, z5.g());
        this.f10251c.addView(this.actionBar, z5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10252f = linearLayout;
        linearLayout.setOrientation(0);
        this.f10252f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        di.d dVar = new di.d(context, this.resourceProvider, true);
        this.f10253n = dVar;
        dVar.d();
        this.f10253n.setColor(i0.a.d(0.125f, getThemedColor(g6.f19601d6), getThemedColor(g6.G6)));
        this.f10253n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f10253n.e();
        this.f10253n.setOnClickListener(new View.OnClickListener(this) {
            public final s f10246b;

            {
                this.f10246b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10246b.v.f(false, true);
                        return;
                    default:
                        this.f10246b.v.f(true, true);
                        return;
                }
            }
        });
        this.f10252f.addView(this.f10253n, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        di.d dVar2 = new di.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f10246b;

            {
                this.f10246b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10246b.v.f(false, true);
                        return;
                    default:
                        this.f10246b.v.f(true, true);
                        return;
                }
            }
        });
        this.f10252f.addView(this.h, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f10251c.addView(this.f10252f, z5.e(-1, -2, 80));
        wx0 wx0Var = new wx0(getParentActivity(), null, 16, this.resourceProvider);
        this.f10254r = wx0Var;
        wx0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f10254r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f10254r.setAnimateLayoutChange(true);
        this.f10254r.setVisibility(8);
        this.f10251c.addView(this.f10254r, z5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f10255s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f10249a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.f10251c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.f43485a;
        r0.a0.i(frameLayout2, qVar);
        setBulletinDelegate(new z8(4));
        FrameLayout frameLayout3 = this.f10251c;
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
        this.f10250b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f10250b));
        this.f10255s = getMessagesController().getChatFull(this.f10250b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        t0 t0Var = this.v;
        n9 n9Var = t0Var.f10263i;
        if (n9Var != null) {
            n9Var.run();
        }
        t0Var.f10263i = null;
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        int i11;
        float f11 = 1.0f - f7;
        this.f10252f.setAlpha(f11);
        LinearLayout linearLayout = this.f10252f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f10254r.setAlpha(f7);
        wx0 wx0Var = this.f10254r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        wx0Var.setVisibility(i12);
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
