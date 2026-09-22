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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.bo;
import w7.x5;
public final class s extends n2 implements le.d {
    public final le.b f9167a;
    public long f9168b;
    public FrameLayout f9169c;
    public e61 d;
    public jh.f e;
    public LinearLayout f9170f;
    public ci.d h;
    public ci.d f9171n;
    public yw0 f9172r;
    public TLRPC.ChatFull f9173s;
    public t0 v;

    public s(Bundle bundle) {
        super(bundle);
        this.f9167a = new le.b(0, this, qr.h, 320L, false);
    }

    public static void U(s sVar, i51 i51Var) {
        Object obj = i51Var.G;
        if (obj instanceof gi.f) {
            gi.f fVar = (gi.f) obj;
            long j3 = fVar.f10023a;
            TLRPC.Chat chat = MessagesController.getInstance(sVar.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(sVar.currentAccount).getUser(Long.valueOf(j3));
            if (user != null) {
                sVar.presentFragment(bo.R9(user.f18256id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new hi.c(sVar.getParentActivity(), chat, new b9(23, sVar, fVar)).show();
            } else {
                sVar.presentFragment(bo.R9(-chat.f18109id));
            }
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        int i11;
        float f11 = 1.0f - f7;
        this.f9170f.setAlpha(f11);
        LinearLayout linearLayout = this.f9170f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f9172r.setAlpha(f7);
        yw0 yw0Var = this.f9172r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        yw0Var.setVisibility(i12);
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f9170f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f9172r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        t0 t0Var = new t0(getParentActivity(), this.resourceProvider, vc.a0(this), this.currentAccount, this.f9168b);
        this.v = t0Var;
        t0Var.h = new xa.c(this, 20);
        t0Var.d();
        this.v.e();
        hg.c.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 5));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9169c = frameLayout;
        int i10 = i6.f18778a7;
        frameLayout.setBackgroundColor(i6.w0(null, i10, false));
        e61 e61Var = new e61(this, new bi.v(this, 19), new q(this), new q(this));
        this.d = e61Var;
        e61Var.setClipToPadding(false);
        e61 e61Var2 = this.d;
        e61Var2.Y2.f29610r = false;
        e61Var2.p1();
        this.d.j(new ai.r(this, 6));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f9169c.addView(this.d, x5.c(-1.0f, -1));
        ?? view = new View(context);
        this.e = view;
        view.setupColorKey(i10);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f9169c.addView(this.e, x5.g());
        this.f9169c.addView(this.actionBar, x5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f9170f = linearLayout;
        linearLayout.setOrientation(0);
        this.f9170f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.f9171n = dVar;
        dVar.d();
        this.f9171n.setColor(i0.a.d(0.125f, getThemedColor(i6.f18834d6), getThemedColor(i6.G6)));
        this.f9171n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f9171n.e();
        this.f9171n.setOnClickListener(new View.OnClickListener(this) {
            public final s f9164b;

            {
                this.f9164b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f9164b.v.f(false, true);
                        return;
                    default:
                        this.f9164b.v.f(true, true);
                        return;
                }
            }
        });
        this.f9170f.addView(this.f9171n, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f9164b;

            {
                this.f9164b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f9164b.v.f(false, true);
                        return;
                    default:
                        this.f9164b.v.f(true, true);
                        return;
                }
            }
        });
        this.f9170f.addView(this.h, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f9169c.addView(this.f9170f, x5.e(-1, -2, 80));
        yw0 yw0Var = new yw0(getParentActivity(), null, 16, this.resourceProvider);
        this.f9172r = yw0Var;
        yw0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f9172r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f9172r.setAnimateLayoutChange(true);
        this.f9172r.setVisibility(8);
        this.f9169c.addView(this.f9172r, x5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f9173s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f9167a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.f9169c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.f41839a;
        r0.a0.j(frameLayout2, qVar);
        setBulletinDelegate(new d9(4));
        FrameLayout frameLayout3 = this.f9169c;
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
        this.f9168b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f9168b));
        this.f9173s = getMessagesController().getChatFull(this.f9168b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        t0 t0Var = this.v;
        r9 r9Var = t0Var.f9181i;
        if (r9Var != null) {
            r9Var.run();
        }
        t0Var.f9181i = null;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
