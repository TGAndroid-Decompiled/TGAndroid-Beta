package hg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.h4;
import ci.h7;
import ci.q7;
import com.google.android.gms.internal.play_billing.k3;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Cells.f7;
import org.telegram.ui.Cells.i6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.m2;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.w2;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Cells.y2;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.u6;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.z00;
import org.telegram.ui.ey;
import org.telegram.ui.zx;
import w7.z5;
public class m extends km0 implements m2 {
    public static final boolean f11994c0 = BuildVars.DEBUG_PRIVATE_VERSION;
    public boolean E;
    public final int F;
    public boolean G;
    public boolean H;
    public long I;
    public boolean J;
    public lm0 K;
    public hj0 L;
    public Drawable O;
    public final j P;
    public boolean Q;
    public final ey R;
    public boolean S;
    public final TLRPC.RequestPeerType T;
    public boolean U;
    public final long V;
    public boolean Z;
    public boolean f11995a0;
    public final Context f11997c;
    public ArrayList d;
    public boolean e;
    public int f11998f;
    public int h;
    public boolean f11999n;
    public final int f12000r;
    public long f12001s;
    public int v;
    public final boolean f12002w;
    public final ArrayList f12003x;
    public boolean f12004y;
    public ArrayList M = new ArrayList();
    public ArrayList N = new ArrayList();
    public int W = 10;
    public final LongSparseIntArray X = new LongSparseIntArray();
    public final HashMap Y = new HashMap();
    public int f11996b0 = -1;

    public m(ey eyVar, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType) {
        boolean z11;
        this.f11997c = context;
        this.R = eyVar;
        this.h = i10;
        this.f12000r = i11;
        this.f12002w = z10;
        if (i11 == 0 && i10 == 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f12004y = z11;
        this.f12003x = arrayList;
        this.F = i12;
        this.V = eyVar.Y2;
        if (i11 == 0) {
            ?? obj = new Object();
            obj.f11941a = new HashSet();
            obj.f11942b = new HashSet();
            obj.f11943c = new HashSet();
            obj.d = new ArrayList();
            obj.e = new ah.j(obj, 16);
            this.P = obj;
        }
        this.T = requestPeerType;
    }

    public static void E(View view, Drawable drawable) {
        if (drawable != null) {
            try {
                r6.z(view, drawable, k6.f21146b7, null, PorterDuff.Mode.MULTIPLY);
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        int i10 = k6.f21126a7;
        fh.b bVar = new fh.b(20);
        fh.b bVar2 = new fh.b(19);
        int R = r6.R(i10, -1, 0, 0.0f, null);
        bVar2.d(R, view);
        l6 y3 = r6.y(101, view);
        y3.c(i10, -1, 0, 0.0f, null);
        y3.f21620n = bVar;
        y3.f21621o = bVar2;
        y3.f21619m = false;
        y3.f21614g = R;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
        if (i10 != 1 && i10 != 5 && i10 != 3 && i10 != 8 && i10 != 7 && i10 != 10 && i10 != 11 && i10 != 13 && i10 != 15 && i10 != 16 && i10 != 18 && i10 != 19 && i10 != 20) {
            return true;
        }
        return false;
    }

    public final int F() {
        int i10 = this.h;
        int i11 = this.f12000r;
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
            if (((k) this.M.get(i10)).f11980c != null && ((k) this.M.get(i10)).f11980c.f20348id == j10) {
                return i10;
            }
        }
        return -1;
    }

    public final int H(int i10) {
        if (this.E) {
            i10--;
        }
        if (this.f12004y) {
            i10 = k3.g(2, i10, MessagesController.getInstance(this.F).hintDialogs);
        }
        if (this.f11999n && this.h == 3) {
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
            k kVar = (k) this.M.get(i10);
            String str = kVar.f11986l;
            TLRPC.TL_contact tL_contact = kVar.e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = kVar.f11987m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = kVar.f11988n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = kVar.f11980c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return MessagesController.getInstance(this.F).getUser(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = kVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void N(boolean z10) {
        this.f11999n = z10;
    }

    public final void O(hj0 hj0Var) {
        this.L = hj0Var;
    }

    public final void P(lm0 lm0Var, boolean z10) {
        this.J = z10;
        for (int i10 = 0; i10 < lm0Var.getChildCount(); i10++) {
            if (lm0Var.getChildAt(i10) instanceof q2) {
                ((q2) lm0Var.getChildAt(i10)).f22943f = z10;
            }
        }
        for (int i11 = 0; i11 < lm0Var.getCachedChildCount(); i11++) {
            if (lm0Var.P(i11) instanceof q2) {
                ((q2) lm0Var.P(i11)).f22943f = z10;
            }
        }
        for (int i12 = 0; i12 < lm0Var.getHiddenChildCount(); i12++) {
            if (lm0Var.V(i12) instanceof q2) {
                ((q2) lm0Var.V(i12)).f22943f = z10;
            }
        }
        for (int i13 = 0; i13 < lm0Var.getAttachedScrapChildCount(); i13++) {
            if (lm0Var.O(i13) instanceof q2) {
                ((q2) lm0Var.O(i13)).f22943f = z10;
            }
        }
    }

    public final void Q(boolean z10) {
        this.Q = z10;
    }

    public final void R(long j10) {
        this.f12001s = j10;
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
        if (this.f12000r == 0 && this.h == 0 && !this.f12002w && !MessagesController.getInstance(this.F).hintDialogs.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12004y = z10;
    }

    public final void W() {
        throw new UnsupportedOperationException("Method not decompiled: hg.m.W():void");
    }

    public final void X(Runnable runnable) {
        if (this.Z) {
            this.f11995a0 = true;
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
        g gVar = new g(this, arrayList2, 0);
        if (arrayList3.size() >= 50 && f11994c0) {
            Utilities.searchQueue.postRunnable(new ai.y0(this, gVar, runnable, arrayList2, 20));
            return;
        }
        m4.c c10 = s4.o.c(gVar, true);
        this.Z = false;
        if (runnable != null) {
            runnable.run();
        }
        this.M = arrayList2;
        c10.c(this);
    }

    @Override
    public final boolean b() {
        return this.f12003x.isEmpty();
    }

    @Override
    public final void c() {
        boolean z10;
        h7 storiesController = MessagesController.getInstance(this.F).getStoriesController();
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
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer);
            if (!z10 || storiesController.D(0, peerDialogId) != 0) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        this.R.getOrCreateStoryViewer().G(this.f11997c, null, arrayList2, 0, null, null, new q7(this.K, true), false);
    }

    @Override
    public final void e(q2 q2Var) {
        int i10 = this.F;
        MessagesController.getInstance(i10);
        if (MessagesController.getInstance(i10).getStoriesController().I(q2Var.getDialogId())) {
            ey eyVar = this.R;
            eyVar.getOrCreateStoryViewer().getClass();
            eyVar.getOrCreateStoryViewer().D(eyVar.getParentActivity(), q2Var.getDialogId(), q7.a((lm0) q2Var.getParent()));
        }
    }

    @Override
    public final void f(q2 q2Var) {
        this.R.F4(q2Var);
    }

    @Override
    public final int h() {
        int size = this.M.size();
        this.v = size;
        return size;
    }

    @Override
    public final long i(int i10) {
        return ((k) this.M.get(i10)).f11985k;
    }

    @Override
    public final int j(int i10) {
        return ((k) this.M.get(i10)).f44712a;
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
    public final void v(s4.b1 r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: hg.m.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ?? r22;
        int i11;
        int i12;
        l4 l4Var;
        int i13;
        long j10 = this.V;
        Context context = this.f11997c;
        switch (i10) {
            case 0:
            case 21:
                int i14 = this.h;
                if (i14 != 2 && i14 != 15) {
                    q2 q2Var = new q2(this.R, this.f11997c, false, this.F, null);
                    if (T()) {
                        ai.r0 r0Var = new ai.r0(this, 25);
                        q2Var.J1 = true;
                        q2Var.K1 = r0Var;
                    }
                    q2Var.setArchivedPullAnimation(this.L);
                    q2Var.setPreloader(this.P);
                    q2Var.setDialogCellDelegate(this);
                    q2Var.setIsTransitionSupport(this.S);
                    if (i10 == 21) {
                        f7 f7Var = new f7(q2Var.getContext(), q2Var, false, R.drawable.forward_to_stories, q2Var.J4);
                        q2Var = q2Var;
                        q2Var.G = f7Var;
                        q2Var.F = true;
                    }
                    if (j10 != 0) {
                        q2Var.O0 = true;
                    }
                    r22 = q2Var;
                } else {
                    r22 = new i6(context, null);
                }
                if (this.h == 15) {
                    r6.i(k6.f21184d6, r22, null);
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new z00(context, null);
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
                r22 = new l4(context);
                r22.setText(LocaleController.getString(R.string.RecentlyViewed));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 15.0f);
                textView.setTypeface(AndroidUtilities.bold());
                r6.W(textView, k6.L6, null);
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
                r22.addView(textView, z5.d(-1, -1.0f, i15 | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new ah.g0(this, 28));
                break;
            case 3:
                r22 = new h4(context, 2);
                r6.i(k6.f21126a7, r22, null);
                View view = new View(context);
                r6.b0(R.drawable.greydivider, k6.f21146b7, context, view, null);
                r22.addView(view, z5.c(-1.0f, -1));
                break;
            case 4:
                r22 = new org.telegram.ui.Cells.z(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.f23084n = new f9((g6) null);
                r22.f23087w = AndroidUtilities.dp(40.0f);
                r22.F = AndroidUtilities.dp(10.0f);
                r22.H = UserConfig.selectedAccount;
                k6.S(context);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
                break;
            case 5:
                r22 = new w2(context);
                break;
            case 6:
                r22 = new wa(context, 8, 0, false);
                break;
            case 7:
                r22 = new l4(context);
                ey eyVar = this.R;
                if (eyVar == null || !eyVar.N0) {
                    r22.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new b7(context, (org.telegram.ui.Cells.b1) null);
                Drawable X0 = k6.X0(context, R.drawable.greydivider, k6.f21146b7);
                wq wqVar = new wq(new ColorDrawable(k6.x0(null, k6.f21126a7, false)), X0);
                wqVar.f32329w = true;
                r22.setBackgroundDrawable(wqVar);
                E(r22, X0);
                break;
            case 9:
            case 12:
            default:
                r22 = new r8(context);
                if (this.h == 15) {
                    r6.i(k6.f21184d6, r22, null);
                    break;
                }
                break;
            case 10:
                r22 = new l(this, context);
                break;
            case 11:
                r22 = new i(this, context);
                Drawable X02 = k6.X0(context, R.drawable.greydivider, k6.f21146b7);
                wq wqVar2 = new wq(new ColorDrawable(k6.x0(null, k6.f21126a7, false)), X02);
                wqVar2.f32329w = true;
                r22.setBackgroundDrawable(wqVar2);
                E(r22, X02);
                break;
            case 14:
                l4 l4Var2 = new l4(this.f11997c, k6.f7, 16, 0, false, null);
                l4Var2.setHeight(32);
                l4Var2.setClickable(false);
                l4Var = l4Var2;
                r22 = l4Var;
                break;
            case 15:
                r22 = new LinearLayout(context);
                r22.f23103b = new ArrayList();
                r22.setOrientation(1);
                r6.i(k6.f21126a7, r22, null);
                break;
            case 16:
                r22 = new h(this, context);
                break;
            case 17:
                r22 = new y2(context);
                break;
            case 18:
                r22 = new sn(context, 5);
                break;
            case 19:
                r22 = new l(this, context);
                r22.addView(new u6(this.f11997c, this.F, null, new f(this, 1), null), z5.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new u3(context, null);
                break;
            case 22:
                r22 = new l4(context);
                break;
            case 23:
                ?? q2Var2 = new q2(this.R, this.f11997c, false, this.F, null);
                l4Var = q2Var2;
                if (j10 != 0) {
                    q2Var2.O0 = true;
                    q2Var2.P0 = true;
                    l4Var = q2Var2;
                }
                r22 = l4Var;
                break;
        }
        if (i10 != 5 && i10 != 19) {
            i13 = -2;
        } else {
            i13 = -1;
        }
        r22.setLayoutParams(new s4.o0(-1, i13));
        return new s4.b1(r22);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        View view = b1Var.f46342a;
        if (view instanceof q2) {
            q2 q2Var = (q2) view;
            q2Var.S(this.H, false);
            q2Var.U(this.f12003x.contains(Long.valueOf(q2Var.getDialogId())), false);
        }
    }

    public void K() {
    }

    public void L() {
    }

    public void M(TLRPC.User user) {
    }

    @Override
    public void a(q2 q2Var) {
    }

    @Override
    public void d(q2 q2Var) {
    }
}
