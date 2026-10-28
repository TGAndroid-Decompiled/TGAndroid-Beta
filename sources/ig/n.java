package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.h7;
import di.i4;
import di.q7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.ActionBar.z6;
import org.telegram.ui.Cells.ab;
import org.telegram.ui.Cells.j7;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.m6;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Cells.x2;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.vn;
import org.telegram.ui.d3;
import org.telegram.ui.ey;
import org.telegram.ui.zx;
public class n extends mm0 implements l2 {
    public static final boolean f14166c0 = BuildVars.DEBUG_PRIVATE_VERSION;
    public boolean E;
    public final int F;
    public boolean G;
    public boolean H;
    public long I;
    public boolean J;
    public nm0 K;
    public ij0 L;
    public Drawable O;
    public final k P;
    public boolean Q;
    public final ey R;
    public boolean S;
    public final TLRPC.RequestPeerType T;
    public boolean U;
    public final long V;
    public boolean Z;
    public boolean f14167a0;
    public final Context f14169c;
    public ArrayList d;
    public boolean e;
    public int f14170f;
    public int h;
    public boolean f14171n;
    public final int f14172r;
    public long f14173s;
    public int v;
    public final boolean f14174w;
    public final ArrayList f14175x;
    public boolean f14176y;
    public ArrayList M = new ArrayList();
    public ArrayList N = new ArrayList();
    public int W = 10;
    public final LongSparseIntArray X = new LongSparseIntArray();
    public final HashMap Y = new HashMap();
    public int f14168b0 = -1;

    public n(ey eyVar, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType) {
        boolean z11;
        this.f14169c = context;
        this.R = eyVar;
        this.h = i10;
        this.f14172r = i11;
        this.f14174w = z10;
        if (i11 == 0 && i10 == 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f14176y = z11;
        this.f14175x = arrayList;
        this.F = i12;
        this.V = eyVar.Y2;
        if (i11 == 0) {
            ?? obj = new Object();
            obj.f14142a = new HashSet();
            obj.f14143b = new HashSet();
            obj.f14144c = new HashSet();
            obj.d = new ArrayList();
            obj.e = new ag.c(obj, 18);
            this.P = obj;
        }
        this.T = requestPeerType;
    }

    public static void E(View view, Drawable drawable) {
        if (drawable != null) {
            try {
                f7.y(view, drawable, y6.f23319b7, null, PorterDuff.Mode.MULTIPLY);
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        int i10 = y6.f23300a7;
        g gVar = new g();
        gh.a aVar = new gh.a(29);
        int Q = f7.Q(i10, -1, 0, 0.0f, null);
        aVar.d(Q, view);
        z6 x9 = f7.x(101, view);
        x9.c(i10, -1, 0, 0.0f, null);
        x9.f23810n = gVar;
        x9.f23811o = aVar;
        x9.f23809m = false;
        x9.f23804g = Q;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 != 1 && i10 != 5 && i10 != 3 && i10 != 8 && i10 != 7 && i10 != 10 && i10 != 11 && i10 != 13 && i10 != 15 && i10 != 16 && i10 != 18 && i10 != 19 && i10 != 20) {
            return true;
        }
        return false;
    }

    public final int F() {
        int i10 = this.h;
        int i11 = this.f14172r;
        if (i10 != 7 && i10 != 8) {
            if (i11 == 1) {
                return 2;
            }
            if (this.d != null) {
                return 1;
            }
            return 0;
        } else if (MessagesController.getInstance(this.F).isDialogsEndReached(i11)) {
            return 2;
        } else {
            return 3;
        }
    }

    public final int G(long j10) {
        for (int i10 = 0; i10 < this.M.size(); i10++) {
            if (((l) this.M.get(i10)).f14149c != null && ((l) this.M.get(i10)).f14149c.f22032id == j10) {
                return i10;
            }
        }
        return -1;
    }

    public final int H(int i10) {
        if (this.E) {
            i10--;
        }
        if (this.f14176y) {
            i10 = ic.a.f(2, i10, MessagesController.getInstance(this.F).hintDialogs);
        }
        if (this.f14171n && this.h == 3) {
            i10--;
        }
        int i11 = this.h;
        if (i11 != 11 && i11 != 13) {
            if (i11 == 12) {
                return i10 - 1;
            }
            return i10;
        }
        return i10 - 2;
    }

    public final MessagesController.DialogFilter I() {
        int i10 = this.h;
        if (i10 != 7 && i10 != 8) {
            return null;
        }
        return MessagesController.getInstance(this.F).selectedDialogFilter[this.h - 7];
    }

    public final Object J(int i10) {
        if (i10 >= 0 && i10 < this.M.size()) {
            l lVar = (l) this.M.get(i10);
            String str = lVar.f14155l;
            TLRPC.TL_contact tL_contact = lVar.e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = lVar.f14156m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = lVar.f14157n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = lVar.f14149c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return MessagesController.getInstance(this.F).getUser(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = lVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void N(boolean z10) {
        this.f14171n = z10;
    }

    public final void O(ij0 ij0Var) {
        this.L = ij0Var;
    }

    public final void P(nm0 nm0Var, boolean z10) {
        this.J = z10;
        for (int i10 = 0; i10 < nm0Var.getChildCount(); i10++) {
            if (nm0Var.getChildAt(i10) instanceof p2) {
                ((p2) nm0Var.getChildAt(i10)).f24655f = z10;
            }
        }
        for (int i11 = 0; i11 < nm0Var.getCachedChildCount(); i11++) {
            if (nm0Var.P(i11) instanceof p2) {
                ((p2) nm0Var.P(i11)).f24655f = z10;
            }
        }
        for (int i12 = 0; i12 < nm0Var.getHiddenChildCount(); i12++) {
            if (nm0Var.V(i12) instanceof p2) {
                ((p2) nm0Var.V(i12)).f24655f = z10;
            }
        }
        for (int i13 = 0; i13 < nm0Var.getAttachedScrapChildCount(); i13++) {
            if (nm0Var.O(i13) instanceof p2) {
                ((p2) nm0Var.O(i13)).f24655f = z10;
            }
        }
    }

    public final void Q(boolean z10) {
        this.Q = z10;
    }

    public final void R(long j10) {
        this.f14173s = j10;
    }

    public final void S(zx zxVar) {
        this.K = zxVar;
    }

    public boolean T() {
        return false;
    }

    public final void U(boolean z10) {
        int i10 = this.F;
        if (this.d != null) {
            if (!z10 || SystemClock.elapsedRealtime() - this.I >= 2000) {
                this.I = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                    Collections.sort(this.d, new d(MessagesController.getInstance(i10), currentTime, 1));
                    if (z10) {
                        l();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public final void V() {
        boolean z10;
        if (this.f14172r == 0 && this.h == 0 && !this.f14174w && !MessagesController.getInstance(this.F).hintDialogs.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14176y = z10;
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: ig.n.W():void");
    }

    public final void X(Runnable runnable) {
        if (this.Z) {
            this.f14167a0 = true;
            return;
        }
        this.Z = true;
        ArrayList arrayList = new ArrayList();
        this.N = arrayList;
        arrayList.addAll(this.M);
        W();
        ArrayList arrayList2 = new ArrayList(this.M);
        ArrayList arrayList3 = this.N;
        this.M = arrayList3;
        h hVar = new h(this, arrayList2, 0);
        if (arrayList3.size() >= 50 && f14166c0) {
            Utilities.searchQueue.postRunnable(new ai.e0(this, hVar, runnable, arrayList2, 23));
            return;
        }
        m4.d c10 = s4.p.c(hVar, true);
        this.Z = false;
        if (runnable != null) {
            runnable.run();
        }
        this.M = arrayList2;
        c10.c(this);
    }

    @Override
    public final boolean b() {
        return this.f14175x.isEmpty();
    }

    @Override
    public final void c() {
        boolean z10;
        h7 storiesController = MessagesController.getInstance(this.F).getStoriesController();
        ArrayList arrayList = storiesController.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (storiesController.E(0, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer);
            if (!z10 || storiesController.E(0, peerDialogId) != 0) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        this.R.getOrCreateStoryViewer().H(this.f14169c, null, arrayList2, 0, null, null, new q7(this.K, true), false);
    }

    @Override
    public final void e(p2 p2Var) {
        int i10 = this.F;
        MessagesController.getInstance(i10);
        if (MessagesController.getInstance(i10).getStoriesController().K(p2Var.getDialogId())) {
            ey eyVar = this.R;
            eyVar.getOrCreateStoryViewer().getClass();
            eyVar.getOrCreateStoryViewer().E(eyVar.getParentActivity(), p2Var.getDialogId(), q7.a((nm0) p2Var.getParent()));
        }
    }

    @Override
    public final void f(p2 p2Var) {
        this.R.P4(p2Var);
    }

    @Override
    public final int h() {
        int size = this.M.size();
        this.v = size;
        return size;
    }

    @Override
    public final long i(int i10) {
        return ((l) this.M.get(i10)).f14154k;
    }

    @Override
    public final int j(int i10) {
        return ((l) this.M.get(i10)).f47075a;
    }

    @Override
    public void l() {
        if (this.Z) {
            this.M = new ArrayList();
        }
        this.Z = false;
        W();
        super.l();
    }

    @Override
    public final void v(s4.e1 r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: ig.n.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        ?? r22;
        int i11;
        int i12;
        q4 q4Var;
        int i13;
        long j10 = this.V;
        Context context = this.f14169c;
        switch (i10) {
            case 0:
            case 21:
                int i14 = this.h;
                if (i14 != 2 && i14 != 15) {
                    p2 p2Var = new p2(this.R, this.f14169c, false, this.F, null);
                    if (T()) {
                        ai.i iVar = new ai.i(this, 29);
                        p2Var.J1 = true;
                        p2Var.K1 = iVar;
                    }
                    p2Var.setArchivedPullAnimation(this.L);
                    p2Var.setPreloader(this.P);
                    p2Var.setDialogCellDelegate(this);
                    p2Var.setIsTransitionSupport(this.S);
                    if (i10 == 21) {
                        j7 j7Var = new j7(p2Var.getContext(), p2Var, false, R.drawable.forward_to_stories, p2Var.J4);
                        p2Var = p2Var;
                        p2Var.G = j7Var;
                        p2Var.F = true;
                    }
                    if (j10 != 0) {
                        p2Var.O0 = true;
                    }
                    r22 = p2Var;
                } else {
                    r22 = new m6(context, null);
                }
                if (this.h == 15) {
                    f7.i(y6.f23357d6, r22, null);
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new c10(context, null);
                r22.setIsSingleCell(true);
                if (i10 == 13) {
                    i11 = 18;
                } else {
                    i11 = 7;
                }
                r22.setViewType(i11);
                if (i11 == 18) {
                    r22.setIgnoreHeightCheck(true);
                }
                if (i10 == 13) {
                    r22.setItemsCount((int) ((AndroidUtilities.displaySize.y * 0.5f) / AndroidUtilities.dp(64.0f)));
                    break;
                }
                break;
            case 2:
                r22 = new q4(context);
                r22.setText(LocaleController.getString(R.string.RecentlyViewed));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 15.0f);
                textView.setTypeface(AndroidUtilities.bold());
                f7.V(textView, y6.L6, null);
                textView.setText(LocaleController.getString(R.string.RecentlyViewedHide));
                int i15 = 3;
                if (LocaleController.isRTL) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                textView.setGravity(i12 | 16);
                if (!LocaleController.isRTL) {
                    i15 = 5;
                }
                r22.addView(textView, kb1.h(-1, -1.0f, i15 | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new ai.s(this, 29));
                break;
            case 3:
                r22 = new i4(context, 2);
                f7.i(y6.f23300a7, r22, null);
                View view = new View(context);
                f7.a0(R.drawable.greydivider, y6.f23319b7, context, view, null);
                r22.addView(view, kb1.g(-1.0f, -1));
                break;
            case 4:
                r22 = new org.telegram.ui.Cells.z(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.f24815n = new j9((u6) null);
                r22.f24818w = AndroidUtilities.dp(40.0f);
                r22.F = AndroidUtilities.dp(10.0f);
                r22.H = UserConfig.selectedAccount;
                y6.S(context);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
                break;
            case 5:
                r22 = new v2(context);
                break;
            case 6:
                r22 = new ab(context, 8, 0, false);
                break;
            case 7:
                r22 = new q4(context);
                ey eyVar = this.R;
                if (eyVar == null || !eyVar.N0) {
                    r22.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new org.telegram.ui.Cells.f7(context, (d3) null);
                Drawable X0 = y6.X0(context, R.drawable.greydivider, y6.f23319b7);
                ar arVar = new ar(new ColorDrawable(y6.x0(null, y6.f23300a7, false)), X0);
                arVar.f26646w = true;
                r22.setBackgroundDrawable(arVar);
                E(r22, X0);
                break;
            case 9:
            case 12:
            default:
                r22 = new v8(context);
                if (this.h == 15) {
                    f7.i(y6.f23357d6, r22, null);
                    break;
                }
                break;
            case 10:
                r22 = new m(this, context);
                break;
            case 11:
                r22 = new j(this, context);
                Drawable X02 = y6.X0(context, R.drawable.greydivider, y6.f23319b7);
                ar arVar2 = new ar(new ColorDrawable(y6.x0(null, y6.f23300a7, false)), X02);
                arVar2.f26646w = true;
                r22.setBackgroundDrawable(arVar2);
                E(r22, X02);
                break;
            case 14:
                q4 q4Var2 = new q4(this.f14169c, y6.f7, 16, 0, false, null);
                q4Var2.setHeight(32);
                q4Var2.setClickable(false);
                q4Var = q4Var2;
                r22 = q4Var;
                break;
            case 15:
                r22 = new LinearLayout(context);
                r22.f25589b = new ArrayList();
                r22.setOrientation(1);
                f7.i(y6.f23300a7, r22, null);
                break;
            case 16:
                r22 = new i(this, context);
                break;
            case 17:
                r22 = new x2(context);
                break;
            case 18:
                r22 = new vn(context, 5);
                break;
            case 19:
                r22 = new m(this, context);
                r22.addView(new org.telegram.ui.Components.y6(this.f14169c, this.F, null, new f(this, 1), null), kb1.h(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new z3(context, null);
                break;
            case 22:
                r22 = new q4(context);
                break;
            case 23:
                ?? p2Var2 = new p2(this.R, this.f14169c, false, this.F, null);
                q4Var = p2Var2;
                if (j10 != 0) {
                    p2Var2.O0 = true;
                    p2Var2.P0 = true;
                    q4Var = p2Var2;
                }
                r22 = q4Var;
                break;
        }
        if (i10 != 5 && i10 != 19) {
            i13 = -2;
        } else {
            i13 = -1;
        }
        r22.setLayoutParams(new s4.q0(-1, i13));
        return new s4.e1(r22);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        View view = e1Var.f47773a;
        if (view instanceof p2) {
            p2 p2Var = (p2) view;
            p2Var.S(this.H, false);
            p2Var.U(this.f14175x.contains(Long.valueOf(p2Var.getDialogId())), false);
        }
    }

    public void K() {
    }

    public void L() {
    }

    public void M(TLRPC.User user) {
    }

    @Override
    public void a(p2 p2Var) {
    }

    @Override
    public void d(p2 p2Var) {
    }
}
