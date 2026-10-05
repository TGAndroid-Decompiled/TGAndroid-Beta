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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.yn;
import w7.z5;
public final class s extends n2 implements le.d {
    public final le.b f9965a;
    public long f9966b;
    public FrameLayout f9967c;
    public e71 d;
    public jh.f f9968e;
    public LinearLayout f9969f;
    public ci.d h;
    public ci.d f9970n;
    public ux0 f9971r;
    public TLRPC.ChatFull f9972s;
    public t0 v;

    public s(Bundle bundle) {
        super(bundle);
        this.f9965a = new le.b(0, this, tr.h, 320L, false);
    }

    public static void S(s sVar, h61 h61Var) {
        Object obj = h61Var.G;
        if (obj instanceof gi.f) {
            gi.f fVar = (gi.f) obj;
            long j3 = fVar.f10902a;
            TLRPC.Chat chat = MessagesController.getInstance(sVar.currentAccount).getChat(Long.valueOf(-j3));
            TLRPC.User user = MessagesController.getInstance(sVar.currentAccount).getUser(Long.valueOf(j3));
            if (user != null) {
                sVar.presentFragment(yn.Q9(user.f20194id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new hi.c(sVar.getParentActivity(), chat, new x8(23, sVar, fVar)).show();
            } else {
                sVar.presentFragment(yn.Q9(-chat.f20047id));
            }
        }
    }

    public final void T(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f9969f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f9971r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.f9968e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        int i11;
        float f11 = 1.0f - f7;
        this.f9969f.setAlpha(f11);
        LinearLayout linearLayout = this.f9969f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f9971r.setAlpha(f7);
        ux0 ux0Var = this.f9971r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        ux0Var.setVisibility(i12);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        t0 t0Var = new t0(getParentActivity(), this.resourceProvider, yc.a0(this), this.currentAccount, this.f9966b);
        this.v = t0Var;
        t0Var.h = new a6.i(this, 22);
        t0Var.d();
        this.v.e();
        hg.c.u(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 5));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9967c = frameLayout;
        int i10 = i6.f20771a7;
        frameLayout.setBackgroundColor(i6.w0(null, i10, false));
        e71 e71Var = new e71(this, new bi.v(this, 19), new q(this), new q(this));
        this.d = e71Var;
        e71Var.setClipToPadding(false);
        e71 e71Var2 = this.d;
        e71Var2.f26034f3.f32531r = false;
        e71Var2.r1();
        this.d.j(new ai.r(this, 6));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f9967c.addView(this.d, z5.c(-1.0f, -1));
        ?? view = new View(context);
        this.f9968e = view;
        view.setupColorKey(i10);
        this.f9968e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.f9968e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f9967c.addView(this.f9968e, z5.g());
        this.f9967c.addView(this.actionBar, z5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f9969f = linearLayout;
        linearLayout.setOrientation(0);
        this.f9969f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.f9970n = dVar;
        dVar.d();
        this.f9970n.setColor(i0.a.d(0.125f, getThemedColor(i6.f20827d6), getThemedColor(i6.G6)));
        this.f9970n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f9970n.e();
        this.f9970n.setOnClickListener(new View.OnClickListener(this) {
            public final s f9962b;

            {
                this.f9962b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f9962b.v.f(false, true);
                        return;
                    default:
                        this.f9962b.v.f(true, true);
                        return;
                }
            }
        });
        this.f9969f.addView(this.f9970n, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ci.d dVar2 = new ci.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final s f9962b;

            {
                this.f9962b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f9962b.v.f(false, true);
                        return;
                    default:
                        this.f9962b.v.f(true, true);
                        return;
                }
            }
        });
        this.f9969f.addView(this.h, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f9967c.addView(this.f9969f, z5.e(-1, -2, 80));
        ux0 ux0Var = new ux0(getParentActivity(), null, 16, this.resourceProvider);
        this.f9971r = ux0Var;
        ux0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f9971r.f31551e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f9971r.setAnimateLayoutChange(true);
        this.f9971r.setVisibility(8);
        this.f9967c.addView(this.f9971r, z5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f9972s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f9965a.a(z10, false);
        T(0);
        FrameLayout frameLayout2 = this.f9967c;
        q qVar = new q(this);
        WeakHashMap weakHashMap = r0.i0.f45610a;
        r0.a0.j(frameLayout2, qVar);
        setBulletinDelegate(new z8(4));
        FrameLayout frameLayout3 = this.f9967c;
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
        this.f9966b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f9966b));
        this.f9972s = getMessagesController().getChatFull(this.f9966b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        t0 t0Var = this.v;
        n9 n9Var = t0Var.f9981i;
        if (n9Var != null) {
            n9Var.run();
        }
        t0Var.f9981i = null;
    }

    @Override
    public final void V(float f7, int i10) {
    }
}
