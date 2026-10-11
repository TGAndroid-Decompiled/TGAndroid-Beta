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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.zn;
import w7.x5;
public final class s extends m2 implements me.d {
    public final me.b f10039a;
    public long f10040b;
    public FrameLayout f10041c;
    public l71 d;
    public jh.f f10042e;
    public LinearLayout f10043f;
    public ci.d h;
    public ci.d f10044n;
    public by0 f10045r;
    public TLRPC.ChatFull f10046s;
    public t0 v;

    public s(Bundle bundle) {
        super(bundle);
        this.f10039a = new me.b(0, this, is.h, 320L, false);
    }

    public static void U(s sVar, q61 q61Var) {
        Object obj = q61Var.G;
        if (obj instanceof gi.f) {
            gi.f fVar = (gi.f) obj;
            long j3 = fVar.f10906a;
            TLRPC.Chat chat = MessagesController.getInstance(sVar.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(sVar.currentAccount).getUser(Long.valueOf(j3));
            if (user != null) {
                sVar.presentFragment(zn.W9(user.f20215id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new hi.c(sVar.getParentActivity(), chat, new y8(23, sVar, fVar)).show();
            } else {
                sVar.presentFragment(zn.W9(-chat.f20068id));
            }
        }
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f10043f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f10045r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.f10042e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        t0 t0Var = new t0(getParentActivity(), this.resourceProvider, ad.a0(this), this.currentAccount, this.f10040b);
        this.v = t0Var;
        t0Var.h = new a6.i(this, 20);
        t0Var.d();
        this.v.e();
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 5));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10041c = frameLayout;
        int i10 = h6.f20766a7;
        frameLayout.setBackgroundColor(h6.x0(null, i10, false));
        l71 l71Var = new l71(this, new bi.v(this, 19), new q(this), new q(this));
        this.d = l71Var;
        l71Var.setClipToPadding(false);
        l71 l71Var2 = this.d;
        l71Var2.W2.f25649r = false;
        l71Var2.p1();
        this.d.j(new ai.r(this, 5));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f10041c.addView(this.d, x5.d(-1.0f, -1));
        ?? view = new View(context);
        this.f10042e = view;
        view.setupColorKey(i10);
        this.f10042e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.f10042e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f10041c.addView(this.f10042e, x5.g());
        this.f10041c.addView(this.actionBar, x5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10043f = linearLayout;
        linearLayout.setOrientation(0);
        this.f10043f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.f10044n = dVar;
        dVar.d();
        this.f10044n.setColor(i0.a.d(0.125f, getThemedColor(h6.f20822d6), getThemedColor(h6.G6)));
        this.f10044n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f10044n.e();
        this.f10044n.setOnClickListener(new View.OnClickListener(this) {
            public final s f10036b;

            {
                this.f10036b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10036b.v.f(false, true);
                        return;
                    default:
                        this.f10036b.v.f(true, true);
                        return;
                }
            }
        });
        this.f10043f.addView(this.f10044n, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f10036b;

            {
                this.f10036b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10036b.v.f(false, true);
                        return;
                    default:
                        this.f10036b.v.f(true, true);
                        return;
                }
            }
        });
        this.f10043f.addView(this.h, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f10041c.addView(this.f10043f, x5.e(-1, -2, 80));
        by0 by0Var = new by0(getParentActivity(), null, 16, this.resourceProvider);
        this.f10045r = by0Var;
        by0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f10045r.f25123e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f10045r.setAnimateLayoutChange(true);
        this.f10045r.setVisibility(8);
        this.f10041c.addView(this.f10045r, x5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f10046s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f10039a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.f10041c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.f46890a;
        r0.a0.i(frameLayout2, qVar);
        setBulletinDelegate(new a9(4));
        FrameLayout frameLayout3 = this.f10041c;
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
    public final void n(int i10, float f7, float f10, me.e eVar) {
        int i11;
        float f11 = 1.0f - f7;
        this.f10043f.setAlpha(f11);
        LinearLayout linearLayout = this.f10043f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f10045r.setAlpha(f7);
        by0 by0Var = this.f10045r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        by0Var.setVisibility(i12);
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f10040b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f10040b));
        this.f10046s = getMessagesController().getChatFull(this.f10040b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        t0 t0Var = this.v;
        o9 o9Var = t0Var.f10055i;
        if (o9Var != null) {
            o9Var.run();
        }
        t0Var.f10055i = null;
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
