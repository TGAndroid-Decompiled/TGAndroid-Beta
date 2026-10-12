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
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zc;
import org.telegram.ui.eo;
import w7.w5;
public final class s extends m2 implements me.d {
    public final me.b f10038a;
    public long f10039b;
    public FrameLayout f10040c;
    public p71 d;
    public jh.f f10041e;
    public LinearLayout f10042f;
    public ci.d h;
    public ci.d f10043n;
    public gy0 f10044r;
    public TLRPC.ChatFull f10045s;
    public t0 v;

    public s(Bundle bundle) {
        super(bundle);
        this.f10038a = new me.b(0, this, js.h, 320L, false);
    }

    public static void U(s sVar, u61 u61Var) {
        Object obj = u61Var.G;
        if (obj instanceof gi.f) {
            gi.f fVar = (gi.f) obj;
            long j3 = fVar.f10905a;
            TLRPC.Chat chat = MessagesController.getInstance(sVar.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(sVar.currentAccount).getUser(Long.valueOf(j3));
            if (user != null) {
                sVar.presentFragment(eo.W9(user.f19950id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new hi.c(sVar.getParentActivity(), chat, new y8(23, sVar, fVar)).show();
            } else {
                sVar.presentFragment(eo.W9(-chat.f19803id));
            }
        }
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f10042f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f10044r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.f10041e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        t0 t0Var = new t0(getParentActivity(), this.resourceProvider, zc.a0(this), this.currentAccount, this.f10039b);
        this.v = t0Var;
        t0Var.h = new a6.i(this, 19);
        t0Var.d();
        this.v.e();
        hg.c.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 5));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10040c = frameLayout;
        int i10 = h6.f20504a7;
        frameLayout.setBackgroundColor(h6.x0(null, i10, false));
        p71 p71Var = new p71(this, new bi.v(this, 19), new q(this), new q(this));
        this.d = p71Var;
        p71Var.setClipToPadding(false);
        p71 p71Var2 = this.d;
        p71Var2.W2.f26679r = false;
        p71Var2.p1();
        this.d.j(new ai.r(this, 5));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f10040c.addView(this.d, w5.d(-1.0f, -1));
        ?? view = new View(context);
        this.f10041e = view;
        view.setupColorKey(i10);
        this.f10041e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.f10041e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f10040c.addView(this.f10041e, w5.g());
        this.f10040c.addView(this.actionBar, w5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10042f = linearLayout;
        linearLayout.setOrientation(0);
        this.f10042f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.f10043n = dVar;
        dVar.d();
        this.f10043n.setColor(i0.a.d(0.125f, getThemedColor(h6.f20560d6), getThemedColor(h6.G6)));
        this.f10043n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f10043n.e();
        this.f10043n.setOnClickListener(new View.OnClickListener(this) {
            public final s f10035b;

            {
                this.f10035b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10035b.v.f(false, true);
                        return;
                    default:
                        this.f10035b.v.f(true, true);
                        return;
                }
            }
        });
        this.f10042f.addView(this.f10043n, w5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f10035b;

            {
                this.f10035b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10035b.v.f(false, true);
                        return;
                    default:
                        this.f10035b.v.f(true, true);
                        return;
                }
            }
        });
        this.f10042f.addView(this.h, w5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f10040c.addView(this.f10042f, w5.e(-1, -2, 80));
        gy0 gy0Var = new gy0(getParentActivity(), null, 16, this.resourceProvider);
        this.f10044r = gy0Var;
        gy0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f10044r.f26561e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f10044r.setAnimateLayoutChange(true);
        this.f10044r.setVisibility(8);
        this.f10040c.addView(this.f10044r, w5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f10045s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f10038a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.f10040c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.f46989a;
        r0.a0.i(frameLayout2, qVar);
        setBulletinDelegate(new a9(4));
        FrameLayout frameLayout3 = this.f10040c;
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
        this.f10042f.setAlpha(f11);
        LinearLayout linearLayout = this.f10042f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f10044r.setAlpha(f7);
        gy0 gy0Var = this.f10044r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        gy0Var.setVisibility(i12);
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f10039b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f10039b));
        this.f10045s = getMessagesController().getChatFull(this.f10039b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        t0 t0Var = this.v;
        o9 o9Var = t0Var.f10054i;
        if (o9Var != null) {
            o9Var.run();
        }
        t0Var.f10054i = null;
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
