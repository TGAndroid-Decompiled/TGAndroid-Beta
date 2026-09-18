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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.bo;
import w7.x5;
public final class s extends o2 implements le.d {
    public final le.b f9170a;
    public long f9171b;
    public FrameLayout f9172c;
    public f61 d;
    public jh.f e;
    public LinearLayout f9173f;
    public ci.d h;
    public ci.d f9174n;
    public zw0 f9175r;
    public TLRPC.ChatFull f9176s;
    public t0 v;

    public s(Bundle bundle) {
        super(bundle);
        this.f9170a = new le.b(0, this, qr.h, 320L, false);
    }

    public static void U(s sVar, j51 j51Var) {
        Object obj = j51Var.G;
        if (obj instanceof gi.f) {
            gi.f fVar = (gi.f) obj;
            long j3 = fVar.f10027a;
            TLRPC.Chat chat = MessagesController.getInstance(sVar.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(sVar.currentAccount).getUser(Long.valueOf(j3));
            if (user != null) {
                sVar.presentFragment(bo.R9(user.f18268id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new hi.c(sVar.getParentActivity(), chat, new b9(23, sVar, fVar)).show();
            } else {
                sVar.presentFragment(bo.R9(-chat.f18121id));
            }
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        int i11;
        float f11 = 1.0f - f7;
        this.f9173f.setAlpha(f11);
        LinearLayout linearLayout = this.f9173f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f9175r.setAlpha(f7);
        zw0 zw0Var = this.f9175r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        zw0Var.setVisibility(i12);
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f9173f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f9175r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        t0 t0Var = new t0(getParentActivity(), this.resourceProvider, vc.a0(this), this.currentAccount, this.f9171b);
        this.v = t0Var;
        t0Var.h = new xa.c(this, 20);
        t0Var.d();
        this.v.e();
        hg.k0.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 5));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9172c = frameLayout;
        int i10 = j6.f18807a7;
        frameLayout.setBackgroundColor(j6.w0(null, i10, false));
        f61 f61Var = new f61(this, new bi.v(this, 19), new q(this), new q(this));
        this.d = f61Var;
        f61Var.setClipToPadding(false);
        f61 f61Var2 = this.d;
        f61Var2.Y2.f29854r = false;
        f61Var2.q1();
        this.d.j(new ai.r(this, 6));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f9172c.addView(this.d, x5.c(-1.0f, -1));
        ?? view = new View(context);
        this.e = view;
        view.setupColorKey(i10);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f9172c.addView(this.e, x5.g());
        this.f9172c.addView(this.actionBar, x5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f9173f = linearLayout;
        linearLayout.setOrientation(0);
        this.f9173f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.f9174n = dVar;
        dVar.d();
        this.f9174n.setColor(i0.a.d(0.125f, getThemedColor(j6.f18863d6), getThemedColor(j6.G6)));
        this.f9174n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f9174n.e();
        this.f9174n.setOnClickListener(new View.OnClickListener(this) {
            public final s f9167b;

            {
                this.f9167b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f9167b.v.f(false, true);
                        return;
                    default:
                        this.f9167b.v.f(true, true);
                        return;
                }
            }
        });
        this.f9173f.addView(this.f9174n, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f9167b;

            {
                this.f9167b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f9167b.v.f(false, true);
                        return;
                    default:
                        this.f9167b.v.f(true, true);
                        return;
                }
            }
        });
        this.f9173f.addView(this.h, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f9172c.addView(this.f9173f, x5.e(-1, -2, 80));
        zw0 zw0Var = new zw0(getParentActivity(), null, 16, this.resourceProvider);
        this.f9175r = zw0Var;
        zw0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f9175r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f9175r.setAnimateLayoutChange(true);
        this.f9175r.setVisibility(8);
        this.f9172c.addView(this.f9175r, x5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f9176s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f9170a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.f9172c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.f41870a;
        r0.a0.j(frameLayout2, qVar);
        setBulletinDelegate(new d9(4));
        FrameLayout frameLayout3 = this.f9172c;
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
        this.f9171b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f9171b));
        this.f9176s = getMessagesController().getChatFull(this.f9171b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        t0 t0Var = this.v;
        r9 r9Var = t0Var.f9184i;
        if (r9Var != null) {
            r9Var.run();
        }
        t0Var.f9184i = null;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
