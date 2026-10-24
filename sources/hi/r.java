package hi;

import ai.ud;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ei.o8;
import ei.p6;
import i2.o1;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.zr;
import org.telegram.ui.sn;
import w7.z5;
public final class r extends o2 implements ne.d {
    public final ne.b f12240a;
    public long f12241b;
    public FrameLayout f12242c;
    public i71 d;
    public kh.f e;
    public LinearLayout f12243f;
    public ei.d h;
    public ei.d f12244n;
    public vx0 f12245r;
    public TLRPC.ChatFull f12246s;
    public s0 v;
    public int f12247w;

    public r(Bundle bundle) {
        super(bundle);
        this.f12240a = new ne.b(0, this, zr.h, 320L, false);
    }

    public static void U(r rVar, l61 l61Var) {
        Object obj = l61Var.G;
        if (obj instanceof ii.f) {
            ii.f fVar = (ii.f) obj;
            long j10 = fVar.f13205a;
            TLRPC.Chat chat = MessagesController.getInstance(rVar.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(rVar.currentAccount).getUser(Long.valueOf(j10));
            if (user != null) {
                rVar.presentFragment(sn.W9(user.f20491id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new ji.b(rVar.getParentActivity(), chat, new p6(29, rVar, fVar)).show();
            } else {
                rVar.presentFragment(sn.W9(-chat.f20344id));
            }
        }
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f12243f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f12245r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        s0 s0Var = new s0(getParentActivity(), this.resourceProvider, vc.a0(this), this.currentAccount, this.f12241b);
        this.v = s0Var;
        s0Var.h = new ya.c(this, 23);
        s0Var.d();
        this.v.e();
        o1.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 7));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12242c = frameLayout;
        int i10 = k6.f21126a7;
        r6.i(i10, frameLayout, null);
        i71 i71Var = new i71(this, new hg.o(this, 1), new p(this), new p(this));
        this.d = i71Var;
        i71Var.setClipToPadding(false);
        i71 i71Var2 = this.d;
        i71Var2.Z2.f24646r = false;
        i71Var2.t1();
        this.d.j(new ah.d0(this, 10));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f12242c.addView(this.d, z5.c(-1.0f, -1));
        ?? view = new View(context);
        this.e = view;
        view.setupColorKey(i10);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f12242c.addView(this.e, z5.g());
        this.f12242c.addView(this.actionBar, z5.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f12243f = linearLayout;
        linearLayout.setOrientation(0);
        this.f12243f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ei.d dVar = new ei.d(context, this.resourceProvider, true);
        this.f12244n = dVar;
        dVar.e();
        ei.d dVar2 = this.f12244n;
        int f7 = i0.a.f(0.125f, getThemedColor(k6.f21184d6), getThemedColor(k6.G6));
        this.f12247w = f7;
        dVar2.setColor(f7);
        this.f12244n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f12244n.f();
        this.f12244n.setOnClickListener(new View.OnClickListener(this) {
            public final r f12237b;

            {
                this.f12237b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f12237b.v.f(false, true);
                        return;
                    default:
                        this.f12237b.v.f(true, true);
                        return;
                }
            }
        });
        this.f12243f.addView(this.f12244n, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ei.d dVar3 = new ei.d(context, this.resourceProvider, true);
        this.h = dVar3;
        dVar3.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.f();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final r f12237b;

            {
                this.f12237b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f12237b.v.f(false, true);
                        return;
                    default:
                        this.f12237b.v.f(true, true);
                        return;
                }
            }
        });
        this.f12243f.addView(this.h, z5.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f12242c.addView(this.f12243f, z5.e(-1, -2, 80));
        vx0 vx0Var = new vx0(getParentActivity(), null, 16, this.resourceProvider);
        this.f12245r = vx0Var;
        vx0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f12245r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f12245r.setAnimateLayoutChange(true);
        this.f12245r.setVisibility(8);
        this.f12242c.addView(this.f12245r, z5.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f12246s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f12240a.a(z10, false);
        V(0);
        FrameLayout frameLayout2 = this.f12242c;
        p pVar = new p(this);
        WeakHashMap weakHashMap = r0.i0.f45241a;
        r0.a0.i(frameLayout2, pVar);
        setBulletinDelegate(new o8(4));
        FrameLayout frameLayout3 = this.f12242c;
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
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        int i11;
        float f11 = 1.0f - f7;
        this.f12243f.setAlpha(f11);
        LinearLayout linearLayout = this.f12243f;
        int i12 = 8;
        if (f11 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f12245r.setAlpha(f7);
        vx0 vx0Var = this.f12245r;
        if (f7 > 0.0f) {
            i12 = 0;
        }
        vx0Var.setVisibility(i12);
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f12241b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f12241b));
        this.f12246s = getMessagesController().getChatFull(this.f12241b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        s0 s0Var = this.v;
        ud udVar = s0Var.f12255i;
        if (udVar != null) {
            udVar.run();
        }
        s0Var.f12255i = null;
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            int f7 = i0.a.f(0.125f, getThemedColor(k6.f21184d6), getThemedColor(k6.G6));
            ei.d dVar = this.f12244n;
            if (dVar != null && f7 != this.f12247w) {
                this.f12247w = f7;
                dVar.setColor(f7);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
