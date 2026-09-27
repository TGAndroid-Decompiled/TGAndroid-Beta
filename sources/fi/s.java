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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xc;
import org.telegram.ui.xn;
import w7.y5;
public final class s extends o2 implements le.e {
    public final le.c f9157a;
    public long f9158b;
    public FrameLayout f9159c;
    public t61 d;
    public jh.f e;
    public LinearLayout f9160f;
    public ci.d h;
    public ci.d f9161n;
    public kx0 f9162r;
    public TLRPC.ChatFull f9163s;
    public t0 v;

    public s(Bundle bundle) {
        super(bundle);
        this.f9157a = new le.c(0, this, sr.h, 320L, false);
    }

    public static void U(s sVar, x51 x51Var) {
        Object obj = x51Var.G;
        if (obj instanceof gi.f) {
            gi.f fVar = (gi.f) obj;
            long j3 = fVar.f10014a;
            TLRPC.Chat chat = MessagesController.getInstance(sVar.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(sVar.currentAccount).getUser(Long.valueOf(j3));
            if (user != null) {
                sVar.presentFragment(xn.R9(user.f18476id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new hi.c(sVar.getParentActivity(), chat, new x8(23, sVar, fVar)).show();
            } else {
                sVar.presentFragment(xn.R9(-chat.f18329id));
            }
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        int i11;
        float f11 = 1.0f - f7;
        this.f9160f.setAlpha(f11);
        LinearLayout linearLayout = this.f9160f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f9162r.setAlpha(f7);
        kx0 kx0Var = this.f9162r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        kx0Var.setVisibility(i12);
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f9160f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f9162r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        t0 t0Var = new t0(getParentActivity(), this.resourceProvider, xc.a0(this), this.currentAccount, this.f9158b);
        this.v = t0Var;
        t0Var.h = new xa.c(this, 20);
        t0Var.d();
        this.v.e();
        hg.k0.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 5));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9159c = frameLayout;
        int i10 = i6.f19001a7;
        frameLayout.setBackgroundColor(i6.w0(null, i10, false));
        t61 t61Var = new t61(this, new bi.v(this, 19), new q(this), new q(this));
        this.d = t61Var;
        t61Var.setClipToPadding(false);
        t61 t61Var2 = this.d;
        t61Var2.Y2.f25959r = false;
        t61Var2.q1();
        this.d.j(new ai.r(this, 5));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f9159c.addView(this.d, y5.c(-1.0f, -1));
        ?? view = new View(context);
        this.e = view;
        view.setupColorKey(i10);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f9159c.addView(this.e, y5.g());
        this.f9159c.addView(this.actionBar, y5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f9160f = linearLayout;
        linearLayout.setOrientation(0);
        this.f9160f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.f9161n = dVar;
        dVar.d();
        this.f9161n.setColor(i0.a.d(0.125f, getThemedColor(i6.f19057d6), getThemedColor(i6.G6)));
        this.f9161n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f9161n.e();
        this.f9161n.setOnClickListener(new View.OnClickListener(this) {
            public final s f9154b;

            {
                this.f9154b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f9154b.v.f(false, true);
                        return;
                    default:
                        this.f9154b.v.f(true, true);
                        return;
                }
            }
        });
        this.f9160f.addView(this.f9161n, y5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f9154b;

            {
                this.f9154b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f9154b.v.f(false, true);
                        return;
                    default:
                        this.f9154b.v.f(true, true);
                        return;
                }
            }
        });
        this.f9160f.addView(this.h, y5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f9159c.addView(this.f9160f, y5.e(-1, -2, 80));
        kx0 kx0Var = new kx0(getParentActivity(), null, 16, this.resourceProvider);
        this.f9162r = kx0Var;
        kx0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f9162r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f9162r.setAnimateLayoutChange(true);
        this.f9162r.setVisibility(8);
        this.f9159c.addView(this.f9162r, y5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f9163s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f9157a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.f9159c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.f42173a;
        r0.a0.j(frameLayout2, qVar);
        setBulletinDelegate(new z8(4));
        FrameLayout frameLayout3 = this.f9159c;
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
        this.f9158b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f9158b));
        this.f9163s = getMessagesController().getChatFull(this.f9158b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        t0 t0Var = this.v;
        n9 n9Var = t0Var.f9171i;
        if (n9Var != null) {
            n9Var.run();
        }
        t0Var.f9171i = null;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
