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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.zn;
import w7.x5;
public final class s extends n2 implements me.d {
    public final me.b f10040a;
    public long f10041b;
    public FrameLayout f10042c;
    public l71 d;
    public jh.f f10043e;
    public LinearLayout f10044f;
    public ci.d h;
    public ci.d f10045n;
    public by0 f10046r;
    public TLRPC.ChatFull f10047s;
    public t0 v;

    public s(Bundle bundle) {
        super(bundle);
        this.f10040a = new me.b(0, this, is.h, 320L, false);
    }

    public static void U(s sVar, q61 q61Var) {
        Object obj = q61Var.G;
        if (obj instanceof gi.f) {
            gi.f fVar = (gi.f) obj;
            long j3 = fVar.f10907a;
            TLRPC.Chat chat = MessagesController.getInstance(sVar.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(sVar.currentAccount).getUser(Long.valueOf(j3));
            if (user != null) {
                sVar.presentFragment(zn.W9(user.f20189id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new hi.c(sVar.getParentActivity(), chat, new y8(23, sVar, fVar)).show();
            } else {
                sVar.presentFragment(zn.W9(-chat.f20042id));
            }
        }
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f10044f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f10046r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.f10043e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        t0 t0Var = new t0(getParentActivity(), this.resourceProvider, ad.a0(this), this.currentAccount, this.f10041b);
        this.v = t0Var;
        t0Var.h = new a6.i(this, 20);
        t0Var.d();
        this.v.e();
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 5));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10042c = frameLayout;
        int i10 = i6.f20745a7;
        frameLayout.setBackgroundColor(i6.x0(null, i10, false));
        l71 l71Var = new l71(this, new bi.v(this, 19), new q(this), new q(this));
        this.d = l71Var;
        l71Var.setClipToPadding(false);
        l71 l71Var2 = this.d;
        l71Var2.W2.f25587r = false;
        l71Var2.p1();
        this.d.j(new ai.r(this, 5));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f10042c.addView(this.d, x5.d(-1.0f, -1));
        ?? view = new View(context);
        this.f10043e = view;
        view.setupColorKey(i10);
        this.f10043e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.f10043e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f10042c.addView(this.f10043e, x5.g());
        this.f10042c.addView(this.actionBar, x5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10044f = linearLayout;
        linearLayout.setOrientation(0);
        this.f10044f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.f10045n = dVar;
        dVar.d();
        this.f10045n.setColor(i0.a.d(0.125f, getThemedColor(i6.f20801d6), getThemedColor(i6.G6)));
        this.f10045n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f10045n.e();
        this.f10045n.setOnClickListener(new View.OnClickListener(this) {
            public final s f10037b;

            {
                this.f10037b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10037b.v.f(false, true);
                        return;
                    default:
                        this.f10037b.v.f(true, true);
                        return;
                }
            }
        });
        this.f10044f.addView(this.f10045n, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f10037b;

            {
                this.f10037b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f10037b.v.f(false, true);
                        return;
                    default:
                        this.f10037b.v.f(true, true);
                        return;
                }
            }
        });
        this.f10044f.addView(this.h, x5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f10042c.addView(this.f10044f, x5.e(-1, -2, 80));
        by0 by0Var = new by0(getParentActivity(), null, 16, this.resourceProvider);
        this.f10046r = by0Var;
        by0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f10046r.f25085e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f10046r.setAnimateLayoutChange(true);
        this.f10046r.setVisibility(8);
        this.f10042c.addView(this.f10046r, x5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f10047s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f10040a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.f10042c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.f46810a;
        r0.a0.i(frameLayout2, qVar);
        setBulletinDelegate(new a9(4));
        FrameLayout frameLayout3 = this.f10042c;
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
        this.f10044f.setAlpha(f11);
        LinearLayout linearLayout = this.f10044f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f10046r.setAlpha(f7);
        by0 by0Var = this.f10046r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        by0Var.setVisibility(i12);
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f10041b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f10041b));
        this.f10047s = getMessagesController().getChatFull(this.f10041b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        t0 t0Var = this.v;
        o9 o9Var = t0Var.f10056i;
        if (o9Var != null) {
            o9Var.run();
        }
        t0Var.f10056i = null;
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
