package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class bb5 extends d implements gk7 {
    public ab5 a;
    public o39 b;
    public g24 c;
    public long d;
    public boolean e;
    public TLRPC.TL_chatInviteExported f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;

    public final void Y(boolean z) {
        this.e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().h1(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new i81((byte) 5, this, z)), this.classGuid);
        ab5 ab5Var = this.a;
        if (ab5Var != null) {
            ab5Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131748957, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 25));
        this.a = new ab5(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        g24 g24Var = new g24(context, null);
        this.c = g24Var;
        g24Var.b();
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setLayoutManager(new t26(1, false));
        this.b.setEmptyView(this.c);
        this.b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.b, nme.e(-1, -1, 51));
        frameLayout.addView(this.c, nme.e(-1, -1, 51));
        this.b.setAdapter(this.a);
        this.b.setOnItemClickListener(new bf4(this, (byte) 3));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        long j = this.d;
        if (i == kk7.S) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).id == j && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) getMessagesController().r.f(j);
                this.f = tL_chatInviteExported;
                if (tL_chatInviteExported == null) {
                    Y(false);
                    return;
                }
                this.e = false;
                ab5 ab5Var = this.a;
                if (ab5Var != null) {
                    ab5Var.f();
                }
            }
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.g6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        kk7.f(this.currentAccount).b(this, kk7.S);
        getMessagesController().X2(this.classGuid, this.d, true);
        this.e = true;
        this.h = true;
        this.n = 2;
        this.r = 3;
        this.s = 4;
        this.x = 6;
        this.w = 5;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, kk7.S);
    }

    @Override
    public final void onResume() {
        super.onResume();
        ab5 ab5Var = this.a;
        if (ab5Var != null) {
            ab5Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            g24 g24Var = this.c;
            if (g24Var != null) {
                g24Var.setProgressBarColor(bkb.w0(null, bkb.g6, false));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
