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
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xc;
import org.telegram.ui.wn;
import w7.y5;
public final class s extends m2 implements le.e {
    public final le.c f9152a;
    public long f9153b;
    public FrameLayout f9154c;
    public s61 d;
    public jh.f e;
    public LinearLayout f9155f;
    public ci.d h;
    public ci.d f9156n;
    public jx0 f9157r;
    public TLRPC.ChatFull f9158s;
    public t0 v;

    public s(Bundle bundle) {
        super(bundle);
        this.f9152a = new le.c(0, this, sr.h, 320L, false);
    }

    public static void U(s sVar, w51 w51Var) {
        Object obj = w51Var.G;
        if (obj instanceof gi.f) {
            gi.f fVar = (gi.f) obj;
            long j3 = fVar.f10008a;
            TLRPC.Chat chat = MessagesController.getInstance(sVar.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(sVar.currentAccount).getUser(Long.valueOf(j3));
            if (user != null) {
                sVar.presentFragment(wn.R9(user.f18482id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new hi.c(sVar.getParentActivity(), chat, new y8(23, sVar, fVar)).show();
            } else {
                sVar.presentFragment(wn.R9(-chat.f18335id));
            }
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        int i11;
        float f11 = 1.0f - f7;
        this.f9155f.setAlpha(f11);
        LinearLayout linearLayout = this.f9155f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f9157r.setAlpha(f7);
        jx0 jx0Var = this.f9157r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        jx0Var.setVisibility(i12);
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f9155f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f9157r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        t0 t0Var = new t0(getParentActivity(), this.resourceProvider, xc.a0(this), this.currentAccount, this.f9153b);
        this.v = t0Var;
        t0Var.h = new xa.c(this, 20);
        t0Var.d();
        this.v.e();
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 5));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9154c = frameLayout;
        int i10 = h6.f19003a7;
        frameLayout.setBackgroundColor(h6.w0(null, i10, false));
        s61 s61Var = new s61(this, new bi.v(this, 19), new q(this), new q(this));
        this.d = s61Var;
        s61Var.setClipToPadding(false);
        s61 s61Var2 = this.d;
        s61Var2.Y2.f25644r = false;
        s61Var2.p1();
        this.d.j(new ai.r(this, 5));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f9154c.addView(this.d, y5.c(-1.0f, -1));
        ?? view = new View(context);
        this.e = view;
        view.setupColorKey(i10);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f9154c.addView(this.e, y5.g());
        this.f9154c.addView(this.actionBar, y5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f9155f = linearLayout;
        linearLayout.setOrientation(0);
        this.f9155f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.f9156n = dVar;
        dVar.d();
        this.f9156n.setColor(i0.a.d(0.125f, getThemedColor(h6.f19059d6), getThemedColor(h6.G6)));
        this.f9156n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f9156n.e();
        this.f9156n.setOnClickListener(new View.OnClickListener(this) {
            public final s f9149b;

            {
                this.f9149b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f9149b.v.f(false, true);
                        return;
                    default:
                        this.f9149b.v.f(true, true);
                        return;
                }
            }
        });
        this.f9155f.addView(this.f9156n, y5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f9149b;

            {
                this.f9149b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f9149b.v.f(false, true);
                        return;
                    default:
                        this.f9149b.v.f(true, true);
                        return;
                }
            }
        });
        this.f9155f.addView(this.h, y5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f9154c.addView(this.f9155f, y5.e(-1, -2, 80));
        jx0 jx0Var = new jx0(getParentActivity(), null, 16, this.resourceProvider);
        this.f9157r = jx0Var;
        jx0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f9157r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f9157r.setAnimateLayoutChange(true);
        this.f9157r.setVisibility(8);
        this.f9154c.addView(this.f9157r, y5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f9158s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f9152a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.f9154c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.f42127a;
        r0.a0.j(frameLayout2, qVar);
        setBulletinDelegate(new a9(4));
        FrameLayout frameLayout3 = this.f9154c;
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
        this.f9153b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f9153b));
        this.f9158s = getMessagesController().getChatFull(this.f9153b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        t0 t0Var = this.v;
        o9 o9Var = t0Var.f9166i;
        if (o9Var != null) {
            o9Var.run();
        }
        t0Var.f9166i = null;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
