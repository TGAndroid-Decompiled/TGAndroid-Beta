package nh;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import fh.w4;
import g7.e6;
import gh.ua;
import java.util.WeakHashMap;
import kh.b8;
import kh.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oc;
import org.telegram.ui.qn;
public final class r extends o2 implements td.b {
    public final td.a f18714a;
    public long f18715b;
    public FrameLayout f18716c;
    public i51 d;
    public rg.f f18717e;
    public LinearLayout f18718f;
    public kh.d h;
    public kh.d f18719n;
    public gw0 f18720r;
    public TLRPC.ChatFull f18721s;
    public q0 v;

    public r(Bundle bundle) {
        super(bundle);
        this.f18714a = new td.a(0, this, gr.h, 320L, false);
    }

    public static void T(r rVar, l41 l41Var) {
        Object obj = l41Var.G;
        if (obj instanceof oh.e) {
            oh.e eVar = (oh.e) obj;
            long j10 = eVar.f19586a;
            TLRPC.Chat chat = MessagesController.getInstance(rVar.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(rVar.currentAccount).getUser(Long.valueOf(j10));
            if (user != null) {
                rVar.presentFragment(qn.R9(user.f22527id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new ph.b(rVar.getParentActivity(), chat, new o8(11, rVar, eVar)).show();
            } else {
                rVar.presentFragment(qn.R9(-chat.f22380id));
            }
        }
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        int i10;
        float f12 = 1.0f - f10;
        this.f18718f.setAlpha(f12);
        LinearLayout linearLayout = this.f18718f;
        int i11 = 8;
        if (f12 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        this.f18720r.setAlpha(f10);
        gw0 gw0Var = this.f18720r;
        if (f10 > 0.0f) {
            i11 = 0;
        }
        gw0Var.setVisibility(i11);
    }

    public final void U(int i9) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i9);
        this.f18718f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i9);
        this.f18720r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.f18717e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i9);
    }

    @Override
    public final View createView(Context context) {
        boolean z10 = true;
        setHasOwnBackground(true);
        q0 q0Var = new q0(getParentActivity(), this.resourceProvider, oc.a0(this), this.currentAccount, this.f18715b);
        this.v = q0Var;
        q0Var.h = new n5.e0(this, 3);
        q0Var.d();
        this.v.e();
        j2.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new w4(this, 8));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f18716c = frameLayout;
        int i9 = f6.f22947a7;
        frameLayout.setBackgroundColor(f6.w0(null, i9, false));
        i51 i51Var = new i51(this, new b8(this, 12), new p(this), new p(this));
        this.d = i51Var;
        i51Var.setClipToPadding(false);
        i51 i51Var2 = this.d;
        i51Var2.U2.f35188r = false;
        i51Var2.p1();
        this.d.j(new bg.o2(this, 16));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f18716c.addView(this.d, e6.c(-1.0f, -1));
        ?? view = new View(context);
        this.f18717e = view;
        view.setupColorKey(i9);
        this.f18717e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.f18717e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f18716c.addView(this.f18717e, e6.g());
        this.f18716c.addView(this.actionBar, e6.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f18718f = linearLayout;
        linearLayout.setOrientation(0);
        this.f18718f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        kh.d dVar = new kh.d(context, this.resourceProvider, true);
        this.f18719n = dVar;
        dVar.d();
        this.f18719n.setColor(i0.a.d(0.125f, getThemedColor(f6.f23001d6), getThemedColor(f6.G6)));
        this.f18719n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f18719n.e();
        this.f18719n.setOnClickListener(new View.OnClickListener(this) {
            public final r f18697b;

            {
                this.f18697b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f18697b.v.f(false, true);
                        return;
                    default:
                        this.f18697b.v.f(true, true);
                        return;
                }
            }
        });
        this.f18718f.addView(this.f18719n, e6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        kh.d dVar2 = new kh.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final r f18697b;

            {
                this.f18697b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f18697b.v.f(false, true);
                        return;
                    default:
                        this.f18697b.v.f(true, true);
                        return;
                }
            }
        });
        this.f18718f.addView(this.h, e6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f18716c.addView(this.f18718f, e6.e(-1, -2, 80));
        gw0 gw0Var = new gw0(getParentActivity(), null, 16, this.resourceProvider);
        this.f18720r = gw0Var;
        gw0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f18720r.f28885e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f18720r.setAnimateLayoutChange(true);
        this.f18720r.setVisibility(8);
        this.f18716c.addView(this.f18720r, e6.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f18721s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z10 = false;
        }
        this.f18714a.a(z10, false);
        U(0);
        FrameLayout frameLayout2 = this.f18716c;
        p pVar = new p(this);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.b0.j(frameLayout2, pVar);
        setBulletinDelegate(new bg.z(8));
        FrameLayout frameLayout3 = this.f18716c;
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
        this.f18715b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f18715b));
        this.f18721s = getMessagesController().getChatFull(this.f18715b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        q0 q0Var = this.v;
        ua uaVar = q0Var.f18704i;
        if (uaVar != null) {
            uaVar.run();
        }
        q0Var.f18704i = null;
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
