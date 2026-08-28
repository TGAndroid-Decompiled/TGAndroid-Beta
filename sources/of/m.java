package of;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bg.d2;
import g7.e6;
import ih.e7;
import ih.v6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import kh.i9;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.d7;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.x2;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.uh0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.dy;
import org.telegram.ui.yx;
public class m extends vk0 implements n2 {
    public static final boolean Y = BuildVars.DEBUG_PRIVATE_VERSION;
    public boolean A;
    public final int B;
    public boolean C;
    public boolean D;
    public long E;
    public boolean F;
    public wk0 G;
    public uh0 H;
    public Drawable K;
    public final j L;
    public boolean M;
    public final dy N;
    public boolean O;
    public final TLRPC.RequestPeerType P;
    public boolean Q;
    public final long R;
    public boolean V;
    public boolean W;
    public final Context f19409c;
    public ArrayList d;
    public boolean f19410e;
    public int f19411f;
    public int h;
    public boolean f19412n;
    public final int f19413r;
    public long f19414s;
    public int v;
    public final boolean f19415w;
    public final ArrayList f19416x;
    public boolean f19417y;
    public ArrayList I = new ArrayList();
    public ArrayList J = new ArrayList();
    public int S = 10;
    public final LongSparseIntArray T = new LongSparseIntArray();
    public final HashMap U = new HashMap();
    public int X = -1;

    public m(dy dyVar, Context context, int i9, int i10, boolean z10, ArrayList arrayList, int i11, TLRPC.RequestPeerType requestPeerType) {
        boolean z11;
        this.f19409c = context;
        this.N = dyVar;
        this.h = i9;
        this.f19413r = i10;
        this.f19415w = z10;
        if (i10 == 0 && i9 == 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f19417y = z11;
        this.f19416x = arrayList;
        this.B = i11;
        this.R = dyVar.T2;
        if (i10 == 0) {
            ?? obj = new Object();
            obj.f19371a = new HashSet();
            obj.f19372b = new HashSet();
            obj.f19373c = new HashSet();
            obj.d = new ArrayList();
            obj.f19374e = new d2(obj, 19);
            this.L = obj;
        }
        this.P = requestPeerType;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 1 && i9 != 5 && i9 != 3 && i9 != 8 && i9 != 7 && i9 != 10 && i9 != 11 && i9 != 13 && i9 != 15 && i9 != 16 && i9 != 18 && i9 != 19 && i9 != 20) {
            return true;
        }
        return false;
    }

    public final int E() {
        int i9 = this.h;
        int i10 = this.f19413r;
        if (i9 != 7 && i9 != 8) {
            if (i10 == 1) {
                return 2;
            }
            if (this.d != null) {
                return 1;
            }
            return 0;
        } else if (MessagesController.getInstance(this.B).isDialogsEndReached(i10)) {
            return 2;
        } else {
            return 3;
        }
    }

    public final int F(long j10) {
        for (int i9 = 0; i9 < this.I.size(); i9++) {
            if (((k) this.I.get(i9)).f19385c != null && ((k) this.I.get(i9)).f19385c.f22384id == j10) {
                return i9;
            }
        }
        return -1;
    }

    public final int G(int i9) {
        if (this.A) {
            i9--;
        }
        if (this.f19417y) {
            i9 = j3.r0.g(2, i9, MessagesController.getInstance(this.B).hintDialogs);
        }
        if (this.f19412n && this.h == 3) {
            i9--;
        }
        int i10 = this.h;
        if (i10 != 11 && i10 != 13) {
            if (i10 == 12) {
                return i9 - 1;
            }
            return i9;
        }
        return i9 - 2;
    }

    public final MessagesController.DialogFilter H() {
        int i9 = this.h;
        if (i9 != 7 && i9 != 8) {
            return null;
        }
        return MessagesController.getInstance(this.B).selectedDialogFilter[this.h - 7];
    }

    public final Object I(int i9) {
        if (i9 >= 0 && i9 < this.I.size()) {
            k kVar = (k) this.I.get(i9);
            String str = kVar.f19392l;
            TLRPC.TL_contact tL_contact = kVar.f19386e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = kVar.f19393m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = kVar.f19394n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = kVar.f19385c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return MessagesController.getInstance(this.B).getUser(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = kVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void M(boolean z10) {
        this.f19412n = z10;
    }

    public final void N(uh0 uh0Var) {
        this.H = uh0Var;
    }

    public final void O(wk0 wk0Var, boolean z10) {
        this.F = z10;
        for (int i9 = 0; i9 < wk0Var.getChildCount(); i9++) {
            if (wk0Var.getChildAt(i9) instanceof r2) {
                ((r2) wk0Var.getChildAt(i9)).f24977f = z10;
            }
        }
        for (int i10 = 0; i10 < wk0Var.getCachedChildCount(); i10++) {
            if (wk0Var.P(i10) instanceof r2) {
                ((r2) wk0Var.P(i10)).f24977f = z10;
            }
        }
        for (int i11 = 0; i11 < wk0Var.getHiddenChildCount(); i11++) {
            if (wk0Var.V(i11) instanceof r2) {
                ((r2) wk0Var.V(i11)).f24977f = z10;
            }
        }
        for (int i12 = 0; i12 < wk0Var.getAttachedScrapChildCount(); i12++) {
            if (wk0Var.O(i12) instanceof r2) {
                ((r2) wk0Var.O(i12)).f24977f = z10;
            }
        }
    }

    public final void P(boolean z10) {
        this.M = z10;
    }

    public final void Q(long j10) {
        this.f19414s = j10;
    }

    public final void R(yx yxVar) {
        this.G = yxVar;
    }

    public boolean S() {
        return false;
    }

    public final void T(boolean z10) {
        int i9 = this.B;
        if (this.d != null) {
            if (!z10 || SystemClock.elapsedRealtime() - this.E >= 2000) {
                this.E = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i9).getCurrentTime();
                    Collections.sort(this.d, new d(MessagesController.getInstance(i9), currentTime, 1));
                    if (z10) {
                        l();
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    public final void U() {
        boolean z10;
        if (this.f19413r == 0 && this.h == 0 && !this.f19415w && !MessagesController.getInstance(this.B).hintDialogs.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f19417y = z10;
    }

    public final void V() {
        throw new UnsupportedOperationException("Method not decompiled: of.m.V():void");
    }

    public final void W(Runnable runnable) {
        if (this.V) {
            this.W = true;
            return;
        }
        this.V = true;
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        arrayList.addAll(this.I);
        V();
        ArrayList arrayList2 = new ArrayList(this.I);
        ArrayList arrayList3 = this.J;
        this.I = arrayList3;
        g gVar = new g(this, arrayList2, 0);
        if (arrayList3.size() >= 50 && Y) {
            Utilities.searchQueue.postRunnable(new androidx.car.app.utils.c(this, gVar, runnable, arrayList2, 23));
            return;
        }
        f2.o c10 = f2.s.c(gVar, true);
        this.V = false;
        if (runnable != null) {
            runnable.run();
        }
        this.I = arrayList2;
        c10.b(this);
    }

    @Override
    public final boolean b() {
        return this.f19416x.isEmpty();
    }

    @Override
    public final void c() {
        boolean z10;
        v6 storiesController = MessagesController.getInstance(this.B).getStoriesController();
        ArrayList arrayList = storiesController.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (storiesController.D(0, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i9)).peer);
            if (!z10 || storiesController.D(0, peerDialogId) != 0) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        this.N.getOrCreateStoryViewer().G(this.f19409c, null, arrayList2, 0, null, null, new e7(this.G, true), false);
    }

    @Override
    public final void e(r2 r2Var) {
        int i9 = this.B;
        MessagesController.getInstance(i9);
        if (MessagesController.getInstance(i9).getStoriesController().I(r2Var.getDialogId())) {
            dy dyVar = this.N;
            dyVar.getOrCreateStoryViewer().getClass();
            dyVar.getOrCreateStoryViewer().D(dyVar.getParentActivity(), r2Var.getDialogId(), e7.a((wk0) r2Var.getParent()));
        }
    }

    @Override
    public final void f(r2 r2Var) {
        this.N.H4(r2Var);
    }

    @Override
    public final int h() {
        int size = this.I.size();
        this.v = size;
        return size;
    }

    @Override
    public final long i(int i9) {
        return ((k) this.I.get(i9)).f19391k;
    }

    @Override
    public final int j(int i9) {
        return ((k) this.I.get(i9)).f48814a;
    }

    @Override
    public void l() {
        if (this.V) {
            this.I = new ArrayList();
        }
        this.V = false;
        V();
        super.l();
    }

    @Override
    public final void v(f2.q1 r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: of.m.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        ?? r22;
        int i10;
        int i11;
        int i12;
        long j10 = this.R;
        Context context = this.f19409c;
        switch (i9) {
            case 0:
            case 21:
                int i13 = this.h;
                if (i13 != 2 && i13 != 15) {
                    r2 r2Var = new r2(this.N, this.f19409c, false, this.B, null);
                    if (S()) {
                        i9 i9Var = new i9(this, 4);
                        r2Var.F1 = true;
                        r2Var.G1 = i9Var;
                    }
                    r2Var.setArchivedPullAnimation(this.H);
                    r2Var.setPreloader(this.L);
                    r2Var.setDialogCellDelegate(this);
                    r2Var.setIsTransitionSupport(this.O);
                    if (i9 == 21) {
                        d7 d7Var = new d7(r2Var.getContext(), r2Var, false, R.drawable.forward_to_stories, r2Var.B4);
                        r2Var = r2Var;
                        r2Var.C = d7Var;
                        r2Var.B = true;
                    }
                    if (j10 != 0) {
                        r2Var.K0 = true;
                    }
                    r22 = r2Var;
                } else {
                    r22 = new h6(context, null);
                }
                if (this.h == 15) {
                    r22.setBackgroundColor(f6.w0(null, f6.f23001d6, false));
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new e00(context, null);
                r22.setIsSingleCell(true);
                if (i9 == 13) {
                    i10 = 18;
                } else {
                    i10 = 7;
                }
                r22.setViewType(i10);
                if (i10 == 18) {
                    r22.setIgnoreHeightCheck(true);
                }
                if (i9 == 13) {
                    r22.setItemsCount((int) ((AndroidUtilities.displaySize.y * 0.5f) / AndroidUtilities.dp(64.0f)));
                    break;
                }
                break;
            case 2:
                r22 = new m4(context);
                r22.setText(LocaleController.getString(R.string.RecentlyViewed));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 15.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextColor(f6.w0(null, f6.L6, false));
                textView.setText(LocaleController.getString(R.string.RecentlyViewedHide));
                int i14 = 3;
                if (LocaleController.isRTL) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                textView.setGravity(i11 | 16);
                if (!LocaleController.isRTL) {
                    i14 = 5;
                }
                r22.addView(textView, e6.d(-1, -1.0f, i14 | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new x8(this, 8));
                break;
            case 3:
                r22 = new dh.g(context, 3);
                r22.setBackgroundColor(f6.w0(null, f6.f22947a7, false));
                View view = new View(context);
                view.setBackgroundDrawable(f6.V0(context, R.drawable.greydivider, f6.f22966b7));
                r22.addView(view, e6.c(-1.0f, -1));
                break;
            case 4:
                r22 = new org.telegram.ui.Cells.a0(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.f25251n = new z8((b6) null);
                r22.f25254w = AndroidUtilities.dp(40.0f);
                r22.B = AndroidUtilities.dp(10.0f);
                r22.D = UserConfig.selectedAccount;
                f6.R(context);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
                break;
            case 5:
                r22 = new x2(context);
                break;
            case 6:
                r22 = new va(context, 8, 0, false);
                break;
            case 7:
                r22 = new m4(context);
                dy dyVar = this.N;
                if (dyVar == null || !dyVar.J0) {
                    r22.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new z6(context, (j2) null);
                fq fqVar = new fq(new ColorDrawable(f6.w0(null, f6.f22947a7, false)), f6.V0(context, R.drawable.greydivider, f6.f22966b7));
                fqVar.f28550w = true;
                r22.setBackgroundDrawable(fqVar);
                break;
            case 9:
            case 12:
            default:
                r22 = new p8(context);
                if (this.h == 15) {
                    r22.setBackgroundColor(f6.w0(null, f6.f23001d6, false));
                    break;
                }
                break;
            case 10:
                r22 = new l(this, context);
                break;
            case 11:
                r22 = new i(this, context);
                fq fqVar2 = new fq(new ColorDrawable(f6.w0(null, f6.f22947a7, false)), f6.V0(context, R.drawable.greydivider, f6.f22966b7));
                fqVar2.f28550w = true;
                r22.setBackgroundDrawable(fqVar2);
                break;
            case 14:
                m4 m4Var = new m4(this.f19409c, f6.f23038f7, 16, 0, false, null);
                m4Var.setHeight(32);
                m4Var.setClickable(false);
                r22 = m4Var;
                break;
            case 15:
                r22 = new LinearLayout(context);
                r22.f24909b = new ArrayList();
                r22.setOrientation(1);
                r22.setBackgroundColor(f6.w0(null, f6.f22947a7, false));
                break;
            case 16:
                r22 = new h(this, context);
                break;
            case 17:
                r22 = new z2(context);
                break;
            case 18:
                r22 = new an(context, 6);
                break;
            case 19:
                r22 = new l(this, context);
                r22.addView(new p6(this.f19409c, this.B, null, new f(this, 1), null), e6.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new v3(context, null);
                break;
            case 22:
                r22 = new m4(context);
                break;
            case 23:
                r2 r2Var2 = new r2(this.N, this.f19409c, false, this.B, null);
                if (j10 != 0) {
                    r2Var2.K0 = true;
                    r2Var2.L0 = true;
                }
                r22 = r2Var2;
                break;
        }
        if (i9 != 5 && i9 != 19) {
            i12 = -2;
        } else {
            i12 = -1;
        }
        r22.setLayoutParams(new f2.a1(-1, i12));
        return new f2.q1(r22);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        if (view instanceof r2) {
            r2 r2Var = (r2) view;
            r2Var.S(this.D, false);
            r2Var.U(this.f19416x.contains(Long.valueOf(r2Var.getDialogId())), false);
        }
    }

    public void J() {
    }

    public void K() {
    }

    public void L(TLRPC.User user) {
    }

    @Override
    public void a(r2 r2Var) {
    }

    @Override
    public void d(r2 r2Var) {
    }
}
